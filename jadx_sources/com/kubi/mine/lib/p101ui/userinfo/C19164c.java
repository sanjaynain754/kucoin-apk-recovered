package com.kubi.mine.lib.p101ui.userinfo;

import com.kubi.mine.lib.entity.UserCommitAuditResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.mine.lib.ui.userinfo.c */
/* JADX INFO: compiled from: EditUserInfoContract.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoContract$CommitAuditUserInfoEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "isSuccess", "", "userCommitAuditResponse", "Lcom/kubi/mine/lib/entity/UserCommitAuditResponse;", "apiErrorMsg", "", "<init>", "(ZLcom/kubi/mine/lib/entity/UserCommitAuditResponse;Ljava/lang/String;)V", "()Z", "getUserCommitAuditResponse", "()Lcom/kubi/mine/lib/entity/UserCommitAuditResponse;", "getApiErrorMsg", "()Ljava/lang/String;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C19164c implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    public final boolean f35382a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final UserCommitAuditResponse f35383b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f35384c;

    public C19164c(boolean z11, @NotNull UserCommitAuditResponse userCommitAuditResponse, @Nullable String str) {
        Intrinsics.checkNotNullParameter(userCommitAuditResponse, "userCommitAuditResponse");
        this.f35382a = z11;
        this.f35383b = userCommitAuditResponse;
        this.f35384c = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF35384c() {
        return this.f35384c;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final UserCommitAuditResponse getF35383b() {
        return this.f35383b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getF35382a() {
        return this.f35382a;
    }
}
