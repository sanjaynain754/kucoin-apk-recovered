package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.concurrent.Executor;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.C41718o1;
import kotlinx.coroutines.InterfaceC41708m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.ContinuationInterceptor;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ImageCaptureExt.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aT\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\u000b\u001a\\\u0010\u0000\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\u000f\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0002H\u0001¨\u0006\u0012"}, m90084d2 = {"takePicture", "Landroidx/camera/core/ImageProxy;", "Landroidx/camera/core/ImageCapture;", "onCaptureStarted", "Lkotlin/Function0;", "", "onCaptureProcessProgressed", "Lkotlin/Function1;", "", "onPostviewBitmapAvailable", "Landroid/graphics/Bitmap;", "(Landroidx/camera/core/ImageCapture;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/core/ImageCapture$OutputFileResults;", "outputFileOptions", "Landroidx/camera/core/ImageCapture$OutputFileOptions;", "(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTakePictureRequest", "Landroidx/camera/core/imagecapture/TakePictureRequest;", "camera-core_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nImageCaptureExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageCaptureExt.kt\nandroidx/camera/core/ImageCaptureExtKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,203:1\n326#2:204\n326#2:216\n318#3,11:205\n318#3,11:217\n*S KotlinDebug\n*F\n+ 1 ImageCaptureExt.kt\nandroidx/camera/core/ImageCaptureExtKt\n*L\n50#1:204\n102#1:216\n52#1:205,11\n104#1:217,11\n*E\n"})
public final class ImageCaptureExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.camera.core.DelegatingImageCapturedCallback] */
    @Nullable
    public static final Object takePicture(@NotNull ImageCapture imageCapture, @Nullable final Function0<Unit> function0, @Nullable final Function1<? super Integer, Unit> function1, @Nullable final Function1<? super Bitmap, Unit> function2, @NotNull Continuation<? super ImageProxy> continuation) {
        Executor executorDirectExecutor;
        CoroutineContext.Element element = continuation.get$context().get(ContinuationInterceptor.INSTANCE);
        DelegatingImageCapturedCallback delegatingImageCapturedCallback = null;
        AbstractC41697j0 abstractC41697j0 = element instanceof AbstractC41697j0 ? (AbstractC41697j0) element : null;
        if (abstractC41697j0 == null || (executorDirectExecutor = C41718o1.m91177a(abstractC41697j0)) == null) {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            Intrinsics.checkNotNullExpressionValue(executorDirectExecutor, "directExecutor(...)");
        }
        final C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new DelegatingImageCapturedCallback(new ImageCapture.OnImageCapturedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureProcessProgressed(int progress) {
                Function1<Integer, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke(Integer.valueOf(progress));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureStarted() {
                Function0<Unit> function3 = function0;
                if (function3 != null) {
                    function3.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(ImageProxy imageProxy) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
                DelegatingImageCapturedCallback delegatingImageCapturedCallback3 = objectRef.element;
                if (delegatingImageCapturedCallback3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = delegatingImageCapturedCallback3;
                }
                delegatingImageCapturedCallback2.dispose();
                c41716o.resumeWith(Result.m103844constructorimpl(imageProxy));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onError(ImageCaptureException exception) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                DelegatingImageCapturedCallback delegatingImageCapturedCallback3 = objectRef.element;
                if (delegatingImageCapturedCallback3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = delegatingImageCapturedCallback3;
                }
                delegatingImageCapturedCallback2.dispose();
                InterfaceC41708m<ImageProxy> interfaceC41708m = c41716o;
                Result.Companion companion = Result.INSTANCE;
                interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(exception)));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onPostviewBitmapAvailable(Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                Function1<Bitmap, Unit> function3 = function2;
                if (function3 != null) {
                    function3.invoke(bitmap);
                }
            }
        });
        c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$2
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                DelegatingImageCapturedCallback delegatingImageCapturedCallback3 = objectRef.element;
                if (delegatingImageCapturedCallback3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = delegatingImageCapturedCallback3;
                }
                delegatingImageCapturedCallback2.dispose();
            }
        });
        T t11 = objectRef.element;
        if (t11 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
        } else {
            delegatingImageCapturedCallback = (DelegatingImageCapturedCallback) t11;
        }
        imageCapture.takePicture(executorDirectExecutor, delegatingImageCapturedCallback);
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, Function0 function0, Function1 function1, Function1 function2, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = null;
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        return takePicture(imageCapture, function0, function1, function2, continuation);
    }

    @VisibleForTesting
    @Nullable
    public static final TakePictureRequest getTakePictureRequest(@NotNull ImageCapture imageCapture) {
        Intrinsics.checkNotNullParameter(imageCapture, "<this>");
        RequestWithCallback capturingRequest = imageCapture.getTakePictureManager().getCapturingRequest();
        if (capturingRequest != null) {
            return capturingRequest.getTakePictureRequest();
        }
        return null;
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, Function0 function0, Function1 function1, Function1 function2, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        if ((i11 & 8) != 0) {
            function2 = null;
        }
        return takePicture(imageCapture, outputFileOptions, function0, function1, function2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.camera.core.DelegatingImageSavedCallback] */
    @Nullable
    public static final Object takePicture(@NotNull ImageCapture imageCapture, @NotNull ImageCapture.OutputFileOptions outputFileOptions, @Nullable final Function0<Unit> function0, @Nullable final Function1<? super Integer, Unit> function1, @Nullable final Function1<? super Bitmap, Unit> function2, @NotNull Continuation<? super ImageCapture.OutputFileResults> continuation) {
        Executor executorDirectExecutor;
        CoroutineContext.Element element = continuation.get$context().get(ContinuationInterceptor.INSTANCE);
        DelegatingImageSavedCallback delegatingImageSavedCallback = null;
        AbstractC41697j0 abstractC41697j0 = element instanceof AbstractC41697j0 ? (AbstractC41697j0) element : null;
        if (abstractC41697j0 == null || (executorDirectExecutor = C41718o1.m91177a(abstractC41697j0)) == null) {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            Intrinsics.checkNotNullExpressionValue(executorDirectExecutor, "directExecutor(...)");
        }
        final C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new DelegatingImageSavedCallback(new ImageCapture.OnImageSavedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$1
            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureProcessProgressed(int progress) {
                Function1<Integer, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke(Integer.valueOf(progress));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureStarted() {
                Function0<Unit> function3 = function0;
                if (function3 != null) {
                    function3.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onError(ImageCaptureException exception) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                DelegatingImageSavedCallback delegatingImageSavedCallback3 = objectRef.element;
                if (delegatingImageSavedCallback3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = delegatingImageSavedCallback3;
                }
                delegatingImageSavedCallback2.dispose();
                InterfaceC41708m<ImageCapture.OutputFileResults> interfaceC41708m = c41716o;
                Result.Companion companion = Result.INSTANCE;
                interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(exception)));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onPostviewBitmapAvailable(Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                Function1<Bitmap, Unit> function3 = function2;
                if (function3 != null) {
                    function3.invoke(bitmap);
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
                DelegatingImageSavedCallback delegatingImageSavedCallback3 = objectRef.element;
                if (delegatingImageSavedCallback3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = delegatingImageSavedCallback3;
                }
                delegatingImageSavedCallback2.dispose();
                c41716o.resumeWith(Result.m103844constructorimpl(outputFileResults));
            }
        });
        c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$2
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                DelegatingImageSavedCallback delegatingImageSavedCallback3 = objectRef.element;
                if (delegatingImageSavedCallback3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = delegatingImageSavedCallback3;
                }
                delegatingImageSavedCallback2.dispose();
            }
        });
        T t11 = objectRef.element;
        if (t11 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
        } else {
            delegatingImageSavedCallback = (DelegatingImageSavedCallback) t11;
        }
        imageCapture.takePicture(outputFileOptions, executorDirectExecutor, delegatingImageSavedCallback);
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }
}
