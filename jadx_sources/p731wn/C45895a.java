package p731wn;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.lite.R$id;

/* JADX INFO: renamed from: wn.a */
/* JADX INFO: compiled from: LiteFlutterLayoutBinding.java */
/* JADX INFO: loaded from: classes24.dex */
public final class C45895a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f103365a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f103366b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f103367c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45895a m101360a(@NonNull View view) {
        int i11 = R$id.flutterContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        FrameLayout frameLayout2 = (FrameLayout) view;
        return new C45895a(frameLayout2, frameLayout, frameLayout2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f103365a;
    }

    public C45895a(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3) {
        this.f103365a = frameLayout;
        this.f103366b = frameLayout2;
        this.f103367c = frameLayout3;
    }
}
