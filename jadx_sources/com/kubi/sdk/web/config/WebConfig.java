package com.kubi.sdk.web.config;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.BaseActivity;
import com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import d10.InterfaceC36593a;
import e10.InterfaceC37044c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WebConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\u0014\u0010\nR\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\f\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u001e\u0010\nR\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b4\u00106\"\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R'\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u00040>j\b\u0012\u0004\u0012\u00020\u0004`?8\u0006¢\u0006\f\n\u0004\b.\u0010@\u001a\u0004\b\u001d\u0010AR(\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00040C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR'\u0010O\u001a\u0012\u0012\u0004\u0012\u00020K0Jj\b\u0012\u0004\u0012\u00020K`L8\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\b;\u0010NR'\u0010P\u001a\u0012\u0012\u0004\u0012\u00020\u00040>j\b\u0012\u0004\u0012\u00020\u0004`?8\u0006¢\u0006\f\n\u0004\b\u001a\u0010@\u001a\u0004\b\u0010\u0010AR$\u0010V\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010R\u001a\u0004\b \u0010S\"\u0004\bT\u0010UR\u0011\u0010W\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b,\u0010\b¨\u0006X"}, m90084d2 = {"Lcom/kubi/sdk/web/config/WebConfig;", "", "<init>", "()V", "", "b", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "u", "(Ljava/lang/String;)V", "siteType", "c", "e", "r", "DefaultLanPath", "d", "getDefaultLan", "q", "DefaultLan", "o", "currentLanguagePath", "", "f", "Z", "()Z", "p", "(Z)V", "debug", "g", CmcdData.Factory.STREAMING_FORMAT_SS, "jsApiName", CmcdData.Factory.STREAMING_FORMAT_HLS, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "n", "appendUA", "", "J", "getWritePageCheckDelay", "()J", "x", "(J)V", "writePageCheckDelay", "", "j", "F", "m", "()F", "y", "(F)V", "writePageCheckRate", "", "k", "I", "()I", "w", "(I)V", "v3AbTest", "", CmcdData.Factory.STREAM_TYPE_LIVE, "Ljava/util/List;", "defaultLanguagePathList", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "()Ljava/util/HashSet;", LanguageSelectionViewModel.ARG_LANGS, "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getThemeGetter", "()Lkotlin/jvm/functions/Function0;", "v", "(Lkotlin/jvm/functions/Function0;)V", "themeGetter", "Ljava/util/ArrayList;", "Le10/c;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "webUrlInterceptors", "debugHosts", "Ld10/a;", "Ld10/a;", "()Ld10/a;", "t", "(Ld10/a;)V", "shareSiteImpl", BaseActivity.THEME, "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class WebConfig {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static boolean debug;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public static final List<String> defaultLanguagePathList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final HashSet<String> languages;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> themeGetter;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public static final ArrayList<InterfaceC37044c> webUrlInterceptors;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public static final HashSet<String> debugHosts;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public static InterfaceC36593a shareSiteImpl;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WebConfig f48355a = new WebConfig();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static String siteType = "global";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static String DefaultLanPath = TUIThemeManager.LANGUAGE_EN;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static String DefaultLan = "en_US";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static String currentLanguagePath = TUIThemeManager.LANGUAGE_EN;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static String jsApiName = "KuCoin";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static String appendUA = "KuCoin";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static long writePageCheckDelay = 5000;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static float writePageCheckRate = 97.0f;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static int v3AbTest = -1;

    static {
        List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{TUIThemeManager.LANGUAGE_AR, "de", TUIThemeManager.LANGUAGE_EN, "es", "fr", "ko", "nl", "pt", "ru", "tr", "vi", "zh-hant", "it", "id", "ms", "hi", "th", "ja", "bn", "pl", "fil", "zh-hans", "ur"});
        defaultLanguagePathList = listListOf;
        languages = new HashSet<>(listListOf);
        themeGetter = new Function0<String>() { // from class: com.kubi.sdk.web.config.WebConfig$themeGetter$1
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "dark";
            }
        };
        webUrlInterceptors = new ArrayList<>();
        debugHosts = new HashSet<>();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m58590a() {
        return appendUA;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m58591b() {
        return currentLanguagePath;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m58592c() {
        return debug;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final HashSet<String> m58593d() {
        return debugHosts;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m58594e() {
        return DefaultLanPath;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m58595f() {
        return jsApiName;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final HashSet<String> m58596g() {
        return languages;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final InterfaceC36593a m58597h() {
        return shareSiteImpl;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m58598i() {
        return siteType;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final String m58599j() {
        return themeGetter.invoke();
    }

    /* JADX INFO: renamed from: k */
    public final int m58600k() {
        return v3AbTest;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final ArrayList<InterfaceC37044c> m58601l() {
        return webUrlInterceptors;
    }

    /* JADX INFO: renamed from: m */
    public final float m58602m() {
        return writePageCheckRate;
    }

    /* JADX INFO: renamed from: n */
    public final void m58603n(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        appendUA = str;
    }

    /* JADX INFO: renamed from: o */
    public final void m58604o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        currentLanguagePath = str;
    }

    /* JADX INFO: renamed from: p */
    public final void m58605p(boolean z11) {
        debug = z11;
    }

    /* JADX INFO: renamed from: q */
    public final void m58606q(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        DefaultLan = str;
    }

    /* JADX INFO: renamed from: r */
    public final void m58607r(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        DefaultLanPath = str;
    }

    /* JADX INFO: renamed from: s */
    public final void m58608s(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        jsApiName = str;
    }

    /* JADX INFO: renamed from: t */
    public final void m58609t(@Nullable InterfaceC36593a interfaceC36593a) {
        shareSiteImpl = interfaceC36593a;
    }

    /* JADX INFO: renamed from: u */
    public final void m58610u(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        siteType = str;
    }

    /* JADX INFO: renamed from: v */
    public final void m58611v(@NotNull Function0<String> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        themeGetter = function0;
    }

    /* JADX INFO: renamed from: w */
    public final void m58612w(int i11) {
        v3AbTest = i11;
    }

    /* JADX INFO: renamed from: x */
    public final void m58613x(long j11) {
        writePageCheckDelay = j11;
    }

    /* JADX INFO: renamed from: y */
    public final void m58614y(float f11) {
        writePageCheckRate = f11;
    }
}
