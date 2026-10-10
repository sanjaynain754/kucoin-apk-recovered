package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraManager;
import android.util.Log;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.AbstractCameraPresenceSource;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Camera2PresenceSource.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Landroidx/camera/camera2/internal/Camera2PresenceSource;", "Landroidx/camera/core/impl/AbstractCameraPresenceSource;", "initialCameraIds", "", "", "cameraManager", "Landroidx/camera/camera2/internal/compat/CameraManagerCompat;", "systemCallbackExecutor", "Ljava/util/concurrent/Executor;", "<init>", "(Ljava/util/List;Landroidx/camera/camera2/internal/compat/CameraManagerCompat;Ljava/util/concurrent/Executor;)V", "systemAvailabilityCallback", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "startMonitoring", "", "stopMonitoring", "fetchData", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/core/CameraIdentifier;", "fetchDataAndForget", "Companion", "camera-camera2_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCamera2PresenceSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Camera2PresenceSource.kt\nandroidx/camera/camera2/internal/Camera2PresenceSource\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,123:1\n11165#2:124\n11500#2,3:125\n*S KotlinDebug\n*F\n+ 1 Camera2PresenceSource.kt\nandroidx/camera/camera2/internal/Camera2PresenceSource\n*L\n93#1:124\n93#1:125,3\n*E\n"})
public final class Camera2PresenceSource extends AbstractCameraPresenceSource {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "Camera2PresenceSrc";

    @NotNull
    private final CameraManagerCompat cameraManager;

    @Nullable
    private CameraManager.AvailabilityCallback systemAvailabilityCallback;

    @NotNull
    private final Executor systemCallbackExecutor;

    /* JADX INFO: compiled from: Camera2PresenceSource.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Landroidx/camera/camera2/internal/Camera2PresenceSource$Companion;", "", "<init>", "()V", "TAG", "", "camera-camera2_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2PresenceSource(@NotNull List<String> initialCameraIds, @NotNull CameraManagerCompat cameraManager, @NotNull Executor systemCallbackExecutor) {
        super(initialCameraIds);
        Intrinsics.checkNotNullParameter(initialCameraIds, "initialCameraIds");
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(systemCallbackExecutor, "systemCallbackExecutor");
        this.cameraManager = cameraManager;
        this.systemCallbackExecutor = systemCallbackExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object fetchData$lambda$3(final Camera2PresenceSource camera2PresenceSource, final CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        camera2PresenceSource.systemCallbackExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.c2
            @Override // java.lang.Runnable
            public final void run() {
                Camera2PresenceSource.fetchData$lambda$3$lambda$2(this.f1253b, completer);
            }
        });
        return "FetchData for CameraAvailability";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchData$lambda$3$lambda$2(Camera2PresenceSource camera2PresenceSource, CallbackToFutureAdapter.Completer completer) {
        try {
            String[] cameraIdList = camera2PresenceSource.cameraManager.getCameraIdList();
            Intrinsics.checkNotNullExpressionValue(cameraIdList, "getCameraIdList(...)");
            ArrayList arrayList = new ArrayList(cameraIdList.length);
            for (String str : cameraIdList) {
                CameraIdentifier.Companion companion = CameraIdentifier.INSTANCE;
                Intrinsics.checkNotNull(str);
                arrayList.add(CameraIdentifier.Companion.create$default(companion, str, null, null, 6, null));
            }
            Log.d(TAG, "[FetchData] Refreshed camera list: " + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
            camera2PresenceSource.updateData(arrayList);
            completer.set(arrayList);
        } catch (CameraAccessExceptionCompat e11) {
            Log.e(TAG, "[FetchData] Failed to get camera list for refresh.", e11);
            CameraUnavailableException cameraUnavailableExceptionCreateFrom = CameraUnavailableExceptionHelper.createFrom(e11);
            Intrinsics.checkNotNullExpressionValue(cameraUnavailableExceptionCreateFrom, "createFrom(...)");
            camera2PresenceSource.updateError(cameraUnavailableExceptionCreateFrom);
            completer.setException(cameraUnavailableExceptionCreateFrom);
        }
    }

    @Override // androidx.camera.core.impl.AbstractCameraPresenceSource, androidx.camera.core.impl.Observable
    @NotNull
    public ListenableFuture<List<CameraIdentifier>> fetchData() {
        ListenableFuture<List<CameraIdentifier>> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.d2
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2PresenceSource.fetchData$lambda$3(this.f1328a, completer);
            }
        });
        Intrinsics.checkNotNullExpressionValue(future, "getFuture(...)");
        return future;
    }

    @Override // androidx.camera.core.impl.AbstractCameraPresenceSource
    public void startMonitoring() {
        if (this.systemAvailabilityCallback != null) {
            Log.w(TAG, "Monitoring already started. Unregistering existing callback.");
            stopMonitoring();
        }
        Log.i(TAG, "Starting system availability monitoring.");
        CameraManager.AvailabilityCallback availabilityCallback = new CameraManager.AvailabilityCallback() { // from class: androidx.camera.camera2.internal.Camera2PresenceSource.startMonitoring.1
            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onCameraAccessPrioritiesChanged() {
                Log.d(Camera2PresenceSource.TAG, "System onCameraAccessPrioritiesChanged.");
                Camera2PresenceSource camera2PresenceSource = Camera2PresenceSource.this;
                camera2PresenceSource.fetchDataAndForget(camera2PresenceSource.fetchData());
            }

            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onCameraAvailable(String cameraId) {
                Intrinsics.checkNotNullParameter(cameraId, "cameraId");
                Log.d(Camera2PresenceSource.TAG, "System onCameraAvailable: " + cameraId);
                Camera2PresenceSource camera2PresenceSource = Camera2PresenceSource.this;
                camera2PresenceSource.fetchDataAndForget(camera2PresenceSource.fetchData());
            }

            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onCameraUnavailable(String cameraId) {
                Intrinsics.checkNotNullParameter(cameraId, "cameraId");
                Log.d(Camera2PresenceSource.TAG, "System onCameraUnavailable: " + cameraId);
                Camera2PresenceSource camera2PresenceSource = Camera2PresenceSource.this;
                camera2PresenceSource.fetchDataAndForget(camera2PresenceSource.fetchData());
            }
        };
        this.systemAvailabilityCallback = availabilityCallback;
        CameraManagerCompat cameraManagerCompat = this.cameraManager;
        Executor executor = this.systemCallbackExecutor;
        Intrinsics.checkNotNull(availabilityCallback);
        cameraManagerCompat.registerAvailabilityCallback(executor, availabilityCallback);
        fetchDataAndForget(fetchData());
    }

    @Override // androidx.camera.core.impl.AbstractCameraPresenceSource
    public void stopMonitoring() {
        Log.i(TAG, "Stopping system availability monitoring.");
        CameraManager.AvailabilityCallback availabilityCallback = this.systemAvailabilityCallback;
        if (availabilityCallback != null) {
            try {
                try {
                    this.cameraManager.unregisterAvailabilityCallback(availabilityCallback);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e11) {
                    Log.w(TAG, "Failed to unregister system availability callback.", e11);
                }
            } finally {
                this.systemAvailabilityCallback = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchDataAndForget(ListenableFuture<?> listenableFuture) {
        Futures.transformAsyncOnCompletion(listenableFuture);
    }
}
