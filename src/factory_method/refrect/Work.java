package factory_method.refrect;

/**
 * @author biscuits
 * @date 2019-05-28
 */
public class Work {
  public static void main(String[] args) throws ClassNotFoundException {
    //

    try {
      AbstractBeanFactory o1 =
          (AbstractBeanFactory)
              Class.forName("factory_method.refrect.OtherBeanFactory").newInstance();
      AbstractBeanFactory o2 =
          (AbstractBeanFactory)
              Class.forName("factory_method.refrect.SomeBeanFactory").newInstance();
      o1.getInstance().doSomeThing();
      o2.getInstance().doSomeThing();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}
