package bv;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: bv.l0 */
/* JADX INFO: compiled from: QuoteItemViewSortAlphaBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4679l0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f4417a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f4418b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f4419c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f4420d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f4421e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f4422f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f4423g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f4424h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f4425i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayoutCompat f4426j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f4427k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f4428l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f4429m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4679l0 m4670a(@NonNull View view) {
        int i11 = R$id.fl_change_rate;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.fl_price;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout2 != null) {
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
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout3 != null) {
                                    i11 = R$id.ll_name;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout4 != null) {
                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                                        i11 = R$id.tv_sort_amount;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.tv_sort_change_rate;
                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView2 != null) {
                                                i11 = R$id.tv_sort_price;
                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView3 != null) {
                                                    return new C4679l0(linearLayoutCompat, linearLayout, linearLayout2, imageView, imageView2, imageView3, imageView4, linearLayout3, linearLayout4, linearLayoutCompat, baseTextView, baseTextView2, baseTextView3);
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
    public LinearLayoutCompat getRoot() {
        return this.f4417a;
    }

    public C4679l0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f4417a = linearLayoutCompat;
        this.f4418b = linearLayout;
        this.f4419c = linearLayout2;
        this.f4420d = imageView;
        this.f4421e = imageView2;
        this.f4422f = imageView3;
        this.f4423g = imageView4;
        this.f4424h = linearLayout3;
        this.f4425i = linearLayout4;
        this.f4426j = linearLayoutCompat2;
        this.f4427k = baseTextView;
        this.f4428l = baseTextView2;
        this.f4429m = baseTextView3;
    }
}
