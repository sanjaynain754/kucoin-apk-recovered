package com.kubi.assets.unify;

import com.kubi.data.entity.CoinInfoEntity;
import gf.C37890n;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: UnifiedAssetListExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/data/entity/CoinInfoEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.unify.UnifiedAssetListExtKt$fetchCoinList$2", m90122f = "UnifiedAssetListExt.kt", m90123i = {0}, m90124l = {116}, m90125m = "invokeSuspend", m90126n = {"$i$f$suspendCancellableCoroutine"}, m90127s = {"I$0"})
@SourceDebugExtension({"SMAP\nUnifiedAssetListExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifiedAssetListExt.kt\ncom/kubi/assets/unify/UnifiedAssetListExtKt$fetchCoinList$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,115:1\n426#2,11:116\n*S KotlinDebug\n*F\n+ 1 UnifiedAssetListExt.kt\ncom/kubi/assets/unify/UnifiedAssetListExtKt$fetchCoinList$2\n*L\n105#1:116,11\n*E\n"})
public final class UnifiedAssetListExtKt$fetchCoinList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends CoinInfoEntity>>, Object> {
    int I$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.assets.unify.UnifiedAssetListExtKt$fetchCoinList$2$a */
    /* JADX INFO: compiled from: UnifiedAssetListExt.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11135a<T> implements Consumer {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41708m<List<? extends CoinInfoEntity>> f18935b;

        /* JADX WARN: Multi-variable type inference failed */
        public C11135a(InterfaceC41708m<? super List<? extends CoinInfoEntity>> interfaceC41708m) {
            this.f18935b = interfaceC41708m;
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(List<? extends CoinInfoEntity> list) {
            InterfaceC41708m<List<? extends CoinInfoEntity>> interfaceC41708m = this.f18935b;
            Result.Companion companion = Result.INSTANCE;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            interfaceC41708m.resumeWith(Result.m103844constructorimpl(list));
        }
    }

    public UnifiedAssetListExtKt$fetchCoinList$2(Continuation<? super UnifiedAssetListExtKt$fetchCoinList$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifiedAssetListExtKt$fetchCoinList$2(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends CoinInfoEntity>> continuation) {
        return ((UnifiedAssetListExtKt$fetchCoinList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.I$0 = 0;
        this.label = 1;
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
        c41716o.m91142E();
        C37890n.f85269a.mo85595j(new C11135a(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        if (objM91171w == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM91171w;
    }
}
