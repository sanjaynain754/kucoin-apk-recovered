package com.kubi.quotefacade.market.spot;

import com.kubi.quotefacade.entity.MarketMenuEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: QuoteSpotFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.market.spot.QuoteSpotFragment$setData$1", m90122f = "QuoteSpotFragment.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m90124l = {118, 140}, m90125m = "invokeSuspend", m90126n = {"spotMenu", "list", "$this$forEachIndexed$iv", "item$iv", "spotLevel1", "$i$a$-let-QuoteSpotFragment$setData$1$1", "$i$f$forEachIndexed", "index$iv", "index", "$i$a$-forEachIndexed-QuoteSpotFragment$setData$1$1$2", "spotMenu", "list", "it", "it1", "$i$a$-let-QuoteSpotFragment$setData$1$1", "$i$a$-let-QuoteSpotFragment$setData$1$1$3", "$i$a$-let-QuoteSpotFragment$setData$1$1$3$1"}, m90127s = {"L$0", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2"})
@SourceDebugExtension({"SMAP\nQuoteSpotFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteSpotFragment.kt\ncom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n774#2:306\n865#2,2:307\n1878#2,3:309\n1#3:312\n*S KotlinDebug\n*F\n+ 1 QuoteSpotFragment.kt\ncom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1\n*L\n115#1:306\n115#1:307,2\n116#1:309,3\n*E\n"})
public final class QuoteSpotFragment$setData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ MarketMenuEntity $marketMenuEntity;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ QuoteSpotFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteSpotFragment$setData$1(MarketMenuEntity marketMenuEntity, QuoteSpotFragment quoteSpotFragment, Continuation<? super QuoteSpotFragment$setData$1> continuation) {
        super(2, continuation);
        this.$marketMenuEntity = marketMenuEntity;
        this.this$0 = quoteSpotFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuoteSpotFragment$setData$1(this.$marketMenuEntity, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((QuoteSpotFragment$setData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:38:0x010f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x010f -> B:39:0x0111). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0188 -> B:51:0x01a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.quotefacade.market.spot.QuoteSpotFragment$setData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
