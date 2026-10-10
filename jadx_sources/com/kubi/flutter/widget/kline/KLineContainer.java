package com.kubi.flutter.widget.kline;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.MainThread;
import androidx.credentials.provider.CredentialEntry;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.C11352b;
import com.kubi.flutter.proto.kline.OrderItem;
import com.kubi.flutter.widget.R$id;
import com.kubi.flutter.widget.R$layout;
import com.kubi.flutter.widget.kline.p078ui.CustomFlutterView;
import com.kubi.flutter.widget.kline.utils.EventListeners;
import com.kubi.flutter.widget.kline.utils.MethodChannelWrapper;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.flutter.delegate.FlutterAnrStopgapConfig;
import com.kubi.sdk.flutter.delegate.FlutterEngineFactory;
import com.kubi.sdk.flutter.delegate.FlutterEngineShutdownHelper;
import com.kubi.sdk.flutter.delegate.FlutterImpellerConfig;
import com.kubi.sdk.flutter.delegate.FlutterShellArgsHelper;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import io.flutter.FlutterInjector;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.systemchannels.LifecycleChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p499og.C43043a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import x70.InterfaceC46098a;

/* JADX INFO: compiled from: KLineContainer.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 `2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003`abB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\nB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\rJ\u0014\u0010?\u001a\u00020@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010BH\u0007J\u0012\u0010C\u001a\u00020@2\b\b\u0002\u0010D\u001a\u00020\u001aH\u0002J\u0012\u0010E\u001a\u00020@2\b\b\u0002\u0010D\u001a\u00020\u001aH\u0002J\u001a\u0010F\u001a\u00020@2\u0006\u00101\u001a\u0002022\b\b\u0002\u0010D\u001a\u00020\u001aH\u0002J\u0010\u0010G\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020IH\u0016J\b\u0010J\u001a\u00020KH\u0016J\b\u0010L\u001a\u00020@H\u0007J\b\u0010M\u001a\u00020@H\u0007J\u0010\u0010N\u001a\u00020@2\u0006\u0010O\u001a\u00020\u001fH\u0016J\u0010\u0010P\u001a\u00020@2\u0006\u0010Q\u001a\u00020,H\u0016J\u0010\u0010R\u001a\u00020@2\u0006\u0010Q\u001a\u00020,H\u0016J\u0010\u0010S\u001a\u00020@2\u0006\u0010Q\u001a\u00020.H\u0016J\u0010\u0010T\u001a\u00020@2\u0006\u0010Q\u001a\u00020.H\u0016J\u0010\u0010U\u001a\u00020@2\u0006\u0010V\u001a\u00020WH\u0002J\u0010\u0010X\u001a\u00020@2\u0006\u0010Y\u001a\u00020<H\u0016J\u0010\u0010Z\u001a\u00020@2\u0006\u0010[\u001a\u00020\\H\u0016J\u0010\u0010]\u001a\u00020@2\u0006\u0010^\u001a\u00020_H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001a0\u001a0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010&\u001a\u00060'R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020.0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00107\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0004\n\u0002\u00108R\u0010\u00109\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006c"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineContainer;", "Landroid/widget/FrameLayout;", "Lcom/kubi/flutter/widget/kline/IKLineContainer;", "Lcom/kubi/utils/screenshots/ISurfaceScreenshot;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "flutterView", "Lio/flutter/embedding/android/FlutterView;", "loadingView", "Landroid/widget/ImageView;", "failedView", "Landroid/view/View;", "touchSlop", "longPressTimeout", "lastX", "", "lastY", "isHandleTouch", "", "touchDownTime", "", "loadingState", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/kubi/flutter/widget/kline/KLineLoadingState;", "kotlin.jvm.PlatformType", "flutterUiDisplayed", "isDataLoaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mainHandler", "Landroid/os/Handler;", "viewDisplayListener", "Lcom/kubi/flutter/widget/kline/KLineContainer$FlutterViewDisplayListener;", "kLineChannel", "Lcom/kubi/flutter/widget/kline/KLineChannel;", "eventListeners", "Lcom/kubi/flutter/widget/kline/utils/EventListeners;", "Lcom/kubi/flutter/widget/kline/IKLineContainer$EventListener;", "stateListeners", "Lcom/kubi/flutter/widget/kline/IKLineContainer$StateListener;", "lifecycleObserver", "Lcom/kubi/flutter/widget/kline/KLineContainer$Observer;", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "methodChannel", "Lcom/kubi/flutter/widget/kline/utils/MethodChannelWrapper;", BaseActivity.THEME, "", "useFlutterConfig", "Ljava/lang/Boolean;", "curSymbol", "klineType", "lifecycleState", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "loadFlutter", "", "activity", "Landroid/app/Activity;", "executeLoader", "isRetry", "loadFlutterEngine", "loadDartEntrypoint", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "getChannel", "Lcom/kubi/flutter/widget/kline/IKLineChannel;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "updateState", "state", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeListener", "addStateListener", "removeStateListener", "runOnUi", "runnable", "Ljava/lang/Runnable;", "changeLifecycleState", "event", "drawScreenShot", "canvas", "Landroid/graphics/Canvas;", "onJumpOrder", "orderItem", "Lcom/kubi/flutter/proto/kline/OrderItem;", "Companion", "FlutterViewDisplayListener", "Observer", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineContainer.kt\ncom/kubi/flutter/widget/kline/KLineContainer\n+ 2 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n+ 3 EventListeners.kt\ncom/kubi/flutter/widget/kline/utils/EventListeners\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,476:1\n45#2,4:477\n45#2,4:490\n45#2,4:497\n45#2,4:510\n45#2,4:526\n45#2,4:533\n45#2,4:537\n45#2,4:541\n45#2,4:554\n45#2,4:570\n33#3,4:481\n37#3,4:486\n42#3:494\n43#3:496\n33#3,4:501\n37#3,4:506\n42#3:514\n43#3:516\n33#3,4:517\n37#3,4:522\n42#3:530\n43#3:532\n33#3,4:545\n37#3,4:550\n42#3:558\n43#3:560\n33#3,4:561\n37#3,4:566\n42#3:574\n43#3:576\n1869#4:485\n1870#4:495\n1869#4:505\n1870#4:515\n1869#4:521\n1870#4:531\n1869#4:549\n1870#4:559\n1869#4:565\n1870#4:575\n*S KotlinDebug\n*F\n+ 1 KLineContainer.kt\ncom/kubi/flutter/widget/kline/KLineContainer\n*L\n170#1:477,4\n174#1:490,4\n221#1:497,4\n226#1:510,4\n308#1:526,4\n384#1:533,4\n423#1:537,4\n459#1:541,4\n473#1:554,4\n125#1:570,4\n174#1:481,4\n174#1:486,4\n174#1:494\n174#1:496\n226#1:501,4\n226#1:506,4\n226#1:514\n226#1:516\n308#1:517,4\n308#1:522,4\n308#1:530\n308#1:532\n473#1:545,4\n473#1:550,4\n473#1:558\n473#1:560\n125#1:561,4\n125#1:566,4\n125#1:574\n125#1:576\n174#1:485\n174#1:495\n226#1:505\n226#1:515\n308#1:521\n308#1:531\n473#1:549\n473#1:559\n125#1:565\n125#1:575\n*E\n"})
public final class KLineContainer extends FrameLayout implements IKLineContainer, InterfaceC46098a {

    /* JADX INFO: renamed from: B */
    @NotNull
    public static final Companion f22328B = new Companion(null);

    /* JADX INFO: renamed from: C */
    @NotNull
    public static final Lazy<Long> f22329C = LazyKt.lazy(new Function0() { // from class: com.kubi.flutter.widget.kline.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(KLineContainer.m24139z());
        }
    });

    /* JADX INFO: renamed from: A */
    @Nullable
    public LifecycleOwner f22330A;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final FlutterView f22331b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ImageView f22332c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final View f22333d;

    /* JADX INFO: renamed from: e */
    public final int f22334e;

    /* JADX INFO: renamed from: f */
    public final int f22335f;

    /* JADX INFO: renamed from: g */
    public float f22336g;

    /* JADX INFO: renamed from: h */
    public float f22337h;

    /* JADX INFO: renamed from: i */
    public boolean f22338i;

    /* JADX INFO: renamed from: j */
    public long f22339j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final AtomicReference<KLineLoadingState> f22340k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final AtomicReference<Boolean> f22341l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final AtomicBoolean f22342m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final Handler f22343n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final C12750a f22344o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final KLineChannel f22345p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final EventListeners<IKLineContainer.a> f22346q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final EventListeners<IKLineContainer.b> f22347r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final C12751b f22348s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public FlutterEngine f22349t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public MethodChannelWrapper f22350u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public String f22351v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public Boolean f22352w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public String f22353x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public String f22354y;

    /* JADX INFO: renamed from: z */
    @NotNull
    public Lifecycle.Event f22355z;

    /* JADX INFO: compiled from: KLineContainer.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineContainer$Companion;", "", "<init>", "()V", "TAG", "", "mainThreadId", "", "getMainThreadId", "()J", "mainThreadId$delegate", "Lkotlin/Lazy;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final long m24154a() {
            return ((Number) KLineContainer.f22329C.getValue()).longValue();
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.KLineContainer$a */
    /* JADX INFO: compiled from: KLineContainer.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineContainer$FlutterViewDisplayListener;", "Lio/flutter/embedding/engine/renderer/FlutterUiDisplayListener;", "<init>", "(Lcom/kubi/flutter/widget/kline/KLineContainer;)V", "onFlutterUiDisplayed", "", "onFlutterUiNoLongerDisplayed", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKLineContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineContainer.kt\ncom/kubi/flutter/widget/kline/KLineContainer$FlutterViewDisplayListener\n+ 2 EventListeners.kt\ncom/kubi/flutter/widget/kline/utils/EventListeners\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,476:1\n33#2,4:477\n37#2,4:482\n42#2:490\n43#2:492\n1869#3:481\n1870#3:491\n45#4,4:486\n*S KotlinDebug\n*F\n+ 1 KLineContainer.kt\ncom/kubi/flutter/widget/kline/KLineContainer$FlutterViewDisplayListener\n*L\n361#1:477,4\n361#1:482,4\n361#1:490\n361#1:492\n361#1:481\n361#1:491\n361#1:486,4\n*E\n"})
    public final class C12750a implements FlutterUiDisplayListener {
        public C12750a() {
        }

        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
        public void onFlutterUiDisplayed() {
            List list;
            KLineContainer.this.f22341l.set(Boolean.TRUE);
            EventListeners eventListeners = KLineContainer.this.f22346q;
            synchronized (eventListeners.f22493a) {
                list = CollectionsKt.toList(eventListeners.f22493a);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((IKLineContainer.a) it.next()).onFlutterUiDisplayed();
                } catch (Throwable th2) {
                    if (!C42899b.m94075e(th2)) {
                        C43043a.m94532c(th2, "callListener error");
                    }
                }
            }
        }

        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
        public void onFlutterUiNoLongerDisplayed() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.KLineContainer$b */
    /* JADX INFO: compiled from: KLineContainer.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineContainer$Observer;", "Landroidx/lifecycle/LifecycleEventObserver;", TtmlNode.RUBY_CONTAINER, "Lcom/kubi/flutter/widget/kline/IKLineContainer;", "<init>", "(Lcom/kubi/flutter/widget/kline/IKLineContainer;)V", "containerRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12751b implements LifecycleEventObserver {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final WeakReference<IKLineContainer> f22357b;

        public C12751b(@NotNull IKLineContainer container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.f22357b = new WeakReference<>(container);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            IKLineContainer iKLineContainer = this.f22357b.get();
            if (iKLineContainer != null) {
                iKLineContainer.mo24145b(event);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KLineContainer(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: t */
    public static final void m24136t(KLineContainer kLineContainer) {
        m24138y(kLineContainer, false, 1, null);
    }

    /* JADX INFO: renamed from: u */
    public static final void m24137u(KLineContainer kLineContainer) {
        m24138y(kLineContainer, false, 1, null);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.KLineContainer$c */
    /* JADX INFO: compiled from: KLineContainer.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C12752c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[KLineLoadingState.values().length];
            try {
                iArr[KLineLoadingState.LoadFailed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KLineLoadingState.Problem.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KLineLoadingState.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KLineLoadingState.Refresh.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KLineLoadingState.LoadSuccess.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Lifecycle.Event.values().length];
            try {
                iArr2[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Lifecycle.Event.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Lifecycle.Event.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Lifecycle.Event.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KLineContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: E */
    public static final void m24123E(KLineLoadingState kLineLoadingState, KLineContainer kLineContainer) {
        int i11 = C12752c.$EnumSwitchMapping$0[kLineLoadingState.ordinal()];
        if (i11 == 1) {
            ViewExtKt.m66577h(kLineContainer.f22332c);
            if (kLineContainer.f22342m.get()) {
                ViewExtKt.m66577h(kLineContainer.f22333d);
                return;
            } else {
                ViewExtKt.m66594y(kLineContainer.f22333d);
                return;
            }
        }
        if (i11 == 2) {
            ViewExtKt.m66594y(kLineContainer.f22333d);
            ViewExtKt.m66577h(kLineContainer.f22332c);
            return;
        }
        if (i11 == 3) {
            ViewExtKt.m66577h(kLineContainer.f22333d);
            C11352b.m20197a(kLineContainer.f22332c);
            ViewExtKt.m66594y(kLineContainer.f22332c);
            kLineContainer.f22342m.set(false);
            return;
        }
        if (i11 == 4) {
            ViewExtKt.m66577h(kLineContainer.f22333d);
            C11352b.m20197a(kLineContainer.f22332c);
            ViewExtKt.m66594y(kLineContainer.f22332c);
        } else {
            if (i11 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            ViewExtKt.m66577h(kLineContainer.f22333d);
            ViewExtKt.m66577h(kLineContainer.f22332c);
            kLineContainer.f22342m.set(true);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m24130l(KLineContainer kLineContainer) {
        List list;
        KLineLoadingState kLineLoadingState = kLineContainer.f22340k.get();
        int i11 = kLineLoadingState == null ? -1 : C12752c.$EnumSwitchMapping$0[kLineLoadingState.ordinal()];
        if (i11 == 1) {
            EventListeners<IKLineContainer.a> eventListeners = kLineContainer.f22346q;
            synchronized (eventListeners.f22493a) {
                list = CollectionsKt.toList(eventListeners.f22493a);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((IKLineContainer.a) it.next()).onReload();
                } catch (Throwable th2) {
                    if (!C42899b.m94075e(th2)) {
                        C43043a.m94532c(th2, "callListener error");
                    }
                }
            }
        } else if (i11 == 2) {
            kLineContainer.m24150r(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m24134q(FlutterEngine flutterEngine) {
        LifecycleChannel lifecycleChannel;
        if (flutterEngine != null && (lifecycleChannel = flutterEngine.getLifecycleChannel()) != null) {
            lifecycleChannel.appIsDetached();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m24135s(KLineContainer kLineContainer, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        kLineContainer.m24150r(z11);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m24138y(KLineContainer kLineContainer, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        kLineContainer.m24153x(z11);
    }

    @MainThread
    /* JADX INFO: renamed from: A */
    public final void m24140A() {
        FlutterEngine flutterEngine;
        LifecycleChannel lifecycleChannel;
        if (!FlutterAnrStopgapConfig.f46661a.m56794d() || (flutterEngine = this.f22349t) == null || (lifecycleChannel = flutterEngine.getLifecycleChannel()) == null) {
            return;
        }
        lifecycleChannel.appIsPaused();
    }

    @MainThread
    /* JADX INFO: renamed from: B */
    public final void m24141B() {
        FlutterEngine flutterEngine;
        LifecycleChannel lifecycleChannel;
        if (!FlutterAnrStopgapConfig.f46661a.m56794d() || (flutterEngine = this.f22349t) == null || (lifecycleChannel = flutterEngine.getLifecycleChannel()) == null) {
            return;
        }
        lifecycleChannel.appIsResumed();
    }

    /* JADX INFO: renamed from: C */
    public void m24142C(@NotNull IKLineContainer.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f22347r.m24392d(listener);
    }

    @Override // com.kubi.flutter.widget.kline.IKLineContainer
    /* JADX INFO: renamed from: a */
    public void mo24144a(@NotNull OrderItem orderItem) {
        List list;
        Intrinsics.checkNotNullParameter(orderItem, "orderItem");
        EventListeners<IKLineContainer.a> eventListeners = this.f22346q;
        synchronized (eventListeners.f22493a) {
            list = CollectionsKt.toList(eventListeners.f22493a);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((IKLineContainer.a) it.next()).mo24268a(orderItem);
            } catch (Throwable th2) {
                if (!C42899b.m94075e(th2)) {
                    C43043a.m94532c(th2, "callListener error");
                }
            }
        }
    }

    @Override // com.kubi.flutter.widget.kline.IKLineContainer
    /* JADX INFO: renamed from: b */
    public void mo24145b(@NotNull Lifecycle.Event event) {
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f22355z == event) {
            return;
        }
        this.f22355z = event;
        FlutterEngine flutterEngine = this.f22349t;
        if (flutterEngine == null) {
            return;
        }
        int i11 = C12752c.$EnumSwitchMapping$1[event.ordinal()];
        if (i11 == 1) {
            try {
                this.f22331b.attachToFlutterEngine(flutterEngine);
                flutterEngine.getLifecycleChannel().appIsResumed();
                C44128b.m97266j("KLineContainer", "attachToFlutterEngine onStateChanged");
                return;
            } catch (Throwable th2) {
                if (C42899b.m94075e(th2)) {
                    return;
                }
                C43043a.m94532c(th2, "attachToFlutterEngine failed");
                return;
            }
        }
        if (i11 == 2 || i11 == 3) {
            flutterEngine.getLifecycleChannel().appIsInactive();
            return;
        }
        if (i11 == 4) {
            flutterEngine.getLifecycleChannel().appIsPaused();
            return;
        }
        if (i11 != 5) {
            return;
        }
        C44128b.m97266j("KLineContainer", "detachFromFlutterEngine destroy");
        try {
            this.f22346q.m24391c();
            this.f22347r.m24391c();
            this.f22345p.m24115n();
            MethodChannelWrapper methodChannelWrapper = this.f22350u;
            if (methodChannelWrapper != null) {
                methodChannelWrapper.m24388c();
            }
            if (FlutterAnrStopgapConfig.f46661a.m56794d()) {
                final FlutterEngine flutterEngine2 = this.f22349t;
                this.f22350u = null;
                this.f22331b.removeOnFirstFrameRenderedListener(this.f22344o);
                LifecycleOwner lifecycleOwner = this.f22330A;
                if (lifecycleOwner != null && (lifecycle2 = lifecycleOwner.getLifecycle()) != null) {
                    lifecycle2.removeObserver(this.f22348s);
                }
                this.f22330A = null;
                FlutterEngineShutdownHelper.m56806j(FlutterEngineShutdownHelper.f46676a, this.f22331b, flutterEngine2, new Function0() { // from class: com.kubi.flutter.widget.kline.h
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return KLineContainer.m24134q(flutterEngine2);
                    }
                }, null, null, null, 56, null);
                Unit unit = Unit.INSTANCE;
            } else {
                FlutterEngineShutdownHelper.f46676a.m56810e(flutterEngine);
                flutterEngine.getLifecycleChannel().appIsDetached();
                this.f22331b.detachFromFlutterEngine();
                this.f22331b.removeOnFirstFrameRenderedListener(this.f22344o);
                flutterEngine.destroy();
                LifecycleOwner lifecycleOwner2 = this.f22330A;
                if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                    lifecycle.removeObserver(this.f22348s);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            this.f22349t = null;
        } catch (Throwable th3) {
            try {
                if (!C42899b.m94075e(th3)) {
                    C43043a.m94532c(th3, "destroy failed");
                }
                Unit unit3 = Unit.INSTANCE;
            } finally {
                this.f22349t = null;
            }
        }
    }

    @Override // x70.InterfaceC46098a
    /* JADX INFO: renamed from: c */
    public void mo24146c(@NotNull Canvas canvas) {
        FlutterRenderer renderer;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        FlutterEngine flutterEngine = this.f22349t;
        if (flutterEngine == null || (renderer = flutterEngine.getRenderer()) == null || (bitmap = renderer.getBitmap()) == null) {
            return;
        }
        Rect rect = new Rect();
        getLocalVisibleRect(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        try {
            Rect rect2 = new Rect(0, 0, getWidth(), getHeight());
            canvas.save();
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            if (rect.width() < rect2.width() || rect.height() < rect2.height()) {
                int iMax = Math.max(rect.left, 0);
                int iMax2 = Math.max(rect.top, 0);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, iMax, iMax2, rect.width(), rect.height());
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                Rect rect3 = new Rect(0, 0, rect.width(), rect.height());
                canvas.translate(iArr[0] + iMax, (iArr[1] + iMax2) - EdgeToEdgeCompat.f48106a.m58272j());
                canvas.drawBitmap(bitmapCreateBitmap, (Rect) null, rect3, new Paint());
                bitmapCreateBitmap.recycle();
            } else {
                canvas.translate(iArr[0], iArr[1] - EdgeToEdgeCompat.f48106a.m58272j());
                canvas.drawBitmap(bitmap, (Rect) null, rect2, new Paint());
            }
            canvas.restore();
            bitmap.recycle();
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                return;
            }
            C43043a.m94532c(e11, "drawScreenShot");
        }
    }

    @Override // com.kubi.flutter.widget.kline.IKLineContainer
    /* JADX INFO: renamed from: d */
    public void mo24147d(@NotNull final KLineLoadingState state) {
        List list;
        Intrinsics.checkNotNullParameter(state, "state");
        KLineLoadingState kLineLoadingState = this.f22340k.get();
        if (kLineLoadingState == state || kLineLoadingState == KLineLoadingState.Problem) {
            return;
        }
        this.f22340k.set(state);
        EventListeners<IKLineContainer.b> eventListeners = this.f22347r;
        synchronized (eventListeners.f22493a) {
            list = CollectionsKt.toList(eventListeners.f22493a);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((IKLineContainer.b) it.next()).mo24269a(state);
            } catch (Throwable th2) {
                if (!C42899b.m94075e(th2)) {
                    C43043a.m94532c(th2, "callListener error");
                }
            }
        }
        m24143D(new Runnable() { // from class: com.kubi.flutter.widget.kline.k
            @Override // java.lang.Runnable
            public final void run() {
                KLineContainer.m24123E(state, this);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        float rawX = ev2.getRawX();
        float rawY = ev2.getRawY();
        boolean z11 = true;
        if (ev2.getPointerCount() >= 2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            int action = ev2.getAction();
            if (action == 0) {
                this.f22336g = rawX;
                this.f22337h = rawY;
                this.f22339j = System.currentTimeMillis();
            } else if (action == 1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f22338i = false;
            } else if (action == 2) {
                if (!this.f22338i) {
                    if (this.f22339j <= 0 || System.currentTimeMillis() - this.f22339j < this.f22335f) {
                        float fAbs = Math.abs(rawX - this.f22336g);
                        float fAbs2 = Math.abs(rawY - this.f22337h);
                        int i11 = this.f22334e;
                        if (fAbs >= i11 || fAbs2 >= i11) {
                            z11 = fAbs2 <= fAbs;
                            this.f22338i = z11;
                        } else if ((fAbs < 0.1d && fAbs2 < 0.1d) || fAbs2 > fAbs) {
                            z11 = false;
                        }
                    } else {
                        this.f22338i = true;
                    }
                }
                getParent().requestDisallowInterceptTouchEvent(z11);
            } else if (action == 3) {
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f22338i = false;
            }
        }
        return super.dispatchTouchEvent(ev2);
    }

    @Override // com.kubi.flutter.widget.kline.IKLineContainer
    /* JADX INFO: renamed from: e */
    public void mo24148e(@NotNull IKLineContainer.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f22346q.m24390b(listener);
    }

    @Override // com.kubi.flutter.widget.kline.IKLineContainer
    @NotNull
    public IKLineChannel getChannel() {
        return this.f22345p;
    }

    /* JADX INFO: renamed from: p */
    public void m24149p(@NotNull IKLineContainer.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f22347r.m24390b(listener);
    }

    /* JADX INFO: renamed from: v */
    public final void m24151v(FlutterEngine flutterEngine, boolean z11) {
        try {
            C44128b.m97266j("KLineContainer", "GeneratedPluginRegistrant");
            GeneratedPluginRegistrant.registerWith(flutterEngine);
            C44128b.m97266j("KLineContainer", "executeDartEntrypoint");
        } catch (Throwable th2) {
            if (!C42899b.m94075e(th2)) {
                C43043a.m94532c(th2, "DartExecutor failed");
            }
            mo24147d(KLineLoadingState.Problem);
            if (z11) {
                return;
            }
            C44128b.m97261e("KLineContainer", "onFlutterFailed");
            EventListeners<IKLineContainer.a> eventListeners = this.f22346q;
            synchronized (eventListeners.f22493a) {
                Iterator it = CollectionsKt.toList(eventListeners.f22493a).iterator();
                while (it.hasNext()) {
                    try {
                        ((IKLineContainer.a) it.next()).mo24266b(th2.getMessage());
                    } catch (Throwable th3) {
                        if (!C42899b.m94075e(th3)) {
                            C43043a.m94532c(th3, "callListener error");
                        }
                    }
                }
            }
        }
    }

    @MainThread
    /* JADX INFO: renamed from: w */
    public final void m24152w(@Nullable Activity activity) {
        this.f22351v = DayNightThemeManager.f28592a.m33187l() ? "light" : "dark";
        this.f22352w = C12803q.m24372d(activity);
        this.f22353x = C12803q.m24370b(activity);
        this.f22354y = C12803q.m24371c(activity);
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this.f22331b);
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this.f22348s);
        } else {
            lifecycleOwner = null;
        }
        this.f22330A = lifecycleOwner;
        m24135s(this, false, 1, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m24153x(boolean z11) {
        FlutterEngine flutterEngineM56796c = this.f22349t;
        if (flutterEngineM56796c == null) {
            List listMutableListOf = CollectionsKt.mutableListOf("entry=kline", "lang=" + StringsKt.replace$default(MultiLanguageManager.f46811g.getLocalString(), C33820nf.f71144W, "_", false, 4, (Object) null), "theme=" + this.f22351v);
            Boolean bool = this.f22352w;
            if (bool != null) {
                listMutableListOf.add("useFlutterConfig=" + (Intrinsics.areEqual(bool, Boolean.TRUE) ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING));
            }
            if (this.f22353x != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("symbol=");
                String str = this.f22353x;
                Intrinsics.checkNotNull(str);
                sb2.append(str);
                listMutableListOf.add(sb2.toString());
            }
            if (this.f22354y != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("klineType=");
                String str2 = this.f22354y;
                Intrinsics.checkNotNull(str2);
                sb3.append(str2);
                listMutableListOf.add(sb3.toString());
            }
            FlutterEngineFactory flutterEngineFactory = FlutterEngineFactory.f46663a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            flutterEngineM56796c = FlutterEngineFactory.m56796c(flutterEngineFactory, context, null, listMutableListOf, null, 10, null);
            this.f22349t = flutterEngineM56796c;
            C44128b.m97266j("KLineContainer", "flutterEngine create");
            KLineChannel kLineChannel = this.f22345p;
            BinaryMessenger binaryMessenger = flutterEngineM56796c.getDartExecutor().getBinaryMessenger();
            Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
            kLineChannel.m24114m(binaryMessenger);
            BinaryMessenger binaryMessenger2 = flutterEngineM56796c.getDartExecutor().getBinaryMessenger();
            Intrinsics.checkNotNullExpressionValue(binaryMessenger2, "getBinaryMessenger(...)");
            this.f22350u = new MethodChannelWrapper(binaryMessenger2);
        } else {
            Intrinsics.checkNotNull(flutterEngineM56796c);
        }
        m24151v(flutterEngineM56796c, z11);
        if (this.f22355z == Lifecycle.Event.ON_RESUME) {
            this.f22331b.attachToFlutterEngine(flutterEngineM56796c);
            flutterEngineM56796c.getLifecycleChannel().appIsResumed();
            C44128b.m97266j("KLineContainer", "attachToFlutterEngine by loadFlutterEngine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22340k = new AtomicReference<>(KLineLoadingState.Loading);
        this.f22341l = new AtomicReference<>(Boolean.FALSE);
        this.f22342m = new AtomicBoolean(false);
        this.f22343n = new Handler(Looper.getMainLooper());
        C12750a c12750a = new C12750a();
        this.f22344o = c12750a;
        this.f22345p = new KLineChannel();
        this.f22346q = new EventListeners<>();
        this.f22347r = new EventListeners<>();
        this.f22348s = new C12751b(this);
        this.f22351v = "dark";
        this.f22355z = Lifecycle.Event.ON_CREATE;
        LayoutInflater.from(context).inflate(R$layout.kline_container_layout, this);
        View viewFindViewById = findViewById(R$id.avi);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.f22332c = imageView;
        C11352b.m20197a(imageView);
        View viewFindViewById2 = findViewById(R$id.kline_fail_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f22333d = viewFindViewById2;
        CustomFlutterView customFlutterView = new CustomFlutterView(context);
        this.f22331b = customFlutterView;
        addView(customFlutterView, 0, new ViewGroup.LayoutParams(-1, -1));
        customFlutterView.addOnFirstFrameRenderedListener(c12750a);
        this.f22334e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f22335f = ViewConfiguration.getLongPressTimeout();
        C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: com.kubi.flutter.widget.kline.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KLineContainer.m24130l(this.f22455b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: z */
    public static final long m24139z() {
        return Looper.getMainLooper().getThread().getId();
    }

    /* JADX INFO: renamed from: D */
    public final void m24143D(Runnable runnable) {
        if (Thread.currentThread().getId() == f22328B.m24154a()) {
            runnable.run();
        } else {
            this.f22343n.post(runnable);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m24150r(boolean z11) {
        try {
            FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
            Intrinsics.checkNotNullExpressionValue(flutterLoader, "flutterLoader(...)");
            if (flutterLoader.initialized()) {
                m24138y(this, false, 1, null);
                return;
            }
            C44128b.m97266j("KLineContainer", "flutterLoader ensureInitializationCompleteAsync");
            if (FlutterImpellerConfig.f46678a.m56819f()) {
                flutterLoader.ensureInitializationCompleteAsync(getContext(), FlutterShellArgsHelper.f46683a.m56821b(), this.f22343n, new Runnable() { // from class: com.kubi.flutter.widget.kline.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        KLineContainer.m24136t(this.f22452b);
                    }
                });
            } else {
                flutterLoader.ensureInitializationCompleteAsync(getContext(), null, this.f22343n, new Runnable() { // from class: com.kubi.flutter.widget.kline.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        KLineContainer.m24137u(this.f22453b);
                    }
                });
            }
        } catch (Throwable th2) {
            if (!C42899b.m94075e(th2)) {
                C43043a.m94532c(th2, "FlutterInjector failed");
            }
            mo24147d(KLineLoadingState.Problem);
            if (!z11) {
                EventListeners<IKLineContainer.a> eventListeners = this.f22346q;
                synchronized (eventListeners.f22493a) {
                    Iterator it = CollectionsKt.toList(eventListeners.f22493a).iterator();
                    while (it.hasNext()) {
                        try {
                            ((IKLineContainer.a) it.next()).mo24266b(th2.getMessage());
                        } catch (Throwable th3) {
                            if (!C42899b.m94075e(th3)) {
                                C43043a.m94532c(th3, "callListener error");
                            }
                        }
                    }
                }
            }
        }
    }
}
