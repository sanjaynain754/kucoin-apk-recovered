package q70;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utaspotlib.R$id;

/* JADX INFO: renamed from: q70.l */
/* JADX INFO: compiled from: UtaOrderStopMarketLayoutBinding.java */
/* JADX INFO: loaded from: classes54.dex */
public final class C43665l implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f96463a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f96464b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f96465c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f96466d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f96467e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f96468f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f96469g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f96470h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f96471i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f96472j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f96473k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f96474l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f96475m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f96476n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43665l m96091a(@NonNull View view) {
        int i11 = R$id.llOrderValue;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.llQuantity;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout2 != null) {
                i11 = R$id.tvOrderValue;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvOrderValueTitle;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tvOrderValueUnit;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.tvPriceTitle;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.tvPriceValue;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.tvQuantityTitle;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null) {
                                        i11 = R$id.tvQuantityUnit;
                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView7 != null) {
                                            i11 = R$id.tvQuantityValue;
                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView8 != null) {
                                                i11 = R$id.tvStopPriceTitle;
                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView9 != null) {
                                                    i11 = R$id.tvStopPriceUnit;
                                                    BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView10 != null) {
                                                        i11 = R$id.tvStopPriceValue;
                                                        BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView11 != null) {
                                                            return new C43665l((LinearLayout) view, linearLayout, linearLayout2, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11);
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
    public LinearLayout getRoot() {
        return this.f96463a;
    }

    public C43665l(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11) {
        this.f96463a = linearLayout;
        this.f96464b = linearLayout2;
        this.f96465c = linearLayout3;
        this.f96466d = baseTextView;
        this.f96467e = baseTextView2;
        this.f96468f = baseTextView3;
        this.f96469g = baseTextView4;
        this.f96470h = baseTextView5;
        this.f96471i = baseTextView6;
        this.f96472j = baseTextView7;
        this.f96473k = baseTextView8;
        this.f96474l = baseTextView9;
        this.f96475m = baseTextView10;
        this.f96476n = baseTextView11;
    }
}
