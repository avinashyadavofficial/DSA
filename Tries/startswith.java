public class startswith {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
        public Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';//'ch'-'a'
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    public static boolean solution(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;

    }
    

    public static void main(String[] args) {
        String words[]={"apple","app","mango","man","woman"};
        String prefix1="app";
        String prefix2="moon";
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(solution(prefix1));
        System.out.println(solution(prefix2));
        

    }
}