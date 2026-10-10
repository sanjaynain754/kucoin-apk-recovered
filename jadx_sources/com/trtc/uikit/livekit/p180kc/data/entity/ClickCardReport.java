package com.trtc.uikit.livekit.p180kc.data.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClickCardReport.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport;", "", "<init>", "()V", "Request", "ReportData", "Response", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ClickCardReport {

    /* JADX INFO: compiled from: ClickCardReport.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$ReportData;", "", "symbol", "", "cardType", "businessId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getCardType", "getBusinessId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ReportData {

        @NotNull
        public static final String CARD_TYPE_FUTURE = "future";

        @SerializedName("businessId")
        @Nullable
        private final String businessId;

        @SerializedName("cardType")
        @Nullable
        private final String cardType;

        @SerializedName("symbol")
        @Nullable
        private final String symbol;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReportData)) {
                return false;
            }
            ReportData reportData = (ReportData) other;
            return Intrinsics.areEqual(this.symbol, reportData.symbol) && Intrinsics.areEqual(this.cardType, reportData.cardType) && Intrinsics.areEqual(this.businessId, reportData.businessId);
        }

        public static /* synthetic */ ReportData copy$default(ReportData reportData, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = reportData.symbol;
            }
            if ((i11 & 2) != 0) {
                str2 = reportData.cardType;
            }
            if ((i11 & 4) != 0) {
                str3 = reportData.businessId;
            }
            return reportData.copy(str, str2, str3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCardType() {
            return this.cardType;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getBusinessId() {
            return this.businessId;
        }

        @NotNull
        public final ReportData copy(@Nullable String symbol, @Nullable String cardType, @Nullable String businessId) {
            return new ReportData(symbol, cardType, businessId);
        }

        @Nullable
        public final String getBusinessId() {
            return this.businessId;
        }

        @Nullable
        public final String getCardType() {
            return this.cardType;
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            String str = this.symbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cardType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.businessId;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ReportData(symbol=" + this.symbol + ", cardType=" + this.cardType + ", businessId=" + this.businessId + ')';
        }

        public ReportData(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.symbol = str;
            this.cardType = str2;
            this.businessId = str3;
        }
    }

    /* JADX INFO: compiled from: ClickCardReport.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$Request;", "", "userId", "", "roomId", "reportType", "reportData", "Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$ReportData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$ReportData;)V", "getUserId", "()Ljava/lang/String;", "getRoomId", "getReportType", "getReportData", "()Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$ReportData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @NotNull
        public static final String REPORT_TYPE_CLICK_CARD = "clickCard";

        @SerializedName("reportData")
        @Nullable
        private final ReportData reportData;

        @SerializedName("reportType")
        @Nullable
        private final String reportType;

        @SerializedName("roomId")
        @Nullable
        private final String roomId;

        @SerializedName("userId")
        @Nullable
        private final String userId;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.userId, request.userId) && Intrinsics.areEqual(this.roomId, request.roomId) && Intrinsics.areEqual(this.reportType, request.reportType) && Intrinsics.areEqual(this.reportData, request.reportData);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, ReportData reportData, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.userId;
            }
            if ((i11 & 2) != 0) {
                str2 = request.roomId;
            }
            if ((i11 & 4) != 0) {
                str3 = request.reportType;
            }
            if ((i11 & 8) != 0) {
                reportData = request.reportData;
            }
            return request.copy(str, str2, str3, reportData);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRoomId() {
            return this.roomId;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getReportType() {
            return this.reportType;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final ReportData getReportData() {
            return this.reportData;
        }

        @NotNull
        public final Request copy(@Nullable String userId, @Nullable String roomId, @Nullable String reportType, @Nullable ReportData reportData) {
            return new Request(userId, roomId, reportType, reportData);
        }

        @Nullable
        public final ReportData getReportData() {
            return this.reportData;
        }

        @Nullable
        public final String getReportType() {
            return this.reportType;
        }

        @Nullable
        public final String getRoomId() {
            return this.roomId;
        }

        @Nullable
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            String str = this.userId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.roomId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.reportType;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ReportData reportData = this.reportData;
            return iHashCode3 + (reportData != null ? reportData.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(userId=" + this.userId + ", roomId=" + this.roomId + ", reportType=" + this.reportType + ", reportData=" + this.reportData + ')';
        }

        public Request(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ReportData reportData) {
            this.userId = str;
            this.roomId = str2;
            this.reportType = str3;
            this.reportData = reportData;
        }
    }

    /* JADX INFO: compiled from: ClickCardReport.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$Response;", "", "eventId", "", "<init>", "(Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName("eventId")
        @Nullable
        private final String eventId;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Response) && Intrinsics.areEqual(this.eventId, ((Response) other).eventId);
        }

        public static /* synthetic */ Response copy$default(Response response, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.eventId;
            }
            return response.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        @NotNull
        public final Response copy(@Nullable String eventId) {
            return new Response(eventId);
        }

        @Nullable
        public final String getEventId() {
            return this.eventId;
        }

        public int hashCode() {
            String str = this.eventId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "Response(eventId=" + this.eventId + ')';
        }

        public Response(@Nullable String str) {
            this.eventId = str;
        }
    }
}
