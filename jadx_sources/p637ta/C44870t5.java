package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.VerticalIconTextBtn;
import com.kubi.resources.widget.AlertTipsTextView;

/* JADX INFO: renamed from: ta.t5 */
/* JADX INFO: compiled from: OverviewHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44870t5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100902a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f100903b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AccountInfoHeaderView f100904c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f100905d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final VerticalIconTextBtn f100906e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final VerticalIconTextBtn f100907f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AlertTipsTextView f100908g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final VerticalIconTextBtn f100909h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final VerticalIconTextBtn f100910i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44870t5 m99264a(@NonNull View view) {
        int i11 = R$id.ProfitLossAnalysisContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.accountInfoHeader;
            AccountInfoHeaderView accountInfoHeaderView = (AccountInfoHeaderView) ViewBindings.findChildViewById(view, i11);
            if (accountInfoHeaderView != null) {
                i11 = R$id.llNewFunction;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.tvDeposit;
                    VerticalIconTextBtn verticalIconTextBtn = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                    if (verticalIconTextBtn != null) {
                        i11 = R$id.tvHistory;
                        VerticalIconTextBtn verticalIconTextBtn2 = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                        if (verticalIconTextBtn2 != null) {
                            i11 = R$id.tv_rollback_tip;
                            AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                            if (alertTipsTextView != null) {
                                i11 = R$id.tvTransfer;
                                VerticalIconTextBtn verticalIconTextBtn3 = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                                if (verticalIconTextBtn3 != null) {
                                    i11 = R$id.tvWithdraw;
                                    VerticalIconTextBtn verticalIconTextBtn4 = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                                    if (verticalIconTextBtn4 != null) {
                                        return new C44870t5((LinearLayout) view, frameLayout, accountInfoHeaderView, linearLayoutCompat, verticalIconTextBtn, verticalIconTextBtn2, alertTipsTextView, verticalIconTextBtn3, verticalIconTextBtn4);
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
    public LinearLayout getRoot() {
        return this.f100902a;
    }

    public C44870t5(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull AccountInfoHeaderView accountInfoHeaderView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull VerticalIconTextBtn verticalIconTextBtn, @NonNull VerticalIconTextBtn verticalIconTextBtn2, @NonNull AlertTipsTextView alertTipsTextView, @NonNull VerticalIconTextBtn verticalIconTextBtn3, @NonNull VerticalIconTextBtn verticalIconTextBtn4) {
        this.f100902a = linearLayout;
        this.f100903b = frameLayout;
        this.f100904c = accountInfoHeaderView;
        this.f100905d = linearLayoutCompat;
        this.f100906e = verticalIconTextBtn;
        this.f100907f = verticalIconTextBtn2;
        this.f100908g = alertTipsTextView;
        this.f100909h = verticalIconTextBtn3;
        this.f100910i = verticalIconTextBtn4;
    }
}
