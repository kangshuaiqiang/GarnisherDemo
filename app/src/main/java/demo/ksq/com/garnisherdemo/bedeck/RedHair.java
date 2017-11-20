package demo.ksq.com.garnisherdemo.bedeck;

import demo.ksq.com.garnisherdemo.Avatar;

/**
 * Created by 黑白 on 2017/11/20.
 */

public class RedHair extends AvatarDecorator {
    public RedHair(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String describe() {
        return super.describe() + "红色头发";
    }
}
