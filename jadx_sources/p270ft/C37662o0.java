package p270ft;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;

/* JADX INFO: renamed from: ft.o0 */
/* JADX INFO: compiled from: PaymentActivityFastTradeBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37662o0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84346a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FragmentContainerView f84347b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f84348c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f84349d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f84350e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f84351f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FrameLayout f84352g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f84353h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f84354i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final View f84355j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37662o0 m84908a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.fragmentContainer;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
        if (fragmentContainerView != null) {
            i11 = R$id.ivBack;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.ivCoupons;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.ivHistory;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView2 != null) {
                        i11 = R$id.layoutContent;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout != null) {
                            i11 = R$id.layoutTab;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                            if (frameLayout != null) {
                                i11 = R$id.tvBuy;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView != null) {
                                    i11 = R$id.tvSell;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewBar))) != null) {
                                        return new C37662o0((ConstraintLayout) view, fragmentContainerView, imageView, appCompatImageView, imageView2, constraintLayout, frameLayout, textView, textView2, viewFindChildViewById);
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
        return this.f84346a;
    }

    public C37662o0(@NonNull ConstraintLayout constraintLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull ImageView imageView, @NonNull AppCompatImageView appCompatImageView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view) {
        this.f84346a = constraintLayout;
        this.f84347b = fragmentContainerView;
        this.f84348c = imageView;
        this.f84349d = appCompatImageView;
        this.f84350e = imageView2;
        this.f84351f = constraintLayout2;
        this.f84352g = frameLayout;
        this.f84353h = textView;
        this.f84354i = textView2;
        this.f84355j = view;
    }
}
