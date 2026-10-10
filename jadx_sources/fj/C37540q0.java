package fj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: fj.q0 */
/* JADX INFO: compiled from: KucoinLayoutCardsKuMiningItemHeaderBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37540q0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f83397a;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37540q0 m84547a(@NonNull View view) {
        if (view != null) {
            return new C37540q0((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f83397a;
    }

    public C37540q0(@NonNull LinearLayout linearLayout) {
        this.f83397a = linearLayout;
    }
}
