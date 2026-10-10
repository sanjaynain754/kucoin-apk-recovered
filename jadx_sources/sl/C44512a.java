package sl;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kucoin.market.monitor.lib.R$id;

/* JADX INFO: renamed from: sl.a */
/* JADX INFO: compiled from: FloatingWindowCurrencySettingLayoutBinding.java */
/* JADX INFO: loaded from: classes19.dex */
public final class C44512a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f98580a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f98581b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f98582c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f98583d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f98584e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f98585f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f98586g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44512a m98484a(@NonNull View view) {
        int i11 = R$id.add;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
        if (textView != null) {
            i11 = R$id.empty_currency_layout;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.listview;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView2 != null) {
                        i11 = R$id.sort;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView3 != null) {
                            i11 = R$id.top;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView4 != null) {
                                return new C44512a((LinearLayoutCompat) view, textView, linearLayoutCompat, recyclerView, textView2, textView3, textView4);
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
    public LinearLayoutCompat getRoot() {
        return this.f98580a;
    }

    public C44512a(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextView textView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull RecyclerView recyclerView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f98580a = linearLayoutCompat;
        this.f98581b = textView;
        this.f98582c = linearLayoutCompat2;
        this.f98583d = recyclerView;
        this.f98584e = textView2;
        this.f98585f = textView3;
        this.f98586g = textView4;
    }
}
