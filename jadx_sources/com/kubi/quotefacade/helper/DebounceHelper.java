package com.kubi.quotefacade.helper;

import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DebounceHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/DebounceHelper;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "debounceJob", "Lkotlinx/coroutines/Job;", "callWithDebounce", "", "delayMillis", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DebounceHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC41709m0 f41927a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public InterfaceC41775x1 f41928b;

    public DebounceHelper(@NotNull InterfaceC41709m0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f41927a = scope;
    }

    /* JADX INFO: renamed from: a */
    public final void m51788a(long j11, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        InterfaceC41775x1 interfaceC41775x1 = this.f41928b;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f41928b = C41696j.m91104d(this.f41927a, null, null, new DebounceHelper$callWithDebounce$1(j11, action, null), 3, null);
    }
}
