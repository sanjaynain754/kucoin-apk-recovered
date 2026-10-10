package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiSocketJsModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsSocketJsPayload;", "", "source", "", "topic", "data", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getError", "getSource", "getTopic", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiSocketJsSocketJsPayload {

    @NotNull
    private final String data;

    @Nullable
    private final String error;

    @NotNull
    private final String source;

    @NotNull
    private final String topic;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiSocketJsSocketJsPayload)) {
            return false;
        }
        KCJSApiSocketJsSocketJsPayload kCJSApiSocketJsSocketJsPayload = (KCJSApiSocketJsSocketJsPayload) other;
        return Intrinsics.areEqual(this.source, kCJSApiSocketJsSocketJsPayload.source) && Intrinsics.areEqual(this.topic, kCJSApiSocketJsSocketJsPayload.topic) && Intrinsics.areEqual(this.data, kCJSApiSocketJsSocketJsPayload.data) && Intrinsics.areEqual(this.error, kCJSApiSocketJsSocketJsPayload.error);
    }

    public KCJSApiSocketJsSocketJsPayload(@NotNull String source, @NotNull String topic, @NotNull String data, @Nullable String str) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(data, "data");
        this.source = source;
        this.topic = topic;
        this.data = data;
        this.error = str;
    }

    public static /* synthetic */ KCJSApiSocketJsSocketJsPayload copy$default(KCJSApiSocketJsSocketJsPayload kCJSApiSocketJsSocketJsPayload, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiSocketJsSocketJsPayload.source;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiSocketJsSocketJsPayload.topic;
        }
        if ((i11 & 4) != 0) {
            str3 = kCJSApiSocketJsSocketJsPayload.data;
        }
        if ((i11 & 8) != 0) {
            str4 = kCJSApiSocketJsSocketJsPayload.error;
        }
        return kCJSApiSocketJsSocketJsPayload.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final KCJSApiSocketJsSocketJsPayload copy(@NotNull String source, @NotNull String topic, @NotNull String data, @Nullable String error) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(data, "data");
        return new KCJSApiSocketJsSocketJsPayload(source, topic, data, error);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        int iHashCode = ((((this.source.hashCode() * 31) + this.topic.hashCode()) * 31) + this.data.hashCode()) * 31;
        String str = this.error;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "KCJSApiSocketJsSocketJsPayload(source=" + this.source + ", topic=" + this.topic + ", data=" + this.data + ", error=" + this.error + ')';
    }
}
