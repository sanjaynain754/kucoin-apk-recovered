package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;

/* JADX INFO: renamed from: ta.x3 */
/* JADX INFO: compiled from: FragmentAssetv2SettingBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44896x3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f101132a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f101133b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C44774g5 f101134c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44896x3 m99316a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.rv_assetv2_setting;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.searchBar))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C44896x3((LinearLayoutCompat) view, recyclerView, C44774g5.m99064a(viewFindChildViewById));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f101132a;
    }

    public C44896x3(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull C44774g5 c44774g5) {
        this.f101132a = linearLayoutCompat;
        this.f101133b = recyclerView;
        this.f101134c = c44774g5;
    }
}
