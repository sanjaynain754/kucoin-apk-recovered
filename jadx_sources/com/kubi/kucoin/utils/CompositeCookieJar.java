package com.kubi.kucoin.utils;

import com.kubi.kucoin.exception.AppNetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CompositeCookieJar.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kucoin/utils/CompositeCookieJar;", "Lokhttp3/CookieJar;", "cookieJars", "", "<init>", "(Ljava/lang/Iterable;)V", "loadForRequest", "", "Lokhttp3/Cookie;", "url", "Lokhttp3/HttpUrl;", "saveFromResponse", "", "cookies", "Companion", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCompositeCookieJar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositeCookieJar.kt\ncom/kubi/kucoin/utils/CompositeCookieJar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 AppNetIssue.kt\ncom/kubi/kucoin/exception/AppNetIssueKt\n*L\n1#1,50:1\n1374#2:51\n1460#2,2:52\n1462#2,3:56\n1869#2:59\n1870#2:62\n44#3,2:54\n44#3,2:60\n*S KotlinDebug\n*F\n+ 1 CompositeCookieJar.kt\ncom/kubi/kucoin/utils/CompositeCookieJar\n*L\n24#1:51\n24#1:52,2\n24#1:56,3\n42#1:59\n42#1:62\n28#1:54,2\n46#1:60,2\n*E\n"})
public final class CompositeCookieJar implements CookieJar {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f28534b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Iterable<CookieJar> f28535a;

    /* JADX INFO: compiled from: CompositeCookieJar.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kucoin/utils/CompositeCookieJar$Companion;", "", "<init>", "()V", "TAG", "", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeCookieJar(@NotNull Iterable<? extends CookieJar> cookieJars) {
        Intrinsics.checkNotNullParameter(cookieJars, "cookieJars");
        this.f28535a = cookieJars;
    }

    @Override // okhttp3.CookieJar
    @NotNull
    public List<Cookie> loadForRequest(@NotNull HttpUrl url) {
        List<Cookie> listEmptyList;
        Intrinsics.checkNotNullParameter(url, "url");
        Iterable<CookieJar> iterable = this.f28535a;
        ArrayList arrayList = new ArrayList();
        Iterator<CookieJar> it = iterable.iterator();
        while (it.hasNext()) {
            try {
                listEmptyList = it.next().loadForRequest(url);
            } catch (Exception e11) {
                C43846g.m96568c(new AppNetException(e11, "CompositeCookieJar", false, null, 8, null), null, 2, null);
                listEmptyList = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, listEmptyList);
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(@NotNull HttpUrl url, @NotNull List<Cookie> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Iterator<CookieJar> it = this.f28535a.iterator();
        while (it.hasNext()) {
            try {
                it.next().saveFromResponse(url, cookies);
            } catch (Exception e11) {
                C43846g.m96568c(new AppNetException(e11, "CompositeCookieJar", false, null, 8, null), null, 2, null);
            }
        }
    }
}
