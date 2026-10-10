package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.p125ff.C33048a;
import kotlinx.coroutines.C41696j;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31670H extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64276a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31675M f64277b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f64278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31670H(C31675M c31675m, String str, Continuation continuation) {
        super(2, continuation);
        this.f64277b = c31675m;
        this.f64278c = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31670H(this.f64277b, this.f64278c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31670H(this.f64277b, this.f64278c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(300, r10) == r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(300, r10) == r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(300, r10) == r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e8, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(300, r10) == r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(300, r10) == r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0151, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(300, r10) == r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017b, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(300, r10) == r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017d, code lost:
    
        return r0;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SNSEidPinViewModel$Step sNSEidPinViewModel$Step;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.f64276a) {
            case 0:
                ResultKt.throwOnFailure(obj);
                C31675M c31675m = this.f64277b;
                KProperty[] kPropertyArr = C31675M.f64290h;
                C28936t c28936t = c31675m.f64296f;
                KProperty[] kPropertyArr2 = C31675M.f64290h;
                KProperty kProperty = kPropertyArr2[4];
                switch (AbstractC31669G.f64275a[((SNSEidPinViewModel$Step) c28936t.m69705a()).ordinal()]) {
                    case 1:
                        if (this.f64278c.length() == 5) {
                            C31675M c31675m2 = this.f64277b;
                            String str = this.f64278c;
                            C28936t c28936t2 = c31675m2.f64295e;
                            KProperty kProperty2 = kPropertyArr2[3];
                            c28936t2.f58834a.set(c28936t2.f58835b, str);
                            this.f64276a = 1;
                            break;
                        }
                        return Unit.INSTANCE;
                    case 2:
                        if (this.f64278c.length() == 6) {
                            this.f64277b.m70801b(this.f64278c);
                            this.f64276a = 2;
                            break;
                        }
                        return Unit.INSTANCE;
                    case 3:
                        if (this.f64278c.length() == 6) {
                            this.f64276a = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    case 4:
                        if (this.f64278c.length() == 1) {
                            C31675M c31675m3 = this.f64277b;
                            String str2 = this.f64278c;
                            C28936t c28936t3 = c31675m3.f64293c;
                            KProperty kProperty3 = kPropertyArr2[1];
                            c28936t3.f58834a.set(c28936t3.f58835b, str2);
                            this.f64276a = 4;
                            break;
                        }
                        return Unit.INSTANCE;
                    case 5:
                        if (this.f64278c.length() == 6) {
                            this.f64277b.m70801b(this.f64278c);
                            this.f64276a = 5;
                            break;
                        }
                        return Unit.INSTANCE;
                    case 6:
                        if (this.f64278c.length() == 10) {
                            this.f64277b.m70801b(this.f64278c);
                            this.f64276a = 6;
                            break;
                        }
                        return Unit.INSTANCE;
                    case 7:
                        if (this.f64278c.length() == 6) {
                            C31675M c31675m4 = this.f64277b;
                            String str3 = this.f64278c;
                            C28936t c28936t4 = c31675m4.f64292b;
                            KProperty kProperty4 = kPropertyArr2[0];
                            c28936t4.f58834a.set(c28936t4.f58835b, str3);
                            this.f64276a = 7;
                            break;
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 1:
                ResultKt.throwOnFailure(obj);
                C31675M c31675m5 = this.f64277b;
                if (C33048a.f67448K.m71434a()) {
                    sNSEidPinViewModel$Step = SNSEidPinViewModel$Step.TESTING_ENTER_LAST_DIGIT;
                } else {
                    sNSEidPinViewModel$Step = SNSEidPinViewModel$Step.ENTER_NEW_PIN;
                }
                KProperty[] kPropertyArr3 = C31675M.f64290h;
                c31675m5.m70800b(sNSEidPinViewModel$Step);
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                C31675M c31675m6 = this.f64277b;
                SNSEidPinViewModel$Step sNSEidPinViewModel$Step2 = SNSEidPinViewModel$Step.REPEAT_NEW_PIN;
                KProperty[] kPropertyArr4 = C31675M.f64290h;
                c31675m6.m70800b(sNSEidPinViewModel$Step2);
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                String str4 = this.f64278c;
                C31675M c31675m7 = this.f64277b;
                KProperty[] kPropertyArr5 = C31675M.f64290h;
                C28936t c28936t5 = c31675m7.f64294d;
                KProperty kProperty5 = C31675M.f64290h[2];
                if (!Intrinsics.areEqual(str4, (String) c28936t5.m69705a())) {
                    C41696j.m91104d(ViewModelKt.getViewModelScope(this.f64277b), null, null, new C31668F(this.f64277b, null), 3, null);
                } else {
                    C31675M.m70799a(this.f64277b);
                }
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                C31675M c31675m8 = this.f64277b;
                SNSEidPinViewModel$Step sNSEidPinViewModel$Step3 = SNSEidPinViewModel$Step.ENTER_NEW_PIN;
                KProperty[] kPropertyArr6 = C31675M.f64290h;
                c31675m8.m70800b(sNSEidPinViewModel$Step3);
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                C31675M.m70799a(this.f64277b);
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                C31675M.m70799a(this.f64277b);
                return Unit.INSTANCE;
            case 7:
                ResultKt.throwOnFailure(obj);
                C31675M.m70799a(this.f64277b);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
