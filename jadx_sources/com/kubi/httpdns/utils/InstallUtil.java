package com.kubi.httpdns.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p345ik.C38654b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import y70.C46396e;

/* JADX INFO: compiled from: InstallUtil.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, m90084d2 = {"Lcom/kubi/httpdns/utils/InstallUtil;", "", "<init>", "()V", "", "b", "()Z", "Lkotlin/Lazy;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "sIsNewInstall", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class InstallUtil {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final InstallUtil f27221a = new InstallUtil();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy sIsNewInstall = LazyKt.lazy(new Function0<Boolean>() { // from class: com.kubi.httpdns.utils.InstallUtil$sIsNewInstall$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(C46396e.m102347d(C38654b.f86659a.m87380a(), "IS_NEW_INSTALL", true));
        }
    });

    /* JADX INFO: renamed from: a */
    public final boolean m31534a() {
        return ((Boolean) sIsNewInstall.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m31535b() {
        if (m31534a()) {
            C46396e.m102354k(C38654b.f86659a.m87380a(), "IS_NEW_INSTALL", false);
        }
        return m31534a();
    }
}
