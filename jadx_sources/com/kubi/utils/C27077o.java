package com.kubi.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.o */
/* JADX INFO: compiled from: DeviceUtils.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27077o {
    /* JADX INFO: renamed from: a */
    public static final boolean m66821a() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return Intrinsics.areEqual("harmony", cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
        } catch (Throwable unused) {
            return false;
        }
    }
}
