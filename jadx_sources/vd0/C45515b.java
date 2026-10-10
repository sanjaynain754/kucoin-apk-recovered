package vd0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.p180kc.widget.LiveSmallSwitchButton;

/* JADX INFO: renamed from: vd0.b */
/* JADX INFO: compiled from: LiveKcDialogWeb3CardBinding.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45515b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102551a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f102552b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f102553c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f102554d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LiveSmallSwitchButton f102555e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f102556f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f102557g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final CardView f102558h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ImageView f102559i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f102560j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45515b m100499a(@NonNull View view) {
        int i11 = R$id.closeButton;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.contentLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.displayRow;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null) {
                    i11 = R$id.displaySwitch;
                    LiveSmallSwitchButton liveSmallSwitchButton = (LiveSmallSwitchButton) ViewBindings.findChildViewById(view, i11);
                    if (liveSmallSwitchButton != null) {
                        i11 = R$id.displayText;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView != null) {
                            i11 = R$id.goButton;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView2 != null) {
                                i11 = R$id.previewCard;
                                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i11);
                                if (cardView != null) {
                                    i11 = R$id.previewCardBackground;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                    if (imageView2 != null) {
                                        i11 = R$id.titleText;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView3 != null) {
                                            return new C45515b((LinearLayout) view, imageView, linearLayout, constraintLayout, liveSmallSwitchButton, textView, textView2, cardView, imageView2, textView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C45515b m100500c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.live_kc_dialog_web3_card, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m100499a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f102551a;
    }

    public C45515b(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull LiveSmallSwitchButton liveSmallSwitchButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull CardView cardView, @NonNull ImageView imageView2, @NonNull TextView textView3) {
        this.f102551a = linearLayout;
        this.f102552b = imageView;
        this.f102553c = linearLayout2;
        this.f102554d = constraintLayout;
        this.f102555e = liveSmallSwitchButton;
        this.f102556f = textView;
        this.f102557g = textView2;
        this.f102558h = cardView;
        this.f102559i = imageView2;
        this.f102560j = textView3;
    }
}
