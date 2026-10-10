package com.kubi.payment.fasttrade.sell;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.otc.entity.FastLimits;
import com.kubi.otc.entity.FastSymbol;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.buy.bankcard.manage.ManageCard;
import com.kubi.payment.fast.data.entities.Balance;
import com.kubi.payment.fast.data.entities.SellPaymentMethod;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fasttrade.FastTradeChannel;
import com.kubi.payment.fasttrade.FastTradeChannelHelper;
import com.kubi.payment.fasttrade.sell.paymentmethod.ItemSellPaymentMethod;
import com.kubi.payment.helper.PrecisionHelper;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p429lf.C42180b;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FastSellVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)J\u0018\u0010*\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\bJ\u000e\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020\bJ\u000e\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020\bJ0\u00102\u001a\u00020'2\u0006\u0010-\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u0017JB\u00106\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e2\u0006\u0010-\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\b2\f\u00107\u001a\b\u0012\u0004\u0012\u0002080\u000eH\u0082@¢\u0006\u0002\u00109J\u0016\u0010:\u001a\u00020'2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eH\u0002J\u0012\u0010<\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001dH\u0002J&\u0010=\u001a\u0004\u0018\u00010)2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e2\u0006\u0010>\u001a\u00020\u001dH\u0082@¢\u0006\u0002\u0010?J\u0018\u0010@\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u001dH\u0002J\u0010\u0010B\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010\u001dJ\u0006\u0010C\u001a\u00020\bJ\b\u0010D\u001a\u0004\u0018\u00010\bJ\u0006\u0010E\u001a\u00020\bJ\u0010\u0010F\u001a\u00020\u00172\b\u00103\u001a\u0004\u0018\u00010\bJ\u0016\u0010G\u001a\u00020\u00172\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\bJ\u0016\u0010H\u001a\u00020\u00172\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\bJ\u0018\u0010I\u001a\u0004\u0018\u00010J2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\bJ\u0018\u0010K\u001a\u0004\u0018\u00010\b2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\bJ\u0012\u0010L\u001a\u0004\u0018\u00010\b2\u0006\u00104\u001a\u00020\bH\u0002J\u000e\u0010M\u001a\u00020N2\u0006\u0010-\u001a\u00020\bJ\u000e\u0010O\u001a\u00020N2\u0006\u00101\u001a\u00020\bJ\f\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u000eJ\u000e\u0010R\u001a\u00020'2\u0006\u0010S\u001a\u00020TR\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\n8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000e0\n8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\fR\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\n8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\fR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010\fR\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170\n8F¢\u0006\u0006\u001a\u0004\b%\u0010\f¨\u0006U"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/FastSellVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "repository", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;)V", "_selectedCryptoCurrency", "Landroidx/lifecycle/MutableLiveData;", "", "selectedCryptoCurrency", "Landroidx/lifecycle/LiveData;", "getSelectedCryptoCurrency", "()Landroidx/lifecycle/LiveData;", "_cryptoCurrencyList", "", "Lcom/kubi/payment/fasttrade/sell/FastSellCryptoCurrency;", "_balance", "Lcom/kubi/payment/fast/data/entities/Balance$Response;", "balance", "getBalance", "cryptoCurrencyList", "getCryptoCurrencyList", "isFirstLoading", "", "_paymentMethodList", "Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;", "paymentMethodList", "getPaymentMethodList", "_selectedPaymentMethod", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;", "selectedPaymentMethod", "getSelectedPaymentMethod", "_showSelectedPaymentMethod", "showSelectedPaymentMethod", "getShowSelectedPaymentMethod", "_preCheckPassed", "preCheckPassed", "getPreCheckPassed", "updateSelectedPaymentMethod", "", "paymentMethod", "Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$ItemNormalPaymentMethod;", "updateSellCryptoCurrencyList", "symbol", "Lcom/kubi/otc/entity/FastSymbol;", "fiatCurrency", "updateSelectedCryptoCurrency", "newCryptoCurrency", "loadCryptoCurrencyBalance", "cryptoCurrency", "loadSellPaymentMethodList", "amount", "quoteType", "isSelectedPaymentMethod", "convertToPresentationModel", "categoryPaymentMethods", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultSelectedPaymentMethod", "paymentMethods", "notifySelectedPaymentMethodChanged", "findSelectedPaymentMethod", "tempSelectedPaymentMethod", "(Ljava/util/List;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSamePaymentMethod", "itemSellPaymentMethod", "isAddNewCard", "calculateSellAllAmount", "availableBalance", "displayBalance", "isInitialAmount", "isValidBalance", "isValidAmount", "estimateAmount", "Ljava/math/BigDecimal;", "calculateCryptoAmount", "unitPrice", "fiatCurrencyPrecision", "", "cryptoCurrencyPrecision", "buildManageCardList", "Lcom/kubi/payment/fast/buy/bankcard/manage/ManageCard;", "preCheck", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastSellVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastSellVM.kt\ncom/kubi/payment/fasttrade/sell/FastSellVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,699:1\n1563#2:700\n1634#2,3:701\n1056#2:704\n774#2:708\n865#2,2:709\n1869#2,2:711\n1#3:705\n44#4,2:706\n*S KotlinDebug\n*F\n+ 1 FastSellVM.kt\ncom/kubi/payment/fasttrade/sell/FastSellVM\n*L\n132#1:700\n132#1:701,3\n138#1:704\n594#1:708\n594#1:709,2\n601#1:711,2\n532#1:706,2\n*E\n"})
public final class FastSellVM extends BasePaymentVM<IFastRepository> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IFastRepository f38812Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<String> f38813a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<List<FastSellCryptoCurrency>> f38814b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Balance.Response> f38815c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f38816d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<List<ItemSellPaymentMethod>> f38817e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<SellPaymentMethod.Response.PaymentMethod> f38818f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final MutableLiveData<Boolean> f38819g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final MutableLiveData<Boolean> f38820h0;

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.FastSellVM$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 FastSellVM.kt\ncom/kubi/payment/fasttrade/sell/FastSellVM\n*L\n1#1,328:1\n138#2:329\n*E\n"})
    public static final class C20593a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((FastSellCryptoCurrency) t11).getTitle(), ((FastSellCryptoCurrency) t12).getTitle());
        }
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m46922Y(@Nullable SellPaymentMethod.Response.PaymentMethod paymentMethod) {
        return paymentMethod != null && (FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(paymentMethod.getPaymentMethodCode()), C27041f.m66668h(paymentMethod.getChannelId())) instanceof FastTradeChannel.BankCard) && paymentMethod.getCardInfo() == null;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m46923Z(@Nullable String str) {
        return DowngradeExKt.m66535e(str, null, 1, null).compareTo(BigDecimal.ZERO) <= 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastSellVM(@NotNull IFastRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38812Z = repository;
        this.f38813a0 = new MutableLiveData<>();
        this.f38814b0 = new MutableLiveData<>();
        this.f38815c0 = new MutableLiveData<>();
        this.f38816d0 = true;
        this.f38817e0 = new MutableLiveData<>();
        this.f38818f0 = new MutableLiveData<>();
        this.f38819g0 = new MutableLiveData<>();
        this.f38820h0 = new MutableLiveData<>();
    }

    @Nullable
    /* JADX INFO: renamed from: G */
    public final String m46904G() {
        SellPaymentMethod.Response.PaymentMethod value = this.f38818f0.getValue();
        if (value == null) {
            Balance.Response value2 = this.f38815c0.getValue();
            if (value2 != null) {
                return value2.getAvailableBalance();
            }
            return null;
        }
        if (FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(value.getPaymentMethodCode()), C27041f.m66668h(value.getChannelId())) instanceof FastTradeChannel.BankCard) {
            Balance.Response value3 = this.f38815c0.getValue();
            if (value3 != null) {
                return value3.getCanWithdrawBalance();
            }
            return null;
        }
        Balance.Response value4 = this.f38815c0.getValue();
        if (value4 != null) {
            return value4.getAvailableBalance();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final List<ManageCard> m46905H() {
        ArrayList<ItemSellPaymentMethod> arrayList;
        ArrayList arrayList2 = new ArrayList();
        List<ItemSellPaymentMethod> value = this.f38817e0.getValue();
        if (value != null) {
            arrayList = new ArrayList();
            for (Object obj : value) {
                ItemSellPaymentMethod itemSellPaymentMethod = (ItemSellPaymentMethod) obj;
                if (itemSellPaymentMethod instanceof ItemSellPaymentMethod.ItemNormalPaymentMethod) {
                    ItemSellPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod = (ItemSellPaymentMethod.ItemNormalPaymentMethod) itemSellPaymentMethod;
                    if ((FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodCode()), C27041f.m66668h(itemNormalPaymentMethod.getPaymentMethod().getChannelId())) instanceof FastTradeChannel.BankCard) && itemNormalPaymentMethod.getPaymentMethod().getCardInfo() != null) {
                        arrayList.add(obj);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            for (ItemSellPaymentMethod itemSellPaymentMethod2 : arrayList) {
                if (itemSellPaymentMethod2 instanceof ItemSellPaymentMethod.ItemNormalPaymentMethod) {
                    ItemSellPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod2 = (ItemSellPaymentMethod.ItemNormalPaymentMethod) itemSellPaymentMethod2;
                    SellPaymentMethod.Response.PaymentMethod.CardInfo cardInfo = itemNormalPaymentMethod2.getPaymentMethod().getCardInfo();
                    arrayList2.add(new ManageCard(cardInfo != null ? cardInfo.getCardId() : null, itemNormalPaymentMethod2.getPaymentMethod().getIconUrl(), itemNormalPaymentMethod2.getPaymentMethod().getPaymentMethodName(), (String) null));
                }
            }
        }
        return arrayList2;
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public final String m46906I(@NotNull String amount, @NotNull String quoteType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        if (Intrinsics.areEqual(quoteType, "CRYPTO")) {
            return amount;
        }
        BigDecimal bigDecimalM46912O = m46912O(amount, quoteType);
        if (bigDecimalM46912O != null) {
            return bigDecimalM46912O.toPlainString();
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final int m46909L(@NotNull String cryptoCurrency) {
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        return PrecisionHelper.f39545a.m48247a(cryptoCurrency);
    }

    @Nullable
    /* JADX INFO: renamed from: O */
    public final BigDecimal m46912O(@NotNull String amount, @NotNull String quoteType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        String strM46931h0 = m46931h0(quoteType);
        if (strM46931h0 == null) {
            return null;
        }
        return DowngradeExKt.m66535e(amount, null, 1, null).multiply(DowngradeExKt.m66535e(strM46931h0, null, 1, null));
    }

    /* JADX INFO: renamed from: P */
    public final int m46913P(@NotNull String fiatCurrency) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        return PrecisionHelper.f39545a.m48248b(fiatCurrency);
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final LiveData<Balance.Response> m46915R() {
        return this.f38815c0;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final LiveData<List<FastSellCryptoCurrency>> m46916S() {
        return this.f38814b0;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final LiveData<List<ItemSellPaymentMethod>> m46917T() {
        return this.f38817e0;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final LiveData<Boolean> m46918U() {
        return this.f38820h0;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final LiveData<String> m46919V() {
        return this.f38813a0;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final LiveData<SellPaymentMethod.Response.PaymentMethod> m46920W() {
        return this.f38818f0;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final LiveData<Boolean> m46921X() {
        return this.f38819g0;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m46924a0(ItemSellPaymentMethod itemSellPaymentMethod, SellPaymentMethod.Response.PaymentMethod paymentMethod) {
        if (!(itemSellPaymentMethod instanceof ItemSellPaymentMethod.ItemNormalPaymentMethod)) {
            return false;
        }
        ItemSellPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod = (ItemSellPaymentMethod.ItemNormalPaymentMethod) itemSellPaymentMethod;
        return Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodCode(), paymentMethod.getPaymentMethodCode()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getChannelId(), paymentMethod.getChannelId()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodName(), paymentMethod.getPaymentMethodName()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getCardInfo(), paymentMethod.getCardInfo()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getP2pInfo(), paymentMethod.getP2pInfo()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().isEnabled(), paymentMethod.isEnabled());
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m46925b0(@NotNull String amount, @NotNull String quoteType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        SellPaymentMethod.Response.PaymentMethod value = this.f38818f0.getValue();
        if (value == null) {
            return true;
        }
        try {
            if (Intrinsics.areEqual(quoteType, "FIAT")) {
                String strM66668h = C27041f.m66668h(value.getFiatMinAmount());
                String strM66668h2 = C27041f.m66668h(value.getFiatMaxAmount());
                if (strM66668h.length() > 0) {
                    if (strM66668h2.length() > 0) {
                        if (DowngradeExKt.m66535e(amount, null, 1, null).compareTo(DowngradeExKt.m66535e(strM66668h, null, 1, null)) >= 0) {
                            if (DowngradeExKt.m66535e(amount, null, 1, null).compareTo(DowngradeExKt.m66535e(strM66668h2, null, 1, null)) > 0) {
                            }
                        }
                        return false;
                    }
                }
            } else {
                String strM66668h3 = C27041f.m66668h(value.getCryptoMinAmount());
                String strM66668h4 = C27041f.m66668h(value.getCryptoMaxAmount());
                if (strM66668h3.length() > 0 && strM66668h4.length() > 0 && (DowngradeExKt.m66535e(amount, null, 1, null).compareTo(DowngradeExKt.m66535e(strM66668h3, null, 1, null)) < 0 || DowngradeExKt.m66535e(amount, null, 1, null).compareTo(DowngradeExKt.m66535e(strM66668h4, null, 1, null)) > 0)) {
                    return false;
                }
            }
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "FastSellVM limit amount", false, null, 8, null), null, 2, null);
        }
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m46926c0(@NotNull String amount, @NotNull String quoteType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        String strM46904G = m46904G();
        if (strM46904G == null || strM46904G.length() == 0) {
            return true;
        }
        return DowngradeExKt.m66535e(strM46904G, null, 1, null).compareTo(DowngradeExKt.m66535e(m46906I(amount, quoteType), null, 1, null)) >= 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m46927d0(@NotNull String cryptoCurrency) {
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        if (cryptoCurrency.length() == 0) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FastSellVM$loadCryptoCurrencyBalance$1(this, cryptoCurrency, null), 3, null);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m46928e0(@NotNull String fiatCurrency, @NotNull String cryptoCurrency, @NotNull String amount, @NotNull String quoteType, boolean z11) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        if (fiatCurrency.length() == 0 || cryptoCurrency.length() == 0) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FastSellVM$loadSellPaymentMethodList$1(this, fiatCurrency, cryptoCurrency, amount, quoteType, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m46929f0(SellPaymentMethod.Response.PaymentMethod paymentMethod) throws JSONException {
        this.f38818f0.setValue(paymentMethod);
        if (this.f38816d0) {
            this.f38816d0 = false;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paymentMethodCode", paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null);
            jSONObject.put("channelId", paymentMethod != null ? paymentMethod.getChannelId() : null);
            jSONObject.put("pay_fiat_currency", paymentMethod != null ? paymentMethod.getFiatCurrency() : null);
            jSONObject.put("pay_crypto_currency", paymentMethod != null ? paymentMethod.getCryptoCurrency() : null);
            Unit unit = Unit.INSTANCE;
            C43852m.m96595g("B7FastSell", "page", null, jSONObject, 4, null);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m46930g0(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FastSellVM$preCheck$1(this, fragmentManager, null), 3, null);
    }

    /* JADX INFO: renamed from: h0 */
    public final String m46931h0(String str) {
        if (Intrinsics.areEqual(str, "FIAT")) {
            SellPaymentMethod.Response.PaymentMethod value = this.f38818f0.getValue();
            if (value != null) {
                return value.getFiatUnitPrice();
            }
            return null;
        }
        SellPaymentMethod.Response.PaymentMethod value2 = this.f38818f0.getValue();
        if (value2 != null) {
            return value2.getCryptoUnitPrice();
        }
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m46932i0(@NotNull String newCryptoCurrency) {
        Intrinsics.checkNotNullParameter(newCryptoCurrency, "newCryptoCurrency");
        if (newCryptoCurrency.length() == 0) {
            return;
        }
        this.f38813a0.setValue(newCryptoCurrency);
        for (FastSellCryptoCurrency fastSellCryptoCurrency : C27024b.m66560c(this.f38814b0.getValue())) {
            fastSellCryptoCurrency.setSelected(Intrinsics.areEqual(fastSellCryptoCurrency.getTitle(), newCryptoCurrency));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m46933j0(@NotNull ItemSellPaymentMethod.ItemNormalPaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        List<ItemSellPaymentMethod> value = this.f38817e0.getValue();
        Object obj = null;
        if (value != null) {
            for (Object obj2 : value) {
                ItemSellPaymentMethod itemSellPaymentMethod = (ItemSellPaymentMethod) obj2;
                if (itemSellPaymentMethod instanceof ItemSellPaymentMethod.ItemNormalPaymentMethod) {
                    ItemSellPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod = (ItemSellPaymentMethod.ItemNormalPaymentMethod) itemSellPaymentMethod;
                    if (Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodCode(), paymentMethod.getPaymentMethod().getPaymentMethodCode()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodName(), paymentMethod.getPaymentMethod().getPaymentMethodName()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getIconUrl(), paymentMethod.getPaymentMethod().getIconUrl())) {
                        obj = obj2;
                        break;
                    }
                }
            }
            obj = (ItemSellPaymentMethod) obj;
        }
        ItemSellPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod2 = (ItemSellPaymentMethod.ItemNormalPaymentMethod) obj;
        if (itemNormalPaymentMethod2 != null) {
            itemNormalPaymentMethod2.setSelected(true);
            this.f38818f0.setValue(itemNormalPaymentMethod2.getPaymentMethod());
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m46934l0(@Nullable FastSymbol fastSymbol, @NotNull String fiatCurrency) {
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
                arrayList.add(new FastSellCryptoCurrency(C27041f.m66668h(fastSymbol.coinIcon(str)), str, false));
            }
            listSortedWith = CollectionsKt.sortedWith(arrayList, new C20593a());
        }
        List<FastSellCryptoCurrency> listM66560c = C27024b.m66560c(listSortedWith);
        if (this.f38813a0.getValue() == null) {
            FastSellCryptoCurrency fastSellCryptoCurrency = (FastSellCryptoCurrency) CollectionsKt.firstOrNull((List) listM66560c);
            if (fastSellCryptoCurrency != null) {
                fastSellCryptoCurrency.setSelected(true);
            }
        } else {
            for (Object obj2 : listM66560c) {
                if (Intrinsics.areEqual(((FastSellCryptoCurrency) obj2).getTitle(), this.f38813a0.getValue())) {
                    obj = obj2;
                    break;
                }
            }
            FastSellCryptoCurrency fastSellCryptoCurrency2 = (FastSellCryptoCurrency) obj;
            if (fastSellCryptoCurrency2 == null) {
                FastSellCryptoCurrency fastSellCryptoCurrency3 = (FastSellCryptoCurrency) CollectionsKt.firstOrNull((List) listM66560c);
                if (fastSellCryptoCurrency3 != null) {
                    fastSellCryptoCurrency3.setSelected(true);
                }
            } else {
                fastSellCryptoCurrency2.setSelected(true);
            }
        }
        this.f38814b0.setValue(listM66560c);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final String m46907J() {
        String strM46904G = m46904G();
        SellPaymentMethod.Response.PaymentMethod value = this.f38818f0.getValue();
        if (value != null) {
            String strM66668h = C27041f.m66668h(value.getCryptoMaxAmount());
            if (strM66668h.length() > 0) {
                strM46904G = DowngradeExKt.m66535e(strM46904G, null, 1, null).min(DowngradeExKt.m66535e(strM66668h, null, 1, null)).toPlainString();
            }
        }
        return C27041f.m66669i(strM46904G, "0");
    }

    /* JADX INFO: renamed from: K */
    public final Object m46908K(String str, String str2, String str3, String str4, List<SellPaymentMethod.Response> list, Continuation<? super List<? extends ItemSellPaymentMethod>> continuation) {
        return C41686h.m91049g(C42911a.m94119a(), new FastSellVM$convertToPresentationModel$2(this, str3, list, str4, str, str2, null), continuation);
    }

    /* JADX INFO: renamed from: M */
    public final void m46910M(List<? extends ItemSellPaymentMethod> list) throws JSONException {
        SellPaymentMethod.Response.PaymentMethod paymentMethod;
        Object next;
        ItemSellPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod;
        Iterator<T> it = list.iterator();
        while (true) {
            paymentMethod = null;
            if (it.hasNext()) {
                next = it.next();
                ItemSellPaymentMethod itemSellPaymentMethod = (ItemSellPaymentMethod) next;
                if ((itemSellPaymentMethod instanceof ItemSellPaymentMethod.ItemNormalPaymentMethod) && C27025c.m66566d(((ItemSellPaymentMethod.ItemNormalPaymentMethod) itemSellPaymentMethod).getPaymentMethod().isEnabled())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next instanceof ItemSellPaymentMethod.ItemNormalPaymentMethod) {
            itemNormalPaymentMethod = (ItemSellPaymentMethod.ItemNormalPaymentMethod) next;
        } else {
            itemNormalPaymentMethod = null;
        }
        if (itemNormalPaymentMethod != null) {
            itemNormalPaymentMethod.setSelected(true);
        }
        if (itemNormalPaymentMethod != null) {
            paymentMethod = itemNormalPaymentMethod.getPaymentMethod();
        }
        m46929f0(paymentMethod);
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final String m46911N() {
        String strM92640e = null;
        BigDecimal bigDecimalM92637b = C42180b.m92637b(m46904G(), null, 1, null);
        if (bigDecimalM92637b != null) {
            Balance.Response value = this.f38815c0.getValue();
            if (value != null) {
                strM92640e = value.getCurrency();
            }
            strM92640e = C42180b.m92640e(bigDecimalM92637b, null, m46909L(C27041f.m66668h(strM92640e)), false, false, false, 0, null, 125, null);
        }
        return C42180b.m92647l(strM92640e);
    }

    /* JADX INFO: renamed from: Q */
    public final Object m46914Q(List<? extends ItemSellPaymentMethod> list, SellPaymentMethod.Response.PaymentMethod paymentMethod, Continuation<? super ItemSellPaymentMethod.ItemNormalPaymentMethod> continuation) {
        return C41686h.m91049g(C42911a.m94119a(), new FastSellVM$findSelectedPaymentMethod$2(list, this, paymentMethod, null), continuation);
    }
}
