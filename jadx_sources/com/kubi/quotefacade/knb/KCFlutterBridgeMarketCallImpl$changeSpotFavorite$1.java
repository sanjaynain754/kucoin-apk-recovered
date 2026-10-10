package com.kubi.quotefacade.knb;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.protocol.ProtocolException;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KCFlutterBridgeMarketCallImpl.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.knb.KCFlutterBridgeMarketCallImpl$changeSpotFavorite$1", m90122f = "KCFlutterBridgeMarketCallImpl.kt", m90123i = {}, m90124l = {191}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCFlutterBridgeMarketCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeMarketCallImpl.kt\ncom/kubi/quotefacade/knb/KCFlutterBridgeMarketCallImpl$changeSpotFavorite$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n25#2:221\n26#2:223\n1#3:222\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeMarketCallImpl.kt\ncom/kubi/quotefacade/knb/KCFlutterBridgeMarketCallImpl$changeSpotFavorite$1\n*L\n193#1:221\n193#1:223\n193#1:222\n*E\n"})
public final class KCFlutterBridgeMarketCallImpl$changeSpotFavorite$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ KCFlutterBridgeMarketCallImpl this$0;

    /* JADX INFO: renamed from: com.kubi.quotefacade.knb.KCFlutterBridgeMarketCallImpl$changeSpotFavorite$1$1 */
    /* JADX INFO: compiled from: KCFlutterBridgeMarketCallImpl.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.knb.KCFlutterBridgeMarketCallImpl$changeSpotFavorite$1$1", m90122f = "KCFlutterBridgeMarketCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C222561 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C222561(Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super C222561> continuation) {
            super(2, continuation);
            this.$callback = function2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C222561(this.$callback, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C222561) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$callback.invoke(Boxing.boxBoolean(true), null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeMarketCallImpl$changeSpotFavorite$1(KCFlutterBridgeMarketCallImpl kCFlutterBridgeMarketCallImpl, String str, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCFlutterBridgeMarketCallImpl$changeSpotFavorite$1> continuation) {
        super(2, continuation);
        this.this$0 = kCFlutterBridgeMarketCallImpl;
        this.$symbol = str;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeMarketCallImpl$changeSpotFavorite$1(this.this$0, this.$symbol, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeMarketCallImpl$changeSpotFavorite$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KCFlutterBridgeMarketCallImpl$changeSpotFavorite$1 kCFlutterBridgeMarketCallImpl$changeSpotFavorite$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                kCFlutterBridgeMarketCallImpl$changeSpotFavorite$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<Object> interfaceC41634eM52994h = this.this$0.getF42152a().m52994h(this.$symbol, Boxing.boxInt(1));
            C222561 c222561 = new C222561(this.$callback, null);
            this.label = 1;
            kCFlutterBridgeMarketCallImpl$changeSpotFavorite$1 = this;
            obj = RetrofitFlowExKt.m42826g(interfaceC41634eM52994h, false, c222561, kCFlutterBridgeMarketCallImpl$changeSpotFavorite$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Function2<Boolean, ProtocolException, Unit> function2 = kCFlutterBridgeMarketCallImpl$changeSpotFavorite$1.$callback;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            function2.invoke(Boxing.boxBoolean(false), null);
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }
}
