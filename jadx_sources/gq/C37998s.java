package gq;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;

/* JADX INFO: renamed from: gq.s */
/* JADX INFO: compiled from: UploadAvatarImageViewBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37998s implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f85593a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f85594b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f85595c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f85596d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f85597e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f85598f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37998s m85871a(@NonNull View view) {
        int i11 = R$id.avatar;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.flAvatarLoadingContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.flAvatarStatusContainer;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout2 != null) {
                    i11 = R$id.imgAvatarStatus;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView2 != null) {
                        i11 = R$id.ivUploadAvatarLoading;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView3 != null) {
                            return new C37998s((FrameLayout) view, imageView, frameLayout, frameLayout2, imageView2, imageView3);
                        }
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
        return this.f85593a;
    }

    public C37998s(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull ImageView imageView2, @NonNull ImageView imageView3) {
        this.f85593a = frameLayout;
        this.f85594b = imageView;
        this.f85595c = frameLayout2;
        this.f85596d = frameLayout3;
        this.f85597e = imageView2;
        this.f85598f = imageView3;
    }
}
