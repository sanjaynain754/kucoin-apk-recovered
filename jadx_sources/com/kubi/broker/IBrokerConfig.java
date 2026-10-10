package com.kubi.broker;

import bm.FuturesTrackConfigs;
import com.kubi.kumex.entity.TradeTypeFilterData;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p559qg.InterfaceC43729a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.broker.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IBrokerConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0017H&J\"\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH&J\u001e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0 H&J\b\u0010!\u001a\u00020\"H&J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u000eH&J\b\u0010(\u001a\u00020\u0003H\u0016J\b\u0010)\u001a\u00020\u0003H\u0016J\b\u0010*\u001a\u00020\u0003H&J\b\u0010+\u001a\u00020\u0003H\u0016J\b\u0010,\u001a\u00020\u0003H&J\b\u0010-\u001a\u00020\u0003H&J\b\u0010.\u001a\u00020\u0003H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006/À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/broker/IBrokerConfig;", "Lcom/kubi/function/IMultiFunction;", "showTips", "", "getShowTips", "()Z", "setShowTips", "(Z)V", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "orderTradeTypes", "", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "settingMoreMenus", "", "", "isSupportTrial", "isSupportCrossModel", "isSupportIsolatedModel", "isSupportHedgeModel", "isSupportNotification", "isSupportDisplayUserLimit", "maxLeverage", "Ljava/math/BigDecimal;", "jumpToTransfer", "", "settleCurrencyShow", "blockId", "locationId", "checkDefaultSymbol", "symbol", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Consumer;", "trackKeyConfigs", "Lcom/kubi/kumex/data/platform/model/FuturesTrackConfigs;", "isSupportSharePosition", "limitCancelAllCount", "", "getTradeTypeFilterItems", "Lcom/kubi/kumex/entity/TradeTypeFilterData;", "supportShowToggleUnified", "supportModifyRiskLimit", "isSupportModifyOrder", "isSupportIsolatedAutoAddMargin", "isReversePositionEnable", "isSupportTwap", "isSupportBBO", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IBrokerConfig extends InterfaceC43729a {
    /* JADX INFO: renamed from: A0 */
    boolean mo20222A0();

    /* JADX INFO: renamed from: C0 */
    default boolean mo20223C0() {
        return true;
    }

    /* JADX INFO: renamed from: E0 */
    default boolean mo20224E0() {
        return false;
    }

    /* JADX INFO: renamed from: G0 */
    boolean mo20225G0();

    @NotNull
    /* JADX INFO: renamed from: H */
    String mo20226H(@NotNull String str, @NotNull Consumer<String> consumer);

    /* JADX INFO: renamed from: J0 */
    boolean mo20227J0();

    /* JADX INFO: renamed from: K */
    void mo20228K(boolean z11);

    /* JADX INFO: renamed from: O */
    boolean mo20229O();

    /* JADX INFO: renamed from: Q */
    boolean mo20230Q();

    @NotNull
    /* JADX INFO: renamed from: S0 */
    List<String> mo20231S0();

    /* JADX INFO: renamed from: T */
    boolean mo20232T();

    /* JADX INFO: renamed from: U0 */
    boolean mo20233U0();

    @NotNull
    /* JADX INFO: renamed from: V */
    BigDecimal mo20234V();

    @NotNull
    /* JADX INFO: renamed from: W */
    List<TradeTypeFilterData> mo20235W();

    @NotNull
    /* JADX INFO: renamed from: X0 */
    List<OrderTradeType> mo20236X0();

    /* JADX INFO: renamed from: Y0 */
    boolean mo20237Y0();

    /* JADX INFO: renamed from: a1 */
    default int mo20238a1() {
        return 0;
    }

    /* JADX INFO: renamed from: j0 */
    default boolean mo20239j0() {
        return true;
    }

    /* JADX INFO: renamed from: o */
    boolean mo20240o();

    /* JADX INFO: renamed from: r0 */
    default boolean mo20241r0() {
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    FuturesTrackConfigs mo20242s0();

    /* JADX INFO: renamed from: v0 */
    boolean mo20243v0();

    /* JADX INFO: renamed from: w0 */
    boolean mo20244w0();

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    MultiBizType mo4515x();

    /* JADX INFO: renamed from: y0 */
    void mo20245y0(@Nullable String str, @NotNull String str2, @NotNull String str3);
}
