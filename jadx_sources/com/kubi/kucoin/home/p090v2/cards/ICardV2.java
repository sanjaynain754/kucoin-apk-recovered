package com.kubi.kucoin.home.p090v2.cards;

import androidx.annotation.UiThread;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.home.v2.cards.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ICardV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0017J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/home/v2/cards/ICardV2;", "", "bindToUI", "", "data", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "isUpdate", "", "onMoveStart", "onMoveStop", "onEnterDragMode", "onExitDragMode", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ICardV2 {
    /* JADX INFO: renamed from: x2 */
    static /* synthetic */ void m32264x2(ICardV2 iCardV2, BaseCardDataV2 baseCardDataV2, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindToUI");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        iCardV2.mo30081q(baseCardDataV2, z11);
    }

    @UiThread
    /* JADX INFO: renamed from: q */
    default void mo30081q(@NotNull BaseCardDataV2 data, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    /* JADX INFO: renamed from: P */
    default void mo31093P() {
    }

    /* JADX INFO: renamed from: Q */
    default void mo31094Q() {
    }

    /* JADX INFO: renamed from: k0 */
    default void mo30080k0() {
    }

    /* JADX INFO: renamed from: r0 */
    default void mo30082r0() {
    }
}
