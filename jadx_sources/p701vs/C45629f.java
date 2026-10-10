package p701vs;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.operation.lib.R$id;
import com.kubi.operation.lib.widget.Bouns3TaskView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import k00.C40848l;

/* JADX INFO: renamed from: vs.f */
/* JADX INFO: compiled from: OperationHomecardBonusBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45629f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f102816a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f102817b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C40848l f102818c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f102819d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f102820e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f102821f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FrameLayout f102822g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final C45634k f102823h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LottieAnimationView f102824i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LottieAnimationView f102825j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final Bouns3TaskView f102826k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f102827l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f102828m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f102829n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f102830o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f102831p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f102832q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f102833r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f102834s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f102835t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f102836u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f102837v;

    public C45629f(@NonNull FrameLayout frameLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull C40848l c40848l, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull FrameLayout frameLayout2, @NonNull C45634k c45634k, @NonNull LottieAnimationView lottieAnimationView, @NonNull LottieAnimationView lottieAnimationView2, @NonNull Bouns3TaskView bouns3TaskView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11) {
        this.f102816a = frameLayout;
        this.f102817b = kcPrimaryButton;
        this.f102818c = c40848l;
        this.f102819d = linearLayoutCompat;
        this.f102820e = linearLayoutCompat2;
        this.f102821f = linearLayoutCompat3;
        this.f102822g = frameLayout2;
        this.f102823h = c45634k;
        this.f102824i = lottieAnimationView;
        this.f102825j = lottieAnimationView2;
        this.f102826k = bouns3TaskView;
        this.f102827l = baseTextView;
        this.f102828m = baseTextView2;
        this.f102829n = baseTextView3;
        this.f102830o = baseTextView4;
        this.f102831p = baseTextView5;
        this.f102832q = baseTextView6;
        this.f102833r = baseTextView7;
        this.f102834s = baseTextView8;
        this.f102835t = baseTextView9;
        this.f102836u = baseTextView10;
        this.f102837v = baseTextView11;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45629f m100743a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.btnSignupLogin;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.includeSearch))) != null) {
            C40848l c40848lM89395a = C40848l.m89395a(viewFindChildViewById);
            i11 = R$id.layoutBonusCenterEntrance;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.layoutContent;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat2 != null) {
                    i11 = R$id.layoutCountdown;
                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat3 != null) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        i11 = R$id.layoutShimmer;
                        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
                        if (viewFindChildViewById2 != null) {
                            C45634k c45634kM100756a = C45634k.m100756a(viewFindChildViewById2);
                            i11 = R$id.lottieGiftBox;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
                            if (lottieAnimationView != null) {
                                i11 = R$id.lottieParticle;
                                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
                                if (lottieAnimationView2 != null) {
                                    i11 = R$id.taskView;
                                    Bouns3TaskView bouns3TaskView = (Bouns3TaskView) ViewBindings.findChildViewById(view, i11);
                                    if (bouns3TaskView != null) {
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
                                                                    i11 = R$id.tvS;
                                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView8 != null) {
                                                                        i11 = R$id.tvSUnit;
                                                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView9 != null) {
                                                                            i11 = R$id.tvSubTitle;
                                                                            BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView10 != null) {
                                                                                i11 = R$id.tvTitle;
                                                                                BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView11 != null) {
                                                                                    return new C45629f(frameLayout, kcPrimaryButton, c40848lM89395a, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, frameLayout, c45634kM100756a, lottieAnimationView, lottieAnimationView2, bouns3TaskView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11);
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
        return this.f102816a;
    }
}
