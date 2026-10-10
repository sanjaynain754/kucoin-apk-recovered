package c70;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.k */
/* JADX INFO: compiled from: BusercenterFragmentPasskeyManagerBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4879k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f5172a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f5173b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f5174c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f5175d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f5176e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f5177f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f5178g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f5179h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RecyclerView f5180i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f5181j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f5182k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f5183l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f5184m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4879k m5037a(@NonNull View view) {
        int i11 = R$id.btnAddPasskey;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.btnCreatePasskey;
            KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton2 != null) {
                i11 = R$id.imgDevice;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.imgFingerPrint;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView2 != null) {
                        i11 = R$id.imgSafe;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView3 != null) {
                            i11 = R$id.llPasskeyEmptyView;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                i11 = R$id.llPasskeyListArea;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout2 != null) {
                                    i11 = R$id.passkeyRecyclerView;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                    if (recyclerView != null) {
                                        i11 = R$id.tvDevice;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.tvFingerPrint;
                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView2 != null) {
                                                i11 = R$id.tvLearnMore;
                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView3 != null) {
                                                    i11 = R$id.tvSafe;
                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView4 != null) {
                                                        return new C4879k((FrameLayout) view, kcPrimaryButton, kcPrimaryButton2, imageView, imageView2, imageView3, linearLayout, linearLayout2, recyclerView, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
        return this.f5172a;
    }

    public C4879k(@NonNull FrameLayout frameLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f5172a = frameLayout;
        this.f5173b = kcPrimaryButton;
        this.f5174c = kcPrimaryButton2;
        this.f5175d = imageView;
        this.f5176e = imageView2;
        this.f5177f = imageView3;
        this.f5178g = linearLayout;
        this.f5179h = linearLayout2;
        this.f5180i = recyclerView;
        this.f5181j = baseTextView;
        this.f5182k = baseTextView2;
        this.f5183l = baseTextView3;
        this.f5184m = baseTextView4;
    }
}
