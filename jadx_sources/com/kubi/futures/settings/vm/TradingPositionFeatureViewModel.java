package com.kubi.futures.settings.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.PreferencesEntity;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.utils.FlowableCompat;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p569qq.C43852m;
import p663uh.InterfaceC45238b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.settings.vm.j0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradingPositionFeatureViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007J\b\u0010\u0013\u001a\u00020\u000eH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/futures/settings/vm/TradingPositionFeatureViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isRequesting", "", TUIConstants.TUIChat.CALL_BACK, "Landroidx/lifecycle/MutableLiveData;", "", "getCallback", "()Landroidx/lifecycle/MutableLiveData;", "fetchPositionFeature", "", "submitPositionFeature", "type", "", "isOpen", "onCleared", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradingPositionFeatureViewModel extends ViewModel {

    /* JADX INFO: renamed from: W */
    public boolean f23528W;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final CompositeDisposable f23527V = new CompositeDisposable();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Object> f23529X = new MutableLiveData<>();

    /* JADX INFO: renamed from: F */
    public static final Unit m26446F(TradingPositionFeatureViewModel tradingPositionFeatureViewModel, Throwable th2) {
        tradingPositionFeatureViewModel.f23528W = false;
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final Object m26444D(PreferencesEntity preferencesEntity) {
        return RepositoryServiceLocator.f19236a.m20290i().mo99992r(preferencesEntity);
    }

    /* JADX INFO: renamed from: E */
    public static final void m26445E(PreferencesEntity preferencesEntity, TradingPositionFeatureViewModel tradingPositionFeatureViewModel, Object obj) {
        RepositoryServiceLocator.f19236a.m20290i().mo99986i(preferencesEntity);
        tradingPositionFeatureViewModel.f23529X.setValue(preferencesEntity);
        tradingPositionFeatureViewModel.f23528W = false;
    }

    /* JADX INFO: renamed from: v */
    public static final PreferencesEntity m26456v() throws Throwable {
        PreferencesEntity preferencesEntityMo99977n = RepositoryServiceLocator.f19236a.m20290i().mo99977n("0");
        return preferencesEntityMo99977n == null ? new PreferencesEntity(null, null, null, null, null, null, null, 127, null) : preferencesEntityMo99977n;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m26457w(TradingPositionFeatureViewModel tradingPositionFeatureViewModel, PreferencesEntity preferencesEntity) {
        InterfaceC45238b interfaceC45238bM20290i = RepositoryServiceLocator.f19236a.m20290i();
        Intrinsics.checkNotNull(preferencesEntity);
        interfaceC45238bM20290i.mo99986i(preferencesEntity);
        tradingPositionFeatureViewModel.f23529X.setValue(preferencesEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m26459y(TradingPositionFeatureViewModel tradingPositionFeatureViewModel, Throwable th2) {
        tradingPositionFeatureViewModel.f23529X.setValue(new Object());
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final MutableLiveData<Object> m26461A() {
        return this.f23529X;
    }

    /* JADX INFO: renamed from: B */
    public final void m26462B(int i11, boolean z11) {
        if (this.f23528W) {
            return;
        }
        this.f23528W = true;
        final PreferencesEntity preferencesEntityMo99988m = RepositoryServiceLocator.f19236a.m20290i().mo99988m();
        if (i11 == 0) {
            preferencesEntityMo99988m.setSeniorPosition(Boolean.valueOf(z11));
            String strM36552b = C17060n0.m36552b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", z11 ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a(strM36552b, "MorePreferencesPosition", "3", jSONObject);
        } else if (i11 != 1) {
            preferencesEntityMo99988m.setSeniorPosition(Boolean.valueOf(z11));
            preferencesEntityMo99988m.setFundingRate(Boolean.valueOf(z11));
            C43852m.m96591c(C17060n0.m36552b(), "MorePreferencesPosition", z11 ? "1" : "2", null, 8, null);
        } else {
            preferencesEntityMo99988m.setFundingRate(Boolean.valueOf(z11));
            String strM36552b2 = C17060n0.m36552b();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("status", z11 ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
            Unit unit2 = Unit.INSTANCE;
            C43852m.m96589a(strM36552b2, "MorePreferencesPosition", "4", jSONObject2);
        }
        Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.futures.settings.vm.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPositionFeatureViewModel.m26444D(preferencesEntityMo99988m);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.settings.vm.g0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradingPositionFeatureViewModel.m26445E(preferencesEntityMo99988m, this, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.settings.vm.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradingPositionFeatureViewModel.m26446F(this.f23524b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.settings.vm.i0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradingPositionFeatureViewModel.m26443C(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f23527V);
    }

    /* JADX INFO: renamed from: u */
    public final void m26463u() {
        Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.futures.settings.vm.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPositionFeatureViewModel.m26456v();
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.settings.vm.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradingPositionFeatureViewModel.m26457w(this.f23510b, (PreferencesEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.settings.vm.c0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradingPositionFeatureViewModel.m26458x(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.settings.vm.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradingPositionFeatureViewModel.m26459y(this.f23515b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.settings.vm.e0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradingPositionFeatureViewModel.m26460z(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f23527V);
    }

    /* JADX INFO: renamed from: C */
    public static final void m26443C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static final void m26458x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z */
    public static final void m26460z(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f23527V.clear();
    }
}
