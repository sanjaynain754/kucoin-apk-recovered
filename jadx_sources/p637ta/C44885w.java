package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import k00.C40842f;

/* JADX INFO: renamed from: ta.w */
/* JADX INFO: compiled from: AssetDialogCryptoInfoBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44885w implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f101018a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C40842f f101019b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ShapeConstraintLayout f101020c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CoinAvatarView f101021d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f101022e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f101023f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f101024g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f101025h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShapeTextView f101026i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f101027j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f101028k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f101029l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f101030m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f101031n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final View f101032o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44885w m99294a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.bottomSheet;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null) {
            C40842f c40842fM89381a = C40842f.m89381a(viewFindChildViewById2);
            i11 = R$id.clContent;
            ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (shapeConstraintLayout != null) {
                i11 = R$id.ivIcon;
                CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
                if (coinAvatarView != null) {
                    i11 = R$id.tvAddress;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvAddressName;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvAmount;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tvAmountName;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tvChain;
                                    ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                    if (shapeTextView != null) {
                                        i11 = R$id.tvCoin;
                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView5 != null) {
                                            i11 = R$id.tvMemo;
                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView6 != null) {
                                                i11 = R$id.tvMemoName;
                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView7 != null) {
                                                    i11 = R$id.tvTip;
                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView8 != null) {
                                                        i11 = R$id.tvTitle;
                                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView9 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_divider))) != null) {
                                                            return new C44885w((LinearLayout) view, c40842fM89381a, shapeConstraintLayout, coinAvatarView, baseTextView, baseTextView2, baseTextView3, baseTextView4, shapeTextView, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, viewFindChildViewById);
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
    public LinearLayout getRoot() {
        return this.f101018a;
    }

    public C44885w(@NonNull LinearLayout linearLayout, @NonNull C40842f c40842f, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull CoinAvatarView coinAvatarView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull ShapeTextView shapeTextView, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull View view) {
        this.f101018a = linearLayout;
        this.f101019b = c40842f;
        this.f101020c = shapeConstraintLayout;
        this.f101021d = coinAvatarView;
        this.f101022e = baseTextView;
        this.f101023f = baseTextView2;
        this.f101024g = baseTextView3;
        this.f101025h = baseTextView4;
        this.f101026i = shapeTextView;
        this.f101027j = baseTextView5;
        this.f101028k = baseTextView6;
        this.f101029l = baseTextView7;
        this.f101030m = baseTextView8;
        this.f101031n = baseTextView9;
        this.f101032o = view;
    }
}
