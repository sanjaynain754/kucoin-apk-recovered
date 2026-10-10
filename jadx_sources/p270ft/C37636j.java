package p270ft;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.j */
/* JADX INFO: compiled from: BotcFragmentFastBalanceConfirmBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37636j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84047a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f84048b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f84049c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f84050d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84051e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84052f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84053g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84054h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84055i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84056j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f84057k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f84058l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f84059m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f84060n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f84061o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f84062p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final FrameLayout f84063q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final ProgressBar f84064r;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37636j m84854a(@NonNull View view) {
        int i11 = R$id.iv_count_down;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_fee_question;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.iv_method_icon;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView3 != null) {
                    i11 = R$id.tv_confirm;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_count_down;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tv_estimate;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tv_fee;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tv_fee_tip;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.tv_funds;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            i11 = R$id.tv_method;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                i11 = R$id.tv_method_tip;
                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView8 != null) {
                                                    i11 = R$id.tv_price;
                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView9 != null) {
                                                        i11 = R$id.tv_price_label;
                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView10 != null) {
                                                            i11 = R$id.tv_total;
                                                            BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView11 != null) {
                                                                i11 = R$id.tv_total_tip;
                                                                BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView12 != null) {
                                                                    i11 = R$id.view_confirm;
                                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                                    if (frameLayout != null) {
                                                                        i11 = R$id.view_progress;
                                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i11);
                                                                        if (progressBar != null) {
                                                                            return new C37636j((ConstraintLayout) view, imageView, imageView2, imageView3, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, frameLayout, progressBar);
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
        return this.f84047a;
    }

    public C37636j(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull FrameLayout frameLayout, @NonNull ProgressBar progressBar) {
        this.f84047a = constraintLayout;
        this.f84048b = imageView;
        this.f84049c = imageView2;
        this.f84050d = imageView3;
        this.f84051e = baseTextView;
        this.f84052f = baseTextView2;
        this.f84053g = baseTextView3;
        this.f84054h = baseTextView4;
        this.f84055i = baseTextView5;
        this.f84056j = baseTextView6;
        this.f84057k = baseTextView7;
        this.f84058l = baseTextView8;
        this.f84059m = baseTextView9;
        this.f84060n = baseTextView10;
        this.f84061o = baseTextView11;
        this.f84062p = baseTextView12;
        this.f84063q = frameLayout;
        this.f84064r = progressBar;
    }
}
