package q10;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.TradePairNameTextView;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.search.R$id;

/* JADX INFO: renamed from: q10.j */
/* JADX INFO: compiled from: SearchLayoutRealtimeViewBinding.java */
/* JADX INFO: loaded from: classes44.dex */
public final class C43590j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f96215a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Group f96216b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Group f96217c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Group f96218d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Group f96219e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final Group f96220f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RoundImageView f96221g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f96222h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f96223i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f96224j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f96225k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f96226l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f96227m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f96228n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f96229o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f96230p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f96231q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f96232r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f96233s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f96234t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f96235u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f96236v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final ImageView f96237w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f96238x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final TradePairNameTextView f96239y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final View f96240z;

    public C43590j(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull Group group, @NonNull Group group2, @NonNull Group group3, @NonNull Group group4, @NonNull Group group5, @NonNull RoundImageView roundImageView, @NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView15, @NonNull TradePairNameTextView tradePairNameTextView, @NonNull View view) {
        this.f96215a = linearLayoutCompat;
        this.f96216b = group;
        this.f96217c = group2;
        this.f96218d = group3;
        this.f96219e = group4;
        this.f96220f = group5;
        this.f96221g = roundImageView;
        this.f96222h = constraintLayout;
        this.f96223i = baseTextView;
        this.f96224j = baseTextView2;
        this.f96225k = baseTextView3;
        this.f96226l = baseTextView4;
        this.f96227m = baseTextView5;
        this.f96228n = baseTextView6;
        this.f96229o = baseTextView7;
        this.f96230p = baseTextView8;
        this.f96231q = baseTextView9;
        this.f96232r = baseTextView10;
        this.f96233s = baseTextView11;
        this.f96234t = baseTextView12;
        this.f96235u = baseTextView13;
        this.f96236v = baseTextView14;
        this.f96237w = imageView;
        this.f96238x = baseTextView15;
        this.f96239y = tradePairNameTextView;
        this.f96240z = view;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43590j m95930a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.groupComingsoon;
        Group group = (Group) ViewBindings.findChildViewById(view, i11);
        if (group != null) {
            i11 = R$id.groupCountdown;
            Group group2 = (Group) ViewBindings.findChildViewById(view, i11);
            if (group2 != null) {
                i11 = R$id.groupLaunched;
                Group group3 = (Group) ViewBindings.findChildViewById(view, i11);
                if (group3 != null) {
                    i11 = R$id.groupNewcoin;
                    Group group4 = (Group) ViewBindings.findChildViewById(view, i11);
                    if (group4 != null) {
                        i11 = R$id.groupTopic;
                        Group group5 = (Group) ViewBindings.findChildViewById(view, i11);
                        if (group5 != null) {
                            i11 = R$id.ivBackground;
                            RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i11);
                            if (roundImageView != null) {
                                i11 = R$id.layoutContent;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                if (constraintLayout != null) {
                                    i11 = R$id.tvComingSoon;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.tvCountdownTime;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.tvCountdownTitle;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.tvLaunchedPrice;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.tvLaunchedRate;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        i11 = R$id.tvNewListingTag;
                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView6 != null) {
                                                            i11 = R$id.tvNewcoinPrice;
                                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView7 != null) {
                                                                i11 = R$id.tvNewcoinRate;
                                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView8 != null) {
                                                                    i11 = R$id.tvNewcoinTitleDivider;
                                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView9 != null) {
                                                                        i11 = R$id.tvNewcoinTitlePrice;
                                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView10 != null) {
                                                                            i11 = R$id.tvNewcoinTitleRate;
                                                                            BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView11 != null) {
                                                                                i11 = R$id.tvRealtimeTitle;
                                                                                BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView12 != null) {
                                                                                    i11 = R$id.tvSearchCount;
                                                                                    BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView13 != null) {
                                                                                        i11 = R$id.tvSearchCountTips;
                                                                                        BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView14 != null) {
                                                                                            i11 = R$id.tvTopicArrow;
                                                                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (imageView != null) {
                                                                                                i11 = R$id.tvTopicTitle;
                                                                                                BaseTextView baseTextView15 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView15 != null) {
                                                                                                    i11 = R$id.tvTradePair;
                                                                                                    TradePairNameTextView tradePairNameTextView = (TradePairNameTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (tradePairNameTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.vTopicDivider))) != null) {
                                                                                                        return new C43590j((LinearLayoutCompat) view, group, group2, group3, group4, group5, roundImageView, constraintLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14, imageView, baseTextView15, tradePairNameTextView, viewFindChildViewById);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f96215a;
    }
}
