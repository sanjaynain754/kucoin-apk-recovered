package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.m4 */
/* JADX INFO: compiled from: KucoinFragmentDepositLayoutSubscriptBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44820m4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f100461a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f100462b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f100463c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f100464d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44820m4 m99164a(@NonNull View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i11 = R$id.tv_setup_notice;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tv_tip;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                return new C44820m4(linearLayoutCompat, linearLayoutCompat, baseTextView, baseTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f100461a;
    }

    public C44820m4(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f100461a = linearLayoutCompat;
        this.f100462b = linearLayoutCompat2;
        this.f100463c = baseTextView;
        this.f100464d = baseTextView2;
    }
}
