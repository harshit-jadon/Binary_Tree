import com.bridgelabz.binarytree.MyBinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTest {
    @Test
    public void given3Numbers_WhenAddedToBinaryTree_ShouldReturnSizeThree() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.addNodes(56);
        myBinaryTree.addNodes(30);
        myBinaryTree.addNodes(70);
        int size = myBinaryTree.getSize();
            Assert.assertEquals(3, size);
        }
}