package factory;

/**
 * @author biscuits
 * @date 2019-05-27
 */
public class Work {
  public static void main(String[] args) {
    AbstractOperation add = OperationFactory.getOpreation("+");
    AbstractOperation sub = OperationFactory.getOpreation("-");
    add.setNum1(1);
    add.setNum2(2);
    sub.setNum1(3);
    sub.setNum2(2);
    System.out.println(add.getResult());
    System.out.println(sub.getResult());
  }
}
