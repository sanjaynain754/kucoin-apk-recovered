package c70;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.p022ui.PlayerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.r */
/* JADX INFO: compiled from: BusercenterFragmentVideoBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4893r implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f5286a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final PlayerView f5287b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4893r m5065a(@NonNull View view) {
        int i11 = R$id.player_view;
        PlayerView playerView = (PlayerView) ViewBindings.findChildViewById(view, i11);
        if (playerView != null) {
            return new C4893r((ConstraintLayout) view, playerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f5286a;
    }

    public C4893r(@NonNull ConstraintLayout constraintLayout, @NonNull PlayerView playerView) {
        this.f5286a = constraintLayout;
        this.f5287b = playerView;
    }
}
