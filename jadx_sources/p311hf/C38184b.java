package p311hf;

import com.kubi.router.core.Router;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteBizConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p830zf.InterfaceC46813n0;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: hf.b */
/* JADX INFO: compiled from: TradeConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\f\u001a\u0002H\r\"\u0006\b\u0000\u0010\u000e\u0018\u0001\"\u0004\b\u0001\u0010\r2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\r0\u0010¢\u0006\u0002\b\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u0013H\u0082\b¢\u0006\u0002\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/data/config/TradeConfig;", "", "<init>", "()V", "quoteCurrency", "", "getQuoteCurrency", "()Ljava/lang/String;", "defaultCurrency", "getDefaultCurrency", "spotCostUnit", "getSpotCostUnit", "flavor", "R", "F", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "default", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeConfig.kt\ncom/kubi/data/config/TradeConfig\n*L\n1#1,100:1\n36#1,2:101\n*S KotlinDebug\n*F\n+ 1 TradeConfig.kt\ncom/kubi/data/config/TradeConfig\n*L\n27#1:101,2\n*E\n"})
public final class C38184b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38184b f85884a = new C38184b();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f85885b = C24129b.m58031c(SiteBizConfigKey.QuoteCurrency);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f85886c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final String f85887d;

    static {
        String strMo102961a;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46813n0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h == null || (strMo102961a = ((InterfaceC46813n0) objM56186h).mo102961a()) == null) {
            strMo102961a = "USDT";
        }
        f85886c = strMo102961a;
        f85887d = strMo102961a;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m86146a() {
        return f85886c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m86147b() {
        return f85885b;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m86148c() {
        return f85887d;
    }
}
