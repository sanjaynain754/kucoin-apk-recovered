package com.kubi.p110rn.kline;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.TXLiveConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.DoubleCompanionObject;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: KlineFlutterMiniViewManager.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/0B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0007J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u001a\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u001a\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0007J\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"H\u0007J\u0018\u0010#\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010'\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u0016\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020*\u0018\u00010)H\u0016J$\u0010+\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0-H\u0002¨\u00061"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineFlutterMiniViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/kubi/rn/kline/KlineFlutterMiniHostView;", "<init>", "()V", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setSymbol", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "symbol", "setKlineType", "klineType", "setLeverTradeType", "leverTradeType", "setPeriod", "period", "setPeriodBarSource", KlineFlutterMiniConstants.PROP_PERIOD_BAR_SOURCE, "setDataSource", KlineFlutterMiniConstants.PROP_DATA_SOURCE, "setShowBSPoints", KlineFlutterMiniConstants.PROP_SHOW_BS_POINTS, "", "setCandles", KlineFlutterMiniConstants.PROP_CANDLES, "Lcom/facebook/react/bridge/ReadableArray;", "setRealtimeCandles", KlineFlutterMiniConstants.PROP_REALTIME_CANDLES, "setRealtimeRevision", KlineFlutterMiniConstants.PROP_REALTIME_REVISION, "", "setLatestPrice", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "", "onDropViewInstance", "onAfterUpdateTransaction", "getExportedCustomDirectEventTypeConstants", "", "", "pushProps", "reducer", "Lkotlin/Function1;", "Lcom/kubi/rn/kline/KlineFlutterMiniViewManager$PropsState;", "PropsState", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KlineFlutterMiniViewManager extends SimpleViewManager<KlineFlutterMiniHostView> {

    @NotNull
    private static final String TAG = "KlineMiniViewManager";

    @NotNull
    private static final SparseArray<PropsState> propsStore = new SparseArray<>();

    /* JADX INFO: renamed from: com.kubi.rn.kline.KlineFlutterMiniViewManager$a, reason: from toString */
    /* JADX INFO: compiled from: KlineFlutterMiniViewManager.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b%\b\u0082\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010#J\u008e\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u000fHÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#¨\u00066"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineFlutterMiniViewManager$PropsState;", "", "symbol", "", "klineType", "leverTradeType", "period", KlineFlutterMiniConstants.PROP_PERIOD_BAR_SOURCE, KlineFlutterMiniConstants.PROP_DATA_SOURCE, KlineFlutterMiniConstants.PROP_SHOW_BS_POINTS, "", KlineFlutterMiniConstants.PROP_CANDLES, "Lcom/facebook/react/bridge/ReadableArray;", KlineFlutterMiniConstants.PROP_REALTIME_CANDLES, KlineFlutterMiniConstants.PROP_REALTIME_REVISION, "", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;ILjava/lang/Double;)V", "getSymbol", "()Ljava/lang/String;", "getKlineType", "getLeverTradeType", "getPeriod", "getPeriodBarSource", "getDataSource", "getShowBSPoints", "()Z", "getCandles", "()Lcom/facebook/react/bridge/ReadableArray;", "getRealtimeCandles", "getRealtimeRevision", "()I", "getLatestPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;ILjava/lang/Double;)Lcom/kubi/rn/kline/KlineFlutterMiniViewManager$PropsState;", "equals", "other", "hashCode", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PropsState {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String symbol;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final String klineType;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String leverTradeType;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final String period;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final String periodBarSource;

        /* JADX INFO: renamed from: f, reason: from toString */
        @Nullable
        public final String dataSource;

        /* JADX INFO: renamed from: g, reason: from toString */
        public final boolean showBSPoints;

        /* JADX INFO: renamed from: h, reason: from toString */
        @Nullable
        public final ReadableArray candles;

        /* JADX INFO: renamed from: i, reason: from toString */
        @Nullable
        public final ReadableArray realtimeCandles;

        /* JADX INFO: renamed from: j, reason: from toString */
        public final int realtimeRevision;

        /* JADX INFO: renamed from: k, reason: from toString */
        @Nullable
        public final Double latestPrice;

        public PropsState() {
            this(null, null, null, null, null, null, false, null, null, 0, null, 2047, null);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ PropsState m56031b(PropsState propsState, String str, String str2, String str3, String str4, String str5, String str6, boolean z11, ReadableArray readableArray, ReadableArray readableArray2, int i11, Double d11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = propsState.symbol;
            }
            if ((i12 & 2) != 0) {
                str2 = propsState.klineType;
            }
            if ((i12 & 4) != 0) {
                str3 = propsState.leverTradeType;
            }
            if ((i12 & 8) != 0) {
                str4 = propsState.period;
            }
            if ((i12 & 16) != 0) {
                str5 = propsState.periodBarSource;
            }
            if ((i12 & 32) != 0) {
                str6 = propsState.dataSource;
            }
            if ((i12 & 64) != 0) {
                z11 = propsState.showBSPoints;
            }
            if ((i12 & 128) != 0) {
                readableArray = propsState.candles;
            }
            if ((i12 & 256) != 0) {
                readableArray2 = propsState.realtimeCandles;
            }
            if ((i12 & 512) != 0) {
                i11 = propsState.realtimeRevision;
            }
            if ((i12 & 1024) != 0) {
                d11 = propsState.latestPrice;
            }
            int i13 = i11;
            Double d12 = d11;
            ReadableArray readableArray3 = readableArray;
            ReadableArray readableArray4 = readableArray2;
            String str7 = str6;
            boolean z12 = z11;
            String str8 = str5;
            String str9 = str3;
            return propsState.m56032a(str, str2, str9, str4, str8, str7, z12, readableArray3, readableArray4, i13, d12);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PropsState)) {
                return false;
            }
            PropsState propsState = (PropsState) other;
            return Intrinsics.areEqual(this.symbol, propsState.symbol) && Intrinsics.areEqual(this.klineType, propsState.klineType) && Intrinsics.areEqual(this.leverTradeType, propsState.leverTradeType) && Intrinsics.areEqual(this.period, propsState.period) && Intrinsics.areEqual(this.periodBarSource, propsState.periodBarSource) && Intrinsics.areEqual(this.dataSource, propsState.dataSource) && this.showBSPoints == propsState.showBSPoints && Intrinsics.areEqual(this.candles, propsState.candles) && Intrinsics.areEqual(this.realtimeCandles, propsState.realtimeCandles) && this.realtimeRevision == propsState.realtimeRevision && Intrinsics.areEqual((Object) this.latestPrice, (Object) propsState.latestPrice);
        }

        public PropsState(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z11, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, int i11, @Nullable Double d11) {
            this.symbol = str;
            this.klineType = str2;
            this.leverTradeType = str3;
            this.period = str4;
            this.periodBarSource = str5;
            this.dataSource = str6;
            this.showBSPoints = z11;
            this.candles = readableArray;
            this.realtimeCandles = readableArray2;
            this.realtimeRevision = i11;
            this.latestPrice = d11;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final PropsState m56032a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z11, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, int i11, @Nullable Double d11) {
            return new PropsState(str, str2, str3, str4, str5, str6, z11, readableArray, readableArray2, i11, d11);
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ReadableArray getCandles() {
            return this.candles;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDataSource() {
            return this.dataSource;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getKlineType() {
            return this.klineType;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final Double getLatestPrice() {
            return this.latestPrice;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getLeverTradeType() {
            return this.leverTradeType;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getPeriod() {
            return this.period;
        }

        public int hashCode() {
            String str = this.symbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.klineType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.leverTradeType;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.period;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.periodBarSource;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.dataSource;
            int iHashCode6 = (((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + Boolean.hashCode(this.showBSPoints)) * 31;
            ReadableArray readableArray = this.candles;
            int iHashCode7 = (iHashCode6 + (readableArray == null ? 0 : readableArray.hashCode())) * 31;
            ReadableArray readableArray2 = this.realtimeCandles;
            int iHashCode8 = (((iHashCode7 + (readableArray2 == null ? 0 : readableArray2.hashCode())) * 31) + Integer.hashCode(this.realtimeRevision)) * 31;
            Double d11 = this.latestPrice;
            return iHashCode8 + (d11 != null ? d11.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getPeriodBarSource() {
            return this.periodBarSource;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final ReadableArray getRealtimeCandles() {
            return this.realtimeCandles;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getRealtimeRevision() {
            return this.realtimeRevision;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getShowBSPoints() {
            return this.showBSPoints;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @NotNull
        public String toString() {
            return "PropsState(symbol=" + this.symbol + ", klineType=" + this.klineType + ", leverTradeType=" + this.leverTradeType + ", period=" + this.period + ", periodBarSource=" + this.periodBarSource + ", dataSource=" + this.dataSource + ", showBSPoints=" + this.showBSPoints + ", candles=" + this.candles + ", realtimeCandles=" + this.realtimeCandles + ", realtimeRevision=" + this.realtimeRevision + ", latestPrice=" + this.latestPrice + ')';
        }

        public /* synthetic */ PropsState(String str, String str2, String str3, String str4, String str5, String str6, boolean z11, ReadableArray readableArray, ReadableArray readableArray2, int i11, Double d11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? true : z11, (i12 & 128) != 0 ? null : readableArray, (i12 & 256) != 0 ? null : readableArray2, (i12 & 512) != 0 ? 0 : i11, (i12 & 1024) != 0 ? null : d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropsState setCandles$lambda$7(ReadableArray readableArray, PropsState current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return PropsState.m56031b(current, null, null, null, null, null, null, false, readableArray, null, 0, null, 1919, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropsState setDataSource$lambda$5(String str, PropsState current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return PropsState.m56031b(current, null, null, null, null, null, str, false, null, null, 0, null, TXLiveConstants.PLAY_EVT_STREAM_SWITCH_SUCC, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropsState setKlineType$lambda$1(String str, PropsState current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return PropsState.m56031b(current, null, str, null, null, null, null, false, null, null, 0, null, 2045, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropsState setLatestPrice$lambda$10(double d11, PropsState current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return PropsState.m56031b(current, null, null, null, null, null, null, false, null, null, 0, Double.valueOf(d11), 1023, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropsState setLeverTradeType$lambda$2(String str, PropsState current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return PropsState.m56031b(current, null, null, str, null, null, null, false, null, null, 0, null, 2043, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropsState setPeriod$lambda$3(String str, PropsState current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return PropsState.m56031b(current, null, null, null, str, null, null, false, null, null, 0, null, 2039, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropsState setPeriodBarSource$lambda$4(String str, PropsState current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return PropsState.m56031b(current, null, null, null, null, str, null, false, null, null, 0, null, 2031, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropsState setRealtimeCandles$lambda$8(ReadableArray readableArray, PropsState current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return PropsState.m56031b(current, null, null, null, null, null, null, false, null, readableArray, 0, null, 1791, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropsState setRealtimeRevision$lambda$9(int i11, PropsState current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return PropsState.m56031b(current, null, null, null, null, null, null, false, null, null, i11, null, 1535, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropsState setShowBSPoints$lambda$6(boolean z11, PropsState current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return PropsState.m56031b(current, null, null, null, null, null, null, z11, null, null, 0, null, 1983, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropsState setSymbol$lambda$0(String str, PropsState current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return PropsState.m56031b(current, str, null, null, null, null, null, false, null, null, 0, null, 2046, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public KlineFlutterMiniHostView createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new KlineFlutterMiniHostView(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return KlineFlutterMiniConstants.NATIVE_VIEW_NAME;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull KlineFlutterMiniHostView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        PropsState propsState = propsStore.get(view.getId());
        if (propsState != null) {
            view.updateProps(propsState.getSymbol(), propsState.getKlineType(), propsState.getLeverTradeType(), propsState.getPeriod(), propsState.getPeriodBarSource(), propsState.getDataSource(), propsState.getShowBSPoints(), propsState.getCandles(), propsState.getRealtimeCandles(), propsState.getRealtimeRevision(), propsState.getLatestPrice());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull KlineFlutterMiniHostView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        propsStore.remove(view.getId());
        view.releaseFlutterHost();
        super.onDropViewInstance(view);
    }

    @ReactProp(name = KlineFlutterMiniConstants.PROP_CANDLES)
    public final void setCandles(@NotNull KlineFlutterMiniHostView view, @Nullable final ReadableArray candles) {
        Intrinsics.checkNotNullParameter(view, "view");
        pushProps(view, new Function1() { // from class: com.kubi.rn.kline.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineFlutterMiniViewManager.setCandles$lambda$7(candles, (KlineFlutterMiniViewManager.PropsState) obj);
            }
        });
    }

    @ReactProp(name = KlineFlutterMiniConstants.PROP_DATA_SOURCE)
    public final void setDataSource(@NotNull KlineFlutterMiniHostView view, @Nullable final String dataSource) {
        Intrinsics.checkNotNullParameter(view, "view");
        pushProps(view, new Function1() { // from class: com.kubi.rn.kline.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineFlutterMiniViewManager.setDataSource$lambda$5(dataSource, (KlineFlutterMiniViewManager.PropsState) obj);
            }
        });
    }

    @ReactProp(name = "klineType")
    public final void setKlineType(@NotNull KlineFlutterMiniHostView view, @Nullable final String klineType) {
        Intrinsics.checkNotNullParameter(view, "view");
        pushProps(view, new Function1() { // from class: com.kubi.rn.kline.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineFlutterMiniViewManager.setKlineType$lambda$1(klineType, (KlineFlutterMiniViewManager.PropsState) obj);
            }
        });
    }

    @ReactProp(defaultDouble = DoubleCompanionObject.NaN, name = KlineFlutterMiniConstants.PROP_LATEST_PRICE)
    public final void setLatestPrice(@NotNull KlineFlutterMiniHostView view, final double latestPrice) {
        Intrinsics.checkNotNullParameter(view, "view");
        pushProps(view, new Function1() { // from class: com.kubi.rn.kline.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineFlutterMiniViewManager.setLatestPrice$lambda$10(latestPrice, (KlineFlutterMiniViewManager.PropsState) obj);
            }
        });
    }

    @ReactProp(name = "leverTradeType")
    public final void setLeverTradeType(@NotNull KlineFlutterMiniHostView view, @Nullable final String leverTradeType) {
        Intrinsics.checkNotNullParameter(view, "view");
        pushProps(view, new Function1() { // from class: com.kubi.rn.kline.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineFlutterMiniViewManager.setLeverTradeType$lambda$2(leverTradeType, (KlineFlutterMiniViewManager.PropsState) obj);
            }
        });
    }

    @ReactProp(name = "period")
    public final void setPeriod(@NotNull KlineFlutterMiniHostView view, @Nullable final String period) {
        Intrinsics.checkNotNullParameter(view, "view");
        pushProps(view, new Function1() { // from class: com.kubi.rn.kline.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineFlutterMiniViewManager.setPeriod$lambda$3(period, (KlineFlutterMiniViewManager.PropsState) obj);
            }
        });
    }

    @ReactProp(name = KlineFlutterMiniConstants.PROP_PERIOD_BAR_SOURCE)
    public final void setPeriodBarSource(@NotNull KlineFlutterMiniHostView view, @Nullable final String periodBarSource) {
        Intrinsics.checkNotNullParameter(view, "view");
        pushProps(view, new Function1() { // from class: com.kubi.rn.kline.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineFlutterMiniViewManager.setPeriodBarSource$lambda$4(periodBarSource, (KlineFlutterMiniViewManager.PropsState) obj);
            }
        });
    }

    @ReactProp(name = KlineFlutterMiniConstants.PROP_REALTIME_CANDLES)
    public final void setRealtimeCandles(@NotNull KlineFlutterMiniHostView view, @Nullable final ReadableArray realtimeCandles) {
        Intrinsics.checkNotNullParameter(view, "view");
        pushProps(view, new Function1() { // from class: com.kubi.rn.kline.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineFlutterMiniViewManager.setRealtimeCandles$lambda$8(realtimeCandles, (KlineFlutterMiniViewManager.PropsState) obj);
            }
        });
    }

    @ReactProp(defaultInt = 0, name = KlineFlutterMiniConstants.PROP_REALTIME_REVISION)
    public final void setRealtimeRevision(@NotNull KlineFlutterMiniHostView view, final int realtimeRevision) {
        Intrinsics.checkNotNullParameter(view, "view");
        pushProps(view, new Function1() { // from class: com.kubi.rn.kline.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineFlutterMiniViewManager.setRealtimeRevision$lambda$9(realtimeRevision, (KlineFlutterMiniViewManager.PropsState) obj);
            }
        });
    }

    @ReactProp(defaultBoolean = true, name = KlineFlutterMiniConstants.PROP_SHOW_BS_POINTS)
    public final void setShowBSPoints(@NotNull KlineFlutterMiniHostView view, final boolean showBSPoints) {
        Intrinsics.checkNotNullParameter(view, "view");
        pushProps(view, new Function1() { // from class: com.kubi.rn.kline.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineFlutterMiniViewManager.setShowBSPoints$lambda$6(showBSPoints, (KlineFlutterMiniViewManager.PropsState) obj);
            }
        });
    }

    @ReactProp(name = "symbol")
    public final void setSymbol(@NotNull KlineFlutterMiniHostView view, @Nullable final String symbol) {
        Intrinsics.checkNotNullParameter(view, "view");
        pushProps(view, new Function1() { // from class: com.kubi.rn.kline.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineFlutterMiniViewManager.setSymbol$lambda$0(symbol, (KlineFlutterMiniViewManager.PropsState) obj);
            }
        });
    }

    private final void pushProps(KlineFlutterMiniHostView view, Function1<? super PropsState, PropsState> reducer) {
        Integer numValueOf;
        int id2 = view.getId();
        SparseArray<PropsState> sparseArray = propsStore;
        PropsState propsState = sparseArray.get(id2);
        if (propsState == null) {
            propsState = new PropsState(null, null, null, null, null, null, false, null, null, 0, null, 2047, null);
        }
        PropsState propsStateInvoke = reducer.invoke(propsState);
        sparseArray.put(id2, propsStateInvoke);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("pushProps tag=");
        sb2.append(id2);
        sb2.append(" symbol=");
        sb2.append(propsStateInvoke.getSymbol());
        sb2.append(" klineType=");
        sb2.append(propsStateInvoke.getKlineType());
        sb2.append(" period=");
        sb2.append(propsStateInvoke.getPeriod());
        sb2.append(" periodBarSource=");
        sb2.append(propsStateInvoke.getPeriodBarSource());
        sb2.append(" dataSource=");
        sb2.append(propsStateInvoke.getDataSource());
        sb2.append(" showBSPoints=");
        sb2.append(propsStateInvoke.getShowBSPoints());
        sb2.append(" candles=");
        ReadableArray candles = propsStateInvoke.getCandles();
        Integer numValueOf2 = null;
        if (candles != null) {
            numValueOf = Integer.valueOf(candles.size());
        } else {
            numValueOf = null;
        }
        sb2.append(numValueOf);
        sb2.append(" realtime=");
        ReadableArray realtimeCandles = propsStateInvoke.getRealtimeCandles();
        if (realtimeCandles != null) {
            numValueOf2 = Integer.valueOf(realtimeCandles.size());
        }
        sb2.append(numValueOf2);
        sb2.append(" revision=");
        sb2.append(propsStateInvoke.getRealtimeRevision());
        C44128b.m97259c(TAG, sb2.toString());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().build();
    }
}
