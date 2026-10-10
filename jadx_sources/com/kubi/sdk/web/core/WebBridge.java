package com.kubi.sdk.web.core;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import c10.AbstractC4778f;
import c10.C4779g;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.messaging.Constants;
import com.kubi.host.HostManager;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.web.KWebView;
import com.kubi.sdk.web.config.WebConfig;
import com.kubi.sdk.web.helper.C24306b;
import com.kubi.sdk.web.helper.C24309e;
import com.kubi.sdk.web.jsapi.InterfaceC24317b;
import com.kubi.sdk.web.jsapi.InterfaceC24319d;
import com.kubi.sdk.web.jsapi.JsBridgeEvent;
import com.kubi.sdk.web.jsapi.JsEventDispatcher;
import com.kubi.sdk.web.jsapi.JsEventObj;
import com.kubi.sdk.web.jsapi.JsEventQueue;
import com.kubi.sdk.web.listener.dispatch.ListenerDispatcher;
import com.kubi.sdk.web.match.WhiteListManager;
import com.kubi.sdk.web.scene.SceneMatcher;
import com.kubi.sdk.web.scene.SceneType;
import com.kubi.sdk.web.tracker.model.WebPerformanceStageModel;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.sdk.web.util.C24335h;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import e10.InterfaceC37042a;
import e10.InterfaceC37043b;
import e10.InterfaceC37044c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import z00.InterfaceC46619a;
import z00.InterfaceC46621c;

/* JADX INFO: compiled from: WebBridge.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 '2\u00020\u0001:\u0002Ã\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u0012J\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u0012J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\u0012J-\u0010'\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0015¢\u0006\u0004\b'\u0010(J+\u0010+\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060)¢\u0006\u0004\b+\u0010,J+\u0010-\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060)¢\u0006\u0004\b-\u0010,J\u001d\u0010/\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006¢\u0006\u0004\b/\u00100J)\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060)¢\u0006\u0004\b2\u0010,J\u0015\u00105\u001a\u00020\u00152\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b9\u00108J\u0015\u0010:\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b:\u00108J\u0015\u0010;\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b;\u00108J\u001d\u0010>\u001a\u00020\n2\u0006\u00104\u001a\u0002032\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u00020\n2\u0006\u00104\u001a\u0002032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\n2\u0006\u0010=\u001a\u00020B¢\u0006\u0004\bC\u0010DJ7\u0010J\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u00062\b\u0010G\u001a\u0004\u0018\u00010F2\b\u0010H\u001a\u0004\u0018\u00010\u00062\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\u0006¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\n2\u0006\u0010N\u001a\u00020\"¢\u0006\u0004\bO\u0010PJ\r\u0010Q\u001a\u00020\n¢\u0006\u0004\bQ\u0010\u0012J\u001b\u0010T\u001a\u00020\n2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\n0R¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020\n2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\n2\u0006\u0010[\u001a\u00020ZH\u0000¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u0015H\u0016¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0015H\u0000¢\u0006\u0004\b`\u0010_J\r\u0010a\u001a\u00020\n¢\u0006\u0004\ba\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bX\u0010b\u001a\u0004\bc\u0010dR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010v\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010sR\u0016\u0010x\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010TR\u0014\u0010z\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010TR\u0016\u0010}\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010\u007f\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010TR\u0017\u0010\u0080\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010TR\u0017\u0010\u0081\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010TR\u0017\u0010\u0082\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010TR\u0017\u0010\u0083\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010TR\u0017\u0010\u0084\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010TR\u0018\u0010\u0086\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010TR\u0018\u0010\u0088\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010TR\u0018\u0010\u008a\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010|R\u0018\u0010\u008c\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010|R \u0010\u0090\u0001\u001a\u000b \u008d\u0001*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R$\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u00018\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R$\u0010\u009a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0098\u00010\u0091\u00018\u0006¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u0094\u0001\u001a\u0006\b\u0099\u0001\u0010\u0096\u0001R$\u0010\u009c\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u0091\u00018\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0094\u0001\u001a\u0006\b\u0089\u0001\u0010\u0096\u0001R,\u0010£\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b\u008e\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R,\u0010«\u0001\u001a\u0005\u0018\u00010¤\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R$\u0010°\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010¬\u00018\u0006¢\u0006\u0010\n\u0006\b§\u0001\u0010®\u0001\u001a\u0006\b\u0093\u0001\u0010¯\u0001R+\u0010µ\u0001\u001a\u00030±\u00012\b\u0010²\u0001\u001a\u00030±\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bc\u0010³\u0001\u001a\u0006\b¥\u0001\u0010´\u0001R,\u0010¶\u0001\u001a\u0004\u0018\u00010\u00062\t\u0010²\u0001\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b+\u0010\u008f\u0001\u001a\u0005\b\u009e\u0001\u0010MR,\u0010·\u0001\u001a\u0004\u0018\u00010\u00062\t\u0010²\u0001\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b2\u0010\u008f\u0001\u001a\u0005\b\u0087\u0001\u0010MR\u0017\u0010¸\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010|R%\u0010»\u0001\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b;\u0010|\u001a\u0005\b¹\u0001\u0010_\"\u0005\b|\u0010º\u0001R\u001c\u0010¿\u0001\u001a\u00030¼\u00018\u0006¢\u0006\u000f\n\u0005\b\u001e\u0010½\u0001\u001a\u0006\b\u008b\u0001\u0010¾\u0001R\u0015\u0010Â\u0001\u001a\u00030À\u00018F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010Á\u0001¨\u0006Ä\u0001"}, m90084d2 = {"Lcom/kubi/sdk/web/core/WebBridge;", "Lcom/kubi/sdk/web/jsapi/d;", "Lcom/kubi/sdk/web/KWebView;", "webView", "<init>", "(Lcom/kubi/sdk/web/KWebView;)V", "", "requestUrl", "Landroid/webkit/WebResourceResponse;", "errorResponse", "", "m", "(Ljava/lang/String;Landroid/webkit/WebResourceResponse;)V", "Lcom/kubi/sdk/web/core/WebLoadError;", "loadError", ExifInterface.GPS_DIRECTION_TRUE, "(Lcom/kubi/sdk/web/core/WebLoadError;)V", ExifInterface.LATITUDE_SOUTH, "()V", "X", "url", "", "K", "(Ljava/lang/String;)Z", "Lcom/kubi/sdk/web/scene/SceneType;", "d0", "(Ljava/lang/String;)Lcom/kubi/sdk/web/scene/SceneType;", "sceneType", "U", "(Ljava/lang/String;Lcom/kubi/sdk/web/scene/SceneType;)V", "F", "I", "c0", "H", "", "initStartElapsedMs", "viewCreateTimeMs", "warmupHit", "firstWebViewWarmup", "G", "(JJZZ)V", "", ReportDataTable.COLUMN_PARAMS, "B", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", ExifInterface.LONGITUDE_WEST, "loadType", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/lang/String;Ljava/lang/String;)V", "baseUrl", "C", "Landroid/webkit/WebResourceRequest;", "request", "b0", "(Landroid/webkit/WebResourceRequest;)Z", "O", "(Ljava/lang/String;)V", "M", "D", ExifInterface.LONGITUDE_EAST, "Landroid/webkit/WebResourceError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "P", "(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "Q", "(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "Landroid/net/http/SslError;", "R", "(Landroid/net/http/SslError;)V", "pageType", "", "dclTime", "currentProjectName", "currentProjectVersion", "N", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "e0", "()Ljava/lang/String;", "second", "o", "(J)V", CmcdData.Factory.STREAM_TYPE_LIVE, "Lkotlin/Function0;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "J", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/kubi/sdk/web/jsapi/JsEventObj;", "eventObj", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/sdk/web/jsapi/JsEventObj;)V", "Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;", "event", "n", "(Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;)V", "isClosed", "()Z", "k", "L", "Lcom/kubi/sdk/web/KWebView;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lcom/kubi/sdk/web/KWebView;", "Lc10/g;", "b", "Lc10/g;", "sceneFactory", "Lcom/kubi/sdk/web/scene/SceneMatcher;", "c", "Lcom/kubi/sdk/web/scene/SceneMatcher;", "sceneMatcher", "Lcom/kubi/sdk/web/helper/b;", "d", "Lcom/kubi/sdk/web/helper/b;", "timeoutWatcher", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLoading", "f", "closed", "g", TUIConstantDefine.CREATE_TIME, CmcdData.Factory.STREAMING_FORMAT_HLS, "loadingTime", "i", "Z", "subscribedGlobalEvents", "j", "performanceInitStartElapsedMs", "performanceLoadUrlElapsedMs", "performanceFirstRequestElapsedMs", "performanceFirstResponseElapsedMs", "performanceViewCreateTimeMs", "performanceViewInitTimeMs", "p", "performanceCoreInitTimeMs", "q", "performanceFirstReqTimeMs", "r", "performanceWarmupHit", CmcdData.Factory.STREAMING_FORMAT_SS, "performanceFirstWebViewWarmup", "kotlin.jvm.PlatformType", "t", "Ljava/lang/String;", "originalUA", "Lcom/kubi/sdk/web/listener/dispatch/ListenerDispatcher;", "Lz00/c;", "u", "Lcom/kubi/sdk/web/listener/dispatch/ListenerDispatcher;", "w", "()Lcom/kubi/sdk/web/listener/dispatch/ListenerDispatcher;", "listenerDispatcher", "Lcom/kubi/sdk/web/jsapi/b;", "v", "jsEventDispatcher", "Lz00/a;", "disableListener", "Le10/a;", "x", "Le10/a;", "()Le10/a;", "Y", "(Le10/a;)V", "fileChooser", "Le10/b;", "y", "Le10/b;", "z", "()Le10/b;", "a0", "(Le10/b;)V", "webPermission", "", "Le10/c;", "Ljava/util/List;", "()Ljava/util/List;", "interceptors", "Lc10/f;", "<set-?>", "Lc10/f;", "()Lc10/f;", DropFrameTable.COLUMN_SCENE, "originalUrl", "currentUrl", "pageMountHandled", "getOffDisableScene", "(Z)V", "offDisableScene", "Lcom/kubi/sdk/web/jsapi/JsEventQueue;", "Lcom/kubi/sdk/web/jsapi/JsEventQueue;", "()Lcom/kubi/sdk/web/jsapi/JsEventQueue;", "eventQueue", "Landroid/content/Context;", "()Landroid/content/Context;", "context", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebBridge.kt\ncom/kubi/sdk/web/core/WebBridge\n+ 2 WebBridge.kt\ncom/kubi/sdk/web/core/WebBridge$Companion\n+ 3 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 4 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,680:1\n63#2:681\n63#2:682\n65#2:683\n65#2:684\n65#2:689\n63#2:690\n65#2:699\n65#2:700\n63#2:701\n65#2:702\n65#2:707\n71#3,4:685\n71#3,4:691\n71#3,4:695\n71#3,4:703\n86#4,3:708\n86#4,3:711\n*S KotlinDebug\n*F\n+ 1 WebBridge.kt\ncom/kubi/sdk/web/core/WebBridge\n*L\n223#1:681\n249#1:682\n261#1:683\n293#1:684\n355#1:689\n362#1:690\n471#1:699\n475#1:700\n493#1:701\n526#1:702\n576#1:707\n306#1:685,4\n410#1:691,4\n446#1:695,4\n536#1:703,4\n582#1:708,3\n599#1:711,3\n*E\n"})
public final class WebBridge implements InterfaceC24319d {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public AbstractC4778f scene;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public String originalUrl;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public String currentUrl;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean pageMountHandled;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean offDisableScene;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final JsEventQueue eventQueue;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final KWebView webView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C4779g sceneFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final SceneMatcher sceneMatcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C24306b timeoutWatcher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isLoading;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean closed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long createTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final long loadingTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean subscribedGlobalEvents;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public long performanceInitStartElapsedMs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public long performanceLoadUrlElapsedMs;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public long performanceFirstRequestElapsedMs;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public long performanceFirstResponseElapsedMs;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public long performanceViewCreateTimeMs;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public long performanceViewInitTimeMs;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public long performanceCoreInitTimeMs;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public long performanceFirstReqTimeMs;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean performanceWarmupHit;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public boolean performanceFirstWebViewWarmup;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final String originalUA;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final ListenerDispatcher<InterfaceC46621c> listenerDispatcher;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final ListenerDispatcher<InterfaceC24317b> jsEventDispatcher;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final ListenerDispatcher<InterfaceC46619a> disableListener;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public InterfaceC37042a fileChooser;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public InterfaceC37043b webPermission;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC37044c> interceptors;

    /* JADX INFO: renamed from: X */
    public final void m58654X() {
        this.pageMountHandled = false;
    }

    public WebBridge(@NotNull KWebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
        C4779g c4779g = new C4779g(this);
        this.sceneFactory = c4779g;
        this.sceneMatcher = new SceneMatcher();
        this.timeoutWatcher = new C24306b(new Function0<Unit>() { // from class: com.kubi.sdk.web.core.WebBridge$timeoutWatcher$1
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
                this.this$0.m58649S();
            }
        });
        this.isLoading = new AtomicBoolean(false);
        this.closed = new AtomicBoolean(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.createTime = jCurrentTimeMillis;
        this.loadingTime = jCurrentTimeMillis;
        this.performanceInitStartElapsedMs = SystemClock.elapsedRealtime();
        this.originalUA = webView.getSettings().getUserAgentString();
        this.listenerDispatcher = new ListenerDispatcher<>();
        this.jsEventDispatcher = new ListenerDispatcher<>();
        this.disableListener = new ListenerDispatcher<>();
        this.interceptors = new ArrayList();
        this.scene = c4779g.m4850a(SceneType.Default);
        this.eventQueue = new JsEventQueue(this);
        WhiteListManager.f48507a.m58805f();
    }

    @NotNull
    /* JADX INFO: renamed from: A, reason: from getter */
    public final KWebView getWebView() {
        return this.webView;
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public final String m58632B(@NotNull String url, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(params, "params");
        String strG = HostManager.a.g(StringsKt.trim((CharSequence) url).toString());
        if (!m58641K(strG)) {
            C43840a.m96548b("load cancel " + strG, "KWebBridge");
            return null;
        }
        this.originalUrl = strG;
        C44128b.m97266j("KWebLangPath", "load before scene=" + this.scene.mo4838c() + " url=" + strG + " params=" + params);
        final String strMo4844h = this.scene.mo4844h(strG, params);
        C44128b.m97266j("KWebLangPath", "load after scene=" + this.scene.mo4838c() + " changed=" + (Intrinsics.areEqual(strMo4844h, strG) ^ true) + " url=" + strMo4844h);
        m58654X();
        m58636F();
        this.listenerDispatcher.m58774e(new Function1<InterfaceC46621c, Unit>() { // from class: com.kubi.sdk.web.core.WebBridge$load$1
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
                on2.mo58796e(strMo4844h, this.createTime, "load");
            }
        });
        this.currentUrl = strMo4844h;
        C24329b.f48558a.m58864d("loadUrl", "load: " + strMo4844h + " (origin=" + url + ')');
        this.timeoutWatcher.m58696d();
        this.isLoading.set(true);
        return strMo4844h;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final String m58633C(@NotNull String baseUrl, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(params, "params");
        if (!m58641K(Util.ANDROID_ASSET_URL)) {
            return baseUrl;
        }
        String strG = HostManager.a.g(StringsKt.trim((CharSequence) baseUrl).toString());
        this.originalUrl = strG;
        C44128b.m97266j("KWebLangPath", "template before scene=" + this.scene.mo4838c() + " url=" + strG + " params=" + params);
        final String strMo4844h = this.scene.mo4844h(strG, params);
        C44128b.m97266j("KWebLangPath", "template after scene=" + this.scene.mo4838c() + " changed=" + (Intrinsics.areEqual(strMo4844h, strG) ^ true) + " url=" + strMo4844h);
        m58654X();
        m58636F();
        this.listenerDispatcher.m58774e(new Function1<InterfaceC46621c, Unit>() { // from class: com.kubi.sdk.web.core.WebBridge$loadTemplate$1
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
                on2.mo58796e(strMo4844h, this.createTime, "template");
            }
        });
        this.currentUrl = strMo4844h;
        C43840a.m96550d("loadTemplate " + strMo4844h + "(base=" + baseUrl + ')', "KWebBridge");
        return strMo4844h;
    }

    /* JADX INFO: renamed from: D */
    public final void m58634D(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.performanceLoadUrlElapsedMs == 0 || this.performanceFirstRequestElapsedMs != 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.performanceFirstRequestElapsedMs = jElapsedRealtime;
        this.performanceCoreInitTimeMs = jElapsedRealtime - this.performanceLoadUrlElapsedMs;
        m58639I();
    }

    /* JADX INFO: renamed from: E */
    public final void m58635E(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.performanceLoadUrlElapsedMs == 0 || this.performanceFirstResponseElapsedMs != 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.performanceFirstResponseElapsedMs = jElapsedRealtime;
        this.performanceFirstReqTimeMs = jElapsedRealtime - this.performanceLoadUrlElapsedMs;
        m58639I();
    }

    /* JADX INFO: renamed from: G */
    public final void m58637G(long initStartElapsedMs, long viewCreateTimeMs, boolean warmupHit, boolean firstWebViewWarmup) {
        this.performanceInitStartElapsedMs = initStartElapsedMs;
        this.performanceViewCreateTimeMs = RangesKt.coerceAtLeast(viewCreateTimeMs, 0L);
        this.performanceWarmupHit = warmupHit;
        this.performanceFirstWebViewWarmup = firstWebViewWarmup;
        m58639I();
        C44128b.m97266j("KWebWarmup", "performance init warmupHit=" + warmupHit + " firstWebViewWarmup=" + firstWebViewWarmup + " viewCreateTimeMs=" + this.performanceViewCreateTimeMs);
    }

    /* JADX INFO: renamed from: I */
    public final void m58639I() {
        this.listenerDispatcher.m58774e(new Function1<InterfaceC46621c, Unit>() { // from class: com.kubi.sdk.web.core.WebBridge$notifyPerformanceStage$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC46621c interfaceC46621c) {
                invoke2(interfaceC46621c);
                return Unit.INSTANCE;
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC46621c on2) {
                Intrinsics.checkNotNullParameter(on2, "$this$on");
                on2.mo58798g(new WebPerformanceStageModel(this.this$0.performanceViewCreateTimeMs, this.this$0.performanceViewInitTimeMs, this.this$0.performanceCoreInitTimeMs, this.this$0.performanceFirstReqTimeMs, this.this$0.performanceWarmupHit, this.this$0.performanceFirstWebViewWarmup));
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final void m58640J(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!m58663k()) {
            C24329b.f48558a.m58864d("WebBridge", "WebBridge onBack block~ [" + this.closed.get() + ']');
            return;
        }
        C43840a.m96550d("onBackClick", "KWebBridge");
        try {
            JsEventObj jsEventObjBuildBackClick$KWebView_release = JsEventObj.INSTANCE.buildBackClick$KWebView_release(action);
            this.eventQueue.m58762c();
            mo58657a(jsEventObjBuildBackClick$KWebView_release);
        } catch (Exception e11) {
            C43846g.m96568c(new WebCoreException(e11, "KWebBridge", false, "onBackError", 4, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m58642L() {
        if (this.closed.compareAndSet(false, true)) {
            this.timeoutWatcher.m58697f();
            this.listenerDispatcher.m58774e(new Function1<InterfaceC46621c, Unit>() { // from class: com.kubi.sdk.web.core.WebBridge$onClose$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC46621c interfaceC46621c) {
                    invoke2(interfaceC46621c);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC46621c on2) {
                    Intrinsics.checkNotNullParameter(on2, "$this$on");
                    on2.onClose();
                }
            });
            this.listenerDispatcher.m58771b();
            this.jsEventDispatcher.m58771b();
            this.eventQueue.m58761b();
            JsEventDispatcher.f48474a.m58756c(this);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m58643M(@NotNull final String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.isLoading.set(false);
        this.timeoutWatcher.m58697f();
        this.listenerDispatcher.m58774e(new Function1<InterfaceC46621c, Unit>() { // from class: com.kubi.sdk.web.core.WebBridge$onPageFinished$1
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
                on2.mo58799h(url);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final void m58644N(@Nullable final String pageType, @Nullable final Double dclTime, @Nullable final String currentProjectName, @Nullable final String currentProjectVersion) {
        if (!this.pageMountHandled) {
            this.pageMountHandled = true;
            C43840a.m96550d("onPageMount " + this.currentUrl, "KWebBridge");
            this.listenerDispatcher.m58774e(new Function1<InterfaceC46621c, Unit>() { // from class: com.kubi.sdk.web.core.WebBridge$onPageMount$1
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
                    String str = pageType;
                    if (str == null) {
                        str = "other";
                    }
                    String str2 = str;
                    Double d11 = dclTime;
                    double dDoubleValue = d11 != null ? d11.doubleValue() : 0.0d;
                    String str3 = currentProjectName;
                    String str4 = str3 == null ? "unknown" : str3;
                    String str5 = currentProjectVersion;
                    on2.mo58792a(str2, dDoubleValue, str4, str5 == null ? "unknown" : str5);
                }
            });
            return;
        }
        C44128b.m97266j("KWebPageMount", "onPageMount ignored duplicate url=" + this.currentUrl);
        C43840a.m96550d("onPageMount ignored duplicate " + this.currentUrl, "KWebBridge");
    }

    /* JADX INFO: renamed from: O */
    public final void m58645O(@NotNull final String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!m58641K(url)) {
            C43840a.m96548b("onPageStarted failed " + url, "KWebBridge");
            return;
        }
        C43840a.m96550d("onPageStarted  " + url, "KWebBridge");
        if (!Intrinsics.areEqual(this.currentUrl, url)) {
            m58654X();
        }
        this.currentUrl = url;
        this.listenerDispatcher.m58774e(new Function1<InterfaceC46621c, Unit>() { // from class: com.kubi.sdk.web.core.WebBridge$onPageStarted$1
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
                on2.mo58794c(url);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final void m58646P(@NotNull WebResourceRequest request, @NotNull WebResourceError error) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        WebLoadError.Companion companion = WebLoadError.INSTANCE;
        String str = this.currentUrl;
        if (str == null) {
            str = "";
        }
        Uri url = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "request.url");
        m58650T(companion.create$KWebView_release("onReceivedError", str, url, request.isForMainFrame(), error));
    }

    /* JADX INFO: renamed from: Q */
    public final void m58647Q(@NotNull final WebResourceRequest request, @NotNull final WebResourceResponse errorResponse) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        WebLoadError.Companion companion = WebLoadError.INSTANCE;
        String str = this.currentUrl;
        if (str == null) {
            str = "";
        }
        Uri url = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "request.url");
        WebLoadError webLoadErrorCreateHttpError$KWebView_release = companion.createHttpError$KWebView_release("onReceivedHttpError", str, url, errorResponse);
        C27100x0.m66923d(new Function0<Unit>() { // from class: com.kubi.sdk.web.core.WebBridge$onReceivedHttpError$1
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                WebBridge webBridge = this.this$0;
                String string = request.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(string, "request.url.toString()");
                webBridge.m58665m(string, errorResponse);
            }
        });
        m58650T(webLoadErrorCreateHttpError$KWebView_release);
    }

    /* JADX INFO: renamed from: R */
    public final void m58648R(@NotNull SslError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        WebLoadError.Companion companion = WebLoadError.INSTANCE;
        String str = this.currentUrl;
        if (str == null) {
            str = "";
        }
        m58650T(companion.create$KWebView_release("onReceivedSslError", str, error));
    }

    /* JADX INFO: renamed from: S */
    public final void m58649S() {
        C43846g.m96568c(new WebPageLoadException(this.currentUrl + " load timeout[" + this.timeoutWatcher.getTimeoutSecond() + ']'), null, 2, null);
        this.listenerDispatcher.m58774e(new Function1<InterfaceC46621c, Unit>() { // from class: com.kubi.sdk.web.core.WebBridge$onWatchedTimeout$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC46621c interfaceC46621c) {
                invoke2(interfaceC46621c);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC46621c on2) {
                Intrinsics.checkNotNullParameter(on2, "$this$on");
                on2.onTimeout();
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final void m58650T(final WebLoadError loadError) {
        C24329b.m58861c(C24329b.f48558a, "webTerminate", "onWebLoadError:" + loadError, null, 4, null);
        if (loadError.getIsError()) {
            this.timeoutWatcher.m58697f();
        }
        Uri requestUri = loadError.getRequestUri();
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("type", "onweb_load_error");
        String encodedPath = requestUri.getEncodedPath();
        if (encodedPath == null) {
            encodedPath = "";
        }
        Intrinsics.checkNotNullExpressionValue(encodedPath, "uri.encodedPath?:\"\"");
        eventParametersBuilderAcquire.m42393d("path", encodedPath);
        String host = requestUri.getHost();
        String str = host != null ? host : "";
        Intrinsics.checkNotNullExpressionValue(str, "uri.host?:\"\"");
        eventParametersBuilderAcquire.m42393d("host", str);
        String string = requestUri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        eventParametersBuilderAcquire.m42393d("url", string);
        eventParametersBuilderAcquire.m42391b("code", loadError.getErrorCode());
        eventParametersBuilderAcquire.m42393d("error_message", loadError.getCom.tencent.qcloud.tuicore.TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION java.lang.String());
        eventParametersBuilderAcquire.m42393d("category", loadError.getMainErrType());
        TechnologyEvent.m42388d("kucoin_webview", eventParametersBuilderAcquire);
        this.listenerDispatcher.m58774e(new Function1<InterfaceC46621c, Unit>() { // from class: com.kubi.sdk.web.core.WebBridge$onWebLoadError$2
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC46621c interfaceC46621c) {
                invoke2(interfaceC46621c);
                return Unit.INSTANCE;
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC46621c on2) {
                Intrinsics.checkNotNullParameter(on2, "$this$on");
                on2.mo58795d(loadError);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final void m58651U(String url, SceneType sceneType) {
        Uri uriM58889h;
        C24329b.f48558a.m58864d("webScene", "sceneType: " + sceneType.name() + ", url:" + url);
        if (sceneType != SceneType.Disable || (uriM58889h = C24335h.f48569a.m58889h(url)) == null) {
            return;
        }
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("category", "disable_scene");
        String encodedPath = uriM58889h.getEncodedPath();
        if (encodedPath == null) {
            encodedPath = "";
        }
        Intrinsics.checkNotNullExpressionValue(encodedPath, "uri.encodedPath?:\"\"");
        eventParametersBuilderAcquire.m42393d("path", encodedPath);
        String host = uriM58889h.getHost();
        String str = host != null ? host : "";
        Intrinsics.checkNotNullExpressionValue(str, "uri.host?:\"\"");
        eventParametersBuilderAcquire.m42393d("host", str);
        String string = uriM58889h.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        eventParametersBuilderAcquire.m42393d("url", string);
        TechnologyEvent.m42388d("h5_container", eventParametersBuilderAcquire);
    }

    /* JADX INFO: renamed from: V */
    public final void m58652V(@NotNull final String url, @NotNull final String loadType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        if (!Intrinsics.areEqual(this.currentUrl, url)) {
            m58654X();
        }
        this.listenerDispatcher.m58774e(new Function1<InterfaceC46621c, Unit>() { // from class: com.kubi.sdk.web.core.WebBridge$requestFinish$1
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
                on2.mo58796e(url, this.createTime, loadType);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: W */
    public final String m58653W(@NotNull String url, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(params, "params");
        String strG = HostManager.a.g(StringsKt.trim((CharSequence) url).toString());
        if (!m58641K(strG)) {
            C43840a.m96548b("load cancel " + strG, "KWebBridge");
            return null;
        }
        this.originalUrl = strG;
        C44128b.m97266j("KWebLangPath", "request before scene=" + this.scene.mo4838c() + " url=" + strG + " params=" + params);
        final String strMo4844h = this.scene.mo4844h(strG, params);
        C44128b.m97266j("KWebLangPath", "request after scene=" + this.scene.mo4838c() + " changed=" + (Intrinsics.areEqual(strMo4844h, strG) ^ true) + " url=" + strMo4844h);
        m58654X();
        m58636F();
        this.listenerDispatcher.m58774e(new Function1<InterfaceC46621c, Unit>() { // from class: com.kubi.sdk.web.core.WebBridge$requestUrl$1
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
                on2.mo58796e(strMo4844h, this.createTime, "ssg");
            }
        });
        this.currentUrl = strMo4844h;
        this.listenerDispatcher.m58774e(new Function1<InterfaceC46621c, Unit>() { // from class: com.kubi.sdk.web.core.WebBridge$requestUrl$2
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
                on2.mo58794c(strMo4844h);
            }
        });
        C43840a.m96550d("requestUrl " + strMo4844h + "(origin=" + url + ')', "KWebBridge");
        this.isLoading.set(true);
        return strMo4844h;
    }

    /* JADX INFO: renamed from: Y */
    public final void m58655Y(@Nullable InterfaceC37042a interfaceC37042a) {
        this.fileChooser = interfaceC37042a;
    }

    /* JADX INFO: renamed from: Z */
    public final void m58656Z(boolean z11) {
        this.offDisableScene = z11;
    }

    @Override // com.kubi.sdk.web.jsapi.InterfaceC24319d
    /* JADX INFO: renamed from: a */
    public void mo58657a(@NotNull JsEventObj eventObj) {
        Intrinsics.checkNotNullParameter(eventObj, "eventObj");
        if (m58663k()) {
            try {
                this.scene.mo4842e(eventObj);
                return;
            } catch (Exception e11) {
                C43846g.m96568c(new WebCoreException(e11, "KWebBridge", false, "postEvent", 4, null), null, 2, null);
                return;
            }
        }
        C24329b.f48558a.m58864d("WebBridge", "WebBridge postEvent block~ [" + this.closed.get() + ']');
    }

    /* JADX INFO: renamed from: a0 */
    public final void m58658a0(@Nullable InterfaceC37043b interfaceC37043b) {
        this.webPermission = interfaceC37043b;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m58659b0(@NotNull WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.isLoading.get() && request.isRedirect()) {
            Uri url = request.getUrl();
            TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42393d("type", "should_override_url");
            String originalUrl = getOriginalUrl();
            if (originalUrl == null) {
                originalUrl = "";
            }
            eventParametersBuilderAcquire.m42393d(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, originalUrl);
            String encodedPath = url.getEncodedPath();
            if (encodedPath == null) {
                encodedPath = "";
            }
            Intrinsics.checkNotNullExpressionValue(encodedPath, "requestUrl.encodedPath?:\"\"");
            eventParametersBuilderAcquire.m42393d("path", encodedPath);
            String host = url.getHost();
            String str = host != null ? host : "";
            Intrinsics.checkNotNullExpressionValue(str, "requestUrl.host?:\"\"");
            eventParametersBuilderAcquire.m42393d("host", str);
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "requestUrl.toString()");
            eventParametersBuilderAcquire.m42393d("url", string);
            TechnologyEvent.m42388d("kucoin_webview", eventParametersBuilderAcquire);
        }
        String string2 = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "request.url.toString()");
        Context contextM58668p = m58668p();
        Uri url2 = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url2, "request.url");
        if (C24309e.m58710c(contextM58668p, url2)) {
            C24329b.f48558a.m58864d("redirectURL", "shouldOverrideUrlLoading checkScheme " + string2);
            return true;
        }
        List<InterfaceC37044c> list = this.interceptors;
        Uri url3 = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url3, "request.url");
        if (C24309e.m58709b(list, url3)) {
            C24329b.f48558a.m58864d("redirectURL", "shouldOverrideUrlLoading checkInterrupts " + string2);
            return true;
        }
        Uri url4 = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url4, "request.url");
        if (C24309e.m58708a(url4)) {
            C24329b.f48558a.m58864d("redirectURL", "shouldOverrideUrlLoading checkGlobalInterrupt " + string2);
            return true;
        }
        if (!m58641K(string2)) {
            C24329b.f48558a.m58864d("redirectURL", "disable to access " + string2);
            return true;
        }
        if (!this.scene.mo4845i(string2)) {
            C24329b.f48558a.m58864d("redirectURL", "cannot OverrideUrlLoading " + string2);
            return true;
        }
        C24329b.f48558a.m58864d("redirectURL", "shouldOverrideUrlLoading " + string2);
        if (!Intrinsics.areEqual(this.currentUrl, string2)) {
            m58654X();
        }
        this.currentUrl = string2;
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m58660c0() {
        if (this.subscribedGlobalEvents) {
            return;
        }
        this.subscribedGlobalEvents = true;
        JsEventDispatcher.f48474a.m58754a(this);
    }

    /* JADX INFO: renamed from: d0 */
    public final SceneType m58661d0(String url) {
        SceneType sceneTypeM58828a = this.sceneMatcher.m58828a(url);
        if (this.offDisableScene && sceneTypeM58828a == SceneType.Disable) {
            sceneTypeM58828a = SceneType.Default;
        }
        m58651U(url, sceneTypeM58828a);
        if (this.scene.mo4838c() == sceneTypeM58828a) {
            return sceneTypeM58828a;
        }
        AbstractC4778f abstractC4778fM4850a = this.sceneFactory.m4850a(sceneTypeM58828a);
        SceneType sceneTypeMo4838c = this.scene.mo4838c();
        this.scene.mo4843f(sceneTypeM58828a);
        abstractC4778fM4850a.mo4841d(sceneTypeMo4838c);
        this.scene = abstractC4778fM4850a;
        C44128b.m97266j("KWebLangPath", "scene changed url=" + url + ' ' + sceneTypeMo4838c + "->" + sceneTypeM58828a);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(url);
        sb2.append(" changeScene ");
        sb2.append(sceneTypeMo4838c);
        sb2.append("->");
        sb2.append(sceneTypeM58828a);
        C43840a.m96550d(sb2.toString(), "KWebBridge");
        return sceneTypeM58828a;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final String m58662e0() {
        WebConfig webConfig = WebConfig.f48355a;
        if (webConfig.m58590a().length() == 0) {
            return C27041f.m66668h(this.originalUA);
        }
        return this.originalUA + ' ' + webConfig.m58590a();
    }

    @Override // com.kubi.sdk.web.jsapi.InterfaceC24319d
    public boolean isClosed() {
        return this.closed.get() || this.webView.m58573m();
    }

    /* JADX INFO: renamed from: l */
    public final void m58664l() {
        this.timeoutWatcher.m58697f();
    }

    /* JADX INFO: renamed from: n */
    public final void m58666n(@NotNull final JsBridgeEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isClosed()) {
            this.jsEventDispatcher.m58772c(new Function1<InterfaceC24317b, Boolean>() { // from class: com.kubi.sdk.web.core.WebBridge$dispatchJsBridgeEvent$1
                {
                    super(1);
                }

                @Override // p852kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull InterfaceC24317b distribute) {
                    Intrinsics.checkNotNullParameter(distribute, "$this$distribute");
                    return Boolean.valueOf(distribute.mo58765a(event));
                }
            });
            return;
        }
        C24329b.f48558a.m58864d("WebBridge", "WebBridge dispatchJsBridgeEvent block~ [" + this.closed.get() + ']');
    }

    /* JADX INFO: renamed from: o */
    public final void m58667o(long second) {
        this.timeoutWatcher.m58695c(second);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final Context m58668p() {
        Context context = this.webView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "webView.context");
        return context;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final ListenerDispatcher<InterfaceC46619a> m58670r() {
        return this.disableListener;
    }

    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public final JsEventQueue getEventQueue() {
        return this.eventQueue;
    }

    @Nullable
    /* JADX INFO: renamed from: t, reason: from getter */
    public final InterfaceC37042a getFileChooser() {
        return this.fileChooser;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final List<InterfaceC37044c> m58673u() {
        return this.interceptors;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final ListenerDispatcher<InterfaceC24317b> m58674v() {
        return this.jsEventDispatcher;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final ListenerDispatcher<InterfaceC46621c> m58675w() {
        return this.listenerDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: y, reason: from getter */
    public final AbstractC4778f getScene() {
        return this.scene;
    }

    @Nullable
    /* JADX INFO: renamed from: z, reason: from getter */
    public final InterfaceC37043b getWebPermission() {
        return this.webPermission;
    }

    /* JADX INFO: renamed from: F */
    public final void m58636F() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.performanceLoadUrlElapsedMs != 0) {
            this.performanceInitStartElapsedMs = jElapsedRealtime;
            this.performanceViewCreateTimeMs = 0L;
            this.performanceWarmupHit = false;
            this.performanceFirstWebViewWarmup = false;
            C44128b.m97266j("KWebWarmup", "performance reset for reload url=" + this.currentUrl);
        }
        this.performanceLoadUrlElapsedMs = jElapsedRealtime;
        this.performanceFirstRequestElapsedMs = 0L;
        this.performanceFirstResponseElapsedMs = 0L;
        this.performanceCoreInitTimeMs = 0L;
        this.performanceFirstReqTimeMs = 0L;
        this.performanceViewInitTimeMs = jElapsedRealtime - this.performanceInitStartElapsedMs;
        m58639I();
    }

    /* JADX INFO: renamed from: H */
    public final void m58638H() {
        this.createTime = System.currentTimeMillis();
        C44128b.m97266j("KWebWarmup", "consume warmup reset open track time");
    }

    /* JADX INFO: renamed from: K */
    public final boolean m58641K(final String url) {
        if (m58661d0(url) == SceneType.Disable) {
            C43840a.m96548b(url + " is disable", "KWebBridge");
            this.disableListener.m58774e(new Function1<InterfaceC46619a, Unit>() { // from class: com.kubi.sdk.web.core.WebBridge$onChangeUrl$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC46619a interfaceC46619a) {
                    invoke2(interfaceC46619a);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC46619a on2) {
                    Intrinsics.checkNotNullParameter(on2, "$this$on");
                    on2.mo67506a(url);
                }
            });
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m58663k() {
        if (!isClosed() && this.webView.m58565e()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m58665m(String requestUrl, WebResourceResponse errorResponse) {
        if (errorResponse.getResponseHeaders() != null && errorResponse.getStatusCode() == 403) {
            Map<String, String> responseHeaders = errorResponse.getResponseHeaders();
            String str = responseHeaders.get("cf-mitigated");
            String str2 = responseHeaders.get("cf-ray");
            C24329b c24329b = C24329b.f48558a;
            c24329b.m58864d("cfCheck", "cfMitigate: " + str + ", cf-ray:" + str2);
            if (str2 != null && str2.length() != 0) {
                C24329b.m58861c(c24329b, "cfCheck", "current:" + this.currentUrl + ", cf monitor: requestUrl[" + requestUrl + "] , cfRay: " + str2 + ", cfMitigate: " + str, null, 4, null);
                int i11 = 2;
                C43846g.m96568c(new WebShowCFException("current:" + this.currentUrl + ", cf monitor: requestUrl[" + requestUrl + "] , cf-ray: " + str2 + ", cfMitigate: " + str), null, 2, null);
                TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
                TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                eventParametersBuilderAcquire.m42393d("category", "cf_risk_check");
                String currentUrl = getCurrentUrl();
                if (currentUrl == null) {
                    currentUrl = "";
                }
                eventParametersBuilderAcquire.m42393d("url", currentUrl);
                if (str2 == null) {
                    str2 = "";
                }
                eventParametersBuilderAcquire.m42393d("number1", str2);
                if (str == null || str.length() == 0) {
                    i11 = 1;
                }
                eventParametersBuilderAcquire.m42391b("code", i11);
                TechnologyEvent.m42388d("technology_event", eventParametersBuilderAcquire);
            }
        }
    }
}
