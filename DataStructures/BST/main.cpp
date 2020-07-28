#include "BST.h"

BST tree;

void build(){
	tree.insert(30);
	tree.insert(25);
	tree.insert(5);
	tree.insert(3);
	tree.insert(1);
	tree.insert(4);
	tree.insert(10);
	tree.insert(12);
	tree.insert(50);
	tree.insert(75);
}

int main(){
	
	build();
	tree.display();

	tree.remove(1);
	cout<<"NEW TREE___________"<<endl;
	tree.display();
	
	return 0;


}

