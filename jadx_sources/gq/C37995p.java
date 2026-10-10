package gq;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;
import com.kubi.resources.widget.KcCoordinatorLayout;

/* JADX INFO: renamed from: gq.p */
/* JADX INFO: compiled from: KucoinFragmentSocialFriendsBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37995p implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KcCoordinatorLayout f85584a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f85585b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f85586c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37995p m85865a(@NonNull View view) {
        int i11 = R$id.fl_red_package;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.fl_share_app;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout2 != null) {
                return new C37995p((KcCoordinatorLayout) view, frameLayout, frameLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public KcCoordinatorLayout getRoot() {
        return this.f85584a;
    }

    public C37995p(@NonNull KcCoordinatorLayout kcCoordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f85584a = kcCoordinatorLayout;
        this.f85585b = frameLayout;
        this.f85586c = frameLayout2;
    }
}
