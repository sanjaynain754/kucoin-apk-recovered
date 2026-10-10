package com.kubi.home.knb;

import com.kubi.sdk.protocol.ProtocolException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCFlutterBridgeSymbolCallImpl.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.knb.KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2", m90122f = "KCFlutterBridgeSymbolCallImpl.kt", m90123i = {0, 0, 0}, m90124l = {53}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "it", "$i$a$-let-KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2$result$1"}, m90127s = {"L$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nKCFlutterBridgeSymbolCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeSymbolCallImpl.kt\ncom/kubi/home/knb/KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1563#2:60\n1634#2,3:61\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeSymbolCallImpl.kt\ncom/kubi/home/knb/KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2\n*L\n48#1:60\n48#1:61,3\n*E\n"})
public final class KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Map<String, ? extends Object>, ProtocolException, Unit> $callback;
    final /* synthetic */ List<String> $symbol;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2(List<String> list, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2, Continuation<? super KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2> continuation) {
        super(2, continuation);
        this.$symbol = list;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2 kCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2 = new KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2(this.$symbol, this.$callback, continuation);
        kCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2.L$0 = obj;
        return kCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map<String, ? extends Object> map;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            List<String> list = this.$symbol;
            if (list != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C41696j.m91102b(interfaceC41709m0, null, null, new KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2$result$1$1$1((String) it.next(), null), 3, null));
                }
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(list);
                this.I$0 = 0;
                this.label = 1;
                obj = AwaitKt.m90345a(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                map = null;
            }
            this.$callback.invoke(map, null);
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        map = MapsKt.toMap((Iterable) obj);
        this.$callback.invoke(map, null);
        return Unit.INSTANCE;
    }
}
