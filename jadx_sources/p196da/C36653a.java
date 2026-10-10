package p196da;

import android.app.Activity;
import android.os.Bundle;
import com.kubi.kucoin.api.IMainActivity;
import com.kubi.p072ad.service.AdManager;
import ky.InterfaceC42005d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: da.a */
/* JADX INFO: compiled from: AdMainActLifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/ad/lifecycle/AdMainActLifecycle;", "Lcom/kubi/sdk/delegate/IActivityLifecycle;", "<init>", "()V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "AdLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36653a implements InterfaceC42005d {
    @Override // ky.InterfaceC42005d
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onActivityCreated(activity, savedInstanceState);
        if (activity instanceof IMainActivity) {
            AdManager.f14936a.m14651d();
        }
    }
}
