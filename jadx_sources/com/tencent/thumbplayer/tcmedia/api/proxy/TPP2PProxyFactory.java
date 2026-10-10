package com.tencent.thumbplayer.tcmedia.api.proxy;

import android.content.Context;
import com.tencent.thumbplayer.tcmedia.p156c.C35298g;

/* JADX INFO: loaded from: classes62.dex */
public class TPP2PProxyFactory {
    public static ITPPreloadProxy createPreloadManager(Context context, int i11) {
        return new C35298g(context, i11);
    }
}
