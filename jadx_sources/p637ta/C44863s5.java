package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;

/* JADX INFO: renamed from: ta.s5 */
/* JADX INFO: compiled from: OptionsAssetListFragmentBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44863s5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f100844a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f100845b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44863s5 m99250a(@NonNull View view) {
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            return new C44863s5((FrameLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f100844a;
    }

    public C44863s5(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView) {
        this.f100844a = frameLayout;
        this.f100845b = recyclerView;
    }
}
