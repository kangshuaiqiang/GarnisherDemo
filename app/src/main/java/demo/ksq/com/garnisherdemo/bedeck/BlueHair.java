package demo.ksq.com.garnisherdemo.bedeck;

import demo.ksq.com.garnisherdemo.Avatar;

/**
 * Created by 黑白 on 2017/11/20.
 */

public class BlueHair extends AvatarDecorator {
    public BlueHair(Avatar avatar) {
        super(avatar);
    }
    @Override
    public String describe() {
        return super.describe()+"+蓝色头发";
    }
}
