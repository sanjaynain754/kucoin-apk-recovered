package p675uv;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.redpackage.R$id;
import com.kubi.redpackage.view.RedPacketCoverBgMaskView;
import com.kubi.redpackage.view.RedPacketCoverBgView;

/* JADX INFO: renamed from: uv.c */
/* JADX INFO: compiled from: BredpackageViewDetailHeaderBinding.java */
/* JADX INFO: loaded from: classes38.dex */
public final class C45317c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101894a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RedPacketCoverBgMaskView f101895b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RedPacketCoverBgView f101896c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f101897d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f101898e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f101899f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f101900g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f101901h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f101902i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f101903j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f101904k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f101905l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f101906m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f101907n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45317c m100188a(@NonNull View view) {
        int i11 = R$id.iv_cover_mask;
        RedPacketCoverBgMaskView redPacketCoverBgMaskView = (RedPacketCoverBgMaskView) ViewBindings.findChildViewById(view, i11);
        if (redPacketCoverBgMaskView != null) {
            i11 = R$id.iv_top;
            RedPacketCoverBgView redPacketCoverBgView = (RedPacketCoverBgView) ViewBindings.findChildViewById(view, i11);
            if (redPacketCoverBgView != null) {
                i11 = R$id.layout_amount;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null) {
                    i11 = R$id.layout_content;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout2 != null) {
                        i11 = R$id.layout_nametype;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout != null) {
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                            i11 = R$id.tv_large;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView != null) {
                                i11 = R$id.tv_name;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView2 != null) {
                                    i11 = R$id.tv_number;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView3 != null) {
                                        i11 = R$id.tv_retry;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView4 != null) {
                                            i11 = R$id.tv_small;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                            if (textView5 != null) {
                                                i11 = R$id.tv_tip;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView6 != null) {
                                                    i11 = R$id.tv_type;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                    if (textView7 != null) {
                                                        return new C45317c(constraintLayout3, redPacketCoverBgMaskView, redPacketCoverBgView, constraintLayout, constraintLayout2, linearLayout, constraintLayout3, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
        return this.f101894a;
    }

    public C45317c(@NonNull ConstraintLayout constraintLayout, @NonNull RedPacketCoverBgMaskView redPacketCoverBgMaskView, @NonNull RedPacketCoverBgView redPacketCoverBgView, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f101894a = constraintLayout;
        this.f101895b = redPacketCoverBgMaskView;
        this.f101896c = redPacketCoverBgView;
        this.f101897d = constraintLayout2;
        this.f101898e = constraintLayout3;
        this.f101899f = linearLayout;
        this.f101900g = constraintLayout4;
        this.f101901h = textView;
        this.f101902i = textView2;
        this.f101903j = textView3;
        this.f101904k = textView4;
        this.f101905l = textView5;
        this.f101906m = textView6;
        this.f101907n = textView7;
    }
}
