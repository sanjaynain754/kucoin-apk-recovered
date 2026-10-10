package com.jumio.core.scope;

import com.jumio.core.Injected;
import jumio.core.C40510B3;
import jumio.core.C40515C3;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Injected
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J+\u0010\u0016\u001a\u00020\u00172\u001c\u0010\u0018\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019H\u0016¢\u0006\u0002\u0010\u001cJ+\u0010\u001d\u001a\u00020\u00172\u001c\u0010\u0018\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019H\u0016¢\u0006\u0002\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u0000H&J\b\u0010\u001f\u001a\u00020\u001bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0012\u0010\u0012\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0012\u0010\u0014\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f¨\u0006 À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/scope/ScopeProviderInterface;", "", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getMainDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "mainImmediateDispatcher", "getMainImmediateDispatcher", "backgroundDispatcher", "getBackgroundDispatcher", "ioDispatcher", "getIoDispatcher", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "getMainScope", "()Lkotlinx/coroutines/CoroutineScope;", "mainImmediateScope", "getMainImmediateScope", "backgroundScope", "getBackgroundScope", "ioScope", "getIoScope", "runOnMain", "Lkotlinx/coroutines/Job;", "func", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "postOnMain", "fork", "cancelAll", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ScopeProviderInterface {
    void cancelAll();

    @NotNull
    ScopeProviderInterface fork();

    @NotNull
    AbstractC41697j0 getBackgroundDispatcher();

    @NotNull
    InterfaceC41709m0 getBackgroundScope();

    @NotNull
    AbstractC41697j0 getIoDispatcher();

    @NotNull
    InterfaceC41709m0 getIoScope();

    @NotNull
    AbstractC41697j0 getMainDispatcher();

    @NotNull
    AbstractC41697j0 getMainImmediateDispatcher();

    @NotNull
    InterfaceC41709m0 getMainImmediateScope();

    @NotNull
    InterfaceC41709m0 getMainScope();

    @NotNull
    default InterfaceC41775x1 postOnMain(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> func) {
        Intrinsics.checkNotNullParameter(func, "func");
        return C41696j.m91104d(getMainScope(), null, null, new C40510B3(func, null), 3, null);
    }

    @NotNull
    default InterfaceC41775x1 runOnMain(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> func) {
        Intrinsics.checkNotNullParameter(func, "func");
        return C41696j.m91104d(getMainImmediateScope(), null, null, new C40515C3(func, null), 3, null);
    }
}
