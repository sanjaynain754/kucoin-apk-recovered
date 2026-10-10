package com.trtc.uikit.livekit.features.audiencecontainer.view;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.blankj.utilcode.util.C5267e0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.utils.extensions.C27046k;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.R$color;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.component.audiencelist.AudienceListView;
import com.trtc.uikit.livekit.component.barrage.BarrageInputView;
import com.trtc.uikit.livekit.component.barrage.BarrageStreamView;
import com.trtc.uikit.livekit.component.gift.GiftPlayView;
import com.trtc.uikit.livekit.component.gift.LikeButton;
import com.trtc.uikit.livekit.component.giftaccess.GiftButton;
import com.trtc.uikit.livekit.component.giftaccess.store.GiftStore;
import com.trtc.uikit.livekit.component.giftaccess.view.GiftBarrageAdapter;
import com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView;
import com.trtc.uikit.livekit.component.roominfo.LiveInfoView;
import com.trtc.uikit.livekit.features.audiencecontainer.store.MediaStore;
import com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView;
import com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView;
import com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog;
import com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.CancelRequestDialog;
import com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.CoGuestRequestFloatView;
import com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.StopCoGuestDialog;
import com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.TypeSelectDialog;
import com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets.AudienceEmptySeatView;
import com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets.CoGuestBackgroundWidgetsView;
import com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets.CoGuestForegroundWidgetsView;
import com.trtc.uikit.livekit.features.audiencecontainer.view.cohost.widgets.CoHostBackgroundWidgetsView;
import com.trtc.uikit.livekit.features.audiencecontainer.view.cohost.widgets.CoHostForegroundWidgetsView;
import com.trtc.uikit.livekit.features.audiencecontainer.view.settings.AudienceSettingsPanelDialog;
import com.trtc.uikit.livekit.features.audiencecontainer.view.userinfo.UserInfoDialog;
import com.trtc.uikit.livekit.p180kc.helper.LiveFlutterHelper;
import com.trtc.uikit.livekit.p180kc.helper.LiveRemoteConfigHelper;
import com.trtc.uikit.livekit.p180kc.roominfo.service.KCRoomInfoService;
import com.trtc.uikit.livekit.p180kc.share.KCLiveShareHelper;
import com.trtc.uikit.livekit.p180kc.widget.KCAudiencePreviewView;
import com.trtc.uikit.livekit.p180kc.widget.KCPeopleCountView;
import com.trtc.uikit.livekit.p180kc.widget.KCRiskView;
import com.trtc.uikit.livekit.p180kc.widget.KCTradeCardView;
import com.trtc.uikit.livekit.p180kc.widget.OnViewDisplayListener;
import ee0.C37139a;
import ee0.C37144f;
import fd0.C37436d;
import fe0.C37438a;
import io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.AtomicAlertDialog;
import io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.C39361f;
import io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast;
import io.trtc.tuikit.atomicxcore.api.barrage.Barrage;
import io.trtc.tuikit.atomicxcore.api.device.VideoQuality;
import io.trtc.tuikit.atomicxcore.api.gift.Gift;
import io.trtc.tuikit.atomicxcore.api.live.BattleListener;
import io.trtc.tuikit.atomicxcore.api.live.DeviceControlPolicy;
import io.trtc.tuikit.atomicxcore.api.live.GuestListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveCanvas;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveKickedOutReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveListListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.NoResponseReason;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import io.trtc.tuikit.atomicxcore.api.view.VideoViewAdapter;
import io.trtc.tuikit.atomicxcore.api.view.ViewLayer;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jd0.C40392a;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import rd0.C43992b;
import ro.C44128b;
import sc0.C44385c;
import sc0.C44386d;
import sd0.C44394a;
import vc0.C45496e;

/* JADX INFO: compiled from: AudienceView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000Â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0006*\nº\u0001½\u0001À\u0001Ã\u0001Æ\u0001\b\u0007\u0018\u0000 Ê\u00012\u00020\u00012\u00020\u0002:\u0006È\u0001É\u0001Ê\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010W\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010Y\u001a\u00020XJ\u0006\u0010Z\u001a\u00020[J\u000e\u0010\\\u001a\u00020X2\u0006\u0010]\u001a\u00020^J\b\u0010_\u001a\u00020XH\u0014J\b\u0010`\u001a\u00020XH\u0014J\b\u0010a\u001a\u00020XH\u0014J\b\u0010b\u001a\u00020XH\u0002J\u0010\u0010c\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010d\u001a\u00020K2\u0006\u0010e\u001a\u00020fH\u0016J\u000e\u0010g\u001a\u00020X2\u0006\u0010h\u001a\u00020KJ\u0006\u0010i\u001a\u00020XJ\u0006\u0010j\u001a\u00020XJ\u0006\u0010k\u001a\u00020XJ\u0006\u0010l\u001a\u00020XJ\u0010\u0010m\u001a\u00020X2\b\u0010n\u001a\u0004\u0018\u00010IJ\u0006\u0010S\u001a\u00020KJ\b\u0010o\u001a\u00020XH\u0002J\u0010\u0010p\u001a\u00020X2\u0006\u0010q\u001a\u00020KH\u0002J\u0010\u0010r\u001a\u00020X2\u0006\u0010q\u001a\u00020KH\u0002J\b\u0010s\u001a\u00020KH\u0002J\b\u0010t\u001a\u00020uH\u0002J\u0010\u0010v\u001a\u00020w2\u0006\u0010q\u001a\u00020KH\u0002J\u001a\u0010x\u001a\u00020X2\b\u0010y\u001a\u0004\u0018\u00010[2\u0006\u0010z\u001a\u00020\bH\u0002J\b\u0010{\u001a\u00020XH\u0002J\b\u0010|\u001a\u00020XH\u0002J\u0012\u0010}\u001a\u00020X2\b\u0010~\u001a\u0004\u0018\u00010\u007fH\u0002J\u0011\u0010\u0080\u0001\u001a\u00020X2\u0006\u0010~\u001a\u00020\u007fH\u0002J\u0011\u0010\u0081\u0001\u001a\u00020X2\u0006\u0010~\u001a\u00020\u007fH\u0002J\t\u0010\u0082\u0001\u001a\u00020XH\u0002J\t\u0010\u0083\u0001\u001a\u00020XH\u0002J\t\u0010\u0084\u0001\u001a\u00020XH\u0014J\t\u0010\u0085\u0001\u001a\u00020XH\u0014J\u0011\u0010\u0086\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\u0087\u0001\u001a\u00020XH\u0002J\t\u0010\u0088\u0001\u001a\u00020XH\u0002J\u0011\u0010\u0089\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0011\u0010\u008a\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\u008b\u0001\u001a\u00020XH\u0002J\u0012\u0010\u008c\u0001\u001a\u00020X2\u0007\u0010\u008d\u0001\u001a\u00020KH\u0002J\u0011\u0010\u008e\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\u008f\u0001\u001a\u00020XH\u0002J\t\u0010\u0090\u0001\u001a\u00020XH\u0002J\t\u0010\u0091\u0001\u001a\u00020XH\u0002J\t\u0010\u0092\u0001\u001a\u00020XH\u0002J\u0011\u0010\u0093\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0011\u0010\u0094\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0011\u0010\u0095\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0011\u0010\u0096\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0011\u0010\u0097\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0011\u0010\u0098\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\u0099\u0001\u001a\u00020XH\u0002J\t\u0010\u009a\u0001\u001a\u00020XH\u0002J\t\u0010\u009b\u0001\u001a\u00020XH\u0002J\t\u0010\u009c\u0001\u001a\u00020XH\u0002J\t\u0010\u009d\u0001\u001a\u00020XH\u0002J\t\u0010\u009e\u0001\u001a\u00020XH\u0002J\u001a\u0010\u009f\u0001\u001a\u00020X2\u0007\u0010 \u0001\u001a\u00020\b2\u0006\u0010q\u001a\u00020KH\u0002J\u0007\u0010¡\u0001\u001a\u00020XJ\u0007\u0010¢\u0001\u001a\u00020XJ\u0007\u0010£\u0001\u001a\u00020XJ\t\u0010¤\u0001\u001a\u00020XH\u0002J\u001a\u0010¥\u0001\u001a\u00020X2\u000f\u0010¦\u0001\u001a\n\u0012\u0005\u0012\u00030¨\u00010§\u0001H\u0003J\u0012\u0010©\u0001\u001a\u00020X2\u0007\u0010ª\u0001\u001a\u00020KH\u0002J\u0012\u0010«\u0001\u001a\u00020X2\u0007\u0010ª\u0001\u001a\u00020KH\u0002J\u0012\u0010¬\u0001\u001a\u00020X2\u0007\u0010ª\u0001\u001a\u00020KH\u0002J\u0012\u0010\u00ad\u0001\u001a\u00020X2\u0007\u0010ª\u0001\u001a\u00020KH\u0002J\u0012\u0010®\u0001\u001a\u00020X2\u0007\u0010¯\u0001\u001a\u00020KH\u0002J\u0014\u0010°\u0001\u001a\u00020X2\t\u0010±\u0001\u001a\u0004\u0018\u00010VH\u0002J\u001a\u0010²\u0001\u001a\u00020X2\u0007\u0010³\u0001\u001a\u0002092\u0006\u0010h\u001a\u00020KH\u0002J\t\u0010´\u0001\u001a\u00020XH\u0002J\u0012\u0010µ\u0001\u001a\u00020X2\u0007\u0010¶\u0001\u001a\u00020[H\u0016J\u0012\u0010·\u0001\u001a\u00020[2\u0007\u0010¸\u0001\u001a\u00020VH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u0004\u0018\u00010IX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020KX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010L\u001a\b\u0018\u00010MR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020OX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020OX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020KX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020KX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020KX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u0004\u0018\u00010VX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010¹\u0001\u001a\u00030º\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010»\u0001R\u0013\u0010¼\u0001\u001a\u00030½\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010¾\u0001R\u0013\u0010¿\u0001\u001a\u00030À\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010Á\u0001R\u0013\u0010Â\u0001\u001a\u00030Ã\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010Ä\u0001R\u0013\u0010Å\u0001\u001a\u00030Æ\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010Ç\u0001¨\u0006Ë\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore$AudienceViewListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "liveCoreView", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;", "liveCoreViewMaskBackgroundView", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/LiveCoreViewMaskBackgroundView;", "layoutPlaying", "Landroid/widget/FrameLayout;", "layoutLiveCoreView", "layoutLiveCoreViewMask", "ivVideoViewBackground", "Landroid/widget/ImageView;", "kcAudiencePreviewView", "Lcom/trtc/uikit/livekit/kc/widget/KCAudiencePreviewView;", "imageMore", "buttonGift", "Lcom/trtc/uikit/livekit/component/giftaccess/GiftButton;", "buttonLike", "Lcom/trtc/uikit/livekit/component/gift/LikeButton;", "imageCoGuest", "barrageInputView", "Lcom/trtc/uikit/livekit/component/barrage/BarrageInputView;", "roomInfoView", "Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;", "giftPlayView", "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;", "audienceListView", "Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;", "barrageStreamView", "Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;", "networkInfoView", "Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;", "imageFloatWindow", "imagePreviewShare", "imagePreviewReport", "imageStandardExit", "imageCompactExit", "layoutSwitchOrientationButton", "imageSwitchOrientationIcon", "waitingCoGuestPassView", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/CoGuestRequestFloatView;", "audiencePlayingRootView", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "bottomFunctionView", "Landroid/view/View;", "peopleCountView", "Lcom/trtc/uikit/livekit/kc/widget/KCPeopleCountView;", "riskView", "Lcom/trtc/uikit/livekit/kc/widget/KCRiskView;", "tradeCardView", "Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView;", "kcRoomInfoService", "Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;", "endLiveDialog", "Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;", "userInfoDialog", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/userinfo/UserInfoDialog;", "anchorManagerDialog", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;", "viewObserver", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$ViewObserver;", "isLoading", "", "videoViewAdapterImpl", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$VideoViewAdapterImpl;", "touchX", "", "touchY", "touchSlop", "isSwiping", "isLiveStreaming", "isClickEmptySeat", "playbackQuality", "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;", "init", "", "initStore", "getRoomId", "", "setAudienceContainerViewListenerList", "viewListenerList", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/observer/AudienceContainerViewListenerList;", "initView", "addObserver", "removeObserver", "initFloatWindowView", "initPreviewView", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "enablePictureInPictureMode", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "startPreviewLiveStream", "stopPreviewLiveStream", "joinRoom", "leaveRoom", "setViewObserver", "observer", "initSwitchOrientationButtonView", "setScreenOrientation", "isPortrait", "updateViewByOrientation", "isScreenPortrait", "getScreenPoint", "Landroid/graphics/Point;", "getSwitchScreenButtonPosition", "Landroid/widget/FrameLayout$LayoutParams;", "setLayoutBackground", "imageUrl", "seatLayoutTemplateId", "onViewLoading", "onViewFinished", "showCoGuestManageDialog", "userInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "showAnchorManagerDialog", "showUserInfoDialog", "setVideoViewAdapter", "createVideoMuteBitmap", "onAttachedToWindow", "onDetachedFromWindow", "initComponentView", "initMoreIcon", "initCoGuestVisibility", "initAudienceListView", "initPeopleCountView", "initTradeCardView", "updateBarrageStreamViewMargin", "isTradeCardVisible", "initNetworkView", "initExitRoomView", "initPreviewShareButton", "initPreviewReportButton", "updatePreviewTopActions", "initRoomInfoView", "initBarrageStreamView", "initBarrageInputView", "initGiftView", "initLikeView", "initGiftPlayView", "initCoGuestIcon", "initWaitingCoGuestPassView", "cancelCoGuestRequest", "stopCoGuest", "showStopCoGuestDialog", "showCancelCoGuestRequestDialog", "setCoreViewLayoutParamsWhenLandscape", "templateId", "subscribeObserver", "unsubscribeObserver", "onExitButtonClick", "onLinkStatusChange", "onCoHostConnectedUsersChanged", "connectedList", "", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "onHeaderFloatWinDisable", "disable", "onHeaderLiveDataDisable", "onHeaderVisitorCntDisable", "onFooterCoGuestDisable", "onVideoOrientationChanged", "videoStreamIsLandscape", "onPlaybackQualityChanged", "videoQuality", "enableView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "showLiveStreamEndDialog", "onRoomDismissed", "roomId", "videoQualityToString", C33757kf.f70665k, "liveListListener", "com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$liveListListener$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$liveListListener$1;", "seatListener", "com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$seatListener$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$seatListener$1;", "conGuestListener", "com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$conGuestListener$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$conGuestListener$1;", "battleListener", "com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$battleListener$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$battleListener$1;", "liveAudienceListener", "com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$liveAudienceListener$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$liveAudienceListener$1;", "VideoViewAdapterImpl", "ViewObserver", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAudienceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudienceView.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1495:1\n2746#2,3:1496\n2746#2,3:1499\n2746#2,3:1502\n*S KotlinDebug\n*F\n+ 1 AudienceView.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView\n*L\n1062#1:1496,3\n1071#1:1499,3\n929#1:1502,3\n*E\n"})
public final class AudienceView extends BasicView implements C37144f.a {

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f78613u0 = new Companion(null);

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final LiveKitLogger f78614v0 = LiveKitLogger.f77564c.getLiveStreamLogger("AudienceView");

    /* JADX INFO: renamed from: A */
    public ImageView f78615A;

    /* JADX INFO: renamed from: B */
    public GiftButton f78616B;

    /* JADX INFO: renamed from: C */
    public LikeButton f78617C;

    /* JADX INFO: renamed from: D */
    public ImageView f78618D;

    /* JADX INFO: renamed from: E */
    public BarrageInputView f78619E;

    /* JADX INFO: renamed from: F */
    public LiveInfoView f78620F;

    /* JADX INFO: renamed from: G */
    public GiftPlayView f78621G;

    /* JADX INFO: renamed from: H */
    public AudienceListView f78622H;

    /* JADX INFO: renamed from: I */
    public BarrageStreamView f78623I;

    /* JADX INFO: renamed from: J */
    public NetworkInfoView f78624J;

    /* JADX INFO: renamed from: K */
    public ImageView f78625K;

    /* JADX INFO: renamed from: L */
    public ImageView f78626L;

    /* JADX INFO: renamed from: M */
    public ImageView f78627M;

    /* JADX INFO: renamed from: N */
    public ImageView f78628N;

    /* JADX INFO: renamed from: O */
    public ImageView f78629O;

    /* JADX INFO: renamed from: P */
    public FrameLayout f78630P;

    /* JADX INFO: renamed from: Q */
    public ImageView f78631Q;

    /* JADX INFO: renamed from: R */
    public CoGuestRequestFloatView f78632R;

    /* JADX INFO: renamed from: S */
    public AudiencePlayingRootView f78633S;

    /* JADX INFO: renamed from: T */
    @NotNull
    public final InterfaceC41709m0 f78634T;

    /* JADX INFO: renamed from: U */
    public View f78635U;

    /* JADX INFO: renamed from: V */
    public KCPeopleCountView f78636V;

    /* JADX INFO: renamed from: W */
    public KCRiskView f78637W;

    /* JADX INFO: renamed from: a0 */
    public KCTradeCardView f78638a0;

    /* JADX INFO: renamed from: b0 */
    public KCRoomInfoService f78639b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public AtomicAlertDialog f78640c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public UserInfoDialog f78641d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public AnchorManagerDialog f78642e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public InterfaceC36209b f78643f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f78644g0;

    /* JADX INFO: renamed from: h0 */
    @Nullable
    public C36208a f78645h0;

    /* JADX INFO: renamed from: i0 */
    public float f78646i0;

    /* JADX INFO: renamed from: j0 */
    public float f78647j0;

    /* JADX INFO: renamed from: k0 */
    public final int f78648k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f78649l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f78650m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f78651n0;

    /* JADX INFO: renamed from: o0 */
    @Nullable
    public VideoQuality f78652o0;

    /* JADX INFO: renamed from: p0 */
    @NotNull
    public final C36219l f78653p0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final C36220m f78654q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final C36212e f78655r0;

    /* JADX INFO: renamed from: s */
    public LiveInfo f78656s;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final C36211d f78657s0;

    /* JADX INFO: renamed from: t */
    public LiveCoreView f78658t;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final C36218k f78659t0;

    /* JADX INFO: renamed from: u */
    public LiveCoreViewMaskBackgroundView f78660u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f78661v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f78662w;

    /* JADX INFO: renamed from: x */
    public FrameLayout f78663x;

    /* JADX INFO: renamed from: y */
    public ImageView f78664y;

    /* JADX INFO: renamed from: z */
    public KCAudiencePreviewView f78665z;

    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "DEFAULT_COVER_URL", "", "ADMINISTRATOR", "showBattleToast", "", "tips", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void showBattleToast(@NotNull String tips) {
            Intrinsics.checkNotNullParameter(tips, "tips");
            Context contextM79397b = ContextProvider.m79397b();
            AtomicToast atomicToast = AtomicToast.f87566a;
            Intrinsics.checkNotNull(contextM79397b);
            AtomicToast.m88196j(atomicToast, contextM79397b, tips, AtomicToast.Style.INFO, null, Integer.valueOf(R$drawable.livekit_connection_toast_icon), null, null, null, 232, null);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$a */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001e\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$VideoViewAdapterImpl;", "Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;", "context", "Landroid/content/Context;", "<init>", "(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/content/Context;)V", "weakContext", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "createCoGuestView", "Landroid/view/View;", "seatInfo", "Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;", "viewLayer", "Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;", "createCoHostView", "createBattleView", "createBattleContainerView", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAudienceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudienceView.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$VideoViewAdapterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1495:1\n2746#2,3:1496\n*S KotlinDebug\n*F\n+ 1 AudienceView.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$VideoViewAdapterImpl\n*L\n1246#1:1496,3\n*E\n"})
    public final class C36208a implements VideoViewAdapter {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final WeakReference<Context> f78666a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AudienceView f78667b;

        /* JADX INFO: renamed from: e */
        public static final void m80936e(AudienceView audienceView, DialogInterface dialogInterface) {
            audienceView.f78651n0 = false;
        }

        public C36208a(@NotNull AudienceView audienceView, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f78667b = audienceView;
            this.f78666a = new WeakReference<>(context);
        }

        /* JADX INFO: renamed from: f */
        public static final void m80937f(AudienceView audienceView, SeatInfo seatInfo, View view) {
            String userID;
            String userName;
            SeatUserInfo userInfo;
            String avatarURL;
            SeatUserInfo userInfo2;
            SeatUserInfo userInfo3;
            String str = "";
            if (seatInfo == null || (userInfo3 = seatInfo.getUserInfo()) == null || (userID = userInfo3.getUserID()) == null) {
                userID = "";
            }
            if (seatInfo == null || (userInfo2 = seatInfo.getUserInfo()) == null || (userName = userInfo2.getUserName()) == null) {
                userName = "";
            }
            if (seatInfo != null && (userInfo = seatInfo.getUserInfo()) != null && (avatarURL = userInfo.getAvatarURL()) != null) {
                str = avatarURL;
            }
            audienceView.m80912l1(new LiveUserInfo(userID, userName, str));
        }

        @Override // io.trtc.tuikit.atomicxcore.api.view.VideoViewAdapter
        @Nullable
        public View createBattleContainerView() {
            Context context = this.f78666a.get();
            if (context == null) {
                AudienceView.f78614v0.m79403a("createBattleContainerView: context is null");
                return null;
            }
            BattleInfoView battleInfoView = new BattleInfoView(context, null, 2, null);
            battleInfoView.mo80950b(this.f78667b.getAudienceStore());
            return battleInfoView;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.view.VideoViewAdapter
        @Nullable
        public View createBattleView(@Nullable SeatInfo seatInfo) {
            String userID;
            SeatUserInfo userInfo;
            Context context = this.f78666a.get();
            if (context == null) {
                AudienceView.f78614v0.m79403a("createBattleView: context is null");
                return null;
            }
            BattleMemberInfoView battleMemberInfoView = new BattleMemberInfoView(context, null, 2, null);
            C37144f audienceStore = this.f78667b.getAudienceStore();
            if (seatInfo == null || (userInfo = seatInfo.getUserInfo()) == null || (userID = userInfo.getUserID()) == null) {
                userID = "";
            }
            battleMemberInfoView.m81019m(audienceStore, userID);
            return battleMemberInfoView;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.view.VideoViewAdapter
        @Nullable
        public View createCoGuestView(@Nullable final SeatInfo seatInfo, @Nullable ViewLayer viewLayer) {
            SeatUserInfo seatUserInfo;
            SeatUserInfo seatUserInfo2;
            SeatUserInfo userInfo;
            Context context = this.f78666a.get();
            if (context == null) {
                AudienceView.f78614v0.m79403a("createCoGuestView: context is null");
                return null;
            }
            if (TextUtils.isEmpty((seatInfo == null || (userInfo = seatInfo.getUserInfo()) == null) ? null : userInfo.getUserID())) {
                if (viewLayer != ViewLayer.BACKGROUND) {
                    return null;
                }
                Context context2 = this.f78667b.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                AudienceEmptySeatView audienceEmptySeatView = new AudienceEmptySeatView(context2, null, 0, 6, null);
                audienceEmptySeatView.mo80950b(this.f78667b.getAudienceStore());
                audienceEmptySeatView.setTag(seatInfo);
                final AudienceView audienceView = this.f78667b;
                audienceEmptySeatView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AudienceView.C36208a.m80935d(audienceView, view);
                    }
                });
                return audienceEmptySeatView;
            }
            if (ViewLayer.BACKGROUND == viewLayer) {
                CoGuestBackgroundWidgetsView coGuestBackgroundWidgetsView = new CoGuestBackgroundWidgetsView(context, null, 0, 6, null);
                C37144f audienceStore = this.f78667b.getAudienceStore();
                if (seatInfo == null || (seatUserInfo2 = seatInfo.getUserInfo()) == null) {
                    seatUserInfo2 = new SeatUserInfo(null, null, null, null, null, null, false, null, false, null, 1023, null);
                }
                coGuestBackgroundWidgetsView.m81183h(audienceStore, seatUserInfo2);
                return coGuestBackgroundWidgetsView;
            }
            CoGuestForegroundWidgetsView coGuestForegroundWidgetsView = new CoGuestForegroundWidgetsView(context, null, 0, 6, null);
            C37144f audienceStore2 = this.f78667b.getAudienceStore();
            if (seatInfo == null || (seatUserInfo = seatInfo.getUserInfo()) == null) {
                seatUserInfo = new SeatUserInfo(null, null, null, null, null, null, false, null, false, null, 1023, null);
            }
            coGuestForegroundWidgetsView.m81191k(audienceStore2, seatUserInfo);
            final AudienceView audienceView2 = this.f78667b;
            coGuestForegroundWidgetsView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AudienceView.C36208a.m80937f(audienceView2, seatInfo, view);
                }
            });
            return coGuestForegroundWidgetsView;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.view.VideoViewAdapter
        @Nullable
        public View createCoHostView(@Nullable SeatInfo seatInfo, @Nullable ViewLayer viewLayer) {
            SeatUserInfo seatUserInfo;
            SeatUserInfo seatUserInfo2;
            Context context = this.f78666a.get();
            if (context == null) {
                AudienceView.f78614v0.m79403a("createCoHostView: context is null");
                return null;
            }
            if (ViewLayer.BACKGROUND == viewLayer) {
                CoHostBackgroundWidgetsView coHostBackgroundWidgetsView = new CoHostBackgroundWidgetsView(context, null, 0, 6, null);
                C37144f audienceStore = this.f78667b.getAudienceStore();
                if (seatInfo == null || (seatUserInfo2 = seatInfo.getUserInfo()) == null) {
                    seatUserInfo2 = new SeatUserInfo(null, null, null, null, null, null, false, null, false, null, 1023, null);
                }
                coHostBackgroundWidgetsView.m81203h(audienceStore, seatUserInfo2);
                return coHostBackgroundWidgetsView;
            }
            CoHostForegroundWidgetsView coHostForegroundWidgetsView = new CoHostForegroundWidgetsView(context, null, 0, 6, null);
            C37144f audienceStore2 = this.f78667b.getAudienceStore();
            if (seatInfo == null || (seatUserInfo = seatInfo.getUserInfo()) == null) {
                seatUserInfo = new SeatUserInfo(null, null, null, null, null, null, false, null, false, null, 1023, null);
            }
            coHostForegroundWidgetsView.m81217k(audienceStore2, seatUserInfo);
            return coHostForegroundWidgetsView;
        }

        /* JADX INFO: renamed from: d */
        public static final void m80935d(final AudienceView audienceView, View view) {
            String userID;
            if (!audienceView.getAudienceStore().m83102u().m83114c().getValue().booleanValue()) {
                List<SeatUserInfo> value = audienceView.getCoGuestState().getConnected().getValue();
                if (!(value instanceof Collection) || !value.isEmpty()) {
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        String userID2 = ((SeatUserInfo) it.next()).getUserID();
                        UserProfile value2 = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
                        if (value2 != null) {
                            userID = value2.getUserID();
                        } else {
                            userID = null;
                        }
                        if (Intrinsics.areEqual(userID2, userID)) {
                            return;
                        }
                    }
                }
                if (!audienceView.f78651n0) {
                    audienceView.f78651n0 = true;
                    Object tag = view.getTag();
                    Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.SeatInfo");
                    Context context = audienceView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    TypeSelectDialog typeSelectDialog = new TypeSelectDialog(context, audienceView.getAudienceStore(), ((SeatInfo) tag).getIndex());
                    typeSelectDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.v
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            AudienceView.C36208a.m80936e(audienceView, dialogInterface);
                        }
                    });
                    typeSelectDialog.show();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$b */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$ViewObserver;", "", "onLoading", "", "onFinished", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC36209b {
        /* JADX INFO: renamed from: a */
        void mo80724a();

        /* JADX INFO: renamed from: b */
        void mo80725b();
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$d */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$battleListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;", "onBattleRequestCancelled", "", "battleID", "", "inviter", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "invitee", "onBattleRequestReject", "onBattleRequestTimeout", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36211d extends BattleListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f78668a;

        public C36211d(Context context) {
            this.f78668a = context;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleRequestCancelled(String battleID, SeatUserInfo inviter, SeatUserInfo invitee) {
            Intrinsics.checkNotNullParameter(battleID, "battleID");
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(invitee, "invitee");
            AudienceView.f78613u0.showBattleToast(inviter.getUserName() + ' ' + this.f78668a.getString(R$string.common_battle_inviter_cancel));
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleRequestReject(String battleID, SeatUserInfo inviter, SeatUserInfo invitee) {
            Intrinsics.checkNotNullParameter(battleID, "battleID");
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(invitee, "invitee");
            AudienceView.f78613u0.showBattleToast(invitee.getUserName() + ' ' + this.f78668a.getString(R$string.common_battle_invitee_reject));
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleRequestTimeout(String battleID, SeatUserInfo inviter, SeatUserInfo invitee) {
            Intrinsics.checkNotNullParameter(battleID, "battleID");
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(invitee, "invitee");
            Companion companion = AudienceView.f78613u0;
            String string = this.f78668a.getString(R$string.common_battle_invitation_timeout);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            companion.showBattleToast(string);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$e */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$conGuestListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;", "onGuestApplicationResponded", "", "isAccept", "", "hostUser", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "onGuestApplicationNoResponse", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;", "onKickedOffSeat", "seatIndex", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36212e extends GuestListener {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f78670c;

        public C36212e(Context context) {
            this.f78670c = context;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.GuestListener
        public void onGuestApplicationNoResponse(NoResponseReason reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            if (reason == NoResponseReason.TIMEOUT) {
                AtomicToast atomicToast = AtomicToast.f87566a;
                Context context = this.f78670c;
                String string = context.getResources().getString(R$string.common_voiceroom_take_seat_timeout);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                AtomicToast.m88196j(atomicToast, context, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
            }
            AudienceView.this.getAudienceStore().getF82429k().m80790g(false);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.GuestListener
        public void onGuestApplicationResponded(boolean isAccept, LiveUserInfo hostUser) {
            Intrinsics.checkNotNullParameter(hostUser, "hostUser");
            AudienceView.this.getAudienceStore().getF82429k().m80790g(false);
            if (isAccept) {
                if (AudienceView.this.getViewState().m83113b().getValue().booleanValue()) {
                    AudienceView.this.getAudienceStore().getF82420b().openLocalCamera(AudienceView.this.getAudienceStore().getF82420b().getDeviceState().isFrontCamera().getValue().booleanValue(), null);
                }
                AudienceView.this.getAudienceStore().getF82420b().openLocalMicrophone(null);
            } else {
                AtomicToast atomicToast = AtomicToast.f87566a;
                Context context = this.f78670c;
                String string = context.getResources().getString(R$string.common_voiceroom_take_seat_rejected);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                AtomicToast.m88196j(atomicToast, context, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
            }
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.GuestListener
        public void onKickedOffSeat(int seatIndex, LiveUserInfo hostUser) {
            Intrinsics.checkNotNullParameter(hostUser, "hostUser");
            AtomicToast atomicToast = AtomicToast.f87566a;
            Context context = this.f78670c;
            String string = context.getResources().getString(R$string.common_voiceroom_kicked_out_of_seat);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            AtomicToast.m88196j(atomicToast, context, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$f */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$initBarrageStreamView$1", "Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$OnMessageClickListener;", "onMessageClick", "", "userInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36213f implements BarrageStreamView.InterfaceC35881a {
        @Override // com.trtc.uikit.livekit.component.barrage.BarrageStreamView.InterfaceC35881a
        /* JADX INFO: renamed from: a */
        public void mo79480a(LiveUserInfo userInfo) {
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            if (TextUtils.isEmpty(userInfo.getUserID()) || TextUtils.equals(userInfo.getUserID(), "administrator") || StringsKt.startsWith$default(userInfo.getUserID(), "guest_", false, 2, (Object) null)) {
                return;
            }
            LiveFlutterHelper.f79161a.m81517b(userInfo.getUserID());
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$g */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\r"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$initGiftPlayView$1", "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$TUIGiftPlayViewListener;", "onReceiveGift", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;", "gift", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "giftCount", "", TUIConstants.TUICalling.SENDER, "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "onPlayGiftAnimation", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36214g implements GiftPlayView.InterfaceC35914c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C43992b f78672b;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$g$a */
        /* JADX INFO: compiled from: AudienceView.kt */
        @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$initGiftPlayView$1$onPlayGiftAnimation$1", "Lcom/trtc/uikit/livekit/component/giftaccess/service/GiftCacheService$Callback;", "", "onResult", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", DbParams.KEY_CHANNEL_RESULT, "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements C43992b.a<String> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ GiftPlayView f78673a;

            public a(GiftPlayView giftPlayView) {
                this.f78673a = giftPlayView;
            }

            @Override // rd0.C43992b.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void mo80151a(int i11, String str) {
                GiftPlayView giftPlayView;
                if (i11 != 0 || (giftPlayView = this.f78673a) == null) {
                    return;
                }
                if (str == null) {
                    str = "";
                }
                giftPlayView.m79649t(str);
            }
        }

        public C36214g(C43992b c43992b) {
            this.f78672b = c43992b;
        }

        @Override // com.trtc.uikit.livekit.component.gift.GiftPlayView.InterfaceC35914c
        /* JADX INFO: renamed from: a */
        public void mo79652a(GiftPlayView giftPlayView, Gift gift) {
            Intrinsics.checkNotNullParameter(gift, "gift");
            this.f78672b.m96953d(gift.getResourceURL(), new a(giftPlayView));
        }

        @Override // com.trtc.uikit.livekit.component.gift.GiftPlayView.InterfaceC35914c
        /* JADX INFO: renamed from: b */
        public void mo79653b(GiftPlayView giftPlayView, Gift gift, int i11, LiveUserInfo sender) {
            Intrinsics.checkNotNullParameter(gift, "gift");
            Intrinsics.checkNotNullParameter(sender, "sender");
            Barrage barrage = new Barrage(null, null, 0L, 0L, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
            barrage.setTextContent("gift");
            barrage.getSender().setUserID(sender.getUserID());
            barrage.getSender().setUserName(TextUtils.isEmpty(sender.getUserName()) ? sender.getUserID() : sender.getUserName());
            barrage.getSender().setAvatarURL(sender.getAvatarURL());
            HashMap map = new HashMap();
            map.put("gift_view_type", "1");
            map.put("gift_name", gift.getName());
            map.put("gift_count", String.valueOf(i11));
            map.put("gift_icon_url", gift.getIconURL());
            map.put("gift_receiver_username", TextUtils.isEmpty(AudienceView.this.getLiveListState().getCurrentLive().getValue().getLiveOwner().getUserName()) ? AudienceView.this.getLiveListState().getCurrentLive().getValue().getLiveOwner().getUserID() : AudienceView.this.getLiveListState().getCurrentLive().getValue().getLiveOwner().getUserName());
            barrage.setExtensionInfo(map);
            BarrageStreamView barrageStreamView = AudienceView.this.f78623I;
            if (barrageStreamView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
                barrageStreamView = null;
            }
            barrageStreamView.m79474k(barrage);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$h */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$initPreviewView$1", "Lcom/trtc/uikit/livekit/kc/widget/OnViewDisplayListener;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36215h implements OnViewDisplayListener {
        public C36215h() {
        }

        @Override // com.trtc.uikit.livekit.p180kc.widget.OnViewDisplayListener
        /* JADX INFO: renamed from: a */
        public void mo80939a() {
            BarrageStreamView barrageStreamView = AudienceView.this.f78623I;
            View view = null;
            if (barrageStreamView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
                barrageStreamView = null;
            }
            barrageStreamView.setVisibility(4);
            BarrageInputView barrageInputView = AudienceView.this.f78619E;
            if (barrageInputView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barrageInputView");
                barrageInputView = null;
            }
            barrageInputView.setVisibility(8);
            View view2 = AudienceView.this.f78635U;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomFunctionView");
            } else {
                view = view2;
            }
            view.setVisibility(8);
            AudienceView.this.m80931z1();
        }

        @Override // com.trtc.uikit.livekit.p180kc.widget.OnViewDisplayListener
        /* JADX INFO: renamed from: b */
        public void mo80940b() {
            KCAudiencePreviewView kCAudiencePreviewView = AudienceView.this.f78665z;
            KCRiskView kCRiskView = null;
            if (kCAudiencePreviewView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kcAudiencePreviewView");
                kCAudiencePreviewView = null;
            }
            kCAudiencePreviewView.setVisibility(8);
            BarrageStreamView barrageStreamView = AudienceView.this.f78623I;
            if (barrageStreamView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
                barrageStreamView = null;
            }
            barrageStreamView.setVisibility(0);
            BarrageInputView barrageInputView = AudienceView.this.f78619E;
            if (barrageInputView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barrageInputView");
                barrageInputView = null;
            }
            barrageInputView.setVisibility(0);
            View view = AudienceView.this.f78635U;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomFunctionView");
                view = null;
            }
            view.setVisibility(0);
            KCRiskView kCRiskView2 = AudienceView.this.f78637W;
            if (kCRiskView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("riskView");
            } else {
                kCRiskView = kCRiskView2;
            }
            String string = AudienceView.this.getContext().getString(R$string.live_risk_notice_banner);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            kCRiskView.m81668f(string, AudienceView.this.m80881R0());
            AudienceView.this.m80931z1();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$i */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$initTradeCardView$1", "Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView$OnVisibilityChangeListener;", "onVisibilityChanged", "", "isVisible", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36216i implements KCTradeCardView.InterfaceC36444a {
        public C36216i() {
        }

        @Override // com.trtc.uikit.livekit.p180kc.widget.KCTradeCardView.InterfaceC36444a
        /* JADX INFO: renamed from: a */
        public void mo80153a(boolean z11) {
            AudienceView.this.m80928x1(z11);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$j */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$joinRoom$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;", "onSuccess", "", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36217j implements LiveInfoCompletionHandler {
        public C36217j() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            AudienceView.this.f78650m0 = false;
            AudienceView.this.m80898e1();
            ErrorLocalized.f77561a.onError(code);
            TUICore.notifyEvent("EVENT_KEY_LIVE_KIT", "EVENT_SUB_KEY_DESTROY_LIVE_VIEW", null);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler
        public void onSuccess(LiveInfo liveInfo) {
            Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
            AudienceView.this.f78656s = liveInfo;
            AudienceView.this.m80902g1(liveInfo.getSeatLayoutTemplateID(), true);
            Context context = AudienceView.this.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            KCRoomInfoService kCRoomInfoService = null;
            if (activity.isFinishing() || activity.isDestroyed()) {
                AudienceView.f78614v0.m79406d("activity is exit, leaveLiveStream");
                AudienceView.this.getAudienceStore().getF82419a().leaveLive(null);
                LiveCoreView liveCoreView = AudienceView.this.f78658t;
                if (liveCoreView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
                    liveCoreView = null;
                }
                liveCoreView.setLocalVideoMuteImage(null, null);
                AudienceView.this.f78650m0 = false;
                return;
            }
            LiveCoreViewMaskBackgroundView liveCoreViewMaskBackgroundView = AudienceView.this.f78660u;
            if (liveCoreViewMaskBackgroundView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveCoreViewMaskBackgroundView");
                liveCoreViewMaskBackgroundView = null;
            }
            liveCoreViewMaskBackgroundView.setBackgroundUrl(TextUtils.isEmpty(liveInfo.getBackgroundURL()) ? liveInfo.getCoverURL() : liveInfo.getBackgroundURL());
            LiveCoreView liveCoreView2 = AudienceView.this.f78658t;
            if (liveCoreView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
                liveCoreView2 = null;
            }
            liveCoreView2.setBackgroundColor(ContextCompat.getColor(AudienceView.this.getContext(), R$color.c_121212));
            AudienceView.this.getMediaStore().m80777h(liveInfo.getLiveID());
            AudienceView.this.getAudienceStore().m83084E(liveInfo);
            KCRoomInfoService kCRoomInfoService2 = AudienceView.this.f78639b0;
            if (kCRoomInfoService2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kcRoomInfoService");
            } else {
                kCRoomInfoService = kCRoomInfoService2;
            }
            kCRoomInfoService.m81565j(liveInfo, AudienceView.this.f78634T);
            AudienceView.this.m80917q0(liveInfo);
            AudienceView.this.m80915p0();
            AudienceView.this.m80898e1();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$k */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$liveAudienceListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;", "onAudienceMessageDisabled", "", "audience", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "isDisable", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36218k extends LiveAudienceListener {
        public C36218k() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener
        public void onAudienceMessageDisabled(LiveUserInfo audience, boolean isDisable) {
            Intrinsics.checkNotNullParameter(audience, "audience");
            AudienceView.this.getAudienceStore().getF82427i().m80753h(audience.getUserID(), isDisable);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$l */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$liveListListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;", "onKickedOutOfLive", "", "liveID", "", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/LiveKickedOutReason;", "message", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36219l extends LiveListListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f78679b;

        public C36219l(Context context) {
            this.f78679b = context;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListListener
        public void onKickedOutOfLive(String liveID, LiveKickedOutReason reason, String message) {
            Intrinsics.checkNotNullParameter(liveID, "liveID");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(message, "message");
            String userID = AudienceView.this.getLiveListState().getCurrentLive().getValue().getLiveOwner().getUserID();
            UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
            if (Intrinsics.areEqual(userID, value != null ? value.getUserID() : null) || LiveKickedOutReason.BY_LOGGED_ON_OTHER_DEVICE == reason) {
                return;
            }
            AtomicToast atomicToast = AtomicToast.f87566a;
            Context context = this.f78679b;
            String string = context.getResources().getString(R$string.common_kicked_out_of_room_by_owner);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            AtomicToast.m88196j(atomicToast, context, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
            TUICore.notifyEvent("EVENT_KEY_LIVE_KIT", "EVENT_SUB_KEY_DESTROY_LIVE_VIEW", null);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$m */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$seatListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatListener;", "onLocalCameraOpenedByAdmin", "", "policy", "Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;", "onLocalCameraClosedByAdmin", "onLocalMicrophoneOpenedByAdmin", "onLocalMicrophoneClosedByAdmin", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36220m extends LiveSeatListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f78680a;

        public C36220m(Context context) {
            this.f78680a = context;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatListener
        public void onLocalCameraClosedByAdmin() {
            AtomicToast atomicToast = AtomicToast.f87566a;
            Context context = this.f78680a;
            String string = context.getResources().getString(R$string.common_mute_video_by_owner);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            AtomicToast.m88196j(atomicToast, context, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatListener
        public void onLocalCameraOpenedByAdmin(DeviceControlPolicy policy) {
            Intrinsics.checkNotNullParameter(policy, "policy");
            if (policy == DeviceControlPolicy.UNLOCK_ONLY) {
                AtomicToast atomicToast = AtomicToast.f87566a;
                Context context = this.f78680a;
                String string = context.getResources().getString(R$string.common_un_mute_video_by_master);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                AtomicToast.m88196j(atomicToast, context, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
            }
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatListener
        public void onLocalMicrophoneClosedByAdmin() {
            AtomicToast atomicToast = AtomicToast.f87566a;
            Context context = this.f78680a;
            String string = context.getResources().getString(R$string.common_mute_audio_by_master);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            AtomicToast.m88196j(atomicToast, context, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatListener
        public void onLocalMicrophoneOpenedByAdmin(DeviceControlPolicy policy) {
            Intrinsics.checkNotNullParameter(policy, "policy");
            if (policy == DeviceControlPolicy.UNLOCK_ONLY) {
                AtomicToast atomicToast = AtomicToast.f87566a;
                Context context = this.f78680a;
                String string = context.getResources().getString(R$string.common_un_mute_audio_by_master);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                AtomicToast.m88196j(atomicToast, context, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AudienceView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m80851o0(AudienceView audienceView, DialogInterface dialogInterface) {
        audienceView.f78651n0 = false;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m80898e1() {
        this.f78644g0 = false;
        InterfaceC36209b interfaceC36209b = this.f78643f0;
        if (interfaceC36209b != null) {
            interfaceC36209b.mo80724a();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m80899f0(boolean z11) {
        AudiencePlayingRootView audiencePlayingRootView = null;
        if (z11) {
            AudiencePlayingRootView audiencePlayingRootView2 = this.f78633S;
            if (audiencePlayingRootView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audiencePlayingRootView");
            } else {
                audiencePlayingRootView = audiencePlayingRootView2;
            }
            audiencePlayingRootView.setVisibility(8);
        } else {
            AudiencePlayingRootView audiencePlayingRootView3 = this.f78633S;
            if (audiencePlayingRootView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audiencePlayingRootView");
            } else {
                audiencePlayingRootView = audiencePlayingRootView3;
            }
            audiencePlayingRootView.setVisibility(0);
        }
        getMediaStore().m80774e(z11);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m80900f1() {
        this.f78644g0 = true;
        InterfaceC36209b interfaceC36209b = this.f78643f0;
        if (interfaceC36209b != null) {
            interfaceC36209b.mo80725b();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$c */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C36210c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoQuality.values().length];
            try {
                iArr[VideoQuality.QUALITY_1080P.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoQuality.QUALITY_720P.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoQuality.QUALITY_540P.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoQuality.QUALITY_360P.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AudienceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m80802A0(AudienceView audienceView, View view) {
        C43852m.m96591c("B1FeedLive", "more", null, null, 12, null);
        Context context = audienceView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        new AudienceSettingsPanelDialog(context, audienceView.getAudienceStore()).show();
    }

    /* JADX INFO: renamed from: B1 */
    public static final void m80804B1(AudienceView audienceView) {
        BarrageStreamView barrageStreamView = audienceView.f78623I;
        if (barrageStreamView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
            barrageStreamView = null;
        }
        barrageStreamView.m79478p();
    }

    /* JADX INFO: renamed from: C1 */
    private final String m80806C1(VideoQuality videoQuality) {
        int i11 = C36210c.$EnumSwitchMapping$0[videoQuality.ordinal()];
        if (i11 == 1) {
            return "1080P";
        }
        if (i11 == 2) {
            return "720P";
        }
        if (i11 != 3) {
            return i11 != 4 ? "original" : "360P";
        }
        return "540P";
    }

    /* JADX INFO: renamed from: E0 */
    public static final Unit m80809E0(AudienceView audienceView) {
        LiveFlutterHelper liveFlutterHelper = LiveFlutterHelper.f79161a;
        LiveInfo liveInfo = audienceView.f78656s;
        if (liveInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo = null;
        }
        liveFlutterHelper.m81518c(liveInfo.getLiveID());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G0 */
    public static final void m80812G0(AudienceView audienceView, View view) {
        C43852m.m96591c("B1FeedLiveRoomDetail", FirebaseAnalytics.Event.SHARE, null, null, 12, null);
        KCLiveShareHelper kCLiveShareHelper = KCLiveShareHelper.f79190a;
        Context context = audienceView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LiveInfo liveInfo = audienceView.f78656s;
        if (liveInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo = null;
        }
        kCLiveShareHelper.m81579f(context, liveInfo.getLiveID());
    }

    /* JADX INFO: renamed from: N0 */
    public static final WindowInsetsCompat m80821N0(AudienceView audienceView, View v11, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        int i11 = insets.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
        Context context = audienceView.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        if (((Activity) context).getRequestedOrientation() == 1) {
            v11.setPaddingRelative(0, 0, 0, i11);
            return insets;
        }
        v11.setPaddingRelative(0, 0, EdgeToEdgeCompat.f48106a.m58271i(), 0);
        return insets;
    }

    /* JADX INFO: renamed from: V0 */
    public static final void m80831V0(AudienceView audienceView, List list) {
        ImageView imageView = audienceView.f78618D;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCoGuest");
            imageView = null;
        }
        audienceView.m80901g0(imageView, list.isEmpty());
    }

    /* JADX INFO: renamed from: n1 */
    public static final Unit m80849n1(final AudienceView audienceView, AtomicAlertDialog.DialogConfig init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        String string = audienceView.getResources().getString(R$string.common_audience_end_link_tips);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        init.m88090o(string);
        Pair pair = new Pair(audienceView.getResources().getString(R$string.common_end_link), AtomicAlertDialog.TextColorPreset.RED);
        String string2 = audienceView.getResources().getString(R$string.common_exit_live);
        AtomicAlertDialog.TextColorPreset textColorPreset = AtomicAlertDialog.TextColorPreset.PRIMARY;
        C39361f.m88100j(init, CollectionsKt.listOf((Object[]) new Pair[]{pair, new Pair(string2, textColorPreset), new Pair(audienceView.getResources().getString(R$string.common_cancel), textColorPreset)}), false, new Function3() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.j
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AudienceView.m80852o1(this.f78924b, (Dialog) obj, ((Integer) obj2).intValue(), (String) obj3);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o1 */
    public static final Unit m80852o1(AudienceView audienceView, Dialog dialog, int i11, String text) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(text, "text");
        if (i11 == 0) {
            audienceView.getCoGuestStore().disconnect(null);
            audienceView.getAudienceStore().getF82429k().m80790g(false);
        } else if (i11 == 1) {
            TUICore.notifyEvent("EVENT_KEY_LIVE_KIT", "EVENT_SUB_KEY_DESTROY_LIVE_VIEW", null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m80857s0(AudienceView audienceView, View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        KCAudiencePreviewView kCAudiencePreviewView = audienceView.f78665z;
        if (kCAudiencePreviewView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kcAudiencePreviewView");
            kCAudiencePreviewView = null;
        }
        jSONObject.put("type", kCAudiencePreviewView.getVisibility() == 8 ? "liveNow" : "preview");
        Unit unit = Unit.INSTANCE;
        C43852m.m96591c("B1FeedLive", "close", null, jSONObject, 4, null);
        audienceView.m80885W0();
    }

    /* JADX INFO: renamed from: y1 */
    public static final void m80867y1(AudienceView audienceView) {
        BarrageStreamView barrageStreamView = audienceView.f78623I;
        if (barrageStreamView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
            barrageStreamView = null;
        }
        barrageStreamView.m79475l();
    }

    /* JADX INFO: renamed from: A1 */
    public final void m80869A1(boolean z11) {
        FrameLayout frameLayout = this.f78630P;
        KCRiskView kCRiskView = null;
        BarrageStreamView barrageStreamView = null;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutSwitchOrientationButton");
            frameLayout = null;
        }
        frameLayout.setLayoutParams(m80903h0(z11));
        ImageView imageView = this.f78631Q;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageSwitchOrientationIcon");
            imageView = null;
        }
        imageView.setImageResource(z11 ? R$drawable.livekit_ic_switch_landscape_button : R$drawable.livekit_ic_switch_portrait_button);
        BarrageInputView barrageInputView = this.f78619E;
        if (barrageInputView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageInputView");
            barrageInputView = null;
        }
        barrageInputView.setVisibility(z11 ? 0 : 8);
        GiftButton giftButton = this.f78616B;
        if (giftButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonGift");
            giftButton = null;
        }
        giftButton.setVisibility(8);
        BarrageStreamView barrageStreamView2 = this.f78623I;
        if (barrageStreamView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
            barrageStreamView2 = null;
        }
        barrageStreamView2.setVisibility(z11 ? 0 : 8);
        ImageView imageView2 = this.f78615A;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageMore");
            imageView2 = null;
        }
        imageView2.setVisibility(z11 ? 0 : 8);
        LikeButton likeButton = this.f78617C;
        if (likeButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonLike");
            likeButton = null;
        }
        likeButton.setVisibility(z11 ? 0 : 8);
        AudienceListView audienceListView = this.f78622H;
        if (audienceListView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audienceListView");
            audienceListView = null;
        }
        ViewGroup.LayoutParams layoutParams = audienceListView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = z11 ? ScreenUtil.dip2px(60.0f) : ScreenUtil.dip2px(30.0f);
        AudienceListView audienceListView2 = this.f78622H;
        if (audienceListView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audienceListView");
            audienceListView2 = null;
        }
        audienceListView2.setScreenOrientation(z11);
        AudienceListView audienceListView3 = this.f78622H;
        if (audienceListView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audienceListView");
            audienceListView3 = null;
        }
        audienceListView3.setLayoutParams(layoutParams2);
        ImageView imageView3 = this.f78629O;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCompactExit");
            imageView3 = null;
        }
        ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.topMargin = z11 ? ScreenUtil.dip2px(55.0f) : ScreenUtil.dip2px(30.0f);
        ImageView imageView4 = this.f78629O;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCompactExit");
            imageView4 = null;
        }
        imageView4.setLayoutParams(layoutParams4);
        ImageView imageView5 = this.f78628N;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageStandardExit");
            imageView5 = null;
        }
        ViewGroup.LayoutParams layoutParams5 = imageView5.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
        layoutParams6.topMargin = z11 ? ScreenUtil.dip2px(55.0f) : ScreenUtil.dip2px(30.0f);
        ImageView imageView6 = this.f78628N;
        if (imageView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageStandardExit");
            imageView6 = null;
        }
        imageView6.setLayoutParams(layoutParams6);
        KCPeopleCountView kCPeopleCountView = this.f78636V;
        if (kCPeopleCountView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("peopleCountView");
            kCPeopleCountView = null;
        }
        ViewGroup.LayoutParams layoutParams7 = kCPeopleCountView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
        layoutParams8.topMargin = z11 ? ScreenUtil.dip2px(55.0f) : ScreenUtil.dip2px(30.0f);
        KCPeopleCountView kCPeopleCountView2 = this.f78636V;
        if (kCPeopleCountView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("peopleCountView");
            kCPeopleCountView2 = null;
        }
        kCPeopleCountView2.setLayoutParams(layoutParams8);
        ImageView imageView7 = this.f78625K;
        if (imageView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageFloatWindow");
            imageView7 = null;
        }
        ViewGroup.LayoutParams layoutParams9 = imageView7.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams9, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams9;
        layoutParams10.topMargin = z11 ? ScreenUtil.dip2px(55.0f) : ScreenUtil.dip2px(30.0f);
        ImageView imageView8 = this.f78625K;
        if (imageView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageFloatWindow");
            imageView8 = null;
        }
        imageView8.setLayoutParams(layoutParams10);
        ImageView imageView9 = this.f78626L;
        if (imageView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imagePreviewShare");
            imageView9 = null;
        }
        ViewGroup.LayoutParams layoutParams11 = imageView9.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams11, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) layoutParams11;
        layoutParams12.topMargin = z11 ? ScreenUtil.dip2px(55.0f) : ScreenUtil.dip2px(30.0f);
        ImageView imageView10 = this.f78626L;
        if (imageView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imagePreviewShare");
            imageView10 = null;
        }
        imageView10.setLayoutParams(layoutParams12);
        ImageView imageView11 = this.f78627M;
        if (imageView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imagePreviewReport");
            imageView11 = null;
        }
        ViewGroup.LayoutParams layoutParams13 = imageView11.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams13, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) layoutParams13;
        layoutParams14.topMargin = z11 ? ScreenUtil.dip2px(55.0f) : ScreenUtil.dip2px(30.0f);
        ImageView imageView12 = this.f78627M;
        if (imageView12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imagePreviewReport");
            imageView12 = null;
        }
        imageView12.setLayoutParams(layoutParams14);
        LiveInfoView liveInfoView = this.f78620F;
        if (liveInfoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomInfoView");
            liveInfoView = null;
        }
        ViewGroup.LayoutParams layoutParams15 = liveInfoView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams15, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams16 = (FrameLayout.LayoutParams) layoutParams15;
        layoutParams16.topMargin = z11 ? ScreenUtil.dip2px(52.0f) : ScreenUtil.dip2px(30.0f);
        LiveInfoView liveInfoView2 = this.f78620F;
        if (liveInfoView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomInfoView");
            liveInfoView2 = null;
        }
        liveInfoView2.setLayoutParams(layoutParams16);
        LiveInfoView liveInfoView3 = this.f78620F;
        if (liveInfoView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomInfoView");
            liveInfoView3 = null;
        }
        liveInfoView3.setScreenOrientation(z11);
        if (z11) {
            BarrageStreamView barrageStreamView3 = this.f78623I;
            if (barrageStreamView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
            } else {
                barrageStreamView = barrageStreamView3;
            }
            barrageStreamView.post(new Runnable() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.l
                @Override // java.lang.Runnable
                public final void run() {
                    AudienceView.m80804B1(this.f78926b);
                }
            });
        } else {
            KCRiskView kCRiskView2 = this.f78637W;
            if (kCRiskView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("riskView");
            } else {
                kCRiskView = kCRiskView2;
            }
            kCRiskView.m81669g();
        }
        m80931z1();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m80870B0(LiveInfo liveInfo) {
        NetworkInfoView networkInfoView = this.f78624J;
        if (networkInfoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("networkInfoView");
            networkInfoView = null;
        }
        networkInfoView.m79788s(liveInfo);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m80871C0(LiveInfo liveInfo) {
        KCPeopleCountView kCPeopleCountView = this.f78636V;
        KCRoomInfoService kCRoomInfoService = null;
        if (kCPeopleCountView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("peopleCountView");
            kCPeopleCountView = null;
        }
        KCRoomInfoService kCRoomInfoService2 = this.f78639b0;
        if (kCRoomInfoService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kcRoomInfoService");
        } else {
            kCRoomInfoService = kCRoomInfoService2;
        }
        kCPeopleCountView.m81661e(liveInfo, kCRoomInfoService);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m80872D0() {
        ImageView imageView = this.f78627M;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imagePreviewReport");
            imageView = null;
        }
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AudienceView.m80809E0(this.f78949b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m80873F0() {
        ImageView imageView = this.f78626L;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imagePreviewShare");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudienceView.m80812G0(this.f78925b, view);
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public final void m80874H0(LiveInfo liveInfo) {
        KCAudiencePreviewView kCAudiencePreviewView = this.f78665z;
        KCAudiencePreviewView kCAudiencePreviewView2 = null;
        if (kCAudiencePreviewView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kcAudiencePreviewView");
            kCAudiencePreviewView = null;
        }
        KCRoomInfoService kCRoomInfoService = this.f78639b0;
        if (kCRoomInfoService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kcRoomInfoService");
            kCRoomInfoService = null;
        }
        kCAudiencePreviewView.m81637o(liveInfo, kCRoomInfoService);
        KCAudiencePreviewView kCAudiencePreviewView3 = this.f78665z;
        if (kCAudiencePreviewView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kcAudiencePreviewView");
        } else {
            kCAudiencePreviewView2 = kCAudiencePreviewView3;
        }
        kCAudiencePreviewView2.setOnViewDisplayListener(new C36215h());
    }

    /* JADX INFO: renamed from: I0 */
    public final void m80875I0(LiveInfo liveInfo) {
        LiveInfoView liveInfoView = this.f78620F;
        KCRoomInfoService kCRoomInfoService = null;
        if (liveInfoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomInfoView");
            liveInfoView = null;
        }
        KCRoomInfoService kCRoomInfoService2 = this.f78639b0;
        if (kCRoomInfoService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kcRoomInfoService");
        } else {
            kCRoomInfoService = kCRoomInfoService2;
        }
        liveInfoView.m79935l(liveInfo, kCRoomInfoService);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m80876J0() {
        LiveInfo liveInfo = this.f78656s;
        LiveInfo liveInfo2 = null;
        if (liveInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo = null;
        }
        setAudienceStore(new C37144f(liveInfo.getLiveID()));
        mo80950b(getAudienceStore());
        getAudienceStore().getF82428j().m80782n();
        LiveCoreView liveCoreView = this.f78658t;
        if (liveCoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView = null;
        }
        if (liveCoreView.getParent() != null) {
            LiveCoreView liveCoreView2 = this.f78658t;
            if (liveCoreView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
                liveCoreView2 = null;
            }
            ViewParent parent = liveCoreView2.getParent();
            FrameLayout frameLayout = this.f78662w;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutLiveCoreView");
                frameLayout = null;
            }
            if (Intrinsics.areEqual(parent, frameLayout)) {
                FrameLayout frameLayout2 = this.f78662w;
                if (frameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutLiveCoreView");
                    frameLayout2 = null;
                }
                LiveCoreView liveCoreView3 = this.f78658t;
                if (liveCoreView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
                    liveCoreView3 = null;
                }
                frameLayout2.removeView(liveCoreView3);
            }
        }
        FrameLayout frameLayout3 = this.f78662w;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutLiveCoreView");
            frameLayout3 = null;
        }
        LiveCoreView liveCoreView4 = this.f78658t;
        if (liveCoreView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView4 = null;
        }
        frameLayout3.addView(liveCoreView4);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LiveCoreViewMaskBackgroundView liveCoreViewMaskBackgroundView = new LiveCoreViewMaskBackgroundView(context, null, 0, 6, null);
        this.f78660u = liveCoreViewMaskBackgroundView;
        liveCoreViewMaskBackgroundView.m80961j(getAudienceStore());
        FrameLayout frameLayout4 = this.f78663x;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutLiveCoreViewMask");
            frameLayout4 = null;
        }
        LiveCoreViewMaskBackgroundView liveCoreViewMaskBackgroundView2 = this.f78660u;
        if (liveCoreViewMaskBackgroundView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreViewMaskBackgroundView");
            liveCoreViewMaskBackgroundView2 = null;
        }
        frameLayout4.addView(liveCoreViewMaskBackgroundView2);
        m80897e0();
        C45496e.m100465b(21);
        LiveInfo liveInfo3 = this.f78656s;
        if (liveInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo3 = null;
        }
        String coverURL = liveInfo3.getCoverURL();
        LiveInfo liveInfo4 = this.f78656s;
        if (liveInfo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
        } else {
            liveInfo2 = liveInfo4;
        }
        m80904h1(coverURL, liveInfo2.getSeatLayoutTemplateID());
    }

    /* JADX INFO: renamed from: M0 */
    public final void m80878M0() {
        KCTradeCardView kCTradeCardView = this.f78638a0;
        KCTradeCardView kCTradeCardView2 = null;
        if (kCTradeCardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tradeCardView");
            kCTradeCardView = null;
        }
        KCRoomInfoService kCRoomInfoService = this.f78639b0;
        if (kCRoomInfoService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kcRoomInfoService");
            kCRoomInfoService = null;
        }
        kCTradeCardView.m81700i(kCRoomInfoService);
        KCTradeCardView kCTradeCardView3 = this.f78638a0;
        if (kCTradeCardView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tradeCardView");
        } else {
            kCTradeCardView2 = kCTradeCardView3;
        }
        kCTradeCardView2.setOnVisibilityChangeListener(new C36216i());
    }

    /* JADX INFO: renamed from: O0 */
    public final void m80879O0() {
        CoGuestRequestFloatView coGuestRequestFloatView = this.f78632R;
        if (coGuestRequestFloatView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("waitingCoGuestPassView");
            coGuestRequestFloatView = null;
        }
        coGuestRequestFloatView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudienceView.m80824P0(this.f78725b, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q0, reason: from getter */
    public final boolean getF78650m0() {
        return this.f78650m0;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m80883T0() {
        m80926w1();
        LiveCoreView liveCoreView = this.f78658t;
        if (liveCoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView = null;
        }
        liveCoreView.setBackgroundColor(getResources().getColor(R.color.transparent));
        if (this.f78650m0) {
            this.f78650m0 = false;
            m80923u1();
            getAudienceStore().m83082C();
            getAudienceStore().getF82419a().leaveLive(null);
            getAudienceStore().m83084E(new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null));
            LiveCoreView liveCoreView2 = this.f78658t;
            if (liveCoreView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
                liveCoreView2 = null;
            }
            liveCoreView2.setLocalVideoMuteImage(null, null);
            getMediaStore().m80781m();
            LiveInfoView liveInfoView = this.f78620F;
            if (liveInfoView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("roomInfoView");
                liveInfoView = null;
            }
            liveInfoView.m79931E();
            C37436d.m84222d();
            C40392a.m89013a();
            this.f78652o0 = null;
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: U0 */
    public final void m80884U0(final List<SeatUserInfo> list) {
        post(new Runnable() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.n
            @Override // java.lang.Runnable
            public final void run() {
                AudienceView.m80831V0(this.f78947b, list);
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public final void m80885W0() {
        f78614v0.m79404b("onExitButtonClick, isLoading:" + this.f78644g0);
        if (this.f78644g0) {
            return;
        }
        List<SeatUserInfo> value = getCoGuestState().getConnected().getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                String userID = ((SeatUserInfo) it.next()).getUserID();
                UserProfile value2 = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
                if (Intrinsics.areEqual(userID, value2 != null ? value2.getUserID() : null)) {
                    m80914m1();
                    return;
                }
            }
        }
        TUICore.notifyEvent("EVENT_KEY_LIVE_KIT", "EVENT_SUB_KEY_DESTROY_LIVE_VIEW", null);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m80886X0(boolean z11) {
        ImageView imageView = this.f78618D;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCoGuest");
            imageView = null;
        }
        imageView.setVisibility(z11 ? 8 : 0);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m80887Y0(boolean z11) {
        ImageView imageView = this.f78625K;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageFloatWindow");
            imageView = null;
        }
        imageView.setVisibility(z11 ? 8 : 0);
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m80888Z0(boolean z11) {
        LiveInfoView liveInfoView = this.f78620F;
        AudienceListView audienceListView = null;
        if (liveInfoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomInfoView");
            liveInfoView = null;
        }
        liveInfoView.setVisibility(z11 ? 8 : 0);
        if (z11) {
            AudienceListView audienceListView2 = this.f78622H;
            if (audienceListView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audienceListView");
            } else {
                audienceListView = audienceListView2;
            }
            audienceListView.setVisibility(8);
            return;
        }
        AudienceListView audienceListView3 = this.f78622H;
        if (audienceListView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audienceListView");
        } else {
            audienceListView = audienceListView3;
        }
        audienceListView.setVisibility(C37139a.f82409a.m83070d().getValue().booleanValue() ? 8 : 0);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m80890a1(boolean z11) {
        AudienceListView audienceListView = null;
        if (C37139a.f82409a.m83069c().getValue().booleanValue()) {
            AudienceListView audienceListView2 = this.f78622H;
            if (audienceListView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audienceListView");
            } else {
                audienceListView = audienceListView2;
            }
            audienceListView.setVisibility(8);
            return;
        }
        AudienceListView audienceListView3 = this.f78622H;
        if (audienceListView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audienceListView");
        } else {
            audienceListView = audienceListView3;
        }
        audienceListView.setVisibility(z11 ? 8 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX INFO: renamed from: b1 */
    public final void m80891b1() {
        CoGuestRequestFloatView coGuestRequestFloatView;
        CoGuestRequestFloatView coGuestRequestFloatView2;
        HashMap map = new HashMap();
        List<SeatUserInfo> value = getCoGuestState().getConnected().getValue();
        CoGuestRequestFloatView coGuestRequestFloatView3 = null;
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                String userID = ((SeatUserInfo) it.next()).getUserID();
                UserProfile value2 = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
                if (Intrinsics.areEqual(userID, value2 != null ? value2.getUserID() : null)) {
                    CoGuestRequestFloatView coGuestRequestFloatView4 = this.f78632R;
                    if (coGuestRequestFloatView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("waitingCoGuestPassView");
                    } else {
                        coGuestRequestFloatView3 = coGuestRequestFloatView4;
                    }
                    coGuestRequestFloatView3.setVisibility(8);
                    m80921s1();
                    map.put("EVENT_PARAMS_IS_LINKING", Boolean.TRUE);
                }
            }
            if (getViewState().m83114c().getValue().booleanValue()) {
                coGuestRequestFloatView2 = this.f78632R;
                if (coGuestRequestFloatView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("waitingCoGuestPassView");
                } else {
                    coGuestRequestFloatView3 = coGuestRequestFloatView2;
                }
                coGuestRequestFloatView3.setVisibility(0);
                m80893c0();
                map.put("EVENT_PARAMS_IS_LINKING", Boolean.TRUE);
            } else {
                coGuestRequestFloatView = this.f78632R;
                if (coGuestRequestFloatView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("waitingCoGuestPassView");
                } else {
                    coGuestRequestFloatView3 = coGuestRequestFloatView;
                }
                coGuestRequestFloatView3.setVisibility(8);
                m80913m0();
                map.put("EVENT_PARAMS_IS_LINKING", Boolean.FALSE);
            }
        } else if (getViewState().m83114c().getValue().booleanValue()) {
            coGuestRequestFloatView2 = this.f78632R;
            if (coGuestRequestFloatView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("waitingCoGuestPassView");
            } else {
                coGuestRequestFloatView3 = coGuestRequestFloatView2;
            }
            coGuestRequestFloatView3.setVisibility(0);
            m80893c0();
            map.put("EVENT_PARAMS_IS_LINKING", Boolean.TRUE);
        } else {
            coGuestRequestFloatView = this.f78632R;
            if (coGuestRequestFloatView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("waitingCoGuestPassView");
            } else {
                coGuestRequestFloatView3 = coGuestRequestFloatView;
            }
            coGuestRequestFloatView3.setVisibility(8);
            m80913m0();
            map.put("EVENT_PARAMS_IS_LINKING", Boolean.FALSE);
        }
        TUICore.notifyEvent("EVENT_KEY_LIVE_KIT", "EVENT_SUB_KEY_LINK_STATUS_CHANGE", map);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m80893c0() {
        ImageView imageView = this.f78618D;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCoGuest");
            imageView = null;
        }
        imageView.setImageResource(R$drawable.livekit_function_link_request);
        ImageView imageView3 = this.f78618D;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCoGuest");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudienceView.m80838d0(this.f78951b, view);
            }
        });
    }

    /* JADX INFO: renamed from: c1 */
    public final void m80894c1(VideoQuality videoQuality) {
        VideoQuality videoQuality2 = this.f78652o0;
        if (videoQuality2 != null && videoQuality2 != videoQuality) {
            AtomicToast atomicToast = AtomicToast.f87566a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getContext().getString(R$string.live_video_resolution_changed));
            Intrinsics.checkNotNull(videoQuality);
            sb2.append(m80806C1(videoQuality));
            AtomicToast.m88196j(atomicToast, context, sb2.toString(), AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
        }
        this.f78652o0 = videoQuality;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m80895d1(boolean z11) {
        FrameLayout frameLayout = this.f78630P;
        ImageView imageView = null;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutSwitchOrientationButton");
            frameLayout = null;
        }
        frameLayout.setVisibility(z11 ? 0 : 8);
        ImageView imageView2 = this.f78618D;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCoGuest");
            imageView2 = null;
        }
        imageView2.setVisibility(z11 ? 8 : 0);
        ImageView imageView3 = this.f78618D;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCoGuest");
        } else {
            imageView = imageView3;
        }
        imageView.setVisibility(8);
        if (z11) {
            m80877K0();
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        if (((Activity) context).getRequestedOrientation() == 0) {
            setScreenOrientation(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.f78646i0 = event.getX();
            this.f78647j0 = event.getY();
            this.f78649l0 = false;
        } else if (action == 2) {
            float x11 = event.getX() - this.f78646i0;
            float y11 = event.getY() - this.f78647j0;
            if (Math.abs(x11) > this.f78648k0 && Math.abs(x11) > Math.abs(y11)) {
                this.f78649l0 = true;
            }
        }
        if (!this.f78649l0) {
            return super.dispatchTouchEvent(event);
        }
        AudiencePlayingRootView audiencePlayingRootView = this.f78633S;
        if (audiencePlayingRootView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audiencePlayingRootView");
            audiencePlayingRootView = null;
        }
        return audiencePlayingRootView.dispatchTouchEvent(event);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m80902g1(int i11, boolean z11) {
        f78614v0.m79404b("setCoreViewLayoutParamsWhenLandscape:templateId:" + i11 + ",isPortrait:" + z11);
        FrameLayout frameLayout = this.f78662w;
        LiveInfo liveInfo = null;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutLiveCoreView");
            frameLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (i11 == 200 && z11) {
            layoutParams2.topMargin = ScreenUtil.dip2px(110.0f);
            int iM6183e = C5267e0.m6183e();
            layoutParams2.height = (iM6183e * 9) / 16;
            C44128b.m97259c("Live", "setCoreViewLayoutParamsWhenLandscape screenWidth:" + iM6183e);
        } else {
            layoutParams2.topMargin = 0;
            layoutParams2.height = -1;
        }
        FrameLayout frameLayout2 = this.f78662w;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutLiveCoreView");
            frameLayout2 = null;
        }
        frameLayout2.setLayoutParams(layoutParams2);
        LiveInfo liveInfo2 = this.f78656s;
        if (liveInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
        } else {
            liveInfo = liveInfo2;
        }
        m80904h1(liveInfo.getBackgroundURL(), i11);
    }

    @NotNull
    public final String getRoomId() {
        LiveInfo liveInfo = this.f78656s;
        if (liveInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo = null;
        }
        return liveInfo.getLiveID();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m80904h1(String str, int i11) {
        f78614v0.m79404b("setLayoutBackground->imageUrl: " + str + ", seatLayoutTemplateId:" + i11);
        ImageView imageView = null;
        if (i11 != 200) {
            C44386d.b bVar = new C44386d.b();
            bVar.m97911g(80.0f);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Context context = getContext();
            ImageView imageView2 = this.f78664y;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivVideoViewBackground");
            } else {
                imageView = imageView2;
            }
            C44385c.m97894d(context, imageView, str, bVar.m97910f());
            return;
        }
        Context context2 = getContext();
        ImageView imageView3 = this.f78664y;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivVideoViewBackground");
            imageView3 = null;
        }
        C44385c.m97891a(context2, imageView3);
        if (Build.VERSION.SDK_INT >= 31) {
            ImageView imageView4 = this.f78664y;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivVideoViewBackground");
                imageView4 = null;
            }
            imageView4.setRenderEffect(null);
        }
        ImageView imageView5 = this.f78664y;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivVideoViewBackground");
            imageView5 = null;
        }
        imageView5.setImageDrawable(null);
        ImageView imageView6 = this.f78664y;
        if (imageView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivVideoViewBackground");
        } else {
            imageView = imageView6;
        }
        imageView.setBackgroundColor(0);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m80905i0(@NotNull LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        f78614v0.m79404b("AudienceView init:" + this);
        this.f78656s = liveInfo;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LiveCoreView liveCoreView = new LiveCoreView(context, null, 0, null, 14, null);
        this.f78658t = liveCoreView;
        liveCoreView.setLiveId(liveInfo.getLiveID());
        this.f78639b0 = new KCRoomInfoService();
    }

    /* JADX INFO: renamed from: i1 */
    public final void m80906i1() {
        if (this.f78645h0 == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f78645h0 = new C36208a(this, context);
        }
        LiveCoreView liveCoreView = this.f78658t;
        if (liveCoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView = null;
        }
        liveCoreView.setVideoViewAdapter(this.f78645h0);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m80907j0(LiveInfo liveInfo) {
        AudienceListView audienceListView = this.f78622H;
        if (audienceListView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audienceListView");
            audienceListView = null;
        }
        audienceListView.m79422n(liveInfo);
    }

    /* JADX INFO: renamed from: j1 */
    public final void m80908j1(LiveUserInfo liveUserInfo) {
        if (this.f78642e0 == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f78642e0 = new AnchorManagerDialog(context, getAudienceStore());
        }
        AnchorManagerDialog anchorManagerDialog = this.f78642e0;
        if (anchorManagerDialog != null) {
            anchorManagerDialog.m81077d0(liveUserInfo);
        }
        AnchorManagerDialog anchorManagerDialog2 = this.f78642e0;
        if (anchorManagerDialog2 != null) {
            anchorManagerDialog2.show();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m80909k0(LiveInfo liveInfo) {
        BarrageInputView barrageInputView = this.f78619E;
        if (barrageInputView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageInputView");
            barrageInputView = null;
        }
        barrageInputView.mo79409b(liveInfo.getLiveID());
    }

    /* JADX INFO: renamed from: k1 */
    public final void m80910k1() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        new CancelRequestDialog(context, getAudienceStore()).show();
    }

    /* JADX INFO: renamed from: l1 */
    public final void m80912l1(LiveUserInfo liveUserInfo) {
        if (liveUserInfo == null || TextUtils.isEmpty(liveUserInfo.getUserID()) || getCoGuestState().getConnected().getValue().size() <= 1) {
            return;
        }
        String userID = liveUserInfo.getUserID();
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        if (Intrinsics.areEqual(userID, value != null ? value.getUserID() : null)) {
            m80908j1(liveUserInfo);
        } else {
            m80918q1(liveUserInfo);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m80913m0() {
        ImageView imageView = this.f78618D;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCoGuest");
            imageView = null;
        }
        imageView.setImageResource(R$drawable.livekit_function_link_default);
        ImageView imageView3 = this.f78618D;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCoGuest");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudienceView.m80848n0(this.f78920b, view);
            }
        });
    }

    /* JADX INFO: renamed from: m1 */
    public final void m80914m1() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AtomicAlertDialog atomicAlertDialog = new AtomicAlertDialog(context, null, 2, null);
        atomicAlertDialog.m88065u(new Function1() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AudienceView.m80849n1(this.f78923b, (AtomicAlertDialog.DialogConfig) obj);
            }
        });
        this.f78640c0 = atomicAlertDialog;
        atomicAlertDialog.m88054I();
    }

    @Override // ee0.C37144f.a
    public void onRoomDismissed(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        this.f78650m0 = false;
        AtomicAlertDialog atomicAlertDialog = this.f78640c0;
        if (atomicAlertDialog != null) {
            atomicAlertDialog.m88063s();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m80916p1() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        new StopCoGuestDialog(context, getAudienceStore()).show();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m80917q0(LiveInfo liveInfo) {
        FrameLayout frameLayout = this.f78661v;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutPlaying");
            frameLayout = null;
        }
        frameLayout.setVisibility(0);
        m80913m0();
        m80875I0(liveInfo);
        m80907j0(liveInfo);
        m80874H0(liveInfo);
        m80871C0(liveInfo);
        m80878M0();
        m80870B0(liveInfo);
        m80919r0();
        m80873F0();
        m80872D0();
        m80911l0(liveInfo);
        m80909k0(liveInfo);
        m80927x0(liveInfo);
        m80929y0(liveInfo);
        m80925w0(liveInfo);
        m80879O0();
        m80930z0();
    }

    /* JADX INFO: renamed from: q1 */
    public final void m80918q1(LiveUserInfo liveUserInfo) {
        if (this.f78641d0 == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f78641d0 = new UserInfoDialog(context, getAudienceStore());
        }
        UserInfoDialog userInfoDialog = this.f78641d0;
        if (userInfoDialog != null) {
            userInfoDialog.m81304K(liveUserInfo);
        }
        UserInfoDialog userInfoDialog2 = this.f78641d0;
        if (userInfoDialog2 != null) {
            userInfoDialog2.show();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m80919r0() {
        ImageView imageView = this.f78628N;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageStandardExit");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                AudienceView.m80857s0(this.f78771b, view);
            }
        });
        ImageView imageView3 = this.f78629O;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCompactExit");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudienceView.m80859t0(this.f78918b, view);
            }
        });
    }

    /* JADX INFO: renamed from: r1 */
    public final void m80920r1() {
        LiveCoreView liveCoreView = this.f78658t;
        if (liveCoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView = null;
        }
        LiveInfo liveInfo = this.f78656s;
        if (liveInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo = null;
        }
        liveCoreView.startPreviewLiveStream(liveInfo.getLiveID(), true, null);
    }

    /* JADX INFO: renamed from: s1 */
    public final void m80921s1() {
        ImageView imageView = this.f78618D;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCoGuest");
            imageView = null;
        }
        imageView.setImageResource(R$drawable.livekit_function_linked);
        ImageView imageView3 = this.f78618D;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCoGuest");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudienceView.m80860t1(this.f78952b, view);
            }
        });
    }

    public final void setAudienceContainerViewListenerList(@NotNull C37438a viewListenerList) {
        Intrinsics.checkNotNullParameter(viewListenerList, "viewListenerList");
        getAudienceStore().m83083D(viewListenerList);
    }

    public final void setViewObserver(@Nullable InterfaceC36209b interfaceC36209b) {
        this.f78643f0 = interfaceC36209b;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m80922u0() {
        View view = null;
        if (LiveRemoteConfigHelper.f79162a.m81520b()) {
            ImageView imageView = this.f78625K;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageFloatWindow");
            } else {
                view = imageView;
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AudienceView.m80863v0(this.f78922b, view2);
                }
            });
            return;
        }
        ImageView imageView2 = this.f78625K;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageFloatWindow");
            imageView2 = null;
        }
        imageView2.setVisibility(8);
        KCPeopleCountView kCPeopleCountView = this.f78636V;
        if (kCPeopleCountView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("peopleCountView");
            kCPeopleCountView = null;
        }
        ViewGroup.LayoutParams layoutParams = kCPeopleCountView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(ScreenUtil.dip2px(56.0f));
        KCPeopleCountView kCPeopleCountView2 = this.f78636V;
        if (kCPeopleCountView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("peopleCountView");
        } else {
            view = kCPeopleCountView2;
        }
        view.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m80923u1() {
        LiveCoreView liveCoreView = this.f78658t;
        LiveInfo liveInfo = null;
        if (liveCoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView = null;
        }
        LiveInfo liveInfo2 = this.f78656s;
        if (liveInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
        } else {
            liveInfo = liveInfo2;
        }
        liveCoreView.stopPreviewLiveStream(liveInfo.getLiveID());
    }

    /* JADX INFO: renamed from: w0 */
    public final void m80925w0(LiveInfo liveInfo) {
        GiftPlayView giftPlayView = this.f78621G;
        GiftPlayView giftPlayView2 = null;
        if (giftPlayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("giftPlayView");
            giftPlayView = null;
        }
        giftPlayView.mo79409b(liveInfo.getLiveID());
        C43992b f77880a = GiftStore.f77878b.getInstance().getF77880a();
        GiftPlayView giftPlayView3 = this.f78621G;
        if (giftPlayView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("giftPlayView");
        } else {
            giftPlayView2 = giftPlayView3;
        }
        giftPlayView2.setListener(new C36214g(f77880a));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m80927x0(LiveInfo liveInfo) {
        GiftButton giftButton = this.f78616B;
        if (giftButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonGift");
            giftButton = null;
        }
        giftButton.m79761d(liveInfo.getLiveID(), liveInfo.getLiveOwner().getUserID(), liveInfo.getLiveOwner().getUserName(), liveInfo.getLiveOwner().getAvatarURL());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m80928x1(boolean z11) {
        C44128b.m97259c("Live", "updateBarrageStreamViewMargin:" + z11);
        BarrageStreamView barrageStreamView = this.f78623I;
        BarrageStreamView barrageStreamView2 = null;
        if (barrageStreamView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
            barrageStreamView = null;
        }
        ViewGroup.LayoutParams layoutParams = barrageStreamView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.setMarginEnd(z11 ? ScreenUtil.dip2px(136.0f) : Math.max(RangesKt.coerceAtLeast(C5267e0.m6183e() - ScreenUtil.dip2px(300.0f), 0), ScreenUtil.dip2px(16.0f)));
        BarrageStreamView barrageStreamView3 = this.f78623I;
        if (barrageStreamView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
            barrageStreamView3 = null;
        }
        barrageStreamView3.setLayoutParams(layoutParams2);
        BarrageStreamView barrageStreamView4 = this.f78623I;
        if (barrageStreamView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
        } else {
            barrageStreamView2 = barrageStreamView4;
        }
        barrageStreamView2.post(new Runnable() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.e
            @Override // java.lang.Runnable
            public final void run() {
                AudienceView.m80867y1(this.f78919b);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final void m80929y0(LiveInfo liveInfo) {
        LikeButton likeButton = this.f78617C;
        if (likeButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonLike");
            likeButton = null;
        }
        likeButton.mo79409b(liveInfo.getLiveID());
    }

    /* JADX INFO: renamed from: z0 */
    public final void m80930z0() {
        ImageView imageView = this.f78615A;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageMore");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudienceView.m80802A0(this.f78946b, view);
            }
        });
    }

    public /* synthetic */ AudienceView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: L0 */
    public static final void m80818L0(AudienceView audienceView, View view) {
        String str;
        Context context = audienceView.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        boolean z11 = true;
        if (((Activity) context).getRequestedOrientation() != 1) {
            z11 = false;
        }
        if (z11) {
            str = "fullScreen";
        } else {
            str = "cancelFullScreen";
        }
        C43852m.m96591c("B1FeedLive", str, null, null, 12, null);
        audienceView.setScreenOrientation(!z11);
        if (z11) {
            KCRoomInfoService kCRoomInfoService = audienceView.f78639b0;
            if (kCRoomInfoService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kcRoomInfoService");
                kCRoomInfoService = null;
            }
            kCRoomInfoService.m81564i();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public static final void m80824P0(AudienceView audienceView, View view) {
        audienceView.m80910k1();
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m80838d0(AudienceView audienceView, View view) {
        audienceView.m80910k1();
    }

    private final Point getScreenPoint() {
        Object systemService = getContext().getSystemService(InterfaceC33953u5.f72199F);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m80848n0(final AudienceView audienceView, View view) {
        String userID;
        if (!audienceView.getViewState().m83114c().getValue().booleanValue()) {
            List<SeatUserInfo> value = audienceView.getCoGuestState().getConnected().getValue();
            if (!(value instanceof Collection) || !value.isEmpty()) {
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    String userID2 = ((SeatUserInfo) it.next()).getUserID();
                    UserProfile value2 = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
                    if (value2 != null) {
                        userID = value2.getUserID();
                    } else {
                        userID = null;
                    }
                    if (Intrinsics.areEqual(userID2, userID)) {
                        return;
                    }
                }
            }
            if (!audienceView.f78651n0) {
                audienceView.f78651n0 = true;
                Context context = audienceView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                TypeSelectDialog typeSelectDialog = new TypeSelectDialog(context, audienceView.getAudienceStore(), -1);
                typeSelectDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.g
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        AudienceView.m80851o0(this.f78921b, dialogInterface);
                    }
                });
                typeSelectDialog.show();
            }
        }
    }

    private final void setScreenOrientation(boolean isPortrait) {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context).setRequestedOrientation(isPortrait ? 1 : 0);
        m80869A1(isPortrait);
        LiveCoreViewMaskBackgroundView liveCoreViewMaskBackgroundView = this.f78660u;
        LiveInfo liveInfo = null;
        if (liveCoreViewMaskBackgroundView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreViewMaskBackgroundView");
            liveCoreViewMaskBackgroundView = null;
        }
        liveCoreViewMaskBackgroundView.setPortrait(isPortrait);
        LiveInfo liveInfo2 = this.f78656s;
        if (liveInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
        } else {
            liveInfo = liveInfo2;
        }
        m80902g1(liveInfo.getSeatLayoutTemplateID(), isPortrait);
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m80859t0(AudienceView audienceView, View view) {
        audienceView.m80885W0();
    }

    /* JADX INFO: renamed from: t1 */
    public static final void m80860t1(AudienceView audienceView, View view) {
        audienceView.m80916p1();
    }

    /* JADX INFO: renamed from: v0 */
    public static final void m80863v0(AudienceView audienceView, View view) {
        Context context = audienceView.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        if (((Activity) context).getRequestedOrientation() == 0) {
            audienceView.setScreenOrientation(true);
        }
        audienceView.getAudienceStore().m83105z();
    }

    /* JADX INFO: renamed from: K0 */
    public final void m80877K0() {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        boolean z11 = true;
        if (((Activity) context).getRequestedOrientation() != 1) {
            z11 = false;
        }
        m80869A1(z11);
        FrameLayout frameLayout = this.f78630P;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutSwitchOrientationButton");
            frameLayout = null;
        }
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudienceView.m80818L0(this.f78950b, view);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public final boolean m80881R0() {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        if (((Activity) context).getRequestedOrientation() == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m80882S0() {
        m80924v1();
        this.f78650m0 = true;
        getAudienceStore().m83086e();
        FrameLayout frameLayout = this.f78661v;
        LiveInfo liveInfo = null;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutPlaying");
            frameLayout = null;
        }
        frameLayout.setVisibility(8);
        m80900f1();
        getAudienceStore().getF82428j().m80782n();
        LiveCoreView liveCoreView = this.f78658t;
        if (liveCoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView = null;
        }
        liveCoreView.setLocalVideoMuteImage(getMediaState().m83107a().getValue(), getMediaState().m83110d().getValue());
        m80906i1();
        LiveListStore liveListStore = getLiveListStore();
        LiveInfo liveInfo2 = this.f78656s;
        if (liveInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
        } else {
            liveInfo = liveInfo2;
        }
        liveListStore.joinLive(liveInfo.getLiveID(), new C36217j());
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: c */
    public void mo80892c() {
        LayoutInflater.from(getContext()).inflate(R$layout.livekit_livestream_audience_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.fl_playing);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78661v = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.iv_co_guest);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78618D = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.iv_more);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78615A = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.btn_gift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f78616B = (GiftButton) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.btn_like);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f78617C = (LikeButton) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.barrage_input_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f78619E = (BarrageInputView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R$id.room_info_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f78620F = (LiveInfoView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R$id.audience_list_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f78622H = (AudienceListView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R$id.barrage_stream_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f78623I = (BarrageStreamView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R$id.network_info_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f78624J = (NetworkInfoView) viewFindViewById10;
        View viewFindViewById11 = findViewById(R$id.btn_waiting_pass);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f78632R = (CoGuestRequestFloatView) viewFindViewById11;
        View viewFindViewById12 = findViewById(R$id.gift_play_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f78621G = (GiftPlayView) viewFindViewById12;
        View viewFindViewById13 = findViewById(R$id.iv_float_window);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f78625K = (ImageView) viewFindViewById13;
        View viewFindViewById14 = findViewById(R$id.iv_preview_share);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f78626L = (ImageView) viewFindViewById14;
        View viewFindViewById15 = findViewById(R$id.iv_preview_report);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.f78627M = (ImageView) viewFindViewById15;
        View viewFindViewById16 = findViewById(R$id.iv_standard_exit_room);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        this.f78628N = (ImageView) viewFindViewById16;
        View viewFindViewById17 = findViewById(R$id.iv_compact_exit_room);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        this.f78629O = (ImageView) viewFindViewById17;
        View viewFindViewById18 = findViewById(R$id.video_view_background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        this.f78664y = (ImageView) viewFindViewById18;
        View viewFindViewById19 = findViewById(R$id.live_core_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
        this.f78662w = (FrameLayout) viewFindViewById19;
        View viewFindViewById20 = findViewById(R$id.live_core_view_mask);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "findViewById(...)");
        this.f78663x = (FrameLayout) viewFindViewById20;
        View viewFindViewById21 = findViewById(R$id.fl_playing_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById21, "findViewById(...)");
        this.f78633S = (AudiencePlayingRootView) viewFindViewById21;
        View viewFindViewById22 = findViewById(R$id.fl_switch_orientation_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById22, "findViewById(...)");
        this.f78630P = (FrameLayout) viewFindViewById22;
        View viewFindViewById23 = findViewById(R$id.img_switch_orientation_button_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById23, "findViewById(...)");
        this.f78631Q = (ImageView) viewFindViewById23;
        View viewFindViewById24 = findViewById(R$id.people_count_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById24, "findViewById(...)");
        this.f78636V = (KCPeopleCountView) viewFindViewById24;
        View viewFindViewById25 = findViewById(R$id.kc_audience_preview_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById25, "findViewById(...)");
        this.f78665z = (KCAudiencePreviewView) viewFindViewById25;
        View viewFindViewById26 = findViewById(R$id.cl_function);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById26, "findViewById(...)");
        this.f78635U = viewFindViewById26;
        View viewFindViewById27 = findViewById(R$id.risk_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById27, "findViewById(...)");
        this.f78637W = (KCRiskView) viewFindViewById27;
        View viewFindViewById28 = findViewById(R$id.trade_card_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById28, "findViewById(...)");
        this.f78638a0 = (KCTradeCardView) viewFindViewById28;
        AudiencePlayingRootView audiencePlayingRootView = this.f78633S;
        if (audiencePlayingRootView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audiencePlayingRootView");
            audiencePlayingRootView = null;
        }
        ViewCompat.setOnApplyWindowInsetsListener(audiencePlayingRootView, new OnApplyWindowInsetsListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.s
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return AudienceView.m80821N0(this.f78953b, view, windowInsetsCompat);
            }
        });
        m80922u0();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m80897e0() {
        MediaStore mediaStore = getMediaStore();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i11 = R$drawable.livekit_local_mute_image_multi;
        mediaStore.m80773d(context, i11, i11);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m80901g0(View view, boolean z11) {
        float f11;
        view.setEnabled(z11);
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        view.setAlpha(f11);
    }

    /* JADX INFO: renamed from: h0 */
    public final FrameLayout.LayoutParams m80903h0(boolean z11) {
        getScreenPoint();
        int iM6183e = C5267e0.m6183e();
        int iM6182d = C5267e0.m6182d();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        if (z11) {
            int iDip2px = ((iM6183e * 9) / 16) + ScreenUtil.dip2px(76.0f);
            layoutParams.rightMargin = ScreenUtil.dip2px(2.0f);
            layoutParams.topMargin = iDip2px;
            return layoutParams;
        }
        int iM58271i = ((iM6182d - ((iM6183e * 16) / 9)) - EdgeToEdgeCompat.f48106a.m58271i()) / 2;
        int iDip2px2 = iM6183e - ScreenUtil.dip2px(52.0f);
        layoutParams.rightMargin = iM58271i + ScreenUtil.dip2px(8.0f);
        layoutParams.topMargin = iDip2px2;
        return layoutParams;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m80911l0(LiveInfo liveInfo) {
        BarrageStreamView barrageStreamView = null;
        if (liveInfo.getSeatLayoutTemplateID() == 200) {
            int iM6183e = C5267e0.m6183e();
            int iM6182d = C5267e0.m6182d();
            int i11 = (iM6183e * 9) / 16;
            BarrageStreamView barrageStreamView2 = this.f78623I;
            if (barrageStreamView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
                barrageStreamView2 = null;
            }
            barrageStreamView2.getLayoutParams().height = ((((iM6182d - ScreenUtil.dip2px(110.0f)) - ScreenUtil.dip2px(70.0f)) - i11) - ScreenUtil.dip2px(12.0f)) - EdgeToEdgeCompat.f48106a.m58271i();
        }
        BarrageStreamView barrageStreamView3 = this.f78623I;
        if (barrageStreamView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
            barrageStreamView3 = null;
        }
        barrageStreamView3.m79473j(liveInfo.getLiveID(), liveInfo.getLiveOwner().getUserID());
        BarrageStreamView barrageStreamView4 = this.f78623I;
        if (barrageStreamView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
            barrageStreamView4 = null;
        }
        barrageStreamView4.setItemTypeDelegate(new C44394a());
        BarrageStreamView barrageStreamView5 = this.f78623I;
        if (barrageStreamView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
            barrageStreamView5 = null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        barrageStreamView5.m79479r(1, new GiftBarrageAdapter(context));
        BarrageStreamView barrageStreamView6 = this.f78623I;
        if (barrageStreamView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
        } else {
            barrageStreamView = barrageStreamView6;
        }
        barrageStreamView.setOnMessageClickListener(new C36213f());
        m80928x1(false);
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LiveCoreView liveCoreView = this.f78658t;
        if (liveCoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView = null;
        }
        liveCoreView.setVideoViewAdapter(null);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m80915p0() {
        boolean z11;
        LiveCanvas value = getAudienceStore().m83098q().getCanvas().getValue();
        String liveID = getLiveListState().getCurrentLive().getValue().getLiveID();
        LiveInfo liveInfo = this.f78656s;
        ImageView imageView = null;
        if (liveInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo = null;
        }
        if (Intrinsics.areEqual(liveID, liveInfo.getLiveID()) && value.getW() != 0 && value.getH() != 0) {
            int i11 = 0;
            if (value.getW() >= value.getH()) {
                z11 = true;
            } else {
                z11 = false;
            }
            m80895d1(z11);
            ImageView imageView2 = this.f78618D;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageCoGuest");
                imageView2 = null;
            }
            if (z11) {
                i11 = 8;
            }
            imageView2.setVisibility(i11);
            ImageView imageView3 = this.f78618D;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageCoGuest");
            } else {
                imageView = imageView3;
            }
            imageView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m80924v1() {
        getAudienceStore().m83085d(this);
        setSubscribeStateJob(C41696j.m91104d(this.f78634T, null, null, new AudienceView$subscribeObserver$1(this, null), 3, null));
        getLiveListStore().addLiveListListener(this.f78653p0);
        getLiveSeatStore().addLiveSeatEventListener(this.f78654q0);
        getCoGuestStore().addGuestListener(this.f78655r0);
        getBattleStore().addBattleListener(this.f78657s0);
        getLiveAudienceStore().addLiveAudienceListener(this.f78659t0);
    }

    /* JADX INFO: renamed from: w1 */
    public final void m80926w1() {
        getAudienceStore().m83081B(this);
        InterfaceC41775x1 f78705q = getF78705q();
        if (f78705q != null) {
            InterfaceC41775x1.a.m91377a(f78705q, null, 1, null);
        }
        getLiveListStore().removeLiveListListener(this.f78653p0);
        getLiveSeatStore().removeLiveSeatEventListener(this.f78654q0);
        getCoGuestStore().removeGuestListener(this.f78655r0);
        getBattleStore().removeBattleListener(this.f78657s0);
        getLiveAudienceStore().removeLiveAudienceListener(this.f78659t0);
        C41713n0.m91129e(this.f78634T, null, 1, null);
    }

    /* JADX INFO: renamed from: z1 */
    public final void m80931z1() {
        boolean z11;
        int i11;
        int i12;
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        int i13 = 0;
        boolean z12 = true;
        if (((Activity) context).getRequestedOrientation() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        KCAudiencePreviewView kCAudiencePreviewView = this.f78665z;
        ImageView imageView = null;
        if (kCAudiencePreviewView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kcAudiencePreviewView");
            kCAudiencePreviewView = null;
        }
        if (kCAudiencePreviewView.getVisibility() != 0) {
            z12 = false;
        }
        PreviewTopActionState previewTopActionStateM81313a = C36359x.m81313a(z12, z11, LiveRemoteConfigHelper.f79162a.m81520b());
        ImageView imageView2 = this.f78626L;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imagePreviewShare");
            imageView2 = null;
        }
        if (previewTopActionStateM81313a.getShowPreviewShare()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
        ImageView imageView3 = this.f78627M;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imagePreviewReport");
            imageView3 = null;
        }
        if (previewTopActionStateM81313a.getShowPreviewReport()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView3.setVisibility(i12);
        ImageView imageView4 = this.f78625K;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageFloatWindow");
        } else {
            imageView = imageView4;
        }
        if (!previewTopActionStateM81313a.getShowFloatWindow()) {
            i13 = 8;
        }
        imageView.setVisibility(i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AudienceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78634T = C41713n0.m91126b();
        this.f78648k0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f78653p0 = new C36219l(context);
        this.f78654q0 = new C36220m(context);
        this.f78655r0 = new C36212e(context);
        this.f78657s0 = new C36211d(context);
        this.f78659t0 = new C36218k();
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: a */
    public void mo80889a() {
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: e */
    public void mo80896e() {
    }
}
