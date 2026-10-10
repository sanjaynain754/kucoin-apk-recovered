package jumio.camerax;

import com.jumio.camerax.CameraXManager;
import com.jumio.commons.camera.CameraCallbackInterface;
import java.lang.ref.WeakReference;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.camerax.i */
/* JADX INFO: loaded from: classes61.dex */
public final class C40483i extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CameraXManager f89867a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40483i(CameraXManager cameraXManager, Continuation continuation) {
        super(2, continuation);
        this.f89867a = cameraXManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40483i(this.f89867a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40483i(this.f89867a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CameraCallbackInterface cameraCallbackInterface;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        WeakReference weakReference = this.f89867a.cameraCallback;
        if (weakReference != null && (cameraCallbackInterface = (CameraCallbackInterface) weakReference.get()) != null) {
            cameraCallbackInterface.onCameraAvailable();
        }
        return Unit.INSTANCE;
    }
}
