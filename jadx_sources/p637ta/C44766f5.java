package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.f5 */
/* JADX INFO: compiled from: KucoinSearchNavigationBarBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44766f5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f99931a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f99932b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f99933c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f99934d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f99935e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99936f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44766f5 m99047a(@NonNull View view) {
        int i11 = R$id.ivMark;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.layout_back;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.title_icon_right_one;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null) {
                    i11 = R$id.title_icon_right_two;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout2 != null) {
                        i11 = R$id.tvTitle;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            return new C44766f5((FrameLayout) view, imageView, linearLayoutCompat, frameLayout, frameLayout2, baseTextView);
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
        return this.f99931a;
    }

    public C44766f5(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull BaseTextView baseTextView) {
        this.f99931a = frameLayout;
        this.f99932b = imageView;
        this.f99933c = linearLayoutCompat;
        this.f99934d = frameLayout2;
        this.f99935e = frameLayout3;
        this.f99936f = baseTextView;
    }
}
