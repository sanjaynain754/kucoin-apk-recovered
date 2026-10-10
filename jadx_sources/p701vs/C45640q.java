package p701vs;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.operation.lib.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: vs.q */
/* JADX INFO: compiled from: OperationWidgetNewuserBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C45640q implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f102901a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f102902b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C45636m f102903c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f102904d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f102905e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FrameLayout f102906f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f102907g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f102908h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f102909i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f102910j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f102911k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f102912l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f102913m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f102914n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f102915o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f102916p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f102917q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f102918r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f102919s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f102920t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f102921u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final ViewStub f102922v;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45640q m100771a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.btnSignupLogin;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.includeShimmer))) != null) {
            C45636m c45636mM100762a = C45636m.m100762a(viewFindChildViewById);
            i11 = R$id.layoutCountdown;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.layoutData;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat2 != null) {
                    i11 = R$id.layoutImgVideo;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.lottieTop;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView != null) {
                            i11 = R$id.tvBonusCenter;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tvD;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tvDUnit;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tvH;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tvHUnit;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tvM;
                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView6 != null) {
                                                    i11 = R$id.tvMUnit;
                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView7 != null) {
                                                        i11 = R$id.tvReward;
                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView8 != null) {
                                                            i11 = R$id.tvS;
                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView9 != null) {
                                                                i11 = R$id.tvSUnit;
                                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView10 != null) {
                                                                    i11 = R$id.tvSlogan1;
                                                                    BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView11 != null) {
                                                                        i11 = R$id.tvSlogan2;
                                                                        BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView12 != null) {
                                                                            i11 = R$id.tvSubTitle;
                                                                            BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView13 != null) {
                                                                                i11 = R$id.tvTitle;
                                                                                BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView14 != null) {
                                                                                    i11 = R$id.videoStub;
                                                                                    ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i11);
                                                                                    if (viewStub != null) {
                                                                                        return new C45640q((FrameLayout) view, kcPrimaryButton, c45636mM100762a, linearLayoutCompat, linearLayoutCompat2, frameLayout, appCompatImageView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14, viewStub);
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
    public FrameLayout getRoot() {
        return this.f102901a;
    }

    public C45640q(@NonNull FrameLayout frameLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull C45636m c45636m, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull FrameLayout frameLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull ViewStub viewStub) {
        this.f102901a = frameLayout;
        this.f102902b = kcPrimaryButton;
        this.f102903c = c45636m;
        this.f102904d = linearLayoutCompat;
        this.f102905e = linearLayoutCompat2;
        this.f102906f = frameLayout2;
        this.f102907g = appCompatImageView;
        this.f102908h = baseTextView;
        this.f102909i = baseTextView2;
        this.f102910j = baseTextView3;
        this.f102911k = baseTextView4;
        this.f102912l = baseTextView5;
        this.f102913m = baseTextView6;
        this.f102914n = baseTextView7;
        this.f102915o = baseTextView8;
        this.f102916p = baseTextView9;
        this.f102917q = baseTextView10;
        this.f102918r = baseTextView11;
        this.f102919s = baseTextView12;
        this.f102920t = baseTextView13;
        this.f102921u = baseTextView14;
        this.f102922v = viewStub;
    }
}
