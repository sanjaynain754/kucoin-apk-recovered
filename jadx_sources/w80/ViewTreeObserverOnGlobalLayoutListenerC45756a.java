package w80;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.kubi.sdk.util.EdgeToEdgeCompat;

/* JADX INFO: renamed from: w80.a */
/* JADX INFO: compiled from: AndroidBug5497Workaround.java */
/* JADX INFO: loaded from: classes59.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC45756a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b */
    public Activity f103169b;

    /* JADX INFO: renamed from: c */
    public View f103170c;

    /* JADX INFO: renamed from: d */
    public FrameLayout.LayoutParams f103171d;

    /* JADX INFO: renamed from: e */
    public int f103172e;

    /* JADX INFO: renamed from: f */
    public int f103173f;

    /* JADX INFO: renamed from: g */
    public boolean f103174g = false;

    /* JADX INFO: renamed from: b */
    public final int m101015b() {
        if (Build.VERSION.SDK_INT >= 35 || EdgeToEdgeCompat.f48106a.m58275m(this.f103169b)) {
            return EdgeToEdgeCompat.f48106a.m58271i();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m101016c() {
        if (this.f103174g) {
            return 0;
        }
        return this.f103173f;
    }

    /* JADX INFO: renamed from: d */
    public final int m101017d() {
        Rect rect = new Rect();
        this.f103170c.getWindowVisibleDisplayFrame(rect);
        return rect.bottom;
    }

    /* JADX INFO: renamed from: g */
    public final void m101019g(Boolean bool) {
        if (this.f103172e != 0 && bool.booleanValue() != this.f103174g) {
            this.f103172e = 0;
        }
        this.f103174g = bool.booleanValue();
    }

    public ViewTreeObserverOnGlobalLayoutListenerC45756a(Activity activity) {
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        this.f103169b = activity;
        this.f103170c = frameLayout.getChildAt(0);
        this.f103173f = EdgeToEdgeCompat.f48106a.m58272j();
        this.f103171d = (FrameLayout.LayoutParams) this.f103170c.getLayoutParams();
        try {
            this.f103170c.getViewTreeObserver().addOnGlobalLayoutListener(this);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m101013a(Activity activity, Boolean bool) {
        m101014e(activity).m101019g(bool);
    }

    /* JADX INFO: renamed from: e */
    public static ViewTreeObserverOnGlobalLayoutListenerC45756a m101014e(Activity activity) {
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        Object tag = frameLayout.getTag();
        if (tag instanceof ViewTreeObserverOnGlobalLayoutListenerC45756a) {
            return (ViewTreeObserverOnGlobalLayoutListenerC45756a) tag;
        }
        ViewTreeObserverOnGlobalLayoutListenerC45756a viewTreeObserverOnGlobalLayoutListenerC45756a = new ViewTreeObserverOnGlobalLayoutListenerC45756a(activity);
        frameLayout.setTag(viewTreeObserverOnGlobalLayoutListenerC45756a);
        return viewTreeObserverOnGlobalLayoutListenerC45756a;
    }

    /* JADX INFO: renamed from: f */
    public final void m101018f() {
        int iM101017d = m101017d();
        if (iM101017d != this.f103172e) {
            int height = this.f103170c.getRootView().getHeight();
            int i11 = height - iM101017d;
            if (i11 > height / 4) {
                this.f103171d.height = (height - i11) - m101016c();
            } else {
                this.f103171d.height = (height - m101015b()) - m101016c();
            }
            this.f103170c.requestLayout();
            this.f103172e = iM101017d;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m101018f();
    }
}
