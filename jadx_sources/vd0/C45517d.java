package vd0;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.trtc.uikit.livekit.R$id;

/* JADX INFO: renamed from: vd0.d */
/* JADX INFO: compiled from: LiveKcFragmentWeb3CardBinding.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45517d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CardView f102571a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f102572b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f102573c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f102574d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45517d m100505a(@NonNull View view) {
        int i11 = R$id.contentLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.goButton;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                i11 = R$id.previewCardBackground;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    return new C45517d((CardView) view, linearLayout, textView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f102571a;
    }

    public C45517d(@NonNull CardView cardView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.f102571a = cardView;
        this.f102572b = linearLayout;
        this.f102573c = textView;
        this.f102574d = imageView;
    }
}
