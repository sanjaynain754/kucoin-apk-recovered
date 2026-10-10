package com.kubi.tradingbotkit.bean.params.coupons;

import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: CouponsReceiveBean.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, m90084d2 = {"Lcom/kubi/tradingbotkit/bean/params/coupons/CouponsReceiveBean;", "", "<init>", "()V", TUIConstants.TUIContact.LIMIT, "", "getLimit", "()Ljava/lang/String;", "setLimit", "(Ljava/lang/String;)V", "receiveReason", "getReceiveReason", "setReceiveReason", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CouponsReceiveBean {

    @Nullable
    private String limit;

    @Nullable
    private String receiveReason;

    @Nullable
    public final String getLimit() {
        return this.limit;
    }

    @Nullable
    public final String getReceiveReason() {
        return this.receiveReason;
    }

    public final void setLimit(@Nullable String str) {
        this.limit = str;
    }

    public final void setReceiveReason(@Nullable String str) {
        this.receiveReason = str;
    }
}
