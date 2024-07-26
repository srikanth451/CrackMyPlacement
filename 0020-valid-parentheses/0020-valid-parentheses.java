class Solution {
    public boolean isValid(String s) {
        Stack<Character>stk = new Stack<>();

        int n = s.length();

        for(int i=0; i<n; i++)
        {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{')
            {
                stk.push(c);
            }
            else{
                if(c == ')' )
                {
                  if(!stk.isEmpty() && stk.peek() == '(')
                  {
                    stk.pop();
                  }
                  else{
                    return false;
                  }
                }
                else if(c == ']')
                {
                    if(!stk.isEmpty() && stk.peek() == '[')
                    {
                        stk.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    if(!stk.isEmpty() &&  stk.peek() == '{')
                    {
                        stk.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(!stk.isEmpty()) return false;
        return true;
    }
}