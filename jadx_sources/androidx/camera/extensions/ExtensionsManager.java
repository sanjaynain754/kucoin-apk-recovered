package androidx.camera.extensions;

import android.content.Context;
import android.util.Range;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.extensions.impl.InitializerImpl;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes23.dex */
public final class ExtensionsManager {
    private static final Object EXTENSIONS_LOCK = new Object();
    private static final String TAG = "ExtensionsManager";

    @GuardedBy("EXTENSIONS_LOCK")
    private static ListenableFuture<Void> sDeinitializeFuture;

    @GuardedBy("EXTENSIONS_LOCK")
    private static ExtensionsManager sExtensionsManager;

    @GuardedBy("EXTENSIONS_LOCK")
    private static ListenableFuture<ExtensionsManager> sInitializeFuture;
    private final ExtensionsAvailability mExtensionsAvailability;
    private final ExtensionsInfo mExtensionsInfo;

    public enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    public static ListenableFuture<ExtensionsManager> getInstanceAsync(Context context, CameraProvider cameraProvider) {
        return getInstanceAsync(context, cameraProvider, ClientVersion.getCurrentVersion());
    }

    public Range<Long> getEstimatedCaptureLatencyRange(CameraSelector cameraSelector, int i11) {
        if (i11 == 0 || this.mExtensionsAvailability != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return null;
        }
        return this.mExtensionsInfo.getEstimatedCaptureLatencyRange(cameraSelector, i11, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public static ListenableFuture<ExtensionsManager> getInstanceAsync(Context context, CameraProvider cameraProvider, String str) {
        ClientVersion clientVersion = new ClientVersion(str);
        ClientVersion.setCurrentVersion(clientVersion);
        return getInstanceAsync(context, cameraProvider, clientVersion);
    }

    public static ExtensionsManager getOrCreateExtensionsManager(ExtensionsAvailability extensionsAvailability, CameraProvider cameraProvider, Context context) {
        synchronized (EXTENSIONS_LOCK) {
            try {
                ExtensionsManager extensionsManager = sExtensionsManager;
                if (extensionsManager != null) {
                    return extensionsManager;
                }
                ExtensionsManager extensionsManager2 = new ExtensionsManager(extensionsAvailability, cameraProvider, context);
                sExtensionsManager = extensionsManager2;
                return extensionsManager2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getInstanceAsync$0(ClientVersion clientVersion, final Context context, final CameraProvider cameraProvider, final CallbackToFutureAdapter.Completer completer) throws Exception {
        try {
            InitializerImpl.init(clientVersion.toVersionString(), context, new InitializerImpl.OnExtensionsInitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.1
                public void onFailure(int i11) {
                    Logger.m1868e(ExtensionsManager.TAG, "Failed to initialize extensions");
                    completer.set(ExtensionsManager.getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cameraProvider, context));
                }

                public void onSuccess() {
                    Logger.m1866d(ExtensionsManager.TAG, "Successfully initialized extensions");
                    completer.set(ExtensionsManager.getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_AVAILABLE, cameraProvider, context));
                }
            }, CameraXExecutors.directExecutor());
            return "Initialize extensions";
        } catch (AbstractMethodError e11) {
            e = e11;
            Logger.m1868e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            completer.set(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider, context));
            return "Initialize extensions";
        } catch (NoClassDefFoundError e12) {
            e = e12;
            Logger.m1868e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            completer.set(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider, context));
            return "Initialize extensions";
        } catch (NoSuchMethodError e13) {
            e = e13;
            Logger.m1868e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            completer.set(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider, context));
            return "Initialize extensions";
        } catch (RuntimeException e14) {
            Logger.m1868e(TAG, "Failed to initialize extensions. Something wents wrong when initializing the vendor library. " + e14);
            completer.set(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cameraProvider, context));
            return "Initialize extensions";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$shutdown$1(final CallbackToFutureAdapter.Completer completer) throws Exception {
        try {
            InitializerImpl.deinit(new InitializerImpl.OnExtensionsDeinitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.2
                public void onFailure(int i11) {
                    completer.setException(new Exception("Failed to deinitialize extensions."));
                }

                public void onSuccess() {
                    completer.set(null);
                }
            }, CameraXExecutors.directExecutor());
            return null;
        } catch (NoClassDefFoundError | NoSuchMethodError e11) {
            completer.setException(e11);
            return null;
        }
    }

    public CameraSelector getExtensionEnabledCameraSelector(CameraSelector cameraSelector, int i11) {
        if (i11 == 0) {
            return cameraSelector;
        }
        if (this.mExtensionsAvailability == ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return this.mExtensionsInfo.getExtensionCameraSelectorAndInjectCameraConfig(cameraSelector, i11);
        }
        throw new IllegalArgumentException("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
    }

    @VisibleForTesting
    public ExtensionsAvailability getExtensionsAvailability() {
        return this.mExtensionsAvailability;
    }

    public boolean isExtensionAvailable(CameraSelector cameraSelector, int i11) {
        if (i11 == 0) {
            return true;
        }
        if (this.mExtensionsAvailability != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.mExtensionsInfo.isExtensionAvailable(cameraSelector, i11);
    }

    public boolean isImageAnalysisSupported(CameraSelector cameraSelector, int i11) {
        if (i11 == 0) {
            return true;
        }
        if (this.mExtensionsAvailability != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.mExtensionsInfo.isImageAnalysisSupported(cameraSelector, i11);
    }

    @VisibleForTesting
    public void setVendorExtenderFactory(VendorExtenderFactory vendorExtenderFactory) {
        this.mExtensionsInfo.setVendorExtenderFactory(vendorExtenderFactory);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public ListenableFuture<Void> shutdown() {
        synchronized (EXTENSIONS_LOCK) {
            try {
                if (ExtensionVersion.getRuntimeVersion() == null) {
                    sInitializeFuture = null;
                    sExtensionsManager = null;
                    ExtensionVersion.injectInstance(null);
                    return Futures.immediateFuture(null);
                }
                ExtensionVersion.injectInstance(null);
                ListenableFuture<ExtensionsManager> listenableFuture = sInitializeFuture;
                if (listenableFuture == null) {
                    return Futures.immediateFuture(null);
                }
                ListenableFuture<Void> listenableFuture2 = sDeinitializeFuture;
                if (listenableFuture2 != null) {
                    return listenableFuture2;
                }
                try {
                    listenableFuture.get();
                    sInitializeFuture = null;
                    ExtensionsAvailability extensionsAvailability = sExtensionsManager.mExtensionsAvailability;
                    sExtensionsManager = null;
                    if (extensionsAvailability == ExtensionsAvailability.LIBRARY_AVAILABLE) {
                        ExtendedCameraConfigProviderStore.clear();
                        sDeinitializeFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.extensions.c
                            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                return this.f1892a.lambda$shutdown$1(completer);
                            }
                        });
                    } else {
                        sDeinitializeFuture = Futures.immediateFuture(null);
                    }
                    return sDeinitializeFuture;
                } catch (InterruptedException e11) {
                    e = e11;
                    ListenableFuture<Void> listenableFutureImmediateFailedFuture = Futures.immediateFailedFuture(e);
                    sDeinitializeFuture = listenableFutureImmediateFailedFuture;
                    return listenableFutureImmediateFailedFuture;
                } catch (ExecutionException e12) {
                    e = e12;
                    ListenableFuture<Void> listenableFutureImmediateFailedFuture2 = Futures.immediateFailedFuture(e);
                    sDeinitializeFuture = listenableFutureImmediateFailedFuture2;
                    return listenableFutureImmediateFailedFuture2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private ExtensionsManager(ExtensionsAvailability extensionsAvailability, CameraProvider cameraProvider, Context context) {
        this.mExtensionsAvailability = extensionsAvailability;
        this.mExtensionsInfo = new ExtensionsInfo(cameraProvider, context);
    }

    public CameraExtensionsControl getCameraExtensionsControl(CameraControl cameraControl) {
        return CameraExtensionsControls.from(cameraControl);
    }

    public CameraExtensionsInfo getCameraExtensionsInfo(CameraInfo cameraInfo) {
        return CameraExtensionsInfos.from(cameraInfo);
    }

    public static ListenableFuture<ExtensionsManager> getInstanceAsync(Context context, final CameraProvider cameraProvider, final ClientVersion clientVersion) {
        synchronized (EXTENSIONS_LOCK) {
            try {
                ListenableFuture<Void> listenableFuture = sDeinitializeFuture;
                if (listenableFuture != null && !listenableFuture.isDone()) {
                    throw new IllegalStateException("Not yet done deinitializing extensions");
                }
                sDeinitializeFuture = null;
                final Context applicationContext = ContextUtil.getApplicationContext(context);
                if (ExtensionVersion.getRuntimeVersion() == null) {
                    return Futures.immediateFuture(getOrCreateExtensionsManager(ExtensionsAvailability.NONE, cameraProvider, applicationContext));
                }
                Version version = Version.VERSION_1_0;
                if (!ClientVersion.isMaximumCompatibleVersion(version) && !ExtensionVersion.isMaximumCompatibleVersion(version)) {
                    if (sInitializeFuture == null) {
                        sInitializeFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.extensions.d
                            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                return ExtensionsManager.lambda$getInstanceAsync$0(clientVersion, applicationContext, cameraProvider, completer);
                            }
                        });
                    }
                    return sInitializeFuture;
                }
                return Futures.immediateFuture(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_AVAILABLE, cameraProvider, applicationContext));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
