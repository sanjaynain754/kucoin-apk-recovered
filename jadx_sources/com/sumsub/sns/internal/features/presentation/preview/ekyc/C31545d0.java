package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import java.util.Iterator;
import kotlinx.coroutines.DelayKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.LongIterator;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.ranges.LongProgression;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.d0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31545d0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C31707h0 f64050a;

    /* JADX INFO: renamed from: b */
    public Iterator f64051b;

    /* JADX INFO: renamed from: c */
    public int f64052c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31707h0 f64053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31545d0(C31707h0 c31707h0, Continuation continuation) {
        super(2, continuation);
        this.f64053d = c31707h0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31545d0(this.f64053d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31545d0(this.f64053d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31707h0 c31707h0;
        Iterator<Long> it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64052c;
        if (i11 != 0) {
            if (i11 == 1) {
                it = this.f64051b;
                c31707h0 = this.f64050a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            LongProgression longProgressionDownTo = RangesKt.downTo(60L, 0);
            c31707h0 = this.f64053d;
            it = longProgressionDownTo.iterator();
        }
        while (it.hasNext()) {
            AbstractC28073M0.updateState$default(c31707h0, false, new C31541b0(c31707h0, ((LongIterator) it).nextLong(), null), 1, null);
            this.f64050a = c31707h0;
            this.f64051b = it;
            this.f64052c = 1;
            if (DelayKt.m90350b(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        C31707h0 c31707h1 = this.f64053d;
        AbstractC28073M0.updateState$default(c31707h1, false, new C31543c0(c31707h1, null), 1, null);
        return Unit.INSTANCE;
    }
}
