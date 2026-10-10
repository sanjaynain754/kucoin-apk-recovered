package v30;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.b0 */
/* JADX INFO: compiled from: KbcoinCoreKlineNtfLayoutBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45373b0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102023a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f102024b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f102025c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C45400p f102026d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RelativeLayout f102027e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f102028f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45373b0 m100276a(@NonNull View view) {
        int i11 = R$id.klineContent;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = R$id.nftContent;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById != null) {
                C45400p c45400pM100337a = C45400p.m100337a(viewFindChildViewById);
                i11 = R$id.nftToggle_spot;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                if (relativeLayout != null) {
                    i11 = R$id.tvNft;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        return new C45373b0(linearLayout, frameLayout, linearLayout, c45400pM100337a, relativeLayout, baseTextView);
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
        return this.f102023a;
    }

    public C45373b0(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout2, @NonNull C45400p c45400p, @NonNull RelativeLayout relativeLayout, @NonNull BaseTextView baseTextView) {
        this.f102023a = linearLayout;
        this.f102024b = frameLayout;
        this.f102025c = linearLayout2;
        this.f102026d = c45400p;
        this.f102027e = relativeLayout;
        this.f102028f = baseTextView;
    }
}
