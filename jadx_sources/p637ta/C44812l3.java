package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.l3 */
/* JADX INFO: compiled from: DialogUnifiedTradeHistoryEntranceBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44812l3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f100379a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f100380b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f100381c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f100382d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f100383e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f100384f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f100385g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100386h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f100387i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f100388j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f100389k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f100390l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f100391m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f100392n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44812l3 m99145a(@NonNull View view) {
        int i11 = R$id.futureLayout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.ivFutures;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.ivMargin;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView2 != null) {
                    i11 = R$id.ivSpot;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView3 != null) {
                        i11 = R$id.marginLayout;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout2 != null) {
                            i11 = R$id.spotLayout;
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout3 != null) {
                                i11 = R$id.tvFutures;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tvFuturesDes;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvMargin;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tvMarginDes;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.tvSpot;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    i11 = R$id.tvSpotDes;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        i11 = R$id.tvTitle;
                                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView7 != null) {
                                                            return new C44812l3((LinearLayoutCompat) view, constraintLayout, appCompatImageView, appCompatImageView2, appCompatImageView3, constraintLayout2, constraintLayout3, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7);
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
    public LinearLayoutCompat getRoot() {
        return this.f100379a;
    }

    public C44812l3(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7) {
        this.f100379a = linearLayoutCompat;
        this.f100380b = constraintLayout;
        this.f100381c = appCompatImageView;
        this.f100382d = appCompatImageView2;
        this.f100383e = appCompatImageView3;
        this.f100384f = constraintLayout2;
        this.f100385g = constraintLayout3;
        this.f100386h = baseTextView;
        this.f100387i = baseTextView2;
        this.f100388j = baseTextView3;
        this.f100389k = baseTextView4;
        this.f100390l = baseTextView5;
        this.f100391m = baseTextView6;
        this.f100392n = baseTextView7;
    }
}
