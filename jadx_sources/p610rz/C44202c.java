package p610rz;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.sdk.mode.R$id;

/* JADX INFO: renamed from: rz.c */
/* JADX INFO: compiled from: SwitchLayoutBinding.java */
/* JADX INFO: loaded from: classes41.dex */
public final class C44202c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f97545a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f97546b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LottieAnimationView f97547c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LottieAnimationView f97548d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f97549e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44202c m97426a(@NonNull View view) {
        int i11 = R$id.ivSnapshot;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.modeBg;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
            if (lottieAnimationView != null) {
                i11 = R$id.modeLogo;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
                if (lottieAnimationView2 != null) {
                    i11 = R$id.modeLottie;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        return new C44202c((FrameLayout) view, imageView, lottieAnimationView, lottieAnimationView2, frameLayout);
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
        return this.f97545a;
    }

    public C44202c(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull LottieAnimationView lottieAnimationView, @NonNull LottieAnimationView lottieAnimationView2, @NonNull FrameLayout frameLayout2) {
        this.f97545a = frameLayout;
        this.f97546b = imageView;
        this.f97547c = lottieAnimationView;
        this.f97548d = lottieAnimationView2;
        this.f97549e = frameLayout2;
    }
}
