package com.tencent.liteav.txcvodplayer.p133b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34834a {

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C34834a f73925a = new C34834a(0);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo76357a();

        /* JADX INFO: renamed from: a */
        void mo76358a(String str, Map<String, String> map);
    }

    public /* synthetic */ C34834a(byte b11) {
        this();
    }

    private C34834a() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map m76355a(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                map2.put(entry.getKey(), ((List) entry.getValue()).get(0));
            }
        }
        return map2;
    }
}
