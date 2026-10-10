package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.presentation.nfc.C28907l;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.MRTDError;
import com.sumsub.sns.internal.features.domain.mrtd.C30234G;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.e0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31865e0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64753a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f64754b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31868f0 f64755c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31868f0 f64756d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f64757e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31865e0(C31868f0 c31868f0, Continuation continuation, C31868f0 c31868f1, boolean z11) {
        super(2, continuation);
        this.f64755c = c31868f0;
        this.f64756d = c31868f1;
        this.f64757e = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31865e0 c31865e0 = new C31865e0(this.f64755c, continuation, this.f64756d, this.f64757e);
        c31865e0.f64754b = obj;
        return c31865e0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31865e0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d9 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:5:0x000c, B:23:0x00a6, B:25:0x00ac, B:30:0x00bb, B:31:0x00d9, B:12:0x002b, B:14:0x0042, B:20:0x0078, B:16:0x0052, B:18:0x0072, B:19:0x0075), top: B:36:0x0008 }] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MRTDError mRTDError;
        Object objM70151a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64753a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    objM70151a = ((Result) obj).getValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C28936t c28936t = this.f64756d.f64768h.f58781h;
                KProperty[] kPropertyArr = C28907l.f58773m;
                KProperty kProperty = kPropertyArr[2];
                if (((Boolean) c28936t.m69705a()).booleanValue()) {
                    Logger.DefaultImpls.d$default(C33272c.f67812a, "SumSubNfc", "NFC access data rejected", null, 4, null);
                    mRTDError = MRTDError.AccessDataRejected;
                } else {
                    Logger.DefaultImpls.d$default(C33272c.f67812a, "SumSubNfc", "NFC skipped by user", null, 4, null);
                    C28936t c28936t2 = this.f64756d.f64768h.f58780g;
                    KProperty kProperty2 = kPropertyArr[1];
                    if (((Boolean) c28936t2.m69705a()).booleanValue()) {
                        mRTDError = MRTDError.UserCanceled;
                    } else {
                        mRTDError = MRTDError.UserSkipped;
                    }
                }
                MRTDError mRTDError2 = mRTDError;
                C31868f0 c31868f0 = this.f64756d;
                C30234G c30234g = c31868f0.f64763c;
                String strMo69722g = c31868f0.f64762b.mo69722g();
                String strMo69718c = this.f64756d.f64762b.mo69718c();
                C28936t c28936t3 = this.f64756d.f64764d;
                KProperty kProperty3 = C31868f0.f64760k[0];
                String str = (String) c28936t3.m69705a();
                this.f64753a = 1;
                objM70151a = c30234g.m70151a(strMo69722g, strMo69718c, str, mRTDError2, this);
                if (objM70151a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70151a);
            if (thM103847exceptionOrNullimpl != null) {
                if (this.f64756d.f64762b.mo69726k()) {
                    thM103847exceptionOrNullimpl = null;
                }
                if (thM103847exceptionOrNullimpl != null) {
                    C31868f0 c31868f1 = this.f64756d;
                    C29107e0 c29107e0 = new C29107e0(thM103847exceptionOrNullimpl, null, null, 6);
                    C28936t c28936t4 = c31868f1.f64764d;
                    KProperty kProperty4 = C31868f0.f64760k[0];
                    AbstractC28052C.throwError$default(c31868f1, c29107e0, (String) c28936t4.m69705a(), false, null, 12, null);
                } else {
                    AbstractC28052C.finish$default(this.f64756d, new C28494t(this.f64757e), null, null, null, 14, null);
                }
            } else {
                AbstractC28052C.finish$default(this.f64756d, new C28494t(this.f64757e), null, null, null, 14, null);
            }
            this.f64755c.showProgress(false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            this.f64755c.showProgress(false);
            throw th2;
        }
    }
}
