package c60;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.transfer.lib.R$id;

/* JADX INFO: renamed from: c60.i */
/* JADX INFO: compiled from: BtransferViewTransferCoinPairBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C4855i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f5000a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CoinAvatarView f5001b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CoinAvatarView f5002c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeConstraintLayout f5003d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeConstraintLayout f5004e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f5005f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f5006g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f5007h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f5008i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f5009j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4855i m4985a(@NonNull View view) {
        int i11 = R$id.ivBaseCoinIcon;
        CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
        if (coinAvatarView != null) {
            i11 = R$id.ivQuoteCoinIcon;
            CoinAvatarView coinAvatarView2 = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
            if (coinAvatarView2 != null) {
                i11 = R$id.layoutBaseCoin;
                ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (shapeConstraintLayout != null) {
                    i11 = R$id.layoutQuoteCoin;
                    ShapeConstraintLayout shapeConstraintLayout2 = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (shapeConstraintLayout2 != null) {
                        i11 = R$id.tvAvailableTitle;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView != null) {
                            i11 = R$id.tvBaseAmount;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView2 != null) {
                                i11 = R$id.tvBaseCoinName;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView3 != null) {
                                    i11 = R$id.tvQuoteAmount;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView4 != null) {
                                        i11 = R$id.tvQuoteCoinName;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView5 != null) {
                                            return new C4855i(view, coinAvatarView, coinAvatarView2, shapeConstraintLayout, shapeConstraintLayout2, textView, textView2, textView3, textView4, textView5);
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
    public View getRoot() {
        return this.f5000a;
    }

    public C4855i(@NonNull View view, @NonNull CoinAvatarView coinAvatarView, @NonNull CoinAvatarView coinAvatarView2, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull ShapeConstraintLayout shapeConstraintLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f5000a = view;
        this.f5001b = coinAvatarView;
        this.f5002c = coinAvatarView2;
        this.f5003d = shapeConstraintLayout;
        this.f5004e = shapeConstraintLayout2;
        this.f5005f = textView;
        this.f5006g = textView2;
        this.f5007h = textView3;
        this.f5008i = textView4;
        this.f5009j = textView5;
    }
}
