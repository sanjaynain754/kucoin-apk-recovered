package com.kubi.sdk.web.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.pkg.hybird.HybridPackageManager;
import com.kubi.sdk.web.core.WebCoreException;
import com.kubi.utils.extensions.C27041f;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.sdk.web.util.d */
/* JADX INFO: compiled from: LocalFileUtils.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010#\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u001f\u0010+\u001a\n '*\u0004\u0018\u00010&0&8\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m90084d2 = {"Lcom/kubi/sdk/web/util/d;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)Ljava/lang/String;", "Landroid/net/Uri;", "uri", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/net/Uri;)Ljava/lang/String;", "fileName", "Ljava/io/InputStream;", "b", "(Ljava/lang/String;)Ljava/io/InputStream;", "path", "", "index", "d", "(Ljava/lang/String;I)Ljava/lang/String;", "", "e", "(Ljava/lang/String;)Ljava/util/List;", "pathVersion", "curVersion", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "g", "(Ljava/lang/String;)Z", "version", CmcdData.Factory.STREAMING_FORMAT_HLS, "Ljava/lang/Object;", "rootPathLock", "Ljava/lang/String;", "rootPath", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "getPattern", "()Ljava/util/regex/Pattern;", "pattern", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLocalFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalFileUtils.kt\ncom/kubi/sdk/web/util/LocalFileUtils\n+ 2 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n86#2,3:97\n766#3:100\n857#3,2:101\n766#3:103\n857#3,2:104\n766#3:106\n857#3,2:107\n*S KotlinDebug\n*F\n+ 1 LocalFileUtils.kt\ncom/kubi/sdk/web/util/LocalFileUtils\n*L\n65#1:97,3\n71#1:100\n71#1:101,2\n76#1:103\n76#1:104,2\n81#1:106\n81#1:107,2\n*E\n"})
public final class C24331d {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static String rootPath;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24331d f48560a = new C24331d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Object rootPathLock = new Object();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Pattern pattern = Pattern.compile("^\\d+(\\.\\d+)*$");

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m58868a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return C27041f.m66668h(StringsKt.replace$default(C27041f.m66668h(uri.getPath()), "/_cdn", "", false, 4, (Object) null));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final InputStream m58869b(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (TextUtils.isEmpty(fileName)) {
            return null;
        }
        File file = new File(fileName);
        if (!file.exists() || file.isDirectory()) {
            return null;
        }
        try {
            return new BufferedInputStream(new FileInputStream(file));
        } catch (Exception e11) {
            C43846g.m96568c(new WebCoreException(e11, "LocalFileUtils", false, "getInputStream", 4, null), null, 2, null);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m58870c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = rootPath;
        if (str != null) {
            return str;
        }
        synchronized (rootPathLock) {
            String str2 = rootPath;
            if (str2 != null) {
                return str2;
            }
            String strM57711e = HybridPackageManager.m57711e(context);
            rootPath = strM57711e;
            return strM57711e;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m58871d(@NotNull String path, int index) {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt.split$default((CharSequence) path, new String[]{"/"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (index < 0 || index >= arrayList.size()) {
            return null;
        }
        return (String) arrayList.get(index);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<String> m58872e(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt.split$default((CharSequence) path, new String[]{"/"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m58873f(@NotNull String path, @Nullable String pathVersion, @NotNull String curVersion) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(curVersion, "curVersion");
        if (pathVersion != null && pathVersion.length() != 0 && m58875h(pathVersion)) {
            return path;
        }
        List listSplit$default = StringsKt.split$default((CharSequence) path, new String[]{"/"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (mutableList.size() == 0) {
            return path;
        }
        mutableList.add(1, curVersion);
        return '/' + CollectionsKt.joinToString$default(mutableList, "/", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m58874g(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new File(path).exists();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m58875h(String version) {
        return pattern.matcher(version).matches();
    }
}
