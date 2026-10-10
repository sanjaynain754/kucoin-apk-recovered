package fj;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: fj.s0 */
/* JADX INFO: compiled from: KucoinLayoutHomeCardFunctionBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37544s0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83408a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f83409b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f83410c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f83411d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f83412e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37544s0 m84557a(@NonNull View view) {
        int i11 = R$id.card_detail;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.card_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.card_title;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    return new C37544s0(constraintLayout, baseTextView, imageView, constraintLayout, baseTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83408a;
    }

    public C37544s0(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView2) {
        this.f83408a = constraintLayout;
        this.f83409b = baseTextView;
        this.f83410c = imageView;
        this.f83411d = constraintLayout2;
        this.f83412e = baseTextView2;
    }
}
