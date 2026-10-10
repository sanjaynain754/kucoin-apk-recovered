package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeSocketJsTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/PollingSocketTaskParams;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "topic", "", "pollFrequence", "invalidFrequence", "channelType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTopic", "()Ljava/lang/String;", "getPollFrequence", "getInvalidFrequence", "getChannelType", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSocketJsTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSocketJsTurboModule.kt\ncom/kubi/rn/core/turbo/PollingSocketTaskParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
public final /* data */ class PollingSocketTaskParams implements WritableMapSerializable {

    @Nullable
    private final String channelType;

    @Nullable
    private final String invalidFrequence;

    @Nullable
    private final String pollFrequence;

    @Nullable
    private final String topic;

    public PollingSocketTaskParams() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollingSocketTaskParams)) {
            return false;
        }
        PollingSocketTaskParams pollingSocketTaskParams = (PollingSocketTaskParams) other;
        return Intrinsics.areEqual(this.topic, pollingSocketTaskParams.topic) && Intrinsics.areEqual(this.pollFrequence, pollingSocketTaskParams.pollFrequence) && Intrinsics.areEqual(this.invalidFrequence, pollingSocketTaskParams.invalidFrequence) && Intrinsics.areEqual(this.channelType, pollingSocketTaskParams.channelType);
    }

    public PollingSocketTaskParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.topic = str;
        this.pollFrequence = str2;
        this.invalidFrequence = str3;
        this.channelType = str4;
    }

    public static /* synthetic */ PollingSocketTaskParams copy$default(PollingSocketTaskParams pollingSocketTaskParams, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pollingSocketTaskParams.topic;
        }
        if ((i11 & 2) != 0) {
            str2 = pollingSocketTaskParams.pollFrequence;
        }
        if ((i11 & 4) != 0) {
            str3 = pollingSocketTaskParams.invalidFrequence;
        }
        if ((i11 & 8) != 0) {
            str4 = pollingSocketTaskParams.channelType;
        }
        return pollingSocketTaskParams.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPollFrequence() {
        return this.pollFrequence;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInvalidFrequence() {
        return this.invalidFrequence;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    @NotNull
    public final PollingSocketTaskParams copy(@Nullable String topic, @Nullable String pollFrequence, @Nullable String invalidFrequence, @Nullable String channelType) {
        return new PollingSocketTaskParams(topic, pollFrequence, invalidFrequence, channelType);
    }

    @Nullable
    public final String getChannelType() {
        return this.channelType;
    }

    @Nullable
    public final String getInvalidFrequence() {
        return this.invalidFrequence;
    }

    @Nullable
    public final String getPollFrequence() {
        return this.pollFrequence;
    }

    @Nullable
    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        String str = this.topic;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pollFrequence;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.invalidFrequence;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.channelType;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PollingSocketTaskParams(topic=" + this.topic + ", pollFrequence=" + this.pollFrequence + ", invalidFrequence=" + this.invalidFrequence + ", channelType=" + this.channelType + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.topic;
        if (str != null) {
            writableMapCreateMap.putString("topic", str.toString());
        }
        String str2 = this.pollFrequence;
        if (str2 != null) {
            writableMapCreateMap.putString("pollFrequence", str2.toString());
        }
        String str3 = this.invalidFrequence;
        if (str3 != null) {
            writableMapCreateMap.putString("invalidFrequence", str3.toString());
        }
        String str4 = this.channelType;
        if (str4 != null) {
            writableMapCreateMap.putString("channelType", str4.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ PollingSocketTaskParams(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }
}
