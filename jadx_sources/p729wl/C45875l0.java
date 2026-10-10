package p729wl;

import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27025c;
import fm.C37567b;
import ir.C40167b;
import ir.InterfaceC40166a;
import org.jetbrains.annotations.NotNull;
import p569qq.C43852m;
import p801yl.C46527h0;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: wl.l0 */
/* JADX INFO: compiled from: Constants.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\bV\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u000e\u0010\u0007R\u001b\u0010\u0010\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0011\u0010\u0007R\u001b\u0010\u0013\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0014\u0010\u0007R\u001b\u0010\u0016\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0017\u0010\u0007R\u001b\u0010\u0019\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001a\u0010\u0007R\u001b\u0010\u001c\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001d\u0010\u0007R\u001b\u0010\u001f\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b \u0010\u0007R\u001b\u0010\"\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\t\u001a\u0004\b#\u0010\u0007R\u001b\u0010%\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\t\u001a\u0004\b&\u0010\u0007R\u001b\u0010(\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b)\u0010\u0007R\u001b\u0010+\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\t\u001a\u0004\b,\u0010\u0007R\u001b\u0010.\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\t\u001a\u0004\b/\u0010\u0007R\u001b\u00101\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\t\u001a\u0004\b2\u0010\u0007R\u001b\u00104\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\t\u001a\u0004\b5\u0010\u0007R\u001b\u00107\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\t\u001a\u0004\b8\u0010\u0007R\u001b\u0010:\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\t\u001a\u0004\b;\u0010\u0007R\u001b\u0010=\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\t\u001a\u0004\b>\u0010\u0007R\u001b\u0010@\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\t\u001a\u0004\bA\u0010\u0007R\u001b\u0010C\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\t\u001a\u0004\bD\u0010\u0007R\u001b\u0010F\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\t\u001a\u0004\bG\u0010\u0007R\u001b\u0010I\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\t\u001a\u0004\bJ\u0010\u0007R\u001b\u0010L\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010\t\u001a\u0004\bM\u0010\u0007R\u001b\u0010O\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010\t\u001a\u0004\bP\u0010\u0007R\u001b\u0010R\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bT\u0010\t\u001a\u0004\bS\u0010\u0007R\u001b\u0010U\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u0010\t\u001a\u0004\bV\u0010\u0007R\u001b\u0010X\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010\t\u001a\u0004\bY\u0010\u0007¨\u0006["}, m90084d2 = {"Lcom/kubi/kumex/Constants;", "", "<init>", "()V", "FUNDS_URL", "", "getFUNDS_URL", "()Ljava/lang/String;", "FUNDS_URL$delegate", "Lcom/kubi/network/api/utils/Link;", "ROBOT_URL", "getROBOT_URL", "ROBOT_URL$delegate", "OPEN_CONTRACT", "getOPEN_CONTRACT", "OPEN_CONTRACT$delegate", "CALCULATOR_URL", "getCALCULATOR_URL", "CALCULATOR_URL$delegate", "CONTRACT_WELFARE", "getCONTRACT_WELFARE", "CONTRACT_WELFARE$delegate", "CONTRACT_INFO_URL", "getCONTRACT_INFO_URL", "CONTRACT_INFO_URL$delegate", "CONTRACT_RISK_EDU_URL", "getCONTRACT_RISK_EDU_URL", "CONTRACT_RISK_EDU_URL$delegate", "CONTRACT_FUNDING_RATE_URL", "getCONTRACT_FUNDING_RATE_URL", "CONTRACT_FUNDING_RATE_URL$delegate", "REWARDS_HUB_URL", "getREWARDS_HUB_URL", "REWARDS_HUB_URL$delegate", "CROSS_RISK_LIMIT_URL", "getCROSS_RISK_LIMIT_URL", "CROSS_RISK_LIMIT_URL$delegate", "CROSS_ADL_URL", "getCROSS_ADL_URL", "CROSS_ADL_URL$delegate", "ISOLATED_ADL_URL", "getISOLATED_ADL_URL", "ISOLATED_ADL_URL$delegate", "CROSS_LIQUIDATION_URL", "getCROSS_LIQUIDATION_URL", "CROSS_LIQUIDATION_URL$delegate", "ISOLATED_LIQUIDATION_URL", "getISOLATED_LIQUIDATION_URL", "ISOLATED_LIQUIDATION_URL$delegate", "CROSS_RISK_RATIO", "getCROSS_RISK_RATIO", "CROSS_RISK_RATIO$delegate", "TRIAL_URL", "getTRIAL_URL", "TRIAL_URL$delegate", "TRADE_PRO_TRIAL_RULE_URL", "getTRADE_PRO_TRIAL_RULE_URL", "TRADE_PRO_TRIAL_RULE_URL$delegate", "USER_GUIDES_URL", "getUSER_GUIDES_URL", "USER_GUIDES_URL$delegate", "WELFARE_ACTIVITIES", "getWELFARE_ACTIVITIES", "WELFARE_ACTIVITIES$delegate", "FUTURES_CROSS_LIQUIDATION_DESC", "getFUTURES_CROSS_LIQUIDATION_DESC", "FUTURES_CROSS_LIQUIDATION_DESC$delegate", "FUTURES_ISOLATE_LIQUIDATION_DESC", "getFUTURES_ISOLATE_LIQUIDATION_DESC", "FUTURES_ISOLATE_LIQUIDATION_DESC$delegate", "FUTURES_TRADING_RULES", "getFUTURES_TRADING_RULES", "FUTURES_TRADING_RULES$delegate", "FUNDING_RATE_HISTORY", "getFUNDING_RATE_HISTORY", "FUNDING_RATE_HISTORY$delegate", "FUNDING_RATE_LEARN_MORE_URL", "getFUNDING_RATE_LEARN_MORE_URL", "FUNDING_RATE_LEARN_MORE_URL$delegate", "FUTURES_CROSS_INTRODUCTION", "getFUTURES_CROSS_INTRODUCTION", "FUTURES_CROSS_INTRODUCTION$delegate", "FUTURES_PRE_MARKET_INTRODUCTION", "getFUTURES_PRE_MARKET_INTRODUCTION", "FUTURES_PRE_MARKET_INTRODUCTION$delegate", "FUTURES_ACADEMY_URL", "getFUTURES_ACADEMY_URL", "FUTURES_ACADEMY_URL$delegate", "FUTURES_ANNOUNCEMENT", "getFUTURES_ANNOUNCEMENT", "FUTURES_ANNOUNCEMENT$delegate", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45875l0 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ KProperty<Object>[] f103337b = {Reflection.property1(new PropertyReference1Impl(C45875l0.class, "FUNDS_URL", "getFUNDS_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "ROBOT_URL", "getROBOT_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "OPEN_CONTRACT", "getOPEN_CONTRACT()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "CALCULATOR_URL", "getCALCULATOR_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "CONTRACT_WELFARE", "getCONTRACT_WELFARE()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "CONTRACT_INFO_URL", "getCONTRACT_INFO_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "CONTRACT_RISK_EDU_URL", "getCONTRACT_RISK_EDU_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "CONTRACT_FUNDING_RATE_URL", "getCONTRACT_FUNDING_RATE_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "REWARDS_HUB_URL", "getREWARDS_HUB_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "CROSS_RISK_LIMIT_URL", "getCROSS_RISK_LIMIT_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "CROSS_ADL_URL", "getCROSS_ADL_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "ISOLATED_ADL_URL", "getISOLATED_ADL_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "CROSS_LIQUIDATION_URL", "getCROSS_LIQUIDATION_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "ISOLATED_LIQUIDATION_URL", "getISOLATED_LIQUIDATION_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "CROSS_RISK_RATIO", "getCROSS_RISK_RATIO()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "TRIAL_URL", "getTRIAL_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "TRADE_PRO_TRIAL_RULE_URL", "getTRADE_PRO_TRIAL_RULE_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "USER_GUIDES_URL", "getUSER_GUIDES_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "WELFARE_ACTIVITIES", "getWELFARE_ACTIVITIES()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "FUTURES_CROSS_LIQUIDATION_DESC", "getFUTURES_CROSS_LIQUIDATION_DESC()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "FUTURES_ISOLATE_LIQUIDATION_DESC", "getFUTURES_ISOLATE_LIQUIDATION_DESC()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "FUTURES_TRADING_RULES", "getFUTURES_TRADING_RULES()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "FUNDING_RATE_HISTORY", "getFUNDING_RATE_HISTORY()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "FUNDING_RATE_LEARN_MORE_URL", "getFUNDING_RATE_LEARN_MORE_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "FUTURES_CROSS_INTRODUCTION", "getFUTURES_CROSS_INTRODUCTION()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "FUTURES_PRE_MARKET_INTRODUCTION", "getFUTURES_PRE_MARKET_INTRODUCTION()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "FUTURES_ACADEMY_URL", "getFUTURES_ACADEMY_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(C45875l0.class, "FUTURES_ANNOUNCEMENT", "getFUTURES_ANNOUNCEMENT()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45875l0 f103336a = new C45875l0();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC40166a f103338c = C40167b.m88525a(new Function0() { // from class: wl.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101289N();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final InterfaceC40166a f103339d = C40167b.m88525a(new Function0() { // from class: wl.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101301Z();
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final InterfaceC40166a f103340e = C40167b.m88525a(new Function0() { // from class: wl.v
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101299X();
        }
    });

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final InterfaceC40166a f103341f = C40167b.m88525a(new Function0() { // from class: wl.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101278C();
        }
    });

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final InterfaceC40166a f103342g = C40167b.m88525a(new Function0() { // from class: wl.x
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101282G();
        }
    });

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final InterfaceC40166a f103343h = C40167b.m88525a(new Function0() { // from class: wl.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101280E();
        }
    });

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final InterfaceC40166a f103344i = C40167b.m88525a(new Function0() { // from class: wl.z
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101281F();
        }
    });

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final InterfaceC40166a f103345j = C40167b.m88525a(new Function0() { // from class: wl.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101279D();
        }
    });

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final InterfaceC40166a f103346k = C40167b.m88525a(new Function0() { // from class: wl.b0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101300Y();
        }
    });

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final InterfaceC40166a f103347l = C40167b.m88525a(new Function0() { // from class: wl.c0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101285J();
        }
    });

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final InterfaceC40166a f103348m = C40167b.m88525a(new Function0() { // from class: wl.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101283H();
        }
    });

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final InterfaceC40166a f103349n = C40167b.m88525a(new Function0() { // from class: wl.d0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101297V();
        }
    });

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final InterfaceC40166a f103350o = C40167b.m88525a(new Function0() { // from class: wl.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101284I();
        }
    });

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final InterfaceC40166a f103351p = C40167b.m88525a(new Function0() { // from class: wl.f0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101298W();
        }
    });

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final InterfaceC40166a f103352q = C40167b.m88525a(new Function0() { // from class: wl.g0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101286K();
        }
    });

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final InterfaceC40166a f103353r = C40167b.m88525a(new Function0() { // from class: wl.h0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101305b0();
        }
    });

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final InterfaceC40166a f103354s = C40167b.m88525a(new Function0() { // from class: wl.i0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101303a0();
        }
    });

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final InterfaceC40166a f103355t = C40167b.m88525a(new Function0() { // from class: wl.j0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101307c0();
        }
    });

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final InterfaceC40166a f103356u = C40167b.m88525a(new Function0() { // from class: wl.k0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101309d0();
        }
    });

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final InterfaceC40166a f103357v = C40167b.m88525a(new Function0() { // from class: wl.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101293R();
        }
    });

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final InterfaceC40166a f103358w = C40167b.m88525a(new Function0() { // from class: wl.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101294S();
        }
    });

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final InterfaceC40166a f103359x = C40167b.m88525a(new Function0() { // from class: wl.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101296U();
        }
    });

    /* JADX INFO: renamed from: y */
    @NotNull
    public static final InterfaceC40166a f103360y = C40167b.m88525a(new Function0() { // from class: wl.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101287L();
        }
    });

    /* JADX INFO: renamed from: z */
    @NotNull
    public static final InterfaceC40166a f103361z = C40167b.m88525a(new Function0() { // from class: wl.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101288M();
        }
    });

    /* JADX INFO: renamed from: A */
    @NotNull
    public static final InterfaceC40166a f103332A = C40167b.m88525a(new Function0() { // from class: wl.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101292Q();
        }
    });

    /* JADX INFO: renamed from: B */
    @NotNull
    public static final InterfaceC40166a f103333B = C40167b.m88525a(new Function0() { // from class: wl.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101295T();
        }
    });

    /* JADX INFO: renamed from: C */
    @NotNull
    public static final InterfaceC40166a f103334C = C40167b.m88525a(new Function0() { // from class: wl.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101290O();
        }
    });

    /* JADX INFO: renamed from: D */
    @NotNull
    public static final InterfaceC40166a f103335D = C40167b.m88525a(new Function0() { // from class: wl.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45875l0.m101291P();
        }
    });

    /* JADX INFO: renamed from: C */
    public static final String m101278C() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.o());
        sb2.append("/h5/calculator?loading=2&appNeedLang=true&symbol=");
        C46527h0 c46527h0 = C46527h0.f104291a;
        sb2.append(c46527h0.m102677L());
        sb2.append("&isLot=");
        sb2.append(c46527h0.m102681Q());
        sb2.append("&theme=");
        sb2.append(DayNightThemeManager.f28592a.m33187l() ? "light" : "dark");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: D */
    public static final String m101279D() {
        return HostManager.a.o() + "/h5/rateProfit?appNeedLang=true";
    }

    /* JADX INFO: renamed from: E */
    public static final String m101280E() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.o());
        sb2.append("/h5/symbolInfo?theme=");
        sb2.append(DayNightThemeManager.f28592a.m33187l() ? "light" : "dark");
        sb2.append("&symbol=");
        sb2.append(C46527h0.f104291a.m102677L());
        sb2.append("&appNeedLang=true");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: F */
    public static final String m101281F() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.m());
        sb2.append(MultiLanguageManager.m56979h() ? "/news/" : "/news/en-");
        sb2.append("how-to-set-take-profit-and-stop-loss-when-placing-an-order-in-kucoin-futures-on-the-app");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: G */
    public static final String m101282G() {
        return HostManager.a.o() + "/bonus?loading=2&appNeedLang=true";
    }

    /* JADX INFO: renamed from: H */
    public static final String m101283H() {
        return HostManager.a.m() + "/support/26686471898009?appNeedLang=true";
    }

    /* JADX INFO: renamed from: I */
    public static final String m101284I() {
        return HostManager.a.m() + "/support/35084431335065?appNeedLang=true";
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004f  */
    /* JADX INFO: renamed from: J */
    public static final String m101285J() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.o());
        sb2.append("/contract/risk-limit/%s?loading=2&disablesilder=true&appNeedLang=true&utm_source=B6FuturesTradeProApp&night=");
        sb2.append(DayNightThemeManager.f28592a.m33187l() ? "light" : "dark");
        if (UserInfo.a.n()) {
            MultiBizType multiBizTypeMo4515x = BrokerConfig.f19211a.m20201d().mo4515x();
            MultiBizType multiBizType = MultiBizType.UNIFIED;
            if (multiBizTypeMo4515x == multiBizType) {
                str = "&accountType=" + multiBizType.getValue();
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: K */
    public static final String m101286K() {
        return HostManager.a.m() + "/support/35233217061785?appNeedLang=true";
    }

    /* JADX INFO: renamed from: L */
    public static final String m101287L() {
        return HostManager.a.m() + "/futures/contract/funding-rate-history/%s?appNeedLang=true&utm_source=B6FuturesTradeProApp";
    }

    /* JADX INFO: renamed from: M */
    public static final String m101288M() {
        return HostManager.a.m() + "/support/26695933047705?appNeedLang=true";
    }

    /* JADX INFO: renamed from: N */
    public static final String m101289N() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.o());
        sb2.append("/h5/rate/records?loading=2&appNeedLang=true");
        C46527h0 c46527h0 = C46527h0.f104291a;
        ContractEntity contractEntityM102673I = c46527h0.m102673I();
        if (C27025c.m66566d(contractEntityM102673I != null ? Boolean.valueOf(C37567b.m84625o(contractEntityM102673I)) : null)) {
            str = "&symbol=" + c46527h0.m102677L();
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: O */
    public static final String m101290O() {
        return HostManager.a.m() + "/learn/futures-academy?appNeedLang=true";
    }

    /* JADX INFO: renamed from: P */
    public static final String m101291P() {
        return HostManager.a.m() + "/announcement?appNeedLang=true";
    }

    /* JADX INFO: renamed from: Q */
    public static final String m101292Q() {
        return HostManager.a.m() + "/support/35084093025049?appNeedLang=true";
    }

    /* JADX INFO: renamed from: R */
    public static final String m101293R() {
        return HostManager.a.m() + "/support/35084431335065?appNeedLang=true";
    }

    /* JADX INFO: renamed from: S */
    public static final String m101294S() {
        return HostManager.a.m() + "/support/26694703491737?appNeedLang=true";
    }

    /* JADX INFO: renamed from: T */
    public static final String m101295T() {
        return HostManager.a.m() + "/support/48142946141285?appNeedLang=true";
    }

    /* JADX INFO: renamed from: U */
    public static final String m101296U() {
        return HostManager.a.m() + "/futures/contract/detail/%s?appNeedLang=true&utm_source=B6FuturesTradeProApp";
    }

    /* JADX INFO: renamed from: V */
    public static final String m101297V() {
        return HostManager.a.m() + "/support/26686471898009?appNeedLang=true";
    }

    /* JADX INFO: renamed from: W */
    public static final String m101298W() {
        return HostManager.a.m() + "/support/26694703491737?appNeedLang=true";
    }

    /* JADX INFO: renamed from: X */
    public static final String m101299X() {
        return KuMexDepend.f30378a.m35905g().d() + "_open_contract";
    }

    /* JADX INFO: renamed from: Y */
    public static final String m101300Y() {
        return HostManager.a.m() + "/land/KuRewards?loading=2&appNeedLang=true";
    }

    /* JADX INFO: renamed from: Z */
    public static final String m101301Z() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.j());
        sb2.append("/machine/torun/3?utm_source=FuturesToRobot&type=3&loading=2&dark=true&needLogin=true&appNeedLang=true");
        C46527h0 c46527h0 = C46527h0.f104291a;
        ContractEntity contractEntityM102673I = c46527h0.m102673I();
        if (C27025c.m66566d(contractEntityM102673I != null ? Boolean.valueOf(contractEntityM102673I.getSupportGridTrading()) : null)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("&symbol=");
            ContractEntity contractEntityM102673I2 = c46527h0.m102673I();
            sb3.append(contractEntityM102673I2 != null ? contractEntityM102673I2.getSymbol() : null);
            string = sb3.toString();
        } else {
            string = "";
        }
        sb2.append(string);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a0 */
    public static final String m101303a0() {
        return HostManager.a.m() + "/support/48142946141942?appNeedLang=true";
    }

    /* JADX INFO: renamed from: b0 */
    public static final String m101305b0() {
        return HostManager.a.m() + "/support/25463084736025?appNeedLang=true";
    }

    /* JADX INFO: renamed from: c0 */
    public static final String m101307c0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.m());
        sb2.append("/futures/h5/userGuide?appNeedLang=true&utm_source=userGuide&spm=");
        sb2.append(C43852m.m96602n(C17060n0.m36552b(), "userGuide", null, 4, null));
        sb2.append("&theme=");
        sb2.append(DayNightThemeManager.f28592a.m33187l() ? "light" : "dark");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d0 */
    public static final String m101309d0() {
        return HostManager.a.m() + "/futures/perks?appNeedLang=true&utm_source=app-perks&spm=" + C43852m.m96602n(C17060n0.m36552b(), "Futures_Perks", null, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: A0 */
    public final String m101332A0() {
        return (String) f103339d.getValue(this, f103337b[1]);
    }

    @NotNull
    /* JADX INFO: renamed from: B0 */
    public final String m101333B0() {
        return (String) f103354s.getValue(this, f103337b[16]);
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public final String m101334C0() {
        return (String) f103353r.getValue(this, f103337b[15]);
    }

    @NotNull
    /* JADX INFO: renamed from: D0 */
    public final String m101335D0() {
        return (String) f103355t.getValue(this, f103337b[17]);
    }

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public final String m101336E0() {
        return (String) f103356u.getValue(this, f103337b[18]);
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final String m101337e0() {
        return (String) f103341f.getValue(this, f103337b[3]);
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final String m101338f0() {
        return (String) f103345j.getValue(this, f103337b[7]);
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final String m101339g0() {
        return (String) f103344i.getValue(this, f103337b[6]);
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final String m101340h0() {
        return (String) f103342g.getValue(this, f103337b[4]);
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final String m101341i0() {
        return (String) f103348m.getValue(this, f103337b[10]);
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final String m101342j0() {
        return (String) f103350o.getValue(this, f103337b[12]);
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final String m101343k0() {
        return (String) f103347l.getValue(this, f103337b[9]);
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final String m101344l0() {
        return (String) f103352q.getValue(this, f103337b[14]);
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final String m101345m0() {
        return (String) f103360y.getValue(this, f103337b[22]);
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final String m101346n0() {
        return (String) f103361z.getValue(this, f103337b[23]);
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final String m101347o0() {
        return (String) f103338c.getValue(this, f103337b[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final String m101348p0() {
        return (String) f103334C.getValue(this, f103337b[26]);
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final String m101349q0() {
        return (String) f103335D.getValue(this, f103337b[27]);
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final String m101350r0() {
        return (String) f103332A.getValue(this, f103337b[24]);
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final String m101351s0() {
        return (String) f103357v.getValue(this, f103337b[19]);
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public final String m101352t0() {
        return (String) f103358w.getValue(this, f103337b[20]);
    }

    @NotNull
    /* JADX INFO: renamed from: u0 */
    public final String m101353u0() {
        return (String) f103333B.getValue(this, f103337b[25]);
    }

    @NotNull
    /* JADX INFO: renamed from: v0 */
    public final String m101354v0() {
        return (String) f103359x.getValue(this, f103337b[21]);
    }

    @NotNull
    /* JADX INFO: renamed from: w0 */
    public final String m101355w0() {
        return (String) f103349n.getValue(this, f103337b[11]);
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public final String m101356x0() {
        return (String) f103351p.getValue(this, f103337b[13]);
    }

    @NotNull
    /* JADX INFO: renamed from: y0 */
    public final String m101357y0() {
        return (String) f103340e.getValue(this, f103337b[2]);
    }

    @NotNull
    /* JADX INFO: renamed from: z0 */
    public final String m101358z0() {
        return (String) f103346k.getValue(this, f103337b[8]);
    }
}
