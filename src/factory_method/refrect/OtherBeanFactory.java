package factory_method.refrect;

/**
 * @author biscuits
 * @date 2019-05-28
 */
public class OtherBeanFactory extends AbstractBeanFactory {
  @Override
  public AbstractBean getInstance() {
    return new OtherBean();
  }
}
