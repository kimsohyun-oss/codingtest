package test.first.bread;

public class BreadFactory {

    public static Bread createBread(BreadType type, Recipe recipe) {
        if (BreadType.SUGAR == type) {
            SugarBread sugarBread = new SugarBread();
            sugarBread.setBread(type, recipe);

            return sugarBread;
        }

        if (BreadType.BUTTER == type) {
            ButterBread butterBread = new ButterBread();
            butterBread.setBread(type, recipe);

            return butterBread;
        }

        if (BreadType.CREAM == type) {
            CreamBread creamBread = new CreamBread();
            creamBread.setBread(type, recipe);

            return creamBread;
        }

        return null;
    }
}
