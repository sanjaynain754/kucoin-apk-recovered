package w80;

import android.graphics.Color;
import android.net.Uri;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.sdk.web.KWebView;
import com.kubi.widget.web.ui.KWebContainer;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46396e;

/* JADX INFO: renamed from: w80.d */
/* JADX INFO: compiled from: WebViewUiConfigOverride.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001(B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005Jn\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u0005J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0002J\n\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0013\u0010%\u001a\u0004\u0018\u00010\u0011*\u00020\u0005H\u0002¢\u0006\u0002\u0010&J\f\u0010'\u001a\u00020\u0005*\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/widget/web/utils/WebViewUiConfigOverride;", "", "<init>", "()V", "TAG", "", "DEBUG_UI_CONFIG_CATEGORY", "KEY_SWITCH_UI_CONFIG_OVERRIDE", "KEY_UI_CONFIG_OVERRIDE_JSON", "defaultOverrideJson", "resolveUiConfig", "Lcom/kubi/widget/web/utils/WebViewUiConfigOverride$UiConfigSnapshot;", "url", "uri", "Landroid/net/Uri;", "webTitle", "progressMode", "", "spm", "customUserAgent", "darkTheme", "", "appPushAnimated", "transparentTitle", "navBackgroundColor", "appNeedLang", "appIgnoreLang", "applyColorOverrides", "", "navigationBar", "Lcom/kubi/resources/widget/NavigationBar;", "webContainer", "Lcom/kubi/widget/web/ui/KWebContainer;", "applyUiConfigOverride", "snapshot", "parseUiConfigOverrideJson", "Lorg/json/JSONObject;", "toColorOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "toHexColor", "UiConfigSnapshot", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebViewUiConfigOverride.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewUiConfigOverride.kt\ncom/kubi/widget/web/utils/WebViewUiConfigOverride\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
public final class C45759d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45759d f103178a = new C45759d();

    /* JADX INFO: renamed from: w80.d$a, reason: from toString */
    /* JADX INFO: compiled from: WebViewUiConfigOverride.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0089\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00101\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\bHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u00065"}, m90084d2 = {"Lcom/kubi/widget/web/utils/WebViewUiConfigOverride$UiConfigSnapshot;", "", "url", "", "uri", "Landroid/net/Uri;", "webTitle", "progressMode", "", "spm", "customUserAgent", "darkTheme", "", "appPushAnimated", "transparentTitle", "navBackgroundColor", "appNeedLang", "appIgnoreLang", "<init>", "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZLjava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getUri", "()Landroid/net/Uri;", "getWebTitle", "getProgressMode", "()I", "getSpm", "getCustomUserAgent", "getDarkTheme", "()Z", "getAppPushAnimated", "getTransparentTitle", "getNavBackgroundColor", "getAppNeedLang", "getAppIgnoreLang", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UiConfigSnapshot {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String url;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final Uri uri;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final String webTitle;

        /* JADX INFO: renamed from: d, reason: from toString */
        public final int progressMode;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final String spm;

        /* JADX INFO: renamed from: f, reason: from toString */
        @Nullable
        public final String customUserAgent;

        /* JADX INFO: renamed from: g, reason: from toString */
        public final boolean darkTheme;

        /* JADX INFO: renamed from: h, reason: from toString */
        public final boolean appPushAnimated;

        /* JADX INFO: renamed from: i, reason: from toString */
        public final boolean transparentTitle;

        /* JADX INFO: renamed from: j, reason: from toString */
        @Nullable
        public final String navBackgroundColor;

        /* JADX INFO: renamed from: k, reason: from toString */
        public final boolean appNeedLang;

        /* JADX INFO: renamed from: l, reason: from toString */
        @Nullable
        public final String appIgnoreLang;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiConfigSnapshot)) {
                return false;
            }
            UiConfigSnapshot uiConfigSnapshot = (UiConfigSnapshot) other;
            return Intrinsics.areEqual(this.url, uiConfigSnapshot.url) && Intrinsics.areEqual(this.uri, uiConfigSnapshot.uri) && Intrinsics.areEqual(this.webTitle, uiConfigSnapshot.webTitle) && this.progressMode == uiConfigSnapshot.progressMode && Intrinsics.areEqual(this.spm, uiConfigSnapshot.spm) && Intrinsics.areEqual(this.customUserAgent, uiConfigSnapshot.customUserAgent) && this.darkTheme == uiConfigSnapshot.darkTheme && this.appPushAnimated == uiConfigSnapshot.appPushAnimated && this.transparentTitle == uiConfigSnapshot.transparentTitle && Intrinsics.areEqual(this.navBackgroundColor, uiConfigSnapshot.navBackgroundColor) && this.appNeedLang == uiConfigSnapshot.appNeedLang && Intrinsics.areEqual(this.appIgnoreLang, uiConfigSnapshot.appIgnoreLang);
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAppIgnoreLang() {
            return this.appIgnoreLang;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getAppNeedLang() {
            return this.appNeedLang;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getAppPushAnimated() {
            return this.appPushAnimated;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getCustomUserAgent() {
            return this.customUserAgent;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getDarkTheme() {
            return this.darkTheme;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getNavBackgroundColor() {
            return this.navBackgroundColor;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getProgressMode() {
            return this.progressMode;
        }

        public int hashCode() {
            int iHashCode = ((((((this.url.hashCode() * 31) + this.uri.hashCode()) * 31) + this.webTitle.hashCode()) * 31) + Integer.hashCode(this.progressMode)) * 31;
            String str = this.spm;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.customUserAgent;
            int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.darkTheme)) * 31) + Boolean.hashCode(this.appPushAnimated)) * 31) + Boolean.hashCode(this.transparentTitle)) * 31;
            String str3 = this.navBackgroundColor;
            int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.appNeedLang)) * 31;
            String str4 = this.appIgnoreLang;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getSpm() {
            return this.spm;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getTransparentTitle() {
            return this.transparentTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getWebTitle() {
            return this.webTitle;
        }

        @NotNull
        public String toString() {
            return "UiConfigSnapshot(url=" + this.url + ", uri=" + this.uri + ", webTitle=" + this.webTitle + ", progressMode=" + this.progressMode + ", spm=" + this.spm + ", customUserAgent=" + this.customUserAgent + ", darkTheme=" + this.darkTheme + ", appPushAnimated=" + this.appPushAnimated + ", transparentTitle=" + this.transparentTitle + ", navBackgroundColor=" + this.navBackgroundColor + ", appNeedLang=" + this.appNeedLang + ", appIgnoreLang=" + this.appIgnoreLang + ')';
        }

        public UiConfigSnapshot(@NotNull String url, @NotNull Uri uri, @NotNull String webTitle, int i11, @Nullable String str, @Nullable String str2, boolean z11, boolean z12, boolean z13, @Nullable String str3, boolean z14, @Nullable String str4) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(webTitle, "webTitle");
            this.url = url;
            this.uri = uri;
            this.webTitle = webTitle;
            this.progressMode = i11;
            this.spm = str;
            this.customUserAgent = str2;
            this.darkTheme = z11;
            this.appPushAnimated = z12;
            this.transparentTitle = z13;
            this.navBackgroundColor = str3;
            this.appNeedLang = z14;
            this.appIgnoreLang = str4;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final UiConfigSnapshot m101032a(@NotNull String url, @NotNull Uri uri, @NotNull String webTitle, int i11, @Nullable String str, @Nullable String str2, boolean z11, boolean z12, boolean z13, @Nullable String str3, boolean z14, @Nullable String str4) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(webTitle, "webTitle");
            return new UiConfigSnapshot(url, uri, webTitle, i11, str, str2, z11, z12, z13, str3, z14, str4);
        }
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m101028c() {
        Object objM103844constructorimpl;
        if (!C45590s.f102687a.m100666Q()) {
            C44128b.m97266j("KWebDebugOverride", "skip override reason=app_not_debug");
            return null;
        }
        if (!C46396e.m102347d("web_debug_ui_config", "switch_ui_config_override", false)) {
            C44128b.m97266j("KWebDebugOverride", "skip override reason=switch_off");
            return null;
        }
        String string = StringsKt.trim((CharSequence) C46396e.m102351h("web_debug_ui_config", "ui_config_override_json", "")).toString();
        if (string.length() == 0) {
            C44128b.m97266j("KWebDebugOverride", "skip override reason=empty_json");
            return null;
        }
        C44128b.m97266j("KWebDebugOverride", "parse override enabled=true json=" + string);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(new JSONObject(string));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97266j("KWebDebugOverride", "skip invalid json reason=" + thM103847exceptionOrNullimpl.getMessage());
        }
        return (JSONObject) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    /* JADX INFO: renamed from: f */
    public final String m101031f(int i11) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(Color.red(i11)), Integer.valueOf(Color.green(i11)), Integer.valueOf(Color.blue(i11))}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final void m101026a(@NotNull NavigationBar navigationBar, @NotNull KWebContainer webContainer, @NotNull String url) {
        Integer numM101030e;
        Integer numM101030e2;
        String strM101031f;
        Intrinsics.checkNotNullParameter(navigationBar, "navigationBar");
        Intrinsics.checkNotNullParameter(webContainer, "webContainer");
        Intrinsics.checkNotNullParameter(url, "url");
        JSONObject jSONObjectM101028c = m101028c();
        if (jSONObjectM101028c != null) {
            C44128b.m97266j("KWebDebugOverride", "applyColorOverrides hit url=" + url);
            String strOptString = jSONObjectM101028c.optString("navigation_bar_bg_color");
            Intrinsics.checkNotNull(strOptString);
            String strM101031f2 = null;
            if (strOptString.length() <= 0) {
                strOptString = null;
            }
            if (strOptString != null) {
                numM101030e = m101030e(strOptString);
            } else {
                numM101030e = null;
            }
            String strOptString2 = jSONObjectM101028c.optString("web_container_bg_color");
            Intrinsics.checkNotNull(strOptString2);
            if (strOptString2.length() <= 0) {
                strOptString2 = null;
            }
            if (strOptString2 != null) {
                numM101030e2 = m101030e(strOptString2);
            } else {
                numM101030e2 = null;
            }
            if (numM101030e != null) {
                navigationBar.setBackGroundColor(numM101030e.intValue());
            }
            if (numM101030e2 != null) {
                int iIntValue = numM101030e2.intValue();
                webContainer.setBackgroundColor(iIntValue);
                KWebView f55267b = webContainer.getF55267b();
                if (f55267b != null) {
                    f55267b.setBackgroundColor(iIntValue);
                }
            }
            if (numM101030e == null && numM101030e2 == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("apply colors nav=");
            if (numM101030e != null) {
                strM101031f = m101031f(numM101030e.intValue());
            } else {
                strM101031f = null;
            }
            sb2.append(strM101031f);
            sb2.append(" container=");
            if (numM101030e2 != null) {
                strM101031f2 = m101031f(numM101030e2.intValue());
            }
            sb2.append(strM101031f2);
            sb2.append(" url=");
            sb2.append(url);
            C44128b.m97266j("KWebDebugOverride", sb2.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public final UiConfigSnapshot m101027b(UiConfigSnapshot uiConfigSnapshot) {
        String str;
        Object objM103844constructorimpl;
        int progressMode;
        boolean darkTheme;
        boolean appPushAnimated;
        boolean transparentTitle;
        boolean appNeedLang;
        JSONObject jSONObjectM101028c = m101028c();
        if (jSONObjectM101028c == null) {
            return uiConfigSnapshot;
        }
        C44128b.m97266j("KWebDebugOverride", "applyUiConfigOverride hit url=" + uiConfigSnapshot.getUrl());
        String url = uiConfigSnapshot.getUrl();
        Uri uri = uiConfigSnapshot.getUri();
        String strOptString = jSONObjectM101028c.optString("url");
        Intrinsics.checkNotNull(strOptString);
        String appIgnoreLang = null;
        if (!StringsKt.isBlank(strOptString)) {
            str = strOptString;
        } else {
            str = null;
        }
        if (str != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(Uri.parse(str));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
                uri = (Uri) objM103844constructorimpl;
                Intrinsics.checkNotNull(uri);
                url = str;
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97266j("KWebDebugOverride", "skip invalid url=" + str + " reason=" + thM103847exceptionOrNullimpl.getMessage());
            }
            Result.m103843boximpl(objM103844constructorimpl);
        }
        String str2 = url;
        Uri uri2 = uri;
        String strOptString2 = jSONObjectM101028c.optString("webTitle");
        Intrinsics.checkNotNull(strOptString2);
        if (strOptString2.length() <= 0) {
            strOptString2 = null;
        }
        if (strOptString2 == null) {
            strOptString2 = uiConfigSnapshot.getWebTitle();
        }
        String str3 = strOptString2;
        if (jSONObjectM101028c.has("progressMode")) {
            progressMode = jSONObjectM101028c.optInt("progressMode", uiConfigSnapshot.getProgressMode());
        } else {
            progressMode = uiConfigSnapshot.getProgressMode();
        }
        int i11 = progressMode;
        String strOptString3 = jSONObjectM101028c.optString("spm");
        Intrinsics.checkNotNull(strOptString3);
        if (strOptString3.length() <= 0) {
            strOptString3 = null;
        }
        if (strOptString3 == null) {
            strOptString3 = uiConfigSnapshot.getSpm();
        }
        String str4 = strOptString3;
        String strOptString4 = jSONObjectM101028c.optString("customUserAgent");
        Intrinsics.checkNotNull(strOptString4);
        if (strOptString4.length() <= 0) {
            strOptString4 = null;
        }
        if (strOptString4 == null) {
            strOptString4 = uiConfigSnapshot.getCustomUserAgent();
        }
        String str5 = strOptString4;
        if (jSONObjectM101028c.has("darkTheme")) {
            darkTheme = jSONObjectM101028c.optBoolean("darkTheme");
        } else {
            darkTheme = uiConfigSnapshot.getDarkTheme();
        }
        boolean z11 = darkTheme;
        if (jSONObjectM101028c.has("appPushAnimated")) {
            appPushAnimated = jSONObjectM101028c.optBoolean("appPushAnimated");
        } else {
            appPushAnimated = uiConfigSnapshot.getAppPushAnimated();
        }
        boolean z12 = appPushAnimated;
        if (jSONObjectM101028c.has("transparentTitle")) {
            transparentTitle = jSONObjectM101028c.optBoolean("transparentTitle");
        } else {
            transparentTitle = uiConfigSnapshot.getTransparentTitle();
        }
        boolean z13 = transparentTitle;
        String strOptString5 = jSONObjectM101028c.optString("navBackgroundColor");
        Intrinsics.checkNotNull(strOptString5);
        if (strOptString5.length() <= 0) {
            strOptString5 = null;
        }
        if (strOptString5 == null) {
            strOptString5 = uiConfigSnapshot.getNavBackgroundColor();
        }
        String str6 = strOptString5;
        if (jSONObjectM101028c.has("appNeedLang")) {
            appNeedLang = jSONObjectM101028c.optBoolean("appNeedLang");
        } else {
            appNeedLang = uiConfigSnapshot.getAppNeedLang();
        }
        boolean z14 = appNeedLang;
        String strOptString6 = jSONObjectM101028c.optString("appIgnoreLang");
        Intrinsics.checkNotNull(strOptString6);
        if (strOptString6.length() > 0) {
            appIgnoreLang = strOptString6;
        }
        if (appIgnoreLang == null) {
            appIgnoreLang = uiConfigSnapshot.getAppIgnoreLang();
        }
        UiConfigSnapshot uiConfigSnapshotM101032a = uiConfigSnapshot.m101032a(str2, uri2, str3, i11, str4, str5, z11, z12, z13, str6, z14, appIgnoreLang);
        C44128b.m97266j("KWebDebugOverride", "override config url=" + uiConfigSnapshotM101032a.getUrl() + " title=" + uiConfigSnapshotM101032a.getWebTitle() + " dark=" + uiConfigSnapshotM101032a.getDarkTheme() + " progressMode=" + uiConfigSnapshotM101032a.getProgressMode() + " transparentTitle=" + uiConfigSnapshotM101032a.getTransparentTitle() + " navBackgroundColor=" + uiConfigSnapshotM101032a.getNavBackgroundColor());
        return uiConfigSnapshotM101032a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final UiConfigSnapshot m101029d(@NotNull String url, @NotNull Uri uri, @NotNull String webTitle, int i11, @Nullable String str, @Nullable String str2, boolean z11, boolean z12, boolean z13, @Nullable String str3, boolean z14, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(webTitle, "webTitle");
        return m101027b(new UiConfigSnapshot(url, uri, webTitle, i11, str, str2, z11, z12, z13, str3, z14, str4));
    }

    /* JADX INFO: renamed from: e */
    public final Integer m101030e(String str) {
        Object objM103844constructorimpl;
        String string = StringsKt.trim((CharSequence) str).toString();
        Object obj = null;
        if (string.length() == 0) {
            return null;
        }
        if (!StringsKt.startsWith$default(string, RunnableC33958ua.f72251f, false, 2, (Object) null)) {
            string = '#' + string;
        }
        String strRemovePrefix = StringsKt.removePrefix(string, (CharSequence) RunnableC33958ua.f72251f);
        if (strRemovePrefix.length() != 3 && strRemovePrefix.length() != 4 && strRemovePrefix.length() != 6 && strRemovePrefix.length() != 8) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Integer.valueOf(Color.parseColor(string)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (!Result.m103850isFailureimpl(objM103844constructorimpl)) {
            obj = objM103844constructorimpl;
        }
        return (Integer) obj;
    }
}
