package fj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.main.shimmer.NavigationShimmerLayout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: fj.v0 */
/* JADX INFO: compiled from: KucoinLayoutHomeNavigationBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C37550v0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f83434a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f83435b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f83436c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f83437d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f83438e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f83439f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f83440g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f83441h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ImageView f83442i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ImageView f83443j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ImageView f83444k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final FrameLayout f83445l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final LinearLayoutCompat f83446m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f83447n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final NavigationShimmerLayout f83448o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final C37552w0 f83449p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final View f83450q;

    public C37550v0(@NonNull FrameLayout frameLayout, @NonNull BaseTextView baseTextView, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull FrameLayout frameLayout3, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView2, @NonNull NavigationShimmerLayout navigationShimmerLayout, @NonNull C37552w0 c37552w0, @NonNull View view) {
        this.f83434a = frameLayout;
        this.f83435b = baseTextView;
        this.f83436c = frameLayout2;
        this.f83437d = imageView;
        this.f83438e = imageView2;
        this.f83439f = imageView3;
        this.f83440g = imageView4;
        this.f83441h = imageView5;
        this.f83442i = imageView6;
        this.f83443j = imageView7;
        this.f83444k = imageView8;
        this.f83445l = frameLayout3;
        this.f83446m = linearLayoutCompat;
        this.f83447n = baseTextView2;
        this.f83448o = navigationShimmerLayout;
        this.f83449p = c37552w0;
        this.f83450q = view;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37550v0 m84572a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.et_search;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.flAvatar;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.ivAvatar;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.ivAvatarMask;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView2 != null) {
                        i11 = R$id.iv_customer;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView3 != null) {
                            i11 = R$id.iv_customer_service;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView4 != null) {
                                i11 = R$id.iv_kucoin_pay;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                if (imageView5 != null) {
                                    i11 = R$id.ivKycStatus;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                    if (imageView6 != null) {
                                        i11 = R$id.iv_massage;
                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                        if (imageView7 != null) {
                                            i11 = R$id.iv_qr_code;
                                            ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                            if (imageView8 != null) {
                                                i11 = R$id.layoutAvatar;
                                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                if (frameLayout2 != null) {
                                                    i11 = R$id.layoutContent;
                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                    if (linearLayoutCompat != null) {
                                                        i11 = R$id.mLeftText;
                                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView2 != null) {
                                                            i11 = R$id.navigationShimmer;
                                                            NavigationShimmerLayout navigationShimmerLayout = (NavigationShimmerLayout) ViewBindings.findChildViewById(view, i11);
                                                            if (navigationShimmerLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.navigationTab))) != null) {
                                                                C37552w0 c37552w0M84577a = C37552w0.m84577a(viewFindChildViewById);
                                                                i11 = R$id.vNavigationBg;
                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
                                                                if (viewFindChildViewById2 != null) {
                                                                    return new C37550v0((FrameLayout) view, baseTextView, frameLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, frameLayout2, linearLayoutCompat, baseTextView2, navigationShimmerLayout, c37552w0M84577a, viewFindChildViewById2);
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
        return this.f83434a;
    }
}
