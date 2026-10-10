package gf;

import com.facebook.react.uimanager.ViewProps;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.DataInitManager;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.storage.StorageType;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p311hf.C38190h;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: gf.b0 */
/* JADX INFO: compiled from: UserKlineConfig.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0005J\u000e\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020\u0005J\u000e\u00103\u001a\u00020/2\u0006\u00102\u001a\u00020\u0005J\u000e\u00104\u001a\u00020/2\u0006\u00102\u001a\u00020\u0005J\u000e\u00105\u001a\u00020/2\u0006\u00102\u001a\u00020\u0005J\u000e\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020\u0005J\u000e\u00108\u001a\u00020/2\u0006\u00107\u001a\u00020\u0005J\u000e\u00109\u001a\u00020/2\u0006\u00107\u001a\u00020\u0017J\u0016\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u0017J\u000e\u0010=\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u0005J\n\u0010>\u001a\u0004\u0018\u00010)H\u0002J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050@2\u0006\u0010A\u001a\u00020)H\u0002J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00170@2\u0006\u0010A\u001a\u00020)H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001a\u0010\"\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001a\u0010%\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u000e\u0010(\u001a\u00020)X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0019¨\u0006C"}, m90084d2 = {"Lcom/kubi/data/coin/UserKlineConfig;", "", "<init>", "()V", "currentKline", "", "getCurrentKline", "()I", "setCurrentKline", "(I)V", "currentMainChart", "getCurrentMainChart", "setCurrentMainChart", "currentNoMainChart", "getCurrentNoMainChart", "setCurrentNoMainChart", "currentCandleLite", "getCurrentCandleLite", "setCurrentCandleLite", "currentLineLite", "getCurrentLineLite", "setCurrentLineLite", "currentTypeLite", "", "getCurrentTypeLite", "()Z", "setCurrentTypeLite", "(Z)V", "userContractOrderBookAmountType", "getUserContractOrderBookAmountType", "setUserContractOrderBookAmountType", "userOrderBookAmountType", "getUserOrderBookAmountType", "setUserOrderBookAmountType", "showHistory", "getShowHistory", "setShowHistory", "showActive", "getShowActive", "setShowActive", "CATE", "", "useFlutterKLine", "getUseFlutterKLine", "useFlutterKLine$delegate", "Lkotlin/Lazy;", "setKline", "", "tag", "setMainChart", ViewProps.POSITION, "setNoMainChart", "setUserOrderBookType", "setUserContractOrderBookType", "setCandleLite", "type", "setLineLite", "setTypeLite", "setCurrentTradeType", "tradeType", "isVertical", "getCurrentTradeTypeVertical", "userId", "intKVId", "Lcom/kubi/utils/storage/StorageId;", "key", "boolKVId", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUserKlineConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserKlineConfig.kt\ncom/kubi/data/coin/UserKlineConfig\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,183:1\n58#2,2:184\n58#2,2:186\n58#2,2:188\n58#2,2:190\n58#2,2:192\n58#2,2:194\n58#2,2:196\n126#2,2:198\n126#2,2:200\n136#2:202\n67#2:210\n67#2:211\n67#2:212\n67#2:213\n67#2:214\n67#2:215\n67#2:216\n136#2:217\n35#3,4:203\n39#3:209\n44#4,2:207\n*S KotlinDebug\n*F\n+ 1 UserKlineConfig.kt\ncom/kubi/data/coin/UserKlineConfig\n*L\n103#1:184,2\n111#1:186,2\n120#1:188,2\n128#1:190,2\n133#1:192,2\n138#1:194,2\n143#1:196,2\n148#1:198,2\n155#1:200,2\n159#1:202\n77#1:210\n86#1:211\n91#1:212\n93#1:213\n95#1:214\n96#1:215\n97#1:216\n98#1:217\n69#1:203,4\n69#1:209\n69#1:207,2\n*E\n"})
public final class C37878b0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37878b0 f85252a;

    /* JADX INFO: renamed from: b */
    public static int f85253b;

    /* JADX INFO: renamed from: c */
    public static int f85254c;

    /* JADX INFO: renamed from: d */
    public static int f85255d;

    /* JADX INFO: renamed from: e */
    public static int f85256e;

    /* JADX INFO: renamed from: f */
    public static int f85257f;

    /* JADX INFO: renamed from: g */
    public static boolean f85258g;

    /* JADX INFO: renamed from: h */
    public static int f85259h;

    /* JADX INFO: renamed from: i */
    public static int f85260i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Lazy f85261j;

    /* JADX INFO: renamed from: gf.b0$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    static {
        int iM102323e;
        int iM102323e2;
        int iM102323e3;
        C37878b0 c37878b0 = new C37878b0();
        f85252a = c37878b0;
        f85253b = 3;
        f85254c = -1;
        f85255d = -1;
        f85258g = true;
        f85261j = LazyKt.lazy(new Function0() { // from class: gf.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C37878b0.m85519z());
            }
        });
        String strM85520A = c37878b0.m85520A();
        if (c37878b0.m85529j()) {
            iM102323e = C37902z.f85281a.m85662e();
        } else {
            iM102323e = C46392a.m102323e(c37878b0.m85532m(strM85520A + "currentKline_new"), 3);
        }
        f85253b = iM102323e;
        if (!C38190h.f85888a.m86167l() && f85253b == 11) {
            c37878b0.m85538s(10);
        }
        if (c37878b0.m85529j()) {
            iM102323e2 = C37902z.f85281a.m85663f();
        } else {
            iM102323e2 = C46392a.m102323e(c37878b0.m85532m(strM85520A + "currentMainChart"), -1);
        }
        f85254c = iM102323e2;
        if (c37878b0.m85529j()) {
            iM102323e3 = C37902z.f85281a.m85664g();
        } else {
            iM102323e3 = C46392a.m102323e(c37878b0.m85532m(strM85520A + "currentNoMainChart"), -1);
        }
        f85255d = iM102323e3;
        f85260i = C46392a.m102323e(c37878b0.m85532m(strM85520A + "userOrderBookAmountType"), 0);
        f85259h = C46392a.m102323e(c37878b0.m85532m(strM85520A + "userContractOrderBookAmountType"), 0);
        f85256e = C46392a.m102323e(c37878b0.m85532m(strM85520A + "currentCandleLite"), 0);
        f85257f = C46392a.m102323e(c37878b0.m85532m(strM85520A + "currentLineLite"), 0);
        f85258g = C46392a.m102322d(c37878b0.m85521b(strM85520A + "currentTypeLite"), true);
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m85519z() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_market_flutter_kline", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: A */
    public final String m85520A() {
        return DataInitManager.f21486a.m23668i().mo23676d();
    }

    /* JADX INFO: renamed from: b */
    public final StorageId<Boolean> m85521b(String str) {
        return new StorageId<>("UserKlineConfig", str, StorageType.Shared, true);
    }

    /* JADX INFO: renamed from: c */
    public final int m85522c() {
        return f85256e;
    }

    /* JADX INFO: renamed from: d */
    public final int m85523d() {
        return f85253b;
    }

    /* JADX INFO: renamed from: e */
    public final int m85524e() {
        return f85257f;
    }

    /* JADX INFO: renamed from: f */
    public final int m85525f() {
        return f85254c;
    }

    /* JADX INFO: renamed from: g */
    public final int m85526g() {
        return f85255d;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m85527h(int i11) {
        return C46392a.m102322d(m85521b("setCurrentTradeType" + i11), true);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m85528i() {
        return f85258g;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m85529j() {
        return ((Boolean) f85261j.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public final int m85530k() {
        return f85259h;
    }

    /* JADX INFO: renamed from: l */
    public final int m85531l() {
        return f85260i;
    }

    /* JADX INFO: renamed from: m */
    public final StorageId<Integer> m85532m(String str) {
        return new StorageId<>("UserKlineConfig", str, StorageType.Shared, true);
    }

    /* JADX INFO: renamed from: n */
    public final void m85533n(int i11) {
        f85256e = i11;
        C46392a.m102329l(m85532m(m85520A() + "currentCandleLite"), f85256e);
    }

    /* JADX INFO: renamed from: o */
    public final void m85534o(int i11) {
        f85253b = i11;
    }

    /* JADX INFO: renamed from: p */
    public final void m85535p(int i11) {
        f85254c = i11;
    }

    /* JADX INFO: renamed from: q */
    public final void m85536q(int i11) {
        f85255d = i11;
    }

    /* JADX INFO: renamed from: r */
    public final void m85537r(int i11, boolean z11) {
        C46392a.m102328k(m85521b("setCurrentTradeType" + i11), z11);
    }

    /* JADX INFO: renamed from: s */
    public final void m85538s(int i11) {
        f85253b = i11;
        C46392a.m102329l(m85532m(m85520A() + "currentKline_new"), f85253b);
        if (m85529j()) {
            C37902z.f85281a.m85672o(i11);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m85539t(int i11) {
        f85257f = i11;
        C46392a.m102329l(m85532m(m85520A() + "currentLineLite"), f85257f);
    }

    /* JADX INFO: renamed from: u */
    public final void m85540u(int i11) {
        f85254c = i11;
        C46392a.m102329l(m85532m(m85520A() + "currentMainChart"), i11);
        if (m85529j()) {
            C37902z.f85281a.m85671n(i11);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m85541v(int i11) {
        f85255d = i11;
        C46392a.m102329l(m85532m(m85520A() + "currentNoMainChart"), i11);
        if (m85529j()) {
            C37902z.f85281a.m85673p(i11);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m85542w(boolean z11) {
        f85258g = z11;
        C46392a.m102328k(m85521b(m85520A() + "currentTypeLite"), f85258g);
    }

    /* JADX INFO: renamed from: x */
    public final void m85543x(int i11) {
        f85259h = i11;
        C46392a.m102329l(m85532m(m85520A() + "userContractOrderBookAmountType"), i11);
    }

    /* JADX INFO: renamed from: y */
    public final void m85544y(int i11) {
        f85260i = i11;
        C46392a.m102329l(m85532m(m85520A() + "userOrderBookAmountType"), i11);
    }
}
