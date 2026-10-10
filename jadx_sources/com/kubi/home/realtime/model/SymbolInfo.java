package com.kubi.home.realtime.model;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.MediaPeriodQueue;
import com.kubi.home.R$color;
import com.kubi.home.R$string;
import com.kubi.home.realtime.IRealTimeData;
import com.kubi.home.realtime.RealTimeViewType;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.utils.C27017c;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SymbolInfo.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010&\u001a\u00020'H\u0002J\u0006\u0010(\u001a\u00020'J(\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017Jn\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020#2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020/HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b\"\u0010$R\u0011\u0010%\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b%\u0010$¨\u0006@"}, m90084d2 = {"Lcom/kubi/home/realtime/model/SymbolInfo;", "Lcom/kubi/home/realtime/IRealTimeData;", "crypto", "", "quoteCrypto", "symbol", "displayCrypto", "displayQuoteCrypto", "displaySymbol", TUIConstants.TUIChat.INPUT_MORE_ICON, "openAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getCrypto", "()Ljava/lang/String;", "getQuoteCrypto", "getSymbol", "getDisplayCrypto", "getDisplayQuoteCrypto", "getDisplaySymbol", "getIcon", "getOpenAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "businessId", "getBusinessId", "viewType", "Lcom/kubi/home/realtime/RealTimeViewType;", "getViewType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "remainingTime", "getRemainingTime", "()J", "isOpened", "", "()Z", "isOpenedOverOneHour", "getFormattedRemainingTime", "", "getStatusText", "setSpan", "", "spannable", "Landroid/text/SpannableString;", "text", SpellCheckPlugin.START_INDEX_KEY, "", "color", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/home/realtime/model/SymbolInfo;", "equals", "other", "", "hashCode", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SymbolInfo extends IRealTimeData {

    @Nullable
    private final String crypto;

    @Nullable
    private final String displayCrypto;

    @Nullable
    private final String displayQuoteCrypto;

    @Nullable
    private final String displaySymbol;

    @Nullable
    private final String icon;

    @Nullable
    private final Long openAt;

    @Nullable
    private final String quoteCrypto;

    @Nullable
    private final String symbol;

    @NotNull
    private final RealTimeViewType viewType;

    public SymbolInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymbolInfo)) {
            return false;
        }
        SymbolInfo symbolInfo = (SymbolInfo) other;
        return Intrinsics.areEqual(this.crypto, symbolInfo.crypto) && Intrinsics.areEqual(this.quoteCrypto, symbolInfo.quoteCrypto) && Intrinsics.areEqual(this.symbol, symbolInfo.symbol) && Intrinsics.areEqual(this.displayCrypto, symbolInfo.displayCrypto) && Intrinsics.areEqual(this.displayQuoteCrypto, symbolInfo.displayQuoteCrypto) && Intrinsics.areEqual(this.displaySymbol, symbolInfo.displaySymbol) && Intrinsics.areEqual(this.icon, symbolInfo.icon) && Intrinsics.areEqual(this.openAt, symbolInfo.openAt);
    }

    public /* synthetic */ SymbolInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : l11);
    }

    public static /* synthetic */ SymbolInfo copy$default(SymbolInfo symbolInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = symbolInfo.crypto;
        }
        if ((i11 & 2) != 0) {
            str2 = symbolInfo.quoteCrypto;
        }
        if ((i11 & 4) != 0) {
            str3 = symbolInfo.symbol;
        }
        if ((i11 & 8) != 0) {
            str4 = symbolInfo.displayCrypto;
        }
        if ((i11 & 16) != 0) {
            str5 = symbolInfo.displayQuoteCrypto;
        }
        if ((i11 & 32) != 0) {
            str6 = symbolInfo.displaySymbol;
        }
        if ((i11 & 64) != 0) {
            str7 = symbolInfo.icon;
        }
        if ((i11 & 128) != 0) {
            l11 = symbolInfo.openAt;
        }
        String str8 = str7;
        Long l12 = l11;
        String str9 = str5;
        String str10 = str6;
        return symbolInfo.copy(str, str2, str3, str4, str9, str10, str8, l12);
    }

    private final long getRemainingTime() {
        Long l11 = this.openAt;
        long jLongValue = l11 != null ? l11.longValue() : 0L;
        if (jLongValue < MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US) {
            jLongValue *= (long) 1000;
        }
        return jLongValue - System.currentTimeMillis();
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCrypto() {
        return this.crypto;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuoteCrypto() {
        return this.quoteCrypto;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplayCrypto() {
        return this.displayCrypto;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDisplayQuoteCrypto() {
        return this.displayQuoteCrypto;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDisplaySymbol() {
        return this.displaySymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getOpenAt() {
        return this.openAt;
    }

    @NotNull
    public final SymbolInfo copy(@Nullable String crypto, @Nullable String quoteCrypto, @Nullable String symbol, @Nullable String displayCrypto, @Nullable String displayQuoteCrypto, @Nullable String displaySymbol, @Nullable String icon, @Nullable Long openAt) {
        return new SymbolInfo(crypto, quoteCrypto, symbol, displayCrypto, displayQuoteCrypto, displaySymbol, icon, openAt);
    }

    @Override // com.kubi.home.realtime.IRealTimeData
    @NotNull
    public String getBusinessId() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("new_coin_");
        String str = this.crypto;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append('_');
        String str2 = this.symbol;
        sb2.append(str2 != null ? str2 : "");
        return sb2.toString();
    }

    @Nullable
    public final String getCrypto() {
        return this.crypto;
    }

    @Nullable
    public final String getDisplayCrypto() {
        return this.displayCrypto;
    }

    @Nullable
    public final String getDisplayQuoteCrypto() {
        return this.displayQuoteCrypto;
    }

    @Nullable
    public final String getDisplaySymbol() {
        return this.displaySymbol;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final Long getOpenAt() {
        return this.openAt;
    }

    @Nullable
    public final String getQuoteCrypto() {
        return this.quoteCrypto;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Override // com.kubi.home.realtime.IRealTimeData
    @NotNull
    public RealTimeViewType getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        String str = this.crypto;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.quoteCrypto;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayCrypto;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displayQuoteCrypto;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displaySymbol;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.icon;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l11 = this.openAt;
        return iHashCode7 + (l11 != null ? l11.hashCode() : 0);
    }

    public final boolean isOpenedOverOneHour() {
        Long l11 = this.openAt;
        long jLongValue = l11 != null ? l11.longValue() : 0L;
        if (jLongValue < MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US) {
            jLongValue *= (long) 1000;
        }
        return isOpened() && System.currentTimeMillis() - jLongValue >= FundingRateEntity.MILLIS_PER_HOUR;
    }

    @NotNull
    public String toString() {
        return "SymbolInfo(crypto=" + this.crypto + ", quoteCrypto=" + this.quoteCrypto + ", symbol=" + this.symbol + ", displayCrypto=" + this.displayCrypto + ", displayQuoteCrypto=" + this.displayQuoteCrypto + ", displaySymbol=" + this.displaySymbol + ", icon=" + this.icon + ", openAt=" + this.openAt + ')';
    }

    public SymbolInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Long l11) {
        this.crypto = str;
        this.quoteCrypto = str2;
        this.symbol = str3;
        this.displayCrypto = str4;
        this.displayQuoteCrypto = str5;
        this.displaySymbol = str6;
        this.icon = str7;
        this.openAt = l11;
        this.viewType = RealTimeViewType.NEW_COIN;
    }

    private final CharSequence getFormattedRemainingTime() {
        long remainingTime = getRemainingTime();
        if (remainingTime <= 0) {
            return C27017c.f54310a.m66516f(R$string.home_status_listed, new Object[0]);
        }
        int i11 = (int) (remainingTime / ((long) 1000));
        String strPadStart = StringsKt.padStart(String.valueOf(i11 / 3600), 2, '0');
        String strPadStart2 = StringsKt.padStart(String.valueOf((i11 % 3600) / 60), 2, '0');
        String strPadStart3 = StringsKt.padStart(String.valueOf(i11 % 60), 2, '0');
        C27017c c27017c = C27017c.f54310a;
        String strM66516f = c27017c.m66516f(R$string.home_countdown_start_in, strPadStart, strPadStart2, strPadStart3);
        List list = SequencesKt.toList(Regex.findAll$default(new Regex("\\d{2}"), strM66516f, 0, 2, null));
        SpannableString spannableString = new SpannableString(strM66516f);
        int iM66512a = c27017c.m66512a(R$color.c_text);
        if (list.size() >= 3) {
            setSpan(spannableString, ((MatchResult) list.get(0)).getValue(), ((MatchResult) list.get(0)).getRange().getFirst(), iM66512a);
            setSpan(spannableString, ((MatchResult) list.get(1)).getValue(), ((MatchResult) list.get(1)).getRange().getFirst(), iM66512a);
            setSpan(spannableString, ((MatchResult) list.get(2)).getValue(), ((MatchResult) list.get(2)).getRange().getFirst(), iM66512a);
        }
        return spannableString;
    }

    private final void setSpan(SpannableString spannable, String text, int startIndex, int color) {
        spannable.setSpan(new ForegroundColorSpan(color), startIndex, text.length() + startIndex, 33);
    }

    @NotNull
    public final CharSequence getStatusText() {
        if (isOpened()) {
            return C27017c.f54310a.m66516f(R$string.home_status_listed, new Object[0]);
        }
        return getFormattedRemainingTime();
    }

    public final boolean isOpened() {
        if (getRemainingTime() <= 0) {
            return true;
        }
        return false;
    }
}
