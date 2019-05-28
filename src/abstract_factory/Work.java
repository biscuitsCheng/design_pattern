package abstract_factory;

/**
 * @author biscuits
 * @date 2019-05-28
 */
public class Work {

  private static String facotry1 = "abstract_factory.HuaweiFactory";
  private static String facotry2 = "abstract_factory.AppleFactory";

  public static void main(String[] args) {
    //
    try {
      HuaweiFactory huaweiFactory = (HuaweiFactory) Class.forName(facotry1).newInstance();
      AppleFactory appleFactory = (AppleFactory) Class.forName(facotry2).newInstance();

      MateBookPro mateBookPro = huaweiFactory.createComputer();
      Mate30Pro mate30Pro = huaweiFactory.createPhone();
      mateBookPro.code();
      mate30Pro.call();

      MacBookPro macBookPro = appleFactory.createComputer();
      IPhoneXS iPhoneXS = appleFactory.createPhone();

      macBookPro.code();
      iPhoneXS.call();

    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
