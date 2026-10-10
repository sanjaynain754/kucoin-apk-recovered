package com.kubi.assets.entity;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: MultiChainEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"isMinDepositVisible", "", "Lcom/kubi/assets/entity/MultiChainEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MultiChainEntityKt {
    public static final boolean isMinDepositVisible(@NotNull MultiChainEntity multiChainEntity) {
        Intrinsics.checkNotNullParameter(multiChainEntity, "<this>");
        String depositMinSize = multiChainEntity.getDepositMinSize();
        return (depositMinSize == null || StringsKt.isBlank(depositMinSize) || Intrinsics.areEqual(multiChainEntity.getDepositMinSize(), "0")) ? false : true;
    }
}
