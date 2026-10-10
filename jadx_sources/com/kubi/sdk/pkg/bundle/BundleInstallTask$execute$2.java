package com.kubi.sdk.pkg.bundle;

import com.kubi.sdk.pkg.task.TaskStatus;
import com.tencent.liteav.TXLiteAVCode;
import java.io.IOException;
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

/* JADX INFO: compiled from: BundleInstallTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleInstallTask$execute$2", m90122f = "BundleInstallTask.kt", m90123i = {0, 0}, m90124l = {54, 96}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", "deployWorkInfoList"}, m90127s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nBundleInstallTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleInstallTask.kt\ncom/kubi/sdk/pkg/bundle/BundleInstallTask$execute$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,284:1\n766#2:285\n857#2,2:286\n1855#2,2:288\n1549#2:290\n1620#2,3:291\n288#2,2:294\n*S KotlinDebug\n*F\n+ 1 BundleInstallTask.kt\ncom/kubi/sdk/pkg/bundle/BundleInstallTask$execute$2\n*L\n47#1:285\n47#1:286,2\n54#1:288,2\n61#1:290\n61#1:291,3\n97#1:294,2\n*E\n"})
public final class BundleInstallTask$execute$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ BundleInstallTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleInstallTask$execute$2(BundleInstallTask bundleInstallTask, Continuation<? super BundleInstallTask$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = bundleInstallTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BundleInstallTask$execute$2 bundleInstallTask$execute$2 = new BundleInstallTask$execute$2(this.this$0, continuation);
        bundleInstallTask$execute$2.L$0 = obj;
        return bundleInstallTask$execute$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((BundleInstallTask$execute$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e9, code lost:
    
        if (r14 == r0) goto L36;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws IOException {
        List arrayList;
        BundleInstallTask bundleInstallTask;
        Iterator it;
        InterfaceC41709m0 interfaceC41709m0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        Object obj2 = null;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                it = (Iterator) this.L$3;
                bundleInstallTask = (BundleInstallTask) this.L$2;
                arrayList = (List) this.L$1;
                interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            for (Object obj3 : (List) obj) {
                if (!((TaskStatus) obj3).m57807h()) {
                    obj2 = obj3;
                    break;
                }
            }
            TaskStatus taskStatus = (TaskStatus) obj2;
            if (taskStatus == null) {
                return TaskStatus.INSTANCE.getOK();
            }
            return taskStatus;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m1 = (InterfaceC41709m0) this.L$0;
        List listM57433g = this.this$0.m57433g();
        if (listM57433g.isEmpty()) {
            return TaskStatus.INSTANCE.result(1302, "安装流程退出，没有安装包");
        }
        BundleInstallTask bundleInstallTask2 = this.this$0;
        arrayList = new ArrayList();
        for (Object obj4 : listM57433g) {
            if (!bundleInstallTask2.m57434h(((BundleInstallTask.C23924a) obj4).getBundleInfo())) {
                arrayList.add(obj4);
            }
        }
        bundleInstallTask = this.this$0;
        it = listM57433g.iterator();
        interfaceC41709m0 = interfaceC41709m1;
        while (it.hasNext()) {
            BundleInfo bundleInfo = ((BundleInstallTask.C23924a) it.next()).getBundleInfo();
            this.L$0 = interfaceC41709m0;
            this.L$1 = arrayList;
            this.L$2 = bundleInstallTask;
            this.L$3 = it;
            this.label = 1;
            if (bundleInstallTask.m57431e(bundleInfo, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (arrayList.isEmpty()) {
            return TaskStatus.INSTANCE.result(TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, "安装流程退出, 没有需要安装的包");
        }
        BundleInstallTask bundleInstallTask3 = this.this$0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C41696j.m91102b(interfaceC41709m0, null, null, new BundleInstallTask$execute$2$status$1$1(bundleInstallTask3, (BundleInstallTask.C23924a) it2.next(), null), 3, null));
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        obj = AwaitKt.m90345a(arrayList2, this);
    }
}
