package com.kubi.sdk.pkg.hybird;

import android.content.Context;
import com.blankj.utilcode.util.NetworkUtils;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.util.C23989f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
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
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44082a;
import rg0.InterfaceC44088g;

/* JADX INFO: compiled from: HybridPackageManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Z"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.hybird.HybridPackageManager$updateAll$2", m90122f = "HybridPackageManager.kt", m90123i = {0, 0, 0, 1}, m90124l = {193, 108}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", "$this$withLock_u24default$iv", "isWifi", "$this$withLock_u24default$iv"}, m90127s = {"L$0", "L$1", "Z$0", "L$0"})
@SourceDebugExtension({"SMAP\nHybridPackageManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridPackageManager.kt\ncom/kubi/sdk/pkg/hybird/HybridPackageManager$updateAll$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n108#2,8:188\n117#2:206\n766#3:196\n857#3,2:197\n1549#3:199\n1620#3,3:200\n1726#3,3:203\n*S KotlinDebug\n*F\n+ 1 HybridPackageManager.kt\ncom/kubi/sdk/pkg/hybird/HybridPackageManager$updateAll$2\n*L\n88#1:188,8\n88#1:206\n92#1:196\n92#1:197,2\n102#1:199\n102#1:200,3\n109#1:203,3\n*E\n"})
public final class HybridPackageManager$updateAll$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $maxSemaphore;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HybridPackageManager$updateAll$2(int i11, Context context, Continuation<? super HybridPackageManager$updateAll$2> continuation) {
        super(2, continuation);
        this.$maxSemaphore = i11;
        this.$context = context;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        HybridPackageManager$updateAll$2 hybridPackageManager$updateAll$2 = new HybridPackageManager$updateAll$2(this.$maxSemaphore, this.$context, continuation);
        hybridPackageManager$updateAll$2.L$0 = obj;
        return hybridPackageManager$updateAll$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Boolean> continuation) {
        return ((HybridPackageManager$updateAll$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x016d, code lost:
    
        if (r2 == r0) goto L44;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        InterfaceC41709m0 interfaceC41709m0;
        boolean zM6065m;
        InterfaceC44082a interfaceC44082a;
        int i11;
        Context context;
        Object objM90345a;
        InterfaceC44082a interfaceC44082a2;
        Throwable th2;
        boolean z11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
                HybridVersionManager.f47398a.m57750j();
                if (!NetworkUtils.m6059g()) {
                    C23989f.m57884d(C23989f.f47493a, "offlinePackageDownload", "network is not available", null, 4, null);
                    HybridPackageManager.f47391a.m57720k(303, "网络不可用，不执行离线包更新逻辑");
                    return Boxing.boxBoolean(false);
                }
                if (HybridPackageManager.sourceSet.isEmpty()) {
                    C23989f.m57884d(C23989f.f47493a, "offlinePackageDownload", "not config data", null, 4, null);
                    HybridPackageManager.f47391a.m57720k(304, "没有配置数据，不执行离线包更新逻辑");
                    return Boxing.boxBoolean(false);
                }
                zM6065m = NetworkUtils.m6065m();
                InterfaceC44082a interfaceC44082a3 = HybridPackageManager.updateLock;
                int i13 = this.$maxSemaphore;
                Context context2 = this.$context;
                this.L$0 = interfaceC41709m0;
                this.L$1 = interfaceC44082a3;
                this.L$2 = context2;
                this.Z$0 = zM6065m;
                this.I$0 = i13;
                this.label = 1;
                if (interfaceC44082a3.mo91344d(null, this) != coroutine_suspended) {
                    interfaceC44082a = interfaceC44082a3;
                    i11 = i13;
                    context = context2;
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                i11 = this.I$0;
                zM6065m = this.Z$0;
                context = (Context) this.L$2;
                interfaceC44082a = (InterfaceC44082a) this.L$1;
                interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC44082a2 = (InterfaceC44082a) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    interfaceC44082a = interfaceC44082a2;
                    objM90345a = obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    interfaceC44082a2.mo91345e(null);
                    throw th2;
                }
            }
            List list = (List) objM90345a;
            if (list != null && list.isEmpty()) {
                z11 = true;
                break;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = true;
                    break;
                }
                if (!((TaskStatus) it.next()).m57807h()) {
                    z11 = false;
                    break;
                }
            }
            C23989f.f47493a.m57888e("offlinePackageDownload", "completed: " + z11);
            if (z11) {
                HybridPackageManager.m57712l(HybridPackageManager.f47391a, 200, null, 2, null);
            } else {
                HybridPackageManager.f47391a.m57720k(400, "子任务失败");
            }
            Boolean boolBoxBoolean = Boxing.boxBoolean(z11);
            interfaceC44082a.mo91345e(null);
            return boolBoxBoolean;
            InterfaceC44088g interfaceC44088gM57799i = TaskCommonKt.m57799i(i11);
            CopyOnWriteArraySet copyOnWriteArraySet = HybridPackageManager.sourceSet;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : copyOnWriteArraySet) {
                OfflineUrlInfo offlineUrlInfo = (OfflineUrlInfo) obj2;
                C23989f.f47493a.m57888e("offlinePackageConfig", "sourceSet packageName: " + offlineUrlInfo.getPackageName() + ", noWifiEnable:" + offlineUrlInfo.getNoWifiEnable() + ", biz: " + offlineUrlInfo.getBiz() + ", url:" + offlineUrlInfo.getUrl());
                if (offlineUrlInfo.getNoWifiEnable() || zM6065m) {
                    arrayList.add(obj2);
                } else {
                    HybridPackageManager.f47391a.m57720k(301, "非WIFI，不执行离线包更新逻辑");
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C41696j.m91102b(interfaceC41709m0, null, null, new HybridPackageManager$updateAll$2$1$status$2$1(interfaceC44088gM57799i, context, (OfflineUrlInfo) it2.next(), null), 3, null));
            }
            this.L$0 = interfaceC44082a;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            objM90345a = AwaitKt.m90345a(arrayList2, this);
        } catch (Throwable th4) {
            th2 = th4;
            interfaceC44082a2 = interfaceC44082a;
            interfaceC44082a2.mo91345e(null);
            throw th2;
        }
    }
}
