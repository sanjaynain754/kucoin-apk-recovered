package fj;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: fj.m0 */
/* JADX INFO: compiled from: KucoinItemHomeSettingBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37532m0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f83370a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f83371b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37532m0 m84527a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new C37532m0(frameLayout, frameLayout);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f83370a;
    }

    public C37532m0(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f83370a = frameLayout;
        this.f83371b = frameLayout2;
    }
}
