package p270ft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.k2 */
/* JADX INFO: compiled from: PaymentItemFastSellPaymentMethodCategoryBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37644k2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84170a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f84171b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f84172c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84173d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84174e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37644k2 m84871a(@NonNull View view) {
        int i11 = R$id.ivEdit;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.llCategory;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.tvCategoryTitle;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvReceive;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C37644k2((ConstraintLayout) view, appCompatImageView, linearLayoutCompat, baseTextView, baseTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37644k2 m84872c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.payment_item_fast_sell_payment_method_category, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84871a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84170a;
    }

    public C37644k2(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f84170a = constraintLayout;
        this.f84171b = appCompatImageView;
        this.f84172c = linearLayoutCompat;
        this.f84173d = baseTextView;
        this.f84174e = baseTextView2;
    }
}
