package fj;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.resources.widget.MarqueeTextView;

/* JADX INFO: renamed from: fj.l0 */
/* JADX INFO: compiled from: KucoinItemHomeMarqueeBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37530l0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f83365a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f83366b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final MarqueeTextView f83367c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37530l0 m84523a(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.marqueeView;
        MarqueeTextView marqueeTextView = (MarqueeTextView) ViewBindings.findChildViewById(view, i11);
        if (marqueeTextView != null) {
            return new C37530l0(frameLayout, frameLayout, marqueeTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f83365a;
    }

    public C37530l0(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull MarqueeTextView marqueeTextView) {
        this.f83365a = frameLayout;
        this.f83366b = frameLayout2;
        this.f83367c = marqueeTextView;
    }
}
