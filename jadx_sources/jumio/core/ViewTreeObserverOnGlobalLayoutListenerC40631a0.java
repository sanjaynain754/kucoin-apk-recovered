package jumio.core;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.content.ContextCompat;
import com.jumio.commons.camera.CameraManagerInterface;

/* JADX INFO: renamed from: jumio.core.a0 */
/* JADX INFO: loaded from: classes61.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC40631a0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public int f90204a;

    /* JADX INFO: renamed from: b */
    public int f90205b;

    /* JADX INFO: renamed from: c */
    public int f90206c;

    /* JADX INFO: renamed from: d */
    public CameraManagerInterface f90207d;

    /* JADX INFO: renamed from: e */
    public View f90208e;

    /* JADX INFO: renamed from: a */
    public final void m89250a() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f90208e;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        this.f90208e = null;
        this.f90207d = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int rotation;
        CameraManagerInterface cameraManagerInterface;
        View view = this.f90208e;
        if (view != null) {
            try {
                rotation = ContextCompat.getDisplayOrDefault(view.getContext()).getRotation();
            } catch (Exception unused) {
                rotation = 0;
            }
            if (view.getHeight() != this.f90205b && view.getWidth() != this.f90204a) {
                view.requestLayout();
            } else if (rotation != this.f90206c && (cameraManagerInterface = this.f90207d) != null) {
                cameraManagerInterface.reinitCamera();
            }
            this.f90204a = view.getWidth();
            this.f90205b = view.getHeight();
            this.f90206c = rotation;
        }
    }
}
