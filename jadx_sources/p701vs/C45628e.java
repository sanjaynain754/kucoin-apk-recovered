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

/* JADX INFO: renamed from: vs.e */
/* JADX INFO: compiled from: OperationFragmentSearchTopicBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45628e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102805a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f102806b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f102807c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f102808d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f102809e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final MarqueeTextView f102810f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f102811g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f102812h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f102813i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f102814j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final View f102815k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45628e m100741a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.ivCoinLogo;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.layoutCoin;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.layoutContent;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.layoutMarquee;
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
                                        return new C45628e(constraintLayout, imageView, frameLayout, linearLayoutCompat, linearLayoutCompat2, marqueeTextView, constraintLayout, baseTextView, baseTextView2, baseTextView3, viewFindChildViewById);
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
        return this.f102805a;
    }

    public C45628e(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull MarqueeTextView marqueeTextView, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view) {
        this.f102805a = constraintLayout;
        this.f102806b = imageView;
        this.f102807c = frameLayout;
        this.f102808d = linearLayoutCompat;
        this.f102809e = linearLayoutCompat2;
        this.f102810f = marqueeTextView;
        this.f102811g = constraintLayout2;
        this.f102812h = baseTextView;
        this.f102813i = baseTextView2;
        this.f102814j = baseTextView3;
        this.f102815k = view;
    }
}
