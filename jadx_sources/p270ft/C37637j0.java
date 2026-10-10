package p270ft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;

/* JADX INFO: renamed from: ft.j0 */
/* JADX INFO: compiled from: MarketingCouponCardBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37637j0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84065a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KuCheckBox f84066b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84067c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84068d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84069e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84070f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f84071g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final Layer f84072h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AppCompatImageView f84073i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84074j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f84075k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f84076l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final AppCompatImageView f84077m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f84078n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37637j0 m84856a(@NonNull View view) {
        int i11 = R$id.check_box;
        KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
        if (kuCheckBox != null) {
            i11 = R$id.discount_amount;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.discount_payment_method;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.discount_text;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.discount_title;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            i11 = R$id.marketing_coupon_card_left_bg;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatImageView != null) {
                                i11 = R$id.marketing_coupon_card_right_bg;
                                Layer layer = (Layer) ViewBindings.findChildViewById(view, i11);
                                if (layer != null) {
                                    i11 = R$id.payment_show_icon;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                    if (appCompatImageView2 != null) {
                                        i11 = R$id.payment_show_text;
                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView5 != null) {
                                            i11 = R$id.tv_expire_time;
                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView6 != null) {
                                                i11 = R$id.unsupported_reason_detail;
                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView7 != null) {
                                                    i11 = R$id.unsupported_reason_icon;
                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                    if (appCompatImageView3 != null) {
                                                        i11 = R$id.unsupported_reason_text;
                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView8 != null) {
                                                            return new C37637j0((ConstraintLayout) view, kuCheckBox, baseTextView, baseTextView2, baseTextView3, baseTextView4, appCompatImageView, layer, appCompatImageView2, baseTextView5, baseTextView6, baseTextView7, appCompatImageView3, baseTextView8);
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

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37637j0 m84857c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.marketing_coupon_card, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84856a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84065a;
    }

    public C37637j0(@NonNull ConstraintLayout constraintLayout, @NonNull KuCheckBox kuCheckBox, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull AppCompatImageView appCompatImageView, @NonNull Layer layer, @NonNull AppCompatImageView appCompatImageView2, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull AppCompatImageView appCompatImageView3, @NonNull BaseTextView baseTextView8) {
        this.f84065a = constraintLayout;
        this.f84066b = kuCheckBox;
        this.f84067c = baseTextView;
        this.f84068d = baseTextView2;
        this.f84069e = baseTextView3;
        this.f84070f = baseTextView4;
        this.f84071g = appCompatImageView;
        this.f84072h = layer;
        this.f84073i = appCompatImageView2;
        this.f84074j = baseTextView5;
        this.f84075k = baseTextView6;
        this.f84076l = baseTextView7;
        this.f84077m = appCompatImageView3;
        this.f84078n = baseTextView8;
    }
}
