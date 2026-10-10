package p637ta;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.view.ScannerEditText;
import com.kubi.assets.withdraw.view.WithdrawAddressView;
import com.kubi.assets.withdraw.view.WithdrawDescribeView;
import com.kubi.assets.withdraw.view.WithdrawNetworkView;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;

/* JADX INFO: renamed from: ta.i5 */
/* JADX INFO: compiled from: KucoinViewWithdrawContentNewBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44790i5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100141a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final WithdrawAddressView f100142b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Space f100143c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f100144d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final CheckBox f100145e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f100146f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f100147g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final WithdrawDescribeView f100148h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final FilterEmojiEditText f100149i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ScannerEditText f100150j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ConstraintLayout f100151k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final C44732b3 f100152l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ImageView f100153m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final C44798j5 f100154n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final WithdrawNetworkView f100155o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f100156p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f100157q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f100158r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f100159s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f100160t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f100161u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f100162v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f100163w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final AlertTipsTextView f100164x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f100165y;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44790i5 m99098a(@NonNull View view) {
        WithdrawDescribeView withdrawDescribeViewFindChildViewById;
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.addressView;
        WithdrawAddressView withdrawAddressViewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (withdrawAddressViewFindChildViewById != null) {
            i11 = R$id.amount_devider;
            Space space = (Space) ViewBindings.findChildViewById(view, i11);
            if (space != null) {
                i11 = R$id.btn_all;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.cb_out;
                    CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
                    if (checkBox != null) {
                        i11 = R$id.cl_withdraw_amount;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout != null) {
                            i11 = R$id.constraint_wallet_addr;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout2 != null && (withdrawDescribeViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.describeView))) != null) {
                                i11 = R$id.et_amount;
                                FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) ViewBindings.findChildViewById(view, i11);
                                if (filterEmojiEditText != null) {
                                    i11 = R$id.et_scan_memo;
                                    ScannerEditText scannerEditText = (ScannerEditText) ViewBindings.findChildViewById(view, i11);
                                    if (scannerEditText != null) {
                                        i11 = R$id.half_input;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                        if (constraintLayout3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.include_kyc))) != null) {
                                            C44732b3 c44732b3M98974a = C44732b3.m98974a(viewFindChildViewById);
                                            i11 = R$id.ivAdd;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                            if (imageView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.layout_retry))) != null) {
                                                C44798j5 c44798j5M99115a = C44798j5.m99115a(viewFindChildViewById2);
                                                i11 = R$id.networkView;
                                                WithdrawNetworkView withdrawNetworkViewFindChildViewById = ViewBindings.findChildViewById(view, i11);
                                                if (withdrawNetworkViewFindChildViewById != null) {
                                                    i11 = R$id.tv_addr_error;
                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView2 != null) {
                                                        i11 = R$id.tv_addr_title;
                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView3 != null) {
                                                            i11 = R$id.tv_amount_error;
                                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView4 != null) {
                                                                i11 = R$id.tv_available_balance;
                                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView5 != null) {
                                                                    i11 = R$id.tv_max_available;
                                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView6 != null) {
                                                                        i11 = R$id.tv_memo_error;
                                                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView7 != null) {
                                                                            i11 = R$id.tv_memo_title;
                                                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView8 != null) {
                                                                                i11 = R$id.tv_num_title;
                                                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView9 != null) {
                                                                                    i11 = R$id.tv_transfer_network_notice;
                                                                                    AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (alertTipsTextView != null) {
                                                                                        i11 = R$id.tv_withdraw_unit;
                                                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView10 != null) {
                                                                                            return new C44790i5((ConstraintLayout) view, withdrawAddressViewFindChildViewById, space, baseTextView, checkBox, constraintLayout, constraintLayout2, withdrawDescribeViewFindChildViewById, filterEmojiEditText, scannerEditText, constraintLayout3, c44732b3M98974a, imageView, c44798j5M99115a, withdrawNetworkViewFindChildViewById, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, alertTipsTextView, baseTextView10);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f100141a;
    }

    public C44790i5(@NonNull ConstraintLayout constraintLayout, @NonNull WithdrawAddressView withdrawAddressView, @NonNull Space space, @NonNull BaseTextView baseTextView, @NonNull CheckBox checkBox, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull WithdrawDescribeView withdrawDescribeView, @NonNull FilterEmojiEditText filterEmojiEditText, @NonNull ScannerEditText scannerEditText, @NonNull ConstraintLayout constraintLayout4, @NonNull C44732b3 c44732b3, @NonNull ImageView imageView, @NonNull C44798j5 c44798j5, @NonNull WithdrawNetworkView withdrawNetworkView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull AlertTipsTextView alertTipsTextView, @NonNull BaseTextView baseTextView10) {
        this.f100141a = constraintLayout;
        this.f100142b = withdrawAddressView;
        this.f100143c = space;
        this.f100144d = baseTextView;
        this.f100145e = checkBox;
        this.f100146f = constraintLayout2;
        this.f100147g = constraintLayout3;
        this.f100148h = withdrawDescribeView;
        this.f100149i = filterEmojiEditText;
        this.f100150j = scannerEditText;
        this.f100151k = constraintLayout4;
        this.f100152l = c44732b3;
        this.f100153m = imageView;
        this.f100154n = c44798j5;
        this.f100155o = withdrawNetworkView;
        this.f100156p = baseTextView2;
        this.f100157q = baseTextView3;
        this.f100158r = baseTextView4;
        this.f100159s = baseTextView5;
        this.f100160t = baseTextView6;
        this.f100161u = baseTextView7;
        this.f100162v = baseTextView8;
        this.f100163w = baseTextView9;
        this.f100164x = alertTipsTextView;
        this.f100165y = baseTextView10;
    }
}
