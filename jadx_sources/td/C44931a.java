package td;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.core.view.GravityCompat;
import com.google.android.material.navigation.NavigationBarView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import v30.C45379e0;
import v30.C45389j0;

/* JADX INFO: renamed from: td.a */
/* JADX INFO: compiled from: DelegationItemLayoutHelper.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\t\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\rJ\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/core/biz/order/helper/DelegationItemLayoutHelper;", "", "<init>", "()V", "updateNormalValueTextLayout", "", "binding", "Lcom/kubi/tradecorebiz/databinding/KucoinItemDelegationViewSingleBinding;", "updateAdvanceValueTextLayout", "updateValueTextGravity", "Landroid/view/View;", "gravity", "", "Lcom/kubi/tradecorebiz/databinding/TradeCoreItemDelegationViewSingleListBinding;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44931a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44931a f101319a = new C44931a();

    /* JADX INFO: renamed from: a */
    public final void m99351a(@NotNull C45379e0 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        ShowHideTextView tvDealPercent = binding.f102059h;
        Intrinsics.checkNotNullExpressionValue(tvDealPercent, "tvDealPercent");
        ViewExtKt.m66577h(tvDealPercent);
        ProgressBar delegationProgressbar = binding.f102053b;
        Intrinsics.checkNotNullExpressionValue(delegationProgressbar, "delegationProgressbar");
        ViewExtKt.m66577h(delegationProgressbar);
        binding.f102058g.setGravity(8388629);
        binding.f102060i.setGravity(8388629);
        C44931a c44931a = f101319a;
        ShowHideTextView tvLimitPrice = binding.f102063l;
        Intrinsics.checkNotNullExpressionValue(tvLimitPrice, "tvLimitPrice");
        c44931a.m99355e(tvLimitPrice, GravityCompat.END);
        ShowHideTextView tvTriggerPrice = binding.f102068q;
        Intrinsics.checkNotNullExpressionValue(tvTriggerPrice, "tvTriggerPrice");
        c44931a.m99355e(tvTriggerPrice, GravityCompat.END);
    }

    /* JADX INFO: renamed from: b */
    public final void m99352b(@NotNull C45389j0 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        ProgressBar delegationProgressbar = binding.f102157b;
        Intrinsics.checkNotNullExpressionValue(delegationProgressbar, "delegationProgressbar");
        ViewExtKt.m66577h(delegationProgressbar);
        ShowHideTextView tvDealPercent = binding.f102163h;
        Intrinsics.checkNotNullExpressionValue(tvDealPercent, "tvDealPercent");
        ViewExtKt.m66577h(tvDealPercent);
        binding.f102162g.setGravity(8388629);
        binding.f102167l.setGravity(8388629);
        binding.f102172q.setGravity(8388629);
        binding.f102164i.setGravity(8388629);
    }

    /* JADX INFO: renamed from: c */
    public final void m99353c(@NotNull C45379e0 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        ProgressBar delegationProgressbar = binding.f102053b;
        Intrinsics.checkNotNullExpressionValue(delegationProgressbar, "delegationProgressbar");
        ViewExtKt.m66594y(delegationProgressbar);
        binding.f102058g.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        binding.f102060i.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        C44931a c44931a = f101319a;
        ShowHideTextView tvLimitPrice = binding.f102063l;
        Intrinsics.checkNotNullExpressionValue(tvLimitPrice, "tvLimitPrice");
        c44931a.m99355e(tvLimitPrice, GravityCompat.START);
        ShowHideTextView tvTriggerPrice = binding.f102068q;
        Intrinsics.checkNotNullExpressionValue(tvTriggerPrice, "tvTriggerPrice");
        c44931a.m99355e(tvTriggerPrice, GravityCompat.START);
    }

    /* JADX INFO: renamed from: d */
    public final void m99354d(@NotNull C45389j0 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        ProgressBar delegationProgressbar = binding.f102157b;
        Intrinsics.checkNotNullExpressionValue(delegationProgressbar, "delegationProgressbar");
        ViewExtKt.m66594y(delegationProgressbar);
        binding.f102162g.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        binding.f102167l.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        binding.f102172q.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        binding.f102164i.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
    }

    /* JADX INFO: renamed from: e */
    public final void m99355e(View view, int i11) {
        FrameLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams3 = null;
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.gravity = i11;
            layoutParams3 = layoutParams;
        }
        view.setLayoutParams(layoutParams3);
    }
}
