package abstract_factory;

/**
 * @author biscuits
 * @date 2019-05-28
 */

public class AppleFactory extends AbstractFactory {
    @Override
    public IPhoneXS createPhone() {
        return new IPhoneXS();
    }

    @Override
    public MacBookPro createComputer() {
        return new MacBookPro();
    }
}
