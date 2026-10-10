package com.kubi.sdk.web.http;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: WebSsgPrefetch.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.web.http.WebSsgPrefetch$prefetchAll$2", m90122f = "WebSsgPrefetch.kt", m90123i = {}, m90124l = {81}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nWebSsgPrefetch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSsgPrefetch.kt\ncom/kubi/sdk/web/http/WebSsgPrefetch$prefetchAll$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,199:1\n1549#2:200\n1620#2,3:201\n*S KotlinDebug\n*F\n+ 1 WebSsgPrefetch.kt\ncom/kubi/sdk/web/http/WebSsgPrefetch$prefetchAll$2\n*L\n70#1:200\n70#1:201,3\n*E\n"})
public final class WebSsgPrefetch$prefetchAll$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ List<String> $urlList;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSsgPrefetch$prefetchAll$2(List<String> list, Context context, Continuation<? super WebSsgPrefetch$prefetchAll$2> continuation) {
        super(2, continuation);
        this.$urlList = list;
        this.$context = context;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        WebSsgPrefetch$prefetchAll$2 webSsgPrefetch$prefetchAll$2 = new WebSsgPrefetch$prefetchAll$2(this.$urlList, this.$context, continuation);
        webSsgPrefetch$prefetchAll$2.L$0 = obj;
        return webSsgPrefetch$prefetchAll$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
        return ((WebSsgPrefetch$prefetchAll$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
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
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            List<String> list = this.$urlList;
            Context context = this.$context;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C41696j.m91102b(interfaceC41709m0, null, null, new WebSsgPrefetch$prefetchAll$2$tasks$1$1((String) it.next(), context, null), 3, null));
            }
            this.label = 1;
            if (AwaitKt.m90345a(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
