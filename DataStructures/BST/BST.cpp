#include "BST.h"

BST::BST(){

	root = NULL;

}

int BST::insert(int toAdd){

	if(root == NULL){
		root = new node();
		root->data = toAdd;
		root->left = NULL;
		root->right = NULL;
		return 0;
	}

	insert(root,toAdd);

}


int BST::insert(node *& root, int toAdd){

	if(root == NULL){
		root = new node();
		root->data = toAdd;
		root->left = NULL;
		root->right = NULL;
		return 0;
	}
	
	if(toAdd < root->data){
		insert(root->left,toAdd);
	}else{
		insert(root->right,toAdd);
	}

}

int BST::remove(int toAdd){
	if(root == NULL){
		return 0;
	}

	remove(root,toAdd);	



}


node* BST::remove(node *& root, int toAdd){

	if(root == NULL){
		return 0;
	}


	if(toAdd < root->data){
		root->left = remove(root->left,toAdd);
	}

	if(toAdd > root->data){
		root->right = remove(root->right,toAdd);
	}
	
	else{
	
		if(root->left == NULL && root->right == NULL){
			root = NULL;
			delete root;
			return NULL;
		}

		if(root->left == NULL && root->right !=NULL){
			node *temp = root->right;
			delete root;
			return temp;
		}


		if(root->right == NULL && root->left != NULL){
			node *temp = root->left;
			delete root;
			return temp;
		}


		if(root->right && root->left){
			if(root->right->left == NULL){
				node *temp = root->right;
				delete root;
				return temp;
			}


			//get ios
			node *ios = IOS(root->right);
			delete root;
			return ios;

		}
	}	
		

}

node* BST::IOS(node *root){
	if(root->left == NULL){
		return root;
	}

	IOS(root->left);	

}


int BST::display(){

	if(root == NULL){
		return 0;
	}

	display(root);

}

int BST::display(node *current){
	if(current == NULL){
		return 0;
	}

	display(current->left);
	cout<<"Node Is: "<<current->data<<endl;
	display(current->right);

}
