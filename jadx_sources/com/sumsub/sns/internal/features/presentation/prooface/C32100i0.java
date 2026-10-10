package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.i0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32100i0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65326a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32109k0 f65327b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f65328c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f65329d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f65330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32100i0(C32109k0 c32109k0, float f11, float f12, float f13, Continuation continuation) {
        super(2, continuation);
        this.f65327b = c32109k0;
        this.f65328c = f11;
        this.f65329d = f12;
        this.f65330e = f13;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32100i0(this.f65327b, this.f65328c, this.f65329d, this.f65330e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32100i0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(250, r12) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(250, r12) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(250, r12) == r0) goto L36;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C32109k0 c32109k0;
        C32109k0 c32109k1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65326a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            do {
                                c32109k1 = this.f65327b;
                                if (c32109k1.f65373r) {
                                    this.f65326a = 4;
                                } else {
                                    c32109k1.f65352I.setValue(new C31994E(this.f65330e));
                                    this.f65326a = 5;
                                }
                            } while (DelayKt.m90350b(100L, this) != coroutine_suspended);
                            return coroutine_suspended;
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        this.f65327b.f65373r = true;
                        do {
                            c32109k1 = this.f65327b;
                            if (c32109k1.f65373r) {
                                this.f65326a = 4;
                            } else {
                                c32109k1.f65352I.setValue(new C31994E(this.f65330e));
                                this.f65326a = 5;
                            }
                        } while (DelayKt.m90350b(100L, this) != coroutine_suspended);
                        return coroutine_suspended;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    do {
                        c32109k0 = this.f65327b;
                        if (c32109k0.f65373r) {
                            this.f65326a = 2;
                        } else {
                            c32109k0.f65352I.setValue(new C31988C(this.f65329d));
                            this.f65326a = 3;
                        }
                    } while (DelayKt.m90350b(100L, this) != coroutine_suspended);
                    return coroutine_suspended;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            this.f65327b.showProgress(false);
            AbstractC32267d.m71078a("Calibration finished");
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        AbstractC32267d.m71078a("Calibration started");
        this.f65327b.f65352I.setValue(new C31988C(this.f65328c));
        this.f65326a = 1;
        this.f65327b.f65373r = true;
        do {
            c32109k0 = this.f65327b;
            if (c32109k0.f65373r) {
                this.f65326a = 2;
            } else {
                c32109k0.f65352I.setValue(new C31988C(this.f65329d));
                this.f65326a = 3;
            }
        } while (DelayKt.m90350b(100L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
