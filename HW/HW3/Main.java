public class Main {
    public static void main(String[] args)
    {
        RevertLinkedList rList = new RevertLinkedList();

        rList.addLast(8);
        rList.addLast(12);
        rList.addLast(3);
        rList.addLast(0);
        rList.addLast(25);
        rList.addLast(15);
        rList.addLast(17);
        rList.addLast(1);
        System.out.println("List:");
        rList.print();
        rList.revert();
        System.out.println("Revert list:");
        rList.print();
    }
}
