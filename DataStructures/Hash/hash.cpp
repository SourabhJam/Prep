#include "hash.h"


table::table(int size){

	hashTable = new node *[size];
	
	for(int i= 0; i<size;++i){
        	hashTable[i] = NULL;
	}

	hashTableSize = size;

}

int 
