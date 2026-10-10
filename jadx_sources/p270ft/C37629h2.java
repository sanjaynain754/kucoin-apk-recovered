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

/* JADX INFO: renamed from: ft.h2 */
/* JADX INFO: compiled from: PaymentItemFastBuyPaymentMethodGuideP2pBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37629h2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83976a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f83977b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f83978c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37629h2 m84840a(@NonNull View view) {
        int i11 = R$id.ivWarning;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.tvWaring;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C37629h2((ConstraintLayout) view, appCompatImageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37629h2 m84841c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.payment_item_fast_buy_payment_method_guide_p2p, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84840a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83976a;
    }

    public C37629h2(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView) {
        this.f83976a = constraintLayout;
        this.f83977b = appCompatImageView;
        this.f83978c = baseTextView;
    }
}
