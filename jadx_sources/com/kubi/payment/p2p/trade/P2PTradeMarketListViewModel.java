package com.kubi.payment.p2p.trade;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.otc.entity.OtcInfoEntity;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.helper.PreCheckHelper;
import com.kubi.payment.p2p.data.entities.ExpressBuyPreCheck;
import com.kubi.payment.p2p.data.entities.P2PTradingPairInfo;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.utils.extensions.C27025c;
import ht.C38346y;
import java.math.BigDecimal;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.C42874g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: P2PTradeMarketListViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u000b\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eJ\u0010\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u000eJ\u001e\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000eJ\"\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001c2\b\u0010(\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J \u0010)\u001a\u00020\u001c2\b\u0010(\u001a\u0004\u0018\u00010\u000e2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000eJ\u0010\u0010,\u001a\u00020\u001c2\b\u0010-\u001a\u0004\u0018\u00010\bJ\u000e\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\bJ\u0010\u00100\u001a\u00020\u001c2\b\b\u0002\u00101\u001a\u00020\u001cJ.\u00102\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\f¨\u00066"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/P2PTradeMarketListViewModel;", "Lcom/kubi/payment/base/BaseViewModel;", "repository", "Lcom/kubi/payment/p2p/data/source/IP2PRepository;", "<init>", "(Lcom/kubi/payment/p2p/data/source/IP2PRepository;)V", "_tradeDetailInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/otc/entity/OtcInfoEntity;", "tradeDetailInfo", "Landroidx/lifecycle/LiveData;", "getTradeDetailInfo", "()Landroidx/lifecycle/LiveData;", "_tradeInfoFailure", "", "tradeInfoFailure", "getTradeInfoFailure", "totalBalance", "Ljava/math/BigDecimal;", "_tradingPairInfo", "Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Response;", "tradingPairInfo", "getTradingPairInfo", "_expressBuyPreCheck", "Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Response;", "expressBuyPreCheck", "getExpressBuyPreCheck", "isValid", "", "targetAmount", "", "id", "isBlocked", "status", "loadTradingPairInfo", "fiatCurrency", "cryptoCurrency", "tradeType", "isValidAmount", "isFiatCurrencyMode", "content", "validateAmountInRange", "minAmount", "maxAmount", "isOnline", "data", "isLimited", "ad", "preCheck", "isSell", "expressBuyPreCheckByServer", "quoteType", "amount", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nP2PTradeMarketListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PTradeMarketListViewModel.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketListViewModel\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,237:1\n44#2,2:238\n*S KotlinDebug\n*F\n+ 1 P2PTradeMarketListViewModel.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketListViewModel\n*L\n156#1:238,2\n*E\n"})
public final class P2PTradeMarketListViewModel extends C42874g {

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final Companion f40021d0 = new Companion(null);

    /* JADX INFO: renamed from: X */
    @NotNull
    public final IP2PRepository f40022X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<OtcInfoEntity> f40023Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<String> f40024Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public BigDecimal f40025a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<P2PTradingPairInfo.Response> f40026b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<ExpressBuyPreCheck.Response> f40027c0;

    /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.P2PTradeMarketListViewModel$1 */
    /* JADX INFO: compiled from: P2PTradeMarketListViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.payment.p2p.trade.P2PTradeMarketListViewModel$1", m90122f = "P2PTradeMarketListViewModel.kt", m90123i = {}, m90124l = {69}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C212531 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C212531(Continuation<? super C212531> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return P2PTradeMarketListViewModel.this.new C212531(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C212531) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            P2PTradeMarketListViewModel p2PTradeMarketListViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    p2PTradeMarketListViewModel = (P2PTradeMarketListViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                P2PTradeMarketListViewModel p2PTradeMarketListViewModel2 = P2PTradeMarketListViewModel.this;
                IAssetsCenterService iAssetsCenterServiceM45457f = OtcDepend.f38138a.m45457f();
                this.L$0 = p2PTradeMarketListViewModel2;
                this.label = 1;
                Object objMo15350p = iAssetsCenterServiceM45457f.mo15350p("USDT", this);
                if (objMo15350p == coroutine_suspended) {
                    return coroutine_suspended;
                }
                p2PTradeMarketListViewModel = p2PTradeMarketListViewModel2;
                obj = objMo15350p;
            }
            p2PTradeMarketListViewModel.f40025a0 = (BigDecimal) obj;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: P2PTradeMarketListViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/P2PTradeMarketListViewModel$Companion;", "", "<init>", "()V", "STATUS_ONLINE", "", "TRADE_LIMIT_DIALOG_TYPE_0", "", "TRADE_LIMIT_DIALOG_TYPE_1", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public P2PTradeMarketListViewModel(@NotNull IP2PRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f40022X = repository;
        this.f40023Y = new MutableLiveData<>();
        this.f40024Z = new MutableLiveData<>();
        this.f40026b0 = new MutableLiveData<>();
        this.f40027c0 = new MutableLiveData<>();
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C212531(null), 3, null);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ boolean m49282L(P2PTradeMarketListViewModel p2PTradeMarketListViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return p2PTradeMarketListViewModel.m49301K(z11);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final LiveData<ExpressBuyPreCheck.Response> m49291A() {
        return this.f40027c0;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final LiveData<OtcInfoEntity> m49292B() {
        return this.f40023Y;
    }

    /* JADX INFO: renamed from: C */
    public final void m49293C(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        m94034o().setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PTradeMarketListViewModel$getTradeDetailInfo$1(this, id2, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final LiveData<String> m49294D() {
        return this.f40024Z;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final LiveData<P2PTradingPairInfo.Response> m49295E() {
        return this.f40026b0;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m49296F(@Nullable String str) {
        return Intrinsics.areEqual(str, "1");
    }

    /* JADX INFO: renamed from: G */
    public final boolean m49297G(@NotNull OtcInfoEntity ad2) {
        Integer tradeLimitDialogType;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Integer tradeLimitDialogType2 = ad2.getTradeLimitDialogType();
        return (tradeLimitDialogType2 != null && tradeLimitDialogType2.intValue() == 0) || ((tradeLimitDialogType = ad2.getTradeLimitDialogType()) != null && tradeLimitDialogType.intValue() == 1) || C27025c.m66566d(ad2.getSelf());
    }

    /* JADX INFO: renamed from: H */
    public final boolean m49298H(@Nullable OtcInfoEntity otcInfoEntity) {
        return Intrinsics.areEqual(otcInfoEntity != null ? otcInfoEntity.getOnlineStatus() : null, "Online");
    }

    /* JADX INFO: renamed from: I */
    public final boolean m49299I(@Nullable BigDecimal bigDecimal) {
        BigDecimal bigDecimal2 = this.f40025a0;
        return bigDecimal2 == null || bigDecimal == null || bigDecimal2.compareTo(bigDecimal) >= 0;
    }

    /* JADX INFO: renamed from: J */
    public final void m49300J(@NotNull String fiatCurrency, @NotNull String cryptoCurrency, @NotNull String tradeType) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        if (fiatCurrency.length() == 0 || cryptoCurrency.length() == 0) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PTradeMarketListViewModel$loadTradingPairInfo$1(fiatCurrency, cryptoCurrency, tradeType, this, null), 3, null);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m49301K(boolean z11) {
        PreCheckHelper preCheckHelper = PreCheckHelper.f39543a;
        boolean z12 = preCheckHelper.m48238i() && preCheckHelper.m48235f();
        if (z11) {
            return z12 && preCheckHelper.m48237h();
        }
        return z12;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m49302M(@Nullable String str, @NotNull String minAmount, @NotNull String maxAmount) {
        Intrinsics.checkNotNullParameter(minAmount, "minAmount");
        Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
        if (minAmount.length() == 0 || maxAmount.length() == 0 || str == null || str.length() == 0) {
            return true;
        }
        BigDecimal bigDecimalM86490A = C38346y.m86490A(str);
        return (bigDecimalM86490A.compareTo(C38346y.m86490A(minAmount)) == -1 || bigDecimalM86490A.compareTo(C38346y.m86490A(maxAmount)) == 1) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    public final void m49303z(@NotNull String fiatCurrency, @NotNull String cryptoCurrency, @NotNull String quoteType, @NotNull String amount, @NotNull String tradeType) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PTradeMarketListViewModel$expressBuyPreCheckByServer$1(this, fiatCurrency, cryptoCurrency, quoteType, amount, tradeType, null), 3, null);
    }
}
