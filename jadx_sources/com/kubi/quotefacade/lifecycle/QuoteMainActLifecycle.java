package com.kubi.quotefacade.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.kucoin.api.IMainActivity;
import com.kubi.quotefacade.helper.QuoteExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import ky.InterfaceC42005d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QuoteMainActLifecycle.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\r"}, m90084d2 = {"Lcom/kubi/quotefacade/lifecycle/QuoteMainActLifecycle;", "Lcom/kubi/sdk/delegate/IActivityLifecycle;", "<init>", "()V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "preFetchMarketMenuAsync", "scope", "Lkotlinx/coroutines/CoroutineScope;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QuoteMainActLifecycle implements InterfaceC42005d {
    /* JADX INFO: renamed from: a */
    public final void m52234a(InterfaceC41709m0 interfaceC41709m0) {
        QuoteExKt.m51873x(interfaceC41709m0, new QuoteMainActLifecycle$preFetchMarketMenuAsync$1(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ky.InterfaceC42005d
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onActivityCreated(activity, savedInstanceState);
        if ((activity instanceof IMainActivity) && (activity instanceof FragmentActivity)) {
            m52234a(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity));
        }
    }
}
