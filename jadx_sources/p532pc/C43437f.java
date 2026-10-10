package p532pc;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.copytrading.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: pc.f */
/* JADX INFO: compiled from: ViewCopyTradingHeaderBinding.java */
/* JADX INFO: loaded from: classes8.dex */
public final class C43437f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f95923a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f95924b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f95925c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f95926d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f95927e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f95928f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f95929g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f95930h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f95931i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShowHideTextView f95932j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ShowHideTextView f95933k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f95934l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f95935m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final ShowHideTextView f95936n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ShowHideTextView f95937o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43437f m95635a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.btnCopyTrading;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.ivGuide;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.llPnl;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.llTop;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat != null) {
                        i11 = R$id.llUnPnl;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout2 != null) {
                            i11 = R$id.rb_group;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout3 != null) {
                                i11 = R$id.rbLead;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.space))) != null) {
                                    i11 = R$id.tvPnLegal;
                                    ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                    if (showHideTextView != null) {
                                        i11 = R$id.tvPnValue;
                                        ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                        if (showHideTextView2 != null) {
                                            i11 = R$id.tvPnlLabel;
                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView2 != null) {
                                                i11 = R$id.tvUnPnlLabel;
                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView3 != null) {
                                                    i11 = R$id.tvUnPnlLegal;
                                                    ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (showHideTextView3 != null) {
                                                        i11 = R$id.tvUnPnlValue;
                                                        ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (showHideTextView4 != null) {
                                                            return new C43437f((ConstraintLayout) view, kcPrimaryButton, imageView, linearLayout, linearLayoutCompat, linearLayout2, linearLayout3, baseTextView, viewFindChildViewById, showHideTextView, showHideTextView2, baseTextView2, baseTextView3, showHideTextView3, showHideTextView4);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f95923a;
    }

    public C43437f(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull BaseTextView baseTextView, @NonNull View view, @NonNull ShowHideTextView showHideTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull ShowHideTextView showHideTextView3, @NonNull ShowHideTextView showHideTextView4) {
        this.f95923a = constraintLayout;
        this.f95924b = kcPrimaryButton;
        this.f95925c = imageView;
        this.f95926d = linearLayout;
        this.f95927e = linearLayoutCompat;
        this.f95928f = linearLayout2;
        this.f95929g = linearLayout3;
        this.f95930h = baseTextView;
        this.f95931i = view;
        this.f95932j = showHideTextView;
        this.f95933k = showHideTextView2;
        this.f95934l = baseTextView2;
        this.f95935m = baseTextView3;
        this.f95936n = showHideTextView3;
        this.f95937o = showHideTextView4;
    }
}
