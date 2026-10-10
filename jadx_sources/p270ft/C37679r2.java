package p270ft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.r2 */
/* JADX INFO: compiled from: PaymentItemRechargePaymentMethodBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37679r2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84589a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f84590b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f84591c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84592d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84593e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84594f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84595g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37679r2 m84946a(@NonNull View view) {
        int i11 = R$id.ivArrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_icon;
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
                                return new C37679r2((ConstraintLayout) view, imageView, appCompatImageView, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
    public static C37679r2 m84947c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.payment_item_recharge_payment_method, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84946a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84589a;
    }

    public C37679r2(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f84589a = constraintLayout;
        this.f84590b = imageView;
        this.f84591c = appCompatImageView;
        this.f84592d = baseTextView;
        this.f84593e = baseTextView2;
        this.f84594f = baseTextView3;
        this.f84595g = baseTextView4;
    }
}
