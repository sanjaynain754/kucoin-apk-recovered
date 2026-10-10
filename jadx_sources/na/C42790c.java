package na;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.p022ui.PlayerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.app.facade.R$id;
import com.kubi.launch.p096ui.widget.SegmentProgressView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: na.c */
/* JADX INFO: compiled from: LauncherNewVersionJourneyLayoutBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C42790c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f94793a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C42788a f94794b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f94795c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f94796d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final PlayerView f94797e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final SegmentProgressView f94798f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f94799g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f94800h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42790c m93779a(@NonNull View view) {
        int i11 = R$id.appModeView;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C42788a c42788aM93775a = C42788a.m93775a(viewFindChildViewById);
            i11 = R$id.bottomButton;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.logo;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.playerView;
                    PlayerView playerView = (PlayerView) ViewBindings.findChildViewById(view, i11);
                    if (playerView != null) {
                        i11 = R$id.progress;
                        SegmentProgressView segmentProgressView = (SegmentProgressView) ViewBindings.findChildViewById(view, i11);
                        if (segmentProgressView != null) {
                            i11 = R$id.title;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.welcome;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    return new C42790c((ConstraintLayout) view, c42788aM93775a, kcPrimaryButton, imageView, playerView, segmentProgressView, baseTextView, baseTextView2);
                                }
                            }
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
    public ConstraintLayout getRoot() {
        return this.f94793a;
    }

    public C42790c(@NonNull ConstraintLayout constraintLayout, @NonNull C42788a c42788a, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull PlayerView playerView, @NonNull SegmentProgressView segmentProgressView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f94793a = constraintLayout;
        this.f94794b = c42788a;
        this.f94795c = kcPrimaryButton;
        this.f94796d = imageView;
        this.f94797e = playerView;
        this.f94798f = segmentProgressView;
        this.f94799g = baseTextView;
        this.f94800h = baseTextView2;
    }
}
