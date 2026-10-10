package l50;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.j */
/* JADX INFO: compiled from: BtradingBotKitFragmentLayoutToggleSymbolsBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42075j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f92949a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f92950b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f92951c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f92952d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f92953e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f92954f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f92955g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f92956h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f92957i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f92958j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final LinearLayout f92959k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final FrameLayout f92960l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final RecyclerView f92961m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final RecyclerView f92962n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final TextView f92963o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final TextView f92964p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final TextView f92965q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final TextView f92966r;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42075j m92301a(@NonNull View view) {
        int i11 = R$id.empty_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.empty_tips;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
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
                                                        i11 = R$id.rv_reco_favor;
                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                                        if (recyclerView2 != null) {
                                                            i11 = R$id.tv_add_fav;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                            if (textView2 != null) {
                                                                i11 = R$id.tv_login;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                if (textView3 != null) {
                                                                    i11 = R$id.tv_sort_change_rate;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (textView4 != null) {
                                                                        i11 = R$id.tv_sort_price;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (textView5 != null) {
                                                                            return new C42075j((FrameLayout) view, imageView, textView, linearLayout, linearLayout2, imageView2, imageView3, imageView4, linearLayout3, linearLayout4, linearLayout5, frameLayout, recyclerView, recyclerView2, textView2, textView3, textView4, textView5);
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
        return this.f92949a;
    }

    public C42075j(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull FrameLayout frameLayout2, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f92949a = frameLayout;
        this.f92950b = imageView;
        this.f92951c = textView;
        this.f92952d = linearLayout;
        this.f92953e = linearLayout2;
        this.f92954f = imageView2;
        this.f92955g = imageView3;
        this.f92956h = imageView4;
        this.f92957i = linearLayout3;
        this.f92958j = linearLayout4;
        this.f92959k = linearLayout5;
        this.f92960l = frameLayout2;
        this.f92961m = recyclerView;
        this.f92962n = recyclerView2;
        this.f92963o = textView2;
        this.f92964p = textView3;
        this.f92965q = textView4;
        this.f92966r = textView5;
    }
}
