package v80;

import android.net.Uri;
import d10.InterfaceC36593a;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p80.C43414a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: v80.c */
/* JADX INFO: compiled from: WebDynamicShareSiteImpl.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/widget/web/sharesite/WebDynamicShareSiteImpl;", "Lcom/kubi/sdk/web/sharesite/WebShareSite;", "Lcom/kubi/widget/web/sharesite/WebShareSiteImplService;", "<init>", "()V", "changeUrlToLangPath", "Landroid/net/Uri;", "uri", "addParams", "", "", "currentLanguagePath", "getIndexHtmlPath", "removePathCountryCode", "localLanPath", "getService", "getMapSite", "Lcom/kubi/widget/web/sharesite/KWebViewSiteInfo;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45472c implements InterfaceC36593a, InterfaceC45476g {
    @Override // d10.InterfaceC36593a
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo81880a() {
        return C45475f.f102497a.m100430b();
    }

    @Override // d10.InterfaceC36593a
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo81881b(@NotNull String localLanPath) {
        Intrinsics.checkNotNullParameter(localLanPath, "localLanPath");
        return StringsKt.removeSuffix(localLanPath, (CharSequence) ('-' + C45478i.f102499a.m100434a()));
    }

    @Override // v80.InterfaceC45476g
    @NotNull
    /* JADX INFO: renamed from: c */
    public KWebViewSiteInfo mo100427c() {
        return C43414a.f95860a.m95605b();
    }

    @Override // d10.InterfaceC36593a
    @NotNull
    /* JADX INFO: renamed from: d */
    public Uri mo81882d(@NotNull Uri uri, @NotNull Map<String, String> addParams, @NotNull String currentLanguagePath) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(addParams, "addParams");
        Intrinsics.checkNotNullParameter(currentLanguagePath, "currentLanguagePath");
        return C45477h.f102498a.m100433a(uri, addParams, currentLanguagePath);
    }

    @Override // v80.InterfaceC45476g
    @NotNull
    public InterfaceC36593a getService() {
        return this;
    }
}
