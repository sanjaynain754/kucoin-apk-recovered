package com.kubi.operation.lib.widgets.userstatus;

import com.kubi.operation.lib.entity.UserStatusInfoResponseEntity;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.kubi.operation.lib.widgets.userstatus.i0 */
/* JADX INFO: compiled from: UserStatusWidgetContract.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$DataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "showAsset", "", "data", "Lcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;", "<init>", "(ZLcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;)V", "getShowAsset", "()Z", "getData", "()Lcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C19623i0 implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    public final boolean f37042a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final UserStatusInfoResponseEntity f37043b;

    /* JADX WARN: Multi-variable type inference failed */
    public C19623i0() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public C19623i0(boolean z11, @Nullable UserStatusInfoResponseEntity userStatusInfoResponseEntity) {
        this.f37042a = z11;
        this.f37043b = userStatusInfoResponseEntity;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final UserStatusInfoResponseEntity getF37043b() {
        return this.f37043b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF37042a() {
        return this.f37042a;
    }

    public /* synthetic */ C19623i0(boolean z11, UserStatusInfoResponseEntity userStatusInfoResponseEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : userStatusInfoResponseEntity);
    }
}
