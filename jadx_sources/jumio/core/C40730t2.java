package jumio.core;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.log.Log;
import com.jumio.core.extraction.manual.ManualPictureClient;
import com.jumio.core.model.StaticModel;
import com.jumio.core.processor.ImageProcessorHandlerInterface;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: jumio.core.t2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40730t2 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Ref.ObjectRef f90417a;

    /* JADX INFO: renamed from: b */
    public Ref.BooleanRef f90418b;

    /* JADX INFO: renamed from: c */
    public Ref.ObjectRef f90419c;

    /* JADX INFO: renamed from: d */
    public int f90420d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ManualPictureClient f90421e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CameraSettings f90422f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Frame f90423g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Rect f90424h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40730t2(ManualPictureClient manualPictureClient, Frame frame, CameraSettings cameraSettings, Rect rect, Continuation continuation) {
        super(2, continuation);
        this.f90421e = manualPictureClient;
        this.f90422f = cameraSettings;
        this.f90423g = frame;
        this.f90424h = rect;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40730t2(this.f90421e, this.f90423g, this.f90422f, this.f90424h, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C40730t2) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0090 A[Catch: all -> 0x0141, Exception -> 0x0143, TryCatch #11 {Exception -> 0x0143, all -> 0x0141, blocks: (B:34:0x0088, B:36:0x0090, B:38:0x009c, B:40:0x00ac, B:39:0x00a7, B:47:0x00bc, B:31:0x006b), top: B:96:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009c A[Catch: all -> 0x0141, Exception -> 0x0143, TryCatch #11 {Exception -> 0x0143, all -> 0x0141, blocks: (B:34:0x0088, B:36:0x0090, B:38:0x009c, B:40:0x00ac, B:39:0x00a7, B:47:0x00bc, B:31:0x006b), top: B:96:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7 A[Catch: all -> 0x0141, Exception -> 0x0143, TryCatch #11 {Exception -> 0x0143, all -> 0x0141, blocks: (B:34:0x0088, B:36:0x0090, B:38:0x009c, B:40:0x00ac, B:39:0x00a7, B:47:0x00bc, B:31:0x006b), top: B:96:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc A[Catch: all -> 0x0141, Exception -> 0x0143, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x0143, all -> 0x0141, blocks: (B:34:0x0088, B:36:0x0090, B:38:0x009c, B:40:0x00ac, B:39:0x00a7, B:47:0x00bc, B:31:0x006b), top: B:96:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x0124  */
    /* JADX WARN: Code duplicated, block: B:59:0x012a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0158  */
    /* JADX WARN: Code duplicated, block: B:81:0x015e A[PHI: r0
      0x015e: PHI (r0v36 android.graphics.Bitmap) = (r0v34 android.graphics.Bitmap), (r0v39 android.graphics.Bitmap) binds: [B:80:0x015c, B:60:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        Bitmap bitmap;
        Ref.ObjectRef objectRef2;
        Ref.BooleanRef booleanRef2;
        Ref.ObjectRef objectRef3;
        Ref.BooleanRef booleanRef3;
        Object objSelectNextProcessor;
        Object objM91049g;
        Ref.ObjectRef objectRef4;
        Ref.BooleanRef booleanRef4;
        Bitmap bitmap2;
        T t11;
        Ref.BooleanRef booleanRef5;
        ImageProcessorHandlerInterface imageProcessorHandlerInterface;
        Bitmap bitmap3;
        CameraSettings cameraSettings;
        Rect rect;
        Frame.Metadata metadata;
        C40710p2 c40710p2;
        C40725s2 c40725s2;
        Ref.ObjectRef objectRef5;
        Bitmap bitmap4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90420d;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                objectRef2 = new Ref.ObjectRef();
                booleanRef2 = new Ref.BooleanRef();
                booleanRef2.element = true;
                try {
                    ImageProcessorHandlerInterface imageProcessorHandlerInterface2 = this.f90421e.f14132u;
                    CameraSettings cameraSettings2 = this.f90422f;
                    C40720r2 c40720r2 = new C40720r2(this.f90421e);
                    this.f90417a = objectRef2;
                    this.f90418b = booleanRef2;
                    this.f90420d = 1;
                    objSelectNextProcessor = imageProcessorHandlerInterface2.selectNextProcessor(cameraSettings2, c40720r2, this);
                    if (objSelectNextProcessor != coroutine_suspended) {
                        if (!((Boolean) objSelectNextProcessor).booleanValue()) {
                            if (this.f90421e.f14132u.getProcessingDone()) {
                                this.f90421e.setResult(true);
                                this.f90421e.publishResult((StaticModel) null);
                            } else {
                                this.f90421e.setResult(false);
                            }
                            Unit unit = Unit.INSTANCE;
                            if (booleanRef2.element) {
                                bitmap2.recycle();
                            }
                            return unit;
                        }
                        ManualPictureClient manualPictureClient = this.f90421e;
                        Frame frame = this.f90423g;
                        CameraSettings cameraSettings3 = this.f90422f;
                        Rect rect2 = this.f90424h;
                        this.f90417a = objectRef2;
                        this.f90418b = booleanRef2;
                        this.f90419c = objectRef2;
                        this.f90420d = 2;
                        objM91049g = C41686h.m91049g(manualPictureClient.getF13852j().getF14551c(), new C40715q2(manualPictureClient, frame, cameraSettings3, rect2, null), this);
                        if (objM91049g != coroutine_suspended) {
                            objectRef4 = objectRef2;
                            booleanRef4 = booleanRef2;
                            t11 = objM91049g;
                            objectRef2.element = t11;
                            imageProcessorHandlerInterface = this.f90421e.f14132u;
                            bitmap3 = (Bitmap) objectRef4.element;
                            cameraSettings = this.f90422f;
                            rect = this.f90424h;
                            metadata = this.f90423g.getMetadata();
                            c40710p2 = new C40710p2(this.f90421e.f14133v.get());
                            c40725s2 = new C40725s2(this.f90421e, this.f90423g, this.f90422f, this.f90424h, objectRef4, booleanRef4, null);
                            booleanRef5 = booleanRef4;
                            this.f90417a = objectRef4;
                            this.f90418b = booleanRef5;
                            this.f90419c = null;
                            this.f90420d = 3;
                            if (imageProcessorHandlerInterface.doProcess(bitmap3, cameraSettings, rect, metadata, c40710p2, c40725s2, this) != coroutine_suspended) {
                                booleanRef3 = booleanRef5;
                                objectRef5 = objectRef4;
                                if (booleanRef3.element) {
                                    bitmap4.recycle();
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                } catch (Exception e11) {
                    e = e11;
                    objectRef3 = objectRef2;
                    booleanRef3 = booleanRef2;
                } catch (Throwable th2) {
                    th = th2;
                    objectRef = objectRef2;
                    booleanRef = booleanRef2;
                    if (booleanRef.element) {
                        bitmap.recycle();
                    }
                    throw th;
                }
            } else if (i11 != 1) {
                if (i11 == 2) {
                    Ref.ObjectRef objectRef6 = this.f90419c;
                    booleanRef = this.f90418b;
                    objectRef = this.f90417a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        objectRef2 = objectRef6;
                        booleanRef4 = booleanRef;
                        objectRef4 = objectRef;
                        t11 = obj;
                        try {
                            objectRef2.element = t11;
                            imageProcessorHandlerInterface = this.f90421e.f14132u;
                            bitmap3 = (Bitmap) objectRef4.element;
                            cameraSettings = this.f90422f;
                            rect = this.f90424h;
                            metadata = this.f90423g.getMetadata();
                            c40710p2 = new C40710p2(this.f90421e.f14133v.get());
                            c40725s2 = new C40725s2(this.f90421e, this.f90423g, this.f90422f, this.f90424h, objectRef4, booleanRef4, null);
                            booleanRef5 = booleanRef4;
                            try {
                                this.f90417a = objectRef4;
                                this.f90418b = booleanRef5;
                                this.f90419c = null;
                                this.f90420d = 3;
                                if (imageProcessorHandlerInterface.doProcess(bitmap3, cameraSettings, rect, metadata, c40710p2, c40725s2, this) != coroutine_suspended) {
                                    booleanRef3 = booleanRef5;
                                    objectRef5 = objectRef4;
                                    if (booleanRef3.element) {
                                        bitmap4.recycle();
                                    }
                                }
                                return coroutine_suspended;
                            } catch (Exception e12) {
                                e = e12;
                                booleanRef3 = booleanRef5;
                                objectRef3 = objectRef4;
                                Log.m14471e("ManualPictureClient", e);
                                this.f90421e.setResult(false);
                                if (booleanRef3.element) {
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th3) {
                                th = th3;
                                booleanRef = booleanRef5;
                                objectRef = objectRef4;
                                if (booleanRef.element) {
                                    bitmap.recycle();
                                }
                                throw th;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            booleanRef5 = booleanRef4;
                        } catch (Throwable th4) {
                            th = th4;
                            booleanRef5 = booleanRef4;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        booleanRef3 = booleanRef;
                        objectRef3 = objectRef;
                    } catch (Throwable th5) {
                        th = th5;
                        if (booleanRef.element && (bitmap = (Bitmap) objectRef.element) != null) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef3 = this.f90418b;
                    objectRef3 = this.f90417a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        objectRef5 = objectRef3;
                        if (booleanRef3.element && (bitmap4 = (Bitmap) objectRef5.element) != null) {
                            bitmap4.recycle();
                        }
                    } catch (Exception e15) {
                        e = e15;
                        Log.m14471e("ManualPictureClient", e);
                        this.f90421e.setResult(false);
                        if (booleanRef3.element) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                Log.m14471e("ManualPictureClient", e);
                this.f90421e.setResult(false);
                if (booleanRef3.element && (bitmap4 = (Bitmap) objectRef3.element) != null) {
                    bitmap4.recycle();
                }
            } else {
                Ref.BooleanRef booleanRef6 = this.f90418b;
                Ref.ObjectRef objectRef7 = this.f90417a;
                try {
                    ResultKt.throwOnFailure(obj);
                    booleanRef2 = booleanRef6;
                    objectRef2 = objectRef7;
                    objSelectNextProcessor = obj;
                    if (!((Boolean) objSelectNextProcessor).booleanValue()) {
                        if (this.f90421e.f14132u.getProcessingDone()) {
                            this.f90421e.setResult(true);
                            this.f90421e.publishResult((StaticModel) null);
                        } else {
                            this.f90421e.setResult(false);
                        }
                        Unit unit2 = Unit.INSTANCE;
                        if (booleanRef2.element && (bitmap2 = (Bitmap) objectRef2.element) != null) {
                            bitmap2.recycle();
                        }
                        return unit2;
                    }
                    ManualPictureClient manualPictureClient2 = this.f90421e;
                    Frame frame2 = this.f90423g;
                    CameraSettings cameraSettings4 = this.f90422f;
                    Rect rect3 = this.f90424h;
                    this.f90417a = objectRef2;
                    this.f90418b = booleanRef2;
                    this.f90419c = objectRef2;
                    this.f90420d = 2;
                    objM91049g = C41686h.m91049g(manualPictureClient2.getF13852j().getF14551c(), new C40715q2(manualPictureClient2, frame2, cameraSettings4, rect3, null), this);
                    if (objM91049g != coroutine_suspended) {
                        objectRef4 = objectRef2;
                        booleanRef4 = booleanRef2;
                        t11 = objM91049g;
                        objectRef2.element = t11;
                        imageProcessorHandlerInterface = this.f90421e.f14132u;
                        bitmap3 = (Bitmap) objectRef4.element;
                        cameraSettings = this.f90422f;
                        rect = this.f90424h;
                        metadata = this.f90423g.getMetadata();
                        c40710p2 = new C40710p2(this.f90421e.f14133v.get());
                        c40725s2 = new C40725s2(this.f90421e, this.f90423g, this.f90422f, this.f90424h, objectRef4, booleanRef4, null);
                        booleanRef5 = booleanRef4;
                        this.f90417a = objectRef4;
                        this.f90418b = booleanRef5;
                        this.f90419c = null;
                        this.f90420d = 3;
                        if (imageProcessorHandlerInterface.doProcess(bitmap3, cameraSettings, rect, metadata, c40710p2, c40725s2, this) != coroutine_suspended) {
                            booleanRef3 = booleanRef5;
                            objectRef5 = objectRef4;
                            if (booleanRef3.element) {
                                bitmap4.recycle();
                            }
                        }
                    }
                    return coroutine_suspended;
                } catch (Exception e16) {
                    e = e16;
                    booleanRef3 = booleanRef6;
                    objectRef3 = objectRef7;
                } catch (Throwable th6) {
                    th = th6;
                    booleanRef = booleanRef6;
                    objectRef = objectRef7;
                    if (booleanRef.element) {
                        bitmap.recycle();
                    }
                    throw th;
                }
            }
            return Unit.INSTANCE;
        } catch (Throwable th7) {
            th = th7;
            booleanRef = null;
            objectRef = 3;
        }
    }
}
