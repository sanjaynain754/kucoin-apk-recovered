package io.flutter.embedding.engine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.TypedValue;
import android.view.Surface;
import android.view.SurfaceControl;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.PlatformMessageHandler;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugin.platform.PlatformViewsController2;
import io.flutter.util.Preconditions;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p716w7.C45744b;

/* JADX INFO: loaded from: classes23.dex */
@Keep
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";

    @Nullable
    private static AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;

    @Nullable
    private static String vmServiceUri;

    @Nullable
    private AccessibilityDelegate accessibilityDelegate;

    @Nullable
    private DeferredComponentManager deferredComponentManager;

    @Nullable
    private LocalizationPlugin localizationPlugin;

    @Nullable
    private Long nativeShellHolderId;

    @Nullable
    private PlatformMessageHandler platformMessageHandler;

    @Nullable
    private PlatformViewsController platformViewsController;

    @Nullable
    private PlatformViewsController2 platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();

    @NonNull
    private final Set<FlutterEngine.EngineLifecycleListener> engineLifecycleListeners = new CopyOnWriteArraySet();

    @NonNull
    private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners = new CopyOnWriteArraySet();

    @NonNull
    private final Looper mainLooper = Looper.getMainLooper();

    public interface AccessibilityDelegate {
        void updateCustomAccessibilityActions(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr);

        void updateSemantics(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr, @NonNull ByteBuffer[] byteBufferArr);
    }

    public interface AsyncWaitForVsyncDelegate {
        void asyncWaitForVsync(long j11);
    }

    public static class Factory {
        public FlutterJNI provideFlutterJNI() {
            return new FlutterJNI();
        }
    }

    private native long nativeAttach(@NonNull FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j11);

    private native void nativeDeferredComponentInstallFailure(int i11, @NonNull String str, boolean z11);

    private native void nativeDestroy(long j11);

    private native void nativeDispatchEmptyPlatformMessage(long j11, @NonNull String str, int i11);

    private native void nativeDispatchPlatformMessage(long j11, @NonNull String str, @Nullable ByteBuffer byteBuffer, int i11, int i12);

    private native void nativeDispatchPointerDataPacket(long j11, @NonNull ByteBuffer byteBuffer, int i11);

    private native void nativeDispatchSemanticsAction(long j11, int i11, int i12, @Nullable ByteBuffer byteBuffer, int i13);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i11);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i11);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i11);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i11);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i11);

    private native Bitmap nativeGetBitmap(long j11);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j11, int i11, int i12);

    private static native void nativeInit(@NonNull Context context, @NonNull String[] strArr, @Nullable String str, @NonNull String str2, @NonNull String str3, long j11, int i11);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j11, int i11);

    private native void nativeInvokePlatformMessageResponseCallback(long j11, int i11, @Nullable ByteBuffer byteBuffer, int i12);

    private native boolean nativeIsSurfaceControlEnabled(long j11);

    private native void nativeLoadDartDeferredLibrary(long j11, int i11, @NonNull String[] strArr);

    @NonNull
    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j11);

    private native void nativeMarkTextureFrameAvailable(long j11, long j12);

    private native void nativeNotifyLowMemoryWarning(long j11);

    private native void nativeOnVsync(long j11, long j12, long j13);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j11, long j12, @NonNull WeakReference<TextureRegistry.ImageConsumer> weakReference, boolean z11);

    private native void nativeRegisterTexture(long j11, long j12, @NonNull WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j11, @NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull AssetManager assetManager, @Nullable List<String> list, long j12);

    private native void nativeScheduleFrame(long j11);

    private native void nativeSetAccessibilityFeatures(long j11, int i11);

    private native void nativeSetSemanticsEnabled(long j11, boolean z11);

    private native void nativeSetViewportMetrics(long j11, float f11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, long j12);

    private native void nativeSurfaceChanged(long j11, int i11, int i12);

    private native void nativeSurfaceCreated(long j11, @NonNull Surface surface);

    private native void nativeSurfaceDestroyed(long j11);

    private native void nativeSurfaceWindowChanged(long j11, @NonNull Surface surface);

    private native void nativeUnregisterTexture(long j11, long j12);

    private native void nativeUpdateDisplayMetrics(long j11);

    private native void nativeUpdateJavaAssetManager(long j11, @NonNull AssetManager assetManager, @NonNull String str);

    private native void nativeUpdateRefreshRate(float f11);

    public void dispatchSemanticsAction(int i11, @NonNull AccessibilityBridge.Action action) {
        dispatchSemanticsAction(i11, action, null);
    }

    @UiThread
    public void setViewportMetrics(float f11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f11, i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24, i25, i26, iArr, iArr2, iArr3);
    }

    private static void asyncWaitForVsync(long j11) {
        AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2 = asyncWaitForVsyncDelegate;
        if (asyncWaitForVsyncDelegate2 == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        asyncWaitForVsyncDelegate2.asyncWaitForVsync(j11);
    }

    @Nullable
    @VisibleForTesting
    public static Bitmap decodeImage(@NonNull ByteBuffer byteBuffer, final long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder$OnHeaderDecodedListener() { // from class: io.flutter.embedding.engine.a
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.m87498a(j11, imageDecoder, imageInfo, source);
                    }
                });
            } catch (IOException e11) {
                Log.m87478e(TAG, "Failed to decode image", e11);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    @Nullable
    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    @Nullable
    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i11, ByteBuffer byteBuffer) {
        PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.handlePlatformMessageResponse(i11, byteBuffer);
        }
    }

    private void onPreEngineRestart() {
        Iterator<FlutterEngine.EngineLifecycleListener> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onPreEngineRestart();
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    @SuppressLint({"NewApi"})
    @UiThread
    public void applyTransactions() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("");
        }
        platformViewsController2.applyTransactions();
    }

    @VisibleForTesting
    public String[] computePlatformResolvedLocale(@NonNull String[] strArr) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < strArr.length; i11 += 3) {
            String str = strArr[i11];
            String str2 = strArr[i11 + 1];
            String str3 = strArr[i11 + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        Locale localeResolveNativeLocale = this.localizationPlugin.resolveNativeLocale(arrayList);
        return localeResolveNativeLocale == null ? new String[0] : new String[]{localeResolveNativeLocale.getLanguage(), localeResolveNativeLocale.getCountry(), localeResolveNativeLocale.getScript()};
    }

    @SuppressLint({"NewApi"})
    @UiThread
    public FlutterOverlaySurface createOverlaySurface2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            return platformViewsController2.createOverlaySurface();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    @SuppressLint({"NewApi"})
    @UiThread
    public SurfaceControl.Transaction createTransaction() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            return platformViewsController2.createTransaction();
        }
        throw new RuntimeException("");
    }

    public void dispatchSemanticsAction(int i11, @NonNull AccessibilityBridge.Action action, @Nullable Object obj) {
        ByteBuffer byteBufferEncodeMessage;
        int iPosition;
        ensureAttachedToNative();
        if (obj != null) {
            byteBufferEncodeMessage = StandardMessageCodec.INSTANCE.encodeMessage(obj);
            iPosition = byteBufferEncodeMessage.position();
        } else {
            byteBufferEncodeMessage = null;
            iPosition = 0;
        }
        dispatchSemanticsAction(i11, action.value, byteBufferEncodeMessage, iPosition);
    }

    @SuppressLint({"NewApi"})
    @UiThread
    public void endFrame2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("");
        }
        platformViewsController2.onEndFrame();
    }

    @VisibleForTesting
    public void handlePlatformMessage(@NonNull String str, ByteBuffer byteBuffer, int i11, long j11) {
        PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.handleMessageFromDart(str, byteBuffer, i11, j11);
        } else {
            nativeCleanupMessageData(j11);
        }
    }

    @SuppressLint({"NewApi"})
    @UiThread
    public void hideOverlaySurface2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        platformViewsController2.hideOverlaySurface();
    }

    public void init(@NonNull Context context, @NonNull String[] strArr, @Nullable String str, @NonNull String str2, @NonNull String str3, long j11, int i11) {
        if (initCalled) {
            Log.m87483w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j11, i11);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i11) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i11);
            } else {
                Log.m87483w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i11);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public void loadLibrary(Context context) {
        if (loadLibraryCalled) {
            Log.m87483w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        C45744b.m100974a(context, ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER);
        loadLibraryCalled = true;
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.m87483w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    @UiThread
    public void requestDartDeferredLibrary(int i11) {
        DeferredComponentManager deferredComponentManager = this.deferredComponentManager;
        if (deferredComponentManager != null) {
            deferredComponentManager.installDeferredComponent(i11, null);
        } else {
            Log.m87477e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
        }
    }

    @VisibleForTesting
    public void setAccessibilityFeaturesInNative(int i11) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i11);
    }

    public void setAsyncWaitForVsyncDelegate(@Nullable AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2) {
        asyncWaitForVsyncDelegate = asyncWaitForVsyncDelegate2;
    }

    public void setRefreshRateFPS(float f11) {
        refreshRateFPS = f11;
        updateRefreshRate();
    }

    @VisibleForTesting
    public void setSemanticsEnabledInNative(boolean z11) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z11);
    }

    @SuppressLint({"NewApi"})
    @UiThread
    public void showOverlaySurface2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        platformViewsController2.showOverlaySurface();
    }

    @SuppressLint({"NewApi"})
    @UiThread
    public void swapTransactions() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("");
        }
        platformViewsController2.swapTransactions();
    }

    public void updateDisplayMetrics(int i11, float f11, float f12, float f13) {
        displayWidth = f11;
        displayHeight = f12;
        displayDensity = f13;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m87498a(long j11, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j11, size.getWidth(), size.getHeight());
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    @UiThread
    private void updateCustomAccessibilityActions(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr) {
        ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.updateCustomAccessibilityActions(byteBuffer, strArr);
        }
    }

    @UiThread
    private void updateSemantics(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr, @NonNull ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.updateSemantics(byteBuffer, strArr, byteBufferArr);
        }
    }

    @UiThread
    public void addEngineLifecycleListener(@NonNull FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(engineLifecycleListener);
    }

    @UiThread
    public void addIsDisplayingFlutterUiListener(@NonNull FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
    }

    @UiThread
    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j11) {
        nativeCleanupMessageData(j11);
    }

    @UiThread
    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            return platformViewsController.createOverlaySurface();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    @UiThread
    public void deferredComponentInstallFailure(int i11, @NonNull String str, boolean z11) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i11, str, z11);
    }

    @SuppressLint({"NewApi"})
    @UiThread
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            platformViewsController2.destroyOverlaySurface();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    @UiThread
    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.destroyOverlaySurfaces();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    @UiThread
    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    @UiThread
    public void dispatchEmptyPlatformMessage(@NonNull String str, int i11) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i11);
            return;
        }
        Log.m87483w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i11);
    }

    @UiThread
    public void dispatchPlatformMessage(@NonNull String str, @Nullable ByteBuffer byteBuffer, int i11, int i12) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i11, i12);
            return;
        }
        Log.m87483w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i12);
    }

    @UiThread
    public void dispatchPointerDataPacket(@NonNull ByteBuffer byteBuffer, int i11) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i11);
    }

    @UiThread
    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    @UiThread
    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    @Nullable
    public float getScaledFontSize(float f11, int i11) {
        DisplayMetrics pastDisplayMetrics = SettingsChannel.getPastDisplayMetrics(i11);
        if (pastDisplayMetrics == null) {
            Log.m87477e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i11) + ", which can't be found.");
            return -1.0f;
        }
        return TypedValue.applyDimension(2, f11, pastDisplayMetrics) / pastDisplayMetrics.density;
    }

    public void invokePlatformMessageResponseCallback(int i11, @NonNull ByteBuffer byteBuffer, int i12) throws Throwable {
        FlutterJNI flutterJNI;
        if (byteBuffer.isDirect()) {
            this.shellHolderLock.readLock().lock();
            try {
                try {
                    if (isAttached()) {
                        flutterJNI = this;
                        flutterJNI.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i11, byteBuffer, i12);
                    } else {
                        flutterJNI = this;
                        Log.m87483w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i11);
                    }
                    flutterJNI.shellHolderLock.readLock().unlock();
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    flutterJNI.shellHolderLock.readLock().unlock();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                flutterJNI = this;
            }
        } else {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
    }

    public boolean isCodePointEmoji(int i11) {
        return nativeFlutterTextUtilsIsEmoji(i11);
    }

    public boolean isCodePointEmojiModifier(int i11) {
        return nativeFlutterTextUtilsIsEmojiModifier(i11);
    }

    public boolean isCodePointEmojiModifierBase(int i11) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i11);
    }

    public boolean isCodePointRegionalIndicator(int i11) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i11);
    }

    public boolean isCodePointVariantSelector(int i11) {
        return nativeFlutterTextUtilsIsVariationSelector(i11);
    }

    @UiThread
    public void loadDartDeferredLibrary(int i11, @NonNull String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i11, strArr);
    }

    @UiThread
    public void markTextureFrameAvailable(long j11) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j11);
    }

    @UiThread
    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    @UiThread
    public void onBeginFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.onBeginFrame();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }

    @UiThread
    public void onDisplayOverlaySurface(int i11, int i12, int i13, int i14, int i15) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.onDisplayOverlaySurface(i11, i12, i13, i14, i15);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    @UiThread
    public void onDisplayPlatformView(int i11, int i12, int i13, int i14, int i15, int i16, int i17, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.onDisplayPlatformView(i11, i12, i13, i14, i15, i16, i17, flutterMutatorsStack);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    @SuppressLint({"NewApi"})
    @UiThread
    public void onDisplayPlatformView2(int i11, int i12, int i13, int i14, int i15, int i16, int i17, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            platformViewsController2.onDisplayPlatformView(i11, i12, i13, i14, i15, i16, i17, flutterMutatorsStack);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    @UiThread
    public void onEndFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.onEndFrame();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
    }

    @UiThread
    @VisibleForTesting
    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<FlutterUiDisplayListener> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterUiDisplayed();
        }
    }

    @UiThread
    @VisibleForTesting
    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<FlutterUiDisplayListener> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterUiNoLongerDisplayed();
        }
    }

    @UiThread
    public void onSurfaceChanged(int i11, int i12) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i11, i12);
    }

    @UiThread
    public void onSurfaceCreated(@NonNull Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    @UiThread
    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    @UiThread
    public void onSurfaceWindowChanged(@NonNull Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j11, long j12, long j13) {
        nativeOnVsync(j11, j12, j13);
    }

    @VisibleForTesting
    public long performNativeAttach(@NonNull FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    @UiThread
    public void registerImageTexture(long j11, @NonNull TextureRegistry.ImageConsumer imageConsumer, boolean z11) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j11, new WeakReference<>(imageConsumer), z11);
    }

    @UiThread
    public void registerTexture(long j11, @NonNull SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j11, new WeakReference<>(surfaceTextureWrapper));
    }

    @UiThread
    public void removeEngineLifecycleListener(@NonNull FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(engineLifecycleListener);
    }

    @UiThread
    public void removeIsDisplayingFlutterUiListener(@NonNull FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
    }

    @UiThread
    public void runBundleAndSnapshotFromLibrary(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull AssetManager assetManager, @Nullable List<String> list, long j11) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j11);
    }

    @UiThread
    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    @UiThread
    public void setAccessibilityDelegate(@Nullable AccessibilityDelegate accessibilityDelegate) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = accessibilityDelegate;
    }

    @UiThread
    public void setAccessibilityFeatures(int i11) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i11);
        }
    }

    @UiThread
    public void setDeferredComponentManager(@Nullable DeferredComponentManager deferredComponentManager) {
        ensureRunningOnMainThread();
        this.deferredComponentManager = deferredComponentManager;
        if (deferredComponentManager != null) {
            deferredComponentManager.setJNI(this);
        }
    }

    @UiThread
    public void setLocalizationPlugin(@Nullable LocalizationPlugin localizationPlugin) {
        ensureRunningOnMainThread();
        this.localizationPlugin = localizationPlugin;
    }

    @UiThread
    public void setPlatformMessageHandler(@Nullable PlatformMessageHandler platformMessageHandler) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = platformMessageHandler;
    }

    @UiThread
    public void setPlatformViewsController(@NonNull PlatformViewsController platformViewsController) {
        ensureRunningOnMainThread();
        this.platformViewsController = platformViewsController;
    }

    @UiThread
    public void setPlatformViewsController2(@NonNull PlatformViewsController2 platformViewsController2) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = platformViewsController2;
    }

    @UiThread
    public void setSemanticsEnabled(boolean z11) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z11);
        }
    }

    @NonNull
    @UiThread
    public FlutterJNI spawn(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, long j11) {
        boolean z11;
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI flutterJNINativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j11);
        Long l11 = flutterJNINativeSpawn.nativeShellHolderId;
        if (l11 != null && l11.longValue() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11, "Failed to spawn new JNI connected shell from existing shell.");
        return flutterJNINativeSpawn;
    }

    @UiThread
    public void unregisterTexture(long j11) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j11);
    }

    @UiThread
    public void updateJavaAssetManager(@NonNull AssetManager assetManager, @NonNull String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    @UiThread
    public void dispatchSemanticsAction(int i11, int i12, @Nullable ByteBuffer byteBuffer, int i13) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i11, i12, byteBuffer, i13);
    }
}
