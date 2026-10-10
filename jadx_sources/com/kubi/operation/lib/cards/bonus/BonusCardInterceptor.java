package com.kubi.operation.lib.cards.bonus;

import com.kubi.kucoin.home.cards.CardInterceptor;
import com.kubi.user.config.UserInfo;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.operation.lib.cards.bonus.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BonusCardInterceptor.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/bonus/BonusCardInterceptor;", "Lcom/kubi/kucoin/home/cards/CardInterceptor;", "<init>", "()V", "needShowCard", "", "needShowConfig", "needRequestData", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BonusCardInterceptor implements CardInterceptor {
    @Override // com.kubi.kucoin.home.cards.CardInterceptor
    /* JADX INFO: renamed from: a */
    public boolean mo29504a() {
        return false;
    }

    @Override // com.kubi.kucoin.home.cards.CardInterceptor
    /* JADX INFO: renamed from: c */
    public boolean mo29506c() {
        return false;
    }

    @Override // com.kubi.kucoin.home.cards.CardInterceptor
    /* JADX INFO: renamed from: b */
    public boolean mo29505b() {
        return !UserInfo.a.n();
    }
}
