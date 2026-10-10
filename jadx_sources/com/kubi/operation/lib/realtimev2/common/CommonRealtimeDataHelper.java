package com.kubi.operation.lib.realtimev2.common;

import at.C4387c;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.operation.lib.api.OperationRepo;
import com.kubi.operation.lib.realtimev2.DynamicCardItemEntity;
import com.kubi.operation.lib.utils.OperationCoroutineScope;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27023a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CommonRealtimeDataHelper.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0014\u0010\u001f\u001a\u00020\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010J\u0012\u0010!\u001a\u00020\u001b2\b\b\u0002\u0010\"\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\f\u001a&\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e \u000f*\u0012\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e\u0018\u00010\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/operation/lib/realtimev2/common/CommonRealtimeDataHelper;", "", "<init>", "()V", "TAG", "", "DEFAULT_PULL_DELAY_SECONDS", "", "repo", "Lcom/kubi/operation/lib/api/OperationRepo;", "scope", "Lcom/kubi/operation/lib/utils/OperationCoroutineScope;", "currentList", "", "Lcom/kubi/operation/lib/realtimev2/DynamicCardItemEntity;", "kotlin.jvm.PlatformType", "", "isRequestPulling", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasLogin", "", "getHasLogin", "()Z", "hasReportFromPullData", "pullData", "Lkotlinx/coroutines/Job;", "delayToRePull", "", "second", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onRemove", "dataList", "tryExposeFirstCard", "fromOnShow", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCommonRealtimeDataHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRealtimeDataHelper.kt\ncom/kubi/operation/lib/realtimev2/common/CommonRealtimeDataHelper\n+ 2 RealtimeHelperV2.kt\ncom/kubi/operation/lib/realtimev2/RealtimeHelperV2\n*L\n1#1,131:1\n53#2,4:132\n53#2,4:136\n*S KotlinDebug\n*F\n+ 1 CommonRealtimeDataHelper.kt\ncom/kubi/operation/lib/realtimev2/common/CommonRealtimeDataHelper\n*L\n90#1:132,4\n97#1:136,4\n*E\n"})
public final class CommonRealtimeDataHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CommonRealtimeDataHelper f36803a = new CommonRealtimeDataHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final OperationRepo f36804b = new OperationRepo();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final OperationCoroutineScope f36805c = new OperationCoroutineScope(C42911a.m94120b(), "RealtimeV2.CommonDataHelper");

    /* JADX INFO: renamed from: d */
    public static final List<DynamicCardItemEntity> f36806d = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final AtomicBoolean f36807e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public static volatile boolean f36808f;

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m43555n(CommonRealtimeDataHelper commonRealtimeDataHelper, boolean z11, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        commonRealtimeDataHelper.m43562m(z11);
    }

    /* JADX INFO: renamed from: g */
    public final void m43556g(int i11) {
        C41696j.m91104d(f36805c, null, null, new CommonRealtimeDataHelper$delayToRePull$1(i11, null), 3, null);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m43557h() {
        return UserInfo.a.d() == UserInfo.LoginState.Login;
    }

    /* JADX INFO: renamed from: i */
    public final void m43558i() {
        C4387c c4387c = C4387c.f3817a;
        f36805c.close();
        f36807e.set(false);
    }

    /* JADX INFO: renamed from: j */
    public final void m43559j(@NotNull List<DynamicCardItemEntity> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        C41696j.m91104d(f36805c, null, null, new CommonRealtimeDataHelper$onRemove$1(dataList, null), 3, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m43560k() throws JSONException {
        C4387c c4387c = C4387c.f3817a;
        m43561l();
        m43555n(this, false, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final InterfaceC41775x1 m43561l() {
        return C41696j.m91104d(f36805c, null, null, new CommonRealtimeDataHelper$pullData$1(null), 3, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m43562m(boolean z11) throws JSONException {
        DynamicCardItemEntity dynamicCardItemEntity;
        if (!z11) {
            if (f36808f) {
                return;
            } else {
                f36808f = true;
            }
        }
        List<DynamicCardItemEntity> list = f36806d;
        if (list == null || list.isEmpty() || (dynamicCardItemEntity = (DynamicCardItemEntity) CollectionsKt.firstOrNull((List) list)) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", String.valueOf(dynamicCardItemEntity.getViewTypeV2()));
        String reportStatus = dynamicCardItemEntity.getReportStatus();
        if (reportStatus != null && reportStatus.length() != 0) {
            jSONObject.put("status", String.valueOf(dynamicCardItemEntity.getReportStatus()));
        }
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, "realtimeUpdatesCard", null, jSONObject, 4, null);
    }
}
