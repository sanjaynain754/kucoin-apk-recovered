package v30;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.kubi.widget.web.ui.KWebContainer;

/* JADX INFO: renamed from: v30.k */
/* JADX INFO: compiled from: BkucoinTradeWebContainerFragmentBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45390k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KWebContainer f102175a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KWebContainer f102176b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45390k m100314a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        KWebContainer kWebContainer = (KWebContainer) view;
        return new C45390k(kWebContainer, kWebContainer);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public KWebContainer getRoot() {
        return this.f102175a;
    }

    public C45390k(@NonNull KWebContainer kWebContainer, @NonNull KWebContainer kWebContainer2) {
        this.f102175a = kWebContainer;
        this.f102176b = kWebContainer2;
    }
}
