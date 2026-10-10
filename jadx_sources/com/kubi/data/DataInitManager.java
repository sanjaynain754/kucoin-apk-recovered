package com.kubi.data;

import android.annotation.SuppressLint;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.FiatCurrencyEntity;
import com.kubi.data.rate.CurrencyPrice;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.function.looper.KuCoinLooper;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.C27100x0;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.extensions.C27039d;
import dz.C36993c;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p262ff.InterfaceC37440a;
import p262ff.InterfaceC37441b;
import p402kf.C41016c;
import p852kotlin.Deprecated;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.data.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DataInitManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u0013\u001a\u00020\u000bJ\u001a\u0010\u0014\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/data/DataInitManager;", "", "<init>", "()V", "injector", "Lcom/kubi/data/DataInitManager$InitInjectData;", "getInjector", "()Lcom/kubi/data/DataInitManager$InitInjectData;", "setInjector", "(Lcom/kubi/data/DataInitManager$InitInjectData;)V", "startCurrencyRateLooper", "", "stopCurrencyRateLooper", "mHomeApi", "Lcom/kubi/data/api/IRateApi;", "getMHomeApi", "()Lcom/kubi/data/api/IRateApi;", "mHomeApi$delegate", "Lkotlin/Lazy;", "getSingleCurrency", "refreshUnitData", "consumer", "Lio/reactivex/functions/Consumer;", "", "InitInjectData", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DataInitManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DataInitManager f21486a = new DataInitManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static a f21487b = new b();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f21488c = LazyKt.lazy(new Function0() { // from class: com.kubi.data.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DataInitManager.m23662n();
        }
    });

    /* JADX INFO: renamed from: com.kubi.data.p$a */
    /* JADX INFO: compiled from: DataInitManager.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0005H&JP\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/data/DataInitManager$InitInjectData;", "", "hasLogin", "", "getUserId", "", "getUid", "getUserCurrency", "getAppName", "jumpToTransfer", "", FirebaseAnalytics.Param.CURRENCY, "fromSymbol", "toSymbol", "from", TypedValues.TransitionType.S_TO, "includeContract", "spmId", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: c */
        boolean mo23675c();

        @Deprecated(message = "请使用getUid", replaceWith = @ReplaceWith(expression = "getUid", imports = {}))
        @Nullable
        /* JADX INFO: renamed from: d */
        String mo23676d();

        @Nullable
        /* JADX INFO: renamed from: e */
        String mo23677e();

        @Nullable
        /* JADX INFO: renamed from: f */
        String mo23678f();

        /* JADX INFO: renamed from: g */
        void mo23679g(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z11, @Nullable String str6);

        @Nullable
        String getUid();
    }

    /* JADX INFO: renamed from: com.kubi.data.p$b */
    /* JADX INFO: compiled from: DataInitManager.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016JL\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0012"}, m90084d2 = {"com/kubi/data/DataInitManager$injector$1", "Lcom/kubi/data/DataInitManager$InitInjectData;", "hasLogin", "", "getUserId", "", "getUid", "getUserCurrency", "getAppName", "jumpToTransfer", "", FirebaseAnalytics.Param.CURRENCY, "fromSymbol", "toSymbol", "from", TypedValues.TransitionType.S_TO, "includeContract", "spmId", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements a {
        @Override // com.kubi.data.DataInitManager.a
        /* JADX INFO: renamed from: c */
        public boolean mo23675c() {
            return false;
        }

        @Override // com.kubi.data.DataInitManager.a
        /* JADX INFO: renamed from: d */
        public String mo23676d() {
            return DataInitManager.f21486a.toString();
        }

        @Override // com.kubi.data.DataInitManager.a
        /* JADX INFO: renamed from: e */
        public String mo23677e() {
            return "USD";
        }

        @Override // com.kubi.data.DataInitManager.a
        /* JADX INFO: renamed from: f */
        public String mo23678f() {
            return "";
        }

        @Override // com.kubi.data.DataInitManager.a
        public String getUid() {
            return DataInitManager.f21486a.toString();
        }

        @Override // com.kubi.data.DataInitManager.a
        /* JADX INFO: renamed from: g */
        public void mo23679g(String str, String str2, String str3, String str4, String str5, boolean z11, String str6) {
        }
    }

    /* JADX INFO: renamed from: l */
    public static final Boolean m23660l(final CurrencyPrice data, final HashMap it) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(it, "it");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.data.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DataInitManager.m23661m(data, it);
            }
        });
        C41016c.m89972j(data);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: v */
    public static final void m23667v() {
        f21486a.m23670k();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final a m23668i() {
        return f21487b;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final InterfaceC37441b m23669j() {
        Object value = f21488c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC37441b) value;
    }

    /* JADX INFO: renamed from: k */
    public final void m23670k() {
        ObservableSource observableSourceCompose;
        Double dM89969g = C41016c.m89969g("USD");
        if (dM89969g == null || Intrinsics.areEqual(dM89969g, 0.0d)) {
            observableSourceCompose = m23669j().m84237b("USD", C41016c.m89965c()).compose(C24217a1.m58389m());
        } else {
            HashMap map = new HashMap();
            map.put(C41016c.m89965c(), dM89969g);
            observableSourceCompose = Observable.just(map);
        }
        Observable observableZip = Observable.zip(m23669j().m84236a(C41016c.m89965c()).compose(C24217a1.m58389m()), observableSourceCompose, new BiFunction() { // from class: com.kubi.data.i
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return DataInitManager.m23660l((CurrencyPrice) obj, (HashMap) obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableZip, "zip(...)");
        FlowableCompatKt.m66389c(observableZip);
    }

    /* JADX INFO: renamed from: t */
    public final void m23672t(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        f21487b = aVar;
    }

    /* JADX INFO: renamed from: u */
    public final void m23673u() {
        KuCoinLooper.INSTANCE.addTask(new C36993c.b("getSingleCurrency").m82826f(new Runnable() { // from class: com.kubi.data.n
            @Override // java.lang.Runnable
            public final void run() {
                DataInitManager.m23667v();
            }
        }).m82829i(30L).m82828h());
    }

    /* JADX INFO: renamed from: w */
    public final void m23674w() {
        KuCoinLooper.INSTANCE.removeTask("getSingleCurrency");
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m23661m(CurrencyPrice currencyPrice, HashMap map) {
        currencyPrice.getPrice().put("USD", Double.valueOf(C27039d.m66646f((Double) map.get(C41016c.m89965c()))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC37441b m23662n() {
        return (InterfaceC37441b) C42597a.m93386b().create(InterfaceC37441b.class);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m23663p(Consumer consumer, List list) {
        C41016c.m89973k(list, consumer);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final void m23664q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m23665r(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final void m23666s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: o */
    public final void m23671o(@Nullable final Consumer<String> consumer) {
        long j11;
        Observable<BaseEntity<List<FiatCurrencyEntity>>> observableM84235a = ((InterfaceC37440a) C42597a.m93386b().create(InterfaceC37440a.class)).m84235a();
        if (!C41016c.f91251h.isEmpty()) {
            j11 = 6;
        } else {
            j11 = 0;
        }
        Observable<R> observableCompose = observableM84235a.delaySubscription(j11, TimeUnit.SECONDS).compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.data.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DataInitManager.m23663p(consumer, (List) obj);
            }
        };
        Consumer consumer2 = new Consumer() { // from class: com.kubi.data.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DataInitManager.m23664q(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.data.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DataInitManager.m23665r((Throwable) obj);
            }
        };
        observableCompose.subscribe(consumer2, new Consumer() { // from class: com.kubi.data.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DataInitManager.m23666s(function2, obj);
            }
        });
    }
}
