package com.kubi.p110rn.receiver;

import com.kubi.p110rn.modules.RNPublishSubject;
import com.kubi.p110rn.receiver.RnAccountStateObserver;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import com.kubi.user.model.AccountState;
import com.kubi.user.model.LoginUserEntity;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p351iy.C40192c;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import ro.C44128b;

/* JADX INFO: compiled from: RnAccountStateObserver.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0006\u0010\u0019\u001a\u00020\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/rn/receiver/RnAccountStateObserver;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "EVENT_NAME", "USER_CHANGE_EVENT_NAME", "KEY_EVENT", "KEY_FROM_ID", "KEY_TO_ID", "EVENT_LOGIN", "EVENT_LOGOUT", "EVENT_SWITCH_ACCOUNT", "EVENT_CURRENT_ACCOUNT_UPDATED", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "lastUserId", "isInitialized", "", "init", "", "subscribeUserInfoEvents", "dispose", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RnAccountStateObserver {

    @NotNull
    private static final String EVENT_CURRENT_ACCOUNT_UPDATED = "currentaccountupdated";

    @NotNull
    private static final String EVENT_LOGIN = "login";

    @NotNull
    private static final String EVENT_LOGOUT = "logout";

    @NotNull
    private static final String EVENT_NAME = "onAccountChanged";

    @NotNull
    private static final String EVENT_SWITCH_ACCOUNT = "switchAccount";

    @NotNull
    private static final String KEY_EVENT = "event";

    @NotNull
    private static final String KEY_FROM_ID = "fromid";

    @NotNull
    private static final String KEY_TO_ID = "toid";

    @NotNull
    private static final String USER_CHANGE_EVENT_NAME = "onUserInfoUpdated";
    private static boolean isInitialized;

    @Nullable
    private static String lastUserId;

    @NotNull
    public static final RnAccountStateObserver INSTANCE = new RnAccountStateObserver();

    @NotNull
    private static final String TAG = "RnAccountStateObserver";

    @NotNull
    private static final CompositeDisposable compositeDisposable = new CompositeDisposable();

    public final synchronized void init() {
        if (C40192c.f89321a.m88546h()) {
            return;
        }
        if (isInitialized) {
            return;
        }
        isInitialized = true;
        subscribeUserInfoEvents();
    }

    /* JADX INFO: compiled from: RnAccountStateObserver.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountState.values().length];
            try {
                iArr[AccountState.Login.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountState.Logout.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountState.SwitchAccount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void subscribeUserInfoEvents() {
        CompositeDisposable compositeDisposable2 = compositeDisposable;
        UserInfo userInfo = UserInfo.a;
        Observable observableA = userInfo.a();
        final Function1 function1 = new Function1() { // from class: rx.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RnAccountStateObserver.subscribeUserInfoEvents$lambda$0((AccountEventState) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: rx.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: rx.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RnAccountStateObserver.subscribeUserInfoEvents$lambda$2((Throwable) obj);
            }
        };
        compositeDisposable2.add(observableA.subscribe(consumer, new Consumer() { // from class: rx.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        }));
        Observable observableObserveOn = userInfo.j().observeOn(Schedulers.trampoline());
        final Function1 function3 = new Function1() { // from class: rx.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RnAccountStateObserver.subscribeUserInfoEvents$lambda$4((LoginUserEntity) obj);
            }
        };
        Consumer consumer2 = new Consumer() { // from class: rx.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function3.invoke(obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: rx.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RnAccountStateObserver.subscribeUserInfoEvents$lambda$6((Throwable) obj);
            }
        };
        compositeDisposable2.add(observableObserveOn.subscribe(consumer2, new Consumer() { // from class: rx.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function4.invoke(obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeUserInfoEvents$lambda$0(AccountEventState accountEventState) {
        HashMap mapHashMapOf;
        String strI = UserInfo.a.i();
        AccountState state = accountEventState.getState();
        int i11 = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                Pair pairM90091to = TuplesKt.m90091to("event", EVENT_LOGOUT);
                String preUid = accountEventState.getPreUid();
                mapHashMapOf = MapsKt.hashMapOf(pairM90091to, TuplesKt.m90091to(KEY_FROM_ID, (preUid == null && (preUid = lastUserId) == null) ? "" : preUid));
            } else {
                if (i11 != 3) {
                    return Unit.INSTANCE;
                }
                Pair pairM90091to2 = TuplesKt.m90091to("event", EVENT_SWITCH_ACCOUNT);
                String preUid2 = accountEventState.getPreUid();
                mapHashMapOf = MapsKt.hashMapOf(pairM90091to2, TuplesKt.m90091to(KEY_FROM_ID, (preUid2 == null && (preUid2 = lastUserId) == null) ? "" : preUid2), TuplesKt.m90091to(KEY_TO_ID, strI));
            }
        } else {
            mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("event", "login"), TuplesKt.m90091to(KEY_TO_ID, strI));
        }
        lastUserId = strI;
        C44128b.m97266j(TAG, "subscribeUserInfoEvents accountEventState: " + accountEventState + " info " + mapHashMapOf + " EVENT_NAME onAccountChanged");
        RNPublishSubject.INSTANCE.getNativeNotifyRn().onNext(new Pair<>(EVENT_NAME, mapHashMapOf));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeUserInfoEvents$lambda$2(Throwable th2) {
        C44128b.m97261e(TAG, "accountEventStateObs error: " + th2.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeUserInfoEvents$lambda$4(LoginUserEntity loginUserEntity) {
        C44128b.m97266j(TAG, "compositeDisposable EVENT_NAME currentaccountupdated");
        RNPublishSubject.INSTANCE.getNativeNotifyRn().onNext(new Pair<>(USER_CHANGE_EVENT_NAME, MapsKt.hashMapOf(TuplesKt.m90091to("event", EVENT_CURRENT_ACCOUNT_UPDATED))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeUserInfoEvents$lambda$6(Throwable th2) {
        C44128b.m97261e(TAG, "userInfoObs error: " + th2.getMessage());
        return Unit.INSTANCE;
    }

    public final void dispose() {
        compositeDisposable.clear();
        isInitialized = false;
    }

    @NotNull
    public final String getTAG() {
        return TAG;
    }

    private RnAccountStateObserver() {
    }
}
