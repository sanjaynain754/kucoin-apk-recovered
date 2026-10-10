package com.kubi.operation.lib.realtime.gempool;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.operation.lib.api.OperationRepo;
import com.kubi.operation.lib.utils.OperationCoroutineScope;
import com.kubi.user.config.UserInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p842zs.C46913b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GempoolRealtimeDataHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\rJ\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\rJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u000b\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\u000f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m90084d2 = {"Lcom/kubi/operation/lib/realtime/gempool/GempoolRealtimeDataHelper;", "", "<init>", "()V", "TAG", "", "repo", "Lcom/kubi/operation/lib/api/OperationRepo;", "scope", "Lcom/kubi/operation/lib/utils/OperationCoroutineScope;", "wsScope", "currentList", "", "Lcom/kubi/operation/lib/realtime/gempool/GemPoolRealtimeData;", "kotlin.jvm.PlatformType", "", "isRequestMarking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRequestPulling", "hasLogin", "", "getHasLogin", "()Z", "pullDatas", "Lkotlinx/coroutines/Job;", "markedShow", TtmlNode.COMBINE_ALL, "data", "onDataRemoved", "startWsSubcribe", "", "stopWsSubcribe", "getCurrentList", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GempoolRealtimeDataHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final GempoolRealtimeDataHelper f36778a = new GempoolRealtimeDataHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final OperationRepo f36779b = new OperationRepo();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final OperationCoroutineScope f36780c = new OperationCoroutineScope(C42911a.m94120b(), "GempoolRealtimeDataHelper");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final OperationCoroutineScope f36781d = new OperationCoroutineScope(C42911a.m94120b(), "GempoolRealtimeDataHelperws");

    /* JADX INFO: renamed from: e */
    public static final List<GemPoolRealtimeData> f36782e = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final AtomicBoolean f36783f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final AtomicBoolean f36784g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public final boolean m43516g() {
        return UserInfo.a.d() == UserInfo.LoginState.Login;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final InterfaceC41775x1 m43517h(boolean z11, @NotNull GemPoolRealtimeData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return C41696j.m91104d(f36780c, null, null, new GempoolRealtimeDataHelper$markedShow$1(z11, data, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final InterfaceC41775x1 m43518i(@NotNull GemPoolRealtimeData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return C41696j.m91104d(f36780c, null, null, new GempoolRealtimeDataHelper$onDataRemoved$1(data, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final InterfaceC41775x1 m43519j() {
        return C41696j.m91104d(f36780c, null, null, new GempoolRealtimeDataHelper$pullDatas$1(null), 3, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m43520k() {
        OperationCoroutineScope operationCoroutineScope = f36781d;
        operationCoroutineScope.close();
        if (m43516g()) {
            C41696j.m91104d(operationCoroutineScope, null, null, new GempoolRealtimeDataHelper$startWsSubcribe$1(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m43521l() {
        C46913b.f104783a.m103333d("[helper-gempool]stopWsSubcribe.");
        f36781d.close();
    }
}
