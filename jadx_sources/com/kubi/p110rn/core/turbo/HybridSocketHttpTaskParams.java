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
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/HybridSocketHttpTaskParams;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "topic", "", "pollFrequence", "invalidFrequence", "channelType", "httpBinding", "Lcom/kubi/rn/core/turbo/HttpActionBinding;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/rn/core/turbo/HttpActionBinding;)V", "getTopic", "()Ljava/lang/String;", "getPollFrequence", "getInvalidFrequence", "getChannelType", "getHttpBinding", "()Lcom/kubi/rn/core/turbo/HttpActionBinding;", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSocketJsTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSocketJsTurboModule.kt\ncom/kubi/rn/core/turbo/HybridSocketHttpTaskParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
public final /* data */ class HybridSocketHttpTaskParams implements WritableMapSerializable {

    @Nullable
    private final String channelType;

    @Nullable
    private final HttpActionBinding httpBinding;

    @Nullable
    private final String invalidFrequence;

    @Nullable
    private final String pollFrequence;

    @Nullable
    private final String topic;

    public HybridSocketHttpTaskParams() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybridSocketHttpTaskParams)) {
            return false;
        }
        HybridSocketHttpTaskParams hybridSocketHttpTaskParams = (HybridSocketHttpTaskParams) other;
        return Intrinsics.areEqual(this.topic, hybridSocketHttpTaskParams.topic) && Intrinsics.areEqual(this.pollFrequence, hybridSocketHttpTaskParams.pollFrequence) && Intrinsics.areEqual(this.invalidFrequence, hybridSocketHttpTaskParams.invalidFrequence) && Intrinsics.areEqual(this.channelType, hybridSocketHttpTaskParams.channelType) && Intrinsics.areEqual(this.httpBinding, hybridSocketHttpTaskParams.httpBinding);
    }

    public HybridSocketHttpTaskParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable HttpActionBinding httpActionBinding) {
        this.topic = str;
        this.pollFrequence = str2;
        this.invalidFrequence = str3;
        this.channelType = str4;
        this.httpBinding = httpActionBinding;
    }

    public static /* synthetic */ HybridSocketHttpTaskParams copy$default(HybridSocketHttpTaskParams hybridSocketHttpTaskParams, String str, String str2, String str3, String str4, HttpActionBinding httpActionBinding, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hybridSocketHttpTaskParams.topic;
        }
        if ((i11 & 2) != 0) {
            str2 = hybridSocketHttpTaskParams.pollFrequence;
        }
        if ((i11 & 4) != 0) {
            str3 = hybridSocketHttpTaskParams.invalidFrequence;
        }
        if ((i11 & 8) != 0) {
            str4 = hybridSocketHttpTaskParams.channelType;
        }
        if ((i11 & 16) != 0) {
            httpActionBinding = hybridSocketHttpTaskParams.httpBinding;
        }
        HttpActionBinding httpActionBinding2 = httpActionBinding;
        String str5 = str3;
        return hybridSocketHttpTaskParams.copy(str, str2, str5, str4, httpActionBinding2);
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

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HttpActionBinding getHttpBinding() {
        return this.httpBinding;
    }

    @NotNull
    public final HybridSocketHttpTaskParams copy(@Nullable String topic, @Nullable String pollFrequence, @Nullable String invalidFrequence, @Nullable String channelType, @Nullable HttpActionBinding httpBinding) {
        return new HybridSocketHttpTaskParams(topic, pollFrequence, invalidFrequence, channelType, httpBinding);
    }

    @Nullable
    public final String getChannelType() {
        return this.channelType;
    }

    @Nullable
    public final HttpActionBinding getHttpBinding() {
        return this.httpBinding;
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
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        HttpActionBinding httpActionBinding = this.httpBinding;
        return iHashCode4 + (httpActionBinding != null ? httpActionBinding.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HybridSocketHttpTaskParams(topic=" + this.topic + ", pollFrequence=" + this.pollFrequence + ", invalidFrequence=" + this.invalidFrequence + ", channelType=" + this.channelType + ", httpBinding=" + this.httpBinding + ")";
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
        HttpActionBinding httpActionBinding = this.httpBinding;
        if (httpActionBinding != null) {
            writableMapCreateMap.putString("httpBinding", httpActionBinding.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ HybridSocketHttpTaskParams(String str, String str2, String str3, String str4, HttpActionBinding httpActionBinding, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : httpActionBinding);
    }
}
