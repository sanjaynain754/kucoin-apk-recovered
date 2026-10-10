package com.kubi.sdk.pkg.bundle.pkgplatform;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.pkg.task.TaskStatus;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import rg0.InterfaceC44088g;

/* JADX INFO: compiled from: PkgPlatformManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJO\u0010\u0013\u001a\u00020\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u001e\b\u0002\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformStartupPlan;", "", "", "", "updateBizList", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;", "updateTask", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "prepareStatus", "<init>", "(Ljava/util/Set;Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Lcom/kubi/sdk/pkg/task/TaskStatus;)V", "Lkotlin/Function0;", "", "onCriticalScheduled", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "beforeNormal", "Lrg0/g;", "concurrencySemaphore", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "b", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class PkgPlatformStartupPlan {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Set<String> updateBizList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final PkgPlatformUpdateTask updateTask;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final TaskStatus prepareStatus;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PkgPlatformStartupPlan)) {
            return false;
        }
        PkgPlatformStartupPlan pkgPlatformStartupPlan = (PkgPlatformStartupPlan) other;
        return Intrinsics.areEqual(this.updateBizList, pkgPlatformStartupPlan.updateBizList) && Intrinsics.areEqual(this.updateTask, pkgPlatformStartupPlan.updateTask) && Intrinsics.areEqual(this.prepareStatus, pkgPlatformStartupPlan.prepareStatus);
    }

    public PkgPlatformStartupPlan(@NotNull Set<String> updateBizList, @Nullable PkgPlatformUpdateTask pkgPlatformUpdateTask, @NotNull TaskStatus prepareStatus) {
        Intrinsics.checkNotNullParameter(updateBizList, "updateBizList");
        Intrinsics.checkNotNullParameter(prepareStatus, "prepareStatus");
        this.updateBizList = updateBizList;
        this.updateTask = pkgPlatformUpdateTask;
        this.prepareStatus = prepareStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m57632b(PkgPlatformStartupPlan pkgPlatformStartupPlan, Function0 function0, Function1 function1, InterfaceC44088g interfaceC44088g, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = new Function0<Unit>() { // from class: com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformStartupPlan$execute$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // p852kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i11 & 2) != 0) {
            function1 = new PkgPlatformStartupPlan$execute$3(null);
        }
        if ((i11 & 4) != 0) {
            interfaceC44088g = null;
        }
        return pkgPlatformStartupPlan.m57633a(function0, function1, interfaceC44088g, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m57633a(@NotNull Function0<Unit> function0, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @Nullable InterfaceC44088g interfaceC44088g, @NotNull Continuation<? super TaskStatus> continuation) {
        PkgPlatformStartupPlan$execute$1 pkgPlatformStartupPlan$execute$1;
        PkgPlatformStartupPlan pkgPlatformStartupPlan;
        if (continuation instanceof PkgPlatformStartupPlan$execute$1) {
            pkgPlatformStartupPlan$execute$1 = (PkgPlatformStartupPlan$execute$1) continuation;
            int i11 = pkgPlatformStartupPlan$execute$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pkgPlatformStartupPlan$execute$1.label = i11 - Integer.MIN_VALUE;
            } else {
                pkgPlatformStartupPlan$execute$1 = new PkgPlatformStartupPlan$execute$1(this, continuation);
            }
        } else {
            pkgPlatformStartupPlan$execute$1 = new PkgPlatformStartupPlan$execute$1(this, continuation);
        }
        Object obj = pkgPlatformStartupPlan$execute$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = pkgPlatformStartupPlan$execute$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            PkgPlatformUpdateTask pkgPlatformUpdateTask = this.updateTask;
            if (pkgPlatformUpdateTask == null) {
                function0.invoke();
                pkgPlatformStartupPlan$execute$1.L$0 = this;
                pkgPlatformStartupPlan$execute$1.label = 1;
                if (function1.invoke(pkgPlatformStartupPlan$execute$1) != coroutine_suspended) {
                    pkgPlatformStartupPlan = this;
                }
            } else {
                pkgPlatformStartupPlan$execute$1.label = 2;
                Object objM57656u = pkgPlatformUpdateTask.m57656u(function0, function1, interfaceC44088g, pkgPlatformStartupPlan$execute$1);
                if (objM57656u != coroutine_suspended) {
                    return objM57656u;
                }
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        pkgPlatformStartupPlan = (PkgPlatformStartupPlan) pkgPlatformStartupPlan$execute$1.L$0;
        ResultKt.throwOnFailure(obj);
        return pkgPlatformStartupPlan.prepareStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<String> m57634c() {
        return this.updateBizList;
    }

    public int hashCode() {
        int iHashCode = this.updateBizList.hashCode() * 31;
        PkgPlatformUpdateTask pkgPlatformUpdateTask = this.updateTask;
        return ((iHashCode + (pkgPlatformUpdateTask == null ? 0 : pkgPlatformUpdateTask.hashCode())) * 31) + this.prepareStatus.hashCode();
    }

    @NotNull
    public String toString() {
        return "PkgPlatformStartupPlan(updateBizList=" + this.updateBizList + ", updateTask=" + this.updateTask + ", prepareStatus=" + this.prepareStatus + ')';
    }
}
