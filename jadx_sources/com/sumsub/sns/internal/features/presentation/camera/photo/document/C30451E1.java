package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p126ml.badphotos.C33316c;
import com.sumsub.sns.internal.p126ml.core.AbstractC33335n;
import com.sumsub.sns.internal.p126ml.core.C33333l;
import com.sumsub.sns.internal.p126ml.docdetector.C33353d;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.E1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30451E1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public boolean f61389a;

    /* JADX INFO: renamed from: b */
    public int f61390b;

    /* JADX INFO: renamed from: c */
    public int f61391c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30440B2 f61392d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30496S1 f61393e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30451E1(C30440B2 c30440b2, C30496S1 c30496s1, Continuation continuation) {
        super(2, continuation);
        this.f61392d = c30440b2;
        this.f61393e = c30496s1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30451E1(this.f61392d, this.f61393e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30451E1(this.f61392d, this.f61393e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007b A[PHI: r1
      0x007b: PHI (r1v4 boolean) = (r1v3 boolean), (r1v3 boolean), (r1v8 boolean), (r1v8 boolean) binds: [B:21:0x0062, B:19:0x005e, B:26:0x0072, B:28:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r12 == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00de, code lost:
    
        if (new com.sumsub.sns.internal.features.presentation.camera.photo.document.C30496S1(r12.f61567b, r11).invokeSuspend(p852kotlin.Unit.INSTANCE) == r0) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C33316c c33316c;
        boolean z11;
        ?? r11;
        ?? r12;
        boolean z12;
        boolean z13;
        ?? r13;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61391c;
        boolean z14 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        int i12 = this.f61390b;
                        z13 = this.f61389a;
                        ResultKt.throwOnFailure(obj);
                        r13 = i12;
                        AbstractC33335n abstractC33335n = (AbstractC33335n) obj;
                        abstractC33335n.getClass();
                        ?? r14 = r13;
                        z12 = abstractC33335n instanceof C33333l;
                        z11 = z13;
                        r12 = r14 == true ? 1 : 0;
                        this.f61392d.f61286G = z11 & z12;
                        if (r12 != 0) {
                            z14 = true;
                        }
                        C33272c.f67816e.f67810a.mo68955d("DocCapture", "initModels: badPhotos=" + z14 + ", autoCapture=" + z12, null);
                        C30496S1 c30496s1 = this.f61393e;
                        this.f61391c = 4;
                    }
                } else {
                    zBooleanValue = this.f61389a;
                    ResultKt.throwOnFailure(obj);
                    AbstractC33335n abstractC33335n2 = (AbstractC33335n) obj;
                    if (abstractC33335n2 != null && (abstractC33335n2 instanceof C33333l)) {
                        z11 = zBooleanValue;
                        r11 = 1;
                    } else {
                        z11 = zBooleanValue;
                        r11 = 0;
                    }
                    C30440B2 c30440b2 = this.f61392d;
                    c30440b2.f61284E = r11;
                    if (!z11 && r11 != 0) {
                        C33353d c33353d = c30440b2.f61305f;
                        this.f61389a = z11;
                        this.f61390b = r11;
                        this.f61391c = 3;
                        Object objM71656a = c33353d.m71656a((SuspendLambda) this);
                        if (objM71656a != coroutine_suspended) {
                            z13 = z11;
                            obj = objM71656a;
                            r13 = r11;
                            AbstractC33335n abstractC33335n3 = (AbstractC33335n) obj;
                            abstractC33335n3.getClass();
                            ?? r15 = r13;
                            z12 = abstractC33335n3 instanceof C33333l;
                            z11 = z13;
                            r12 = r15 == true ? 1 : 0;
                            this.f61392d.f61286G = z11 & z12;
                            if (r12 != 0) {
                                z14 = true;
                            }
                            C33272c.f67816e.f67810a.mo68955d("DocCapture", "initModels: badPhotos=" + z14 + ", autoCapture=" + z12, null);
                            C30496S1 c30496s2 = this.f61393e;
                            this.f61391c = 4;
                        }
                    } else {
                        r12 = r11;
                        z12 = false;
                        this.f61392d.f61286G = z11 & z12;
                        if (r12 != 0) {
                            z14 = true;
                        }
                        C33272c.f67816e.f67810a.mo68955d("DocCapture", "initModels: badPhotos=" + z14 + ", autoCapture=" + z12, null);
                        C30496S1 c30496s3 = this.f61393e;
                        this.f61391c = 4;
                    }
                    return coroutine_suspended;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "initModels", null);
        C30440B2 c30440b3 = this.f61392d;
        this.f61391c = 1;
        KProperty[] kPropertyArr = C30440B2.f61279U;
        obj = c30440b3.m70295a(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        zBooleanValue = ((Boolean) obj).booleanValue();
        C30440B2 c30440b4 = this.f61392d;
        if ((c30440b4.f61291L || zBooleanValue) && (c33316c = c30440b4.f61304e) != null) {
            this.f61389a = zBooleanValue;
            this.f61391c = 2;
            obj = c33316c.m71656a((SuspendLambda) this);
        } else {
            z11 = zBooleanValue;
            r11 = 0;
            C30440B2 c30440b5 = this.f61392d;
            c30440b5.f61284E = r11;
            if (!z11) {
            }
            r12 = r11;
            z12 = false;
            this.f61392d.f61286G = z11 & z12;
            if (r12 != 0) {
                z14 = true;
            }
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "initModels: badPhotos=" + z14 + ", autoCapture=" + z12, null);
            C30496S1 c30496s4 = this.f61393e;
            this.f61391c = 4;
        }
        return coroutine_suspended;
    }
}
