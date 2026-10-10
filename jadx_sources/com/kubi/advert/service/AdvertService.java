package com.kubi.advert.service;

import com.appsflyer.AppsFlyerLib;
import com.kubi.advert.AppsFlyerUtil;
import com.kubi.advert.CpsUtils;
import com.kubi.advert.FacebookSdkUtil;
import com.kubi.advert.OnelinkUtil;
import com.kubi.advert.api.IAdvertService;
import com.kubi.advert.api.entity.PageConfigEntity;
import com.kubi.advert.api.entity.PromotionConfig;
import com.kubi.advert.exception.AdvertException;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.BaseApplication;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p227ea.InterfaceC37124a;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AdvertService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0097@¢\u0006\u0002\u0010\u000bJ0\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J$\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00072\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0018H\u0016J$\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00072\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u0018H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0007H\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\b\u0010 \u001a\u00020\u0007H\u0016J\b\u0010!\u001a\u00020\u0007H\u0016J\b\u0010\"\u001a\u00020\u0007H\u0016J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0007H\u0016J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0007H\u0016¨\u0006&"}, m90084d2 = {"Lcom/kubi/advert/service/AdvertService;", "Lcom/kubi/advert/api/IAdvertService;", "<init>", "()V", "fetchPageConfig", "Lcom/kubi/advert/api/entity/PromotionConfig;", "businessLine", "", "code", "needErrorToast", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pageConfig", "Lcom/kubi/advert/api/entity/PageConfigEntity;", "cacheTime", "", "(Ljava/lang/String;Ljava/lang/String;ZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fbEventRegistered", "", "registerType", "uid", "fbEvent", "eventName", ReportDataTable.COLUMN_PARAMS, "", "afEvent", "", "getAppsFlyerUID", "getOnelinkHostList", "", "getAppInstanceId", "getUtmMedium", "getUtmSource", "getUtmCampaign", "getAdClickId", "onMainHostResumed", "hostId", "onMainHostPaused", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAdvertService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdvertService.kt\ncom/kubi/advert/service/AdvertService\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AdvertIssue.kt\ncom/kubi/advert/exception/AdvertIssueKt\n*L\n1#1,117:1\n25#2:118\n26#2:124\n1#3:119\n45#4,4:120\n45#4,4:125\n45#4,4:129\n*S KotlinDebug\n*F\n+ 1 AdvertService.kt\ncom/kubi/advert/service/AdvertService\n*L\n49#1:118\n49#1:124\n49#1:119\n49#1:120,4\n71#1:125,4\n79#1:129,4\n*E\n"})
public final class AdvertService implements IAdvertService {
    @Override // com.kubi.advert.api.IAdvertService
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo14759a() {
        return CpsUtils.f15167a.m14811c();
    }

    @Override // com.kubi.advert.api.IAdvertService
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo14760b() {
        return CpsUtils.f15167a.m14809a();
    }

    @Override // com.kubi.advert.api.IAdvertService
    @NotNull
    /* JADX INFO: renamed from: c */
    public String mo14761c() {
        return CpsUtils.f15167a.m14812d();
    }

    @Override // com.kubi.advert.api.IAdvertService
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo14762d() {
        return CpsUtils.f15167a.m14813e();
    }

    @Override // com.kubi.advert.api.IAdvertService
    /* JADX INFO: renamed from: e */
    public void mo14763e(@NotNull String eventName, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        FacebookSdkUtil.f15173a.m14819a(eventName, params);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.kubi.advert.api.IAdvertService
    @Deprecated(message = "Deprecated", replaceWith = @ReplaceWith(expression = "pageConfig", imports = {}))
    @Nullable
    /* JADX INFO: renamed from: f */
    public Object mo14764f(@NotNull String str, @NotNull String str2, boolean z11, @NotNull Continuation<? super PromotionConfig> continuation) {
        AdvertService$fetchPageConfig$1 advertService$fetchPageConfig$1;
        if (continuation instanceof AdvertService$fetchPageConfig$1) {
            advertService$fetchPageConfig$1 = (AdvertService$fetchPageConfig$1) continuation;
            int i11 = advertService$fetchPageConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                advertService$fetchPageConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                advertService$fetchPageConfig$1 = new AdvertService$fetchPageConfig$1(this, continuation);
            }
        } else {
            advertService$fetchPageConfig$1 = new AdvertService$fetchPageConfig$1(this, continuation);
        }
        AdvertService$fetchPageConfig$1 advertService$fetchPageConfig$2 = advertService$fetchPageConfig$1;
        Object objM42826g = advertService$fetchPageConfig$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = advertService$fetchPageConfig$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            InterfaceC41634e<PromotionConfig> interfaceC41634eM83038a = ((InterfaceC37124a) RetrofitFlowExKt.m42820a(InterfaceC37124a.class)).m83038a(str, str2);
            advertService$fetchPageConfig$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
            advertService$fetchPageConfig$2.L$1 = SpillingKt.nullOutSpilledVariable(str2);
            advertService$fetchPageConfig$2.Z$0 = z11;
            advertService$fetchPageConfig$2.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM83038a, z11, null, advertService$fetchPageConfig$2, 2, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42826g);
        }
        return ((C19334f) objM42826g).m42846a();
    }

    @Override // com.kubi.advert.api.IAdvertService
    /* JADX INFO: renamed from: g */
    public void mo14765g(@NotNull String eventName, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            AppsFlyerLib.getInstance().logEvent(BaseApplication.INSTANCE.get(), eventName, params);
        } catch (Throwable th2) {
            if (C42899b.m94075e(th2)) {
                return;
            }
            C43846g.m96568c(new AdvertException(th2, "AdvertService", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.kubi.advert.api.IAdvertService
    @NotNull
    public String getAppInstanceId() {
        return CpsUtils.f15167a.m14810b();
    }

    @Override // com.kubi.advert.api.IAdvertService
    /* JADX INFO: renamed from: k */
    public void mo14767k(@NotNull String registerType, @NotNull String uid) {
        Intrinsics.checkNotNullParameter(registerType, "registerType");
        Intrinsics.checkNotNullParameter(uid, "uid");
        FacebookSdkUtil.f15173a.m14819a("fb_mobile_complete_registration", MapsKt.mapOf(TuplesKt.m90091to("fb_registration_method", registerType), TuplesKt.m90091to("fb_content_id", uid)));
    }

    @Override // com.kubi.advert.api.IAdvertService
    /* JADX INFO: renamed from: m */
    public void mo14768m(@NotNull String hostId) {
        Intrinsics.checkNotNullParameter(hostId, "hostId");
        AppsFlyerUtil.a.A(hostId);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.advert.api.IAdvertService
    @Nullable
    /* JADX INFO: renamed from: n */
    public Object mo14769n(@NotNull String str, @NotNull String str2, boolean z11, long j11, @NotNull Continuation<? super PageConfigEntity> continuation) {
        AdvertService$pageConfig$1 advertService$pageConfig$1;
        if (continuation instanceof AdvertService$pageConfig$1) {
            advertService$pageConfig$1 = (AdvertService$pageConfig$1) continuation;
            int i11 = advertService$pageConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                advertService$pageConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                advertService$pageConfig$1 = new AdvertService$pageConfig$1(this, continuation);
            }
        } else {
            advertService$pageConfig$1 = new AdvertService$pageConfig$1(this, continuation);
        }
        Object objM42826g = advertService$pageConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = advertService$pageConfig$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            InterfaceC41634e<PageConfigEntity> interfaceC41634eM83040d = ((InterfaceC37124a) RetrofitFlowExKt.m42820a(InterfaceC37124a.class)).m83040d(str, str2, String.valueOf(j11));
            advertService$pageConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            advertService$pageConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(str2);
            advertService$pageConfig$1.Z$0 = z11;
            advertService$pageConfig$1.J$0 = j11;
            advertService$pageConfig$1.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM83040d, z11, null, advertService$pageConfig$1, 2, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42826g);
        }
        C19334f c19334f = (C19334f) objM42826g;
        Throwable throwable = c19334f.getThrowable();
        if (throwable != null && !C42899b.m94075e(throwable)) {
            C43846g.m96568c(new AdvertException(throwable, "AdvertService", false, null, 8, null), null, 2, null);
        }
        return c19334f.m42846a();
    }

    @Override // com.kubi.advert.api.IAdvertService
    /* JADX INFO: renamed from: o */
    public void mo14770o(@NotNull String hostId) {
        Intrinsics.checkNotNullParameter(hostId, "hostId");
        AppsFlyerUtil.a.z(hostId);
    }

    @Override // com.kubi.advert.api.IAdvertService
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<String> mo14771p() {
        return OnelinkUtil.f15184a.m14837b();
    }

    @Override // com.kubi.advert.api.IAdvertService
    @Nullable
    /* JADX INFO: renamed from: h */
    public String mo14766h() {
        try {
            return AppsFlyerLib.getInstance().getAppsFlyerUID(BaseApplication.INSTANCE.get());
        } catch (Throwable th2) {
            if (!C42899b.m94075e(th2)) {
                C43846g.m96568c(new AdvertException(th2, "AdvertService", false, null, 8, null), null, 2, null);
            }
            return null;
        }
    }
}
