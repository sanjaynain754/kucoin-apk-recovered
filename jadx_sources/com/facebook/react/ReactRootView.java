package com.facebook.react;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.BlendModeHelper;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.JSPointerDispatcher;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactClippingProhibitedView;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ReactRootViewTagGenerator;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.RootViewUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.systrace.Systrace;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.util.concurrent.atomic.AtomicInteger;
import p302h6.C38115a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class ReactRootView extends FrameLayout implements RootView, ReactRoot {
    private static final String TAG = "ReactRootView";
    private final ReactAndroidHWInputDeviceHelper mAndroidHWInputDeviceHelper;

    @Nullable
    private Bundle mAppProperties;

    @Nullable
    private CustomGlobalLayoutListener mCustomGlobalLayoutListener;
    private int mHeightMeasureSpec;
    private boolean mIsAttachedToInstance;

    @Nullable
    private String mJSModuleName;

    @Nullable
    private JSPointerDispatcher mJSPointerDispatcher;

    @Nullable
    private JSTouchDispatcher mJSTouchDispatcher;
    private int mLastHeight;
    private int mLastOffsetX;
    private int mLastOffsetY;
    private int mLastWidth;

    @Nullable
    private ReactInstanceManager mReactInstanceManager;

    @Nullable
    private ReactRootViewEventListener mRootViewEventListener;
    private int mRootViewTag;
    private boolean mShouldLogContentAppeared;
    private final AtomicInteger mState;
    private int mUIManagerType;
    private boolean mWasMeasured;
    private int mWidthMeasureSpec;

    public class CustomGlobalLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {
        private final int mMinKeyboardHeightDetected;
        private final Rect mVisibleViewArea;
        private boolean mKeyboardIsVisible = false;
        private int mKeyboardHeight = 0;
        private int mDeviceRotation = 0;

        private void emitOrientationChanged(int i11) {
            String str;
            double d11;
            boolean z11 = false;
            if (i11 != 0) {
                if (i11 == 1) {
                    str = "landscape-primary";
                    d11 = -90.0d;
                } else if (i11 == 2) {
                    str = "portrait-secondary";
                    d11 = 180.0d;
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    str = "landscape-secondary";
                    d11 = 90.0d;
                }
                z11 = true;
            } else {
                str = "portrait-primary";
                d11 = 0.0d;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("name", str);
            writableMapCreateMap.putDouble("rotationDegrees", d11);
            writableMapCreateMap.putBoolean("isLandscape", z11);
            ReactRootView.this.sendEvent("namedOrientationDidChange", writableMapCreateMap);
        }

        public CustomGlobalLayoutListener() {
            DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(ReactRootView.this.getContext().getApplicationContext());
            this.mVisibleViewArea = new Rect();
            this.mMinKeyboardHeightDetected = (int) PixelUtil.toPixelFromDIP(60.0f);
        }

        private void checkForDeviceOrientationChanges() {
            int rotation = ((WindowManager) ReactRootView.this.getContext().getSystemService(InterfaceC33953u5.f72199F)).getDefaultDisplay().getRotation();
            if (this.mDeviceRotation == rotation) {
                return;
            }
            this.mDeviceRotation = rotation;
            DisplayMetricsHolder.initDisplayMetrics(ReactRootView.this.getContext().getApplicationContext());
            emitOrientationChanged(rotation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @RequiresApi(api = 30)
        public void checkForKeyboardEvents() {
            boolean zIsVisible;
            ReactRootView.this.getRootView().getWindowVisibleDisplayFrame(this.mVisibleViewArea);
            WindowInsets rootWindowInsets = ReactRootView.this.getRootView().getRootWindowInsets();
            if (rootWindowInsets == null || (zIsVisible = rootWindowInsets.isVisible(WindowInsets.Type.ime())) == this.mKeyboardIsVisible) {
                return;
            }
            this.mKeyboardIsVisible = zIsVisible;
            if (!zIsVisible) {
                ReactRootView.this.sendEvent("keyboardDidHide", createKeyboardEventPayload(PixelUtil.toDIPFromPixel(this.mVisibleViewArea.height()), 0.0d, PixelUtil.toDIPFromPixel(this.mVisibleViewArea.width()), 0.0d));
                return;
            }
            int i11 = rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom - rootWindowInsets.getInsets(WindowInsets.Type.systemBars()).bottom;
            ViewGroup.LayoutParams layoutParams = ReactRootView.this.getRootView().getLayoutParams();
            C38115a.m86045a(layoutParams instanceof WindowManager.LayoutParams);
            ReactRootView.this.sendEvent("keyboardDidShow", createKeyboardEventPayload(PixelUtil.toDIPFromPixel(((WindowManager.LayoutParams) layoutParams).softInputMode == 48 ? this.mVisibleViewArea.bottom - i11 : this.mVisibleViewArea.bottom), PixelUtil.toDIPFromPixel(this.mVisibleViewArea.left), PixelUtil.toDIPFromPixel(this.mVisibleViewArea.width()), PixelUtil.toDIPFromPixel(i11)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void checkForKeyboardEventsLegacy() {
            WindowInsets rootWindowInsets;
            DisplayCutout displayCutout;
            ReactRootView.this.getRootView().getWindowVisibleDisplayFrame(this.mVisibleViewArea);
            int safeInsetTop = (Build.VERSION.SDK_INT < 28 || (rootWindowInsets = ReactRootView.this.getRootView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) ? 0 : displayCutout.getSafeInsetTop();
            int i11 = DisplayMetricsHolder.getWindowDisplayMetrics().heightPixels;
            Rect rect = this.mVisibleViewArea;
            int i12 = rect.bottom;
            int i13 = (i11 - i12) + safeInsetTop;
            int i14 = this.mKeyboardHeight;
            if (i14 != i13 && i13 > this.mMinKeyboardHeightDetected) {
                this.mKeyboardHeight = i13;
                this.mKeyboardIsVisible = true;
                ReactRootView.this.sendEvent("keyboardDidShow", createKeyboardEventPayload(PixelUtil.toDIPFromPixel(i12), PixelUtil.toDIPFromPixel(this.mVisibleViewArea.left), PixelUtil.toDIPFromPixel(this.mVisibleViewArea.width()), PixelUtil.toDIPFromPixel(this.mKeyboardHeight)));
            } else {
                if (i14 == 0 || i13 > this.mMinKeyboardHeightDetected) {
                    return;
                }
                this.mKeyboardHeight = 0;
                this.mKeyboardIsVisible = false;
                ReactRootView.this.sendEvent("keyboardDidHide", createKeyboardEventPayload(PixelUtil.toDIPFromPixel(rect.height()), 0.0d, PixelUtil.toDIPFromPixel(this.mVisibleViewArea.width()), 0.0d));
            }
        }

        private void emitUpdateDimensionsEvent() {
            DeviceInfoModule deviceInfoModule;
            ReactContext currentReactContext = ReactRootView.this.getCurrentReactContext();
            if (currentReactContext == null || (deviceInfoModule = (DeviceInfoModule) currentReactContext.getNativeModule(DeviceInfoModule.class)) == null) {
                return;
            }
            deviceInfoModule.emitUpdateDimensionsEvent();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ReactRootView.this.hasActiveReactContext() && ReactRootView.this.isViewAttachedToReactInstance()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    checkForKeyboardEvents();
                } else {
                    checkForKeyboardEventsLegacy();
                }
                checkForDeviceOrientationChanges();
                checkForDeviceDimensionsChanges();
            }
        }

        private void checkForDeviceDimensionsChanges() {
            emitUpdateDimensionsEvent();
        }

        private WritableMap createKeyboardEventPayload(double d11, double d12, double d13, double d14) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putDouble("height", d14);
            writableMapCreateMap2.putDouble("screenX", d12);
            writableMapCreateMap2.putDouble("width", d13);
            writableMapCreateMap2.putDouble("screenY", d11);
            writableMapCreateMap.putMap("endCoordinates", writableMapCreateMap2);
            writableMapCreateMap.putString("easing", "keyboard");
            writableMapCreateMap.putDouble(TypedValues.TransitionType.S_DURATION, 0.0d);
            return writableMapCreateMap;
        }
    }

    public interface ReactRootViewEventListener {
        void onAttachedToReactInstance(ReactRootView reactRootView);
    }

    public ReactRootView(Context context) {
        super(context);
        this.mRootViewTag = 0;
        this.mAndroidHWInputDeviceHelper = new ReactAndroidHWInputDeviceHelper(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mLastWidth = 0;
        this.mLastHeight = 0;
        this.mLastOffsetX = Integer.MIN_VALUE;
        this.mLastOffsetY = Integer.MIN_VALUE;
        this.mUIManagerType = 1;
        this.mState = new AtomicInteger(0);
        init();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        dispatchJSPointerEvent(motionEvent, false);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        dispatchJSPointerEvent(motionEvent, true);
        return super.onInterceptHoverEvent(motionEvent);
    }

    public boolean shouldDispatchJSTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @VisibleForTesting
    public void simulateAttachForTesting() {
        this.mIsAttachedToInstance = true;
        this.mJSTouchDispatcher = new JSTouchDispatcher(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.mJSPointerDispatcher = new JSPointerDispatcher(this);
        }
    }

    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str) {
        startReactApplication(reactInstanceManager, str, null);
    }

    private void attachToReactInstanceManager() {
        Systrace.m10662c(0L, "attachToReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_START);
        if (getId() != -1) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException("Trying to attach a ReactRootView with an explicit id already set to [" + getId() + "]. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID."));
        }
        try {
            if (!this.mIsAttachedToInstance) {
                this.mIsAttachedToInstance = true;
                ((ReactInstanceManager) C38115a.m86047c(this.mReactInstanceManager)).attachRootView(this);
                getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_END);
            Systrace.m10667i(0L);
        }
    }

    private CustomGlobalLayoutListener getCustomGlobalLayoutListener() {
        if (this.mCustomGlobalLayoutListener == null) {
            this.mCustomGlobalLayoutListener = new CustomGlobalLayoutListener();
        }
        return this.mCustomGlobalLayoutListener;
    }

    private boolean isRootViewTagSet() {
        int i11 = this.mRootViewTag;
        return (i11 == 0 || i11 == -1) ? false : true;
    }

    private void updateRootLayoutSpecs(boolean z11, int i11, int i12) {
        UIManager uIManager;
        int i13;
        int i14;
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_START);
        if (!hasActiveReactInstance()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            C45999a.m101488I(TAG, "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        boolean zIsFabric = isFabric();
        if (zIsFabric && !isRootViewTagSet()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            C45999a.m101507m(TAG, "Unable to update root layout specs for ReactRootView: no rootViewTag set yet");
            return;
        }
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null && (uIManager = UIManagerHelper.getUIManager(currentReactContext, getUIManagerType())) != null) {
            if (zIsFabric) {
                Point viewportOffset = RootViewUtil.getViewportOffset(this);
                int i15 = viewportOffset.x;
                i14 = viewportOffset.y;
                i13 = i15;
            } else {
                i13 = 0;
                i14 = 0;
            }
            if (z11 || i13 != this.mLastOffsetX || i14 != this.mLastOffsetY) {
                uIManager.updateRootLayoutSpecs(getRootViewTag(), i11, i12, i13, i14);
            }
            this.mLastOffsetX = i13;
            this.mLastOffsetY = i14;
        }
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        Canvas canvas2;
        BlendMode blendModeM10647a;
        if (Build.VERSION.SDK_INT >= 29 && ViewUtil.getUIManagerType(this) == 2 && BlendModeHelper.needsIsolatedLayer(this)) {
            blendModeM10647a = C6252x.m10647a(view.getTag(C5771R.id.mix_blend_mode));
            if (blendModeM10647a != null) {
                Paint paint = new Paint();
                paint.setBlendMode(blendModeM10647a);
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
            blendModeM10647a = null;
        }
        boolean zDrawChild = super.drawChild(canvas2, view, j11);
        if (blendModeM10647a != null) {
            canvas2.restore();
        }
        return zDrawChild;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    @Nullable
    public Bundle getAppProperties() {
        return this.mAppProperties;
    }

    @Nullable
    public ReactContext getCurrentReactContext() {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager == null) {
            return null;
        }
        return reactInstanceManager.getCurrentReactContext();
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public int getHeightMeasureSpec() {
        return this.mHeightMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public String getJSModuleName() {
        return (String) C38115a.m86047c(this.mJSModuleName);
    }

    @Nullable
    public ReactInstanceManager getReactInstanceManager() {
        return this.mReactInstanceManager;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public int getRootViewTag() {
        return this.mRootViewTag;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public AtomicInteger getState() {
        return this.mState;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public int getUIManagerType() {
        return this.mUIManagerType;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public int getWidthMeasureSpec() {
        return this.mWidthMeasureSpec;
    }

    public boolean hasActiveReactContext() {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        return (reactInstanceManager == null || reactInstanceManager.getCurrentReactContext() == null) ? false : true;
    }

    public boolean hasActiveReactInstance() {
        return this.mReactInstanceManager != null;
    }

    public boolean isViewAttachedToReactInstance() {
        return this.mIsAttachedToInstance;
    }

    public void onAttachedToReactInstance() {
        this.mJSTouchDispatcher = new JSTouchDispatcher(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.mJSPointerDispatcher = new JSPointerDispatcher(this);
        }
        ReactRootViewEventListener reactRootViewEventListener = this.mRootViewEventListener;
        if (reactRootViewEventListener != null) {
            reactRootViewEventListener.onAttachedToReactInstance(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.mWasMeasured && isFabric()) {
            updateRootLayoutSpecs(false, this.mWidthMeasureSpec, this.mHeightMeasureSpec);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int iMax;
        int iMax2;
        Systrace.m10662c(0L, "ReactRootView.onMeasure");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_START);
        try {
            boolean z11 = (i11 == this.mWidthMeasureSpec && i12 == this.mHeightMeasureSpec) ? false : true;
            this.mWidthMeasureSpec = i11;
            this.mHeightMeasureSpec = i12;
            int mode = View.MeasureSpec.getMode(i11);
            if (mode == Integer.MIN_VALUE || mode == 0) {
                iMax = 0;
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    View childAt = getChildAt(i13);
                    iMax = Math.max(iMax, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
                }
            } else {
                iMax = View.MeasureSpec.getSize(i11);
            }
            int mode2 = View.MeasureSpec.getMode(i12);
            if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                iMax2 = 0;
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt2 = getChildAt(i14);
                    iMax2 = Math.max(iMax2, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
                }
            } else {
                iMax2 = View.MeasureSpec.getSize(i12);
            }
            setMeasuredDimension(iMax, iMax2);
            this.mWasMeasured = true;
            if (hasActiveReactInstance() && !isViewAttachedToReactInstance()) {
                attachToReactInstanceManager();
            } else if (z11 || this.mLastWidth != iMax || this.mLastHeight != iMax2) {
                updateRootLayoutSpecs(true, this.mWidthMeasureSpec, this.mHeightMeasureSpec);
            }
            this.mLastWidth = iMax;
            this.mLastHeight = iMax2;
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
            Systrace.m10667i(0L);
        }
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public void onStage(int i11) {
        if (i11 != 101) {
            return;
        }
        onAttachedToReactInstance();
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public void runApplication() {
        Systrace.m10662c(0L, "ReactRootView.runApplication");
        try {
            if (hasActiveReactInstance() && isViewAttachedToReactInstance()) {
                ReactContext currentReactContext = getCurrentReactContext();
                if (currentReactContext == null) {
                    return;
                }
                CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                String jSModuleName = getJSModuleName();
                if (this.mWasMeasured) {
                    updateRootLayoutSpecs(true, this.mWidthMeasureSpec, this.mHeightMeasureSpec);
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("rootTag", getRootViewTag());
                Bundle appProperties = getAppProperties();
                if (appProperties != null) {
                    writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                }
                this.mShouldLogContentAppeared = true;
                ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
            }
        } finally {
            Systrace.m10667i(0L);
        }
    }

    public void setEventListener(@Nullable ReactRootViewEventListener reactRootViewEventListener) {
        this.mRootViewEventListener = reactRootViewEventListener;
    }

    public void setIsFabric(boolean z11) {
        this.mUIManagerType = z11 ? 2 : 1;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public void setRootViewTag(int i11) {
        this.mRootViewTag = i11;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public void setShouldLogContentAppeared(boolean z11) {
        this.mShouldLogContentAppeared = z11;
    }

    @VisibleForTesting
    public void simulateCheckForKeyboardForTesting() {
        if (Build.VERSION.SDK_INT >= 30) {
            getCustomGlobalLayoutListener().checkForKeyboardEvents();
        } else {
            getCustomGlobalLayoutListener().checkForKeyboardEventsLegacy();
        }
    }

    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str, @Nullable Bundle bundle) {
        Systrace.m10662c(0L, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            C38115a.m86046b(this.mReactInstanceManager == null, "This root view has already been attached to a catalyst instance manager");
            this.mReactInstanceManager = reactInstanceManager;
            this.mJSModuleName = str;
            this.mAppProperties = bundle;
            reactInstanceManager.createReactContextInBackground();
            if (ReactNativeFeatureFlags.enableEagerRootViewAttachment()) {
                if (!this.mWasMeasured) {
                    setSurfaceConstraintsToScreenSize();
                }
                attachToReactInstanceManager();
            }
        } finally {
            Systrace.m10667i(0L);
        }
    }

    private void init() {
        setRootViewTag(ReactRootViewTagGenerator.getNextRootViewTag());
        setClipChildren(false);
    }

    private boolean isDispatcherReady() {
        if (hasActiveReactContext() && isViewAttachedToReactInstance()) {
            if (this.mJSTouchDispatcher == null) {
                C45999a.m101488I(TAG, "Unable to dispatch touch to JS before the dispatcher is available");
                return false;
            }
            if (ReactFeatureFlags.dispatchPointerEvents && this.mJSPointerDispatcher == null) {
                C45999a.m101488I(TAG, "Unable to dispatch pointer events to JS before the dispatcher is available");
                return false;
            }
            return true;
        }
        C45999a.m101488I(TAG, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        return false;
    }

    private boolean isFabric() {
        if (getUIManagerType() == 2) {
            return true;
        }
        return false;
    }

    private void removeOnGlobalLayoutListener() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    private void setSurfaceConstraintsToScreenSize() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e11) {
            handleException(e11);
        }
    }

    public void dispatchJSPointerEvent(MotionEvent motionEvent, boolean z11) {
        if (hasActiveReactContext() && isViewAttachedToReactInstance()) {
            if (this.mJSPointerDispatcher == null) {
                if (ReactFeatureFlags.dispatchPointerEvents) {
                    C45999a.m101488I(TAG, "Unable to dispatch pointer events to JS before the dispatcher is available");
                    return;
                }
                return;
            } else {
                EventDispatcher eventDispatcher = UIManagerHelper.getEventDispatcher(getCurrentReactContext(), getUIManagerType());
                if (eventDispatcher != null) {
                    this.mJSPointerDispatcher.handleMotionEvent(motionEvent, eventDispatcher, z11);
                    return;
                }
                return;
            }
        }
        C45999a.m101488I(TAG, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
    }

    public void dispatchJSTouchEvent(MotionEvent motionEvent) {
        if (hasActiveReactContext() && isViewAttachedToReactInstance()) {
            if (this.mJSTouchDispatcher == null) {
                C45999a.m101488I(TAG, "Unable to dispatch touch to JS before the dispatcher is available");
                return;
            }
            EventDispatcher eventDispatcher = UIManagerHelper.getEventDispatcher(getCurrentReactContext(), getUIManagerType());
            if (eventDispatcher != null) {
                this.mJSTouchDispatcher.handleTouchEvent(motionEvent, eventDispatcher, getCurrentReactContext());
                return;
            }
            return;
        }
        C45999a.m101488I(TAG, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (hasActiveReactContext() && isViewAttachedToReactInstance()) {
            this.mAndroidHWInputDeviceHelper.handleKeyEvent(keyEvent);
            return super.dispatchKeyEvent(keyEvent);
        }
        C45999a.m101488I(TAG, "Unable to handle key event as the catalyst instance has not been attached");
        return super.dispatchKeyEvent(keyEvent);
    }

    public void finalize() throws Throwable {
        super.finalize();
        C38115a.m86046b(!this.mIsAttachedToInstance, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    @Nullable
    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString("surfaceID");
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.RootView
    public void handleException(Throwable th2) {
        if (hasActiveReactContext()) {
            getCurrentReactContext().handleException(new IllegalViewOperationException(th2.getMessage(), this, th2));
            return;
        }
        throw new RuntimeException(th2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isViewAttachedToReactInstance()) {
            removeOnGlobalLayoutListener();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // com.facebook.react.uimanager.RootView
    public void onChildEndedNativeGesture(View view, MotionEvent motionEvent) {
        EventDispatcher eventDispatcher;
        if (isDispatcherReady() && (eventDispatcher = UIManagerHelper.getEventDispatcher(getCurrentReactContext(), getUIManagerType())) != null) {
            this.mJSTouchDispatcher.onChildEndedNativeGesture(motionEvent, eventDispatcher);
            JSPointerDispatcher jSPointerDispatcher = this.mJSPointerDispatcher;
            if (jSPointerDispatcher != null) {
                jSPointerDispatcher.onChildEndedNativeGesture();
            }
        }
    }

    @Override // com.facebook.react.uimanager.RootView
    public void onChildStartedNativeGesture(View view, MotionEvent motionEvent) {
        EventDispatcher eventDispatcher;
        JSPointerDispatcher jSPointerDispatcher;
        if (isDispatcherReady() && (eventDispatcher = UIManagerHelper.getEventDispatcher(getCurrentReactContext(), getUIManagerType())) != null) {
            this.mJSTouchDispatcher.onChildStartedNativeGesture(motionEvent, eventDispatcher);
            if (view != null && (jSPointerDispatcher = this.mJSPointerDispatcher) != null) {
                jSPointerDispatcher.onChildStartedNativeGesture(view, motionEvent, eventDispatcher);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isViewAttachedToReactInstance()) {
            removeOnGlobalLayoutListener();
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z11, int i11, Rect rect) {
        if (hasActiveReactContext() && isViewAttachedToReactInstance()) {
            this.mAndroidHWInputDeviceHelper.clearFocus();
            super.onFocusChanged(z11, i11, rect);
        } else {
            C45999a.m101488I(TAG, "Unable to handle focus changed event as the catalyst instance has not been attached");
            super.onFocusChanged(z11, i11, rect);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (shouldDispatchJSTouchEvent(motionEvent)) {
            dispatchJSTouchEvent(motionEvent);
        }
        dispatchJSPointerEvent(motionEvent, true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (shouldDispatchJSTouchEvent(motionEvent)) {
            dispatchJSTouchEvent(motionEvent);
        }
        dispatchJSPointerEvent(motionEvent, false);
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(final View view) {
        super.onViewAdded(view);
        if (view instanceof ReactClippingProhibitedView) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.ReactRootView.1
                @Override // java.lang.Runnable
                public void run() {
                    if (view.isShown()) {
                        return;
                    }
                    ReactSoftExceptionLogger.logSoftException(ReactRootView.TAG, new ReactNoCrashSoftException("A view was illegally added as a child of a ReactRootView. This View should not be a direct child of a ReactRootView, because it is not visible and will never be reachable. Child: " + view.getClass().getCanonicalName().toString() + " child ID: " + view.getId()));
                }
            });
        }
        if (this.mShouldLogContentAppeared) {
            this.mShouldLogContentAppeared = false;
            ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, getJSModuleName(), this.mRootViewTag);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (hasActiveReactContext() && isViewAttachedToReactInstance()) {
            this.mAndroidHWInputDeviceHelper.onFocusChanged(view2);
            super.requestChildFocus(view, view2);
        } else {
            C45999a.m101488I(TAG, "Unable to handle child focus changed event as the catalyst instance has not been attached");
            super.requestChildFocus(view, view2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z11);
        }
    }

    public void sendEvent(String str, @Nullable WritableMap writableMap) {
        if (hasActiveReactInstance()) {
            getCurrentReactContext().emitDeviceEvent(str, writableMap);
        }
    }

    public void setAppProperties(@Nullable Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.mAppProperties = bundle;
        if (isRootViewTagSet()) {
            runApplication();
        }
    }

    public void unmountReactApplication() {
        UiThreadUtil.assertOnUiThread();
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager != null && this.mIsAttachedToInstance) {
            reactInstanceManager.detachRootView(this);
            this.mIsAttachedToInstance = false;
        }
        this.mReactInstanceManager = null;
        this.mShouldLogContentAppeared = false;
    }

    public ReactRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRootViewTag = 0;
        this.mAndroidHWInputDeviceHelper = new ReactAndroidHWInputDeviceHelper(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mLastWidth = 0;
        this.mLastHeight = 0;
        this.mLastOffsetX = Integer.MIN_VALUE;
        this.mLastOffsetY = Integer.MIN_VALUE;
        this.mUIManagerType = 1;
        this.mState = new AtomicInteger(0);
        init();
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public ViewGroup getRootViewGroup() {
        return this;
    }

    public ReactRootView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mRootViewTag = 0;
        this.mAndroidHWInputDeviceHelper = new ReactAndroidHWInputDeviceHelper(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mLastWidth = 0;
        this.mLastHeight = 0;
        this.mLastOffsetX = Integer.MIN_VALUE;
        this.mLastOffsetY = Integer.MIN_VALUE;
        this.mUIManagerType = 1;
        this.mState = new AtomicInteger(0);
        init();
    }
}
