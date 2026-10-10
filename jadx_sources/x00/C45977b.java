package x00;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.sdk.web.config.WebConfig;
import com.kubi.sdk.web.core.WebCoreMessage;
import com.kubi.sdk.web.helper.C24307c;
import com.kubi.sdk.web.match.C24322a;
import com.kubi.sdk.web.match.C24323b;
import com.kubi.sdk.web.match.WhiteListManager;
import com.kubi.sdk.web.model.SupportPageModel;
import com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel;
import d10.InterfaceC36593a;
import e10.InterfaceC37044c;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: x00.b */
/* JADX INFO: compiled from: WebConfigManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\u0004\b\u0018\u0010\u0015J\u0013\u0010\u0019\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u001c\u0010\u0015J\u001d\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\n¢\u0006\u0004\b$\u0010\u0010J\u001b\u0010'\u001a\u00020\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0%¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0011¢\u0006\u0004\b+\u0010\u0015J\u001b\u0010.\u001a\u00020\u00062\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0011¢\u0006\u0004\b.\u0010\u0015J\u0015\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\n¢\u0006\u0004\b0\u0010\u0010J\u0015\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b6\u0010\u0010J5\u0010=\u001a\u00020\u00062\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\n¢\u0006\u0004\b=\u0010>\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, m90084d2 = {"Lx00/b;", "", "<init>", "()V", "", "debug", "", "i", "(Z)V", "", "", LanguageSelectionViewModel.ARG_LANGS, "k", "(Ljava/lang/Iterable;)V", "jsApiName", "j", "(Ljava/lang/String;)V", "", "Lx00/a;", "bizInfoList", "g", "(Ljava/util/List;)V", "Lx00/d;", "ssgInfoList", CmcdData.Factory.STREAM_TYPE_LIVE, "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeList", "o", "", "rate", "", "delay", "p", "(FJ)V", "languagePath", "d", "Lkotlin/Function0;", "getter", "m", "(Lkotlin/jvm/functions/Function0;)V", "Le10/c;", "interceptors", "b", "Lcom/kubi/sdk/web/model/SupportPageModel;", "pages", "f", "basePackageName", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "v3AbTest", "n", "(I)V", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "c", "Ld10/a;", "webShareSite", "lanPath", "lan", "ua", "siteType", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ld10/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebConfigManager.kt\ncom/kubi/sdk/web/config/WebConfigManager\n+ 2 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,167:1\n85#2,4:168\n1855#3,2:172\n1855#3,2:174\n*S KotlinDebug\n*F\n+ 1 WebConfigManager.kt\ncom/kubi/sdk/web/config/WebConfigManager\n*L\n106#1:168,4\n124#1:172,2\n138#1:174,2\n*E\n"})
public final class C45977b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45977b f103426a = new C45977b();

    /* JADX INFO: renamed from: a */
    public final void m101415a(@NotNull String basePackageName) {
        Intrinsics.checkNotNullParameter(basePackageName, "basePackageName");
        C24323b.f48518a.m58821a(basePackageName);
    }

    /* JADX INFO: renamed from: b */
    public final void m101416b(@NotNull List<? extends InterfaceC37044c> interceptors) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Iterator<T> it = interceptors.iterator();
        while (it.hasNext()) {
            WebConfig.f48355a.m58601l().add((InterfaceC37044c) it.next());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m101417c(@Nullable String packageName) {
        if (packageName == null || packageName.length() == 0) {
            return;
        }
        C24322a.f48515a.m58816a(packageName);
    }

    /* JADX INFO: renamed from: d */
    public final void m101418d(@NotNull String languagePath) {
        Intrinsics.checkNotNullParameter(languagePath, "languagePath");
        WebConfig webConfig = WebConfig.f48355a;
        if (webConfig.m58596g().contains(languagePath)) {
            webConfig.m58604o(languagePath);
            return;
        }
        C43846g.m96568c(new WebCoreMessage("currentLanguagePath is unknown " + languagePath, "WebConfigManager", false, 4, null), null, 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m101419e(@NotNull Continuation<? super Unit> continuation) {
        Object objM58803d = WhiteListManager.f48507a.m58803d(continuation);
        return objM58803d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM58803d : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m101420f(@NotNull List<SupportPageModel> pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        for (SupportPageModel supportPageModel : pages) {
            String path = supportPageModel.getPath();
            if (path != null && path.length() != 0) {
                C24323b.f48518a.m58822b(supportPageModel.getPath(), supportPageModel);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m101421g(@NotNull List<C45976a> bizInfoList) {
        Intrinsics.checkNotNullParameter(bizInfoList, "bizInfoList");
        C24322a.f48515a.m58820e(bizInfoList);
    }

    /* JADX INFO: renamed from: h */
    public final void m101422h(@NotNull InterfaceC36593a webShareSite, @NotNull String lanPath, @NotNull String lan, @NotNull String ua2, @NotNull String siteType) {
        Intrinsics.checkNotNullParameter(webShareSite, "webShareSite");
        Intrinsics.checkNotNullParameter(lanPath, "lanPath");
        Intrinsics.checkNotNullParameter(lan, "lan");
        Intrinsics.checkNotNullParameter(ua2, "ua");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        WebConfig webConfig = WebConfig.f48355a;
        webConfig.m58609t(webShareSite);
        webConfig.m58607r(lanPath);
        webConfig.m58606q(lan);
        webConfig.m58603n(ua2);
        webConfig.m58610u(siteType);
    }

    /* JADX INFO: renamed from: i */
    public final void m101423i(boolean debug) {
        WebConfig.f48355a.m58605p(debug);
    }

    /* JADX INFO: renamed from: j */
    public final void m101424j(@NotNull String jsApiName) {
        Intrinsics.checkNotNullParameter(jsApiName, "jsApiName");
        if (jsApiName.length() == 0) {
            return;
        }
        WebConfig.f48355a.m58608s(jsApiName);
    }

    /* JADX INFO: renamed from: k */
    public final void m101425k(@NotNull Iterable<String> languages) {
        Intrinsics.checkNotNullParameter(languages, "languages");
        CollectionsKt.addAll(WebConfig.f48355a.m58596g(), languages);
    }

    /* JADX INFO: renamed from: l */
    public final void m101426l(@NotNull List<C45979d> ssgInfoList) {
        Intrinsics.checkNotNullParameter(ssgInfoList, "ssgInfoList");
        C24307c.f48432a.m58701d(ssgInfoList);
    }

    /* JADX INFO: renamed from: m */
    public final void m101427m(@NotNull Function0<String> getter) {
        Intrinsics.checkNotNullParameter(getter, "getter");
        WebConfig.f48355a.m58611v(getter);
    }

    /* JADX INFO: renamed from: n */
    public final void m101428n(int v3AbTest) {
        WebConfig.f48355a.m58612w(v3AbTest);
    }

    /* JADX INFO: renamed from: o */
    public final void m101429o(@NotNull List<String> writeList) {
        Intrinsics.checkNotNullParameter(writeList, "writeList");
        WhiteListManager.f48507a.m58806g(writeList);
    }

    /* JADX INFO: renamed from: p */
    public final void m101430p(float rate, long delay) {
        C44128b.m97259c("WebConfigManager", "writePageCheck: rate=" + rate + " delay=" + delay);
        WebConfig webConfig = WebConfig.f48355a;
        webConfig.m58614y(rate);
        webConfig.m58613x(delay);
    }
}
