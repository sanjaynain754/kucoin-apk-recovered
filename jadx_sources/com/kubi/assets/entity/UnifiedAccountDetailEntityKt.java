package com.kubi.assets.entity;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.kubi.assets.R$color;
import com.kubi.data.entity.CoinInfoEntity;
import com.tencent.bugly.proguard.C33820nf;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: UnifiedAccountDetailEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, m90084d2 = {"mapToAccountDetailEntity", "Lcom/kubi/assets/entity/AccountDetailEntity;", "Lcom/kubi/assets/entity/UnifiedAccountDetailEntity;", "codeInfo", "Lcom/kubi/data/entity/CoinInfoEntity;", "getDirectionSymbol", "", "getDirectionColor", "", "context", "Landroid/content/Context;", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifiedAccountDetailEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifiedAccountDetailEntity.kt\ncom/kubi/assets/entity/UnifiedAccountDetailEntityKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class UnifiedAccountDetailEntityKt {
    public static final int getDirectionColor(@NotNull UnifiedAccountDetailEntity unifiedAccountDetailEntity, @Nullable Context context) {
        Intrinsics.checkNotNullParameter(unifiedAccountDetailEntity, "<this>");
        Intrinsics.checkNotNull(context);
        return ContextCompat.getColor(context, Intrinsics.areEqual(unifiedAccountDetailEntity.getDirection(), "IN") ? R$color.brandGreen : R$color.c_text);
    }

    @NotNull
    public static final String getDirectionSymbol(@NotNull UnifiedAccountDetailEntity unifiedAccountDetailEntity) {
        Intrinsics.checkNotNullParameter(unifiedAccountDetailEntity, "<this>");
        return Intrinsics.areEqual(unifiedAccountDetailEntity.getDirection(), "IN") ? "+" : C33820nf.f71144W;
    }

    @NotNull
    public static final AccountDetailEntity mapToAccountDetailEntity(@NotNull UnifiedAccountDetailEntity unifiedAccountDetailEntity, @Nullable CoinInfoEntity coinInfoEntity) {
        Intrinsics.checkNotNullParameter(unifiedAccountDetailEntity, "<this>");
        AccountDetailEntity accountDetailEntity = new AccountDetailEntity();
        BigDecimal totalAmountWithFeeTax = unifiedAccountDetailEntity.getTotalAmountWithFeeTax();
        if (totalAmountWithFeeTax != null) {
            accountDetailEntity.setAmount(totalAmountWithFeeTax.abs().doubleValue());
        }
        String bizType = unifiedAccountDetailEntity.getBizType();
        if (bizType != null) {
            accountDetailEntity.setBizType(bizType);
        }
        String bizTypeCode = unifiedAccountDetailEntity.getBizTypeCode();
        if (bizTypeCode != null) {
            accountDetailEntity.setBizTypeName(bizTypeCode);
        }
        String direction = unifiedAccountDetailEntity.getDirection();
        if (direction != null) {
            accountDetailEntity.setDirection(direction);
        }
        String remark = unifiedAccountDetailEntity.getRemark();
        if (remark != null) {
            accountDetailEntity.setRemark(remark);
        }
        Double fee = unifiedAccountDetailEntity.getFee();
        if (fee != null) {
            accountDetailEntity.setFee(fee.doubleValue());
        }
        Double tax = unifiedAccountDetailEntity.getTax();
        if (tax != null) {
            accountDetailEntity.setTax(tax.doubleValue());
        }
        Long tradeDate = unifiedAccountDetailEntity.getTradeDate();
        if (tradeDate != null) {
            accountDetailEntity.setTradeDate(tradeDate.longValue());
        }
        if (coinInfoEntity != null) {
            accountDetailEntity.setCoinName(coinInfoEntity.getCurrency(), coinInfoEntity.getCode());
        }
        return accountDetailEntity;
    }
}
