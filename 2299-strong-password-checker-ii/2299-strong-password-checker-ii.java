class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int upper=0;
        int lower=0;
        int number=0;
        int spchar=0;
        String sp="!@#$%^&*()_-.+=,";

        if (password.length()<8) return false;
        // if (i>0 && ch==password.charAt(i-1)) return false;
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if (i>0 && ch==password.charAt(i-1)) return false;
            if(Character.isUpperCase(ch)){
                upper++;
                
            }else if(Character.isLowerCase(ch)){
                lower++;
            }else if(Character.isDigit(ch)){
                number++;
            }else if(sp.indexOf(ch)!=-1){
                spchar++;
            }

            
        }
        return upper>0 && lower>0 && number>0 && spchar>0;        
    }
}