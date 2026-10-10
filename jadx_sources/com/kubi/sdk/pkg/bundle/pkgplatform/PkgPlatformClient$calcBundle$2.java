package com.kubi.sdk.pkg.bundle.pkgplatform;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.kubi.sdk.pkg.config.PackConfigManager;
import com.kubi.sdk.pkg.task.PackageDownloadSetting;
import com.kubi.sdk.pkg.task.TaskException;
import com.kubi.sdk.pkg.util.C23985b;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
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
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: PkgPlatformClient.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformClient$calcBundle$2", m90122f = "PkgPlatformClient.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nPkgPlatformClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkgPlatformClient.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformClient$calcBundle$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,70:1\n1855#2,2:71\n215#3,2:73\n*S KotlinDebug\n*F\n+ 1 PkgPlatformClient.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformClient$calcBundle$2\n*L\n44#1:71,2\n50#1:73,2\n*E\n"})
public final class PkgPlatformClient$calcBundle$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super CalcBundleResponse>, Object> {
    final /* synthetic */ CalcBundleRequest $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkgPlatformClient$calcBundle$2(CalcBundleRequest calcBundleRequest, Continuation<? super PkgPlatformClient$calcBundle$2> continuation) {
        super(2, continuation);
        this.$request = calcBundleRequest;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PkgPlatformClient$calcBundle$2(this.$request, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super CalcBundleResponse> continuation) {
        return ((PkgPlatformClient$calcBundle$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String strString;
        Map<String, String> mapInvoke;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String strM57691e = PackConfigManager.f47378a.m57691e();
            if (strM57691e != null) {
                String str = StringsKt.trimEnd(strM57691e, '/') + "/app/v1/rn/calcBundle";
                RequestBody.Companion companion = RequestBody.INSTANCE;
                String json = C23958a.f47369a.toJson(this.$request);
                Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(request)");
                RequestBody requestBodyCreate = companion.create(json, C23958a.f47370b);
                OkHttpClient.Builder builderNewBuilder = PkgPlatformClient.f47350a.m57607c().newBuilder();
                Iterator<T> it = PackageDownloadSetting.f47421a.m57786a().iterator();
                while (it.hasNext()) {
                    builderNewBuilder.addInterceptor((Interceptor) it.next());
                }
                OkHttpClient okHttpClientBuild = builderNewBuilder.build();
                Request.Builder builderHeader = new Request.Builder().url(str).header("User-Agent", PackageDownloadSetting.f47421a.m57787b());
                Function0<Map<String, String>> function0M57693g = PackConfigManager.f47378a.m57693g();
                if (function0M57693g != null && (mapInvoke = function0M57693g.invoke()) != null) {
                    for (Map.Entry<String, String> entry : mapInvoke.entrySet()) {
                        builderHeader.addHeader(entry.getKey(), entry.getValue());
                    }
                }
                Request requestBuild = builderHeader.post(requestBodyCreate).build();
                try {
                    C23985b.f47489a.m57877e("pkgPlatform", "calcBundle 请求: bundles=" + this.$request.getBundles().size());
                    ResponseBody responseBodyBody = FirebasePerfOkHttpClient.execute(okHttpClientBuild.newCall(requestBuild)).body();
                    if (responseBodyBody != null && (strString = responseBodyBody.string()) != null) {
                        CalcBundleResponse calcBundleResponse = (CalcBundleResponse) C23958a.f47369a.fromJson(strString, CalcBundleResponse.class);
                        if (calcBundleResponse != null) {
                            return calcBundleResponse;
                        }
                        throw new TaskException(1501, "包管理平台响应解析失败");
                    }
                    throw new TaskException(1501, "包管理平台响应 body 为空");
                } catch (TaskException e11) {
                    throw e11;
                } catch (Exception e12) {
                    throw new TaskException(1501, "包管理平台请求异常: " + e12.getMessage(), e12);
                }
            }
            throw new TaskException(1501, "包管理平台 baseUrl 未配置");
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
