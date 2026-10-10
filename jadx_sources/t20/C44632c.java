package t20;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.c */
/* JADX INFO: compiled from: BkucoinDialogCoinInfoTagBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44632c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f98994a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f98995b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f98996c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f98997d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f98998e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f98999f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99000g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44632c m98742a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.content;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.title;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tv_cancel;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.tv_more;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            return new C44632c(constraintLayout, constraintLayout, appCompatImageView, baseTextView, baseTextView2, baseTextView3, baseTextView4);
                        }
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
        return this.f98994a;
    }

    public C44632c(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f98994a = constraintLayout;
        this.f98995b = constraintLayout2;
        this.f98996c = appCompatImageView;
        this.f98997d = baseTextView;
        this.f98998e = baseTextView2;
        this.f98999f = baseTextView3;
        this.f99000g = baseTextView4;
    }
}
