package com.kubi.p110rn.receiver;

import android.annotation.SuppressLint;
import com.blankj.utilcode.util.NetworkUtils;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.receiver.NetworkChangeReceiverDebounce;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.util.C24267r0;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RnNetworkChangedReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/rn/receiver/NetworkChangeReceiverDebounce;", "", "<init>", "()V", "networkChangeObs", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getNetworkChangeObs", "()Lio/reactivex/subjects/PublishSubject;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult", "MissingPermission"})
public final class NetworkChangeReceiverDebounce {

    @NotNull
    public static final NetworkChangeReceiverDebounce INSTANCE = new NetworkChangeReceiverDebounce();

    @NotNull
    private static final PublishSubject<Boolean> networkChangeObs;

    static {
        PublishSubject<Boolean> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        networkChangeObs = publishSubjectCreate;
        Observable<Boolean> observableDebounce = publishSubjectCreate.debounce(400L, TimeUnit.MILLISECONDS);
        final Function1 function1 = new Function1() { // from class: rx.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NetworkChangeReceiverDebounce._init_$lambda$3((Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: rx.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: rx.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NetworkChangeReceiverDebounce._init_$lambda$5((Throwable) obj);
            }
        };
        observableDebounce.subscribe(consumer, new Consumer() { // from class: rx.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(Boolean bool) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            IReactNativeService iReactNativeService = IReactNativeService.INSTANCE.get();
            HashMap<String, Object> map = new HashMap<>();
            NetworkUtils.NetworkType networkTypeM6057e = NetworkUtils.m6057e();
            Intrinsics.checkNotNullExpressionValue(networkTypeM6057e, "getNetworkType(...)");
            map.put("networkType", C24267r0.m58523g(networkTypeM6057e));
            Unit unit = Unit.INSTANCE;
            iReactNativeService.nativeNotifyRn("onNetworkChange", map);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C23985b.f47489a.m57876c("sendEvent", "NetworkChangeReceiverDebounce failed", thM103847exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$5(Throwable th2) {
        C23985b.f47489a.m57876c("sendEvent", "NetworkChangeReceiverDebounce failed", th2);
        return Unit.INSTANCE;
    }

    @NotNull
    public final PublishSubject<Boolean> getNetworkChangeObs() {
        return networkChangeObs;
    }

    private NetworkChangeReceiverDebounce() {
    }
}
