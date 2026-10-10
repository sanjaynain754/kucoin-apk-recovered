package com.kubi.futures.trade.challenge;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: TradeProTrialState.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\u0084\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020#2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b\"\u0010$R\u0011\u0010%\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010'\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0011\u0010)\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b*\u0010$R\u0011\u0010+\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001f¨\u0006>"}, m90084d2 = {"Lcom/kubi/futures/trade/challenge/TradeProTrialState;", "", "campaignCode", "", "code", FirebaseAnalytics.Param.CURRENCY, "faceValue", "Ljava/math/BigDecimal;", "startTime", "", "endTime", "status", "title", "progressUrl", "requestSeq", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getCampaignCode", "()Ljava/lang/String;", "getCode", "getCurrency", "getFaceValue", "()Ljava/math/BigDecimal;", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTime", "getStatus", "getTitle", "getProgressUrl", "getRequestSeq", "()J", "challengeId", "getChallengeId", "isActive", "", "()Z", "showActivateButton", "getShowActivateButton", "showUseButton", "getShowUseButton", "showProgressButton", "getShowProgressButton", "countdownEndTimeMillis", "getCountdownEndTimeMillis", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/kubi/futures/trade/challenge/TradeProTrialState;", "equals", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeProTrialState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeProTrialState.kt\ncom/kubi/futures/trade/challenge/TradeProTrialState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1#2:256\n*E\n"})
public final /* data */ class TradeProTrialState {

    @Nullable
    private final String campaignCode;

    @Nullable
    private final String code;

    @Nullable
    private final String currency;

    @Nullable
    private final Long endTime;

    @Nullable
    private final BigDecimal faceValue;

    @Nullable
    private final String progressUrl;
    private final long requestSeq;

    @Nullable
    private final Long startTime;

    @Nullable
    private final String status;

    @Nullable
    private final String title;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeProTrialState)) {
            return false;
        }
        TradeProTrialState tradeProTrialState = (TradeProTrialState) other;
        return Intrinsics.areEqual(this.campaignCode, tradeProTrialState.campaignCode) && Intrinsics.areEqual(this.code, tradeProTrialState.code) && Intrinsics.areEqual(this.currency, tradeProTrialState.currency) && Intrinsics.areEqual(this.faceValue, tradeProTrialState.faceValue) && Intrinsics.areEqual(this.startTime, tradeProTrialState.startTime) && Intrinsics.areEqual(this.endTime, tradeProTrialState.endTime) && Intrinsics.areEqual(this.status, tradeProTrialState.status) && Intrinsics.areEqual(this.title, tradeProTrialState.title) && Intrinsics.areEqual(this.progressUrl, tradeProTrialState.progressUrl) && this.requestSeq == tradeProTrialState.requestSeq;
    }

    public static /* synthetic */ TradeProTrialState copy$default(TradeProTrialState tradeProTrialState, String str, String str2, String str3, BigDecimal bigDecimal, Long l11, Long l12, String str4, String str5, String str6, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tradeProTrialState.campaignCode;
        }
        if ((i11 & 2) != 0) {
            str2 = tradeProTrialState.code;
        }
        if ((i11 & 4) != 0) {
            str3 = tradeProTrialState.currency;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = tradeProTrialState.faceValue;
        }
        if ((i11 & 16) != 0) {
            l11 = tradeProTrialState.startTime;
        }
        if ((i11 & 32) != 0) {
            l12 = tradeProTrialState.endTime;
        }
        if ((i11 & 64) != 0) {
            str4 = tradeProTrialState.status;
        }
        if ((i11 & 128) != 0) {
            str5 = tradeProTrialState.title;
        }
        if ((i11 & 256) != 0) {
            str6 = tradeProTrialState.progressUrl;
        }
        if ((i11 & 512) != 0) {
            j11 = tradeProTrialState.requestSeq;
        }
        long j12 = j11;
        String str7 = str5;
        String str8 = str6;
        Long l13 = l12;
        String str9 = str4;
        Long l14 = l11;
        String str10 = str3;
        return tradeProTrialState.copy(str, str2, str10, bigDecimal, l14, l13, str9, str7, str8, j12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getRequestSeq() {
        return this.requestSeq;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getFaceValue() {
        return this.faceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getProgressUrl() {
        return this.progressUrl;
    }

    @NotNull
    public final TradeProTrialState copy(@Nullable String campaignCode, @Nullable String code, @Nullable String currency, @Nullable BigDecimal faceValue, @Nullable Long startTime, @Nullable Long endTime, @Nullable String status, @Nullable String title, @Nullable String progressUrl, long requestSeq) {
        return new TradeProTrialState(campaignCode, code, currency, faceValue, startTime, endTime, status, title, progressUrl, requestSeq);
    }

    @Nullable
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @NotNull
    public final String getChallengeId() {
        String strM66668h = C27041f.m66668h(this.campaignCode);
        return StringsKt.isBlank(strM66668h) ? C27041f.m66668h(this.code) : strM66668h;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    public final long getCountdownEndTimeMillis() {
        return C27039d.m66652l(this.endTime);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final BigDecimal getFaceValue() {
        return this.faceValue;
    }

    @Nullable
    public final String getProgressUrl() {
        return this.progressUrl;
    }

    public final long getRequestSeq() {
        return this.requestSeq;
    }

    public final boolean getShowActivateButton() {
        return Intrinsics.areEqual(this.status, "SEND_FINISHED");
    }

    public final boolean getShowUseButton() {
        return Intrinsics.areEqual(this.status, "ACTIVATE_FINISHED");
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.campaignCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.faceValue;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Long l11 = this.startTime;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.endTime;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str4 = this.status;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.progressUrl;
        return ((iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31) + Long.hashCode(this.requestSeq);
    }

    public final boolean isActive() {
        String str;
        return (C13713k.m26978a(this.status) || (str = this.code) == null || StringsKt.isBlank(str)) ? false : true;
    }

    @NotNull
    public String toString() {
        return "TradeProTrialState(campaignCode=" + this.campaignCode + ", code=" + this.code + ", currency=" + this.currency + ", faceValue=" + this.faceValue + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", status=" + this.status + ", title=" + this.title + ", progressUrl=" + this.progressUrl + ", requestSeq=" + this.requestSeq + ')';
    }

    public TradeProTrialState(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable Long l11, @Nullable Long l12, @Nullable String str4, @Nullable String str5, @Nullable String str6, long j11) {
        this.campaignCode = str;
        this.code = str2;
        this.currency = str3;
        this.faceValue = bigDecimal;
        this.startTime = l11;
        this.endTime = l12;
        this.status = str4;
        this.title = str5;
        this.progressUrl = str6;
        this.requestSeq = j11;
    }

    public final boolean getShowProgressButton() {
        if (!getShowActivateButton()) {
            if (Intrinsics.areEqual(this.status, "ACTIVATE_FINISHED") || Intrinsics.areEqual(this.status, "USE_FINISHED")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
