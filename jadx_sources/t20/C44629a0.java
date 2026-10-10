package t20;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.a0 */
/* JADX INFO: compiled from: FragmentCallAuctionProgressContentBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44629a0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f98942a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f98943b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f98944c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f98945d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f98946e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f98947f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f98948g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatImageView f98949h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f98950i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f98951j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f98952k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f98953l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f98954m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f98955n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f98956o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f98957p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f98958q;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44629a0 m98737a(@NonNull View view) {
        int i11 = R$id.iv_call_auction_process_connect1;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.iv_call_auction_process_connect2;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView2 != null) {
                i11 = R$id.iv_call_auction_process_connect3;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView3 != null) {
                    i11 = R$id.iv_call_auction_process_step1;
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView4 != null) {
                        i11 = R$id.iv_call_auction_process_step2;
                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView5 != null) {
                            i11 = R$id.iv_call_auction_process_step3;
                            AppCompatImageView appCompatImageView6 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatImageView6 != null) {
                                i11 = R$id.iv_call_auction_process_step4;
                                AppCompatImageView appCompatImageView7 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatImageView7 != null) {
                                    i11 = R$id.tv_call_auction_process_step1;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.tv_call_auction_process_step1_desc;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.tv_call_auction_process_step2;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.tv_call_auction_process_step2_desc;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.tv_call_auction_process_step3;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        i11 = R$id.tv_call_auction_process_step4;
                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView6 != null) {
                                                            i11 = R$id.tv_call_auction_process_step4_desc;
                                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView7 != null) {
                                                                i11 = R$id.tv_call_auction_process_title;
                                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView8 != null) {
                                                                    i11 = R$id.tv_understand_rules;
                                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView9 != null) {
                                                                        return new C44629a0(view, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, appCompatImageView7, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9);
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
    public View getRoot() {
        return this.f98942a;
    }

    public C44629a0(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull AppCompatImageView appCompatImageView4, @NonNull AppCompatImageView appCompatImageView5, @NonNull AppCompatImageView appCompatImageView6, @NonNull AppCompatImageView appCompatImageView7, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9) {
        this.f98942a = view;
        this.f98943b = appCompatImageView;
        this.f98944c = appCompatImageView2;
        this.f98945d = appCompatImageView3;
        this.f98946e = appCompatImageView4;
        this.f98947f = appCompatImageView5;
        this.f98948g = appCompatImageView6;
        this.f98949h = appCompatImageView7;
        this.f98950i = baseTextView;
        this.f98951j = baseTextView2;
        this.f98952k = baseTextView3;
        this.f98953l = baseTextView4;
        this.f98954m = baseTextView5;
        this.f98955n = baseTextView6;
        this.f98956o = baseTextView7;
        this.f98957p = baseTextView8;
        this.f98958q = baseTextView9;
    }
}
