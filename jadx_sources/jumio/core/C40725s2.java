package jumio.core;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.Size;
import com.jumio.commons.utils.BitmapUtilKt;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.ExtractionUpdateState;
import com.jumio.core.extraction.manual.ManualPictureClient;
import com.jumio.core.extraction.result.ImageExtractionResult;
import com.jumio.core.interfaces.QAInterface;
import com.jumio.core.model.StaticModel;
import com.jumio.core.processor.ImageProcessorHandlerInterface;
import com.jumio.core.processor.ImageProcessorInterface;
import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.processor.ProcessorState;
import com.jumio.core.util.QAKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: jumio.core.s2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40725s2 extends SuspendLambda implements Function4 {

    /* JADX INFO: renamed from: a */
    public int f90399a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f90400b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f90401c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f90402d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ManualPictureClient f90403e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Frame f90404f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CameraSettings f90405g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Rect f90406h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Ref.ObjectRef f90407i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Ref.BooleanRef f90408j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40725s2(ManualPictureClient manualPictureClient, Frame frame, CameraSettings cameraSettings, Rect rect, Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, Continuation continuation) {
        super(4, continuation);
        this.f90403e = manualPictureClient;
        this.f90404f = frame;
        this.f90405g = cameraSettings;
        this.f90406h = rect;
        this.f90407i = objectRef;
        this.f90408j = booleanRef;
    }

    @Override // p852kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C40725s2 c40725s2 = new C40725s2(this.f90403e, this.f90404f, this.f90405g, this.f90406h, this.f90407i, this.f90408j, (Continuation) obj4);
        c40725s2.f90400b = (ProcessorState) obj;
        c40725s2.f90401c = (ImageProcessorInterface) obj2;
        c40725s2.f90402d = zBooleanValue;
        return c40725s2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objFinishCurrentProcessor;
        int saveImage;
        Bitmap bitmapCrop$default;
        ProcessorState processorState = (ProcessorState) this.f90400b;
        ImageProcessorInterface imageProcessorInterface = (ImageProcessorInterface) this.f90401c;
        boolean z11 = this.f90402d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90399a;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (z11) {
                ManualPictureClient.access$publishState(this.f90403e, processorState, imageProcessorInterface.getImage());
            }
            if (processorState instanceof ProcessorState.TakePicture) {
                ProcessorImage image = imageProcessorInterface.getImage();
                QAInterface qa2 = QAKt.getQA();
                image.getClassifier();
                qa2.getClass();
                ProcessorState.TakePicture takePicture = (ProcessorState.TakePicture) processorState;
                Size outputSize = takePicture.getOutputSize();
                if (outputSize != null) {
                    saveImage = ExtractionUpdateState.INSTANCE.getSaveDebugImage();
                    Bitmap bitmap = (Bitmap) this.f90407i.element;
                    bitmapCrop$default = BitmapUtilKt.crop$default(bitmap, BitmapUtilKt.getCenterCropRoi(bitmap, outputSize), false, 2, null);
                } else {
                    saveImage = ExtractionUpdateState.INSTANCE.getSaveImage();
                    bitmapCrop$default = (Bitmap) this.f90407i.element;
                    this.f90408j.element = false;
                }
                Bitmap bitmap2 = bitmapCrop$default;
                ManualPictureClient manualPictureClient = this.f90403e;
                manualPictureClient.publishUpdate((ExtractionUpdateInterface<?>) ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, saveImage, new ImageExtractionResult(bitmap2, manualPictureClient.getF13857o(), image.getClassifier(), takePicture.getBatchId(), takePicture.getImageMetadata(), this.f90404f.getMetadata().getCameraConnectionData()), null, 4, null));
                if (this.f90403e.getF13855m() && imageProcessorInterface.getF14134a() && this.f90403e.requestHighResolutionImage()) {
                    return Unit.INSTANCE;
                }
            }
            if (processorState instanceof ProcessorState.Finished) {
                ImageProcessorHandlerInterface imageProcessorHandlerInterface = this.f90403e.f14132u;
                this.f90400b = SpillingKt.nullOutSpilledVariable(processorState);
                this.f90401c = SpillingKt.nullOutSpilledVariable(imageProcessorInterface);
                this.f90402d = z11;
                this.f90399a = 1;
                objFinishCurrentProcessor = imageProcessorHandlerInterface.finishCurrentProcessor(this);
                if (objFinishCurrentProcessor == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f90403e.setResult(false);
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        objFinishCurrentProcessor = obj;
        if (((Boolean) objFinishCurrentProcessor).booleanValue()) {
            this.f90403e.setResult(true);
            this.f90403e.publishResult((StaticModel) null);
            return Unit.INSTANCE;
        }
        this.f90403e.setResult(false);
        return Unit.INSTANCE;
    }
}
