package com.forter.mobile.fortersdk;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ConfigurationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.SystemClock;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import com.facebook.AuthenticationTokenClaims;
import com.forter.mobile.fortersdk.C6514b.j;
import com.forter.mobile.fortersdk.models.NavigationType;
import com.forter.mobile.fortersdk.models.TrackType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p634t7.C44699a;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.t3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6609t3 {

    /* JADX INFO: renamed from: a */
    public static final ExecutorService f11060a = AbstractC6539f3.m12291y();

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.t3$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f11061b;

        public a(Context context) {
            this.f11061b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C6579n3 c6579n3 = new C6579n3();
            if (c6579n3.m12438b(this.f11061b)) {
                C6514b.m12151b().m12160i(c6579n3);
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.t3$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f11062b;

        public b(Context context) {
            this.f11062b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C6514b.m12151b().m12160i(AbstractC6609t3.m12481h(this.f11062b));
            C6514b.m12151b().m12160i(AbstractC6609t3.m12482i(this.f11062b));
            AbstractC6609t3.m12483j(this.f11062b);
            AbstractC6609t3.m12486m(this.f11062b);
            AbstractC6609t3.m12484k(this.f11062b);
            AbstractC6609t3.m12475b();
            AbstractC6609t3.m12485l(this.f11062b);
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.t3$c */
    public class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            C6564k3 c6564k3 = new C6564k3();
            if (c6564k3.m12417f()) {
                C6514b.m12151b().m12160i(c6564k3);
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.t3$d */
    /* JADX INFO: loaded from: classes45.dex */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f11063b;

        public d(Context context) {
            this.f11063b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C6514b.m12151b().m12160i(AbstractC6609t3.m12481h(this.f11063b));
            AbstractC6609t3.m12483j(this.f11063b);
            AbstractC6609t3.m12485l(this.f11063b);
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.t3$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f11064b;

        public e(Context context) {
            this.f11064b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC6619v3 interfaceC6619v3;
            String[] strArrM12411b;
            C6594q3 c6594q3;
            C6540g c6540gM12164a = AbstractC6515b0.m12164a("app/network2");
            if (c6540gM12164a == null || !AbstractC6518b3.m12172f(c6540gM12164a.f10953c)) {
                C6589p3 c6589p3 = new C6589p3(System.currentTimeMillis());
                Context context = this.f11064b;
                try {
                    C6540g c6540gM12164a2 = AbstractC6515b0.m12164a("app/network");
                    C6535f c6535f = new C6535f(c6540gM12164a2);
                    if (c6540gM12164a2 == null || !c6540gM12164a2.m12293a()) {
                        if (c6535f.m12248a("proxy") && (strArrM12411b = AbstractC6563k2.m12411b(context)) != null) {
                            c6589p3.f11041b.put("proxy", strArrM12411b.length < 3 ? String.format("%s:%s", strArrM12411b[0], strArrM12411b[1]) : String.format("%s:%s|excl:%s", strArrM12411b[0], strArrM12411b[1], strArrM12411b[2]));
                        }
                        if (c6535f.m12248a("currentNetworkType")) {
                            c6589p3.f11041b.put("currentNetworkType", AbstractC6563k2.m12412c(context));
                        }
                        if (c6535f.m12248a("currentSSID")) {
                            c6589p3.f11041b.put("currentSSID", AbstractC6563k2.m12415f(context));
                        }
                        if (c6535f.m12248a("isMetered")) {
                            c6589p3.f11041b.put("isMetered", AbstractC6563k2.m12414e(context));
                        }
                        if (c6535f.m12248a("interfaces")) {
                            c6589p3.f11041b.put("interfaces", AbstractC6563k2.m12410a());
                        }
                    }
                } catch (Throwable th2) {
                    C6514b.m12151b().m12159g(String.format("Failed generating event %s", "app/network"), th2.toString());
                }
                interfaceC6619v3 = c6589p3;
            } else {
                c6594q3 = new C6594q3(System.currentTimeMillis());
                Context context2 = this.f11064b;
                C6545h[] c6545hArrM12165b = AbstractC6515b0.m12165b("app/network2");
                if (c6545hArrM12165b != null) {
                    try {
                        interfaceC6619v3 = c6594q3;
                        JSONObject jSONObjectM12174h = AbstractC6518b3.m12174h(c6545hArrM12165b, "interfaces");
                        JSONObject jSONObjectM12174h2 = AbstractC6518b3.m12174h(c6545hArrM12165b, "networks");
                        JSONObject jSONObjectM12174h3 = AbstractC6518b3.m12174h(c6545hArrM12165b, "wifi");
                        AbstractC6518b3.m12167a(c6545hArrM12165b, "proxy");
                        C6545h c6545hM12167a = AbstractC6518b3.m12167a(c6545hArrM12165b, "trafficStats");
                        if (jSONObjectM12174h != null) {
                            c6594q3.f11046b.put("interfaces", AbstractC6583o2.m12447d());
                        }
                        if (jSONObjectM12174h2 != null) {
                            c6594q3.f11046b.put("networks", AbstractC6583o2.m12445b(context2, jSONObjectM12174h2));
                        }
                        if (jSONObjectM12174h3 != null) {
                            c6594q3.f11046b.put("wifi", AbstractC6583o2.m12455l(context2, jSONObjectM12174h3));
                        }
                        if (c6545hM12167a != null) {
                            c6594q3.f11046b.put("trafficStats", AbstractC6583o2.m12454k());
                        }
                        c6594q3.f11046b.put("currentNetworkType", C6503a0.m12070b(context2));
                        interfaceC6619v3 = c6594q3;
                    } catch (Throwable th3) {
                        C6514b.m12151b().m12159g(String.format("Failed generating event %s", "app/network2"), th3.toString());
                        interfaceC6619v3 = c6594q3;
                    }
                }
            }
            interfaceC6619v3 = c6594q3;
            C6514b.m12151b().m12162k(interfaceC6619v3);
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.t3$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f11065b;

        public f(Context context) {
            this.f11065b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                C6584o3 c6584o3 = new C6584o3();
                Context context = this.f11065b;
                C6540g c6540gM12164a = AbstractC6515b0.m12164a("app/network_conf");
                if (c6540gM12164a == null || !c6540gM12164a.m12293a()) {
                    c6584o3.f11027b = AbstractC6563k2.m12416g(context);
                }
                C6514b.m12151b().m12162k(c6584o3);
            } catch (Throwable unused) {
                AbstractC6524c3.m12212d();
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.t3$g */
    public class g implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Intent f11066b;

        public g(Intent intent) {
            this.f11066b = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Uri data;
            try {
                if (this.f11066b != null) {
                    try {
                        C6540g c6540gM12164a = AbstractC6515b0.m12164a("referralEvent");
                        if ((c6540gM12164a == null || !c6540gM12164a.m12293a()) && (data = this.f11066b.getData()) != null) {
                            C6514b.m12151b().m12160i(new C6599r3(TrackType.REFERRER, data.toString()));
                        }
                    } catch (Throwable th2) {
                        C6514b.m12151b().m12158f("generateAndQueueReferralEvent failed: ".concat(String.valueOf(th2)));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.t3$h */
    /* JADX INFO: loaded from: classes45.dex */
    public class h implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f11067b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Location f11068c;

        public h(Context context, Location location) {
            this.f11067b = context;
            this.f11068c = location;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C6569l3 c6569l3 = new C6569l3();
            if (c6569l3.m12426c(this.f11067b, this.f11068c)) {
                C6514b.m12151b().m12160i(c6569l3);
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.t3$i */
    /* JADX INFO: loaded from: classes45.dex */
    public class i implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f11069b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C6639z3 f11070c;

        public i(String str, C6639z3 c6639z3) {
            this.f11069b = str;
            this.f11070c = c6639z3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C6554i3 c6554i3 = new C6554i3();
            String str = this.f11069b;
            C6639z3 c6639z3 = this.f11070c;
            try {
                c6554i3.f10969a.put(TUIConstants.TIMPush.NOTIFICATION.ACTION, str);
                c6554i3.f10969a.put("id", c6639z3.f11097a);
                String str2 = c6639z3.f11098b;
                if (!TextUtils.isEmpty(str2)) {
                    c6554i3.f10969a.put("name", str2);
                }
                String str3 = c6639z3.f11099c;
                if (!TextUtils.isEmpty(str3)) {
                    c6554i3.f10969a.put("ownerPkgName", str3);
                }
            } catch (Throwable th2) {
                C6514b.m12151b().m12159g(String.format("Failed generating event %s", "app/display"), th2.toString());
            }
            C6514b.m12151b().m12160i(c6554i3);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static InterfaceC6619v3 m12474a(@NonNull NavigationType navigationType, @NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        C6574m3 c6574m3 = new C6574m3();
        c6574m3.f10999a = AbstractC6539f3.m12272f(navigationType.toString());
        c6574m3.f11002d = str;
        c6574m3.f11003e = str2;
        c6574m3.f11004f = str3;
        c6574m3.f11005g = str4;
        return c6574m3;
    }

    /* JADX INFO: renamed from: b */
    public static void m12475b() {
        try {
            f11060a.execute(new c());
        } catch (Throwable unused) {
            AbstractC6524c3.m12212d();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m12476c(@NonNull Context context) {
        try {
            f11060a.execute(new b(context));
        } catch (Throwable unused) {
            AbstractC6524c3.m12212d();
        }
    }

    @TargetApi(18)
    /* JADX INFO: renamed from: d */
    public static void m12477d(@NonNull Context context, @Nullable Location location) {
        try {
            f11060a.execute(new h(context, location));
        } catch (Throwable unused) {
            AbstractC6524c3.m12212d();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m12478e(@Nullable Intent intent) {
        try {
            f11060a.execute(new g(intent));
        } catch (Throwable unused) {
            AbstractC6524c3.m12212d();
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: f */
    public static void m12479f(@NonNull String str, @NonNull C6639z3 c6639z3) {
        try {
            f11060a.execute(new i(str, c6639z3));
        } catch (Throwable unused) {
            AbstractC6524c3.m12212d();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m12480g(@NonNull Context context) {
        try {
            f11060a.execute(new d(context));
        } catch (Throwable unused) {
            AbstractC6524c3.m12212d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* JADX INFO: renamed from: h */
    public static C6544g3 m12481h(@NonNull Context context) throws JSONException {
        JSONObject jSONObject;
        Boolean bool;
        Object objM12102b0;
        Boolean boolM98896v;
        ActivityManager activityManager;
        ConfigurationInfo deviceConfigurationInfo;
        JSONObject jSONObjectM12174h;
        JSONObject jSONObjectM12174h2;
        char c11;
        SubscriptionManager subscriptionManagerM12339S;
        SubscriptionInfo subscriptionInfoM12393x;
        Configuration configuration;
        C6544g3 c6544g3 = new C6544g3();
        try {
            C6540g c6540gM12164a = AbstractC6515b0.m12164a("app/active");
            C6535f c6535f = new C6535f(c6540gM12164a);
            if (c6540gM12164a == null || !c6540gM12164a.m12293a()) {
                if (c6535f.m12248a("deviceUID")) {
                    c6544g3.f10957a.put("deviceUID", C6520c.m12182b().m12196o(context));
                }
                if (c6535f.m12248a("deviceAppUID")) {
                    c6544g3.f10957a.put("deviceAppUID", C6520c.m12182b().m12196o(context));
                }
                if (c6535f.m12248a("installationID")) {
                    c6544g3.f10957a.put("installationID", AbstractC6539f3.m12269c(context));
                }
                JSONObject jSONObjectM12220d = C6526d0.m12220d(context);
                if (jSONObjectM12220d != null) {
                    c6544g3.f10957a.put("deviceUIDs", jSONObjectM12220d);
                }
                JSONObject jSONObjectM12231e = C6531e0.m12231e();
                if (jSONObjectM12231e != null) {
                    c6544g3.f10957a.put("dri", jSONObjectM12231e);
                }
                if (c6535f.m12249b("availableDrmEngines")) {
                    c6544g3.f10957a.put("availableDrmEngines", C6531e0.m12230d(context));
                }
                if (c6535f.m12248a(C33556b3.f69062k2)) {
                    c6544g3.f10957a.put(C33556b3.f69062k2, AbstractC6539f3.m12257D(context));
                }
                if (c6535f.m12248a(C33556b3.f69070m2)) {
                    c6544g3.f10957a.put(C33556b3.f69070m2, AbstractC6539f3.m12264K());
                }
                if (c6535f.m12248a("appInfo")) {
                    c6544g3.f10957a.put("appInfo", AbstractC6539f3.m12280n(context, c6535f));
                }
                if (c6535f.m12248a("locale")) {
                    c6544g3.f10957a.put("locale", LocaleList.getDefault().toLanguageTags());
                }
                if (c6535f.m12248a("appLocale")) {
                    JSONObject jSONObject2 = c6544g3.f10957a;
                    Resources resources = context.getResources();
                    jSONObject2.put("appLocale", (resources == null || (configuration = resources.getConfiguration()) == null) ? "" : configuration.getLocales().toLanguageTags());
                }
                JSONObject jSONObject3 = c6544g3.f10957a;
                try {
                    C6545h[] c6545hArrM12165b = AbstractC6515b0.m12165b("mobileNet");
                    if (c6545hArrM12165b != null) {
                        jSONObjectM12174h2 = AbstractC6518b3.m12174h(c6545hArrM12165b, "tel");
                        jSONObjectM12174h = AbstractC6518b3.m12174h(c6545hArrM12165b, AuthenticationTokenClaims.JSON_KEY_SUB);
                    } else {
                        jSONObjectM12174h = null;
                        jSONObjectM12174h2 = null;
                    }
                    TelephonyManager telephonyManagerM12330J = AbstractC6553i2.m12330J(context);
                    int i11 = Build.VERSION.SDK_INT;
                    int i12 = 26;
                    if (i11 >= 26) {
                        AbstractC6553i2.m12327H(jSONObject3, jSONObjectM12174h2, telephonyManagerM12330J);
                        AbstractC6553i2.m12337Q(jSONObject3, jSONObjectM12174h2, telephonyManagerM12330J);
                    }
                    AbstractC6553i2.m12344X(jSONObject3, jSONObjectM12174h2, telephonyManagerM12330J);
                    AbstractC6553i2.m12352c0(jSONObject3, jSONObjectM12174h2, telephonyManagerM12330J);
                    AbstractC6553i2.m12360g0(jSONObject3, jSONObjectM12174h2, telephonyManagerM12330J);
                    if (i11 >= 29) {
                        AbstractC6553i2.m12366j0(jSONObject3, jSONObjectM12174h2, telephonyManagerM12330J);
                    }
                    AbstractC6553i2.m12372m0(jSONObject3, jSONObjectM12174h2, telephonyManagerM12330J);
                    AbstractC6553i2.m12378p0(jSONObject3, jSONObjectM12174h2, telephonyManagerM12330J);
                    AbstractC6553i2.m12384s0(jSONObject3, jSONObjectM12174h2, telephonyManagerM12330J);
                    AbstractC6553i2.m12390v0(jSONObject3, jSONObjectM12174h2, telephonyManagerM12330J);
                    AbstractC6553i2.m12396y0(jSONObject3, jSONObjectM12174h2, telephonyManagerM12330J);
                    AbstractC6553i2.m12316B0(jSONObject3, jSONObjectM12174h2, telephonyManagerM12330J);
                    AbstractC6553i2.m12320D0(jSONObject3, jSONObjectM12174h2, telephonyManagerM12330J);
                    AbstractC6553i2.m12324F0(jSONObject3, jSONObjectM12174h2, telephonyManagerM12330J);
                    AbstractC6553i2.m12328H0(jSONObject3, jSONObjectM12174h2, telephonyManagerM12330J);
                    if (telephonyManagerM12330J != null && (jSONObjectM12174h2 == null || jSONObjectM12174h2.optBoolean("simCards", true))) {
                        int activeModemCount = i11 >= 30 ? telephonyManagerM12330J.getActiveModemCount() : telephonyManagerM12330J.getPhoneCount();
                        if (activeModemCount > 0) {
                            JSONArray jSONArray = new JSONArray();
                            int i13 = 0;
                            while (i13 < activeModemCount) {
                                JSONObject jSONObject4 = new JSONObject();
                                int i14 = Build.VERSION.SDK_INT;
                                if (i14 >= i12) {
                                    AbstractC6553i2.m12329I(jSONObject4, jSONObjectM12174h2, telephonyManagerM12330J, i13);
                                    AbstractC6553i2.m12338R(jSONObject4, jSONObjectM12174h2, telephonyManagerM12330J, i13);
                                }
                                AbstractC6553i2.m12345Y(jSONObject4, jSONObjectM12174h2, telephonyManagerM12330J, i13);
                                if (jSONObjectM12174h == null || (subscriptionManagerM12339S = AbstractC6553i2.m12339S(context)) == null || (subscriptionInfoM12393x = AbstractC6553i2.m12393x(subscriptionManagerM12339S, i13)) == null) {
                                    c11 = 29;
                                } else {
                                    AbstractC6553i2.m12325G(jSONObject4, jSONObjectM12174h, subscriptionInfoM12393x);
                                    AbstractC6553i2.m12336P(jSONObject4, jSONObjectM12174h, subscriptionInfoM12393x);
                                    AbstractC6553i2.m12343W(jSONObject4, jSONObjectM12174h, subscriptionInfoM12393x);
                                    AbstractC6553i2.m12350b0(jSONObject4, jSONObjectM12174h, subscriptionInfoM12393x);
                                    AbstractC6553i2.m12358f0(jSONObject4, jSONObjectM12174h, subscriptionInfoM12393x);
                                    AbstractC6553i2.m12364i0(jSONObject4, jSONObjectM12174h, subscriptionInfoM12393x);
                                    AbstractC6553i2.m12370l0(jSONObject4, jSONObjectM12174h, subscriptionInfoM12393x);
                                    c11 = 29;
                                    if (i14 >= 29) {
                                        AbstractC6553i2.m12376o0(jSONObject4, jSONObjectM12174h, subscriptionInfoM12393x);
                                        AbstractC6553i2.m12382r0(jSONObject4, jSONObjectM12174h, subscriptionInfoM12393x);
                                        AbstractC6553i2.m12388u0(jSONObject4, jSONObjectM12174h, subscriptionInfoM12393x);
                                        AbstractC6553i2.m12394x0(jSONObject4, jSONObjectM12174h, subscriptionInfoM12393x);
                                    }
                                    AbstractC6553i2.m12314A0(jSONObject4, jSONObjectM12174h, subscriptionInfoM12393x);
                                }
                                jSONArray.put(jSONObject4);
                                i13++;
                                i12 = 26;
                            }
                            jSONObject3.put("simCards", jSONArray);
                        }
                    }
                } catch (Throwable unused) {
                }
                if (c6535f.m12248a(FirebaseAnalytics.Param.CURRENCY)) {
                    c6544g3.f10957a.put(FirebaseAnalytics.Param.CURRENCY, AbstractC6506a3.m12128v(context));
                }
                if (c6535f.m12248a("deviceType")) {
                    jSONObject = null;
                    c6544g3.f10957a.put("deviceType", (Object) null);
                } else {
                    jSONObject = null;
                }
                if (c6535f.m12248a("deviceName")) {
                    c6544g3.f10957a.put("deviceName", "N/A");
                }
                if (c6535f.m12248a("deviceUptime")) {
                    c6544g3.f10957a.put("deviceUptime", Long.toString(SystemClock.elapsedRealtime()));
                }
                if (c6535f.m12248a("deviceSleepTime")) {
                    c6544g3.f10957a.put("deviceSleepTime", Long.toString(SystemClock.elapsedRealtime() - SystemClock.uptimeMillis()));
                }
                if (c6535f.m12248a("deviceFirstBoot")) {
                    c6544g3.f10957a.put("deviceFirstBoot", AbstractC6539f3.m12262I());
                }
                if (c6535f.m12248a("deviceBootCount")) {
                    c6544g3.f10957a.put("deviceBootCount", AbstractC6539f3.m12266M(context));
                }
                if (c6535f.m12248a("userFormatLocalTime")) {
                    c6544g3.f10957a.put("userFormatLocalTime", AbstractC6539f3.m12292z());
                }
                if (c6535f.m12248a("normalizedLocalTime")) {
                    c6544g3.f10957a.put("normalizedLocalTime", AbstractC6539f3.m12256C());
                }
                if (c6535f.m12248a("timeZoneName")) {
                    c6544g3.f10957a.put("timeZoneName", AbstractC6539f3.m12259F());
                }
                if (c6535f.m12248a("displayResolution")) {
                    c6544g3.f10957a.put("displayResolution", AbstractC6506a3.m12120n(AbstractC6506a3.m12081I(context)));
                }
                if (c6535f.m12248a("realDisplayResolution")) {
                    c6544g3.f10957a.put("realDisplayResolution", AbstractC6506a3.m12120n(AbstractC6506a3.m12083K(context)));
                }
                if (c6535f.m12248a("displaySize")) {
                    JSONObject jSONObject5 = c6544g3.f10957a;
                    DisplayMetrics displayMetricsM12083K = AbstractC6506a3.m12083K(context);
                    jSONObject5.put("displaySize", displayMetricsM12083K != null ? Double.toString(Math.round(Math.sqrt(Math.pow(((double) displayMetricsM12083K.widthPixels) / ((double) displayMetricsM12083K.xdpi), 2.0d) + Math.pow(((double) displayMetricsM12083K.heightPixels) / ((double) displayMetricsM12083K.ydpi), 2.0d)) * 100.0d) / 100.0d) : "FAILURE");
                }
                if (c6535f.m12248a("availableStorageCapacity")) {
                    c6544g3.f10957a.put("availableStorageCapacity", Long.toString(AbstractC6506a3.m12116j(Environment.getDataDirectory().getPath())));
                }
                if (c6535f.m12248a("totalStorageCapacity")) {
                    c6544g3.f10957a.put("totalStorageCapacity", Long.toString(AbstractC6506a3.m12126t(Environment.getDataDirectory().getPath())));
                }
                boolean zM12248a = c6535f.m12248a("availableExtStorageCapacity");
                boolean zM12248a2 = c6535f.m12248a("totalExtStorageCapacity");
                if (zM12248a || zM12248a2) {
                    String strM12074B = AbstractC6506a3.m12074B(context);
                    if (!TextUtils.isEmpty(strM12074B)) {
                        if (zM12248a) {
                            c6544g3.f10957a.put("availableExtStorageCapacity", Long.toString(AbstractC6506a3.m12116j(strM12074B)));
                        }
                        if (zM12248a2) {
                            c6544g3.f10957a.put("totalExtStorageCapacity", Long.toString(AbstractC6506a3.m12126t(strM12074B)));
                        }
                    }
                }
                if (c6535f.m12249b("availableSystemCapacity")) {
                    c6544g3.f10957a.put("availableSystemCapacity", Long.toString(AbstractC6506a3.m12116j(Environment.getRootDirectory().getPath())));
                }
                if (c6535f.m12249b("totalSystemCapacity")) {
                    c6544g3.f10957a.put("totalSystemCapacity", Long.toString(AbstractC6506a3.m12126t(Environment.getRootDirectory().getPath())));
                }
                if (c6535f.m12248a("totalMemoryCapacity")) {
                    c6544g3.f10957a.put("totalMemoryCapacity", Long.toString(AbstractC6506a3.m12078F(context)));
                }
                if (c6535f.m12248a("cpuCount")) {
                    c6544g3.f10957a.put("cpuCount", Integer.toString(AbstractC6506a3.m12077E()));
                }
                JSONObject jSONObjectM12084L = AbstractC6506a3.m12084L();
                if (jSONObjectM12084L != null) {
                    c6544g3.f10957a.put("cpuInfo", jSONObjectM12084L);
                }
                if (c6535f.m12249b("gpuInfo")) {
                    c6544g3.f10957a.put("gpuInfo", AbstractC6506a3.m12088P());
                }
                if (c6535f.m12248a("glVersion")) {
                    JSONObject jSONObject6 = c6544g3.f10957a;
                    Context applicationContext = context.getApplicationContext();
                    jSONObject6.put("glVersion", (applicationContext == null || (activityManager = (ActivityManager) applicationContext.getSystemService("activity")) == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null) ? 1 : (deviceConfigurationInfo.reqGlEsVersion & SupportMenu.CATEGORY_MASK) >> 16);
                }
                if (c6535f.m12248a("secondaryDisplays")) {
                    c6544g3.f10957a.put("secondaryDisplays", AbstractC6506a3.m12104c0(context));
                }
                if (c6535f.m12248a("osVersion")) {
                    c6544g3.f10957a.put("osVersion", Build.VERSION.RELEASE + " (API" + Build.VERSION.SDK_INT + ")");
                }
                if (c6535f.m12248a("osBuild")) {
                    c6544g3.f10957a.put("osBuild", Build.ID);
                }
                if (c6535f.m12248a("vendor")) {
                    c6544g3.f10957a.put("vendor", Build.BRAND);
                }
                if (c6535f.m12248a("platform")) {
                    c6544g3.f10957a.put("platform", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
                }
                if (c6535f.m12248a("defaultBrowser")) {
                    c6544g3.f10957a.put("defaultBrowser", AbstractC6506a3.m12127u());
                }
                if (c6535f.m12249b("wvPkg")) {
                    c6544g3.f10957a.put("wvPkg", AbstractC6506a3.m12073A());
                }
                if (c6535f.m12248a("romBuildInfo")) {
                    c6544g3.f10957a.put("romBuildInfo", AbstractC6506a3.m12122p());
                }
                if (c6535f.m12248a("kernelInfo")) {
                    c6544g3.f10957a.put("kernelInfo", AbstractC6506a3.m12086N());
                }
                JSONObject jSONObjectM12092T = AbstractC6506a3.m12092T();
                if (jSONObjectM12092T != null) {
                    c6544g3.f10957a.put("environ", jSONObjectM12092T);
                }
                if (c6535f.m12248a("isSimulator")) {
                    c6544g3.f10957a.put("isSimulator", AbstractC6551i0.m12311a());
                }
                if (c6535f.m12248a("isJailbroken")) {
                    C44699a c44699aM12197p = C6520c.m12182b().m12197p();
                    if (c44699aM12197p != null) {
                        boolM98896v = c44699aM12197p.m98896v();
                    } else {
                        bool = jSONObject;
                    }
                    if (bool == 0 || !bool.booleanValue()) {
                        bool = boolM98896v;
                        objM12102b0 = bool;
                        bool = boolM98896v;
                        objM12102b0 = AbstractC6506a3.m12102b0(context);
                    }
                    bool = boolM98896v;
                    objM12102b0 = bool;
                    c6544g3.f10957a.put("isJailbroken", objM12102b0);
                }
                if (c6535f.m12249b("hooks")) {
                    c6544g3.f10957a.put("hooks", AbstractC6506a3.m12090R());
                }
                if (c6535f.m12248a("isLocked")) {
                    c6544g3.f10957a.put("isLocked", AbstractC6506a3.m12106d0(context));
                }
                if (c6535f.m12249b("bat")) {
                    c6544g3.f10957a.put("bat", AbstractC6506a3.m12108e0(context));
                }
                if (c6535f.m12248a("isFirstRun")) {
                    c6544g3.f10957a.put("isFirstRun", AbstractC6539f3.m12255B(context));
                }
                if (c6535f.m12248a("canInstallUnknownApps")) {
                    c6544g3.f10957a.put("canInstallUnknownApps", AbstractC6506a3.m12096X(context));
                }
                if (c6535f.m12248a("ringtones")) {
                    c6544g3.f10957a.put("ringtones", AbstractC6506a3.m12097Y(context));
                }
                if (c6535f.m12248a("wallpapers")) {
                    c6544g3.f10957a.put("wallpapers", AbstractC6506a3.m12098Z(context));
                }
                if (c6535f.m12248a("usersInfo")) {
                    c6544g3.f10957a.put("usersInfo", AbstractC6506a3.m12100a0(context));
                }
                if (c6535f.m12248a("accounts")) {
                    c6544g3.f10957a.put("accounts", AbstractC6506a3.m12085M(context));
                }
                C6545h[] c6545hArrM12165b2 = AbstractC6515b0.m12165b("app/applications");
                JSONObject jSONObjectM12494c = c6545hArrM12165b2 == null ? jSONObject : C6625x.m12494c(context, c6545hArrM12165b2);
                if (jSONObjectM12494c != null) {
                    c6544g3.f10957a.put("applicationsInfo", jSONObjectM12494c);
                }
                if (c6535f.m12249b("sysFeatures")) {
                    c6544g3.f10957a.put("sysFeatures", AbstractC6506a3.m12087O(context));
                }
                if (c6535f.m12248a("hasManufacturerFeatures")) {
                    c6544g3.f10957a.put("hasManufacturerFeatures", AbstractC6506a3.m12089Q(context));
                }
                if (c6535f.m12248a("enabledKeyboardsLanguages")) {
                    String strM12118l = AbstractC6506a3.m12118l(context);
                    c6544g3.f10957a.put("enabledKeyboardsLanguages", strM12118l.substring(0, strM12118l.length() < 250 ? strM12118l.length() : 249));
                }
                if (c6535f.m12249b("userCerts")) {
                    c6544g3.f10957a.put("userCerts", AbstractC6506a3.m12082J());
                }
                JSONObject jSONObjectM12252b = C6536f0.m12252b(context);
                if (jSONObjectM12252b != null) {
                    c6544g3.f10957a.put("deviceSettings", jSONObjectM12252b);
                }
                JSONObject jSONObjectM12309b = C6546h0.m12309b();
                if (jSONObjectM12309b != null) {
                    c6544g3.f10957a.put("systemProps", jSONObjectM12309b);
                }
            }
        } catch (Throwable th2) {
            C6514b.m12151b().m12159g(String.format("Failed generating event %s", "app/active"), th2.toString());
        }
        return c6544g3;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static C6549h3 m12482i(@NonNull Context context) {
        C6549h3 c6549h3 = new C6549h3();
        try {
            C6540g c6540gM12164a = AbstractC6515b0.m12164a("app/sensors");
            C6535f c6535f = new C6535f(c6540gM12164a);
            if (c6540gM12164a == null || !c6540gM12164a.m12293a()) {
                if (c6535f.m12248a("sensors")) {
                    c6549h3.f10963a.put("sensors", AbstractC6506a3.m12094V(context));
                }
                if (c6535f.m12248a("cameraInfo")) {
                    c6549h3.f10963a.put("cameraInfo", AbstractC6506a3.m12091S(context));
                }
                if (c6535f.m12249b("inputDevices")) {
                    c6549h3.f10963a.put("inputDevices", AbstractC6506a3.m12095W(context));
                    return c6549h3;
                }
            }
        } catch (Throwable th2) {
            C6514b.m12151b().m12159g(String.format("Failed generating event %s", "app/sensors"), th2.toString());
        }
        return c6549h3;
    }

    /* JADX INFO: renamed from: j */
    public static void m12483j(@NonNull Context context) {
        try {
            f11060a.execute(new e(context));
        } catch (Throwable unused) {
            AbstractC6524c3.m12212d();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m12484k(@NonNull Context context) {
        try {
            f11060a.execute(new f(context));
        } catch (Throwable unused) {
            AbstractC6524c3.m12212d();
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m12486m(@NonNull Context context) {
        try {
            f11060a.execute(new a(context));
        } catch (Throwable unused) {
            AbstractC6524c3.m12212d();
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m12485l(@NonNull Context context) {
        C6514b c6514bM12151b = C6514b.m12151b();
        if (!c6514bM12151b.m12163l()) {
            c6514bM12151b.f10871a.execute(c6514bM12151b.new j(context));
        }
    }
}
