#include <iostream>  
#define SIZE_OF_QUEUE 7  
  
using namespace std;  
  
class Queue_Data_Struct {  
   private:  
  int array_of_Queue[SIZE_OF_QUEUE], front_index, rear_index;  
  
   public:  
  Queue_Data_Struct() {  
    front_index = -1;  
    rear_index = -1;  
  }  
  
  bool isFull() {  
    if (front_index == 0 && rear_index == SIZE_OF_QUEUE - 1) {  
      return true;  
    }  
    return false;  
  }  
  
  bool isEmpty() {  
    if (front_index == -1)  
      return true;  
    else  
      return false;  
  }  
  
  void enQueue_Data_Struct(int element) {  
    if (isFull()) {  
      cout << "Queue_Data_Struct is full";  
    } else {  
      if (front_index == -1) front_index = 0;  
      rear_index++;  
      array_of_Queue[rear_index] = element;  
      cout << endl  
         << "Inserted " << element << endl;  
    }  
  }  
  
  int deQueue_Data_Struct() {  
    int element;  
    if (isEmpty()) {  
      cout << "Queue_Data_Struct is empty" << endl;  
      return (-1);  
    } else {  
      element = array_of_Queue[front_index];  
      if (front_index >= rear_index) {  
        front_index = -1;  
        rear_index = -1;  
      } /* Q has only one element, so we reset the Queue_Data_Struct after deleting it. */  
      else {  
        front_index++;  
      }  
      cout << endl  
         << "Deleted -> " << element << endl;  
      return (element);  
    }  
  }  
  
  void display() {  
    /* Function to display elements of Queue_Data_Struct */  
    int i;  
    if (isEmpty()) {  
      cout << endl  
         << "Empty Queue_Data_Struct" << endl;  
    } else {  
      cout << endl  
         << "front_index index-> " << front_index;  
      cout << endl  
         << "array_of_Queue -> ";  
      for (i = front_index; i <= rear_index; i++)  
        cout << array_of_Queue[i] << "  ";  
      cout << endl  
         << "rear_index index-> " << rear_index << endl;  
    }  
  }  
};  
  
int main() {  
  Queue_Data_Struct q;  
  int data;  
    char ch;  
    cout<<"\nSIZE_OF_QUEUE of Queue_Data_Struct is 7.\n";  
        /*  Perform tree operations  */  
        do      
        {  
            cout<<"\nSelect one of the operations::"<<endl;  
            cout<<"1. To insert data in the Queue_Data_Struct Data Structure."<<endl;  
            cout<<"2. To display the data present in the Queue_Data_Struct Data Structure."<<endl;  
            cout<<"3. To perform the deQueue_Data_Struct operation on the Queue_Data_Struct Data Structure."<<endl;  
               
            int choice;  
            cin>>choice;              
            switch (choice)  
            {  
            case 1 :   
                cout<<"Enter the value to be inserted"<<endl;  
                cin>>data;  
                q.enQueue_Data_Struct(data);  
                break;                            
            case 2 :   
                cout<<"Contents of the Queue_Data_Struct are::"<<endl;  
                q.display();  
                break;   
            case 3 :   
                cout<<"deQueue_Data_Struct operation successful."<<endl;  
                q.deQueue_Data_Struct();  
                break;  
            default :   
                cout<<"Wrong Entry \n ";  
                break;     
            }  
   
            cout<<"\nDo you want to continue (Type y or n) \n";  
            cin>>ch;                          
        } while (ch == 'Y'|| ch == 'y');  
  
  return 0;  
}  
