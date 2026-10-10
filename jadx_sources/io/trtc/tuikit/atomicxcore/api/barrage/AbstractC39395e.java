package io.trtc.tuikit.atomicxcore.api.barrage;

import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.api.barrage.e */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39395e {
    /* JADX INFO: renamed from: a */
    public static String m88224a(Map map, Class cls, String str) {
        Intrinsics.checkNotNull(map);
        String name = cls.getName();
        Intrinsics.checkNotNullExpressionValue(name, str);
        return name;
    }
}
