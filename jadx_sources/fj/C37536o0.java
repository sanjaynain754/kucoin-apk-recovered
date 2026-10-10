package fj;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: fj.o0 */
/* JADX INFO: compiled from: KucoinLayoutCardsFooterBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37536o0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CardView f83382a;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37536o0 m84537a(@NonNull View view) {
        if (view != null) {
            return new C37536o0((CardView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f83382a;
    }

    public C37536o0(@NonNull CardView cardView) {
        this.f83382a = cardView;
    }
}
