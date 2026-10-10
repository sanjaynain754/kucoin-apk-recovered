package com.kubi.sdk.pkg.bundle.pkgplatform;

import android.content.Context;
import com.kubi.sdk.pkg.config.PackConfigManager;
import com.kubi.sdk.pkg.task.DownloadPriority;
import com.kubi.sdk.pkg.task.TaskException;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.pkg.util.PackageException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: PkgPlatformManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformStartupPlan;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformStartupPlan;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager$prepareStartUpdateAll$2", m90122f = "PkgPlatformManager.kt", m90123i = {0}, m90124l = {137}, m90125m = "invokeSuspend", m90126n = {"reportedBundles"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nPkgPlatformManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkgPlatformManager.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager$prepareStartUpdateAll$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n*L\n1#1,605:1\n1603#2,9:606\n1855#2:615\n1856#2:618\n1612#2:619\n1#3:616\n1#3:617\n22#4,2:620\n*S KotlinDebug\n*F\n+ 1 PkgPlatformManager.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager$prepareStartUpdateAll$2\n*L\n154#1:606,9\n154#1:615\n154#1:618\n154#1:619\n154#1:617\n171#1:620,2\n*E\n"})
public final class PkgPlatformManager$prepareStartUpdateAll$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super PkgPlatformStartupPlan>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Collection<String> $criticalBizList;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkgPlatformManager$prepareStartUpdateAll$2(Context context, Collection<String> collection, Continuation<? super PkgPlatformManager$prepareStartUpdateAll$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$criticalBizList = collection;
    }

    /* JADX INFO: renamed from: a */
    public static final PkgPlatformStartupPlan m57631a(TaskStatus taskStatus) {
        return new PkgPlatformStartupPlan(SetsKt.emptySet(), null, taskStatus);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PkgPlatformManager$prepareStartUpdateAll$2(this.$context, this.$criticalBizList, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super PkgPlatformStartupPlan> continuation) {
        return ((PkgPlatformManager$prepareStartUpdateAll$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objM57606b;
        List list;
        String string;
        List<CalcBundleDeleteItem> delete;
        List<PkgBundleUpdateItem> update;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                PackConfigManager packConfigManager = PackConfigManager.f47378a;
                if (!packConfigManager.m57692f()) {
                    C23985b.f47489a.m57877e("pkgPlatform", "startUpdateAll 包管理平台已禁用（enableBundleManagerServer=false），跳过");
                    return m57631a(TaskStatus.INSTANCE.result(1302, "包管理平台已禁用"));
                }
                String strM57691e = packConfigManager.m57691e();
                if (strM57691e == null || strM57691e.length() == 0) {
                    return m57631a(TaskStatus.INSTANCE.result(1302, "包管理平台 baseUrl 未配置"));
                }
                List listM57615i = PkgPlatformManager.m57615i(PkgPlatformManager.f47352a, this.$context, null, 2, null);
                C23985b.f47489a.m57877e("pkgPlatform", "startUpdateAll 上报 " + listM57615i.size() + " 个 main bundle");
                String str = !listM57615i.isEmpty() ? "SUPPLE" : null;
                String strM57690d = packConfigManager.m57690d();
                if (strM57690d == null) {
                    strM57690d = "";
                }
                CalcBundleRequest calcBundleRequest = new CalcBundleRequest(strM57690d, null, str, listM57615i, 2, null);
                PkgPlatformClient pkgPlatformClient = PkgPlatformClient.f47350a;
                this.L$0 = listM57615i;
                this.label = 1;
                objM57606b = pkgPlatformClient.m57606b(calcBundleRequest, this);
                if (objM57606b == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = listM57615i;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list2 = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                objM57606b = obj;
                list = list2;
            }
            CalcBundleResponse calcBundleResponse = (CalcBundleResponse) objM57606b;
            if (!calcBundleResponse.getSuccess()) {
                C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "prepareStartUpdateAll 服务端返回失败: code=" + calcBundleResponse.getCode(), null, 4, null);
                return m57631a(TaskStatus.INSTANCE.result(1501, "包管理平台返回失败: code=" + calcBundleResponse.getCode()));
            }
            CalcBundleData data = calcBundleResponse.getData();
            C23985b c23985b = C23985b.f47489a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("prepareStartUpdateAll update=");
            int size = 0;
            sb2.append((data == null || (update = data.getUpdate()) == null) ? 0 : update.size());
            sb2.append(", delete=");
            if (data != null && (delete = data.getDelete()) != null) {
                size = delete.size();
            }
            sb2.append(size);
            c23985b.m57877e("pkgPlatform", sb2.toString());
            PkgPlatformManager.f47352a.m57628t(this.$context, data);
            List<PkgBundleUpdateItem> update2 = data != null ? data.getUpdate() : null;
            if (update2 == null) {
                update2 = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = update2.iterator();
            while (it.hasNext()) {
                String biz = ((PkgBundleUpdateItem) it.next()).getBiz();
                if (biz == null || (string = StringsKt.trim((CharSequence) biz).toString()) == null || string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    arrayList.add(string);
                }
            }
            return new PkgPlatformStartupPlan(CollectionsKt.toSet(arrayList), new PkgPlatformUpdateTask(this.$context, calcBundleResponse, list, DownloadPriority.NORMAL, this.$criticalBizList), TaskStatus.INSTANCE.getOK());
        } catch (TaskException e11) {
            C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "prepareStartUpdateAll 请求失败: " + e11.getMessage(), null, 4, null);
            return m57631a(TaskStatus.INSTANCE.result(e11.getCode(), e11.getMessage()));
        } catch (Exception e12) {
            C43846g.m96568c(new PackageException(e12, "pkgPlatform", false, null, 8, null), null, 2, null);
            return m57631a(TaskStatus.INSTANCE.result(2000, "包管理平台请求异常: " + e12.getMessage()));
        }
    }
}
