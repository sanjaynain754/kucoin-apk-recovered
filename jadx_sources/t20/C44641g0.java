package t20;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.g0 */
/* JADX INFO: compiled from: FragmentTradeOpenOrdersBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44641g0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99070a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f99071b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCheckBox f99072c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f99073d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final SlidingTabLayout f99074e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final NestedScrollView f99075f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final CustomViewPager f99076g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44641g0 m98759a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.cancelAll;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.ctx_current;
            KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
            if (kuCheckBox != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line1))) != null) {
                i11 = R$id.sub_tab_layout;
                SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                if (slidingTabLayout != null) {
                    i11 = R$id.view_1;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                    if (nestedScrollView != null) {
                        i11 = R$id.view_pager;
                        CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
                        if (customViewPager != null) {
                            return new C44641g0((LinearLayout) view, baseTextView, kuCheckBox, viewFindChildViewById, slidingTabLayout, nestedScrollView, customViewPager);
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
    public LinearLayout getRoot() {
        return this.f99070a;
    }

    public C44641g0(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull KuCheckBox kuCheckBox, @NonNull View view, @NonNull SlidingTabLayout slidingTabLayout, @NonNull NestedScrollView nestedScrollView, @NonNull CustomViewPager customViewPager) {
        this.f99070a = linearLayout;
        this.f99071b = baseTextView;
        this.f99072c = kuCheckBox;
        this.f99073d = view;
        this.f99074e = slidingTabLayout;
        this.f99075f = nestedScrollView;
        this.f99076g = customViewPager;
    }
}
