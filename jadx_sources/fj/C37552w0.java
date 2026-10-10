package fj;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: fj.w0 */
/* JADX INFO: compiled from: KucoinNavigationTabBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C37552w0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83481a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f83482b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f83483c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f83484d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37552w0 m84577a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.iv_arrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.title;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C37552w0(constraintLayout, constraintLayout, appCompatImageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83481a;
    }

    public C37552w0(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView) {
        this.f83481a = constraintLayout;
        this.f83482b = constraintLayout2;
        this.f83483c = appCompatImageView;
        this.f83484d = baseTextView;
    }
}
