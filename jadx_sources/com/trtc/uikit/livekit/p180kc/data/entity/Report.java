package com.trtc.uikit.livekit.p180kc.data.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Report.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/Report;", "", "<init>", "()V", "Request", "Response", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Report {

    /* JADX INFO: compiled from: Report.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;", "", "roomId", "", "reportType", "reportData", "Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request$ReportData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request$ReportData;)V", "getRoomId", "()Ljava/lang/String;", "getReportType", "getReportData", "()Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request$ReportData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "ReportData", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @NotNull
        public static final String REPORT_TYPE_REPLAY = "enterReplay";

        @NotNull
        public static final String REPORT_TYPE_SHARE = "userUseInvitedLinkToRoom";

        @SerializedName("reportData")
        @Nullable
        private final ReportData reportData;

        @SerializedName("reportType")
        @Nullable
        private final String reportType;

        @SerializedName("roomId")
        @Nullable
        private final String roomId;

        /* JADX INFO: compiled from: Report.kt */
        @Keep
        @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request$ReportData;", "", "fromInviteOpenId", "", "replayAction", "eventId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFromInviteOpenId", "()Ljava/lang/String;", "getReplayAction", "getEventId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class ReportData {

            @NotNull
            public static final String REPLAY_ACTION_LEAVE = "leave";

            @SerializedName("eventId")
            @Nullable
            private final String eventId;

            @SerializedName("fromInviteOpenId")
            @Nullable
            private final String fromInviteOpenId;

            @SerializedName("replayAction")
            @Nullable
            private final String replayAction;

            public ReportData() {
                this(null, null, null, 7, null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReportData)) {
                    return false;
                }
                ReportData reportData = (ReportData) other;
                return Intrinsics.areEqual(this.fromInviteOpenId, reportData.fromInviteOpenId) && Intrinsics.areEqual(this.replayAction, reportData.replayAction) && Intrinsics.areEqual(this.eventId, reportData.eventId);
            }

            public ReportData(@Nullable String str, @Nullable String str2, @Nullable String str3) {
                this.fromInviteOpenId = str;
                this.replayAction = str2;
                this.eventId = str3;
            }

            public static /* synthetic */ ReportData copy$default(ReportData reportData, String str, String str2, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = reportData.fromInviteOpenId;
                }
                if ((i11 & 2) != 0) {
                    str2 = reportData.replayAction;
                }
                if ((i11 & 4) != 0) {
                    str3 = reportData.eventId;
                }
                return reportData.copy(str, str2, str3);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getFromInviteOpenId() {
                return this.fromInviteOpenId;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getReplayAction() {
                return this.replayAction;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getEventId() {
                return this.eventId;
            }

            @NotNull
            public final ReportData copy(@Nullable String fromInviteOpenId, @Nullable String replayAction, @Nullable String eventId) {
                return new ReportData(fromInviteOpenId, replayAction, eventId);
            }

            @Nullable
            public final String getEventId() {
                return this.eventId;
            }

            @Nullable
            public final String getFromInviteOpenId() {
                return this.fromInviteOpenId;
            }

            @Nullable
            public final String getReplayAction() {
                return this.replayAction;
            }

            public int hashCode() {
                String str = this.fromInviteOpenId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.replayAction;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.eventId;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "ReportData(fromInviteOpenId=" + this.fromInviteOpenId + ", replayAction=" + this.replayAction + ", eventId=" + this.eventId + ')';
            }

            public /* synthetic */ ReportData(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
            }
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.roomId, request.roomId) && Intrinsics.areEqual(this.reportType, request.reportType) && Intrinsics.areEqual(this.reportData, request.reportData);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, ReportData reportData, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.roomId;
            }
            if ((i11 & 2) != 0) {
                str2 = request.reportType;
            }
            if ((i11 & 4) != 0) {
                reportData = request.reportData;
            }
            return request.copy(str, str2, reportData);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRoomId() {
            return this.roomId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getReportType() {
            return this.reportType;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ReportData getReportData() {
            return this.reportData;
        }

        @NotNull
        public final Request copy(@Nullable String roomId, @Nullable String reportType, @Nullable ReportData reportData) {
            return new Request(roomId, reportType, reportData);
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

        public int hashCode() {
            String str = this.roomId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.reportType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ReportData reportData = this.reportData;
            return iHashCode2 + (reportData != null ? reportData.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(roomId=" + this.roomId + ", reportType=" + this.reportType + ", reportData=" + this.reportData + ')';
        }

        public Request(@Nullable String str, @Nullable String str2, @Nullable ReportData reportData) {
            this.roomId = str;
            this.reportType = str2;
            this.reportData = reportData;
        }
    }

    /* JADX INFO: compiled from: Report.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/Report$Response;", "", DbParams.KEY_CHANNEL_RESULT, "", "<init>", "(Ljava/lang/Boolean;)V", "getResult", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/trtc/uikit/livekit/kc/data/entity/Report$Response;", "equals", "other", "hashCode", "", "toString", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName(DbParams.KEY_CHANNEL_RESULT)
        @Nullable
        private final Boolean result;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Response) && Intrinsics.areEqual(this.result, ((Response) other).result);
        }

        public static /* synthetic */ Response copy$default(Response response, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = response.result;
            }
            return response.copy(bool);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getResult() {
            return this.result;
        }

        @NotNull
        public final Response copy(@Nullable Boolean result) {
            return new Response(result);
        }

        @Nullable
        public final Boolean getResult() {
            return this.result;
        }

        public int hashCode() {
            Boolean bool = this.result;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @NotNull
        public String toString() {
            return "Response(result=" + this.result + ')';
        }

        public Response(@Nullable Boolean bool) {
            this.result = bool;
        }
    }
}
