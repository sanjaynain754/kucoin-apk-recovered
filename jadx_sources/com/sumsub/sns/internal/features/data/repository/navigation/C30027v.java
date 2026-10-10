package com.sumsub.sns.internal.features.data.repository.navigation;

import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30027v {

    /* JADX INFO: renamed from: a */
    public final InterfaceC30028w f60319a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70069a(boolean z11, ContinuationImpl continuationImpl) {
        C30026u c30026u;
        Object objM103844constructorimpl;
        if (continuationImpl instanceof C30026u) {
            c30026u = (C30026u) continuationImpl;
            int i11 = c30026u.f60318c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30026u.f60318c = i11 - Integer.MIN_VALUE;
            } else {
                c30026u = new C30026u(this, continuationImpl);
            }
        } else {
            c30026u = new C30026u(this, continuationImpl);
        }
        Object objM70072a = c30026u.f60316a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30026u.f60318c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70072a);
                Result.Companion companion = Result.INSTANCE;
                InterfaceC30028w interfaceC30028w = this.f60319a;
                c30026u.f60318c = 1;
                objM70072a = interfaceC30028w.m70072a(z11, c30026u);
                if (objM70072a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70072a);
            }
            objM103844constructorimpl = Result.m103844constructorimpl((C30031z) objM70072a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = C30003A.m70065a((C30031z) objM103844constructorimpl);
        }
        return Result.m103844constructorimpl(objM103844constructorimpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70070b(String str, ContinuationImpl continuationImpl) {
        C30025t c30025t;
        Object objM103844constructorimpl;
        if (continuationImpl instanceof C30025t) {
            c30025t = (C30025t) continuationImpl;
            int i11 = c30025t.f60315c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30025t.f60315c = i11 - Integer.MIN_VALUE;
            } else {
                c30025t = new C30025t(this, continuationImpl);
            }
        } else {
            c30025t = new C30025t(this, continuationImpl);
        }
        Object objM70073b = c30025t.f60313a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30025t.f60315c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70073b);
                C30023r c30023r = new C30023r(str);
                Result.Companion companion = Result.INSTANCE;
                InterfaceC30028w interfaceC30028w = this.f60319a;
                c30025t.f60315c = 1;
                objM70073b = interfaceC30028w.m70073b(c30023r, c30025t);
                if (objM70073b == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70073b);
            }
            objM103844constructorimpl = Result.m103844constructorimpl((C30031z) objM70073b);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = C30003A.m70065a((C30031z) objM103844constructorimpl);
        }
        return Result.m103844constructorimpl(objM103844constructorimpl);
    }

    public C30027v(InterfaceC30028w interfaceC30028w, C30003A c30003a) {
        this.f60319a = interfaceC30028w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70068a(String str, ContinuationImpl continuationImpl) {
        C30024s c30024s;
        Object objM103844constructorimpl;
        if (continuationImpl instanceof C30024s) {
            c30024s = (C30024s) continuationImpl;
            int i11 = c30024s.f60312c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30024s.f60312c = i11 - Integer.MIN_VALUE;
            } else {
                c30024s = new C30024s(this, continuationImpl);
            }
        } else {
            c30024s = new C30024s(this, continuationImpl);
        }
        Object objM70071a = c30024s.f60310a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30024s.f60312c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70071a);
                C30023r c30023r = new C30023r(str);
                Result.Companion companion = Result.INSTANCE;
                InterfaceC30028w interfaceC30028w = this.f60319a;
                c30024s.f60312c = 1;
                objM70071a = interfaceC30028w.m70071a(c30023r, c30024s);
                if (objM70071a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70071a);
            }
            objM103844constructorimpl = Result.m103844constructorimpl((C30031z) objM70071a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = C30003A.m70065a((C30031z) objM103844constructorimpl);
        }
        return Result.m103844constructorimpl(objM103844constructorimpl);
    }
}
