package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.site.widget.SiteLogoImageView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: dm.j3 */
/* JADX INFO: compiled from: BkumexFragmentShareImageNewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36785j3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80326a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f80327b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80328c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f80329d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f80330e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ShapeTextView f80331f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatTextView f80332g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f80333h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f80334i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final SiteLogoImageView f80335j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final AppCompatTextView f80336k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final AppCompatTextView f80337l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final AppCompatTextView f80338m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final AppCompatTextView f80339n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final AppCompatTextView f80340o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final AppCompatTextView f80341p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f80342q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final AppCompatImageView f80343r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final AppCompatImageView f80344s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final AppCompatTextView f80345t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final AppCompatTextView f80346u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final AppCompatTextView f80347v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final AppCompatTextView f80348w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f80349x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f80350y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final Group f80351z;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36785j3 m82428a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.desc;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.image;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.iv_vip;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView2 != null) {
                        i11 = R$id.label;
                        ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                        if (shapeTextView != null) {
                            i11 = R$id.leverage;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.line1))) != null) {
                                i11 = R$id.logo;
                                SiteLogoImageView siteLogoImageView = (SiteLogoImageView) ViewBindings.findChildViewById(view, i11);
                                if (siteLogoImageView != null) {
                                    i11 = R$id.markPrice;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                    if (appCompatTextView2 != null) {
                                        i11 = R$id.markPriceLabel;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                        if (appCompatTextView3 != null) {
                                            i11 = R$id.openPrice;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                            if (appCompatTextView4 != null) {
                                                i11 = R$id.openPriceLabel;
                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                if (appCompatTextView5 != null) {
                                                    i11 = R$id.percent;
                                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (appCompatTextView6 != null) {
                                                        i11 = R$id.pnl;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (appCompatTextView7 != null) {
                                                            i11 = R$id.referralCode;
                                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView2 != null) {
                                                                i11 = R$id.share_code;
                                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                                if (appCompatImageView3 != null) {
                                                                    i11 = R$id.share_logo;
                                                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                                    if (appCompatImageView4 != null) {
                                                                        i11 = R$id.side;
                                                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (appCompatTextView8 != null) {
                                                                            i11 = R$id.symbol;
                                                                            AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (appCompatTextView9 != null) {
                                                                                i11 = R$id.tv_head;
                                                                                AppCompatTextView appCompatTextView10 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (appCompatTextView10 != null) {
                                                                                    i11 = R$id.tv_nickName;
                                                                                    AppCompatTextView appCompatTextView11 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (appCompatTextView11 != null) {
                                                                                        i11 = R$id.tv_time;
                                                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView3 != null) {
                                                                                            i11 = R$id.tv_vip;
                                                                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView4 != null) {
                                                                                                i11 = R$id.userInfo;
                                                                                                Group group = (Group) ViewBindings.findChildViewById(view, i11);
                                                                                                if (group != null) {
                                                                                                    return new C36785j3((ConstraintLayout) view, barrier, baseTextView, appCompatImageView, appCompatImageView2, shapeTextView, appCompatTextView, viewFindChildViewById, viewFindChildViewById2, siteLogoImageView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, baseTextView2, appCompatImageView3, appCompatImageView4, appCompatTextView8, appCompatTextView9, appCompatTextView10, appCompatTextView11, baseTextView3, baseTextView4, group);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80326a;
    }

    public C36785j3(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull BaseTextView baseTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull ShapeTextView shapeTextView, @NonNull AppCompatTextView appCompatTextView, @NonNull View view, @NonNull View view2, @NonNull SiteLogoImageView siteLogoImageView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5, @NonNull AppCompatTextView appCompatTextView6, @NonNull AppCompatTextView appCompatTextView7, @NonNull BaseTextView baseTextView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull AppCompatImageView appCompatImageView4, @NonNull AppCompatTextView appCompatTextView8, @NonNull AppCompatTextView appCompatTextView9, @NonNull AppCompatTextView appCompatTextView10, @NonNull AppCompatTextView appCompatTextView11, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull Group group) {
        this.f80326a = constraintLayout;
        this.f80327b = barrier;
        this.f80328c = baseTextView;
        this.f80329d = appCompatImageView;
        this.f80330e = appCompatImageView2;
        this.f80331f = shapeTextView;
        this.f80332g = appCompatTextView;
        this.f80333h = view;
        this.f80334i = view2;
        this.f80335j = siteLogoImageView;
        this.f80336k = appCompatTextView2;
        this.f80337l = appCompatTextView3;
        this.f80338m = appCompatTextView4;
        this.f80339n = appCompatTextView5;
        this.f80340o = appCompatTextView6;
        this.f80341p = appCompatTextView7;
        this.f80342q = baseTextView2;
        this.f80343r = appCompatImageView3;
        this.f80344s = appCompatImageView4;
        this.f80345t = appCompatTextView8;
        this.f80346u = appCompatTextView9;
        this.f80347v = appCompatTextView10;
        this.f80348w = appCompatTextView11;
        this.f80349x = baseTextView3;
        this.f80350y = baseTextView4;
        this.f80351z = group;
    }
}
