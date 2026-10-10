package jumio.p381df;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.core.camera.CameraConnectionData;
import com.jumio.core.data.document.CornerPoints;
import com.jumio.core.extraction.docfinder.extraction.DocFinderClient;
import com.jumio.core.extraction.docfinder.processor.base.DocfinderBaseImageProcessor;
import com.jumio.core.extraction.docfinder.processor.tilted.TiltedProcessorState;
import com.jumio.core.interfaces.QAInterface;
import com.jumio.core.model.StaticModel;
import com.jumio.core.processor.CornerPointParameters;
import com.jumio.core.processor.ImageProcessorHandlerInterface;
import com.jumio.core.processor.ImageProcessorInterface;
import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.processor.ProcessorState;
import com.jumio.core.processor.flash.FlashImageProcessor;
import com.jumio.core.util.QAKt;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;

/* JADX INFO: renamed from: jumio.df.f */
/* JADX INFO: loaded from: classes61.dex */
public final class C40767f extends SuspendLambda implements Function4 {

    /* JADX INFO: renamed from: a */
    public Object f90534a;

    /* JADX INFO: renamed from: b */
    public Object f90535b;

    /* JADX INFO: renamed from: c */
    public int f90536c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f90537d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f90538e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean f90539f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DocFinderClient f90540g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CornerPoints f90541h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Ref.ObjectRef f90542i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ CameraSettings f90543j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Rect f90544k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Frame f90545l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ List f90546m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40767f(DocFinderClient docFinderClient, CornerPoints cornerPoints, Ref.ObjectRef objectRef, CameraSettings cameraSettings, Rect rect, Frame frame, List list, Continuation continuation) {
        super(4, continuation);
        this.f90540g = docFinderClient;
        this.f90541h = cornerPoints;
        this.f90542i = objectRef;
        this.f90543j = cameraSettings;
        this.f90544k = rect;
        this.f90545l = frame;
        this.f90546m = list;
    }

    @Override // p852kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C40767f c40767f = new C40767f(this.f90540g, this.f90541h, this.f90542i, this.f90543j, this.f90544k, this.f90545l, this.f90546m, (Continuation) obj4);
        c40767f.f90537d = (ProcessorState) obj;
        c40767f.f90538e = (ImageProcessorInterface) obj2;
        c40767f.f90539f = zBooleanValue;
        return c40767f.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0100  */
    /* JADX WARN: Code duplicated, block: B:41:0x012d  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0151, code lost:
    
        if (r0 == r11) goto L43;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x0100, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProcessorState processorStateProcess;
        boolean z11;
        Object objFinishCurrentProcessor;
        ProcessorState processorState = (ProcessorState) this.f90537d;
        ImageProcessorInterface imageProcessorInterface = (ImageProcessorInterface) this.f90538e;
        boolean z12 = this.f90539f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90536c;
        if (i11 != 0) {
            if (i11 == 1) {
                processorStateProcess = (ProcessorState) this.f90534a;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objFinishCurrentProcessor = obj;
            }
            if (((Boolean) objFinishCurrentProcessor).booleanValue()) {
                this.f90540g.f14056w.reset();
                this.f90540g.setResult(true);
                this.f90540g.publishResult((StaticModel) null);
                return Unit.INSTANCE;
            }
            this.f90540g.setResult(false);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (z12) {
            DocFinderClient.access$publishState(this.f90540g, processorState, imageProcessorInterface.getImage(), this.f90541h);
        }
        if (processorState instanceof TiltedProcessorState.ReferenceCorners) {
            processorStateProcess = imageProcessorInterface.process((Bitmap) this.f90542i.element, this.f90543j, this.f90544k, this.f90545l.getMetadata(), new CornerPointParameters(this.f90540g.f14049C));
            DocFinderClient.access$publishState(this.f90540g, processorStateProcess, imageProcessorInterface.getImage(), this.f90541h);
        } else {
            processorStateProcess = processorState;
        }
        if (!(processorStateProcess instanceof ProcessorState.TakePicture)) {
            imageProcessorInterface = imageProcessorInterface;
            z11 = processorStateProcess instanceof ProcessorState.Finished;
            if (z11) {
                DocFinderClient.access$dumpProcessingTimesDebugInfo(this.f90540g, Reflection.getOrCreateKotlinClass(imageProcessorInterface.getClass()).getSimpleName() + '_' + this.f90540g.getF13857o());
            }
            if (z11) {
                ImageProcessorHandlerInterface imageProcessorHandlerInterface = this.f90540g.f14055v;
                this.f90537d = SpillingKt.nullOutSpilledVariable(processorState);
                this.f90538e = SpillingKt.nullOutSpilledVariable(imageProcessorInterface);
                this.f90534a = SpillingKt.nullOutSpilledVariable(processorStateProcess);
                this.f90535b = null;
                this.f90539f = z12;
                this.f90536c = 2;
                objFinishCurrentProcessor = imageProcessorHandlerInterface.finishCurrentProcessor(this);
            }
            this.f90540g.setResult(false);
            return Unit.INSTANCE;
        }
        ProcessorImage image = imageProcessorInterface.getImage();
        QAInterface qa2 = QAKt.getQA();
        image.getClassifier();
        qa2.getClass();
        DocFinderClient docFinderClient = this.f90540g;
        Bitmap bitmap = (Bitmap) this.f90542i.element;
        ProcessorState.TakePicture takePicture = (ProcessorState.TakePicture) processorStateProcess;
        List list = this.f90546m;
        String classifier = image.getClassifier();
        boolean z13 = imageProcessorInterface instanceof DocfinderBaseImageProcessor;
        CameraConnectionData cameraConnectionData = this.f90545l.getMetadata().getCameraConnectionData();
        boolean z14 = z13 || (imageProcessorInterface instanceof FlashImageProcessor);
        this.f90537d = SpillingKt.nullOutSpilledVariable(processorState);
        this.f90538e = imageProcessorInterface;
        this.f90534a = processorStateProcess;
        this.f90535b = SpillingKt.nullOutSpilledVariable(image);
        this.f90539f = z12;
        this.f90536c = 1;
        ProcessorState processorState2 = processorStateProcess;
        if (DocFinderClient.access$handleTakeImageState(docFinderClient, bitmap, takePicture, list, classifier, z13, cameraConnectionData, z14, this) != coroutine_suspended) {
            processorStateProcess = processorState2;
        }
        return coroutine_suspended;
        if (imageProcessorInterface.getF14090b() && this.f90540g.requestHighResolutionImage()) {
            this.f90540g.f14056w.start();
            return Unit.INSTANCE;
        }
        z11 = processorStateProcess instanceof ProcessorState.Finished;
        if (z11) {
            DocFinderClient.access$dumpProcessingTimesDebugInfo(this.f90540g, Reflection.getOrCreateKotlinClass(imageProcessorInterface.getClass()).getSimpleName() + '_' + this.f90540g.getF13857o());
        }
        if (z11) {
            ImageProcessorHandlerInterface imageProcessorHandlerInterface2 = this.f90540g.f14055v;
            this.f90537d = SpillingKt.nullOutSpilledVariable(processorState);
            this.f90538e = SpillingKt.nullOutSpilledVariable(imageProcessorInterface);
            this.f90534a = SpillingKt.nullOutSpilledVariable(processorStateProcess);
            this.f90535b = null;
            this.f90539f = z12;
            this.f90536c = 2;
            objFinishCurrentProcessor = imageProcessorHandlerInterface2.finishCurrentProcessor(this);
        }
        this.f90540g.setResult(false);
        return Unit.INSTANCE;
    }
}
