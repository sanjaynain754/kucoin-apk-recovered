package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31754O extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public AbstractC31770c0 f64521a;

    /* JADX INFO: renamed from: b */
    public int f64522b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC31770c0 f64523c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f64524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31754O(AbstractC31770c0 abstractC31770c0, List list, Continuation continuation) {
        super(2, continuation);
        this.f64523c = abstractC31770c0;
        this.f64524d = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31754O(this.f64523c, this.f64524d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31754O(this.f64523c, this.f64524d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31770c0.m70855a(r1, (com.sumsub.sns.internal.features.presentation.utils.C32666q) r6, r2, r5) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC31770c0 abstractC31770c0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64522b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                abstractC31770c0 = this.f64521a;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        abstractC31770c0 = this.f64523c;
        C32635M c32635m = abstractC31770c0.f64559h;
        List list = this.f64524d;
        this.f64521a = abstractC31770c0;
        this.f64522b = 1;
        obj = C32635M.m71224a(c32635m, list, this, 2);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        List list2 = this.f64524d;
        this.f64521a = null;
        this.f64522b = 2;
        abstractC31770c0.getClass();
    }
}
