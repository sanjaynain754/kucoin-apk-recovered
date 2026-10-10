package p270ft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.kubi.otc.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.s0 */
/* JADX INFO: compiled from: PaymentCommonItemHeaderBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37682s0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final BaseTextView f84612a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f84613b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37682s0 m84953a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BaseTextView baseTextView = (BaseTextView) view;
        return new C37682s0(baseTextView, baseTextView);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37682s0 m84954c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.payment_common_item_header, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84953a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BaseTextView getRoot() {
        return this.f84612a;
    }

    public C37682s0(@NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f84612a = baseTextView;
        this.f84613b = baseTextView2;
    }
}
