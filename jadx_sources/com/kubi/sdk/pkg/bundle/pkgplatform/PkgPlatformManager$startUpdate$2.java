package com.kubi.sdk.pkg.bundle.pkgplatform;

import android.content.Context;
import com.kubi.sdk.pkg.config.PackConfigManager;
import com.kubi.sdk.pkg.task.DownloadPriority;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.util.C23985b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PkgPlatformManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager$startUpdate$2", m90122f = "PkgPlatformManager.kt", m90123i = {}, m90124l = {215}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nPkgPlatformManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkgPlatformManager.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager$startUpdate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,605:1\n2624#2,3:606\n*S KotlinDebug\n*F\n+ 1 PkgPlatformManager.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager$startUpdate$2\n*L\n206#1:606,3\n*E\n"})
public final class PkgPlatformManager$startUpdate$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ String $biz;
    final /* synthetic */ Context $context;
    final /* synthetic */ DownloadPriority $priority;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkgPlatformManager$startUpdate$2(String str, Context context, DownloadPriority downloadPriority, Continuation<? super PkgPlatformManager$startUpdate$2> continuation) {
        super(2, continuation);
        this.$biz = str;
        this.$context = context;
        this.$priority = downloadPriority;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PkgPlatformManager$startUpdate$2(this.$biz, this.$context, this.$priority, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((PkgPlatformManager$startUpdate$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        PackConfigManager packConfigManager = PackConfigManager.f47378a;
        if (!packConfigManager.m57692f()) {
            C23985b.f47489a.m57877e("pkgPlatform", "startUpdate[" + this.$biz + "] 包管理平台已禁用（enableBundleManagerServer=false），跳过");
            return TaskStatus.INSTANCE.result(1302, "包管理平台已禁用");
        }
        String strM57691e = packConfigManager.m57691e();
        if (strM57691e == null || strM57691e.length() == 0) {
            return TaskStatus.INSTANCE.result(1302, "包管理平台 baseUrl 未配置");
        }
        List mutableList = CollectionsKt.toMutableList((Collection) PkgPlatformManager.f47352a.m57621h(this.$context, this.$biz));
        String str = this.$biz;
        if (mutableList != null && mutableList.isEmpty()) {
            mutableList.add(new CalcBundleBundleItem(this.$biz, null, null, 6, null));
            break;
        }
        Iterator it = mutableList.iterator();
        do {
            if (!it.hasNext()) {
                mutableList.add(new CalcBundleBundleItem(this.$biz, null, null, 6, null));
                break;
            }
        } while (!Intrinsics.areEqual(((CalcBundleBundleItem) it.next()).getBiz(), str));
        C23985b.f47489a.m57877e("pkgPlatform", "startUpdate[" + this.$biz + "] 上报 bundles=" + mutableList + ", priority=" + this.$priority);
        PkgPlatformManager pkgPlatformManager = PkgPlatformManager.f47352a;
        Context context = this.$context;
        DownloadPriority downloadPriority = this.$priority;
        this.label = 1;
        Object objM57619q = PkgPlatformManager.m57619q(pkgPlatformManager, context, mutableList, null, downloadPriority, null, this, 16, null);
        return objM57619q == coroutine_suspended ? coroutine_suspended : objM57619q;
    }
}
