package com.kubi.payment.fasttradev2.sell;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.buy.bankcard.manage.ManageCard;
import com.kubi.payment.fast.data.entities.Balance;
import com.kubi.payment.fast.data.entities.SellPaymentMethod;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fasttrade.FastTradeChannel;
import com.kubi.payment.fasttrade.FastTradeChannelHelper;
import com.kubi.payment.fasttradev2.sell.paymentmethod.SellItemPaymentMethod;
import com.kubi.payment.helper.PrecisionHelper;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SellVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)J0\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020)2\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\b\b\u0002\u0010.\u001a\u00020\u000eJB\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010+\u001a\u00020)2\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0010H\u0082@¢\u0006\u0002\u00102J\u0016\u00103\u001a\u00020$2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0012\u00105\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0015H\u0002J&\u00106\u001a\u0004\u0018\u00010&2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u00107\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u00108J\u0018\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u0015H\u0002J\u0010\u0010;\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u0015J\u0006\u0010<\u001a\u00020)J\b\u0010=\u001a\u0004\u0018\u00010)J\n\u0010>\u001a\u0004\u0018\u00010)H\u0002J\u0006\u0010?\u001a\u00020)J\u0006\u0010@\u001a\u00020)J\u0010\u0010A\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010)J\u0016\u0010B\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)J\u0016\u0010C\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)J\u0018\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)J\u0018\u0010F\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)J\u0012\u0010G\u001a\u0004\u0018\u00010)2\u0006\u0010-\u001a\u00020)H\u0002J\f\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u0010J\u0016\u0010J\u001a\u00020$2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NR\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\fR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\fR\u001b\u0010\u001e\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006O"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/sell/SellVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "repository", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;)V", "_balance", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/payment/fast/data/entities/Balance$Response;", "balance", "Landroidx/lifecycle/LiveData;", "getBalance", "()Landroidx/lifecycle/LiveData;", "isFirstLoading", "", "_paymentMethodList", "", "Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellItemPaymentMethod;", "paymentMethodList", "getPaymentMethodList", "_selectedPaymentMethod", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;", "selectedPaymentMethod", "getSelectedPaymentMethod", "_showSelectedPaymentMethod", "showSelectedPaymentMethod", "getShowSelectedPaymentMethod", "_preCheckPassed", "preCheckPassed", "getPreCheckPassed", "useMultiAccountWidget", "getUseMultiAccountWidget", "()Z", "useMultiAccountWidget$delegate", "Lkotlin/Lazy;", "updateSelectedPaymentMethod", "", "paymentMethod", "Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellItemPaymentMethod$ItemNormalPaymentMethod;", "loadCryptoCurrencyBalance", "cryptoCurrency", "", "loadSellPaymentMethodList", "fiatCurrency", "amount", "quoteType", "isSelectedPaymentMethod", "convertToPresentationModel", "categoryPaymentMethods", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultSelectedPaymentMethod", "paymentMethods", "notifySelectedPaymentMethodChanged", "findSelectedPaymentMethod", "tempSelectedPaymentMethod", "(Ljava/util/List;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSamePaymentMethod", "itemSellPaymentMethod", "isAddNewCard", "calculateSellAllAmount", "availableBalance", "transferBalance", "displayBalance", "displayTransferBalance", "isInitialAmount", "isValidBalance", "isValidAmount", "estimateAmount", "Ljava/math/BigDecimal;", "calculateCryptoAmount", "unitPrice", "buildManageCardList", "Lcom/kubi/payment/fast/buy/bankcard/manage/ManageCard;", "preCheck", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "context", "Landroid/content/Context;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSellVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellVM.kt\ncom/kubi/payment/fasttradev2/sell/SellVM\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,686:1\n44#2,2:687\n774#3:689\n865#3,2:690\n1869#3,2:692\n35#4,4:694\n39#4:700\n44#5,2:698\n*S KotlinDebug\n*F\n+ 1 SellVM.kt\ncom/kubi/payment/fasttradev2/sell/SellVM\n*L\n529#1:687,2\n577#1:689\n577#1:690,2\n584#1:692,2\n103#1:694,4\n103#1:700\n103#1:698,2\n*E\n"})
public final class SellVM extends BasePaymentVM<IFastRepository> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IFastRepository f39424Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<Balance.Response> f39425a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f39426b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<List<SellItemPaymentMethod>> f39427c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<SellPaymentMethod.Response.PaymentMethod> f39428d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<Boolean> f39429e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<Boolean> f39430f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f39431g0;

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.sell.SellVM$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C20928a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m48073Y(@Nullable SellPaymentMethod.Response.PaymentMethod paymentMethod) {
        return paymentMethod != null && (FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(paymentMethod.getPaymentMethodCode()), C27041f.m66668h(paymentMethod.getChannelId())) instanceof FastTradeChannel.BankCard) && paymentMethod.getCardInfo() == null;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m48074Z(@Nullable String str) {
        return DowngradeExKt.m66535e(str, null, 1, null).compareTo(BigDecimal.ZERO) <= 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellVM(@NotNull IFastRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f39424Z = repository;
        this.f39425a0 = new MutableLiveData<>();
        this.f39426b0 = true;
        this.f39427c0 = new MutableLiveData<>();
        this.f39428d0 = new MutableLiveData<>();
        this.f39429e0 = new MutableLiveData<>();
        this.f39430f0 = new MutableLiveData<>();
        this.f39431g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.fasttradev2.sell.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(SellVM.m48053l0());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public final boolean m48050X() {
        return ((Boolean) this.f39431g0.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public final void m48051f0(SellPaymentMethod.Response.PaymentMethod paymentMethod) throws JSONException {
        this.f39428d0.setValue(paymentMethod);
        if (this.f39426b0) {
            this.f39426b0 = false;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paymentMethodCode", paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null);
            jSONObject.put("channelId", paymentMethod != null ? paymentMethod.getChannelId() : null);
            jSONObject.put("pay_fiat_currency", paymentMethod != null ? paymentMethod.getFiatCurrency() : null);
            jSONObject.put("pay_crypto_currency", paymentMethod != null ? paymentMethod.getCryptoCurrency() : null);
            Unit unit = Unit.INSTANCE;
            C43852m.m96595g("B7FastSell", "page", null, jSONObject, 4, null);
        }
    }

    /* JADX INFO: renamed from: i0 */
    private final String m48052i0(String str) {
        if (Intrinsics.areEqual(str, "FIAT")) {
            SellPaymentMethod.Response.PaymentMethod value = this.f39428d0.getValue();
            if (value != null) {
                return value.getFiatUnitPrice();
            }
            return null;
        }
        SellPaymentMethod.Response.PaymentMethod value2 = this.f39428d0.getValue();
        if (value2 != null) {
            return value2.getCryptoUnitPrice();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final boolean m48053l0() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C20928a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_use_fund_component_key", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public final String m48061I() {
        SellPaymentMethod.Response.PaymentMethod value = this.f39428d0.getValue();
        if (value == null) {
            if (m48050X()) {
                Balance.Response value2 = this.f39425a0.getValue();
                if (value2 != null) {
                    return value2.getAvailableBalanceV2();
                }
                return null;
            }
            Balance.Response value3 = this.f39425a0.getValue();
            if (value3 != null) {
                return value3.getAvailableBalance();
            }
            return null;
        }
        if (FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(value.getPaymentMethodCode()), C27041f.m66668h(value.getChannelId())) instanceof FastTradeChannel.BankCard) {
            if (m48050X()) {
                Balance.Response value4 = this.f39425a0.getValue();
                if (value4 != null) {
                    return value4.getCanWithdrawBalanceV2();
                }
                return null;
            }
            Balance.Response value5 = this.f39425a0.getValue();
            if (value5 != null) {
                return value5.getCanWithdrawBalance();
            }
            return null;
        }
        if (m48050X()) {
            Balance.Response value6 = this.f39425a0.getValue();
            if (value6 != null) {
                return value6.getAvailableBalanceV2();
            }
            return null;
        }
        Balance.Response value7 = this.f39425a0.getValue();
        if (value7 != null) {
            return value7.getAvailableBalance();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final List<ManageCard> m48062J() {
        ArrayList<SellItemPaymentMethod> arrayList;
        ArrayList arrayList2 = new ArrayList();
        List<SellItemPaymentMethod> value = this.f39427c0.getValue();
        if (value != null) {
            arrayList = new ArrayList();
            for (Object obj : value) {
                SellItemPaymentMethod sellItemPaymentMethod = (SellItemPaymentMethod) obj;
                if (sellItemPaymentMethod instanceof SellItemPaymentMethod.ItemNormalPaymentMethod) {
                    SellItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod = (SellItemPaymentMethod.ItemNormalPaymentMethod) sellItemPaymentMethod;
                    if ((FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodCode()), C27041f.m66668h(itemNormalPaymentMethod.getPaymentMethod().getChannelId())) instanceof FastTradeChannel.BankCard) && itemNormalPaymentMethod.getPaymentMethod().getCardInfo() != null) {
                        arrayList.add(obj);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            for (SellItemPaymentMethod sellItemPaymentMethod2 : arrayList) {
                if (sellItemPaymentMethod2 instanceof SellItemPaymentMethod.ItemNormalPaymentMethod) {
                    SellItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod2 = (SellItemPaymentMethod.ItemNormalPaymentMethod) sellItemPaymentMethod2;
                    SellPaymentMethod.Response.PaymentMethod.CardInfo cardInfo = itemNormalPaymentMethod2.getPaymentMethod().getCardInfo();
                    arrayList2.add(new ManageCard(cardInfo != null ? cardInfo.getCardId() : null, itemNormalPaymentMethod2.getPaymentMethod().getIconUrl(), itemNormalPaymentMethod2.getPaymentMethod().getPaymentMethodName(), (String) null));
                }
            }
        }
        return arrayList2;
    }

    @Nullable
    /* JADX INFO: renamed from: K */
    public final String m48063K(@NotNull String amount, @NotNull String quoteType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        if (Intrinsics.areEqual(quoteType, "CRYPTO")) {
            return amount;
        }
        BigDecimal bigDecimalM48067Q = m48067Q(amount, quoteType);
        if (bigDecimalM48067Q != null) {
            return bigDecimalM48067Q.toPlainString();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: Q */
    public final BigDecimal m48067Q(@NotNull String amount, @NotNull String quoteType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        String strM48052i0 = m48052i0(quoteType);
        if (strM48052i0 == null) {
            return null;
        }
        return DowngradeExKt.m66535e(amount, null, 1, null).multiply(DowngradeExKt.m66535e(strM48052i0, null, 1, null));
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final LiveData<Balance.Response> m48068S() {
        return this.f39425a0;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final LiveData<List<SellItemPaymentMethod>> m48069T() {
        return this.f39427c0;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final LiveData<Boolean> m48070U() {
        return this.f39430f0;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final LiveData<SellPaymentMethod.Response.PaymentMethod> m48071V() {
        return this.f39428d0;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final LiveData<Boolean> m48072W() {
        return this.f39429e0;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m48075a0(SellItemPaymentMethod sellItemPaymentMethod, SellPaymentMethod.Response.PaymentMethod paymentMethod) {
        if (!(sellItemPaymentMethod instanceof SellItemPaymentMethod.ItemNormalPaymentMethod)) {
            return false;
        }
        SellItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod = (SellItemPaymentMethod.ItemNormalPaymentMethod) sellItemPaymentMethod;
        return Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodCode(), paymentMethod.getPaymentMethodCode()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getChannelId(), paymentMethod.getChannelId()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodName(), paymentMethod.getPaymentMethodName()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getCardInfo(), paymentMethod.getCardInfo()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getP2pInfo(), paymentMethod.getP2pInfo()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().isEnabled(), paymentMethod.isEnabled());
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m48076b0(@NotNull String amount, @NotNull String quoteType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        SellPaymentMethod.Response.PaymentMethod value = this.f39428d0.getValue();
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
    public final boolean m48077c0(@NotNull String amount, @NotNull String quoteType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        String strM48061I = m48061I();
        if (strM48061I == null || strM48061I.length() == 0) {
            return true;
        }
        return DowngradeExKt.m66535e(strM48061I, null, 1, null).compareTo(DowngradeExKt.m66535e(m48063K(amount, quoteType), null, 1, null)) >= 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m48078d0(@NotNull String cryptoCurrency) {
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        if (cryptoCurrency.length() == 0) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new SellVM$loadCryptoCurrencyBalance$1(this, cryptoCurrency, null), 3, null);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m48079e0(@NotNull String fiatCurrency, @NotNull String cryptoCurrency, @NotNull String amount, @NotNull String quoteType, boolean z11) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        if (fiatCurrency.length() == 0 || cryptoCurrency.length() == 0) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new SellVM$loadSellPaymentMethodList$1(this, fiatCurrency, cryptoCurrency, amount, quoteType, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m48080g0(@NotNull FragmentManager fragmentManager, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(context, "context");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new SellVM$preCheck$1(this, fragmentManager, context, null), 3, null);
    }

    /* JADX INFO: renamed from: h0 */
    public final String m48081h0() {
        SellPaymentMethod.Response.PaymentMethod value = this.f39428d0.getValue();
        if (value == null) {
            Balance.Response value2 = this.f39425a0.getValue();
            if (value2 != null) {
                return value2.getAvailableBalance();
            }
            return null;
        }
        if (FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(value.getPaymentMethodCode()), C27041f.m66668h(value.getChannelId())) instanceof FastTradeChannel.BankCard) {
            Balance.Response value3 = this.f39425a0.getValue();
            if (value3 != null) {
                return value3.getCanWithdrawBalance();
            }
            return null;
        }
        Balance.Response value4 = this.f39425a0.getValue();
        if (value4 != null) {
            return value4.getAvailableBalance();
        }
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m48082j0(@NotNull SellItemPaymentMethod.ItemNormalPaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        List<SellItemPaymentMethod> value = this.f39427c0.getValue();
        Object obj = null;
        if (value != null) {
            for (Object obj2 : value) {
                SellItemPaymentMethod sellItemPaymentMethod = (SellItemPaymentMethod) obj2;
                if (sellItemPaymentMethod instanceof SellItemPaymentMethod.ItemNormalPaymentMethod) {
                    SellItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod = (SellItemPaymentMethod.ItemNormalPaymentMethod) sellItemPaymentMethod;
                    if (Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodCode(), paymentMethod.getPaymentMethod().getPaymentMethodCode()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodName(), paymentMethod.getPaymentMethod().getPaymentMethodName()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getIconUrl(), paymentMethod.getPaymentMethod().getIconUrl()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getCardInfo(), paymentMethod.getPaymentMethod().getCardInfo()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getP2pInfo(), paymentMethod.getPaymentMethod().getP2pInfo())) {
                        obj = obj2;
                        break;
                    }
                }
            }
            obj = (SellItemPaymentMethod) obj;
        }
        SellItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod2 = (SellItemPaymentMethod.ItemNormalPaymentMethod) obj;
        if (itemNormalPaymentMethod2 != null) {
            itemNormalPaymentMethod2.setSelected(true);
            this.f39428d0.setValue(itemNormalPaymentMethod2.getPaymentMethod());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final Object m48047M(String str, String str2, String str3, String str4, List<SellPaymentMethod.Response> list, Continuation<? super List<? extends SellItemPaymentMethod>> continuation) {
        return C41686h.m91049g(C42911a.m94119a(), new SellVM$convertToPresentationModel$2(this, str3, list, str4, str, str2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final void m48048N(List<? extends SellItemPaymentMethod> list) throws JSONException {
        SellPaymentMethod.Response.PaymentMethod paymentMethod;
        Object next;
        SellItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod;
        Iterator<T> it = list.iterator();
        while (true) {
            paymentMethod = null;
            if (it.hasNext()) {
                next = it.next();
                SellItemPaymentMethod sellItemPaymentMethod = (SellItemPaymentMethod) next;
                if ((sellItemPaymentMethod instanceof SellItemPaymentMethod.ItemNormalPaymentMethod) && C27025c.m66566d(((SellItemPaymentMethod.ItemNormalPaymentMethod) sellItemPaymentMethod).getPaymentMethod().isEnabled())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next instanceof SellItemPaymentMethod.ItemNormalPaymentMethod) {
            itemNormalPaymentMethod = (SellItemPaymentMethod.ItemNormalPaymentMethod) next;
        } else {
            itemNormalPaymentMethod = null;
        }
        if (itemNormalPaymentMethod != null) {
            itemNormalPaymentMethod.setSelected(true);
        }
        if (itemNormalPaymentMethod != null) {
            paymentMethod = itemNormalPaymentMethod.getPaymentMethod();
        }
        m48051f0(paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public final Object m48049R(List<? extends SellItemPaymentMethod> list, SellPaymentMethod.Response.PaymentMethod paymentMethod, Continuation<? super SellItemPaymentMethod.ItemNormalPaymentMethod> continuation) {
        return C41686h.m91049g(C42911a.m94119a(), new SellVM$findSelectedPaymentMethod$2(list, this, paymentMethod, null), continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final String m48064L() {
        String strM48061I = m48061I();
        SellPaymentMethod.Response.PaymentMethod value = this.f39428d0.getValue();
        if (value != null) {
            String strM66668h = C27041f.m66668h(value.getCryptoMaxAmount());
            if (strM66668h.length() > 0) {
                strM48061I = DowngradeExKt.m66535e(strM48061I, null, 1, null).min(DowngradeExKt.m66535e(strM66668h, null, 1, null)).toPlainString();
            }
        }
        return C27041f.m66669i(strM48061I, "0");
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final String m48065O() {
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(m48061I());
        String strM92640e = null;
        if (bigDecimalM66536f != null) {
            PrecisionHelper precisionHelper = PrecisionHelper.f39545a;
            Balance.Response value = this.f39425a0.getValue();
            if (value != null) {
                strM92640e = value.getCurrency();
            }
            strM92640e = C42180b.m92640e(bigDecimalM66536f, null, precisionHelper.m48247a(C27041f.m66668h(strM92640e)), false, false, false, 0, null, 125, null);
        }
        return C42180b.m92647l(strM92640e);
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final String m48066P() {
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(m48081h0());
        String strM92640e = null;
        if (bigDecimalM66536f != null) {
            PrecisionHelper precisionHelper = PrecisionHelper.f39545a;
            Balance.Response value = this.f39425a0.getValue();
            if (value != null) {
                strM92640e = value.getCurrency();
            }
            strM92640e = C42180b.m92640e(bigDecimalM66536f, null, precisionHelper.m48247a(C27041f.m66668h(strM92640e)), false, false, false, 0, null, 109, null);
        }
        return C42180b.m92647l(strM92640e);
    }
}
