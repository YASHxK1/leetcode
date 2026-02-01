class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for (int i=0;i<columnTitle.length();i++){
            System.out.print((int)columnTitle.charAt(i)-64+"");
            res = res * 26 + (columnTitle.charAt(i)) - 64;
        }
        return res;
    }   
}

//res = 0
//res = res * 26 + (ord(c) - 64)
            
