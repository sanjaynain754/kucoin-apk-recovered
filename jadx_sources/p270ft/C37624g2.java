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

/* JADX INFO: renamed from: ft.g2 */
/* JADX INFO: compiled from: PaymentItemFastBuyPaymentMethodCategoryBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37624g2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83927a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f83928b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f83929c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f83930d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f83931e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37624g2 m84829a(@NonNull View view) {
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
                        return new C37624g2((ConstraintLayout) view, appCompatImageView, linearLayoutCompat, baseTextView, baseTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37624g2 m84830c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.payment_item_fast_buy_payment_method_category, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84829a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83927a;
    }

    public C37624g2(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f83927a = constraintLayout;
        this.f83928b = appCompatImageView;
        this.f83929c = linearLayoutCompat;
        this.f83930d = baseTextView;
        this.f83931e = baseTextView2;
    }
}
