package com.trtc.uikit.livekit.p180kc.data.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Follow.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/Follow;", "", "<init>", "()V", "Request", "Response", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Follow {

    /* JADX INFO: compiled from: Follow.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/Follow$Request;", "", "roomId", "", "subscribe", "", "<init>", "(Ljava/lang/String;I)V", "getRoomId", "()Ljava/lang/String;", "getSubscribe", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @SerializedName("roomId")
        @NotNull
        private final String roomId;

        @SerializedName("subscribe")
        private final int subscribe;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.roomId, request.roomId) && this.subscribe == request.subscribe;
        }

        public Request(@NotNull String roomId, int i11) {
            Intrinsics.checkNotNullParameter(roomId, "roomId");
            this.roomId = roomId;
            this.subscribe = i11;
        }

        public static /* synthetic */ Request copy$default(Request request, String str, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = request.roomId;
            }
            if ((i12 & 2) != 0) {
                i11 = request.subscribe;
            }
            return request.copy(str, i11);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRoomId() {
            return this.roomId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getSubscribe() {
            return this.subscribe;
        }

        @NotNull
        public final Request copy(@NotNull String roomId, int subscribe) {
            Intrinsics.checkNotNullParameter(roomId, "roomId");
            return new Request(roomId, subscribe);
        }

        @NotNull
        public final String getRoomId() {
            return this.roomId;
        }

        public final int getSubscribe() {
            return this.subscribe;
        }

        public int hashCode() {
            return (this.roomId.hashCode() * 31) + Integer.hashCode(this.subscribe);
        }

        @NotNull
        public String toString() {
            return "Request(roomId=" + this.roomId + ", subscribe=" + this.subscribe + ')';
        }
    }

    /* JADX INFO: compiled from: Follow.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/Follow$Response;", "", "subscribed", "", "<init>", "(I)V", "getSubscribed", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName("subscribe")
        private final int subscribed;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Response) && this.subscribed == ((Response) other).subscribed;
        }

        public static /* synthetic */ Response copy$default(Response response, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = response.subscribed;
            }
            return response.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getSubscribed() {
            return this.subscribed;
        }

        @NotNull
        public final Response copy(int subscribed) {
            return new Response(subscribed);
        }

        public final int getSubscribed() {
            return this.subscribed;
        }

        public int hashCode() {
            return Integer.hashCode(this.subscribed);
        }

        @NotNull
        public String toString() {
            return "Response(subscribed=" + this.subscribed + ')';
        }

        public Response(int i11) {
            this.subscribed = i11;
        }
    }
}
