package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;

/* JADX INFO: renamed from: dm.c */
/* JADX INFO: compiled from: BkumexAnnouncementTypeBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36739c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f79763a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f79764b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36739c m82329a(@NonNull View view) {
        int i11 = R$id.recyclerview;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            return new C36739c((LinearLayoutCompat) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f79763a;
    }

    public C36739c(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView) {
        this.f79763a = linearLayoutCompat;
        this.f79764b = recyclerView;
    }
}
