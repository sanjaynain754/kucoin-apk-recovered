package k00;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: k00.m */
/* JADX INFO: compiled from: ViewBottomSheetTopIndicatorBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40849m implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f90784a;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40849m m89397a(@NonNull View view) {
        if (view != null) {
            return new C40849m(view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f90784a;
    }

    public C40849m(@NonNull View view) {
        this.f90784a = view;
    }
}
