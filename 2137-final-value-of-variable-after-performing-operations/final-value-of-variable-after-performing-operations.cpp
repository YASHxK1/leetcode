class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int size = operations.size();
        int num=0;

        for(int i=0; i < size; i++){
            if (operations[i] == "X++"|| operations[i] == "++X"){
                num++;
            }else if(operations[i]=="--X"||operations[i] == "X--"){
                num--;
            }
        }
        return num;
        
    }
};