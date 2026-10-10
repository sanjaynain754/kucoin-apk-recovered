package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.a3 */
/* JADX INFO: compiled from: PaymentViewEeEddBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37595a3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83608a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f83609b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f83610c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f83611d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37595a3 m84774a(@NonNull View view) {
        int i11 = R$id.ivInfo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.tvMessage;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvSubmitInfo;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    return new C37595a3((ConstraintLayout) view, appCompatImageView, baseTextView, baseTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83608a;
    }

    public C37595a3(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f83608a = constraintLayout;
        this.f83609b = appCompatImageView;
        this.f83610c = baseTextView;
        this.f83611d = baseTextView2;
    }
}
