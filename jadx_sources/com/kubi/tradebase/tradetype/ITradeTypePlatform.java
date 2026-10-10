package com.kubi.tradebase.tradetype;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.tradebase.tradetype.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ITradeTypeBizInfo.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0006H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/ITradeTypePlatform;", "", "isFutures", "", "isConditionalMarket", "pageId", "", "context", "Landroid/content/Context;", "quoteCurrency", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradeTypePlatform {
    @NotNull
    /* JADX INFO: renamed from: e */
    Context mo63363e();

    /* JADX INFO: renamed from: f */
    boolean mo63364f();

    /* JADX INFO: renamed from: g */
    boolean mo63365g();

    @NotNull
    String pageId();

    @NotNull
    /* JADX INFO: renamed from: a */
    default String mo63362a() {
        return "";
    }
}
