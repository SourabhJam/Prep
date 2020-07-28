#include "DLL.h"


DLL::DLL(){
        head = NULL;
}

int DLL::insert(int toAdd){

        if(head == NULL){
                head = new node();
                head->data = toAdd;
                head->next = NULL;
		head->previous = NULL;
                return 0;
        }   

        node *current = head;
        while(current->next){
                current = current->next;
        }   


        node *temp = new node();
        temp->data = toAdd;
        temp->next = NULL;
	temp->previous = current;
        current->next = temp;
        return 0;


}

int DLL::remove(int toRemove){

        if(head == NULL){
                return 0;
        }   

        if(head->data == toRemove){
                node *temp = head;
                head = head->next;
		head->next->previous = NULL;
                delete temp;
                return 0;
        }   

   
        node *current = head;

        while(current){

                if(current->data == toRemove){

    			current->previous->next = current->next;

			if(current->next == NULL){
				return 0;
			}

			current->next->previous = current->previous;
			delete current;	


                        cout<<"FOUND!   NODE IS: "<<current->data<<endl;
                        return 0;

                }   
    
            
                current = current->next;
        }   

        return 0;
    
}



int DLL::display(){


        node *current = head;

        while(current){
                cout<<"Node Is: "<<current->data<<endl;
                current = current->next;
        }   

	


}
