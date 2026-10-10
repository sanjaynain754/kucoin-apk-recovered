package o50;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.tradingbotkit.R$string;
import com.kubi.utils.ToastCompat;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import ro.C44128b;

/* JADX INFO: renamed from: o50.c */
/* JADX INFO: compiled from: FragmentExt.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a^\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u001a-\u0010\u0010\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0014\b\u0002\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0014\"\u00020\u0003¢\u0006\u0002\u0010\u0015\u001a\u0012\u0010\u0016\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018¨\u0006\u0019"}, m90084d2 = {"toast", "", "msg", "", "showSimpleDialog", "Landroidx/fragment/app/Fragment;", "title", "content", "", "rightBtnString", "rightClick", "Landroid/content/DialogInterface$OnClickListener;", "leftBtnString", "leftClick", "cancelListener", "Lkotlin/Function0;", "getStringByRes", "res", "", "args", "", "(Landroidx/fragment/app/Fragment;I[Ljava/lang/String;)Ljava/lang/String;", "dismissShowingDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFragmentExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentExt.kt\ncom/kubi/tradingbotkit/ext/FragmentExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 TradingBotIssue.kt\ncom/kubi/tradingbotkit/exeption/TradingBotIssueKt\n*L\n1#1,87:1\n1869#2:88\n1870#2:93\n808#2,11:94\n1869#2,2:105\n45#3,4:89\n*S KotlinDebug\n*F\n+ 1 FragmentExt.kt\ncom/kubi/tradingbotkit/ext/FragmentExtKt\n*L\n73#1:88\n73#1:93\n81#1:94,11\n82#1:105,2\n78#1:89,4\n*E\n"})
public final class C42969c {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m94358b(@NotNull Fragment fragment, int i11, @NotNull String... args) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        Context context = fragment.getContext();
        if (context != null) {
            try {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = context.getString(i11);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(string, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            } catch (Exception e11) {
                C44128b.m97260d(fragment.getClass().getName() + "|getStringByRes|" + e11);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m94359c(Fragment fragment, int i11, String[] strArr, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            strArr = new String[0];
        }
        return m94358b(fragment, i11, strArr);
    }

    /* JADX INFO: renamed from: d */
    public static final void m94360d(@NotNull Fragment fragment, @Nullable String str, @NotNull CharSequence content, @NotNull String rightBtnString, @Nullable DialogInterface.OnClickListener onClickListener, @Nullable String str2, @Nullable DialogInterface.OnClickListener onClickListener2, @Nullable final Function0<Unit> function0) {
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
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o50.b
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C42969c.m94362f(function0, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m94361e(Fragment fragment, String str, CharSequence charSequence, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2, Function0 function0, int i11, Object obj) {
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
        m94360d(fragment, str, charSequence, str2, onClickListener, str3, onClickListener2, function0);
    }

    /* JADX INFO: renamed from: g */
    public static final void m94363g(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        ToastCompat.m66436B(msg, new Object[0]);
    }

    /* JADX INFO: renamed from: f */
    public static final void m94362f(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }
}
