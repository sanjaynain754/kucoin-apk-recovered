package com.kubi.operation.lib.realtime.bonus;

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

/* JADX INFO: compiled from: BonusRealtimeDataHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\rJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u000b\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\u000f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;", "", "<init>", "()V", "TAG", "", "repo", "Lcom/kubi/operation/lib/api/OperationRepo;", "scope", "Lcom/kubi/operation/lib/utils/OperationCoroutineScope;", "wsScope", "currentList", "", "Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeData;", "kotlin.jvm.PlatformType", "", "isRequestPulling", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasLogin", "", "getHasLogin", "()Z", "pullDatas", "Lkotlinx/coroutines/Job;", "onDataRemoved", "data", "startWsSubcribe", "", "stopWsSubcribe", "getCurrentList", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BonusRealtimeDataHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BonusRealtimeDataHelper f36764a = new BonusRealtimeDataHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final OperationRepo f36765b = new OperationRepo();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final OperationCoroutineScope f36766c = new OperationCoroutineScope(C42911a.m94120b(), "BonusRealtimeDataHelper");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final OperationCoroutineScope f36767d = new OperationCoroutineScope(C42911a.m94120b(), "BonusRealtimeDataHelperws");

    /* JADX INFO: renamed from: e */
    public static final List<BonusRealtimeData> f36768e = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final AtomicBoolean f36769f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final boolean m43495f() {
        return UserInfo.a.d() == UserInfo.LoginState.Login;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InterfaceC41775x1 m43496g(@NotNull BonusRealtimeData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return C41696j.m91104d(f36766c, null, null, new BonusRealtimeDataHelper$onDataRemoved$1(data, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final InterfaceC41775x1 m43497h() {
        return C41696j.m91104d(f36766c, null, null, new BonusRealtimeDataHelper$pullDatas$1(null), 3, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m43498i() {
        OperationCoroutineScope operationCoroutineScope = f36767d;
        operationCoroutineScope.close();
        if (m43495f()) {
            C41696j.m91104d(operationCoroutineScope, null, null, new BonusRealtimeDataHelper$startWsSubcribe$1(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m43499j() {
        C46913b.f104783a.m103333d("[helper-bonus]stopWsSubcribe.");
        f36767d.close();
    }
}
