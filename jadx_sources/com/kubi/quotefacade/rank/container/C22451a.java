package com.kubi.quotefacade.rank.container;

import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.rank.container.a */
/* JADX INFO: compiled from: RankContainerContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/container/RankContainerContract$UpdateNewSubTabRedDot;", "Lcom/kubi/mvi/event/ISingleEvent;", "subType", "", TIMPushProvider.f75062n, "", "<init>", "(Ljava/lang/String;Z)V", "getSubType", "()Ljava/lang/String;", "getShow", "()Z", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C22451a implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f42440a;

    /* JADX INFO: renamed from: b */
    public final boolean f42441b;

    public C22451a(@NotNull String subType, boolean z11) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        this.f42440a = subType;
        this.f42441b = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF42441b() {
        return this.f42441b;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF42440a() {
        return this.f42440a;
    }
}
