package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.AnyThread;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.MainThread;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.impl.ZoomGestureDetector;
import androidx.camera.view.internal.ScreenFlashUiInfo;
import androidx.camera.view.internal.compat.quirk.DeviceQuirks;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.camera.view.transform.OutputTransform;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public final class PreviewView extends FrameLayout {

    @ColorRes
    static final int DEFAULT_BACKGROUND_COLOR = 17170444;
    private static final ImplementationMode DEFAULT_IMPL_MODE = ImplementationMode.PERFORMANCE;
    private static final String TAG = "PreviewView";
    final AtomicReference<PreviewStreamStateObserver> mActiveStreamStateObserver;
    CameraController mCameraController;
    CameraInfoInternal mCameraInfoInternal;
    private final DisplayRotationListener mDisplayRotationListener;

    @VisibleForTesting
    PreviewViewImplementation mImplementation;
    ImplementationMode mImplementationMode;
    OnFrameUpdateListener mOnFrameUpdateListener;
    Executor mOnFrameUpdateListenerExecutor;
    private final View.OnLayoutChangeListener mOnLayoutChangeListener;
    final MutableLiveData<StreamState> mPreviewStreamStateLiveData;
    final PreviewTransformation mPreviewTransform;
    PreviewViewMeteringPointFactory mPreviewViewMeteringPointFactory;
    final ScreenFlashView mScreenFlashView;
    final Preview.SurfaceProvider mSurfaceProvider;
    private MotionEvent mTouchUpEvent;
    boolean mUseDisplayRotation;
    private final ZoomGestureDetector mZoomGestureDetector;

    /* JADX INFO: renamed from: androidx.camera.view.PreviewView$1 */
    public class C14201 implements Preview.SurfaceProvider {
        public C14201() {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m2242b(C14201 c14201, PreviewStreamStateObserver previewStreamStateObserver, CameraInternal cameraInternal) {
            if (C1454t.m2255a(PreviewView.this.mActiveStreamStateObserver, previewStreamStateObserver, null)) {
                previewStreamStateObserver.updatePreviewStreamState(StreamState.IDLE);
            }
            previewStreamStateObserver.clear();
            cameraInternal.getCameraState().removeObserver(previewStreamStateObserver);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m2243c(C14201 c14201, CameraInternal cameraInternal, SurfaceRequest surfaceRequest, SurfaceRequest.TransformationInfo transformationInfo) {
            boolean z11;
            PreviewView previewView;
            PreviewViewImplementation previewViewImplementation;
            c14201.getClass();
            Logger.m1866d(PreviewView.TAG, "Preview transformation info updated. " + transformationInfo);
            if (cameraInternal.getCameraInfoInternal().getLensFacing() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            PreviewView.this.mPreviewTransform.setTransformationInfo(transformationInfo, surfaceRequest.getResolution(), z11);
            if (transformationInfo.getTargetRotation() != -1 && ((previewViewImplementation = (previewView = PreviewView.this).mImplementation) == null || !(previewViewImplementation instanceof SurfaceViewImplementation))) {
                previewView.mUseDisplayRotation = false;
            } else {
                PreviewView.this.mUseDisplayRotation = true;
            }
            PreviewView.this.redrawPreview();
        }

        @Override // androidx.camera.core.Preview.SurfaceProvider
        @AnyThread
        public void onSurfaceRequested(final SurfaceRequest surfaceRequest) {
            Executor executor;
            PreviewViewImplementation surfaceViewImplementation;
            if (!Threads.isMainThread()) {
                ContextCompat.getMainExecutor(PreviewView.this.getContext()).execute(new Runnable() { // from class: androidx.camera.view.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.this.mSurfaceProvider.onSurfaceRequested(surfaceRequest);
                    }
                });
                return;
            }
            Logger.m1866d(PreviewView.TAG, "Surface requested by Preview.");
            final CameraInternal camera = surfaceRequest.getCamera();
            PreviewView.this.mCameraInfoInternal = camera.getCameraInfoInternal();
            PreviewView.this.mPreviewViewMeteringPointFactory.setSensorRect(camera.getCameraInfoInternal().getSensorRect());
            surfaceRequest.setTransformationInfoListener(ContextCompat.getMainExecutor(PreviewView.this.getContext()), new SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.view.v
                @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
                public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                    PreviewView.C14201.m2243c(this.f2169a, camera, surfaceRequest, transformationInfo);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (!PreviewView.shouldReuseImplementation(previewView.mImplementation, surfaceRequest, previewView.mImplementationMode)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.shouldUseTextureView(surfaceRequest, previewView2.mImplementationMode)) {
                    PreviewView previewView3 = PreviewView.this;
                    surfaceViewImplementation = new TextureViewImplementation(previewView3, previewView3.mPreviewTransform);
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    surfaceViewImplementation = new SurfaceViewImplementation(previewView4, previewView4.mPreviewTransform);
                }
                previewView2.mImplementation = surfaceViewImplementation;
            }
            CameraInfoInternal cameraInfoInternal = camera.getCameraInfoInternal();
            PreviewView previewView5 = PreviewView.this;
            final PreviewStreamStateObserver previewStreamStateObserver = new PreviewStreamStateObserver(cameraInfoInternal, previewView5.mPreviewStreamStateLiveData, previewView5.mImplementation);
            PreviewView.this.mActiveStreamStateObserver.set(previewStreamStateObserver);
            camera.getCameraState().addObserver(ContextCompat.getMainExecutor(PreviewView.this.getContext()), previewStreamStateObserver);
            PreviewView.this.mImplementation.onSurfaceRequested(surfaceRequest, new PreviewViewImplementation.OnSurfaceNotInUseListener() { // from class: androidx.camera.view.w
                @Override // androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener
                public final void onSurfaceNotInUse() {
                    PreviewView.C14201.m2242b(this.f2172a, previewStreamStateObserver, camera);
                }
            });
            PreviewView previewView6 = PreviewView.this;
            if (previewView6.indexOfChild(previewView6.mScreenFlashView) == -1) {
                PreviewView previewView7 = PreviewView.this;
                previewView7.addView(previewView7.mScreenFlashView);
            }
            PreviewView previewView8 = PreviewView.this;
            OnFrameUpdateListener onFrameUpdateListener = previewView8.mOnFrameUpdateListener;
            if (onFrameUpdateListener != null && (executor = previewView8.mOnFrameUpdateListenerExecutor) != null) {
                previewView8.mImplementation.setFrameUpdateListener(executor, onFrameUpdateListener);
            }
        }
    }

    public class DisplayRotationListener implements DisplayManager.DisplayListener {
        public DisplayRotationListener() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i11) {
            Display defaultDisplay = PreviewView.this.getDefaultDisplay();
            if (defaultDisplay == null || defaultDisplay.getDisplayId() != i11) {
                return;
            }
            PreviewView.this.redrawPreview();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i11) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i11) {
        }
    }

    public enum ImplementationMode {
        PERFORMANCE(0),
        COMPATIBLE(1);

        private final int mId;

        public int getId() {
            return this.mId;
        }

        ImplementationMode(int i11) {
            this.mId = i11;
        }

        public static ImplementationMode fromId(int i11) {
            for (ImplementationMode implementationMode : values()) {
                if (implementationMode.mId == i11) {
                    return implementationMode;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i11);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OnFrameUpdateListener {
        void onFrameUpdate(long j11);
    }

    public enum ScaleType {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        private final int mId;

        public int getId() {
            return this.mId;
        }

        ScaleType(int i11) {
            this.mId = i11;
        }

        public static ScaleType fromId(int i11) {
            for (ScaleType scaleType : values()) {
                if (scaleType.mId == i11) {
                    return scaleType;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i11);
        }
    }

    public enum StreamState {
        IDLE,
        STREAMING
    }

    @UiThread
    public PreviewView(Context context) {
        this(context, null);
    }

    @UiThread
    public ViewPort getViewPort() {
        Threads.checkMainThread();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        return getViewPort(defaultDisplay.getRotation());
    }

    @UiThread
    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @UiThread
    private ImageCapture.ScreenFlash getScreenFlashInternal() {
        return this.mScreenFlashView.getScreenFlash();
    }

    private void setScreenFlashUiInfo(ImageCapture.ScreenFlash screenFlash) {
        CameraController cameraController = this.mCameraController;
        if (cameraController == null) {
            Logger.m1866d(TAG, "setScreenFlashUiInfo: mCameraController is null!");
        } else {
            cameraController.setScreenFlashUiInfo(new ScreenFlashUiInfo(ScreenFlashUiInfo.ProviderType.PREVIEW_VIEW, screenFlash));
        }
    }

    @VisibleForTesting
    public static boolean shouldReuseImplementation(PreviewViewImplementation previewViewImplementation, SurfaceRequest surfaceRequest, ImplementationMode implementationMode) {
        return (previewViewImplementation instanceof SurfaceViewImplementation) && !shouldUseTextureView(surfaceRequest, implementationMode);
    }

    public LiveData<StreamState> getPreviewStreamState() {
        return this.mPreviewStreamStateLiveData;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mCameraController == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z11 = motionEvent.getPointerCount() == 1;
        boolean z12 = motionEvent.getAction() == 1;
        boolean z13 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (!z11 || !z12 || !z13) {
            return this.mZoomGestureDetector.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
        }
        this.mTouchUpEvent = motionEvent;
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.mCameraController != null) {
            MotionEvent motionEvent = this.mTouchUpEvent;
            float x11 = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.mTouchUpEvent;
            this.mCameraController.onTapToFocus(this.mPreviewViewMeteringPointFactory, x11, motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f);
        }
        this.mTouchUpEvent = null;
        return super.performClick();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setFrameUpdateListener(Executor executor, OnFrameUpdateListener onFrameUpdateListener) {
        if (this.mImplementationMode == ImplementationMode.PERFORMANCE) {
            throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
        }
        this.mOnFrameUpdateListener = onFrameUpdateListener;
        this.mOnFrameUpdateListenerExecutor = executor;
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation != null) {
            previewViewImplementation.setFrameUpdateListener(executor, onFrameUpdateListener);
        }
    }

    public void setScreenFlashOverlayColor(@ColorInt int i11) {
        this.mScreenFlashView.setBackgroundColor(i11);
    }

    public void updateDisplayRotationIfNeeded() {
        Display defaultDisplay;
        CameraInfoInternal cameraInfoInternal;
        if (!this.mUseDisplayRotation || (defaultDisplay = getDefaultDisplay()) == null || (cameraInfoInternal = this.mCameraInfoInternal) == null) {
            return;
        }
        this.mPreviewTransform.overrideWithDisplayRotation(cameraInfoInternal.getSensorRotationDegrees(defaultDisplay.getRotation()), defaultDisplay.getRotation());
    }

    @UiThread
    public PreviewView(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m2239a(PreviewView previewView, ZoomGestureDetector.ZoomEvent zoomEvent) {
        CameraController cameraController;
        previewView.getClass();
        if ((zoomEvent instanceof ZoomGestureDetector.ZoomEvent.Move) && (cameraController = previewView.mCameraController) != null) {
            cameraController.onPinchToZoom(((ZoomGestureDetector.ZoomEvent.Move) zoomEvent).getIncrementalScaleFactor());
            return true;
        }
        return true;
    }

    @MainThread
    private void attachToControllerIfReady(boolean z11) {
        Threads.checkMainThread();
        ViewPort viewPort = getViewPort();
        if (this.mCameraController != null && viewPort != null && isAttachedToWindow()) {
            try {
                this.mCameraController.attachPreviewSurface(getSurfaceProvider(), viewPort);
            } catch (IllegalStateException e11) {
                if (z11) {
                    Logger.m1869e(TAG, e11.toString(), e11);
                    return;
                }
                throw e11;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2240b(PreviewView previewView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        previewView.getClass();
        if (i13 - i11 == i17 - i15 && i14 - i12 == i18 - i16) {
            return;
        }
        previewView.redrawPreview();
        previewView.attachToControllerIfReady(true);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService("display");
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal != 0) {
            int i11 = 1;
            if (iOrdinal != 1) {
                i11 = 2;
                if (iOrdinal != 2) {
                    i11 = 3;
                    if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                        throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                    }
                }
            }
            return i11;
        }
        return 0;
    }

    public static boolean shouldUseTextureView(SurfaceRequest surfaceRequest, ImplementationMode implementationMode) {
        boolean z11;
        boolean zEquals = surfaceRequest.getCamera().getCameraInfoInternal().getImplementationType().equals(CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY);
        if (DeviceQuirks.get(SurfaceViewStretchedQuirk.class) == null && DeviceQuirks.get(SurfaceViewNotCroppedByParentQuirk.class) == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (Build.VERSION.SDK_INT <= 24 || zEquals || z11) {
            return true;
        }
        int iOrdinal = implementationMode.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + implementationMode);
    }

    @UiThread
    public Bitmap getBitmap() {
        Threads.checkMainThread();
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation == null) {
            return null;
        }
        return previewViewImplementation.getBitmap();
    }

    @UiThread
    public CameraController getController() {
        Threads.checkMainThread();
        return this.mCameraController;
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        if (display != null) {
            return display;
        }
        return getDisplay();
    }

    @UiThread
    public ImplementationMode getImplementationMode() {
        Threads.checkMainThread();
        return this.mImplementationMode;
    }

    @UiThread
    public MeteringPointFactory getMeteringPointFactory() {
        Threads.checkMainThread();
        return this.mPreviewViewMeteringPointFactory;
    }

    @TransformExperimental
    public OutputTransform getOutputTransform() {
        Matrix surfaceToPreviewViewMatrix;
        Threads.checkMainThread();
        try {
            surfaceToPreviewViewMatrix = this.mPreviewTransform.getSurfaceToPreviewViewMatrix(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            surfaceToPreviewViewMatrix = null;
        }
        Rect surfaceCropRect = this.mPreviewTransform.getSurfaceCropRect();
        if (surfaceToPreviewViewMatrix != null && surfaceCropRect != null) {
            surfaceToPreviewViewMatrix.preConcat(TransformUtils.getNormalizedToBuffer(surfaceCropRect));
            if (this.mImplementation instanceof TextureViewImplementation) {
                surfaceToPreviewViewMatrix.postConcat(getMatrix());
            } else if (!getMatrix().isIdentity()) {
                Logger.m1872w(TAG, "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
            }
            return new OutputTransform(surfaceToPreviewViewMatrix, new Size(surfaceCropRect.width(), surfaceCropRect.height()));
        }
        Logger.m1866d(TAG, "Transform info is not ready");
        return null;
    }

    @UiThread
    public ScaleType getScaleType() {
        Threads.checkMainThread();
        return this.mPreviewTransform.getScaleType();
    }

    @UiThread
    public ImageCapture.ScreenFlash getScreenFlash() {
        return getScreenFlashInternal();
    }

    @UiThread
    public Matrix getSensorToViewTransform() {
        Threads.checkMainThread();
        if (getWidth() != 0 && getHeight() != 0) {
            return this.mPreviewTransform.getSensorToViewTransform(new Size(getWidth(), getHeight()), getLayoutDirection());
        }
        return null;
    }

    @UiThread
    public Preview.SurfaceProvider getSurfaceProvider() {
        Threads.checkMainThread();
        return this.mSurfaceProvider;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            startListeningToDisplayChange();
        }
        addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation != null) {
            previewViewImplementation.onAttachedToWindow();
        }
        attachToControllerIfReady(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation != null) {
            previewViewImplementation.onDetachedFromWindow();
        }
        CameraController cameraController = this.mCameraController;
        if (cameraController != null) {
            cameraController.clearPreviewSurface();
        }
        if (!isInEditMode()) {
            stopListeningToDisplayChange();
        }
    }

    @OptIn(markerClass = {TransformExperimental.class})
    @MainThread
    public void redrawPreview() {
        Threads.checkMainThread();
        if (this.mImplementation != null) {
            updateDisplayRotationIfNeeded();
            this.mImplementation.redrawPreview();
        }
        this.mPreviewViewMeteringPointFactory.recalculate(new Size(getWidth(), getHeight()), getLayoutDirection());
        CameraController cameraController = this.mCameraController;
        if (cameraController != null) {
            cameraController.updatePreviewViewTransform(getSensorToViewTransform());
        }
    }

    @UiThread
    public void setController(CameraController cameraController) {
        Threads.checkMainThread();
        CameraController cameraController2 = this.mCameraController;
        if (cameraController2 != null && cameraController2 != cameraController) {
            cameraController2.clearPreviewSurface();
            setScreenFlashUiInfo(null);
        }
        this.mCameraController = cameraController;
        attachToControllerIfReady(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    @UiThread
    public void setImplementationMode(ImplementationMode implementationMode) {
        Threads.checkMainThread();
        this.mImplementationMode = implementationMode;
        if (implementationMode == ImplementationMode.PERFORMANCE && this.mOnFrameUpdateListener != null) {
            throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
        }
    }

    @UiThread
    public void setScaleType(ScaleType scaleType) {
        Threads.checkMainThread();
        this.mPreviewTransform.setScaleType(scaleType);
        redrawPreview();
        attachToControllerIfReady(false);
    }

    @UiThread
    public void setScreenFlashWindow(Window window) {
        Threads.checkMainThread();
        this.mScreenFlashView.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    @VisibleForTesting
    public void startListeningToDisplayChange() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.mDisplayRotationListener, new Handler(Looper.getMainLooper()));
    }

    @VisibleForTesting
    public void stopListeningToDisplayChange() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.mDisplayRotationListener);
    }

    @UiThread
    public PreviewView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        ImplementationMode implementationMode = DEFAULT_IMPL_MODE;
        this.mImplementationMode = implementationMode;
        PreviewTransformation previewTransformation = new PreviewTransformation();
        this.mPreviewTransform = previewTransformation;
        this.mUseDisplayRotation = true;
        this.mPreviewStreamStateLiveData = new MutableLiveData<>(StreamState.IDLE);
        this.mActiveStreamStateObserver = new AtomicReference<>();
        this.mPreviewViewMeteringPointFactory = new PreviewViewMeteringPointFactory(previewTransformation);
        this.mDisplayRotationListener = new DisplayRotationListener();
        this.mOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.camera.view.q
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
                PreviewView.m2240b(this.f2165b, view, i13, i14, i15, i16, i17, i18, i19, i21);
            }
        };
        this.mSurfaceProvider = new C14201();
        Threads.checkMainThread();
        Resources.Theme theme = context.getTheme();
        int[] iArr = C1421R.styleable.PreviewView;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i11, i12);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i11, i12);
        try {
            setScaleType(ScaleType.fromId(typedArrayObtainStyledAttributes.getInteger(C1421R.styleable.PreviewView_scaleType, previewTransformation.getScaleType().getId())));
            setImplementationMode(ImplementationMode.fromId(typedArrayObtainStyledAttributes.getInteger(C1421R.styleable.PreviewView_implementationMode, implementationMode.getId())));
            typedArrayObtainStyledAttributes.recycle();
            this.mZoomGestureDetector = new ZoomGestureDetector(context, new ZoomGestureDetector.OnZoomGestureListener() { // from class: androidx.camera.view.s
                @Override // androidx.camera.view.impl.ZoomGestureDetector.OnZoomGestureListener
                public final boolean onZoomEvent(ZoomGestureDetector.ZoomEvent zoomEvent) {
                    return PreviewView.m2239a(this.f2166a, zoomEvent);
                }
            });
            if (getBackground() == null) {
                setBackgroundColor(ContextCompat.getColor(getContext(), 17170444));
            }
            ScreenFlashView screenFlashView = new ScreenFlashView(context);
            this.mScreenFlashView = screenFlashView;
            screenFlashView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @SuppressLint({"WrongConstant"})
    @UiThread
    public ViewPort getViewPort(int i11) {
        Threads.checkMainThread();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new ViewPort.Builder(new Rational(getWidth(), getHeight()), i11).setScaleType(getViewPortScaleType()).setLayoutDirection(getLayoutDirection()).build();
    }
}
