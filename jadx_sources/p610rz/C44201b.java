package p610rz;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: rz.b */
/* JADX INFO: compiled from: ModeTransitionActivityBinding.java */
/* JADX INFO: loaded from: classes41.dex */
public final class C44201b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f97544a;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44201b m97424a(@NonNull View view) {
        if (view != null) {
            return new C44201b((LinearLayoutCompat) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f97544a;
    }

    public C44201b(@NonNull LinearLayoutCompat linearLayoutCompat) {
        this.f97544a = linearLayoutCompat;
    }
}
