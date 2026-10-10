package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: dm.a2 */
/* JADX INFO: compiled from: BkumexFragmentDelegateRecordsBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36730a2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f79682a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f79683b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f79684c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f79685d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f79686e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f79687f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f79688g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final HorizontalScrollView f79689h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final SlidingTabLayout f79690i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f79691j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f79692k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final CustomViewPager f79693l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36730a2 m82309a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.accountFilter;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.accountFilterDivider))) != null) {
            i11 = R$id.contractFilterTv;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.divider1))) != null) {
                i11 = R$id.filter;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                    i11 = R$id.scrollView;
                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i11);
                    if (horizontalScrollView != null) {
                        i11 = R$id.tabLayout;
                        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                        if (slidingTabLayout != null) {
                            i11 = R$id.timeFilter;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.typeFilter;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.viewPager;
                                    CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
                                    if (customViewPager != null) {
                                        return new C36730a2((ConstraintLayout) view, baseTextView, viewFindChildViewById, baseTextView2, viewFindChildViewById2, linearLayoutCompat, viewFindChildViewById3, horizontalScrollView, slidingTabLayout, baseTextView3, baseTextView4, customViewPager);
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

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36730a2 m82310c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_fragment_delegate_records, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82309a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f79682a;
    }

    public C36730a2(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull View view, @NonNull BaseTextView baseTextView2, @NonNull View view2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view3, @NonNull HorizontalScrollView horizontalScrollView, @NonNull SlidingTabLayout slidingTabLayout, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull CustomViewPager customViewPager) {
        this.f79682a = constraintLayout;
        this.f79683b = baseTextView;
        this.f79684c = view;
        this.f79685d = baseTextView2;
        this.f79686e = view2;
        this.f79687f = linearLayoutCompat;
        this.f79688g = view3;
        this.f79689h = horizontalScrollView;
        this.f79690i = slidingTabLayout;
        this.f79691j = baseTextView3;
        this.f79692k = baseTextView4;
        this.f79693l = customViewPager;
    }
}
