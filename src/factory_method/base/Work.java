package factory_method.base;

/**
 * @author biscuits
 * @date 2019-05-28
 */

public class Work {
  public static void main(String[] args) {
      AbstractBeanFactory factory1 = new SomeBeanFactory();
      AbstractBeanFactory factory2 = new OtherBeanFactory();
      factory1.getInstance().doSomeThing();
      factory2.getInstance().doSomeThing();
  }
}
