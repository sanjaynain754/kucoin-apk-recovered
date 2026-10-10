package com.kubi.payment.fasttrade.buy;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.otc.entity.FastLimits;
import com.kubi.otc.entity.FastSymbol;
import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.data.entities.TradingPairInfo;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import ht.C38346y;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FastBuyVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u0016J\u000e\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0016J\u0016\u0010$\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0016J\u0006\u0010&\u001a\u00020\u0010J \u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\n8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\f¨\u0006*"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/buy/FastBuyVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "repository", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;)V", "_userInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/otc/entity/FiatUserInfo;", "userInfo", "Landroidx/lifecycle/LiveData;", "getUserInfo", "()Landroidx/lifecycle/LiveData;", "isChecking", "", "setChecking", "", "_tradingPairInfo", "Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Response;", "tradingPairInfo", "getTradingPairInfo", "_selectedCryptoCurrency", "", "selectedCryptoCurrency", "getSelectedCryptoCurrency", "_cryptoCurrencyList", "", "Lcom/kubi/payment/fasttrade/buy/FastBuyCryptoCurrency;", "cryptoCurrencyList", "getCryptoCurrencyList", "updateBuyCryptoCurrencyList", "symbol", "Lcom/kubi/otc/entity/FastSymbol;", "fiatCurrency", "updateSelectedCryptoCurrency", "newCryptoCurrency", "loadTradingPairInfo", "cryptoCurrency", "preCheck", "isValidAmount", "quoteType", "content", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastBuyVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastBuyVM.kt\ncom/kubi/payment/fasttrade/buy/FastBuyVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,192:1\n1563#2:193\n1634#2,3:194\n1056#2:197\n1#3:198\n44#4,2:199\n*S KotlinDebug\n*F\n+ 1 FastBuyVM.kt\ncom/kubi/payment/fasttrade/buy/FastBuyVM\n*L\n69#1:193\n69#1:194,3\n75#1:197\n188#1:199,2\n*E\n"})
public final class FastBuyVM extends BasePaymentVM<IFastRepository> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IFastRepository f38754Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<FiatUserInfo> f38755a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f38756b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<TradingPairInfo.Response> f38757c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<String> f38758d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<List<FastBuyCryptoCurrency>> f38759e0;

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.buy.FastBuyVM$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 FastBuyVM.kt\ncom/kubi/payment/fasttrade/buy/FastBuyVM\n*L\n1#1,328:1\n75#2:329\n*E\n"})
    public static final class C20560a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((FastBuyCryptoCurrency) t11).getTitle(), ((FastBuyCryptoCurrency) t12).getTitle());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastBuyVM(@NotNull IFastRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38754Z = repository;
        this.f38755a0 = new MutableLiveData<>();
        this.f38757c0 = new MutableLiveData<>();
        this.f38758d0 = new MutableLiveData<>();
        this.f38759e0 = new MutableLiveData<>();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final LiveData<List<FastBuyCryptoCurrency>> m46805A() {
        return this.f38759e0;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final LiveData<String> m46806B() {
        return this.f38758d0;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final LiveData<TradingPairInfo.Response> m46807C() {
        return this.f38757c0;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final LiveData<FiatUserInfo> m46808D() {
        return this.f38755a0;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m46809E(@NotNull String quoteType, @NotNull String content, @Nullable TradingPairInfo.Response response) {
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            if (Intrinsics.areEqual(quoteType, "FIAT")) {
                String strM66668h = C27041f.m66668h(response != null ? response.getFiatMinAmount() : null);
                String strM66668h2 = C27041f.m66668h(response != null ? response.getFiatMaxAmount() : null);
                if (strM66668h.length() > 0 && strM66668h2.length() > 0 && (C38346y.m86490A(content).compareTo(C38346y.m86490A(strM66668h)) == -1 || C38346y.m86490A(content).compareTo(C38346y.m86490A(strM66668h2)) == 1)) {
                    return false;
                }
            } else {
                String strM66668h3 = C27041f.m66668h(response != null ? response.getCryptoMinAmount() : null);
                String strM66668h4 = C27041f.m66668h(response != null ? response.getCryptoMaxAmount() : null);
                if (strM66668h3.length() > 0 && strM66668h4.length() > 0 && (C38346y.m86490A(content).compareTo(C38346y.m86490A(strM66668h3)) == -1 || C38346y.m86490A(content).compareTo(C38346y.m86490A(strM66668h4)) == 1)) {
                    return false;
                }
            }
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "FastBuyVM limit amount", false, null, 8, null), null, 2, null);
        }
        return true;
    }

    /* JADX INFO: renamed from: F */
    public final void m46810F(@NotNull String fiatCurrency, @NotNull String cryptoCurrency) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        if (fiatCurrency.length() == 0 || cryptoCurrency.length() == 0) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FastBuyVM$loadTradingPairInfo$1(this, fiatCurrency, cryptoCurrency, null), 3, null);
    }

    /* JADX INFO: renamed from: H */
    public final void m46812H(@Nullable FastSymbol fastSymbol, @NotNull String fiatCurrency) {
        List listSortedWith;
        Map<String, Map<String, FastLimits>> currencyAmounts;
        Map<String, FastLimits> map;
        Set<String> setKeySet;
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Object obj = null;
        if (fastSymbol == null || (currencyAmounts = fastSymbol.getCurrencyAmounts()) == null || (map = currencyAmounts.get(fiatCurrency)) == null || (setKeySet = map.keySet()) == null) {
            listSortedWith = null;
        } else {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
            for (String str : setKeySet) {
                arrayList.add(new FastBuyCryptoCurrency(C27041f.m66668h(fastSymbol.coinIcon(str)), str, false));
            }
            listSortedWith = CollectionsKt.sortedWith(arrayList, new C20560a());
        }
        List<FastBuyCryptoCurrency> listM66560c = C27024b.m66560c(listSortedWith);
        if (this.f38758d0.getValue() == null) {
            FastBuyCryptoCurrency fastBuyCryptoCurrency = (FastBuyCryptoCurrency) CollectionsKt.firstOrNull((List) listM66560c);
            if (fastBuyCryptoCurrency != null) {
                fastBuyCryptoCurrency.setSelected(true);
            }
        } else {
            for (Object obj2 : listM66560c) {
                if (Intrinsics.areEqual(((FastBuyCryptoCurrency) obj2).getTitle(), this.f38758d0.getValue())) {
                    obj = obj2;
                    break;
                }
            }
            FastBuyCryptoCurrency fastBuyCryptoCurrency2 = (FastBuyCryptoCurrency) obj;
            if (fastBuyCryptoCurrency2 == null) {
                FastBuyCryptoCurrency fastBuyCryptoCurrency3 = (FastBuyCryptoCurrency) CollectionsKt.firstOrNull((List) listM66560c);
                if (fastBuyCryptoCurrency3 != null) {
                    fastBuyCryptoCurrency3.setSelected(true);
                }
            } else {
                fastBuyCryptoCurrency2.setSelected(true);
            }
        }
        this.f38759e0.setValue(listM66560c);
    }

    /* JADX INFO: renamed from: I */
    public final void m46813I(@NotNull String newCryptoCurrency) {
        Intrinsics.checkNotNullParameter(newCryptoCurrency, "newCryptoCurrency");
        if (newCryptoCurrency.length() == 0) {
            return;
        }
        this.f38758d0.setValue(newCryptoCurrency);
        for (FastBuyCryptoCurrency fastBuyCryptoCurrency : C27024b.m66560c(this.f38759e0.getValue())) {
            fastBuyCryptoCurrency.setSelected(Intrinsics.areEqual(fastBuyCryptoCurrency.getTitle(), newCryptoCurrency));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m46811G() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FastBuyVM$preCheck$1(this, null), 3, null);
    }
}
