package com.kubi.assets.finance;

import android.content.Context;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.google.firebase.messaging.Constants;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$color;
import com.kubi.assets.R$dimen;
import com.kubi.assets.R$font;
import com.kubi.assets.R$id;
import com.kubi.assets.entity.EstimateIncome;
import com.kubi.assets.entity.ProductChildEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcSmallSwitchButton;
import com.kubi.utils.C27017c;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FinanceAutoRenewBinder.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\"\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J(\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0016H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceAutoRenewBinder;", "", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "bindEstimateOrTotal", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/assets/entity/ProductChildEntity;", "bindAutoRenew", "handleToggle", "switch", "Lcom/kubi/resources/widget/KcSmallSwitchButton;", "isChecked", "", "buildRow", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", Constants.ScionAnalytics.PARAM_LABEL, "", "value", "isFirst", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinanceAutoRenewBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceAutoRenewBinder.kt\ncom/kubi/assets/finance/FinanceAutoRenewBinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1878#2,3:134\n*S KotlinDebug\n*F\n+ 1 FinanceAutoRenewBinder.kt\ncom/kubi/assets/finance/FinanceAutoRenewBinder\n*L\n48#1:134,3\n*E\n"})
public final class FinanceAutoRenewBinder {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FinanceAutoRenewBinder f17374a = new FinanceAutoRenewBinder();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f17375b = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.finance.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FinanceAutoRenewBinder.m16616e();
        }
    });

    /* JADX INFO: renamed from: g */
    public static final void m16617g(KcSmallSwitchButton kcSmallSwitchButton, ProductChildEntity productChildEntity, CompoundButton compoundButton, boolean z11) {
        FinanceAutoRenewBinder financeAutoRenewBinder = f17374a;
        Intrinsics.checkNotNull(kcSmallSwitchButton);
        financeAutoRenewBinder.m16622k(kcSmallSwitchButton, productChildEntity, z11);
    }

    /* JADX INFO: renamed from: f */
    public final void m16618f(@NotNull BaseViewHolder helper, @Nullable final ProductChildEntity productChildEntity) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        boolean z11 = false;
        boolean z12 = productChildEntity != null && productChildEntity.isProductRelock();
        BaseViewHolder gone = helper.setGone(R$id.tvAutoRenewName, z12);
        int i11 = R$id.autoRenewSwitch;
        gone.setGone(i11, z12);
        if (z12) {
            final KcSmallSwitchButton kcSmallSwitchButton = (KcSmallSwitchButton) helper.getView(i11);
            kcSmallSwitchButton.setOnCheckedChangeListener(null);
            if (productChildEntity != null && productChildEntity.isUserRelock()) {
                z11 = true;
            }
            kcSmallSwitchButton.setChecked(z11);
            kcSmallSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.assets.finance.d
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                    FinanceAutoRenewBinder.m16617g(kcSmallSwitchButton, productChildEntity, compoundButton, z13);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m16619h(@NotNull BaseViewHolder helper, @Nullable ProductChildEntity productChildEntity) {
        List<Pair<String, String>> estimateOrTotalItems;
        List<EstimateIncome> estimateIncomes;
        Intrinsics.checkNotNullParameter(helper, "helper");
        int i11 = R$id.llEstimateContainer;
        LinearLayout linearLayout = (LinearLayout) helper.getView(i11);
        boolean z11 = (productChildEntity == null || (estimateIncomes = productChildEntity.getEstimateIncomes()) == null || !(estimateIncomes.isEmpty() ^ true)) ? false : true;
        helper.setGone(i11, z11);
        linearLayout.removeAllViews();
        if (z11) {
            helper.setGone(R$id.tvRevenueName, false).setGone(R$id.tvRevenue, false);
            if (productChildEntity == null || (estimateOrTotalItems = productChildEntity.getEstimateOrTotalItems()) == null) {
                return;
            }
            int i12 = 0;
            for (Object obj : estimateOrTotalItems) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                FinanceAutoRenewBinder financeAutoRenewBinder = f17374a;
                Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                linearLayout.addView(financeAutoRenewBinder.m16620i(context, (String) pair.getFirst(), (String) pair.getSecond(), i12 == 0));
                i12 = i13;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final LinearLayout m16620i(Context context, String str, String str2, boolean z11) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C27017c c27017c = C27017c.f54310a;
        layoutParams.topMargin = c27017c.m66513b().getResources().getDimensionPixelSize(R$dimen.spacing_10);
        linearLayout.setLayoutParams(layoutParams);
        BaseTextView baseTextView = new BaseTextView(context);
        baseTextView.setText(str);
        baseTextView.setTextColor(c27017c.m66512a(R$color.c_text40));
        baseTextView.setTextSize(14.0f);
        baseTextView.setTypeface(ResourcesCompat.getFont(context, R$font.regular));
        baseTextView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        BaseTextView baseTextView2 = new BaseTextView(context);
        baseTextView2.setText(str2);
        baseTextView2.setTextColor(c27017c.m66512a(R$color.brandGreen));
        baseTextView2.setTextSize(14.0f);
        baseTextView2.setGravity(GravityCompat.END);
        baseTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(baseTextView);
        linearLayout.addView(baseTextView2);
        return linearLayout;
    }

    /* JADX INFO: renamed from: j */
    public final AssetV2Api m16621j() {
        return (AssetV2Api) f17375b.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m16622k(KcSmallSwitchButton kcSmallSwitchButton, ProductChildEntity productChildEntity, boolean z11) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        String id2 = productChildEntity != null ? productChildEntity.getId() : null;
        if (id2 == null || id2.length() == 0 || (lifecycleOwner = ViewTreeLifecycleOwner.get(kcSmallSwitchButton)) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        C41696j.m91104d(lifecycleScope, null, null, new FinanceAutoRenewBinder$handleToggle$1(id2, z11, productChildEntity, kcSmallSwitchButton, null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public static final AssetV2Api m16616e() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }
}
