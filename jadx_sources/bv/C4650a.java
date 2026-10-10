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

/* JADX INFO: renamed from: bv.a */
/* JADX INFO: compiled from: FavoriteItemViewSortBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4650a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f4181a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f4182b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f4183c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f4184d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f4185e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f4186f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f4187g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f4188h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f4189i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final FrameLayout f4190j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f4191k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f4192l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f4193m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f4194n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4650a m4612a(@NonNull View view) {
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
                                                        return new C4650a(frameLayout2, frameLayout, linearLayout, imageView, imageView2, imageView3, imageView4, linearLayout2, linearLayout3, frameLayout2, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
        return this.f4181a;
    }

    public C4650a(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull FrameLayout frameLayout3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f4181a = frameLayout;
        this.f4182b = frameLayout2;
        this.f4183c = linearLayout;
        this.f4184d = imageView;
        this.f4185e = imageView2;
        this.f4186f = imageView3;
        this.f4187g = imageView4;
        this.f4188h = linearLayout2;
        this.f4189i = linearLayout3;
        this.f4190j = frameLayout3;
        this.f4191k = baseTextView;
        this.f4192l = baseTextView2;
        this.f4193m = baseTextView3;
        this.f4194n = baseTextView4;
    }
}
