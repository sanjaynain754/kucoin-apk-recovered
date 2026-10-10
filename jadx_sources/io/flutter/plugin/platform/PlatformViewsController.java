package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import io.flutter.Log;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.MotionEventTracker;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.util.ViewUtils;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.TextureRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class PlatformViewsController implements PlatformViewsAccessibilityDelegate {
    private static final String TAG = "PlatformViewsController";
    private static Class[] VIEW_TYPES_REQUIRE_VIRTUAL_DISPLAY = {SurfaceView.class};
    private static boolean enableImageRenderTarget = true;
    private static boolean enableSurfaceProducerRenderTarget = true;
    private AndroidTouchProcessor androidTouchProcessor;
    private Context context;
    private FlutterView flutterView;
    private PlatformViewsChannel platformViewsChannel;

    @Nullable
    private TextInputPlugin textInputPlugin;

    @Nullable
    @VisibleForTesting
    TextureRegistry textureRegistry;
    private int nextOverlayLayerId = 0;
    private boolean flutterViewConvertedToImageView = false;
    private boolean synchronizeToNativeViewHierarchy = true;
    private boolean usesSoftwareRendering = false;
    private final PlatformViewsChannel.PlatformViewsHandler channelHandler = new C388351();
    private final PlatformViewRegistryImpl registry = new PlatformViewRegistryImpl();

    @VisibleForTesting
    final HashMap<Integer, VirtualDisplayController> vdControllers = new HashMap<>();
    private final AccessibilityEventsDelegate accessibilityEventsDelegate = new AccessibilityEventsDelegate();

    @VisibleForTesting
    final HashMap<Context, View> contextToEmbeddedView = new HashMap<>();
    private final SparseArray<PlatformOverlayView> overlayLayerViews = new SparseArray<>();
    private final HashSet<Integer> currentFrameUsedOverlayLayerIds = new HashSet<>();
    private final HashSet<Integer> currentFrameUsedPlatformViewIds = new HashSet<>();
    private final SparseArray<PlatformViewWrapper> viewWrappers = new SparseArray<>();
    private final SparseArray<PlatformView> platformViews = new SparseArray<>();
    private final SparseArray<FlutterMutatorView> platformViewParent = new SparseArray<>();
    private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();

    /* JADX INFO: renamed from: io.flutter.plugin.platform.PlatformViewsController$1 */
    public class C388351 implements PlatformViewsChannel.PlatformViewsHandler {
        public C388351() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m87555a(C388351 c388351, VirtualDisplayController virtualDisplayController, float f11, PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized) {
            PlatformViewsController.this.unlockInputConnection(virtualDisplayController);
            if (PlatformViewsController.this.context != null) {
                f11 = PlatformViewsController.this.getDisplayDensity();
            }
            platformViewBufferResized.run(new PlatformViewsChannel.PlatformViewBufferSize(PlatformViewsController.this.toLogicalPixels(virtualDisplayController.getRenderTargetWidth(), f11), PlatformViewsController.this.toLogicalPixels(virtualDisplayController.getRenderTargetHeight(), f11)));
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void clearFocus(int i11) {
            View view;
            if (PlatformViewsController.this.usesVirtualDisplay(i11)) {
                view = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i11)).getView();
            } else {
                PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i11);
                if (platformView == null) {
                    Log.m87477e(PlatformViewsController.TAG, "Clearing focus on an unknown view with id: " + i11);
                    return;
                }
                view = platformView.getView();
            }
            if (view != null) {
                view.clearFocus();
                return;
            }
            Log.m87477e(PlatformViewsController.TAG, "Clearing focus on a null view with id: " + i11);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void createForPlatformViewLayer(@NonNull PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            PlatformViewsController.this.enforceMinimumAndroidApiVersion(19);
            PlatformViewsController.this.ensureValidRequest(platformViewCreationRequest);
            PlatformViewsController.this.configureForHybridComposition(PlatformViewsController.this.createPlatformView(platformViewCreationRequest, false), platformViewCreationRequest);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public long createForTextureLayer(@NonNull PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            PlatformViewsController.this.ensureValidRequest(platformViewCreationRequest);
            int i11 = platformViewCreationRequest.viewId;
            if (PlatformViewsController.this.viewWrappers.get(i11) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i11);
            }
            PlatformViewsController platformViewsController = PlatformViewsController.this;
            if (platformViewsController.textureRegistry == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i11);
            }
            if (platformViewsController.flutterView == null) {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i11);
            }
            PlatformView platformViewCreatePlatformView = PlatformViewsController.this.createPlatformView(platformViewCreationRequest, true);
            View view = platformViewCreatePlatformView.getView();
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            if (ViewUtils.hasChildViewOfType(view, PlatformViewsController.VIEW_TYPES_REQUIRE_VIRTUAL_DISPLAY)) {
                if (platformViewCreationRequest.displayMode == PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK) {
                    PlatformViewsController.this.configureForHybridComposition(platformViewCreatePlatformView, platformViewCreationRequest);
                    return -2L;
                }
                if (!PlatformViewsController.this.usesSoftwareRendering) {
                    return PlatformViewsController.this.configureForVirtualDisplay(platformViewCreatePlatformView, platformViewCreationRequest);
                }
            }
            return PlatformViewsController.this.configureForTextureLayerComposition(platformViewCreatePlatformView, platformViewCreationRequest);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void dispose(int i11) {
            PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i11);
            if (platformView == null) {
                Log.m87477e(PlatformViewsController.TAG, "Disposing unknown platform view with id: " + i11);
                return;
            }
            if (platformView.getView() != null) {
                View view = platformView.getView();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            PlatformViewsController.this.platformViews.remove(i11);
            try {
                platformView.dispose();
            } catch (RuntimeException e11) {
                Log.m87478e(PlatformViewsController.TAG, "Disposing platform view threw an exception", e11);
            }
            if (PlatformViewsController.this.usesVirtualDisplay(i11)) {
                VirtualDisplayController virtualDisplayController = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i11));
                View view2 = virtualDisplayController.getView();
                if (view2 != null) {
                    PlatformViewsController.this.contextToEmbeddedView.remove(view2.getContext());
                }
                virtualDisplayController.dispose();
                PlatformViewsController.this.vdControllers.remove(Integer.valueOf(i11));
                return;
            }
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i11);
            if (platformViewWrapper != null) {
                platformViewWrapper.removeAllViews();
                platformViewWrapper.release();
                platformViewWrapper.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup2 = (ViewGroup) platformViewWrapper.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(platformViewWrapper);
                }
                PlatformViewsController.this.viewWrappers.remove(i11);
                return;
            }
            FlutterMutatorView flutterMutatorView = (FlutterMutatorView) PlatformViewsController.this.platformViewParent.get(i11);
            if (flutterMutatorView != null) {
                flutterMutatorView.removeAllViews();
                flutterMutatorView.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup3 = (ViewGroup) flutterMutatorView.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(flutterMutatorView);
                }
                PlatformViewsController.this.platformViewParent.remove(i11);
            }
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void offset(int i11, double d11, double d12) {
            if (PlatformViewsController.this.usesVirtualDisplay(i11)) {
                return;
            }
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i11);
            if (platformViewWrapper == null) {
                Log.m87477e(PlatformViewsController.TAG, "Setting offset for unknown platform view with id: " + i11);
                return;
            }
            int physicalPixels = PlatformViewsController.this.toPhysicalPixels(d11);
            int physicalPixels2 = PlatformViewsController.this.toPhysicalPixels(d12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) platformViewWrapper.getLayoutParams();
            layoutParams.topMargin = physicalPixels;
            layoutParams.leftMargin = physicalPixels2;
            platformViewWrapper.setLayoutParams(layoutParams);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void onTouch(@NonNull PlatformViewsChannel.PlatformViewTouch platformViewTouch) {
            int i11 = platformViewTouch.viewId;
            float f11 = PlatformViewsController.this.context.getResources().getDisplayMetrics().density;
            if (PlatformViewsController.this.usesVirtualDisplay(i11)) {
                PlatformViewsController.this.vdControllers.get(Integer.valueOf(i11)).dispatchTouchEvent(PlatformViewsController.this.toMotionEvent(f11, platformViewTouch, true));
                return;
            }
            PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i11);
            if (platformView == null) {
                Log.m87477e(PlatformViewsController.TAG, "Sending touch to an unknown view with id: " + i11);
                return;
            }
            View view = platformView.getView();
            if (view != null) {
                view.dispatchTouchEvent(PlatformViewsController.this.toMotionEvent(f11, platformViewTouch, false));
                return;
            }
            Log.m87477e(PlatformViewsController.TAG, "Sending touch to a null view with id: " + i11);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void resize(@NonNull PlatformViewsChannel.PlatformViewResizeRequest platformViewResizeRequest, @NonNull final PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized) {
            int physicalPixels = PlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalWidth);
            int physicalPixels2 = PlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalHeight);
            int i11 = platformViewResizeRequest.viewId;
            if (PlatformViewsController.this.usesVirtualDisplay(i11)) {
                final float displayDensity = PlatformViewsController.this.getDisplayDensity();
                final VirtualDisplayController virtualDisplayController = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i11));
                PlatformViewsController.this.lockInputConnection(virtualDisplayController);
                virtualDisplayController.resize(physicalPixels, physicalPixels2, new Runnable() { // from class: io.flutter.plugin.platform.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        PlatformViewsController.C388351.m87555a(this.f86799b, virtualDisplayController, displayDensity, platformViewBufferResized);
                    }
                });
                return;
            }
            PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i11);
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i11);
            if (platformView == null || platformViewWrapper == null) {
                Log.m87477e(PlatformViewsController.TAG, "Resizing unknown platform view with id: " + i11);
                return;
            }
            if (physicalPixels > platformViewWrapper.getRenderTargetWidth() || physicalPixels2 > platformViewWrapper.getRenderTargetHeight()) {
                platformViewWrapper.resizeRenderTarget(physicalPixels, physicalPixels2);
            }
            ViewGroup.LayoutParams layoutParams = platformViewWrapper.getLayoutParams();
            layoutParams.width = physicalPixels;
            layoutParams.height = physicalPixels2;
            platformViewWrapper.setLayoutParams(layoutParams);
            View view = platformView.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = physicalPixels;
                layoutParams2.height = physicalPixels2;
                view.setLayoutParams(layoutParams2);
            }
            platformViewBufferResized.run(new PlatformViewsChannel.PlatformViewBufferSize(PlatformViewsController.this.toLogicalPixels(platformViewWrapper.getRenderTargetWidth()), PlatformViewsController.this.toLogicalPixels(platformViewWrapper.getRenderTargetHeight())));
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void synchronizeToNativeViewHierarchy(boolean z11) {
            PlatformViewsController.this.synchronizeToNativeViewHierarchy = z11;
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void setDirection(int i11, int i12) {
            View view;
            if (PlatformViewsController.validateDirection(i12)) {
                if (PlatformViewsController.this.usesVirtualDisplay(i11)) {
                    view = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i11)).getView();
                } else {
                    PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i11);
                    if (platformView == null) {
                        Log.m87477e(PlatformViewsController.TAG, "Setting direction to an unknown view with id: " + i11);
                        return;
                    }
                    view = platformView.getView();
                }
                if (view == null) {
                    Log.m87477e(PlatformViewsController.TAG, "Setting direction to a null view with id: " + i11);
                    return;
                }
                view.setLayoutDirection(i12);
                return;
            }
            throw new IllegalStateException("Trying to set unknown direction value: " + i12 + "(view id: " + i11 + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishFrame(boolean z11) {
        for (int i11 = 0; i11 < this.overlayLayerViews.size(); i11++) {
            int iKeyAt = this.overlayLayerViews.keyAt(i11);
            PlatformOverlayView platformOverlayViewValueAt = this.overlayLayerViews.valueAt(i11);
            if (this.currentFrameUsedOverlayLayerIds.contains(Integer.valueOf(iKeyAt))) {
                this.flutterView.attachOverlaySurfaceToRender(platformOverlayViewValueAt);
                z11 &= platformOverlayViewValueAt.acquireLatestImage();
            } else {
                if (!this.flutterViewConvertedToImageView) {
                    platformOverlayViewValueAt.detachFromRenderer();
                }
                platformOverlayViewValueAt.setVisibility(8);
                this.flutterView.removeView(platformOverlayViewValueAt);
            }
        }
        for (int i12 = 0; i12 < this.platformViewParent.size(); i12++) {
            int iKeyAt2 = this.platformViewParent.keyAt(i12);
            FlutterMutatorView flutterMutatorView = this.platformViewParent.get(iKeyAt2);
            if (!this.currentFrameUsedPlatformViewIds.contains(Integer.valueOf(iKeyAt2)) || (!z11 && this.synchronizeToNativeViewHierarchy)) {
                flutterMutatorView.setVisibility(8);
            } else {
                flutterMutatorView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toLogicalPixels(double d11, float f11) {
        return (int) Math.round(d11 / ((double) f11));
    }

    private static void translateMotionEvent(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean validateDirection(int i11) {
        return i11 == 0 || i11 == 1;
    }

    public boolean checkInputConnectionProxy(@Nullable View view) {
        if (view == null || !this.contextToEmbeddedView.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.contextToEmbeddedView.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    @NonNull
    @VisibleForTesting
    public FlutterOverlaySurface createOverlaySurface(@NonNull PlatformOverlayView platformOverlayView) {
        int i11 = this.nextOverlayLayerId;
        this.nextOverlayLayerId = i11 + 1;
        this.overlayLayerViews.put(i11, platformOverlayView);
        return new FlutterOverlaySurface(i11, platformOverlayView.getSurface());
    }

    public void destroyOverlaySurfaces() {
        for (int i11 = 0; i11 < this.overlayLayerViews.size(); i11++) {
            PlatformOverlayView platformOverlayViewValueAt = this.overlayLayerViews.valueAt(i11);
            platformOverlayViewValueAt.detachFromRenderer();
            platformOverlayViewValueAt.closeImageReader();
        }
    }

    public void detachFromView() {
        for (int i11 = 0; i11 < this.viewWrappers.size(); i11++) {
            this.flutterView.removeView(this.viewWrappers.valueAt(i11));
        }
        for (int i12 = 0; i12 < this.platformViewParent.size(); i12++) {
            this.flutterView.removeView(this.platformViewParent.valueAt(i12));
        }
        destroyOverlaySurfaces();
        removeOverlaySurfaces();
        this.flutterView = null;
        this.flutterViewConvertedToImageView = false;
        for (int i13 = 0; i13 < this.platformViews.size(); i13++) {
            this.platformViews.valueAt(i13).onFlutterViewDetached();
        }
    }

    public void detachTextInputPlugin() {
        this.textInputPlugin = null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m87551a(PlatformViewsController platformViewsController, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, View view, boolean z11) {
        if (z11) {
            platformViewsController.platformViewsChannel.invokeViewFocused(platformViewCreationRequest.viewId);
        } else {
            platformViewsController.getClass();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m87552b(PlatformViewsController platformViewsController, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, View view, boolean z11) {
        if (z11) {
            platformViewsController.platformViewsChannel.invokeViewFocused(platformViewCreationRequest.viewId);
            return;
        }
        TextInputPlugin textInputPlugin = platformViewsController.textInputPlugin;
        if (textInputPlugin != null) {
            textInputPlugin.clearPlatformViewClient(platformViewCreationRequest.viewId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void configureForHybridComposition(@NonNull PlatformView platformView, @NonNull PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        enforceMinimumAndroidApiVersion(19);
        Log.m87479i(TAG, "Using hybrid composition for platform view: " + platformViewCreationRequest.viewId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long configureForVirtualDisplay(@NonNull PlatformView platformView, @NonNull final PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        enforceMinimumAndroidApiVersion(20);
        Log.m87479i(TAG, "Hosting view in a virtual display for platform view: " + platformViewCreationRequest.viewId);
        PlatformViewRenderTarget platformViewRenderTargetMakePlatformViewRenderTarget = makePlatformViewRenderTarget(this.textureRegistry);
        VirtualDisplayController virtualDisplayControllerCreate = VirtualDisplayController.create(this.context, this.accessibilityEventsDelegate, platformView, platformViewRenderTargetMakePlatformViewRenderTarget, toPhysicalPixels(platformViewCreationRequest.logicalWidth), toPhysicalPixels(platformViewCreationRequest.logicalHeight), platformViewCreationRequest.viewId, null, new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.g
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                PlatformViewsController.m87551a(this.f86796b, platformViewCreationRequest, view, z11);
            }
        });
        if (virtualDisplayControllerCreate != null) {
            this.vdControllers.put(Integer.valueOf(platformViewCreationRequest.viewId), virtualDisplayControllerCreate);
            View view = platformView.getView();
            this.contextToEmbeddedView.put(view.getContext(), view);
            return platformViewRenderTargetMakePlatformViewRenderTarget.getId();
        }
        throw new IllegalStateException("Failed creating virtual display for a " + platformViewCreationRequest.viewType + " with id: " + platformViewCreationRequest.viewId);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m87554d(PlatformViewsController platformViewsController, int i11, View view, boolean z11) {
        if (z11) {
            platformViewsController.platformViewsChannel.invokeViewFocused(i11);
            return;
        }
        TextInputPlugin textInputPlugin = platformViewsController.textInputPlugin;
        if (textInputPlugin != null) {
            textInputPlugin.clearPlatformViewClient(i11);
        }
    }

    private void diposeAllViews() {
        while (this.platformViews.size() > 0) {
            this.channelHandler.dispose(this.platformViews.keyAt(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enforceMinimumAndroidApiVersion(int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= i11) {
            return;
        }
        throw new IllegalStateException("Trying to use platform views with API " + i12 + ", required API level is: " + i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ensureValidRequest(@NonNull PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        if (validateDirection(platformViewCreationRequest.direction)) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + platformViewCreationRequest.direction + "(view id: " + platformViewCreationRequest.viewId + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    private void initializeRootImageViewIfNeeded() {
        if (!this.synchronizeToNativeViewHierarchy || this.flutterViewConvertedToImageView) {
            return;
        }
        this.flutterView.convertToImageView();
        this.flutterViewConvertedToImageView = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lockInputConnection(@NonNull VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.lockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionLocked();
    }

    private static PlatformViewRenderTarget makePlatformViewRenderTarget(TextureRegistry textureRegistry) {
        int i11;
        if (enableSurfaceProducerRenderTarget && (i11 = Build.VERSION.SDK_INT) >= 29) {
            TextureRegistry.SurfaceProducer surfaceProducerCreateSurfaceProducer = textureRegistry.createSurfaceProducer(i11 <= 34 ? TextureRegistry.SurfaceLifecycle.resetInBackground : TextureRegistry.SurfaceLifecycle.manual);
            Log.m87479i(TAG, "PlatformView is using SurfaceProducer backend");
            return new SurfaceProducerPlatformViewRenderTarget(surfaceProducerCreateSurfaceProducer);
        }
        if (!enableImageRenderTarget || Build.VERSION.SDK_INT < 29) {
            TextureRegistry.SurfaceTextureEntry surfaceTextureEntryCreateSurfaceTexture = textureRegistry.createSurfaceTexture();
            Log.m87479i(TAG, "PlatformView is using SurfaceTexture backend");
            return new SurfaceTexturePlatformViewRenderTarget(surfaceTextureEntryCreateSurfaceTexture);
        }
        TextureRegistry.ImageTextureEntry imageTextureEntryCreateImageTexture = textureRegistry.createImageTexture();
        Log.m87479i(TAG, "PlatformView is using ImageReader backend");
        return new ImageReaderPlatformViewRenderTarget(imageTextureEntryCreateImageTexture);
    }

    private void maybeInvokeOnFlutterViewAttached(PlatformView platformView) {
        FlutterView flutterView = this.flutterView;
        if (flutterView == null) {
            Log.m87479i(TAG, "null flutterView");
        } else {
            platformView.onFlutterViewAttached(flutterView);
        }
    }

    private static MotionEvent.PointerCoords parsePointerCoords(Object obj, float f11) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        double d11 = f11;
        pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d11);
        pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d11);
        pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d11);
        pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d11);
        pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d11);
        pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d11);
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> parsePointerCoordsList(Object obj, float f11) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(parsePointerCoords(it.next(), f11));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties parsePointerProperties(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> parsePointerPropertiesList(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(parsePointerProperties(it.next()));
        }
        return arrayList;
    }

    private void removeOverlaySurfaces() {
        if (this.flutterView == null) {
            Log.m87477e(TAG, "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i11 = 0; i11 < this.overlayLayerViews.size(); i11++) {
            this.flutterView.removeView(this.overlayLayerViews.valueAt(i11));
        }
        this.overlayLayerViews.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toLogicalPixels(double d11) {
        return toLogicalPixels(d11, getDisplayDensity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unlockInputConnection(@NonNull VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.unlockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionUnlocked();
    }

    public void attach(@Nullable Context context, @NonNull TextureRegistry textureRegistry, @NonNull DartExecutor dartExecutor) {
        if (this.context != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.context = context;
        this.textureRegistry = textureRegistry;
        PlatformViewsChannel platformViewsChannel = new PlatformViewsChannel(dartExecutor);
        this.platformViewsChannel = platformViewsChannel;
        platformViewsChannel.setPlatformViewsHandler(this.channelHandler);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void attachAccessibilityBridge(@NonNull AccessibilityBridge accessibilityBridge) {
        this.accessibilityEventsDelegate.setAccessibilityBridge(accessibilityBridge);
    }

    public void attachTextInputPlugin(@NonNull TextInputPlugin textInputPlugin) {
        this.textInputPlugin = textInputPlugin;
    }

    public void attachToFlutterRenderer(@NonNull FlutterRenderer flutterRenderer) {
        this.androidTouchProcessor = new AndroidTouchProcessor(flutterRenderer, true);
    }

    public void attachToView(@NonNull FlutterView flutterView) {
        this.flutterView = flutterView;
        for (int i11 = 0; i11 < this.viewWrappers.size(); i11++) {
            this.flutterView.addView(this.viewWrappers.valueAt(i11));
        }
        for (int i12 = 0; i12 < this.platformViewParent.size(); i12++) {
            this.flutterView.addView(this.platformViewParent.valueAt(i12));
        }
        for (int i13 = 0; i13 < this.platformViews.size(); i13++) {
            this.platformViews.valueAt(i13).onFlutterViewAttached(this.flutterView);
        }
    }

    @TargetApi(23)
    @VisibleForTesting(otherwise = 3)
    public long configureForTextureLayerComposition(@NonNull PlatformView platformView, @NonNull final PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        PlatformViewWrapper platformViewWrapper;
        long j11;
        enforceMinimumAndroidApiVersion(23);
        Log.m87479i(TAG, "Hosting view in view hierarchy for platform view: " + platformViewCreationRequest.viewId);
        int physicalPixels = toPhysicalPixels(platformViewCreationRequest.logicalWidth);
        int physicalPixels2 = toPhysicalPixels(platformViewCreationRequest.logicalHeight);
        if (this.usesSoftwareRendering) {
            platformViewWrapper = new PlatformViewWrapper(this.context);
            j11 = -1;
        } else {
            PlatformViewRenderTarget platformViewRenderTargetMakePlatformViewRenderTarget = makePlatformViewRenderTarget(this.textureRegistry);
            PlatformViewWrapper platformViewWrapper2 = new PlatformViewWrapper(this.context, platformViewRenderTargetMakePlatformViewRenderTarget);
            long id2 = platformViewRenderTargetMakePlatformViewRenderTarget.getId();
            platformViewWrapper = platformViewWrapper2;
            j11 = id2;
        }
        platformViewWrapper.setTouchProcessor(this.androidTouchProcessor);
        platformViewWrapper.resizeRenderTarget(physicalPixels, physicalPixels2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(physicalPixels, physicalPixels2);
        int physicalPixels3 = toPhysicalPixels(platformViewCreationRequest.logicalTop);
        int physicalPixels4 = toPhysicalPixels(platformViewCreationRequest.logicalLeft);
        layoutParams.topMargin = physicalPixels3;
        layoutParams.leftMargin = physicalPixels4;
        platformViewWrapper.setLayoutParams(layoutParams);
        View view = platformView.getView();
        view.setLayoutParams(new FrameLayout.LayoutParams(physicalPixels, physicalPixels2));
        view.setImportantForAccessibility(4);
        platformViewWrapper.addView(view);
        platformViewWrapper.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.f
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z11) {
                PlatformViewsController.m87552b(this.f86794b, platformViewCreationRequest, view2, z11);
            }
        });
        this.flutterView.addView(platformViewWrapper);
        this.viewWrappers.append(platformViewCreationRequest.viewId, platformViewWrapper);
        maybeInvokeOnFlutterViewAttached(platformView);
        return j11;
    }

    @VisibleForTesting(otherwise = 3)
    public PlatformView createPlatformView(@NonNull PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, boolean z11) {
        PlatformViewFactory factory = this.registry.getFactory(platformViewCreationRequest.viewType);
        if (factory == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.viewType);
        }
        PlatformView platformViewCreate = factory.create(z11 ? new MutableContextWrapper(this.context) : this.context, platformViewCreationRequest.viewId, platformViewCreationRequest.params != null ? factory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params) : null);
        View view = platformViewCreate.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(platformViewCreationRequest.direction);
        this.platformViews.put(platformViewCreationRequest.viewId, platformViewCreate);
        maybeInvokeOnFlutterViewAttached(platformViewCreate);
        return platformViewCreate;
    }

    @UiThread
    public void detach() {
        PlatformViewsChannel platformViewsChannel = this.platformViewsChannel;
        if (platformViewsChannel != null) {
            platformViewsChannel.setPlatformViewsHandler(null);
        }
        destroyOverlaySurfaces();
        this.platformViewsChannel = null;
        this.context = null;
        this.textureRegistry = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void detachAccessibilityBridge() {
        this.accessibilityEventsDelegate.setAccessibilityBridge(null);
    }

    @VisibleForTesting
    public void disposePlatformView(int i11) {
        this.channelHandler.dispose(i11);
    }

    @VisibleForTesting
    public SparseArray<PlatformOverlayView> getOverlayLayerViews() {
        return this.overlayLayerViews;
    }

    public PlatformViewRegistry getRegistry() {
        return this.registry;
    }

    @VisibleForTesting
    public boolean initializePlatformViewIfNeeded(final int i11) {
        PlatformView platformView = this.platformViews.get(i11);
        if (platformView == null) {
            return false;
        }
        if (this.platformViewParent.get(i11) != null) {
            return true;
        }
        View view = platformView.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.context;
        FlutterMutatorView flutterMutatorView = new FlutterMutatorView(context, context.getResources().getDisplayMetrics().density, this.androidTouchProcessor);
        flutterMutatorView.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z11) {
                PlatformViewsController.m87554d(this.f86792b, i11, view2, z11);
            }
        });
        this.platformViewParent.put(i11, flutterMutatorView);
        view.setImportantForAccessibility(4);
        flutterMutatorView.addView(view);
        this.flutterView.addView(flutterMutatorView);
        return true;
    }

    public void onBeginFrame() {
        this.currentFrameUsedOverlayLayerIds.clear();
        this.currentFrameUsedPlatformViewIds.clear();
    }

    public void onDisplayOverlaySurface(int i11, int i12, int i13, int i14, int i15) {
        if (this.overlayLayerViews.get(i11) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i11 + ") doesn't exist");
        }
        initializeRootImageViewIfNeeded();
        PlatformOverlayView platformOverlayView = this.overlayLayerViews.get(i11);
        if (platformOverlayView.getParent() == null) {
            this.flutterView.addView(platformOverlayView);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i14, i15);
        layoutParams.leftMargin = i12;
        layoutParams.topMargin = i13;
        platformOverlayView.setLayoutParams(layoutParams);
        platformOverlayView.setVisibility(0);
        platformOverlayView.bringToFront();
        this.currentFrameUsedOverlayLayerIds.add(Integer.valueOf(i11));
    }

    public void onEndFrame() {
        boolean z11 = false;
        if (this.flutterViewConvertedToImageView && this.currentFrameUsedPlatformViewIds.isEmpty()) {
            this.flutterViewConvertedToImageView = false;
            this.flutterView.revertImageView(new Runnable() { // from class: io.flutter.plugin.platform.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86798b.finishFrame(false);
                }
            });
        } else {
            if (this.flutterViewConvertedToImageView && this.flutterView.acquireLatestImageViewFrame()) {
                z11 = true;
            }
            finishFrame(z11);
        }
    }

    public void onResume() {
        Iterator<VirtualDisplayController> it = this.vdControllers.values().iterator();
        while (it.hasNext()) {
            it.next().resetSurface();
        }
    }

    public void onTrimMemory(int i11) {
        if (i11 < 40) {
            return;
        }
        Iterator<VirtualDisplayController> it = this.vdControllers.values().iterator();
        while (it.hasNext()) {
            it.next().clearSurface();
        }
    }

    public void setSoftwareRendering(boolean z11) {
        this.usesSoftwareRendering = z11;
    }

    @VisibleForTesting
    public MotionEvent toMotionEvent(float f11, PlatformViewsChannel.PlatformViewTouch platformViewTouch, boolean z11) {
        MotionEvent motionEventPop = this.motionEventTracker.pop(MotionEventTracker.MotionEventId.from(platformViewTouch.motionEventId));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) parsePointerCoordsList(platformViewTouch.rawPointerCoords, f11).toArray(new MotionEvent.PointerCoords[platformViewTouch.pointerCount]);
        if (z11 || motionEventPop == null) {
            return MotionEvent.obtain(platformViewTouch.downTime.longValue(), platformViewTouch.eventTime.longValue(), platformViewTouch.action, platformViewTouch.pointerCount, (MotionEvent.PointerProperties[]) parsePointerPropertiesList(platformViewTouch.rawPointerPropertiesList).toArray(new MotionEvent.PointerProperties[platformViewTouch.pointerCount]), pointerCoordsArr, platformViewTouch.metaState, platformViewTouch.buttonState, platformViewTouch.xPrecision, platformViewTouch.yPrecision, platformViewTouch.deviceId, platformViewTouch.edgeFlags, platformViewTouch.source, platformViewTouch.flags);
        }
        translateMotionEvent(motionEventPop, pointerCoordsArr);
        return motionEventPop;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public boolean usesVirtualDisplay(int i11) {
        return this.vdControllers.containsKey(Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toPhysicalPixels(double d11) {
        return (int) Math.round(d11 * ((double) getDisplayDensity()));
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    @Nullable
    public View getPlatformViewById(int i11) {
        if (usesVirtualDisplay(i11)) {
            return this.vdControllers.get(Integer.valueOf(i11)).getView();
        }
        PlatformView platformView = this.platformViews.get(i11);
        if (platformView == null) {
            return null;
        }
        return platformView.getView();
    }

    public void onDetachedFromJNI() {
        diposeAllViews();
    }

    public void onDisplayPlatformView(int i11, int i12, int i13, int i14, int i15, int i16, int i17, @NonNull FlutterMutatorsStack flutterMutatorsStack) {
        initializeRootImageViewIfNeeded();
        if (!initializePlatformViewIfNeeded(i11)) {
            return;
        }
        FlutterMutatorView flutterMutatorView = this.platformViewParent.get(i11);
        flutterMutatorView.readyToDisplay(flutterMutatorsStack, i12, i13, i14, i15);
        flutterMutatorView.setVisibility(0);
        flutterMutatorView.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i16, i17);
        View view = this.platformViews.get(i11).getView();
        if (view != null) {
            view.setLayoutParams(layoutParams);
            view.bringToFront();
        }
        this.currentFrameUsedPlatformViewIds.add(Integer.valueOf(i11));
    }

    public void onPreEngineRestart() {
        diposeAllViews();
    }

    @NonNull
    public FlutterOverlaySurface createOverlaySurface() {
        return createOverlaySurface(new PlatformOverlayView(this.flutterView.getContext(), this.flutterView.getWidth(), this.flutterView.getHeight(), this.accessibilityEventsDelegate));
    }
}
