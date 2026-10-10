package jumio.camerax;

import com.jumio.camerax.CameraXManager;
import com.jumio.commons.camera.CameraCallbackInterface;
import com.jumio.commons.log.Log;
import java.lang.ref.WeakReference;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.camerax.l */
/* JADX INFO: loaded from: classes61.dex */
public final class C40486l extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CameraXManager f89869a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40486l(CameraXManager cameraXManager, Continuation continuation) {
        super(2, continuation);
        this.f89869a = cameraXManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40486l(this.f89869a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40486l(this.f89869a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CameraCallbackInterface cameraCallbackInterface;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Log.m14482w("Camera fallback triggered.");
        WeakReference weakReference = this.f89869a.cameraCallback;
        if (weakReference != null && (cameraCallbackInterface = (CameraCallbackInterface) weakReference.get()) != null) {
            cameraCallbackInterface.onCameraFallback();
        }
        return Unit.INSTANCE;
    }
}
