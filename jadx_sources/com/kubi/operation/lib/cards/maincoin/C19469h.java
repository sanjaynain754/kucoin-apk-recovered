package com.kubi.operation.lib.cards.maincoin;

import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.operation.lib.cards.maincoin.h */
/* JADX INFO: compiled from: MainCoinCardContract.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/maincoin/MainCoinCardContract$WsDataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "<init>", "(Lcom/kubi/data/entity/WsMarketSnapshotEntity;)V", "getEntity", "()Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C19469h implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final WsMarketSnapshotEntity f36714a;

    public C19469h(@NotNull WsMarketSnapshotEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        this.f36714a = entity;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final WsMarketSnapshotEntity getF36714a() {
        return this.f36714a;
    }
}
