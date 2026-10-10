package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.trade.submit.panel.view.twap.TwapAdvanceSettingView;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;

/* JADX INFO: renamed from: dm.w4 */
/* JADX INFO: compiled from: BkumexViewTwapAdvanceSettingBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36864w4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81294a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TwapAdvanceSettingView f81295b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36864w4 m82593a(@NonNull View view) {
        int i11 = R$id.twapAdvanceSettingView;
        TwapAdvanceSettingView twapAdvanceSettingViewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (twapAdvanceSettingViewFindChildViewById != null) {
            return new C36864w4((ConstraintLayout) view, twapAdvanceSettingViewFindChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36864w4 m82594c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_view_twap_advance_setting, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82593a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81294a;
    }

    public C36864w4(@NonNull ConstraintLayout constraintLayout, @NonNull TwapAdvanceSettingView twapAdvanceSettingView) {
        this.f81294a = constraintLayout;
        this.f81295b = twapAdvanceSettingView;
    }
}
