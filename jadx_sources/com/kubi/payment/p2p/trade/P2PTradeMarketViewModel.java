package com.kubi.payment.p2p.trade;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.payment.data.entities.BannerInfo;
import com.kubi.payment.p2p.data.entities.P2PMarketPaymentMethod;
import com.kubi.payment.p2p.data.entities.TradeCurrencyFiat;
import com.kubi.payment.p2p.data.entities.TradeInfo;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.utils.extensions.C27024b;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p477nt.C42874g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import y70.C46392a;

/* JADX INFO: compiled from: P2PTradeMarketViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010.\u001a\u00020/J\b\u00100\u001a\u00020/H\u0002J\u0006\u00101\u001a\u00020/J\u0010\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u00020\u0019J\b\u00104\u001a\u00020\u0019H\u0002J\u0016\u00105\u001a\u00020/2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011H\u0007J\u0006\u00107\u001a\u00020/J\u0006\u00108\u001a\u00020/J\u0006\u00109\u001a\u00020/J\b\u0010:\u001a\u00020/H\u0002J\"\u0010;\u001a\u00020<2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0-H\u0082@¢\u0006\u0002\u0010>J\u000e\u0010?\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010@J\u000e\u0010A\u001a\u00020/2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020\bJ\f\u0010D\u001a\b\u0012\u0004\u0012\u00020+0\u0011J\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0-R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\n8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00110\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00110\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\n8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\n8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00110\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00110\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010\fR\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n8F¢\u0006\u0006\u001a\u0004\b&\u0010\fR\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00190\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190\n8F¢\u0006\u0006\u001a\u0004\b)\u0010\fR\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0-X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;", "Lcom/kubi/payment/base/BaseViewModel;", "repository", "Lcom/kubi/payment/p2p/data/source/IP2PRepository;", "<init>", "(Lcom/kubi/payment/p2p/data/source/IP2PRepository;)V", "_fiatCurrency", "Landroidx/lifecycle/MutableLiveData;", "", "fiatCurrency", "Landroidx/lifecycle/LiveData;", "getFiatCurrency", "()Landroidx/lifecycle/LiveData;", "_cryptoCurrency", "cryptoCurrency", "getCryptoCurrency", "_cryptoCurrencyList", "", "cryptoCurrencyList", "getCryptoCurrencyList", "_paymentMethods", "Lcom/kubi/payment/p2p/data/entities/P2PMarketPaymentMethod;", "paymentMethods", "getPaymentMethods", "_showPaymentMethodsFilter", "", "showPaymentMethodsFilter", "getShowPaymentMethodsFilter", "_merchantFiatCurrencyList", "merchantFiatCurrencyList", "getMerchantFiatCurrencyList", "_bannerList", "Lcom/kubi/payment/data/entities/BannerInfo$Banner;", "bannerList", "getBannerList", "_tradeInfo", "Lcom/kubi/payment/p2p/data/entities/TradeInfo;", "tradeInfo", "getTradeInfo", "_notifyPayMethodIcons", "notifyPayMethodIcons", "getNotifyPayMethodIcons", "fiatCurrencyList", "Lcom/kubi/payment/p2p/data/entities/TradeCurrencyFiat;", "payMethodIcons", "", "initData", "", "loadFiatCurrencyList", "loadCryptoCurrencyList", "loadMarketPaymentMethod", "needShowPaymentMethodFilter", "hasMarketPaymentMethod", "updatePaymentMethod", "paymentMethod", "loadBannerInfo", "loadUserTradeInfo", "loadMerchantFiat", "loadPaymentMethodIcons", "putCacheData", "Lcom/kubi/utils/storage/KVStore;", "data", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCacheData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFiatCurrency", "updateCurrencyCrypto", "currencyCrypto", "getFiatCurrencyList", "getPayMethodIcons", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PTradeMarketViewModel extends C42874g {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final IP2PRepository f40028X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<String> f40029Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<String> f40030Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<List<String>> f40031a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<List<P2PMarketPaymentMethod>> f40032b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Boolean> f40033c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<List<String>> f40034d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<List<BannerInfo.Banner>> f40035e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<TradeInfo> f40036f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final MutableLiveData<Boolean> f40037g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public List<TradeCurrencyFiat> f40038h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public Map<String, String> f40039i0;

    public P2PTradeMarketViewModel(@NotNull IP2PRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f40028X = repository;
        this.f40029Y = new MutableLiveData<>();
        this.f40030Z = new MutableLiveData<>();
        this.f40031a0 = new MutableLiveData<>();
        this.f40032b0 = new MutableLiveData<>();
        this.f40033c0 = new MutableLiveData<>();
        this.f40034d0 = new MutableLiveData<>();
        this.f40035e0 = new MutableLiveData<>();
        this.f40036f0 = new MutableLiveData<>();
        this.f40037g0 = new MutableLiveData<>();
        this.f40038h0 = CollectionsKt.emptyList();
        this.f40039i0 = MapsKt.emptyMap();
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m49311Y(P2PTradeMarketViewModel p2PTradeMarketViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        p2PTradeMarketViewModel.m49337X(z11);
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final LiveData<List<BannerInfo.Banner>> m49321H() {
        return this.f40035e0;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final LiveData<String> m49323J() {
        return this.f40030Z;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final LiveData<List<String>> m49324K() {
        return this.f40031a0;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final LiveData<String> m49325L() {
        return this.f40029Y;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final List<TradeCurrencyFiat> m49326M() {
        return C27024b.m66558a(this.f40038h0);
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final LiveData<List<String>> m49327N() {
        return this.f40034d0;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final LiveData<Boolean> m49328O() {
        return this.f40037g0;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final LiveData<List<P2PMarketPaymentMethod>> m49329P() {
        return this.f40032b0;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final LiveData<Boolean> m49330Q() {
        return this.f40033c0;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final LiveData<TradeInfo> m49331R() {
        return this.f40036f0;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m49332S() {
        List<P2PMarketPaymentMethod> value = this.f40032b0.getValue();
        return !(value == null || value.isEmpty());
    }

    /* JADX INFO: renamed from: W */
    public final void m49336W() {
        String strM102326h = C46392a.m102326h(PaymentStorageId.f40364a.m49843u(), "");
        boolean z11 = strM102326h.length() > 0;
        if (z11) {
            this.f40029Y.setValue(strM102326h);
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PTradeMarketViewModel$loadFiatCurrencyList$1(this, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m49341c0(@NotNull String currencyCrypto) {
        Intrinsics.checkNotNullParameter(currencyCrypto, "currencyCrypto");
        this.f40030Z.setValue(currencyCrypto);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m49342d0(@NotNull String fiatCurrency) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        this.f40029Y.setValue(fiatCurrency);
        C46392a.m102333p(PaymentStorageId.f40364a.m49843u(), fiatCurrency);
    }

    /* JADX INFO: renamed from: I */
    public final Object m49322I(Continuation<? super String> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new P2PTradeMarketViewModel$getCacheData$2(null), continuation);
    }

    /* JADX INFO: renamed from: T */
    public final void m49333T() {
        m49338Z();
        m49336W();
    }

    /* JADX INFO: renamed from: U */
    public final void m49334U() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PTradeMarketViewModel$loadBannerInfo$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: V */
    public final void m49335V() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PTradeMarketViewModel$loadCryptoCurrencyList$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: X */
    public final void m49337X(boolean z11) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PTradeMarketViewModel$loadMarketPaymentMethod$1(this, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: Z */
    public final void m49338Z() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PTradeMarketViewModel$loadPaymentMethodIcons$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m49339a0() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PTradeMarketViewModel$loadUserTradeInfo$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: b0 */
    public final Object m49340b0(Map<String, String> map, Continuation<? super C46392a> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new P2PTradeMarketViewModel$putCacheData$2(map, null), continuation);
    }
}
