package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.c */
/* JADX INFO: compiled from: AssetAccountBillFinanceFilterBarBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44736c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f99651a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f99652b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f99653c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99654d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99655e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44736c m98982a(@NonNull View view) {
        int i11 = R$id.selectCoin;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.selectProductType;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.selectTime;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.selectType;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        return new C44736c((LinearLayoutCompat) view, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
        return this.f99651a;
    }

    public C44736c(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f99651a = linearLayoutCompat;
        this.f99652b = baseTextView;
        this.f99653c = baseTextView2;
        this.f99654d = baseTextView3;
        this.f99655e = baseTextView4;
    }
}
