package com.kubi.core.biz.submit;

import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.kubi.data.coin.AccountType;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.tradecorebiz.R$string;
import f00.C37304a;
import g00.InterfaceC37749a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.submit.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OrderErrorCodeInterception.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J(\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/core/biz/submit/OrderErrorCodeInterception;", "", "<init>", "()V", "interceptBalanceNotEnough", "", "errorCode", "", "showTransferDialog", "", "code", "toAccountType", "Lcom/kubi/data/coin/AccountType;", "fragment", "Landroidx/fragment/app/Fragment;", "tag", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OrderErrorCodeInterception {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final OrderErrorCodeInterception f20693a = new OrderErrorCodeInterception();

    /* JADX INFO: renamed from: d */
    public static final void m22529d(String str, AccountType accountType, DialogInterface dialogInterface, int i11) {
        C37304a c37304a = C37304a.f82764a;
        if (str == null) {
            str = "";
        }
        InterfaceC37749a.a.m85117l(c37304a, str, "MAIN", accountType.name(), null, null, null, null, 120, null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m22530b(@Nullable String str) {
        return TextUtils.equals(str, "106150");
    }

    /* JADX INFO: renamed from: c */
    public final void m22531c(@Nullable final String str, @NotNull final AccountType toAccountType, @NotNull Fragment fragment, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(toAccountType, "toAccountType");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(tag, "tag");
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54153J4(R$string.unify_plz_transfer_to_unify_account).m54159P4(R$string.cancel, null).m54162S4(R$string.go_transfer, new DialogInterface.OnClickListener() { // from class: com.kubi.core.biz.submit.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                OrderErrorCodeInterception.m22529d(str, toAccountType, dialogInterface, i11);
            }
        });
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, tag);
    }
}
