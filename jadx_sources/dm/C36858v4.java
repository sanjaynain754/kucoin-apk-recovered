package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.v4 */
/* JADX INFO: compiled from: BkumexViewTraderProChallengeBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36858v4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f81251a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FlexboxLayout f81252b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f81253c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81254d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81255e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f81256f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FlexboxLayout f81257g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f81258h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ConstraintLayout f81259i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81260j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f81261k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f81262l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f81263m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36858v4 m82581a(@NonNull View view) {
        int i11 = R$id.actionButtonGroup;
        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
        if (flexboxLayout != null) {
            i11 = R$id.amountGroup;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.btnProgress;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.btnUse;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.cardContainer;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout2 != null) {
                            i11 = R$id.contentRow;
                            FlexboxLayout flexboxLayout2 = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                            if (flexboxLayout2 != null) {
                                i11 = R$id.ivClose;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                if (imageView != null) {
                                    i11 = R$id.titleRowGroup;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                    if (constraintLayout3 != null) {
                                        i11 = R$id.tvAmount;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tvCountdown;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.tvCurrency;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    i11 = R$id.tvTitle;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        return new C36858v4(view, flexboxLayout, constraintLayout, baseTextView, baseTextView2, constraintLayout2, flexboxLayout2, imageView, constraintLayout3, baseTextView3, baseTextView4, baseTextView5, baseTextView6);
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

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C36858v4 m82582b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.bkumex_view_trader_pro_challenge, viewGroup);
        return m82581a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f81251a;
    }

    public C36858v4(@NonNull View view, @NonNull FlexboxLayout flexboxLayout, @NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull ConstraintLayout constraintLayout2, @NonNull FlexboxLayout flexboxLayout2, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout3, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f81251a = view;
        this.f81252b = flexboxLayout;
        this.f81253c = constraintLayout;
        this.f81254d = baseTextView;
        this.f81255e = baseTextView2;
        this.f81256f = constraintLayout2;
        this.f81257g = flexboxLayout2;
        this.f81258h = imageView;
        this.f81259i = constraintLayout3;
        this.f81260j = baseTextView3;
        this.f81261k = baseTextView4;
        this.f81262l = baseTextView5;
        this.f81263m = baseTextView6;
    }
}
