package p206dp;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dp.b */
/* JADX INFO: compiled from: BmarginDialogCoinInfoTagBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36903b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81582a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f81583b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f81584c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81585d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81586e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81587f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f81588g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36903b m82675a(@NonNull View view) {
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
                            return new C36903b(constraintLayout, constraintLayout, appCompatImageView, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
        return this.f81582a;
    }

    public C36903b(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f81582a = constraintLayout;
        this.f81583b = constraintLayout2;
        this.f81584c = appCompatImageView;
        this.f81585d = baseTextView;
        this.f81586e = baseTextView2;
        this.f81587f = baseTextView3;
        this.f81588g = baseTextView4;
    }
}
