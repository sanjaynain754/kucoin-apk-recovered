package com.kubi.wallet.utils;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.router.utils.RouteExKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CheckUpgradeHelper.kt */
/* JADX INFO: loaded from: classes55.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/wallet/utils/CheckUpgradeHelper;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "mUpgradeCount", "", "mUpgradeHaveShowed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "checkUpgrade", "", "callCheckUpgrade", "WalletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CheckUpgradeHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FragmentActivity f54634a;

    /* JADX INFO: renamed from: b */
    public int f54635b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final AtomicBoolean f54636c;

    public CheckUpgradeHelper(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f54634a = activity;
        this.f54635b = 2;
        this.f54636c = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m66992e() {
        if (this.f54635b <= 0 || this.f54636c.get()) {
            return;
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this.f54634a), null, null, new CheckUpgradeHelper$callCheckUpgrade$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m66993f() {
        Intent intent = this.f54634a.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        Integer numM56264o = RouteExKt.m56264o(intent, "appLauncherType");
        if ((numM56264o != null && numM56264o.intValue() == 1) || (numM56264o != null && numM56264o.intValue() == 3)) {
            m66992e();
        }
    }
}
