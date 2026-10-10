package com.kubi.quotefacade.rank;

import com.google.gson.Gson;
import com.kubi.quotefacade.helper.QuoteKV;
import com.kubi.utils.C27100x0;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: NewRankRedDotHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.rank.NewRankRedDotHelper$saveExposedSymbolToLocal$2", m90122f = "NewRankRedDotHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nNewRankRedDotHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewRankRedDotHelper.kt\ncom/kubi/quotefacade/rank/NewRankRedDotHelper$saveExposedSymbolToLocal$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,172:1\n126#2:173\n153#2,3:174\n23#3,2:177\n*S KotlinDebug\n*F\n+ 1 NewRankRedDotHelper.kt\ncom/kubi/quotefacade/rank/NewRankRedDotHelper$saveExposedSymbolToLocal$2\n*L\n159#1:173\n159#1:174,3\n164#1:177,2\n*E\n"})
public final class NewRankRedDotHelper$saveExposedSymbolToLocal$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, Long> $readSymbols;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewRankRedDotHelper$saveExposedSymbolToLocal$2(Map<String, Long> map, Continuation<? super NewRankRedDotHelper$saveExposedSymbolToLocal$2> continuation) {
        super(2, continuation);
        this.$readSymbols = map;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m52653f(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new NewRankRedDotHelper.ExposedBean((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
        }
        String json = new Gson().toJson(arrayList);
        C44128b.m97266j("NewRankRedDotHelper", "[save] jsonStr:" + json);
        StorageId<String> storageIdM52053m = QuoteKV.f42044a.m52053m();
        Intrinsics.checkNotNull(json);
        C46392a.m102333p(storageIdM52053m, json);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewRankRedDotHelper$saveExposedSymbolToLocal$2(this.$readSymbols, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((NewRankRedDotHelper$saveExposedSymbolToLocal$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final Map<String, Long> map = this.$readSymbols;
            C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewRankRedDotHelper$saveExposedSymbolToLocal$2.m52653f(map);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
