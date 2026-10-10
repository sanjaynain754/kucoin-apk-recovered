package fj;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cpiz.android.bubbleview.BubbleTextView;
import com.kubi.home.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinUpdownCompareIndicator;
import com.kubi.resources.widget.FixAutoSizeTextView;

/* JADX INFO: renamed from: fj.f */
/* JADX INFO: compiled from: HomeCardMoodBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37517f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83247a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CoinUpdownCompareIndicator f83248b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f83249c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FixAutoSizeTextView f83250d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BubbleTextView f83251e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f83252f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f83253g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f83254h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37517f m84494a(@NonNull View view) {
        int i11 = R$id.compareIndicator;
        CoinUpdownCompareIndicator coinUpdownCompareIndicator = (CoinUpdownCompareIndicator) ViewBindings.findChildViewById(view, i11);
        if (coinUpdownCompareIndicator != null) {
            i11 = R$id.layoutContent;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.tvDeposit;
                FixAutoSizeTextView fixAutoSizeTextView = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                if (fixAutoSizeTextView != null) {
                    i11 = R$id.tvGuidePop;
                    BubbleTextView bubbleTextView = (BubbleTextView) ViewBindings.findChildViewById(view, i11);
                    if (bubbleTextView != null) {
                        i11 = R$id.tvTitle;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tvTopDown;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tvTopUp;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    return new C37517f((ConstraintLayout) view, coinUpdownCompareIndicator, constraintLayout, fixAutoSizeTextView, bubbleTextView, baseTextView, baseTextView2, baseTextView3);
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
        return this.f83247a;
    }

    public C37517f(@NonNull ConstraintLayout constraintLayout, @NonNull CoinUpdownCompareIndicator coinUpdownCompareIndicator, @NonNull ConstraintLayout constraintLayout2, @NonNull FixAutoSizeTextView fixAutoSizeTextView, @NonNull BubbleTextView bubbleTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f83247a = constraintLayout;
        this.f83248b = coinUpdownCompareIndicator;
        this.f83249c = constraintLayout2;
        this.f83250d = fixAutoSizeTextView;
        this.f83251e = bubbleTextView;
        this.f83252f = baseTextView;
        this.f83253g = baseTextView2;
        this.f83254h = baseTextView3;
    }
}
