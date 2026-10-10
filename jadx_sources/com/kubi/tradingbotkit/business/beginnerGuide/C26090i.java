package com.kubi.tradingbotkit.business.beginnerGuide;

import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.tradingbotkit.entity.gudiGuide.PictureEntity;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.tradingbotkit.business.beginnerGuide.i */
/* JADX INFO: compiled from: GuideInformationExt.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, m90084d2 = {"getUrlByDayTheme", "", "pictureEntity", "Lcom/kubi/tradingbotkit/entity/gudiGuide/PictureEntity;", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C26090i {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m63842a(@Nullable PictureEntity pictureEntity) {
        String strC = HostManager.a.c();
        if (DayNightThemeManager.f28592a.m33187l()) {
            return strC + C27041f.m66668h(pictureEntity != null ? pictureEntity.getDay() : null);
        }
        return strC + C27041f.m66668h(pictureEntity != null ? pictureEntity.getNight() : null);
    }
}
