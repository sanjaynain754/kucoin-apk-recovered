package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.margin.view.MarginPnlHeaderView;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.VerticalIconTextBtn;
import com.kubi.resources.widget.AlertTipsTextView;

/* JADX INFO: renamed from: ta.h6 */
/* JADX INFO: compiled from: ViewSpotAssetsHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44783h6 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100083a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AccountInfoHeaderView f100084b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f100085c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final VerticalIconTextBtn f100086d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f100087e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final MarginPnlHeaderView f100088f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f100089g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final VerticalIconTextBtn f100090h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final VerticalIconTextBtn f100091i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AlertTipsTextView f100092j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final VerticalIconTextBtn f100093k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final View f100094l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44783h6 m99083a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.accountInfoHeader;
        AccountInfoHeaderView accountInfoHeaderView = (AccountInfoHeaderView) ViewBindings.findChildViewById(view, i11);
        if (accountInfoHeaderView != null) {
            i11 = R$id.ivExpandArrow;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.llConvert;
                VerticalIconTextBtn verticalIconTextBtn = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                if (verticalIconTextBtn != null) {
                    i11 = R$id.llNewFunction;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat != null) {
                        i11 = R$id.pnlLayout;
                        MarginPnlHeaderView marginPnlHeaderView = (MarginPnlHeaderView) ViewBindings.findChildViewById(view, i11);
                        if (marginPnlHeaderView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.stubView))) != null) {
                            i11 = R$id.tvDeposit;
                            VerticalIconTextBtn verticalIconTextBtn2 = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                            if (verticalIconTextBtn2 != null) {
                                i11 = R$id.tvTransfer;
                                VerticalIconTextBtn verticalIconTextBtn3 = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                                if (verticalIconTextBtn3 != null) {
                                    i11 = R$id.tvUnifiedModeTradeTip;
                                    AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                    if (alertTipsTextView != null) {
                                        i11 = R$id.tvWithdraw;
                                        VerticalIconTextBtn verticalIconTextBtn4 = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                                        if (verticalIconTextBtn4 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.view_space))) != null) {
                                            return new C44783h6((ConstraintLayout) view, accountInfoHeaderView, imageView, verticalIconTextBtn, linearLayoutCompat, marginPnlHeaderView, viewFindChildViewById, verticalIconTextBtn2, verticalIconTextBtn3, alertTipsTextView, verticalIconTextBtn4, viewFindChildViewById2);
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
        return this.f100083a;
    }

    public C44783h6(@NonNull ConstraintLayout constraintLayout, @NonNull AccountInfoHeaderView accountInfoHeaderView, @NonNull ImageView imageView, @NonNull VerticalIconTextBtn verticalIconTextBtn, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull MarginPnlHeaderView marginPnlHeaderView, @NonNull View view, @NonNull VerticalIconTextBtn verticalIconTextBtn2, @NonNull VerticalIconTextBtn verticalIconTextBtn3, @NonNull AlertTipsTextView alertTipsTextView, @NonNull VerticalIconTextBtn verticalIconTextBtn4, @NonNull View view2) {
        this.f100083a = constraintLayout;
        this.f100084b = accountInfoHeaderView;
        this.f100085c = imageView;
        this.f100086d = verticalIconTextBtn;
        this.f100087e = linearLayoutCompat;
        this.f100088f = marginPnlHeaderView;
        this.f100089g = view;
        this.f100090h = verticalIconTextBtn2;
        this.f100091i = verticalIconTextBtn3;
        this.f100092j = alertTipsTextView;
        this.f100093k = verticalIconTextBtn4;
        this.f100094l = view2;
    }
}
