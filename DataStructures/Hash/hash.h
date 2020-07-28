#include <iostream>
#include <cctype>
#include <cstring>
using namespace std;

struct node{
	int data;
	node *next;
};


class table{

	public:
		table(int size = 5);
		~table();
		int hash(char *key) const;
		int insert(int data);
		int display(char *key);
		int removeByMeal(char *mealName);
	
	private:
		node ** hashTable;
		int hashTableSize;




};
