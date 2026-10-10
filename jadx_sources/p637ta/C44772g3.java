package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: ta.g3 */
/* JADX INFO: compiled from: DialogAccountDetailFreezeBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44772g3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f99970a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f99971b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f99972c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f99973d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f99974e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final NestedScrollView f99975f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99976g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KcSecondaryButton f99977h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99978i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99979j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99980k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f99981l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f99982m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f99983n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f99984o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f99985p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f99986q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final View f99987r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final View f99988s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final View f99989t;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44772g3 m99060a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.llBackgroundFreeze;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.recyclerView1;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView2 != null) {
                    i11 = R$id.recyclerView2;
                    RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView3 != null) {
                        i11 = R$id.scrollView;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                        if (nestedScrollView != null) {
                            i11 = R$id.tvAmount;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tvConfirm;
                                KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                                if (kcSecondaryButton != null) {
                                    i11 = R$id.tvSeeMore;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvSeeMore1;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tvSeeMore2;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.tvTime;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    i11 = R$id.tvTip;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        i11 = R$id.tvTitle1;
                                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView7 != null) {
                                                            i11 = R$id.tvTitle2;
                                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView8 != null) {
                                                                i11 = R$id.tvTitle3;
                                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView9 != null) {
                                                                    i11 = R$id.tvTitle4;
                                                                    BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView10 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider1))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider2))) != null) {
                                                                        return new C44772g3((LinearLayoutCompat) view, constraintLayout, recyclerView, recyclerView2, recyclerView3, nestedScrollView, baseTextView, kcSecondaryButton, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3);
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
    public LinearLayoutCompat getRoot() {
        return this.f99970a;
    }

    public C44772g3(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull RecyclerView recyclerView3, @NonNull NestedScrollView nestedScrollView, @NonNull BaseTextView baseTextView, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f99970a = linearLayoutCompat;
        this.f99971b = constraintLayout;
        this.f99972c = recyclerView;
        this.f99973d = recyclerView2;
        this.f99974e = recyclerView3;
        this.f99975f = nestedScrollView;
        this.f99976g = baseTextView;
        this.f99977h = kcSecondaryButton;
        this.f99978i = baseTextView2;
        this.f99979j = baseTextView3;
        this.f99980k = baseTextView4;
        this.f99981l = baseTextView5;
        this.f99982m = baseTextView6;
        this.f99983n = baseTextView7;
        this.f99984o = baseTextView8;
        this.f99985p = baseTextView9;
        this.f99986q = baseTextView10;
        this.f99987r = view;
        this.f99988s = view2;
        this.f99989t = view3;
    }
}
