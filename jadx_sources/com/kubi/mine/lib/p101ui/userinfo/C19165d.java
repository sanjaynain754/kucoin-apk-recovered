package com.kubi.mine.lib.p101ui.userinfo;

import com.kubi.mine.lib.entity.QueryAuditInfoResponse;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.mine.lib.ui.userinfo.d */
/* JADX INFO: compiled from: EditUserInfoContract.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoContract$QueryAuditUserInfoEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "isSuccess", "", "queryAuditInfo", "Lcom/kubi/mine/lib/entity/QueryAuditInfoResponse;", "<init>", "(ZLcom/kubi/mine/lib/entity/QueryAuditInfoResponse;)V", "()Z", "getQueryAuditInfo", "()Lcom/kubi/mine/lib/entity/QueryAuditInfoResponse;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C19165d implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    public final boolean f35385a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final QueryAuditInfoResponse f35386b;

    public C19165d(boolean z11, @NotNull QueryAuditInfoResponse queryAuditInfo) {
        Intrinsics.checkNotNullParameter(queryAuditInfo, "queryAuditInfo");
        this.f35385a = z11;
        this.f35386b = queryAuditInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final QueryAuditInfoResponse getF35386b() {
        return this.f35386b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF35385a() {
        return this.f35385a;
    }
}
