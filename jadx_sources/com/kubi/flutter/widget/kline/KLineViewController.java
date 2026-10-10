package com.kubi.flutter.widget.kline;

import androidx.annotation.MainThread;
import androidx.camera.view.C1454t;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.flutter.proto.kline.AlertClickType;
import com.kubi.flutter.proto.kline.ChangeToolBarModeEvent;
import com.kubi.flutter.proto.kline.ConfirmAlerEvent;
import com.kubi.flutter.proto.kline.EventMessage;
import com.kubi.flutter.proto.kline.JumpOrderEvent;
import com.kubi.flutter.proto.kline.LoadMoreEvent;
import com.kubi.flutter.proto.kline.MainIndexType;
import com.kubi.flutter.proto.kline.PaintFromType;
import com.kubi.flutter.proto.kline.PaintGuideEvent;
import com.kubi.flutter.proto.kline.Response;
import com.kubi.flutter.proto.kline.SelectPadConfig;
import com.kubi.flutter.proto.kline.SubIndexType;
import com.kubi.flutter.proto.kline.SwitchType;
import com.kubi.flutter.proto.kline.ToastEvent;
import com.kubi.flutter.proto.kline.ToolBarClick;
import com.kubi.flutter.proto.kline.VolumeConfig;
import com.kubi.flutter.widget.kline.utils.KLineRealTimeLog;
import com.kubi.flutter.widget.kline.utils.KLineReport;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p499og.C43043a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KLineViewController.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 d2\u00020\u0001:\u0003defB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ3\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&J\u0014\u0010)\u001a\u00020\u001e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+J\u0014\u0010-\u001a\u00020\u001e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0+J\u000e\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u00020\u001e2\u0006\u0010#\u001a\u000204J\u000e\u00105\u001a\u00020\u001e2\u0006\u0010#\u001a\u000206J\u000e\u00107\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020&J\u000e\u0010:\u001a\u00020\u001e2\u0006\u00109\u001a\u00020&J\u0016\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020 H\u0082@¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020\u001eH\u0002J\b\u0010?\u001a\u00020\u001eH\u0007J\b\u0010@\u001a\u00020\u001eH\u0002J\b\u0010A\u001a\u00020\u001eH\u0007J\b\u0010B\u001a\u00020\u001eH\u0007J\b\u0010C\u001a\u00020\u001eH\u0007J\u0010\u0010D\u001a\u00020\u001e2\u0006\u0010E\u001a\u00020FH\u0002J\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0082@¢\u0006\u0002\u0010KJ\u0016\u0010L\u001a\u00020H2\u0006\u0010M\u001a\u00020NH\u0082@¢\u0006\u0002\u0010OJ\u0016\u0010P\u001a\u00020H2\u0006\u0010Q\u001a\u00020RH\u0082@¢\u0006\u0002\u0010SJ\u0018\u0010T\u001a\u00020H2\b\u0010U\u001a\u0004\u0018\u00010VH\u0082@¢\u0006\u0002\u0010WJ\u0018\u0010X\u001a\u00020H2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0082@¢\u0006\u0002\u0010[J\u0018\u0010\\\u001a\u00020H2\b\u0010]\u001a\u0004\u0018\u00010^H\u0082@¢\u0006\u0002\u0010_J\u0018\u0010`\u001a\u00020H2\b\u0010a\u001a\u0004\u0018\u00010bH\u0082@¢\u0006\u0002\u0010cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006g"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineViewController;", "", "initState", "Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", TtmlNode.RUBY_CONTAINER, "Lcom/kubi/flutter/widget/kline/IKLineContainer;", "interactor", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "<init>", "(Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;Lcom/kubi/flutter/widget/kline/IKLineContainer;Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;)V", "state", "Lcom/kubi/flutter/widget/kline/KLineViewController$RunningState;", AppsFlyerProperties.CHANNEL, "Lcom/kubi/flutter/widget/kline/IKLineChannel;", "controllerScope", "Lkotlinx/coroutines/CoroutineScope;", "dataSessionFactory", "Lcom/kubi/flutter/widget/kline/KLineDataSession$Factory;", "dataSession", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/kubi/flutter/widget/kline/KLineDataSession;", "isInited", "Ljava/util/concurrent/atomic/AtomicBoolean;", "viewState", "Ljava/util/concurrent/atomic/AtomicInteger;", "selectPadConfig", "Lcom/kubi/flutter/proto/kline/SelectPadConfig;", "volumeConfig", "Lcom/kubi/flutter/proto/kline/VolumeConfig;", "changeSymbol", "", "symbol", "", "precisionValue", "", "type", "Lcom/kubi/flutter/widget/kline/KLineType;", "isLine", "", "(Ljava/lang/String;ILcom/kubi/flutter/widget/kline/KLineType;Ljava/lang/Boolean;)V", "changeType", "changeMainTypes", "mainIndexTypes", "", "Lcom/kubi/flutter/proto/kline/MainIndexType;", "changeSubTypes", "subIndexTypes", "Lcom/kubi/flutter/proto/kline/SubIndexType;", "changeToolBar", "toolBarType", "Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;", "initDrawTool", "Lcom/kubi/flutter/proto/kline/PaintFromType;", "deleteAllDraw", "Lcom/kubi/flutter/proto/kline/AlertClickType;", "changeSelectPadConfig", "changeHistoryShow", "isChecked", "changeActiveShow", "openDataPush", "from", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeDataPush", "onInit", "reload", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onDestroy", "onUpdateSetupConfig", "config", "Lcom/kubi/flutter/proto/kline/ChartSetupConfig;", "handleEventMessage", "Lcom/kubi/flutter/proto/kline/Response;", "eventMessage", "Lcom/kubi/flutter/proto/kline/EventMessage;", "(Lcom/kubi/flutter/proto/kline/EventMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLoadMore", "loadMoreEvent", "Lcom/kubi/flutter/proto/kline/LoadMoreEvent;", "(Lcom/kubi/flutter/proto/kline/LoadMoreEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onJump", "jumpEvent", "Lcom/kubi/flutter/proto/kline/JumpOrderEvent;", "(Lcom/kubi/flutter/proto/kline/JumpOrderEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onToolBarMode", "toolBarMode", "Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent;", "(Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onConfirmAlertEvent", "confirmAlert", "Lcom/kubi/flutter/proto/kline/ConfirmAlerEvent;", "(Lcom/kubi/flutter/proto/kline/ConfirmAlerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPaintGuide", "paintGuide", "Lcom/kubi/flutter/proto/kline/PaintGuideEvent;", "(Lcom/kubi/flutter/proto/kline/PaintGuideEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onToastEvent", "toast", "Lcom/kubi/flutter/proto/kline/ToastEvent;", "(Lcom/kubi/flutter/proto/kline/ToastEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "InitParam", "RunningState", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineViewController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$Companion\n+ 4 KLineContract.kt\ncom/kubi/flutter/widget/kline/KLineContractKt\n+ 5 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,627:1\n47#2,4:628\n85#3:632\n85#3:633\n87#3:634\n87#3:635\n85#3:636\n85#3:637\n85#3:638\n85#3:639\n85#3:640\n9#4:641\n45#5,4:642\n*S KotlinDebug\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController\n*L\n97#1:628,4\n229#1:632\n230#1:633\n231#1:634\n232#1:635\n273#1:636\n360#1:637\n361#1:638\n375#1:639\n392#1:640\n432#1:641\n541#1:642,4\n*E\n"})
public final class KLineViewController {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Companion f22394l = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final IKLineContainer f22395a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final IKLineDataInteractor f22396b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final RunningState f22397c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final IKLineChannel f22398d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final InterfaceC41709m0 f22399e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final KLineDataSession.C12753a f22400f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final AtomicReference<KLineDataSession> f22401g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final AtomicBoolean f22402h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AtomicInteger f22403i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public SelectPadConfig f22404j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public VolumeConfig f22405k;

    /* JADX INFO: compiled from: KLineViewController.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0014H\u0002J \u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0013*\u0002H\u00132\u0006\u0010\u0016\u001a\u0002H\u0013H\u0082\b¢\u0006\u0002\u0010\u0017J\"\u0010\u0018\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0013*\u0002H\u00132\b\u0010\u0016\u001a\u0004\u0018\u0001H\u0013H\u0082\b¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineViewController$Companion;", "", "<init>", "()V", "TAG", "", "CHANNEL_SCOPE_NAME", "FROM_INIT", "FROM_ON_SHOW", "FROM_CHANGE_SYMBOL", "FROM_CHANGE_TYPE", "FROM_RELOAD", "VIEW_STATE_NONE", "", "VIEW_STATE_SHOW", "VIEW_STATE_HIDE", "VIEW_STATE_DES", "isNotChanged", "", ExifInterface.GPS_DIRECTION_TRUE, "", "newList", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "isNotChangedWithNull", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final <T> boolean m24235a(List<? extends T> list, List<? extends T> list2) {
            if (list.size() != list2.size()) {
                return false;
            }
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (!Intrinsics.areEqual(list.get(i11), list2.get(i11))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.KLineViewController$a, reason: from toString */
    /* JADX INFO: compiled from: KLineViewController.kt */
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010/\u001a\u000200H\u0000¢\u0006\u0002\b1J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J\t\u00108\u001a\u00020\u000fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u000fHÆ\u0003J\t\u0010=\u001a\u00020\u000fHÆ\u0003J\t\u0010>\u001a\u00020\u000fHÆ\u0003J\t\u0010?\u001a\u00020\u000fHÆ\u0003J¥\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fHÆ\u0001J\u0013\u0010A\u001a\u00020\u000f2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u0005HÖ\u0001J\t\u0010D\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0011\u0010\u0016\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0011\u0010\u0017\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0011\u0010\u0018\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%¨\u0006E"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", "", "symbol", "", "precision", "", "type", "Lcom/kubi/flutter/widget/kline/KLineType;", Constants.BIZ, "mainIndexTypes", "", "Lcom/kubi/flutter/proto/kline/MainIndexType;", "subIndexTypes", "Lcom/kubi/flutter/proto/kline/SubIndexType;", "isLineView", "", "selectPadConfig", "Lcom/kubi/flutter/proto/kline/SelectPadConfig;", "volumeConfig", "Lcom/kubi/flutter/proto/kline/VolumeConfig;", "tradeType", "showHistory", "showActive", "enableHistory", "enableActive", "<init>", "(Ljava/lang/String;ILcom/kubi/flutter/widget/kline/KLineType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/kubi/flutter/proto/kline/SelectPadConfig;Lcom/kubi/flutter/proto/kline/VolumeConfig;Ljava/lang/String;ZZZZ)V", "getSymbol", "()Ljava/lang/String;", "getPrecision", "()I", "getType", "()Lcom/kubi/flutter/widget/kline/KLineType;", "getBiz", "getMainIndexTypes", "()Ljava/util/List;", "getSubIndexTypes", "()Z", "getSelectPadConfig", "()Lcom/kubi/flutter/proto/kline/SelectPadConfig;", "getVolumeConfig", "()Lcom/kubi/flutter/proto/kline/VolumeConfig;", "getTradeType", "getShowHistory", "getShowActive", "getEnableHistory", "getEnableActive", "toInitState", "Lcom/kubi/flutter/widget/kline/KLineViewController$RunningState;", "toInitState$LKLineWidget_googleRelease", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class InitParam {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String symbol;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final int precision;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final KLineType type;

        /* JADX INFO: renamed from: d, reason: from toString */
        @NotNull
        public final String biz;

        /* JADX INFO: renamed from: e, reason: from toString */
        @NotNull
        public final List<MainIndexType> mainIndexTypes;

        /* JADX INFO: renamed from: f, reason: from toString */
        @NotNull
        public final List<SubIndexType> subIndexTypes;

        /* JADX INFO: renamed from: g, reason: from toString */
        public final boolean isLineView;

        /* JADX INFO: renamed from: h, reason: from toString */
        @Nullable
        public final SelectPadConfig selectPadConfig;

        /* JADX INFO: renamed from: i, reason: from toString */
        @Nullable
        public final VolumeConfig volumeConfig;

        /* JADX INFO: renamed from: j, reason: from toString */
        @NotNull
        public final String tradeType;

        /* JADX INFO: renamed from: k, reason: from toString */
        public final boolean showHistory;

        /* JADX INFO: renamed from: l, reason: from toString */
        public final boolean showActive;

        /* JADX INFO: renamed from: m, reason: from toString */
        public final boolean enableHistory;

        /* JADX INFO: renamed from: n, reason: from toString */
        public final boolean enableActive;

        /* JADX WARN: Multi-variable type inference failed */
        public InitParam(@NotNull String symbol, int i11, @NotNull KLineType type, @NotNull String biz, @NotNull List<? extends MainIndexType> mainIndexTypes, @NotNull List<? extends SubIndexType> subIndexTypes, boolean z11, @Nullable SelectPadConfig selectPadConfig, @Nullable VolumeConfig volumeConfig, @NotNull String tradeType, boolean z12, boolean z13, boolean z14, boolean z15) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(biz, "biz");
            Intrinsics.checkNotNullParameter(mainIndexTypes, "mainIndexTypes");
            Intrinsics.checkNotNullParameter(subIndexTypes, "subIndexTypes");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            this.symbol = symbol;
            this.precision = i11;
            this.type = type;
            this.biz = biz;
            this.mainIndexTypes = mainIndexTypes;
            this.subIndexTypes = subIndexTypes;
            this.isLineView = z11;
            this.selectPadConfig = selectPadConfig;
            this.volumeConfig = volumeConfig;
            this.tradeType = tradeType;
            this.showHistory = z12;
            this.showActive = z13;
            this.enableHistory = z14;
            this.enableActive = z15;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitParam)) {
                return false;
            }
            InitParam initParam = (InitParam) other;
            return Intrinsics.areEqual(this.symbol, initParam.symbol) && this.precision == initParam.precision && Intrinsics.areEqual(this.type, initParam.type) && Intrinsics.areEqual(this.biz, initParam.biz) && Intrinsics.areEqual(this.mainIndexTypes, initParam.mainIndexTypes) && Intrinsics.areEqual(this.subIndexTypes, initParam.subIndexTypes) && this.isLineView == initParam.isLineView && Intrinsics.areEqual(this.selectPadConfig, initParam.selectPadConfig) && Intrinsics.areEqual(this.volumeConfig, initParam.volumeConfig) && Intrinsics.areEqual(this.tradeType, initParam.tradeType) && this.showHistory == initParam.showHistory && this.showActive == initParam.showActive && this.enableHistory == initParam.enableHistory && this.enableActive == initParam.enableActive;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InitParam m24237a(@NotNull String symbol, int i11, @NotNull KLineType type, @NotNull String biz, @NotNull List<? extends MainIndexType> mainIndexTypes, @NotNull List<? extends SubIndexType> subIndexTypes, boolean z11, @Nullable SelectPadConfig selectPadConfig, @Nullable VolumeConfig volumeConfig, @NotNull String tradeType, boolean z12, boolean z13, boolean z14, boolean z15) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(biz, "biz");
            Intrinsics.checkNotNullParameter(mainIndexTypes, "mainIndexTypes");
            Intrinsics.checkNotNullParameter(subIndexTypes, "subIndexTypes");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            return new InitParam(symbol, i11, type, biz, mainIndexTypes, subIndexTypes, z11, selectPadConfig, volumeConfig, tradeType, z12, z13, z14, z15);
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final SelectPadConfig getSelectPadConfig() {
            return this.selectPadConfig;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getShowActive() {
            return this.showActive;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getShowHistory() {
            return this.showHistory;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final VolumeConfig getVolumeConfig() {
            return this.volumeConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final RunningState m24242g() {
            return new RunningState(this.biz, this.symbol, this.precision, this.type, this.mainIndexTypes, this.subIndexTypes, this.isLineView, this.selectPadConfig, this.volumeConfig, this.tradeType, this.showHistory, this.showActive, this.enableHistory, this.enableActive);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.symbol.hashCode() * 31) + Integer.hashCode(this.precision)) * 31) + this.type.hashCode()) * 31) + this.biz.hashCode()) * 31) + this.mainIndexTypes.hashCode()) * 31) + this.subIndexTypes.hashCode()) * 31) + Boolean.hashCode(this.isLineView)) * 31;
            SelectPadConfig selectPadConfig = this.selectPadConfig;
            int iHashCode2 = (iHashCode + (selectPadConfig == null ? 0 : selectPadConfig.hashCode())) * 31;
            VolumeConfig volumeConfig = this.volumeConfig;
            return ((((((((((iHashCode2 + (volumeConfig != null ? volumeConfig.hashCode() : 0)) * 31) + this.tradeType.hashCode()) * 31) + Boolean.hashCode(this.showHistory)) * 31) + Boolean.hashCode(this.showActive)) * 31) + Boolean.hashCode(this.enableHistory)) * 31) + Boolean.hashCode(this.enableActive);
        }

        @NotNull
        public String toString() {
            return "InitParam(symbol=" + this.symbol + ", precision=" + this.precision + ", type=" + this.type + ", biz=" + this.biz + ", mainIndexTypes=" + this.mainIndexTypes + ", subIndexTypes=" + this.subIndexTypes + ", isLineView=" + this.isLineView + ", selectPadConfig=" + this.selectPadConfig + ", volumeConfig=" + this.volumeConfig + ", tradeType=" + this.tradeType + ", showHistory=" + this.showHistory + ", showActive=" + this.showActive + ", enableHistory=" + this.enableHistory + ", enableActive=" + this.enableActive + ')';
        }

        public /* synthetic */ InitParam(String str, int i11, KLineType kLineType, String str2, List list, List list2, boolean z11, SelectPadConfig selectPadConfig, VolumeConfig volumeConfig, String str3, boolean z12, boolean z13, boolean z14, boolean z15, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11, kLineType, str2, list, list2, (i12 & 64) != 0 ? false : z11, (i12 & 128) != 0 ? null : selectPadConfig, (i12 & 256) != 0 ? null : volumeConfig, (i12 & 512) != 0 ? "" : str3, (i12 & 1024) != 0 ? false : z12, (i12 & 2048) != 0 ? false : z13, (i12 & 4096) != 0 ? false : z14, (i12 & 8192) != 0 ? false : z15);
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.KLineViewController$b, reason: from toString */
    /* JADX INFO: compiled from: KLineViewController.kt */
    @Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010@\u001a\u00020AJ\u0006\u0010B\u001a\u00020CJ\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\bHÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J\t\u0010J\u001a\u00020\u000fHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u000fHÆ\u0003J\t\u0010O\u001a\u00020\u000fHÆ\u0003J\t\u0010P\u001a\u00020\u000fHÆ\u0003J\t\u0010Q\u001a\u00020\u000fHÆ\u0003J¥\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fHÆ\u0001J\u0013\u0010S\u001a\u00020\u000f2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020\u0006HÖ\u0001J\t\u0010V\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001c\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010.\"\u0004\b/\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001cR\u001a\u0010\u0015\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\u001a\u0010\u0016\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010.\"\u0004\b;\u00100R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010.\"\u0004\b=\u00100R\u001a\u0010\u0018\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010.\"\u0004\b?\u00100¨\u0006W"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineViewController$RunningState;", "", Constants.BIZ, "", "symbol", "precision", "", "type", "Lcom/kubi/flutter/widget/kline/KLineType;", "mainIndexTypes", "", "Lcom/kubi/flutter/proto/kline/MainIndexType;", "subIndexTypes", "Lcom/kubi/flutter/proto/kline/SubIndexType;", "isLineView", "", "selectPadConfig", "Lcom/kubi/flutter/proto/kline/SelectPadConfig;", "volumeConfig", "Lcom/kubi/flutter/proto/kline/VolumeConfig;", "tradeType", "showHistory", "showActive", "enableHistory", "enableActive", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/kubi/flutter/widget/kline/KLineType;Ljava/util/List;Ljava/util/List;ZLcom/kubi/flutter/proto/kline/SelectPadConfig;Lcom/kubi/flutter/proto/kline/VolumeConfig;Ljava/lang/String;ZZZZ)V", "getBiz", "()Ljava/lang/String;", "getSymbol", "setSymbol", "(Ljava/lang/String;)V", "getPrecision", "()I", "setPrecision", "(I)V", "getType", "()Lcom/kubi/flutter/widget/kline/KLineType;", "setType", "(Lcom/kubi/flutter/widget/kline/KLineType;)V", "getMainIndexTypes", "()Ljava/util/List;", "setMainIndexTypes", "(Ljava/util/List;)V", "getSubIndexTypes", "setSubIndexTypes", "()Z", "setLineView", "(Z)V", "getSelectPadConfig", "()Lcom/kubi/flutter/proto/kline/SelectPadConfig;", "setSelectPadConfig", "(Lcom/kubi/flutter/proto/kline/SelectPadConfig;)V", "getVolumeConfig", "()Lcom/kubi/flutter/proto/kline/VolumeConfig;", "getTradeType", "getShowHistory", "setShowHistory", "getShowActive", "setShowActive", "getEnableHistory", "setEnableHistory", "getEnableActive", "setEnableActive", "toDataParam", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;", "toOrderParam", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RunningState {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String biz;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public String symbol;

        /* JADX INFO: renamed from: c, reason: from toString */
        public int precision;

        /* JADX INFO: renamed from: d, reason: from toString */
        @NotNull
        public KLineType type;

        /* JADX INFO: renamed from: e, reason: from toString */
        @NotNull
        public List<? extends MainIndexType> mainIndexTypes;

        /* JADX INFO: renamed from: f, reason: from toString */
        @NotNull
        public List<? extends SubIndexType> subIndexTypes;

        /* JADX INFO: renamed from: g, reason: from toString */
        public boolean isLineView;

        /* JADX INFO: renamed from: h, reason: from toString */
        @Nullable
        public SelectPadConfig selectPadConfig;

        /* JADX INFO: renamed from: i, reason: from toString */
        @Nullable
        public final VolumeConfig volumeConfig;

        /* JADX INFO: renamed from: j, reason: from toString */
        @NotNull
        public final String tradeType;

        /* JADX INFO: renamed from: k, reason: from toString */
        public boolean showHistory;

        /* JADX INFO: renamed from: l, reason: from toString */
        public boolean showActive;

        /* JADX INFO: renamed from: m, reason: from toString */
        public boolean enableHistory;

        /* JADX INFO: renamed from: n, reason: from toString */
        public boolean enableActive;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RunningState)) {
                return false;
            }
            RunningState runningState = (RunningState) other;
            return Intrinsics.areEqual(this.biz, runningState.biz) && Intrinsics.areEqual(this.symbol, runningState.symbol) && this.precision == runningState.precision && Intrinsics.areEqual(this.type, runningState.type) && Intrinsics.areEqual(this.mainIndexTypes, runningState.mainIndexTypes) && Intrinsics.areEqual(this.subIndexTypes, runningState.subIndexTypes) && this.isLineView == runningState.isLineView && Intrinsics.areEqual(this.selectPadConfig, runningState.selectPadConfig) && Intrinsics.areEqual(this.volumeConfig, runningState.volumeConfig) && Intrinsics.areEqual(this.tradeType, runningState.tradeType) && this.showHistory == runningState.showHistory && this.showActive == runningState.showActive && this.enableHistory == runningState.enableHistory && this.enableActive == runningState.enableActive;
        }

        public RunningState(@NotNull String biz, @NotNull String symbol, int i11, @NotNull KLineType type, @NotNull List<? extends MainIndexType> mainIndexTypes, @NotNull List<? extends SubIndexType> subIndexTypes, boolean z11, @Nullable SelectPadConfig selectPadConfig, @Nullable VolumeConfig volumeConfig, @NotNull String tradeType, boolean z12, boolean z13, boolean z14, boolean z15) {
            Intrinsics.checkNotNullParameter(biz, "biz");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(mainIndexTypes, "mainIndexTypes");
            Intrinsics.checkNotNullParameter(subIndexTypes, "subIndexTypes");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            this.biz = biz;
            this.symbol = symbol;
            this.precision = i11;
            this.type = type;
            this.mainIndexTypes = mainIndexTypes;
            this.subIndexTypes = subIndexTypes;
            this.isLineView = z11;
            this.selectPadConfig = selectPadConfig;
            this.volumeConfig = volumeConfig;
            this.tradeType = tradeType;
            this.showHistory = z12;
            this.showActive = z13;
            this.enableHistory = z14;
            this.enableActive = z15;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBiz() {
            return this.biz;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getEnableActive() {
            return this.enableActive;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getEnableHistory() {
            return this.enableHistory;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final List<MainIndexType> m24246d() {
            return this.mainIndexTypes;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getPrecision() {
            return this.precision;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final SelectPadConfig getSelectPadConfig() {
            return this.selectPadConfig;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getShowActive() {
            return this.showActive;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getShowHistory() {
            return this.showHistory;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.biz.hashCode() * 31) + this.symbol.hashCode()) * 31) + Integer.hashCode(this.precision)) * 31) + this.type.hashCode()) * 31) + this.mainIndexTypes.hashCode()) * 31) + this.subIndexTypes.hashCode()) * 31) + Boolean.hashCode(this.isLineView)) * 31;
            SelectPadConfig selectPadConfig = this.selectPadConfig;
            int iHashCode2 = (iHashCode + (selectPadConfig == null ? 0 : selectPadConfig.hashCode())) * 31;
            VolumeConfig volumeConfig = this.volumeConfig;
            return ((((((((((iHashCode2 + (volumeConfig != null ? volumeConfig.hashCode() : 0)) * 31) + this.tradeType.hashCode()) * 31) + Boolean.hashCode(this.showHistory)) * 31) + Boolean.hashCode(this.showActive)) * 31) + Boolean.hashCode(this.enableHistory)) * 31) + Boolean.hashCode(this.enableActive);
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final List<SubIndexType> m24251i() {
            return this.subIndexTypes;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final KLineType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getIsLineView() {
            return this.isLineView;
        }

        /* JADX INFO: renamed from: m */
        public final void m24255m(boolean z11) {
            this.isLineView = z11;
        }

        /* JADX INFO: renamed from: n */
        public final void m24256n(@NotNull List<? extends MainIndexType> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.mainIndexTypes = list;
        }

        /* JADX INFO: renamed from: o */
        public final void m24257o(int i11) {
            this.precision = i11;
        }

        /* JADX INFO: renamed from: p */
        public final void m24258p(@Nullable SelectPadConfig selectPadConfig) {
            this.selectPadConfig = selectPadConfig;
        }

        /* JADX INFO: renamed from: q */
        public final void m24259q(boolean z11) {
            this.showActive = z11;
        }

        /* JADX INFO: renamed from: r */
        public final void m24260r(boolean z11) {
            this.showHistory = z11;
        }

        /* JADX INFO: renamed from: s */
        public final void m24261s(@NotNull List<? extends SubIndexType> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.subIndexTypes = list;
        }

        /* JADX INFO: renamed from: t */
        public final void m24262t(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.symbol = str;
        }

        @NotNull
        public String toString() {
            return "RunningState(biz=" + this.biz + ", symbol=" + this.symbol + ", precision=" + this.precision + ", type=" + this.type + ", mainIndexTypes=" + this.mainIndexTypes + ", subIndexTypes=" + this.subIndexTypes + ", isLineView=" + this.isLineView + ", selectPadConfig=" + this.selectPadConfig + ", volumeConfig=" + this.volumeConfig + ", tradeType=" + this.tradeType + ", showHistory=" + this.showHistory + ", showActive=" + this.showActive + ", enableHistory=" + this.enableHistory + ", enableActive=" + this.enableActive + ')';
        }

        /* JADX INFO: renamed from: u */
        public final void m24263u(@NotNull KLineType kLineType) {
            Intrinsics.checkNotNullParameter(kLineType, "<set-?>");
            this.type = kLineType;
        }

        @NotNull
        /* JADX INFO: renamed from: v */
        public final IKLineDataInteractor.DataParam m24264v() {
            return new IKLineDataInteractor.DataParam(this.symbol, this.precision, this.type, this.biz);
        }

        @NotNull
        /* JADX INFO: renamed from: w */
        public final IKLineDataInteractor.OrderParam m24265w() {
            return new IKLineDataInteractor.OrderParam(this.symbol, this.type, this.biz, this.tradeType, this.showHistory, this.showActive, this.enableHistory, this.enableActive);
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.KLineViewController$c */
    /* JADX INFO: compiled from: KLineViewController.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/flutter/widget/kline/KLineViewController$onInit$1", "Lcom/kubi/flutter/widget/kline/IKLineContainer$EventListener;", "onFlutterUiDisplayed", "", "onFlutterFailed", "errorMessage", "", "onReload", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKLineViewController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$onInit$1\n+ 2 KLineContract.kt\ncom/kubi/flutter/widget/kline/KLineContractKt\n*L\n1#1,627:1\n9#2:628\n*S KotlinDebug\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$onInit$1\n*L\n440#1:628\n*E\n"})
    public static final class C12757c implements IKLineContainer.a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f22435b;

        public C12757c(long j11) {
            this.f22435b = j11;
        }

        @Override // com.kubi.flutter.widget.kline.IKLineContainer.a
        /* JADX INFO: renamed from: b */
        public void mo24266b(String str) {
            KLineReport.m24394b(KLineReport.f22495a, TtmlNode.TEXT_EMPHASIS_MARK_OPEN, KLineViewController.this.f22397c.getSymbol(), KLineViewController.this.f22397c.getBiz(), KLineViewController.this.f22397c.getType().getType(), str, null, false, 96, null);
        }

        @Override // com.kubi.flutter.widget.kline.IKLineContainer.a
        public void onFlutterUiDisplayed() {
            KLineReport.f22495a.m24397c(TtmlNode.TEXT_EMPHASIS_MARK_OPEN, KLineViewController.this.f22397c.getSymbol(), KLineViewController.this.f22397c.getBiz(), KLineViewController.this.f22397c.getType().getType(), System.currentTimeMillis() - this.f22435b, (96 & 32) != 0 ? null : null, (96 & 64) != 0 ? false : false);
        }

        @Override // com.kubi.flutter.widget.kline.IKLineContainer.a
        public void onReload() {
            KLineViewController.this.m24227Q();
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.KLineViewController$d */
    /* JADX INFO: compiled from: KLineViewController.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"com/kubi/flutter/widget/kline/KLineViewController$onInit$2", "Lcom/kubi/flutter/widget/kline/IKLineChannel$EventListener;", "onEventMessage", "Lcom/kubi/flutter/proto/kline/Response;", "eventMessage", "Lcom/kubi/flutter/proto/kline/EventMessage;", "(Lcom/kubi/flutter/proto/kline/EventMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12758d implements IKLineChannel.a {
        public C12758d() {
        }

        @Override // com.kubi.flutter.widget.kline.IKLineChannel.a
        /* JADX INFO: renamed from: a */
        public Object mo24267a(EventMessage eventMessage, Continuation<? super Response> continuation) {
            return KLineViewController.this.m24214D(eventMessage, continuation);
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.KLineViewController$e */
    /* JADX INFO: compiled from: KLineViewController.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/flutter/widget/kline/KLineViewController$onInit$3", "Lcom/kubi/flutter/widget/kline/KLineSetting$ISettingUpdateListener;", "onUpdateSetupConfig", "", "config", "Lcom/kubi/flutter/proto/kline/ChartSetupConfig;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12759e implements KLineSetting.a {
        public C12759e() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.KLineViewController$f */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController\n+ 3 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,49:1\n99#2,2:50\n98#2:52\n102#2:57\n45#3,4:53\n*S KotlinDebug\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController\n*L\n98#1:53,4\n*E\n"})
    public static final class C12760f extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C12760f(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C43043a.m94532c(exception, "KLineViewController unhatched");
            }
        }
    }

    public KLineViewController(@NotNull InitParam initState, @NotNull IKLineContainer container, @NotNull IKLineDataInteractor interactor) {
        Intrinsics.checkNotNullParameter(initState, "initState");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f22395a = container;
        this.f22396b = interactor;
        this.f22397c = initState.m24242g();
        this.f22398d = container.getChannel();
        this.f22399e = C41713n0.m91125a(new CoroutineName("kline_controller_scope").plus(C42911a.m94120b()).plus(new C12760f(CoroutineExceptionHandler.INSTANCE)));
        this.f22400f = new KLineDataSession.C12753a(container, interactor);
        this.f22401g = new AtomicReference<>(null);
        this.f22402h = new AtomicBoolean(false);
        this.f22403i = new AtomicInteger(0);
        this.f22404j = initState.getSelectPadConfig();
        this.f22405k = initState.getVolumeConfig();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m24210y(KLineViewController kLineViewController, String str, int i11, KLineType kLineType, Boolean bool, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            kLineType = null;
        }
        if ((i12 & 8) != 0) {
            bool = null;
        }
        kLineViewController.m24233x(str, i11, kLineType, bool);
    }

    /* JADX INFO: renamed from: A */
    public final void m24211A(@NotNull KLineType type, boolean z11) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.areEqual(this.f22397c.getType(), type) && this.f22397c.getIsLineView() == z11) {
            return;
        }
        SwitchType switchTypeM24287a = C12766e.m24287a(z11, Boolean.valueOf(this.f22397c.getIsLineView()));
        this.f22397c.m24263u(type);
        this.f22397c.m24255m(z11);
        C44128b.m97266j("KLineViewController", "changeType " + type + '[' + z11 + ']');
        C41696j.m91104d(this.f22399e, null, null, new KLineViewController$changeType$1(this, type, switchTypeM24287a, null), 3, null);
    }

    /* JADX INFO: renamed from: B */
    public final void m24212B() {
        KLineDataSession andSet = this.f22401g.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.m24168m();
    }

    /* JADX INFO: renamed from: C */
    public final void m24213C(@NotNull AlertClickType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        C41696j.m91104d(this.f22399e, null, null, new KLineViewController$deleteAllDraw$1(type, this, null), 3, null);
    }

    /* JADX INFO: renamed from: D */
    public final Object m24214D(EventMessage eventMessage, Continuation<? super Response> continuation) {
        return C41686h.m91049g(this.f22399e.getF93592b(), new KLineViewController$handleEventMessage$2(eventMessage, this, null), continuation);
    }

    /* JADX INFO: renamed from: E */
    public final void m24215E(@NotNull PaintFromType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        C41696j.m91104d(this.f22399e, null, null, new KLineViewController$initDrawTool$1(this, type, null), 3, null);
    }

    @MainThread
    /* JADX INFO: renamed from: G */
    public final void m24217G() {
        this.f22403i.set(3);
        C44128b.m97266j("KLineViewController", "onDestroy " + this.f22397c.getSymbol() + ' ' + this.f22397c.getType().getType() + ' ' + this.f22397c.getBiz());
        try {
            KLineSetting.f22480a.m24364d(this.f22397c.getSymbol());
            m24212B();
            C41713n0.m91129e(this.f22399e, null, 1, null);
            KLineDataSessionCache.f22478a.m24360c();
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                C43043a.m94532c(e11, "controllerScope cannel error");
            }
        } finally {
            this.f22395a.mo24145b(Lifecycle.Event.ON_DESTROY);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: H */
    public final void m24218H() {
        this.f22403i.set(2);
        m24212B();
    }

    @MainThread
    /* JADX INFO: renamed from: M */
    public final void m24223M() {
        this.f22403i.set(1);
        if (this.f22402h.get()) {
            C41696j.m91104d(this.f22399e, null, null, new KLineViewController$onShow$1(this, null), 3, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fd, code lost:
    
        if (com.kubi.flutter.widget.kline.KLineDataSession.m24166q(r1, r3, 0, r5, 2, null) == r0) goto L28;
     */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m24226P(String str, Continuation<? super Unit> continuation) {
        KLineViewController$openDataPush$1 kLineViewController$openDataPush$1;
        KLineDataSession kLineDataSessionM24172a;
        boolean zAreEqual;
        if (continuation instanceof KLineViewController$openDataPush$1) {
            kLineViewController$openDataPush$1 = (KLineViewController$openDataPush$1) continuation;
            int i11 = kLineViewController$openDataPush$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kLineViewController$openDataPush$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kLineViewController$openDataPush$1 = new KLineViewController$openDataPush$1(this, continuation);
            }
        } else {
            kLineViewController$openDataPush$1 = new KLineViewController$openDataPush$1(this, continuation);
        }
        KLineViewController$openDataPush$1 kLineViewController$openDataPush$2 = kLineViewController$openDataPush$1;
        Object obj = kLineViewController$openDataPush$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kLineViewController$openDataPush$2.label;
        if (i12 != 0) {
            if (i12 == 1) {
                boolean z11 = kLineViewController$openDataPush$2.Z$0;
                kLineDataSessionM24172a = (KLineDataSession) kLineViewController$openDataPush$2.L$1;
                String str2 = (String) kLineViewController$openDataPush$2.L$0;
                ResultKt.throwOnFailure(obj);
                zAreEqual = z11;
                str = str2;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (this.f22401g.get() != null) {
            return Unit.INSTANCE;
        }
        kLineDataSessionM24172a = this.f22400f.m24172a(this.f22397c.m24264v());
        if (!C1454t.m2255a(this.f22401g, null, kLineDataSessionM24172a)) {
            C44128b.m97265i("openDataPush 2 times -- KLineViewController");
            return Unit.INSTANCE;
        }
        KLineRealTimeLog.f22494a.m24393a("openDataPush,from=" + str + ",symbol=" + this.f22397c.getSymbol() + ",type=" + this.f22397c.getType().getType() + ",showHistory=" + this.f22397c.getShowHistory() + ",enableHistory=" + this.f22397c.getEnableHistory());
        zAreEqual = Intrinsics.areEqual(str, TIMPushProvider.f75062n);
        kLineViewController$openDataPush$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
        kLineViewController$openDataPush$2.L$1 = kLineDataSessionM24172a;
        kLineViewController$openDataPush$2.Z$0 = zAreEqual;
        kLineViewController$openDataPush$2.label = 1;
        if (kLineDataSessionM24172a.m24167l(zAreEqual, str, kLineViewController$openDataPush$2) != coroutine_suspended) {
        }
        return coroutine_suspended;
        IKLineDataInteractor.OrderParam orderParamM24265w = this.f22397c.m24265w();
        kLineViewController$openDataPush$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
        kLineViewController$openDataPush$2.L$1 = SpillingKt.nullOutSpilledVariable(kLineDataSessionM24172a);
        kLineViewController$openDataPush$2.Z$0 = zAreEqual;
        kLineViewController$openDataPush$2.label = 2;
    }

    /* JADX INFO: renamed from: Q */
    public final void m24227Q() {
        C41696j.m91104d(this.f22399e, null, null, new KLineViewController$reload$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m24228s(boolean z11) {
        if (this.f22397c.getShowActive() == z11) {
            return;
        }
        this.f22397c.m24259q(z11);
        C44128b.m97266j("KLineViewController", "changeActiveShow isChecked:" + z11);
        C41696j.m91104d(this.f22399e, null, null, new KLineViewController$changeActiveShow$1(this, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m24229t(boolean z11) {
        if (this.f22397c.getShowHistory() == z11) {
            return;
        }
        this.f22397c.m24260r(z11);
        C44128b.m97266j("KLineViewController", "changeHistoryShow");
        C41696j.m91104d(this.f22399e, null, null, new KLineViewController$changeHistoryShow$1(this, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: u */
    public final void m24230u(@NotNull List<? extends MainIndexType> mainIndexTypes) {
        Intrinsics.checkNotNullParameter(mainIndexTypes, "mainIndexTypes");
        if (f22394l.m24235a(this.f22397c.m24246d(), mainIndexTypes)) {
            return;
        }
        this.f22397c.m24256n(mainIndexTypes);
        C44128b.m97266j("KLineViewController", "changeMainTypes " + mainIndexTypes);
        C41696j.m91104d(this.f22399e, null, null, new KLineViewController$changeMainTypes$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m24231v(@NotNull SelectPadConfig selectPadConfig) {
        Intrinsics.checkNotNullParameter(selectPadConfig, "selectPadConfig");
        SelectPadConfig selectPadConfig2 = this.f22397c.getSelectPadConfig();
        if (Intrinsics.areEqual(selectPadConfig2 != null ? selectPadConfig2.getViewMode() : null, selectPadConfig.getViewMode())) {
            SelectPadConfig selectPadConfig3 = this.f22397c.getSelectPadConfig();
            if (Intrinsics.areEqual(selectPadConfig3 != null ? selectPadConfig3.getItemTypesList() : null, selectPadConfig.getItemTypesList())) {
                return;
            }
        }
        this.f22397c.m24258p(selectPadConfig);
        C44128b.m97266j("KLineViewController", "changeSelectPadConfig");
        C41696j.m91104d(this.f22399e, null, null, new KLineViewController$changeSelectPadConfig$1(this, selectPadConfig, null), 3, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m24232w(@NotNull List<? extends SubIndexType> subIndexTypes) {
        Intrinsics.checkNotNullParameter(subIndexTypes, "subIndexTypes");
        if (f22394l.m24235a(this.f22397c.m24251i(), subIndexTypes)) {
            return;
        }
        this.f22397c.m24261s(subIndexTypes);
        C44128b.m97266j("KLineViewController", "changeSubTypes " + subIndexTypes);
        C41696j.m91104d(this.f22399e, null, null, new KLineViewController$changeSubTypes$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m24233x(@NotNull String symbol, int i11, @Nullable KLineType kLineType, @Nullable Boolean bool) {
        SwitchType switchTypeM24287a;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (Intrinsics.areEqual(this.f22397c.getSymbol(), symbol) && Intrinsics.areEqual(Integer.valueOf(this.f22397c.getPrecision()), Integer.valueOf(i11))) {
            KLineType type = this.f22397c.getType();
            if (kLineType == null || Intrinsics.areEqual(type, kLineType)) {
                Boolean boolValueOf = Boolean.valueOf(this.f22397c.getIsLineView());
                if (bool == null || Intrinsics.areEqual(boolValueOf, bool)) {
                    return;
                }
            }
        }
        this.f22397c.m24262t(symbol);
        this.f22397c.m24257o(i11);
        C44128b.m97266j("KLineViewController", "changeSymbol " + symbol + '[' + i11 + ']');
        if (bool == null || (switchTypeM24287a = C12766e.m24287a(bool.booleanValue(), Boolean.valueOf(this.f22397c.getIsLineView()))) == null) {
            switchTypeM24287a = SwitchType.NO_CHANGE;
        }
        if (kLineType != null) {
            this.f22397c.m24263u(kLineType);
        }
        if (bool != null) {
            this.f22397c.m24255m(bool.booleanValue());
        }
        C41696j.m91104d(this.f22399e, null, null, new KLineViewController$changeSymbol$1(this, switchTypeM24287a, null), 3, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m24234z(@NotNull ToolBarClick.ToolBarItemType toolBarType) {
        Intrinsics.checkNotNullParameter(toolBarType, "toolBarType");
        C44128b.m97266j("KLineViewController", "changeToolBar " + toolBarType);
        C41696j.m91104d(this.f22399e, null, null, new KLineViewController$changeToolBar$1(this, toolBarType, null), 3, null);
    }

    /* JADX INFO: renamed from: F */
    public final Object m24216F(ConfirmAlerEvent confirmAlerEvent, Continuation<? super Response> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KLineViewController$onConfirmAlertEvent$2(confirmAlerEvent, null), continuation);
    }

    @MainThread
    /* JADX INFO: renamed from: I */
    public final void m24219I() {
        this.f22395a.mo24148e(new C12757c(System.currentTimeMillis()));
        this.f22398d.mo24113d(new C12758d());
        KLineSetting.f22480a.m24361a(this.f22397c.getSymbol(), new C12759e());
        C44128b.m97266j("KLineViewController", "onInit " + this.f22397c.getSymbol() + ' ' + this.f22397c.getType().getType() + ' ' + this.f22397c.getBiz());
        C41696j.m91104d(this.f22399e, null, null, new KLineViewController$onInit$4(this, null), 3, null);
    }

    /* JADX INFO: renamed from: J */
    public final Object m24220J(JumpOrderEvent jumpOrderEvent, Continuation<? super Response> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KLineViewController$onJump$2(this, jumpOrderEvent, null), continuation);
    }

    /* JADX INFO: renamed from: K */
    public final Object m24221K(LoadMoreEvent loadMoreEvent, Continuation<? super Response> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KLineViewController$onLoadMore$2(loadMoreEvent, this, null), continuation);
    }

    /* JADX INFO: renamed from: L */
    public final Object m24222L(PaintGuideEvent paintGuideEvent, Continuation<? super Response> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KLineViewController$onPaintGuide$2(paintGuideEvent, null), continuation);
    }

    /* JADX INFO: renamed from: N */
    public final Object m24224N(ToastEvent toastEvent, Continuation<? super Response> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KLineViewController$onToastEvent$2(toastEvent, null), continuation);
    }

    /* JADX INFO: renamed from: O */
    public final Object m24225O(ChangeToolBarModeEvent changeToolBarModeEvent, Continuation<? super Response> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KLineViewController$onToolBarMode$2(changeToolBarModeEvent, null), continuation);
    }
}
