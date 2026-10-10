package p270ft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.p2 */
/* JADX INFO: compiled from: PaymentItemFastTradeSelectFiatCurrencyHeaderBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37669p2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f84395a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f84396b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84397c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84398d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37669p2 m84923a(@NonNull View view) {
        int i11 = R$id.ivIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.tvSubTitle;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvTitle;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    return new C37669p2((LinearLayout) view, appCompatImageView, baseTextView, baseTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37669p2 m84924c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.payment_item_fast_trade_select_fiat_currency_header, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84923a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f84395a;
    }

    public C37669p2(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f84395a = linearLayout;
        this.f84396b = appCompatImageView;
        this.f84397c = baseTextView;
        this.f84398d = baseTextView2;
    }
}
