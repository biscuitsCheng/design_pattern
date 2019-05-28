package factory_method.base;

/**
 * @author biscuits
 * @date 2019-05-28
 */

public class SomeBeanFactory extends AbstractBeanFactory {
    @Override
    public SomeBean getInstance() {
        return new SomeBean();
    }
}
