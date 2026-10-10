package p270ft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.kubi.otc.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.g0 */
/* JADX INFO: compiled from: CommonPaymentTitleItemLayoutBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37622g0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final BaseTextView f83901a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f83902b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37622g0 m84824a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BaseTextView baseTextView = (BaseTextView) view;
        return new C37622g0(baseTextView, baseTextView);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37622g0 m84825c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.common_payment_title_item_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84824a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BaseTextView getRoot() {
        return this.f83901a;
    }

    public C37622g0(@NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f83901a = baseTextView;
        this.f83902b = baseTextView2;
    }
}
