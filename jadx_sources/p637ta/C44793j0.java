package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.j0 */
/* JADX INFO: compiled from: AssetFinanceVipFragmentBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44793j0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f100201a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f100202b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final NestedScrollView f100203c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f100204d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f100205e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44793j0 m99104a(@NonNull View view) {
        int i11 = R$id.btnMore;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.defaultLayout;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
            if (nestedScrollView != null) {
                i11 = R$id.defaultRecyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.recyclerView;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView2 != null) {
                        return new C44793j0((FrameLayout) view, kcPrimaryButton, nestedScrollView, recyclerView, recyclerView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f100201a;
    }

    public C44793j0(@NonNull FrameLayout frameLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull NestedScrollView nestedScrollView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f100201a = frameLayout;
        this.f100202b = kcPrimaryButton;
        this.f100203c = nestedScrollView;
        this.f100204d = recyclerView;
        this.f100205e = recyclerView2;
    }
}
