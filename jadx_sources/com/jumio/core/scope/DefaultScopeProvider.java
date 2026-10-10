package com.jumio.core.scope;

import com.jumio.core.scope.DefaultScopeProvider;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\"\u001a\u00020\u0001H\u0016J\b\u0010#\u001a\u00020$H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018*\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u001b\u0010\u0018*\u0004\b\u001a\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u001e\u0010\u0018*\u0004\b\u001d\u0010\u0016R\u001b\u0010\u001f\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b!\u0010\u0018*\u0004\b \u0010\u0016¨\u0006%"}, m90084d2 = {"Lcom/jumio/core/scope/DefaultScopeProvider;", "Lcom/jumio/core/scope/ScopeProviderInterface;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainImmediateDispatcher", "backgroundDispatcher", "ioDispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getMainDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getMainImmediateDispatcher", "getBackgroundDispatcher", "getIoDispatcher", "mainScopeLazy", "Lkotlin/Lazy;", "Lkotlinx/coroutines/CoroutineScope;", "mainImmediateScopeLazy", "backgroundScopeLazy", "ioScopeLazy", "mainScope", "getMainScope$delegate", "(Lcom/jumio/core/scope/DefaultScopeProvider;)Ljava/lang/Object;", "getMainScope", "()Lkotlinx/coroutines/CoroutineScope;", "mainImmediateScope", "getMainImmediateScope$delegate", "getMainImmediateScope", "backgroundScope", "getBackgroundScope$delegate", "getBackgroundScope", "ioScope", "getIoScope$delegate", "getIoScope", "fork", "cancelAll", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DefaultScopeProvider implements ScopeProviderInterface {

    /* JADX INFO: renamed from: a */
    public final AbstractC41697j0 f14549a;

    /* JADX INFO: renamed from: b */
    public final AbstractC41697j0 f14550b;

    /* JADX INFO: renamed from: c */
    public final AbstractC41697j0 f14551c;

    /* JADX INFO: renamed from: d */
    public final AbstractC41697j0 f14552d;

    /* JADX INFO: renamed from: e */
    public final Lazy f14553e;

    /* JADX INFO: renamed from: f */
    public final Lazy f14554f;

    /* JADX INFO: renamed from: g */
    public final Lazy f14555g;

    /* JADX INFO: renamed from: h */
    public final Lazy f14556h;

    public DefaultScopeProvider() {
        this(null, null, null, null, 15, null);
    }

    public DefaultScopeProvider(@NotNull AbstractC41697j0 mainDispatcher, @NotNull AbstractC41697j0 mainImmediateDispatcher, @NotNull AbstractC41697j0 backgroundDispatcher, @NotNull AbstractC41697j0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(mainImmediateDispatcher, "mainImmediateDispatcher");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f14549a = mainDispatcher;
        this.f14550b = mainImmediateDispatcher;
        this.f14551c = backgroundDispatcher;
        this.f14552d = ioDispatcher;
        this.f14553e = LazyKt.lazy(new Function0() { // from class: v9.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultScopeProvider.m14594d(this.f102502b);
            }
        });
        this.f14554f = LazyKt.lazy(new Function0() { // from class: v9.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultScopeProvider.m14593c(this.f102503b);
            }
        });
        this.f14555g = LazyKt.lazy(new Function0() { // from class: v9.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultScopeProvider.m14591a(this.f102504b);
            }
        });
        this.f14556h = LazyKt.lazy(new Function0() { // from class: v9.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultScopeProvider.m14592b(this.f102505b);
            }
        });
    }

    @Override // com.jumio.core.scope.ScopeProviderInterface
    public void cancelAll() {
        if (this.f14553e.isInitialized()) {
            JobKt__JobKt.m90365i(getMainScope().getF41940b(), null, 1, null);
        }
        if (this.f14554f.isInitialized()) {
            JobKt__JobKt.m90365i(getMainImmediateScope().getF41940b(), null, 1, null);
        }
        if (this.f14555g.isInitialized()) {
            JobKt__JobKt.m90365i(getBackgroundScope().getF41940b(), null, 1, null);
        }
        if (this.f14556h.isInitialized()) {
            JobKt__JobKt.m90365i(getIoScope().getF41940b(), null, 1, null);
        }
    }

    @Override // com.jumio.core.scope.ScopeProviderInterface
    @NotNull
    public ScopeProviderInterface fork() {
        return new DefaultScopeProvider(getF14549a(), getF14550b(), getF14551c(), getF14552d());
    }

    @Override // com.jumio.core.scope.ScopeProviderInterface
    @NotNull
    /* JADX INFO: renamed from: getBackgroundDispatcher, reason: from getter */
    public AbstractC41697j0 getF14551c() {
        return this.f14551c;
    }

    @Override // com.jumio.core.scope.ScopeProviderInterface
    @NotNull
    public InterfaceC41709m0 getBackgroundScope() {
        return (InterfaceC41709m0) this.f14555g.getValue();
    }

    @Override // com.jumio.core.scope.ScopeProviderInterface
    @NotNull
    /* JADX INFO: renamed from: getIoDispatcher, reason: from getter */
    public AbstractC41697j0 getF14552d() {
        return this.f14552d;
    }

    @Override // com.jumio.core.scope.ScopeProviderInterface
    @NotNull
    public InterfaceC41709m0 getIoScope() {
        return (InterfaceC41709m0) this.f14556h.getValue();
    }

    @Override // com.jumio.core.scope.ScopeProviderInterface
    @NotNull
    /* JADX INFO: renamed from: getMainDispatcher, reason: from getter */
    public AbstractC41697j0 getF14549a() {
        return this.f14549a;
    }

    @Override // com.jumio.core.scope.ScopeProviderInterface
    @NotNull
    /* JADX INFO: renamed from: getMainImmediateDispatcher, reason: from getter */
    public AbstractC41697j0 getF14550b() {
        return this.f14550b;
    }

    @Override // com.jumio.core.scope.ScopeProviderInterface
    @NotNull
    public InterfaceC41709m0 getMainImmediateScope() {
        return (InterfaceC41709m0) this.f14554f.getValue();
    }

    @Override // com.jumio.core.scope.ScopeProviderInterface
    @NotNull
    public InterfaceC41709m0 getMainScope() {
        return (InterfaceC41709m0) this.f14553e.getValue();
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC41709m0 m14591a(DefaultScopeProvider defaultScopeProvider) {
        return C41713n0.m91125a(defaultScopeProvider.getF14551c());
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC41709m0 m14592b(DefaultScopeProvider defaultScopeProvider) {
        return C41713n0.m91125a(defaultScopeProvider.getF14552d());
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC41709m0 m14593c(DefaultScopeProvider defaultScopeProvider) {
        return C41713n0.m91125a(defaultScopeProvider.getF14550b());
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC41709m0 m14594d(DefaultScopeProvider defaultScopeProvider) {
        return C41713n0.m91125a(defaultScopeProvider.getF14549a());
    }

    @Override // com.jumio.core.scope.ScopeProviderInterface
    @NotNull
    public InterfaceC41775x1 postOnMain(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
        return super.postOnMain(function1);
    }

    @Override // com.jumio.core.scope.ScopeProviderInterface
    @NotNull
    public InterfaceC41775x1 runOnMain(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
        return super.runOnMain(function1);
    }

    public /* synthetic */ DefaultScopeProvider(AbstractC41697j0 abstractC41697j0, AbstractC41697j0 abstractC41697j1, AbstractC41697j0 abstractC41697j2, AbstractC41697j0 abstractC41697j3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? C41782z0.m91393c() : abstractC41697j0, (i11 & 2) != 0 ? C41782z0.m91393c().getImmediate() : abstractC41697j1, (i11 & 4) != 0 ? C41782z0.m91391a() : abstractC41697j2, (i11 & 8) != 0 ? C41782z0.m91392b() : abstractC41697j3);
    }
}
