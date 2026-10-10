package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.view.ScannerEditText;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FrameEditText;

/* JADX INFO: renamed from: ta.e5 */
/* JADX INFO: compiled from: KucoinItemAddressAddBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44758e5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99819a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameEditText f99820b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f99821c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f99822d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99823e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RelativeLayout f99824f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ScannerEditText f99825g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ScannerEditText f99826h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99827i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99828j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99829k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f99830l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f99831m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f99832n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f99833o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f99834p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f99835q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f99836r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f99837s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final AlertTipsTextView f99838t;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44758e5 m99030a(@NonNull View view) {
        int i11 = R$id.et_remark;
        FrameEditText frameEditText = (FrameEditText) ViewBindings.findChildViewById(view, i11);
        if (frameEditText != null) {
            i11 = R$id.evmSupportLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.icon_pull_chain;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.iv_delete;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.ll_pull_chain;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                        if (relativeLayout != null) {
                            i11 = R$id.scan_et_addr;
                            ScannerEditText scannerEditText = (ScannerEditText) ViewBindings.findChildViewById(view, i11);
                            if (scannerEditText != null) {
                                i11 = R$id.scan_et_memo_ex;
                                ScannerEditText scannerEditText2 = (ScannerEditText) ViewBindings.findChildViewById(view, i11);
                                if (scannerEditText2 != null) {
                                    i11 = R$id.tv_addr_error;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tv_addr_title;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tvEvmNetworkTip;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.tvEvmTip;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    i11 = R$id.tv_memo_error;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        i11 = R$id.tv_memo_title;
                                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView7 != null) {
                                                            i11 = R$id.tv_pull_chain;
                                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView8 != null) {
                                                                i11 = R$id.tv_pull_chain_title;
                                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView9 != null) {
                                                                    i11 = R$id.tv_remark_title;
                                                                    BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView10 != null) {
                                                                        i11 = R$id.tv_save_uni_addr;
                                                                        BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView11 != null) {
                                                                            i11 = R$id.tv_supported_tip;
                                                                            BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView12 != null) {
                                                                                i11 = R$id.tv_transfer_network_notice;
                                                                                AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (alertTipsTextView != null) {
                                                                                    return new C44758e5((ConstraintLayout) view, frameEditText, linearLayout, appCompatImageView, baseTextView, relativeLayout, scannerEditText, scannerEditText2, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, alertTipsTextView);
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
        return this.f99819a;
    }

    public C44758e5(@NonNull ConstraintLayout constraintLayout, @NonNull FrameEditText frameEditText, @NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull RelativeLayout relativeLayout, @NonNull ScannerEditText scannerEditText, @NonNull ScannerEditText scannerEditText2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull AlertTipsTextView alertTipsTextView) {
        this.f99819a = constraintLayout;
        this.f99820b = frameEditText;
        this.f99821c = linearLayout;
        this.f99822d = appCompatImageView;
        this.f99823e = baseTextView;
        this.f99824f = relativeLayout;
        this.f99825g = scannerEditText;
        this.f99826h = scannerEditText2;
        this.f99827i = baseTextView2;
        this.f99828j = baseTextView3;
        this.f99829k = baseTextView4;
        this.f99830l = baseTextView5;
        this.f99831m = baseTextView6;
        this.f99832n = baseTextView7;
        this.f99833o = baseTextView8;
        this.f99834p = baseTextView9;
        this.f99835q = baseTextView10;
        this.f99836r = baseTextView11;
        this.f99837s = baseTextView12;
        this.f99838t = alertTipsTextView;
    }
}
