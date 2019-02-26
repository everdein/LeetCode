class Test 
{
    public static void main(String[] args)
    {
        StringBuffer stuff = new StringBuffer();
        stuff.append("world");
        System.out.println("Hello " + stuff + "!");
        stuff.append(stuff.charAt(stuff.length() - 1));
        stuff.append(stuff.length() - 1);
        System.out.println(stuff);
    }
}