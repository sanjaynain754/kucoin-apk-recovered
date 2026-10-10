package com.kubi.p110rn.modules.command.impl;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.p110rn.modules.command.ReactBridgeActionCommand;
import com.kubi.p110rn.service.ReactDepend;
import com.kubi.sdk.util.C24267r0;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import ly.C42329a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FavCoinCommand.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/rn/modules/command/impl/FavCoinCommand;", "Lcom/kubi/rn/modules/command/ReactBridgeActionCommand;", "symbol", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "<init>", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "getSymbol", "()Ljava/lang/String;", "getPromise", "()Lcom/facebook/react/bridge/Promise;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "onExecute", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FavCoinCommand extends ReactBridgeActionCommand {

    @NotNull
    private final Promise promise;

    @NotNull
    private final InterfaceC41709m0 scope;

    @NotNull
    private final String symbol;

    public FavCoinCommand(@NotNull String symbol, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.symbol = symbol;
        this.promise = promise;
        this.scope = C41713n0.m91125a(new CoroutineName("FavCoinCommand"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExecute$lambda$1$lambda$0(C42329a c42329a, boolean z11) {
        if (z11) {
            c42329a.m92876a("success", true).m92877b();
        } else {
            c42329a.m92876a("success", false).m92877b();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final Promise getPromise() {
        return this.promise;
    }

    @NotNull
    public final InterfaceC41709m0 getScope() {
        return this.scope;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    @Override // com.kubi.p110rn.modules.command.ReactBridgeActionCommand
    public void onExecute() {
        C24267r0.m58521e("FavCoinCommand");
        final C42329a c42329aM58527k = C24267r0.m58527k(this.promise);
        ReactDepend reactDepend = ReactDepend.INSTANCE;
        if (reactDepend.getUserService().c()) {
            C41696j.m91104d(this.scope, null, null, new FavCoinCommand$onExecute$1$1(this, c42329aM58527k, null), 3, null);
        } else {
            reactDepend.getQuoteFacadeService().mo50678C(new TradeItemBean(this.symbol), new Function1() { // from class: com.kubi.rn.modules.command.impl.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FavCoinCommand.onExecute$lambda$1$lambda$0(c42329aM58527k, ((Boolean) obj).booleanValue());
                }
            });
        }
    }
}
