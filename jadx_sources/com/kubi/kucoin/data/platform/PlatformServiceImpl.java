package com.kubi.kucoin.data.platform;

import android.annotation.SuppressLint;
import com.kubi.kucoin.data.IInternal;
import com.kubi.kucoin.data.platform.model.CountryEntity;
import com.kubi.kucoin.data.platform.model.CountryFilterResult;
import com.kubi.kucoin.data.platform.model.IpCountryEntity;
import com.kubi.network.retrofit.exception.DataNullException;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24217a1;
import com.tencent.bugly.proguard.C33590cg;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: PlatformServiceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J&\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u0014H\u0016J,\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00110\u0014H\u0017J,\u0010\u001a\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00110\u0014H\u0017J\b\u0010\u001b\u001a\u00020\u0011H\u0016J8\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u00110\u0014H\u0016J\b\u0010\"\u001a\u00020\u000fH\u0016J\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0016J<\u0010$\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001f\u001a\u00020\u000f2\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u00110\u0014H\u0002J2\u0010&\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u00110\u0014H\u0082@¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u0004\u0018\u00010!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\f\u0010)\u001a\u00020!*\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/kucoin/data/platform/PlatformServiceImpl;", "Lcom/kubi/kucoin/data/platform/IPlatformService;", "Lcom/kubi/kucoin/data/IInternal;", "platformApi", "Lcom/kubi/kucoin/data/platform/IPlatformApi;", "<init>", "(Lcom/kubi/kucoin/data/platform/IPlatformApi;)V", "()V", "ipCountryApi", "Lcom/kubi/kucoin/data/platform/IpCountryApi;", "getIpCountryApi", "()Lcom/kubi/kucoin/data/platform/IpCountryApi;", "ipCountryApi$delegate", "Lkotlin/Lazy;", "codeAndMobileCode", "", "checkIfSupportVoice", "", "mobileCode", "onNext", "Lkotlin/Function1;", "", "fetchCountryList", "sceneCode", "", "Lcom/kubi/kucoin/data/platform/model/CountryEntity;", "fetchCountryListOnce", "init", "filterCountryByIpAndLanguage", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "prefillMobileCode", TUIConstants.TUIChat.CALL_BACK, "Lcom/kubi/kucoin/data/platform/model/CountryFilterResult;", "getIpCodeAndMobileCodeStr", "getCachedCountryList", "doFilter", "countryList", "filterByIp", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filterByLanguage", "toFilterResult", "Companion", "LAppCountry_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPlatformServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformServiceImpl.kt\ncom/kubi/kucoin/data/platform/PlatformServiceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,254:1\n295#2,2:255\n295#2,2:262\n1761#2,3:264\n1869#2,2:267\n1869#2,2:269\n1869#2,2:271\n25#3:257\n26#3:259\n48#3,2:260\n1#4:258\n*S KotlinDebug\n*F\n+ 1 PlatformServiceImpl.kt\ncom/kubi/kucoin/data/platform/PlatformServiceImpl\n*L\n180#1:255,2\n234#1:262,2\n50#1:264,3\n70#1:267,2\n86#1:269,2\n117#1:271,2\n223#1:257\n223#1:259\n225#1:260,2\n223#1:258\n*E\n"})
public final class PlatformServiceImpl implements IPlatformService, IInternal {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f27733d = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final ConcurrentHashMap<String, List<CountryEntity>> f27734e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    @NotNull
    public final IPlatformApi f27735a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f27736b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public volatile String f27737c;

    /* JADX INFO: compiled from: PlatformServiceImpl.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kucoin/data/platform/PlatformServiceImpl$Companion;", "", "<init>", "()V", C33590cg.f69440j, "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "Lcom/kubi/kucoin/data/platform/model/CountryEntity;", "LAppCountry_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public PlatformServiceImpl(@NotNull IPlatformApi platformApi) {
        Intrinsics.checkNotNullParameter(platformApi, "platformApi");
        this.f27735a = platformApi;
        this.f27736b = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.data.platform.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlatformServiceImpl.m32026u0();
            }
        });
        this.f27737c = "";
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m31987P(Function1 function1, String str, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        boolean z11 = false;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CountryEntity countryEntity = (CountryEntity) it.next();
                if (Intrinsics.areEqual(countryEntity.getMobileCode(), str) && countryEntity.getVoiceAllowed()) {
                    z11 = true;
                    break;
                }
            }
        }
        function1.invoke(Boolean.valueOf(z11));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m31989S(Throwable th2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final List m31991U(String str, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CountryEntity countryEntity = (CountryEntity) it.next();
            if (countryEntity.getMobileCode().length() > 0 && !StringsKt.startsWith$default(countryEntity.getMobileCode(), "+", false, 2, (Object) null)) {
                countryEntity.setMobileCode('+' + countryEntity.getMobileCode());
            }
            countryEntity.setSceneCode(str == null ? "" : str);
        }
        return list;
    }

    /* JADX INFO: renamed from: V */
    public static final List m31992V(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m31993W(String str, List list) {
        f27734e.put(str, list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c0 */
    public static final List m32002c0(String str, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CountryEntity countryEntity = (CountryEntity) it.next();
            if (countryEntity.getMobileCode().length() > 0 && !StringsKt.startsWith$default(countryEntity.getMobileCode(), "+", false, 2, (Object) null)) {
                countryEntity.setMobileCode('+' + countryEntity.getMobileCode());
            }
            countryEntity.setSceneCode(str == null ? "" : str);
        }
        return list;
    }

    /* JADX INFO: renamed from: d0 */
    public static final List m32004d0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: e0 */
    public static final Unit m32005e0(String str, List list) {
        f27734e.put(str, list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m32007g0(List list) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i0 */
    public static final List m32009i0(String str, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CountryEntity countryEntity = (CountryEntity) it.next();
            if (countryEntity.getMobileCode().length() > 0 && !StringsKt.startsWith$default(countryEntity.getMobileCode(), "+", false, 2, (Object) null)) {
                countryEntity.setMobileCode('+' + countryEntity.getMobileCode());
            }
            countryEntity.setSceneCode(str == null ? "" : str);
        }
        return list;
    }

    /* JADX INFO: renamed from: j0 */
    public static final List m32010j0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: k0 */
    public static final Unit m32011k0(String str, List list) {
        f27734e.put(str, list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m32023s0(PlatformServiceImpl platformServiceImpl, InterfaceC41709m0 interfaceC41709m0, String str, Function1 function1, List countryList) {
        Intrinsics.checkNotNullParameter(countryList, "countryList");
        platformServiceImpl.m32032Q(interfaceC41709m0, countryList, str, function1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u0 */
    public static final IpCountryApi m32026u0() {
        return (IpCountryApi) RetrofitFlowExKt.m42820a(IpCountryApi.class);
    }

    @Override // com.kubi.kucoin.data.platform.IPlatformService
    /* JADX INFO: renamed from: e */
    public void mo32033e(@Nullable final String str, @NotNull final Function1<? super Boolean, Unit> onNext) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        if (str == null || str.length() == 0) {
            onNext.invoke(Boolean.FALSE);
            return;
        }
        try {
            IPlatformService.m32055i(this, null, new Function1() { // from class: com.kubi.kucoin.data.platform.s
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PlatformServiceImpl.m31987P(onNext, str, (List) obj);
                }
            }, 1, null);
        } catch (Exception unused) {
            onNext.invoke(Boolean.FALSE);
        }
    }

    @Override // com.kubi.kucoin.data.platform.IPlatformService
    @NotNull
    /* JADX INFO: renamed from: f */
    public List<CountryEntity> mo32034f(@Nullable String str) {
        ConcurrentHashMap<String, List<CountryEntity>> concurrentHashMap = f27734e;
        if (str == null) {
            str = "";
        }
        List<CountryEntity> list = concurrentHashMap.get(str);
        if (list != null) {
            return list;
        }
        List<CountryEntity> list2 = concurrentHashMap.get("");
        return list2 == null ? CollectionsKt.emptyList() : list2;
    }

    @Override // com.kubi.kucoin.data.platform.IPlatformService
    /* JADX INFO: renamed from: g */
    public void mo32035g(@NotNull final InterfaceC41709m0 coroutineScope, @Nullable String str, @NotNull final String prefillMobileCode, @NotNull final Function1<? super CountryFilterResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(prefillMobileCode, "prefillMobileCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        mo32036h(str, new Function1() { // from class: com.kubi.kucoin.data.platform.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlatformServiceImpl.m32023s0(this.f27762b, coroutineScope, prefillMobileCode, callback, (List) obj);
            }
        });
    }

    @Override // com.kubi.kucoin.data.platform.IPlatformService
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: h */
    public void mo32036h(@Nullable final String str, @NotNull final Function1<? super List<CountryEntity>, Unit> onNext) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        final String str2 = str == null ? "" : str;
        List<CountryEntity> list = f27734e.get(str2);
        if (list != null) {
            onNext.invoke(list);
            return;
        }
        Observable<R> observableCompose = this.f27735a.m32054a(str).subscribeOn(Schedulers.m87969io()).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.data.platform.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlatformServiceImpl.m32009i0(str, (List) obj);
            }
        };
        Observable map = observableCompose.map(new Function() { // from class: com.kubi.kucoin.data.platform.t
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return PlatformServiceImpl.m32010j0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.data.platform.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlatformServiceImpl.m32011k0(str2, (List) obj);
            }
        };
        Observable observableObserveOn = map.doOnNext(new Consumer() { // from class: com.kubi.kucoin.data.platform.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlatformServiceImpl.m32012l0(function2, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.kucoin.data.platform.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlatformServiceImpl.m32013m0(onNext, (List) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kucoin.data.platform.x
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlatformServiceImpl.m32015n0(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.kucoin.data.platform.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlatformServiceImpl.m32017o0(onNext, (Throwable) obj);
            }
        };
        observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kucoin.data.platform.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlatformServiceImpl.m32019p0(function4, obj);
            }
        });
    }

    @Override // com.kubi.kucoin.data.platform.IPlatformService
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: j */
    public void mo32037j(@Nullable final String str, @NotNull final Function1<? super List<CountryEntity>, Unit> onNext) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        final String str2 = str == null ? "" : str;
        ConcurrentHashMap<String, List<CountryEntity>> concurrentHashMap = f27734e;
        List<CountryEntity> list = concurrentHashMap.get(str2);
        if (list == null) {
            list = concurrentHashMap.get("");
        }
        if (list == null) {
            Observable<R> observableCompose = this.f27735a.m32054a(str).subscribeOn(Schedulers.m87969io()).compose(C24217a1.m58389m());
            final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.data.platform.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PlatformServiceImpl.m31991U(str, (List) obj);
                }
            };
            Observable map = observableCompose.map(new Function() { // from class: com.kubi.kucoin.data.platform.p
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return PlatformServiceImpl.m31992V(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.data.platform.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PlatformServiceImpl.m31993W(str2, (List) obj);
                }
            };
            Observable observableObserveOn = map.doOnNext(new Consumer() { // from class: com.kubi.kucoin.data.platform.c0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PlatformServiceImpl.m31994X(function2, obj);
                }
            }).observeOn(AndroidSchedulers.mainThread());
            final Function1 function3 = new Function1() { // from class: com.kubi.kucoin.data.platform.d0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PlatformServiceImpl.m31995Y(onNext, (List) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.kucoin.data.platform.e0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PlatformServiceImpl.m31996Z(function3, obj);
                }
            };
            final Function1 function4 = new Function1() { // from class: com.kubi.kucoin.data.platform.f0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PlatformServiceImpl.m31998a0(onNext, (Throwable) obj);
                }
            };
            observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kucoin.data.platform.g0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PlatformServiceImpl.m32000b0(function4, obj);
                }
            });
            return;
        }
        Observable<R> observableCompose2 = this.f27735a.m32054a(str).subscribeOn(Schedulers.m87969io()).compose(C24217a1.m58389m());
        final Function1 function5 = new Function1() { // from class: com.kubi.kucoin.data.platform.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlatformServiceImpl.m32002c0(str, (List) obj);
            }
        };
        Observable map2 = observableCompose2.map(new Function() { // from class: com.kubi.kucoin.data.platform.h0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return PlatformServiceImpl.m32004d0(function5, obj);
            }
        });
        final Function1 function6 = new Function1() { // from class: com.kubi.kucoin.data.platform.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlatformServiceImpl.m32005e0(str2, (List) obj);
            }
        };
        Observable observableDoOnNext = map2.doOnNext(new Consumer() { // from class: com.kubi.kucoin.data.platform.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlatformServiceImpl.m32006f0(function6, obj);
            }
        });
        final Function1 function7 = new Function1() { // from class: com.kubi.kucoin.data.platform.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlatformServiceImpl.m32007g0((List) obj);
            }
        };
        Consumer consumer2 = new Consumer() { // from class: com.kubi.kucoin.data.platform.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlatformServiceImpl.m32008h0(function7, obj);
            }
        };
        final Function1 function8 = new Function1() { // from class: com.kubi.kucoin.data.platform.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlatformServiceImpl.m31989S((Throwable) obj);
            }
        };
        observableDoOnNext.subscribe(consumer2, new Consumer() { // from class: com.kubi.kucoin.data.platform.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlatformServiceImpl.m31990T(function8, obj);
            }
        });
        onNext.invoke(list);
    }

    @Override // com.kubi.kucoin.data.platform.IPlatformService
    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public String getF27737c() {
        return this.f27737c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: q0 */
    public final Object m32039q0(List<CountryEntity> list, Function1<? super CountryFilterResult, Unit> function1, Continuation<? super Unit> continuation) {
        PlatformServiceImpl$filterByIp$1 platformServiceImpl$filterByIp$1;
        if (continuation instanceof PlatformServiceImpl$filterByIp$1) {
            platformServiceImpl$filterByIp$1 = (PlatformServiceImpl$filterByIp$1) continuation;
            int i11 = platformServiceImpl$filterByIp$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                platformServiceImpl$filterByIp$1.label = i11 - Integer.MIN_VALUE;
            } else {
                platformServiceImpl$filterByIp$1 = new PlatformServiceImpl$filterByIp$1(this, continuation);
            }
        } else {
            platformServiceImpl$filterByIp$1 = new PlatformServiceImpl$filterByIp$1(this, continuation);
        }
        PlatformServiceImpl$filterByIp$1 platformServiceImpl$filterByIp$2 = platformServiceImpl$filterByIp$1;
        Object objM42824e = platformServiceImpl$filterByIp$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = platformServiceImpl$filterByIp$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41634e<IpCountryEntity> interfaceC41634eM32058a = m32041t0().m32058a();
            PlatformServiceImpl$filterByIp$2 platformServiceImpl$filterByIp$3 = new PlatformServiceImpl$filterByIp$2(function1, this, list, null);
            platformServiceImpl$filterByIp$2.L$0 = SpillingKt.nullOutSpilledVariable(list);
            platformServiceImpl$filterByIp$2.L$1 = function1;
            platformServiceImpl$filterByIp$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM32058a, false, platformServiceImpl$filterByIp$3, platformServiceImpl$filterByIp$2, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) platformServiceImpl$filterByIp$2.L$1;
            ResultKt.throwOnFailure(objM42824e);
        }
        C19334f c19334f = (C19334f) objM42824e;
        if (c19334f.getThrowable() != null) {
            function1.invoke(null);
        }
        if (c19334f.getThrowable() instanceof DataNullException) {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t0 */
    public final IpCountryApi m32041t0() {
        return (IpCountryApi) this.f27736b.getValue();
    }

    /* JADX INFO: renamed from: v0 */
    public final CountryFilterResult m32042v0(CountryEntity countryEntity) {
        return new CountryFilterResult(countryEntity.getCode(), countryEntity.getMobileCode(), countryEntity.getEn(), countryEntity.getCn(), countryEntity.getVoiceAllowed(), countryEntity.getIco(), countryEntity.isDismissed());
    }

    /* JADX INFO: renamed from: R */
    public static final void m31988R(InterfaceC41709m0 interfaceC41709m0, Function1<? super CountryFilterResult, Unit> function1, CountryFilterResult countryFilterResult) {
        C41696j.m91104d(interfaceC41709m0, C42911a.m94121c(), null, new PlatformServiceImpl$doFilter$emit$1(function1, countryFilterResult, null), 2, null);
    }

    /* JADX INFO: renamed from: T */
    public static final void m31990T(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X */
    public static final void m31994X(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m31995Y(Function1 function1, List list) {
        Intrinsics.checkNotNull(list);
        function1.invoke(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public static final void m31996Z(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m31998a0(Function1 function1, Throwable th2) {
        function1.invoke(CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m32000b0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m32006f0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m32008h0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m32012l0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m32013m0(Function1 function1, List list) {
        Intrinsics.checkNotNull(list);
        function1.invoke(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m32015n0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m32017o0(Function1 function1, Throwable th2) {
        function1.invoke(CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m32019p0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q */
    public final void m32032Q(InterfaceC41709m0 interfaceC41709m0, List<CountryEntity> list, String str, Function1<? super CountryFilterResult, Unit> function1) {
        Object obj = null;
        if (list.isEmpty()) {
            m31988R(interfaceC41709m0, function1, null);
            return;
        }
        if (!StringsKt.isBlank(str)) {
            for (Object obj2 : list) {
                CountryEntity countryEntity = (CountryEntity) obj2;
                if (Intrinsics.areEqual(countryEntity.getMobileCode(), str) && !countryEntity.isDismissed()) {
                    obj = obj2;
                    break;
                }
            }
            CountryEntity countryEntity2 = (CountryEntity) obj;
            if (countryEntity2 != null) {
                m31988R(interfaceC41709m0, function1, m32042v0(countryEntity2));
                return;
            }
        }
        C41696j.m91104d(interfaceC41709m0, C42911a.m94120b(), null, new PlatformServiceImpl$doFilter$1(this, list, interfaceC41709m0, function1, null), 2, null);
    }

    /* JADX INFO: renamed from: r0 */
    public final CountryFilterResult m32040r0(List<CountryEntity> list) {
        Object next;
        Iterator<T> it = list.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(((CountryEntity) next).getCode(), MultiLanguageManager.f46811g.getLocale().getCountry()));
        CountryEntity countryEntity = (CountryEntity) next;
        if (countryEntity == null) {
            return null;
        }
        return m32042v0(countryEntity);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PlatformServiceImpl() {
        Object objCreate = C42597a.m93386b().create(IPlatformApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this((IPlatformApi) objCreate);
    }

    @Override // com.kubi.kucoin.data.IInternal
    public void init() {
    }
}
