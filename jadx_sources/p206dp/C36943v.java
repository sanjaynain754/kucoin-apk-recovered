package p206dp;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dp.v */
/* JADX INFO: compiled from: BmarginFragmentLayoutToggleSymbolsBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36943v implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f81999a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f82000b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f82001c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f82002d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f82003e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f82004f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f82005g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f82006h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f82007i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f82008j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final FrameLayout f82009k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final RecyclerView f82010l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final RecyclerView f82011m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final KcPrimaryButton f82012n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final KcPrimaryButton f82013o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f82014p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f82015q;

    public C36943v(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull FrameLayout frameLayout2, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f81999a = frameLayout;
        this.f82000b = imageView;
        this.f82001c = baseTextView;
        this.f82002d = linearLayout;
        this.f82003e = linearLayout2;
        this.f82004f = imageView2;
        this.f82005g = imageView3;
        this.f82006h = imageView4;
        this.f82007i = linearLayout3;
        this.f82008j = linearLayout4;
        this.f82009k = frameLayout2;
        this.f82010l = recyclerView;
        this.f82011m = recyclerView2;
        this.f82012n = kcPrimaryButton;
        this.f82013o = kcPrimaryButton2;
        this.f82014p = baseTextView2;
        this.f82015q = baseTextView3;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36943v m82756a(@NonNull View view) {
        int i11 = R$id.empty_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.empty_tips;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.fl_change_rate;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.fl_price;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout2 != null) {
                        i11 = R$id.iv_change_rate;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView2 != null) {
                            i11 = R$id.iv_name;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView3 != null) {
                                i11 = R$id.iv_price;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                if (imageView4 != null) {
                                    i11 = R$id.ll_empty;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout3 != null) {
                                        i11 = R$id.ll_name;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayout4 != null) {
                                            i11 = R$id.ll_sort;
                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                            if (frameLayout != null) {
                                                i11 = R$id.recycler_view;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                                if (recyclerView != null) {
                                                    i11 = R$id.rv_quotes;
                                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                                    if (recyclerView2 != null) {
                                                        i11 = R$id.tv_add_fav;
                                                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                        if (kcPrimaryButton != null) {
                                                            i11 = R$id.tv_login;
                                                            KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                            if (kcPrimaryButton2 != null) {
                                                                i11 = R$id.tv_sort_change_rate;
                                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView2 != null) {
                                                                    i11 = R$id.tv_sort_price;
                                                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView3 != null) {
                                                                        return new C36943v((FrameLayout) view, imageView, baseTextView, linearLayout, linearLayout2, imageView2, imageView3, imageView4, linearLayout3, linearLayout4, frameLayout, recyclerView, recyclerView2, kcPrimaryButton, kcPrimaryButton2, baseTextView2, baseTextView3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f81999a;
    }
}
