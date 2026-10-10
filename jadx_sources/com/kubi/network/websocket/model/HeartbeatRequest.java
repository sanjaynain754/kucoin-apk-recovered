package com.kubi.network.websocket.model;

import androidx.annotation.Keep;
import ir.C40168c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B?\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\"¨\u0006$"}, m90084d2 = {"Lcom/kubi/network/websocket/model/HeartbeatRequest;", "", "type", "", "request", "Lokhttp3/Request;", "supportBackground", "", "restfulRequest", "connectedPeriod", "", "disconnectPeriod", "(Ljava/lang/String;Lokhttp3/Request;ZZII)V", "getConnectedPeriod", "()I", "setConnectedPeriod", "(I)V", "getDisconnectPeriod", "setDisconnectPeriod", "id", "getId", "()Ljava/lang/String;", "getRequest", "()Lokhttp3/Request;", "setRequest", "(Lokhttp3/Request;)V", "getRestfulRequest", "()Z", "setRestfulRequest", "(Z)V", "getSupportBackground", "setSupportBackground", "getType", "setType", "(Ljava/lang/String;)V", "Companion", "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class HeartbeatRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int connectedPeriod;
    private int disconnectPeriod;

    @NotNull
    private final String id;

    @NotNull
    private transient okhttp3.Request request;
    private boolean restfulRequest;
    private boolean supportBackground;

    @NotNull
    private String type;

    /* JADX INFO: compiled from: Request.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, m90084d2 = {"Lcom/kubi/network/websocket/model/HeartbeatRequest$Companion;", "", "()V", "subscribe", "Lcom/kubi/network/websocket/model/HeartbeatRequest;", "request", "Lokhttp3/Request;", "unsubscribe", "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final HeartbeatRequest subscribe(@NotNull okhttp3.Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return new HeartbeatRequest("subscribe", request, false, false, 0, 0, 60, null);
        }

        @NotNull
        public final HeartbeatRequest unsubscribe(@NotNull okhttp3.Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return new HeartbeatRequest("unsubscribe", request, false, false, 0, 0, 60, null);
        }
    }

    public HeartbeatRequest(@NotNull String type, @NotNull okhttp3.Request request, boolean z11, boolean z12, int i11, int i12) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(request, "request");
        this.type = type;
        this.request = request;
        this.supportBackground = z11;
        this.restfulRequest = z12;
        this.connectedPeriod = i11;
        this.disconnectPeriod = i12;
        this.id = C40168c.f89309a.m88527b(request);
    }

    public final int getConnectedPeriod() {
        return this.connectedPeriod;
    }

    public final int getDisconnectPeriod() {
        return this.disconnectPeriod;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final okhttp3.Request getRequest() {
        return this.request;
    }

    public final boolean getRestfulRequest() {
        return this.restfulRequest;
    }

    public final boolean getSupportBackground() {
        return this.supportBackground;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final void setConnectedPeriod(int i11) {
        this.connectedPeriod = i11;
    }

    public final void setDisconnectPeriod(int i11) {
        this.disconnectPeriod = i11;
    }

    public final void setRequest(@NotNull okhttp3.Request request) {
        Intrinsics.checkNotNullParameter(request, "<set-?>");
        this.request = request;
    }

    public final void setRestfulRequest(boolean z11) {
        this.restfulRequest = z11;
    }

    public final void setSupportBackground(boolean z11) {
        this.supportBackground = z11;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public /* synthetic */ HeartbeatRequest(String str, okhttp3.Request request, boolean z11, boolean z12, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "subscribe" : str, request, (i13 & 4) != 0 ? false : z11, (i13 & 8) != 0 ? true : z12, (i13 & 16) != 0 ? Integer.MAX_VALUE : i11, (i13 & 32) != 0 ? 10 : i12);
    }
}
