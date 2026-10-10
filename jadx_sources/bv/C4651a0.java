package bv;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: bv.a0 */
/* JADX INFO: compiled from: FragmentSpotMarketBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4651a0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f4195a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f4196b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f4197c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C4673i0 f4198d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f4199e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ViewPager2 f4200f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4651a0 m4614a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.iv_guide_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ll_float_guide;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.spot_tab))) != null) {
                C4673i0 c4673i0M4658a = C4673i0.m4658a(viewFindChildViewById);
                i11 = R$id.tv_guide_action;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i11);
                    if (viewPager2 != null) {
                        return new C4651a0((LinearLayout) view, imageView, linearLayout, c4673i0M4658a, baseTextView, viewPager2);
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
        return this.f4195a;
    }

    public C4651a0(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull C4673i0 c4673i0, @NonNull BaseTextView baseTextView, @NonNull ViewPager2 viewPager2) {
        this.f4195a = linearLayout;
        this.f4196b = imageView;
        this.f4197c = linearLayout2;
        this.f4198d = c4673i0;
        this.f4199e = baseTextView;
        this.f4200f = viewPager2;
    }
}
