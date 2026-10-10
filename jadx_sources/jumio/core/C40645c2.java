package jumio.core;

import com.jumio.core.extraction.result.ExtractionResult;
import com.jumio.core.scanpart.JVisionScanPart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.c2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40645c2 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Object f90232a;

    /* JADX INFO: renamed from: b */
    public Object f90233b;

    /* JADX INFO: renamed from: c */
    public int f90234c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ExtractionResult f90235d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ JVisionScanPart f90236e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40645c2(ExtractionResult extractionResult, JVisionScanPart jVisionScanPart, Continuation continuation) {
        super(2, continuation);
        this.f90235d = extractionResult;
        this.f90236e = jVisionScanPart;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40645c2(this.f90235d, this.f90236e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40645c2(this.f90235d, this.f90236e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90234c;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String f14142c = this.f90235d.getF14142c();
            if (f14142c == null) {
                f14142c = this.f90235d.getF14141b();
            }
            List<C40726s3> list = this.f90236e.getSavedImages().get(f14142c);
            if (list == null) {
                return Unit.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C40726s3) it.next()).f90410b);
            }
            this.f90232a = SpillingKt.nullOutSpilledVariable(f14142c);
            this.f90233b = SpillingKt.nullOutSpilledVariable(list);
            this.f90234c = 1;
            if (AwaitKt.m90347c(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.f90236e.uploadExtractionResult(this.f90235d);
        return Unit.INSTANCE;
    }
}
