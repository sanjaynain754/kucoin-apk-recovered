package com.kubi.network.api.subscribe.model;

import androidx.annotation.Keep;
import ir.C40168c;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubscribeRequest.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001d\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'BI\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001a¨\u0006("}, m90084d2 = {"Lcom/kubi/network/api/subscribe/model/PeriodRequest;", "", "type", "", "request", "Lokhttp3/Request;", "supportBackground", "", "promptlyRequest", "waitPeriodResult", "connectedPeriod", "", "disconnectPeriod", "(Ljava/lang/String;Lokhttp3/Request;ZZZII)V", "getConnectedPeriod", "()I", "setConnectedPeriod", "(I)V", "getDisconnectPeriod", "setDisconnectPeriod", "id", "getId", "()Ljava/lang/String;", "getPromptlyRequest", "()Z", "setPromptlyRequest", "(Z)V", "getRequest", "()Lokhttp3/Request;", "setRequest", "(Lokhttp3/Request;)V", "getSupportBackground", "setSupportBackground", "getType", "setType", "(Ljava/lang/String;)V", "getWaitPeriodResult", "setWaitPeriodResult", "clone", "Companion", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class PeriodRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int connectedPeriod;
    private int disconnectPeriod;

    @NotNull
    private final String id;
    private boolean promptlyRequest;

    @NotNull
    private Request request;
    private boolean supportBackground;

    @NotNull
    private String type;
    private boolean waitPeriodResult;

    /* JADX INFO: compiled from: SubscribeRequest.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, m90084d2 = {"Lcom/kubi/network/api/subscribe/model/PeriodRequest$Companion;", "", "()V", "subscribe", "Lcom/kubi/network/api/subscribe/model/PeriodRequest;", "request", "Lokhttp3/Request;", "unsubscribe", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final PeriodRequest subscribe(@NotNull Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return new PeriodRequest("subscribe", request, false, false, false, 0, 0, 124, null);
        }

        @NotNull
        public final PeriodRequest unsubscribe(@NotNull Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return new PeriodRequest("unsubscribe", request, false, false, false, 0, 0, 124, null);
        }
    }

    public PeriodRequest(@NotNull String type, @NotNull Request request, boolean z11, boolean z12, boolean z13, int i11, int i12) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(request, "request");
        this.type = type;
        this.request = request;
        this.supportBackground = z11;
        this.promptlyRequest = z12;
        this.waitPeriodResult = z13;
        this.connectedPeriod = i11;
        this.disconnectPeriod = i12;
        this.id = C40168c.f89309a.m88527b(request);
    }

    @NotNull
    public final PeriodRequest clone(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new PeriodRequest(type, this.request, this.supportBackground, this.promptlyRequest, this.waitPeriodResult, this.connectedPeriod, this.disconnectPeriod);
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

    public final boolean getPromptlyRequest() {
        return this.promptlyRequest;
    }

    @NotNull
    public final Request getRequest() {
        return this.request;
    }

    public final boolean getSupportBackground() {
        return this.supportBackground;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final boolean getWaitPeriodResult() {
        return this.waitPeriodResult;
    }

    public final void setConnectedPeriod(int i11) {
        this.connectedPeriod = i11;
    }

    public final void setDisconnectPeriod(int i11) {
        this.disconnectPeriod = i11;
    }

    public final void setPromptlyRequest(boolean z11) {
        this.promptlyRequest = z11;
    }

    public final void setRequest(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "<set-?>");
        this.request = request;
    }

    public final void setSupportBackground(boolean z11) {
        this.supportBackground = z11;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final void setWaitPeriodResult(boolean z11) {
        this.waitPeriodResult = z11;
    }

    public /* synthetic */ PeriodRequest(String str, Request request, boolean z11, boolean z12, boolean z13, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "subscribe" : str, request, (i13 & 4) != 0 ? false : z11, (i13 & 8) != 0 ? true : z12, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? Integer.MAX_VALUE : i11, (i13 & 64) != 0 ? 10 : i12);
    }
}
