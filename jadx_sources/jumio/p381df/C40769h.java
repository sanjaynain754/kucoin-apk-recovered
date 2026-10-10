package jumio.p381df;

import android.graphics.Bitmap;
import com.jumio.commons.camera.Size;
import com.jumio.commons.utils.BitmapUtilKt;
import com.jumio.core.extraction.docfinder.classifier.Classifier;
import com.jumio.core.extraction.docfinder.classifier.CornerDetectionClassifier;
import com.jumio.core.extraction.docfinder.extraction.DocFinderClient;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.df.h */
/* JADX INFO: loaded from: classes61.dex */
public final class C40769h extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Bitmap f90556a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DocFinderClient f90557b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40769h(DocFinderClient docFinderClient, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f90556a = bitmap;
        this.f90557b = docFinderClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40769h(this.f90557b, this.f90556a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Bitmap bitmap = this.f90556a;
        return new C40769h(this.f90557b, bitmap, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<Classifier.Recognition> listRecognizeImage;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Bitmap bitmapScale = BitmapUtilKt.scale(this.f90556a, new Size(224, 224), false);
        CornerDetectionClassifier cornerDetectionClassifier = this.f90557b.f14057x;
        if (cornerDetectionClassifier != null && (listRecognizeImage = cornerDetectionClassifier.recognizeImage(bitmapScale)) != null) {
            return listRecognizeImage;
        }
        return CollectionsKt.emptyList();
    }
}
