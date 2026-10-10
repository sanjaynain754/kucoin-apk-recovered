package p848zz;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.pkg.bundle.i18n.RnI18nLocaleContext;
import com.kubi.sdk.pkg.bundle.i18n.RnI18nManager;
import com.kubi.sdk.pkg.config.PackConfigManager;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zz.a */
/* JADX INFO: compiled from: PackageConfigSetting.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0013J5\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u000b¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Lzz/a;", "", "<init>", "()V", "", "ua", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "baseUrl", "appName", "Lkotlin/Function0;", "", "headersProvider", "b", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "", "enabled", "e", "(Z)V", "d", "Landroid/content/Context;", "context", "enabledProvider", "Lcom/kubi/sdk/pkg/bundle/i18n/b;", "localeProvider", "c", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C46951a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46951a f104822a = new C46951a();

    /* JADX INFO: renamed from: a */
    public final void m103436a(@NotNull String ua2) {
        Intrinsics.checkNotNullParameter(ua2, "ua");
        PackConfigManager.f47378a.m57695i(ua2);
    }

    /* JADX INFO: renamed from: b */
    public final void m103437b(@NotNull String baseUrl, @NotNull String appName, @Nullable Function0<? extends Map<String, String>> headersProvider) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(appName, "appName");
        PackConfigManager packConfigManager = PackConfigManager.f47378a;
        packConfigManager.m57698l(baseUrl);
        packConfigManager.m57697k(appName);
        packConfigManager.m57700n(headersProvider);
    }

    /* JADX INFO: renamed from: c */
    public final void m103438c(@NotNull Context context, @NotNull Function0<Boolean> enabledProvider, @NotNull Function0<RnI18nLocaleContext> localeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(enabledProvider, "enabledProvider");
        Intrinsics.checkNotNullParameter(localeProvider, "localeProvider");
        PackConfigManager packConfigManager = PackConfigManager.f47378a;
        packConfigManager.m57702p(enabledProvider);
        packConfigManager.m57701o(localeProvider);
        RnI18nManager rnI18nManager = RnI18nManager.f47318a;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        rnI18nManager.m57562g(applicationContext);
    }

    /* JADX INFO: renamed from: d */
    public final void m103439d(boolean enabled) {
        PackConfigManager.f47378a.m57696j(enabled);
    }

    /* JADX INFO: renamed from: e */
    public final void m103440e(boolean enabled) {
        PackConfigManager.f47378a.m57699m(enabled);
    }
}
