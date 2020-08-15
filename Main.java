import java.util.Scanner;
class solution {
    class Node{
        Node next;
        int data;
        Node(int data){
            this.next=null;
            this.data=data;
        }
    }
    static Node head=null;
    public String reverse(String s){
        String reverse="";
        char arr[] = s.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            reverse=reverse+arr[i];
        }

        return reverse;
    }
    public String str_palindrom(String s){
        String x=reverse(s);
        if(x.equals(s)){
            return s+" is a palindrome";
        }else {
            return s+" is not a palindrome";
        }

    }
    public String num_palindrome(int num){
        int number=num;
        int reverse=0;
        while (num!=0){
            reverse=num%10+reverse*10;
            num=num/10;
        }
        if(number==reverse){
            return "YES";
        }else{
            return "NO";
        }

    }
    public int max_element(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public int min_element(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public  String prime(int x){
        boolean is_prime=true;
        for (int i=2;i<x;i++){
            if(x%i==0){
                is_prime=false;
                break;
            }
        }
        if(is_prime){
            return x+" is a prime Number";
        }else {
            return x+" is not a prime Number";

        }
    }
    public void fibonacci(int x){
        int first=0;
        int second=1;
        System.out.print(first+" "+second+" ");
        int sum=first+second;
        while (sum<=x){
            System.out.print(sum+" ");
            first=second;
            second=sum;
            sum=first+second;
        }
    }
    public int printnumber(int n){
        if(n==100) {
            return 100;
        }
        System.out.print(n+" ");
        return printnumber(n+1);
    }
    public  int uniquenumber(int arr[]){
        int count=1;
        for(int i=1;i<arr.length;i++){
            int j=0;
            for ( j=0;j<i;j++) {
                if (arr[i] == arr[j]) {
                   count--;
                   break;
                }
            }
            if(i==j){
                count++;
            }
        }
        return count;
    }

    public void insert(int x){
        if(head==null){
            head = new Node(x);
            head.next=null;
        }else {
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
        }

    }
    public void printlinkedlist(){
        Node first=head;
        while (first!=null){
            System.out.print(first.data+" ");
            first=first.next;
        }
    }
    public void reverselinkedlist(){
        Node current=head;
        Node pr_ptr=null;
        Node ptr=null;
        while (current!=null){
            ptr=current.next;
            current.next=pr_ptr;
            pr_ptr=current;
            current=ptr;
        }
        head=pr_ptr;
        Node start=pr_ptr;
        while (start!=null){
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
}

public class Main {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        solution s= new solution();
        while(true){
            System.out.println("\nEnter your choice\n0:Insert element in Linked list\n1:Reverse a string\n2:check string palindrome\n3:check number palindrome\n4:Find max number from given list\n5:Find Min number from given list\n6:Reverse a Linked list\n7:prime or not\n8:Fibonacci series upto n\n9:unique number from list\n10:String to number\n11:print 1 to 100 without loop\n12:FizzBuzz\n13:Exit");
            int choice=sc.nextInt();
            switch (choice){
                case 0:
                    System.out.println("Eneter a element");
                    int data=sc.nextInt();
                    s.insert(data);
                    System.out.println("New Linkedlist is");
                    s.printlinkedlist();
                    break;
                case 1:
                    System.out.println("Enter a String");
                    System.out.println(s.reverse(sc.next()));
                    break;
                case  2:
                    System.out.println("Enter a String");
                    System.out.println(s.str_palindrom(sc.next()));
                    break;
                case 3:
                    System.out.println("Enter  a  Number");
                    System.out.println(s.num_palindrome(sc.nextInt()));
                    break;
                case 4:
                    System.out.println("Enter a array size");
                    int size=sc.nextInt();
                    int arr[] = new int[size];
                    System.out.println("Enter a array element");
                    for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                    }
                    System.out.println("Max element is:"+s.max_element(arr));
                    break;
                case 5:
                    System.out.println("Enter a array size");
                     int length=sc.nextInt();
                     int arr1[] = new int[length];
                    System.out.println("Enter a array element");
                    for(int i=0;i<length;i++){
                        arr1[i]=sc.nextInt();
                    }
                    System.out.println("Min element is:"+s.min_element(arr1));
                    break;
                case 6:
                    System.out.println("Reverse linked list is");
                    s.reverselinkedlist();
                    break;
                case 7:
                    System.out.println("Enter a Number");
                    System.out.println(s.prime(sc.nextInt()));
                    break;
                case 8:
                    System.out.println("Enter a n up to which you wont fibonacci");
                    int n=sc.nextInt();
                    s.fibonacci(n);
                    break;
                case 9:
                    System.out.println("Enter a list size");
                     n=sc.nextInt();
                    int a[]= new int[n];
                    System.out.println("Enter a Array element");
                    for(int i=0;i<n;i++){
                        a[i]=sc.nextInt();
                    }
                    System.out.println("There are "+s.uniquenumber(a)+" unique elements are there.");
                    break;
                case 10:
                    System.out.println("Enter a String of Number");
                    String str= sc.next();
                    System.out.println(Integer.parseInt(str));
                    break;
                case 11:
                    System.out.print(s.printnumber(1));
                    break;
                case 12:
                    for(int i=1;i<=100;i++){
                        if(i%15==0){
                            System.out.println("FizzBuzz");
                        }
                        else if(i%5==0){
                            System.out.println("Buzz");
                        }else if(i%3==0){
                            System.out.println("Fizz");
                        }
                        else {
                            System.out.println(i);
                        }
                    }
                    break;
                case 13:
                    System.exit(0);
            }
        }
    }
}
