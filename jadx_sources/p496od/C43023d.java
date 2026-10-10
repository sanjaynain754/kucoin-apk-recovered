package p496od;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import f00.C37304a;
import g00.InterfaceC37749a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: od.d */
/* JADX INFO: compiled from: SubmitOrderApiExceptionExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a*\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0001\u001a\u0016\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, m90084d2 = {"hitLimitCountryExceptionError", "", "it", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "code", "", "isUnifiedTrade", "matchLimitByKycErrCode", "matchLimitByCountryErrCode", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43023d {
    /* JADX INFO: renamed from: b */
    public static final boolean m94501b(@Nullable Throwable th2, @NotNull FragmentManager childFragmentManager, @NotNull final String code, boolean z11) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Intrinsics.checkNotNullParameter(code, "code");
        if (th2 instanceof ApiException) {
            String code2 = ((ApiException) th2).code;
            Intrinsics.checkNotNullExpressionValue(code2, "code");
            if (m94503d(z11, code2)) {
                AlertDialogFragmentHelper alertDialogFragmentHelperNewInstanceAlert = AlertDialogFragmentHelper.f43512a1.newInstanceAlert();
                C27017c c27017c = C27017c.f54310a;
                alertDialogFragmentHelperNewInstanceAlert.m54168Y4(c27017c.m66516f(R$string.notice_messages, new Object[0])).m54156M4(c27017c.m66516f(R$string.kc_spot_clear_out_guide, new Object[0])).m54161R4(0).m54162S4(R$string.go_withdraw, new DialogInterface.OnClickListener() { // from class: od.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        C43023d.m94502c(code, dialogInterface, i11);
                    }
                }).m54159P4(R$string.cancel, null).m54172c5(childFragmentManager);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final void m94502c(String str, DialogInterface dialogInterface, int i11) {
        InterfaceC37749a.a.m85118m(C37304a.f82764a, C27041f.m66668h(str), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m94503d(boolean z11, String str) {
        return z11 ? C43020a.f95195a.m94497b(str) : C43020a.f95195a.m94496a(str);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m94504e(boolean z11, @NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return z11 ? C43021b.f95196a.m94499b(code) : C43021b.f95196a.m94498a(code);
    }
}
