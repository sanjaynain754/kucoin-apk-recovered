package com.kubi.futures.trade.position;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import p236em.C37214b;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ClassicBalanceSubscribeDelegate.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/futures/trade/position/ClassicBalanceSubscribeDelegate;", "", "<init>", "()V", "_balance", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", "balance", "Landroidx/lifecycle/LiveData;", "getBalance", "()Landroidx/lifecycle/LiveData;", "classicBalanceDispose", "Lio/reactivex/disposables/CompositeDisposable;", "subscribeClassicBalance", "", "settleCurrency", "", "onClear", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nClassicBalanceSubscribeDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicBalanceSubscribeDelegate.kt\ncom/kubi/futures/trade/position/ClassicBalanceSubscribeDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class ClassicBalanceSubscribeDelegate {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f24065d = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MutableLiveData<SimpleBalanceEntity> f24066a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LiveData<SimpleBalanceEntity> f24067b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final CompositeDisposable f24068c;

    /* JADX INFO: compiled from: ClassicBalanceSubscribeDelegate.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/trade/position/ClassicBalanceSubscribeDelegate$Companion;", "", "<init>", "()V", "TAG", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: j */
    public static final SimpleBalanceEntity m27522j(SimpleBalanceEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new SimpleBalanceEntity(it.getCurrency(), null, null, null, null, null, null, null, null, null, null, C41014a.m89922G(it.getAvailableBalance(), null, 1, null), null, null, Boolean.FALSE, 0L, null, null, null, null, null, 2078718, null);
    }

    /* JADX INFO: renamed from: k */
    public static final SimpleBalanceEntity m27523k(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (SimpleBalanceEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m27524l(ClassicBalanceSubscribeDelegate classicBalanceSubscribeDelegate, SimpleBalanceEntity simpleBalanceEntity) {
        MutableLiveData<SimpleBalanceEntity> mutableLiveData = classicBalanceSubscribeDelegate.f24066a;
        simpleBalanceEntity.setTrialFunds(Boolean.FALSE);
        mutableLiveData.setValue(simpleBalanceEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m27526n(ClassicBalanceSubscribeDelegate classicBalanceSubscribeDelegate, String str, Throwable th2) {
        classicBalanceSubscribeDelegate.f24066a.postValue(new SimpleBalanceEntity(str, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, 0L, null, null, null, null, null, 2080766, null));
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "ClassicBalanceSubscribeDelegate-subscribeClassicBalance");
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final LiveData<SimpleBalanceEntity> m27528g() {
        return this.f24067b;
    }

    /* JADX INFO: renamed from: h */
    public final void m27529h() {
        this.f24068c.clear();
    }

    /* JADX INFO: renamed from: i */
    public final void m27530i(@NotNull final String settleCurrency) {
        Intrinsics.checkNotNullParameter(settleCurrency, "settleCurrency");
        this.f24068c.clear();
        Observable observableM20261v = MultiBizFacadeManager.m20261v(MultiBizFacadeManager.f19232a, settleCurrency, false, null, 4, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClassicBalanceSubscribeDelegate.m27522j((SimpleBalanceEntity) obj);
            }
        };
        Observable observableObserveOn = observableM20261v.map(new Function() { // from class: com.kubi.futures.trade.position.v
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ClassicBalanceSubscribeDelegate.m27523k(function1, obj);
            }
        }).observeOn(C42916f.m94128g());
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.position.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClassicBalanceSubscribeDelegate.m27524l(this.f24433b, (SimpleBalanceEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.position.x
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ClassicBalanceSubscribeDelegate.m27525m(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.futures.trade.position.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClassicBalanceSubscribeDelegate.m27526n(this.f24444b, settleCurrency, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.position.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ClassicBalanceSubscribeDelegate.m27527o(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f24068c);
    }

    public ClassicBalanceSubscribeDelegate() {
        MutableLiveData<SimpleBalanceEntity> mutableLiveData = new MutableLiveData<>();
        this.f24066a = mutableLiveData;
        this.f24067b = mutableLiveData;
        this.f24068c = new CompositeDisposable();
    }

    /* JADX INFO: renamed from: m */
    public static final void m27525m(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static final void m27527o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
