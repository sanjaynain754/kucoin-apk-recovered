package com.kubi.p110rn.p111ui;

import com.kubi.resources.dialog.DialogFragmentHelper;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RnDialogInstanceManager.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0013\u001a\u00020\u000bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/rn/ui/RnDialogInstanceManager;", "", "<init>", "()V", "dialogInstances", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "lastOpenedDialog", "lastOpenedDialogId", "registerDialog", "", "dialogId", "dialog", "unregisterDialog", "getDialog", "getDialogId", "closeDialog", "", "clear", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRnDialogInstanceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnDialogInstanceManager.kt\ncom/kubi/rn/ui/RnDialogInstanceManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n295#2,2:96\n1#3:98\n*S KotlinDebug\n*F\n+ 1 RnDialogInstanceManager.kt\ncom/kubi/rn/ui/RnDialogInstanceManager\n*L\n61#1:96,2\n*E\n"})
public final class RnDialogInstanceManager {

    @NotNull
    public static final RnDialogInstanceManager INSTANCE = new RnDialogInstanceManager();

    @NotNull
    private static final ConcurrentHashMap<String, DialogFragmentHelper> dialogInstances = new ConcurrentHashMap<>();

    @Nullable
    private static DialogFragmentHelper lastOpenedDialog;

    @Nullable
    private static String lastOpenedDialogId;

    public final void clear() {
        dialogInstances.clear();
        lastOpenedDialog = null;
        lastOpenedDialogId = null;
    }

    @Nullable
    public final DialogFragmentHelper getDialog(@Nullable String dialogId) {
        return (dialogId == null || dialogId.length() == 0) ? lastOpenedDialog : dialogInstances.get(dialogId);
    }

    @Nullable
    public final String getDialogId(@NotNull DialogFragmentHelper dialog) {
        Object next;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Set<Map.Entry<String, DialogFragmentHelper>> setEntrySet = dialogInstances.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        Iterator<T> it = setEntrySet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((Map.Entry) next).getValue(), dialog));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (String) entry.getKey();
        }
        return null;
    }

    public final void registerDialog(@NotNull String dialogId, @NotNull DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialogInstances.put(dialogId, dialog);
        lastOpenedDialog = dialog;
        lastOpenedDialogId = dialogId;
    }

    public final void unregisterDialog(@NotNull String dialogId) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        dialogInstances.remove(dialogId);
        if (Intrinsics.areEqual(lastOpenedDialogId, dialogId)) {
            lastOpenedDialog = null;
            lastOpenedDialogId = null;
        }
    }

    private RnDialogInstanceManager() {
    }

    public final boolean closeDialog(@Nullable String dialogId) {
        DialogFragmentHelper dialog = getDialog(dialogId);
        if (dialog != null && dialog.isAdded() && !dialog.isRemoving()) {
            dialog.dismiss();
            if (dialogId != null && dialogId.length() != 0) {
                unregisterDialog(dialogId);
                return true;
            }
            String str = lastOpenedDialogId;
            if (str != null) {
                INSTANCE.unregisterDialog(str);
                return true;
            }
            return true;
        }
        return false;
    }
}
