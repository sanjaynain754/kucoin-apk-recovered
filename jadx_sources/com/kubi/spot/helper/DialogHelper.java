package com.kubi.spot.helper;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.kubi.data.coin.TransferJumper;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.business.holder.BaseOrderHolder;
import com.kubi.spot.business.saving.SavingAvailableDialogHelper;
import com.kubi.spot.business.saving.SavingConfig;
import com.kubi.utils.extensions.C27041f;
import f30.C37340k;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.helper.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DialogHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/spot/helper/DialogHelper;", "", "<init>", "()V", "showDepositTransferDialog", "", "targetCurrency", "", "baseOrderHolder", "Lcom/kubi/spot/business/holder/BaseOrderHolder;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DialogHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DialogHelper f50588a = new DialogHelper();

    /* JADX INFO: renamed from: f */
    public static final Unit m61809f(String str, BaseOrderHolder baseOrderHolder, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        final String str2;
        BaseViewHolder baseViewHolder;
        final DialogFragmentHelper dialogFragmentHelper2;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        if (SavingConfig.f50323a.m61340h()) {
            CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(str));
            str2 = str;
            baseViewHolder = viewHolder;
            dialogFragmentHelper2 = dialogFragmentHelper;
            SavingAvailableDialogHelper.f50315a.m61317e(str2, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null, baseOrderHolder, baseViewHolder, dialogFragmentHelper2);
        } else {
            str2 = str;
            baseViewHolder = viewHolder;
            dialogFragmentHelper2 = dialogFragmentHelper;
        }
        final CoinInfoEntity coinInfoEntityM85613u2 = C37890n.f85269a.m85613u(C27041f.m66668h(str2));
        int i11 = R$id.tvDeposit;
        boolean z11 = true;
        if ((!C24129b.m58030b(SiteVisibleConfigKey.FiatDeposit) || coinInfoEntityM85613u2 == null || coinInfoEntityM85613u2.isDigital()) && (coinInfoEntityM85613u2 == null || !coinInfoEntityM85613u2.isDigital())) {
            z11 = false;
        }
        baseViewHolder.setGone(i11, z11);
        baseViewHolder.setOnClickListener(R$id.tvTransfer, new View.OnClickListener() { // from class: com.kubi.spot.helper.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogHelper.m61810g(str2, dialogFragmentHelper2, view);
            }
        }).setOnClickListener(i11, new View.OnClickListener() { // from class: com.kubi.spot.helper.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogHelper.m61811h(coinInfoEntityM85613u2, str2, dialogFragmentHelper2, view);
            }
        }).setOnClickListener(R$id.tv_cancel, new View.OnClickListener() { // from class: com.kubi.spot.helper.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogHelper.m61812i(dialogFragmentHelper2, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final void m61810g(String str, DialogFragmentHelper dialogFragmentHelper, View view) {
        C43852m.m96591c("B5trading", "transfer_transfer", null, null, 12, null);
        TransferJumper.Companion.jumpToTransfer$default(TransferJumper.f21427a, str, null, null, "MAIN", "TRADE", false, null, 102, null);
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public static final void m61811h(CoinInfoEntity coinInfoEntity, String str, DialogFragmentHelper dialogFragmentHelper, View view) {
        String code;
        C43852m.m96591c("B5trading", "transfer_recharge", null, null, 12, null);
        C37340k c37340k = C37340k.f82854a;
        if (coinInfoEntity != null && (code = coinInfoEntity.getCode()) != null) {
            str = code;
        }
        c37340k.m83929f(str);
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public static final void m61812i(DialogFragmentHelper dialogFragmentHelper, View view) {
        C43852m.m96591c("B5trading", "transfer_cancel", null, null, 12, null);
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final void m61813e(@Nullable final String str, @NotNull final BaseOrderHolder baseOrderHolder, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(baseOrderHolder, "baseOrderHolder");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        DialogFragmentHelper.f43568p0.newInstance(R$layout.dialog_deposit_transfer, true).m54237f4(new Function2() { // from class: com.kubi.spot.helper.f
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DialogHelper.m61809f(str, baseOrderHolder, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(fragmentManager, "DepositTransferDialog");
    }
}
