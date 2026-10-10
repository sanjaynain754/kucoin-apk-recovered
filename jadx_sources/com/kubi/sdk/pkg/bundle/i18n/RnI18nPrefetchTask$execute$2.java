package com.kubi.sdk.pkg.bundle.i18n;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineStart;
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

/* JADX INFO: compiled from: RnI18nPrefetchTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Ljava/util/List;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.i18n.RnI18nPrefetchTask$execute$2", m90122f = "RnI18nPrefetchTask.kt", m90123i = {}, m90124l = {57}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nRnI18nPrefetchTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnI18nPrefetchTask.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$execute$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n1549#2:162\n1620#2,3:163\n*S KotlinDebug\n*F\n+ 1 RnI18nPrefetchTask.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$execute$2\n*L\n50#1:162\n50#1:163,3\n*E\n"})
public final class RnI18nPrefetchTask$execute$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends Unit>>, Object> {
    final /* synthetic */ List<RnI18nPrefetchTask.DownloadItem> $items;
    final /* synthetic */ RnI18nLocaleContext $locale;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RnI18nPrefetchTask this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends Unit>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<Unit>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RnI18nPrefetchTask$execute$2(List<RnI18nPrefetchTask.DownloadItem> list, RnI18nPrefetchTask rnI18nPrefetchTask, RnI18nLocaleContext rnI18nLocaleContext, Continuation<? super RnI18nPrefetchTask$execute$2> continuation) {
        super(2, continuation);
        this.$items = list;
        this.this$0 = rnI18nPrefetchTask;
        this.$locale = rnI18nLocaleContext;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RnI18nPrefetchTask$execute$2 rnI18nPrefetchTask$execute$2 = new RnI18nPrefetchTask$execute$2(this.$items, this.this$0, this.$locale, continuation);
        rnI18nPrefetchTask$execute$2.L$0 = obj;
        return rnI18nPrefetchTask$execute$2;
    }

    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super List<Unit>> continuation) {
        return ((RnI18nPrefetchTask$execute$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
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
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        List<RnI18nPrefetchTask.DownloadItem> list = this.$items;
        RnI18nPrefetchTask rnI18nPrefetchTask = this.this$0;
        RnI18nLocaleContext rnI18nLocaleContext = this.$locale;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C41696j.m91102b(interfaceC41709m0, null, CoroutineStart.UNDISPATCHED, new RnI18nPrefetchTask$execute$2$1$1(rnI18nPrefetchTask, (RnI18nPrefetchTask.DownloadItem) it.next(), rnI18nLocaleContext, null), 1, null));
        }
        this.label = 1;
        Object objM90345a = AwaitKt.m90345a(arrayList, this);
        if (objM90345a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM90345a;
    }
}
