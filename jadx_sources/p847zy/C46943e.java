package p847zy;

import android.app.Application;
import com.blankj.utilcode.util.C5287o0;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.function.language.dynamic.LangDynamicManager;
import com.kubi.sdk.function.language.dynamic.client.FetchResult;
import com.kubi.sdk.function.language.dynamic.client.LocalConfigClient;
import com.kubi.sdk.function.language.dynamic.client.RemoteConfigClient;
import com.kubi.sdk.site.info.SiteInfoManager;
import org.jetbrains.annotations.NotNull;
import p813yy.C46612b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: zy.e */
/* JADX INFO: compiled from: LangConfigManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0005H\u0002J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/function/language/dynamic/LangConfigManager;", "", "<init>", "()V", "TAG", "", "localClient", "Lcom/kubi/sdk/function/language/dynamic/client/LocalConfigClient;", "remoteClient", "Lcom/kubi/sdk/function/language/dynamic/client/RemoteConfigClient;", "currentSiteType", "getCurrentSiteType", "()Ljava/lang/String;", "currentLanguageType", "fetchConfig", "", "getETag", "getValue", "originKey", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46943e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46943e f104811a = new C46943e();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static LocalConfigClient f104812b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static RemoteConfigClient f104813c;

    static {
        Application applicationM6331a = C5287o0.m6331a();
        Intrinsics.checkNotNullExpressionValue(applicationM6331a, "getApp(...)");
        f104812b = new LocalConfigClient(applicationM6331a);
        f104813c = new RemoteConfigClient();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m103419a() {
        return C46612b.f104366a.m102773b(MultiLanguageManager.f46811g.getLocale());
    }

    /* JADX INFO: renamed from: b */
    public final void m103420b() {
        if (!LangDynamicManager.f46816a.m57013e()) {
            C44128b.m97266j("LangConfigManager", "fetchConfig remote is closed, skip fetch");
            return;
        }
        f104812b.m57021b();
        FetchResult fetchResultM57029b = f104813c.m57029b(m103421c(), m103419a(), m103422d());
        if (fetchResultM57029b != null) {
            C44128b.m97266j("LangConfigManager", "fetchConfig result = " + fetchResultM57029b);
            if (fetchResultM57029b instanceof FetchResult.Success) {
                FetchResult.Success success = (FetchResult.Success) fetchResultM57029b;
                f104812b.m57026g(success.getEtag());
                f104812b.m57025f(success.m57033b());
            } else {
                if (!(fetchResultM57029b instanceof FetchResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                C44128b.m97261e("LangConfigManager", "error: " + ((FetchResult.Failure) fetchResultM57029b).getErrorMsg());
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m103421c() {
        return SiteInfoManager.f47913a.m58109c();
    }

    /* JADX INFO: renamed from: d */
    public final String m103422d() {
        return f104812b.m57022c();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m103423e(@NotNull String originKey) {
        Intrinsics.checkNotNullParameter(originKey, "originKey");
        return f104812b.m57024e(originKey);
    }
}
