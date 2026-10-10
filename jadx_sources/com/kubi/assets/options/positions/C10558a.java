package com.kubi.assets.options.positions;

import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.OptionsPositionEntity;
import com.kubi.utils.C27017c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.options.positions.a */
/* JADX INFO: compiled from: OptionsPositionEntityExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m90084d2 = {"getTradeSideConfig", "Lcom/kubi/assets/options/positions/TradeSide;", "Lcom/kubi/assets/entity/OptionsPositionEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C10558a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final TradeSide m18171a(@NotNull OptionsPositionEntity optionsPositionEntity) {
        Intrinsics.checkNotNullParameter(optionsPositionEntity, "<this>");
        String side = optionsPositionEntity.getSide();
        if (Intrinsics.areEqual(side, "BUY")) {
            C27017c c27017c = C27017c.f54310a;
            return new TradeSide(c27017c.m66512a(R$color.brandGreen), C27017c.m66510d(c27017c, R$drawable.shape_primary8_4r, null, 2, null), R$string.buy);
        }
        if (Intrinsics.areEqual(side, "SELL")) {
            C27017c c27017c2 = C27017c.f54310a;
            return new TradeSide(c27017c2.m66512a(R$color.brandRed), C27017c.m66510d(c27017c2, R$drawable.shape_secondary8_4r, null, 2, null), R$string.sell);
        }
        C27017c c27017c3 = C27017c.f54310a;
        return new TradeSide(c27017c3.m66512a(R$color.c_text), C27017c.m66510d(c27017c3, R$drawable.shape_emphasis8_4r, null, 2, null), R$string.stub);
    }
}
