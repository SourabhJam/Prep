#include <iostream>
#include <cctype>
#include <cstring>
using namespace std;

struct node {
    int val
	int cost;
    node* next;
};

struct graphEdge {
    int start_ver
	int end_ver
	int weight;
};

class Graph{
  
	public:
   		 adjNode **head;               
   
    	DiaGraph(graphEdge edges[], int n, int N)  {
        
        head = new adjNode*[N]();
        this->N = N;
        
        for (int i = 0; i < N; ++i)
            head[i] = nullptr;
        
        for (unsigned i = 0; i < n; i++)  {
            int start_ver = edges[i].start_ver;
            int end_ver = edges[i].end_ver;
            int weight = edges[i].weight;
            
            adjNode* newNode = getAdjListNode(end_ver, weight, head[start_ver]);
             
                        
            head[start_ver] = newNode;
             }
    }
      
     ~DiaGraph() {
    for (int i = 0; i < N; i++)
        delete[] head[i];
        delete[] head;
     }
};
