package Class;

public class Main {


    public static void main(String[] args) {
        Tree mayFavoriteOakTree = new Tree(120, 12,
                TreeType.OAK);
        Tree mayFavoriteMapleTree = new Tree(90,30,
                TreeType.MAPLE);

//        System.out.println(mayFavoriteOakTree.treeType);

//       mayFavoriteOakTree.announceTallTree();

        if (mayFavoriteOakTree.heightFt > 100){
            System.out.println("That's a tall " + mayFavoriteOakTree.treeType + " tree!");
        }

        if (mayFavoriteMapleTree.heightFt > 100) {
            System.out.println("That's a tall " + mayFavoriteMapleTree.treeType + " tree!");
        }
    }

}
