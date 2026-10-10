package p206dp;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dp.f */
/* JADX INFO: compiled from: BmarginDialogMarginCrossCurrencyListBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36911f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f81682a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f81683b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f81684c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f81685d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81686e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f81687f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LottieAnimationView f81688g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36911f m82691a(@NonNull View view) {
        int i11 = R$id.currencyRecyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i11 = R$id.emptyIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.emptyTips;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.errorLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.loadingView;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
                        if (lottieAnimationView != null) {
                            return new C36911f(frameLayout, recyclerView, frameLayout, imageView, baseTextView, linearLayout, lottieAnimationView);
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
    public FrameLayout getRoot() {
        return this.f81682a;
    }

    public C36911f(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull LinearLayout linearLayout, @NonNull LottieAnimationView lottieAnimationView) {
        this.f81682a = frameLayout;
        this.f81683b = recyclerView;
        this.f81684c = frameLayout2;
        this.f81685d = imageView;
        this.f81686e = baseTextView;
        this.f81687f = linearLayout;
        this.f81688g = lottieAnimationView;
    }
}
