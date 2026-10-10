package com.kubi.futures.trade.position.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.firebase.messaging.Constants;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.futures.trade.position.ClassicBalanceSubscribeDelegate;
import com.kubi.futures.trade.vm.FuturesClassicStreamViewModel;
import com.kubi.futures.trade.vm.FuturesTrialStreamViewModel;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.OrdersPageEntityWrapper;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.data.trade.model.PositionTrialEntity;
import com.kubi.kumex.data.trade.model.UserJoinChallengeEntity;
import com.kubi.kumex.utils.Log;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.TransformationsCompat;
import com.kubi.utils.FlowableCompatKt;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.List;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import p236em.C37214b;
import p801yl.C46527h0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FuturesPositionComposeViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u0000 =2\u00020\u0001:\u0001=B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020/J\u0006\u00101\u001a\u00020/J\b\u00102\u001a\u00020/H\u0002J\b\u00103\u001a\u00020/H\u0002J\u001e\u00104\u001a\u00020/2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u00106\u001a\u00020'H\u0002J&\u00107\u001a\u00020/2\u0006\u00108\u001a\u00020\t2\u0006\u00106\u001a\u00020'2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\b\u00109\u001a\u00020/H\u0002J\b\u0010:\u001a\u00020/H\u0002J\u001e\u0010;\u001a\u00020/2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u00106\u001a\u00020'H\u0002J\u0006\u0010<\u001a\u00020/R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010%\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010'0'0&¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019¨\u0006>"}, m90084d2 = {"Lcom/kubi/futures/trade/position/vm/FuturesPositionComposeViewModel;", "", "futuresViewModel", "Lcom/kubi/futures/trade/vm/FuturesClassicStreamViewModel;", "futuresTrialViewModel", "Lcom/kubi/futures/trade/vm/FuturesTrialStreamViewModel;", "<init>", "(Lcom/kubi/futures/trade/vm/FuturesClassicStreamViewModel;Lcom/kubi/futures/trade/vm/FuturesTrialStreamViewModel;)V", "tag", "", "disposes", "Lio/reactivex/disposables/CompositeDisposable;", "trialDisposes", "positionsLock", "ordersLock", "_positions", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "_orders", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "resultPositionAndData", "Landroidx/lifecycle/LiveData;", "Lcom/kubi/futures/trade/position/vm/PositionAndOrder;", "getResultPositionAndData", "()Landroidx/lifecycle/LiveData;", "_error", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getError", "classicOrders", "", "trialOrders", "classicPositions", "trialPositions", "classicBalanceSubscribeDelegate", "Lcom/kubi/futures/trade/position/ClassicBalanceSubscribeDelegate;", "triggerUnlockLeverage", "Lio/reactivex/processors/BehaviorProcessor;", "", "kotlin.jvm.PlatformType", "getTriggerUnlockLeverage", "()Lio/reactivex/processors/BehaviorProcessor;", "classicBalance", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", "getClassicBalance", "subscribe", "", "subscribeClassicBalance", "retry", "subscribeClassicPositions", "subscribeTrialPositions", "sendPositions", "list", "isTrial", "logRawPositions", "source", "subscribeClassicOrders", "subscribeTrialOrders", "sendOrders", "dispose", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesPositionComposeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesPositionComposeViewModel.kt\ncom/kubi/futures/trade/position/vm/FuturesPositionComposeViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1869#2,2:245\n1869#2,2:247\n*S KotlinDebug\n*F\n+ 1 FuturesPositionComposeViewModel.kt\ncom/kubi/futures/trade/position/vm/FuturesPositionComposeViewModel\n*L\n131#1:245,2\n162#1:247,2\n*E\n"})
public final class FuturesPositionComposeViewModel {

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final Companion f24274t = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FuturesClassicStreamViewModel f24275a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final FuturesTrialStreamViewModel f24276b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f24277c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final CompositeDisposable f24278d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final CompositeDisposable f24279e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Object f24280f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Object f24281g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final MutableLiveData<List<PositionEntity>> f24282h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final MutableLiveData<List<OrderEntity>> f24283i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final LiveData<PositionAndOrder> f24284j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final MutableLiveData<Throwable> f24285k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final LiveData<Throwable> f24286l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final List<OrderEntity> f24287m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final List<OrderEntity> f24288n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final List<PositionEntity> f24289o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final List<PositionEntity> f24290p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final ClassicBalanceSubscribeDelegate f24291q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final BehaviorProcessor<Boolean> f24292r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final LiveData<SimpleBalanceEntity> f24293s;

    /* JADX INFO: compiled from: FuturesPositionComposeViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/trade/position/vm/FuturesPositionComposeViewModel$Companion;", "", "<init>", "()V", "POSITION_DATA_SOURCE_TAG", "", "create", "Lcom/kubi/futures/trade/position/vm/FuturesPositionComposeViewModel;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FuturesPositionComposeViewModel create(@NotNull BaseFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return new FuturesPositionComposeViewModel(com.kubi.futures.trade.vm.b1.a(fragment), com.kubi.futures.trade.vm.y1.a(fragment));
        }
    }

    public FuturesPositionComposeViewModel(@NotNull FuturesClassicStreamViewModel futuresViewModel, @NotNull FuturesTrialStreamViewModel futuresTrialViewModel) {
        Intrinsics.checkNotNullParameter(futuresViewModel, "futuresViewModel");
        Intrinsics.checkNotNullParameter(futuresTrialViewModel, "futuresTrialViewModel");
        this.f24275a = futuresViewModel;
        this.f24276b = futuresTrialViewModel;
        this.f24277c = "FuturesPositionComposeViewModel";
        this.f24278d = new CompositeDisposable();
        this.f24279e = new CompositeDisposable();
        this.f24280f = new Object();
        this.f24281g = new Object();
        MutableLiveData<List<PositionEntity>> mutableLiveData = new MutableLiveData<>();
        this.f24282h = mutableLiveData;
        MutableLiveData<List<OrderEntity>> mutableLiveData2 = new MutableLiveData<>();
        this.f24283i = mutableLiveData2;
        this.f24284j = TransformationsCompat.f46881a.m57060g(mutableLiveData, mutableLiveData2, new Function2() { // from class: com.kubi.futures.trade.position.vm.d0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FuturesPositionComposeViewModel.m27806B((List) obj, (List) obj2);
            }
        });
        MutableLiveData<Throwable> mutableLiveData3 = new MutableLiveData<>();
        this.f24285k = mutableLiveData3;
        this.f24286l = mutableLiveData3;
        this.f24287m = new ArrayList();
        this.f24288n = new ArrayList();
        this.f24289o = new ArrayList();
        this.f24290p = new ArrayList();
        ClassicBalanceSubscribeDelegate classicBalanceSubscribeDelegate = new ClassicBalanceSubscribeDelegate();
        this.f24291q = classicBalanceSubscribeDelegate;
        BehaviorProcessor<Boolean> behaviorProcessorCreate = BehaviorProcessor.create();
        Intrinsics.checkNotNullExpressionValue(behaviorProcessorCreate, "create(...)");
        this.f24292r = behaviorProcessorCreate;
        this.f24293s = classicBalanceSubscribeDelegate.m27528g();
    }

    /* JADX INFO: renamed from: B */
    public static final PositionAndOrder m27806B(List list, List list2) {
        List list3 = list != null ? CollectionsKt.toList(list) : null;
        if (list3 == null) {
            list3 = CollectionsKt.emptyList();
        }
        List list4 = list2 != null ? CollectionsKt.toList(list2) : null;
        if (list4 == null) {
            list4 = CollectionsKt.emptyList();
        }
        return new PositionAndOrder(list3, list4);
    }

    /* JADX INFO: renamed from: I */
    public static final List m27807I(OrdersPageEntityWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPageEntity().getItems();
    }

    /* JADX INFO: renamed from: J */
    public static final List m27808J(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m27815R(FuturesPositionComposeViewModel futuresPositionComposeViewModel, Throwable th2) {
        futuresPositionComposeViewModel.f24285k.postValue(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final List m27817U(OrdersPageEntityWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPageEntity().getItems();
    }

    /* JADX INFO: renamed from: V */
    public static final List m27818V(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: A */
    public final void m27848A(String str, boolean z11, List<PositionEntity> list) {
        Log.f30813a.m36615a("PositionDataSource", "rawSubscribe source=" + str + " isTrial=" + z11 + " size=" + list.size());
        for (PositionEntity positionEntity : list) {
            Log log = Log.f30813a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rawSubscribe source=");
            sb2.append(str);
            sb2.append(" symbol=");
            sb2.append(positionEntity.getSymbol());
            sb2.append(" id=");
            sb2.append(positionEntity.getId());
            sb2.append(" isOpen=");
            sb2.append(positionEntity.isOpen());
            sb2.append(" qty=");
            sb2.append(positionEntity.getCurrentQty());
            sb2.append(" positionSide=");
            sb2.append(positionEntity.getPositionSide());
            sb2.append(" marginMode=");
            sb2.append(positionEntity.getMarginMode());
            sb2.append(" avgEntryPrice=");
            sb2.append(positionEntity.getAvgEntryPrice());
            sb2.append(" isTrialFunds=");
            sb2.append(positionEntity.isTrialFunds());
            sb2.append(" prizeType=");
            sb2.append(positionEntity.getPrizeType());
            sb2.append(" trialCode=");
            PositionTrialEntity trialCoupon = positionEntity.getTrialCoupon();
            Long endTime = null;
            sb2.append(trialCoupon != null ? trialCoupon.getCode() : null);
            sb2.append(" trialExpired=");
            PositionTrialEntity trialCoupon2 = positionEntity.getTrialCoupon();
            sb2.append(trialCoupon2 != null ? trialCoupon2.getExpiredPeriod() : null);
            sb2.append(" userJoinCode=");
            UserJoinChallengeEntity userJoinChallenge = positionEntity.getUserJoinChallenge();
            sb2.append(userJoinChallenge != null ? userJoinChallenge.getCode() : null);
            sb2.append(" userJoinEnd=");
            UserJoinChallengeEntity userJoinChallenge2 = positionEntity.getUserJoinChallenge();
            if (userJoinChallenge2 != null) {
                endTime = userJoinChallenge2.getEndTime();
            }
            sb2.append(endTime);
            log.m36615a("PositionDataSource", sb2.toString());
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m27850D(List<OrderEntity> list, boolean z11) {
        synchronized (this.f24281g) {
            try {
                if (z11) {
                    this.f24288n.clear();
                    this.f24288n.addAll(list);
                } else {
                    this.f24287m.clear();
                    this.f24287m.addAll(list);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f24287m);
                arrayList.addAll(this.f24288n);
                this.f24283i.postValue(arrayList);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m27851E(List<PositionEntity> list, boolean z11) {
        synchronized (this.f24280f) {
            try {
                for (PositionEntity positionEntity : list) {
                    Log log = Log.f30813a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("composeSource isTrial=");
                    sb2.append(z11);
                    sb2.append(" symbol=");
                    sb2.append(positionEntity.getSymbol());
                    sb2.append(" id=");
                    sb2.append(positionEntity.getId());
                    sb2.append(" qty=");
                    sb2.append(positionEntity.getCurrentQty());
                    sb2.append(" positionSide=");
                    sb2.append(positionEntity.getPositionSide());
                    sb2.append(" isTrialFunds=");
                    sb2.append(positionEntity.isTrialFunds());
                    sb2.append(" prizeType=");
                    sb2.append(positionEntity.getPrizeType());
                    sb2.append(" trialCode=");
                    PositionTrialEntity trialCoupon = positionEntity.getTrialCoupon();
                    String code = null;
                    sb2.append(trialCoupon != null ? trialCoupon.getCode() : null);
                    sb2.append(" userJoinCode=");
                    UserJoinChallengeEntity userJoinChallenge = positionEntity.getUserJoinChallenge();
                    if (userJoinChallenge != null) {
                        code = userJoinChallenge.getCode();
                    }
                    sb2.append(code);
                    log.m36615a("PositionDataSource", sb2.toString());
                }
                if (z11) {
                    if (this.f24290p.size() < list.size()) {
                        this.f24292r.onNext(Boolean.TRUE);
                    }
                    this.f24290p.clear();
                    this.f24290p.addAll(list);
                } else {
                    this.f24289o.clear();
                    this.f24289o.addAll(list);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f24289o);
                arrayList.addAll(this.f24290p);
                this.f24282h.postValue(arrayList);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m27853G() {
        String settleCurrency;
        ContractEntity contractEntityM102673I = C46527h0.f104291a.m102673I();
        if (contractEntityM102673I == null || (settleCurrency = contractEntityM102673I.getSettleCurrency()) == null) {
            return;
        }
        this.f24291q.m27530i(settleCurrency);
    }

    /* JADX INFO: renamed from: H */
    public final void m27854H() {
        Observable observableM = this.f24275a.M();
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.vm.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionComposeViewModel.m27807I((OrdersPageEntityWrapper) obj);
            }
        };
        Observable map = observableM.map(new Function() { // from class: com.kubi.futures.trade.position.vm.q0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return FuturesPositionComposeViewModel.m27808J(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableSubscribeOn = FlowableCompatKt.m66399m(map).subscribeOn(C42916f.m94127f());
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.position.vm.r0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionComposeViewModel.m27809K(this.f24406b, (List) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.position.vm.s0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesPositionComposeViewModel.m27810L(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.futures.trade.position.vm.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionComposeViewModel.m27811M(this.f24411b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.position.vm.u0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesPositionComposeViewModel.m27812N(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f24278d);
    }

    /* JADX INFO: renamed from: O */
    public final void m27855O() {
        Observable observableObserveOn = MultiBizFacadeManager.m20246B(MultiBizFacadeManager.f19232a, false, null, 2, null).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94126e());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.vm.v0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionComposeViewModel.m27813P(this.f24415b, (List) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.position.vm.w0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesPositionComposeViewModel.m27814Q(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.position.vm.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionComposeViewModel.m27815R(this.f24422b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.position.vm.e0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesPositionComposeViewModel.m27816S(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f24278d);
    }

    /* JADX INFO: renamed from: T */
    public final void m27856T() {
        if (BrokerConfig.f19211a.m20201d().mo20229O()) {
            Observable observableH = this.f24276b.H();
            final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.vm.f0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesPositionComposeViewModel.m27817U((OrdersPageEntityWrapper) obj);
                }
            };
            Observable map = observableH.map(new Function() { // from class: com.kubi.futures.trade.position.vm.g0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return FuturesPositionComposeViewModel.m27818V(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Observable observableSubscribeOn = FlowableCompatKt.m66399m(map).subscribeOn(C42916f.m94127f());
            final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.position.vm.h0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesPositionComposeViewModel.m27819W(this.f24358b, (List) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.position.vm.i0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FuturesPositionComposeViewModel.m27820X(function2, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.futures.trade.position.vm.j0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesPositionComposeViewModel.m27821Y(this.f24367b, (Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.position.vm.k0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FuturesPositionComposeViewModel.m27822Z(function3, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, this.f24278d);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m27857a0() {
        if (BrokerConfig.f19211a.m20201d().mo20229O()) {
            Observable observableSubscribeOn = MultiBizFacadeManager.m20246B(MultiBizFacadeManager.f19232a, true, null, 2, null).subscribeOn(C42916f.m94127f());
            final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.vm.l0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesPositionComposeViewModel.m27825b0(this.f24373b, (List) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.position.vm.m0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FuturesPositionComposeViewModel.m27827c0(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.position.vm.n0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesPositionComposeViewModel.m27829d0(this.f24388b, (Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.position.vm.p0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FuturesPositionComposeViewModel.m27831e0(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, this.f24278d);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m27858v() {
        this.f24278d.clear();
        this.f24279e.clear();
        this.f24291q.m27529h();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final LiveData<SimpleBalanceEntity> m27859w() {
        return this.f24293s;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final LiveData<Throwable> m27860x() {
        return this.f24286l;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final LiveData<PositionAndOrder> m27861y() {
        return this.f24284j;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final BehaviorProcessor<Boolean> m27862z() {
        return this.f24292r;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m27809K(FuturesPositionComposeViewModel futuresPositionComposeViewModel, List list) {
        Intrinsics.checkNotNull(list);
        futuresPositionComposeViewModel.m27850D(list, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final void m27810L(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m27811M(FuturesPositionComposeViewModel futuresPositionComposeViewModel, Throwable th2) {
        futuresPositionComposeViewModel.m27850D(CollectionsKt.emptyList(), false);
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, futuresPositionComposeViewModel.f24277c);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final void m27812N(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m27813P(FuturesPositionComposeViewModel futuresPositionComposeViewModel, List list) {
        Intrinsics.checkNotNull(list);
        futuresPositionComposeViewModel.m27848A("classic", false, list);
        futuresPositionComposeViewModel.m27851E(list, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final void m27814Q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S */
    public static final void m27816S(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m27819W(FuturesPositionComposeViewModel futuresPositionComposeViewModel, List list) {
        Intrinsics.checkNotNull(list);
        futuresPositionComposeViewModel.m27850D(list, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X */
    public static final void m27820X(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m27821Y(FuturesPositionComposeViewModel futuresPositionComposeViewModel, Throwable th2) {
        futuresPositionComposeViewModel.m27850D(CollectionsKt.emptyList(), true);
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, futuresPositionComposeViewModel.f24277c);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public static final void m27822Z(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m27825b0(FuturesPositionComposeViewModel futuresPositionComposeViewModel, List list) {
        Intrinsics.checkNotNull(list);
        futuresPositionComposeViewModel.m27848A("trial", true, list);
        futuresPositionComposeViewModel.m27851E(list, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m27827c0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m27829d0(FuturesPositionComposeViewModel futuresPositionComposeViewModel, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, futuresPositionComposeViewModel.f24277c + "-subscribeTrialPositions");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m27831e0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C */
    public final void m27849C() {
        m27852F();
    }

    /* JADX INFO: renamed from: F */
    public final void m27852F() {
        m27858v();
        m27855O();
        m27857a0();
        m27854H();
        m27856T();
        m27853G();
    }
}
