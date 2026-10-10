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

/* JADX INFO: renamed from: ft.o2 */
/* JADX INFO: compiled from: PaymentItemFastTradeSelectFiatCurrencyBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37664o2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84363a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f84364b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84365c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84366d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37664o2 m84912a(@NonNull View view) {
        int i11 = R$id.ivIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.tvSubTitle;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvTitle;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    return new C37664o2((ConstraintLayout) view, appCompatImageView, baseTextView, baseTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37664o2 m84913c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.payment_item_fast_trade_select_fiat_currency, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84912a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84363a;
    }

    public C37664o2(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f84363a = constraintLayout;
        this.f84364b = appCompatImageView;
        this.f84365c = baseTextView;
        this.f84366d = baseTextView2;
    }
}
