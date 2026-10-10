package p568qp;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.kubi.margin.R$string;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.BaseFragment;
import f00.C37304a;
import g00.InterfaceC37759k;
import mp.C42579a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qp.p */
/* JADX INFO: compiled from: MarginPwdHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"checkHasSetPwd", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43836p {
    /* JADX INFO: renamed from: b */
    public static final boolean m96535b(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (C42579a.f94275a.m93347g().d0().isWithDrawPassword()) {
            return true;
        }
        AlertDialogFragmentHelper alertDialogFragmentHelperM54159P4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.go_set_trade_pwd).m54162S4(R$string.go_set, new DialogInterface.OnClickListener() { // from class: qp.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C43836p.m96536c(dialogInterface, i11);
            }
        }).m54159P4(R$string.cancel, null);
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54159P4.show(childFragmentManager, "check_pwd");
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final void m96536c(DialogInterface dialogInterface, int i11) {
        InterfaceC37759k.a.m85171e(C37304a.f82764a, "SET_WITHDRAWAL_PASSWORD", null, null, null, null, 30, null);
    }
}
