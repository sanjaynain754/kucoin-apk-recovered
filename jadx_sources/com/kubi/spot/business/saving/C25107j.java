package com.kubi.spot.business.saving;

import android.content.DialogInterface;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.DashTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.business.holder.BaseOrderHolder;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.business.saving.j */
/* JADX INFO: compiled from: SavingBizExt.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001e\u0010\f\u001a\u00020\b*\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"DEFAULT_DISPLAY_BALANCE", "", "getAvailableBalance", "Ljava/math/BigDecimal;", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "orderHolder", "Lcom/kubi/spot/business/holder/BaseOrderHolder;", "showAvailSavingDialog", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "showSavingDescriptionDialog", "updateAvailableTitleUI", "Landroid/widget/TextView;", C33954u6.f72238i, "fragment", "Lcom/kubi/sdk/BaseFragment;", "SpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C25107j {
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final BigDecimal m61325e(@NotNull CurrencyBalance currencyBalance, @NotNull BaseOrderHolder orderHolder) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        Intrinsics.checkNotNullParameter(orderHolder, "orderHolder");
        SavingConfig savingConfig = SavingConfig.f50323a;
        if (!savingConfig.m61340h()) {
            return currencyBalance.getAvailableBalanceCompat();
        }
        if (!savingConfig.m61342j(orderHolder)) {
            return currencyBalance.getAvailableBalanceCompat();
        }
        BigDecimal availableBalanceCompat = currencyBalance.getAvailableBalanceCompat();
        if (availableBalanceCompat == null) {
            return null;
        }
        BigDecimal bigDecimalM61301n = SavingCacheManager.f50304a.m61301n(currencyBalance.getCurrency());
        if (bigDecimalM61301n == null) {
            bigDecimalM61301n = BigDecimal.ZERO;
        }
        return availableBalanceCompat.add(bigDecimalM61301n);
    }

    /* JADX INFO: renamed from: f */
    public static final void m61326f(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(C27017c.f54310a.m66516f(R$string.kc_trade_saving_max_value, "2")).m54153J4(R$string.kc_trade_saving_tip).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.spot.business.saving.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C25107j.m61327g(dialogInterface, i11);
            }
        }).show(fragmentManager, "showAvailSavingDialog");
    }

    /* JADX INFO: renamed from: h */
    public static final void m61328h(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kc_trade_saving).m54148E4(R$layout.bkucoin_saving_description_content, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.spot.business.saving.i
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                C25107j.m61329i(baseViewHolder, dialogFragmentHelper);
            }
        }).m54162S4(R$string.i_already_know, null).show(fragmentManager, "showSavingDescriptionDialog");
    }

    /* JADX INFO: renamed from: i */
    public static final void m61329i(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "<unused var>");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
    }

    /* JADX INFO: renamed from: j */
    public static final void m61330j(@Nullable TextView textView, @NotNull BaseOrderHolder holder, @NotNull final BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (textView == null) {
            return;
        }
        boolean zM61342j = SavingConfig.f50323a.m61342j(holder);
        if (textView instanceof DashTextView) {
            ((DashTextView) textView).setNeedDash(zM61342j);
        }
        if (zM61342j) {
            textView.setText(textView.getContext().getString(R$string.kc_trade_saving_max_value, "2"));
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.spot.business.saving.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C25107j.m61331k(fragment);
                }
            }, 1, null);
        } else {
            textView.setText(R$string.app_available_abb);
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.spot.business.saving.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C25107j.m61332l();
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m61332l() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final void m61327g(DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m61331k(BaseFragment baseFragment) {
        if (baseFragment.isAdded()) {
            FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            m61326f(childFragmentManager);
        }
        return Unit.INSTANCE;
    }
}
