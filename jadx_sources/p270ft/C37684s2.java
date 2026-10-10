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

/* JADX INFO: renamed from: ft.s2 */
/* JADX INFO: compiled from: PaymentItemWithdrawPaymentMethodBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37684s2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84618a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f84619b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84620c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84621d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84622e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84623f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37684s2 m84958a(@NonNull View view) {
        int i11 = R$id.iv_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.tv_description;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tv_hint;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tv_name;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.tv_tag;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            return new C37684s2((ConstraintLayout) view, appCompatImageView, baseTextView, baseTextView2, baseTextView3, baseTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37684s2 m84959c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.payment_item_withdraw_payment_method, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84958a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84618a;
    }

    public C37684s2(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f84618a = constraintLayout;
        this.f84619b = appCompatImageView;
        this.f84620c = baseTextView;
        this.f84621d = baseTextView2;
        this.f84622e = baseTextView3;
        this.f84623f = baseTextView4;
    }
}
