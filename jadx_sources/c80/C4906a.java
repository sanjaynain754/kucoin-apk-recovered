package c80;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.wallet.R$id;

/* JADX INFO: renamed from: c80.a */
/* JADX INFO: compiled from: WalletFlutterLayoutBinding.java */
/* JADX INFO: loaded from: classes55.dex */
public final class C4906a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f5401a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f5402b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f5403c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4906a m5089a(@NonNull View view) {
        int i11 = R$id.flutterContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        FrameLayout frameLayout2 = (FrameLayout) view;
        return new C4906a(frameLayout2, frameLayout, frameLayout2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f5401a;
    }

    public C4906a(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3) {
        this.f5401a = frameLayout;
        this.f5402b = frameLayout2;
        this.f5403c = frameLayout3;
    }
}
