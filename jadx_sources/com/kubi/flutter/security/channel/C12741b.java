package com.kubi.flutter.security.channel;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.flutter.security.channel.b */
/* JADX INFO: compiled from: SecurityChannel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/flutter/security/channel/b;", "", "", AppsFlyerProperties.CHANNEL, "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "()Ljava/lang/String;", "b", "component_security_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C12741b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String channel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String name;

    public C12741b(@NotNull String channel, @NotNull String name) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(name, "name");
        this.channel = channel;
        this.name = name;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }
}
