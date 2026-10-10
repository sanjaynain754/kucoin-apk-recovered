package fj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;

/* JADX INFO: renamed from: fj.d */
/* JADX INFO: compiled from: HomeCardBuyCryptoLargeBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37513d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f83230a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f83231b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f83232c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37513d m84484a(@NonNull View view) {
        int i11 = R$id.summary;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
        if (textView != null) {
            i11 = R$id.title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView2 != null) {
                return new C37513d((LinearLayoutCompat) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37513d m84485c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.home_card_buy_crypto_large, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84484a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f83230a;
    }

    public C37513d(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f83230a = linearLayoutCompat;
        this.f83231b = textView;
        this.f83232c = textView2;
    }
}
