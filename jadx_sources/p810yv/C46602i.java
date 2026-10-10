package p810yv;

import android.annotation.SuppressLint;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.redpackage.RedPackageApi;
import com.kubi.redpackage.entity.CurrenciesConfig;
import com.kubi.redpackage.entity.RedConfig;
import com.kubi.sdk.util.C24217a1;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27024b;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: yv.i */
/* JADX INFO: compiled from: RedPackageSupportHelper.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0007J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006R2\u0010\u0004\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/redpackage/service/RedPackageSupportHelper;", "", "<init>", "()V", "supportCoins", "", "", "kotlin.jvm.PlatformType", "", "getSupportRedPackageCoin", "", "supportRedPackage", "", FirebaseAnalytics.Param.CURRENCY, "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRedPackageSupportHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedPackageSupportHelper.kt\ncom/kubi/redpackage/service/RedPackageSupportHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1563#2:54\n1634#2,3:55\n1563#2:58\n1634#2,3:59\n*S KotlinDebug\n*F\n+ 1 RedPackageSupportHelper.kt\ncom/kubi/redpackage/service/RedPackageSupportHelper\n*L\n38#1:54\n38#1:55,3\n39#1:58\n39#1:59,3\n*E\n"})
public final class C46602i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46602i f104351a = new C46602i();

    /* JADX INFO: renamed from: b */
    public static final Set<String> f104352b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: i */
    public static final Unit m102752i() {
        if (!UserInfo.a.n()) {
            return Unit.INSTANCE;
        }
        RedPackageApi redPackageApi = (RedPackageApi) C42597a.m93386b().create(RedPackageApi.class);
        Observable observableCompose = RedPackageApi.m53725b(redPackageApi, 0, 1, null).compose(C24217a1.m58389m());
        ObservableSource observableSourceCompose = redPackageApi.m53733g(1).compose(C24217a1.m58389m());
        final Function2 function2 = new Function2() { // from class: yv.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C46602i.m102753j((RedConfig) obj, (RedConfig) obj2);
            }
        };
        Observable observableObserveOn = Observable.zip(observableCompose, observableSourceCompose, new BiFunction() { // from class: yv.d
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C46602i.m102754k(function2, obj, obj2);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: yv.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46602i.m102755l((HashSet) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: yv.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C46602i.m102756m(function1, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: yv.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46602i.m102757n((Throwable) obj);
            }
        };
        observableObserveOn.subscribe(consumer, new Consumer() { // from class: yv.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C46602i.m102758o(function3, obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final HashSet m102753j(RedConfig t11, RedConfig t12) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        HashSet hashSet = new HashSet();
        ArrayList<CurrenciesConfig> currenciesConfigs = t11.getCurrenciesConfigs();
        ArrayList arrayList2 = null;
        if (currenciesConfigs != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currenciesConfigs, 10));
            Iterator<T> it = currenciesConfigs.iterator();
            while (it.hasNext()) {
                String currencyCode = ((CurrenciesConfig) it.next()).getCurrencyCode();
                if (currencyCode == null) {
                    currencyCode = "";
                }
                arrayList.add(currencyCode);
            }
        } else {
            arrayList = null;
        }
        hashSet.addAll(C27024b.m66560c(arrayList));
        ArrayList<CurrenciesConfig> currenciesConfigs2 = t12.getCurrenciesConfigs();
        if (currenciesConfigs2 != null) {
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(currenciesConfigs2, 10));
            Iterator<T> it2 = currenciesConfigs2.iterator();
            while (it2.hasNext()) {
                String currencyCode2 = ((CurrenciesConfig) it2.next()).getCurrencyCode();
                if (currencyCode2 == null) {
                    currencyCode2 = "";
                }
                arrayList2.add(currencyCode2);
            }
        }
        hashSet.addAll(C27024b.m66560c(arrayList2));
        return hashSet;
    }

    /* JADX INFO: renamed from: k */
    public static final HashSet m102754k(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (HashSet) function2.invoke(p11, p12);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m102755l(HashSet hashSet) {
        Set<String> set = f104352b;
        set.clear();
        Intrinsics.checkNotNull(hashSet);
        set.addAll(hashSet);
        return Unit.INSTANCE;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: h */
    public final void m102759h() {
        C27100x0.m66923d(new Function0() { // from class: yv.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46602i.m102752i();
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final boolean m102760p(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Set<String> set = f104352b;
        if (set.isEmpty()) {
            return true;
        }
        return set.contains(currency);
    }

    /* JADX INFO: renamed from: m */
    public static final void m102756m(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m102757n(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final void m102758o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
