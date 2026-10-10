package com.kubi.kweb.helper;

import android.net.Uri;
import androidx.annotation.Keep;
import androidx.webkit.ProxyConfig;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.host.HostManager;
import com.kubi.sdk.web.util.C24335h;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: WebTemplateHelper.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kweb/helper/WebTemplateHelper;", "", "<init>", "()V", "IGNORE_KEY", "", "excluded", "", "config", "Lcom/kubi/kweb/helper/WebTemplateHelper$TemplateConfig;", "getConfig", "()Lcom/kubi/kweb/helper/WebTemplateHelper$TemplateConfig;", "config$delegate", "Lkotlin/Lazy;", "match", "", "uri", "Landroid/net/Uri;", "checkIsNewsPages", "getTemplatePath", "TemplateConfig", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebTemplateHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebTemplateHelper.kt\ncom/kubi/kweb/helper/WebTemplateHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,58:1\n35#2,4:59\n39#2:65\n44#3,2:63\n*S KotlinDebug\n*F\n+ 1 WebTemplateHelper.kt\ncom/kubi/kweb/helper/WebTemplateHelper\n*L\n31#1:59,4\n31#1:65\n31#1:63,2\n*E\n"})
public final class WebTemplateHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WebTemplateHelper f31025a = new WebTemplateHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<String> f31026b = SetsKt.setOf((Object[]) new String[]{"/news/en-KuCoin-Platform-V2-Upgrade-Notice", "/news/KuCoin-Platform-V2-Upgrade"});

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f31027c = LazyKt.lazy(new Function0() { // from class: com.kubi.kweb.helper.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WebTemplateHelper.m36732c();
        }
    });

    /* JADX INFO: compiled from: WebTemplateHelper.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/kweb/helper/WebTemplateHelper$TemplateConfig;", "", "newsTemplate", "", "", "<init>", "(Ljava/util/List;)V", "getNewsTemplate", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TemplateConfig {

        @NotNull
        private final List<String> newsTemplate;

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TemplateConfig) && Intrinsics.areEqual(this.newsTemplate, ((TemplateConfig) other).newsTemplate);
        }

        public TemplateConfig(@NotNull List<String> newsTemplate) {
            Intrinsics.checkNotNullParameter(newsTemplate, "newsTemplate");
            this.newsTemplate = newsTemplate;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TemplateConfig copy$default(TemplateConfig templateConfig, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = templateConfig.newsTemplate;
            }
            return templateConfig.copy(list);
        }

        @NotNull
        public final List<String> component1() {
            return this.newsTemplate;
        }

        @NotNull
        public final TemplateConfig copy(@NotNull List<String> newsTemplate) {
            Intrinsics.checkNotNullParameter(newsTemplate, "newsTemplate");
            return new TemplateConfig(newsTemplate);
        }

        @NotNull
        public final List<String> getNewsTemplate() {
            return this.newsTemplate;
        }

        public int hashCode() {
            return this.newsTemplate.hashCode();
        }

        @NotNull
        public String toString() {
            return "TemplateConfig(newsTemplate=" + this.newsTemplate + ')';
        }

        public /* synthetic */ TemplateConfig(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? CollectionsKt.listOf((Object[]) new String[]{"news", "announcement"}) : list);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kweb.helper.WebTemplateHelper$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C17084a extends TypeToken<TemplateConfig> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final TemplateConfig m36732c() {
        Object objM20457a;
        List list = null;
        Object[] objArr = 0;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C17084a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("h5_template_config", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        TemplateConfig templateConfig = (TemplateConfig) objM20457a;
        return templateConfig == null ? new TemplateConfig(list, 1, objArr == true ? 1 : 0) : templateConfig;
    }

    /* JADX INFO: renamed from: b */
    public final String m36733b(Uri uri) {
        if (CollectionsKt.contains(f31026b, uri.getPath())) {
            return null;
        }
        String host = uri.getHost();
        if (((host == null || host.length() == 0) && !Intrinsics.areEqual(uri.getScheme(), ProxyConfig.MATCH_HTTPS)) || C24335h.f48569a.m58887f(uri, "ignoreTemplate", false)) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        String str = (String) CollectionsKt.firstOrNull((List) pathSegments);
        if (str != null && m36734d().getNewsTemplate().contains(str) && HostManager.a.a(uri.toString())) {
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final TemplateConfig m36734d() {
        return (TemplateConfig) f31027c.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m36735e(@NotNull Uri uri) {
        String path;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String strM36733b = m36733b(uri);
        if (strM36733b == null || (path = uri.getPath()) == null) {
            return null;
        }
        return StringsKt.replace$default(path, '/' + strM36733b, "", false, 4, (Object) null);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m36736f(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (CollectionsKt.contains(f31026b, uri.getPath())) {
            return false;
        }
        String host = uri.getHost();
        if (((host == null || host.length() == 0) && !Intrinsics.areEqual(uri.getScheme(), ProxyConfig.MATCH_HTTPS)) || C24335h.f48569a.m58887f(uri, "ignoreTemplate", false)) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        String str = (String) CollectionsKt.firstOrNull((List) pathSegments);
        return str != null && m36734d().getNewsTemplate().contains(str) && HostManager.a.a(uri.toString());
    }
}
