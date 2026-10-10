package p701vs;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.operation.lib.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.MarqueeTextView;
import com.kubi.resources.widget.round.widget.RoundImageView;

/* JADX INFO: renamed from: vs.c */
/* JADX INFO: compiled from: OperationFragmentHomeCardHotTopicBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45626c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102773a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RoundImageView f102774b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RoundImageView f102775c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f102776d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f102777e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FrameLayout f102778f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayoutCompat f102779g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayoutCompat f102780h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final MarqueeTextView f102781i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ConstraintLayout f102782j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f102783k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f102784l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f102785m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final View f102786n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45626c m100737a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.ivBg;
        RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i11);
        if (roundImageView != null) {
            i11 = R$id.ivBgMask;
            RoundImageView roundImageView2 = (RoundImageView) ViewBindings.findChildViewById(view, i11);
            if (roundImageView2 != null) {
                i11 = R$id.ivClose;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.ivCoinLogo;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView2 != null) {
                        i11 = R$id.layoutCoin;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                        if (frameLayout != null) {
                            i11 = R$id.layoutMarquee;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                            if (linearLayoutCompat != null) {
                                i11 = R$id.layoutSubject;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                if (linearLayoutCompat2 != null) {
                                    i11 = R$id.marqueeView;
                                    MarqueeTextView marqueeTextView = (MarqueeTextView) ViewBindings.findChildViewById(view, i11);
                                    if (marqueeTextView != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i11 = R$id.tvCoinRate;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.tvSubject;
                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView2 != null) {
                                                i11 = R$id.tvTitle;
                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewPoint))) != null) {
                                                    return new C45626c(constraintLayout, roundImageView, roundImageView2, imageView, imageView2, frameLayout, linearLayoutCompat, linearLayoutCompat2, marqueeTextView, constraintLayout, baseTextView, baseTextView2, baseTextView3, viewFindChildViewById);
                                                }
                                            }
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

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f102773a;
    }

    public C45626c(@NonNull ConstraintLayout constraintLayout, @NonNull RoundImageView roundImageView, @NonNull RoundImageView roundImageView2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull FrameLayout frameLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull MarqueeTextView marqueeTextView, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view) {
        this.f102773a = constraintLayout;
        this.f102774b = roundImageView;
        this.f102775c = roundImageView2;
        this.f102776d = imageView;
        this.f102777e = imageView2;
        this.f102778f = frameLayout;
        this.f102779g = linearLayoutCompat;
        this.f102780h = linearLayoutCompat2;
        this.f102781i = marqueeTextView;
        this.f102782j = constraintLayout2;
        this.f102783k = baseTextView;
        this.f102784l = baseTextView2;
        this.f102785m = baseTextView3;
        this.f102786n = view;
    }
}
