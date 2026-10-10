package gf;

import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: gf.z */
/* JADX INFO: compiled from: UserFlutterKlineConfig.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0006\u0010\u0016\u001a\u00020\u000bJ\u0006\u0010\u0017\u001a\u00020\u000bJ\u0006\u0010\u0018\u001a\u00020\u000bJ\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0!H\u0002J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0!H\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/data/coin/UserFlutterKlineConfig;", "", "<init>", "()V", "TAG", "", "CATEGORY", "MAIN_METRIC_KEY", "SUB_METRIC_KEY", "SELECTED_TIME_KEY", "mainChartArrayIndexToEnumValue", "", "arrayIndex", "mainChartEnumValueToArrayIndex", "enumValue", "subChartArrayIndexToEnumValue", "subChartEnumValueToArrayIndex", "resetInit", "", "klineChartTypeNameToArrayIndex", "enumName", "arrayIndexToKlineChartTypeName", "initKlinePos", "initMainChartPos", "initSubChartPos", "updateFlutterKlinePos", "pos", "updateFlutterKlineMainChartPos", "updateFlutterKlineSubChartPos", "updateMainMetricFromFlutter", "updateSubMetricFromFlutter", "updateSelectedTimeFromFlutter", "getMainMetricStorageId", "Lcom/kubi/utils/storage/StorageId;", "getSubMetricStorageId", "getSelectedTimeStorageId", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUserFlutterKlineConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserFlutterKlineConfig.kt\ncom/kubi/data/coin/UserFlutterKlineConfig\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 StorageId.kt\ncom/kubi/utils/storage/StorageIdKt\n*L\n1#1,337:1\n32#2:338\n67#2:339\n67#2:340\n23#2,2:341\n58#2,2:343\n58#2,2:345\n58#2,2:347\n58#2,2:349\n67#3:351\n67#3:352\n67#3:353\n*S KotlinDebug\n*F\n+ 1 UserFlutterKlineConfig.kt\ncom/kubi/data/coin/UserFlutterKlineConfig\n*L\n166#1:338\n183#1:339\n201#1:340\n223#1:341,2\n232#1:343,2\n240#1:345,2\n248#1:347,2\n256#1:349,2\n311#1:351\n320#1:352\n329#1:353\n*E\n"})
public final class C37902z {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37902z f85281a = new C37902z();

    /* JADX INFO: renamed from: l */
    public final int m85669l(int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 != 1) {
            return i11 != 2 ? -1 : 2;
        }
        return 3;
    }

    /* JADX INFO: renamed from: m */
    public final int m85670m(int i11) {
        if (i11 == 1) {
            return 0;
        }
        if (i11 != 2) {
            return i11 != 3 ? -1 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: n */
    public final void m85671n(int i11) {
        if (i11 == -1) {
            C46392a.m102329l(m85659b(), -1);
            return;
        }
        int iM85666i = m85666i(i11);
        if (iM85666i != -1) {
            C46392a.m102329l(m85659b(), iM85666i);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m85673p(int i11) {
        if (i11 == -1) {
            C46392a.m102329l(m85661d(), -1);
            return;
        }
        int iM85669l = m85669l(i11);
        if (iM85669l != -1) {
            C46392a.m102329l(m85661d(), iM85669l);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m85674q(int i11) {
        if (i11 == -1) {
            C37878b0.f85252a.m85540u(-1);
            return;
        }
        int iM85667j = m85667j(i11);
        if (iM85667j != -1) {
            C37878b0.f85252a.m85540u(iM85667j);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m85676s(int i11) {
        if (i11 == -1) {
            C37878b0.f85252a.m85541v(-1);
            return;
        }
        int iM85670m = m85670m(i11);
        if (iM85670m != -1) {
            C37878b0.f85252a.m85541v(iM85670m);
        }
    }

    /* JADX INFO: renamed from: b */
    public final StorageId<Integer> m85659b() {
        return new StorageId<>("flutter_kline_module", "main_metric_config", StorageType.Shared, false);
    }

    /* JADX INFO: renamed from: c */
    public final StorageId<String> m85660c() {
        return new StorageId<>("flutter_kline_module", "selected_time_config", StorageType.Shared, false);
    }

    /* JADX INFO: renamed from: d */
    public final StorageId<Integer> m85661d() {
        return new StorageId<>("flutter_kline_module", "sub_metric_config", StorageType.Shared, false);
    }

    /* JADX INFO: renamed from: i */
    public final int m85666i(int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                return -1;
            }
        }
        return i12;
    }

    /* JADX INFO: renamed from: j */
    public final int m85667j(int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                return -1;
            }
        }
        return i12;
    }

    /* JADX INFO: renamed from: k */
    public final void m85668k() {
        C37878b0 c37878b0 = C37878b0.f85252a;
        c37878b0.m85534o(m85662e());
        c37878b0.m85535p(m85663f());
        c37878b0.m85536q(m85664g());
    }

    /* JADX INFO: renamed from: r */
    public final void m85675r(@NotNull String enumName) {
        int iM85665h;
        Intrinsics.checkNotNullParameter(enumName, "enumName");
        if (StringsKt.isBlank(enumName) || (iM85665h = m85665h(enumName)) == -1) {
            return;
        }
        C37878b0.f85252a.m85538s(iM85665h);
    }

    /* JADX INFO: renamed from: a */
    public final String m85658a(int i11) {
        switch (i11) {
            case 0:
                return "timeline";
            case 1:
                return "oneM";
            case 2:
                return "fiveM";
            case 3:
                return "fifteenM";
            case 4:
                return "thirtyM";
            case 5:
                return "sixtyM";
            case 6:
                return "twoHour";
            case 7:
                return "fourHour";
            case 8:
                return "eightHour";
            case 9:
                return "dayK";
            case 10:
                return "weekK";
            case 11:
                return "monthK";
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m85662e() {
        StorageId<String> storageIdM85660c = m85660c();
        String strM102326h = C46392a.m102326h(storageIdM85660c, "");
        C44128b.m97259c("UserFlutterKlineConfig", "initKlinePos enumName:" + strM102326h + ", category=" + storageIdM85660c.getCategory() + ", key=" + storageIdM85660c.getKey() + ", storageType=" + storageIdM85660c.getStorageType());
        if (StringsKt.isBlank(strM102326h)) {
            return C37878b0.f85252a.m85523d();
        }
        int iM85665h = m85665h(strM102326h);
        if (iM85665h != -1) {
            return iM85665h;
        }
        return C37878b0.f85252a.m85523d();
    }

    /* JADX INFO: renamed from: f */
    public final int m85663f() {
        int iM85667j;
        int iM102323e = C46392a.m102323e(m85659b(), -1);
        if (iM102323e == -1 || (iM85667j = m85667j(iM102323e)) == -1) {
            return -1;
        }
        return iM85667j;
    }

    /* JADX INFO: renamed from: g */
    public final int m85664g() {
        int iM85670m;
        int iM102323e = C46392a.m102323e(m85661d(), -1);
        if (iM102323e == -1 || (iM85670m = m85670m(iM102323e)) == -1) {
            return -1;
        }
        return iM85670m;
    }

    /* JADX INFO: renamed from: h */
    public final int m85665h(String str) {
        switch (str) {
            case "timeline":
                return 0;
            case "thirtyM":
                return 4;
            case "monthK":
                return 11;
            case "twoHour":
                return 6;
            case "sixtyM":
                return 5;
            case "fifteenM":
                return 3;
            case "dayK":
                return 9;
            case "oneM":
                return 1;
            case "fiveM":
                return 2;
            case "weekK":
                return 10;
            case "eightHour":
                return 8;
            case "fourHour":
                return 7;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m85672o(int i11) {
        String strM85658a = m85658a(i11);
        if (strM85658a != null) {
            C46392a.m102333p(m85660c(), strM85658a);
        }
    }
}
