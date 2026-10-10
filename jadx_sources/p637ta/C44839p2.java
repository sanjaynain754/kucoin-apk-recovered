package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcLabelView;

/* JADX INFO: renamed from: ta.p2 */
/* JADX INFO: compiled from: AssetViewOngoingEmptyBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44839p2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final NestedScrollView f100590a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f100591b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f100592c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f100593d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f100594e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f100595f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcLabelView f100596g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100597h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44839p2 m99204a(@NonNull View view) {
        int i11 = R$id.llBot;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
        if (linearLayoutCompat != null) {
            i11 = R$id.llCopyTrading;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat2 != null) {
                i11 = R$id.llFinance;
                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat3 != null) {
                    i11 = R$id.llFutures;
                    LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat4 != null) {
                        i11 = R$id.llMargin;
                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                        if (linearLayoutCompat5 != null) {
                            i11 = R$id.tvCopyTradingMark;
                            KcLabelView kcLabelView = (KcLabelView) ViewBindings.findChildViewById(view, i11);
                            if (kcLabelView != null) {
                                i11 = R$id.tvFinanceName;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    return new C44839p2((NestedScrollView) view, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, kcLabelView, baseTextView);
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
    public NestedScrollView getRoot() {
        return this.f100590a;
    }

    public C44839p2(@NonNull NestedScrollView nestedScrollView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull LinearLayoutCompat linearLayoutCompat5, @NonNull KcLabelView kcLabelView, @NonNull BaseTextView baseTextView) {
        this.f100590a = nestedScrollView;
        this.f100591b = linearLayoutCompat;
        this.f100592c = linearLayoutCompat2;
        this.f100593d = linearLayoutCompat3;
        this.f100594e = linearLayoutCompat4;
        this.f100595f = linearLayoutCompat5;
        this.f100596g = kcLabelView;
        this.f100597h = baseTextView;
    }
}
