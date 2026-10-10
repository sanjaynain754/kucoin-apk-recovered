package t20;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.b0 */
/* JADX INFO: compiled from: FragmentLayoutToggleSymbolsBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44631b0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f98975a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f98976b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f98977c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f98978d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f98979e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f98980f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f98981g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f98982h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f98983i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f98984j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final LinearLayout f98985k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final FrameLayout f98986l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final RecyclerView f98987m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final RecyclerView f98988n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final RecyclerView f98989o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f98990p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f98991q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f98992r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f98993s;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44631b0 m98740a(@NonNull View view) {
        int i11 = R$id.empty_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.empty_tips;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.fl_change_rate;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.fl_price;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout2 != null) {
                        i11 = R$id.iv_change_rate;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView2 != null) {
                            i11 = R$id.iv_name;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView3 != null) {
                                i11 = R$id.iv_price;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                if (imageView4 != null) {
                                    i11 = R$id.ll_empty;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout3 != null) {
                                        i11 = R$id.ll_name;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayout4 != null) {
                                            i11 = R$id.ll_recommend_favor;
                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                            if (linearLayout5 != null) {
                                                i11 = R$id.ll_sort;
                                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                if (frameLayout != null) {
                                                    i11 = R$id.recycler_view;
                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                                    if (recyclerView != null) {
                                                        i11 = R$id.rv_quotes;
                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                                        if (recyclerView2 != null) {
                                                            i11 = R$id.rv_reco_favor;
                                                            RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                                            if (recyclerView3 != null) {
                                                                i11 = R$id.tv_add_fav;
                                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView2 != null) {
                                                                    i11 = R$id.tv_login;
                                                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView3 != null) {
                                                                        i11 = R$id.tv_sort_change_rate;
                                                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView4 != null) {
                                                                            i11 = R$id.tv_sort_price;
                                                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView5 != null) {
                                                                                return new C44631b0((FrameLayout) view, imageView, baseTextView, linearLayout, linearLayout2, imageView2, imageView3, imageView4, linearLayout3, linearLayout4, linearLayout5, frameLayout, recyclerView, recyclerView2, recyclerView3, baseTextView2, baseTextView3, baseTextView4, baseTextView5);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f98975a;
    }

    public C44631b0(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull FrameLayout frameLayout2, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull RecyclerView recyclerView3, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5) {
        this.f98975a = frameLayout;
        this.f98976b = imageView;
        this.f98977c = baseTextView;
        this.f98978d = linearLayout;
        this.f98979e = linearLayout2;
        this.f98980f = imageView2;
        this.f98981g = imageView3;
        this.f98982h = imageView4;
        this.f98983i = linearLayout3;
        this.f98984j = linearLayout4;
        this.f98985k = linearLayout5;
        this.f98986l = frameLayout2;
        this.f98987m = recyclerView;
        this.f98988n = recyclerView2;
        this.f98989o = recyclerView3;
        this.f98990p = baseTextView2;
        this.f98991q = baseTextView3;
        this.f98992r = baseTextView4;
        this.f98993s = baseTextView5;
    }
}
