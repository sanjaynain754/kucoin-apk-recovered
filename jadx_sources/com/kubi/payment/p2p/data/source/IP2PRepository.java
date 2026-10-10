package com.kubi.payment.p2p.data.source;

import androidx.annotation.WorkerThread;
import com.kubi.otc.entity.OtcInfoEntity;
import com.kubi.payment.data.entities.BannerInfo;
import com.kubi.payment.p2p.data.entities.BadgeInfo;
import com.kubi.payment.p2p.data.entities.ExpressBuyPreCheck;
import com.kubi.payment.p2p.data.entities.FileSizeResponse;
import com.kubi.payment.p2p.data.entities.MarkPaymentMethod;
import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import com.kubi.payment.p2p.data.entities.P2PConfigInfo;
import com.kubi.payment.p2p.data.entities.P2PExpress;
import com.kubi.payment.p2p.data.entities.P2PMarketPaymentMethod;
import com.kubi.payment.p2p.data.entities.P2PTradingPairInfo;
import com.kubi.payment.p2p.data.entities.ReleaseCrypto;
import com.kubi.payment.p2p.data.entities.TaxInfo;
import com.kubi.payment.p2p.data.entities.TradeCurrencyCrypto;
import com.kubi.payment.p2p.data.entities.TradeCurrencyFiat;
import com.kubi.payment.p2p.data.entities.TradeInfo;
import com.kubi.payment.p2p.data.entities.TradePayMethodIcon;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p477nt.InterfaceC42877j;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Field;

/* JADX INFO: renamed from: com.kubi.payment.p2p.data.source.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IP2PRepository.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J2\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH§@¢\u0006\u0002\u0010\rJ0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\f0\u0003H¦@¢\u0006\u0002\u0010\u001bJ\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\f0\u0003H¦@¢\u0006\u0002\u0010\u001bJ\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\f0\u00032\u0006\u0010 \u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\"\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\f0\u00032\u0006\u0010 \u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0003H¦@¢\u0006\u0002\u0010\u001bJ\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u0003H¦@¢\u0006\u0002\u0010\u001bJ\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00032\u0006\u0010(\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\f0\u0003H¦@¢\u0006\u0002\u0010\u001bJ\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010+\u001a\u00020,H§@¢\u0006\u0002\u0010-J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J$\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0016J\u001c\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0003H§@¢\u0006\u0002\u0010\u001bJ\u001c\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00032\u0006\u00107\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u00108\u001a\b\u0012\u0004\u0012\u0002090\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0007J(\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010;\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0002\u0010\u0016J\u001e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0002\u0010\u0007J\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00032\u0006\u0010?\u001a\u00020@H§@¢\u0006\u0002\u0010AJ\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00032\u0006\u0010?\u001a\u00020DH§@¢\u0006\u0002\u0010EJ\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0003H§@¢\u0006\u0002\u0010\u001bJ\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H§@¢\u0006\u0002\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006IÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/source/IP2PRepository;", "Lcom/kubi/payment/base/IRepository;", "loadOrderInfo", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;", "orderId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPayMoney", "", "payTypeId", "payVoucherFileIds", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "releaseCrypto", "Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;", "validationToken", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAppeal", "consentAppeal", DbParams.KEY_CHANNEL_RESULT, "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rejectAppeal", "notifyPayCoin", "loadUploadFileSize", "Lcom/kubi/payment/p2p/data/entities/FileSizeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatCurrencyList", "Lcom/kubi/payment/p2p/data/entities/TradeCurrencyFiat;", "loadCryptoCurrencyList", "Lcom/kubi/payment/p2p/data/entities/TradeCurrencyCrypto;", "fiatCurrency", "loadMarketPaymentMethod", "Lcom/kubi/payment/p2p/data/entities/P2PMarketPaymentMethod;", "loadUserTradeInfo", "Lcom/kubi/payment/p2p/data/entities/TradeInfo;", "loadMerchantFiat", "loadTradeDetailInfo", "Lcom/kubi/otc/entity/OtcInfoEntity;", "id", "loadPaymentMethodIcons", "Lcom/kubi/payment/p2p/data/entities/TradePayMethodIcon;", "markPaymentMethod", "Lcom/kubi/payment/p2p/data/entities/MarkPaymentMethod;", "(Lcom/kubi/payment/p2p/data/entities/MarkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelHedge", "goonHedge", "quoteId", "loadQuote", "Lcom/kubi/payment/p2p/data/entities/P2PExpress$HedgeResponse;", "loadP2PConfigInfo", "Lcom/kubi/payment/p2p/data/entities/P2PConfigInfo;", "loadTaxInfo", "Lcom/kubi/payment/p2p/data/entities/TaxInfo;", "type", "loadP2PBanner", "Lcom/kubi/payment/data/entities/BannerInfo;", "blockUser", "adId", "loadBlockStatus", "loadTradingPairInfo", "Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Response;", "request", "Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Request;", "(Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expressBuyPreCheck", "Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Response;", "Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Request;", "(Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBadgeInfo", "Lcom/kubi/payment/p2p/data/entities/BadgeInfo;", "heartBeatReport", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IP2PRepository extends InterfaceC42877j {
    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: A0 */
    Object mo48474A0(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation);

    @Nullable
    /* JADX INFO: renamed from: B */
    Object mo48475B(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends List<P2PMarketPaymentMethod>>> continuation);

    @Nullable
    /* JADX INFO: renamed from: D */
    Object mo48476D(@NotNull Continuation<? super AbstractC42878k<TradeInfo>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: O */
    Object mo48477O(@NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation);

    @Nullable
    /* JADX INFO: renamed from: R */
    Object mo48478R(@Nullable String str, @NotNull Continuation<? super AbstractC42878k<String>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: S */
    Object mo48479S(@NotNull MarkPaymentMethod markPaymentMethod, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: W */
    Object mo48480W(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<TaxInfo>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: Y */
    Object mo48481Y(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: b */
    Object mo48482b(@Nullable String str, @Nullable String str2, @NotNull String str3, @NotNull Continuation<? super AbstractC42878k<ReleaseCrypto>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: d0 */
    Object mo48483d0(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: e */
    Object mo48484e(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<P2PExpress.HedgeResponse>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: f0 */
    Object mo48485f0(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<OrderDetailInfo>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: i */
    Object mo48486i(@NotNull ExpressBuyPreCheck.Request request, @NotNull Continuation<? super AbstractC42878k<ExpressBuyPreCheck.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: i0 */
    Object mo48487i0(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation);

    @Nullable
    /* JADX INFO: renamed from: k */
    Object mo48488k(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends List<TradeCurrencyCrypto>>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: l */
    Object mo48489l(@Nullable String str, @NotNull Continuation<? super AbstractC42878k<BannerInfo>> continuation);

    @Nullable
    /* JADX INFO: renamed from: l0 */
    Object mo48490l0(@NotNull Continuation<? super AbstractC42878k<? extends List<FileSizeResponse>>> continuation);

    @Nullable
    /* JADX INFO: renamed from: n0 */
    Object mo48491n0(@NotNull Continuation<? super AbstractC42878k<? extends List<TradePayMethodIcon>>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: q0 */
    Object mo48492q0(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: r */
    Object mo48493r(@NotNull Continuation<? super AbstractC42878k<P2PConfigInfo>> continuation);

    @Nullable
    /* JADX INFO: renamed from: r0 */
    Object mo48494r0(@Field("orderId") @NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: t */
    Object mo48495t(@NotNull Continuation<? super AbstractC42878k<BadgeInfo>> continuation);

    @Nullable
    /* JADX INFO: renamed from: u0 */
    Object mo48496u0(@NotNull Continuation<? super AbstractC42878k<? extends List<TradeCurrencyFiat>>> continuation);

    @Nullable
    /* JADX INFO: renamed from: v */
    Object mo48497v(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<OtcInfoEntity>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: v0 */
    Object mo48498v0(@NotNull P2PTradingPairInfo.Request request, @NotNull Continuation<? super AbstractC42878k<P2PTradingPairInfo.Response>> continuation);

    @Nullable
    /* JADX INFO: renamed from: x0 */
    Object mo48499x0(@Nullable String str, @Nullable String str2, @NotNull Continuation<? super AbstractC42878k<String>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: y0 */
    Object mo48500y0(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation);
}
