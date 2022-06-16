package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Tree myfavoriteMapleTree = new Tree(90, 30,
                TreeType.MAPLE);
        System.out.println(myfavoriteMapleTree.getTreeType());
        System.out.println(myfavoriteMapleTree.getHeightFt());
        System.out.println(myfavoriteMapleTree.getTrunkDiameterInches());

//         myfavoriteMapleTree.heightFt = 180;
        myfavoriteMapleTree.grow();
    }
}
