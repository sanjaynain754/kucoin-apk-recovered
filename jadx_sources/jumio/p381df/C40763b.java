package jumio.p381df;

import android.graphics.Rect;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.utils.BitmapUtilKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.df.b */
/* JADX INFO: loaded from: classes61.dex */
public final class C40763b extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Frame f90518a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CameraSettings f90519b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Rect f90520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40763b(Frame frame, CameraSettings cameraSettings, Rect rect, Continuation continuation) {
        super(2, continuation);
        this.f90518a = frame;
        this.f90519b = cameraSettings;
        this.f90520c = rect;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40763b(this.f90518a, this.f90519b, this.f90520c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C40763b) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return BitmapUtilKt.cropRotateScale$default(BitmapUtilKt.nv21ToBitmap(this.f90518a.getByteArray(), this.f90518a.getMetadata().getSize().getWidth(), this.f90518a.getMetadata().getSize().getHeight()), this.f90518a.getMetadata(), this.f90519b, this.f90520c, true, false, null, false, 112, null);
    }
}
