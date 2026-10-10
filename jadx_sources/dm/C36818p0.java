package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.p0 */
/* JADX INFO: compiled from: BkumexDialogPositionCrossRiskRatioBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36818p0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80765a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f80766b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f80767c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80768d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80769e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80770f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f80771g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80772h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80773i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f80774j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80775k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final Group f80776l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f80777m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80778n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final View f80779o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f80780p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f80781q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f80782r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f80783s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f80784t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f80785u;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36818p0 m82497a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.confirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.current;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.currentImr;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.currentImrValue;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.currentLine))) != null) {
                            i11 = R$id.currentMmr;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.currentMmrValue;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.desc;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null) {
                                        i11 = R$id.modify;
                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView7 != null) {
                                            i11 = R$id.modifyGroup;
                                            Group group = (Group) ViewBindings.findChildViewById(view, i11);
                                            if (group != null) {
                                                i11 = R$id.modifyImr;
                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView8 != null) {
                                                    i11 = R$id.modifyImrValue;
                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView9 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.modifyLine))) != null) {
                                                        i11 = R$id.modifyMmr;
                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView10 != null) {
                                                            i11 = R$id.modifyMmrValue;
                                                            BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView11 != null) {
                                                                i11 = R$id.modifyTime;
                                                                BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView12 != null) {
                                                                    i11 = R$id.modifyTimeValue;
                                                                    BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView13 != null) {
                                                                        i11 = R$id.notice;
                                                                        BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView14 != null) {
                                                                            i11 = R$id.title;
                                                                            BaseTextView baseTextView15 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView15 != null) {
                                                                                return new C36818p0((ConstraintLayout) view, appCompatImageView, kcPrimaryButton, baseTextView, baseTextView2, baseTextView3, viewFindChildViewById, baseTextView4, baseTextView5, baseTextView6, baseTextView7, group, baseTextView8, baseTextView9, viewFindChildViewById2, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14, baseTextView15);
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
        return this.f80765a;
    }

    public C36818p0(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull Group group, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull View view2, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull BaseTextView baseTextView15) {
        this.f80765a = constraintLayout;
        this.f80766b = appCompatImageView;
        this.f80767c = kcPrimaryButton;
        this.f80768d = baseTextView;
        this.f80769e = baseTextView2;
        this.f80770f = baseTextView3;
        this.f80771g = view;
        this.f80772h = baseTextView4;
        this.f80773i = baseTextView5;
        this.f80774j = baseTextView6;
        this.f80775k = baseTextView7;
        this.f80776l = group;
        this.f80777m = baseTextView8;
        this.f80778n = baseTextView9;
        this.f80779o = view2;
        this.f80780p = baseTextView10;
        this.f80781q = baseTextView11;
        this.f80782r = baseTextView12;
        this.f80783s = baseTextView13;
        this.f80784t = baseTextView14;
        this.f80785u = baseTextView15;
    }
}
