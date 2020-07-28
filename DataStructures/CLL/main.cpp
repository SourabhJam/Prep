#include "CLL.h"



int main(){

        LLL list;

        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.display(); 

        list.remove(15);

        cout<<"NEW list"<<endl;
        list.display();
    



        return 0;
}
