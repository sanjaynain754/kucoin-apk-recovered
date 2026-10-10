package fj;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: fj.c */
/* JADX INFO: compiled from: HomeCardBuyCryptoBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37511c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f83225a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f83226b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37511c m84480a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new C37511c(frameLayout, frameLayout);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f83225a;
    }

    public C37511c(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f83225a = frameLayout;
        this.f83226b = frameLayout2;
    }
}
