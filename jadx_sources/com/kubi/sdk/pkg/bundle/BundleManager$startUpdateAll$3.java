package com.kubi.sdk.pkg.bundle;

import android.content.Context;
import com.kubi.sdk.pkg.task.TaskStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44088g;

/* JADX INFO: compiled from: BundleManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3", m90122f = "BundleManager.kt", m90123i = {0, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 6, 6}, m90124l = {461, 465, 923, 565, 566, 575, 576}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", "$this$withContext", "pkgPlatformPlan", "cloudBatches", "$this$withLock_u24default$iv", "$this$withContext", "cloudBatches", "$this$withLock_u24default$iv", "semaphore", "normalStartGate", "pkgPlatformDeferred", "cloudCriticalTasks", "cloudCriticalScheduled", "$this$withContext", "cloudBatches", "$this$withLock_u24default$iv", "semaphore", "normalStartGate", "pkgPlatformDeferred", "cloudCriticalTasks", "$this$withLock_u24default$iv", "pkgPlatformDeferred", "$this$withLock_u24default$iv", "cloudStatuses"}, m90127s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nBundleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,891:1\n1603#2,9:892\n1855#2:901\n1856#2:903\n1612#2:904\n1603#2,9:905\n1855#2:914\n1856#2:916\n1612#2:917\n288#2,2:926\n1549#2:929\n1620#2,2:930\n1622#2:933\n1#3:902\n1#3:915\n1#3:932\n108#4,8:918\n117#4:928\n*S KotlinDebug\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3\n*L\n481#1:892,9\n481#1:901\n481#1:903\n481#1:904\n492#1:905,9\n492#1:914\n492#1:916\n492#1:917\n581#1:926,2\n519#1:929\n519#1:930,2\n519#1:933\n481#1:902\n492#1:915\n496#1:918,8\n496#1:928\n*E\n"})
public final class BundleManager$startUpdateAll$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Collection<String> $criticalBizList;
    final /* synthetic */ int $maxSemaphore;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleManager$startUpdateAll$3(Collection<String> collection, Context context, int i11, Continuation<? super BundleManager$startUpdateAll$3> continuation) {
        super(2, continuation);
        this.$criticalBizList = collection;
        this.$context = context;
        this.$maxSemaphore = i11;
    }

    /* JADX INFO: renamed from: a */
    public static final Pair<List<InterfaceC41729r0<TaskStatus>>, List<InterfaceC41729r0<Unit>>> m57493a(InterfaceC41709m0 interfaceC41709m0, InterfaceC44088g interfaceC44088g, Context context, List<String> list, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (String str : list) {
            InterfaceC41769w interfaceC41769wM91388c = null;
            if (z11) {
                interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
                arrayList.add(interfaceC41769wM91388c);
            }
            arrayList2.add(C41696j.m91102b(interfaceC41709m0, null, CoroutineStart.UNDISPATCHED, new BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1(interfaceC44088g, interfaceC41769wM91388c, context, str, null), 1, null));
        }
        return TuplesKt.m90091to(arrayList2, arrayList);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BundleManager$startUpdateAll$3 bundleManager$startUpdateAll$3 = new BundleManager$startUpdateAll$3(this.$criticalBizList, this.$context, this.$maxSemaphore, continuation);
        bundleManager$startUpdateAll$3.L$0 = obj;
        return bundleManager$startUpdateAll$3;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((BundleManager$startUpdateAll$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x010f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0153  */
    /* JADX WARN: Code duplicated, block: B:41:0x016f  */
    /* JADX WARN: Code duplicated, block: B:44:0x018e  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x022c  */
    /* JADX WARN: Code duplicated, block: B:60:0x028d  */
    /* JADX WARN: Code duplicated, block: B:61:0x028f  */
    /* JADX WARN: Code duplicated, block: B:64:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x0345 A[Catch: all -> 0x033d, TRY_LEAVE, TryCatch #3 {all -> 0x033d, blocks: (B:73:0x0301, B:74:0x0329, B:76:0x032f, B:82:0x0341, B:84:0x0345, B:70:0x02f1), top: B:97:0x02f1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v28 java.lang.Object, still in use, count: 2, list:
          (r2v28 java.lang.Object) from 0x0341: PHI (r2 I:??) = (r2v23 java.lang.Object), (r2v28 java.lang.Object) binds: [B:81:0x0340, B:78:0x033c] A[DONT_GENERATE, DONT_INLINE]
          (r2v28 java.lang.Object) from 0x0334: CHECK_CAST (com.kubi.sdk.pkg.task.TaskStatus) (r2v28 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
