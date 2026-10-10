package com.kubi.sdk.pkg.task;

import android.webkit.CookieManager;
import com.kubi.sdk.pkg.util.PackageException;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.task.b */
/* JADX INFO: compiled from: HttpHelper.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/b;", "Lokhttp3/CookieJar;", "<init>", "()V", "Lokhttp3/HttpUrl;", "url", "", "Lokhttp3/Cookie;", "loadForRequest", "(Lokhttp3/HttpUrl;)Ljava/util/List;", "cookies", "", "saveFromResponse", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHttpHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpHelper.kt\ncom/kubi/sdk/pkg/task/CookieManagerReaderJar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n*L\n1#1,305:1\n1603#2,9:306\n1855#2:315\n1856#2:317\n1612#2:318\n1#3:316\n22#4,2:319\n*S KotlinDebug\n*F\n+ 1 HttpHelper.kt\ncom/kubi/sdk/pkg/task/CookieManagerReaderJar\n*L\n46#1:306,9\n46#1:315\n46#1:317\n46#1:318\n46#1:316\n52#1:319,2\n*E\n"})
public final class C23973b implements CookieJar {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C23973b f47445a = new C23973b();

    @Override // okhttp3.CookieJar
    @NotNull
    public List<Cookie> loadForRequest(@NotNull HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            String cookie = CookieManager.getInstance().getCookie(url.getUrl());
            if (cookie == null) {
                return CollectionsKt.emptyList();
            }
            List listSplit$default = StringsKt.split$default((CharSequence) cookie, new String[]{";"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                Cookie cookie2 = Cookie.INSTANCE.parse(url, (String) it.next());
                if (cookie2 != null) {
                    arrayList.add(cookie2);
                }
            }
            return arrayList;
        } catch (Exception e11) {
            C43846g.m96568c(new PackageException(new TaskException(2000, " cookie注入失败: " + url, e11), "package_update", false, null, 8, null), null, 2, null);
            return CollectionsKt.emptyList();
        }
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(@NotNull HttpUrl url, @NotNull List<Cookie> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
    }
}
