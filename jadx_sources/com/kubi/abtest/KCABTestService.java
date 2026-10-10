package com.kubi.abtest;

import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.abtest.api.IKCABTestService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: KCABTestService.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020 H\u0096@¢\u0006\u0002\u0010&J4\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\"2\u0006\u0010(\u001a\u00020 2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020 2\u0006\u0010)\u001a\u00020*H\u0082@¢\u0006\u0002\u0010+J.\u0010,\u001a\u00020 2\u0006\u0010(\u001a\u00020 2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020 2\u0006\u0010)\u001a\u00020*H\u0082@¢\u0006\u0002\u0010+J\u0018\u0010-\u001a\u00020 2\u0006\u0010)\u001a\u00020*2\u0006\u0010$\u001a\u00020 H\u0002J\f\u0010.\u001a\u00020/*\u00020 H\u0002R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010!\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\"0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/abtest/KCABTestService;", "Lcom/kubi/abtest/api/IKCABTestService;", "<init>", "()V", "apiServiceProvider", "Lkotlin/Function0;", "Lcom/kubi/abtest/KCABTestApiService;", "getApiServiceProvider$ABTest_googleRelease", "()Lkotlin/jvm/functions/Function0;", "setApiServiceProvider$ABTest_googleRelease", "(Lkotlin/jvm/functions/Function0;)V", "identityProvider", "Lcom/kubi/abtest/KCABTestIdentityProvider;", "getIdentityProvider$ABTest_googleRelease", "()Lcom/kubi/abtest/KCABTestIdentityProvider;", "setIdentityProvider$ABTest_googleRelease", "(Lcom/kubi/abtest/KCABTestIdentityProvider;)V", "requestScope", "Lkotlinx/coroutines/CoroutineScope;", "getRequestScope$ABTest_googleRelease", "()Lkotlinx/coroutines/CoroutineScope;", "setRequestScope$ABTest_googleRelease", "(Lkotlinx/coroutines/CoroutineScope;)V", "kcABTestApiService", "getKcABTestApiService", "()Lcom/kubi/abtest/KCABTestApiService;", "kcABTestApiService$delegate", "Lkotlin/Lazy;", "stateMutex", "Lkotlinx/coroutines/sync/Mutex;", "memoryCache", "", "", "runningRequests", "Lkotlinx/coroutines/Deferred;", "fastFetchABTest", RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID, "defaultValue", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrCreateRequest", "cacheKey", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, "Lcom/kubi/abtest/KCABTestIdentity;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/abtest/KCABTestIdentity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAndCache", "buildCacheKey", "isLegalValue", "", "ABTest_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCABTestService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCABTestService.kt\ncom/kubi/abtest/KCABTestService\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n116#2,8:152\n125#2,2:161\n116#2,11:163\n116#2,11:174\n1#3:160\n*S KotlinDebug\n*F\n+ 1 KCABTestService.kt\ncom/kubi/abtest/KCABTestService\n*L\n52#1:152,8\n52#1:161,2\n64#1:163,11\n98#1:174,11\n*E\n"})
public final class KCABTestService implements IKCABTestService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public Function0<? extends KCABTestApiService> f14765b = new Function0() { // from class: com.kubi.abtest.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KCABTestService.m14632h();
        }
    };

    /* JADX INFO: renamed from: c */
    @NotNull
    public KCABTestIdentityProvider f14766c = DefaultKCABTestIdentityProvider.f14849a;

    /* JADX INFO: renamed from: d */
    @NotNull
    public InterfaceC41709m0 f14767d = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C42911a.m94120b()));

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f14768e = LazyKt.lazy(new Function0() { // from class: com.kubi.abtest.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KCABTestService.m14633n(this.f14932b);
        }
    });

    /* JADX INFO: renamed from: f */
    @NotNull
    public final InterfaceC44082a f14769f = C44087f.m97144b(false, 1, null);

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Map<String, String> f14770g = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Map<String, InterfaceC41729r0<String>> f14771h = new LinkedHashMap();

    /* JADX INFO: renamed from: n */
    public static final KCABTestApiService m14633n(KCABTestService kCABTestService) {
        return kCABTestService.f14765b.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x012a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.kubi.abtest.api.IKCABTestService
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo14634a(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super String> continuation) {
        KCABTestService$fastFetchABTest$1 kCABTestService$fastFetchABTest$1;
        KCABTestIdentity kCABTestIdentityMo14640a;
        String str3;
        String str4;
        String str5;
        String str6;
        InterfaceC44082a interfaceC44082a;
        KCABTestIdentity kCABTestIdentity;
        String str7;
        String str8;
        KCABTestIdentity kCABTestIdentity2;
        String str9;
        Object objMo91198h;
        if (continuation instanceof KCABTestService$fastFetchABTest$1) {
            kCABTestService$fastFetchABTest$1 = (KCABTestService$fastFetchABTest$1) continuation;
            int i11 = kCABTestService$fastFetchABTest$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kCABTestService$fastFetchABTest$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kCABTestService$fastFetchABTest$1 = new KCABTestService$fastFetchABTest$1(this, continuation);
            }
        } else {
            kCABTestService$fastFetchABTest$1 = new KCABTestService$fastFetchABTest$1(this, continuation);
        }
        KCABTestService$fastFetchABTest$1 kCABTestService$fastFetchABTest$2 = kCABTestService$fastFetchABTest$1;
        Object objM14638l = kCABTestService$fastFetchABTest$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kCABTestService$fastFetchABTest$2.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM14638l);
                if (StringsKt.isBlank(str)) {
                    return str2;
                }
                kCABTestIdentityMo14640a = this.f14766c.mo14640a();
                String strM14635i = m14635i(kCABTestIdentityMo14640a, str);
                InterfaceC44082a interfaceC44082a2 = this.f14769f;
                kCABTestService$fastFetchABTest$2.L$0 = str;
                kCABTestService$fastFetchABTest$2.L$1 = str2;
                kCABTestService$fastFetchABTest$2.L$2 = kCABTestIdentityMo14640a;
                kCABTestService$fastFetchABTest$2.L$3 = strM14635i;
                kCABTestService$fastFetchABTest$2.L$4 = interfaceC44082a2;
                kCABTestService$fastFetchABTest$2.I$0 = 0;
                kCABTestService$fastFetchABTest$2.label = 1;
                if (interfaceC44082a2.mo91344d(null, kCABTestService$fastFetchABTest$2) != coroutine_suspended) {
                    str3 = str2;
                    str4 = strM14635i;
                    str5 = null;
                    str6 = str;
                    interfaceC44082a = interfaceC44082a2;
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                interfaceC44082a = (InterfaceC44082a) kCABTestService$fastFetchABTest$2.L$4;
                str4 = (String) kCABTestService$fastFetchABTest$2.L$3;
                kCABTestIdentityMo14640a = (KCABTestIdentity) kCABTestService$fastFetchABTest$2.L$2;
                String str10 = (String) kCABTestService$fastFetchABTest$2.L$1;
                String str11 = (String) kCABTestService$fastFetchABTest$2.L$0;
                ResultKt.throwOnFailure(objM14638l);
                str5 = null;
                str3 = str10;
                str6 = str11;
            } else {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM14638l);
                    return objM14638l;
                }
                str9 = (String) kCABTestService$fastFetchABTest$2.L$4;
                str7 = (String) kCABTestService$fastFetchABTest$2.L$3;
                kCABTestIdentity2 = (KCABTestIdentity) kCABTestService$fastFetchABTest$2.L$2;
                str8 = (String) kCABTestService$fastFetchABTest$2.L$1;
                str6 = (String) kCABTestService$fastFetchABTest$2.L$0;
                ResultKt.throwOnFailure(objM14638l);
            }
            kCABTestService$fastFetchABTest$2.L$0 = SpillingKt.nullOutSpilledVariable(str6);
            kCABTestService$fastFetchABTest$2.L$1 = SpillingKt.nullOutSpilledVariable(str8);
            kCABTestService$fastFetchABTest$2.L$2 = SpillingKt.nullOutSpilledVariable(kCABTestIdentity2);
            kCABTestService$fastFetchABTest$2.L$3 = SpillingKt.nullOutSpilledVariable(str7);
            kCABTestService$fastFetchABTest$2.L$4 = SpillingKt.nullOutSpilledVariable(str9);
            kCABTestService$fastFetchABTest$2.label = 3;
            objMo91198h = ((InterfaceC41729r0) objM14638l).mo91198h(kCABTestService$fastFetchABTest$2);
            if (objMo91198h != coroutine_suspended) {
                return coroutine_suspended;
            }
            return objMo91198h;
            String str12 = this.f14770g.get(str4);
            String str13 = (str12 == null || !m14639m(str12)) ? str5 : str12;
            interfaceC44082a.mo91345e(str5);
            if (str13 != null) {
                return str13;
            }
            kCABTestService$fastFetchABTest$2.L$0 = SpillingKt.nullOutSpilledVariable(str6);
            kCABTestService$fastFetchABTest$2.L$1 = SpillingKt.nullOutSpilledVariable(str3);
            kCABTestService$fastFetchABTest$2.L$2 = SpillingKt.nullOutSpilledVariable(kCABTestIdentity);
            kCABTestService$fastFetchABTest$2.L$3 = SpillingKt.nullOutSpilledVariable(str4);
            kCABTestService$fastFetchABTest$2.L$4 = SpillingKt.nullOutSpilledVariable(str13);
            kCABTestService$fastFetchABTest$2.label = 2;
            String str14 = str4;
            objM14638l = m14638l(str14, str6, str3, kCABTestIdentity, kCABTestService$fastFetchABTest$2);
            if (objM14638l != coroutine_suspended) {
                str7 = str14;
                str8 = str3;
                kCABTestIdentity2 = kCABTestIdentity;
                str9 = str13;
                kCABTestService$fastFetchABTest$2.L$0 = SpillingKt.nullOutSpilledVariable(str6);
                kCABTestService$fastFetchABTest$2.L$1 = SpillingKt.nullOutSpilledVariable(str8);
                kCABTestService$fastFetchABTest$2.L$2 = SpillingKt.nullOutSpilledVariable(kCABTestIdentity2);
                kCABTestService$fastFetchABTest$2.L$3 = SpillingKt.nullOutSpilledVariable(str7);
                kCABTestService$fastFetchABTest$2.L$4 = SpillingKt.nullOutSpilledVariable(str9);
                kCABTestService$fastFetchABTest$2.label = 3;
                objMo91198h = ((InterfaceC41729r0) objM14638l).mo91198h(kCABTestService$fastFetchABTest$2);
                if (objMo91198h != coroutine_suspended) {
                    return objMo91198h;
                }
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            interfaceC44082a.mo91345e(str5);
            throw th2;
        }
        kCABTestIdentity = kCABTestIdentityMo14640a;
    }

    /* JADX INFO: renamed from: i */
    public final String m14635i(KCABTestIdentity kCABTestIdentity, String str) {
        return kCABTestIdentity.getSite() + '_' + kCABTestIdentity.getDistinctId() + '_' + str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: j */
    public final Object m14636j(String str, String str2, String str3, KCABTestIdentity kCABTestIdentity, Continuation<? super String> continuation) {
        KCABTestService$fetchAndCache$1 kCABTestService$fetchAndCache$1;
        String str4;
        String str5;
        String str6;
        String str7;
        InterfaceC44082a interfaceC44082a;
        if (continuation instanceof KCABTestService$fetchAndCache$1) {
            kCABTestService$fetchAndCache$1 = (KCABTestService$fetchAndCache$1) continuation;
            int i11 = kCABTestService$fetchAndCache$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kCABTestService$fetchAndCache$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kCABTestService$fetchAndCache$1 = new KCABTestService$fetchAndCache$1(this, continuation);
            }
        } else {
            kCABTestService$fetchAndCache$1 = new KCABTestService$fetchAndCache$1(this, continuation);
        }
        KCABTestService$fetchAndCache$1 kCABTestService$fetchAndCache$2 = kCABTestService$fetchAndCache$1;
        Object objM14641a = kCABTestService$fetchAndCache$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kCABTestService$fetchAndCache$2.label;
        try {
            try {
                if (i12 == 0) {
                    ResultKt.throwOnFailure(objM14641a);
                    try {
                        KCABTestApiService kCABTestApiServiceM14637k = m14637k();
                        String distinctId = kCABTestIdentity.getDistinctId();
                        boolean isLoginId = kCABTestIdentity.getIsLoginId();
                        kCABTestService$fetchAndCache$2.L$0 = str;
                        kCABTestService$fetchAndCache$2.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                        kCABTestService$fetchAndCache$2.L$2 = str3;
                        kCABTestService$fetchAndCache$2.L$3 = SpillingKt.nullOutSpilledVariable(kCABTestIdentity);
                        kCABTestService$fetchAndCache$2.label = 1;
                        try {
                            objM14641a = kCABTestApiServiceM14637k.m14641a(str2, distinctId, isLoginId, str3, kCABTestService$fetchAndCache$2);
                            if (objM14641a != coroutine_suspended) {
                                str4 = str2;
                                str5 = str3;
                            }
                            return coroutine_suspended;
                        } catch (Exception unused) {
                            return str3;
                        }
                    } catch (Exception unused2) {
                        return str3;
                    }
                }
                if (i12 == 1) {
                    kCABTestIdentity = (KCABTestIdentity) kCABTestService$fetchAndCache$2.L$3;
                    str5 = (String) kCABTestService$fetchAndCache$2.L$2;
                    str4 = (String) kCABTestService$fetchAndCache$2.L$1;
                    str = (String) kCABTestService$fetchAndCache$2.L$0;
                    ResultKt.throwOnFailure(objM14641a);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC44082a = (InterfaceC44082a) kCABTestService$fetchAndCache$2.L$5;
                    str7 = (String) kCABTestService$fetchAndCache$2.L$4;
                    str6 = (String) kCABTestService$fetchAndCache$2.L$0;
                    ResultKt.throwOnFailure(objM14641a);
                }
                try {
                    this.f14770g.put(str6, str7);
                    Unit unit = Unit.INSTANCE;
                    return str7;
                } finally {
                    interfaceC44082a.mo91345e(null);
                }
                String value = ((KCABTest) objM14641a).getValue();
                if (value == null) {
                    value = "";
                }
                if (!m14639m(value)) {
                    return str5;
                }
                InterfaceC44082a interfaceC44082a2 = this.f14769f;
                kCABTestService$fetchAndCache$2.L$0 = str;
                kCABTestService$fetchAndCache$2.L$1 = SpillingKt.nullOutSpilledVariable(str4);
                kCABTestService$fetchAndCache$2.L$2 = str5;
                kCABTestService$fetchAndCache$2.L$3 = SpillingKt.nullOutSpilledVariable(kCABTestIdentity);
                kCABTestService$fetchAndCache$2.L$4 = value;
                kCABTestService$fetchAndCache$2.L$5 = interfaceC44082a2;
                kCABTestService$fetchAndCache$2.I$0 = 0;
                kCABTestService$fetchAndCache$2.label = 2;
                if (interfaceC44082a2.mo91344d(null, kCABTestService$fetchAndCache$2) != coroutine_suspended) {
                    str6 = str;
                    str7 = value;
                    interfaceC44082a = interfaceC44082a2;
                    this.f14770g.put(str6, str7);
                    Unit unit2 = Unit.INSTANCE;
                    return str7;
                }
                return coroutine_suspended;
            } catch (CancellationException e11) {
                throw e11;
            }
        } catch (Exception unused3) {
            return str3;
        }
    }

    /* JADX INFO: renamed from: k */
    public final KCABTestApiService m14637k() {
        return (KCABTestApiService) this.f14768e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, kotlinx.coroutines.r0] */
    /* JADX INFO: renamed from: l */
    public final Object m14638l(String str, String str2, String str3, KCABTestIdentity kCABTestIdentity, Continuation<? super InterfaceC41729r0<String>> continuation) {
        KCABTestService$getOrCreateRequest$1 kCABTestService$getOrCreateRequest$1;
        String str4;
        String str5;
        String str6;
        KCABTestIdentity kCABTestIdentity2;
        InterfaceC44082a interfaceC44082a;
        InterfaceC41729r0<String> interfaceC41729r0;
        InterfaceC41729r0 interfaceC41729r1;
        if (continuation instanceof KCABTestService$getOrCreateRequest$1) {
            kCABTestService$getOrCreateRequest$1 = (KCABTestService$getOrCreateRequest$1) continuation;
            int i11 = kCABTestService$getOrCreateRequest$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kCABTestService$getOrCreateRequest$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kCABTestService$getOrCreateRequest$1 = new KCABTestService$getOrCreateRequest$1(this, continuation);
            }
        } else {
            kCABTestService$getOrCreateRequest$1 = new KCABTestService$getOrCreateRequest$1(this, continuation);
        }
        Object obj = kCABTestService$getOrCreateRequest$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kCABTestService$getOrCreateRequest$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC44082a interfaceC44082a2 = this.f14769f;
            kCABTestService$getOrCreateRequest$1.L$0 = str;
            str4 = str2;
            kCABTestService$getOrCreateRequest$1.L$1 = str4;
            kCABTestService$getOrCreateRequest$1.L$2 = str3;
            kCABTestService$getOrCreateRequest$1.L$3 = kCABTestIdentity;
            kCABTestService$getOrCreateRequest$1.L$4 = interfaceC44082a2;
            kCABTestService$getOrCreateRequest$1.I$0 = 0;
            kCABTestService$getOrCreateRequest$1.label = 1;
            if (interfaceC44082a2.mo91344d(null, kCABTestService$getOrCreateRequest$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str5 = str;
            str6 = str3;
            kCABTestIdentity2 = kCABTestIdentity;
            interfaceC44082a = interfaceC44082a2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC44082a interfaceC44082a3 = (InterfaceC44082a) kCABTestService$getOrCreateRequest$1.L$4;
            KCABTestIdentity kCABTestIdentity3 = (KCABTestIdentity) kCABTestService$getOrCreateRequest$1.L$3;
            String str7 = (String) kCABTestService$getOrCreateRequest$1.L$2;
            str4 = (String) kCABTestService$getOrCreateRequest$1.L$1;
            str5 = (String) kCABTestService$getOrCreateRequest$1.L$0;
            ResultKt.throwOnFailure(obj);
            kCABTestIdentity2 = kCABTestIdentity3;
            str6 = str7;
            interfaceC44082a = interfaceC44082a3;
        }
        String str8 = str4;
        try {
            InterfaceC41729r0<String> interfaceC41729r2 = this.f14771h.get(str5);
            if (interfaceC41729r2 == null) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ?? M91102b = C41696j.m91102b(this.f14767d, null, CoroutineStart.LAZY, new KCABTestService$getOrCreateRequest$2$2(this, str5, str8, str6, kCABTestIdentity2, objectRef, null), 1, null);
                objectRef.element = M91102b;
                Map<String, InterfaceC41729r0<String>> map = this.f14771h;
                if (M91102b == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("request");
                    interfaceC41729r0 = null;
                } else {
                    interfaceC41729r0 = (InterfaceC41729r0) M91102b;
                }
                map.put(str5, interfaceC41729r0);
                T t11 = objectRef.element;
                if (t11 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("request");
                    interfaceC41729r1 = null;
                } else {
                    interfaceC41729r1 = (InterfaceC41729r0) t11;
                }
                interfaceC41729r1.start();
                T t12 = objectRef.element;
                if (t12 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("request");
                    interfaceC41729r2 = null;
                } else {
                    interfaceC41729r2 = (InterfaceC41729r0) t12;
                }
            }
            return interfaceC41729r2;
        } finally {
            interfaceC44082a.mo91345e(null);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final KCABTestApiService m14632h() {
        return (KCABTestApiService) C42597a.m93388d().create(KCABTestApiService.class);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m14639m(String str) {
        return !StringsKt.isBlank(str);
    }
}
