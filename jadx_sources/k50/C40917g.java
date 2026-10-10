package k50;

import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import ir.C40167b;
import ir.InterfaceC40166a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.PropertyReference0Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: k50.g */
/* JADX INFO: compiled from: UrlConstants.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0006\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\u0007\u0010\u0003\"\u001b\u0010\t\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\n\u0010\u0003\"\u001b\u0010\f\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\r\u0010\u0003\"\u001b\u0010\u000f\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0010\u0010\u0003¨\u0006\u0012"}, m90084d2 = {"LIQ_PRICE_URL", "", "getLIQ_PRICE_URL", "()Ljava/lang/String;", "LIQ_PRICE_URL$delegate", "Lcom/kubi/network/api/utils/Link;", "FUNDS_FEE_URL_ZH", "getFUNDS_FEE_URL_ZH", "FUNDS_FEE_URL_ZH$delegate", "FUNDS_FEE_URL_EN", "getFUNDS_FEE_URL_EN", "FUNDS_FEE_URL_EN$delegate", "FLOAT_AMOUNT_URL_ZH", "getFLOAT_AMOUNT_URL_ZH", "FLOAT_AMOUNT_URL_ZH$delegate", "FLOAT_AMOUNT_URL_EN", "getFLOAT_AMOUNT_URL_EN", "FLOAT_AMOUNT_URL_EN$delegate", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40917g {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ KProperty<Object>[] f90984a = {Reflection.property0(new PropertyReference0Impl(C40917g.class, "LIQ_PRICE_URL", "getLIQ_PRICE_URL()Ljava/lang/String;", 1)), Reflection.property0(new PropertyReference0Impl(C40917g.class, "FUNDS_FEE_URL_ZH", "getFUNDS_FEE_URL_ZH()Ljava/lang/String;", 1)), Reflection.property0(new PropertyReference0Impl(C40917g.class, "FUNDS_FEE_URL_EN", "getFUNDS_FEE_URL_EN()Ljava/lang/String;", 1)), Reflection.property0(new PropertyReference0Impl(C40917g.class, "FLOAT_AMOUNT_URL_ZH", "getFLOAT_AMOUNT_URL_ZH()Ljava/lang/String;", 1)), Reflection.property0(new PropertyReference0Impl(C40917g.class, "FLOAT_AMOUNT_URL_EN", "getFLOAT_AMOUNT_URL_EN()Ljava/lang/String;", 1))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC40166a f90985b = C40167b.m88525a(new Function0() { // from class: k50.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C40917g.m89609j();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC40166a f90986c = C40167b.m88525a(new Function0() { // from class: k50.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C40917g.m89608i();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final InterfaceC40166a f90987d = C40167b.m88525a(new Function0() { // from class: k50.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C40917g.m89607h();
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final InterfaceC40166a f90988e = C40167b.m88525a(new Function0() { // from class: k50.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C40917g.m89606g();
        }
    });

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final InterfaceC40166a f90989f = C40167b.m88525a(new Function0() { // from class: k50.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C40917g.m89605f();
        }
    });

    /* JADX INFO: renamed from: f */
    public static final String m89605f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.m());
        sb2.append("/support/900004174466--Spot-Grid-Introduction-to-Parameters?appNeedLang=true&theme=");
        sb2.append(DayNightThemeManager.f28592a.m33187l() ? "light" : "dark");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: g */
    public static final String m89606g() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.m());
        sb2.append("/support/900004174466--%E7%B6%B2%E6%A0%BC%E4%BA%A4%E6%98%93-%E5%8F%83%E6%95%B8%E7%B0%A1%E4%BB%8B?appNeedLang=true&theme=");
        sb2.append(DayNightThemeManager.f28592a.m33187l() ? "light" : "dark");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: h */
    public static final String m89607h() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.m());
        sb2.append("/support/900005080563-Futures-Encyclopedia-01-What-is-a-Funding-Rate-?appNeedLang=true&theme=");
        sb2.append(DayNightThemeManager.f28592a.m33187l() ? "light" : "dark");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: i */
    public static final String m89608i() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.m());
        sb2.append("/support/900005080563-%E4%B8%80%E6%96%87%E6%90%9E%E6%87%82%E8%B5%84%E9%87%91%E8%B4%B9%E7%8E%87?appNeedLang=true&theme=");
        sb2.append(DayNightThemeManager.f28592a.m33187l() ? "light" : "dark");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: j */
    public static final String m89609j() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.m());
        sb2.append("/support/47497300093924?appNeedLang=true&theme=");
        sb2.append(DayNightThemeManager.f28592a.m33187l() ? "light" : "dark");
        return sb2.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final String m89610k() {
        return (String) f90989f.getValue(null, f90984a[4]);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final String m89611l() {
        return (String) f90988e.getValue(null, f90984a[3]);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final String m89612m() {
        return (String) f90987d.getValue(null, f90984a[2]);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m89613n() {
        return (String) f90986c.getValue(null, f90984a[1]);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final String m89614o() {
        return (String) f90985b.getValue(null, f90984a[0]);
    }
}
