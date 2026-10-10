package com.tencent.liteav.videobase.videobase;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class DisplayTarget {
    private static final String TAG = "DisplayTarget";
    private boolean mIsViewFromTXCloudVideoView;
    private Surface mSurface;
    private WeakReference<SurfaceView> mSurfaceView;
    private final EnumC34903a mTargetType;
    private WeakReference<TextureView> mTextureView;
    private WeakReference<TXCloudVideoView> mTxCloudVideoView;
    private final CustomHandler mUIHandler;

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.videobase.DisplayTarget$a */
    public enum EnumC34903a {
        TEXTUREVIEW,
        SURFACEVIEW,
        SURFACE,
        TXCLOUDVIEW
    }

    public DisplayTarget(DisplayTarget displayTarget) {
        this.mUIHandler = new CustomHandler(Looper.getMainLooper());
        this.mIsViewFromTXCloudVideoView = false;
        this.mTargetType = displayTarget.mTargetType;
        this.mTxCloudVideoView = displayTarget.mTxCloudVideoView;
        this.mTextureView = displayTarget.mTextureView;
        this.mSurfaceView = displayTarget.mSurfaceView;
        this.mSurface = displayTarget.mSurface;
        this.mIsViewFromTXCloudVideoView = displayTarget.mIsViewFromTXCloudVideoView;
    }

    public static DisplayTarget create(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof DisplayTarget) {
            return new DisplayTarget((DisplayTarget) obj);
        }
        if (obj instanceof TXCloudVideoView) {
            return new DisplayTarget((TXCloudVideoView) obj);
        }
        if (obj instanceof TextureView) {
            return new DisplayTarget((TextureView) obj);
        }
        if (obj instanceof SurfaceView) {
            return new DisplayTarget((SurfaceView) obj);
        }
        LiteavLog.m76093w(TAG, "object is unknown. object=".concat(String.valueOf(obj)));
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DisplayTarget displayTarget = (DisplayTarget) obj;
            if (this.mTargetType == displayTarget.mTargetType && CommonUtil.equals(getTXCloudVideoView(), displayTarget.getTXCloudVideoView()) && CommonUtil.equals(getTextureView(), displayTarget.getTextureView()) && CommonUtil.equals(getSurfaceView(), displayTarget.getSurfaceView()) && CommonUtil.equals(this.mSurface, displayTarget.mSurface)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.videobase.DisplayTarget$1 */
    public static /* synthetic */ class C349021 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f74326a;

        static {
            int[] iArr = new int[EnumC34903a.values().length];
            f74326a = iArr;
            try {
                iArr[EnumC34903a.SURFACEVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74326a[EnumC34903a.TEXTUREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74326a[EnumC34903a.SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74326a[EnumC34903a.TXCLOUDVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void requestLayout(View view) {
        if (view == null) {
            return;
        }
        runOnUIThread(RunnableC34905b.m76566a(view));
    }

    private void setVisibility(View view, int i11) {
        if (view == null) {
            return;
        }
        runOnUIThread(RunnableC34904a.m76565a(view, i11));
    }

    public Size getSize() {
        TXCloudVideoView tXCloudVideoView;
        WeakReference<TXCloudVideoView> weakReference;
        WeakReference<TextureView> weakReference2;
        int width;
        int height;
        WeakReference<SurfaceView> weakReference3;
        EnumC34903a enumC34903a = this.mTargetType;
        if (enumC34903a == EnumC34903a.SURFACEVIEW && (weakReference3 = this.mSurfaceView) != null) {
            tXCloudVideoView = weakReference3.get();
        } else if (enumC34903a != EnumC34903a.TEXTUREVIEW || (weakReference2 = this.mTextureView) == null) {
            tXCloudVideoView = (enumC34903a != EnumC34903a.TXCLOUDVIEW || (weakReference = this.mTxCloudVideoView) == null) ? null : weakReference.get();
        } else {
            tXCloudVideoView = weakReference2.get();
        }
        if (tXCloudVideoView != null) {
            width = tXCloudVideoView.getWidth();
            height = tXCloudVideoView.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        return new Size(width, height);
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public SurfaceView getSurfaceView() {
        WeakReference<SurfaceView> weakReference = this.mSurfaceView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public TXCloudVideoView getTXCloudVideoView() {
        WeakReference<TXCloudVideoView> weakReference = this.mTxCloudVideoView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public TextureView getTextureView() {
        WeakReference<TextureView> weakReference = this.mTextureView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public EnumC34903a getType() {
        return this.mTargetType;
    }

    public void hideAll() {
        if (this.mIsViewFromTXCloudVideoView) {
            return;
        }
        setVisibility(getTextureView(), 8);
        setVisibility(getSurfaceView(), 8);
    }

    public boolean isValid() {
        int i11 = C349021.f74326a[this.mTargetType.ordinal()];
        if (i11 == 1) {
            return getSurfaceView() != null;
        }
        if (i11 == 2) {
            return getTextureView() != null;
        }
        if (i11 != 3) {
            return i11 == 4 && getTXCloudVideoView() != null;
        }
        return getSurface() != null;
    }

    public String toString() {
        return "DisplayTarget{mTargetType=" + this.mTargetType + ", mTXCloudVideoView=" + getTXCloudVideoView() + ", mTextureView=" + getTextureView() + ", mSurfaceView=" + getSurfaceView() + ", mSurface=" + this.mSurface + '}';
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.myLooper() == this.mUIHandler.getLooper()) {
            runnable.run();
        } else {
            this.mUIHandler.post(runnable);
        }
    }

    public int getDisplayTargetType() {
        return getType().ordinal();
    }

    public boolean isUseSameView(DisplayTarget displayTarget) {
        if (equals(displayTarget)) {
            return true;
        }
        if (displayTarget == null) {
            return false;
        }
        int i11 = C349021.f74326a[this.mTargetType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4 && getTXCloudVideoView() == displayTarget.getTXCloudVideoView()) {
                        return true;
                    }
                    return false;
                }
                if (getSurface() == displayTarget.getSurface()) {
                    return true;
                }
                return false;
            }
            if (getTextureView() == displayTarget.getTextureView()) {
                return true;
            }
            return false;
        }
        if (getSurfaceView() == displayTarget.getSurfaceView()) {
            return true;
        }
        return false;
    }

    public void showAll() {
        setVisibility(getTextureView(), 0);
        setVisibility(getSurfaceView(), 0);
        WeakReference<TXCloudVideoView> weakReference = this.mTxCloudVideoView;
        if (weakReference != null) {
            requestLayout(weakReference.get());
        }
        requestLayout(getTextureView());
        requestLayout(getSurfaceView());
    }

    public DisplayTarget(TXCloudVideoView tXCloudVideoView) {
        this.mUIHandler = new CustomHandler(Looper.getMainLooper());
        this.mIsViewFromTXCloudVideoView = false;
        if (tXCloudVideoView == null) {
            this.mTargetType = EnumC34903a.TXCLOUDVIEW;
            return;
        }
        SurfaceView surfaceView = tXCloudVideoView.getSurfaceView();
        Surface surface = tXCloudVideoView.getSurface();
        TextureView textureViewSetByUser = TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(tXCloudVideoView);
        if (surfaceView != null) {
            this.mTargetType = EnumC34903a.SURFACEVIEW;
            this.mSurfaceView = new WeakReference<>(surfaceView);
        } else if (surface != null) {
            this.mTargetType = EnumC34903a.SURFACE;
            this.mSurface = surface;
        } else if (textureViewSetByUser != null) {
            this.mTargetType = EnumC34903a.TEXTUREVIEW;
            this.mTextureView = new WeakReference<>(textureViewSetByUser);
            this.mTxCloudVideoView = new WeakReference<>(tXCloudVideoView);
        } else {
            this.mTargetType = EnumC34903a.TXCLOUDVIEW;
            this.mTxCloudVideoView = new WeakReference<>(tXCloudVideoView);
        }
        this.mIsViewFromTXCloudVideoView = true;
    }

    public DisplayTarget(TextureView textureView) {
        this.mUIHandler = new CustomHandler(Looper.getMainLooper());
        this.mIsViewFromTXCloudVideoView = false;
        this.mTargetType = EnumC34903a.TEXTUREVIEW;
        this.mTextureView = new WeakReference<>(textureView);
    }

    public DisplayTarget(SurfaceView surfaceView) {
        this.mUIHandler = new CustomHandler(Looper.getMainLooper());
        this.mIsViewFromTXCloudVideoView = false;
        this.mTargetType = EnumC34903a.SURFACEVIEW;
        this.mSurfaceView = new WeakReference<>(surfaceView);
    }

    public DisplayTarget(Surface surface) {
        this.mUIHandler = new CustomHandler(Looper.getMainLooper());
        this.mIsViewFromTXCloudVideoView = false;
        this.mTargetType = EnumC34903a.SURFACE;
        this.mSurface = surface;
    }
}
