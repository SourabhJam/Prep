using namespace std; 
  
class Hash 
{ 
    int BUCKET;    
  
    
    list<int> *table; 
public: 
    Hash(int V);  
  
    
    void insertItem(int x); 
  
    
    void deleteItem(int key); 
  
    
    int hashFunction(int x) { 
        return (x % BUCKET); 
    } 
  
    void displayHash(); 
}; 
