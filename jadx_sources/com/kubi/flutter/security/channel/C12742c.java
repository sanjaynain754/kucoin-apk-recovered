package com.kubi.flutter.security.channel;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33844oi;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.flutter.security.channel.c */
/* JADX INFO: compiled from: SecurityChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/flutter/security/channel/c;", "", "<init>", "()V", "Lcom/kubi/flutter/security/channel/b;", FirebaseAnalytics.Param.METHOD, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/flutter/security/channel/b;)Ljava/lang/String;", "b", "(Ljava/lang/String;)Lcom/kubi/flutter/security/channel/b;", "component_security_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C12742c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m24080a(@NotNull C12741b method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return method.getChannel() + ':' + method.getName();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final C12741b m24081b(@NotNull String method) throws Exception {
        Intrinsics.checkNotNullParameter(method, "method");
        if (!StringsKt.contains$default((CharSequence) method, (CharSequence) C33844oi.f71346o, false, 2, (Object) null)) {
            throw new Exception("method must contain a : character");
        }
        List listSplit$default = StringsKt.split$default((CharSequence) method, new String[]{C33844oi.f71346o}, false, 0, 6, (Object) null);
        if (listSplit$default.size() == 2) {
            return new C12741b((String) listSplit$default.get(0), (String) listSplit$default.get(1));
        }
        throw new Exception("method must only a : character");
    }
}
