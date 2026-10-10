package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: ta.v3 */
/* JADX INFO: compiled from: FragmentAssetv2MarginBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44882v3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f100999a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f101000b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44882v3 m99288a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new C44882v3(frameLayout, frameLayout);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f100999a;
    }

    public C44882v3(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f100999a = frameLayout;
        this.f101000b = frameLayout2;
    }
}
