package demo.ksq.com.garnisherdemo.pants;

import demo.ksq.com.garnisherdemo.Avatar;
import demo.ksq.com.garnisherdemo.bedeck.AvatarDecorator;

/**
 * Created by 黑白 on 2017/11/20.
 */

public class WhitePants extends AvatarDecorator {
    public WhitePants(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String describe() {
        return super.describe()+"+白色裤子";
    }
}
