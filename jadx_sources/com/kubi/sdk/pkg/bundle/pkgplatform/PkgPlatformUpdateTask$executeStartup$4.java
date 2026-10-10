package com.kubi.sdk.pkg.bundle.pkgplatform;

import com.kubi.sdk.pkg.bundle.i18n.RnI18nManager;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.tencent.liteav.TXLiteAVCode;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44088g;

/* JADX INFO: compiled from: PkgPlatformUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$executeStartup$4", m90122f = "PkgPlatformUpdateTask.kt", m90123i = {0, 0, 1, 1, 2, 2}, m90124l = {135, 141, 144}, m90125m = "invokeSuspend", m90126n = {"data", "updateItems", "data", "updateItems", "data", "updateItems"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nPkgPlatformUpdateTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkgPlatformUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeStartup$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,627:1\n1855#2,2:628\n*S KotlinDebug\n*F\n+ 1 PkgPlatformUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeStartup$4\n*L\n120#1:628,2\n*E\n"})
public final class PkgPlatformUpdateTask$executeStartup$4 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $beforeNormal;
    final /* synthetic */ InterfaceC44088g $concurrencySemaphore;
    final /* synthetic */ Function0<Unit> $onCriticalScheduled;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PkgPlatformUpdateTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PkgPlatformUpdateTask$executeStartup$4(PkgPlatformUpdateTask pkgPlatformUpdateTask, Function0<Unit> function0, Function1<? super Continuation<? super Unit>, ? extends Object> function1, InterfaceC44088g interfaceC44088g, Continuation<? super PkgPlatformUpdateTask$executeStartup$4> continuation) {
        super(2, continuation);
        this.this$0 = pkgPlatformUpdateTask;
        this.$onCriticalScheduled = function0;
        this.$beforeNormal = function1;
        this.$concurrencySemaphore = interfaceC44088g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PkgPlatformUpdateTask$executeStartup$4(this.this$0, this.$onCriticalScheduled, this.$beforeNormal, this.$concurrencySemaphore, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((PkgPlatformUpdateTask$executeStartup$4) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List<PkgBundleUpdateItem> update;
        CalcBundleData calcBundleData;
        List<PkgBundleUpdateItem> list;
        Object objM57659y;
        CalcBundleData calcBundleData2;
        List<PkgBasicDep> subPackages;
        TaskStatus taskStatusResult;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            CalcBundleData data = this.this$0.response.getData();
            update = data != null ? data.getUpdate() : null;
            if (update != null) {
                for (PkgBundleUpdateItem pkgBundleUpdateItem : update) {
                    String biz = pkgBundleUpdateItem.getBiz();
                    if (biz != null && (subPackages = pkgBundleUpdateItem.getSubPackages()) != null && !subPackages.isEmpty()) {
                        String version = pkgBundleUpdateItem.getVersion();
                        if (version == null) {
                            version = null;
                        } else if (pkgBundleUpdateItem.getBuildNo() > 0) {
                            version = version + '-' + pkgBundleUpdateItem.getBuildNo();
                        }
                        if (version != null) {
                            SubPackageRegistry.f47367a.m57675k(biz, version, subPackages);
                        }
                    }
                }
            }
            if (update == null || update.isEmpty()) {
                this.$onCriticalScheduled.invoke();
                Function1<Continuation<? super Unit>, Object> function1 = this.$beforeNormal;
                this.L$0 = data;
                this.L$1 = update;
                this.label = 1;
                if (function1.invoke(this) != coroutine_suspended) {
                    calcBundleData = data;
                    list = update;
                    taskStatusResult = TaskStatus.INSTANCE.result(TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, "包管理平台：没有需要更新的包");
                }
            } else {
                List listM57649l = this.this$0.m57649l(update);
                if (listM57649l.isEmpty()) {
                    this.$onCriticalScheduled.invoke();
                    Function1<Continuation<? super Unit>, Object> function2 = this.$beforeNormal;
                    this.L$0 = data;
                    this.L$1 = update;
                    this.label = 2;
                    if (function2.invoke(this) != coroutine_suspended) {
                        calcBundleData = data;
                        list = update;
                        taskStatusResult = TaskStatus.INSTANCE.result(TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, "包管理平台：本地已是最新，无需下载");
                    }
                } else {
                    PkgPlatformUpdateTask pkgPlatformUpdateTask = this.this$0;
                    Function0<Unit> function0 = this.$onCriticalScheduled;
                    Function1<Continuation<? super Unit>, Object> function3 = this.$beforeNormal;
                    InterfaceC44088g interfaceC44088g = this.$concurrencySemaphore;
                    this.L$0 = data;
                    this.L$1 = update;
                    this.label = 3;
                    objM57659y = pkgPlatformUpdateTask.m57659y(listM57649l, function0, function3, interfaceC44088g, this);
                    if (objM57659y != coroutine_suspended) {
                        calcBundleData2 = data;
                        calcBundleData = calcBundleData2;
                        taskStatusResult = (TaskStatus) objM57659y;
                        list = update;
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            list = (List) this.L$1;
            calcBundleData = (CalcBundleData) this.L$0;
            ResultKt.throwOnFailure(obj);
            taskStatusResult = TaskStatus.INSTANCE.result(TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, "包管理平台：没有需要更新的包");
        } else if (i11 == 2) {
            list = (List) this.L$1;
            calcBundleData = (CalcBundleData) this.L$0;
            ResultKt.throwOnFailure(obj);
            taskStatusResult = TaskStatus.INSTANCE.result(TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, "包管理平台：本地已是最新，无需下载");
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<PkgBundleUpdateItem> list2 = (List) this.L$1;
            calcBundleData2 = (CalcBundleData) this.L$0;
            ResultKt.throwOnFailure(obj);
            update = list2;
            objM57659y = obj;
            calcBundleData = calcBundleData2;
            taskStatusResult = (TaskStatus) objM57659y;
            list = update;
        }
        List<String> listM57658x = this.this$0.m57658x(calcBundleData != null ? calcBundleData.getDelete() : null);
        RnI18nManager.f47318a.m57559d(this.this$0.context, PkgPlatformUpdateTaskKt.m57664a(calcBundleData != null ? calcBundleData.getDelete() : null, list));
        return !listM57658x.isEmpty() ? TaskStatus.INSTANCE.rollback(listM57658x) : taskStatusResult;
    }
}
