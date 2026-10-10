package com.kubi.mine.lib.p101ui;

import android.os.Build;
import android.text.TextUtils;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5276j;
import com.blankj.utilcode.util.C5305y;
import com.blankj.utilcode.util.NetworkUtils;
import com.kubi.mine.lib.exception.MineException;
import com.kubi.mine.lib.service.MineDepend;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p694vk.C45590s;
import p813yy.C46612b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.mine.lib.ui.o3 */
/* JADX INFO: compiled from: QaParamsFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\b\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0002¨\u0006\u0007"}, m90084d2 = {"getVisitorNote", "", "ip", "stockGoogleChannel", "isStockGoogle", "", "sensorsDistinctId", "MineLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQaParamsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QaParamsFragment.kt\ncom/kubi/mine/lib/ui/QaParamsFragmentKt\n+ 2 MineIssue.kt\ncom/kubi/mine/lib/exception/MineIssueKt\n*L\n1#1,241:1\n44#2,2:242\n*S KotlinDebug\n*F\n+ 1 QaParamsFragment.kt\ncom/kubi/mine/lib/ui/QaParamsFragmentKt\n*L\n237#1:242,2\n*E\n"})
public final class C19116o3 {
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m42275c(@Nullable String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = NetworkUtils.m6055c(true);
            }
        } catch (Exception unused) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UID: ");
        String str2 = MineDepend.f35159a.m41826e().uid;
        sb2.append(str2 != null ? str2 : "");
        sb2.append("\nIP: ");
        sb2.append(str);
        sb2.append("\nPlatform: Android\nVersion: ");
        C45590s c45590s = C45590s.f102687a;
        sb2.append(c45590s.m100675Z());
        sb2.append("\nLanguage-device: ");
        sb2.append(C46612b.f104366a.m102772a());
        sb2.append("\nLanguage-kucoin: ");
        sb2.append(MultiLanguageManager.f46811g.getLocalString());
        sb2.append("\nChannel: ");
        sb2.append(m42278f(c45590s.m100665P()));
        sb2.append("\nSystem: ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append("\nModel: ");
        sb2.append(C5276j.m6243b());
        sb2.append('-');
        sb2.append(C5276j.m6244c());
        sb2.append("\nScreenSize: ");
        sb2.append(C5267e0.m6182d());
        sb2.append('x');
        sb2.append(C5267e0.m6183e());
        sb2.append("\nNetworkType: ");
        sb2.append(NetworkUtils.m6057e().name());
        sb2.append("\nDeviceInfo: ");
        sb2.append(Build.FINGERPRINT);
        sb2.append("\nDeviceNo: ");
        sb2.append(C5276j.m6247f());
        sb2.append(m42277e());
        sb2.append("\nOperator: ");
        sb2.append(C5305y.m6515a());
        sb2.append("\nSignature(SHA1): ");
        sb2.append(C5264d.m6160f());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: e */
    public static final String m42277e() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('\n');
            String distinctId = SensorsDataAPI.sharedInstance().getDistinctId();
            if (distinctId == null) {
                distinctId = "";
            }
            sb2.append(distinctId);
            return sb2.toString();
        } catch (Throwable th2) {
            C43846g.m96568c(new MineException(th2, "QaParamsFragment", false, null, 8, null), null, 2, null);
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static final String m42278f(String str) {
        return (StringsKt.equals("GOOGLE", str, true) && m42276d()) ? "GOOGLE-STOCK" : str;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m42276d() {
        try {
            return Intrinsics.areEqual(C5264d.m6160f(), "6D:77:CD:D6:AF:DE:0F:0D:57:49:35:D1:F6:F5:D9:A9:E0:87:B0:CB");
        } catch (Exception unused) {
            return false;
        }
    }
}
