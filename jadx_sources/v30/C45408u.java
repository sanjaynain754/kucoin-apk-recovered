package v30;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.u */
/* JADX INFO: compiled from: FragmentCoreTradeOpenOrdersBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45408u implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102343a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f102344b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatCheckBox f102345c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f102346d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final SlidingTabLayout f102347e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final NestedScrollView f102348f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final CustomViewPager f102349g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45408u m100353a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.cancel_all_order_btn;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.ctx_current;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i11);
            if (appCompatCheckBox != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line1))) != null) {
                i11 = R$id.sub_tab_layout;
                SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                if (slidingTabLayout != null) {
                    i11 = R$id.view_1;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                    if (nestedScrollView != null) {
                        i11 = R$id.view_pager;
                        CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
                        if (customViewPager != null) {
                            return new C45408u((LinearLayout) view, baseTextView, appCompatCheckBox, viewFindChildViewById, slidingTabLayout, nestedScrollView, customViewPager);
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
        return this.f102343a;
    }

    public C45408u(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull AppCompatCheckBox appCompatCheckBox, @NonNull View view, @NonNull SlidingTabLayout slidingTabLayout, @NonNull NestedScrollView nestedScrollView, @NonNull CustomViewPager customViewPager) {
        this.f102343a = linearLayout;
        this.f102344b = baseTextView;
        this.f102345c = appCompatCheckBox;
        this.f102346d = view;
        this.f102347e = slidingTabLayout;
        this.f102348f = nestedScrollView;
        this.f102349g = customViewPager;
    }
}
