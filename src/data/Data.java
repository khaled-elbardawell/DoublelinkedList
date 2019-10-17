
package data;


class node{
    String info;
    node next;
    node pre;
    public node(){
        this(null,null,null);
    }
    public node(String info,node next,node pre){
        this.info=info;
        this.next=next;
        this.pre=pre;
    }
}

 class DoublelinkedList{
     
      node firstNode;
      int length;
      public int size(){
          return length;
      }
      public void print(){
          node n= firstNode;
         if(firstNode == null){
             System.out.println("empty ... ");
         }else{
             while(n != null){
                 System.out.println(n.info);
                n = n.next;
             }
         }
      }
      
      
      public void insertNewNode(String info){
          node newNode=new node(info,null,null);
          if(firstNode == null){
              System.out.println("The first Node is empty !! ");
          }else if( firstNode.next == null){
             newNode.pre=firstNode;
             firstNode.next = newNode;
             ++length;
          } else{
            node n= firstNode.next;
            newNode.next=n;
            n.pre=newNode;
            newNode.pre=firstNode;
            firstNode.next = newNode;
            ++length;
          }
      }
      
           public void insertLast(String info){
              node newNode=new node(info,null,null);
              node n= firstNode;

                if(firstNode == null){
                     firstNode = newNode;
                     ++length;
                         }else{
                    
                             while(n.next != null){
                                 n = n.next;
                               }
                             n.next=newNode;
                             newNode.pre=n;
                             length++;
                            }
                     }
           
                public String search(String info){
                    node n = firstNode;
                    String result;
                     if(firstNode == null){
                         System.out.println("The first Node is empty !! ");
                         return null;
                     }else{
                         while(n != null){
                             if(n.info != info){
                               n=n.next;    
                             }else{
                                 return n.info;
                             }
                                   
                         }
                     }
              return "Not Found !!";
        
                }
                
                
                
                  public void deleteLast(){
                           node n =firstNode;
                           node pre =firstNode;
                           if(firstNode == null){
                               return ;
                           }else{
                               while(n.next != null){
                                   n= n.next;
                               }
                               n.pre.next=null;
                               --length;     
                           }
                  }
                  
                  
                            public void deleteFirst(){
                              if(firstNode == null){
                                  return;
                              }else{
                                   firstNode =firstNode.next;
                                   --length;
                              }
                            }
                
                
      
      
      
     
 }




public class Data {

    public static void main(String[] args) {
      
      DoublelinkedList l = new DoublelinkedList();
        //   ********** insert ***********
        l.insertLast("khaled");
        l.insertLast("mohammed");
        l.insertLast("sami");
        l.insertNewNode("majdi");
       //   ********** print items ***********
        System.out.println("********** Items ***********");
        l.print();
        System.out.println("*********************");
        
       //   ********** print size ***********

        System.out.println("search result >> " + l.search("majdi") );
        System.out.println("*********************");
        System.out.println("Length =>> " + l.size() );
       
        
      //   ********** delete last ***********
        
        l.deleteLast();
        System.out.println("********** Items after delete last ***********");
        l.print();
        System.out.println("*********************");
        System.out.println("Length =>> " + l.size() );
        
       
        
         //   ********** delete first ***********
        
        l.deleteFirst();
        System.out.println("********** Items after delete fisrt ***********");
        l.print();
        System.out.println("*********************");
        System.out.println("Length =>> " + l.size() );
  
    }
    
}
