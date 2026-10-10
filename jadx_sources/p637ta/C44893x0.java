package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.withdraw.view.WithdrawNoticeView;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.x0 */
/* JADX INFO: compiled from: AssetFragmentWithdrawAddressBookBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44893x0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f101103a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f101104b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f101105c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f101106d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f101107e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final C44901y1 f101108f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f101109g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f101110h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f101111i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f101112j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f101113k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final WithdrawNoticeView f101114l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final AlertTipsTextView f101115m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44893x0 m99310a(@NonNull View view) {
        View viewFindChildViewById;
        WithdrawNoticeView withdrawNoticeViewFindChildViewById;
        int i11 = R$id.btnAdd;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.clLoadView;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.rvAddedAddress;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.rvRecentWithdraw;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.searchContainer))) != null) {
                        C44901y1 c44901y1M99326a = C44901y1.m99326a(viewFindChildViewById);
                        i11 = R$id.tvAdd;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tvAddedAddress;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tvRecentWithdraw;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.tvTitle;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        i11 = R$id.tvViewAll;
                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView5 != null && (withdrawNoticeViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.withdrawNoticeView))) != null) {
                                            i11 = R$id.withdrawSettingTips;
                                            AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                            if (alertTipsTextView != null) {
                                                return new C44893x0((LinearLayoutCompat) view, kcPrimaryButton, constraintLayout, recyclerView, recyclerView2, c44901y1M99326a, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, withdrawNoticeViewFindChildViewById, alertTipsTextView);
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
        return this.f101103a;
    }

    public C44893x0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull C44901y1 c44901y1, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull WithdrawNoticeView withdrawNoticeView, @NonNull AlertTipsTextView alertTipsTextView) {
        this.f101103a = linearLayoutCompat;
        this.f101104b = kcPrimaryButton;
        this.f101105c = constraintLayout;
        this.f101106d = recyclerView;
        this.f101107e = recyclerView2;
        this.f101108f = c44901y1;
        this.f101109g = baseTextView;
        this.f101110h = baseTextView2;
        this.f101111i = baseTextView3;
        this.f101112j = baseTextView4;
        this.f101113k = baseTextView5;
        this.f101114l = withdrawNoticeView;
        this.f101115m = alertTipsTextView;
    }
}
