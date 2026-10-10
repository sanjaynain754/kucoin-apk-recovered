package dm;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: dm.v2 */
/* JADX INFO: compiled from: BkumexFragmentMarketInfoBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36856v2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CoordinatorLayout f81233a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f81234b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f81235c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f81236d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f81237e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81238f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final C36744c4 f81239g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final C36786j4 f81240h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81241i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81242j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final CustomViewPager f81243k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36856v2 m82577a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.actionTab;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.bottomOperationLl;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.bottomSheet;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null) {
                    i11 = R$id.bottom_sheet_container;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout2 != null) {
                        i11 = R$id.buy;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.headerCl))) != null) {
                            C36744c4 c36744c4M82339a = C36744c4.m82339a(viewFindChildViewById);
                            i11 = R$id.preMarketHint;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
                            if (viewFindChildViewById2 != null) {
                                C36786j4 c36786j4M82430a = C36786j4.m82430a(viewFindChildViewById2);
                                i11 = R$id.robot;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.sell;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.viewPager;
                                        CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
                                        if (customViewPager != null) {
                                            return new C36856v2((CoordinatorLayout) view, slidingTabLayout, linearLayout, frameLayout, frameLayout2, baseTextView, c36744c4M82339a, c36786j4M82430a, baseTextView2, baseTextView3, customViewPager);
                                        }
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
    public CoordinatorLayout getRoot() {
        return this.f81233a;
    }

    public C36856v2(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull BaseTextView baseTextView, @NonNull C36744c4 c36744c4, @NonNull C36786j4 c36786j4, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull CustomViewPager customViewPager) {
        this.f81233a = coordinatorLayout;
        this.f81234b = slidingTabLayout;
        this.f81235c = linearLayout;
        this.f81236d = frameLayout;
        this.f81237e = frameLayout2;
        this.f81238f = baseTextView;
        this.f81239g = c36744c4;
        this.f81240h = c36786j4;
        this.f81241i = baseTextView2;
        this.f81242j = baseTextView3;
        this.f81243k = customViewPager;
    }
}
