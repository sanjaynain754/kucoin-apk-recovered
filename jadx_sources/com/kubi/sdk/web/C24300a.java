package com.kubi.sdk.web;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.blankj.utilcode.util.C5261b0;
import com.kubi.utils.C27058k0;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.web.a */
/* JADX INFO: compiled from: WebViewUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, m90084d2 = {"handleWebViewDir", "", "context", "Landroid/content/Context;", "ensureParentDir", "file", "Ljava/io/File;", "tryLockOrRecreateFile", "createFile", "deleted", "", "LBase_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebViewUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewUtil.kt\ncom/kubi/sdk/web/WebViewUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1869#2,2:97\n*S KotlinDebug\n*F\n+ 1 WebViewUtil.kt\ncom/kubi/sdk/web/WebViewUtilKt\n*L\n51#1:97,2\n*E\n"})
public final class C24300a {
    /* JADX INFO: renamed from: c */
    public static final void m58588c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        try {
            HashSet hashSet = new HashSet();
            String absolutePath = context.getDataDir().getAbsolutePath();
            String strM66754d = C27058k0.f54342a.m66754d(context);
            if (TextUtils.equals(context.getPackageName(), strM66754d)) {
                String str = '_' + strM66754d;
                hashSet.add(absolutePath + "/app_webview/webview_data.lock");
                hashSet.add(absolutePath + "/app_webview" + str + "/webview_data.lock");
                if (C5261b0.m6148i()) {
                    hashSet.add(absolutePath + "/app_hws_webview/webview_data.lock");
                    hashSet.add(absolutePath + "/app_hws_webview" + str + "/webview_data.lock");
                }
            } else {
                if (TextUtils.isEmpty(strM66754d)) {
                    strM66754d = context.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(strM66754d, "getPackageName(...)");
                }
                WebView.setDataDirectorySuffix(strM66754d);
                String str2 = '_' + strM66754d;
                hashSet.add(absolutePath + "/app_webview" + str2 + "/webview_data.lock");
                if (C5261b0.m6148i()) {
                    hashSet.add(absolutePath + "/app_hws_webview" + str2 + "/webview_data.lock");
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                File file = new File((String) it.next());
                m58587b(file);
                m58589d(file);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m58589d(File file) {
        try {
            FileLock fileLockLock = new RandomAccessFile(file, "rw").getChannel().lock();
            if (fileLockLock != null) {
                fileLockLock.close();
            } else {
                m58586a(file, file.delete());
            }
        } catch (Exception unused) {
            m58586a(file, file.exists() ? file.delete() : false);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m58586a(File file, boolean z11) {
        try {
            m58587b(file);
            if (z11 || !file.exists()) {
                file.createNewFile();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m58587b(File file) {
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
        } catch (Exception unused) {
        }
    }
}
