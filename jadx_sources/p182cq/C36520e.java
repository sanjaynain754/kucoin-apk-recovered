package p182cq;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.mart.R$id;

/* JADX INFO: renamed from: cq.e */
/* JADX INFO: compiled from: MartLayoutSpotSidebarSearchBinding.java */
/* JADX INFO: loaded from: classes28.dex */
public final class C36520e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f79368a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LottieAnimationView f79369b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f79370c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36520e m81769a(@NonNull View view) {
        int i11 = R$id.loading;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
        if (lottieAnimationView != null) {
            i11 = R$id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                return new C36520e((FrameLayout) view, lottieAnimationView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f79368a;
    }

    public C36520e(@NonNull FrameLayout frameLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull RecyclerView recyclerView) {
        this.f79368a = frameLayout;
        this.f79369b = lottieAnimationView;
        this.f79370c = recyclerView;
    }
}
