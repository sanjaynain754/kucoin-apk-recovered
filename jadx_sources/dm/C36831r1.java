package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: dm.r1 */
/* JADX INFO: compiled from: BkumexFragmentActiveDelegateBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36831r1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80951a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final NestedScrollView f80952b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f80953c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final SlidingTabLayout f80954d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80955e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KuCheckBox f80956f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f80957g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final CustomViewPager f80958h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36831r1 m82525a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.delegateHeaderNsv;
        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
        if (nestedScrollView != null) {
            i11 = R$id.headerOperationsLl;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.orderCategoriesTabLayout;
                SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                if (slidingTabLayout != null) {
                    i11 = R$id.revokeAll;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.showOnlyCurContractCb;
                        KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
                        if (kuCheckBox != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider))) != null) {
                            i11 = R$id.viewPager;
                            CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
                            if (customViewPager != null) {
                                return new C36831r1((ConstraintLayout) view, nestedScrollView, linearLayout, slidingTabLayout, baseTextView, kuCheckBox, viewFindChildViewById, customViewPager);
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
        return this.f80951a;
    }

    public C36831r1(@NonNull ConstraintLayout constraintLayout, @NonNull NestedScrollView nestedScrollView, @NonNull LinearLayout linearLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull BaseTextView baseTextView, @NonNull KuCheckBox kuCheckBox, @NonNull View view, @NonNull CustomViewPager customViewPager) {
        this.f80951a = constraintLayout;
        this.f80952b = nestedScrollView;
        this.f80953c = linearLayout;
        this.f80954d = slidingTabLayout;
        this.f80955e = baseTextView;
        this.f80956f = kuCheckBox;
        this.f80957g = view;
        this.f80958h = customViewPager;
    }
}
