package k00;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.res.R$id;

/* JADX INFO: renamed from: k00.c */
/* JADX INFO: compiled from: CommonViewFlexTradepairLayoutBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40839c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f90727a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f90728b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Group f90729c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f90730d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Barrier f90731e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f90732f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f90733g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f90734h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f90735i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f90736j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f90737k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f90738l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f90739m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f90740n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f90741o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f90742p;

    public C40839c(@NonNull View view, @NonNull ImageView imageView, @NonNull Group group, @NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view2, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10) {
        this.f90727a = view;
        this.f90728b = imageView;
        this.f90729c = group;
        this.f90730d = constraintLayout;
        this.f90731e = barrier;
        this.f90732f = baseTextView;
        this.f90733g = baseTextView2;
        this.f90734h = baseTextView3;
        this.f90735i = view2;
        this.f90736j = baseTextView4;
        this.f90737k = baseTextView5;
        this.f90738l = baseTextView6;
        this.f90739m = baseTextView7;
        this.f90740n = baseTextView8;
        this.f90741o = baseTextView9;
        this.f90742p = baseTextView10;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40839c m89374a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.iv_hot_tag;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.label_prep_group;
            Group group = (Group) ViewBindings.findChildViewById(view, i11);
            if (group != null) {
                i11 = R$id.ll_trade_pair;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null) {
                    i11 = R$id.right_anchor;
                    Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
                    if (barrier != null) {
                        i11 = R$id.tv_fee;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_label_new;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tv_label_prep;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.tv_label_prep_margin))) != null) {
                                    i11 = R$id.tv_label_rwa;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        i11 = R$id.tv_label_st;
                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView5 != null) {
                                            i11 = R$id.tv_label_stock_token;
                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView6 != null) {
                                                i11 = R$id.tv_lever;
                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView7 != null) {
                                                    i11 = R$id.tv_quote;
                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView8 != null) {
                                                        i11 = R$id.tv_ready;
                                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView9 != null) {
                                                            i11 = R$id.tv_trade_pair;
                                                            BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView10 != null) {
                                                                return new C40839c(view, imageView, group, constraintLayout, barrier, baseTextView, baseTextView2, baseTextView3, viewFindChildViewById, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10);
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
    public View getRoot() {
        return this.f90727a;
    }
}
