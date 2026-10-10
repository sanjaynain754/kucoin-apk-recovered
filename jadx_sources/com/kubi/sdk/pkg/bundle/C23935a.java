package com.kubi.sdk.pkg.bundle;

import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import com.kubi.sdk.pkg.util.C23985b;
import java.io.File;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.a */
/* JADX INFO: compiled from: BundleCommon.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a/\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m90084d2 = {"Landroid/content/Context;", "context", "", Constants.BIZ, "entry", "version", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "url", "c", "(Ljava/lang/String;)Ljava/lang/String;", "b", "Package_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBundleCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 2 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 3 BundleInfo.kt\ncom/kubi/sdk/pkg/bundle/BundleInfo\n*L\n1#1,106:1\n37#1:110\n30#1:112\n41#1:113\n37#1:114\n30#1:116\n37#1:117\n41#1:120\n37#1:121\n30#1:123\n30#1:124\n62#2:107\n62#2:108\n62#2:109\n62#2:111\n62#2:115\n62#2:118\n62#2:122\n28#3:119\n*S KotlinDebug\n*F\n+ 1 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n*L\n41#1:110\n41#1:112\n54#1:113\n54#1:114\n54#1:116\n57#1:117\n74#1:120\n74#1:121\n74#1:123\n84#1:124\n32#1:107\n34#1:108\n37#1:109\n41#1:111\n54#1:115\n57#1:118\n74#1:122\n74#1:119\n*E\n"})
public final class C23935a {
    /* JADX INFO: renamed from: a */
    public static final boolean m57544a(@NotNull Context context, @NotNull String biz, @NotNull String entry, @NotNull String version) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(version, "version");
        String strM57795e = TaskCommonKt.m57795e(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM57795e);
        String str = File.separator;
        sb2.append(str);
        sb2.append("jsbundles");
        String str2 = ((sb2.toString() + str + biz) + str + entry) + str + version;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(biz + '-' + entry);
        sb3.append(".android.hbc");
        String str3 = str2 + str + sb3.toString();
        boolean zM57792b = TaskCommonKt.m57792b(str3);
        if (!zM57792b) {
            File file = new File((((TaskCommonKt.m57795e(context) + str + "jsbundles") + str + biz) + str + entry) + str + version);
            if (file.exists()) {
                File file2 = new File(str3);
                C23985b.m57873d(C23985b.f47489a, "hbcTrace", "cause=VERSION_DIR_WITHOUT_HBC, biz=" + biz + ", entry=" + entry + ", version=" + version + ", path=" + str3 + ", versionDirExists=true, versionDirIsDirectory=" + file.isDirectory() + ", hbcExists=" + file2.exists() + ", hbcIsFile=" + file2.isFile() + ", hbcLength=" + file2.length() + ", action=REDOWNLOAD", null, 4, null);
            }
        }
        return zM57792b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m57545b(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            List<String> pathSegments = Uri.parse(url).getPathSegments();
            if (pathSegments.size() < 2) {
                return null;
            }
            return pathSegments.get(1);
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "解析json失败";
            }
            C43840a.m96547a(message, "bundle_load");
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m57546c(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            List<String> pathSegments = Uri.parse(url).getPathSegments();
            if (pathSegments.size() < 3) {
                return null;
            }
            String str = pathSegments.get(1);
            Intrinsics.checkNotNullExpressionValue(str, "segment[1]");
            String str2 = pathSegments.get(2);
            Intrinsics.checkNotNullExpressionValue(str2, "segment[2]");
            return str + '-' + str2;
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "解析json失败";
            }
            C43840a.m96547a(message, "bundle_load");
            return null;
        }
    }
}
