package com.kubi.sdk.web;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.host.HostManager;
import com.kubi.sdk.web.config.WebConfig;
import com.kubi.sdk.web.core.BridgeWebChromeClient;
import com.kubi.sdk.web.core.BridgeWebViewClient;
import com.kubi.sdk.web.core.InterfaceC24304b;
import com.kubi.sdk.web.core.WebBridge;
import com.kubi.sdk.web.core.WebCoreException;
import com.kubi.sdk.web.core.WebCoreMessage;
import com.kubi.sdk.web.helper.WritePageChecker;
import com.kubi.sdk.web.http.RequestCache;
import com.kubi.sdk.web.http.WebSsgPrefetch;
import com.kubi.sdk.web.jsapi.InterfaceC24317b;
import com.kubi.sdk.web.jsapi.JsEventObj;
import com.kubi.sdk.web.listener.holder.ViewLoadingListenerHolder;
import com.kubi.sdk.web.match.WhiteListManager;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.sdk.web.util.C24335h;
import com.kubi.sdk.web.util.C24336i;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import e10.InterfaceC37042a;
import e10.InterfaceC37043b;
import e10.InterfaceC37044c;
import f10.C37323b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import x00.C45978c;
import z00.InterfaceC46619a;
import z00.InterfaceC46620b;
import z00.InterfaceC46621c;

/* JADX INFO: compiled from: KWebView.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 m2\u00020\u0001:\u0003\u008e\u0001XB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0012J\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0012J\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u0012J\r\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\"\u0010 J'\u0010'\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b,\u0010-J#\u0010,\u001a\u0004\u0018\u00010+2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010/J\u000f\u00100\u001a\u00020\u0016H\u0016¢\u0006\u0004\b0\u0010 J-\u00104\u001a\u00020\r2\u0006\u00101\u001a\u00020#2\u0016\b\u0002\u00103\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0018\u000102¢\u0006\u0004\b4\u00105J3\u00106\u001a\u00020\r2\u0006\u00101\u001a\u00020#2\u0016\b\u0002\u00103\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0018\u000102H\u0086@ø\u0001\u0000¢\u0006\u0004\b6\u00107JQ\u0010=\u001a\u00020\u00162\u0006\u00108\u001a\u00020#2\u0016\b\u0002\u00103\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0018\u0001022\u001c\u0010<\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0:\u0012\u0006\u0012\u0004\u0018\u00010;09H\u0086@ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u0015\u0010A\u001a\u00020\r2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u00020\r2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bC\u0010BJ\r\u0010D\u001a\u00020\r¢\u0006\u0004\bD\u0010\u0012J\u0015\u0010F\u001a\u00020\r2\u0006\u0010@\u001a\u00020E¢\u0006\u0004\bF\u0010GJ\u0013\u0010H\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ7\u0010K\u001a\u00020\r2\u0006\u0010J\u001a\u00020#2\b\b\u0002\u00103\u001a\u00020#2\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\r\u0018\u000109¢\u0006\u0004\bK\u0010LJ\u0015\u0010O\u001a\u00020\r2\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PJ\u0015\u0010S\u001a\u00020\r2\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bS\u0010TJ!\u0010X\u001a\u00020\r2\u0012\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00020V0U\"\u00020V¢\u0006\u0004\bX\u0010YJ\u0015\u0010[\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\u0013¢\u0006\u0004\b[\u0010\\J\u0015\u0010_\u001a\u00020\r2\u0006\u0010^\u001a\u00020]¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\r2\u0006\u0010^\u001a\u00020]¢\u0006\u0004\ba\u0010`J\r\u0010b\u001a\u00020\r¢\u0006\u0004\bb\u0010\u0012J5\u0010h\u001a\u00020\r2\b\u0010c\u001a\u0004\u0018\u00010#2\b\u0010e\u001a\u0004\u0018\u00010d2\b\u0010f\u001a\u0004\u0018\u00010#2\b\u0010g\u001a\u0004\u0018\u00010#¢\u0006\u0004\bh\u0010iJ\u0015\u0010k\u001a\u00020\r2\u0006\u0010@\u001a\u00020j¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\rH\u0003¢\u0006\u0004\bm\u0010\u0012J\u000f\u0010n\u001a\u00020\rH\u0002¢\u0006\u0004\bn\u0010\u0012J\u001f\u0010p\u001a\u00020\r2\u0006\u0010o\u001a\u00020#2\u0006\u00101\u001a\u00020#H\u0002¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020\rH\u0002¢\u0006\u0004\br\u0010\u0012J+\u0010v\u001a\u00020\r*\u00020s2\u0006\u00101\u001a\u00020#2\u0006\u0010t\u001a\u00020#2\u0006\u0010u\u001a\u00020#H\u0002¢\u0006\u0004\bv\u0010wJ\u0015\u0010y\u001a\b\u0012\u0004\u0012\u00020#0xH\u0002¢\u0006\u0004\by\u0010zJ\u0013\u0010{\u001a\u00020#*\u00020#H\u0002¢\u0006\u0004\b{\u0010|R\u0014\u0010\u007f\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010~R\u0017\u0010\u0082\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bA\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b!\u0010\u0083\u0001R\u0018\u0010\u0085\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001e\u0010\u0083\u0001R\u0017\u0010\u0089\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b[\u0010\u0088\u0001R\u0019\u0010\u008c\u0001\u001a\u00030\u008a\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bH\u0010\u008b\u0001R\u0018\u0010\u008d\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bn\u0010\u0083\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008f\u0001"}, m90084d2 = {"Lcom/kubi/sdk/web/KWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attributeSet", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "def", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "", "backAction", "u", "(Lkotlin/jvm/functions/Function0;)V", CmcdData.Factory.STREAMING_FORMAT_SS, "()V", "", "initStartElapsedMs", "viewCreateTimeMs", "", "warmupHit", "firstWebViewWarmup", "q", "(JJZZ)V", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "p", "r", "f", "e", "()Z", "d", "m", "", "script", "Landroid/webkit/ValueCallback;", "resultCallback", "evaluateJavascript", "(Ljava/lang/String;Landroid/webkit/ValueCallback;)V", "Landroid/view/ActionMode$Callback;", TUIConstants.TUIChat.CALL_BACK, "Landroid/view/ActionMode;", "startActionMode", "(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;", "type", "(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;", "performLongClick", "url", "", ReportDataTable.COLUMN_PARAMS, "o", "(Ljava/lang/String;Ljava/util/Map;)V", "C", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "baseUrl", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "htmlMaker", "n", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz00/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "c", "(Lz00/b;)V", "B", "t", "Lz00/a;", "setDisableSceneListener", "(Lz00/a;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "event", "x", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Le10/a;", "chooser", "setFileChooser", "(Le10/a;)V", "Le10/b;", "webPermission", "setWebPermission", "(Le10/b;)V", "", "Le10/c;", "interceptors", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([Le10/c;)V", "second", "g", "(J)V", "Lcom/kubi/sdk/web/jsapi/b;", "handler", "b", "(Lcom/kubi/sdk/web/jsapi/b;)V", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "w", "pageType", "", "dclTime", "currentProjectName", "currentProjectVersion", "v", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/kubi/sdk/web/core/b;", "setFullscreenListener", "(Lcom/kubi/sdk/web/core/b;)V", "j", "i", "source", "z", "(Ljava/lang/String;Ljava/lang/String;)V", "k", "Landroid/webkit/CookieManager;", "domain", "themeValue", CmcdData.Factory.STREAM_TYPE_LIVE, "(Landroid/webkit/CookieManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "D", "()Ljava/util/List;", ExifInterface.LONGITUDE_EAST, "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/kubi/sdk/web/core/WebBridge;", "Lcom/kubi/sdk/web/core/WebBridge;", "bridge", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "Z", "destroying", "destroyed", "renderProcessGone", "Lcom/kubi/sdk/web/helper/WritePageChecker;", "Lcom/kubi/sdk/web/helper/WritePageChecker;", "whitePageMonitor", "Lcom/kubi/sdk/web/core/BridgeWebChromeClient;", "Lcom/kubi/sdk/web/core/BridgeWebChromeClient;", "bridgeWebChromeClient", "hasPreparedInitialPageTracking", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebView.kt\ncom/kubi/sdk/web/KWebView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,540:1\n1#2:541\n86#3,3:542\n85#3,4:545\n85#3,4:549\n86#3,3:553\n86#3,3:556\n86#3,3:561\n1855#4,2:559\n1549#4:564\n1620#4,3:565\n766#4:568\n857#4,2:569\n766#4:571\n857#4,2:572\n13579#5,2:574\n*S KotlinDebug\n*F\n+ 1 KWebView.kt\ncom/kubi/sdk/web/KWebView\n*L\n232#1:542,3\n245#1:545,4\n265#1:549,4\n296#1:553,3\n309#1:556,3\n374#1:561,3\n363#1:559,2\n390#1:564\n390#1:565,3\n391#1:568\n391#1:569,2\n397#1:571\n397#1:572,2\n479#1:574,2\n*E\n"})
public final class KWebView extends WebView {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Map<String, String> f48323k = MapsKt.emptyMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final WebBridge bridge;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean closed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public volatile boolean destroying;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public volatile boolean destroyed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public volatile boolean renderProcessGone;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final WritePageChecker whitePageMonitor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public BridgeWebChromeClient bridgeWebChromeClient;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean hasPreparedInitialPageTracking;

    /* JADX INFO: renamed from: com.kubi.sdk.web.KWebView$a */
    /* JADX INFO: compiled from: KWebView.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J0\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u000e\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\b0\bH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\r2\u000e\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0011\u001a\u00020\n2\u000e\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u000e\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\u00100\u0010H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/web/KWebView$a;", "Landroid/view/ActionMode$Callback;", "delegate", "<init>", "(Landroid/view/ActionMode$Callback;)V", "Landroid/view/ActionMode;", "kotlin.jvm.PlatformType", "p0", "Landroid/view/MenuItem;", "p1", "", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "Landroid/view/Menu;", "onPrepareActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "mode", "menu", "onCreateActionMode", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/view/ActionMode$Callback;", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class ActionModeCallbackC24299a implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ActionMode.Callback delegate;

        public ActionModeCallbackC24299a(@NotNull ActionMode.Callback delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.delegate = delegate;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode p11, MenuItem p12) {
            return this.delegate.onActionItemClicked(p11, p12);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(@NotNull ActionMode mode, @NotNull Menu menu) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(menu, "menu");
            try {
                return this.delegate.onCreateActionMode(mode, menu);
            } catch (Resources.NotFoundException unused) {
                return false;
            }
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode p11) {
            this.delegate.onDestroyActionMode(p11);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode p11, Menu p12) {
            return this.delegate.onPrepareActionMode(p11, p12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KWebView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        WebBridge webBridge = new WebBridge(this);
        this.bridge = webBridge;
        this.closed = new AtomicBoolean(false);
        this.whitePageMonitor = new WritePageChecker(webBridge, WebConfig.f48355a.m58602m());
        m58570j();
        m58569i();
    }

    /* JADX INFO: renamed from: p */
    public final void m58576p() {
        this.destroying = true;
        m58566f();
    }

    /* JADX INFO: renamed from: r */
    public final void m58578r() {
        this.renderProcessGone = true;
        m58576p();
    }

    @Override // android.view.View
    @Nullable
    public ActionMode startActionMode(@Nullable ActionMode.Callback callback) {
        ActionModeCallbackC24299a actionModeCallbackC24299a;
        if (callback != null) {
            try {
                actionModeCallbackC24299a = new ActionModeCallbackC24299a(callback);
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        } else {
            actionModeCallbackC24299a = null;
        }
        return super.startActionMode(actionModeCallbackC24299a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m58555y(KWebView kWebView, String str, String str2, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        kWebView.m58584x(str, str2, function1);
    }

    /* JADX INFO: renamed from: A */
    public final void m58556A(@NotNull InterfaceC24317b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.bridge.m58674v().m58775f(handler);
    }

    /* JADX INFO: renamed from: B */
    public final void m58557B(@NotNull InterfaceC46620b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.bridge.m58675w().m58775f(ViewLoadingListenerHolder.INSTANCE.holder(listener));
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0140 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:20:0x0069, B:43:0x00e5, B:45:0x00f9, B:47:0x0109, B:50:0x015b, B:52:0x0161, B:48:0x0140), top: B:62:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0188  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017b, code lost:
    
        if (r0.m58738n(r2, r12, r6, r4) == r5) goto L54;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0140, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0188, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x01ab, please report this as an issue */
    @Nullable
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m58558C(@NotNull String str, @Nullable Map<String, String> map, @NotNull Continuation<? super Unit> continuation) {
        KWebView$requestUrlWithParams$1 kWebView$requestUrlWithParams$1;
        KWebView kWebView;
        String str2;
        Map<String, String> map2;
        String strM58653W;
        String userAgentString;
        KWebView kWebView2;
        long j11;
        RequestCache.C24310a<WebSsgPrefetch.FetchData> c24310a;
        if (continuation instanceof KWebView$requestUrlWithParams$1) {
            kWebView$requestUrlWithParams$1 = (KWebView$requestUrlWithParams$1) continuation;
            int i11 = kWebView$requestUrlWithParams$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kWebView$requestUrlWithParams$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kWebView$requestUrlWithParams$1 = new KWebView$requestUrlWithParams$1(this, continuation);
            }
        } else {
            kWebView$requestUrlWithParams$1 = new KWebView$requestUrlWithParams$1(this, continuation);
        }
        Object objM58737m = kWebView$requestUrlWithParams$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kWebView$requestUrlWithParams$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                j11 = kWebView$requestUrlWithParams$1.J$0;
                userAgentString = (String) kWebView$requestUrlWithParams$1.L$4;
                strM58653W = (String) kWebView$requestUrlWithParams$1.L$3;
                map2 = (Map) kWebView$requestUrlWithParams$1.L$2;
                str2 = (String) kWebView$requestUrlWithParams$1.L$1;
                kWebView2 = (KWebView) kWebView$requestUrlWithParams$1.L$0;
                try {
                    ResultKt.throwOnFailure(objM58737m);
                    c24310a = (RequestCache.C24310a) objM58737m;
                    kWebView2.bridge.m58635E(strM58653W);
                    C37323b.f82838a.m83893a(strM58653W, System.currentTimeMillis() - j11);
                    if (c24310a != null || c24310a.m58720a().getHtml().length() <= 0) {
                        C24329b.f48558a.m58864d("ssgLoad", "ssg response is null or emppty" + strM58653W);
                        kWebView2.m58575o(str2, map2);
                    } else {
                        C24329b.f48558a.m58864d("ssgLoad", "download ssg successfully " + strM58653W);
                        kWebView2.bridge.m58652V(strM58653W, WebSsgPrefetch.f48451a.m58733h(c24310a));
                        super.loadDataWithBaseURL(strM58653W, c24310a.m58720a().getHtml(), "text/html", "UTF-8", null);
                    }
                    if (c24310a != null && c24310a.getNeedUpdate()) {
                        WebSsgPrefetch webSsgPrefetch = WebSsgPrefetch.f48451a;
                        Context context = kWebView2.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        kWebView$requestUrlWithParams$1.L$0 = kWebView2;
                        kWebView$requestUrlWithParams$1.L$1 = str2;
                        kWebView$requestUrlWithParams$1.L$2 = map2;
                        kWebView$requestUrlWithParams$1.L$3 = null;
                        kWebView$requestUrlWithParams$1.L$4 = null;
                        kWebView$requestUrlWithParams$1.label = 2;
                    }
                } catch (Exception e11) {
                    e = e11;
                    kWebView = kWebView2;
                    if (C24336i.f48570a.m58890a(e)) {
                        C24329b.f48558a.m58863b("ssgLoad", "requestUrl err " + str2 + ": " + e.getMessage(), e);
                    } else {
                        C43846g.m96568c(new WebCoreException(e, "KWebView", false, "requestUrl err " + str2, 4, null), null, 2, null);
                    }
                    kWebView.m58575o(str2, map2);
                }
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Map<String, String> map3 = (Map) kWebView$requestUrlWithParams$1.L$2;
                String str3 = (String) kWebView$requestUrlWithParams$1.L$1;
                kWebView = (KWebView) kWebView$requestUrlWithParams$1.L$0;
                try {
                    ResultKt.throwOnFailure(objM58737m);
                } catch (Exception e12) {
                    e = e12;
                    map2 = map3;
                    str2 = str3;
                    if (C24336i.f48570a.m58890a(e)) {
                        C43846g.m96568c(new WebCoreException(e, "KWebView", false, "requestUrl err " + str2, 4, null), null, 2, null);
                    } else {
                        C24329b.f48558a.m58863b("ssgLoad", "requestUrl err " + str2 + ": " + e.getMessage(), e);
                    }
                    kWebView.m58575o(str2, map2);
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM58737m);
        if (StringsKt.isBlank(str)) {
            C43846g.m96568c(new WebCoreMessage("requestUrl empty", "KWebView", false, 4, null), null, 2, null);
            return Unit.INSTANCE;
        }
        m58585z("requestUrl", str);
        try {
            strM58653W = this.bridge.m58653W(str, map == null ? f48323k : map);
            if (strM58653W == null) {
                return Unit.INSTANCE;
            }
            m58571k();
            userAgentString = getSettings().getUserAgentString();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.bridge.m58634D(strM58653W);
            WebSsgPrefetch webSsgPrefetch2 = WebSsgPrefetch.f48451a;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            kWebView$requestUrlWithParams$1.L$0 = this;
            kWebView$requestUrlWithParams$1.L$1 = str;
            kWebView$requestUrlWithParams$1.L$2 = map;
            kWebView$requestUrlWithParams$1.L$3 = strM58653W;
            kWebView$requestUrlWithParams$1.L$4 = userAgentString;
            kWebView$requestUrlWithParams$1.J$0 = jCurrentTimeMillis;
            kWebView$requestUrlWithParams$1.label = 1;
            objM58737m = webSsgPrefetch2.m58737m(context2, strM58653W, userAgentString, kWebView$requestUrlWithParams$1);
            if (objM58737m != coroutine_suspended) {
                kWebView2 = this;
                str2 = str;
                map2 = map;
                j11 = jCurrentTimeMillis;
                c24310a = (RequestCache.C24310a) objM58737m;
                kWebView2.bridge.m58635E(strM58653W);
                C37323b.f82838a.m83893a(strM58653W, System.currentTimeMillis() - j11);
                if (c24310a != null) {
                    C24329b.f48558a.m58864d("ssgLoad", "ssg response is null or emppty" + strM58653W);
                    kWebView2.m58575o(str2, map2);
                } else {
                    C24329b.f48558a.m58864d("ssgLoad", "ssg response is null or emppty" + strM58653W);
                    kWebView2.m58575o(str2, map2);
                }
                if (c24310a != null) {
                    WebSsgPrefetch webSsgPrefetch3 = WebSsgPrefetch.f48451a;
                    Context context3 = kWebView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "context");
                    kWebView$requestUrlWithParams$1.L$0 = kWebView2;
                    kWebView$requestUrlWithParams$1.L$1 = str2;
                    kWebView$requestUrlWithParams$1.L$2 = map2;
                    kWebView$requestUrlWithParams$1.L$3 = null;
                    kWebView$requestUrlWithParams$1.L$4 = null;
                    kWebView$requestUrlWithParams$1.label = 2;
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Exception e13) {
            e = e13;
            kWebView = this;
            str2 = str;
            map2 = map;
            if (C24336i.f48570a.m58890a(e)) {
                C43846g.m96568c(new WebCoreException(e, "KWebView", false, "requestUrl err " + str2, 4, null), null, 2, null);
            } else {
                C24329b.f48558a.m58863b("ssgLoad", "requestUrl err " + str2 + ": " + e.getMessage(), e);
            }
            kWebView.m58575o(str2, map2);
        }
    }

    /* JADX INFO: renamed from: D */
    public final List<String> m58559D() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HostManager hostManager = HostManager.a;
        linkedHashSet.addAll(hostManager.h());
        linkedHashSet.addAll(hostManager.s());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.removePrefix(StringsKt.trim((CharSequence) it.next()).toString(), (CharSequence) C33978va.f72339h));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.toList(arrayList2);
    }

    /* JADX INFO: renamed from: a */
    public final void m58561a(@NotNull InterfaceC37044c... interceptors) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        for (InterfaceC37044c interfaceC37044c : interceptors) {
            this.bridge.m58673u().add(interfaceC37044c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m58562b(@NotNull InterfaceC24317b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.bridge.m58674v().m58770a(handler);
    }

    /* JADX INFO: renamed from: c */
    public final void m58563c(@NotNull InterfaceC46620b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.bridge.m58675w().m58770a(ViewLoadingListenerHolder.INSTANCE.holder(listener));
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.destroyed) {
            return;
        }
        this.destroying = true;
        C24329b.f48558a.m58864d("closeWebView", "currentUrl:" + this.bridge.getCurrentUrl());
        m58566f();
        this.destroyed = true;
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(@NotNull String script, @Nullable ValueCallback<String> resultCallback) {
        Intrinsics.checkNotNullParameter(script, "script");
        if (m58564d()) {
            super.evaluateJavascript(script, resultCallback);
            return;
        }
        C24329b.f48558a.m58864d("evaluateJavascript", "KWebView evaluateJavascript block~ [" + this.closed.get() + ',' + this.destroying + ',' + this.destroyed + ',' + this.renderProcessGone + ']');
    }

    /* JADX INFO: renamed from: f */
    public final void m58566f() {
        if (this.closed.compareAndSet(false, true)) {
            this.bridge.m58642L();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m58567g(long second) {
        this.bridge.m58667o(second);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: h */
    public final Object m58568h(@NotNull Continuation<? super Unit> continuation) {
        KWebView$enableWritePageChecker$1 kWebView$enableWritePageChecker$1;
        long j11;
        if (continuation instanceof KWebView$enableWritePageChecker$1) {
            kWebView$enableWritePageChecker$1 = (KWebView$enableWritePageChecker$1) continuation;
            int i11 = kWebView$enableWritePageChecker$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kWebView$enableWritePageChecker$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kWebView$enableWritePageChecker$1 = new KWebView$enableWritePageChecker$1(this, continuation);
            }
        } else {
            kWebView$enableWritePageChecker$1 = new KWebView$enableWritePageChecker$1(this, continuation);
        }
        Object obj = kWebView$enableWritePageChecker$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kWebView$enableWritePageChecker$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            WritePageChecker writePageChecker = this.whitePageMonitor;
            String strM58669q = this.bridge.getCurrentUrl();
            Uri uriM58889h = strM58669q != null ? C24335h.f48569a.m58889h(strM58669q) : null;
            kWebView$enableWritePageChecker$1.J$0 = jCurrentTimeMillis;
            kWebView$enableWritePageChecker$1.label = 1;
            if (writePageChecker.m58690a(uriM58889h, kWebView$enableWritePageChecker$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            j11 = jCurrentTimeMillis;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = kWebView$enableWritePageChecker$1.J$0;
            ResultKt.throwOnFailure(obj);
        }
        C44128b.m97266j("KWebView", "checkWhitePage gapsTime:" + (System.currentTimeMillis() - j11));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public final void m58569i() {
        BridgeWebChromeClient bridgeWebChromeClient = new BridgeWebChromeClient(this.bridge);
        this.bridgeWebChromeClient = bridgeWebChromeClient;
        setWebChromeClient(bridgeWebChromeClient);
        setWebViewClient(new BridgeWebViewClient(this.bridge));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: j */
    public final void m58570j() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDatabaseEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setUseWideViewPort(false);
        getSettings().setCacheMode(-1);
        setLayerType(2, null);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        getSettings().setMixedContentMode(1);
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getSettings().setMinimumFontSize(12);
        getSettings().setDefaultTextEncodingName("UTF-8");
        getSettings().setUserAgentString(this.bridge.m58662e0());
        if (C45978c.f103427a.m101431a()) {
            m58580t();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m58571k() {
        try {
            String strM58599j = WebConfig.f48355a.m58599j();
            List<String> listM58559D = m58559D();
            CookieManager injectThemeCookie$lambda$3$lambda$2 = CookieManager.getInstance();
            for (String str : listM58559D) {
                Intrinsics.checkNotNullExpressionValue(injectThemeCookie$lambda$3$lambda$2, "injectThemeCookie$lambda$3$lambda$2");
                m58572l(injectThemeCookie$lambda$3$lambda$2, "https://" + str, m58560E(str), strM58599j);
            }
            injectThemeCookie$lambda$3$lambda$2.flush();
            C44128b.m97266j("KWebView", "injectThemeCookie theme=" + strM58599j + " hosts=" + listM58559D);
        } catch (Exception e11) {
            C43846g.m96568c(new WebCoreException(e11, "KWebView", false, "injectThemeCookie failed", 4, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m58572l(CookieManager cookieManager, String str, String str2, String str3) {
        cookieManager.setCookie(str, "kc_theme=" + str3 + "; Path=/; Domain=" + str2 + "; Max-Age=2592000; Secure");
    }

    /* JADX INFO: renamed from: m */
    public final boolean m58573m() {
        return this.closed.get() || this.destroying || this.destroyed || this.renderProcessGone;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076 A[Catch: Exception -> 0x007d, TryCatch #0 {Exception -> 0x007d, blocks: (B:23:0x006d, B:25:0x0076, B:27:0x007a, B:31:0x0082), top: B:38:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007a A[Catch: Exception -> 0x007d, TryCatch #0 {Exception -> 0x007d, blocks: (B:23:0x006d, B:25:0x0076, B:27:0x007a, B:31:0x0082), top: B:38:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: n */
    public final Object m58574n(@NotNull String str, @Nullable Map<String, String> map, @NotNull Function1<? super Continuation<? super String>, ? extends Object> function1, @NotNull Continuation<? super Boolean> continuation) {
        KWebView$loadTemplate$1 kWebView$loadTemplate$1;
        final String strM58885d;
        Exception exc;
        KWebView kWebView;
        KWebView kWebView2;
        String str2;
        Map<String, String> map2;
        if (continuation instanceof KWebView$loadTemplate$1) {
            kWebView$loadTemplate$1 = (KWebView$loadTemplate$1) continuation;
            int i11 = kWebView$loadTemplate$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kWebView$loadTemplate$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kWebView$loadTemplate$1 = new KWebView$loadTemplate$1(this, continuation);
            }
        } else {
            kWebView$loadTemplate$1 = new KWebView$loadTemplate$1(this, continuation);
        }
        Object objInvoke = kWebView$loadTemplate$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kWebView$loadTemplate$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            strM58885d = C24335h.f48569a.m58885d(str);
            m58585z("loadTemplate", strM58885d);
            try {
                this.bridge.m58675w().m58774e(new Function1<InterfaceC46621c, Unit>() { // from class: com.kubi.sdk.web.KWebView$loadTemplate$2
                    @Override // p852kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC46621c interfaceC46621c) {
                        invoke2(interfaceC46621c);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC46621c on2) {
                        Intrinsics.checkNotNullParameter(on2, "$this$on");
                        on2.mo58794c(strM58885d);
                    }
                });
                kWebView$loadTemplate$1.L$0 = this;
                kWebView$loadTemplate$1.L$1 = map;
                kWebView$loadTemplate$1.L$2 = strM58885d;
                kWebView$loadTemplate$1.label = 1;
                objInvoke = function1.invoke(kWebView$loadTemplate$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                kWebView2 = this;
                str2 = (String) objInvoke;
                if (str2.length() > 0) {
                    WebBridge webBridge = kWebView2.bridge;
                    if (map == null) {
                        map2 = f48323k;
                    } else {
                        map2 = map;
                    }
                    String strM58633C = webBridge.m58633C(strM58885d, map2);
                    kWebView2.m58571k();
                    super.loadDataWithBaseURL(strM58633C, str2, "text/html", "UTF-8", null);
                    return Boxing.boxBoolean(true);
                }
            } catch (Exception e11) {
                exc = e11;
                kWebView = this;
                C44128b.m97263g("KWebView", exc);
                kWebView2 = kWebView;
                kWebView2.m58575o(strM58885d, map);
                return Boxing.boxBoolean(false);
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strM58885d = (String) kWebView$loadTemplate$1.L$2;
            map = (Map) kWebView$loadTemplate$1.L$1;
            kWebView = (KWebView) kWebView$loadTemplate$1.L$0;
            try {
                ResultKt.throwOnFailure(objInvoke);
                kWebView2 = kWebView;
                try {
                    str2 = (String) objInvoke;
                    if (str2.length() > 0) {
                        WebBridge webBridge2 = kWebView2.bridge;
                        if (map == null) {
                            map2 = f48323k;
                        } else {
                            map2 = map;
                        }
                        String strM58633C2 = webBridge2.m58633C(strM58885d, map2);
                        kWebView2.m58571k();
                        super.loadDataWithBaseURL(strM58633C2, str2, "text/html", "UTF-8", null);
                        return Boxing.boxBoolean(true);
                    }
                } catch (Exception e12) {
                    exc = e12;
                    kWebView = kWebView2;
                    C44128b.m97263g("KWebView", exc);
                    kWebView2 = kWebView;
                }
            } catch (Exception e13) {
                exc = e13;
                C44128b.m97263g("KWebView", exc);
                kWebView2 = kWebView;
                kWebView2.m58575o(strM58885d, map);
                return Boxing.boxBoolean(false);
            }
        }
        kWebView2.m58575o(strM58885d, map);
        return Boxing.boxBoolean(false);
    }

    /* JADX INFO: renamed from: o */
    public final void m58575o(@NotNull String url, @Nullable Map<String, String> params) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (StringsKt.isBlank(url)) {
            C43846g.m96568c(new WebCoreMessage("requestUrl empty", "KWebView", false, 4, null), null, 2, null);
            return;
        }
        m58585z("loadUrl", url);
        WebBridge webBridge = this.bridge;
        if (params == null) {
            params = f48323k;
        }
        String strM58632B = webBridge.m58632B(url, params);
        if (strM58632B == null) {
            return;
        }
        m58571k();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (WhiteListManager.f48507a.m58801b(strM58632B)) {
            linkedHashMap.put("x-app-theme", WebConfig.f48355a.m58599j());
        }
        super.loadUrl(strM58632B, linkedHashMap);
    }

    /* JADX INFO: renamed from: q */
    public final void m58577q(long initStartElapsedMs, long viewCreateTimeMs, boolean warmupHit, boolean firstWebViewWarmup) {
        this.bridge.m58637G(initStartElapsedMs, viewCreateTimeMs, warmupHit, firstWebViewWarmup);
    }

    /* JADX INFO: renamed from: s */
    public final void m58579s() {
        this.bridge.m58638H();
    }

    public final void setDisableSceneListener(@NotNull InterfaceC46619a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.bridge.m58670r().m58770a(listener);
    }

    public final void setFileChooser(@NotNull InterfaceC37042a chooser) {
        Intrinsics.checkNotNullParameter(chooser, "chooser");
        this.bridge.m58655Y(chooser);
    }

    public final void setFullscreenListener(@NotNull InterfaceC24304b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        BridgeWebChromeClient bridgeWebChromeClient = this.bridgeWebChromeClient;
        if (bridgeWebChromeClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bridgeWebChromeClient");
            bridgeWebChromeClient = null;
        }
        bridgeWebChromeClient.m58617c(listener);
    }

    public final void setWebPermission(@NotNull InterfaceC37043b webPermission) {
        Intrinsics.checkNotNullParameter(webPermission, "webPermission");
        this.bridge.m58658a0(webPermission);
    }

    @Override // android.view.View
    @Nullable
    public ActionMode startActionMode(@Nullable ActionMode.Callback callback, int type) {
        ActionModeCallbackC24299a actionModeCallbackC24299a;
        if (callback != null) {
            try {
                actionModeCallbackC24299a = new ActionModeCallbackC24299a(callback);
            } catch (Exception unused) {
                return null;
            }
        } else {
            actionModeCallbackC24299a = null;
        }
        return super.startActionMode(actionModeCallbackC24299a, type);
    }

    /* JADX INFO: renamed from: t */
    public final void m58580t() {
        this.bridge.m58656Z(true);
    }

    /* JADX INFO: renamed from: u */
    public final void m58581u(@NotNull Function0<Unit> backAction) {
        Intrinsics.checkNotNullParameter(backAction, "backAction");
        this.bridge.m58640J(backAction);
    }

    /* JADX INFO: renamed from: v */
    public final void m58582v(@Nullable String pageType, @Nullable Double dclTime, @Nullable String currentProjectName, @Nullable String currentProjectVersion) {
        this.bridge.m58644N(pageType, dclTime, currentProjectName, currentProjectVersion);
    }

    /* JADX INFO: renamed from: w */
    public final void m58583w() {
        this.bridge.getEventQueue().m58762c();
    }

    /* JADX INFO: renamed from: x */
    public final void m58584x(@NotNull String event, @NotNull String params, @Nullable Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        this.bridge.getEventQueue().mo58657a(new JsEventObj(event, params, null, callback, 4, null));
    }

    /* JADX INFO: renamed from: z */
    public final void m58585z(String source, String url) {
        if (this.hasPreparedInitialPageTracking) {
            return;
        }
        this.hasPreparedInitialPageTracking = true;
        C44128b.m97266j("KWebWarmup", "prepare tracking source=" + source + " url=" + url);
        C24329b.f48558a.m58862a();
        this.bridge.m58660c0();
    }

    /* JADX INFO: renamed from: E */
    public final String m58560E(String str) {
        String strRemovePrefix = StringsKt.removePrefix(StringsKt.trim((CharSequence) str).toString(), (CharSequence) C33978va.f72339h);
        List listSplit$default = StringsKt.split$default((CharSequence) strRemovePrefix, new char[]{'.'}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return strRemovePrefix;
        }
        if (arrayList.size() > 2) {
            strRemovePrefix = CollectionsKt.joinToString$default(CollectionsKt.drop(arrayList, 1), C33978va.f72339h, null, null, 0, null, null, 62, null);
        }
        return '.' + strRemovePrefix;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m58564d() {
        if (m58573m() || !Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()) || !isAttachedToWindow() || getWindowToken() == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m58565e() {
        return !m58573m();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Throwable th2) {
            C43846g.m96568c(new WebCoreException(th2, "KWebView", false, "performLongClick failed url=" + this.bridge.getCurrentUrl(), 4, null), null, 2, null);
            C24329b.f48558a.m58863b("webSelection", "performLongClick failed url=" + this.bridge.getCurrentUrl(), th2);
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KWebView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        WebBridge webBridge = new WebBridge(this);
        this.bridge = webBridge;
        this.closed = new AtomicBoolean(false);
        this.whitePageMonitor = new WritePageChecker(webBridge, WebConfig.f48355a.m58602m());
        m58570j();
        m58569i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        WebBridge webBridge = new WebBridge(this);
        this.bridge = webBridge;
        this.closed = new AtomicBoolean(false);
        this.whitePageMonitor = new WritePageChecker(webBridge, WebConfig.f48355a.m58602m());
        m58570j();
        m58569i();
    }
}
