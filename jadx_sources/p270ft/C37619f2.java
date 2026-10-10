package p270ft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.f2 */
/* JADX INFO: compiled from: PaymentItemFastBuyPaymentMethodBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37619f2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f83869a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f83870b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f83871c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FlexboxLayout f83872d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FlexboxLayout f83873e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f83874f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f83875g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f83876h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f83877i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f83878j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f83879k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f83880l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37619f2 m84818a(@NonNull View view) {
        int i11 = R$id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.discount_info_tag;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.flexBottom;
                FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                if (flexboxLayout != null) {
                    i11 = R$id.flexTop;
                    FlexboxLayout flexboxLayout2 = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                    if (flexboxLayout2 != null) {
                        i11 = R$id.ivPaymentMethod;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView != null) {
                            i11 = R$id.payment_method_item;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout != null) {
                                i11 = R$id.tvDescription;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tvPaymentMethodName;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tvRecharge;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tvTag;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tvValue;
                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView6 != null) {
                                                    return new C37619f2((FrameLayout) view, barrier, baseTextView, flexboxLayout, flexboxLayout2, appCompatImageView, constraintLayout, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6);
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
    public static C37619f2 m84819c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.payment_item_fast_buy_payment_method, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84818a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f83869a;
    }

    public C37619f2(@NonNull FrameLayout frameLayout, @NonNull Barrier barrier, @NonNull BaseTextView baseTextView, @NonNull FlexboxLayout flexboxLayout, @NonNull FlexboxLayout flexboxLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f83869a = frameLayout;
        this.f83870b = barrier;
        this.f83871c = baseTextView;
        this.f83872d = flexboxLayout;
        this.f83873e = flexboxLayout2;
        this.f83874f = appCompatImageView;
        this.f83875g = constraintLayout;
        this.f83876h = baseTextView2;
        this.f83877i = baseTextView3;
        this.f83878j = baseTextView4;
        this.f83879k = baseTextView5;
        this.f83880l = baseTextView6;
    }
}
