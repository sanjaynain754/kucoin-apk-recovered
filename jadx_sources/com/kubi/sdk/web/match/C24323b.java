package com.kubi.sdk.web.match;

import android.net.Uri;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.helper.C24308d;
import com.kubi.sdk.web.model.SupportPageModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.web.match.b */
/* JADX INFO: compiled from: WebBaseMatcher.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/web/match/b;", "", "<init>", "()V", "", "path", "Lcom/kubi/sdk/web/model/SupportPageModel;", "info", "", "b", "(Ljava/lang/String;Lcom/kubi/sdk/web/model/SupportPageModel;)V", "name", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "", "c", "(Ljava/lang/String;)Z", "Landroid/net/Uri;", "requestUri", "d", "(Landroid/net/Uri;)Z", "", "Ljava/util/Map;", "supportPage", "", "Ljava/util/List;", "basePackageList", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C24323b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24323b f48518a = new C24323b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, SupportPageModel> supportPage = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<String> basePackageList = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m58821a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> list = basePackageList;
        if (list.contains(name)) {
            return;
        }
        list.add(name);
    }

    /* JADX INFO: renamed from: b */
    public final void m58822b(@NotNull String path, @NotNull SupportPageModel info) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(info, "info");
        supportPage.put(path, info);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m58823c(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return supportPage.get(path) != null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m58824d(@NotNull Uri requestUri) {
        Intrinsics.checkNotNullParameter(requestUri, "requestUri");
        String strM58702a = C24308d.m58702a(requestUri);
        Log.d("WebBaseMatcher", "matchV3CommonCached: " + strM58702a);
        return (strM58702a == null || strM58702a.length() == 0 || supportPage.get(strM58702a) == null) ? false : true;
    }
}
