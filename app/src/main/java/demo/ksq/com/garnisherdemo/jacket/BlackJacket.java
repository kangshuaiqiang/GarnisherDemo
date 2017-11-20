package demo.ksq.com.garnisherdemo.jacket;

import demo.ksq.com.garnisherdemo.Avatar;
import demo.ksq.com.garnisherdemo.bedeck.AvatarDecorator;

/**
 * Created by 黑白 on 2017/11/20.
 */

public class BlackJacket extends AvatarDecorator {
    public BlackJacket(Avatar avatar) {
        super(avatar);
    }
    @Override
    public String describe() {
        return super.describe()+"+黑色上衣";
    }
}
