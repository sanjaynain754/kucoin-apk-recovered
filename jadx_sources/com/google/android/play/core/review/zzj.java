package com.google.android.play.core.review;

import com.tencent.imsdk.BaseConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzj {
    private static final Map zza;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        zza = new HashMap();
        new com.google.android.play.core.review.internal.zzi("PlayCoreVersion");
    }

    public static synchronized Map zza() {
        Map map;
        map = zza;
        map.put("java", Integer.valueOf(BaseConstants.ERR_SVR_MSG_INTERNAL_AUTH_FAILED));
        return map;
    }
}
