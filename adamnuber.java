   Scanner scan=new Scanner(System.in);
        System.out.println("enter the values:");
        int n=scan.nextInt();
        int a,b=0,first=0,second,n1=n;
        //first sub
        a=n*n;
        for(;a!=0;a/=10)
            first=(first*10)+a%10;
        //second sub
        for(;n1!=0;n1/=10)
            b=(b*10)+n1%10;
        second=b*b;
if (first==second)
            System.out.println("this is Adam number");
        else
            System.out.println("this is Adam number");

    }
}
