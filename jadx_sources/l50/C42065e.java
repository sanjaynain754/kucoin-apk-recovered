package l50;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.tradingbotkit.R$id;
import k00.C40849m;

/* JADX INFO: renamed from: l50.e */
/* JADX INFO: compiled from: BtradingBotKitDialogAvailableAssetsBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42065e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f92632a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcSecondaryButton f92633b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C40849m f92634c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f92635d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f92636e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f92637f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RelativeLayout f92638g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RelativeLayout f92639h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RelativeLayout f92640i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42065e m92281a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.bt_cancel;
        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcSecondaryButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.iv_available_assets_title))) != null) {
            C40849m c40849mM89397a = C40849m.m89397a(viewFindChildViewById);
            i11 = R$id.iv_buy_coins;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.iv_deposit;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null) {
                    i11 = R$id.iv_transfer;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView3 != null) {
                        i11 = R$id.rl_buy_coins;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                        if (relativeLayout != null) {
                            i11 = R$id.rl_deposit;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                            if (relativeLayout2 != null) {
                                i11 = R$id.rl_transfer;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                                if (relativeLayout3 != null) {
                                    return new C42065e((LinearLayout) view, kcSecondaryButton, c40849mM89397a, imageView, imageView2, imageView3, relativeLayout, relativeLayout2, relativeLayout3);
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
        return this.f92632a;
    }

    public C42065e(@NonNull LinearLayout linearLayout, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull C40849m c40849m, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3) {
        this.f92632a = linearLayout;
        this.f92633b = kcSecondaryButton;
        this.f92634c = c40849m;
        this.f92635d = imageView;
        this.f92636e = imageView2;
        this.f92637f = imageView3;
        this.f92638g = relativeLayout;
        this.f92639h = relativeLayout2;
        this.f92640i = relativeLayout3;
    }
}
