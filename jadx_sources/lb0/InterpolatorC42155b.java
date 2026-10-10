package lb0;

import android.content.res.Resources;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ScrollingView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.scwang.smart.refresh.layout.kernel.R$id;

/* JADX INFO: renamed from: lb0.b */
/* JADX INFO: compiled from: SmartUtil.java */
/* JADX INFO: loaded from: classes23.dex */
public class InterpolatorC42155b implements Interpolator {

    /* JADX INFO: renamed from: b */
    public static int f93610b = 0;

    /* JADX INFO: renamed from: c */
    public static int f93611c = 1;

    /* JADX INFO: renamed from: d */
    public static float f93612d = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: e */
    public static final float f93613e;

    /* JADX INFO: renamed from: f */
    public static final float f93614f;

    /* JADX INFO: renamed from: a */
    public int f93615a;

    /* JADX INFO: renamed from: a */
    public static boolean m92538a(@NonNull View view, PointF pointF, boolean z11) {
        if (view.canScrollVertically(1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null && !m92543f(view)) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (m92544g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    Object tag = childAt.getTag(R$id.srl_tag);
                    if ("fixed".equals(tag) || "fixed-top".equals(tag)) {
                        return false;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean zM92538a = m92538a(childAt, pointF, z11);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return zM92538a;
                }
            }
        }
        return z11 || view.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m92539b(@NonNull View view, PointF pointF) {
        if (view.canScrollVertically(-1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof ViewGroup) || pointF == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        PointF pointF2 = new PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount - 1);
            if (m92544g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                Object tag = childAt.getTag(R$id.srl_tag);
                if ("fixed".equals(tag) || "fixed-bottom".equals(tag)) {
                    return false;
                }
                pointF.offset(pointF2.x, pointF2.y);
                boolean zM92539b = m92539b(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return zM92539b;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static float m92546i(int i11) {
        return i11 / f93612d;
    }

    /* JADX INFO: renamed from: c */
    public static int m92540c(float f11) {
        return (int) ((f11 * f93612d) + 0.5f);
    }

    /* JADX INFO: renamed from: d */
    public static void m92541d(View view, int i11) {
        if (view instanceof ScrollView) {
            ((ScrollView) view).fling(i11);
            return;
        }
        if (view instanceof AbsListView) {
            ((AbsListView) view).fling(i11);
            return;
        }
        if (view instanceof WebView) {
            ((WebView) view).flingScroll(0, i11);
        } else if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).fling(i11);
        } else if (view instanceof RecyclerView) {
            ((RecyclerView) view).fling(0, i11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m92543f(View view) {
        return (view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof ScrollingView) || (view instanceof WebView) || (view instanceof NestedScrollingChild);
    }

    /* JADX INFO: renamed from: k */
    public static float m92548k(float f11) {
        float f12 = f11 * 8.0f;
        return f12 < 1.0f ? f12 - (1.0f - ((float) Math.exp(-f12))) : ((1.0f - ((float) Math.exp(1.0f - f12))) * 0.63212055f) + 0.36787945f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        if (this.f93615a == f93611c) {
            float f12 = 1.0f - f11;
            return 1.0f - (f12 * f12);
        }
        float fM92548k = f93613e * m92548k(f11);
        return fM92548k > 0.0f ? fM92548k + f93614f : fM92548k;
    }

    static {
        float fM92548k = 1.0f / m92548k(1.0f);
        f93613e = fM92548k;
        f93614f = 1.0f - (fM92548k * m92548k(1.0f));
    }

    public InterpolatorC42155b(int i11) {
        this.f93615a = i11;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m92542e(View view) {
        if (!m92543f(view) && !(view instanceof ViewPager) && !(view instanceof NestedScrollingParent)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m92544g(@NonNull View view, @NonNull View view2, float f11, float f12, PointF pointF) {
        boolean z11;
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f11, f12};
        fArr[0] = (view.getScrollX() - view2.getLeft()) + f11;
        float scrollY = fArr[1] + (view.getScrollY() - view2.getTop());
        fArr[1] = scrollY;
        float f13 = fArr[0];
        if (f13 >= 0.0f && scrollY >= 0.0f && f13 < view2.getWidth() && fArr[1] < view2.getHeight()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && pointF != null) {
            pointF.set(fArr[0] - f11, fArr[1] - f12);
        }
        return z11;
    }

    /* JADX INFO: renamed from: h */
    public static int m92545h(View view) {
        int iMakeMeasureSpec;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i11 = layoutParams.height;
        if (i11 > 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, iMakeMeasureSpec);
        return view.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: j */
    public static void m92547j(@NonNull AbsListView absListView, int i11) {
        absListView.scrollListBy(i11);
    }
}
