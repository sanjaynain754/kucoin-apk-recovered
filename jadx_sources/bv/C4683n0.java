package bv;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: bv.n0 */
/* JADX INFO: compiled from: QuoteLayoutEmptyBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4683n0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4463a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f4464b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f4465c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4683n0 m4678a(@NonNull View view) {
        int i11 = R$id.ivEmpty;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tvEmpty;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C4683n0((ConstraintLayout) view, imageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4463a;
    }

    public C4683n0(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView) {
        this.f4463a = constraintLayout;
        this.f4464b = imageView;
        this.f4465c = baseTextView;
    }
}
