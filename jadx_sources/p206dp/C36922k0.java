package p206dp;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: dp.k0 */
/* JADX INFO: compiled from: BmarginFragmentTradeOpenOrdersBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36922k0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81769a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81770b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCheckBox f81771c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f81772d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final SlidingTabLayout f81773e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final NestedScrollView f81774f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final CustomViewPager f81775g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36922k0 m82712a(@NonNull View view) {
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
                            return new C36922k0((LinearLayout) view, baseTextView, kuCheckBox, viewFindChildViewById, slidingTabLayout, nestedScrollView, customViewPager);
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
        return this.f81769a;
    }

    public C36922k0(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull KuCheckBox kuCheckBox, @NonNull View view, @NonNull SlidingTabLayout slidingTabLayout, @NonNull NestedScrollView nestedScrollView, @NonNull CustomViewPager customViewPager) {
        this.f81769a = linearLayout;
        this.f81770b = baseTextView;
        this.f81771c = kuCheckBox;
        this.f81772d = view;
        this.f81773e = slidingTabLayout;
        this.f81774f = nestedScrollView;
        this.f81775g = customViewPager;
    }
}
