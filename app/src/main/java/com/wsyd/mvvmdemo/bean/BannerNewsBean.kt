package com.wsyd.mvvmdemo.bean

import android.databinding.BaseObservable

/**
 * Created by wsyd on 2018/2/5.
 */

class BannerNewsBean : BaseObservable(){


    /**
     * id : 1
     * associationId : null
     * raceId : null
     * userId : null
     * articleType : null
     * title : U23亚洲杯-韦世豪传射 中国队3-0阿曼取开门红
     * intro : 北京时间1月9日下午，U23亚洲杯揭幕战在江苏常州打响，中国队3-0战胜阿曼队，取得开门红，这也是中国队在U23亚洲杯历史上的首场胜利。第30分钟，李帅助杨立瑜取得入球；第34分钟，韦世豪妙传助李晓明将比分扩大；第53分钟，姚均晟助韦世豪入球。12日中国队将对阵乌兹别克斯坦队。
     * coverImage : http://n.sinaimg.cn/sports/transform/w650h433/20180109/G-UI-fyqnici9529443.jpg
     * bannerImage : http://n.sinaimg.cn/sports/transform/w650h433/20180109/G-UI-fyqnici9529443.jpg
     * onFocus : 11
     * createTime : 2018-01-09 06:18:55
     * status : null
     * refData : null
     */

    var id: Int = 0
    var associationId: Any? = null
    var raceId: Any? = null
    var userId: Any? = null
    var articleType: Any? = null
    var title: String? = null
    var intro: String? = null
    var coverImage: String? = null
    var bannerImage: String? = null
    var onFocus: Int = 0
    var createTime: String? = null
    var status: Any? = null
    var refData: Any? = null

}
