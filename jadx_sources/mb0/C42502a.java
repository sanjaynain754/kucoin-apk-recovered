package mb0;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.viewpager.widget.ViewPager;
import com.scwang.smart.refresh.layout.kernel.R$id;
import hb0.InterfaceC38158b;
import hb0.InterfaceC38161e;
import java.util.LinkedList;
import jb0.InterfaceC40367a;
import jb0.InterfaceC40376j;
import kb0.C40972a;
import lb0.C42154a;
import lb0.InterpolatorC42155b;

/* JADX INFO: renamed from: mb0.a */
/* JADX INFO: compiled from: RefreshContentWrapper.java */
/* JADX INFO: loaded from: classes23.dex */
public class C42502a implements InterfaceC38158b, InterfaceC40367a, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b */
    public View f94171b;

    /* JADX INFO: renamed from: c */
    public View f94172c;

    /* JADX INFO: renamed from: d */
    public View f94173d;

    /* JADX INFO: renamed from: e */
    public View f94174e;

    /* JADX INFO: renamed from: f */
    public View f94175f;

    /* JADX INFO: renamed from: g */
    public int f94176g = 0;

    /* JADX INFO: renamed from: h */
    public boolean f94177h = true;

    /* JADX INFO: renamed from: i */
    public boolean f94178i = true;

    /* JADX INFO: renamed from: j */
    public C40972a f94179j = new C40972a();

    @Override // hb0.InterfaceC38158b
    /* JADX INFO: renamed from: e */
    public void mo86110e(int i11, int i12, int i13) {
        boolean z11;
        View viewFindViewById;
        View viewFindViewById2;
        boolean z12 = true;
        if (i12 == -1 || (viewFindViewById2 = this.f94172c.findViewById(i12)) == null) {
            z11 = false;
        } else if (i11 > 0) {
            viewFindViewById2.setTranslationY(i11);
            z11 = true;
        } else {
            if (viewFindViewById2.getTranslationY() > 0.0f) {
                viewFindViewById2.setTranslationY(0.0f);
            }
            z11 = false;
        }
        if (i13 == -1 || (viewFindViewById = this.f94172c.findViewById(i13)) == null) {
            z12 = z11;
        } else if (i11 < 0) {
            viewFindViewById.setTranslationY(i11);
        } else {
            if (viewFindViewById.getTranslationY() < 0.0f) {
                viewFindViewById.setTranslationY(0.0f);
            }
            z12 = z11;
        }
        if (z12) {
            this.f94172c.setTranslationY(0.0f);
        } else {
            this.f94172c.setTranslationY(i11);
        }
        View view = this.f94174e;
        if (view != null) {
            view.setTranslationY(Math.max(0, i11));
        }
        View view2 = this.f94175f;
        if (view2 != null) {
            view2.setTranslationY(Math.min(0, i11));
        }
    }

    @Override // hb0.InterfaceC38158b
    /* JADX INFO: renamed from: a */
    public void mo86106a(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.f94171b.getLeft(), -this.f94171b.getTop());
        View view = this.f94173d;
        View view2 = this.f94171b;
        if (view != view2) {
            this.f94173d = m93187l(view2, pointF, view);
        }
        if (this.f94173d == this.f94171b) {
            this.f94179j.f91062a = null;
        } else {
            this.f94179j.f91062a = pointF;
        }
    }

    @Override // hb0.InterfaceC38158b
    /* JADX INFO: renamed from: b */
    public void mo86107b(InterfaceC40376j interfaceC40376j) {
        if (interfaceC40376j instanceof C40972a) {
            this.f94179j = (C40972a) interfaceC40376j;
        } else {
            this.f94179j.f91063b = interfaceC40376j;
        }
    }

    @Override // hb0.InterfaceC38158b
    /* JADX INFO: renamed from: c */
    public void mo86108c(boolean z11) {
        this.f94179j.f91064c = z11;
    }

    @Override // hb0.InterfaceC38158b
    /* JADX INFO: renamed from: d */
    public ValueAnimator.AnimatorUpdateListener mo86109d(int i11) {
        View view = this.f94173d;
        if (view == null || i11 == 0) {
            return null;
        }
        if ((i11 >= 0 || !view.canScrollVertically(1)) && (i11 <= 0 || !this.f94173d.canScrollVertically(-1))) {
            return null;
        }
        this.f94176g = i11;
        return this;
    }

    @Override // hb0.InterfaceC38158b
    /* JADX INFO: renamed from: f */
    public void mo86111f(InterfaceC38161e interfaceC38161e, View view, View view2) {
        m93186k(this.f94171b, interfaceC38161e);
        if (view == null && view2 == null) {
            return;
        }
        this.f94174e = view;
        this.f94175f = view2;
        FrameLayout frameLayout = new FrameLayout(this.f94171b.getContext());
        int iIndexOfChild = interfaceC38161e.mo68569b().getLayout().indexOfChild(this.f94171b);
        interfaceC38161e.mo68569b().getLayout().removeView(this.f94171b);
        frameLayout.addView(this.f94171b, 0, new ViewGroup.LayoutParams(-1, -1));
        interfaceC38161e.mo68569b().getLayout().addView(frameLayout, iIndexOfChild, this.f94171b.getLayoutParams());
        this.f94171b = frameLayout;
        if (view != null) {
            view.setTag(R$id.srl_tag, "fixed-top");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int iIndexOfChild2 = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            layoutParams.height = InterpolatorC42155b.m92545h(view);
            viewGroup.addView(new Space(this.f94171b.getContext()), iIndexOfChild2, layoutParams);
            frameLayout.addView(view, 1, layoutParams);
        }
        if (view2 != null) {
            view2.setTag(R$id.srl_tag, "fixed-bottom");
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
            int iIndexOfChild3 = viewGroup2.indexOfChild(view2);
            viewGroup2.removeView(view2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
            layoutParams2.height = InterpolatorC42155b.m92545h(view2);
            viewGroup2.addView(new Space(this.f94171b.getContext()), iIndexOfChild3, layoutParams2);
            layoutParams3.gravity = 80;
            frameLayout.addView(view2, 1, layoutParams3);
        }
    }

    @Override // hb0.InterfaceC38158b
    /* JADX INFO: renamed from: g */
    public boolean mo86112g() {
        return this.f94178i && this.f94179j.mo88968a(this.f94171b);
    }

    @Override // hb0.InterfaceC38158b
    @NonNull
    public View getView() {
        return this.f94171b;
    }

    @Override // hb0.InterfaceC38158b
    @NonNull
    /* JADX INFO: renamed from: h */
    public View mo86113h() {
        return this.f94173d;
    }

    @Override // hb0.InterfaceC38158b
    /* JADX INFO: renamed from: i */
    public boolean mo86114i() {
        return this.f94177h && this.f94179j.mo88969b(this.f94171b);
    }

    @Override // jb0.InterfaceC40367a
    /* JADX INFO: renamed from: j */
    public void mo88967j(boolean z11, boolean z12) {
        this.f94177h = z11;
        this.f94178i = z12;
    }

    /* JADX INFO: renamed from: k */
    public void m93186k(View view, InterfaceC38161e interfaceC38161e) {
        boolean zIsInEditMode = this.f94171b.isInEditMode();
        View view2 = null;
        while (true) {
            if (view2 != null && (!(view2 instanceof NestedScrollingParent) || (view2 instanceof NestedScrollingChild))) {
                break;
            }
            view = m93188m(view, view2 == null);
            if (view == view2) {
                break;
            }
            if (!zIsInEditMode) {
                C42154a.m92537a(view, interfaceC38161e, this);
            }
            view2 = view;
        }
        if (view2 != null) {
            this.f94173d = view2;
        }
    }

    /* JADX INFO: renamed from: l */
    public View m93187l(View view, PointF pointF, View view2) {
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (InterpolatorC42155b.m92544g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && InterpolatorC42155b.m92542e(childAt)) {
                        return childAt;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    View viewM93187l = m93187l(childAt, pointF, view2);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return viewM93187l;
                }
            }
        }
        return view2;
    }

    /* JADX INFO: renamed from: m */
    public View m93188m(View view, boolean z11) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        View view2 = null;
        while (linkedList.size() > 0 && view2 == null) {
            View view3 = (View) linkedList.poll();
            if (view3 != null) {
                if ((z11 || view3 != view) && InterpolatorC42155b.m92542e(view3)) {
                    view2 = view3;
                } else if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                        linkedList.add(viewGroup.getChildAt(i11));
                    }
                }
            }
        }
        return view2 == null ? view : view2;
    }

    public C42502a(@NonNull View view) {
        this.f94173d = view;
        this.f94172c = view;
        this.f94171b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (iIntValue - this.f94176g) * this.f94173d.getScaleY();
            View view = this.f94173d;
            if (view instanceof AbsListView) {
                InterpolatorC42155b.m92547j((AbsListView) view, (int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        this.f94176g = iIntValue;
    }
}
