package demo.ksq.com.garnisherdemo.jacket;

import demo.ksq.com.garnisherdemo.Avatar;
import demo.ksq.com.garnisherdemo.bedeck.AvatarDecorator;

/**
 * Created by 黑白 on 2017/11/20.
 */

public class WhiteJacket extends AvatarDecorator {
    public WhiteJacket(Avatar avatar) {
        super(avatar);
    }
    @Override
    public String describe() {
        return super.describe()+"+白色上衣";
    }
}
