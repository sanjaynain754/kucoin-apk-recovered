package dm;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: dm.e3 */
/* JADX INFO: compiled from: BkumexFragmentRecommendBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36755e3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f79955a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcSecondaryButton f79956b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f79957c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f79958d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36755e3 m82361a(@NonNull View view) {
        int i11 = R$id.add;
        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcSecondaryButton != null) {
            i11 = R$id.group;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    return new C36755e3((FrameLayout) view, kcSecondaryButton, frameLayout, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f79955a;
    }

    public C36755e3(@NonNull FrameLayout frameLayout, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull FrameLayout frameLayout2, @NonNull RecyclerView recyclerView) {
        this.f79955a = frameLayout;
        this.f79956b = kcSecondaryButton;
        this.f79957c = frameLayout2;
        this.f79958d = recyclerView;
    }
}
