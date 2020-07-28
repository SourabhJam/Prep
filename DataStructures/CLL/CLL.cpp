#include "CLL.h"


CLL::CLL(){
        head = NULL;
}

int LLL::insert(int toAdd){

        if(head == NULL){
                head = new node();
                head->data = toAdd;
                head->next = head;
                return 0;
        }   

        node *current = head;
	node *checkPoint = head;

	while(current != checkPoint){
		current = current->next;
	}

        node *temp = new node();
        temp->data = toAdd;
        temp->next = NULL;
        current->next = temp;
        return 0;


}

int LLL::remove(int toRemove){
        if(head == NULL){
                return 0;
        }   

        if(head->data == toRemove){
                node *temp = head;
                head = head->next;
                delete temp;
                return 0;
        }   

        node *prev = NULL;
        node *current = head;

        while(current){

                if(current->data == toRemove){

    
                        prev->next = current->next;
    


                        cout<<"FOUND!   NODE IS: "<<current->data<<endl;
                        return 0;

                }   
    
                prev = current;
                current = current->next;
        }   

        return 0;
    
}



int LLL::display(){


        node *current = head;

        while(current){
                cout<<"Node Is: "<<current->data<<endl;
                current = current->next;
        }   


}
