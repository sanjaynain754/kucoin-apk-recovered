package com.kubi.payment.p2p.trade;

import com.kubi.payment.p2p.trade.filter.P2PFilterDialog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.payment.p2p.trade.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ITradeData.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\fH&J\b\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000eH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/ITradeData;", "", "getFiatCurrency", "", "getCryptoCurrency", "getFiatCurrencyAmount", "paymentMethodCodes", "p2pFilterData", "Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;", "updateP2PFilterData", "", "getPayMethodIcons", "", "isBuy", "", "animRemindView", "isAnimIn", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradeData {
    @NotNull
    /* JADX INFO: renamed from: K2 */
    String mo49119K2();

    /* JADX INFO: renamed from: L */
    boolean mo49121L();

    @NotNull
    /* JADX INFO: renamed from: N1 */
    String mo49122N1();

    @Nullable
    /* JADX INFO: renamed from: Y1 */
    P2PFilterDialog.P2PFilterData mo49130Y1();

    @NotNull
    /* JADX INFO: renamed from: e1 */
    String mo49132e1();

    /* JADX INFO: renamed from: g2 */
    void mo49133g2(@Nullable P2PFilterDialog.P2PFilterData p2PFilterData);

    @NotNull
    /* JADX INFO: renamed from: k1 */
    String mo49138k1();

    /* JADX INFO: renamed from: s2 */
    void mo49141s2(boolean z11);
}
