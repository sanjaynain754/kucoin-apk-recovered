package com.kubi.sdk.pkg.bundle;

import com.kubi.sdk.pkg.task.TaskStatus;
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

/* JADX INFO: compiled from: BundleUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleUpdateTask$startUpdate$2", m90122f = "BundleUpdateTask.kt", m90123i = {}, m90124l = {137}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nBundleUpdateTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/BundleUpdateTask$startUpdate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n1549#2:234\n1620#2,3:235\n288#2,2:238\n*S KotlinDebug\n*F\n+ 1 BundleUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/BundleUpdateTask$startUpdate$2\n*L\n84#1:234\n84#1:235,3\n138#1:238,2\n*E\n"})
public final class BundleUpdateTask$startUpdate$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ List<BundleUpdateTask.C23933a> $workInfoList;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BundleUpdateTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdateTask$startUpdate$2(List<BundleUpdateTask.C23933a> list, BundleUpdateTask bundleUpdateTask, Continuation<? super BundleUpdateTask$startUpdate$2> continuation) {
        super(2, continuation);
        this.$workInfoList = list;
        this.this$0 = bundleUpdateTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BundleUpdateTask$startUpdate$2 bundleUpdateTask$startUpdate$2 = new BundleUpdateTask$startUpdate$2(this.$workInfoList, this.this$0, continuation);
        bundleUpdateTask$startUpdate$2.L$0 = obj;
        return bundleUpdateTask$startUpdate$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((BundleUpdateTask$startUpdate$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        Object obj2 = null;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            List<BundleUpdateTask.C23933a> list = this.$workInfoList;
            BundleUpdateTask bundleUpdateTask = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C41696j.m91102b(interfaceC41709m0, null, CoroutineStart.UNDISPATCHED, new BundleUpdateTask$startUpdate$2$waiters$1$1((BundleUpdateTask.C23933a) it.next(), bundleUpdateTask, null), 1, null));
            }
            this.this$0.m57505k();
            this.label = 1;
            obj = AwaitKt.m90345a(arrayList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
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
}
