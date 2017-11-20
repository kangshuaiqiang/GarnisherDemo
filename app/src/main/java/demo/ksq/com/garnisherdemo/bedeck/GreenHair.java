package demo.ksq.com.garnisherdemo.bedeck;

import demo.ksq.com.garnisherdemo.Avatar;

/**
 * Created by 黑白 on 2017/11/20.
 */

public class GreenHair extends AvatarDecorator {
    public GreenHair(Avatar avatar) {
        super(avatar);
    }
    @Override
    public String describe() {
        return super.describe()+"+绿色头发";
    }
}
