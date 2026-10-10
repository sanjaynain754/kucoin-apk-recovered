package bv;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;

/* JADX INFO: renamed from: bv.h0 */
/* JADX INFO: compiled from: QuoteItemCommonRecommendBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4671h0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4357a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f4358b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f4359c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Group f4360d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f4361e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FrameLayout f4362f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f4363g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final Barrier f4364h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f4365i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AppCompatCheckBox f4366j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f4367k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final View f4368l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ShowHideTextView f4369m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f4370n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4671h0 m4654a(@NonNull View view) {
        View viewFindChildViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.iv_symbol;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.label_prep_group;
            Group group = (Group) ViewBindings.findChildViewById(view, i11);
            if (group != null) {
                i11 = R$id.layout_symbol;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout2 != null) {
                    i11 = R$id.layout_symbol_fl;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.price;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.right_anchor;
                            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
                            if (barrier != null) {
                                i11 = R$id.symbol;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.toggle;
                                    AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i11);
                                    if (appCompatCheckBox != null) {
                                        i11 = R$id.tv_label_prep;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.tv_label_prep_margin))) != null) {
                                            i11 = R$id.tv_percent;
                                            ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                            if (showHideTextView != null) {
                                                i11 = R$id.tv_quote;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    return new C4671h0(constraintLayout, constraintLayout, imageView, group, constraintLayout2, frameLayout, baseTextView, barrier, baseTextView2, appCompatCheckBox, baseTextView3, viewFindChildViewById, showHideTextView, baseTextView4);
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
        return this.f4357a;
    }

    public C4671h0(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull Group group, @NonNull ConstraintLayout constraintLayout3, @NonNull FrameLayout frameLayout, @NonNull BaseTextView baseTextView, @NonNull Barrier barrier, @NonNull BaseTextView baseTextView2, @NonNull AppCompatCheckBox appCompatCheckBox, @NonNull BaseTextView baseTextView3, @NonNull View view, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView4) {
        this.f4357a = constraintLayout;
        this.f4358b = constraintLayout2;
        this.f4359c = imageView;
        this.f4360d = group;
        this.f4361e = constraintLayout3;
        this.f4362f = frameLayout;
        this.f4363g = baseTextView;
        this.f4364h = barrier;
        this.f4365i = baseTextView2;
        this.f4366j = appCompatCheckBox;
        this.f4367k = baseTextView3;
        this.f4368l = view;
        this.f4369m = showHideTextView;
        this.f4370n = baseTextView4;
    }
}
