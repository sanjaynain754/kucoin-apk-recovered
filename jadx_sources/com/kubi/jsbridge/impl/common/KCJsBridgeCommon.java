package com.kubi.jsbridge.impl.common;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import b00.InterfaceC4428k;
import b00.InterfaceC4429l;
import c00.InterfaceC4771r;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5276j;
import com.blankj.utilcode.util.NetworkUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.kubi.advert.api.IAdvertService;
import com.kubi.app.bizcontrol.BizControlService;
import com.kubi.data.ClipboardDataHelper;
import com.kubi.helpcenter.api.local.IHelpCenterService;
import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.mvi.common.MviExKt;
import com.kubi.notice.api.service.INoticeService;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import com.kubi.qrcode.api.service.IQrCodeService;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.applet.IAppletService;
import com.kubi.sdk.applet.KCMiniAppBaseProtocol;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKLineKlineContractConfig;
import com.kubi.sdk.protocol.jsapi.C24054b;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiCommonAppCpsInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiCommonAppInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiCommonOpenScanResult;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27012a;
import com.kubi.utils.C27057k;
import com.kubi.utils.C27099x;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.web.api.IWebService;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36566d;
import f00.C37304a;
import g00.InterfaceC37764p;
import gf.C37885i;
import io.reactivex.functions.BiConsumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294gz.C38057a;
import p402kf.C41016c;
import p481ny.C42899b;
import p694vk.C45590s;
import p799yj.C46510b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: KCJsBridgeCommon.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JH\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00112\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JL\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2(\u0010\u000f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J@\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0017J@\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JL\u0010\u001b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2(\u0010\u000f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JJ\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JH\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JH\u0010 \u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J@\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JH\u0010\"\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J@\u0010$\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J@\u0010%\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JT\u0010&\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2(\u0010\u000f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J@\u0010(\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JH\u0010*\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J@\u0010,\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JH\u0010-\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J@\u0010.\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J@\u0010/\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J@\u00100\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JV\u00101\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\r032\u0006\u00104\u001a\u0002052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JJ\u00106\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u00010\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J@\u00108\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J@\u00109\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JJ\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JJ\u0010=\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010>\u001a\u0004\u0018\u00010\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J@\u0010?\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J@\u0010@\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010A\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JH\u0010B\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010C\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J@\u0010D\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JP\u0010E\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010F\u001a\u00020\r2\u0006\u0010E\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/common/KCJsBridgeCommon;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiCommonModule;", "<init>", "()V", "refreshSessionLock", "Ljava/util/concurrent/atomic/AtomicBoolean;", "canIUse", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "apiName", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "close", "animated", "getAllBizControlConfig", "", "", "getAppInfo", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiCommonAppInfo;", "getAppVersion", "getLegalPriceRate", "getFingerToken", "event", "getContract", "symbol", "getFormatSymbol", "getPasteBoardContent", "copyToClipboard", "content", "clearClipboardContent", "isClipboardReadAccessOpen", "openFlutterDialog", "route", "openScan", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiCommonOpenScanResult;", "queryBizControlConfig", "uiSpmId", "refreshAppSession", "showToast", "openAppNotificationSettings", "getAppNotificationPermissionEnabled", "showAppUpgradeAlert", "showBottomSheetDialog", "datas", "", "selectedIndex", "", "openSupportTicketPage", "formId", "refreshAppUserInfo", "reload", "sharePageView", "reactContext", "qrCodeUrl", "showAddHomePageDialog", "shortcutId", "vibrate", "syncCpsFromApp", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiCommonAppCpsInfo;", "playVideo", "url", "isUtaTrading", "forwardUrl", "srcUrl", "Companion", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJsBridgeCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJsBridgeCommon.kt\ncom/kubi/jsbridge/impl/common/KCJsBridgeCommon\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,722:1\n1573#2:723\n1604#2,4:724\n*S KotlinDebug\n*F\n+ 1 KCJsBridgeCommon.kt\ncom/kubi/jsbridge/impl/common/KCJsBridgeCommon\n*L\n542#1:723\n542#1:724,4\n*E\n"})
public final class KCJsBridgeCommon implements InterfaceC36566d {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f27403b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AtomicBoolean f27404a = new AtomicBoolean(false);

    /* JADX INFO: compiled from: KCJsBridgeCommon.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\b\u001a\u00020\u0007*\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/common/KCJsBridgeCommon$Companion;", "", "<init>", "()V", "QUERY_BIZ_TEST_MAXTRY_MOCK_VALUE", "", "TAG", "", "map2RnType", "Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: com.kubi.jsbridge.impl.common.KCJsBridgeCommon$Companion$a */
        /* JADX INFO: compiled from: KCJsBridgeCommon.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* synthetic */ class C15232a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NetworkUtils.NetworkType.values().length];
                try {
                    iArr[NetworkUtils.NetworkType.NETWORK_NO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NetworkUtils.NetworkType.NETWORK_UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[NetworkUtils.NetworkType.NETWORK_WIFI.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final String m31694a(NetworkUtils.NetworkType networkType) {
            int i11 = C15232a.$EnumSwitchMapping$0[networkType.ordinal()];
            if (i11 == 1 || i11 == 2) {
                return "NONE";
            }
            return i11 != 3 ? "CELLULAR" : "WIFI";
        }
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m31651V(Function2 function2, KCFlutterBridgeKLineKlineContractConfig kCFlutterBridgeKLineKlineContractConfig, ProtocolException protocolException) {
        if (protocolException != null) {
            function2.invoke(null, protocolException);
        } else {
            function2.invoke(C27099x.m66919i(kCFlutterBridgeKLineKlineContractConfig, false, 2, null), null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m31655Z(Function2 function2, Map map) {
        function2.invoke(map, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m31656a0(Function2 function2, Map map) {
        function2.invoke(map, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m31652W(String str, Function2 function2, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new KCJsBridgeCommon$getFingerToken$1$1(str, function2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static final void m31654Y(Context context, String str, final Function2 function2) {
        KCFlutterRouteManager.f46704a.m56850k(context, str, new Function1() { // from class: com.kubi.jsbridge.impl.common.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCJsBridgeCommon.m31655Z(function2, (Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m31657b0(Function2 function2, String str) {
        if (str == null) {
            str = "";
        }
        function2.invoke(new KCJSApiCommonOpenScanResult(true, str, ""), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static final Unit m31660e0(List list, Function2 function2, FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(it), null, null, new KCJsBridgeCommon$showBottomSheetDialog$1$1(list, it, function2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m31661f0(Function2 function2) {
        function2.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, new IllegalStateException("context is not FragmentActivity."), null, false, 12, null));
        return Unit.INSTANCE;
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: A */
    public void mo31662A(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(IUnifyAccountService.f53155a.get().mo64979C()), null);
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: B */
    public void mo31663B(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, boolean z11, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (Intrinsics.areEqual(source, "h5")) {
            try {
                ((InterfaceC4771r) Router.f46192a.m56192n(InterfaceC4771r.class)).exit(ctx, obj, z11, new Function2() { // from class: com.kubi.jsbridge.impl.common.h
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return KCJsBridgeCommon.m31649T(callback, (Boolean) obj2, (ProtocolException) obj3);
                    }
                });
                return;
            } catch (Exception e11) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException("close 没有找到对应实现, " + e11), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(source, KCTurboFileModuleImpl.SOURCE_RN)) {
            Activity currentActivity = ctx instanceof ReactApplicationContext ? ((ReactApplicationContext) ctx).getCurrentActivity() : null;
            if (currentActivity instanceof KCMiniAppBaseProtocol) {
                ((KCMiniAppBaseProtocol) currentActivity).exit(currentActivity, obj, z11, new Function2() { // from class: com.kubi.jsbridge.impl.common.i
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return KCJsBridgeCommon.m31650U(callback, (Boolean) obj2, (ProtocolException) obj3);
                    }
                });
            } else {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException("close 没有找到对应实现, currentActivity is not KCMiniAppBaseProtocol"), null, false, 12, null));
            }
        }
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: C */
    public void mo31664C(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String apiName, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(apiName, "apiName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        List<String> list = C24054b.m57900a().get(apiName);
        boolean z11 = false;
        if (list != null && list.contains(source)) {
            z11 = true;
        }
        callback.invoke(Boolean.valueOf(z11), null);
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: D */
    public void mo31665D(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Object systemService = ctx.getSystemService("vibrator");
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: E */
    public void mo31666E(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            IUserService.z(IUserService.a.get(), (Function0) null, 1, (Object) null);
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("刷新失败"), null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: F */
    public void mo31667F(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(ClipboardDataHelper.m23650a()), null);
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: a */
    public void mo31668a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super KCJSApiCommonAppCpsInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IAdvertService iAdvertService = IAdvertService.f15070a.get();
        KCJSApiCommonAppCpsInfo kCJSApiCommonAppCpsInfo = new KCJSApiCommonAppCpsInfo(iAdvertService.getAppInstanceId(), iAdvertService.mo14760b(), iAdvertService.mo14762d(), iAdvertService.mo14761c(), iAdvertService.mo14759a());
        C44128b.m97266j("syncCpsFromApp", "jsapi res = " + kCJSApiCommonAppCpsInfo);
        callback.invoke(kCJSApiCommonAppCpsInfo, null);
    }

    @Override // d00.InterfaceC36566d
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: b */
    public void mo31669b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super KCJSApiCommonAppInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        HostManager hostManager = HostManager.a;
        boolean zAreEqual = Intrinsics.areEqual(hostManager.y(), "produce");
        String strM89965c = C41016c.m89965c();
        Intrinsics.checkNotNullExpressionValue(strM89965c, "getCurrentCurrency(...)");
        String strM89966d = C41016c.m89966d();
        Intrinsics.checkNotNullExpressionValue(strM89966d, "getCurrentCurrencySymbol(...)");
        String strM66668h = C27041f.m66668h(IUserService.a.get().d0().getFeeLevelUrl());
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        boolean z11 = !dayNightThemeManager.m33187l();
        String strK = hostManager.k();
        C45590s c45590s = C45590s.f102687a;
        String strM100675Z = c45590s.m100675Z();
        String string = MultiLanguageManager.f46811g.getLocale().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        boolean zM33189n = dayNightThemeManager.m33189n();
        String currentSiteType = SiteType.INSTANCE.getCurrentSiteType();
        String modeType = AppMode.Companion.getCurrentMode$default(AppMode.INSTANCE, null, 1, null).getModeType();
        boolean zM102600d = C46510b.m102600d();
        String strM66668h2 = C27041f.m66668h(C5276j.m6247f());
        Companion companion = f27403b;
        NetworkUtils.NetworkType networkTypeM6057e = NetworkUtils.m6057e();
        Intrinsics.checkNotNullExpressionValue(networkTypeM6057e, "getNetworkType(...)");
        String strM31694a = companion.m31694a(networkTypeM6057e);
        String strM100677b0 = c45590s.m100677b0();
        String str = zAreEqual ? "prod" : "dev";
        String strI = hostManager.i();
        boolean z12 = !C37885i.m85574m();
        String anonymousId = SensorsDataAPI.sharedInstance().getAnonymousId();
        Intrinsics.checkNotNullExpressionValue(anonymousId, "getAnonymousId(...)");
        callback.invoke(new KCJSApiCommonAppInfo(strM89965c, strM89966d, string, strM100675Z, strK, strM66668h, z11, zM33189n, currentSiteType, modeType, zM102600d, strM66668h2, strM31694a, strM100677b0, str, strI, z12, anonymousId, hostManager.k()), null);
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: c */
    public void mo31670c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(C41016c.m89968f(), null);
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: d */
    public void mo31671d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull final Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4149d(ctx, symbol, new Function2() { // from class: com.kubi.jsbridge.impl.common.g
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return KCJsBridgeCommon.m31651V(callback, (KCFlutterBridgeKLineKlineContractConfig) obj2, (ProtocolException) obj3);
                }
            });
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException("-9003", new RuntimeException("KCFlutterBridgeKLineCall not found: " + e11.getMessage()), null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: e */
    public void mo31672e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(INoticeService.f36364a.get().mo43132a("notification")), null);
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: f */
    public void mo31673f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CharSequence charSequenceM66749e = C27057k.m66749e();
        String string = charSequenceM66749e != null ? charSequenceM66749e.toString() : null;
        if (string == null || string.length() == 0) {
            callback.invoke(null, new ProtocolException("no clipboard content", null, null, false, 14, null));
        } else {
            callback.invoke(string, null);
        }
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: g */
    public void mo31674g(@NotNull Context reactContext, @Nullable Object obj, @NotNull String source, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (Intrinsics.areEqual(source, "h5")) {
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("sharePageView is not supported for h5"), null, false, 12, null));
        } else {
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("plz use turbo module for rn"), null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: h */
    public void mo31675h(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String srcUrl, @NotNull String forwardUrl, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(srcUrl, "srcUrl");
        Intrinsics.checkNotNullParameter(forwardUrl, "forwardUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!Intrinsics.areEqual(source, KCTurboFileModuleImpl.SOURCE_RN)) {
            callback.invoke(null, new ProtocolException("-9003", null, "method is not supported", false, 10, null));
            return;
        }
        Activity activityM6125h = C5258a.m6125h();
        FragmentActivity fragmentActivity = activityM6125h instanceof FragmentActivity ? (FragmentActivity) activityM6125h : null;
        if (fragmentActivity != null && forwardUrl.length() > 0) {
            IAppletService.f46452a.get().mo15067a(fragmentActivity, forwardUrl);
        }
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: i */
    public void mo31676i(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (Intrinsics.areEqual(source, "h5")) {
            IWebService.f54644a.get().showAddHomePageDialog(ctx, obj, str, callback);
        } else if (Intrinsics.areEqual(source, KCTurboFileModuleImpl.SOURCE_RN)) {
            IReactNativeService.INSTANCE.get().showAddHomePageDialog(ctx, obj, str, callback);
        }
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: j */
    public void mo31677j(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C27057k.m66745a();
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: k */
    public void mo31678k(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(C45590s.f102687a.m100675Z(), null);
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: l */
    public void mo31679l(@NotNull final Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String route, @NotNull final Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Long longOrNull;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String queryParameter = Uri.parse(route).getQueryParameter("knb_jump2Native_delay");
        long jLongValue = (queryParameter == null || (longOrNull = StringsKt.toLongOrNull(queryParameter)) == null) ? 0L : longOrNull.longValue();
        final String str = route + "&dialogRouteStyle=true";
        Activity activityM6125h = ctx instanceof Activity ? (Activity) ctx : null;
        if (activityM6125h != null || (activityM6125h = C5258a.m6125h()) != null) {
            ctx = activityM6125h;
        }
        if (jLongValue > 0) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.kubi.jsbridge.impl.common.k
                @Override // java.lang.Runnable
                public final void run() {
                    KCJsBridgeCommon.m31654Y(ctx, str, callback);
                }
            }, jLongValue);
        } else {
            KCFlutterRouteManager.f46704a.m56850k(ctx, str, new Function1() { // from class: com.kubi.jsbridge.impl.common.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KCJsBridgeCommon.m31656a0(callback, (Map) obj2);
                }
            });
        }
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: m */
    public void mo31680m(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            Activity activityM66494h = C27012a.m66486i().m66494h();
            Intent intent = activityM66494h.getIntent();
            activityM66494h.finish();
            activityM66494h.startActivity(intent);
            activityM66494h.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("刷新失败"), null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: n */
    public void mo31681n(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String uiSpmId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(uiSpmId, "uiSpmId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(C38057a.f85671a.m85928a(uiSpmId, true)), null);
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: o */
    public void mo31682o(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!Intrinsics.areEqual(source, KCTurboFileModuleImpl.SOURCE_RN)) {
            IWebService.f54644a.get().mo36741e(new BiConsumer() { // from class: com.kubi.jsbridge.impl.common.b
                @Override // io.reactivex.functions.BiConsumer
                public final void accept(Object obj2, Object obj3) {
                    KCJsBridgeCommon.m31659d0(callback, (Boolean) obj2, (String) obj3);
                }
            });
        } else if (this.f27404a.compareAndSet(false, true)) {
            IWebService.f54644a.get().mo36741e(new BiConsumer() { // from class: com.kubi.jsbridge.impl.common.m
                @Override // io.reactivex.functions.BiConsumer
                public final void accept(Object obj2, Object obj3) {
                    KCJsBridgeCommon.m31658c0(callback, this, (Boolean) obj2, (String) obj3);
                }
            });
        } else {
            callback.invoke(Boolean.TRUE, null);
        }
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: p */
    public void mo31683p(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String content, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            C27057k.m66746b(content);
            callback.invoke(Boolean.TRUE, null);
        } catch (Exception e11) {
            callback.invoke(Boolean.FALSE, new ProtocolException("-9002", e11, e11.getMessage(), false, 8, null));
        }
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: q */
    public void mo31684q(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCJsBridgeCommon$showAppUpgradeAlert$1(callback, null));
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: r */
    public void mo31685r(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String url, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(InterfaceC37764p.a.m85187h(C37304a.f82764a, url, null, null, null, 14, null)), null);
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: s */
    public void mo31686s(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m103844constructorimpl(C41696j.m91104d(C41713n0.m91126b(), null, null, new KCJsBridgeCommon$openAppNotificationSettings$1$1(callback, null), 3, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: t */
    public void mo31687t(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull List<String> datas, long j11, @NotNull final Function2<? super Long, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(datas, "datas");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(datas, 10));
        int i11 = 0;
        for (Object obj2 : datas) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new SelectEntity(null, (String) obj2, null, null, null, null, null, null, null, false, i11 == ((int) j11), null, 3069, null));
            i11 = i12;
        }
        C42899b.m94074d(new Function1() { // from class: com.kubi.jsbridge.impl.common.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return KCJsBridgeCommon.m31660e0(arrayList, callback, (FragmentActivity) obj3);
            }
        }, new Function0() { // from class: com.kubi.jsbridge.impl.common.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCJsBridgeCommon.m31661f0(callback);
            }
        });
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: u */
    public void mo31688u(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String content, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (content.length() == 0) {
            callback.invoke(Boolean.FALSE, new ProtocolException("-9001", null, "content is empty", false, 10, null));
        } else {
            ToastCompat.m66441G(content, new Object[0]);
            callback.invoke(Boolean.TRUE, null);
        }
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: v */
    public void mo31689v(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable final String str, @NotNull final Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42899b.m94073c(new Function1() { // from class: com.kubi.jsbridge.impl.common.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return KCJsBridgeCommon.m31652W(str, callback, (FragmentActivity) obj2);
            }
        });
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: w */
    public void mo31690w(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Map mapMapOf;
        String string;
        Map mapEmptyMap;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            Map<String, Object> mapM14997d = BizControlService.f15438a.m14997d();
            if (mapM14997d != null) {
                Object obj2 = mapM14997d.get("source");
                if (obj2 == null || (string = obj2.toString()) == null) {
                    string = "";
                }
                Pair pairM90091to = TuplesKt.m90091to("source", string);
                Object obj3 = mapM14997d.get("config");
                Map map = obj3 instanceof Map ? (Map) obj3 : null;
                if (map == null || (mapEmptyMap = MapsKt.toMap(map)) == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                mapMapOf = MapsKt.mapOf(pairM90091to, TuplesKt.m90091to("config", mapEmptyMap));
            } else {
                mapMapOf = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(mapMapOf);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke((Map) objM103844constructorimpl, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("-9002", thM103847exceptionOrNullimpl, thM103847exceptionOrNullimpl.getMessage(), false, 8, null));
        }
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: x */
    public void mo31691x(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull final Function2<? super KCJSApiCommonOpenScanResult, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activityM6125h = C5258a.m6125h();
        BaseActivity baseActivity = activityM6125h instanceof BaseActivity ? (BaseActivity) activityM6125h : null;
        if (baseActivity != null) {
            IQrCodeService.f40829a.get().handleScanCodeResult(baseActivity, new Function1() { // from class: com.kubi.jsbridge.impl.common.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KCJsBridgeCommon.m31657b0(callback, (String) obj2);
                }
            });
        } else {
            callback.invoke(null, null);
        }
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: y */
    public void mo31692y(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            IHelpCenterService iHelpCenterService = IHelpCenterService.f25326a.get();
            if (str == null) {
                str = "";
            }
            iHelpCenterService.mo1472a(str);
            callback.invoke(Boolean.TRUE, null);
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // d00.InterfaceC36566d
    /* JADX INFO: renamed from: z */
    public void mo31693z(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull final Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            ((InterfaceC4429l) Router.f46192a.m56192n(InterfaceC4429l.class)).mo4175f(ctx, symbol, new Function2() { // from class: com.kubi.jsbridge.impl.common.f
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return KCJsBridgeCommon.m31653X(callback, (String) obj2, (ProtocolException) obj3);
                }
            });
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException("-9003", new RuntimeException("KCFlutterBridgeKumexCall not found: " + e11.getMessage()), null, false, 12, null));
        }
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m31649T(Function2 function2, Boolean bool, ProtocolException protocolException) {
        function2.invoke(bool, protocolException);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m31650U(Function2 function2, Boolean bool, ProtocolException protocolException) {
        function2.invoke(bool, protocolException);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m31653X(Function2 function2, String str, ProtocolException protocolException) {
        function2.invoke(str, protocolException);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m31658c0(Function2 function2, KCJsBridgeCommon kCJsBridgeCommon, Boolean bool, String str) {
        ProtocolException protocolException;
        Intrinsics.checkNotNull(str);
        if (str.length() == 0) {
            protocolException = null;
        } else {
            protocolException = new ProtocolException("-9002", null, str, true, 2, null);
        }
        function2.invoke(bool, protocolException);
        kCJsBridgeCommon.f27404a.set(false);
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m31659d0(Function2 function2, Boolean bool, String str) {
        ProtocolException protocolException;
        Intrinsics.checkNotNull(str);
        if (str.length() == 0) {
            protocolException = null;
        } else {
            protocolException = new ProtocolException("-9002", null, str, true, 2, null);
        }
        function2.invoke(bool, protocolException);
    }
}
