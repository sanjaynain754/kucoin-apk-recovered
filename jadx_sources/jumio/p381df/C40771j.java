package jumio.p381df;

import android.graphics.Bitmap;
import com.jumio.commons.camera.Size;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.BitmapUtilKt;
import com.jumio.core.data.document.ClassifiedDocument;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.ExtractionUpdateState;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifierKt;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifierResult;
import com.jumio.core.extraction.docfinder.extraction.DocFinderClient;
import com.jumio.sdk.document.JumioDocumentType;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: jumio.df.j */
/* JADX INFO: loaded from: classes61.dex */
public final class C40771j extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f90560a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f90561b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bitmap f90562c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DocFinderClient f90563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40771j(DocFinderClient docFinderClient, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f90562c = bitmap;
        this.f90563d = docFinderClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40771j c40771j = new C40771j(this.f90563d, this.f90562c, continuation);
        c40771j.f90561b = obj;
        return c40771j;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C40771j) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f90561b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90560a;
        boolean z11 = false;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m14463d("DocFinderClient", "Running document classification");
            Bitmap bitmapScale = BitmapUtilKt.scale(this.f90562c, new Size(224, 224), false);
            C40770i c40770i = new C40770i(this.f90563d, null);
            this.f90561b = interfaceC41709m0;
            this.f90560a = 1;
            obj = BitmapUtilKt.use(bitmapScale, c40770i, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        DocumentClassifierResult documentClassifierResult = (DocumentClassifierResult) obj;
        if (documentClassifierResult == null) {
            Log.m14484w("DocFinderClient", "Something went wrong on classification of the document");
            return Unit.INSTANCE;
        }
        DocFinderClient.access$logClassificationsDebugInfo(this.f90563d, documentClassifierResult);
        DocFinderClient.access$reportDocumentClassification(this.f90563d, documentClassifierResult);
        if (!documentClassifierResult.getF14042d().getAboveThreshold() || !documentClassifierResult.getF14041c().getAboveThreshold()) {
            return Unit.INSTANCE;
        }
        JumioDocumentType jumioDocumentTypeFromClassifiedType = DocumentClassifierKt.fromClassifiedType(JumioDocumentType.INSTANCE, documentClassifierResult.getF14042d().getLabel());
        if (jumioDocumentTypeFromClassifiedType == null) {
            return Unit.INSTANCE;
        }
        DocumentClassifierResult.Entry f14040b = documentClassifierResult.getF14040b();
        if (StringsKt.contains((CharSequence) f14040b.getLabel(), (CharSequence) "FRONT", true) && f14040b.getAboveThreshold()) {
            z11 = true;
        }
        if (jumioDocumentTypeFromClassifiedType == JumioDocumentType.PASSPORT || (z11 && Intrinsics.areEqual(this.f90563d.getF13857o(), "FRONT"))) {
            this.f90563d.publishUpdate((ExtractionUpdateInterface<?>) ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getDocumentClassified(), new ClassifiedDocument(documentClassifierResult.getF14041c().getLabel(), jumioDocumentTypeFromClassifiedType), null, 4, null));
        }
        return Unit.INSTANCE;
    }
}
