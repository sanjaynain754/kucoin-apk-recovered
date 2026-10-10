package com.sumsub.sns.internal.features.domain.fisherman;

import android.content.Context;
import com.sumsub.fisherman.FishermanConfiguration;
import com.sumsub.fisherman.FishermanError;
import com.sumsub.fisherman.FishermanFingerprint;
import com.sumsub.fisherman.FishermanResult;
import com.sumsub.fisherman.FishermanSDK;
import com.sumsub.fisherman.FishermanSDKBuilder;
import com.sumsub.fisherman.FishermanSimulationConfig;
import com.sumsub.fisherman.impl.log.LogLevel;
import com.sumsub.sns.core.SNSMobileSDK;
import com.sumsub.sns.internal.core.common.AbstractC28409N0;
import com.sumsub.sns.internal.core.domain.C28598r;
import com.sumsub.sns.internal.core.domain.InterfaceC28584k;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.List;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.fisherman.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30182f {

    /* JADX INFO: renamed from: a */
    public final Context f60661a;

    /* JADX INFO: renamed from: b */
    public final String f60662b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC28584k f60663c;

    /* JADX INFO: renamed from: d */
    public final C30186j f60664d;

    /* JADX INFO: renamed from: e */
    public FishermanSDK f60665e;

    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        if (r0 == r7) goto L55;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70132a(String str, ContinuationImpl continuationImpl) {
        C30177a c30177a;
        String str2;
        Object objM103844constructorimpl;
        FishermanSimulationConfig fishermanSimulationConfig;
        if (continuationImpl instanceof C30177a) {
            c30177a = (C30177a) continuationImpl;
            int i11 = c30177a.f60644d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30177a.f60644d = i11 - Integer.MIN_VALUE;
            } else {
                c30177a = new C30177a(this, continuationImpl);
            }
        } else {
            c30177a = new C30177a(this, continuationImpl);
        }
        C30177a c30177a2 = c30177a;
        Object objMo69411a = c30177a2.f60642b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30177a2.f60644d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo69411a);
            if (!AbstractC28409N0.m69294a("com.sumsub.sns.fisherman.BuildConfig")) {
                return Unit.INSTANCE;
            }
            InterfaceC28584k interfaceC28584k = this.f60663c;
            str2 = str;
            c30177a2.f60641a = str2;
            c30177a2.f60644d = 1;
            objMo69411a = interfaceC28584k.mo69411a(c30177a2);
            if (objMo69411a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            str2 = c30177a2.f60641a;
            ResultKt.throwOnFailure(objMo69411a);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo69411a);
        }
        FishermanResult.Ok ok2 = (FishermanResult) objMo69411a;
        if (ok2 instanceof FishermanResult.Ok) {
            C33272c.f67816e.f67810a.mo68955d("Fisherman", "FP collected, visitorId: " + ((FishermanFingerprint) ok2.getValue()).getVisitorId(), null);
        } else {
            if (!(ok2 instanceof FishermanResult.Err)) {
                throw new NoWhenBranchMatchedException();
            }
            FishermanResult.Err err = (FishermanResult.Err) ok2;
            err.getError().getThrowable();
            C33272c.f67816e.f67810a.mo68955d("Fisherman", "FP collection failed", err.getError().getThrowable());
        }
        return Unit.INSTANCE;
        String str3 = (String) objMo69411a;
        FishermanSDK fishermanSDKCreate = this.f60665e;
        if (fishermanSDKCreate == null) {
            FishermanSDK.Companion companion = FishermanSDK.Companion;
            Context context = this.f60661a;
            String str4 = this.f60662b;
            C30186j c30186j = this.f60664d;
            String str5 = C33048a.f67461X.m71435b().f67504b;
            if (str5 == null) {
                fishermanSimulationConfig = null;
            } else {
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    AbstractC46162a abstractC46162a = c30186j.f60669a;
                    abstractC46162a.getSerializersModule();
                    objM103844constructorimpl = Result.m103844constructorimpl((C30185i) abstractC46162a.mo99408a(C30185i.Companion.serializer(), str5));
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                    objM103844constructorimpl = null;
                }
                C30185i c30185i = (C30185i) objM103844constructorimpl;
                if (c30185i == null) {
                    fishermanSimulationConfig = null;
                } else {
                    if (c30185i.f60667a == null && c30185i.f60668b == null) {
                        c30185i = null;
                    }
                    if (c30185i != null) {
                        fishermanSimulationConfig = new FishermanSimulationConfig(c30185i.f60667a, c30185i.f60668b, (List) null, 4, (DefaultConstructorMarker) null);
                    } else {
                        fishermanSimulationConfig = null;
                    }
                }
            }
            SNSMobileSDK sNSMobileSDK = SNSMobileSDK.INSTANCE;
            fishermanSDKCreate = FishermanSDKBuilder.create(companion, context, new FishermanConfiguration(str3, str4, fishermanSimulationConfig, false, sNSMobileSDK.isDebug() ? LogLevel.VERBOSE : LogLevel.WARN, 8, (DefaultConstructorMarker) null), new C30187k(sNSMobileSDK.getTokenExpirationHandler()));
            this.f60665e = fishermanSDKCreate;
        }
        Function1 c30178b = new C30178b(fishermanSDKCreate, str2, null);
        c30177a2.f60641a = null;
        c30177a2.f60644d = 2;
        objMo69411a = m70131a(3, 2000L, c30178b, c30177a2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (m70132a(r10, r6) == r0) goto L32;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70133b(String str, ContinuationImpl continuationImpl) {
        C30179c c30179c;
        if (continuationImpl instanceof C30179c) {
            c30179c = (C30179c) continuationImpl;
            int i11 = c30179c.f60651d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30179c.f60651d = i11 - Integer.MIN_VALUE;
            } else {
                c30179c = new C30179c(this, continuationImpl);
            }
        } else {
            c30179c = new C30179c(this, continuationImpl);
        }
        C30179c c30179c2 = c30179c;
        Object objM70131a = c30179c2.f60649b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30179c2.f60651d;
        if (i12 != 0) {
            if (i12 == 1) {
                str = c30179c2.f60648a;
                ResultKt.throwOnFailure(objM70131a);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70131a);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM70131a);
        if (!AbstractC28409N0.m69294a("com.sumsub.sns.fisherman.BuildConfig")) {
            return Unit.INSTANCE;
        }
        FishermanSDK fishermanSDK = this.f60665e;
        if (fishermanSDK == null) {
            return Unit.INSTANCE;
        }
        Function1 c30180d = new C30180d(fishermanSDK, null);
        c30179c2.f60648a = str;
        c30179c2.f60651d = 1;
        objM70131a = m70131a(3, 2000L, c30180d, c30179c2);
        if (objM70131a != coroutine_suspended) {
        }
        return coroutine_suspended;
        FishermanResult.Err err = (FishermanResult) objM70131a;
        if (!(err instanceof FishermanResult.Ok)) {
            if (!(err instanceof FishermanResult.Err)) {
                throw new NoWhenBranchMatchedException();
            }
            C33272c.f67816e.f67810a.mo68955d("Fisherman", "Config refresh failed, skipping re-capture", err.getError().getThrowable());
            return Unit.INSTANCE;
        }
        C33272c.f67816e.f67810a.mo68955d("Fisherman", "Config refreshed after level change, re-capturing", null);
        c30179c2.f60648a = null;
        c30179c2.f60651d = 2;
    }

    public C30182f(Context context, String str, C28598r c28598r, C30186j c30186j) {
        this.f60661a = context;
        this.f60662b = str;
        this.f60663c = c28598r;
        this.f60664d = c30186j;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(r12, r0) == r1) goto L42;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x0085, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00a3, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e3 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70131a(int i11, long j11, Function1 function1, ContinuationImpl continuationImpl) {
        C30181e c30181e;
        int i12;
        int i13;
        int i14;
        Function1 function2;
        FishermanResult.Err err;
        Throwable throwable;
        FishermanResult.Err err2;
        FishermanError error;
        int i15;
        Object objInvoke;
        if (continuationImpl instanceof C30181e) {
            c30181e = (C30181e) continuationImpl;
            int i16 = c30181e.f60660g;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                c30181e.f60660g = i16 - Integer.MIN_VALUE;
            } else {
                c30181e = new C30181e(this, continuationImpl);
            }
        } else {
            c30181e = new C30181e(this, continuationImpl);
        }
        Object obj = c30181e.f60658e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i17 = c30181e.f60660g;
        if (i17 == 0) {
            ResultKt.throwOnFailure(obj);
            i12 = 0;
            i15 = i12 + 1;
            c30181e.f60657d = function1;
            c30181e.f60654a = i11;
            c30181e.f60656c = j11;
            c30181e.f60655b = i15;
            c30181e.f60660g = 1;
            objInvoke = function1.invoke(c30181e);
            if (objInvoke != coroutine_suspended) {
                Function1 function3 = function1;
                i13 = i11;
                i14 = i15;
                obj = objInvoke;
                function2 = function3;
                err = (FishermanResult) obj;
                if (err instanceof FishermanResult.Ok) {
                    return err;
                }
                throwable = null;
                if (err instanceof FishermanResult.Err) {
                    err2 = err;
                } else {
                    err2 = null;
                }
                if (err2 != null) {
                    err2.getError().getThrowable();
                }
                if (i14 >= i13) {
                    C33272c.f67816e.f67810a.mo68955d("Fisherman", "Max attempts reached (" + i13 + ", aborting", null);
                    return err;
                }
                String str = "Attempt " + i14 + " failed. Retrying in " + j11 + "ms...";
                if (err2 != null) {
                    throwable = error.getThrowable();
                }
                C33272c.f67816e.f67810a.mo68955d("Fisherman", str, throwable);
                c30181e.f60657d = function2;
                c30181e.f60654a = i13;
                c30181e.f60656c = j11;
                c30181e.f60655b = i14;
                c30181e.f60660g = 2;
            }
            return coroutine_suspended;
        }
        if (i17 == 1) {
            i14 = c30181e.f60655b;
            j11 = c30181e.f60656c;
            i13 = c30181e.f60654a;
            function2 = c30181e.f60657d;
            ResultKt.throwOnFailure(obj);
            err = (FishermanResult) obj;
            if (err instanceof FishermanResult.Ok) {
                return err;
            }
            throwable = null;
            if (err instanceof FishermanResult.Err) {
                err2 = err;
            } else {
                err2 = null;
            }
            if (err2 != null) {
                err2.getError().getThrowable();
            }
            if (i14 >= i13) {
                C33272c.f67816e.f67810a.mo68955d("Fisherman", "Max attempts reached (" + i13 + ", aborting", null);
                return err;
            }
            String str2 = "Attempt " + i14 + " failed. Retrying in " + j11 + "ms...";
            if (err2 != null && (error = err2.getError()) != null) {
                throwable = error.getThrowable();
            }
            C33272c.f67816e.f67810a.mo68955d("Fisherman", str2, throwable);
            c30181e.f60657d = function2;
            c30181e.f60654a = i13;
            c30181e.f60656c = j11;
            c30181e.f60655b = i14;
            c30181e.f60660g = 2;
        } else {
            if (i17 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i14 = c30181e.f60655b;
            j11 = c30181e.f60656c;
            i13 = c30181e.f60654a;
            function2 = c30181e.f60657d;
            ResultKt.throwOnFailure(obj);
        }
        i12 = i14;
        i11 = i13;
        function1 = function2;
        i15 = i12 + 1;
        c30181e.f60657d = function1;
        c30181e.f60654a = i11;
        c30181e.f60656c = j11;
        c30181e.f60655b = i15;
        c30181e.f60660g = 1;
        objInvoke = function1.invoke(c30181e);
        if (objInvoke != coroutine_suspended) {
            Function1 function4 = function1;
            i13 = i11;
            i14 = i15;
            obj = objInvoke;
            function2 = function4;
            err = (FishermanResult) obj;
            if (err instanceof FishermanResult.Ok) {
                return err;
            }
            throwable = null;
            if (err instanceof FishermanResult.Err) {
                err2 = err;
            } else {
                err2 = null;
            }
            if (err2 != null) {
                err2.getError().getThrowable();
            }
            if (i14 >= i13) {
                C33272c.f67816e.f67810a.mo68955d("Fisherman", "Max attempts reached (" + i13 + ", aborting", null);
                return err;
            }
            String str3 = "Attempt " + i14 + " failed. Retrying in " + j11 + "ms...";
            if (err2 != null) {
                throwable = error.getThrowable();
            }
            C33272c.f67816e.f67810a.mo68955d("Fisherman", str3, throwable);
            c30181e.f60657d = function2;
            c30181e.f60654a = i13;
            c30181e.f60656c = j11;
            c30181e.f60655b = i14;
            c30181e.f60660g = 2;
        }
        return coroutine_suspended;
    }
}
