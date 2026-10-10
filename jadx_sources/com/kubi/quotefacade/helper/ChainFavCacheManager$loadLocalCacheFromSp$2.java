package com.kubi.quotefacade.helper;

import com.kubi.utils.C27099x;
import java.util.ArrayList;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ChainFavCacheManager.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.helper.ChainFavCacheManager$loadLocalCacheFromSp$2", m90122f = "ChainFavCacheManager.kt", m90123i = {0, 0, 0, 0}, m90124l = {202}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "I$0"})
@SourceDebugExtension({"SMAP\nChainFavCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainFavCacheManager.kt\ncom/kubi/quotefacade/helper/ChainFavCacheManager$loadLocalCacheFromSp$2\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,199:1\n196#2,3:200\n*S KotlinDebug\n*F\n+ 1 ChainFavCacheManager.kt\ncom/kubi/quotefacade/helper/ChainFavCacheManager$loadLocalCacheFromSp$2\n*L\n49#1:200,3\n*E\n"})
public final class ChainFavCacheManager$loadLocalCacheFromSp$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainDataListStr;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainFavCacheManager$loadLocalCacheFromSp$2(String str, Continuation<? super ChainFavCacheManager$loadLocalCacheFromSp$2> continuation) {
        super(2, continuation);
        this.$chainDataListStr = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChainFavCacheManager$loadLocalCacheFromSp$2 chainFavCacheManager$loadLocalCacheFromSp$2 = new ChainFavCacheManager$loadLocalCacheFromSp$2(this.$chainDataListStr, continuation);
        chainFavCacheManager$loadLocalCacheFromSp$2.L$0 = obj;
        return chainFavCacheManager$loadLocalCacheFromSp$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ChainFavCacheManager$loadLocalCacheFromSp$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            C27099x c27099x = C27099x.f54458a;
            String str = this.$chainDataListStr;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C22124xf41148d3(str, null)), C42911a.m94120b());
            this.L$0 = interfaceC41709m0;
            this.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
            this.L$2 = SpillingKt.nullOutSpilledVariable(str);
            this.I$0 = 0;
            this.label = 1;
            obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList != null && !arrayList.isEmpty()) {
            synchronized (interfaceC41709m0) {
                ChainFavCacheManager.f41922a.m51782t(CollectionsKt.take(arrayList, 100));
                Unit unit = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
