package l50;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradingbotkit.R$layout;

/* JADX INFO: renamed from: l50.r0 */
/* JADX INFO: compiled from: BtradingBotKitStrategyListTopCategoryItemBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42092r0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final BaseTextView f93256a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f93257b;

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C42092r0 m92338c(@NonNull LayoutInflater layoutInflater) {
        return m92339d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42092r0 m92337a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BaseTextView baseTextView = (BaseTextView) view;
        return new C42092r0(baseTextView, baseTextView);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C42092r0 m92339d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.btrading_bot_kit_strategy_list_top_category_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m92337a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BaseTextView getRoot() {
        return this.f93256a;
    }

    public C42092r0(@NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f93256a = baseTextView;
        this.f93257b = baseTextView2;
    }
}
