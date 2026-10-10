package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiSocketJsModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsPollingSocketTaskParams;", "", "topic", "", "pollFrequence", "invalidFrequence", "channelType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelType", "()Ljava/lang/String;", "getInvalidFrequence", "getPollFrequence", "getTopic", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiSocketJsPollingSocketTaskParams {

    @NotNull
    private final String channelType;

    @NotNull
    private final String invalidFrequence;

    @NotNull
    private final String pollFrequence;

    @NotNull
    private final String topic;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiSocketJsPollingSocketTaskParams)) {
            return false;
        }
        KCJSApiSocketJsPollingSocketTaskParams kCJSApiSocketJsPollingSocketTaskParams = (KCJSApiSocketJsPollingSocketTaskParams) other;
        return Intrinsics.areEqual(this.topic, kCJSApiSocketJsPollingSocketTaskParams.topic) && Intrinsics.areEqual(this.pollFrequence, kCJSApiSocketJsPollingSocketTaskParams.pollFrequence) && Intrinsics.areEqual(this.invalidFrequence, kCJSApiSocketJsPollingSocketTaskParams.invalidFrequence) && Intrinsics.areEqual(this.channelType, kCJSApiSocketJsPollingSocketTaskParams.channelType);
    }

    public KCJSApiSocketJsPollingSocketTaskParams(@NotNull String topic, @NotNull String pollFrequence, @NotNull String invalidFrequence, @NotNull String channelType) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(pollFrequence, "pollFrequence");
        Intrinsics.checkNotNullParameter(invalidFrequence, "invalidFrequence");
        Intrinsics.checkNotNullParameter(channelType, "channelType");
        this.topic = topic;
        this.pollFrequence = pollFrequence;
        this.invalidFrequence = invalidFrequence;
        this.channelType = channelType;
    }

    public static /* synthetic */ KCJSApiSocketJsPollingSocketTaskParams copy$default(KCJSApiSocketJsPollingSocketTaskParams kCJSApiSocketJsPollingSocketTaskParams, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiSocketJsPollingSocketTaskParams.topic;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiSocketJsPollingSocketTaskParams.pollFrequence;
        }
        if ((i11 & 4) != 0) {
            str3 = kCJSApiSocketJsPollingSocketTaskParams.invalidFrequence;
        }
        if ((i11 & 8) != 0) {
            str4 = kCJSApiSocketJsPollingSocketTaskParams.channelType;
        }
        return kCJSApiSocketJsPollingSocketTaskParams.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPollFrequence() {
        return this.pollFrequence;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInvalidFrequence() {
        return this.invalidFrequence;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    @NotNull
    public final KCJSApiSocketJsPollingSocketTaskParams copy(@NotNull String topic, @NotNull String pollFrequence, @NotNull String invalidFrequence, @NotNull String channelType) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(pollFrequence, "pollFrequence");
        Intrinsics.checkNotNullParameter(invalidFrequence, "invalidFrequence");
        Intrinsics.checkNotNullParameter(channelType, "channelType");
        return new KCJSApiSocketJsPollingSocketTaskParams(topic, pollFrequence, invalidFrequence, channelType);
    }

    @NotNull
    public final String getChannelType() {
        return this.channelType;
    }

    @NotNull
    public final String getInvalidFrequence() {
        return this.invalidFrequence;
    }

    @NotNull
    public final String getPollFrequence() {
        return this.pollFrequence;
    }

    @NotNull
    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return (((((this.topic.hashCode() * 31) + this.pollFrequence.hashCode()) * 31) + this.invalidFrequence.hashCode()) * 31) + this.channelType.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCJSApiSocketJsPollingSocketTaskParams(topic=" + this.topic + ", pollFrequence=" + this.pollFrequence + ", invalidFrequence=" + this.invalidFrequence + ", channelType=" + this.channelType + ')';
    }
}
