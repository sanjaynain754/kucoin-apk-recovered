package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.k */
/* JADX INFO: compiled from: AssetCoinDetailHeadViewBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44800k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100263a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f100264b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f100265c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f100266d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100267e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44800k m99119a(@NonNull View view) {
        int i11 = R$id.head_title;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = R$id.total_legal_value;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.total_value;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    return new C44800k(linearLayout, baseTextView, linearLayout, baseTextView2, baseTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f100263a;
    }

    public C44800k(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull LinearLayout linearLayout2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f100263a = linearLayout;
        this.f100264b = baseTextView;
        this.f100265c = linearLayout2;
        this.f100266d = baseTextView2;
        this.f100267e = baseTextView3;
    }
}
