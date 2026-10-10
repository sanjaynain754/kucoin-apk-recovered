package v80;

import android.net.Uri;
import com.kubi.sdk.web.helper.C24308d;
import com.kubi.widget.web.exception.KWebWidgetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: v80.h */
/* JADX INFO: compiled from: WebShareSiteImplUtils.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/widget/web/sharesite/WebShareSiteImplUtils;", "", "<init>", "()V", "changeUrlToLangPath", "Landroid/net/Uri;", "uri", "addParams", "", "", "currentLanguagePath", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebShareSiteImplUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebShareSiteImplUtils.kt\ncom/kubi/widget/web/sharesite/WebShareSiteImplUtils\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,50:1\n216#2,2:51\n*S KotlinDebug\n*F\n+ 1 WebShareSiteImplUtils.kt\ncom/kubi/widget/web/sharesite/WebShareSiteImplUtils\n*L\n19#1:51,2\n*E\n"})
public final class C45477h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45477h f102498a = new C45477h();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Uri m100433a(@NotNull Uri uri, @NotNull Map<String, String> addParams, @NotNull String currentLanguagePath) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(addParams, "addParams");
        Intrinsics.checkNotNullParameter(currentLanguagePath, "currentLanguagePath");
        KWebViewSiteInfo kWebViewSiteInfoM100431c = C45475f.f102497a.m100431c();
        try {
            Uri.Builder builderBuildUpon = uri.buildUpon();
            C45478i c45478i = C45478i.f102499a;
            LinkedHashMap<String, String> linkedHashMapM100436c = c45478i.m100436c(uri, addParams);
            Set<String> setM100435b = c45478i.m100435b(uri, addParams);
            builderBuildUpon.clearQuery();
            for (Map.Entry<String, String> entry : linkedHashMapM100436c.entrySet()) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            String strM58703b = C24308d.m58703b(uri);
            if (setM100435b.contains(currentLanguagePath)) {
                if (!Intrinsics.areEqual(strM58703b, "/")) {
                    builderBuildUpon.path(strM58703b);
                }
                builderBuildUpon.appendQueryParameter("lang", kWebViewSiteInfoM100431c.getDefaultLan());
            } else {
                String strM100434a = C45478i.f102499a.m100434a();
                if (strM100434a.length() > 0) {
                    if (Intrinsics.areEqual(strM58703b, "/")) {
                        builderBuildUpon.path(currentLanguagePath + '-' + strM100434a);
                    } else {
                        builderBuildUpon.path(currentLanguagePath + '-' + strM100434a + '/' + strM58703b);
                    }
                }
            }
            Uri uriBuild = builderBuildUpon.build();
            Intrinsics.checkNotNull(uriBuild);
            return uriBuild;
        } catch (Exception e11) {
            C43846g.m96568c(new KWebWidgetException(e11, "ShareSite", false, null, 8, null), null, 2, null);
            return uri;
        }
    }
}
