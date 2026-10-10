package com.kubi.assets.overview.ongoing.mapper;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.entity.FundsInfo;
import com.kubi.assets.entity.RiskViewEntity;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProductItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e2\u00020\u0001:\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0001\t\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;", "", "type", "", "title", "", "<init>", "(ILjava/lang/String;)V", "getType", "()I", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "Companion", "ContractItem", "IsolatedItem", "CrossItem", "FinancialItem", "RobotItem", "CopyTradingItem", "LeadTradingItem", "HeaderItem", "LoadMoreItem", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$ContractItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$CopyTradingItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$CrossItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$FinancialItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$HeaderItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$IsolatedItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$LeadTradingItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$LoadMoreItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$RobotItem;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class ProductItem {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f18434c = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final int f18435a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f18436b;

    /* JADX INFO: compiled from: ProductItem.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$Companion;", "", "<init>", "()V", "CONTRACT", "", SharedPositionInfo.MARGIN_MODE_ISOLATED, "CROSS", "ROBOT", "FINANCIAL", "HEADER", "LOAD_MORE", "COPY_TRADING", "LEAD_TRADING", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.mapper.ProductItem$a, reason: from toString */
    /* JADX INFO: compiled from: ProductItem.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0015HÆ\u0003J¸\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00122\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0015HÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010(\u001a\u0004\b\u0011\u0010'R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006C"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$ContractItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;", "iconUrl", "", "side", "", "positionText", "unPnl", "roi", "formatMarginMode", "leverage", "formatSymbol", "symbol", "secondText", "secondValue", "markPrice", "marginMode", "isTrial", "", "prizeType", "background", "", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;I)V", "getIconUrl", "()Ljava/lang/String;", "getSide", "()Ljava/lang/CharSequence;", "getPositionText", "getUnPnl", "getRoi", "getFormatMarginMode", "getLeverage", "getFormatSymbol", "getSymbol", "getSecondText", "getSecondValue", "getMarkPrice", "getMarginMode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPrizeType", "getBackground", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;I)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$ContractItem;", "equals", "other", "", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ContractItem extends ProductItem {

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final String iconUrl;

        /* JADX INFO: renamed from: e, reason: from toString */
        @NotNull
        public final CharSequence side;

        /* JADX INFO: renamed from: f, reason: from toString */
        @NotNull
        public final String positionText;

        /* JADX INFO: renamed from: g, reason: from toString */
        @NotNull
        public final String unPnl;

        /* JADX INFO: renamed from: h, reason: from toString */
        @NotNull
        public final String roi;

        /* JADX INFO: renamed from: i, reason: from toString */
        @NotNull
        public final String formatMarginMode;

        /* JADX INFO: renamed from: j, reason: from toString */
        @NotNull
        public final String leverage;

        /* JADX INFO: renamed from: k, reason: from toString */
        @NotNull
        public final CharSequence formatSymbol;

        /* JADX INFO: renamed from: l, reason: from toString */
        @Nullable
        public final String symbol;

        /* JADX INFO: renamed from: m, reason: from toString */
        @NotNull
        public final String secondText;

        /* JADX INFO: renamed from: n, reason: from toString */
        @NotNull
        public final String secondValue;

        /* JADX INFO: renamed from: o, reason: from toString */
        @NotNull
        public final String markPrice;

        /* JADX INFO: renamed from: p, reason: from toString */
        @Nullable
        public final String marginMode;

        /* JADX INFO: renamed from: q, reason: from toString */
        @Nullable
        public final Boolean isTrial;

        /* JADX INFO: renamed from: r, reason: from toString */
        @Nullable
        public final String prizeType;

        /* JADX INFO: renamed from: s, reason: from toString */
        public final int background;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ContractItem(@Nullable String str, @NotNull CharSequence side, @NotNull String positionText, @NotNull String unPnl, @NotNull String roi, @NotNull String formatMarginMode, @NotNull String leverage, @NotNull CharSequence formatSymbol, @Nullable String str2, @NotNull String secondText, @NotNull String secondValue, @NotNull String markPrice, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, int i11) {
            super(1, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(positionText, "positionText");
            Intrinsics.checkNotNullParameter(unPnl, "unPnl");
            Intrinsics.checkNotNullParameter(roi, "roi");
            Intrinsics.checkNotNullParameter(formatMarginMode, "formatMarginMode");
            Intrinsics.checkNotNullParameter(leverage, "leverage");
            Intrinsics.checkNotNullParameter(formatSymbol, "formatSymbol");
            Intrinsics.checkNotNullParameter(secondText, "secondText");
            Intrinsics.checkNotNullParameter(secondValue, "secondValue");
            Intrinsics.checkNotNullParameter(markPrice, "markPrice");
            this.iconUrl = str;
            this.side = side;
            this.positionText = positionText;
            this.unPnl = unPnl;
            this.roi = roi;
            this.formatMarginMode = formatMarginMode;
            this.leverage = leverage;
            this.formatSymbol = formatSymbol;
            this.symbol = str2;
            this.secondText = secondText;
            this.secondValue = secondValue;
            this.markPrice = markPrice;
            this.marginMode = str3;
            this.isTrial = bool;
            this.prizeType = str4;
            this.background = i11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContractItem)) {
                return false;
            }
            ContractItem contractItem = (ContractItem) other;
            return Intrinsics.areEqual(this.iconUrl, contractItem.iconUrl) && Intrinsics.areEqual(this.side, contractItem.side) && Intrinsics.areEqual(this.positionText, contractItem.positionText) && Intrinsics.areEqual(this.unPnl, contractItem.unPnl) && Intrinsics.areEqual(this.roi, contractItem.roi) && Intrinsics.areEqual(this.formatMarginMode, contractItem.formatMarginMode) && Intrinsics.areEqual(this.leverage, contractItem.leverage) && Intrinsics.areEqual(this.formatSymbol, contractItem.formatSymbol) && Intrinsics.areEqual(this.symbol, contractItem.symbol) && Intrinsics.areEqual(this.secondText, contractItem.secondText) && Intrinsics.areEqual(this.secondValue, contractItem.secondValue) && Intrinsics.areEqual(this.markPrice, contractItem.markPrice) && Intrinsics.areEqual(this.marginMode, contractItem.marginMode) && Intrinsics.areEqual(this.isTrial, contractItem.isTrial) && Intrinsics.areEqual(this.prizeType, contractItem.prizeType) && this.background == contractItem.background;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getBackground() {
            return this.background;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getFormatMarginMode() {
            return this.formatMarginMode;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final CharSequence getFormatSymbol() {
            return this.formatSymbol;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getLeverage() {
            return this.leverage;
        }

        public int hashCode() {
            String str = this.iconUrl;
            int iHashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.side.hashCode()) * 31) + this.positionText.hashCode()) * 31) + this.unPnl.hashCode()) * 31) + this.roi.hashCode()) * 31) + this.formatMarginMode.hashCode()) * 31) + this.leverage.hashCode()) * 31) + this.formatSymbol.hashCode()) * 31;
            String str2 = this.symbol;
            int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.secondText.hashCode()) * 31) + this.secondValue.hashCode()) * 31) + this.markPrice.hashCode()) * 31;
            String str3 = this.marginMode;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.isTrial;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str4 = this.prizeType;
            return ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.hashCode(this.background);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getMarginMode() {
            return this.marginMode;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getMarkPrice() {
            return this.markPrice;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getPositionText() {
            return this.positionText;
        }

        @Nullable
        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getPrizeType() {
            return this.prizeType;
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getRoi() {
            return this.roi;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getSecondText() {
            return this.secondText;
        }

        @NotNull
        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getSecondValue() {
            return this.secondValue;
        }

        @NotNull
        /* JADX INFO: renamed from: p, reason: from getter */
        public final CharSequence getSide() {
            return this.side;
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @NotNull
        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getUnPnl() {
            return this.unPnl;
        }

        @Nullable
        /* JADX INFO: renamed from: s, reason: from getter */
        public final Boolean getIsTrial() {
            return this.isTrial;
        }

        @NotNull
        public String toString() {
            return "ContractItem(iconUrl=" + this.iconUrl + ", side=" + ((Object) this.side) + ", positionText=" + this.positionText + ", unPnl=" + this.unPnl + ", roi=" + this.roi + ", formatMarginMode=" + this.formatMarginMode + ", leverage=" + this.leverage + ", formatSymbol=" + ((Object) this.formatSymbol) + ", symbol=" + this.symbol + ", secondText=" + this.secondText + ", secondValue=" + this.secondValue + ", markPrice=" + this.markPrice + ", marginMode=" + this.marginMode + ", isTrial=" + this.isTrial + ", prizeType=" + this.prizeType + ", background=" + this.background + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.mapper.ProductItem$b, reason: from toString */
    /* JADX INFO: compiled from: ProductItem.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003Jv\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u000eHÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$CopyTradingItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;", "leadConfigId", "", TUIConstantDefine.AVATAR_URL, "", "nickName", TypedValues.TransitionType.S_DURATION, "totalPnl", "totalPnlRatio", "pnlText", "copyAmountText", "copyAmount", "background", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getLeadConfigId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAvatarUrl", "()Ljava/lang/String;", "getNickName", "getDuration", "getTotalPnl", "getTotalPnlRatio", "getPnlText", "getCopyAmountText", "getCopyAmount", "getBackground", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$CopyTradingItem;", "equals", "", "other", "", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CopyTradingItem extends ProductItem {

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final Long leadConfigId;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final String avatarUrl;

        /* JADX INFO: renamed from: f, reason: from toString */
        @NotNull
        public final String nickName;

        /* JADX INFO: renamed from: g, reason: from toString */
        @NotNull
        public final String duration;

        /* JADX INFO: renamed from: h, reason: from toString */
        @NotNull
        public final String totalPnl;

        /* JADX INFO: renamed from: i, reason: from toString */
        @NotNull
        public final String totalPnlRatio;

        /* JADX INFO: renamed from: j, reason: from toString */
        @NotNull
        public final String pnlText;

        /* JADX INFO: renamed from: k, reason: from toString */
        @NotNull
        public final String copyAmountText;

        /* JADX INFO: renamed from: l, reason: from toString */
        @NotNull
        public final String copyAmount;

        /* JADX INFO: renamed from: m, reason: from toString */
        public final int background;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CopyTradingItem)) {
                return false;
            }
            CopyTradingItem copyTradingItem = (CopyTradingItem) other;
            return Intrinsics.areEqual(this.leadConfigId, copyTradingItem.leadConfigId) && Intrinsics.areEqual(this.avatarUrl, copyTradingItem.avatarUrl) && Intrinsics.areEqual(this.nickName, copyTradingItem.nickName) && Intrinsics.areEqual(this.duration, copyTradingItem.duration) && Intrinsics.areEqual(this.totalPnl, copyTradingItem.totalPnl) && Intrinsics.areEqual(this.totalPnlRatio, copyTradingItem.totalPnlRatio) && Intrinsics.areEqual(this.pnlText, copyTradingItem.pnlText) && Intrinsics.areEqual(this.copyAmountText, copyTradingItem.copyAmountText) && Intrinsics.areEqual(this.copyAmount, copyTradingItem.copyAmount) && this.background == copyTradingItem.background;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CopyTradingItem(@Nullable Long l11, @Nullable String str, @NotNull String nickName, @NotNull String duration, @NotNull String totalPnl, @NotNull String totalPnlRatio, @NotNull String pnlText, @NotNull String copyAmountText, @NotNull String copyAmount, int i11) {
            super(8, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(nickName, "nickName");
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(totalPnl, "totalPnl");
            Intrinsics.checkNotNullParameter(totalPnlRatio, "totalPnlRatio");
            Intrinsics.checkNotNullParameter(pnlText, "pnlText");
            Intrinsics.checkNotNullParameter(copyAmountText, "copyAmountText");
            Intrinsics.checkNotNullParameter(copyAmount, "copyAmount");
            this.leadConfigId = l11;
            this.avatarUrl = str;
            this.nickName = nickName;
            this.duration = duration;
            this.totalPnl = totalPnl;
            this.totalPnlRatio = totalPnlRatio;
            this.pnlText = pnlText;
            this.copyAmountText = copyAmountText;
            this.copyAmount = copyAmount;
            this.background = i11;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getBackground() {
            return this.background;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getCopyAmount() {
            return this.copyAmount;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getCopyAmountText() {
            return this.copyAmountText;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getDuration() {
            return this.duration;
        }

        public int hashCode() {
            Long l11 = this.leadConfigId;
            int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
            String str = this.avatarUrl;
            return ((((((((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.nickName.hashCode()) * 31) + this.duration.hashCode()) * 31) + this.totalPnl.hashCode()) * 31) + this.totalPnlRatio.hashCode()) * 31) + this.pnlText.hashCode()) * 31) + this.copyAmountText.hashCode()) * 31) + this.copyAmount.hashCode()) * 31) + Integer.hashCode(this.background);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final Long getLeadConfigId() {
            return this.leadConfigId;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getNickName() {
            return this.nickName;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getPnlText() {
            return this.pnlText;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getTotalPnl() {
            return this.totalPnl;
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getTotalPnlRatio() {
            return this.totalPnlRatio;
        }

        @NotNull
        public String toString() {
            return "CopyTradingItem(leadConfigId=" + this.leadConfigId + ", avatarUrl=" + this.avatarUrl + ", nickName=" + this.nickName + ", duration=" + this.duration + ", totalPnl=" + this.totalPnl + ", totalPnlRatio=" + this.totalPnlRatio + ", pnlText=" + this.pnlText + ", copyAmountText=" + this.copyAmountText + ", copyAmount=" + this.copyAmount + ", background=" + this.background + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.mapper.ProductItem$c, reason: from toString */
    /* JADX INFO: compiled from: ProductItem.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Jh\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$CrossItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;", "totalCount", "", "profit", "", "profitRate", "positionText", "fundsInfoList", "", "Lcom/kubi/assets/entity/FundsInfo;", "hasMore", "", "background", "riskViewEntity", "Lcom/kubi/assets/entity/RiskViewEntity;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;ILcom/kubi/assets/entity/RiskViewEntity;)V", "getTotalCount", "()I", "getProfit", "()Ljava/lang/String;", "getProfitRate", "getPositionText", "getFundsInfoList", "()Ljava/util/List;", "getHasMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackground", "getRiskViewEntity", "()Lcom/kubi/assets/entity/RiskViewEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;ILcom/kubi/assets/entity/RiskViewEntity;)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$CrossItem;", "equals", "other", "", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CrossItem extends ProductItem {

        /* JADX INFO: renamed from: d, reason: from toString */
        public final int totalCount;

        /* JADX INFO: renamed from: e, reason: from toString */
        @NotNull
        public final String profit;

        /* JADX INFO: renamed from: f, reason: from toString */
        @NotNull
        public final String profitRate;

        /* JADX INFO: renamed from: g, reason: from toString */
        @NotNull
        public final String positionText;

        /* JADX INFO: renamed from: h, reason: from toString */
        @Nullable
        public final List<FundsInfo> fundsInfoList;

        /* JADX INFO: renamed from: i, reason: from toString */
        @Nullable
        public final Boolean hasMore;

        /* JADX INFO: renamed from: j, reason: from toString */
        public final int background;

        /* JADX INFO: renamed from: k, reason: from toString */
        @NotNull
        public final RiskViewEntity riskViewEntity;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CrossItem)) {
                return false;
            }
            CrossItem crossItem = (CrossItem) other;
            return this.totalCount == crossItem.totalCount && Intrinsics.areEqual(this.profit, crossItem.profit) && Intrinsics.areEqual(this.profitRate, crossItem.profitRate) && Intrinsics.areEqual(this.positionText, crossItem.positionText) && Intrinsics.areEqual(this.fundsInfoList, crossItem.fundsInfoList) && Intrinsics.areEqual(this.hasMore, crossItem.hasMore) && this.background == crossItem.background && Intrinsics.areEqual(this.riskViewEntity, crossItem.riskViewEntity);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CrossItem(int i11, @NotNull String profit, @NotNull String profitRate, @NotNull String positionText, @Nullable List<FundsInfo> list, @Nullable Boolean bool, int i12, @NotNull RiskViewEntity riskViewEntity) {
            super(3, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(profit, "profit");
            Intrinsics.checkNotNullParameter(profitRate, "profitRate");
            Intrinsics.checkNotNullParameter(positionText, "positionText");
            Intrinsics.checkNotNullParameter(riskViewEntity, "riskViewEntity");
            this.totalCount = i11;
            this.profit = profit;
            this.profitRate = profitRate;
            this.positionText = positionText;
            this.fundsInfoList = list;
            this.hasMore = bool;
            this.background = i12;
            this.riskViewEntity = riskViewEntity;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getBackground() {
            return this.background;
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public final List<FundsInfo> m18804e() {
            return this.fundsInfoList;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final Boolean getHasMore() {
            return this.hasMore;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getPositionText() {
            return this.positionText;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getProfit() {
            return this.profit;
        }

        public int hashCode() {
            int iHashCode = ((((((Integer.hashCode(this.totalCount) * 31) + this.profit.hashCode()) * 31) + this.profitRate.hashCode()) * 31) + this.positionText.hashCode()) * 31;
            List<FundsInfo> list = this.fundsInfoList;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.hasMore;
            return ((((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + Integer.hashCode(this.background)) * 31) + this.riskViewEntity.hashCode();
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getProfitRate() {
            return this.profitRate;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final RiskViewEntity getRiskViewEntity() {
            return this.riskViewEntity;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getTotalCount() {
            return this.totalCount;
        }

        @NotNull
        public String toString() {
            return "CrossItem(totalCount=" + this.totalCount + ", profit=" + this.profit + ", profitRate=" + this.profitRate + ", positionText=" + this.positionText + ", fundsInfoList=" + this.fundsInfoList + ", hasMore=" + this.hasMore + ", background=" + this.background + ", riskViewEntity=" + this.riskViewEntity + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.mapper.ProductItem$d, reason: from toString */
    /* JADX INFO: compiled from: ProductItem.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0011HÆ\u0003J\t\u00107\u001a\u00020\u0011HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010(J´\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\u0011HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(¨\u0006@"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$FinancialItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;", FirebaseAnalytics.Param.CURRENCY, "", "iconUrl", "showTag", "", "category", "categoryText", "holderText", "dateText", "amount", "incomeAmount", "returnRate", "minLockEndTime", "jumpUrl", "color", "", "size", "incomeCurrencyCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;)V", "getCurrency", "()Ljava/lang/String;", "getIconUrl", "getShowTag", "()Z", "getCategory", "getCategoryText", "getHolderText", "getDateText", "getAmount", "getIncomeAmount", "getReturnRate", "getMinLockEndTime", "getJumpUrl", "getColor", "()I", "getSize", "getIncomeCurrencyCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$FinancialItem;", "equals", "other", "", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FinancialItem extends ProductItem {

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final String currency;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final String iconUrl;

        /* JADX INFO: renamed from: f, reason: from toString */
        public final boolean showTag;

        /* JADX INFO: renamed from: g, reason: from toString */
        @Nullable
        public final String category;

        /* JADX INFO: renamed from: h, reason: from toString */
        @Nullable
        public final String categoryText;

        /* JADX INFO: renamed from: i, reason: from toString */
        @NotNull
        public final String holderText;

        /* JADX INFO: renamed from: j, reason: from toString */
        @NotNull
        public final String dateText;

        /* JADX INFO: renamed from: k, reason: from toString */
        @NotNull
        public final String amount;

        /* JADX INFO: renamed from: l, reason: from toString */
        @Nullable
        public final String incomeAmount;

        /* JADX INFO: renamed from: m, reason: from toString */
        @Nullable
        public final String returnRate;

        /* JADX INFO: renamed from: n, reason: from toString */
        @Nullable
        public final String minLockEndTime;

        /* JADX INFO: renamed from: o, reason: from toString */
        @NotNull
        public final String jumpUrl;

        /* JADX INFO: renamed from: p, reason: from toString */
        public final int color;

        /* JADX INFO: renamed from: q, reason: from toString */
        public final int size;

        /* JADX INFO: renamed from: r, reason: from toString */
        @Nullable
        public final Integer incomeCurrencyCount;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinancialItem)) {
                return false;
            }
            FinancialItem financialItem = (FinancialItem) other;
            return Intrinsics.areEqual(this.currency, financialItem.currency) && Intrinsics.areEqual(this.iconUrl, financialItem.iconUrl) && this.showTag == financialItem.showTag && Intrinsics.areEqual(this.category, financialItem.category) && Intrinsics.areEqual(this.categoryText, financialItem.categoryText) && Intrinsics.areEqual(this.holderText, financialItem.holderText) && Intrinsics.areEqual(this.dateText, financialItem.dateText) && Intrinsics.areEqual(this.amount, financialItem.amount) && Intrinsics.areEqual(this.incomeAmount, financialItem.incomeAmount) && Intrinsics.areEqual(this.returnRate, financialItem.returnRate) && Intrinsics.areEqual(this.minLockEndTime, financialItem.minLockEndTime) && Intrinsics.areEqual(this.jumpUrl, financialItem.jumpUrl) && this.color == financialItem.color && this.size == financialItem.size && Intrinsics.areEqual(this.incomeCurrencyCount, financialItem.incomeCurrencyCount);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FinancialItem(@Nullable String str, @Nullable String str2, boolean z11, @Nullable String str3, @Nullable String str4, @NotNull String holderText, @NotNull String dateText, @NotNull String amount, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull String jumpUrl, int i11, int i12, @Nullable Integer num) {
            super(5, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(holderText, "holderText");
            Intrinsics.checkNotNullParameter(dateText, "dateText");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(jumpUrl, "jumpUrl");
            this.currency = str;
            this.iconUrl = str2;
            this.showTag = z11;
            this.category = str3;
            this.categoryText = str4;
            this.holderText = holderText;
            this.dateText = dateText;
            this.amount = amount;
            this.incomeAmount = str5;
            this.returnRate = str6;
            this.minLockEndTime = str7;
            this.jumpUrl = jumpUrl;
            this.color = i11;
            this.size = i12;
            this.incomeCurrencyCount = num;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getCategoryText() {
            return this.categoryText;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        public int hashCode() {
            String str = this.currency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.iconUrl;
            int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.showTag)) * 31;
            String str3 = this.category;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.categoryText;
            int iHashCode4 = (((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.holderText.hashCode()) * 31) + this.dateText.hashCode()) * 31) + this.amount.hashCode()) * 31;
            String str5 = this.incomeAmount;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.returnRate;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.minLockEndTime;
            int iHashCode7 = (((((((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.jumpUrl.hashCode()) * 31) + Integer.hashCode(this.color)) * 31) + Integer.hashCode(this.size)) * 31;
            Integer num = this.incomeCurrencyCount;
            return iHashCode7 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getDateText() {
            return this.dateText;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getHolderText() {
            return this.holderText;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getIncomeAmount() {
            return this.incomeAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final Integer getIncomeCurrencyCount() {
            return this.incomeCurrencyCount;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getJumpUrl() {
            return this.jumpUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getMinLockEndTime() {
            return this.minLockEndTime;
        }

        @Nullable
        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getReturnRate() {
            return this.returnRate;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final boolean getShowTag() {
            return this.showTag;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        @NotNull
        public String toString() {
            return "FinancialItem(currency=" + this.currency + ", iconUrl=" + this.iconUrl + ", showTag=" + this.showTag + ", category=" + this.category + ", categoryText=" + this.categoryText + ", holderText=" + this.holderText + ", dateText=" + this.dateText + ", amount=" + this.amount + ", incomeAmount=" + this.incomeAmount + ", returnRate=" + this.returnRate + ", minLockEndTime=" + this.minLockEndTime + ", jumpUrl=" + this.jumpUrl + ", color=" + this.color + ", size=" + this.size + ", incomeCurrencyCount=" + this.incomeCurrencyCount + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.mapper.ProductItem$e, reason: from toString */
    /* JADX INFO: compiled from: ProductItem.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$HeaderItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;", "subType", "", "isExpanded", "", "alreadyCopyTraders", "<init>", "(IZLjava/lang/Integer;)V", "getSubType", "()I", "()Z", "setExpanded", "(Z)V", "getAlreadyCopyTraders", "()Ljava/lang/Integer;", "setAlreadyCopyTraders", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(IZLjava/lang/Integer;)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$HeaderItem;", "equals", "other", "", "hashCode", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class HeaderItem extends ProductItem {

        /* JADX INFO: renamed from: d, reason: from toString */
        public final int subType;

        /* JADX INFO: renamed from: e, reason: from toString */
        public boolean isExpanded;

        /* JADX INFO: renamed from: f, reason: from toString */
        @Nullable
        public Integer alreadyCopyTraders;

        public /* synthetic */ HeaderItem(int i11, boolean z11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? true : z11, (i12 & 4) != 0 ? null : num);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderItem)) {
                return false;
            }
            HeaderItem headerItem = (HeaderItem) other;
            return this.subType == headerItem.subType && this.isExpanded == headerItem.isExpanded && Intrinsics.areEqual(this.alreadyCopyTraders, headerItem.alreadyCopyTraders);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public HeaderItem(int i11, boolean z11, @Nullable Integer num) {
            super(6, null, 2, 0 == true ? 1 : 0);
            this.subType = i11;
            this.isExpanded = z11;
            this.alreadyCopyTraders = num;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getAlreadyCopyTraders() {
            return this.alreadyCopyTraders;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getSubType() {
            return this.subType;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsExpanded() {
            return this.isExpanded;
        }

        /* JADX INFO: renamed from: g */
        public final void m18829g(@Nullable Integer num) {
            this.alreadyCopyTraders = num;
        }

        /* JADX INFO: renamed from: h */
        public final void m18830h(boolean z11) {
            this.isExpanded = z11;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.subType) * 31) + Boolean.hashCode(this.isExpanded)) * 31;
            Integer num = this.alreadyCopyTraders;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "HeaderItem(subType=" + this.subType + ", isExpanded=" + this.isExpanded + ", alreadyCopyTraders=" + this.alreadyCopyTraders + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.mapper.ProductItem$f, reason: from toString */
    /* JADX INFO: compiled from: ProductItem.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003Jq\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\fHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$IsolatedItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;", "tag", "", "iconUrl", "name", "profit", "profitRate", "positionText", "markPrice", "liquidationPrice", "background", "", "riskViewEntity", "Lcom/kubi/assets/entity/RiskViewEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/kubi/assets/entity/RiskViewEntity;)V", "getTag", "()Ljava/lang/String;", "getIconUrl", "getName", "getProfit", "getProfitRate", "getPositionText", "getMarkPrice", "getLiquidationPrice", "getBackground", "()I", "getRiskViewEntity", "()Lcom/kubi/assets/entity/RiskViewEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class IsolatedItem extends ProductItem {

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final String tag;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final String iconUrl;

        /* JADX INFO: renamed from: f, reason: from toString */
        @NotNull
        public final String name;

        /* JADX INFO: renamed from: g, reason: from toString */
        @NotNull
        public final String profit;

        /* JADX INFO: renamed from: h, reason: from toString */
        @NotNull
        public final String profitRate;

        /* JADX INFO: renamed from: i, reason: from toString */
        @NotNull
        public final String positionText;

        /* JADX INFO: renamed from: j, reason: from toString */
        @NotNull
        public final String markPrice;

        /* JADX INFO: renamed from: k, reason: from toString */
        @NotNull
        public final String liquidationPrice;

        /* JADX INFO: renamed from: l, reason: from toString */
        public final int background;

        /* JADX INFO: renamed from: m, reason: from toString */
        @NotNull
        public final RiskViewEntity riskViewEntity;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IsolatedItem)) {
                return false;
            }
            IsolatedItem isolatedItem = (IsolatedItem) other;
            return Intrinsics.areEqual(this.tag, isolatedItem.tag) && Intrinsics.areEqual(this.iconUrl, isolatedItem.iconUrl) && Intrinsics.areEqual(this.name, isolatedItem.name) && Intrinsics.areEqual(this.profit, isolatedItem.profit) && Intrinsics.areEqual(this.profitRate, isolatedItem.profitRate) && Intrinsics.areEqual(this.positionText, isolatedItem.positionText) && Intrinsics.areEqual(this.markPrice, isolatedItem.markPrice) && Intrinsics.areEqual(this.liquidationPrice, isolatedItem.liquidationPrice) && this.background == isolatedItem.background && Intrinsics.areEqual(this.riskViewEntity, isolatedItem.riskViewEntity);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public IsolatedItem(@Nullable String str, @Nullable String str2, @NotNull String name, @NotNull String profit, @NotNull String profitRate, @NotNull String positionText, @NotNull String markPrice, @NotNull String liquidationPrice, int i11, @NotNull RiskViewEntity riskViewEntity) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(profit, "profit");
            Intrinsics.checkNotNullParameter(profitRate, "profitRate");
            Intrinsics.checkNotNullParameter(positionText, "positionText");
            Intrinsics.checkNotNullParameter(markPrice, "markPrice");
            Intrinsics.checkNotNullParameter(liquidationPrice, "liquidationPrice");
            Intrinsics.checkNotNullParameter(riskViewEntity, "riskViewEntity");
            int i12 = 2;
            super(i12, null, i12, 0 == true ? 1 : 0);
            this.tag = str;
            this.iconUrl = str2;
            this.name = name;
            this.profit = profit;
            this.profitRate = profitRate;
            this.positionText = positionText;
            this.markPrice = markPrice;
            this.liquidationPrice = liquidationPrice;
            this.background = i11;
            this.riskViewEntity = riskViewEntity;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getBackground() {
            return this.background;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getLiquidationPrice() {
            return this.liquidationPrice;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getMarkPrice() {
            return this.markPrice;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.tag;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.iconUrl;
            return ((((((((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.name.hashCode()) * 31) + this.profit.hashCode()) * 31) + this.profitRate.hashCode()) * 31) + this.positionText.hashCode()) * 31) + this.markPrice.hashCode()) * 31) + this.liquidationPrice.hashCode()) * 31) + Integer.hashCode(this.background)) * 31) + this.riskViewEntity.hashCode();
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getPositionText() {
            return this.positionText;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getProfit() {
            return this.profit;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getProfitRate() {
            return this.profitRate;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final RiskViewEntity getRiskViewEntity() {
            return this.riskViewEntity;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        @NotNull
        public String toString() {
            return "IsolatedItem(tag=" + this.tag + ", iconUrl=" + this.iconUrl + ", name=" + this.name + ", profit=" + this.profit + ", profitRate=" + this.profitRate + ", positionText=" + this.positionText + ", markPrice=" + this.markPrice + ", liquidationPrice=" + this.liquidationPrice + ", background=" + this.background + ", riskViewEntity=" + this.riskViewEntity + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.mapper.ProductItem$g, reason: from toString */
    /* JADX INFO: compiled from: ProductItem.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0010HÆ\u0003J\u0085\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u0010HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00065"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$LeadTradingItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;", "symbol", "", "iconUrl", "side", "formatSymbol", "", "formatMarginMode", "leverage", "positionText", "pnl", "pnlRatio", "markPrice", "liquidationPrice", "background", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getSymbol", "()Ljava/lang/String;", "getIconUrl", "getSide", "getFormatSymbol", "()Ljava/lang/CharSequence;", "getFormatMarginMode", "getLeverage", "getPositionText", "getPnl", "getPnlRatio", "getMarkPrice", "getLiquidationPrice", "getBackground", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LeadTradingItem extends ProductItem {

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final String symbol;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final String iconUrl;

        /* JADX INFO: renamed from: f, reason: from toString */
        @NotNull
        public final String side;

        /* JADX INFO: renamed from: g, reason: from toString */
        @NotNull
        public final CharSequence formatSymbol;

        /* JADX INFO: renamed from: h, reason: from toString */
        @NotNull
        public final String formatMarginMode;

        /* JADX INFO: renamed from: i, reason: from toString */
        @NotNull
        public final String leverage;

        /* JADX INFO: renamed from: j, reason: from toString */
        @NotNull
        public final String positionText;

        /* JADX INFO: renamed from: k, reason: from toString */
        @NotNull
        public final String pnl;

        /* JADX INFO: renamed from: l, reason: from toString */
        @NotNull
        public final String pnlRatio;

        /* JADX INFO: renamed from: m, reason: from toString */
        @NotNull
        public final String markPrice;

        /* JADX INFO: renamed from: n, reason: from toString */
        @NotNull
        public final String liquidationPrice;

        /* JADX INFO: renamed from: o, reason: from toString */
        public final int background;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeadTradingItem)) {
                return false;
            }
            LeadTradingItem leadTradingItem = (LeadTradingItem) other;
            return Intrinsics.areEqual(this.symbol, leadTradingItem.symbol) && Intrinsics.areEqual(this.iconUrl, leadTradingItem.iconUrl) && Intrinsics.areEqual(this.side, leadTradingItem.side) && Intrinsics.areEqual(this.formatSymbol, leadTradingItem.formatSymbol) && Intrinsics.areEqual(this.formatMarginMode, leadTradingItem.formatMarginMode) && Intrinsics.areEqual(this.leverage, leadTradingItem.leverage) && Intrinsics.areEqual(this.positionText, leadTradingItem.positionText) && Intrinsics.areEqual(this.pnl, leadTradingItem.pnl) && Intrinsics.areEqual(this.pnlRatio, leadTradingItem.pnlRatio) && Intrinsics.areEqual(this.markPrice, leadTradingItem.markPrice) && Intrinsics.areEqual(this.liquidationPrice, leadTradingItem.liquidationPrice) && this.background == leadTradingItem.background;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LeadTradingItem(@Nullable String str, @Nullable String str2, @NotNull String side, @NotNull CharSequence formatSymbol, @NotNull String formatMarginMode, @NotNull String leverage, @NotNull String positionText, @NotNull String pnl, @NotNull String pnlRatio, @NotNull String markPrice, @NotNull String liquidationPrice, int i11) {
            super(9, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(formatSymbol, "formatSymbol");
            Intrinsics.checkNotNullParameter(formatMarginMode, "formatMarginMode");
            Intrinsics.checkNotNullParameter(leverage, "leverage");
            Intrinsics.checkNotNullParameter(positionText, "positionText");
            Intrinsics.checkNotNullParameter(pnl, "pnl");
            Intrinsics.checkNotNullParameter(pnlRatio, "pnlRatio");
            Intrinsics.checkNotNullParameter(markPrice, "markPrice");
            Intrinsics.checkNotNullParameter(liquidationPrice, "liquidationPrice");
            this.symbol = str;
            this.iconUrl = str2;
            this.side = side;
            this.formatSymbol = formatSymbol;
            this.formatMarginMode = formatMarginMode;
            this.leverage = leverage;
            this.positionText = positionText;
            this.pnl = pnl;
            this.pnlRatio = pnlRatio;
            this.markPrice = markPrice;
            this.liquidationPrice = liquidationPrice;
            this.background = i11;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getBackground() {
            return this.background;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getFormatMarginMode() {
            return this.formatMarginMode;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final CharSequence getFormatSymbol() {
            return this.formatSymbol;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getLeverage() {
            return this.leverage;
        }

        public int hashCode() {
            String str = this.symbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.iconUrl;
            return ((((((((((((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.side.hashCode()) * 31) + this.formatSymbol.hashCode()) * 31) + this.formatMarginMode.hashCode()) * 31) + this.leverage.hashCode()) * 31) + this.positionText.hashCode()) * 31) + this.pnl.hashCode()) * 31) + this.pnlRatio.hashCode()) * 31) + this.markPrice.hashCode()) * 31) + this.liquidationPrice.hashCode()) * 31) + Integer.hashCode(this.background);
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getLiquidationPrice() {
            return this.liquidationPrice;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getMarkPrice() {
            return this.markPrice;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getPnl() {
            return this.pnl;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getPnlRatio() {
            return this.pnlRatio;
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getPositionText() {
            return this.positionText;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getSide() {
            return this.side;
        }

        @Nullable
        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @NotNull
        public String toString() {
            return "LeadTradingItem(symbol=" + this.symbol + ", iconUrl=" + this.iconUrl + ", side=" + this.side + ", formatSymbol=" + ((Object) this.formatSymbol) + ", formatMarginMode=" + this.formatMarginMode + ", leverage=" + this.leverage + ", positionText=" + this.positionText + ", pnl=" + this.pnl + ", pnlRatio=" + this.pnlRatio + ", markPrice=" + this.markPrice + ", liquidationPrice=" + this.liquidationPrice + ", background=" + this.background + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.mapper.ProductItem$h, reason: from toString */
    /* JADX INFO: compiled from: ProductItem.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J$\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$LoadMoreItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;", "totalCount", "", "subType", "<init>", "(Ljava/lang/Integer;I)V", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubType", "()I", "component1", "component2", "copy", "(Ljava/lang/Integer;I)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$LoadMoreItem;", "equals", "", "other", "", "hashCode", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LoadMoreItem extends ProductItem {

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final Integer totalCount;

        /* JADX INFO: renamed from: e, reason: from toString */
        public final int subType;

        /* JADX WARN: Multi-variable type inference failed */
        public LoadMoreItem(@Nullable Integer num, int i11) {
            super(7, null, 2, 0 == true ? 1 : 0);
            this.totalCount = num;
            this.subType = i11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadMoreItem)) {
                return false;
            }
            LoadMoreItem loadMoreItem = (LoadMoreItem) other;
            return Intrinsics.areEqual(this.totalCount, loadMoreItem.totalCount) && this.subType == loadMoreItem.subType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getSubType() {
            return this.subType;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            Integer num = this.totalCount;
            return ((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.subType);
        }

        @NotNull
        public String toString() {
            return "LoadMoreItem(totalCount=" + this.totalCount + ", subType=" + this.subType + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.mapper.ProductItem$i, reason: from toString */
    /* JADX INFO: compiled from: ProductItem.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u0080\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0005HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017¨\u00063"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$RobotItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;", "id", "", "tag", "", "drawableId", "name", "productText", "totalCost", "totalProfit", "totalProfitRate", "positionText", "costText", "background", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getTag", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDrawableId", "()I", "getName", "getProductText", "getTotalCost", "getTotalProfit", "getTotalProfitRate", "getPositionText", "getCostText", "getBackground", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$RobotItem;", "equals", "", "other", "", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RobotItem extends ProductItem {

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final String id;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final Integer tag;

        /* JADX INFO: renamed from: f, reason: from toString */
        public final int drawableId;

        /* JADX INFO: renamed from: g, reason: from toString */
        @NotNull
        public final String name;

        /* JADX INFO: renamed from: h, reason: from toString */
        @NotNull
        public final String productText;

        /* JADX INFO: renamed from: i, reason: from toString */
        @NotNull
        public final String totalCost;

        /* JADX INFO: renamed from: j, reason: from toString */
        @NotNull
        public final String totalProfit;

        /* JADX INFO: renamed from: k, reason: from toString */
        @NotNull
        public final String totalProfitRate;

        /* JADX INFO: renamed from: l, reason: from toString */
        @NotNull
        public final String positionText;

        /* JADX INFO: renamed from: m, reason: from toString */
        @NotNull
        public final String costText;

        /* JADX INFO: renamed from: n, reason: from toString */
        public final int background;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RobotItem)) {
                return false;
            }
            RobotItem robotItem = (RobotItem) other;
            return Intrinsics.areEqual(this.id, robotItem.id) && Intrinsics.areEqual(this.tag, robotItem.tag) && this.drawableId == robotItem.drawableId && Intrinsics.areEqual(this.name, robotItem.name) && Intrinsics.areEqual(this.productText, robotItem.productText) && Intrinsics.areEqual(this.totalCost, robotItem.totalCost) && Intrinsics.areEqual(this.totalProfit, robotItem.totalProfit) && Intrinsics.areEqual(this.totalProfitRate, robotItem.totalProfitRate) && Intrinsics.areEqual(this.positionText, robotItem.positionText) && Intrinsics.areEqual(this.costText, robotItem.costText) && this.background == robotItem.background;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public RobotItem(@Nullable String str, @Nullable Integer num, int i11, @NotNull String name, @NotNull String productText, @NotNull String totalCost, @NotNull String totalProfit, @NotNull String totalProfitRate, @NotNull String positionText, @NotNull String costText, int i12) {
            super(4, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(productText, "productText");
            Intrinsics.checkNotNullParameter(totalCost, "totalCost");
            Intrinsics.checkNotNullParameter(totalProfit, "totalProfit");
            Intrinsics.checkNotNullParameter(totalProfitRate, "totalProfitRate");
            Intrinsics.checkNotNullParameter(positionText, "positionText");
            Intrinsics.checkNotNullParameter(costText, "costText");
            this.id = str;
            this.tag = num;
            this.drawableId = i11;
            this.name = name;
            this.productText = productText;
            this.totalCost = totalCost;
            this.totalProfit = totalProfit;
            this.totalProfitRate = totalProfitRate;
            this.positionText = positionText;
            this.costText = costText;
            this.background = i12;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getBackground() {
            return this.background;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getCostText() {
            return this.costText;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getDrawableId() {
            return this.drawableId;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.tag;
            return ((((((((((((((((((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.drawableId)) * 31) + this.name.hashCode()) * 31) + this.productText.hashCode()) * 31) + this.totalCost.hashCode()) * 31) + this.totalProfit.hashCode()) * 31) + this.totalProfitRate.hashCode()) * 31) + this.positionText.hashCode()) * 31) + this.costText.hashCode()) * 31) + Integer.hashCode(this.background);
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getPositionText() {
            return this.positionText;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getProductText() {
            return this.productText;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final Integer getTag() {
            return this.tag;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getTotalCost() {
            return this.totalCost;
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getTotalProfit() {
            return this.totalProfit;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getTotalProfitRate() {
            return this.totalProfitRate;
        }

        @NotNull
        public String toString() {
            return "RobotItem(id=" + this.id + ", tag=" + this.tag + ", drawableId=" + this.drawableId + ", name=" + this.name + ", productText=" + this.productText + ", totalCost=" + this.totalCost + ", totalProfit=" + this.totalProfit + ", totalProfitRate=" + this.totalProfitRate + ", positionText=" + this.positionText + ", costText=" + this.costText + ", background=" + this.background + ')';
        }
    }

    public /* synthetic */ ProductItem(int i11, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str);
    }

    public ProductItem(int i11, String str) {
        this.f18435a = i11;
        this.f18436b = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF18436b() {
        return this.f18436b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF18435a() {
        return this.f18435a;
    }

    /* JADX INFO: renamed from: c */
    public final void m18776c(@Nullable String str) {
        this.f18436b = str;
    }

    public /* synthetic */ ProductItem(int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : str, null);
    }
}
