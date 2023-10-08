/**
 * @author manhdt14
 * created in 10/8/2023 3:34 PM
 */
public class SingletonPattern {
    public static void main(String[] args) {
//        không gọi được vì constructor của Class là private
//        SingleObject object = new SingleObject();

        // Get the only object available
        // áp dụng singleton design patter
        SingleObject object = SingleObject.getInstance("ONE");
        SingleObject object2 = SingleObject.getInstance("TWO");
        System.out.println("object         " + object.value); // One
        System.out.println("another object " + object2.value);// One
        object.showMessage();
    }
}
