package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.h0 */
/* JADX INFO: compiled from: AssetFilterOptionsDialogBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44777h0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100010a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f100011b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f100012c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f100013d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100014e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44777h0 m99070a(@NonNull View view) {
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.tvConfirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.tvReset;
                KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton2 != null) {
                    i11 = R$id.tvTitle;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        return new C44777h0((LinearLayout) view, recyclerView, kcPrimaryButton, kcPrimaryButton2, baseTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f100010a;
    }

    public C44777h0(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull BaseTextView baseTextView) {
        this.f100010a = linearLayout;
        this.f100011b = recyclerView;
        this.f100012c = kcPrimaryButton;
        this.f100013d = kcPrimaryButton2;
        this.f100014e = baseTextView;
    }
}
