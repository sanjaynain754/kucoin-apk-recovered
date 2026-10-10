package com.kubi.quotefacade.knb.p107rn;

import com.kubi.p110rn.modules.command.impl.CheckIsFavorCommand;
import com.kubi.quotefacade.helper.FavAlphaCacheManager;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.sdk.protocol.ProtocolException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCRnBridgeMarketCallImpl.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.knb.rn.KCRnBridgeMarketCallImpl$changeAlphaFavorite$1", m90122f = "KCRnBridgeMarketCallImpl.kt", m90123i = {0}, m90124l = {29}, m90125m = "invokeSuspend", m90126n = {CheckIsFavorCommand.KEY_IS_FAV}, m90127s = {"Z$0"})
public final class KCRnBridgeMarketCallImpl$changeAlphaFavorite$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $tokenChain;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCRnBridgeMarketCallImpl$changeAlphaFavorite$1(String str, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCRnBridgeMarketCallImpl$changeAlphaFavorite$1> continuation) {
        super(2, continuation);
        this.$tokenChain = str;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCRnBridgeMarketCallImpl$changeAlphaFavorite$1(this.$tokenChain, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCRnBridgeMarketCallImpl$changeAlphaFavorite$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Unit m52232g(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m52233h(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (BQuoteFacadeDepend.f42592a.m53025e().c()) {
                FavAlphaCacheManager favAlphaCacheManager = FavAlphaCacheManager.f41929a;
                boolean zM51826w = favAlphaCacheManager.m51826w(this.$tokenChain);
                String str = this.$tokenChain;
                final Function2<Boolean, ProtocolException, Unit> function2 = this.$callback;
                Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.knb.rn.c
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return KCRnBridgeMarketCallImpl$changeAlphaFavorite$1.m52232g(function2, ((Boolean) obj2).booleanValue());
                    }
                };
                this.Z$0 = zM51826w;
                this.label = 1;
                if (FavAlphaCacheManager.m51809q(favAlphaCacheManager, str, zM51826w, false, function1, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                FavAlphaCacheManager favAlphaCacheManager2 = FavAlphaCacheManager.f41929a;
                String str2 = this.$tokenChain;
                final Function2<Boolean, ProtocolException, Unit> function3 = this.$callback;
                favAlphaCacheManager2.m51818k(str2, new Function1() { // from class: com.kubi.quotefacade.knb.rn.d
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return KCRnBridgeMarketCallImpl$changeAlphaFavorite$1.m52233h(function3, ((Boolean) obj2).booleanValue());
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }
}
