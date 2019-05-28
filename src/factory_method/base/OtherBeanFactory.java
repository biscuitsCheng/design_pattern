package factory_method.base;

/**
 * @author biscuits
 * @date 2019-05-28
 */

public class OtherBeanFactory extends AbstractBeanFactory {
    @Override
    public OtherBean getInstance() {
        return new OtherBean();
    }
}
