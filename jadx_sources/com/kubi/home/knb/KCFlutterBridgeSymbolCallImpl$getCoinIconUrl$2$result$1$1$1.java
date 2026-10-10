package com.kubi.home.knb;

import com.kubi.home.api.IHomeService;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCFlutterBridgeSymbolCallImpl.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.knb.KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2$result$1$1$1", m90122f = "KCFlutterBridgeSymbolCallImpl.kt", m90123i = {}, m90124l = {50}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2$result$1$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Pair<? extends String, ? extends String>>, Object> {
    final /* synthetic */ String $symbol;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Pair<? extends String, ? extends String>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super Pair<String, String>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2$result$1$1$1(String str, Continuation<? super KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2$result$1$1$1> continuation) {
        super(2, continuation);
        this.$symbol = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2$result$1$1$1(this.$symbol, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Pair<String, String>> continuation) {
        return ((KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2$result$1$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            IHomeService iHomeService = IHomeService.f25434a.get();
            String str = this.$symbol;
            this.label = 1;
            obj = iHomeService.mo28948d(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return TuplesKt.m90091to(this.$symbol, C27041f.m66668h((String) obj));
    }
}
