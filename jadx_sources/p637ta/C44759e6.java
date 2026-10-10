package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.VerticalIconTextBtn;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;

/* JADX INFO: renamed from: ta.e6 */
/* JADX INFO: compiled from: ViewMainAssetsHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44759e6 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99839a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AccountInfoHeaderView f99840b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f99841c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f99842d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f99843e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final VerticalIconTextBtn f99844f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayoutCompat f99845g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayoutCompat f99846h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayoutCompat f99847i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayoutCompat f99848j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BGABanner f99849k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final VerticalIconTextBtn f99850l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final VerticalIconTextBtn f99851m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final VerticalIconTextBtn f99852n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44759e6 m99032a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.accountInfoHeader;
        AccountInfoHeaderView accountInfoHeaderView = (AccountInfoHeaderView) ViewBindings.findChildViewById(view, i11);
        if (accountInfoHeaderView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider1))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.divider2))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.divider3))) != null) {
            i11 = R$id.llEarn;
            VerticalIconTextBtn verticalIconTextBtn = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
            if (verticalIconTextBtn != null) {
                i11 = R$id.llFunction2;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.llKuCard;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat2 != null) {
                        i11 = R$id.llNewFunction;
                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                        if (linearLayoutCompat3 != null) {
                            i11 = R$id.llRedEnvelop;
                            LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                            if (linearLayoutCompat4 != null) {
                                i11 = R$id.newBanner;
                                BGABanner bGABanner = (BGABanner) ViewBindings.findChildViewById(view, i11);
                                if (bGABanner != null) {
                                    i11 = R$id.tvDeposit;
                                    VerticalIconTextBtn verticalIconTextBtn2 = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                                    if (verticalIconTextBtn2 != null) {
                                        i11 = R$id.tvTransfer;
                                        VerticalIconTextBtn verticalIconTextBtn3 = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                                        if (verticalIconTextBtn3 != null) {
                                            i11 = R$id.tvWithdraw;
                                            VerticalIconTextBtn verticalIconTextBtn4 = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                                            if (verticalIconTextBtn4 != null) {
                                                return new C44759e6((ConstraintLayout) view, accountInfoHeaderView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, verticalIconTextBtn, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, bGABanner, verticalIconTextBtn2, verticalIconTextBtn3, verticalIconTextBtn4);
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
        return this.f99839a;
    }

    public C44759e6(@NonNull ConstraintLayout constraintLayout, @NonNull AccountInfoHeaderView accountInfoHeaderView, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull VerticalIconTextBtn verticalIconTextBtn, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull BGABanner bGABanner, @NonNull VerticalIconTextBtn verticalIconTextBtn2, @NonNull VerticalIconTextBtn verticalIconTextBtn3, @NonNull VerticalIconTextBtn verticalIconTextBtn4) {
        this.f99839a = constraintLayout;
        this.f99840b = accountInfoHeaderView;
        this.f99841c = view;
        this.f99842d = view2;
        this.f99843e = view3;
        this.f99844f = verticalIconTextBtn;
        this.f99845g = linearLayoutCompat;
        this.f99846h = linearLayoutCompat2;
        this.f99847i = linearLayoutCompat3;
        this.f99848j = linearLayoutCompat4;
        this.f99849k = bGABanner;
        this.f99850l = verticalIconTextBtn2;
        this.f99851m = verticalIconTextBtn3;
        this.f99852n = verticalIconTextBtn4;
    }
}
