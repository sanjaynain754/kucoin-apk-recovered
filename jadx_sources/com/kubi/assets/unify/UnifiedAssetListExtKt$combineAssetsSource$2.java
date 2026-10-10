package com.kubi.assets.unify;

import com.kubi.assets.entity.UnifiedAssetsEntity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: UnifiedAssetListExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "resp", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/UnifiedAssetsEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.unify.UnifiedAssetListExtKt$combineAssetsSource$2", m90122f = "UnifiedAssetListExt.kt", m90123i = {0}, m90124l = {29}, m90125m = "invokeSuspend", m90126n = {"resp"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nUnifiedAssetListExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifiedAssetListExt.kt\ncom/kubi/assets/unify/UnifiedAssetListExtKt$combineAssetsSource$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1068#2:116\n*S KotlinDebug\n*F\n+ 1 UnifiedAssetListExt.kt\ncom/kubi/assets/unify/UnifiedAssetListExtKt$combineAssetsSource$2\n*L\n30#1:116\n*E\n"})
public final class UnifiedAssetListExtKt$combineAssetsSource$2 extends SuspendLambda implements Function2<ArrayList<UnifiedAssetsEntity>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<ArrayList<UnifiedAssetsEntity>, Unit> $callback;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: com.kubi.assets.unify.UnifiedAssetListExtKt$combineAssetsSource$2$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 UnifiedAssetListExt.kt\ncom/kubi/assets/unify/UnifiedAssetListExtKt$combineAssetsSource$2\n*L\n1#1,328:1\n30#2:329\n*E\n"})
    public static final class C11134a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal bigDecimalAbs;
            BigDecimal bigDecimalAbs2;
            UnifiedAssetsEntity unifiedAssetsEntity = (UnifiedAssetsEntity) t12;
            BigDecimal equity = unifiedAssetsEntity.getEquity();
            if (equity == null || (bigDecimalAbs = new BigDecimal(String.valueOf(C41014a.m89940n(equity, unifiedAssetsEntity.getCurrency()))).abs()) == null) {
                bigDecimalAbs = BigDecimal.ZERO;
            }
            UnifiedAssetsEntity unifiedAssetsEntity2 = (UnifiedAssetsEntity) t11;
            BigDecimal equity2 = unifiedAssetsEntity2.getEquity();
            if (equity2 == null || (bigDecimalAbs2 = new BigDecimal(String.valueOf(C41014a.m89940n(equity2, unifiedAssetsEntity2.getCurrency()))).abs()) == null) {
                bigDecimalAbs2 = BigDecimal.ZERO;
            }
            return ComparisonsKt.compareValues(bigDecimalAbs, bigDecimalAbs2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnifiedAssetListExtKt$combineAssetsSource$2(Function1<? super ArrayList<UnifiedAssetsEntity>, Unit> function1, Continuation<? super UnifiedAssetListExtKt$combineAssetsSource$2> continuation) {
        super(2, continuation);
        this.$callback = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnifiedAssetListExtKt$combineAssetsSource$2 unifiedAssetListExtKt$combineAssetsSource$2 = new UnifiedAssetListExtKt$combineAssetsSource$2(this.$callback, continuation);
        unifiedAssetListExtKt$combineAssetsSource$2.L$0 = obj;
        return unifiedAssetListExtKt$combineAssetsSource$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(ArrayList<UnifiedAssetsEntity> arrayList, Continuation<? super Unit> continuation) {
        return ((UnifiedAssetListExtKt$combineAssetsSource$2) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        ArrayList arrayList = (ArrayList) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Function1<ArrayList<UnifiedAssetsEntity>, Unit> function2 = this.$callback;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.sortedWith(arrayList, new C11134a()));
            this.L$0 = SpillingKt.nullOutSpilledVariable(arrayList);
            this.L$1 = function2;
            this.label = 1;
            Object objM19720f = UnifiedAssetListExtKt.m19720f(arrayList2, this);
            if (objM19720f == coroutine_suspended) {
                return coroutine_suspended;
            }
            function1 = function2;
            obj = objM19720f;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) this.L$1;
            ResultKt.throwOnFailure(obj);
        }
        function1.invoke(obj);
        return Unit.INSTANCE;
    }
}
