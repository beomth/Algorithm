class Solution {
    public String solution(String rny_string) {
        // while(rny_string.indexOf('m') != -1){
        //     rny_string = rny_string.substring(0, rny_string.indexOf('m')) + "rm" + rny_string.substring(rny_string.indexOf('m') + 1);
        // }
        if(rny_string.contains("m") == false)   return rny_string;
        else {
            return rny_string.replaceAll("m", "rn");
        }
    }
}