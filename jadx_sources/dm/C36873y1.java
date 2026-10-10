package dm;

import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: dm.y1 */
/* JADX INFO: compiled from: BkumexFragmentCurrentDelegateBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36873y1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81361a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81362b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f81363c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81364d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f81365e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f81366f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f81367g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f81368h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final SlidingTabLayout f81369i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final HorizontalScrollView f81370j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final CustomViewPager f81371k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36873y1 m82614a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.assetTypeFilterTv;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.cancelAll;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.contractFilterTv;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider1))) != null) {
                    i11 = R$id.filter;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat != null) {
                        i11 = R$id.headerOperationsCl;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                            i11 = R$id.orderCategoriesTabLayout;
                            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                            if (slidingTabLayout != null) {
                                i11 = R$id.scrollView;
                                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i11);
                                if (horizontalScrollView != null) {
                                    i11 = R$id.viewPager;
                                    CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
                                    if (customViewPager != null) {
                                        return new C36873y1((ConstraintLayout) view, baseTextView, baseTextView2, baseTextView3, viewFindChildViewById, linearLayoutCompat, constraintLayout, viewFindChildViewById2, slidingTabLayout, horizontalScrollView, customViewPager);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81361a;
    }

    public C36873y1(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ConstraintLayout constraintLayout2, @NonNull View view2, @NonNull SlidingTabLayout slidingTabLayout, @NonNull HorizontalScrollView horizontalScrollView, @NonNull CustomViewPager customViewPager) {
        this.f81361a = constraintLayout;
        this.f81362b = baseTextView;
        this.f81363c = baseTextView2;
        this.f81364d = baseTextView3;
        this.f81365e = view;
        this.f81366f = linearLayoutCompat;
        this.f81367g = constraintLayout2;
        this.f81368h = view2;
        this.f81369i = slidingTabLayout;
        this.f81370j = horizontalScrollView;
        this.f81371k = customViewPager;
    }
}
