package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.h */
/* JADX INFO: compiled from: AssetAccountBillItemDetailFragmentBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44776h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f100000a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f100001b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f100002c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f100003d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100004e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100005f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100006g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100007h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f100008i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f100009j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44776h m99068a(@NonNull View view) {
        int i11 = R$id.amountLayout;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
        if (linearLayoutCompat != null) {
            i11 = R$id.icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.tvAmount;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvCurrencyName;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tvDirection;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.tvFee;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.tvRemark;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.tvTime;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null) {
                                        i11 = R$id.tvType;
                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView7 != null) {
                                            return new C44776h((LinearLayoutCompat) view, linearLayoutCompat, appCompatImageView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7);
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
    public LinearLayoutCompat getRoot() {
        return this.f100000a;
    }

    public C44776h(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7) {
        this.f100000a = linearLayoutCompat;
        this.f100001b = linearLayoutCompat2;
        this.f100002c = appCompatImageView;
        this.f100003d = baseTextView;
        this.f100004e = baseTextView2;
        this.f100005f = baseTextView3;
        this.f100006g = baseTextView4;
        this.f100007h = baseTextView5;
        this.f100008i = baseTextView6;
        this.f100009j = baseTextView7;
    }
}
