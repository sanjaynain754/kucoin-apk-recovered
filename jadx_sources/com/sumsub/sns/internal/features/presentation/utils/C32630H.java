package com.sumsub.sns.internal.features.presentation.utils;

import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import java.util.ArrayList;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32630H extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f66586a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32635M f66587b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32630H(ArrayList arrayList, C32635M c32635m, Continuation continuation) {
        super(2, continuation);
        this.f66586a = arrayList;
        this.f66587b = c32635m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32630H(this.f66586a, this.f66587b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32630H(this.f66586a, this.f66587b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = this.f66586a;
        C32635M c32635m = this.f66587b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            File file = (File) obj2;
            boolean zDelete = file.delete();
            C30316a c30316a = c32635m.f66617i;
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "deleting " + file.getAbsolutePath() + " success=" + zDelete, null);
        }
        return Unit.INSTANCE;
    }
}
