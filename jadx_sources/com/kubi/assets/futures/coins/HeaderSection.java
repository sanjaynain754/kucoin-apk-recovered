package com.kubi.assets.futures.coins;

import com.kubi.kumex.entity.BalanceEntity;
import io.chad.library.adapter.base.entity.SectionEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HeaderSection.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/assets/futures/coins/HeaderSection;", "Lio/chad/library/adapter/base/entity/SectionEntity;", "Lcom/kubi/kumex/entity/BalanceEntity;", "isHader", "", "header", "", "<init>", "(ZLjava/lang/String;)V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HeaderSection extends SectionEntity<BalanceEntity> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderSection(boolean z11, @NotNull String header) {
        super(z11, header);
        Intrinsics.checkNotNullParameter(header, "header");
    }
}
