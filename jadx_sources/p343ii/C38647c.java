package p343ii;

import com.kubi.kumex.data.platform.model.TradingNoticeEntity;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p314hi.InterfaceC38216d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ii.c */
/* JADX INFO: compiled from: FuturesNoticeSettingImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/futures/trade/config/impl/FuturesNoticeSettingImpl;", "Lcom/kubi/futures/trade/config/IFuturesNoticeSetting;", TUIConstants.TUIChat.NOTICE, "Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;", "<init>", "(Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;)V", "enableDeepBook", "", "enableMarkPriceDeviation", "enableLimitOrderConfirmAgain", "enableMarketOrderConfirmAgain", "enableTriggerOrderConfirmAgain", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38647c implements InterfaceC38216d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TradingNoticeEntity f86644a;

    public C38647c(@NotNull TradingNoticeEntity notice) {
        Intrinsics.checkNotNullParameter(notice, "notice");
        this.f86644a = notice;
    }

    @Override // p314hi.InterfaceC38216d
    /* JADX INFO: renamed from: a */
    public boolean mo27182a() {
        HashMap<String, Boolean> confirmConfig = this.f86644a.getConfirmConfig();
        return C27025c.m66567e(confirmConfig != null ? confirmConfig.get("LIMIT") : null, true);
    }

    @Override // p314hi.InterfaceC38216d
    /* JADX INFO: renamed from: b */
    public boolean mo27183b() {
        HashMap<String, Boolean> confirmConfig = this.f86644a.getConfirmConfig();
        return C27025c.m66567e(confirmConfig != null ? confirmConfig.get("MISOPERATION") : null, true);
    }

    @Override // p314hi.InterfaceC38216d
    /* JADX INFO: renamed from: c */
    public boolean mo27184c() {
        HashMap<String, Boolean> confirmConfig = this.f86644a.getConfirmConfig();
        return C27025c.m66567e(confirmConfig != null ? confirmConfig.get("LIMIT_CLOSE") : null, true);
    }
}
