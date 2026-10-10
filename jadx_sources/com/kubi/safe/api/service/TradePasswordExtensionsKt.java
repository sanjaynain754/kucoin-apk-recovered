package com.kubi.safe.api.service;

import androidx.fragment.app.Fragment;
import com.kubi.safe.api.tradesecurity.TradeSecurityScene;
import com.kubi.user.api.IUserService;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p244ey.InterfaceC37277b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradePasswordExtensions.kt */
/* JADX INFO: loaded from: classes40.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\u001aÞ\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\u001e\b\u0002\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u001423\u0010\u0015\u001a/\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00162\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, m90084d2 = {"executeTradePassword", "", "Landroidx/fragment/app/Fragment;", DropFrameTable.COLUMN_SCENE, "Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "dataString", "", "loadingHost", "Lcom/kubi/safe/api/tradesecurity/TradeLoadingHost;", "needProceedLoading", "", "allowRetry", "ignorePwd", "onBeforeCheck", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "onForgetPassword", "Lkotlin/Function0;", "onProceed", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "validationToken", "onCancelled", "onFailed", "", "(Landroidx/fragment/app/Fragment;Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Lcom/kubi/safe/api/tradesecurity/TradeLoadingHost;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "SafeApi_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradePasswordExtensionsKt {
    /* JADX INFO: renamed from: d */
    public static final void m56335d(@NotNull Fragment fragment, @NotNull TradeSecurityScene scene, @NotNull InterfaceC41709m0 scope, @NotNull String dataString, @Nullable InterfaceC37277b interfaceC37277b, boolean z11, boolean z12, boolean z13, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> onBeforeCheck, @NotNull Function0<Unit> onForgetPassword, @NotNull Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> onProceed, @NotNull Function0<Unit> onCancelled, @NotNull Function1<? super Throwable, Unit> onFailed) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dataString, "dataString");
        Intrinsics.checkNotNullParameter(onBeforeCheck, "onBeforeCheck");
        Intrinsics.checkNotNullParameter(onForgetPassword, "onForgetPassword");
        Intrinsics.checkNotNullParameter(onProceed, "onProceed");
        Intrinsics.checkNotNullParameter(onCancelled, "onCancelled");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        ITradeSecurityService iTradeSecurityService = ITradeSecurityService.f46326a.get();
        if (iTradeSecurityService != null) {
            iTradeSecurityService.m56331e(scene, fragment, scope, dataString, interfaceC37277b, z11, z12, z13, onBeforeCheck, onForgetPassword, onProceed, onCancelled, onFailed);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m56337f() {
        IUserService iUserService = IUserService.a.get();
        if (iUserService != null) {
            iUserService.B0();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m56338g() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m56339h(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
