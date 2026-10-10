package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.d2 */
/* JADX INFO: compiled from: PaymentItemBannerBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37609d2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83802a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CardView f83803b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f83804c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f83805d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f83806e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37609d2 m84800a(@NonNull View view) {
        int i11 = R$id.card_icon;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i11);
        if (cardView != null) {
            i11 = R$id.iv_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.tv_content;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_title;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C37609d2((ConstraintLayout) view, cardView, appCompatImageView, baseTextView, baseTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83802a;
    }

    public C37609d2(@NonNull ConstraintLayout constraintLayout, @NonNull CardView cardView, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f83802a = constraintLayout;
        this.f83803b = cardView;
        this.f83804c = appCompatImageView;
        this.f83805d = baseTextView;
        this.f83806e = baseTextView2;
    }
}
