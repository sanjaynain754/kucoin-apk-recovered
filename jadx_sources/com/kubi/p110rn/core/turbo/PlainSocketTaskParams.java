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
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/PlainSocketTaskParams;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "topic", "", "channelType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTopic", "()Ljava/lang/String;", "getChannelType", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSocketJsTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSocketJsTurboModule.kt\ncom/kubi/rn/core/turbo/PlainSocketTaskParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
public final /* data */ class PlainSocketTaskParams implements WritableMapSerializable {

    @Nullable
    private final String channelType;

    @Nullable
    private final String topic;

    /* JADX WARN: Multi-variable type inference failed */
    public PlainSocketTaskParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlainSocketTaskParams)) {
            return false;
        }
        PlainSocketTaskParams plainSocketTaskParams = (PlainSocketTaskParams) other;
        return Intrinsics.areEqual(this.topic, plainSocketTaskParams.topic) && Intrinsics.areEqual(this.channelType, plainSocketTaskParams.channelType);
    }

    public PlainSocketTaskParams(@Nullable String str, @Nullable String str2) {
        this.topic = str;
        this.channelType = str2;
    }

    public static /* synthetic */ PlainSocketTaskParams copy$default(PlainSocketTaskParams plainSocketTaskParams, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = plainSocketTaskParams.topic;
        }
        if ((i11 & 2) != 0) {
            str2 = plainSocketTaskParams.channelType;
        }
        return plainSocketTaskParams.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    @NotNull
    public final PlainSocketTaskParams copy(@Nullable String topic, @Nullable String channelType) {
        return new PlainSocketTaskParams(topic, channelType);
    }

    @Nullable
    public final String getChannelType() {
        return this.channelType;
    }

    @Nullable
    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        String str = this.topic;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channelType;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PlainSocketTaskParams(topic=" + this.topic + ", channelType=" + this.channelType + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.topic;
        if (str != null) {
            writableMapCreateMap.putString("topic", str.toString());
        }
        String str2 = this.channelType;
        if (str2 != null) {
            writableMapCreateMap.putString("channelType", str2.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ PlainSocketTaskParams(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
