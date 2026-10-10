package com.kubi.quotefacade.knb;

import com.kubi.quotefacade.helper.FavAlphaCacheManager;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.sdk.protocol.ProtocolException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCFlutterBridgeMarketCallImpl.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.knb.KCFlutterBridgeMarketCallImpl$changeAlphaFavorite$1", m90122f = "KCFlutterBridgeMarketCallImpl.kt", m90123i = {0}, m90124l = {135}, m90125m = "invokeSuspend", m90126n = {"tokenChain"}, m90127s = {"L$0"})
public final class KCFlutterBridgeMarketCallImpl$changeAlphaFavorite$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $chain;
    final /* synthetic */ Boolean $isFav;
    final /* synthetic */ String $token;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeMarketCallImpl$changeAlphaFavorite$1(String str, String str2, Boolean bool, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCFlutterBridgeMarketCallImpl$changeAlphaFavorite$1> continuation) {
        super(2, continuation);
        this.$token = str;
        this.$chain = str2;
        this.$isFav = bool;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeMarketCallImpl$changeAlphaFavorite$1(this.$token, this.$chain, this.$isFav, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeMarketCallImpl$changeAlphaFavorite$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KCFlutterBridgeMarketCallImpl$changeAlphaFavorite$1 kCFlutterBridgeMarketCallImpl$changeAlphaFavorite$1;
        boolean zBooleanValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                kCFlutterBridgeMarketCallImpl$changeAlphaFavorite$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String str = this.$token + '-' + this.$chain;
            if (BQuoteFacadeDepend.f42592a.m53025e().c()) {
                FavAlphaCacheManager favAlphaCacheManager = FavAlphaCacheManager.f41929a;
                Boolean bool = this.$isFav;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                boolean z11 = zBooleanValue;
                this.L$0 = SpillingKt.nullOutSpilledVariable(str);
                this.label = 1;
                kCFlutterBridgeMarketCallImpl$changeAlphaFavorite$1 = this;
                if (FavAlphaCacheManager.m51809q(favAlphaCacheManager, str, z11, false, null, kCFlutterBridgeMarketCallImpl$changeAlphaFavorite$1, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                kCFlutterBridgeMarketCallImpl$changeAlphaFavorite$1 = this;
                FavAlphaCacheManager.m51807m(FavAlphaCacheManager.f41929a, str, null, 2, null);
            }
        }
        kCFlutterBridgeMarketCallImpl$changeAlphaFavorite$1.$callback.invoke(Boxing.boxBoolean(true), null);
        return Unit.INSTANCE;
    }
}
