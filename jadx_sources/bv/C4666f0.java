package bv;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: bv.f0 */
/* JADX INFO: compiled from: MarketHoldingsViewSortBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4666f0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f4320a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f4321b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f4322c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f4323d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f4324e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f4325f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f4326g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f4327h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f4328i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final FrameLayout f4329j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f4330k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f4331l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f4332m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f4333n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f4334o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4666f0 m4644a(@NonNull View view) {
        int i11 = R$id.fl_change_rate;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.fl_price;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.iv_amount;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.iv_change_rate;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView2 != null) {
                        i11 = R$id.iv_name;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView3 != null) {
                            i11 = R$id.iv_price;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView4 != null) {
                                i11 = R$id.ll_amount;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout2 != null) {
                                    i11 = R$id.ll_name;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout3 != null) {
                                        FrameLayout frameLayout2 = (FrameLayout) view;
                                        i11 = R$id.tvName;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.tvNameDivider;
                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView2 != null) {
                                                i11 = R$id.tv_sort_amount;
                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView3 != null) {
                                                    i11 = R$id.tv_sort_change_rate;
                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView4 != null) {
                                                        i11 = R$id.tv_sort_price;
                                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView5 != null) {
                                                            return new C4666f0(frameLayout2, frameLayout, linearLayout, imageView, imageView2, imageView3, imageView4, linearLayout2, linearLayout3, frameLayout2, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5);
                                                        }
                                                    }
                                                }
                                            }
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
    public FrameLayout getRoot() {
        return this.f4320a;
    }

    public C4666f0(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull FrameLayout frameLayout3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5) {
        this.f4320a = frameLayout;
        this.f4321b = frameLayout2;
        this.f4322c = linearLayout;
        this.f4323d = imageView;
        this.f4324e = imageView2;
        this.f4325f = imageView3;
        this.f4326g = imageView4;
        this.f4327h = linearLayout2;
        this.f4328i = linearLayout3;
        this.f4329j = frameLayout3;
        this.f4330k = baseTextView;
        this.f4331l = baseTextView2;
        this.f4332m = baseTextView3;
        this.f4333n = baseTextView4;
        this.f4334o = baseTextView5;
    }
}
