package com.trtc.uikit.livekit.p180kc.data.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SaveLiveCard.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/SaveLiveCard;", "", "<init>", "()V", "Request", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SaveLiveCard {

    /* JADX INFO: compiled from: SaveLiveCard.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/SaveLiveCard$Request;", "", "roomId", "", "cardType", "openBusinessId", "closeBusinessId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRoomId", "()Ljava/lang/String;", "getCardType", "getOpenBusinessId", "getCloseBusinessId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @Nullable
        private final String cardType;

        @Nullable
        private final String closeBusinessId;

        @Nullable
        private final String openBusinessId;

        @Nullable
        private final String roomId;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.roomId, request.roomId) && Intrinsics.areEqual(this.cardType, request.cardType) && Intrinsics.areEqual(this.openBusinessId, request.openBusinessId) && Intrinsics.areEqual(this.closeBusinessId, request.closeBusinessId);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.roomId;
            }
            if ((i11 & 2) != 0) {
                str2 = request.cardType;
            }
            if ((i11 & 4) != 0) {
                str3 = request.openBusinessId;
            }
            if ((i11 & 8) != 0) {
                str4 = request.closeBusinessId;
            }
            return request.copy(str, str2, str3, str4);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRoomId() {
            return this.roomId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCardType() {
            return this.cardType;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getOpenBusinessId() {
            return this.openBusinessId;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCloseBusinessId() {
            return this.closeBusinessId;
        }

        @NotNull
        public final Request copy(@Nullable String roomId, @Nullable String cardType, @Nullable String openBusinessId, @Nullable String closeBusinessId) {
            return new Request(roomId, cardType, openBusinessId, closeBusinessId);
        }

        @Nullable
        public final String getCardType() {
            return this.cardType;
        }

        @Nullable
        public final String getCloseBusinessId() {
            return this.closeBusinessId;
        }

        @Nullable
        public final String getOpenBusinessId() {
            return this.openBusinessId;
        }

        @Nullable
        public final String getRoomId() {
            return this.roomId;
        }

        public int hashCode() {
            String str = this.roomId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cardType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.openBusinessId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.closeBusinessId;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(roomId=" + this.roomId + ", cardType=" + this.cardType + ", openBusinessId=" + this.openBusinessId + ", closeBusinessId=" + this.closeBusinessId + ')';
        }

        public Request(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.roomId = str;
            this.cardType = str2;
            this.openBusinessId = str3;
            this.closeBusinessId = str4;
        }
    }
}
