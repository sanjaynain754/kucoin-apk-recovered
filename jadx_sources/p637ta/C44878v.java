package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;

/* JADX INFO: renamed from: ta.v */
/* JADX INFO: compiled from: AssetDialogConvertAccountSelectBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44878v implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f100981a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f100982b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44878v m99280a(@NonNull View view) {
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            return new C44878v((LinearLayoutCompat) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f100981a;
    }

    public C44878v(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView) {
        this.f100981a = linearLayoutCompat;
        this.f100982b = recyclerView;
    }
}
