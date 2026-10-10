package c60;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.transfer.lib.R$id;

/* JADX INFO: renamed from: c60.h */
/* JADX INFO: compiled from: BtransferViewTransferCoinBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C4854h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f4993a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f4994b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CoinAvatarView f4995c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeConstraintLayout f4996d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f4997e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f4998f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f4999g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4854h m4984a(@NonNull View view) {
        int i11 = R$id.ivArrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ivCoinIcon;
            CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
            if (coinAvatarView != null) {
                i11 = R$id.layoutCoin;
                ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (shapeConstraintLayout != null) {
                    i11 = R$id.tvAvailableTitle;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvCoinFullName;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvCoinName;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                return new C4854h(view, imageView, coinAvatarView, shapeConstraintLayout, baseTextView, baseTextView2, baseTextView3);
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
        return this.f4993a;
    }

    public C4854h(@NonNull View view, @NonNull ImageView imageView, @NonNull CoinAvatarView coinAvatarView, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f4993a = view;
        this.f4994b = imageView;
        this.f4995c = coinAvatarView;
        this.f4996d = shapeConstraintLayout;
        this.f4997e = baseTextView;
        this.f4998f = baseTextView2;
        this.f4999g = baseTextView3;
    }
}
