package com.kubi.sdk.pkg.bundle.pkgplatform;

import com.kubi.sdk.pkg.bundle.C23966s;
import com.kubi.sdk.pkg.bundle.StartupBundleBatches;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.util.C23985b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import kotlinx.coroutines.InterfaceC41769w;
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
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44088g;

/* JADX INFO: compiled from: PkgPlatformUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$startUpdate$2", m90122f = "PkgPlatformUpdateTask.kt", m90123i = {0, 0, 0, 1, 1, 1}, m90124l = {501, 503, 505}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", "batches", "criticalWaiters", "$this$withContext", "batches", "criticalWaiters"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nPkgPlatformUpdateTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkgPlatformUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$startUpdate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,627:1\n1549#2:628\n1620#2,3:629\n1549#2:632\n1620#2,3:633\n288#2,2:636\n1559#2:638\n1590#2,4:639\n*S KotlinDebug\n*F\n+ 1 PkgPlatformUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$startUpdate$2\n*L\n496#1:628\n496#1:629,3\n499#1:632\n499#1:633,3\n507#1:636,2\n464#1:638\n464#1:639,4\n*E\n"})
public final class PkgPlatformUpdateTask$startUpdate$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $beforeNormal;
    final /* synthetic */ InterfaceC44088g $concurrencySemaphore;
    final /* synthetic */ Function0<Unit> $onCriticalScheduled;
    final /* synthetic */ List<PkgPlatformUpdateTask.WorkItem> $workItems;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PkgPlatformUpdateTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PkgPlatformUpdateTask$startUpdate$2(List<PkgPlatformUpdateTask.WorkItem> list, PkgPlatformUpdateTask pkgPlatformUpdateTask, Function0<Unit> function0, Function1<? super Continuation<? super Unit>, ? extends Object> function1, InterfaceC44088g interfaceC44088g, Continuation<? super PkgPlatformUpdateTask$startUpdate$2> continuation) {
        super(2, continuation);
        this.$workItems = list;
        this.this$0 = pkgPlatformUpdateTask;
        this.$onCriticalScheduled = function0;
        this.$beforeNormal = function1;
        this.$concurrencySemaphore = interfaceC44088g;
    }

    /* JADX INFO: renamed from: a */
    public static final List<InterfaceC41729r0<TaskStatus>> m57663a(InterfaceC41709m0 interfaceC41709m0, InterfaceC44088g interfaceC44088g, PkgPlatformUpdateTask pkgPlatformUpdateTask, List<PkgPlatformUpdateTask.WorkItem> list, List<? extends InterfaceC41769w<Unit>> list2) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(C41696j.m91102b(interfaceC41709m0, null, CoroutineStart.UNDISPATCHED, new PkgPlatformUpdateTask$startUpdate$2$startBatch$1$1(interfaceC44088g, (PkgPlatformUpdateTask.WorkItem) obj, (InterfaceC41769w) CollectionsKt.getOrNull(list2, i11), pkgPlatformUpdateTask, null), 1, null));
            i11 = i12;
        }
        return arrayList;
    }

    public static /* synthetic */ List invokeSuspend$startBatch$default(InterfaceC41709m0 interfaceC41709m0, InterfaceC44088g interfaceC44088g, PkgPlatformUpdateTask pkgPlatformUpdateTask, List list, List list2, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return m57663a(interfaceC41709m0, interfaceC44088g, pkgPlatformUpdateTask, list, list2);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PkgPlatformUpdateTask$startUpdate$2 pkgPlatformUpdateTask$startUpdate$2 = new PkgPlatformUpdateTask$startUpdate$2(this.$workItems, this.this$0, this.$onCriticalScheduled, this.$beforeNormal, this.$concurrencySemaphore, continuation);
        pkgPlatformUpdateTask$startUpdate$2.L$0 = obj;
        return pkgPlatformUpdateTask$startUpdate$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((PkgPlatformUpdateTask$startUpdate$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0125, code lost:
    
        if (r14 == r0) goto L30;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC41709m0 interfaceC41709m0;
        StartupBundleBatches startupBundleBatches;
        List<InterfaceC41729r0<TaskStatus>> list;
        InterfaceC41709m0 interfaceC41709m1;
        StartupBundleBatches startupBundleBatches2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        Object obj2 = null;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    list = (List) this.L$2;
                    startupBundleBatches2 = (StartupBundleBatches) this.L$1;
                    InterfaceC41709m0 interfaceC41709m2 = (InterfaceC41709m0) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    interfaceC41709m1 = interfaceC41709m2;
                    List listPlus = CollectionsKt.plus((Collection) list, (Iterable) invokeSuspend$startBatch$default(interfaceC41709m1, this.$concurrencySemaphore, this.this$0, startupBundleBatches2.m57680b(), null, 16, null));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    obj = AwaitKt.m90345a(listPlus, this);
                }
            } else {
                list = (List) this.L$2;
                startupBundleBatches = (StartupBundleBatches) this.L$1;
                InterfaceC41709m0 interfaceC41709m3 = (InterfaceC41709m0) this.L$0;
                ResultKt.throwOnFailure(obj);
                interfaceC41709m0 = interfaceC41709m3;
            }
            for (Object obj3 : (List) obj) {
                TaskStatus taskStatus = (TaskStatus) obj3;
                if (!taskStatus.m57807h() && taskStatus.getCode() != 1303) {
                    obj2 = obj3;
                    break;
                }
            }
            TaskStatus taskStatus2 = (TaskStatus) obj2;
            if (taskStatus2 == null) {
                return TaskStatus.INSTANCE.getOK();
            }
            return taskStatus2;
        }
        ResultKt.throwOnFailure(obj);
        interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        StartupBundleBatches startupBundleBatchesM57685c = C23966s.m57685c(this.$workItems, this.this$0.criticalBizList, new Function1<PkgPlatformUpdateTask.WorkItem, String>() { // from class: com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$startUpdate$2$batches$1
            @Override // p852kotlin.jvm.functions.Function1
            @Nullable
            public final String invoke(@NotNull PkgPlatformUpdateTask.WorkItem it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getBundleInfo().getBiz();
            }
        });
        C23985b c23985b = C23985b.f47489a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("startUpdateAll 入队分组 critical=");
        List listM57679a = startupBundleBatchesM57685c.m57679a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM57679a, 10));
        Iterator it = listM57679a.iterator();
        while (it.hasNext()) {
            arrayList.add(((PkgPlatformUpdateTask.WorkItem) it.next()).getBundleInfo().getBiz());
        }
        sb2.append(arrayList);
        sb2.append(", normalCount=");
        sb2.append(startupBundleBatchesM57685c.m57680b().size());
        c23985b.m57877e("pkgPlatform", sb2.toString());
        List<PkgPlatformUpdateTask.WorkItem> listM57679a2 = startupBundleBatchesM57685c.m57679a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM57679a2, 10));
        for (PkgPlatformUpdateTask.WorkItem workItem : listM57679a2) {
            arrayList2.add(C41777y.m91388c(null, 1, null));
        }
        List<InterfaceC41729r0<TaskStatus>> listM57663a = m57663a(interfaceC41709m0, this.$concurrencySemaphore, this.this$0, startupBundleBatchesM57685c.m57679a(), arrayList2);
        this.L$0 = interfaceC41709m0;
        this.L$1 = startupBundleBatchesM57685c;
        this.L$2 = listM57663a;
        this.label = 1;
        if (AwaitKt.m90345a(arrayList2, this) != coroutine_suspended) {
            startupBundleBatches = startupBundleBatchesM57685c;
            list = listM57663a;
        }
        return coroutine_suspended;
        this.$onCriticalScheduled.invoke();
        Function1<Continuation<? super Unit>, Object> function1 = this.$beforeNormal;
        this.L$0 = interfaceC41709m0;
        this.L$1 = startupBundleBatches;
        this.L$2 = list;
        this.label = 2;
        if (function1.invoke(this) != coroutine_suspended) {
            interfaceC41709m1 = interfaceC41709m0;
            startupBundleBatches2 = startupBundleBatches;
            List listPlus2 = CollectionsKt.plus((Collection) list, (Iterable) invokeSuspend$startBatch$default(interfaceC41709m1, this.$concurrencySemaphore, this.this$0, startupBundleBatches2.m57680b(), null, 16, null));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
            obj = AwaitKt.m90345a(listPlus2, this);
        }
        return coroutine_suspended;
    }
}
