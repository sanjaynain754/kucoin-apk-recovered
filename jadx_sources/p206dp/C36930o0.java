package p206dp;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dp.o0 */
/* JADX INFO: compiled from: BmarginLayoutMarketBannerBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36930o0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81860a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f81861b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f81862c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81863d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36930o0 m82728a(@NonNull View view) {
        int i11 = R$id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.title;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    return new C36930o0((ConstraintLayout) view, imageView, imageView2, baseTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81860a;
    }

    public C36930o0(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull BaseTextView baseTextView) {
        this.f81860a = constraintLayout;
        this.f81861b = imageView;
        this.f81862c = imageView2;
        this.f81863d = baseTextView;
    }
}
