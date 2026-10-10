package p768xo;

import com.kubi.host.HostManager;
import com.kubi.sdk.function.language.MultiLanguageManager;

/* JADX INFO: renamed from: xo.g */
/* JADX INFO: compiled from: MarginUrlConstant.java */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC46306g {

    /* JADX INFO: renamed from: a */
    public static final String f103874a;

    /* JADX INFO: renamed from: b */
    public static final String f103875b;

    /* JADX INFO: renamed from: c */
    public static final String f103876c;

    /* JADX INFO: renamed from: d */
    public static final String f103877d;

    /* JADX INFO: renamed from: e */
    public static final String f103878e;

    /* JADX INFO: renamed from: f */
    public static final String f103879f;

    /* JADX INFO: renamed from: g */
    public static final String f103880g;

    /* JADX INFO: renamed from: h */
    public static final String f103881h;

    /* JADX INFO: renamed from: i */
    public static final String f103882i;

    /* JADX INFO: renamed from: j */
    public static final String f103883j;

    /* JADX INFO: renamed from: k */
    public static final String f103884k;

    static {
        HostManager hostManager = HostManager.a;
        String strM = hostManager.m();
        f103874a = strM;
        String strQ = hostManager.q();
        f103875b = strQ;
        f103876c = strM + "/news/en-margin-trading-agreement";
        f103877d = strM + "/news/margin-trading-agreement";
        f103878e = strQ + "/900005034163?lang=" + MultiLanguageManager.f46811g.getLocalString();
        f103879f = strQ + "/4416385130521?lang=" + MultiLanguageManager.f46811g.getLocalString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM);
        sb2.append("/margin-data/isolated-risk-limit?appNeedLang=true&loading=2");
        f103880g = sb2.toString();
        f103881h = strM + "/margin-data/cross-risk-limit?appNeedLang=true&loading=2";
        f103882i = strM + "/margin-data/loan-rates?appNeedLang=true&loading=2";
        f103883j = strM + "/margin-data/spot-index/%s?appNeedLang=true&loading=2";
        f103884k = strQ + "/900002040846?lang=" + MultiLanguageManager.f46811g.getLocalString();
    }
}
