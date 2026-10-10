package com.kubi.margin.api.entity;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Constants;
import com.kubi.margin.api.R$color;
import com.kubi.margin.api.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import gf.C37886j;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginBonusConfig.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010&\u001a\u00020\u0006J\u0006\u0010'\u001a\u00020(J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001fJª\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u00107J\u0006\u00108\u001a\u000209J\u0013\u0010:\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u000209HÖ\u0001J\t\u0010>\u001a\u00020\nHÖ\u0001J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000209R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0005\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0007\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b#\u0010\u0018R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b$\u0010\u0018R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010 \u001a\u0004\b%\u0010\u001f¨\u0006D"}, m90084d2 = {"Lcom/kubi/margin/api/entity/MarginBonusConfig;", "Landroid/os/Parcelable;", "cumulativeAmountBTC", "Ljava/math/BigDecimal;", "cumulativeAmountUSDT", Constants.ENABLE_DISABLE, "", "isUnReceive", "lastUnReceiveAmount", "lastUnReceiveCurrency", "", "lastUnReceiveId", "lastUnReceiveUpdatedAt", "", "positionTag", "positionType", "showIcon", "showNotReceiveTips", "updatedAt", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;)V", "getCumulativeAmountBTC", "()Ljava/math/BigDecimal;", "getCumulativeAmountUSDT", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastUnReceiveAmount", "getLastUnReceiveCurrency", "()Ljava/lang/String;", "getLastUnReceiveId", "getLastUnReceiveUpdatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPositionTag", "getPositionType", "getShowIcon", "getShowNotReceiveTips", "getUpdatedAt", "isIsolated", "getTitle", "Landroid/text/SpannableStringBuilder;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/kubi/margin/api/entity/MarginBonusConfig;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCParcelableCheck"})
public final /* data */ class MarginBonusConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarginBonusConfig> CREATOR = new C17484a();

    @Nullable
    private final BigDecimal cumulativeAmountBTC;

    @Nullable
    private final BigDecimal cumulativeAmountUSDT;

    @Nullable
    private final Boolean isEnabled;

    @Nullable
    private final Boolean isUnReceive;

    @Nullable
    private final BigDecimal lastUnReceiveAmount;

    @Nullable
    private final String lastUnReceiveCurrency;

    @Nullable
    private final String lastUnReceiveId;

    @Nullable
    private final Long lastUnReceiveUpdatedAt;

    @Nullable
    private final String positionTag;

    @Nullable
    private final String positionType;

    @Nullable
    private final Boolean showIcon;

    @Nullable
    private final Boolean showNotReceiveTips;

    @Nullable
    private final Long updatedAt;

    /* JADX INFO: renamed from: com.kubi.margin.api.entity.MarginBonusConfig$a */
    /* JADX INFO: compiled from: MarginBonusConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17484a implements Parcelable.Creator<MarginBonusConfig> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarginBonusConfig createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Long lValueOf;
            Boolean bool;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean bool2;
            Long lValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            Boolean bool3 = boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                bool = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                bool = null;
            }
            String string3 = parcel.readString();
            Long l11 = lValueOf;
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = bool;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = bool;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                Boolean bool4 = boolValueOf3;
                lValueOf2 = bool;
                bool2 = bool4;
            } else {
                bool2 = boolValueOf3;
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            return new MarginBonusConfig(bigDecimal, bigDecimal2, boolValueOf, bool3, bigDecimal3, string, string2, l11, string3, string4, bool2, boolValueOf4, lValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarginBonusConfig[] newArray(int i11) {
            return new MarginBonusConfig[i11];
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.api.entity.MarginBonusConfig$b */
    /* JADX INFO: compiled from: MarginBonusConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/margin/api/entity/MarginBonusConfig$getTitle$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17485b extends ClickableSpan {
        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(C27017c.f54310a.m66512a(R$color.primary));
            ds2.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.api.entity.MarginBonusConfig$c */
    /* JADX INFO: compiled from: MarginBonusConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/margin/api/entity/MarginBonusConfig$getTitle$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17486c extends ClickableSpan {
        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(C27017c.f54310a.m66512a(R$color.primary));
            ds2.setUnderlineText(false);
        }
    }

    public MarginBonusConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ MarginBonusConfig copy$default(MarginBonusConfig marginBonusConfig, BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool, Boolean bool2, BigDecimal bigDecimal3, String str, String str2, Long l11, String str3, String str4, Boolean bool3, Boolean bool4, Long l12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = marginBonusConfig.cumulativeAmountBTC;
        }
        return marginBonusConfig.copy(bigDecimal, (i11 & 2) != 0 ? marginBonusConfig.cumulativeAmountUSDT : bigDecimal2, (i11 & 4) != 0 ? marginBonusConfig.isEnabled : bool, (i11 & 8) != 0 ? marginBonusConfig.isUnReceive : bool2, (i11 & 16) != 0 ? marginBonusConfig.lastUnReceiveAmount : bigDecimal3, (i11 & 32) != 0 ? marginBonusConfig.lastUnReceiveCurrency : str, (i11 & 64) != 0 ? marginBonusConfig.lastUnReceiveId : str2, (i11 & 128) != 0 ? marginBonusConfig.lastUnReceiveUpdatedAt : l11, (i11 & 256) != 0 ? marginBonusConfig.positionTag : str3, (i11 & 512) != 0 ? marginBonusConfig.positionType : str4, (i11 & 1024) != 0 ? marginBonusConfig.showIcon : bool3, (i11 & 2048) != 0 ? marginBonusConfig.showNotReceiveTips : bool4, (i11 & 4096) != 0 ? marginBonusConfig.updatedAt : l12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginBonusConfig)) {
            return false;
        }
        MarginBonusConfig marginBonusConfig = (MarginBonusConfig) other;
        return Intrinsics.areEqual(this.cumulativeAmountBTC, marginBonusConfig.cumulativeAmountBTC) && Intrinsics.areEqual(this.cumulativeAmountUSDT, marginBonusConfig.cumulativeAmountUSDT) && Intrinsics.areEqual(this.isEnabled, marginBonusConfig.isEnabled) && Intrinsics.areEqual(this.isUnReceive, marginBonusConfig.isUnReceive) && Intrinsics.areEqual(this.lastUnReceiveAmount, marginBonusConfig.lastUnReceiveAmount) && Intrinsics.areEqual(this.lastUnReceiveCurrency, marginBonusConfig.lastUnReceiveCurrency) && Intrinsics.areEqual(this.lastUnReceiveId, marginBonusConfig.lastUnReceiveId) && Intrinsics.areEqual(this.lastUnReceiveUpdatedAt, marginBonusConfig.lastUnReceiveUpdatedAt) && Intrinsics.areEqual(this.positionTag, marginBonusConfig.positionTag) && Intrinsics.areEqual(this.positionType, marginBonusConfig.positionType) && Intrinsics.areEqual(this.showIcon, marginBonusConfig.showIcon) && Intrinsics.areEqual(this.showNotReceiveTips, marginBonusConfig.showNotReceiveTips) && Intrinsics.areEqual(this.updatedAt, marginBonusConfig.updatedAt);
    }

    public MarginBonusConfig(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable BigDecimal bigDecimal3, @Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Long l12) {
        this.cumulativeAmountBTC = bigDecimal;
        this.cumulativeAmountUSDT = bigDecimal2;
        this.isEnabled = bool;
        this.isUnReceive = bool2;
        this.lastUnReceiveAmount = bigDecimal3;
        this.lastUnReceiveCurrency = str;
        this.lastUnReceiveId = str2;
        this.lastUnReceiveUpdatedAt = l11;
        this.positionTag = str3;
        this.positionType = str4;
        this.showIcon = bool3;
        this.showNotReceiveTips = bool4;
        this.updatedAt = l12;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getCumulativeAmountBTC() {
        return this.cumulativeAmountBTC;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPositionType() {
        return this.positionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getShowIcon() {
        return this.showIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getShowNotReceiveTips() {
        return this.showNotReceiveTips;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getCumulativeAmountUSDT() {
        return this.cumulativeAmountUSDT;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsUnReceive() {
        return this.isUnReceive;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getLastUnReceiveAmount() {
        return this.lastUnReceiveAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLastUnReceiveCurrency() {
        return this.lastUnReceiveCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLastUnReceiveId() {
        return this.lastUnReceiveId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getLastUnReceiveUpdatedAt() {
        return this.lastUnReceiveUpdatedAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPositionTag() {
        return this.positionTag;
    }

    @NotNull
    public final MarginBonusConfig copy(@Nullable BigDecimal cumulativeAmountBTC, @Nullable BigDecimal cumulativeAmountUSDT, @Nullable Boolean isEnabled, @Nullable Boolean isUnReceive, @Nullable BigDecimal lastUnReceiveAmount, @Nullable String lastUnReceiveCurrency, @Nullable String lastUnReceiveId, @Nullable Long lastUnReceiveUpdatedAt, @Nullable String positionTag, @Nullable String positionType, @Nullable Boolean showIcon, @Nullable Boolean showNotReceiveTips, @Nullable Long updatedAt) {
        return new MarginBonusConfig(cumulativeAmountBTC, cumulativeAmountUSDT, isEnabled, isUnReceive, lastUnReceiveAmount, lastUnReceiveCurrency, lastUnReceiveId, lastUnReceiveUpdatedAt, positionTag, positionType, showIcon, showNotReceiveTips, updatedAt);
    }

    @Nullable
    public final BigDecimal getCumulativeAmountBTC() {
        return this.cumulativeAmountBTC;
    }

    @Nullable
    public final BigDecimal getCumulativeAmountUSDT() {
        return this.cumulativeAmountUSDT;
    }

    @Nullable
    public final BigDecimal getLastUnReceiveAmount() {
        return this.lastUnReceiveAmount;
    }

    @Nullable
    public final String getLastUnReceiveCurrency() {
        return this.lastUnReceiveCurrency;
    }

    @Nullable
    public final String getLastUnReceiveId() {
        return this.lastUnReceiveId;
    }

    @Nullable
    public final Long getLastUnReceiveUpdatedAt() {
        return this.lastUnReceiveUpdatedAt;
    }

    @Nullable
    public final String getPositionTag() {
        return this.positionTag;
    }

    @Nullable
    public final String getPositionType() {
        return this.positionType;
    }

    @Nullable
    public final Boolean getShowIcon() {
        return this.showIcon;
    }

    @Nullable
    public final Boolean getShowNotReceiveTips() {
        return this.showNotReceiveTips;
    }

    @NotNull
    public final SpannableStringBuilder getTitle() {
        if (isIsolated()) {
            C27017c c27017c = C27017c.f54310a;
            int i11 = R$string.margin_isolated_unclaimed_bonus;
            StringBuilder sb2 = new StringBuilder();
            BigDecimal bigDecimal = this.lastUnReceiveAmount;
            sb2.append(bigDecimal != null ? C37886j.m85578b(bigDecimal, this.lastUnReceiveCurrency, null, false, false, false, 0, null, 0, 254, null) : null);
            sb2.append(this.lastUnReceiveCurrency);
            String strM66516f = c27017c.m66516f(i11, sb2.toString(), "");
            StringBuilder sb3 = new StringBuilder();
            BigDecimal bigDecimal2 = this.lastUnReceiveAmount;
            sb3.append(bigDecimal2 != null ? C37886j.m85578b(bigDecimal2, this.lastUnReceiveCurrency, null, false, false, false, 0, null, 0, 254, null) : null);
            sb3.append(this.lastUnReceiveCurrency);
            return C27046k.m66706u(strM66516f, sb3.toString(), new C17485b(), null, 4, null);
        }
        C27017c c27017c2 = C27017c.f54310a;
        int i12 = R$string.margin_cross_unclaimed_bonus;
        StringBuilder sb4 = new StringBuilder();
        BigDecimal bigDecimal3 = this.lastUnReceiveAmount;
        sb4.append(bigDecimal3 != null ? C37886j.m85578b(bigDecimal3, this.lastUnReceiveCurrency, null, false, false, false, 0, null, 0, 254, null) : null);
        sb4.append(this.lastUnReceiveCurrency);
        String strM66516f2 = c27017c2.m66516f(i12, sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        BigDecimal bigDecimal4 = this.lastUnReceiveAmount;
        sb5.append(bigDecimal4 != null ? C37886j.m85578b(bigDecimal4, this.lastUnReceiveCurrency, null, false, false, false, 0, null, 0, 254, null) : null);
        sb5.append(this.lastUnReceiveCurrency);
        return C27046k.m66706u(strM66516f2, sb5.toString(), new C17486c(), null, 4, null);
    }

    @Nullable
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.cumulativeAmountBTC;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.cumulativeAmountUSDT;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isUnReceive;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.lastUnReceiveAmount;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str = this.lastUnReceiveCurrency;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastUnReceiveId;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.lastUnReceiveUpdatedAt;
        int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.positionTag;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.positionType;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.showIcon;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.showNotReceiveTips;
        int iHashCode12 = (iHashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l12 = this.updatedAt;
        return iHashCode12 + (l12 != null ? l12.hashCode() : 0);
    }

    @Nullable
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isIsolated() {
        return Intrinsics.areEqual(this.positionType, SharedPositionInfo.MARGIN_MODE_ISOLATED);
    }

    @Nullable
    public final Boolean isUnReceive() {
        return this.isUnReceive;
    }

    @NotNull
    public String toString() {
        return "MarginBonusConfig(cumulativeAmountBTC=" + this.cumulativeAmountBTC + ", cumulativeAmountUSDT=" + this.cumulativeAmountUSDT + ", isEnabled=" + this.isEnabled + ", isUnReceive=" + this.isUnReceive + ", lastUnReceiveAmount=" + this.lastUnReceiveAmount + ", lastUnReceiveCurrency=" + this.lastUnReceiveCurrency + ", lastUnReceiveId=" + this.lastUnReceiveId + ", lastUnReceiveUpdatedAt=" + this.lastUnReceiveUpdatedAt + ", positionTag=" + this.positionTag + ", positionType=" + this.positionType + ", showIcon=" + this.showIcon + ", showNotReceiveTips=" + this.showNotReceiveTips + ", updatedAt=" + this.updatedAt + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.cumulativeAmountBTC);
        dest.writeSerializable(this.cumulativeAmountUSDT);
        Boolean bool = this.isEnabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isUnReceive;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeSerializable(this.lastUnReceiveAmount);
        dest.writeString(this.lastUnReceiveCurrency);
        dest.writeString(this.lastUnReceiveId);
        Long l11 = this.lastUnReceiveUpdatedAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.positionTag);
        dest.writeString(this.positionType);
        Boolean bool3 = this.showIcon;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.showNotReceiveTips;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Long l12 = this.updatedAt;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
    }

    public /* synthetic */ MarginBonusConfig(BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool, Boolean bool2, BigDecimal bigDecimal3, String str, String str2, Long l11, String str3, String str4, Boolean bool3, Boolean bool4, Long l12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : bool2, (i11 & 16) != 0 ? null : bigDecimal3, (i11 & 32) != 0 ? null : str, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? null : l11, (i11 & 256) != 0 ? null : str3, (i11 & 512) != 0 ? null : str4, (i11 & 1024) != 0 ? null : bool3, (i11 & 2048) != 0 ? null : bool4, (i11 & 4096) != 0 ? null : l12);
    }
}
