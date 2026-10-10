package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.k4 */
/* JADX INFO: compiled from: KucoinFragmentDepositLayoutDisableBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44805k4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f100301a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f100302b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f100303c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44805k4 m99130a(@NonNull View view) {
        int i11 = R$id.chain_disable_tip;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        return new C44805k4(linearLayoutCompat, baseTextView, linearLayoutCompat);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f100301a;
    }

    public C44805k4(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.f100301a = linearLayoutCompat;
        this.f100302b = baseTextView;
        this.f100303c = linearLayoutCompat2;
    }
}
