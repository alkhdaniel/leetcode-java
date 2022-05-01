/*
Every valid email consists of a local name and a domain name, separated by the '@' sign. Besides lowercase letters, the email may contain one or more '.' or '+'.
For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
If you add periods '.' between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.
For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
If you add a plus '+' in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered. Note that this rule does not apply to domain names.
For example, "m.y+name@email.com" will be forwarded to "my@email.com".
It is possible to use both of these rules at the same time.
Given an array of strings emails where we send one email to each emails[i], return the number of different addresses that actually receive mails.

Example 1:
Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.

Example 2:
Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
Output: 3
 
Constraints:
1 <= emails.length <= 100
1 <= emails[i].length <= 100
emails[i] consist of lowercase English letters, '+', '.' and '@'.
Each emails[i] contains exactly one '@' character.
All local and domain names are non-empty.
Local names do not start with a '+' character.
Domain names end with the ".com" suffix.
*/
class Solution {
    public int numUniqueEmails(String[] emails) {
        List<String> uniqueEmails=new ArrayList<String>();      //this will contain all our unique emails
        for (String email:emails) {                             //iterate through the emails
            String[] split = email.split("@",2);                //split the string by @, the part before @ is our local name, the part after is our domain
            String local = split[0].split("\\+",2)[0];          //remove everything after + in our local name
            local = local.replace(".","");                      //delete dots from our local name
            String domain = split[1];                           //our domain, doesnt need any processing
            email = local+"@"+split[1];                         //our processed email
            if (uniqueEmails.contains(email)) continue;         //check if its already in our unique list
            uniqueEmails.add(local+"@"+split[1]);               //if it isnt, we put it in
        }
        return uniqueEmails.size();                             
        
    }
}
