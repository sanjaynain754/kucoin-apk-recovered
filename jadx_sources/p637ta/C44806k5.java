package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.view.LabelView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;

/* JADX INFO: renamed from: ta.k5 */
/* JADX INFO: compiled from: KucoinViewWithdrawHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44806k5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100304a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ShapeConstraintLayout f100305b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f100306c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CoinAvatarView f100307d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LabelView f100308e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100309f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100310g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100311h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44806k5 m99132a(@NonNull View view) {
        int i11 = R$id.cl_content;
        ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (shapeConstraintLayout != null) {
            i11 = R$id.iv_arrow;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.iv_trade_icon;
                CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
                if (coinAvatarView != null) {
                    i11 = R$id.tv_header_suspend;
                    LabelView labelView = (LabelView) ViewBindings.findChildViewById(view, i11);
                    if (labelView != null) {
                        i11 = R$id.tv_trade_name;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_trade_pair;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tv_withdraw_title;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    return new C44806k5((ConstraintLayout) view, shapeConstraintLayout, imageView, coinAvatarView, labelView, baseTextView, baseTextView2, baseTextView3);
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
        return this.f100304a;
    }

    public C44806k5(@NonNull ConstraintLayout constraintLayout, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull ImageView imageView, @NonNull CoinAvatarView coinAvatarView, @NonNull LabelView labelView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f100304a = constraintLayout;
        this.f100305b = shapeConstraintLayout;
        this.f100306c = imageView;
        this.f100307d = coinAvatarView;
        this.f100308e = labelView;
        this.f100309f = baseTextView;
        this.f100310g = baseTextView2;
        this.f100311h = baseTextView3;
    }
}
