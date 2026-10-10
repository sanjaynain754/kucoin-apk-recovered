package com.kubi.spot.business.submit;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.spot.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import f00.C37304a;
import g00.InterfaceC37749a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.business.submit.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ApiExceptionShowDialog.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/spot/business/submit/ApiExceptionShowDialog;", "", "<init>", "()V", "handleClearOutGuideError", "", "it", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "code", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ApiExceptionShowDialog {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ApiExceptionShowDialog f50375a = new ApiExceptionShowDialog();

    /* JADX INFO: renamed from: c */
    public static final void m61642c(String str, DialogInterface dialogInterface, int i11) {
        InterfaceC37749a.a.m85118m(C37304a.f82764a, C27041f.m66668h(str), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m61643b(@Nullable Throwable th2, @NotNull FragmentManager childFragmentManager, @NotNull final String code) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Intrinsics.checkNotNullParameter(code, "code");
        if (th2 instanceof ApiException) {
            ApiException apiException = (ApiException) th2;
            if (Intrinsics.areEqual(apiException.code, "400500") || Intrinsics.areEqual(apiException.code, "200008")) {
                AlertDialogFragmentHelper alertDialogFragmentHelperNewInstanceAlert = AlertDialogFragmentHelper.f43512a1.newInstanceAlert();
                C27017c c27017c = C27017c.f54310a;
                alertDialogFragmentHelperNewInstanceAlert.m54168Y4(c27017c.m66516f(R$string.notice_messages, new Object[0])).m54156M4(c27017c.m66516f(R$string.kc_spot_clear_out_guide, new Object[0])).m54161R4(0).m54162S4(R$string.go_withdraw, new DialogInterface.OnClickListener() { // from class: com.kubi.spot.business.submit.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        ApiExceptionShowDialog.m61642c(code, dialogInterface, i11);
                    }
                }).m54159P4(R$string.cancel, null).m54172c5(childFragmentManager);
                return true;
            }
        }
        return false;
    }
}
