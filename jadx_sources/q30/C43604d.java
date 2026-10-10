package q30;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.tradebase.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: q30.d */
/* JADX INFO: compiled from: KLineHelper.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/tradebase/helper/KLineHelper;", "", "<init>", "()V", "deleteLineDialog", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "content", "", "deleteClick", "Lkotlin/Function0;", "closeClick", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43604d {
    /* JADX INFO: renamed from: e */
    public static final void m95959e(Function0 function0, DialogInterface dialogInterface, int i11) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m95960f(Function0 function0, DialogInterface dialogInterface, int i11) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m95961g(Function0 function0, DialogInterface dialogInterface) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m95962d(@NotNull FragmentManager fragmentManager, @NotNull String content, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(content, "content");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54156M4(content).m54161R4(0).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: q30.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C43604d.m95959e(function0, dialogInterface, i11);
            }
        }).m54159P4(R$string.cancel, new DialogInterface.OnClickListener() { // from class: q30.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C43604d.m95960f(function1, dialogInterface, i11);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: q30.c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C43604d.m95961g(function1, dialogInterface);
            }
        }).show(fragmentManager, "deleteLineDialog");
    }
}
