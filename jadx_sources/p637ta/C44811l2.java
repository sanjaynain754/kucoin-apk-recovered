package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.autoearn.views.AutoEarnEntryView;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.widget.shape.view.ShapeImageView;

/* JADX INFO: renamed from: ta.l2 */
/* JADX INFO: compiled from: AssetViewFinanceHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44811l2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100366a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AccountInfoHeaderView f100367b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AutoEarnEntryView f100368c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeImageView f100369d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f100370e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RecyclerView f100371f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ShowHideTextView f100372g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100373h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShowHideTextView f100374i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShowHideTextView f100375j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final DashTextView f100376k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShowHideTextView f100377l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final FrameLayout f100378m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44811l2 m99143a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.accountInfoHeader;
        AccountInfoHeaderView accountInfoHeaderView = (AccountInfoHeaderView) ViewBindings.findChildViewById(view, i11);
        if (accountInfoHeaderView != null) {
            i11 = R$id.autoEarnEntry;
            AutoEarnEntryView autoEarnEntryView = (AutoEarnEntryView) ViewBindings.findChildViewById(view, i11);
            if (autoEarnEntryView != null) {
                i11 = R$id.iv_arrow;
                ShapeImageView shapeImageView = (ShapeImageView) ViewBindings.findChildViewById(view, i11);
                if (shapeImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line1))) != null) {
                    i11 = R$id.recyclerview;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView != null) {
                        i11 = R$id.tv_center_legal;
                        ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                        if (showHideTextView != null) {
                            i11 = R$id.tv_center_title;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tv_center_value;
                                ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                if (showHideTextView2 != null) {
                                    i11 = R$id.tv_left_legal;
                                    ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                    if (showHideTextView3 != null) {
                                        i11 = R$id.tv_left_title;
                                        DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                        if (dashTextView != null) {
                                            i11 = R$id.tv_left_value;
                                            ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                            if (showHideTextView4 != null) {
                                                i11 = R$id.view_tv_left_title;
                                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                if (frameLayout != null) {
                                                    return new C44811l2((ConstraintLayout) view, accountInfoHeaderView, autoEarnEntryView, shapeImageView, viewFindChildViewById, recyclerView, showHideTextView, baseTextView, showHideTextView2, showHideTextView3, dashTextView, showHideTextView4, frameLayout);
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
        return this.f100366a;
    }

    public C44811l2(@NonNull ConstraintLayout constraintLayout, @NonNull AccountInfoHeaderView accountInfoHeaderView, @NonNull AutoEarnEntryView autoEarnEntryView, @NonNull ShapeImageView shapeImageView, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull ShowHideTextView showHideTextView3, @NonNull DashTextView dashTextView, @NonNull ShowHideTextView showHideTextView4, @NonNull FrameLayout frameLayout) {
        this.f100366a = constraintLayout;
        this.f100367b = accountInfoHeaderView;
        this.f100368c = autoEarnEntryView;
        this.f100369d = shapeImageView;
        this.f100370e = view;
        this.f100371f = recyclerView;
        this.f100372g = showHideTextView;
        this.f100373h = baseTextView;
        this.f100374i = showHideTextView2;
        this.f100375j = showHideTextView3;
        this.f100376k = dashTextView;
        this.f100377l = showHideTextView4;
        this.f100378m = frameLayout;
    }
}
