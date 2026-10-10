package e20;

import com.kubi.host.HostManager;
import com.kubi.sdk.function.language.MultiLanguageManager;

/* JADX INFO: renamed from: e20.c */
/* JADX INFO: compiled from: KuCoinUrlConstant.java */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC37052c {

    /* JADX INFO: renamed from: a */
    public static final String f82303a;

    /* JADX INFO: renamed from: b */
    public static final String f82304b;

    /* JADX INFO: renamed from: c */
    public static final String f82305c;

    /* JADX INFO: renamed from: d */
    public static final String f82306d;

    /* JADX INFO: renamed from: e */
    public static final String f82307e;

    /* JADX INFO: renamed from: f */
    public static final String f82308f;

    /* JADX INFO: renamed from: g */
    public static final String f82309g;

    static {
        HostManager hostManager = HostManager.a;
        String strM = hostManager.m();
        f82303a = strM;
        String strQ = hostManager.q();
        f82304b = strQ;
        f82305c = strM + "/news/en-risk-disclosure-statement-of-kucoin-leveraged-tokens";
        f82306d = strM + "/news/risk-disclosure-statement-of-kucoin-leveraged-tokens";
        f82307e = hostManager.e() + "/support/categories/6024330782489?appNeedLang=true";
        f82308f = strQ + "/360015584854?lang=" + MultiLanguageManager.f46811g.getLocalString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hostManager.w());
        sb2.append("/static/maintenance-status.json");
        f82309g = sb2.toString();
    }
}
