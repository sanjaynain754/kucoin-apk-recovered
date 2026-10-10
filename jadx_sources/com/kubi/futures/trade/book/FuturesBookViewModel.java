package com.kubi.futures.trade.book;

import android.os.CountDownTimer;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.C13228l;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.kumex.data.market.model.PriceEntity;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.OrdersPageEntityWrapper;
import com.kubi.kumex.logic.book.BookEntity;
import com.kubi.kumex.trade.FuturesFragment;
import com.kubi.kumex.utils.Log;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27050g0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37878b0;
import im.BookAmountConfig;
import im.C38683c;
import im.DisplayBook;
import im.DisplayBookItem;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import ki.C41050b;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37213a;
import p236em.C37214b;
import p314hi.InterfaceC38213a;
import p429lf.C42180b;
import p801yl.C46527h0;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: FuturesBookViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000201H\u0016J\u0006\u00103\u001a\u000201J\b\u00104\u001a\u000201H\u0002J\u000e\u00105\u001a\u0002012\u0006\u00106\u001a\u00020-J\b\u00107\u001a\u000201H\u0002J\u0018\u00108\u001a\u00020 *\u0004\u0018\u0001092\b\b\u0002\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u000201H\u0002J\u0010\u0010=\u001a\u0002012\u0006\u0010>\u001a\u00020\u0005H\u0002J\u0010\u0010?\u001a\u0002012\b\u00106\u001a\u0004\u0018\u00010-J\u0006\u0010@\u001a\u000201J\u0010\u0010A\u001a\u0002012\b\u0010B\u001a\u0004\u0018\u00010#J\u0012\u0010C\u001a\u0002012\b\u0010D\u001a\u0004\u0018\u00010\u000fH\u0002J@\u0010E\u001a\u0002012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\f2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010I\u001a\u00020-2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020)0KH\u0002J\u0006\u0010L\u001a\u00020+J\b\u0010M\u001a\u000201H\u0002J\b\u0010N\u001a\u000201H\u0002J\u0017\u0010O\u001a\u0002012\b\u0010P\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0002\u0010QJ\u0010\u0010R\u001a\u00020)2\u0006\u0010I\u001a\u00020-H\u0002J\b\u0010S\u001a\u000201H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R;\u0010\u001e\u001a,\u0012(\u0012&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\u001f0\u001f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0011R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006T"}, m90084d2 = {"Lcom/kubi/futures/trade/book/FuturesBookViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "tag", "", "visibleDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "bookDisposable", "fundingRateDisposable", "_activeOrdersWithTrial", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "mDisplayBookLiveData", "Lcom/kubi/kumex/logic/book/DisplayBook;", "getMDisplayBookLiveData", "()Landroidx/lifecycle/MutableLiveData;", "mTickerLiveData", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "getMTickerLiveData", "mPriceLiveData", "Lcom/kubi/kumex/data/market/model/PriceEntity;", "getMPriceLiveData", "fundingRate", "Lcom/kubi/kumex/data/market/model/FundingRateEntity;", "getFundingRate", "fundingRateCountDown", "", "getFundingRateCountDown", "bookLiveData", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "getBookLiveData", "originBookEntity", "Lcom/kubi/kumex/logic/book/BookEntity;", "getOriginBookEntity", "()Lcom/kubi/kumex/logic/book/BookEntity;", "setOriginBookEntity", "(Lcom/kubi/kumex/logic/book/BookEntity;)V", "isSubscribe", "", "mBookTransformer", "Lcom/kubi/kumex/logic/book/BookTransformer;", "mContractConfig", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "countDownTimer", "Landroid/os/CountDownTimer;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "refresh", "unSubscribe", "onContractChanged", "contractConfig", "subscribe", "safeGetBigDecimal", "", "index", "", "subscribeBook", "subscribeTotalActiveOrders", "symbol", "setBookConfigByExternalConfig", "onBookPrecisionChanged", "bookTransformer", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "handleBookDelegationMark", "displayBook", "reassignOfBookDelegationMark", "list", "Lcom/kubi/kumex/logic/book/DisplayBookItem;", "orderList", "contract", "apply", "Lkotlin/Function1;", "getBookTransformer", "bindFundingRate", "unBindFundingRateScope", "startUpFundingRateCountdown", "settleTime", "(Ljava/lang/Long;)V", "isSettleCountdownEnable", "onCleared", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesBookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesBookViewModel.kt\ncom/kubi/futures/trade/book/FuturesBookViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,388:1\n67#2:389\n*S KotlinDebug\n*F\n+ 1 FuturesBookViewModel.kt\ncom/kubi/futures/trade/book/FuturesBookViewModel\n*L\n204#1:389\n*E\n"})
public final class FuturesBookViewModel extends BaseVM {

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public BookEntity f23669g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f23670h0;

    /* JADX INFO: renamed from: j0 */
    @Nullable
    public InterfaceC38213a f23672j0;

    /* JADX INFO: renamed from: k0 */
    @Nullable
    public CountDownTimer f23673k0;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final String f23658V = "FuturesBookViewModel";

    /* JADX INFO: renamed from: W */
    @NotNull
    public final CompositeDisposable f23659W = new CompositeDisposable();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final CompositeDisposable f23660X = new CompositeDisposable();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final CompositeDisposable f23661Y = new CompositeDisposable();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<List<OrderEntity>> f23662Z = new MutableLiveData<>();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<DisplayBook> f23663a0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<TickerEntity> f23664b0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<PriceEntity> f23665c0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<FundingRateEntity> f23666d0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<Long> f23667e0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<Pair<Pair<BigDecimal, BigDecimal>, Pair<BigDecimal, BigDecimal>>> f23668f0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final C38683c f23671i0 = new C38683c();

    /* JADX INFO: renamed from: com.kubi.futures.trade.book.FuturesBookViewModel$a */
    /* JADX INFO: compiled from: FuturesBookViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/futures/trade/book/FuturesBookViewModel$startUpFundingRateCountdown$1", "Landroid/os/CountDownTimer;", "onTick", "", "millisUntilFinished", "", "onFinish", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CountDownTimerC13628a extends CountDownTimer {
        public CountDownTimerC13628a(long j11) {
            super(j11, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            FuturesBookViewModel.this.m26915j0().postValue(0L);
            FuturesBookViewModel.this.m26920o1();
            FuturesBookViewModel.this.m26908W();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            FuturesBookViewModel.this.m26915j0().postValue(Long.valueOf(millisUntilFinished / ((long) 1000)));
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ BigDecimal m26820E0(FuturesBookViewModel futuresBookViewModel, double[] dArr, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return futuresBookViewModel.m26905D0(dArr, i11);
    }

    /* JADX INFO: renamed from: H0 */
    private final void m26824H0() {
        InterfaceC38213a interfaceC38213a;
        if (this.f23670h0 || (interfaceC38213a = this.f23672j0) == null) {
            return;
        }
        this.f23670h0 = true;
        Log.f30813a.m36615a(this.f23658V, "subscribe");
        m26909a1();
        CompositeDisposable compositeDisposable = this.f23659W;
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        Observable<TickerEntity> observableMo24802b = repositoryServiceLocator.m20286e().mo24802b(interfaceC38213a.getSymbol());
        FuturesFragment.Companion companion = FuturesFragment.f30411o0;
        Observable observableObserveOn = C27050g0.m66716a(observableMo24802b, companion.scrollPredicate()).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.book.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FuturesBookViewModel.m26826I0((TickerEntity) obj));
            }
        };
        Observable observableFilter = observableObserveOn.filter(new Predicate() { // from class: com.kubi.futures.trade.book.p1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return FuturesBookViewModel.m26828J0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.book.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookViewModel.m26846S0(this.f23688b, (TickerEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.book.e0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesBookViewModel.m26848T0(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.futures.trade.book.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookViewModel.m26850U0(this.f23693b, (Throwable) obj);
            }
        };
        compositeDisposable.add(observableFilter.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.book.g0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesBookViewModel.m26852V0(function3, obj);
            }
        }));
        CompositeDisposable compositeDisposable2 = this.f23659W;
        Observable<PriceEntity> observableMo24807g = repositoryServiceLocator.m20286e().mo24807g(interfaceC38213a.getSymbol());
        final Function1 function4 = new Function1() { // from class: com.kubi.futures.trade.book.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FuturesBookViewModel.m26853W0((PriceEntity) obj));
            }
        };
        Observable<PriceEntity> observableFilter2 = observableMo24807g.filter(new Predicate() { // from class: com.kubi.futures.trade.book.i0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return FuturesBookViewModel.m26855X0(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter2, "filter(...)");
        Observable observableObserveOn2 = C27050g0.m66716a(observableFilter2, companion.scrollPredicate()).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function5 = new Function1() { // from class: com.kubi.futures.trade.book.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookViewModel.m26857Y0(this.f23704b, (PriceEntity) obj);
            }
        };
        Consumer consumer2 = new Consumer() { // from class: com.kubi.futures.trade.book.k0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesBookViewModel.m26859Z0(function5, obj);
            }
        };
        final Function1 function6 = new Function1() { // from class: com.kubi.futures.trade.book.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookViewModel.m26830K0(this.f23713b, (Throwable) obj);
            }
        };
        compositeDisposable2.add(observableObserveOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.futures.trade.book.y0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesBookViewModel.m26832L0(function6, obj);
            }
        }));
        CompositeDisposable compositeDisposable3 = this.f23659W;
        Observable observableObserveOn3 = C27050g0.m66716a(repositoryServiceLocator.m20286e().mo24801a(interfaceC38213a.getSymbol(), 1), companion.scrollPredicate()).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function7 = new Function1() { // from class: com.kubi.futures.trade.book.j1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FuturesBookViewModel.m26834M0((BookEntity) obj));
            }
        };
        Observable observableFilter3 = observableObserveOn3.filter(new Predicate() { // from class: com.kubi.futures.trade.book.k1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return FuturesBookViewModel.m26836N0(function7, obj);
            }
        });
        final Function1 function8 = new Function1() { // from class: com.kubi.futures.trade.book.l1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookViewModel.m26838O0(this.f23709b, (BookEntity) obj);
            }
        };
        Consumer consumer3 = new Consumer() { // from class: com.kubi.futures.trade.book.m1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesBookViewModel.m26840P0(function8, obj);
            }
        };
        final Function1 function9 = new Function1() { // from class: com.kubi.futures.trade.book.n1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookViewModel.m26842Q0(this.f23714b, (Throwable) obj);
            }
        };
        compositeDisposable3.add(observableFilter3.subscribe(consumer3, new Consumer() { // from class: com.kubi.futures.trade.book.o1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesBookViewModel.m26844R0(function9, obj);
            }
        }));
        m26913h1(interfaceC38213a.getSymbol());
        m26908W();
    }

    /* JADX INFO: renamed from: I0 */
    public static final boolean m26826I0(TickerEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !com.kubi.futures.trade.submit.panel.premarket.g.a.o(C46527h0.f104291a.m102673I());
    }

    /* JADX INFO: renamed from: J0 */
    public static final boolean m26828J0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: K0 */
    public static final Unit m26830K0(FuturesBookViewModel futuresBookViewModel, Throwable th2) {
        Log log = Log.f30813a;
        String str = futuresBookViewModel.f23658V + "-observePrice";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M0 */
    public static final boolean m26834M0(BookEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !com.kubi.futures.trade.submit.panel.premarket.g.a.o(C46527h0.f104291a.m102673I());
    }

    /* JADX INFO: renamed from: N0 */
    public static final boolean m26836N0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: O0 */
    public static final Unit m26838O0(FuturesBookViewModel futuresBookViewModel, BookEntity bookEntity) {
        Object objM103844constructorimpl;
        MutableLiveData<Pair<Pair<BigDecimal, BigDecimal>, Pair<BigDecimal, BigDecimal>>> mutableLiveData = futuresBookViewModel.f23668f0;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(new Pair(TuplesKt.m90091to(m26820E0(futuresBookViewModel, (double[]) CollectionsKt.firstOrNull((List) bookEntity.getBids()), 0, 1, null), m26820E0(futuresBookViewModel, (double[]) CollectionsKt.lastOrNull((List) bookEntity.getAsks()), 0, 1, null)), TuplesKt.m90091to(m26820E0(futuresBookViewModel, (double[]) CollectionsKt.getOrNull(bookEntity.getBids(), 4), 0, 1, null), m26820E0(futuresBookViewModel, (double[]) CollectionsKt.getOrNull(CollectionsKt.reversed(bookEntity.getAsks()), 4), 0, 1, null))));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            objM103844constructorimpl = new Pair(TuplesKt.m90091to(bigDecimal, bigDecimal), TuplesKt.m90091to(bigDecimal, bigDecimal));
        }
        mutableLiveData.postValue((Pair<Pair<BigDecimal, BigDecimal>, Pair<BigDecimal, BigDecimal>>) objM103844constructorimpl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Unit m26842Q0(FuturesBookViewModel futuresBookViewModel, Throwable th2) {
        Log log = Log.f30813a;
        String str = futuresBookViewModel.f23658V + "-observeBook1";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S0 */
    public static final Unit m26846S0(FuturesBookViewModel futuresBookViewModel, TickerEntity tickerEntity) {
        futuresBookViewModel.f23664b0.setValue(tickerEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U0 */
    public static final Unit m26850U0(FuturesBookViewModel futuresBookViewModel, Throwable th2) {
        Log log = Log.f30813a;
        String str = futuresBookViewModel.f23658V + "-observeTicker";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W0 */
    public static final boolean m26853W0(PriceEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !com.kubi.futures.trade.submit.panel.premarket.g.a.o(C46527h0.f104291a.m102673I());
    }

    /* JADX INFO: renamed from: X */
    public static final boolean m26854X(FundingRateEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !com.kubi.futures.trade.submit.panel.premarket.g.a.o(C46527h0.f104291a.m102673I());
    }

    /* JADX INFO: renamed from: X0 */
    public static final boolean m26855X0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: Y */
    public static final boolean m26856Y(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: Y0 */
    public static final Unit m26857Y0(FuturesBookViewModel futuresBookViewModel, PriceEntity priceEntity) {
        futuresBookViewModel.f23665c0.setValue(priceEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m26862b0(FuturesBookViewModel futuresBookViewModel, FundingRateEntity fundingRateEntity) {
        futuresBookViewModel.f23666d0.postValue(fundingRateEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b1 */
    public static final boolean m26863b1(BookEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !com.kubi.futures.trade.submit.panel.premarket.g.a.o(C46527h0.f104291a.m102673I());
    }

    /* JADX INFO: renamed from: c1 */
    public static final boolean m26865c1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m26867d0(FuturesBookViewModel futuresBookViewModel, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, futuresBookViewModel.f23658V + "-bindFundingRate");
        futuresBookViewModel.f23666d0.postValue(new FundingRateEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d1 */
    public static final Unit m26868d1(FuturesBookViewModel futuresBookViewModel, BookEntity bookEntity) {
        futuresBookViewModel.f23669g0 = bookEntity;
        futuresBookViewModel.m26910f0(bookEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f1 */
    public static final Unit m26873f1(FuturesBookViewModel futuresBookViewModel, Throwable th2) {
        Log log = Log.f30813a;
        String str = futuresBookViewModel.f23658V + "-observeBook";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i1 */
    public static final List m26878i1(OrdersPageEntityWrapper selfActiveOrders, OrdersPageEntityWrapper trialActiveOrders) {
        Intrinsics.checkNotNullParameter(selfActiveOrders, "selfActiveOrders");
        Intrinsics.checkNotNullParameter(trialActiveOrders, "trialActiveOrders");
        return CollectionsKt.plus((Collection) selfActiveOrders.getPageEntity().getItems(), (Iterable) trialActiveOrders.getPageEntity().getItems());
    }

    /* JADX INFO: renamed from: j1 */
    public static final List m26880j1(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (List) function2.invoke(p11, p12);
    }

    /* JADX INFO: renamed from: k1 */
    public static final Unit m26882k1(FuturesBookViewModel futuresBookViewModel, List list) {
        futuresBookViewModel.f23662Z.postValue(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    private final void m26884m() {
        Log.f30813a.m36615a(this.f23658V, "unSubscribe");
        this.f23659W.clear();
        this.f23660X.clear();
        m26920o1();
        this.f23670h0 = false;
    }

    /* JADX INFO: renamed from: q0 */
    public static final boolean m26891q0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !Intrinsics.areEqual(it, "buy");
    }

    /* JADX INFO: renamed from: x0 */
    public static final boolean m26899x0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !Intrinsics.areEqual(it, "sell");
    }

    /* JADX INFO: renamed from: A0 */
    public final void m26902A0(@NotNull InterfaceC38213a contractConfig) {
        Intrinsics.checkNotNullParameter(contractConfig, "contractConfig");
        Log.f30813a.m36615a(this.f23658V, "onContractChanged");
        this.f23672j0 = contractConfig;
        this.f23669g0 = null;
        this.f23665c0.setValue(new PriceEntity(null, null, null, null, null, null, 63, null));
        m26884m();
        m26824H0();
    }

    /* JADX INFO: renamed from: D0 */
    public final BigDecimal m26905D0(double[] dArr, int i11) {
        return new BigDecimal(String.valueOf(C27039d.m66646f(dArr != null ? ArraysKt.getOrNull(dArr, i11) : null)));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m26906F0(@Nullable InterfaceC38213a interfaceC38213a) {
        if (interfaceC38213a == null) {
            return;
        }
        this.f23671i0.m87443g(new BookAmountConfig(interfaceC38213a, C41050b.f91264a.m90021d(), C37878b0.f85252a.m85530k() == 0));
        m26910f0(null);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m26907G0(Long l11) {
        InterfaceC38213a interfaceC38213a = this.f23672j0;
        if (interfaceC38213a == null) {
            return;
        }
        long jM66652l = C27039d.m66652l(l11);
        if (jM66652l <= 0) {
            m26920o1();
            m26908W();
        } else if (m26922y0(interfaceC38213a)) {
            CountDownTimer countDownTimer = this.f23673k0;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f23673k0 = new CountDownTimerC13628a((jM66652l * 1000) + ((long) 600)).start();
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m26908W() {
        InterfaceC38213a interfaceC38213a = this.f23672j0;
        if (interfaceC38213a == null) {
            return;
        }
        Observable<FundingRateEntity> observableMo24805e = RepositoryServiceLocator.f19236a.m20286e().mo24805e(interfaceC38213a.getSymbol());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.book.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FuturesBookViewModel.m26854X((FundingRateEntity) obj));
            }
        };
        Observable<FundingRateEntity> observableObserveOn = observableMo24805e.filter(new Predicate() { // from class: com.kubi.futures.trade.book.p0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return FuturesBookViewModel.m26856Y(function1, obj);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.book.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookViewModel.m26858Z(this.f23721b, (FundingRateEntity) obj);
            }
        };
        Observable observableM25657a = C13228l.m25657a(observableObserveOn, new Consumer() { // from class: com.kubi.futures.trade.book.r0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesBookViewModel.m26860a0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.futures.trade.book.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookViewModel.m26862b0(this.f23727b, (FundingRateEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.book.t0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesBookViewModel.m26864c0(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.futures.trade.book.u0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookViewModel.m26867d0(this.f23731b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableM25657a.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.book.v0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesBookViewModel.m26870e0(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f23661Y);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m26909a1() {
        InterfaceC38213a interfaceC38213a = this.f23672j0;
        if (interfaceC38213a == null) {
            return;
        }
        int iPow = (int) Math.pow(10.0d, C46392a.m102323e(C46894j.f104736a.m103269g(interfaceC38213a.getSymbol()), 0));
        CompositeDisposable compositeDisposable = this.f23660X;
        Observable observableObserveOn = C27050g0.m66716a(RepositoryServiceLocator.f19236a.m20286e().mo24801a(interfaceC38213a.getSymbol(), iPow), FuturesFragment.f30411o0.scrollPredicate()).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.book.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FuturesBookViewModel.m26863b1((BookEntity) obj));
            }
        };
        Observable observableFilter = observableObserveOn.filter(new Predicate() { // from class: com.kubi.futures.trade.book.e1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return FuturesBookViewModel.m26865c1(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.book.f1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookViewModel.m26868d1(this.f23694b, (BookEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.book.g1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesBookViewModel.m26871e1(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.futures.trade.book.h1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookViewModel.m26873f1(this.f23699b, (Throwable) obj);
            }
        };
        compositeDisposable.add(observableFilter.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.book.i1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesBookViewModel.m26875g1(function3, obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final MutableLiveData<Pair<Pair<BigDecimal, BigDecimal>, Pair<BigDecimal, BigDecimal>>> m26911g0() {
        return this.f23668f0;
    }

    @NotNull
    /* JADX INFO: renamed from: h0, reason: from getter */
    public final C38683c getF23671i0() {
        return this.f23671i0;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m26913h1(String str) {
        if (UserInfo.a.n() && UserInfo.c().isHasOpenContract()) {
            MultiBizFacadeManager multiBizFacadeManager = MultiBizFacadeManager.f19232a;
            Observable<OrdersPageEntityWrapper> observableMo96065x0 = MultiBizFacadeManager.m20260s(multiBizFacadeManager, null, 1, null).mo96065x0(false, str);
            Observable<OrdersPageEntityWrapper> observableMo96065x1 = MultiBizFacadeManager.m20260s(multiBizFacadeManager, null, 1, null).mo96065x0(true, str);
            final Function2 function2 = new Function2() { // from class: com.kubi.futures.trade.book.w0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesBookViewModel.m26878i1((OrdersPageEntityWrapper) obj, (OrdersPageEntityWrapper) obj2);
                }
            };
            Observable observableSubscribeOn = Observable.combineLatest(observableMo96065x0, observableMo96065x1, new BiFunction() { // from class: com.kubi.futures.trade.book.x0
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return FuturesBookViewModel.m26880j1(function2, obj, obj2);
                }
            }).subscribeOn(C42916f.m94127f());
            final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.book.z0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesBookViewModel.m26882k1(this.f23740b, (List) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.book.a1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FuturesBookViewModel.m26883l1(function1, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.futures.trade.book.b1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesBookViewModel.m26885m1(this.f23684b, (Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.book.c1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FuturesBookViewModel.m26887n1(function3, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, this.f23659W);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final MutableLiveData<FundingRateEntity> m26914i0() {
        return this.f23666d0;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final MutableLiveData<Long> m26915j0() {
        return this.f23667e0;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final MutableLiveData<DisplayBook> m26916l0() {
        return this.f23663a0;
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final MutableLiveData<PriceEntity> m26917m0() {
        return this.f23665c0;
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final MutableLiveData<TickerEntity> m26918n0() {
        return this.f23664b0;
    }

    @Nullable
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final BookEntity getF23669g0() {
        return this.f23669g0;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m26920o1() {
        CountDownTimer countDownTimer = this.f23673k0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f23661Y.clear();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m26921p0(DisplayBook displayBook) {
        if (displayBook == null) {
            return;
        }
        InterfaceC38213a interfaceC38213a = this.f23672j0;
        List<OrderEntity> value = this.f23662Z.getValue();
        if (value == null || value.isEmpty() || interfaceC38213a == null) {
            this.f23663a0.postValue(displayBook);
            return;
        }
        List<OrderEntity> value2 = this.f23662Z.getValue();
        if (value2 == null) {
            value2 = CollectionsKt.emptyList();
        }
        List<OrderEntity> list = CollectionsKt.toList(value2);
        m26903B0(displayBook.m87451b(), list, interfaceC38213a, new Function1() { // from class: com.kubi.futures.trade.book.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FuturesBookViewModel.m26891q0((String) obj));
            }
        });
        m26903B0(displayBook.m87450a(), list, interfaceC38213a, new Function1() { // from class: com.kubi.futures.trade.book.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FuturesBookViewModel.m26899x0((String) obj));
            }
        });
        this.f23663a0.postValue(displayBook);
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m26922y0(InterfaceC38213a interfaceC38213a) {
        return C46527h0.f104291a.m102682R() && C27025c.m66566d(Boolean.valueOf(interfaceC38213a.mo86247r()));
    }

    /* JADX INFO: renamed from: z0 */
    public final void m26923z0() {
        this.f23660X.clear();
        m26909a1();
    }

    /* JADX INFO: renamed from: L0 */
    public static final void m26832L0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P0 */
    public static final void m26840P0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R0 */
    public static final void m26844R0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T0 */
    public static final void m26848T0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V0 */
    public static final void m26852V0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m26858Z(FuturesBookViewModel futuresBookViewModel, FundingRateEntity fundingRateEntity) {
        futuresBookViewModel.m26907G0(fundingRateEntity.getRemainSettleTime());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z0 */
    public static final void m26859Z0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m26860a0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m26864c0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m26870e0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e1 */
    public static final void m26871e1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g1 */
    public static final void m26875g1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l1 */
    public static final void m26883l1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m1 */
    public static final Unit m26885m1(FuturesBookViewModel futuresBookViewModel, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, futuresBookViewModel.f23658V);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n1 */
    public static final void m26887n1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m26903B0(List<DisplayBookItem> list, List<OrderEntity> list2, InterfaceC38213a interfaceC38213a, Function1<? super String, Boolean> function1) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            DisplayBookItem displayBookItem = list.get(i11);
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                OrderEntity orderEntity = list2.get(i12);
                if (!function1.invoke(C27041f.m66668h(orderEntity.getSide())).booleanValue() && Intrinsics.areEqual(interfaceC38213a.getSymbol(), C27041f.m66668h(orderEntity.getSymbol()))) {
                    String displayPrice = displayBookItem.getDisplayPrice();
                    BigDecimal bigDecimalM92637b = null;
                    if (displayPrice != null) {
                        bigDecimalM92637b = C42180b.m92637b(displayPrice, null, 1, null);
                    }
                    if (C27039d.m66656p(bigDecimalM92637b).compareTo(C27039d.m66656p(orderEntity.getPrice())) == 0) {
                        displayBookItem.m87459e(true);
                        break;
                    }
                    displayBookItem.m87459e(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m26904C0() {
        m26884m();
        m26824H0();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m26910f0(@Nullable BookEntity bookEntity) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C37213a.m83253c().plus(C42911a.m94119a()), null, new FuturesBookViewModel$bookTransformer$1(this, bookEntity, null), 2, null);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        m26920o1();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        m26884m();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        m26824H0();
    }
}
