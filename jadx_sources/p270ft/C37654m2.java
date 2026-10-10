package p270ft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.m2 */
/* JADX INFO: compiled from: PaymentItemFastSellSelectCryptoCurrencyBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37654m2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84274a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f84275b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84276c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37654m2 m84891a(@NonNull View view) {
        int i11 = R$id.ivIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.tvTitle;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C37654m2((ConstraintLayout) view, appCompatImageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37654m2 m84892c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.payment_item_fast_sell_select_crypto_currency, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84891a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84274a;
    }

    public C37654m2(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView) {
        this.f84274a = constraintLayout;
        this.f84275b = appCompatImageView;
        this.f84276c = baseTextView;
    }
}
