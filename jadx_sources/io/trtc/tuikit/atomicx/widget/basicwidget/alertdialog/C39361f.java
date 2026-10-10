package io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog;

import android.app.Dialog;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.f */
/* JADX INFO: compiled from: AtomicAlertDialog.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a>\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u001aN\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u00140\u00132\b\b\u0002\u0010\u000e\u001a\u00020\t2\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0015\u001a>\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u001a>\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¨\u0006\u0019"}, m90084d2 = {"init", "", "Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$DialogConfig;", "title", "", "content", "iconView", "Landroid/view/View;", "autoDismiss", "", "addItem", "text", "type", "Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;", "isBold", "onClick", "Lkotlin/Function1;", "Landroid/app/Dialog;", FirebaseAnalytics.Param.ITEMS, "", "Lkotlin/Pair;", "Lkotlin/Function3;", "", "confirmButton", "cancelButton", "atomic_x_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAtomicAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicAlertDialog.kt\nio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialogKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,481:1\n1878#2,3:482\n*S KotlinDebug\n*F\n+ 1 AtomicAlertDialog.kt\nio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialogKt\n*L\n460#1:482,3\n*E\n"})
public final class C39361f {
    /* JADX INFO: renamed from: b */
    public static final void m88092b(@NotNull AtomicAlertDialog.DialogConfig dialogConfig, @NotNull String text, @NotNull AtomicAlertDialog.TextColorPreset type, boolean z11, @Nullable Function1<? super Dialog, Unit> function1) {
        Intrinsics.checkNotNullParameter(dialogConfig, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        dialogConfig.m88082g().add(new AtomicAlertDialog.C39352a(text, type, function1, z11));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m88093c(AtomicAlertDialog.DialogConfig dialogConfig, String str, AtomicAlertDialog.TextColorPreset textColorPreset, boolean z11, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            textColorPreset = AtomicAlertDialog.TextColorPreset.GREY;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        m88092b(dialogConfig, str, textColorPreset, z11, function1);
    }

    /* JADX INFO: renamed from: d */
    public static final void m88094d(@NotNull AtomicAlertDialog.DialogConfig dialogConfig, @NotNull String text, @NotNull AtomicAlertDialog.TextColorPreset type, boolean z11, @Nullable Function1<? super Dialog, Unit> function1) {
        Intrinsics.checkNotNullParameter(dialogConfig, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        dialogConfig.m88085j(new AtomicAlertDialog.C39352a(text, type, function1, z11));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m88095e(AtomicAlertDialog.DialogConfig dialogConfig, String str, AtomicAlertDialog.TextColorPreset textColorPreset, boolean z11, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            textColorPreset = AtomicAlertDialog.TextColorPreset.GREY;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        m88094d(dialogConfig, str, textColorPreset, z11, function1);
    }

    /* JADX INFO: renamed from: f */
    public static final void m88096f(@NotNull AtomicAlertDialog.DialogConfig dialogConfig, @NotNull String text, @NotNull AtomicAlertDialog.TextColorPreset type, boolean z11, @Nullable Function1<? super Dialog, Unit> function1) {
        Intrinsics.checkNotNullParameter(dialogConfig, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        dialogConfig.m88086k(new AtomicAlertDialog.C39352a(text, type, function1, z11));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m88097g(AtomicAlertDialog.DialogConfig dialogConfig, String str, AtomicAlertDialog.TextColorPreset textColorPreset, boolean z11, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            textColorPreset = AtomicAlertDialog.TextColorPreset.BLUE;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        m88096f(dialogConfig, str, textColorPreset, z11, function1);
    }

    /* JADX INFO: renamed from: h */
    public static final void m88098h(@NotNull AtomicAlertDialog.DialogConfig dialogConfig, @NotNull String title, @Nullable String str, @Nullable View view, boolean z11) {
        Intrinsics.checkNotNullParameter(dialogConfig, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        dialogConfig.m88090o(title);
        dialogConfig.m88087l(str);
        dialogConfig.m88089n(view);
        dialogConfig.m88084i(z11);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m88099i(AtomicAlertDialog.DialogConfig dialogConfig, String str, String str2, View view, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            view = null;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        m88098h(dialogConfig, str, str2, view, z11);
    }

    /* JADX INFO: renamed from: j */
    public static final void m88100j(@NotNull AtomicAlertDialog.DialogConfig dialogConfig, @NotNull List<? extends Pair<String, ? extends AtomicAlertDialog.TextColorPreset>> items, boolean z11, @NotNull final Function3<? super Dialog, ? super Integer, ? super String, Unit> onClick) {
        Intrinsics.checkNotNullParameter(dialogConfig, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        final int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            final String str = (String) pair.component1();
            m88092b(dialogConfig, str, (AtomicAlertDialog.TextColorPreset) pair.component2(), z11, new Function1() { // from class: io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C39361f.m88101k(onClick, i11, str, (Dialog) obj2);
                }
            });
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m88101k(Function3 function3, int i11, String str, Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        function3.invoke(dialog, Integer.valueOf(i11), str);
        return Unit.INSTANCE;
    }
}
