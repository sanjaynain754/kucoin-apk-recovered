package p270ft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.j2 */
/* JADX INFO: compiled from: PaymentItemFastSellPaymentMethodBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37639j2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84093a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f84094b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f84095c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84096d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84097e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84098f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84099g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37639j2 m84861a(@NonNull View view) {
        int i11 = R$id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.ivPaymentMethod;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.tvDescription;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvPaymentMethodName;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tvTag;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.tvValue;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                return new C37639j2((ConstraintLayout) view, barrier, appCompatImageView, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
    public static C37639j2 m84862c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.payment_item_fast_sell_payment_method, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84861a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84093a;
    }

    public C37639j2(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f84093a = constraintLayout;
        this.f84094b = barrier;
        this.f84095c = appCompatImageView;
        this.f84096d = baseTextView;
        this.f84097e = baseTextView2;
        this.f84098f = baseTextView3;
        this.f84099g = baseTextView4;
    }
}
