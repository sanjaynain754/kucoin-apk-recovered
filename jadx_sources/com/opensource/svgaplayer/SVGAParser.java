package com.opensource.svgaplayer;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.http.HttpResponseCache;
import android.os.Handler;
import android.os.Looper;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.opensource.svgaplayer.proto.MovieEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Inflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import k90.C40965c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SVGAParser.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 K2\u00020\u0001:\u0004LM>AB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u00020\f2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\f2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b*\u0010\u0005J+\u0010.\u001a\u00020\f2\u0006\u0010+\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J3\u00103\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001022\u0006\u00101\u001a\u0002002\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b3\u00104J5\u00105\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b5\u00106JI\u00108\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u00107\u001a\u00020 2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010?R\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006N"}, m90084d2 = {"Lcom/opensource/svgaplayer/SVGAParser;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "videoItem", "Lcom/opensource/svgaplayer/SVGAParser$b;", TUIConstants.TUIChat.CALL_BACK, "", JPushConstants.Operation.KEY_ALIAS, "", "y", "(Lcom/opensource/svgaplayer/SVGAVideoEntity;Lcom/opensource/svgaplayer/SVGAParser$b;Ljava/lang/String;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "z", "(Ljava/lang/Exception;Lcom/opensource/svgaplayer/SVGAParser$b;Ljava/lang/String;)V", "cacheKey", "q", "(Ljava/lang/String;Lcom/opensource/svgaplayer/SVGAParser$b;Ljava/lang/String;)V", "Ljava/io/InputStream;", "inputStream", "", "B", "(Ljava/io/InputStream;)[B", "byteArray", "w", "([B)[B", "bytes", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "([B)Z", "C", "(Ljava/io/InputStream;Ljava/lang/String;)V", "Ljava/io/File;", "outputFile", "dstDirPath", "v", "(Ljava/io/File;Ljava/lang/String;)V", "x", "name", "Lcom/opensource/svgaplayer/SVGAParser$c;", "playCallback", "o", "(Ljava/lang/String;Lcom/opensource/svgaplayer/SVGAParser$b;Lcom/opensource/svgaplayer/SVGAParser$c;)V", "Ljava/net/URL;", "url", "Lkotlin/Function0;", "t", "(Ljava/net/URL;Lcom/opensource/svgaplayer/SVGAParser$b;Lcom/opensource/svgaplayer/SVGAParser$c;)Lkotlin/jvm/functions/Function0;", CmcdData.Factory.STREAMING_FORMAT_SS, "(Ljava/lang/String;Lcom/opensource/svgaplayer/SVGAParser$b;Lcom/opensource/svgaplayer/SVGAParser$c;Ljava/lang/String;)V", "closeInputStream", "r", "(Ljava/io/InputStream;Ljava/lang/String;Lcom/opensource/svgaplayer/SVGAParser$b;ZLcom/opensource/svgaplayer/SVGAParser$c;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "mContext", "", "b", "I", "mFrameWidth", "c", "mFrameHeight", "Lcom/opensource/svgaplayer/SVGAParser$FileDownloader;", "d", "Lcom/opensource/svgaplayer/SVGAParser$FileDownloader;", "getFileDownloader", "()Lcom/opensource/svgaplayer/SVGAParser$FileDownloader;", "setFileDownloader", "(Lcom/opensource/svgaplayer/SVGAParser$FileDownloader;)V", "fileDownloader", CmcdData.Factory.STREAMING_FORMAT_HLS, "Companion", "FileDownloader", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class SVGAParser {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public volatile int mFrameWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public volatile int mFrameHeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public FileDownloader fileDownloader;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final AtomicInteger f55429e = new AtomicInteger(0);

    /* JADX INFO: renamed from: f */
    public static SVGAParser f55430f = new SVGAParser(null);

    /* JADX INFO: renamed from: g */
    public static ExecutorService f55431g = Executors.newCachedThreadPool(ThreadFactoryC27306a.f55443b);

    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m90084d2 = {"Lcom/opensource/svgaplayer/SVGAParser$Companion;", "", "()V", "TAG", "", "mShareParser", "Lcom/opensource/svgaplayer/SVGAParser;", "threadNum", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadPoolExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getThreadPoolExecutor$com_opensource_svgaplayer", "()Ljava/util/concurrent/ExecutorService;", "setThreadPoolExecutor$com_opensource_svgaplayer", "(Ljava/util/concurrent/ExecutorService;)V", "setThreadPoolExecutor", "", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;", "shareParser", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 1, 15})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExecutorService getThreadPoolExecutor$com_opensource_svgaplayer() {
            return SVGAParser.f55431g;
        }

        public final void setThreadPoolExecutor(@NotNull ThreadPoolExecutor executor) {
            setThreadPoolExecutor$com_opensource_svgaplayer(executor);
        }

        public final void setThreadPoolExecutor$com_opensource_svgaplayer(ExecutorService executorService) {
            SVGAParser.f55431g = executorService;
        }

        @NotNull
        public final SVGAParser shareParser() {
            return SVGAParser.f55430f;
        }
    }

    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062%\u0010\u0010\u001a!\u0012\u0017\u0012\u00150\rj\u0002`\u000e¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lcom/opensource/svgaplayer/SVGAParser$FileDownloader;", "", "<init>", "()V", "Ljava/net/URL;", "url", "Lkotlin/Function1;", "Ljava/io/InputStream;", "Lkotlin/ParameterName;", "name", "inputStream", "", "complete", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failure", "Lkotlin/Function0;", "b", "(Ljava/net/URL;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "()Z", "setNoCache", "(Z)V", "noCache", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
    public static class FileDownloader {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean noCache;

        /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAParser$FileDownloader$a */
        /* JADX INFO: compiled from: SVGAParser.kt */
        @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "run"}, m90085k = 3, m90086mv = {1, 1, 15})
        public static final class RunnableC27305a implements Runnable {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ URL f55439c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Ref.BooleanRef f55440d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Function1 f55441e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Function1 f55442f;

            public RunnableC27305a(URL url, Ref.BooleanRef booleanRef, Function1 function1, Function1 function2) {
                this.f55439c = url;
                this.f55440d = booleanRef;
                this.f55441e = function1;
                this.f55442f = function2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C40965c c40965c = C40965c.f91057a;
                    c40965c.m89717e("SVGAParser", "================ svga file download start ================");
                    if (HttpResponseCache.getInstalled() == null && !FileDownloader.this.getNoCache()) {
                        c40965c.m89714b("SVGAParser", "SVGAParser can not handle cache before install HttpResponseCache. see https://github.com/yyued/SVGAPlayer-Android#cache");
                        c40965c.m89714b("SVGAParser", "在配置 HttpResponseCache 前 SVGAParser 无法缓存. 查看 https://github.com/yyued/SVGAPlayer-Android#cache ");
                    }
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(this.f55439c.openConnection());
                    if (!(uRLConnection instanceof HttpURLConnection)) {
                        uRLConnection = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                    if (httpURLConnection != null) {
                        httpURLConnection.setConnectTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setRequestProperty("Connection", "close");
                        httpURLConnection.connect();
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    if (this.f55440d.element) {
                                        C40965c.f91057a.m89718f("SVGAParser", "================ svga file download canceled ================");
                                        break;
                                    }
                                    int i11 = inputStream.read(bArr, 0, 4096);
                                    if (i11 == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i11);
                                    }
                                }
                                if (this.f55440d.element) {
                                    C40965c.f91057a.m89718f("SVGAParser", "================ svga file download canceled ================");
                                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                                    CloseableKt.closeFinally(inputStream, null);
                                    return;
                                }
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                                try {
                                    C40965c.f91057a.m89717e("SVGAParser", "================ svga file download complete ================");
                                    this.f55441e.invoke(byteArrayInputStream);
                                    Unit unit = Unit.INSTANCE;
                                    CloseableKt.closeFinally(byteArrayInputStream, null);
                                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                                    CloseableKt.closeFinally(inputStream, null);
                                    return;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        CloseableKt.closeFinally(byteArrayInputStream, th2);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    CloseableKt.closeFinally(byteArrayOutputStream, th4);
                                    throw th5;
                                }
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            CloseableKt.closeFinally(inputStream, th6);
                            throw th7;
                        }
                    }
                } catch (Exception e11) {
                    C40965c c40965c2 = C40965c.f91057a;
                    c40965c2.m89714b("SVGAParser", "================ svga file download fail ================");
                    c40965c2.m89714b("SVGAParser", "error: " + e11.getMessage());
                    e11.printStackTrace();
                    this.f55442f.invoke(e11);
                }
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getNoCache() {
            return this.noCache;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public Function0<Unit> m67708b(@NotNull URL url, @NotNull Function1<? super InputStream, Unit> complete, @NotNull Function1<? super Exception, Unit> failure) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = false;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.opensource.svgaplayer.SVGAParser$FileDownloader$resume$cancelBlock$1
                @Override // p852kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    booleanRef.element = true;
                }
            };
            SVGAParser.INSTANCE.getThreadPoolExecutor$com_opensource_svgaplayer().execute(new RunnableC27305a(url, booleanRef, complete, failure));
            return function0;
        }
    }

    /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAParser$a */
    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m90084d2 = {"<anonymous>", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "newThread"}, m90085k = 3, m90086mv = {1, 1, 15})
    public static final class ThreadFactoryC27306a implements ThreadFactory {

        /* JADX INFO: renamed from: b */
        public static final ThreadFactoryC27306a f55443b = new ThreadFactoryC27306a();

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "SVGAParser-Thread-" + SVGAParser.f55429e.getAndIncrement());
        }
    }

    /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAParser$b */
    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/opensource/svgaplayer/SVGAParser$b;", "", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "videoItem", "", "b", "(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
    public interface InterfaceC27307b {
        /* JADX INFO: renamed from: a */
        void mo67676a();

        /* JADX INFO: renamed from: b */
        void mo67677b(@NotNull SVGAVideoEntity videoItem);
    }

    /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAParser$c */
    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/opensource/svgaplayer/SVGAParser$c;", "", "", "Ljava/io/File;", "file", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/List;)V", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
    public interface InterfaceC27308c {
        /* JADX INFO: renamed from: a */
        void m67709a(@NotNull List<? extends File> file);
    }

    /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAParser$d */
    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "run"}, m90085k = 3, m90086mv = {1, 1, 15})
    public static final class RunnableC27309d implements Runnable {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f55445c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC27307b f55446d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC27308c f55447e;

        public RunnableC27309d(String str, InterfaceC27307b interfaceC27307b, InterfaceC27308c interfaceC27308c) {
            this.f55445c = str;
            this.f55446d = interfaceC27307b;
            this.f55447e = interfaceC27308c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AssetManager assets;
            InputStream inputStreamOpen;
            try {
                Context context = SVGAParser.this.mContext;
                if (context == null || (assets = context.getAssets()) == null || (inputStreamOpen = assets.open(this.f55445c)) == null) {
                    return;
                }
                SVGAParser.this.m67699r(inputStreamOpen, SVGACache.f55407c.m67644c("file:///assets/" + this.f55445c), this.f55446d, true, this.f55447e, this.f55445c);
            } catch (Exception e11) {
                SVGAParser.this.m67706z(e11, this.f55446d, this.f55445c);
            }
        }
    }

    /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAParser$e */
    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "run"}, m90085k = 3, m90086mv = {1, 1, 15})
    public static final class RunnableC27313e implements Runnable {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f55463c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC27307b f55464d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f55465e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC27308c f55466f;

        public RunnableC27313e(String str, InterfaceC27307b interfaceC27307b, String str2, InterfaceC27308c interfaceC27308c) {
            this.f55463c = str;
            this.f55464d = interfaceC27307b;
            this.f55465e = str2;
            this.f55466f = interfaceC27308c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (SVGACache.f55407c.m67650i()) {
                SVGAParser.this.m67698q(this.f55463c, this.f55464d, this.f55465e);
            } else {
                SVGAParser.this.m67700s(this.f55463c, this.f55464d, this.f55466f, this.f55465e);
            }
        }
    }

    /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAParser$f */
    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "run"}, m90085k = 3, m90086mv = {1, 1, 15})
    public static final class RunnableC27314f implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f55467b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC27307b f55468c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SVGAVideoEntity f55469d;

        public RunnableC27314f(String str, InterfaceC27307b interfaceC27307b, SVGAVideoEntity sVGAVideoEntity) {
            this.f55467b = str;
            this.f55468c = interfaceC27307b;
            this.f55469d = sVGAVideoEntity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C40965c.f91057a.m89717e("SVGAParser", "================ " + this.f55467b + " parser complete ================");
            InterfaceC27307b interfaceC27307b = this.f55468c;
            if (interfaceC27307b != null) {
                interfaceC27307b.mo67677b(this.f55469d);
            }
        }
    }

    /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAParser$g */
    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "run"}, m90085k = 3, m90086mv = {1, 1, 15})
    public static final class RunnableC27315g implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC27307b f55470b;

        public RunnableC27315g(InterfaceC27307b interfaceC27307b) {
            this.f55470b = interfaceC27307b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC27307b interfaceC27307b = this.f55470b;
            if (interfaceC27307b != null) {
                interfaceC27307b.mo67676a();
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m67694A(byte[] bytes) {
        return bytes.length > 4 && bytes[0] == 80 && bytes[1] == 75 && bytes[2] == 3 && bytes[3] == 4;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m67692p(SVGAParser sVGAParser, String str, InterfaceC27307b interfaceC27307b, InterfaceC27308c interfaceC27308c, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            interfaceC27308c = null;
        }
        sVGAParser.m67697o(str, interfaceC27307b, interfaceC27308c);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Function0 m67693u(SVGAParser sVGAParser, URL url, InterfaceC27307b interfaceC27307b, InterfaceC27308c interfaceC27308c, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            interfaceC27308c = null;
        }
        return sVGAParser.m67701t(url, interfaceC27307b, interfaceC27308c);
    }

    /* JADX INFO: renamed from: B */
    public final byte[] m67695B(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int i11 = inputStream.read(bArr, 0, 2048);
                if (i11 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(byteArrayOutputStream, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m67696C(InputStream inputStream, String cacheKey) throws Exception {
        C40965c.f91057a.m89717e("SVGAParser", "================ unzip prepare ================");
        File fileM67643b = SVGACache.f55407c.m67643b(cacheKey);
        fileM67643b.mkdirs();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(zipInputStream, null);
                            CloseableKt.closeFinally(bufferedInputStream, null);
                            return;
                        }
                        String name = nextEntry.getName();
                        Intrinsics.checkExpressionValueIsNotNull(name, "zipItem.name");
                        if (!StringsKt.contains$default((CharSequence) name, (CharSequence) "../", false, 2, (Object) null)) {
                            String name2 = nextEntry.getName();
                            Intrinsics.checkExpressionValueIsNotNull(name2, "zipItem.name");
                            if (!StringsKt.contains$default((CharSequence) name2, (CharSequence) "/", false, 2, (Object) null)) {
                                File file = new File(fileM67643b, nextEntry.getName());
                                String absolutePath = fileM67643b.getAbsolutePath();
                                Intrinsics.checkExpressionValueIsNotNull(absolutePath, "cacheDir.absolutePath");
                                m67702v(file, absolutePath);
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    byte[] bArr = new byte[2048];
                                    while (true) {
                                        int i11 = zipInputStream.read(bArr);
                                        if (i11 <= 0) {
                                            break;
                                        } else {
                                            fileOutputStream.write(bArr, 0, i11);
                                        }
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    CloseableKt.closeFinally(fileOutputStream, null);
                                    C40965c.f91057a.m89714b("SVGAParser", "================ unzip complete ================");
                                    zipInputStream.closeEntry();
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        CloseableKt.closeFinally(fileOutputStream, th2);
                                        throw th3;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            CloseableKt.closeFinally(zipInputStream, th4);
                            throw th5;
                        }
                    }
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        CloseableKt.closeFinally(bufferedInputStream, th);
                        throw th6;
                    }
                }
            } catch (Throwable th7) {
                throw th7;
            }
        } catch (Exception e11) {
            C40965c c40965c = C40965c.f91057a;
            c40965c.m89714b("SVGAParser", "================ unzip error ================");
            c40965c.m89715c("SVGAParser", Constants.IPC_BUNDLE_KEY_SEND_ERROR, e11);
            SVGACache sVGACache = SVGACache.f55407c;
            String absolutePath2 = fileM67643b.getAbsolutePath();
            Intrinsics.checkExpressionValueIsNotNull(absolutePath2, "cacheDir.absolutePath");
            sVGACache.m67647f(absolutePath2);
            fileM67643b.delete();
            throw e11;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m67697o(@NotNull String name, @Nullable InterfaceC27307b callback, @Nullable InterfaceC27308c playCallback) {
        if (this.mContext == null) {
            C40965c.f91057a.m89714b("SVGAParser", "在配置 SVGAParser context 前, 无法解析 SVGA 文件。");
            return;
        }
        C40965c.f91057a.m89717e("SVGAParser", "================ decode " + name + " from assets ================");
        f55431g.execute(new RunnableC27309d(name, callback, playCallback));
    }

    /* JADX INFO: renamed from: q */
    public final void m67698q(String cacheKey, InterfaceC27307b callback, String alias) {
        C40965c c40965c = C40965c.f91057a;
        c40965c.m89717e("SVGAParser", "================ decode " + alias + " from cache ================");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("decodeFromCacheKey called with cacheKey : ");
        sb2.append(cacheKey);
        c40965c.m89713a("SVGAParser", sb2.toString());
        if (this.mContext == null) {
            c40965c.m89714b("SVGAParser", "在配置 SVGAParser context 前, 无法解析 SVGA 文件。");
            return;
        }
        try {
            File fileM67643b = SVGACache.f55407c.m67643b(cacheKey);
            File file = new File(fileM67643b, "movie.binary");
            if (!file.isFile()) {
                file = null;
            }
            if (file != null) {
                try {
                    c40965c.m89717e("SVGAParser", "binary change to entity");
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        c40965c.m89717e("SVGAParser", "binary change to entity success");
                        MovieEntity movieEntityDecode = MovieEntity.ADAPTER.decode(fileInputStream);
                        Intrinsics.checkExpressionValueIsNotNull(movieEntityDecode, "MovieEntity.ADAPTER.decode(it)");
                        m67705y(new SVGAVideoEntity(movieEntityDecode, fileM67643b, this.mFrameWidth, this.mFrameHeight), callback, alias);
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileInputStream, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(fileInputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Exception e11) {
                    C40965c.f91057a.m89715c("SVGAParser", "binary change to entity fail", e11);
                    fileM67643b.delete();
                    file.delete();
                    throw e11;
                }
            }
            File file2 = new File(fileM67643b, "movie.spec");
            if (!file2.isFile()) {
                file2 = null;
            }
            if (file2 != null) {
                try {
                    c40965c.m89717e("SVGAParser", "spec change to entity");
                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int i11 = fileInputStream2.read(bArr, 0, 2048);
                                if (i11 == -1) {
                                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                                    C40965c.f91057a.m89717e("SVGAParser", "spec change to entity success");
                                    m67705y(new SVGAVideoEntity(jSONObject, fileM67643b, this.mFrameWidth, this.mFrameHeight), callback, alias);
                                    Unit unit2 = Unit.INSTANCE;
                                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                                    CloseableKt.closeFinally(fileInputStream2, null);
                                    return;
                                }
                                byteArrayOutputStream.write(bArr, 0, i11);
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    CloseableKt.closeFinally(fileInputStream2, th);
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                CloseableKt.closeFinally(byteArrayOutputStream, th5);
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                } catch (Exception e12) {
                    C40965c.f91057a.m89715c("SVGAParser", alias + " movie.spec change to entity fail", e12);
                    fileM67643b.delete();
                    file2.delete();
                    throw e12;
                }
            }
        } catch (Exception e13) {
            m67706z(e13, callback, alias);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m67699r(@NotNull InputStream inputStream, @NotNull String cacheKey, @Nullable InterfaceC27307b callback, boolean closeInputStream, @Nullable InterfaceC27308c playCallback, @Nullable String alias) {
        if (this.mContext == null) {
            C40965c.f91057a.m89714b("SVGAParser", "在配置 SVGAParser context 前, 无法解析 SVGA 文件。");
            return;
        }
        C40965c.f91057a.m89717e("SVGAParser", "================ decode " + alias + " from input stream ================");
        f55431g.execute(new SVGAParser$decodeFromInputStream$1(this, inputStream, cacheKey, callback, alias, playCallback, closeInputStream));
    }

    /* JADX INFO: renamed from: s */
    public final void m67700s(@NotNull String cacheKey, @Nullable InterfaceC27307b callback, @Nullable InterfaceC27308c playCallback, @Nullable String alias) {
        f55431g.execute(new SVGAParser$decodeFromSVGAFileCacheKey$1(this, alias, cacheKey, callback, playCallback));
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Function0<Unit> m67701t(@NotNull final URL url, @Nullable final InterfaceC27307b callback, @Nullable final InterfaceC27308c playCallback) {
        if (this.mContext == null) {
            C40965c.f91057a.m89714b("SVGAParser", "在配置 SVGAParser context 前, 无法解析 SVGA 文件。");
            return null;
        }
        final String string = url.toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "url.toString()");
        C40965c c40965c = C40965c.f91057a;
        c40965c.m89717e("SVGAParser", "================ decode from url: " + string + " ================");
        SVGACache sVGACache = SVGACache.f55407c;
        final String strM67645d = sVGACache.m67645d(url);
        if (!sVGACache.m67649h(strM67645d)) {
            c40965c.m89717e("SVGAParser", "no cached, prepare to download");
            return this.fileDownloader.m67708b(url, new Function1<InputStream, Unit>() { // from class: com.opensource.svgaplayer.SVGAParser$decodeFromURL$2
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InputStream inputStream) {
                    invoke2(inputStream);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InputStream inputStream) {
                    this.this$0.m67699r(inputStream, strM67645d, callback, false, playCallback, string);
                }
            }, new Function1<Exception, Unit>() { // from class: com.opensource.svgaplayer.SVGAParser$decodeFromURL$3
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                    invoke2(exc);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Exception exc) {
                    C40965c.f91057a.m89714b("SVGAParser", "================ svga file: " + url + " download fail ================");
                    this.this$0.m67706z(exc, callback, string);
                }
            });
        }
        c40965c.m89717e("SVGAParser", "this url cached");
        f55431g.execute(new RunnableC27313e(strM67645d, callback, string, playCallback));
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final void m67702v(File outputFile, String dstDirPath) throws IOException {
        String dstDirCanonicalPath = new File(dstDirPath).getCanonicalPath();
        String outputFileCanonicalPath = outputFile.getCanonicalPath();
        Intrinsics.checkExpressionValueIsNotNull(outputFileCanonicalPath, "outputFileCanonicalPath");
        Intrinsics.checkExpressionValueIsNotNull(dstDirCanonicalPath, "dstDirCanonicalPath");
        if (StringsKt.startsWith$default(outputFileCanonicalPath, dstDirCanonicalPath, false, 2, (Object) null)) {
            return;
        }
        throw new IOException("Found Zip Path Traversal Vulnerability with " + dstDirCanonicalPath);
    }

    /* JADX INFO: renamed from: w */
    public final byte[] m67703w(byte[] byteArray) {
        Inflater inflater = new Inflater();
        inflater.setInput(byteArray, 0, byteArray.length);
        byte[] bArr = new byte[2048];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int iInflate = inflater.inflate(bArr, 0, 2048);
                if (iInflate <= 0) {
                    inflater.end();
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    return byteArray2;
                }
                byteArrayOutputStream.write(bArr, 0, iInflate);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(byteArrayOutputStream, th2);
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m67705y(SVGAVideoEntity videoItem, InterfaceC27307b callback, String alias) {
        new Handler(Looper.getMainLooper()).post(new RunnableC27314f(alias, callback, videoItem));
    }

    public SVGAParser(@Nullable Context context) {
        Context applicationContext;
        if (context != null) {
            applicationContext = context.getApplicationContext();
        } else {
            applicationContext = null;
        }
        this.mContext = applicationContext;
        SVGACache.f55407c.m67652k(context);
        this.fileDownloader = new FileDownloader();
    }

    /* JADX INFO: renamed from: x */
    public final void m67704x(@NotNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        SVGACache.f55407c.m67652k(applicationContext);
    }

    /* JADX INFO: renamed from: z */
    public final void m67706z(Exception e11, InterfaceC27307b callback, String alias) {
        e11.printStackTrace();
        C40965c c40965c = C40965c.f91057a;
        c40965c.m89714b("SVGAParser", "================ " + alias + " parser error ================");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(alias);
        sb2.append(" parse error");
        c40965c.m89715c("SVGAParser", sb2.toString(), e11);
        new Handler(Looper.getMainLooper()).post(new RunnableC27315g(callback));
    }
}
