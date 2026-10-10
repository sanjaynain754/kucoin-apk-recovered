package vd0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;

/* JADX INFO: renamed from: vd0.a */
/* JADX INFO: compiled from: LiveKcAudienceBlockConfirmDialogBinding.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45514a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102541a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f102542b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f102543c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f102544d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f102545e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f102546f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f102547g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f102548h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AppCompatImageView f102549i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f102550j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45514a m100496a(@NonNull View view) {
        int i11 = R$id.alert_dialog_root;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
        if (linearLayoutCompat != null) {
            i11 = R$id.buttonContainer;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.cancelButton;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView != null) {
                    i11 = R$id.closeButton;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.confirmButton;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView2 != null) {
                            i11 = R$id.messageText;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView3 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i11 = R$id.tipsIcon;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatImageView != null) {
                                    i11 = R$id.titleText;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView4 != null) {
                                        return new C45514a(constraintLayout, linearLayoutCompat, linearLayout, textView, imageView, textView2, textView3, constraintLayout, appCompatImageView, textView4);
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
    public static C45514a m100497c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.live_kc_audience_block_confirm_dialog, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m100496a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f102541a;
    }

    public C45514a(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView4) {
        this.f102541a = constraintLayout;
        this.f102542b = linearLayoutCompat;
        this.f102543c = linearLayout;
        this.f102544d = textView;
        this.f102545e = imageView;
        this.f102546f = textView2;
        this.f102547g = textView3;
        this.f102548h = constraintLayout2;
        this.f102549i = appCompatImageView;
        this.f102550j = textView4;
    }
}
