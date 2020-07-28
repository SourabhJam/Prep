#include <iostream>
#include <cctype>
#include <cstring>
using namespace std;


struct node{
	int data;
	node *next;
};


class LLL{

	public:
		LLL();
		int insert(int toAdd);
		int display();
		int remove(int toAdd);


	private:
		node *head;






};
