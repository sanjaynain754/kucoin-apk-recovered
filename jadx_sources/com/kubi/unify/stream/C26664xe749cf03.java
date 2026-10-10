package com.kubi.unify.stream;

import com.kubi.unify.entity.UnifyAdlRankEntity;
import com.kubi.unify.entity.UnifyAdlRankRequest;
import com.kubi.unify.entity.UnifyAdlRankRequestItem;
import i60.InterfaceC38460c;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositionsInterval$1$adlResult$1 */
/* JADX INFO: compiled from: UnifyNetworkDataSourceImpl.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", "", "", "Ljava/math/BigDecimal;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositionsInterval$1$adlResult$1", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {}, m90124l = {173}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nUnifyNetworkDataSourceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositionsInterval$1$adlResult$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,520:1\n1193#2,2:521\n1267#2,4:523\n*S KotlinDebug\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositionsInterval$1$adlResult$1\n*L\n173#1:521,2\n173#1:523,4\n*E\n"})
public final class C26664xe749cf03 extends SuspendLambda implements Function1<Continuation<? super Map<String, ? extends BigDecimal>>, Object> {
    final /* synthetic */ List<UnifyAdlRankRequestItem> $adlList;
    int label;
    final /* synthetic */ UnifyNetworkDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26664xe749cf03(UnifyNetworkDataSourceImpl unifyNetworkDataSourceImpl, List<UnifyAdlRankRequestItem> list, Continuation<? super C26664xe749cf03> continuation) {
        super(1, continuation);
        this.this$0 = unifyNetworkDataSourceImpl;
        this.$adlList = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new C26664xe749cf03(this.this$0, this.$adlList, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Map<String, ? extends BigDecimal>> continuation) {
        return ((C26664xe749cf03) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
            InterfaceC38460c interfaceC38460c = this.this$0.f53375a;
            UnifyAdlRankRequest unifyAdlRankRequest = new UnifyAdlRankRequest(this.$adlList);
            this.label = 1;
            obj = interfaceC38460c.m86739f(unifyAdlRankRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Iterable<UnifyAdlRankEntity> iterable = (Iterable) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (UnifyAdlRankEntity unifyAdlRankEntity : iterable) {
            Pair pairM90091to = TuplesKt.m90091to(unifyAdlRankEntity.getSymbol(), unifyAdlRankEntity.getAdlPercentage());
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        return linkedHashMap;
    }
}
