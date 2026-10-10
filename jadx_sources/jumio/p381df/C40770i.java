package jumio.p381df;

import android.graphics.Bitmap;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import com.jumio.core.extraction.docfinder.extraction.DocFinderClient;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.df.i */
/* JADX INFO: loaded from: classes61.dex */
public final class C40770i extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f90558a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DocFinderClient f90559b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40770i(DocFinderClient docFinderClient, Continuation continuation) {
        super(2, continuation);
        this.f90559b = docFinderClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40770i c40770i = new C40770i(this.f90559b, continuation);
        c40770i.f90558a = obj;
        return c40770i;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C40770i c40770i = new C40770i(this.f90559b, (Continuation) obj2);
        c40770i.f90558a = (Bitmap) obj;
        return c40770i.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap = (Bitmap) this.f90558a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DocumentClassifier documentClassifier = this.f90559b.f14058y;
        if (documentClassifier != null) {
            return documentClassifier.recognizeMultiHeadOutput(bitmap);
        }
        return null;
    }
}
