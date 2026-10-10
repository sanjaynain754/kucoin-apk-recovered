package com.kubi.flutter.network.channel;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.flutter.network.channel.a */
/* JADX INFO: compiled from: NetworkChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/flutter/network/channel/a;", "", "", AppsFlyerProperties.CHANNEL, "arguments", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C12603a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String channel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Object arguments;

    public C12603a(@NotNull String channel, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        this.arguments = obj;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getArguments() {
        return this.arguments;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }
}
