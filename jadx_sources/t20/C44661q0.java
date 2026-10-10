package t20;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.q0 */
/* JADX INFO: compiled from: KucoinPopupFavorBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44661q0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final BubbleLinearLayout f99289a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BubbleLinearLayout f99290b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f99291c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f99292d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44661q0 m98798a(@NonNull View view) {
        BubbleLinearLayout bubbleLinearLayout = (BubbleLinearLayout) view;
        int i11 = R$id.ivFavor;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.llFavor;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                return new C44661q0(bubbleLinearLayout, bubbleLinearLayout, imageView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BubbleLinearLayout getRoot() {
        return this.f99289a;
    }

    public C44661q0(@NonNull BubbleLinearLayout bubbleLinearLayout, @NonNull BubbleLinearLayout bubbleLinearLayout2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout) {
        this.f99289a = bubbleLinearLayout;
        this.f99290b = bubbleLinearLayout2;
        this.f99291c = imageView;
        this.f99292d = linearLayout;
    }
}
