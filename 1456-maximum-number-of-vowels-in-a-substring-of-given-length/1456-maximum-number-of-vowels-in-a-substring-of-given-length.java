class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        int max =0;
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
            {
                c++;
            }
        }
        max = c;
        for(int i=k;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                c++;
            }
            if(isVowel(s.charAt(i-k)))
            {
                c--;
            }
                max = Math.max(max,c);
        }
        return max;
    }
             private boolean isVowel(char c)
             {
                return c=='a'|| c=='e'||c=='i'||c=='o'||c=='u';
             }
    }