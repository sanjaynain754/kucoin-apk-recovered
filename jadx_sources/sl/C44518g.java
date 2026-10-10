package sl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kucoin.market.monitor.lib.R$id;

/* JADX INFO: renamed from: sl.g */
/* JADX INFO: compiled from: KucoinFloatingHeadsetingLayoutBinding.java */
/* JADX INFO: loaded from: classes19.dex */
public final class C44518g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f98658a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f98659b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f98660c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44518g m98496a(@NonNull View view) {
        int i11 = R$id.moreSeting;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.zoom;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                return new C44518g((FrameLayout) view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f98658a;
    }

    public C44518g(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.f98658a = frameLayout;
        this.f98659b = imageView;
        this.f98660c = imageView2;
    }
}
