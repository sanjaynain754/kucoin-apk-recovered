package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.media3.p022ui.C3655l0;
import io.flutter.Log;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.MotionEventTracker;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.view.AccessibilityBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class PlatformViewsController2 implements PlatformViewsAccessibilityDelegate {
    private static final String TAG = "PlatformViewsController2";
    private AndroidTouchProcessor androidTouchProcessor;
    private Context context;
    private FlutterView flutterView;
    private PlatformViewsChannel2 platformViewsChannel;
    private PlatformViewRegistryImpl registry;

    @Nullable
    private TextInputPlugin textInputPlugin;
    private FlutterJNI flutterJNI = null;
    private Surface overlayerSurface = null;
    private SurfaceControl overlaySurfaceControl = null;
    private final PlatformViewsChannel2.PlatformViewsHandler channelHandler = new PlatformViewsChannel2.PlatformViewsHandler() { // from class: io.flutter.plugin.platform.PlatformViewsController2.1
        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void clearFocus(int i11) {
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i11);
            if (platformView == null) {
                Log.m87477e(PlatformViewsController2.TAG, "Clearing focus on an unknown view with id: " + i11);
                return;
            }
            View view = platformView.getView();
            if (view != null) {
                view.clearFocus();
                return;
            }
            Log.m87477e(PlatformViewsController2.TAG, "Clearing focus on a null view with id: " + i11);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void createPlatformView(@NonNull PlatformViewsChannel2.PlatformViewCreationRequest platformViewCreationRequest) {
            PlatformViewsController2.this.createFlutterPlatformView(platformViewCreationRequest);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void dispose(int i11) {
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i11);
            if (platformView == null) {
                Log.m87477e(PlatformViewsController2.TAG, "Disposing unknown platform view with id: " + i11);
                return;
            }
            if (platformView.getView() != null) {
                View view = platformView.getView();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            PlatformViewsController2.this.platformViews.remove(i11);
            try {
                platformView.dispose();
            } catch (RuntimeException e11) {
                Log.m87478e(PlatformViewsController2.TAG, "Disposing platform view threw an exception", e11);
            }
            FlutterMutatorView flutterMutatorView = (FlutterMutatorView) PlatformViewsController2.this.platformViewParent.get(i11);
            if (flutterMutatorView != null) {
                flutterMutatorView.removeAllViews();
                flutterMutatorView.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup2 = (ViewGroup) flutterMutatorView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(flutterMutatorView);
                }
                PlatformViewsController2.this.platformViewParent.remove(i11);
            }
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public boolean isSurfaceControlEnabled() {
            if (PlatformViewsController2.this.flutterJNI == null) {
                return false;
            }
            return PlatformViewsController2.this.flutterJNI.IsSurfaceControlEnabled();
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void onTouch(@NonNull PlatformViewsChannel2.PlatformViewTouch platformViewTouch) {
            int i11 = platformViewTouch.viewId;
            float f11 = PlatformViewsController2.this.context.getResources().getDisplayMetrics().density;
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i11);
            if (platformView == null) {
                Log.m87477e(PlatformViewsController2.TAG, "Sending touch to an unknown view with id: " + i11);
                return;
            }
            View view = platformView.getView();
            if (view != null) {
                view.dispatchTouchEvent(PlatformViewsController2.this.toMotionEvent(f11, platformViewTouch));
                return;
            }
            Log.m87477e(PlatformViewsController2.TAG, "Sending touch to a null view with id: " + i11);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void setDirection(int i11, int i12) {
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i11);
            if (platformView == null) {
                Log.m87477e(PlatformViewsController2.TAG, "Setting direction to an unknown view with id: " + i11);
                return;
            }
            View view = platformView.getView();
            if (view != null) {
                view.setLayoutDirection(i12);
                return;
            }
            Log.m87477e(PlatformViewsController2.TAG, "Setting direction to a null view with id: " + i11);
        }
    };
    private final AccessibilityEventsDelegate accessibilityEventsDelegate = new AccessibilityEventsDelegate();
    private final SparseArray<PlatformView> platformViews = new SparseArray<>();
    private final SparseArray<FlutterMutatorView> platformViewParent = new SparseArray<>();
    private final ArrayList<SurfaceControl.Transaction> pendingTransactions = new ArrayList<>();
    private final ArrayList<SurfaceControl.Transaction> activeTransactions = new ArrayList<>();
    private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();

    private int toLogicalPixels(double d11, float f11) {
        return (int) Math.round(d11 / ((double) f11));
    }

    private static void translateMotionEvent(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    private static boolean validateDirection(int i11) {
        return i11 == 0 || i11 == 1;
    }

    public void detachFromView() {
        for (int i11 = 0; i11 < this.platformViewParent.size(); i11++) {
            this.flutterView.removeView(this.platformViewParent.valueAt(i11));
        }
        destroyOverlaySurface();
        this.flutterView = null;
        for (int i12 = 0; i12 < this.platformViews.size(); i12++) {
            this.platformViews.valueAt(i12).onFlutterViewDetached();
        }
    }

    public void detachTextInputPlugin() {
        this.textInputPlugin = null;
    }

    public synchronized void swapTransactions() {
        try {
            this.activeTransactions.clear();
            for (int i11 = 0; i11 < this.pendingTransactions.size(); i11++) {
                this.activeTransactions.add(C38861q.m87571a(this.pendingTransactions.get(i11)));
            }
            this.pendingTransactions.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public boolean usesVirtualDisplay(int i11) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m87556a(PlatformViewsController2 platformViewsController2, int i11, View view, boolean z11) {
        if (z11) {
            platformViewsController2.platformViewsChannel.invokeViewFocused(i11);
            return;
        }
        TextInputPlugin textInputPlugin = platformViewsController2.textInputPlugin;
        if (textInputPlugin != null) {
            textInputPlugin.clearPlatformViewClient(i11);
        }
    }

    private void diposeAllViews() {
        while (this.platformViews.size() > 0) {
            this.channelHandler.dispose(this.platformViews.keyAt(0));
        }
    }

    private float getDisplayDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    private void lockInputConnection(@NonNull VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.lockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionLocked();
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

    private int toLogicalPixels(double d11) {
        return toLogicalPixels(d11, getDisplayDensity());
    }

    private void unlockInputConnection(@NonNull VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.unlockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionUnlocked();
    }

    public void attach(@Nullable Context context, @NonNull DartExecutor dartExecutor) {
        if (this.context != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.context = context;
        PlatformViewsChannel2 platformViewsChannel2 = new PlatformViewsChannel2(dartExecutor);
        this.platformViewsChannel = platformViewsChannel2;
        platformViewsChannel2.setPlatformViewsHandler(this.channelHandler);
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
        for (int i11 = 0; i11 < this.platformViewParent.size(); i11++) {
            this.flutterView.addView(this.platformViewParent.valueAt(i11));
        }
        for (int i12 = 0; i12 < this.platformViews.size(); i12++) {
            this.platformViews.valueAt(i12).onFlutterViewAttached(this.flutterView);
        }
    }

    public PlatformView createFlutterPlatformView(@NonNull PlatformViewsChannel2.PlatformViewCreationRequest platformViewCreationRequest) {
        PlatformViewFactory factory = this.registry.getFactory(platformViewCreationRequest.viewType);
        if (factory == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.viewType);
        }
        PlatformView platformViewCreate = factory.create(this.context, platformViewCreationRequest.viewId, platformViewCreationRequest.params != null ? factory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params) : null);
        View view = platformViewCreate.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(platformViewCreationRequest.direction);
        this.platformViews.put(platformViewCreationRequest.viewId, platformViewCreate);
        maybeInvokeOnFlutterViewAttached(platformViewCreate);
        return platformViewCreate;
    }

    @RequiresApi(34)
    @TargetApi(34)
    public FlutterOverlaySurface createOverlaySurface() {
        if (this.overlayerSurface == null) {
            SurfaceControl.Builder builderM87568a = C38858n.m87568a();
            builderM87568a.setBufferSize(this.flutterView.getWidth(), this.flutterView.getHeight());
            builderM87568a.setFormat(1);
            builderM87568a.setName("Flutter Overlay Surface");
            builderM87568a.setOpaque(false);
            builderM87568a.setHidden(false);
            SurfaceControl surfaceControlBuild = builderM87568a.build();
            SurfaceControl.Transaction transactionBuildReparentTransaction = this.flutterView.getRootSurfaceControl().buildReparentTransaction(surfaceControlBuild);
            transactionBuildReparentTransaction.setLayer(surfaceControlBuild, 1000);
            transactionBuildReparentTransaction.apply();
            this.overlayerSurface = C38859o.m87569a(surfaceControlBuild);
            this.overlaySurfaceControl = surfaceControlBuild;
        }
        return new FlutterOverlaySurface(0, this.overlayerSurface);
    }

    public void destroyOverlaySurface() {
        Surface surface = this.overlayerSurface;
        if (surface != null) {
            surface.release();
            this.overlayerSurface = null;
            this.overlaySurfaceControl = null;
        }
    }

    @UiThread
    public void detach() {
        PlatformViewsChannel2 platformViewsChannel2 = this.platformViewsChannel;
        if (platformViewsChannel2 != null) {
            platformViewsChannel2.setPlatformViewsHandler(null);
        }
        destroyOverlaySurface();
        this.platformViewsChannel = null;
        this.context = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void detachAccessibilityBridge() {
        this.accessibilityEventsDelegate.setAccessibilityBridge(null);
    }

    @VisibleForTesting
    public void disposePlatformView(int i11) {
        this.channelHandler.dispose(i11);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    @Nullable
    public View getPlatformViewById(int i11) {
        PlatformView platformView = this.platformViews.get(i11);
        if (platformView == null) {
            return null;
        }
        return platformView.getView();
    }

    public PlatformViewRegistry getRegistry() {
        return this.registry;
    }

    @RequiresApi(34)
    @TargetApi(34)
    public void hideOverlaySurface() {
        if (this.overlaySurfaceControl == null) {
            return;
        }
        SurfaceControl.Transaction transactionM3591a = C3655l0.m3591a();
        transactionM3591a.setVisibility(this.overlaySurfaceControl, false);
        transactionM3591a.apply();
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
        flutterMutatorView.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.y
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z11) {
                PlatformViewsController2.m87556a(this.f86803b, i11, view2, z11);
            }
        });
        this.platformViewParent.put(i11, flutterMutatorView);
        view.setImportantForAccessibility(4);
        flutterMutatorView.addView(view);
        this.flutterView.addView(flutterMutatorView);
        return true;
    }

    public void setFlutterJNI(FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    public void setRegistry(@NonNull PlatformViewRegistry platformViewRegistry) {
        this.registry = (PlatformViewRegistryImpl) platformViewRegistry;
    }

    @RequiresApi(34)
    @TargetApi(34)
    public void showOverlaySurface() {
        if (this.overlaySurfaceControl == null) {
            return;
        }
        SurfaceControl.Transaction transactionM3591a = C3655l0.m3591a();
        transactionM3591a.setVisibility(this.overlaySurfaceControl, true);
        transactionM3591a.apply();
    }

    @VisibleForTesting
    public MotionEvent toMotionEvent(float f11, PlatformViewsChannel2.PlatformViewTouch platformViewTouch) {
        MotionEvent motionEventPop = this.motionEventTracker.pop(MotionEventTracker.MotionEventId.from(platformViewTouch.motionEventId));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) parsePointerCoordsList(platformViewTouch.rawPointerCoords, f11).toArray(new MotionEvent.PointerCoords[platformViewTouch.pointerCount]);
        if (motionEventPop != null) {
            translateMotionEvent(motionEventPop, pointerCoordsArr);
            return motionEventPop;
        }
        return MotionEvent.obtain(platformViewTouch.downTime.longValue(), platformViewTouch.eventTime.longValue(), platformViewTouch.action, platformViewTouch.pointerCount, (MotionEvent.PointerProperties[]) parsePointerPropertiesList(platformViewTouch.rawPointerPropertiesList).toArray(new MotionEvent.PointerProperties[platformViewTouch.pointerCount]), pointerCoordsArr, platformViewTouch.metaState, platformViewTouch.buttonState, platformViewTouch.xPrecision, platformViewTouch.yPrecision, platformViewTouch.deviceId, platformViewTouch.edgeFlags, platformViewTouch.source, platformViewTouch.flags);
    }

    private int toPhysicalPixels(double d11) {
        return (int) Math.round(d11 * ((double) getDisplayDensity()));
    }

    @RequiresApi(34)
    @TargetApi(34)
    public void applyTransactions() {
        SurfaceControl.Transaction transactionM3591a = C3655l0.m3591a();
        for (int i11 = 0; i11 < this.pendingTransactions.size(); i11++) {
            transactionM3591a = transactionM3591a.merge(C38861q.m87571a(this.pendingTransactions.get(i11)));
        }
        transactionM3591a.apply();
        this.pendingTransactions.clear();
    }

    @RequiresApi(34)
    @TargetApi(34)
    public SurfaceControl.Transaction createTransaction() {
        SurfaceControl.Transaction transactionM3591a = C3655l0.m3591a();
        this.pendingTransactions.add(transactionM3591a);
        return transactionM3591a;
    }

    public void onDetachedFromJNI() {
        diposeAllViews();
    }

    public void onDisplayPlatformView(int i11, int i12, int i13, int i14, int i15, int i16, int i17, @NonNull FlutterMutatorsStack flutterMutatorsStack) {
        if (initializePlatformViewIfNeeded(i11)) {
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
        }
    }

    @RequiresApi(34)
    @TargetApi(34)
    public void onEndFrame() {
        SurfaceControl.Transaction transactionM3591a = C3655l0.m3591a();
        for (int i11 = 0; i11 < this.activeTransactions.size(); i11++) {
            transactionM3591a = transactionM3591a.merge(C38861q.m87571a(this.activeTransactions.get(i11)));
        }
        this.activeTransactions.clear();
        this.flutterView.invalidate();
        this.flutterView.getRootSurfaceControl().applyTransactionOnDraw(transactionM3591a);
    }

    public void onPreEngineRestart() {
        diposeAllViews();
    }
}
