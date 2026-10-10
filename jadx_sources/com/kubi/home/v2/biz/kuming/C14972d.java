package com.kubi.home.v2.biz.kuming;

import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.kubi.home.v2.biz.kuming.d */
/* JADX INFO: compiled from: KuMiningWidgetContract.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetContract$DataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "data", "Lcom/kubi/home/v2/biz/kuming/KuMiningDataEntity;", "<init>", "(Lcom/kubi/home/v2/biz/kuming/KuMiningDataEntity;)V", "getData", "()Lcom/kubi/home/v2/biz/kuming/KuMiningDataEntity;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C14972d implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final KuMiningDataEntity f26467a;

    /* JADX WARN: Multi-variable type inference failed */
    public C14972d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C14972d(@Nullable KuMiningDataEntity kuMiningDataEntity) {
        this.f26467a = kuMiningDataEntity;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final KuMiningDataEntity getF26467a() {
        return this.f26467a;
    }

    public /* synthetic */ C14972d(KuMiningDataEntity kuMiningDataEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : kuMiningDataEntity);
    }
}
