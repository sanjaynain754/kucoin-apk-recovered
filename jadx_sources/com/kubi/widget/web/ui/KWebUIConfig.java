package com.kubi.widget.web.ui;

import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.provider.CredentialEntry;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.widget.web.helper.C27178m;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import w80.C45759d;

/* JADX INFO: compiled from: KWebUIConfig.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010%\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0085\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/widget/web/ui/KWebUIConfig;", "", "url", "", "uri", "Landroid/net/Uri;", "webTitle", "progressMode", "", "spm", "darkTheme", "", "appPushAnimated", "customUserAgent", "transparentTitle", "navBackgroundColor", "appNeedLang", "appIgnoreLang", "<init>", "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;ILjava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getUri", "()Landroid/net/Uri;", "getWebTitle", "getProgressMode", "()I", "getDarkTheme", "()Z", "getAppPushAnimated", "getCustomUserAgent", "getTransparentTitle", "getNavBackgroundColor", "makeParams", "", "Companion", "Builder", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebUIConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebUIConfig.kt\ncom/kubi/widget/web/ui/KWebUIConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
public final class KWebUIConfig {

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Companion f55294m = new Companion(null);

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final KWebUIConfig f55295n;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f55296a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Uri f55297b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f55298c;

    /* JADX INFO: renamed from: d */
    public final int f55299d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final String f55300e;

    /* JADX INFO: renamed from: f */
    public final boolean f55301f;

    /* JADX INFO: renamed from: g */
    public final boolean f55302g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f55303h;

    /* JADX INFO: renamed from: i */
    public final boolean f55304i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final String f55305j;

    /* JADX INFO: renamed from: k */
    public final boolean f55306k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final String f55307l;

    /* JADX INFO: compiled from: KWebUIConfig.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\f\u0010\u000f\u001a\u00020\t*\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/widget/web/ui/KWebUIConfig$Companion;", "", "<init>", "()V", "TAG", "", "KEY_TRANSPARENT_TITLE", "KEY_NAV_BACKGROUND_COLOR", "Empty", "Lcom/kubi/widget/web/ui/KWebUIConfig;", "getEmpty$LWebWidget_googleRelease", "()Lcom/kubi/widget/web/ui/KWebUIConfig;", "normalizeLoadingMode", "", "rawMode", "toConfig", "Lcom/kubi/widget/web/utils/WebViewUiConfigOverride$UiConfigSnapshot;", "fromBundle", "bundle", "Landroid/os/Bundle;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m67528a(int i11) {
            if (i11 != 2) {
                C44128b.m97266j("KWebUIConfig", "normalizeLoadingMode raw=" + i11 + " -> 2");
            }
            return 2;
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: b */
        public final KWebUIConfig m67529b(C45759d.UiConfigSnapshot aVar) {
            return new KWebUIConfig(aVar.getUrl(), aVar.getUri(), aVar.getWebTitle(), m67528a(aVar.getProgressMode()), aVar.getSpm(), aVar.getDarkTheme(), aVar.getAppPushAnimated(), aVar.getCustomUserAgent(), aVar.getTransparentTitle(), aVar.getNavBackgroundColor(), aVar.getAppNeedLang(), aVar.getAppIgnoreLang(), null);
        }

        @Nullable
        public final KWebUIConfig fromBundle(@NotNull Bundle bundle) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String strM56284y = RouteExKt.m56284y(bundle, "url");
            if (strM56284y == null) {
                return null;
            }
            try {
                Uri uri = Uri.parse(strM56284y);
                String strM56285z = RouteExKt.m56285z(bundle, "title", "");
                Intrinsics.checkNotNull(uri);
                String strM67320c = C27178m.m67320c(uri, "dark");
                boolean z11 = strM67320c != null ? Boolean.parseBoolean(strM67320c) : RouteExKt.m56252i(bundle, "dark", !DayNightThemeManager.f28592a.m33187l());
                C24329b.f48558a.m58864d("dark", "result dark:" + z11 + ", isDayTheme:" + DayNightThemeManager.f28592a.m33187l());
                Integer numM56228S = RouteExKt.m56228S(bundle, "forceLoading");
                if (numM56228S != null) {
                    iIntValue = numM56228S.intValue();
                } else {
                    Intrinsics.checkNotNull(uri);
                    Integer numM66544n = DowngradeExKt.m66544n(C27178m.m67320c(uri, "loading"));
                    iIntValue = numM66544n != null ? numM66544n.intValue() : RouteExKt.m56226Q(bundle, "loading", 1);
                }
                String strM56284y2 = RouteExKt.m56284y(bundle, "spm");
                String strM56284y3 = RouteExKt.m56284y(bundle, "ua");
                Intrinsics.checkNotNull(uri);
                String strM67320c2 = C27178m.m67320c(uri, "appPushAnimated");
                boolean z12 = strM67320c2 != null ? Boolean.parseBoolean(strM67320c2) : RouteExKt.m56252i(bundle, "appPushAnimated", true);
                Intrinsics.checkNotNull(uri);
                Boolean boolM67554d = C27241f0.m67554d(C27178m.m67320c(uri, "transparentTitle"));
                boolean zBooleanValue = boolM67554d != null ? boolM67554d.booleanValue() : RouteExKt.m56252i(bundle, "transparentTitle", false);
                Intrinsics.checkNotNull(uri);
                String strM67320c3 = C27178m.m67320c(uri, "navBackgroundColor");
                if (strM67320c3 == null && (strM67320c3 = C27241f0.m67553c(strM56284y, "navBackgroundColor")) == null) {
                    strM67320c3 = RouteExKt.m56284y(bundle, "navBackgroundColor");
                }
                Intrinsics.checkNotNull(uri);
                String strM67320c4 = C27178m.m67320c(uri, "appNeedLang");
                boolean z13 = strM67320c4 != null ? Boolean.parseBoolean(strM67320c4) : RouteExKt.m56252i(bundle, "appNeedLang", false);
                Intrinsics.checkNotNull(uri);
                String strM67320c5 = C27178m.m67320c(uri, "appIgnoreLang");
                if (strM67320c5 == null) {
                    strM67320c5 = RouteExKt.m56284y(bundle, "appIgnoreLang");
                }
                String str = strM67320c5;
                int iM67528a = m67528a(iIntValue);
                boolean z14 = zBooleanValue;
                C45759d c45759d = C45759d.f103178a;
                Intrinsics.checkNotNull(uri);
                Intrinsics.checkNotNull(strM56285z);
                return m67529b(c45759d.m101029d(strM56284y, uri, strM56285z, iM67528a, strM56284y2, strM56284y3, z11, z12, z14, strM67320c3, z13, str));
            } catch (Exception unused) {
                C44128b.m97261e("KWebUIConfig", strM56284y + " parse err");
                return null;
            }
        }

        @NotNull
        public final KWebUIConfig getEmpty$LWebWidget_googleRelease() {
            return KWebUIConfig.f55295n;
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.ui.KWebUIConfig$a */
    /* JADX INFO: compiled from: KWebUIConfig.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010,\u001a\u00020-R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001a\u0010&\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR\u001c\u0010)\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010¨\u0006."}, m90084d2 = {"Lcom/kubi/widget/web/ui/KWebUIConfig$Builder;", "", "<init>", "()V", "value", "Landroid/net/Uri;", "uri", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "webTitle", "", "getWebTitle", "()Ljava/lang/String;", "setWebTitle", "(Ljava/lang/String;)V", "progressMode", "", "getProgressMode", "()I", "setProgressMode", "(I)V", "spm", "getSpm", "setSpm", "darkTheme", "", "getDarkTheme", "()Z", "setDarkTheme", "(Z)V", "appPushAnimated", "getAppPushAnimated", "setAppPushAnimated", "customUserAgent", "getCustomUserAgent", "setCustomUserAgent", "transparentTitle", "getTransparentTitle", "setTransparentTitle", "navBackgroundColor", "getNavBackgroundColor", "setNavBackgroundColor", "build", "Lcom/kubi/widget/web/ui/KWebUIConfig;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C27229a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public Uri f55308a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public String f55309b;

        /* JADX INFO: renamed from: c */
        public int f55310c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public String f55311d;

        /* JADX INFO: renamed from: e */
        public boolean f55312e;

        /* JADX INFO: renamed from: f */
        public boolean f55313f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public String f55314g;

        /* JADX INFO: renamed from: h */
        public boolean f55315h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public String f55316i;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final KWebUIConfig m67530a() {
            String string = this.f55308a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return new KWebUIConfig(string, this.f55308a, this.f55309b, KWebUIConfig.f55294m.m67528a(this.f55310c), this.f55311d, this.f55312e, this.f55313f, this.f55314g, this.f55315h, this.f55316i, false, null, 3072, null);
        }

        /* JADX INFO: renamed from: b */
        public final void m67531b(boolean z11) {
            this.f55312e = z11;
        }

        /* JADX INFO: renamed from: d */
        public final void m67533d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f55309b = str;
        }

        public C27229a() {
            Uri EMPTY = Uri.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            this.f55308a = EMPTY;
            this.f55309b = "";
            this.f55310c = 2;
            this.f55313f = true;
        }

        /* JADX INFO: renamed from: c */
        public final void m67532c(@NotNull Uri value) {
            boolean z11;
            int iIntValue;
            boolean z12;
            boolean zBooleanValue;
            Intrinsics.checkNotNullParameter(value, "value");
            String strM67320c = C27178m.m67320c(value, "dark");
            if (strM67320c != null) {
                z11 = Boolean.parseBoolean(strM67320c);
            } else {
                z11 = this.f55312e;
            }
            this.f55312e = z11;
            Companion companion = KWebUIConfig.f55294m;
            Integer numM66544n = DowngradeExKt.m66544n(C27178m.m67320c(value, "loading"));
            if (numM66544n != null) {
                iIntValue = numM66544n.intValue();
            } else {
                iIntValue = this.f55310c;
            }
            this.f55310c = companion.m67528a(iIntValue);
            String strM67320c2 = C27178m.m67320c(value, "appPushAnimated");
            if (strM67320c2 != null) {
                z12 = Boolean.parseBoolean(strM67320c2);
            } else {
                z12 = this.f55313f;
            }
            this.f55313f = z12;
            Boolean boolM67554d = C27241f0.m67554d(C27178m.m67320c(value, "transparentTitle"));
            if (boolM67554d != null) {
                zBooleanValue = boolM67554d.booleanValue();
            } else {
                zBooleanValue = this.f55315h;
            }
            this.f55315h = zBooleanValue;
            String strM67320c3 = C27178m.m67320c(value, "navBackgroundColor");
            if (strM67320c3 == null) {
                String string = value.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                strM67320c3 = C27241f0.m67553c(string, "navBackgroundColor");
                if (strM67320c3 == null) {
                    strM67320c3 = this.f55316i;
                }
            }
            this.f55316i = strM67320c3;
            this.f55308a = value;
        }
    }

    public /* synthetic */ KWebUIConfig(String str, Uri uri, String str2, int i11, String str3, boolean z11, boolean z12, String str4, boolean z13, String str5, boolean z14, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uri, str2, i11, str3, z11, z12, str4, z13, str5, z14, str6);
    }

    static {
        Uri EMPTY = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        f55295n = new KWebUIConfig("", EMPTY, null, 0, null, false, false, null, false, null, false, null, 4092, null);
    }

    public KWebUIConfig(String str, Uri uri, String str2, int i11, String str3, boolean z11, boolean z12, String str4, boolean z13, String str5, boolean z14, String str6) {
        this.f55296a = str;
        this.f55297b = uri;
        this.f55298c = str2;
        this.f55299d = i11;
        this.f55300e = str3;
        this.f55301f = z11;
        this.f55302g = z12;
        this.f55303h = str4;
        this.f55304i = z13;
        this.f55305j = str5;
        this.f55306k = z14;
        this.f55307l = str6;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF55302g() {
        return this.f55302g;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF55303h() {
        return this.f55303h;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getF55301f() {
        return this.f55301f;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF55305j() {
        return this.f55305j;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getF55299d() {
        return this.f55299d;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getF55304i() {
        return this.f55304i;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Uri getF55297b() {
        return this.f55297b;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getF55296a() {
        return this.f55296a;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getF55298c() {
        return this.f55298c;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final Map<String, String> m67527k() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("night", String.valueOf(!DayNightThemeManager.f28592a.m33187l()));
        String str = this.f55300e;
        if (str != null) {
            linkedHashMap.put("spm", str);
        }
        String str2 = this.f55307l;
        if (str2 != null) {
            linkedHashMap.put("appIgnoreLang", str2);
        }
        if (this.f55306k) {
            linkedHashMap.put("appNeedLang", CredentialEntry.TRUE_STRING);
        }
        return linkedHashMap;
    }

    public /* synthetic */ KWebUIConfig(String str, Uri uri, String str2, int i11, String str3, boolean z11, boolean z12, String str4, boolean z13, String str5, boolean z14, String str6, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uri, (i12 & 4) != 0 ? "" : str2, (i12 & 8) != 0 ? 1 : i11, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? false : z11, (i12 & 64) != 0 ? true : z12, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? false : z13, (i12 & 512) != 0 ? null : str5, (i12 & 1024) != 0 ? false : z14, (i12 & 2048) != 0 ? null : str6);
    }
}
