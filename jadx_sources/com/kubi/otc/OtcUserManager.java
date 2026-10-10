package com.kubi.otc;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.kubi.otc.entity.ConfigDate;
import com.kubi.otc.entity.OtcUserInfo;
import com.kubi.otc.exception.OtcMessage;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.utils.C27099x;
import et.InterfaceC37240b;
import et.InterfaceC37241c;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.otc.v, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OtcUserManager.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\b\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\u001a\u0010\u0015\u001a\u00020\u0012*\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0018R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/otc/OtcUserManager;", "", "<init>", "()V", "configDate", "Lcom/kubi/otc/entity/ConfigDate;", "otcUserInfo", "Lcom/kubi/otc/entity/OtcUserInfo;", "getOtcUserInfo", "()Lcom/kubi/otc/entity/OtcUserInfo;", "setOtcUserInfo", "(Lcom/kubi/otc/entity/OtcUserInfo;)V", "isHighKycLevel", "", "getKycLevel", "", "isRealLowKycLevel", "clearOtcUserInfo", "", "nothing", "Lio/reactivex/functions/Action;", "getPayConfig", "Lcom/kubi/sdk/BaseFragment;", "consumer", "Lio/reactivex/functions/Consumer;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOtcUserManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcUserManager.kt\ncom/kubi/otc/OtcUserManager\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,87:1\n48#2,2:88\n*S KotlinDebug\n*F\n+ 1 OtcUserManager.kt\ncom/kubi/otc/OtcUserManager\n*L\n51#1:88,2\n*E\n"})
public final class OtcUserManager {

    /* JADX INFO: renamed from: b */
    @Nullable
    public static ConfigDate f38145b;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final OtcUserManager f38144a = new OtcUserManager();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static OtcUserInfo f38146c = new OtcUserInfo(0, null, null, null, false, null, null, null, null, null, null, null, null, 8191, null);

    /* JADX INFO: renamed from: com.kubi.otc.v$a */
    /* JADX INFO: compiled from: OtcUserManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/OtcUserManager$getPayConfig$2", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends C24223c1 {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Consumer<ConfigDate> f38147d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Consumer<ConfigDate> consumer) {
            super(null, true);
            this.f38147d = consumer;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) throws Exception {
            super.accept(th2);
            this.f38147d.accept(null);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m45480l(OtcUserManager otcUserManager, Action action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            action = null;
        }
        otcUserManager.m45491k(action);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m45481m(OtcUserInfo otcUserInfo) {
        C46392a.m102333p(PaymentStorageId.f40364a.m49845w().m102384f(OtcDepend.f38138a.m45463l()), C27099x.m66919i(otcUserInfo, false, 2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final void m45487t(Consumer consumer, ConfigDate configDate) throws Exception {
        f38145b = configDate;
        consumer.accept(configDate);
    }

    /* JADX INFO: renamed from: h */
    public final void m45488h() {
        f38146c = new OtcUserInfo(0, null, null, null, false, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX INFO: renamed from: i */
    public final int m45489i() {
        return f38146c.getKycLevel();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final OtcUserInfo m45490j() {
        return f38146c;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: k */
    public final void m45491k(@Nullable final Action action) {
        OtcDepend otcDepend = OtcDepend.f38138a;
        if (otcDepend.m45466o()) {
            String strM102326h = C46392a.m102326h(PaymentStorageId.f40364a.m49845w().m102384f(otcDepend.m45463l()), "");
            if (!TextUtils.isEmpty(strM102326h)) {
                try {
                    f38146c = (OtcUserInfo) C27099x.m66913c(strM102326h, OtcUserInfo.class);
                } catch (Exception unused) {
                    C43846g.m96568c(new OtcMessage(strM102326h, "OtcUserManager", false, 4, null), null, 2, null);
                }
            }
            Observable<R> observableCompose = ((InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class)).m83313C().compose(C24217a1.m58390n());
            final Function1 function1 = new Function1() { // from class: com.kubi.otc.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtcUserManager.m45481m((OtcUserInfo) obj);
                }
            };
            Observable observableObserveOn = observableCompose.doOnNext(new Consumer() { // from class: com.kubi.otc.p
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OtcUserManager.m45482n(function1, obj);
                }
            }).observeOn(C42916f.m94128g());
            final Function1 function2 = new Function1() { // from class: com.kubi.otc.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtcUserManager.m45483o(action, (OtcUserInfo) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.otc.r
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OtcUserManager.m45484p(function2, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.otc.s
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtcUserManager.m45485q((Throwable) obj);
                }
            };
            observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.otc.t
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OtcUserManager.m45486r(function3, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m45492s(@NotNull BaseFragment baseFragment, @NotNull final Consumer<ConfigDate> consumer) throws Exception {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        ConfigDate configDate = f38145b;
        if (configDate != null) {
            consumer.accept(configDate);
            return;
        }
        Disposable disposableSubscribe = ((InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class)).m83299l().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.otc.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                OtcUserManager.m45487t(consumer, (ConfigDate) obj);
            }
        }, new a(consumer));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, baseFragment.getDestroyDisposable());
    }

    /* JADX INFO: renamed from: u */
    public final boolean m45493u() {
        return f38146c.isHighKycLevel();
    }

    /* JADX INFO: renamed from: n */
    public static final void m45482n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m45483o(Action action, OtcUserInfo otcUserInfo) throws Exception {
        Intrinsics.checkNotNull(otcUserInfo);
        f38146c = otcUserInfo;
        if (action != null) {
            action.run();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final void m45484p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m45485q(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final void m45486r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
