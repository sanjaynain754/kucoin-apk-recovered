package com.kubi.tradingbotkit.entity.gudiGuide;

import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: PictureEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/gudiGuide/PictureEntity;", "", "<init>", "()V", "night", "", "getNight", "()Ljava/lang/String;", "setNight", "(Ljava/lang/String;)V", JPushConstants.NotificationTime.KEY_DAYS, "getDay", "setDay", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PictureEntity {

    @Nullable
    private String day;

    @Nullable
    private String night;

    @Nullable
    public final String getDay() {
        return this.day;
    }

    @Nullable
    public final String getNight() {
        return this.night;
    }

    public final void setDay(@Nullable String str) {
        this.day = str;
    }

    public final void setNight(@Nullable String str) {
        this.night = str;
    }
}
