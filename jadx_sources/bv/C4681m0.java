package bv;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: bv.m0 */
/* JADX INFO: compiled from: QuoteItemViewSortBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4681m0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f4444a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f4445b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f4446c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f4447d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f4448e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f4449f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f4450g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f4451h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f4452i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f4453j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final FrameLayout f4454k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final AppCompatImageView f4455l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f4456m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f4457n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f4458o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f4459p;

    public C4681m0(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull FrameLayout frameLayout3, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f4444a = frameLayout;
        this.f4445b = frameLayout2;
        this.f4446c = linearLayout;
        this.f4447d = imageView;
        this.f4448e = imageView2;
        this.f4449f = imageView3;
        this.f4450g = imageView4;
        this.f4451h = linearLayout2;
        this.f4452i = linearLayout3;
        this.f4453j = linearLayout4;
        this.f4454k = frameLayout3;
        this.f4455l = appCompatImageView;
        this.f4456m = baseTextView;
        this.f4457n = baseTextView2;
        this.f4458o = baseTextView3;
        this.f4459p = baseTextView4;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4681m0 m4674a(@NonNull View view) {
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
                                i11 = R$id.layoutNameAmonut;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout2 != null) {
                                    i11 = R$id.ll_amount;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout3 != null) {
                                        i11 = R$id.ll_name;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayout4 != null) {
                                            FrameLayout frameLayout2 = (FrameLayout) view;
                                            i11 = R$id.toggleSortTypeIv;
                                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                            if (appCompatImageView != null) {
                                                i11 = R$id.tv_name;
                                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView != null) {
                                                    i11 = R$id.tv_sort_amount;
                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView2 != null) {
                                                        i11 = R$id.tv_sort_change_rate;
                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView3 != null) {
                                                            i11 = R$id.tv_sort_price;
                                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView4 != null) {
                                                                return new C4681m0(frameLayout2, frameLayout, linearLayout, imageView, imageView2, imageView3, imageView4, linearLayout2, linearLayout3, linearLayout4, frameLayout2, appCompatImageView, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f4444a;
    }
}
