#include <iostream>
#include <cctype>
#include <cstring>
using namespace std;

struct node{
	int data;
	node *left;
	node *right;
};



class BST{

	public:
		BST();
		int insert(int toAdd);	
		int remove(int toAdd);
		int display();



	private:
		node *root;
		int insert(node *& root, int toAdd);
		node* remove(node *&root, int toAdd);
		node* IOS(node *root);
		int display(node *current);


};
