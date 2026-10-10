package com.kubi.safe;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5264d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.safe.a */
/* JADX INFO: compiled from: AppInfoUtils.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m90084d2 = {"Lcom/kubi/safe/a;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "b", "c", "keychain_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C23639a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C23639a f46244a = new C23639a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m56300a() {
        String strM6158d = C5264d.m6158d();
        Intrinsics.checkNotNullExpressionValue(strM6158d, "getAppSignatureMD5()");
        return strM6158d;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m56301b() {
        String strM6160f = C5264d.m6160f();
        Intrinsics.checkNotNullExpressionValue(strM6160f, "getAppSignatureSHA1()");
        return strM6160f;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m56302c() {
        String strM6162h = C5264d.m6162h();
        Intrinsics.checkNotNullExpressionValue(strM6162h, "getAppSignatureSHA256()");
        return strM6162h;
    }
}
