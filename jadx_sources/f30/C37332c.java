package f30;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.spot.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: f30.c */
/* JADX INFO: compiled from: FragmentExt.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a`\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0000¨\u0006\u000e"}, m90084d2 = {"showSimpleDialog", "", "Landroidx/fragment/app/Fragment;", "title", "", "content", "", "rightBtnString", "rightClick", "Landroid/content/DialogInterface$OnClickListener;", "leftBtnString", "leftClick", "cancelListener", "Lkotlin/Function0;", "SpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37332c {
    /* JADX INFO: renamed from: b */
    public static final void m83914b(@NotNull Fragment fragment, @Nullable String str, @NotNull CharSequence content, @NotNull String rightBtnString, @Nullable DialogInterface.OnClickListener onClickListener, @Nullable String str2, @Nullable DialogInterface.OnClickListener onClickListener2, @Nullable final Function0<Unit> function0) {
        Dialog dialog;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(rightBtnString, "rightBtnString");
        AlertDialogFragmentHelper alertDialogFragmentHelperNewInstanceAlert = AlertDialogFragmentHelper.f43512a1.newInstanceAlert();
        if (str != null && str.length() != 0) {
            alertDialogFragmentHelperNewInstanceAlert.m54168Y4(str);
        }
        alertDialogFragmentHelperNewInstanceAlert.m54156M4(content).m54163T4(rightBtnString, onClickListener).m54160Q4(str2, onClickListener2).m54172c5(fragment.getChildFragmentManager());
        if (function0 == null || (dialog = alertDialogFragmentHelperNewInstanceAlert.getDialog()) == null) {
            return;
        }
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: f30.b
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C37332c.m83916d(function0, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m83915c(Fragment fragment, String str, CharSequence charSequence, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = fragment.getString(R$string.i_know);
            Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
        }
        if ((i11 & 8) != 0) {
            onClickListener = null;
        }
        if ((i11 & 16) != 0) {
            str3 = null;
        }
        if ((i11 & 32) != 0) {
            onClickListener2 = null;
        }
        if ((i11 & 64) != 0) {
            function0 = null;
        }
        m83914b(fragment, str, charSequence, str2, onClickListener, str3, onClickListener2, function0);
    }

    /* JADX INFO: renamed from: d */
    public static final void m83916d(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }
}
