package p270ft;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.c0 */
/* JADX INFO: compiled from: BotcFragmentReceivedWayBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37602c0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f83734a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f83735b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f83736c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f83737d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f83738e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f83739f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37602c0 m84787a(@NonNull View view) {
        int i11 = R$id.btn_add;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.ll_name;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.rcv_list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.tv_name;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.verify_name;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            return new C37602c0((LinearLayout) view, kcPrimaryButton, linearLayout, recyclerView, baseTextView, baseTextView2);
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
    public LinearLayout getRoot() {
        return this.f83734a;
    }

    public C37602c0(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f83734a = linearLayout;
        this.f83735b = kcPrimaryButton;
        this.f83736c = linearLayout2;
        this.f83737d = recyclerView;
        this.f83738e = baseTextView;
        this.f83739f = baseTextView2;
    }
}
