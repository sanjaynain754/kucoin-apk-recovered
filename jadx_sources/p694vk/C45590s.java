package p694vk;

import androidx.annotation.DrawableRes;
import com.kubi.sdk.viewbindingdelegate.base.C24294b;
import com.tencent.bugly.proguard.C33786m2;
import com.tencent.bugly.proguard.C33820nf;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import y70.C46396e;

/* JADX INFO: renamed from: vk.s */
/* JADX INFO: compiled from: AppConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b.\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0098\u0001\u0010S\u001a\u00020T2\u0006\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020\u00052\u0006\u0010E\u001a\u00020%2\u0006\u0010A\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00052\b\b\u0001\u0010J\u001a\u00020%2\u0006\u0010K\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00052\u0006\u0010O\u001a\u00020%2\u0006\u0010P\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020%2\u0006\u0010R\u001a\u00020\u0005J\u0006\u0010U\u001a\u00020\u001aJ\u0006\u0010V\u001a\u00020\u001aR\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u000e\u0010\u0007R\u001b\u0010\u0010\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0011\u0010\u0007R\u001b\u0010\u0013\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0014\u0010\u0007R\u001b\u0010\u0016\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0017\u0010\u0007R\u001b\u0010\u0019\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b\u001f\u0010\u0007R\u001b\u0010!\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b\"\u0010\u0007R\u001b\u0010$\u001a\u00020%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\t\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\t\u001a\u0004\b*\u0010\u0007R\u001b\u0010,\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\t\u001a\u0004\b-\u0010\u0007R\u001b\u0010/\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\t\u001a\u0004\b0\u0010\u0007R\u001b\u00102\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\t\u001a\u0004\b3\u0010\u0007R\u001b\u00105\u001a\u00020%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\t\u001a\u0004\b6\u0010'R\u001b\u00108\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\t\u001a\u0004\b9\u0010\u0007R\u001b\u0010;\u001a\u00020%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\t\u001a\u0004\b<\u0010'R\u001b\u0010>\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\t\u001a\u0004\b?\u0010\u0007R\u000e\u0010A\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006W"}, m90084d2 = {"Lcom/kubi/kucoin/AppConfig;", "", "<init>", "()V", "APPLICATION_ID", "", "getAPPLICATION_ID", "()Ljava/lang/String;", "APPLICATION_ID$delegate", "Lkotlin/Lazy;", "VERSION_NAME", "getVERSION_NAME", "VERSION_NAME$delegate", "VERSION_CODE", "getVERSION_CODE", "VERSION_CODE$delegate", "VERSION_NAME_FLAVOR", "getVERSION_NAME_FLAVOR", "VERSION_NAME_FLAVOR$delegate", "VERSION_CODE_FLAVOR", "getVERSION_CODE_FLAVOR", "VERSION_CODE_FLAVOR$delegate", "CHANNEL_VALUE", "getCHANNEL_VALUE", "CHANNEL_VALUE$delegate", "DEBUG", "", "getDEBUG", "()Z", "DEBUG$delegate", "API_BUILD_TYPE", "getAPI_BUILD_TYPE", "API_BUILD_TYPE$delegate", "RCODE", "getRCODE", "RCODE$delegate", "APP_ICON", "", "getAPP_ICON", "()I", "APP_ICON$delegate", "X_VERSION", "getX_VERSION", "X_VERSION$delegate", "SENSORSDATA_AB_PATH", "getSENSORSDATA_AB_PATH", "SENSORSDATA_AB_PATH$delegate", "SENSORSDATA_SINK_PATH", "getSENSORSDATA_SINK_PATH", "SENSORSDATA_SINK_PATH$delegate", "BUILD_ID", "getBUILD_ID", "BUILD_ID$delegate", "FIREBASE_COMFIG_FILE", "getFIREBASE_COMFIG_FILE", "FIREBASE_COMFIG_FILE$delegate", "APP_CONFIG_CHANNEL", "getAPP_CONFIG_CHANNEL", "APP_CONFIG_CHANNEL$delegate", "TIM_PUSH_APP_ID", "getTIM_PUSH_APP_ID", "TIM_PUSH_APP_ID$delegate", "TIM_PUSH_APP_KEY", "getTIM_PUSH_APP_KEY", "TIM_PUSH_APP_KEY$delegate", "applicationID", "versionName", "versionCode", "versionNameFlavor", "versionCodeFlavor", "channelValue", "debug", "apiBuildType", "rCode", "appIcon", "x_version", "sensorsdata_ab_path", "sensorsdata_sink_path", "buildId", "firebaseConfigFile", "appConfigChannel", "timPushAppId", "timPushAppKey", "init", "", "isProduce", "isFirstStartup", "LAppConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppConfig.kt\ncom/kubi/kucoin/AppConfig\n+ 2 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n*L\n1#1,155:1\n250#2,2:156\n211#2,2:158\n*S KotlinDebug\n*F\n+ 1 AppConfig.kt\ncom/kubi/kucoin/AppConfig\n*L\n151#1:156,2\n152#1:158,2\n*E\n"})
public final class C45590s {

    /* JADX INFO: renamed from: A */
    public static String f102676A;

    /* JADX INFO: renamed from: B */
    public static String f102677B;

    /* JADX INFO: renamed from: C */
    public static int f102678C;

    /* JADX INFO: renamed from: D */
    public static String f102679D;

    /* JADX INFO: renamed from: E */
    public static String f102680E;

    /* JADX INFO: renamed from: F */
    public static String f102681F;

    /* JADX INFO: renamed from: G */
    public static String f102682G;

    /* JADX INFO: renamed from: H */
    public static int f102683H;

    /* JADX INFO: renamed from: I */
    public static String f102684I;

    /* JADX INFO: renamed from: J */
    public static int f102685J;

    /* JADX INFO: renamed from: K */
    public static String f102686K;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45590s f102687a = new C45590s();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f102688b = LazyKt.lazy(new Function0() { // from class: vk.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45590s.m100653t();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f102689c = LazyKt.lazy(new Function0() { // from class: vk.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45590s.m100632I();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f102690d = LazyKt.lazy(new Function0() { // from class: vk.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45590s.m100630G();
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy f102691e = LazyKt.lazy(new Function0() { // from class: vk.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45590s.m100631H();
        }
    });

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Lazy f102692f = LazyKt.lazy(new Function0() { // from class: vk.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45590s.m100629F();
        }
    });

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Lazy f102693g = LazyKt.lazy(new Function0() { // from class: vk.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45590s.m100657x();
        }
    });

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Lazy f102694h = LazyKt.lazy(new Function0() { // from class: vk.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C45590s.m100658y());
        }
    });

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Lazy f102695i = LazyKt.lazy(new Function0() { // from class: vk.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45590s.m100652s();
        }
    });

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Lazy f102696j = LazyKt.lazy(new Function0() { // from class: vk.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45590s.m100624A();
        }
    });

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Lazy f102697k = LazyKt.lazy(new Function0() { // from class: vk.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(C45590s.m100655v());
        }
    });

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Lazy f102698l = LazyKt.lazy(new Function0() { // from class: vk.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45590s.m100633J();
        }
    });

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Lazy f102699m = LazyKt.lazy(new Function0() { // from class: vk.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45590s.m100625B();
        }
    });

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Lazy f102700n = LazyKt.lazy(new Function0() { // from class: vk.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45590s.m100626C();
        }
    });

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Lazy f102701o = LazyKt.lazy(new Function0() { // from class: vk.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45590s.m100656w();
        }
    });

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Lazy f102702p = LazyKt.lazy(new Function0() { // from class: vk.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(C45590s.m100659z());
        }
    });

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Lazy f102703q = LazyKt.lazy(new Function0() { // from class: vk.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45590s.m100654u();
        }
    });

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Lazy f102704r = LazyKt.lazy(new Function0() { // from class: vk.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(C45590s.m100627D());
        }
    });

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final Lazy f102705s = LazyKt.lazy(new Function0() { // from class: vk.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45590s.m100628E();
        }
    });

    /* JADX INFO: renamed from: t */
    public static String f102706t;

    /* JADX INFO: renamed from: u */
    public static String f102707u;

    /* JADX INFO: renamed from: v */
    public static String f102708v;

    /* JADX INFO: renamed from: w */
    public static String f102709w;

    /* JADX INFO: renamed from: x */
    public static String f102710x;

    /* JADX INFO: renamed from: y */
    public static String f102711y;

    /* JADX INFO: renamed from: z */
    public static boolean f102712z;

    /* JADX WARN: Code duplicated, block: B:13:0x00ad  */
    /* JADX INFO: renamed from: c0 */
    public final void m100678c0(@NotNull String versionName, int i11, @NotNull String versionNameFlavor, int i12, @NotNull String applicationID, @NotNull String channelValue, boolean z11, @NotNull String apiBuildType, @NotNull String rCode, @DrawableRes int i13, @NotNull String x_version, @NotNull String sensorsdata_ab_path, @NotNull String sensorsdata_sink_path, @NotNull String buildId, int i14, @NotNull String appConfigChannel, int i15, @NotNull String timPushAppKey) {
        String str;
        boolean z12;
        int i16;
        Object obj;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(versionNameFlavor, "versionNameFlavor");
        Intrinsics.checkNotNullParameter(applicationID, "applicationID");
        Intrinsics.checkNotNullParameter(channelValue, "channelValue");
        Intrinsics.checkNotNullParameter(apiBuildType, "apiBuildType");
        Intrinsics.checkNotNullParameter(rCode, "rCode");
        Intrinsics.checkNotNullParameter(x_version, "x_version");
        Intrinsics.checkNotNullParameter(sensorsdata_ab_path, "sensorsdata_ab_path");
        Intrinsics.checkNotNullParameter(sensorsdata_sink_path, "sensorsdata_sink_path");
        Intrinsics.checkNotNullParameter(buildId, "buildId");
        Intrinsics.checkNotNullParameter(appConfigChannel, "appConfigChannel");
        Intrinsics.checkNotNullParameter(timPushAppKey, "timPushAppKey");
        if (StringsKt.contains$default((CharSequence) versionName, (CharSequence) C33820nf.f71144W, false, 2, (Object) null)) {
            String[] strArr = {C33820nf.f71144W};
            i16 = 2;
            obj = null;
            str = C33820nf.f71144W;
            z12 = false;
            str2 = (String) CollectionsKt.firstOrNull(StringsKt.split$default((CharSequence) versionName, strArr, false, 0, 6, (Object) null));
            if (str2 == null) {
            }
            f102707u = str2;
            f102708v = String.valueOf(i11);
            if (StringsKt.contains$default(versionNameFlavor, str, z12, i16, obj) || (str3 = (String) CollectionsKt.firstOrNull(StringsKt.split$default((CharSequence) versionNameFlavor, new String[]{str}, false, 0, 6, (Object) null))) == null) {
                str3 = versionNameFlavor;
            }
            f102709w = str3;
            f102710x = String.valueOf(i12);
            f102706t = applicationID;
            f102711y = channelValue;
            f102712z = z11;
            f102676A = apiBuildType;
            f102677B = rCode;
            f102678C = i13;
            f102679D = x_version;
            f102680E = sensorsdata_ab_path;
            f102681F = sensorsdata_sink_path;
            f102682G = buildId;
            f102683H = i14;
            f102684I = appConfigChannel;
            f102685J = i15;
            f102686K = timPushAppKey;
            m100661L();
            m100675Z();
            m100673X();
            m100676a0();
            m100674Y();
            m100665P();
            m100666Q();
            m100660K();
            m100668S();
            m100663N();
            m100677b0();
            m100669T();
            m100670U();
            m100664O();
            m100667R();
            m100662M();
            m100671V();
            m100672W();
            C24294b.f48314a.m58552b(m100666Q());
        }
        str = C33820nf.f71144W;
        z12 = false;
        i16 = 2;
        obj = null;
        str2 = versionName;
        f102707u = str2;
        f102708v = String.valueOf(i11);
        if (StringsKt.contains$default(versionNameFlavor, str, z12, i16, obj)) {
            str3 = versionNameFlavor;
        } else {
            str3 = versionNameFlavor;
        }
        f102709w = str3;
        f102710x = String.valueOf(i12);
        f102706t = applicationID;
        f102711y = channelValue;
        f102712z = z11;
        f102676A = apiBuildType;
        f102677B = rCode;
        f102678C = i13;
        f102679D = x_version;
        f102680E = sensorsdata_ab_path;
        f102681F = sensorsdata_sink_path;
        f102682G = buildId;
        f102683H = i14;
        f102684I = appConfigChannel;
        f102685J = i15;
        f102686K = timPushAppKey;
        m100661L();
        m100675Z();
        m100673X();
        m100676a0();
        m100674Y();
        m100665P();
        m100666Q();
        m100660K();
        m100668S();
        m100663N();
        m100677b0();
        m100669T();
        m100670U();
        m100664O();
        m100667R();
        m100662M();
        m100671V();
        m100672W();
        C24294b.f48314a.m58552b(m100666Q());
    }

    /* JADX INFO: renamed from: A */
    public static final String m100624A() {
        String str = f102677B;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rCode");
        return null;
    }

    /* JADX INFO: renamed from: B */
    public static final String m100625B() {
        String str = f102680E;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sensorsdata_ab_path");
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static final String m100626C() {
        String str = f102681F;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sensorsdata_sink_path");
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static final int m100627D() {
        return f102685J;
    }

    /* JADX INFO: renamed from: E */
    public static final String m100628E() {
        String str = f102686K;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("timPushAppKey");
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static final String m100629F() {
        String str = f102710x;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("versionCodeFlavor");
        return null;
    }

    /* JADX INFO: renamed from: G */
    public static final String m100630G() {
        String str = f102708v;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("versionCode");
        return null;
    }

    /* JADX INFO: renamed from: H */
    public static final String m100631H() {
        String str = f102709w;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("versionNameFlavor");
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static final String m100632I() {
        String str = f102707u;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("versionName");
        return null;
    }

    /* JADX INFO: renamed from: J */
    public static final String m100633J() {
        String str = f102679D;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("x_version");
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static final String m100652s() {
        String str = f102676A;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("apiBuildType");
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final String m100653t() {
        String str = f102706t;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationID");
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static final String m100654u() {
        String str = f102684I;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appConfigChannel");
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static final int m100655v() {
        return f102678C;
    }

    /* JADX INFO: renamed from: w */
    public static final String m100656w() {
        String str = f102682G;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("buildId");
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static final String m100657x() {
        String str = f102711y;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("channelValue");
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m100658y() {
        return f102712z;
    }

    /* JADX INFO: renamed from: z */
    public static final int m100659z() {
        return f102683H;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final String m100660K() {
        return (String) f102695i.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final String m100661L() {
        return (String) f102688b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final String m100662M() {
        return (String) f102703q.getValue();
    }

    /* JADX INFO: renamed from: N */
    public final int m100663N() {
        return ((Number) f102697k.getValue()).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final String m100664O() {
        return (String) f102701o.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final String m100665P() {
        return (String) f102693g.getValue();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m100666Q() {
        return ((Boolean) f102694h.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: R */
    public final int m100667R() {
        return ((Number) f102702p.getValue()).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final String m100668S() {
        return (String) f102696j.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final String m100669T() {
        return (String) f102699m.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final String m100670U() {
        return (String) f102700n.getValue();
    }

    /* JADX INFO: renamed from: V */
    public final int m100671V() {
        return ((Number) f102704r.getValue()).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final String m100672W() {
        return (String) f102705s.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final String m100673X() {
        return (String) f102690d.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final String m100674Y() {
        return (String) f102692f.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final String m100675Z() {
        return (String) f102689c.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final String m100676a0() {
        return (String) f102691e.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final String m100677b0() {
        return (String) f102698l.getValue();
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m100679d0() {
        String strM102351h = C46396e.m102351h(C33786m2.f70892t, "last_record_version", "");
        C46396e.m102358o(C33786m2.f70892t, "last_record_version", m100673X());
        return !Intrinsics.areEqual(strM102351h, m100673X());
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m100680e0() {
        return Intrinsics.areEqual(m100660K(), "produce");
    }
}
