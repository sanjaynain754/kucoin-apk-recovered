package com.kubi.sdk.web.helper;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.webkit.ProxyConfig;
import com.kubi.sdk.web.config.WebConfig;
import d10.InterfaceC36593a;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.web.helper.d */
/* JADX INFO: compiled from: WebUrlHelper.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b*\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0004*\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\nJ\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/web/helper/d;", "", "<init>", "()V", "", "", "c", "(Ljava/lang/String;)Z", "Landroid/net/Uri;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/net/Uri;)Ljava/lang/String;", "", "f", "(Landroid/net/Uri;)Ljava/util/List;", "b", "e", "(Ljava/lang/String;)Ljava/lang/String;", "pathSegments", "d", "(Ljava/util/List;Ljava/util/List;)Z", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebUrlHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebUrlHelper.kt\ncom/kubi/sdk/web/helper/WebUrlHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n2661#2,7:123\n*S KotlinDebug\n*F\n+ 1 WebUrlHelper.kt\ncom/kubi/sdk/web/helper/WebUrlHelper\n*L\n71#1:123,7\n*E\n"})
public final class C24308d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24308d f48435a = new C24308d();

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m58702a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        List<String> pathSegments = uri.getPathSegments();
        int size = pathSegments.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return pathSegments.get(0);
        }
        String str = pathSegments.get(0);
        Intrinsics.checkNotNullExpressionValue(str, "pathSegments[0]");
        return m58704c(str) ? pathSegments.get(1) : pathSegments.get(0);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m58703b(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        List<String> listM58707f = m58707f(uri);
        if (listM58707f.isEmpty()) {
            return "/";
        }
        Iterator<T> it = listM58707f.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = ((String) next) + '/' + ((String) it.next());
        }
        return (String) next;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m58704c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        WebConfig webConfig = WebConfig.f48355a;
        InterfaceC36593a interfaceC36593aM58597h = webConfig.m58597h();
        return CollectionsKt.contains(webConfig.m58596g(), interfaceC36593aM58597h != null ? interfaceC36593aM58597h.mo81881b(str) : null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m58705d(@NotNull List<String> list, @NotNull List<String> pathSegments) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        if (pathSegments.isEmpty()) {
            return false;
        }
        int size = list.size() - 1;
        int size2 = pathSegments.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size2) {
            String str = pathSegments.get(i11);
            if (Intrinsics.areEqual(str, "**")) {
                return true;
            }
            if (Intrinsics.areEqual(str, ProxyConfig.MATCH_ALL_SCHEMES)) {
                if (i11 >= list.size()) {
                    return i11 == list.size() && i11 == pathSegments.size() - 1;
                }
            } else if (i11 >= list.size() || !Intrinsics.areEqual(list.get(i11), str)) {
                return false;
            }
            i12 = i11;
            i11++;
        }
        return i12 == size;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m58706e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strSubstring = str.substring(0, Util.delimiterOffset(str, "?#", 0, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final List<String> m58707f(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() > 0) {
            String str = pathSegments.get(0);
            Intrinsics.checkNotNullExpressionValue(str, "pathSegments[0]");
            if (m58704c(str)) {
                return pathSegments.subList(1, pathSegments.size());
            }
        }
        Intrinsics.checkNotNullExpressionValue(pathSegments, "pathSegments");
        return pathSegments;
    }
}
