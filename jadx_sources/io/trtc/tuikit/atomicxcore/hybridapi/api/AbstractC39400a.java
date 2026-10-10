package io.trtc.tuikit.atomicxcore.hybridapi.api;

import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridRequest;
import java.util.Map;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.api.a */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39400a {
    /* JADX INFO: renamed from: a */
    public static Map m88231a(HybridRequest hybridRequest, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(hybridRequest, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return hybridRequest.getParams();
    }
}
