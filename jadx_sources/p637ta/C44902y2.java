package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.y2 */
/* JADX INFO: compiled from: BassetsItemMainRecommendBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44902y2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101171a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f101172b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f101173c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f101174d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f101175e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44902y2 m99328a(@NonNull View view) {
        int i11 = R$id.coinAvatar;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tvAnnualized;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvAnnualizedName;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tvLabelLending;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        return new C44902y2((ConstraintLayout) view, imageView, baseTextView, baseTextView2, baseTextView3);
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
        return this.f101171a;
    }

    public C44902y2(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f101171a = constraintLayout;
        this.f101172b = imageView;
        this.f101173c = baseTextView;
        this.f101174d = baseTextView2;
        this.f101175e = baseTextView3;
    }
}
