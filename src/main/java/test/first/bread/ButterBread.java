package test.first.bread;

import lombok.ToString;

@ToString
public class ButterBread implements Bread{
    private BreadType type;

    private Recipe recipe;

    @Override
    public void setBread(BreadType type, Recipe recipe) {
        this.type = type;
        this.recipe = recipe;
    }
}
