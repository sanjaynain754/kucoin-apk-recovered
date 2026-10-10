package p206dp;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dp.u */
/* JADX INFO: compiled from: BmarginFragmentKlineMainBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36941u implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81984a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f81985b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f81986c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f81987d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f81988e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f81989f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f81990g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayoutCompat f81991h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayoutCompat f81992i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RecyclerView f81993j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f81994k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f81995l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36941u m82751a(@NonNull View view) {
        int i11 = R$id.fl_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.iv_full_screen;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.iv_kline_settings;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null) {
                    i11 = R$id.ivTabQuota;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView3 != null) {
                        i11 = R$id.ivTabTime;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView4 != null) {
                            i11 = R$id.llAction;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                i11 = R$id.llTabQuota;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                if (linearLayoutCompat != null) {
                                    i11 = R$id.llTabTime;
                                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayoutCompat2 != null) {
                                        i11 = R$id.recyclerView;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                        if (recyclerView != null) {
                                            i11 = R$id.tvTabQuota;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tvTabTime;
                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView2 != null) {
                                                    return new C36941u((LinearLayout) view, frameLayout, imageView, imageView2, imageView3, imageView4, linearLayout, linearLayoutCompat, linearLayoutCompat2, recyclerView, baseTextView, baseTextView2);
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
        return this.f81984a;
    }

    public C36941u(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f81984a = linearLayout;
        this.f81985b = frameLayout;
        this.f81986c = imageView;
        this.f81987d = imageView2;
        this.f81988e = imageView3;
        this.f81989f = imageView4;
        this.f81990g = linearLayout2;
        this.f81991h = linearLayoutCompat;
        this.f81992i = linearLayoutCompat2;
        this.f81993j = recyclerView;
        this.f81994k = baseTextView;
        this.f81995l = baseTextView2;
    }
}
