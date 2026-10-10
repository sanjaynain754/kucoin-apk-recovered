package k00;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.sdk.res.R$id;

/* JADX INFO: renamed from: k00.b */
/* JADX INFO: compiled from: CommonViewChainCoinLogoViewBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40838b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f90724a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CoinAvatarView f90725b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CoinAvatarView f90726c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40838b m89372a(@NonNull View view) {
        int i11 = R$id.chainIcon;
        CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
        if (coinAvatarView != null) {
            i11 = R$id.coinIcon;
            CoinAvatarView coinAvatarView2 = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
            if (coinAvatarView2 != null) {
                return new C40838b((FrameLayout) view, coinAvatarView, coinAvatarView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f90724a;
    }

    public C40838b(@NonNull FrameLayout frameLayout, @NonNull CoinAvatarView coinAvatarView, @NonNull CoinAvatarView coinAvatarView2) {
        this.f90724a = frameLayout;
        this.f90725b = coinAvatarView;
        this.f90726c = coinAvatarView2;
    }
}
