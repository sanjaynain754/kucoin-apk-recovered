package com.kubi.flutter.security.channel;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugin.common.MethodChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.flutter.security.channel.a */
/* JADX INFO: compiled from: SecurityChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/flutter/security/channel/a;", "", "", "name", "Lcom/kubi/flutter/security/channel/SecurityChannel;", AppsFlyerProperties.CHANNEL, "<init>", "(Ljava/lang/String;Lcom/kubi/flutter/security/channel/SecurityChannel;)V", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "handler", "", "b", "(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V", FirebaseAnalytics.Param.METHOD, "arguments", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "Lcom/kubi/flutter/security/channel/SecurityChannel;", "component_security_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C12740a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SecurityChannel channel;

    public C12740a(@NotNull String name, @NotNull SecurityChannel channel) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.name = name;
        this.channel = channel;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m24076a(@NotNull String str, @Nullable Object obj, @NotNull Continuation<Object> continuation) {
        return this.channel.m24065a(this.name, str, obj, continuation);
    }

    /* JADX INFO: renamed from: b */
    public final void m24077b(@Nullable MethodChannel.MethodCallHandler handler) {
        this.channel.m24068e(this.name, handler);
    }
}
