package com.kubi.core.spot.helper;

import ad.InterfaceC0239a;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.spot.helper.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DialogHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/spot/helper/DialogHelper;", "", "<init>", "()V", "showDepositTransferDialog", "", "targetCurrency", "", "assetsOperator", "Lcom/kubi/core/base/assets/IBizRouterOperator;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DialogHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DialogHelper f21241a = new DialogHelper();

    /* JADX INFO: renamed from: e */
    public static final Unit m23319e(final InterfaceC0239a interfaceC0239a, final String str, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        viewHolder.setOnClickListener(R$id.clTransfer, new View.OnClickListener() { // from class: com.kubi.core.spot.helper.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogHelper.m23320f(interfaceC0239a, str, dialogFragmentHelper, view);
            }
        });
        viewHolder.setOnClickListener(R$id.clDeposit, new View.OnClickListener() { // from class: com.kubi.core.spot.helper.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogHelper.m23321g(str, dialogFragmentHelper, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final void m23320f(InterfaceC0239a interfaceC0239a, String str, DialogFragmentHelper dialogFragmentHelper, View view) {
        if (interfaceC0239a != null) {
            interfaceC0239a.mo873b(str);
        }
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public static final void m23321g(String str, DialogFragmentHelper dialogFragmentHelper, View view) {
        ISpotCommonService.f49644a.get().mo59965i(str);
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public final void m23322d(@Nullable final String str, @Nullable final InterfaceC0239a interfaceC0239a, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        DialogFragmentHelper.f43568p0.newInstance(R$layout.trade_core_dialog_deposit_transfer, true).m54237f4(new Function2() { // from class: com.kubi.core.spot.helper.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DialogHelper.m23319e(interfaceC0239a, str, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(fragmentManager, "DepositTransferDialog");
    }
}
