package com.tencent.rtmp.p148ui;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.liteav.base.util.C34743h;
import com.tencent.liteav.base.util.C34744i;
import com.tencent.liteav.base.util.LiteavLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes56.dex */
public class TXCloudVideoView extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    private static final int FOCUS_AREA_SIZE_IN_DP = 70;
    private WeakReference<InterfaceC35208b> mCallback;
    private TextureView mCurrentInnerTextureView;
    private final RunnableC35207a mDelayedTapRunnable;
    private boolean mEnableShowLog;
    private boolean mEnableTouchToFocus;
    private boolean mEnableZoom;
    private FocusIndicatorView mFocusIndicatorView;
    private TextureView mFreeInnerTextureView;
    protected Object mGLContext;
    private final Runnable mHideIndicatorViewRunnable;
    private final List<TextureView> mInactiveInnerTextureViews;
    private float mLastScaleFactor;
    private float mScaleFactor;
    private ScaleGestureDetector mScaleGestureDetector;
    private final WeakReference<Surface> mSurface;
    private final WeakReference<SurfaceView> mSurfaceView;
    private final String mTAG;
    private String mUserId;
    private TextureView mUserTextureView;
    private AndroidViewEventListener mViewEventListener;

    /* JADX INFO: renamed from: com.tencent.rtmp.ui.TXCloudVideoView$a */
    public class RunnableC35207a implements Runnable {

        /* JADX INFO: renamed from: a */
        final Point f75420a;

        /* JADX INFO: renamed from: b */
        int f75421b;

        /* JADX INFO: renamed from: c */
        int f75422c;

        private RunnableC35207a() {
            this.f75420a = new Point();
            this.f75421b = 0;
            this.f75422c = 0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TXCloudVideoView.this.mViewEventListener != null) {
                AndroidViewEventListener androidViewEventListener = TXCloudVideoView.this.mViewEventListener;
                Point point = this.f75420a;
                androidViewEventListener.onTap(point.x, point.y, this.f75421b, this.f75422c);
            }
        }

        public /* synthetic */ RunnableC35207a(TXCloudVideoView tXCloudVideoView, byte b11) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.tencent.rtmp.ui.TXCloudVideoView$b */
    public interface InterfaceC35208b {
        void onShowLog(boolean z11);
    }

    public TXCloudVideoView(Context context) {
        this(context, null, null);
    }

    public TXCloudVideoView(SurfaceView surfaceView) {
        this(surfaceView.getContext(), null, surfaceView);
    }

    private void addViewInternal(TextureView textureView) {
        if (textureView == null) {
            LiteavLog.m76093w(this.mTAG, "addViewInternal: null.");
            return;
        }
        if (this.mCurrentInnerTextureView == textureView) {
            LiteavLog.m76087i(this.mTAG, "addViewInternal: same view");
            return;
        }
        if (textureView.getParent() != null && textureView.getParent() != this) {
            LiteavLog.m76083e(this.mTAG, "addViewInternal: has other parent:" + textureView.getParent());
            return;
        }
        LiteavLog.m76087i(this.mTAG, "addViewInternal: " + textureView + ", current: " + this.mCurrentInnerTextureView + ", free: " + this.mFreeInnerTextureView);
        if (textureView.getParent() == null) {
            addView(textureView);
        }
        if (this.mFreeInnerTextureView == textureView) {
            this.mFreeInnerTextureView = null;
        }
        TextureView textureView2 = this.mCurrentInnerTextureView;
        if (textureView2 != null) {
            this.mInactiveInnerTextureViews.add(0, textureView2);
            LiteavLog.m76087i(this.mTAG, "addViewInternal: keep inactive view: " + this.mCurrentInnerTextureView);
        }
        this.mCurrentInnerTextureView = textureView;
        this.mInactiveInnerTextureViews.remove(textureView);
        updateZOrders();
    }

    private TextureView getFreeInnerTextureView() {
        return this.mFreeInnerTextureView;
    }

    private TextureView getTextureViewSetByUser() {
        return this.mUserTextureView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideIndicatorView() {
        FocusIndicatorView focusIndicatorView = this.mFocusIndicatorView;
        if (focusIndicatorView != null) {
            focusIndicatorView.setVisibility(8);
        }
    }

    private boolean isShowLogEnabled() {
        return this.mEnableShowLog;
    }

    private void notifyFirstFrameRendered(TextureView textureView) {
        if (this.mCurrentInnerTextureView != textureView || this.mFreeInnerTextureView == null) {
            return;
        }
        LiteavLog.m76087i(this.mTAG, "notifyFirstFrameRendered: remove free view: " + this.mFreeInnerTextureView);
        removeChildView(this.mFreeInnerTextureView);
        this.mFreeInnerTextureView = null;
    }

    private void removeChildView(View view) {
        if (view == null) {
            return;
        }
        if (view.getParent() != this) {
            LiteavLog.m76093w(this.mTAG, "removeChildView: has other parent:" + view.getParent());
            return;
        }
        try {
            LiteavLog.m76087i(this.mTAG, "removeChildView: ".concat(String.valueOf(view)));
            removeView(view);
        } catch (Exception e11) {
            LiteavLog.m76084e(this.mTAG, "removeChildView error: ", e11);
        }
    }

    private void removeViewInternal(TextureView textureView, boolean z11) {
        if (textureView == null) {
            LiteavLog.m76093w(this.mTAG, "removeViewInternal: null.");
            return;
        }
        if (this.mInactiveInnerTextureViews.contains(textureView)) {
            LiteavLog.m76087i(this.mTAG, "removeViewInternal: remove inactive view: ".concat(String.valueOf(textureView)));
            this.mInactiveInnerTextureViews.remove(textureView);
            removeChildView(textureView);
            return;
        }
        if (this.mCurrentInnerTextureView != textureView) {
            LiteavLog.m76093w(this.mTAG, "removeViewInternal: not current view: ".concat(String.valueOf(textureView)));
            removeChildView(textureView);
            return;
        }
        if (this.mInactiveInnerTextureViews.isEmpty()) {
            this.mCurrentInnerTextureView = null;
        } else {
            this.mCurrentInnerTextureView = this.mInactiveInnerTextureViews.remove(0);
            LiteavLog.m76087i(this.mTAG, "removeViewInternal: use inactive view: " + this.mCurrentInnerTextureView);
            removeChildView(this.mFreeInnerTextureView);
            this.mFreeInnerTextureView = null;
        }
        if (z11) {
            removeChildView(this.mFreeInnerTextureView);
            if (this.mCurrentInnerTextureView == null) {
                resetChildView(textureView);
                this.mFreeInnerTextureView = textureView;
            } else {
                removeChildView(textureView);
                this.mFreeInnerTextureView = null;
            }
        } else if (this.mFreeInnerTextureView != null) {
            removeChildView(textureView);
        } else {
            this.mFreeInnerTextureView = textureView;
        }
        updateZOrders();
        LiteavLog.m76087i(this.mTAG, "removeViewInternal: " + textureView + ", clearLastImage: " + z11 + ", current: " + this.mCurrentInnerTextureView + ", free: " + this.mFreeInnerTextureView);
    }

    private void resetChildView(View view) {
        if (view == null) {
            return;
        }
        if (view.getParent() != this) {
            LiteavLog.m76093w(this.mTAG, "resetChildView: has other parent:" + view.getParent());
            return;
        }
        try {
            LiteavLog.m76087i(this.mTAG, "resetChildView: ".concat(String.valueOf(view)));
            removeView(view);
            addView(view);
        } catch (Exception e11) {
            LiteavLog.m76084e(this.mTAG, "resetChildView error: ", e11);
        }
    }

    private void setAndroidViewEventListener(AndroidViewEventListener androidViewEventListener) {
        this.mViewEventListener = androidViewEventListener;
    }

    private void setBackgroundColorForInternalView(int i11) {
        LiteavLog.m76087i(this.mTAG, "setBackgroundColorForInternalView color:".concat(String.valueOf(i11)));
        if (this.mSurface == null && this.mSurfaceView == null) {
            int i12 = (i11 >> 16) & 255;
            post(RunnableC35211b.m77299a(this, i11 & 255, (i11 >> 24) & 255, i12, (i11 >> 8) & 255));
        }
    }

    private void setShowLogCallback(WeakReference<InterfaceC35208b> weakReference) {
        this.mCallback = weakReference;
    }

    private void setTouchToFocusEnabled(boolean z11) {
        this.mEnableTouchToFocus = z11;
    }

    private void setZoomEnabled(boolean z11) {
        LiteavLog.m76087i(this.mTAG, "setZoomEnabled: ".concat(String.valueOf(z11)));
        this.mEnableZoom = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFocusViewInternal(int i11, int i12, int i13, int i14) {
        if ((i13 != 0 && i13 != getWidth()) || (i14 != 0 && i14 != getHeight())) {
            LiteavLog.m76087i(this.mTAG, "ignore show indicator view when view size changed");
            return;
        }
        LiteavLog.m76091v(this.mTAG, "show indicator view at (%d,%d)", Integer.valueOf(i11), Integer.valueOf(i12));
        removeCallbacks(this.mHideIndicatorViewRunnable);
        int i15 = (int) ((getResources().getDisplayMetrics().density * 70.0f) + 0.5f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i15, i15);
        int i16 = i15 / 2;
        layoutParams.leftMargin = C34743h.m76115a(i11 - i16, 0, getWidth() - i15);
        layoutParams.topMargin = C34743h.m76115a(i12 - i16, 0, getHeight() - i15);
        View view = this.mFocusIndicatorView;
        if (view == null) {
            FocusIndicatorView focusIndicatorView = new FocusIndicatorView(getContext());
            this.mFocusIndicatorView = focusIndicatorView;
            addView(focusIndicatorView, layoutParams);
        } else if (indexOfChild(view) != getChildCount() - 1) {
            try {
                removeView(this.mFocusIndicatorView);
            } catch (Exception e11) {
                LiteavLog.m76084e(this.mTAG, "removeView focus indicator view error: ", e11);
            }
            addView(this.mFocusIndicatorView, layoutParams);
        } else {
            this.mFocusIndicatorView.setLayoutParams(layoutParams);
        }
        this.mFocusIndicatorView.setVisibility(0);
        FocusIndicatorView focusIndicatorView2 = this.mFocusIndicatorView;
        focusIndicatorView2.startAnimation(focusIndicatorView2.f75416a);
        postDelayed(this.mHideIndicatorViewRunnable, TimeUnit.SECONDS.toMillis(1L));
    }

    private void updateZOrders() {
        TextureView textureView = this.mCurrentInnerTextureView;
        if (textureView != null && textureView.getParent() == this) {
            this.mCurrentInnerTextureView.bringToFront();
        }
        TextureView textureView2 = this.mFreeInnerTextureView;
        if (textureView2 != null && textureView2.getParent() == this) {
            this.mFreeInnerTextureView.bringToFront();
        }
        TextureView textureView3 = this.mUserTextureView;
        if (textureView3 != null && textureView3.getParent() == this) {
            this.mUserTextureView.bringToFront();
        }
        FocusIndicatorView focusIndicatorView = this.mFocusIndicatorView;
        if (focusIndicatorView == null || focusIndicatorView.getParent() != this) {
            return;
        }
        this.mFocusIndicatorView.bringToFront();
    }

    public void addVideoView(TextureView textureView) {
        if (textureView == null) {
            LiteavLog.m76093w(this.mTAG, "addVideoView: null");
            return;
        }
        if (C34744i.m76117a(this.mUserTextureView, textureView)) {
            LiteavLog.m76087i(this.mTAG, "addVideoView: same view");
            return;
        }
        removeVideoView();
        LiteavLog.m76087i(this.mTAG, "addVideoView: ".concat(String.valueOf(textureView)));
        if (textureView.getParent() == null) {
            addView(textureView);
        } else if (textureView.getParent() == this) {
            LiteavLog.m76087i(this.mTAG, "addVideoView: already added.");
        } else {
            LiteavLog.m76093w(this.mTAG, "addVideoView: has other parent:" + textureView.getParent());
        }
        this.mUserTextureView = textureView;
        updateZOrders();
    }

    public void clearLastFrame(boolean z11) {
        if (z11) {
            setVisibility(8);
        }
    }

    public Object getOpenGLContext() {
        return this.mGLContext;
    }

    public Surface getSurface() {
        WeakReference<Surface> weakReference = this.mSurface;
        if (weakReference == null) {
            return null;
        }
        Surface surface = weakReference.get();
        if (surface == null) {
            LiteavLog.m76093w(this.mTAG, "surface is null.");
        }
        return surface;
    }

    public SurfaceView getSurfaceView() {
        WeakReference<SurfaceView> weakReference = this.mSurfaceView;
        if (weakReference == null) {
            return null;
        }
        SurfaceView surfaceView = weakReference.get();
        if (surfaceView == null) {
            LiteavLog.m76093w(this.mTAG, "surfaceView is null.");
        }
        return surfaceView;
    }

    public String getUserId() {
        return this.mUserId;
    }

    @Deprecated
    public TextureView getVideoView() {
        TextureView textureView = this.mUserTextureView;
        return textureView != null ? textureView : this.mCurrentInnerTextureView;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (!this.mEnableZoom) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor() - this.mLastScaleFactor;
        this.mLastScaleFactor = scaleGestureDetector.getScaleFactor();
        float fM76114a = C34743h.m76114a(this.mScaleFactor + scaleFactor, 0.0f);
        this.mScaleFactor = fM76114a;
        AndroidViewEventListener androidViewEventListener = this.mViewEventListener;
        if (androidViewEventListener != null) {
            androidViewEventListener.onZoom(fM76114a);
        }
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        AndroidViewEventListener androidViewEventListener = this.mViewEventListener;
        if (androidViewEventListener != null) {
            androidViewEventListener.onSizeChanged(i11, i12, i13, i14);
        }
        super.onSizeChanged(i11, i12, i13, i14);
    }

    public void removeVideoView() {
        if (this.mUserTextureView == null) {
            return;
        }
        LiteavLog.m76087i(this.mTAG, "removeVideoView: " + this.mUserTextureView);
        removeChildView(this.mUserTextureView);
        this.mUserTextureView = null;
    }

    public void setOpenGLContext(Object obj) {
        this.mGLContext = obj;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }

    public void showLog(boolean z11) {
        this.mEnableShowLog = z11;
        WeakReference<InterfaceC35208b> weakReference = this.mCallback;
        InterfaceC35208b interfaceC35208b = weakReference == null ? null : weakReference.get();
        if (interfaceC35208b != null) {
            interfaceC35208b.onShowLog(z11);
        }
    }

    public TXCloudVideoView(Context context, Surface surface) {
        this(context, null, null, surface);
    }

    private void showFocusView(int i11, int i12, int i13, int i14) {
        post(RunnableC35212c.m77300a(this, i11, i12, i13, i14));
    }

    @Deprecated
    public TextureView getHWVideoView() {
        return getVideoView();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LiteavLog.m76087i(this.mTAG, "onAttachedToWindow");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LiteavLog.m76087i(this.mTAG, "onDetachedFromWindow");
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.mLastScaleFactor = scaleGestureDetector.getScaleFactor();
        return this.mEnableZoom;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1 && motionEvent.getAction() == 0) {
            if (this.mEnableTouchToFocus) {
                RunnableC35207a runnableC35207a = this.mDelayedTapRunnable;
                int x11 = (int) motionEvent.getX();
                int y11 = (int) motionEvent.getY();
                int width = getWidth();
                int height = getHeight();
                Point point = runnableC35207a.f75420a;
                point.x = x11;
                point.y = y11;
                runnableC35207a.f75421b = width;
                runnableC35207a.f75422c = height;
                removeCallbacks(this.mDelayedTapRunnable);
                postDelayed(this.mDelayedTapRunnable, 100L);
            }
        } else if (motionEvent.getPointerCount() > 1 && motionEvent.getAction() == 2 && this.mEnableZoom) {
            removeCallbacks(this.mDelayedTapRunnable);
            hideIndicatorView();
            if (this.mScaleGestureDetector == null) {
                this.mScaleGestureDetector = new ScaleGestureDetector(getContext(), this);
            }
            this.mScaleGestureDetector.onTouchEvent(motionEvent);
        }
        if (this.mEnableZoom) {
            if (motionEvent.getAction() == 0) {
                performClick();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public TXCloudVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null);
    }

    public TXCloudVideoView(Context context, AttributeSet attributeSet, SurfaceView surfaceView) {
        this(context, attributeSet, surfaceView, null);
    }

    private TXCloudVideoView(Context context, AttributeSet attributeSet, SurfaceView surfaceView, Surface surface) {
        super(context, attributeSet);
        this.mTAG = "TXCloudVideoView_" + hashCode();
        this.mInactiveInnerTextureViews = new ArrayList();
        this.mEnableTouchToFocus = false;
        this.mDelayedTapRunnable = new RunnableC35207a(this, (byte) 0);
        this.mEnableZoom = false;
        this.mUserId = "";
        this.mHideIndicatorViewRunnable = RunnableC35210a.m77298a(this);
        this.mSurfaceView = surfaceView != null ? new WeakReference<>(surfaceView) : null;
        this.mSurface = surface != null ? new WeakReference<>(surface) : null;
        if (surfaceView == null && surface == null) {
            TextureView textureView = new TextureView(context);
            this.mFreeInnerTextureView = textureView;
            addView(textureView);
        }
    }

    public void clearLog() {
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void disableLog(boolean z11) {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public void setDashBoardMarginInPx(int i11, int i12, int i13, int i14) {
    }

    public void setDashBoardMarginInRatio(float f11, float f12, float f13, float f14) {
    }

    public void setLogMargin(float f11, float f12, float f13, float f14) {
    }
}
