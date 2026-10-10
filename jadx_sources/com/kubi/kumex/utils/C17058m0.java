package com.kubi.kumex.utils;

import android.app.Dialog;
import android.view.Window;
import androidx.annotation.StringRes;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.kubi.kucoin.utils.NetworkToastHandler;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.utils.m0 */
/* JADX INFO: compiled from: ToastEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\b\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n\u001a\u0014\u0010\u000b\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u0014\u0010\u000b\u001a\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\b\u001a\u0014\u0010\u000b\u001a\u00020\u0003*\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n\u001a\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"networkToastHandler", "Lcom/kubi/kucoin/utils/NetworkToastHandler;", "shortToast", "", "Landroidx/lifecycle/LifecycleOwner;", "message", "", "messageRes", "", "throwable", "", "longToast", "findDialogFragment", "Landroidx/fragment/app/DialogFragment;", TUIConstants.TUIChat.OWNER, "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C17058m0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final NetworkToastHandler f30806a = new NetworkToastHandler();

    /* JADX INFO: renamed from: a */
    public static final DialogFragment m36546a(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof Fragment) {
            if (lifecycleOwner instanceof DialogFragment) {
                return (DialogFragment) lifecycleOwner;
            }
            Fragment parentFragment = ((Fragment) lifecycleOwner).getParentFragment();
            if (parentFragment != null) {
                return m36546a(parentFragment);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m36547b(@NotNull LifecycleOwner lifecycleOwner, @Nullable String str) {
        Window window;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        if (str == null || str.length() == 0) {
            return;
        }
        DialogFragment dialogFragmentM36546a = m36546a(lifecycleOwner);
        if (dialogFragmentM36546a == null) {
            ToastCompat.m66436B(str, new Object[0]);
            return;
        }
        Dialog dialog = dialogFragmentM36546a.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        ToastCompat.m66435A(window, str, new Object[0]);
    }

    /* JADX INFO: renamed from: c */
    public static final void m36548c(@NotNull LifecycleOwner lifecycleOwner, @StringRes int i11) {
        Window window;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        DialogFragment dialogFragmentM36546a = m36546a(lifecycleOwner);
        if (dialogFragmentM36546a == null) {
            ToastCompat.m66437C(i11);
            return;
        }
        Dialog dialog = dialogFragmentM36546a.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        ToastCompat.m66439E(window, C27017c.f54310a.m66516f(i11, new Object[0]), new Object[0]);
    }

    /* JADX INFO: renamed from: d */
    public static final void m36549d(@NotNull LifecycleOwner lifecycleOwner, @Nullable String str) {
        Window window;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        if (str == null || str.length() == 0) {
            return;
        }
        DialogFragment dialogFragmentM36546a = m36546a(lifecycleOwner);
        if (dialogFragmentM36546a == null) {
            ToastCompat.m66441G(str, new Object[0]);
            return;
        }
        Dialog dialog = dialogFragmentM36546a.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        ToastCompat.m66439E(window, str, new Object[0]);
    }

    /* JADX INFO: renamed from: e */
    public static final void m36550e(@NotNull LifecycleOwner lifecycleOwner, @Nullable Throwable th2) {
        String strM33206f;
        Window window;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        if (th2 == null || (strM33206f = NetworkToastHandler.m33206f(f30806a, th2, null, 2, null)) == null || strM33206f.length() == 0) {
            return;
        }
        DialogFragment dialogFragmentM36546a = m36546a(lifecycleOwner);
        if (dialogFragmentM36546a == null) {
            ToastCompat.m66441G(strM33206f, new Object[0]);
            return;
        }
        Dialog dialog = dialogFragmentM36546a.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        ToastCompat.m66439E(window, strM33206f, new Object[0]);
    }
}
