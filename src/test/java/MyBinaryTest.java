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
    @Test
    public void given13Numbers_WhenAddedToBinaryTree_ShouldReturnSizeThirteen() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.addNodes(56);
        myBinaryTree.addNodes(30);
        myBinaryTree.addNodes(70);
        myBinaryTree.addNodes(40);
        myBinaryTree.addNodes(22);
        myBinaryTree.addNodes(11);
        myBinaryTree.addNodes(3);
        myBinaryTree.addNodes(16);
        myBinaryTree.addNodes(60);
        myBinaryTree.addNodes(65);
        myBinaryTree.addNodes(95);
        myBinaryTree.addNodes(63);
        myBinaryTree.addNodes(67);
        int size = myBinaryTree.getSize();
        Assert.assertEquals(13, size);
    }
    @Test
    public void givenNumber_WhenPresentToBinaryTree_ShouldReturnTrue() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.addNodes(56);
        myBinaryTree.addNodes(30);
        myBinaryTree.addNodes(70);
        myBinaryTree.addNodes(40);
        myBinaryTree.addNodes(22);
        myBinaryTree.addNodes(11);
        myBinaryTree.addNodes(3);
        myBinaryTree.addNodes(16);
        myBinaryTree.addNodes(60);
        myBinaryTree.addNodes(65);
        myBinaryTree.addNodes(95);
        myBinaryTree.addNodes(63);
        myBinaryTree.addNodes(67);
        boolean result = myBinaryTree.searchKey(63);
        Assert.assertTrue(result);
    }

}