package p270ft;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.m0 */
/* JADX INFO: compiled from: MerchantInfoCardLayoutBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37652m0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f84255a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f84256b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f84257c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f84258d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84259e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84260f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84261g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84262h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84263i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84264j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final View f84265k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37652m0 m84887a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.iv_approve_business;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_fox_king;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.iv_gold_business;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView3 != null) {
                    i11 = R$id.merchant_highlight_0;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.merchant_highlight_1;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.merchant_highlight_2;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.price_value;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tv_avatar;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.tv_nick_name;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_status))) != null) {
                                            return new C37652m0((LinearLayout) view, imageView, imageView2, imageView3, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, viewFindChildViewById);
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
    public LinearLayout getRoot() {
        return this.f84255a;
    }

    public C37652m0(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull View view) {
        this.f84255a = linearLayout;
        this.f84256b = imageView;
        this.f84257c = imageView2;
        this.f84258d = imageView3;
        this.f84259e = baseTextView;
        this.f84260f = baseTextView2;
        this.f84261g = baseTextView3;
        this.f84262h = baseTextView4;
        this.f84263i = baseTextView5;
        this.f84264j = baseTextView6;
        this.f84265k = view;
    }
}
