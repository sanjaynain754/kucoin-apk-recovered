package p469nd;

import androidx.fragment.app.FragmentManager;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.tradecorebiz.R$string;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nd.a */
/* JADX INFO: compiled from: EtfBizExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m90084d2 = {"showEtfTipDialog", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42806a {
    /* JADX INFO: renamed from: a */
    public static final void m93834a(@NotNull FragmentManager childFragmentManager) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.etf_value_intro).m54153J4(R$string.etf_value_intro_tips).m54162S4(R$string.i_know, null).show(childFragmentManager, "showEtfValueTips");
    }
}
