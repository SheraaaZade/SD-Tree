public class Main {
    public static void main(String[] args) {
        Tree l1 = new Tree(1);
        Tree l3 = new Tree(3);
        Tree l5 = new Tree(5);
        Tree l7 = new Tree(7);

        Tree t2 = new Tree(2, new Tree[]{l1, l3});
        Tree t6 = new Tree(6, new Tree[]{l7});

        Tree t4 = new Tree(4, new Tree[]{t2, l5, t6});

        System.out.println(Trees.nbrLeaves(t4));


        Tree[] ls = Trees.flattenLeaves(t4);
        System.out.println("Les " + ls.length + " feuilles");
        int i = 0;
        while (i != ls.length) {
            System.out.println(ls[i].getValue());
            i++;
        }

        System.out.println("Path V1");
        Trees.pathV1(l7);

        System.out.println("Path V2");
        Trees.pathV2(l7);
        System.out.println("---NbrNode--");
        System.out.println(Trees.nbrNode(t4));

        System.out.println("\n---min---");
        System.out.println(Trees.min(t4));

        System.out.println("\n---sum---");
        System.out.println(Trees.sum(t4));

        System.out.println("\n---Equals---");
        System.out.println(Trees.equals(t4, t2));

        System.out.println("\n---Depth---");
        System.out.println(Trees.depth(t4));

        System.out.println("\n---SameOne---");
        System.out.println(Trees.sameOne(t2,t6));
    }
}
