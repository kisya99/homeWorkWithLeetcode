package homeWorkWithLeetcode;

class solution3 {
    public String reverseWords(String s) {
        String result = "";
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
            else {
                if (sb.isEmpty()){

                }
                else {
                    sb = sb.reverse();
                    result = result + sb + " ";
                    sb = new StringBuilder();
                }

            }

        }
        sb = sb.reverse();
        result = result + sb;
        result = result.trim();
        return result;
    }
}
