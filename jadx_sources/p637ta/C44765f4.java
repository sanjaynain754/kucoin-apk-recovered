package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.deposit.view.DepositInformationView;
import com.kubi.assets.deposit.view.DepositKycView;
import com.kubi.assets.deposit.view.DepositLightningNetworkView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;

/* JADX INFO: renamed from: ta.f4 */
/* JADX INFO: compiled from: KucoinFragmentDepositBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44765f4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99911a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final DepositLightningNetworkView f99912b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f99913c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99914d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f99915e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final C44797j4 f99916f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final C44773g4 f99917g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final C44805k4 f99918h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final C44813l4 f99919i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final C44820m4 f99920j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final C44834o4 f99921k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final C44748d3 f99922l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final DepositInformationView f99923m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final RoundImageView f99924n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ImageView f99925o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final DepositKycView f99926p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final C44756e3 f99927q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final ShapeConstraintLayout f99928r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f99929s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f99930t;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44765f4 m99045a(@NonNull View view) {
        View viewFindChildViewById;
        DepositKycView depositKycViewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.LightningNetView;
        DepositLightningNetworkView depositLightningNetworkViewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (depositLightningNetworkViewFindChildViewById != null) {
            i11 = R$id.coin_name;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.deposit_chain_tip;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.deposit_root_view;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.includeAddress))) != null) {
                        C44797j4 c44797j4M99113a = C44797j4.m99113a(viewFindChildViewById);
                        i11 = R$id.includeBottomButton;
                        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
                        if (viewFindChildViewById3 != null) {
                            C44773g4 c44773g4M99062a = C44773g4.m99062a(viewFindChildViewById3);
                            i11 = R$id.includeCoinDisable;
                            View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i11);
                            if (viewFindChildViewById4 != null) {
                                C44805k4 c44805k4M99130a = C44805k4.m99130a(viewFindChildViewById4);
                                i11 = R$id.includeCoinFail;
                                View viewFindChildViewById5 = ViewBindings.findChildViewById(view, i11);
                                if (viewFindChildViewById5 != null) {
                                    C44813l4 c44813l4M99147a = C44813l4.m99147a(viewFindChildViewById5);
                                    i11 = R$id.includeDepositSubscript;
                                    View viewFindChildViewById6 = ViewBindings.findChildViewById(view, i11);
                                    if (viewFindChildViewById6 != null) {
                                        C44820m4 c44820m4M99164a = C44820m4.m99164a(viewFindChildViewById6);
                                        i11 = R$id.includeSelectChain;
                                        View viewFindChildViewById7 = ViewBindings.findChildViewById(view, i11);
                                        if (viewFindChildViewById7 != null) {
                                            C44834o4 c44834o4M99194a = C44834o4.m99194a(viewFindChildViewById7);
                                            i11 = R$id.informationTitleView;
                                            View viewFindChildViewById8 = ViewBindings.findChildViewById(view, i11);
                                            if (viewFindChildViewById8 != null) {
                                                C44748d3 c44748d3M99010a = C44748d3.m99010a(viewFindChildViewById8);
                                                i11 = R$id.informationView;
                                                DepositInformationView depositInformationViewFindChildViewById = ViewBindings.findChildViewById(view, i11);
                                                if (depositInformationViewFindChildViewById != null) {
                                                    i11 = R$id.iv_address_qr;
                                                    RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i11);
                                                    if (roundImageView != null) {
                                                        i11 = R$id.ivIcon;
                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                                        if (imageView != null && (depositKycViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.kycView))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.layout_deposit_navigation_bar))) != null) {
                                                            C44756e3 c44756e3M99026a = C44756e3.m99026a(viewFindChildViewById2);
                                                            i11 = R$id.layout_old_address_tip;
                                                            ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                            if (shapeConstraintLayout != null) {
                                                                i11 = R$id.tvTipContent;
                                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView3 != null) {
                                                                    i11 = R$id.tvTipTitle;
                                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView4 != null) {
                                                                        return new C44765f4((ConstraintLayout) view, depositLightningNetworkViewFindChildViewById, baseTextView, baseTextView2, linearLayout, c44797j4M99113a, c44773g4M99062a, c44805k4M99130a, c44813l4M99147a, c44820m4M99164a, c44834o4M99194a, c44748d3M99010a, depositInformationViewFindChildViewById, roundImageView, imageView, depositKycViewFindChildViewById, c44756e3M99026a, shapeConstraintLayout, baseTextView3, baseTextView4);
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
        return this.f99911a;
    }

    public C44765f4(@NonNull ConstraintLayout constraintLayout, @NonNull DepositLightningNetworkView depositLightningNetworkView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull LinearLayout linearLayout, @NonNull C44797j4 c44797j4, @NonNull C44773g4 c44773g4, @NonNull C44805k4 c44805k4, @NonNull C44813l4 c44813l4, @NonNull C44820m4 c44820m4, @NonNull C44834o4 c44834o4, @NonNull C44748d3 c44748d3, @NonNull DepositInformationView depositInformationView, @NonNull RoundImageView roundImageView, @NonNull ImageView imageView, @NonNull DepositKycView depositKycView, @NonNull C44756e3 c44756e3, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f99911a = constraintLayout;
        this.f99912b = depositLightningNetworkView;
        this.f99913c = baseTextView;
        this.f99914d = baseTextView2;
        this.f99915e = linearLayout;
        this.f99916f = c44797j4;
        this.f99917g = c44773g4;
        this.f99918h = c44805k4;
        this.f99919i = c44813l4;
        this.f99920j = c44820m4;
        this.f99921k = c44834o4;
        this.f99922l = c44748d3;
        this.f99923m = depositInformationView;
        this.f99924n = roundImageView;
        this.f99925o = imageView;
        this.f99926p = depositKycView;
        this.f99927q = c44756e3;
        this.f99928r = shapeConstraintLayout;
        this.f99929s = baseTextView3;
        this.f99930t = baseTextView4;
    }
}
