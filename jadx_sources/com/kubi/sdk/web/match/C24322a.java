package com.kubi.sdk.web.match;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.sdk.web.helper.C24308d;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import x00.C45976a;

/* JADX INFO: renamed from: com.kubi.sdk.web.match.a */
/* JADX INFO: compiled from: BizInfoMatcher.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0010R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/web/match/a;", "", "<init>", "()V", "", "Lx00/a;", "bizInfoList", "", "e", "(Ljava/util/List;)V", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "", "d", "(Ljava/lang/String;)Z", "Landroid/net/Uri;", "requestUri", "c", "(Landroid/net/Uri;)Lx00/a;", "path", "b", "", "Ljava/util/Map;", "bizInfoMatchMap", "", "Ljava/util/Set;", "v2CachePackage", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBizInfoMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizInfoMatcher.kt\ncom/kubi/sdk/web/match/BizInfoMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1855#2,2:57\n*S KotlinDebug\n*F\n+ 1 BizInfoMatcher.kt\ncom/kubi/sdk/web/match/BizInfoMatcher\n*L\n24#1:57,2\n*E\n"})
public final class C24322a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24322a f48515a = new C24322a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, C45976a> bizInfoMatchMap = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> v2CachePackage = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public final void m58816a(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        v2CachePackage.add(packageName);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m58817b(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return bizInfoMatchMap.get(path) != null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final C45976a m58818c(@NotNull Uri requestUri) {
        Intrinsics.checkNotNullParameter(requestUri, "requestUri");
        String strM58702a = C24308d.m58702a(requestUri);
        if (strM58702a == null || strM58702a.length() == 0) {
            return null;
        }
        return bizInfoMatchMap.get(strM58702a);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m58819d(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return v2CachePackage.contains(packageName);
    }

    /* JADX INFO: renamed from: e */
    public final void m58820e(@NotNull List<C45976a> bizInfoList) {
        Intrinsics.checkNotNullParameter(bizInfoList, "bizInfoList");
        for (C45976a c45976a : bizInfoList) {
            bizInfoMatchMap.put(c45976a.getMatchPath(), c45976a);
        }
    }
}
