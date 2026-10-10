package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.kubi.widget.web.ui.KWebContainer;

/* JADX INFO: renamed from: dm.n3 */
/* JADX INFO: compiled from: BkumexFragmentWebviewContainerBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36809n3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KWebContainer f80678a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KWebContainer f80679b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36809n3 m82479a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        KWebContainer kWebContainer = (KWebContainer) view;
        return new C36809n3(kWebContainer, kWebContainer);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public KWebContainer getRoot() {
        return this.f80678a;
    }

    public C36809n3(@NonNull KWebContainer kWebContainer, @NonNull KWebContainer kWebContainer2) {
        this.f80678a = kWebContainer;
        this.f80679b = kWebContainer2;
    }
}
