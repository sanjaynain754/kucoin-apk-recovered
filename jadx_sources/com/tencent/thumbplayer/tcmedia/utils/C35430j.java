package com.tencent.thumbplayer.tcmedia.utils;

import com.tencent.thumbplayer.tcmedia.api.TPAudioAttributes;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPJitterBufferConfig;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleRenderModel;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.j */
/* JADX INFO: loaded from: classes64.dex */
public class C35430j {

    /* JADX INFO: renamed from: a */
    private static final HashMap<Integer, Class> f76598a;

    /* JADX INFO: renamed from: a */
    public static boolean m78897a(@TPCommonEnum.TPOptionalId int i11, Object obj) {
        Class cls;
        return (obj == null || (cls = f76598a.get(Integer.valueOf(i11))) == null || obj.getClass() != cls) ? false : true;
    }

    static {
        HashMap<Integer, Class> map = new HashMap<>();
        f76598a = map;
        map.put(414, TPAudioAttributes.class);
        map.put(507, TPSubtitleRenderModel.class);
        map.put(140, TPJitterBufferConfig.class);
    }
}
