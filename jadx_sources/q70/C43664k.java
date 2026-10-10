package q70;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utaspotlib.R$id;

/* JADX INFO: renamed from: q70.k */
/* JADX INFO: compiled from: UtaOrderStopLimitLayoutBinding.java */
/* JADX INFO: loaded from: classes54.dex */
public final class C43664k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f96450a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f96451b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f96452c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f96453d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f96454e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f96455f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f96456g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f96457h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f96458i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f96459j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f96460k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f96461l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f96462m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43664k m96089a(@NonNull View view) {
        int i11 = R$id.tvOrderValue;
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
                        i11 = R$id.tvPriceUnit;
                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView5 != null) {
                            i11 = R$id.tvPriceValue;
                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView6 != null) {
                                i11 = R$id.tvQuantityTitle;
                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView7 != null) {
                                    i11 = R$id.tvQuantityUnit;
                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView8 != null) {
                                        i11 = R$id.tvQuantityValue;
                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView9 != null) {
                                            i11 = R$id.tvStopPriceTitle;
                                            BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView10 != null) {
                                                i11 = R$id.tvStopPriceUnit;
                                                BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView11 != null) {
                                                    i11 = R$id.tvStopPriceValue;
                                                    BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView12 != null) {
                                                        return new C43664k((LinearLayout) view, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12);
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
        return this.f96450a;
    }

    public C43664k(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12) {
        this.f96450a = linearLayout;
        this.f96451b = baseTextView;
        this.f96452c = baseTextView2;
        this.f96453d = baseTextView3;
        this.f96454e = baseTextView4;
        this.f96455f = baseTextView5;
        this.f96456g = baseTextView6;
        this.f96457h = baseTextView7;
        this.f96458i = baseTextView8;
        this.f96459j = baseTextView9;
        this.f96460k = baseTextView10;
        this.f96461l = baseTextView11;
        this.f96462m = baseTextView12;
    }
}
