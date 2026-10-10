package androidx.camera.lifecycle;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraPresenceListener;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.CompositionSettings;
import androidx.camera.core.ConcurrentCamera;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.Preview;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LifecycleOwner;
import androidx.tracing.Trace;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: LifecycleCameraProviderImpl.kt */
/* JADX INFO: loaded from: classes23.dex */
@OptIn(markerClass = {ExperimentalCameraProviderConfiguration.class})
@Metadata(m90083d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010)\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020\"0!2\b\b\u0002\u0010*\u001a\u00020\u0013H\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010\u0015J\u0017\u0010.\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b.\u0010/J'\u00102\u001a\u00020&2\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001100\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b2\u00103J\u0017\u00102\u001a\u00020&2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b2\u00104J\u000f\u00105\u001a\u00020&H\u0017¢\u0006\u0004\b5\u0010\u0003J\u0017\u00106\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00107J7\u00108\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001100\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b8\u00109J'\u00108\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:H\u0017¢\u0006\u0004\b8\u0010<J'\u00108\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b8\u0010=J\u001f\u00108\u001a\u00020A2\u000e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0>H\u0017¢\u0006\u0004\b8\u0010BJ\u0017\u0010C\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010I\u001a\u00020&2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0017¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020&2\u0006\u0010H\u001a\u00020GH\u0017¢\u0006\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR*\u0010Q\u001a\u0004\u0018\u00010P8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bQ\u0010R\u0012\u0004\bW\u0010\u0003\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bX\u0010YR$\u0010[\u001a\u0010\u0012\f\u0012\n Z*\u0004\u0018\u00010\"0\"0!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR*\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010b\u0012\u0004\bg\u0010\u0003\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR \u0010k\u001a\u000e\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020j0h8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bk\u0010lR$\u0010p\u001a\u0012\u0012\u0004\u0012\u00020n0mj\b\u0012\u0004\u0012\u00020n`o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\"\u0010s\u001a\u00020r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010y\u001a\u00020r2\u0006\u0010y\u001a\u00020r8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bz\u0010v\"\u0004\b{\u0010xR2\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180>2\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00180>8B@BX\u0082\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180>8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010~R\"\u0010\u0085\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180>0>8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010~R\u0017\u0010\u0086\u0001\u001a\u00020\u00138WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u0088\u0001"}, m90084d2 = {"Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;", "Landroidx/camera/lifecycle/LifecycleCameraProvider;", "<init>", "()V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/camera/core/CameraSelector;", "primaryCameraSelector", "secondaryCameraSelector", "Landroidx/camera/core/CompositionSettings;", "primaryCompositionSettings", "secondaryCompositionSettings", "Landroidx/camera/core/SessionConfig;", "sessionConfig", "Landroidx/camera/core/Camera;", "bindToLifecycleInternal", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/CompositionSettings;Landroidx/camera/core/CompositionSettings;Landroidx/camera/core/SessionConfig;)Landroidx/camera/core/Camera;", "Landroidx/camera/core/UseCase;", "useCase", "", "isVideoCapture", "(Landroidx/camera/core/UseCase;)Z", "isPreview", "cameraSelector", "Landroidx/camera/core/CameraInfo;", "cameraInfo", "Landroidx/camera/core/impl/CameraConfig;", "getCameraConfig", "(Landroidx/camera/core/CameraSelector;Landroidx/camera/core/CameraInfo;)Landroidx/camera/core/impl/CameraConfig;", "Landroid/content/Context;", "context", "Landroidx/camera/core/CameraXConfig;", "cameraXConfig", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "initAsync$camera_lifecycle_release", "(Landroid/content/Context;Landroidx/camera/core/CameraXConfig;)Lcom/google/common/util/concurrent/ListenableFuture;", "initAsync", "", "configure$camera_lifecycle_release", "(Landroidx/camera/core/CameraXConfig;)V", "configure", "clearConfigProvider", "shutdownAsync$camera_lifecycle_release", "(Z)Lcom/google/common/util/concurrent/ListenableFuture;", "shutdownAsync", "isBound", "(Landroidx/camera/core/SessionConfig;)Z", "", "useCases", "unbind", "([Landroidx/camera/core/UseCase;)V", "(Landroidx/camera/core/SessionConfig;)V", "unbindAll", "hasCamera", "(Landroidx/camera/core/CameraSelector;)Z", "bindToLifecycle", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;[Landroidx/camera/core/UseCase;)Landroidx/camera/core/Camera;", "Landroidx/camera/core/UseCaseGroup;", "useCaseGroup", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/UseCaseGroup;)Landroidx/camera/core/Camera;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/SessionConfig;)Landroidx/camera/core/Camera;", "", "Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;", "singleCameraConfigs", "Landroidx/camera/core/ConcurrentCamera;", "(Ljava/util/List;)Landroidx/camera/core/ConcurrentCamera;", "getCameraInfo", "(Landroidx/camera/core/CameraSelector;)Landroidx/camera/core/CameraInfo;", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/camera/core/CameraPresenceListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addCameraPresenceListener", "(Ljava/util/concurrent/Executor;Landroidx/camera/core/CameraPresenceListener;)V", "removeCameraPresenceListener", "(Landroidx/camera/core/CameraPresenceListener;)V", "", "lock", "Ljava/lang/Object;", "Landroidx/camera/core/CameraXConfig$Provider;", "cameraXConfigProvider", "Landroidx/camera/core/CameraXConfig$Provider;", "getCameraXConfigProvider$camera_lifecycle_release", "()Landroidx/camera/core/CameraXConfig$Provider;", "setCameraXConfigProvider$camera_lifecycle_release", "(Landroidx/camera/core/CameraXConfig$Provider;)V", "getCameraXConfigProvider$camera_lifecycle_release$annotations", "cameraXInitializeFuture", "Lcom/google/common/util/concurrent/ListenableFuture;", "kotlin.jvm.PlatformType", "cameraXShutdownFuture", "Landroidx/camera/lifecycle/LifecycleCameraRepository;", "lifecycleCameraRepository", "Landroidx/camera/lifecycle/LifecycleCameraRepository;", "Landroidx/camera/core/CameraX;", "cameraX", "Landroidx/camera/core/CameraX;", "Landroid/content/Context;", "getContext$camera_lifecycle_release", "()Landroid/content/Context;", "setContext$camera_lifecycle_release", "(Landroid/content/Context;)V", "getContext$camera_lifecycle_release$annotations", "", "Landroidx/camera/core/CameraIdentifier;", "Landroidx/camera/core/impl/AdapterCameraInfo;", "cameraInfoMap", "Ljava/util/Map;", "Ljava/util/HashSet;", "Landroidx/camera/lifecycle/LifecycleCameraRepository$Key;", "Lkotlin/collections/HashSet;", "lifecycleCameraKeys", "Ljava/util/HashSet;", "", "configImplType", "I", "getConfigImplType", "()I", "setConfigImplType", "(I)V", "cameraOperatingMode", "getCameraOperatingMode", "setCameraOperatingMode", "cameraInfos", "getActiveConcurrentCameraInfos", "()Ljava/util/List;", "setActiveConcurrentCameraInfos", "(Ljava/util/List;)V", "activeConcurrentCameraInfos", "getAvailableCameraInfos", "availableCameraInfos", "getAvailableConcurrentCameraInfos", "availableConcurrentCameraInfos", "isConcurrentCameraModeOn", "()Z", "camera-lifecycle_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLifecycleCameraProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleCameraProviderImpl.kt\nandroidx/camera/lifecycle/LifecycleCameraProviderImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Trace.kt\nandroidx/tracing/TraceKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1#2:766\n27#3,5:767\n27#3,5:772\n27#3,5:777\n27#3,5:782\n27#3,5:787\n27#3,5:792\n27#3,5:797\n27#3,5:802\n27#3,5:807\n27#3,5:812\n27#3,5:817\n27#3,3:822\n31#3:827\n27#3,5:828\n1863#4,2:825\n*S KotlinDebug\n*F\n+ 1 LifecycleCameraProviderImpl.kt\nandroidx/camera/lifecycle/LifecycleCameraProviderImpl\n*L\n139#1:767,5\n196#1:772,5\n213#1:777,5\n227#1:782,5\n235#1:787,5\n251#1:792,5\n274#1:797,5\n297#1:802,5\n317#1:807,5\n463#1:812,5\n474#1:817,5\n573#1:822,3\n573#1:827\n664#1:828,5\n606#1:825,2\n*E\n"})
public final class LifecycleCameraProviderImpl implements LifecycleCameraProvider {

    @GuardedBy("mLock")
    @NotNull
    private final Map<CameraIdentifier, AdapterCameraInfo> cameraInfoMap;

    @Nullable
    private CameraX cameraX;

    @GuardedBy("mLock")
    @Nullable
    private CameraXConfig.Provider cameraXConfigProvider;

    @GuardedBy("mLock")
    @Nullable
    private ListenableFuture<Void> cameraXInitializeFuture;

    @GuardedBy("mLock")
    @NotNull
    private ListenableFuture<Void> cameraXShutdownFuture;
    private int configImplType;

    @Nullable
    private Context context;

    @NotNull
    private final HashSet<LifecycleCameraRepository.Key> lifecycleCameraKeys;

    @NotNull
    private final LifecycleCameraRepository lifecycleCameraRepository;

    @NotNull
    private final Object lock = new Object();

    public static /* synthetic */ ListenableFuture shutdownAsync$camera_lifecycle_release$default(LifecycleCameraProviderImpl lifecycleCameraProviderImpl, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return lifecycleCameraProviderImpl.shutdownAsync$camera_lifecycle_release(z11);
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @MainThread
    @NotNull
    public Camera bindToLifecycle(@NotNull LifecycleOwner lifecycleOwner, @NotNull CameraSelector cameraSelector, @NotNull UseCase... useCases) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Trace.beginSection("CX:bindToLifecycle");
        try {
            if (getCameraOperatingMode() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            setCameraOperatingMode(1);
            Camera cameraBindToLifecycleInternal$default = bindToLifecycleInternal$default(this, lifecycleOwner, cameraSelector, null, null, null, new LegacySessionConfig(ArraysKt.filterNotNull(useCases), null, null, 6, null), 28, null);
            Trace.endSection();
            return cameraBindToLifecycleInternal$default;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public boolean isBound(@NotNull UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        for (LifecycleCamera lifecycleCamera : this.lifecycleCameraRepository.getLifecycleCameras()) {
            Intrinsics.checkNotNullExpressionValue(lifecycleCamera, "next(...)");
            if (lifecycleCamera.isBound(useCase)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @MainThread
    public void unbind(@NotNull UseCase... useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Trace.beginSection("CX:unbind");
        try {
            Threads.checkMainThread();
            if (getCameraOperatingMode() == 2) {
                throw new UnsupportedOperationException("Unbind UseCase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            this.lifecycleCameraRepository.unbind(new LegacySessionConfig(ArraysKt.filterNotNull(useCases), null, null, 6, null), this.lifecycleCameraKeys);
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Camera bindToLifecycleInternal(LifecycleOwner lifecycleOwner, CameraSelector primaryCameraSelector, CameraSelector secondaryCameraSelector, CompositionSettings primaryCompositionSettings, CompositionSettings secondaryCompositionSettings, SessionConfig sessionConfig) {
        CameraInternal cameraInternal;
        AdapterCameraInfo adapterCameraInfo;
        Trace.beginSection("CX:bindToLifecycle-internal");
        try {
            Threads.checkMainThread();
            CameraX cameraX = this.cameraX;
            Intrinsics.checkNotNull(cameraX);
            CameraInternal cameraInternalSelect = primaryCameraSelector.select(cameraX.getCameraRepository().getCameras());
            Intrinsics.checkNotNullExpressionValue(cameraInternalSelect, "select(...)");
            cameraInternalSelect.setPrimary(true);
            CameraInfo cameraInfo = getCameraInfo(primaryCameraSelector);
            Intrinsics.checkNotNull(cameraInfo, "null cannot be cast to non-null type androidx.camera.core.impl.AdapterCameraInfo");
            AdapterCameraInfo adapterCameraInfo2 = (AdapterCameraInfo) cameraInfo;
            if (secondaryCameraSelector != null) {
                CameraX cameraX2 = this.cameraX;
                Intrinsics.checkNotNull(cameraX2);
                CameraInternal cameraInternalSelect2 = secondaryCameraSelector.select(cameraX2.getCameraRepository().getCameras());
                cameraInternalSelect2.setPrimary(false);
                CameraInfo cameraInfo2 = getCameraInfo(secondaryCameraSelector);
                Intrinsics.checkNotNull(cameraInfo2, "null cannot be cast to non-null type androidx.camera.core.impl.AdapterCameraInfo");
                cameraInternal = cameraInternalSelect2;
                adapterCameraInfo = (AdapterCameraInfo) cameraInfo2;
            } else {
                cameraInternal = null;
                adapterCameraInfo = null;
            }
            CameraIdentifier cameraIdentifierFromAdapterInfos = CameraIdentifier.INSTANCE.fromAdapterInfos(adapterCameraInfo2, adapterCameraInfo);
            LifecycleCamera lifecycleCamera = this.lifecycleCameraRepository.getLifecycleCamera(lifecycleOwner, cameraIdentifierFromAdapterInfos);
            Collection<LifecycleCamera> lifecycleCameras = this.lifecycleCameraRepository.getLifecycleCameras();
            for (UseCase useCase : sessionConfig.getUseCases()) {
                for (LifecycleCamera lifecycleCamera2 : lifecycleCameras) {
                    Intrinsics.checkNotNullExpressionValue(lifecycleCamera2, "next(...)");
                    LifecycleCamera lifecycleCamera3 = lifecycleCamera2;
                    if (lifecycleCamera3.isBound(useCase) && !Intrinsics.areEqual(lifecycleCamera3.getLifecycleOwner(), lifecycleOwner)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{useCase}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        throw new IllegalStateException(str);
                    }
                }
            }
            if (lifecycleCamera == null) {
                LifecycleCameraRepository lifecycleCameraRepository = this.lifecycleCameraRepository;
                CameraX cameraX3 = this.cameraX;
                Intrinsics.checkNotNull(cameraX3);
                lifecycleCamera = lifecycleCameraRepository.createLifecycleCamera(lifecycleOwner, cameraX3.getCameraUseCaseAdapterProvider().provide(cameraInternalSelect, cameraInternal, adapterCameraInfo2, adapterCameraInfo, primaryCompositionSettings, secondaryCompositionSettings));
            }
            if (sessionConfig.getUseCases().isEmpty()) {
                Intrinsics.checkNotNull(lifecycleCamera);
            } else {
                LifecycleCameraRepository lifecycleCameraRepository2 = this.lifecycleCameraRepository;
                Intrinsics.checkNotNull(lifecycleCamera);
                CameraX cameraX4 = this.cameraX;
                Intrinsics.checkNotNull(cameraX4);
                lifecycleCameraRepository2.bindToLifecycleCamera(lifecycleCamera, sessionConfig, cameraX4.getCameraFactory().getCameraCoordinator());
                this.lifecycleCameraKeys.add(LifecycleCameraRepository.Key.create(lifecycleOwner, cameraIdentifierFromAdapterInfos));
            }
            Trace.endSection();
            return lifecycleCamera;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static /* synthetic */ Camera bindToLifecycleInternal$default(LifecycleCameraProviderImpl lifecycleCameraProviderImpl, LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, CameraSelector cameraSelector2, CompositionSettings compositionSettings, CompositionSettings compositionSettings2, SessionConfig sessionConfig, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            cameraSelector2 = null;
        }
        CameraSelector cameraSelector3 = cameraSelector2;
        if ((i11 & 8) != 0) {
            compositionSettings = CompositionSettings.DEFAULT;
        }
        CompositionSettings compositionSettings3 = compositionSettings;
        if ((i11 & 16) != 0) {
            compositionSettings2 = CompositionSettings.DEFAULT;
        }
        return lifecycleCameraProviderImpl.bindToLifecycleInternal(lifecycleOwner, cameraSelector, cameraSelector3, compositionSettings3, compositionSettings2, sessionConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CameraInfo> getActiveConcurrentCameraInfos() {
        CameraX cameraX = this.cameraX;
        if (cameraX == null) {
            return new ArrayList();
        }
        Intrinsics.checkNotNull(cameraX);
        List<CameraInfo> activeConcurrentCameraInfos = cameraX.getCameraFactory().getCameraCoordinator().getActiveConcurrentCameraInfos();
        Intrinsics.checkNotNullExpressionValue(activeConcurrentCameraInfos, "getActiveConcurrentCameraInfos(...)");
        return activeConcurrentCameraInfos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCameraOperatingMode() {
        CameraX cameraX = this.cameraX;
        if (cameraX == null) {
            return 0;
        }
        Intrinsics.checkNotNull(cameraX);
        return cameraX.getCameraFactory().getCameraCoordinator().getCameraOperatingMode();
    }

    public static /* synthetic */ ListenableFuture initAsync$camera_lifecycle_release$default(LifecycleCameraProviderImpl lifecycleCameraProviderImpl, Context context, CameraXConfig cameraXConfig, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            cameraXConfig = null;
        }
        return lifecycleCameraProviderImpl.initAsync$camera_lifecycle_release(context, cameraXConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPreview(UseCase useCase) {
        return useCase instanceof Preview;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setActiveConcurrentCameraInfos(List<? extends CameraInfo> list) {
        CameraX cameraX = this.cameraX;
        if (cameraX == null) {
            return;
        }
        Intrinsics.checkNotNull(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setActiveConcurrentCameraInfos(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraOperatingMode(int i11) {
        CameraX cameraX = this.cameraX;
        if (cameraX == null) {
            return;
        }
        Intrinsics.checkNotNull(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setCameraOperatingMode(i11);
    }

    @Override // androidx.camera.core.CameraProvider
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void addCameraPresenceListener(@NotNull Executor executor, @NotNull CameraPresenceListener listener) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        CameraX cameraX = this.cameraX;
        Intrinsics.checkNotNull(cameraX);
        cameraX.getCameraAvailabilityProvider().addCameraPresenceListener(listener, executor);
    }

    public final void configure$camera_lifecycle_release(@NotNull final CameraXConfig cameraXConfig) {
        Intrinsics.checkNotNullParameter(cameraXConfig, "cameraXConfig");
        Trace.beginSection("CX:configureInstanceInternal");
        try {
            synchronized (this.lock) {
                Preconditions.checkNotNull(cameraXConfig);
                Preconditions.checkState(getCameraXConfigProvider() == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                setCameraXConfigProvider$camera_lifecycle_release(new CameraXConfig.Provider() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$configure$1$1$1
                    @Override // androidx.camera.core.CameraXConfig.Provider
                    public final CameraXConfig getCameraXConfig() {
                        return cameraXConfig;
                    }
                });
                Unit unit = Unit.INSTANCE;
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.camera.core.CameraProvider
    @NotNull
    public List<CameraInfo> getAvailableCameraInfos() {
        Trace.beginSection("CX:getAvailableCameraInfos");
        try {
            ArrayList arrayList = new ArrayList();
            CameraX cameraX = this.cameraX;
            Intrinsics.checkNotNull(cameraX);
            LinkedHashSet<CameraInternal> cameras = cameraX.getCameraRepository().getCameras();
            Intrinsics.checkNotNullExpressionValue(cameras, "getCameras(...)");
            Iterator<CameraInternal> it = cameras.iterator();
            while (it.hasNext()) {
                CameraInfo cameraInfo = it.next().getCameraInfo();
                Intrinsics.checkNotNullExpressionValue(cameraInfo, "getCameraInfo(...)");
                arrayList.add(cameraInfo);
            }
            Trace.endSection();
            return arrayList;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.camera.core.CameraProvider
    @NotNull
    public List<List<CameraInfo>> getAvailableConcurrentCameraInfos() {
        Trace.beginSection("CX:getAvailableConcurrentCameraInfos");
        try {
            Objects.requireNonNull(this.cameraX);
            CameraX cameraX = this.cameraX;
            Intrinsics.checkNotNull(cameraX);
            Objects.requireNonNull(cameraX.getCameraFactory().getCameraCoordinator());
            CameraX cameraX2 = this.cameraX;
            Intrinsics.checkNotNull(cameraX2);
            List<List<CameraSelector>> concurrentCameraSelectors = cameraX2.getCameraFactory().getCameraCoordinator().getConcurrentCameraSelectors();
            Intrinsics.checkNotNullExpressionValue(concurrentCameraSelectors, "getConcurrentCameraSelectors(...)");
            ArrayList arrayList = new ArrayList();
            for (List<CameraSelector> list : concurrentCameraSelectors) {
                ArrayList arrayList2 = new ArrayList();
                for (CameraSelector cameraSelector : list) {
                    try {
                        Intrinsics.checkNotNull(cameraSelector);
                        arrayList2.add(getCameraInfo(cameraSelector));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                arrayList.add(arrayList2);
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    @NotNull
    public CameraInfo getCameraInfo(@NotNull CameraSelector cameraSelector) {
        Object adapterCameraInfo;
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Trace.beginSection("CX:getCameraInfo");
        try {
            CameraX cameraX = this.cameraX;
            Intrinsics.checkNotNull(cameraX);
            CameraInfoInternal cameraInfoInternal = cameraSelector.select(cameraX.getCameraRepository().getCameras()).getCameraInfoInternal();
            Intrinsics.checkNotNullExpressionValue(cameraInfoInternal, "getCameraInfoInternal(...)");
            CameraConfig cameraConfig = getCameraConfig(cameraSelector, cameraInfoInternal);
            CameraIdentifier.Companion companion = CameraIdentifier.INSTANCE;
            String cameraId = cameraInfoInternal.getCameraId();
            Intrinsics.checkNotNullExpressionValue(cameraId, "getCameraId(...)");
            CameraIdentifier cameraIdentifierCreate = companion.create(cameraId, null, cameraConfig.getCompatibilityId());
            synchronized (this.lock) {
                try {
                    adapterCameraInfo = this.cameraInfoMap.get(cameraIdentifierCreate);
                    if (adapterCameraInfo == null) {
                        adapterCameraInfo = new AdapterCameraInfo(cameraInfoInternal, cameraConfig);
                        this.cameraInfoMap.put(cameraIdentifierCreate, adapterCameraInfo);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            AdapterCameraInfo adapterCameraInfo2 = (AdapterCameraInfo) adapterCameraInfo;
            Trace.endSection();
            return adapterCameraInfo2;
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getCameraXConfigProvider$camera_lifecycle_release, reason: from getter */
    public final CameraXConfig.Provider getCameraXConfigProvider() {
        return this.cameraXConfigProvider;
    }

    @Override // androidx.camera.core.CameraProvider
    public int getConfigImplType() {
        return this.configImplType;
    }

    @Nullable
    /* JADX INFO: renamed from: getContext$camera_lifecycle_release, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.camera.core.CameraProvider
    public boolean hasCamera(@NotNull CameraSelector cameraSelector) throws CameraInfoUnavailableException {
        boolean z11;
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Trace.beginSection("CX:hasCamera");
        try {
            CameraX cameraX = this.cameraX;
            Intrinsics.checkNotNull(cameraX);
            cameraSelector.select(cameraX.getCameraRepository().getCameras());
            z11 = true;
        } catch (IllegalArgumentException unused) {
            z11 = false;
        } finally {
            Trace.endSection();
        }
        return z11;
    }

    @NotNull
    public final ListenableFuture<Void> initAsync$camera_lifecycle_release(@NotNull final Context context, @Nullable CameraXConfig cameraXConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this.lock) {
            ListenableFuture<Void> listenableFuture = this.cameraXInitializeFuture;
            if (listenableFuture != null) {
                Intrinsics.checkNotNull(listenableFuture, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<java.lang.Void>");
                return listenableFuture;
            }
            if (cameraXConfig != null) {
                configure$camera_lifecycle_release(cameraXConfig);
            }
            final CameraX cameraX = new CameraX(context, this.cameraXConfigProvider);
            setConfigImplType(cameraX.getConfigImplType());
            FutureChain futureChainFrom = FutureChain.from(this.cameraXShutdownFuture);
            final Function1 function1 = new Function1() { // from class: androidx.camera.lifecycle.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LifecycleCameraProviderImpl.initAsync$lambda$3$lambda$1(cameraX, (Void) obj);
                }
            };
            FutureChain futureChainTransformAsync = futureChainFrom.transformAsync(new AsyncFunction() { // from class: androidx.camera.lifecycle.f
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return LifecycleCameraProviderImpl.initAsync$lambda$3$lambda$2(function1, obj);
                }
            }, CameraXExecutors.directExecutor());
            Intrinsics.checkNotNullExpressionValue(futureChainTransformAsync, "transformAsync(...)");
            this.cameraXInitializeFuture = futureChainTransformAsync;
            Futures.addCallback(futureChainTransformAsync, new FutureCallback<Void>() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$initAsync$1$2
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(Void r11) {
                    this.this$0.cameraX = cameraX;
                    this.this$0.setContext$camera_lifecycle_release(ContextUtil.getApplicationContext(context));
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(Throwable t11) {
                    Intrinsics.checkNotNullParameter(t11, "t");
                    this.this$0.shutdownAsync$camera_lifecycle_release(false);
                }
            }, CameraXExecutors.directExecutor());
            ListenableFuture<Void> listenableFutureNonCancellationPropagating = Futures.nonCancellationPropagating(futureChainTransformAsync);
            Intrinsics.checkNotNullExpressionValue(listenableFutureNonCancellationPropagating, "nonCancellationPropagating(...)");
            return listenableFutureNonCancellationPropagating;
        }
    }

    public final void setCameraXConfigProvider$camera_lifecycle_release(@Nullable CameraXConfig.Provider provider) {
        this.cameraXConfigProvider = provider;
    }

    public void setConfigImplType(int i11) {
        this.configImplType = i11;
    }

    public final void setContext$camera_lifecycle_release(@Nullable Context context) {
        this.context = context;
    }

    @NotNull
    public final ListenableFuture<Void> shutdownAsync$camera_lifecycle_release(boolean clearConfigProvider) {
        ListenableFuture<Void> listenableFutureImmediateFuture;
        Threads.runOnMainSync(new Runnable() { // from class: androidx.camera.lifecycle.d
            @Override // java.lang.Runnable
            public final void run() {
                LifecycleCameraProviderImpl.shutdownAsync$lambda$6(this.f1925b);
            }
        });
        CameraX cameraX = this.cameraX;
        if (cameraX != null) {
            Intrinsics.checkNotNull(cameraX);
            listenableFutureImmediateFuture = cameraX.shutdown();
        } else {
            listenableFutureImmediateFuture = Futures.immediateFuture(null);
        }
        Intrinsics.checkNotNull(listenableFutureImmediateFuture);
        synchronized (this.lock) {
            if (clearConfigProvider) {
                try {
                    this.cameraXConfigProvider = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.cameraXInitializeFuture = null;
            this.cameraXShutdownFuture = listenableFutureImmediateFuture;
            this.cameraInfoMap.clear();
            this.lifecycleCameraKeys.clear();
            Unit unit = Unit.INSTANCE;
        }
        this.cameraX = null;
        this.context = null;
        return listenableFutureImmediateFuture;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @MainThread
    public void unbindAll() {
        Trace.beginSection("CX:unbindAll");
        try {
            Threads.checkMainThread();
            setCameraOperatingMode(0);
            this.lifecycleCameraRepository.unbindAll(this.lifecycleCameraKeys);
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    public LifecycleCameraProviderImpl() {
        ListenableFuture<Void> listenableFutureImmediateFuture = Futures.immediateFuture(null);
        Intrinsics.checkNotNullExpressionValue(listenableFutureImmediateFuture, "immediateFuture(...)");
        this.cameraXShutdownFuture = listenableFutureImmediateFuture;
        LifecycleCameraRepository lifecycleCameraRepository = LifecycleCameraRepository.getInstance();
        Intrinsics.checkNotNullExpressionValue(lifecycleCameraRepository, "getInstance(...)");
        this.lifecycleCameraRepository = lifecycleCameraRepository;
        this.cameraInfoMap = new HashMap();
        this.lifecycleCameraKeys = new HashSet<>();
        this.configImplType = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraConfig getCameraConfig(CameraSelector cameraSelector, CameraInfo cameraInfo) {
        Iterator<CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        CameraConfig cameraConfig = null;
        while (it.hasNext()) {
            CameraFilter next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            CameraFilter cameraFilter = next;
            if (!Intrinsics.areEqual(cameraFilter.getIdentifier(), CameraFilter.DEFAULT_ID)) {
                CameraConfigProvider configProvider = ExtendedCameraConfigProviderStore.getConfigProvider(cameraFilter.getIdentifier());
                Context context = this.context;
                Intrinsics.checkNotNull(context);
                CameraConfig config = configProvider.getConfig(cameraInfo, context);
                if (config == null) {
                    continue;
                } else if (cameraConfig == null) {
                    cameraConfig = config;
                } else {
                    throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                }
            }
        }
        if (cameraConfig == null) {
            return CameraConfigs.defaultConfig();
        }
        return cameraConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListenableFuture initAsync$lambda$3$lambda$1(CameraX cameraX, Void r11) {
        return cameraX.getInitializeFuture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListenableFuture initAsync$lambda$3$lambda$2(Function1 function1, Object obj) {
        return (ListenableFuture) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVideoCapture(UseCase useCase) {
        if (useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE) && useCase.getCurrentConfig().getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shutdownAsync$lambda$6(LifecycleCameraProviderImpl lifecycleCameraProviderImpl) {
        lifecycleCameraProviderImpl.unbindAll();
        lifecycleCameraProviderImpl.lifecycleCameraRepository.removeLifecycleCameras(lifecycleCameraProviderImpl.lifecycleCameraKeys);
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public boolean isBound(@NotNull SessionConfig sessionConfig) {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        for (LifecycleCamera lifecycleCamera : this.lifecycleCameraRepository.getLifecycleCameras()) {
            Intrinsics.checkNotNullExpressionValue(lifecycleCamera, "next(...)");
            if (lifecycleCamera.isBound(sessionConfig)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraProvider
    @MainThread
    public boolean isConcurrentCameraModeOn() {
        if (getCameraOperatingMode() == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.CameraProvider
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void removeCameraPresenceListener(@NotNull CameraPresenceListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CameraX cameraX = this.cameraX;
        Intrinsics.checkNotNull(cameraX);
        cameraX.getCameraAvailabilityProvider().removeCameraPresenceListener(listener);
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @MainThread
    @NotNull
    public Camera bindToLifecycle(@NotNull LifecycleOwner lifecycleOwner, @NotNull CameraSelector cameraSelector, @NotNull UseCaseGroup useCaseGroup) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCaseGroup, "useCaseGroup");
        Trace.beginSection("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (getCameraOperatingMode() != 2) {
                setCameraOperatingMode(1);
                Camera cameraBindToLifecycleInternal$default = bindToLifecycleInternal$default(this, lifecycleOwner, cameraSelector, null, null, null, new LegacySessionConfig(useCaseGroup), 28, null);
                Trace.endSection();
                return cameraBindToLifecycleInternal$default;
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @MainThread
    public void unbind(@NotNull SessionConfig sessionConfig) {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        Trace.beginSection("CX:unbind-sessionConfig");
        try {
            Threads.checkMainThread();
            if (getCameraOperatingMode() != 2) {
                this.lifecycleCameraRepository.unbind(sessionConfig, this.lifecycleCameraKeys);
                Unit unit = Unit.INSTANCE;
                Trace.endSection();
                return;
            }
            throw new UnsupportedOperationException("Unbind SessionConfig is not supported in concurrent camera mode call unbindAll() first.");
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getCameraXConfigProvider$camera_lifecycle_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getContext$camera_lifecycle_release$annotations() {
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @MainThread
    @NotNull
    public Camera bindToLifecycle(@NotNull LifecycleOwner lifecycleOwner, @NotNull CameraSelector cameraSelector, @NotNull SessionConfig sessionConfig) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        Trace.beginSection("CX:bindToLifecycle-SessionConfig");
        try {
            if (getCameraOperatingMode() != 2) {
                setCameraOperatingMode(1);
                Camera cameraBindToLifecycleInternal$default = bindToLifecycleInternal$default(this, lifecycleOwner, cameraSelector, null, null, null, sessionConfig, 28, null);
                Trace.endSection();
                return cameraBindToLifecycleInternal$default;
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01e1 A[Catch: all -> 0x00f8, TryCatch #1 {all -> 0x00f8, blocks: (B:3:0x000f, B:5:0x0016, B:7:0x001c, B:10:0x0051, B:12:0x0057, B:14:0x0065, B:16:0x007b, B:18:0x0091, B:19:0x00bd, B:21:0x00c3, B:22:0x00d8, B:24:0x00de, B:26:0x00f4, B:29:0x00fb, B:30:0x010c, B:67:0x0268, B:31:0x0125, B:32:0x012c, B:33:0x012d, B:34:0x0132, B:35:0x0133, B:37:0x0146, B:39:0x014c, B:40:0x0151, B:41:0x0167, B:43:0x0177, B:46:0x0182, B:47:0x0189, B:48:0x018a, B:51:0x01a5, B:53:0x01b3, B:55:0x01d8, B:61:0x01f0, B:66:0x0265, B:57:0x01e1, B:59:0x01e7, B:62:0x0229, B:63:0x022d, B:65:0x0233, B:70:0x0271, B:71:0x0278, B:72:0x0279, B:73:0x027e, B:74:0x027f, B:75:0x0286, B:76:0x0287, B:77:0x028e, B:78:0x028f, B:79:0x0296), top: B:84:0x000f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01e7 A[Catch: all -> 0x00f8, TryCatch #1 {all -> 0x00f8, blocks: (B:3:0x000f, B:5:0x0016, B:7:0x001c, B:10:0x0051, B:12:0x0057, B:14:0x0065, B:16:0x007b, B:18:0x0091, B:19:0x00bd, B:21:0x00c3, B:22:0x00d8, B:24:0x00de, B:26:0x00f4, B:29:0x00fb, B:30:0x010c, B:67:0x0268, B:31:0x0125, B:32:0x012c, B:33:0x012d, B:34:0x0132, B:35:0x0133, B:37:0x0146, B:39:0x014c, B:40:0x0151, B:41:0x0167, B:43:0x0177, B:46:0x0182, B:47:0x0189, B:48:0x018a, B:51:0x01a5, B:53:0x01b3, B:55:0x01d8, B:61:0x01f0, B:66:0x0265, B:57:0x01e1, B:59:0x01e7, B:62:0x0229, B:63:0x022d, B:65:0x0233, B:70:0x0271, B:71:0x0278, B:72:0x0279, B:73:0x027e, B:74:0x027f, B:75:0x0286, B:76:0x0287, B:77:0x028e, B:78:0x028f, B:79:0x0296), top: B:84:0x000f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0233 A[Catch: all -> 0x00f8, LOOP:2: B:63:0x022d->B:65:0x0233, LOOP_END, TryCatch #1 {all -> 0x00f8, blocks: (B:3:0x000f, B:5:0x0016, B:7:0x001c, B:10:0x0051, B:12:0x0057, B:14:0x0065, B:16:0x007b, B:18:0x0091, B:19:0x00bd, B:21:0x00c3, B:22:0x00d8, B:24:0x00de, B:26:0x00f4, B:29:0x00fb, B:30:0x010c, B:67:0x0268, B:31:0x0125, B:32:0x012c, B:33:0x012d, B:34:0x0132, B:35:0x0133, B:37:0x0146, B:39:0x014c, B:40:0x0151, B:41:0x0167, B:43:0x0177, B:46:0x0182, B:47:0x0189, B:48:0x018a, B:51:0x01a5, B:53:0x01b3, B:55:0x01d8, B:61:0x01f0, B:66:0x0265, B:57:0x01e1, B:59:0x01e7, B:62:0x0229, B:63:0x022d, B:65:0x0233, B:70:0x0271, B:71:0x0278, B:72:0x0279, B:73:0x027e, B:74:0x027f, B:75:0x0286, B:76:0x0287, B:77:0x028e, B:78:0x028f, B:79:0x0296), top: B:84:0x000f, inners: #0 }] */
    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @MainThread
    @NotNull
    public ConcurrentCamera bindToLifecycle(@NotNull List<ConcurrentCamera.SingleCameraConfig> singleCameraConfigs) {
        Intrinsics.checkNotNullParameter(singleCameraConfigs, "singleCameraConfigs");
        Trace.beginSection("CX:bindToLifecycle-Concurrent");
        try {
            if (singleCameraConfigs.size() >= 2) {
                if (singleCameraConfigs.size() <= 2) {
                    ConcurrentCamera.SingleCameraConfig singleCameraConfig = singleCameraConfigs.get(0);
                    Intrinsics.checkNotNull(singleCameraConfig);
                    ConcurrentCamera.SingleCameraConfig singleCameraConfig2 = singleCameraConfig;
                    ConcurrentCamera.SingleCameraConfig singleCameraConfig3 = singleCameraConfigs.get(1);
                    Intrinsics.checkNotNull(singleCameraConfig3);
                    ConcurrentCamera.SingleCameraConfig singleCameraConfig4 = singleCameraConfig3;
                    ArrayList arrayList = new ArrayList();
                    if (Intrinsics.areEqual(singleCameraConfig2.getCameraSelector().getLensFacing(), singleCameraConfig4.getCameraSelector().getLensFacing())) {
                        if (getCameraOperatingMode() != 2) {
                            if (Intrinsics.areEqual(singleCameraConfig2.getLifecycleOwner(), singleCameraConfig4.getLifecycleOwner()) && Intrinsics.areEqual(singleCameraConfig2.getUseCaseGroup().getViewPort(), singleCameraConfig4.getUseCaseGroup().getViewPort()) && Intrinsics.areEqual(singleCameraConfig2.getUseCaseGroup().getEffects(), singleCameraConfig4.getUseCaseGroup().getEffects())) {
                                LifecycleOwner lifecycleOwner = singleCameraConfig2.getLifecycleOwner();
                                Intrinsics.checkNotNullExpressionValue(lifecycleOwner, "getLifecycleOwner(...)");
                                CameraSelector cameraSelector = singleCameraConfig2.getCameraSelector();
                                Intrinsics.checkNotNullExpressionValue(cameraSelector, "getCameraSelector(...)");
                                ViewPort viewPort = singleCameraConfig2.getUseCaseGroup().getViewPort();
                                List<CameraEffect> effects = singleCameraConfig2.getUseCaseGroup().getEffects();
                                Intrinsics.checkNotNullExpressionValue(effects, "getEffects(...)");
                                ArrayList arrayList2 = new ArrayList();
                                for (ConcurrentCamera.SingleCameraConfig singleCameraConfig5 : singleCameraConfigs) {
                                    Intrinsics.checkNotNull(singleCameraConfig5);
                                    for (UseCase useCase : singleCameraConfig5.getUseCaseGroup().getUseCases()) {
                                        Intrinsics.checkNotNullExpressionValue(useCase, "next(...)");
                                        UseCase useCase2 = useCase;
                                        String physicalCameraId = singleCameraConfig5.getCameraSelector().getPhysicalCameraId();
                                        if (physicalCameraId != null) {
                                            useCase2.setPhysicalCameraId(physicalCameraId);
                                        }
                                    }
                                    List<UseCase> useCases = singleCameraConfig5.getUseCaseGroup().getUseCases();
                                    Intrinsics.checkNotNullExpressionValue(useCases, "getUseCases(...)");
                                    arrayList2.addAll(useCases);
                                }
                                setCameraOperatingMode(1);
                                arrayList.add(bindToLifecycleInternal$default(this, lifecycleOwner, cameraSelector, null, null, null, new LegacySessionConfig(arrayList2, viewPort, effects), 28, null));
                            } else {
                                throw new IllegalArgumentException("Two camera configs need to have the same lifecycle owner, view port and effects.");
                            }
                        } else {
                            throw new UnsupportedOperationException("Camera is already running, call unbindAll() before binding more cameras.");
                        }
                    } else {
                        Context context = getContext();
                        Intrinsics.checkNotNull(context);
                        if (context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                            if (getCameraOperatingMode() != 1) {
                                ArrayList arrayList3 = new ArrayList();
                                try {
                                    CameraSelector cameraSelector2 = singleCameraConfig2.getCameraSelector();
                                    Intrinsics.checkNotNullExpressionValue(cameraSelector2, "getCameraSelector(...)");
                                    CameraInfo cameraInfo = getCameraInfo(cameraSelector2);
                                    CameraSelector cameraSelector3 = singleCameraConfig4.getCameraSelector();
                                    Intrinsics.checkNotNullExpressionValue(cameraSelector3, "getCameraSelector(...)");
                                    CameraInfo cameraInfo2 = getCameraInfo(cameraSelector3);
                                    arrayList3.add(cameraInfo);
                                    arrayList3.add(cameraInfo2);
                                    if (!getActiveConcurrentCameraInfos().isEmpty() && !Intrinsics.areEqual(arrayList3, getActiveConcurrentCameraInfos())) {
                                        throw new UnsupportedOperationException("Cameras are already running, call unbindAll() before binding more cameras.");
                                    }
                                    setCameraOperatingMode(2);
                                    if (Objects.equals(singleCameraConfig2.getUseCaseGroup().getUseCases(), singleCameraConfig4.getUseCaseGroup().getUseCases()) && singleCameraConfig2.getUseCaseGroup().getUseCases().size() == 2) {
                                        UseCase useCase3 = singleCameraConfig2.getUseCaseGroup().getUseCases().get(0);
                                        UseCase useCase4 = singleCameraConfig2.getUseCaseGroup().getUseCases().get(1);
                                        Intrinsics.checkNotNull(useCase3);
                                        if (isVideoCapture(useCase3)) {
                                            Intrinsics.checkNotNull(useCase4);
                                            if (!isPreview(useCase4)) {
                                                if (isPreview(useCase3)) {
                                                    Intrinsics.checkNotNull(useCase4);
                                                    if (isVideoCapture(useCase4)) {
                                                    }
                                                }
                                                for (ConcurrentCamera.SingleCameraConfig singleCameraConfig6 : singleCameraConfigs) {
                                                    Intrinsics.checkNotNull(singleCameraConfig6);
                                                    LifecycleOwner lifecycleOwner2 = singleCameraConfig6.getLifecycleOwner();
                                                    Intrinsics.checkNotNullExpressionValue(lifecycleOwner2, "getLifecycleOwner(...)");
                                                    CameraSelector cameraSelector4 = singleCameraConfig6.getCameraSelector();
                                                    Intrinsics.checkNotNullExpressionValue(cameraSelector4, "getCameraSelector(...)");
                                                    UseCaseGroup useCaseGroup = singleCameraConfig6.getUseCaseGroup();
                                                    Intrinsics.checkNotNullExpressionValue(useCaseGroup, "getUseCaseGroup(...)");
                                                    arrayList.add(bindToLifecycleInternal$default(this, lifecycleOwner2, cameraSelector4, null, null, null, new LegacySessionConfig(useCaseGroup), 28, null));
                                                }
                                            }
                                            LifecycleOwner lifecycleOwner3 = singleCameraConfig2.getLifecycleOwner();
                                            Intrinsics.checkNotNullExpressionValue(lifecycleOwner3, "getLifecycleOwner(...)");
                                            CameraSelector cameraSelector5 = singleCameraConfig2.getCameraSelector();
                                            Intrinsics.checkNotNullExpressionValue(cameraSelector5, "getCameraSelector(...)");
                                            CameraSelector cameraSelector6 = singleCameraConfig4.getCameraSelector();
                                            CompositionSettings compositionSettings = singleCameraConfig2.getCompositionSettings();
                                            Intrinsics.checkNotNullExpressionValue(compositionSettings, "getCompositionSettings(...)");
                                            CompositionSettings compositionSettings2 = singleCameraConfig4.getCompositionSettings();
                                            Intrinsics.checkNotNullExpressionValue(compositionSettings2, "getCompositionSettings(...)");
                                            UseCaseGroup useCaseGroup2 = singleCameraConfig2.getUseCaseGroup();
                                            Intrinsics.checkNotNullExpressionValue(useCaseGroup2, "getUseCaseGroup(...)");
                                            arrayList.add(bindToLifecycleInternal(lifecycleOwner3, cameraSelector5, cameraSelector6, compositionSettings, compositionSettings2, new LegacySessionConfig(useCaseGroup2)));
                                        } else {
                                            if (isPreview(useCase3)) {
                                                Intrinsics.checkNotNull(useCase4);
                                                if (isVideoCapture(useCase4)) {
                                                    LifecycleOwner lifecycleOwner4 = singleCameraConfig2.getLifecycleOwner();
                                                    Intrinsics.checkNotNullExpressionValue(lifecycleOwner4, "getLifecycleOwner(...)");
                                                    CameraSelector cameraSelector7 = singleCameraConfig2.getCameraSelector();
                                                    Intrinsics.checkNotNullExpressionValue(cameraSelector7, "getCameraSelector(...)");
                                                    CameraSelector cameraSelector8 = singleCameraConfig4.getCameraSelector();
                                                    CompositionSettings compositionSettings3 = singleCameraConfig2.getCompositionSettings();
                                                    Intrinsics.checkNotNullExpressionValue(compositionSettings3, "getCompositionSettings(...)");
                                                    CompositionSettings compositionSettings4 = singleCameraConfig4.getCompositionSettings();
                                                    Intrinsics.checkNotNullExpressionValue(compositionSettings4, "getCompositionSettings(...)");
                                                    UseCaseGroup useCaseGroup3 = singleCameraConfig2.getUseCaseGroup();
                                                    Intrinsics.checkNotNullExpressionValue(useCaseGroup3, "getUseCaseGroup(...)");
                                                    arrayList.add(bindToLifecycleInternal(lifecycleOwner4, cameraSelector7, cameraSelector8, compositionSettings3, compositionSettings4, new LegacySessionConfig(useCaseGroup3)));
                                                }
                                            }
                                            while (r0.hasNext()) {
                                                Intrinsics.checkNotNull(singleCameraConfig6);
                                                LifecycleOwner lifecycleOwner5 = singleCameraConfig6.getLifecycleOwner();
                                                Intrinsics.checkNotNullExpressionValue(lifecycleOwner5, "getLifecycleOwner(...)");
                                                CameraSelector cameraSelector9 = singleCameraConfig6.getCameraSelector();
                                                Intrinsics.checkNotNullExpressionValue(cameraSelector9, "getCameraSelector(...)");
                                                UseCaseGroup useCaseGroup4 = singleCameraConfig6.getUseCaseGroup();
                                                Intrinsics.checkNotNullExpressionValue(useCaseGroup4, "getUseCaseGroup(...)");
                                                arrayList.add(bindToLifecycleInternal$default(this, lifecycleOwner5, cameraSelector9, null, null, null, new LegacySessionConfig(useCaseGroup4), 28, null));
                                            }
                                        }
                                    } else {
                                        while (r0.hasNext()) {
                                            Intrinsics.checkNotNull(singleCameraConfig6);
                                            LifecycleOwner lifecycleOwner6 = singleCameraConfig6.getLifecycleOwner();
                                            Intrinsics.checkNotNullExpressionValue(lifecycleOwner6, "getLifecycleOwner(...)");
                                            CameraSelector cameraSelector10 = singleCameraConfig6.getCameraSelector();
                                            Intrinsics.checkNotNullExpressionValue(cameraSelector10, "getCameraSelector(...)");
                                            UseCaseGroup useCaseGroup5 = singleCameraConfig6.getUseCaseGroup();
                                            Intrinsics.checkNotNullExpressionValue(useCaseGroup5, "getUseCaseGroup(...)");
                                            arrayList.add(bindToLifecycleInternal$default(this, lifecycleOwner6, cameraSelector10, null, null, null, new LegacySessionConfig(useCaseGroup5), 28, null));
                                        }
                                    }
                                    setActiveConcurrentCameraInfos(arrayList3);
                                } catch (IllegalArgumentException unused) {
                                    throw new IllegalArgumentException("Invalid camera selectors in camera configs.");
                                }
                            } else {
                                throw new UnsupportedOperationException("Camera is already running, call unbindAll() before binding more cameras.");
                            }
                        } else {
                            throw new UnsupportedOperationException("Concurrent camera is not supported on the device.");
                        }
                    }
                    ConcurrentCamera concurrentCamera = new ConcurrentCamera(arrayList);
                    Trace.endSection();
                    return concurrentCamera;
                }
                throw new IllegalArgumentException("Concurrent camera is only supporting two cameras at maximum.");
            }
            throw new IllegalArgumentException("Concurrent camera needs two camera configs.");
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
