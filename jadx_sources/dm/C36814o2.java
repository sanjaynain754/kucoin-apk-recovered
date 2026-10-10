package dm;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.o2 */
/* JADX INFO: compiled from: BkumexFragmentKlineMainBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36814o2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f80722a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f80723b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f80724c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f80725d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f80726e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f80727f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f80728g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayoutCompat f80729h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayoutCompat f80730i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RecyclerView f80731j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80732k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f80733l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36814o2 m82489a(@NonNull View view) {
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
                                                    return new C36814o2((LinearLayout) view, frameLayout, imageView, imageView2, imageView3, imageView4, linearLayout, linearLayoutCompat, linearLayoutCompat2, recyclerView, baseTextView, baseTextView2);
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
        return this.f80722a;
    }

    public C36814o2(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f80722a = linearLayout;
        this.f80723b = frameLayout;
        this.f80724c = imageView;
        this.f80725d = imageView2;
        this.f80726e = imageView3;
        this.f80727f = imageView4;
        this.f80728g = linearLayout2;
        this.f80729h = linearLayoutCompat;
        this.f80730i = linearLayoutCompat2;
        this.f80731j = recyclerView;
        this.f80732k = baseTextView;
        this.f80733l = baseTextView2;
    }
}
