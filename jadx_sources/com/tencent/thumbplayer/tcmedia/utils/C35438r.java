package com.tencent.thumbplayer.tcmedia.utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.r */
/* JADX INFO: loaded from: classes64.dex */
public class C35438r {

    /* JADX INFO: renamed from: a */
    private static Map<String, Integer> f76624a;

    /* JADX INFO: renamed from: a */
    public static int m78938a(String str) {
        if (str == null) {
            return -1;
        }
        String lowerCase = str.toLowerCase();
        for (Map.Entry<String, Integer> entry : f76624a.entrySet()) {
            if (lowerCase.startsWith(entry.getKey())) {
                return entry.getValue().intValue();
            }
        }
        try {
            return new File(str).exists() ? 4 : -1;
        } catch (Exception unused) {
        }
    }

    static {
        HashMap map = new HashMap();
        f76624a = map;
        map.put("http://", 0);
        f76624a.put("https://", 1);
        f76624a.put("rtmp://", 2);
        f76624a.put("webrtc://", 3);
        f76624a.put("file://", 4);
        f76624a.put("/", 4);
    }
}
