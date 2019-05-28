package abstract_factory;

/**
 * @author biscuits
 * @date 2019-05-28
 */
public class HuaweiFactory extends AbstractFactory {
  @Override
  public Mate30Pro createPhone() {
    return new Mate30Pro();
  }

  @Override
  public MateBookPro createComputer() {
    return new MateBookPro();
  }
}
