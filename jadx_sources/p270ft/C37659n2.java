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

/* JADX INFO: renamed from: ft.n2 */
/* JADX INFO: compiled from: PaymentItemFastTradeSelectCryptoCurrencyBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37659n2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84324a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f84325b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84326c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84327d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f84328e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84329f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84330g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37659n2 m84901a(@NonNull View view) {
        int i11 = R$id.balance_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.balance_tv;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.conversion_balance_tv;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.ivIcon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.tvSubTitle;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.tvTitle;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                return new C37659n2((ConstraintLayout) view, barrier, baseTextView, baseTextView2, appCompatImageView, baseTextView3, baseTextView4);
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
    public static C37659n2 m84902c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.payment_item_fast_trade_select_crypto_currency, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84901a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84324a;
    }

    public C37659n2(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f84324a = constraintLayout;
        this.f84325b = barrier;
        this.f84326c = baseTextView;
        this.f84327d = baseTextView2;
        this.f84328e = appCompatImageView;
        this.f84329f = baseTextView3;
        this.f84330g = baseTextView4;
    }
}
