package com.kubi.p110rn.modules.bridge;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.p110rn.modules.RNH5InterActionHelper;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.p110rn.modules.RNPageHideEvent;
import com.kubi.p110rn.modules.RNPageShowEvent;
import com.kubi.p110rn.modules.RNPublishSubject;
import com.kubi.p110rn.modules.bridge.KRNEventEmitter;
import com.kubi.p110rn.modules.eventhub.RNEventHubRegistry;
import com.kubi.sdk.util.C24267r0;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: KRNEventEmitter.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0007J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\u0012\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0002J0\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0018`\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J0\u0010\u001c\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0018`\u00192\u0006\u0010\u001a\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0007J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0007J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000bH\u0007J\u0018\u0010#\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/rn/modules/bridge/KRNEventEmitter;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "invalidated", "", "listenerCount", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "addListener", "", "eventName", "initialize", "listenCommonMsg", "listenUserPageVisibleEvent", "shouldDispatchPageVisibilityEvent", "containerId", "buildPageHidePayload", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "event", "Lcom/kubi/rn/modules/RNPageHideEvent;", "buildPageShowPayload", "Lcom/kubi/rn/modules/RNPageShowEvent;", "invalidate", "remove", "removeListener", "removeListeners", "count", "sendEvent", DbParams.KEY_CHANNEL_RESULT, "Lcom/facebook/react/bridge/WritableNativeMap;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKRNEventEmitter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KRNEventEmitter.kt\ncom/kubi/rn/modules/bridge/KRNEventEmitter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
public final class KRNEventEmitter extends ReactContextBaseJavaModule {

    @NotNull
    private CompositeDisposable compositeDisposable;
    private volatile boolean invalidated;
    private int listenerCount;

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KRNEventEmitter(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.compositeDisposable = new CompositeDisposable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addListener$lambda$0(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof Map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addListener$lambda$1(KRNEventEmitter kRNEventEmitter, Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        kRNEventEmitter.sendEvent(RNH5InterActionHelperKt.EVENT_NAME_FROM_H5, C24267r0.m58522f((Map) obj));
    }

    private final void listenCommonMsg() {
        Observable<Pair<String, HashMap<String, Object>>> observableObserveOn = RNPublishSubject.INSTANCE.getNativeNotifyRn().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: px.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KRNEventEmitter.listenCommonMsg$lambda$4(this.f96107b, (Pair) obj);
            }
        };
        Consumer<? super Pair<String, HashMap<String, Object>>> consumer = new Consumer() { // from class: px.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: px.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KRNEventEmitter.listenCommonMsg$lambda$6((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: px.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.compositeDisposable);
    }

    private final void listenUserPageVisibleEvent() {
        RNPublishSubject rNPublishSubject = RNPublishSubject.INSTANCE;
        Observable<RNPageHideEvent> observableObserveOn = rNPublishSubject.getNativePageHideStatus().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: px.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KRNEventEmitter.listenUserPageVisibleEvent$lambda$8(this.f96113b, (RNPageHideEvent) obj);
            }
        };
        Consumer<? super RNPageHideEvent> consumer = new Consumer() { // from class: px.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: px.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KRNEventEmitter.listenUserPageVisibleEvent$lambda$10((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: px.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.compositeDisposable);
        Observable<RNPageShowEvent> observableObserveOn2 = rNPublishSubject.getNativePageShowStatus().observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: px.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KRNEventEmitter.listenUserPageVisibleEvent$lambda$12(this.f96116b, (RNPageShowEvent) obj);
            }
        };
        Consumer<? super RNPageShowEvent> consumer2 = new Consumer() { // from class: px.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function3.invoke(obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: px.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KRNEventEmitter.listenUserPageVisibleEvent$lambda$14((Throwable) obj);
            }
        };
        Disposable disposableSubscribe2 = observableObserveOn2.subscribe(consumer2, new Consumer() { // from class: px.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function4.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe2, this.compositeDisposable);
    }

    private final void sendEvent(String eventName, WritableNativeMap result) {
        Object objM103844constructorimpl;
        if (this.invalidated) {
            C44128b.m97266j(RNConstantKt.LOG_TAG, "sendEvent skipped: invalidated, eventName=" + eventName);
            return;
        }
        if (this.listenerCount <= 0) {
            C44128b.m97266j(RNConstantKt.LOG_TAG, "sendEvent: 当前引擎未处于活跃监听，不发送消息: eventName=" + eventName + ", result=" + result);
            return;
        }
        if (!this.reactContext.hasActiveReactInstance()) {
            C44128b.m97266j(RNConstantKt.LOG_TAG, "sendEvent skipped: no active react instance, eventName=" + eventName);
            return;
        }
        C44128b.m97266j(RNConstantKt.LOG_TAG, "sendEvent: listenerCount=" + this.listenerCount + "，eventName=" + eventName + ", result=" + result);
        try {
            Result.Companion companion = Result.INSTANCE;
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, result);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C24267r0.m58519c(thM103847exceptionOrNullimpl);
        }
    }

    private final boolean shouldDispatchPageVisibilityEvent(String containerId) {
        if (containerId == null || StringsKt.isBlank(containerId)) {
            return true;
        }
        boolean zContainsContainerId = RNEventHubRegistry.INSTANCE.containsContainerId(this.reactContext, containerId);
        if (!zContainsContainerId) {
            C44128b.m97266j(RNConstantKt.LOG_TAG, "page visibility skipped: containerId=" + containerId + " does not belong to current reactContext");
        }
        return zContainsContainerId;
    }

    @ReactMethod
    public final void addListener(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.listenerCount++;
        C44128b.m97266j(RNConstantKt.LOG_TAG, "KRNEventEmitter.addListener: eventName=" + eventName + "，listenerCount=" + this.listenerCount);
        if (Intrinsics.areEqual(RNH5InterActionHelperKt.EVENT_NAME_FROM_H5, eventName)) {
            Observable<Object> observableFilter = RNPublishSubject.INSTANCE.getOnInterCommunicateFromH5().observeOn(AndroidSchedulers.mainThread()).filter(new Predicate() { // from class: px.d
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return KRNEventEmitter.addListener$lambda$0(obj);
                }
            });
            Consumer<? super Object> consumer = new Consumer() { // from class: px.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KRNEventEmitter.addListener$lambda$1(this.f96109b, obj);
                }
            };
            final Function1 function1 = new Function1() { // from class: px.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KRNEventEmitter.addListener$lambda$2((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableFilter.subscribe(consumer, new Consumer() { // from class: px.g
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            RNH5InterActionHelper.registerDisposable(eventName, disposableSubscribe);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "KRNEventEmitter";
    }

    @ReactMethod
    public final void remove(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        C44128b.m97266j(RNConstantKt.LOG_TAG, "KRNEventEmitter.remove: eventName=" + eventName);
        removeListener(eventName);
    }

    @ReactMethod
    public final void removeListener(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        C44128b.m97266j(RNConstantKt.LOG_TAG, "KRNEventEmitter.removeListener: eventName=" + eventName);
        RNH5InterActionHelper.unRegisterDisposable(eventName);
    }

    @ReactMethod
    public final void removeListeners(int count) {
        this.listenerCount -= count;
        C44128b.m97266j(RNConstantKt.LOG_TAG, "KRNEventEmitter.removeListeners: count=" + count + "，listenerCount=" + this.listenerCount);
        if (this.listenerCount == 0) {
            RNH5InterActionHelper.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$2(Throwable th2) {
        C24267r0.m58519c(th2);
        return Unit.INSTANCE;
    }

    private final HashMap<String, Object> buildPageHidePayload(RNPageHideEvent event) {
        return MapsKt.hashMapOf(TuplesKt.m90091to("containerId", event.getContainerId()), TuplesKt.m90091to("toBackground", Boolean.valueOf(event.getToBackground())));
    }

    private final HashMap<String, Object> buildPageShowPayload(RNPageShowEvent event) {
        return MapsKt.hashMapOf(TuplesKt.m90091to("containerId", event.getContainerId()), TuplesKt.m90091to("fromBackground", Boolean.valueOf(event.getFromBackground())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listenCommonMsg$lambda$4(KRNEventEmitter kRNEventEmitter, Pair pair) {
        kRNEventEmitter.sendEvent((String) pair.getFirst(), C24267r0.m58522f((Map) pair.getSecond()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listenCommonMsg$lambda$6(Throwable th2) {
        C24267r0.m58519c(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listenUserPageVisibleEvent$lambda$10(Throwable th2) {
        C24267r0.m58519c(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listenUserPageVisibleEvent$lambda$12(KRNEventEmitter kRNEventEmitter, RNPageShowEvent rNPageShowEvent) {
        if (!kRNEventEmitter.shouldDispatchPageVisibilityEvent(rNPageShowEvent.getContainerId())) {
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(rNPageShowEvent);
        kRNEventEmitter.sendEvent(RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, C24267r0.m58522f(kRNEventEmitter.buildPageShowPayload(rNPageShowEvent)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listenUserPageVisibleEvent$lambda$14(Throwable th2) {
        C24267r0.m58519c(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listenUserPageVisibleEvent$lambda$8(KRNEventEmitter kRNEventEmitter, RNPageHideEvent rNPageHideEvent) {
        if (!kRNEventEmitter.shouldDispatchPageVisibilityEvent(rNPageHideEvent.getContainerId())) {
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(rNPageHideEvent);
        kRNEventEmitter.sendEvent(RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, C24267r0.m58522f(kRNEventEmitter.buildPageHidePayload(rNPageHideEvent)));
        return Unit.INSTANCE;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.invalidated = false;
        C44128b.m97266j(RNConstantKt.LOG_TAG, "initialize");
        listenUserPageVisibleEvent();
        listenCommonMsg();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.invalidated = true;
        C44128b.m97266j(RNConstantKt.LOG_TAG, "invalidate");
        this.compositeDisposable.dispose();
    }
}
