package demo.ksq.com.garnisherdemo.bedeck;

import demo.ksq.com.garnisherdemo.Avatar;

/**
 * Created by 黑白 on 2017/11/20.
 */

public class AvatarDecorator implements Avatar{
    private Avatar av;
    public AvatarDecorator(Avatar avatar){
        av = avatar;
    }

    @Override
    public String describe() {
        return av.describe();
    }
}
