package jumio.core;

import android.graphics.Rect;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.utils.BitmapUtilKt;
import com.jumio.core.extraction.manual.ManualPictureClient;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.q2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40715q2 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Frame f90364a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CameraSettings f90365b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Rect f90366c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ManualPictureClient f90367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40715q2(ManualPictureClient manualPictureClient, Frame frame, CameraSettings cameraSettings, Rect rect, Continuation continuation) {
        super(2, continuation);
        this.f90364a = frame;
        this.f90365b = cameraSettings;
        this.f90366c = rect;
        this.f90367d = manualPictureClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40715q2(this.f90367d, this.f90364a, this.f90365b, this.f90366c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C40715q2) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return BitmapUtilKt.cropRotateScale$default(BitmapUtilKt.nv21ToBitmap(this.f90364a.getByteArray(), this.f90364a.getMetadata().getSize().getWidth(), this.f90364a.getMetadata().getSize().getHeight()), this.f90364a.getMetadata(), this.f90365b, this.f90366c, this.f90367d.getF13855m(), false, null, false, 112, null);
    }
}
