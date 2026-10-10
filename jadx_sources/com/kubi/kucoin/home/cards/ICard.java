package com.kubi.kucoin.home.cards;

import androidx.annotation.UiThread;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.home.cards.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ICard.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/home/cards/ICard;", "", "bindToUI", "", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "onMoveStart", "onMoveStop", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ICard {
    @UiThread
    /* JADX INFO: renamed from: K1 */
    default void mo28980K1(@NotNull BaseCardData data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    /* JADX INFO: renamed from: P */
    default void mo28981P() {
    }

    /* JADX INFO: renamed from: Q */
    default void mo28982Q() {
    }
}
