package p698vp;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.kubi.margin.R$string;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vp.g */
/* JADX INFO: compiled from: ShowSimpleDialog.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J^\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/margin/util/ShowSimpleDialog;", "", "<init>", "()V", "showSimpleDialog", "", "Landroidx/fragment/app/Fragment;", "title", "", "content", "", "rightBtnString", "rightClick", "Landroid/content/DialogInterface$OnClickListener;", "leftBtnString", "leftClick", "cancelListener", "Lkotlin/Function0;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45617g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45617g f102739a = new C45617g();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m100710c(C45617g c45617g, Fragment fragment, String str, CharSequence charSequence, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2, Function0 function0, int i11, Object obj) {
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
        c45617g.m100712b(fragment, str, charSequence, str2, onClickListener, str3, onClickListener2, function0);
    }

    /* JADX INFO: renamed from: b */
    public final void m100712b(@NotNull Fragment fragment, @Nullable String str, @NotNull CharSequence content, @NotNull String rightBtnString, @Nullable DialogInterface.OnClickListener onClickListener, @Nullable String str2, @Nullable DialogInterface.OnClickListener onClickListener2, @Nullable final Function0<Unit> function0) {
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
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: vp.f
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C45617g.m100711d(function0, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final void m100711d(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }
}
