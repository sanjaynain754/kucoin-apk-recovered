package gq;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;
import com.kubi.resources.widget.KcCoordinatorLayout;
import com.kubi.resources.widget.KcSwitchButton;

/* JADX INFO: renamed from: gq.k */
/* JADX INFO: compiled from: KucoinFragmentClipboardBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37990k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KcCoordinatorLayout f85494a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcSwitchButton f85495b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37990k m85855a(@NonNull View view) {
        int i11 = R$id.switch_access;
        KcSwitchButton kcSwitchButton = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
        if (kcSwitchButton != null) {
            return new C37990k((KcCoordinatorLayout) view, kcSwitchButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public KcCoordinatorLayout getRoot() {
        return this.f85494a;
    }

    public C37990k(@NonNull KcCoordinatorLayout kcCoordinatorLayout, @NonNull KcSwitchButton kcSwitchButton) {
        this.f85494a = kcCoordinatorLayout;
        this.f85495b = kcSwitchButton;
    }
}
