package com.kubi.payment.fasttradev2.buy;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.data.entities.BuyPaymentMethod;
import com.kubi.payment.fast.data.entities.TradingPairInfo;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fasttrade.FastTradeChannel;
import com.kubi.payment.fasttrade.FastTradeChannelHelper;
import com.kubi.payment.fasttradev2.buy.paymentmethod.BuyItemPaymentMethod;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p477nt.C42875h;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BuyVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JD\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u0007JB\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0010H\u0082@¢\u0006\u0002\u00101J\u0010\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0015H\u0002J\u0016\u00104\u001a\u00020%2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0012\u00106\u001a\u00020%2\b\u00103\u001a\u0004\u0018\u00010\u0015H\u0002J&\u00107\u001a\u0004\u0018\u0001082\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u00109\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010:J\u0018\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u0015H\u0002J\u0010\u0010=\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010'J\u0010\u0010>\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u00010\u0015J\u000e\u0010?\u001a\u00020%2\u0006\u00103\u001a\u000208J\u0016\u0010@\u001a\u00020\u00072\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'J\u0018\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'J\u0018\u0010C\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'J\u0012\u0010D\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020'H\u0002J\u000e\u0010E\u001a\u00020'2\u0006\u0010*\u001a\u00020'J\u0010\u0010F\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020'J\u000e\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u00020IJ\u0016\u0010J\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'J\u001e\u0010K\u001a\u00020\u00072\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0010H\u0082@¢\u0006\u0002\u0010MR\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001b0\f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\f8F¢\u0006\u0006\u001a\u0004\b \u0010\u000eR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\f8F¢\u0006\u0006\u001a\u0004\b#\u0010\u000e¨\u0006N"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/BuyVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "repository", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;)V", "isFirstLoading", "", "_recurringInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Response;", "recurringInfo", "Landroidx/lifecycle/LiveData;", "getRecurringInfo", "()Landroidx/lifecycle/LiveData;", "_paymentMethodList", "", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyItemPaymentMethod;", "paymentMethodList", "getPaymentMethodList", "_selectedPaymentMethod", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod;", "selectedPaymentMethod", "getSelectedPaymentMethod", "googlePayClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "_showSelectedPaymentMethod", "Lcom/kubi/payment/base/Event;", "showSelectedPaymentMethod", "getShowSelectedPaymentMethod", "isLoadingPaymentMethodList", "_isRefreshingBankCard", "isRefreshingBankCard", "_preCheckPassed", "preCheckPassed", "getPreCheckPassed", "loadBuyPaymentMethodList", "", "fiatCurrency", "", "cryptoCurrency", "amount", "quoteType", "isRecurring", "isSelectedPaymentMethod", "refreshBankCard", "convertToPresentationModel", "categoryPaymentMethods", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isGooglePay", "paymentMethod", "defaultSelectedPaymentMethod", "paymentMethods", "notifySelectedPaymentMethodChanged", "findSelectedPaymentMethod", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyItemPaymentMethod$ItemNormalPaymentMethod;", "tempSelectedPaymentMethod", "(Ljava/util/List;Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSamePaymentMethod", "itemPaymentMethod", "isInitialAmount", "isAddNewCard", "updateSelectedPaymentMethod", "isValidAmount", "estimateAmount", "Ljava/math/BigDecimal;", "calculateFiatAmount", "unitPrice", "calculateBuyAllAmount", "maxLimitAmount", "preCheck", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "loadRecurringInfo", "loadCanUseGooglePay", "allowedCardNetworks", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyVM.kt\ncom/kubi/payment/fasttradev2/buy/BuyVM\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,743:1\n44#2,2:744\n44#2,2:746\n*S KotlinDebug\n*F\n+ 1 BuyVM.kt\ncom/kubi/payment/fasttradev2/buy/BuyVM\n*L\n450#1:744,2\n739#1:746,2\n*E\n"})
public final class BuyVM extends BasePaymentVM<IFastRepository> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IFastRepository f39040Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f39041a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<TradingPairInfo.Response> f39042b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<List<BuyItemPaymentMethod>> f39043c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<BuyPaymentMethod.Response.PaymentMethod> f39044d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public PaymentsClient f39045e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<C42875h<Boolean>> f39046f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f39047g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final MutableLiveData<Boolean> f39048h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final MutableLiveData<Boolean> f39049i0;

    /* JADX INFO: renamed from: W */
    public final boolean m47446W(@Nullable BuyPaymentMethod.Response.PaymentMethod paymentMethod) {
        return paymentMethod != null && (FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(paymentMethod.getPaymentMethodCode()), C27041f.m66668h(paymentMethod.getChannelId())) instanceof FastTradeChannel.BankCard) && paymentMethod.getCardInfo() == null;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m47448Y(@Nullable String str) {
        return DowngradeExKt.m66535e(str, null, 1, null).compareTo(BigDecimal.ZERO) <= 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyVM(@NotNull IFastRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f39040Z = repository;
        this.f39041a0 = true;
        this.f39042b0 = new MutableLiveData<>();
        this.f39043c0 = new MutableLiveData<>();
        this.f39044d0 = new MutableLiveData<>();
        this.f39046f0 = new MutableLiveData<>();
        this.f39048h0 = new MutableLiveData<>();
        this.f39049i0 = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: i0 */
    private final String m47429i0(String str) {
        if (Intrinsics.areEqual(str, "FIAT")) {
            BuyPaymentMethod.Response.PaymentMethod value = this.f39044d0.getValue();
            if (value != null) {
                return value.getFiatUnitPrice();
            }
            return null;
        }
        BuyPaymentMethod.Response.PaymentMethod value2 = this.f39044d0.getValue();
        if (value2 != null) {
            return value2.getCryptoUnitPrice();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    @NotNull
    /* JADX INFO: renamed from: L */
    public final String m47437L(@NotNull String quoteType) {
        String strM66668h;
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        BuyPaymentMethod.Response.PaymentMethod value = this.f39044d0.getValue();
        if (value == null) {
            return "0";
        }
        if (Intrinsics.areEqual(quoteType, "FIAT")) {
            strM66668h = C27041f.m66668h(value.getFiatMaxAmount());
            if (strM66668h.length() <= 0) {
                strM66668h = null;
            }
        } else {
            strM66668h = C27041f.m66668h(value.getCryptoMaxAmount());
            if (strM66668h.length() <= 0) {
                strM66668h = null;
            }
        }
        return C27041f.m66669i(strM66668h, "0");
    }

    @Nullable
    /* JADX INFO: renamed from: M */
    public final String m47438M(@NotNull String amount, @NotNull String quoteType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        if (Intrinsics.areEqual(quoteType, "FIAT")) {
            return amount;
        }
        BigDecimal bigDecimalM47439P = m47439P(amount, quoteType);
        if (bigDecimalM47439P != null) {
            return bigDecimalM47439P.toPlainString();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public final BigDecimal m47439P(@NotNull String amount, @NotNull String quoteType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        String strM47429i0 = m47429i0(quoteType);
        if (strM47429i0 == null) {
            return null;
        }
        return DowngradeExKt.m66535e(amount, null, 1, null).multiply(DowngradeExKt.m66535e(strM47429i0, null, 1, null));
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final LiveData<List<BuyItemPaymentMethod>> m47441R() {
        return this.f39043c0;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final LiveData<Boolean> m47442S() {
        return this.f39049i0;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final LiveData<TradingPairInfo.Response> m47443T() {
        return this.f39042b0;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final LiveData<BuyPaymentMethod.Response.PaymentMethod> m47444U() {
        return this.f39044d0;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final LiveData<C42875h<Boolean>> m47445V() {
        return this.f39046f0;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m47447X(BuyPaymentMethod.Response.PaymentMethod paymentMethod) {
        return FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(paymentMethod.getPaymentMethodCode()), C27041f.m66668h(paymentMethod.getChannelId())) instanceof FastTradeChannel.GooglePay;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final LiveData<Boolean> m47449Z() {
        return this.f39048h0;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m47450a0(BuyItemPaymentMethod buyItemPaymentMethod, BuyPaymentMethod.Response.PaymentMethod paymentMethod) {
        if (!(buyItemPaymentMethod instanceof BuyItemPaymentMethod.ItemNormalPaymentMethod)) {
            return false;
        }
        BuyItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod = (BuyItemPaymentMethod.ItemNormalPaymentMethod) buyItemPaymentMethod;
        return Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodCode(), paymentMethod.getPaymentMethodCode()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getChannelId(), paymentMethod.getChannelId()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getCardInfo(), paymentMethod.getCardInfo()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getP2pInfo(), paymentMethod.getP2pInfo()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().isEnabled(), paymentMethod.isEnabled());
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m47451b0(@NotNull String amount, @NotNull String quoteType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        BuyPaymentMethod.Response.PaymentMethod value = this.f39044d0.getValue();
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
            C43846g.m96568c(new OtcException(e11, "BuyVM limit amount", false, null, 8, null), null, 2, null);
        }
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m47452c0(@NotNull String fiatCurrency, @NotNull String cryptoCurrency, @NotNull String amount, @NotNull String quoteType, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        if (fiatCurrency.length() == 0 || cryptoCurrency.length() == 0) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new BuyVM$loadBuyPaymentMethodList$1(this, z13, fiatCurrency, cryptoCurrency, amount, quoteType, z11, z12, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d0 */
    public final Object m47453d0(List<String> list, Continuation<? super Boolean> continuation) {
        BuyVM$loadCanUseGooglePay$1 buyVM$loadCanUseGooglePay$1;
        Boolean bool;
        Task<Boolean> taskIsReadyToPay;
        if (continuation instanceof BuyVM$loadCanUseGooglePay$1) {
            buyVM$loadCanUseGooglePay$1 = (BuyVM$loadCanUseGooglePay$1) continuation;
            int i11 = buyVM$loadCanUseGooglePay$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                buyVM$loadCanUseGooglePay$1.label = i11 - Integer.MIN_VALUE;
            } else {
                buyVM$loadCanUseGooglePay$1 = new BuyVM$loadCanUseGooglePay$1(this, continuation);
            }
        } else {
            buyVM$loadCanUseGooglePay$1 = new BuyVM$loadCanUseGooglePay$1(this, continuation);
        }
        Object objA = buyVM$loadCanUseGooglePay$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = buyVM$loadCanUseGooglePay$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objA);
                com.kubi.payment.fast.buy.popularpay.googlepay.h hVar = com.kubi.payment.fast.buy.popularpay.googlepay.h.a;
                this.f39045e0 = hVar.e(BaseApplication.INSTANCE.get());
                String strValueOf = String.valueOf(hVar.c(list));
                IsReadyToPayRequest isReadyToPayRequestFromJson = IsReadyToPayRequest.fromJson(strValueOf);
                Intrinsics.checkNotNullExpressionValue(isReadyToPayRequestFromJson, "fromJson(...)");
                PaymentsClient paymentsClient = this.f39045e0;
                if (paymentsClient == null || (taskIsReadyToPay = paymentsClient.isReadyToPay(isReadyToPayRequestFromJson)) == null) {
                    bool = null;
                } else {
                    buyVM$loadCanUseGooglePay$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
                    buyVM$loadCanUseGooglePay$1.L$1 = SpillingKt.nullOutSpilledVariable(strValueOf);
                    buyVM$loadCanUseGooglePay$1.L$2 = SpillingKt.nullOutSpilledVariable(isReadyToPayRequestFromJson);
                    buyVM$loadCanUseGooglePay$1.label = 1;
                    objA = com.kubi.payment.fast.buy.popularpay.googlepay.g.a(taskIsReadyToPay, buyVM$loadCanUseGooglePay$1);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Boxing.boxBoolean(C27025c.m66566d(bool));
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
            bool = (Boolean) objA;
            return Boxing.boxBoolean(C27025c.m66566d(bool));
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(new Throwable("google pay load can use error: " + e11.getMessage()), "payment", false, null, 8, null), null, 2, null);
            return Boxing.boxBoolean(false);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m47454e0(@NotNull String fiatCurrency, @NotNull String cryptoCurrency) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        if (fiatCurrency.length() == 0 || cryptoCurrency.length() == 0) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new BuyVM$loadRecurringInfo$1(this, fiatCurrency, cryptoCurrency, null), 3, null);
    }

    @Nullable
    /* JADX INFO: renamed from: f0 */
    public final String m47455f0(@NotNull String quoteType) {
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        BuyPaymentMethod.Response.PaymentMethod value = this.f39044d0.getValue();
        if (value == null) {
            return null;
        }
        if (Intrinsics.areEqual(quoteType, "FIAT")) {
            String strM66668h = C27041f.m66668h(value.getFiatMaxAmount());
            if (strM66668h.length() > 0) {
                return strM66668h;
            }
            return null;
        }
        String strM66668h2 = C27041f.m66668h(value.getCryptoMaxAmount());
        if (strM66668h2.length() > 0) {
            return strM66668h2;
        }
        return null;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m47456g0(BuyPaymentMethod.Response.PaymentMethod paymentMethod) throws JSONException {
        this.f39044d0.setValue(paymentMethod);
        if (this.f39041a0) {
            this.f39041a0 = false;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paymentMethodCode", paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null);
            jSONObject.put("channelId", paymentMethod != null ? paymentMethod.getChannelId() : null);
            jSONObject.put("pay_fiat_currency", paymentMethod != null ? paymentMethod.getFiatCurrency() : null);
            jSONObject.put("pay_crypto_currency", paymentMethod != null ? paymentMethod.getCryptoCurrency() : null);
            Unit unit = Unit.INSTANCE;
            C43852m.m96595g("B7FastBuy", "page", null, jSONObject, 4, null);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m47457h0(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new BuyVM$preCheck$1(this, fragmentManager, null), 3, null);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m47458j0(@NotNull BuyItemPaymentMethod.ItemNormalPaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        List<BuyItemPaymentMethod> value = this.f39043c0.getValue();
        Object obj = null;
        if (value != null) {
            for (Object obj2 : value) {
                BuyItemPaymentMethod buyItemPaymentMethod = (BuyItemPaymentMethod) obj2;
                if (buyItemPaymentMethod instanceof BuyItemPaymentMethod.ItemNormalPaymentMethod) {
                    BuyItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod = (BuyItemPaymentMethod.ItemNormalPaymentMethod) buyItemPaymentMethod;
                    if (Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodCode(), paymentMethod.getPaymentMethod().getPaymentMethodCode()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodName(), paymentMethod.getPaymentMethod().getPaymentMethodName()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getIconUrl(), paymentMethod.getPaymentMethod().getIconUrl()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getCardInfo(), paymentMethod.getPaymentMethod().getCardInfo()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getP2pInfo(), paymentMethod.getPaymentMethod().getP2pInfo())) {
                        obj = obj2;
                        break;
                    }
                }
            }
            obj = (BuyItemPaymentMethod) obj;
        }
        BuyItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod2 = (BuyItemPaymentMethod.ItemNormalPaymentMethod) obj;
        if (itemNormalPaymentMethod2 != null) {
            itemNormalPaymentMethod2.setSelected(true);
            this.f39044d0.setValue(itemNormalPaymentMethod2.getPaymentMethod());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final Object m47427N(String str, String str2, String str3, String str4, List<BuyPaymentMethod.Response> list, Continuation<? super List<? extends BuyItemPaymentMethod>> continuation) {
        return C41686h.m91049g(C42911a.m94119a(), new BuyVM$convertToPresentationModel$2(this, str3, list, str4, str, str2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final void m47428O(List<? extends BuyItemPaymentMethod> list) throws JSONException {
        BuyPaymentMethod.Response.PaymentMethod paymentMethod;
        Object next;
        BuyItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod;
        Iterator<T> it = list.iterator();
        while (true) {
            paymentMethod = null;
            if (it.hasNext()) {
                next = it.next();
                BuyItemPaymentMethod buyItemPaymentMethod = (BuyItemPaymentMethod) next;
                if ((buyItemPaymentMethod instanceof BuyItemPaymentMethod.ItemNormalPaymentMethod) && C27025c.m66566d(((BuyItemPaymentMethod.ItemNormalPaymentMethod) buyItemPaymentMethod).getPaymentMethod().isEnabled())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next instanceof BuyItemPaymentMethod.ItemNormalPaymentMethod) {
            itemNormalPaymentMethod = (BuyItemPaymentMethod.ItemNormalPaymentMethod) next;
        } else {
            itemNormalPaymentMethod = null;
        }
        if (itemNormalPaymentMethod != null) {
            itemNormalPaymentMethod.setSelected(true);
        }
        if (itemNormalPaymentMethod != null) {
            paymentMethod = itemNormalPaymentMethod.getPaymentMethod();
        }
        m47456g0(paymentMethod);
    }

    /* JADX INFO: renamed from: Q */
    public final Object m47440Q(List<? extends BuyItemPaymentMethod> list, BuyPaymentMethod.Response.PaymentMethod paymentMethod, Continuation<? super BuyItemPaymentMethod.ItemNormalPaymentMethod> continuation) {
        return C41686h.m91049g(C42911a.m94119a(), new BuyVM$findSelectedPaymentMethod$2(list, this, paymentMethod, null), continuation);
    }
}
