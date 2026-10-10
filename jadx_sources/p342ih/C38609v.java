package p342ih;

import android.annotation.SuppressLint;
import cm.BalancesWrapper;
import cm.C5002g;
import cm.PositionsWrapper;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.trade.model.ComposeUserEntity;
import com.kubi.kumex.data.trade.model.LeveragesWrapper;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.router.core.Router;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import com.kubi.user.model.AccountState;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.rx2.RxConvertKt;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p231eh.C37183h;
import p236em.C37214b;
import p264fh.C37478l;
import p559qg.InterfaceC43729a;
import p560qh.C43742b;
import p595rg.InterfaceC44080h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function5;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import sg.InterfaceC44404a;

/* JADX INFO: renamed from: ih.v */
/* JADX INFO: compiled from: ClassicCrossStreamManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005H\u0002J\u000e\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0013J\u000e\u0010$\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0013J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0&H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00140\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006'"}, m90084d2 = {"Lcom/kubi/futures/classic/cross/service/ClassicCrossStreamManager;", "", "type", "Lcom/kubi/broker/MultiBizType;", "isTrial", "", "iCrossBizInterface", "Lcom/kubi/function/cross/ICrossBizInterface;", "<init>", "(Lcom/kubi/broker/MultiBizType;ZLcom/kubi/function/cross/ICrossBizInterface;)V", "positionServiceImp", "Lcom/kubi/futures/classic/common/positon/service/PositionServiceImpl;", "getPositionServiceImp", "()Lcom/kubi/futures/classic/common/positon/service/PositionServiceImpl;", "positionServiceImp$delegate", "Lkotlin/Lazy;", "subscribeCount", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "disposable", "Lio/reactivex/disposables/Disposable;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "_composeDataState", "Lcom/kubi/kumex/data/trade/model/ComposeUserEntity;", "composeDataState", "Lkotlinx/coroutines/flow/StateFlow;", "getComposeDataState", "()Lkotlinx/coroutines/flow/StateFlow;", "resetStreamData", "", "clearSubscribers", "startStreamFlow", "fromTag", "stopStreamFlow", "observeComposeUser", "Lio/reactivex/Observable;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nClassicCrossStreamManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicCrossStreamManager.kt\ncom/kubi/futures/classic/cross/service/ClassicCrossStreamManager\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 MultiBizUtils.kt\ncom/kubi/broker/MultiBizUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n230#2,5:267\n230#2,5:272\n11#3,6:277\n17#3,5:285\n295#4,2:283\n*S KotlinDebug\n*F\n+ 1 ClassicCrossStreamManager.kt\ncom/kubi/futures/classic/cross/service/ClassicCrossStreamManager\n*L\n119#1:267,5\n142#1:272,5\n61#1:277,6\n61#1:285,5\n61#1:283,2\n*E\n"})
public final class C38609v {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MultiBizType f86600a;

    /* JADX INFO: renamed from: b */
    public final boolean f86601b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC44404a f86602c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f86603d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final InterfaceC41669n<ArrayList<String>> f86604e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Disposable f86605f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final CompositeDisposable f86606g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final InterfaceC41669n<ComposeUserEntity> f86607h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC41678w<ComposeUserEntity> f86608i;

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX INFO: renamed from: L */
    public final void m87317L(boolean z11) {
        boolean z12;
        synchronized (this) {
            if (z11) {
                z12 = false;
            } else {
                try {
                    if (this.f86604e.getValue().isEmpty() || !UserInfo.a.n()) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11) {
                this.f86604e.setValue(new ArrayList<>());
            }
            Disposable disposable = this.f86605f;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f86605f = null;
            this.f86607h.setValue(ComposeUserEntity.f28832g.empty());
            if (z12) {
                Observable<ComposeUserEntity> observableM87316F = m87316F();
                final Function1 function1 = new Function1() { // from class: ih.e
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C38609v.m87283P(this.f86564b, (ComposeUserEntity) obj);
                    }
                };
                Consumer<? super ComposeUserEntity> consumer = new Consumer() { // from class: ih.f
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C38609v.m87280M(function1, obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: ih.g
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C38609v.m87281N((Throwable) obj);
                    }
                };
                this.f86605f = observableM87316F.subscribe(consumer, new Consumer() { // from class: ih.h
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C38609v.m87282O(function2, obj);
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public C38609v(@NotNull MultiBizType type, boolean z11, @NotNull InterfaceC44404a iCrossBizInterface) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(iCrossBizInterface, "iCrossBizInterface");
        this.f86600a = type;
        this.f86601b = z11;
        this.f86602c = iCrossBizInterface;
        this.f86603d = LazyKt.lazy(new Function0() { // from class: ih.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38609v.m87279K(this.f86555b);
            }
        });
        this.f86604e = C41679x.m91009a(new ArrayList());
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f86606g = compositeDisposable;
        InterfaceC41669n<ComposeUserEntity> interfaceC41669nM91009a = C41679x.m91009a(null);
        this.f86607h = interfaceC41669nM91009a;
        this.f86608i = C41636g.m90907c(interfaceC41669nM91009a);
        UserInfo userInfo = UserInfo.a;
        Observable observableE = userInfo.e();
        final Function1 function1 = new Function1() { // from class: ih.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38609v.m87309v(this.f86584b, (Boolean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: ih.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38609v.m87310w(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ih.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38609v.m87311x((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableE.subscribe(consumer, new Consumer() { // from class: ih.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38609v.m87312y(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        Observable observableA = userInfo.a();
        final Function1 function3 = new Function1() { // from class: ih.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38609v.m87313z(this.f86591b, (AccountEventState) obj);
            }
        };
        Consumer consumer2 = new Consumer() { // from class: ih.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38609v.m87272A(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: ih.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38609v.m87273B((Throwable) obj);
            }
        };
        Disposable disposableSubscribe2 = observableA.subscribe(consumer2, new Consumer() { // from class: ih.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38609v.m87274C(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe2, compositeDisposable);
    }

    /* JADX INFO: renamed from: G */
    public static final ComposeUserEntity m87275G(C38609v c38609v, List positions, BalancesWrapper balance, LeveragesWrapper leverages, String str, List list) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(leverages, "leverages");
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        boolean zM87233T = C38598p0.m87233T(c38609v.f86601b, positions);
        return new ComposeUserEntity(new PositionsWrapper(positions, null), balance, leverages, zM87233T, C38598p0.m87232S(positions, zM87233T), 0L, 32, null);
    }

    /* JADX INFO: renamed from: H */
    public static final ComposeUserEntity m87276H(Function5 function5, Object p11, Object p12, Object p13, Object p14, Object p15) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p13, "p2");
        Intrinsics.checkNotNullParameter(p14, "p3");
        Intrinsics.checkNotNullParameter(p15, "p4");
        return (ComposeUserEntity) function5.invoke(p11, p12, p13, p14, p15);
    }

    /* JADX INFO: renamed from: I */
    public static final ComposeUserEntity m87277I(C38609v c38609v, ComposeUserEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C5002g.m5396a(it, c38609v.f86601b);
    }

    /* JADX INFO: renamed from: J */
    public static final ComposeUserEntity m87278J(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ComposeUserEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: K */
    public static final C37478l m87279K(C38609v c38609v) {
        Object obj;
        Object next;
        MultiBizType multiBizType = c38609v.f86600a;
        MultiBizType multiBizType2 = MultiBizType.CLASSIC;
        List listM56190l = Router.f46192a.m56190l(InterfaceC44080h.class);
        Iterator it = listM56190l.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((InterfaceC43729a) next).mo4515x() != multiBizType);
        InterfaceC43729a interfaceC43729a = (InterfaceC43729a) next;
        if (interfaceC43729a == null && multiBizType2 != MultiBizType.UN_KNOW) {
            for (Object obj2 : listM56190l) {
                if (((InterfaceC43729a) obj2).mo4515x() == multiBizType2) {
                    obj = obj2;
                    break;
                }
            }
            interfaceC43729a = (InterfaceC43729a) obj;
        }
        InterfaceC44080h c37183h = (InterfaceC44080h) interfaceC43729a;
        if (c37183h == null) {
            c37183h = new C37183h();
        }
        return new C37478l(c37183h);
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m87283P(C38609v c38609v, ComposeUserEntity composeUserEntity) {
        c38609v.f86607h.setValue(ComposeUserEntity.m33451b(composeUserEntity, null, null, null, false, null, System.currentTimeMillis(), 31, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m87284R(C38609v c38609v, ComposeUserEntity composeUserEntity) {
        c38609v.f86607h.setValue(ComposeUserEntity.m33451b(composeUserEntity, null, null, null, false, null, System.currentTimeMillis(), 31, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m87309v(C38609v c38609v, Boolean bool) {
        if (!UserInfo.a.n()) {
            c38609v.m87317L(true);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final InterfaceC41678w<ComposeUserEntity> m87314D() {
        return this.f86608i;
    }

    /* JADX INFO: renamed from: E */
    public final C37478l m87315E() {
        return (C37478l) this.f86603d.getValue();
    }

    /* JADX INFO: renamed from: Q */
    public final void m87318Q(@NotNull String fromTag) {
        ArrayList<String> value;
        ArrayList<String> arrayList;
        Intrinsics.checkNotNullParameter(fromTag, "fromTag");
        synchronized (this) {
            try {
                InterfaceC41669n<ArrayList<String>> interfaceC41669n = this.f86604e;
                do {
                    value = interfaceC41669n.getValue();
                    arrayList = new ArrayList<>(value);
                    if (arrayList.isEmpty()) {
                        Disposable disposable = this.f86605f;
                        if (disposable != null) {
                            disposable.dispose();
                        }
                        Observable<ComposeUserEntity> observableM87316F = m87316F();
                        final Function1 function1 = new Function1() { // from class: ih.u
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C38609v.m87284R(this.f86598b, (ComposeUserEntity) obj);
                            }
                        };
                        Consumer<? super ComposeUserEntity> consumer = new Consumer() { // from class: ih.b
                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                C38609v.m87285S(function1, obj);
                            }
                        };
                        final Function1 function2 = new Function1() { // from class: ih.c
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C38609v.m87286T((Throwable) obj);
                            }
                        };
                        this.f86605f = observableM87316F.subscribe(consumer, new Consumer() { // from class: ih.d
                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                C38609v.m87287U(function2, obj);
                            }
                        });
                    }
                    arrayList.add(fromTag);
                    C44128b.m97266j("ccsm-" + this.f86601b, "startStreamFlow-当前订阅数：" + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
                } while (!interfaceC41669n.compareAndSet(value, arrayList));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m87319V(@NotNull String fromTag) {
        ArrayList<String> value;
        ArrayList<String> arrayList;
        Disposable disposable;
        Intrinsics.checkNotNullParameter(fromTag, "fromTag");
        synchronized (this) {
            try {
                InterfaceC41669n<ArrayList<String>> interfaceC41669n = this.f86604e;
                do {
                    value = interfaceC41669n.getValue();
                    arrayList = new ArrayList<>(value);
                    arrayList.remove(fromTag);
                    if (arrayList.isEmpty() && (disposable = this.f86605f) != null) {
                        disposable.dispose();
                    }
                    C44128b.m97266j("ccsm-" + this.f86601b, "stopStreamFlow-取消订阅数据流 " + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
                } while (!interfaceC41669n.compareAndSet(value, arrayList));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static final void m87272A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m87273B(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final void m87274C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M */
    public static final void m87280M(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m87281N(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "resetStreamData is null");
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final void m87282O(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S */
    public static final void m87285S(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m87286T(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "startStreamFlow is null");
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final void m87287U(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static final void m87310w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m87311x(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final void m87312y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m87313z(C38609v c38609v, AccountEventState accountEventState) {
        if (accountEventState.getState() == AccountState.SwitchAccount || accountEventState.getState() == AccountState.Login) {
            c38609v.m87317L(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public final Observable<ComposeUserEntity> m87316F() {
        String str;
        Observable<List<PositionEntity>> observableM84297l = m87315E().m84297l(this.f86601b);
        Observable<List<SimpleBalanceEntity>> observableMo24486p = this.f86602c.mo24486p(this.f86601b);
        if (this.f86601b) {
            str = "Trial";
        } else {
            str = "Self";
        }
        Observable observableM87256w = C38598p0.m87256w(observableMo24486p, str);
        Observable observableM87218E = C38598p0.m87218E(this.f86602c.mo24472C(this.f86601b));
        MultiBizFacadeManager multiBizFacadeManager = MultiBizFacadeManager.f19232a;
        Observable observableMerge = Observable.merge(Observable.just(MultiBizFacadeManager.m20257l(multiBizFacadeManager, null, 1, null).mo89035V0(this.f86601b)), RxConvertKt.m91207d(MultiBizFacadeManager.m20257l(multiBizFacadeManager, null, 1, null).mo89038x0(this.f86601b), null, 1, null));
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        Observable observableM87226M = C38598p0.m87226M(observableMerge);
        Observable observableMerge2 = Observable.merge(Observable.just(CollectionsKt.emptyList()), RepositoryServiceLocator.f19236a.m20288g().mo24989Q().toObservable());
        final Function5 function5 = new Function5() { // from class: ih.i
            @Override // p852kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return C38609v.m87275G(this.f86579b, (List) obj, (BalancesWrapper) obj2, (LeveragesWrapper) obj3, (String) obj4, (List) obj5);
            }
        };
        Observable observableObserveOn = Observable.combineLatest(observableM84297l, observableM87256w, observableM87218E, observableM87226M, observableMerge2, new io.reactivex.functions.Function5() { // from class: ih.j
            @Override // io.reactivex.functions.Function5
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return C38609v.m87276H(function5, obj, obj2, obj3, obj4, obj5);
            }
        }).throttleLatest(1L, TimeUnit.SECONDS, C43742b.m96366a()).observeOn(C42916f.m94126e());
        final Function1 function1 = new Function1() { // from class: ih.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38609v.m87277I(this.f86582b, (ComposeUserEntity) obj);
            }
        };
        Observable<ComposeUserEntity> observableSubscribeOn = observableObserveOn.map(new Function() { // from class: ih.m
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C38609v.m87278J(function1, obj);
            }
        }).subscribeOn(C42916f.m94127f());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }
}
