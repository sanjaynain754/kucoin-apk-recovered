package jumio.p381df;

import android.graphics.Bitmap;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.ImageMetadata;
import com.jumio.commons.utils.BitmapUtilKt;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.ExtractionUpdateState;
import com.jumio.core.extraction.docfinder.extraction.DocFinderClient;
import com.jumio.core.extraction.result.ImageExtractionResult;
import com.jumio.core.processor.ImageProcessorInterface;
import com.jumio.core.processor.ProcessorState;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.df.a */
/* JADX INFO: loaded from: classes61.dex */
public final class C40762a extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Frame f90515a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DocFinderClient f90516b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ImageProcessorInterface f90517c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40762a(Frame frame, DocFinderClient docFinderClient, ImageProcessorInterface imageProcessorInterface, Continuation continuation) {
        super(2, continuation);
        this.f90515a = frame;
        this.f90516b = docFinderClient;
        this.f90517c = imageProcessorInterface;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40762a(this.f90515a, this.f90516b, this.f90517c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C40762a) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProcessorState.TakePicture takePicture;
        String str;
        ImageMetadata imageMetadata;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Frame frame = this.f90515a;
        if (frame != null) {
            Bitmap bitmapApplyPreviewFrameCropToHighResolutionFrame$default = BitmapUtilKt.applyPreviewFrameCropToHighResolutionFrame$default(frame, this.f90516b.getF13860r(), this.f90516b.getF13861s(), false, this.f90516b.f14047A, 8, null);
            if (this.f90516b.f14048B != 0) {
                bitmapApplyPreviewFrameCropToHighResolutionFrame$default = BitmapUtilKt.rotate(bitmapApplyPreviewFrameCropToHighResolutionFrame$default, this.f90516b.f14048B, true);
            }
            Bitmap bitmap = bitmapApplyPreviewFrameCropToHighResolutionFrame$default;
            String classifier = this.f90517c.getImage().getClassifier();
            ProcessorState state = this.f90517c.getState();
            if (state instanceof ProcessorState.TakePicture) {
                takePicture = (ProcessorState.TakePicture) state;
            } else {
                takePicture = null;
            }
            if (takePicture != null) {
                String batchId = takePicture.getBatchId();
                imageMetadata = takePicture.getImageMetadata();
                str = batchId;
            } else {
                str = null;
                imageMetadata = null;
            }
            this.f90516b.publishUpdate((ExtractionUpdateInterface<?>) ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getSaveHighResolutionImage(), new ImageExtractionResult(bitmap, this.f90516b.getF13857o(), classifier, str, imageMetadata, this.f90515a.getMetadata().getCameraConnectionData()), null, 4, null));
        }
        this.f90516b.f14056w.addRecord("uhd");
        this.f90516b.setResult(false);
        return Unit.INSTANCE;
    }
}
