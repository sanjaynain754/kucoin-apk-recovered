package p762xi;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.helpcenter.R$id;
import com.kubi.resources.widget.KcCoordinatorLayout;

/* JADX INFO: renamed from: xi.b */
/* JADX INFO: compiled from: KucoinFragmentHelpCenterBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C46251b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KcCoordinatorLayout f103816a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f103817b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f103818c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C46251b m102007a(@NonNull View view) {
        int i11 = R$id.fl_custom_service;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.fl_work_order;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout2 != null) {
                return new C46251b((KcCoordinatorLayout) view, frameLayout, frameLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public KcCoordinatorLayout getRoot() {
        return this.f103816a;
    }

    public C46251b(@NonNull KcCoordinatorLayout kcCoordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f103816a = kcCoordinatorLayout;
        this.f103817b = frameLayout;
        this.f103818c = frameLayout2;
    }
}
