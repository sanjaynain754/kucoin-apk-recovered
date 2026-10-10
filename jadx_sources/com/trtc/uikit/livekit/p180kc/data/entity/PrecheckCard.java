package com.trtc.uikit.livekit.p180kc.data.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PrecheckCard.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/PrecheckCard;", "", "<init>", "()V", "Request", "ResponseEntity", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PrecheckCard {

    /* JADX INFO: compiled from: PrecheckCard.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/PrecheckCard$Request;", "", "roomId", "", "cardType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRoomId", "()Ljava/lang/String;", "getCardType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @Nullable
        private final String cardType;

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
            return Intrinsics.areEqual(this.roomId, request.roomId) && Intrinsics.areEqual(this.cardType, request.cardType);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.roomId;
            }
            if ((i11 & 2) != 0) {
                str2 = request.cardType;
            }
            return request.copy(str, str2);
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

        @NotNull
        public final Request copy(@Nullable String roomId, @Nullable String cardType) {
            return new Request(roomId, cardType);
        }

        @Nullable
        public final String getCardType() {
            return this.cardType;
        }

        @Nullable
        public final String getRoomId() {
            return this.roomId;
        }

        public int hashCode() {
            String str = this.roomId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cardType;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(roomId=" + this.roomId + ", cardType=" + this.cardType + ')';
        }

        public Request(@Nullable String str, @Nullable String str2) {
            this.roomId = str;
            this.cardType = str2;
        }
    }

    /* JADX INFO: compiled from: PrecheckCard.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/PrecheckCard$ResponseEntity;", "", "isTips", "", "tips", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTips", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/trtc/uikit/livekit/kc/data/entity/PrecheckCard$ResponseEntity;", "equals", "other", "hashCode", "", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ResponseEntity {

        @Nullable
        private final Boolean isTips;

        @Nullable
        private final String tips;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResponseEntity)) {
                return false;
            }
            ResponseEntity responseEntity = (ResponseEntity) other;
            return Intrinsics.areEqual(this.isTips, responseEntity.isTips) && Intrinsics.areEqual(this.tips, responseEntity.tips);
        }

        public static /* synthetic */ ResponseEntity copy$default(ResponseEntity responseEntity, Boolean bool, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = responseEntity.isTips;
            }
            if ((i11 & 2) != 0) {
                str = responseEntity.tips;
            }
            return responseEntity.copy(bool, str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsTips() {
            return this.isTips;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTips() {
            return this.tips;
        }

        @NotNull
        public final ResponseEntity copy(@Nullable Boolean isTips, @Nullable String tips) {
            return new ResponseEntity(isTips, tips);
        }

        @Nullable
        public final String getTips() {
            return this.tips;
        }

        public int hashCode() {
            Boolean bool = this.isTips;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.tips;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Nullable
        public final Boolean isTips() {
            return this.isTips;
        }

        @NotNull
        public String toString() {
            return "ResponseEntity(isTips=" + this.isTips + ", tips=" + this.tips + ')';
        }

        public ResponseEntity(@Nullable Boolean bool, @Nullable String str) {
            this.isTips = bool;
            this.tips = str;
        }
    }
}
