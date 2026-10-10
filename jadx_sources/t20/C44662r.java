package t20;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.r */
/* JADX INFO: compiled from: BkucoinLayoutMarketBannerBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44662r implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99293a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f99294b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f99295c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f99296d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99297e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44662r m98800a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.title;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    return new C44662r(constraintLayout, constraintLayout, imageView, imageView2, baseTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f99293a;
    }

    public C44662r(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull BaseTextView baseTextView) {
        this.f99293a = constraintLayout;
        this.f99294b = constraintLayout2;
        this.f99295c = imageView;
        this.f99296d = imageView2;
        this.f99297e = baseTextView;
    }
}
