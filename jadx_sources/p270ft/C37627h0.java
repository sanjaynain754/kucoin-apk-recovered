package p270ft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.h0 */
/* JADX INFO: compiled from: GuidePaymentMethodItemBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37627h0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83946a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f83947b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f83948c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f83949d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f83950e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37627h0 m84835a(@NonNull View view) {
        int i11 = R$id.ivArrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_payment_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.tv_payment_description;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_payment_name;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C37627h0((ConstraintLayout) view, imageView, imageView2, baseTextView, baseTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37627h0 m84836c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.guide_payment_method_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84835a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83946a;
    }

    public C37627h0(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f83946a = constraintLayout;
        this.f83947b = imageView;
        this.f83948c = imageView2;
        this.f83949d = baseTextView;
        this.f83950e = baseTextView2;
    }
}
