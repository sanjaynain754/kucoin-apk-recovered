package jumio.p381df;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.DeviceRotationManager;
import com.jumio.core.data.document.CornerPoints;
import com.jumio.core.extraction.ProcessingTimesRecorder;
import com.jumio.core.extraction.docfinder.extraction.DocFinderClient;
import com.jumio.core.model.StaticModel;
import com.jumio.core.processor.CornerPointParameters;
import com.jumio.core.processor.ImageProcessorHandlerInterface;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: jumio.df.g */
/* JADX INFO: loaded from: classes61.dex */
public final class C40768g extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Ref.ObjectRef f90547a;

    /* JADX INFO: renamed from: b */
    public Object f90548b;

    /* JADX INFO: renamed from: c */
    public Object f90549c;

    /* JADX INFO: renamed from: d */
    public long f90550d;

    /* JADX INFO: renamed from: e */
    public int f90551e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DocFinderClient f90552f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CameraSettings f90553g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Frame f90554h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Rect f90555i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40768g(DocFinderClient docFinderClient, Frame frame, CameraSettings cameraSettings, Rect rect, Continuation continuation) {
        super(2, continuation);
        this.f90552f = docFinderClient;
        this.f90553g = cameraSettings;
        this.f90554h = frame;
        this.f90555i = rect;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40768g(this.f90552f, this.f90554h, this.f90553g, this.f90555i, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C40768g) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f0 A[Catch: all -> 0x004e, Exception -> 0x0172, PHI: r1 r5 r13
      0x00f0: PHI (r1v13 java.lang.Object) = (r1v11 java.lang.Object), (r1v38 java.lang.Object) binds: [B:49:0x00ec, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r5v10 long) = (r5v9 long), (r5v14 long) binds: [B:49:0x00ec, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r13v9 ??) = (r13v14 ??), (r13v13 ??) binds: [B:49:0x00ec, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {Exception -> 0x0172, all -> 0x004e, blocks: (B:51:0x00f0, B:53:0x0161, B:60:0x0176, B:64:0x01b3, B:17:0x0047, B:48:0x00d8), top: B:89:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0161 A[Catch: all -> 0x004e, Exception -> 0x0172, TryCatch #5 {Exception -> 0x0172, all -> 0x004e, blocks: (B:51:0x00f0, B:53:0x0161, B:60:0x0176, B:64:0x01b3, B:17:0x0047, B:48:0x00d8), top: B:89:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0175  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f5 A[PHI: r0
      0x01f5: PHI (r0v8 android.graphics.Bitmap) = (r0v7 android.graphics.Bitmap), (r0v35 android.graphics.Bitmap) binds: [B:78:0x01f3, B:69:0x01d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x020c  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00f0, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [T] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r19v1, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r1v41 */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r13;
        Bitmap bitmap;
        Bitmap bitmap2;
        Ref.ObjectRef objectRef;
        Object objSelectNextProcessor;
        long jStart;
        ?? r14;
        ?? r12;
        Object objAccess$recognizeCorners;
        ?? r15;
        boolean z11;
        ImageProcessorHandlerInterface imageProcessorHandlerInterface;
        Bitmap bitmap3;
        CameraSettings cameraSettings;
        Rect rect;
        Frame.Metadata metadata;
        CornerPointParameters cornerPointParameters;
        C40767f c40767f;
        ?? r19;
        ?? r11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r16 = this.f90551e;
        try {
            try {
                if (r16 == 0) {
                    ResultKt.throwOnFailure(obj);
                    objectRef = new Ref.ObjectRef();
                    ImageProcessorHandlerInterface imageProcessorHandlerInterface2 = this.f90552f.f14055v;
                    CameraSettings cameraSettings2 = this.f90553g;
                    C40766e c40766e = new C40766e(this.f90552f);
                    this.f90547a = objectRef;
                    this.f90551e = 1;
                    objSelectNextProcessor = imageProcessorHandlerInterface2.selectNextProcessor(cameraSettings2, c40766e, this);
                    if (objSelectNextProcessor == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (r16 != 1) {
                    if (r16 != 2) {
                        if (r16 == 3) {
                            jStart = this.f90550d;
                            Ref.ObjectRef objectRef2 = this.f90547a;
                            ResultKt.throwOnFailure(obj);
                            r13 = objectRef2;
                            objAccess$recognizeCorners = obj;
                            List list = (List) objAccess$recognizeCorners;
                            Log.m14479v("DocFinderClient", "Bitmap transformation and inference took: " + (SystemClock.uptimeMillis() - jStart) + " ms");
                            CornerPoints cornerPointsAccess$getAbsoluteCornerPointsFromRelativeRecognitions = DocFinderClient.access$getAbsoluteCornerPointsFromRelativeRecognitions(this.f90552f, list, this.f90555i.width(), this.f90555i.height(), Math.abs(this.f90553g.getF13516b().getWidth() - this.f90555i.width()) / 2, Math.abs(this.f90553g.getF13516b().getHeight() - this.f90555i.height()) / 2);
                            Frame.Metadata metadata2 = this.f90554h.getMetadata();
                            if (!this.f90554h.getMetadata().isPortrait() || DeviceRotationManager.INSTANCE.isTabletDevice(this.f90552f.getF13845c())) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            metadata2.setPortrait(z11);
                            imageProcessorHandlerInterface = this.f90552f.f14055v;
                            bitmap3 = (Bitmap) r13.element;
                            cameraSettings = this.f90553g;
                            rect = this.f90555i;
                            metadata = this.f90554h.getMetadata();
                            cornerPointParameters = new CornerPointParameters(cornerPointsAccess$getAbsoluteCornerPointsFromRelativeRecognitions);
                            r19 = r13;
                            try {
                                c40767f = new C40767f(this.f90552f, cornerPointsAccess$getAbsoluteCornerPointsFromRelativeRecognitions, r19, this.f90553g, this.f90555i, this.f90554h, list, null);
                                this.f90547a = r13;
                                this.f90548b = SpillingKt.nullOutSpilledVariable(list);
                                this.f90549c = SpillingKt.nullOutSpilledVariable(cornerPointsAccess$getAbsoluteCornerPointsFromRelativeRecognitions);
                                this.f90550d = jStart;
                                this.f90551e = 4;
                                if (imageProcessorHandlerInterface.doProcess(bitmap3, cameraSettings, rect, metadata, cornerPointParameters, c40767f, this) != coroutine_suspended) {
                                    r11 = r13;
                                }
                                return coroutine_suspended;
                            } catch (Exception e11) {
                                e = e11;
                                r15 = r19;
                                r16 = r15;
                                Log.m14471e("DocFinderClient", e);
                                this.f90552f.setResult(false);
                                bitmap2 = (Bitmap) r16.element;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r13 = r19;
                                bitmap = (Bitmap) r13.element;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                throw th;
                            }
                        } else {
                            if (r16 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Ref.ObjectRef objectRef3 = this.f90547a;
                            ResultKt.throwOnFailure(obj);
                            r11 = objectRef3;
                        }
                        bitmap2 = (Bitmap) r11.element;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        ProcessingTimesRecorder.addRecord$default(this.f90552f.f14056w, null, 1, null);
                        return Unit.INSTANCE;
                    }
                    jStart = this.f90550d;
                    objectRef = (Ref.ObjectRef) this.f90548b;
                    r13 = this.f90547a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        r12 = obj;
                        r14 = r13;
                        objectRef.element = r12;
                        DocFinderClient docFinderClient = this.f90552f;
                        Bitmap bitmap4 = (Bitmap) r14.element;
                        this.f90547a = r14;
                        this.f90548b = null;
                        this.f90550d = jStart;
                        this.f90551e = 3;
                        objAccess$recognizeCorners = DocFinderClient.access$recognizeCorners(docFinderClient, bitmap4, this);
                        r13 = r14;
                        if (objAccess$recognizeCorners == coroutine_suspended) {
                            List list2 = (List) objAccess$recognizeCorners;
                            Log.m14479v("DocFinderClient", "Bitmap transformation and inference took: " + (SystemClock.uptimeMillis() - jStart) + " ms");
                            CornerPoints cornerPointsAccess$getAbsoluteCornerPointsFromRelativeRecognitions2 = DocFinderClient.access$getAbsoluteCornerPointsFromRelativeRecognitions(this.f90552f, list2, this.f90555i.width(), this.f90555i.height(), Math.abs(this.f90553g.getF13516b().getWidth() - this.f90555i.width()) / 2, Math.abs(this.f90553g.getF13516b().getHeight() - this.f90555i.height()) / 2);
                            Frame.Metadata metadata3 = this.f90554h.getMetadata();
                            if (this.f90554h.getMetadata().isPortrait()) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            metadata3.setPortrait(z11);
                            imageProcessorHandlerInterface = this.f90552f.f14055v;
                            bitmap3 = (Bitmap) r13.element;
                            cameraSettings = this.f90553g;
                            rect = this.f90555i;
                            metadata = this.f90554h.getMetadata();
                            cornerPointParameters = new CornerPointParameters(cornerPointsAccess$getAbsoluteCornerPointsFromRelativeRecognitions2);
                            r19 = r13;
                            c40767f = new C40767f(this.f90552f, cornerPointsAccess$getAbsoluteCornerPointsFromRelativeRecognitions2, r19, this.f90553g, this.f90555i, this.f90554h, list2, null);
                            this.f90547a = r13;
                            this.f90548b = SpillingKt.nullOutSpilledVariable(list2);
                            this.f90549c = SpillingKt.nullOutSpilledVariable(cornerPointsAccess$getAbsoluteCornerPointsFromRelativeRecognitions2);
                            this.f90550d = jStart;
                            this.f90551e = 4;
                            if (imageProcessorHandlerInterface.doProcess(bitmap3, cameraSettings, rect, metadata, cornerPointParameters, c40767f, this) != coroutine_suspended) {
                                r11 = r13;
                                bitmap2 = (Bitmap) r11.element;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                }
                                ProcessingTimesRecorder.addRecord$default(this.f90552f.f14056w, null, 1, null);
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    } catch (Exception e12) {
                        e = e12;
                        r15 = r13;
                        r16 = r15;
                        Log.m14471e("DocFinderClient", e);
                        this.f90552f.setResult(false);
                        bitmap2 = (Bitmap) r16.element;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        ProcessingTimesRecorder.addRecord$default(this.f90552f.f14056w, null, 1, null);
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        th = th3;
                        bitmap = (Bitmap) r13.element;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                }
                objectRef = this.f90547a;
                ResultKt.throwOnFailure(obj);
                objSelectNextProcessor = obj;
                if (!((Boolean) objSelectNextProcessor).booleanValue()) {
                    if (this.f90552f.f14055v.getProcessingDone()) {
                        this.f90552f.setResult(true);
                        this.f90552f.publishResult((StaticModel) null);
                    } else {
                        this.f90552f.setResult(false);
                    }
                    Unit unit = Unit.INSTANCE;
                    Bitmap bitmap5 = (Bitmap) objectRef.element;
                    if (bitmap5 != null) {
                        bitmap5.recycle();
                    }
                    return unit;
                }
                jStart = this.f90552f.f14056w.start();
                DocFinderClient docFinderClient2 = this.f90552f;
                Frame frame = this.f90554h;
                CameraSettings cameraSettings3 = this.f90553g;
                Rect rect2 = this.f90555i;
                this.f90547a = objectRef;
                this.f90548b = objectRef;
                this.f90550d = jStart;
                this.f90551e = 2;
                Object objM91049g = C41686h.m91049g(docFinderClient2.getF13852j().getF14551c(), new C40763b(frame, cameraSettings3, rect2, null), this);
                if (objM91049g != coroutine_suspended) {
                    r14 = objectRef;
                    r12 = objM91049g;
                    objectRef.element = r12;
                    DocFinderClient docFinderClient3 = this.f90552f;
                    Bitmap bitmap6 = (Bitmap) r14.element;
                    this.f90547a = r14;
                    this.f90548b = null;
                    this.f90550d = jStart;
                    this.f90551e = 3;
                    objAccess$recognizeCorners = DocFinderClient.access$recognizeCorners(docFinderClient3, bitmap6, this);
                    r13 = r14;
                    if (objAccess$recognizeCorners == coroutine_suspended) {
                        List list3 = (List) objAccess$recognizeCorners;
                        Log.m14479v("DocFinderClient", "Bitmap transformation and inference took: " + (SystemClock.uptimeMillis() - jStart) + " ms");
                        CornerPoints cornerPointsAccess$getAbsoluteCornerPointsFromRelativeRecognitions3 = DocFinderClient.access$getAbsoluteCornerPointsFromRelativeRecognitions(this.f90552f, list3, this.f90555i.width(), this.f90555i.height(), Math.abs(this.f90553g.getF13516b().getWidth() - this.f90555i.width()) / 2, Math.abs(this.f90553g.getF13516b().getHeight() - this.f90555i.height()) / 2);
                        Frame.Metadata metadata4 = this.f90554h.getMetadata();
                        if (this.f90554h.getMetadata().isPortrait()) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        metadata4.setPortrait(z11);
                        imageProcessorHandlerInterface = this.f90552f.f14055v;
                        bitmap3 = (Bitmap) r13.element;
                        cameraSettings = this.f90553g;
                        rect = this.f90555i;
                        metadata = this.f90554h.getMetadata();
                        cornerPointParameters = new CornerPointParameters(cornerPointsAccess$getAbsoluteCornerPointsFromRelativeRecognitions3);
                        r19 = r13;
                        c40767f = new C40767f(this.f90552f, cornerPointsAccess$getAbsoluteCornerPointsFromRelativeRecognitions3, r19, this.f90553g, this.f90555i, this.f90554h, list3, null);
                        this.f90547a = r13;
                        this.f90548b = SpillingKt.nullOutSpilledVariable(list3);
                        this.f90549c = SpillingKt.nullOutSpilledVariable(cornerPointsAccess$getAbsoluteCornerPointsFromRelativeRecognitions3);
                        this.f90550d = jStart;
                        this.f90551e = 4;
                        if (imageProcessorHandlerInterface.doProcess(bitmap3, cameraSettings, rect, metadata, cornerPointParameters, c40767f, this) != coroutine_suspended) {
                            r11 = r13;
                            bitmap2 = (Bitmap) r11.element;
                            if (bitmap2 != null) {
                                bitmap2.recycle();
                            }
                            ProcessingTimesRecorder.addRecord$default(this.f90552f.f14056w, null, 1, null);
                            return Unit.INSTANCE;
                        }
                    }
                }
                return coroutine_suspended;
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Throwable th4) {
            th = th4;
            r13 = r16;
        }
    }
}
