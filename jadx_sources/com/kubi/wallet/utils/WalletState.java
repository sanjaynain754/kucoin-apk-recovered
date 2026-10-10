package com.kubi.wallet.utils;

import android.app.Activity;
import com.kubi.sdk.C23705e3;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.mode.p117ui.ModeTransitionActivity;
import com.kubi.sdk.startup.IStartupActivity;
import com.kubi.wallet.p119ui.WalletFlutterActivity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.wallet.utils.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: WalletState.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/wallet/utils/WalletState;", "", "<init>", "()V", "isWeb3WalletInStack", "", "isWeb3WalletInUse", "LifecycleCallbacks", "WalletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WalletState {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WalletState f54638a = new WalletState();

    /* JADX INFO: renamed from: b */
    public static boolean f54639b;

    /* JADX INFO: renamed from: com.kubi.wallet.utils.c$a */
    /* JADX INFO: compiled from: WalletState.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/wallet/utils/WalletState$LifecycleCallbacks;", "Lcom/kubi/sdk/SimpleActivityLifecycleCallbacks;", "<init>", "()V", "onActivityStarted", "", "activity", "Landroid/app/Activity;", "onActivityDestroyed", "WalletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends C23705e3 {
        @Override // com.kubi.sdk.C23705e3, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (activity instanceof WalletFlutterActivity) {
                WalletState.f54639b = false;
            }
        }

        @Override // com.kubi.sdk.C23705e3, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if ((activity instanceof IStartupActivity) || (activity instanceof ModeTransitionActivity) || !(activity instanceof WalletFlutterActivity)) {
                return;
            }
            WalletState.f54639b = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m66999b() {
        return f54639b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m67000c() {
        return AppMode.INSTANCE.isWeb3Mode();
    }
}
