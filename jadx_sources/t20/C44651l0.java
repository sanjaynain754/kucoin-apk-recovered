package t20;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.l0 */
/* JADX INFO: compiled from: KucoinFragmentKlineMainBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44651l0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99187a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f99188b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f99189c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f99190d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f99191e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f99192f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f99193g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayoutCompat f99194h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayoutCompat f99195i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RecyclerView f99196j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99197k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f99198l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44651l0 m98778a(@NonNull View view) {
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
                                                    return new C44651l0((LinearLayout) view, frameLayout, imageView, imageView2, imageView3, imageView4, linearLayout, linearLayoutCompat, linearLayoutCompat2, recyclerView, baseTextView, baseTextView2);
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
        return this.f99187a;
    }

    public C44651l0(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f99187a = linearLayout;
        this.f99188b = frameLayout;
        this.f99189c = imageView;
        this.f99190d = imageView2;
        this.f99191e = imageView3;
        this.f99192f = imageView4;
        this.f99193g = linearLayout2;
        this.f99194h = linearLayoutCompat;
        this.f99195i = linearLayoutCompat2;
        this.f99196j = recyclerView;
        this.f99197k = baseTextView;
        this.f99198l = baseTextView2;
    }
}
