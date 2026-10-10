package com.kubi.sdk.web.helper;

import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.host.HostManager;
import com.kubi.sdk.web.config.WebConfig;
import com.kubi.sdk.web.http.WebSsgPrefetch;
import com.kubi.sdk.web.match.WhiteListManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import x00.C45979d;

/* JADX INFO: renamed from: com.kubi.sdk.web.helper.c */
/* JADX INFO: compiled from: WebSsgHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/web/helper/c;", "", "<init>", "()V", "", "Lx00/d;", "ssgInfoList", "", "d", "(Ljava/util/List;)V", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "", "b", "(Landroid/net/Uri;)Z", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lx00/d;)Ljava/lang/String;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "matchPathMap", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebSsgHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSsgHelper.kt\ncom/kubi/sdk/web/helper/WebSsgHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n1855#2,2:79\n766#2:81\n857#2,2:82\n1549#2:84\n1620#2,3:85\n*S KotlinDebug\n*F\n+ 1 WebSsgHelper.kt\ncom/kubi/sdk/web/helper/WebSsgHelper\n*L\n31#1:79,2\n52#1:81\n52#1:82,2\n52#1:84\n52#1:85,3\n*E\n"})
public final class C24307c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24307c f48432a = new C24307c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final CopyOnWriteArrayList<C45979d> ssgInfoList = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, C45979d> matchPathMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public final String m58698a(C45979d c45979d) {
        WebConfig webConfig = WebConfig.f48355a;
        String strM58591b = webConfig.m58591b();
        String strM = HostManager.a.m();
        String strTrim = StringsKt.trim(c45979d.getMatchPath(), '/');
        if (Intrinsics.areEqual(strM58591b, webConfig.m58594e())) {
            return strM + '/' + strTrim;
        }
        return strM + '/' + strM58591b + '/' + strTrim;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m58699b(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!WhiteListManager.f48507a.m58800a(uri)) {
            return false;
        }
        return matchPathMap.containsKey(C24308d.m58703b(uri));
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m58700c(@NotNull Context context, @NotNull Continuation<? super Unit> continuation) {
        CopyOnWriteArrayList<C45979d> copyOnWriteArrayList = ssgInfoList;
        ArrayList<C45979d> arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            if (((C45979d) obj).getPreFetch()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (C45979d it : arrayList) {
            C24307c c24307c = f48432a;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList2.add(c24307c.m58698a(it));
        }
        Object objM58734i = WebSsgPrefetch.f48451a.m58734i(context, CollectionsKt.toList(arrayList2), continuation);
        return objM58734i == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM58734i : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m58701d(@NotNull List<C45979d> ssgInfoList2) {
        Intrinsics.checkNotNullParameter(ssgInfoList2, "ssgInfoList");
        CopyOnWriteArrayList<C45979d> copyOnWriteArrayList = ssgInfoList;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(ssgInfoList2);
        for (C45979d c45979d : ssgInfoList2) {
            matchPathMap.put(StringsKt.trim(c45979d.getMatchPath(), '/'), c45979d);
        }
    }
}
