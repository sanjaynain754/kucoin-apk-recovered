package com.kubi.sdk.pkg.config;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.pkg.bundle.i18n.RnI18nLocaleContext;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PackConfigManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0014\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR6\u0010\u001f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0019\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0006\"\u0004\b\"\u0010#R\"\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b%\u0010#R(\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR*\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b*\u0010\u001c\"\u0004\b+\u0010\u001e¨\u0006-"}, m90084d2 = {"Lcom/kubi/sdk/pkg/config/PackConfigManager;", "", "<init>", "()V", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Z", "Lcom/kubi/sdk/pkg/bundle/i18n/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/sdk/pkg/bundle/i18n/b;", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "i", "(Ljava/lang/String;)V", "appendUA", "c", "e", CmcdData.Factory.STREAM_TYPE_LIVE, "pkgPlatformBaseUrl", "d", "k", "pkgPlatformAppName", "Lkotlin/Function0;", "", "Lkotlin/jvm/functions/Function0;", "g", "()Lkotlin/jvm/functions/Function0;", "n", "(Lkotlin/jvm/functions/Function0;)V", "pkgPlatformHeadersProvider", "f", "Z", "m", "(Z)V", "pkgPlatformEnabled", "j", "downloadPriorityEnabled", "getRnI18nPrefetchEnabledProvider", "p", "rnI18nPrefetchEnabledProvider", "getRnI18nLocaleProvider", "o", "rnI18nLocaleProvider", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class PackConfigManager {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static String pkgPlatformBaseUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static String pkgPlatformAppName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static Function0<? extends Map<String, String>> pkgPlatformHeadersProvider;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PackConfigManager f47378a = new PackConfigManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static String appendUA = "KuCoin";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static volatile boolean pkgPlatformEnabled = true;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static volatile boolean downloadPriorityEnabled = true;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static volatile Function0<Boolean> rnI18nPrefetchEnabledProvider = new Function0<Boolean>() { // from class: com.kubi.sdk.pkg.config.PackConfigManager$rnI18nPrefetchEnabledProvider$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    };

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static volatile Function0<RnI18nLocaleContext> rnI18nLocaleProvider = new Function0() { // from class: com.kubi.sdk.pkg.config.PackConfigManager$rnI18nLocaleProvider$1
        @Override // p852kotlin.jvm.functions.Function0
        @Nullable
        public final Void invoke() {
            return null;
        }
    };

    @Nullable
    /* JADX INFO: renamed from: a */
    public final RnI18nLocaleContext m57687a() {
        Object objM103844constructorimpl;
        Function0<RnI18nLocaleContext> function0 = rnI18nLocaleProvider;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(function0.invoke());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (RnI18nLocaleContext) objM103844constructorimpl;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m57688b() {
        return appendUA;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m57689c() {
        return downloadPriorityEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m57690d() {
        return pkgPlatformAppName;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m57691e() {
        return pkgPlatformBaseUrl;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m57692f() {
        return pkgPlatformEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Function0<Map<String, String>> m57693g() {
        return pkgPlatformHeadersProvider;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m57694h() {
        Object objM103844constructorimpl;
        Function0<Boolean> function0 = rnI18nPrefetchEnabledProvider;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(function0.invoke());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Boolean bool = Boolean.TRUE;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = bool;
        }
        return ((Boolean) objM103844constructorimpl).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final void m57695i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        appendUA = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m57696j(boolean z11) {
        downloadPriorityEnabled = z11;
    }

    /* JADX INFO: renamed from: k */
    public final void m57697k(@Nullable String str) {
        pkgPlatformAppName = str;
    }

    /* JADX INFO: renamed from: l */
    public final void m57698l(@Nullable String str) {
        pkgPlatformBaseUrl = str;
    }

    /* JADX INFO: renamed from: m */
    public final void m57699m(boolean z11) {
        pkgPlatformEnabled = z11;
    }

    /* JADX INFO: renamed from: n */
    public final void m57700n(@Nullable Function0<? extends Map<String, String>> function0) {
        pkgPlatformHeadersProvider = function0;
    }

    /* JADX INFO: renamed from: o */
    public final void m57701o(@NotNull Function0<RnI18nLocaleContext> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        rnI18nLocaleProvider = function0;
    }

    /* JADX INFO: renamed from: p */
    public final void m57702p(@NotNull Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        rnI18nPrefetchEnabledProvider = function0;
    }
}
