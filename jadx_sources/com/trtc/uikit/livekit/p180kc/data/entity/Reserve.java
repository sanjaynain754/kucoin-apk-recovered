package com.trtc.uikit.livekit.p180kc.data.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Reserve.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/Reserve;", "", "<init>", "()V", "Request", "Response", "ReserveInfo", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Reserve {

    /* JADX INFO: compiled from: Reserve.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$Request;", "", "roomId", "", "subscribe", "", "<init>", "(Ljava/lang/String;I)V", "getRoomId", "()Ljava/lang/String;", "getSubscribe", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @SerializedName("roomId")
        @NotNull
        private final String roomId;

        @SerializedName("reserve")
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

    /* JADX INFO: compiled from: Reserve.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$ReserveInfo;", "", "iconUrl", "", "reserve", "", "roomTitle", "roomOpenTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)V", "getIconUrl", "()Ljava/lang/String;", "getReserve", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRoomTitle", "getRoomOpenTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$ReserveInfo;", "equals", "", "other", "hashCode", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ReserveInfo {

        @SerializedName("coverUrl")
        @Nullable
        private final String iconUrl;

        @SerializedName("reserve")
        @Nullable
        private final Integer reserve;

        @SerializedName("roomOpenTime")
        @Nullable
        private final Long roomOpenTime;

        @SerializedName("roomTitle")
        @Nullable
        private final String roomTitle;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReserveInfo)) {
                return false;
            }
            ReserveInfo reserveInfo = (ReserveInfo) other;
            return Intrinsics.areEqual(this.iconUrl, reserveInfo.iconUrl) && Intrinsics.areEqual(this.reserve, reserveInfo.reserve) && Intrinsics.areEqual(this.roomTitle, reserveInfo.roomTitle) && Intrinsics.areEqual(this.roomOpenTime, reserveInfo.roomOpenTime);
        }

        public static /* synthetic */ ReserveInfo copy$default(ReserveInfo reserveInfo, String str, Integer num, String str2, Long l11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = reserveInfo.iconUrl;
            }
            if ((i11 & 2) != 0) {
                num = reserveInfo.reserve;
            }
            if ((i11 & 4) != 0) {
                str2 = reserveInfo.roomTitle;
            }
            if ((i11 & 8) != 0) {
                l11 = reserveInfo.roomOpenTime;
            }
            return reserveInfo.copy(str, num, str2, l11);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getReserve() {
            return this.reserve;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRoomTitle() {
            return this.roomTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getRoomOpenTime() {
            return this.roomOpenTime;
        }

        @NotNull
        public final ReserveInfo copy(@Nullable String iconUrl, @Nullable Integer reserve, @Nullable String roomTitle, @Nullable Long roomOpenTime) {
            return new ReserveInfo(iconUrl, reserve, roomTitle, roomOpenTime);
        }

        @Nullable
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        public final Integer getReserve() {
            return this.reserve;
        }

        @Nullable
        public final Long getRoomOpenTime() {
            return this.roomOpenTime;
        }

        @Nullable
        public final String getRoomTitle() {
            return this.roomTitle;
        }

        public int hashCode() {
            String str = this.iconUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.reserve;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.roomTitle;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l11 = this.roomOpenTime;
            return iHashCode3 + (l11 != null ? l11.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ReserveInfo(iconUrl=" + this.iconUrl + ", reserve=" + this.reserve + ", roomTitle=" + this.roomTitle + ", roomOpenTime=" + this.roomOpenTime + ')';
        }

        public ReserveInfo(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Long l11) {
            this.iconUrl = str;
            this.reserve = num;
            this.roomTitle = str2;
            this.roomOpenTime = l11;
        }
    }

    /* JADX INFO: compiled from: Reserve.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$Response;", "", "reserve", "", "<init>", "(I)V", "getReserve", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName("reserve")
        private final int reserve;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Response) && this.reserve == ((Response) other).reserve;
        }

        public static /* synthetic */ Response copy$default(Response response, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = response.reserve;
            }
            return response.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getReserve() {
            return this.reserve;
        }

        @NotNull
        public final Response copy(int reserve) {
            return new Response(reserve);
        }

        public final int getReserve() {
            return this.reserve;
        }

        public int hashCode() {
            return Integer.hashCode(this.reserve);
        }

        @NotNull
        public String toString() {
            return "Response(reserve=" + this.reserve + ')';
        }

        public Response(int i11) {
            this.reserve = i11;
        }
    }
}
