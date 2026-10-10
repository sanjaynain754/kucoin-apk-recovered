package com.kubi.operation.lib.cards.maincoin;

import com.kubi.operation.lib.entity.MainCoinDataEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.operation.lib.cards.maincoin.g */
/* JADX INFO: compiled from: MainCoinCardContract.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/maincoin/MainCoinCardContract$CardDataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "list", "", "Lcom/kubi/operation/lib/entity/MainCoinDataEntity;", "<init>", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C19468g implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<MainCoinDataEntity> f36713a;

    public C19468g(@NotNull List<MainCoinDataEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f36713a = list;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<MainCoinDataEntity> m43374a() {
        return this.f36713a;
    }
}
