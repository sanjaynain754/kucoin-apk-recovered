package com.trtc.uikit.livekit.features.anchorboardcast;

import ae0.DialogC0295f;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.app.FrameMetricsAggregator;
import com.blankj.utilcode.util.C5267e0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.trtc.tuikit.common.foregroundservice.VideoForegroundService;
import com.trtc.tuikit.common.permission.AbstractC35867d;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.common.p179ui.RoundFrameLayout;
import com.trtc.uikit.livekit.component.audiencelist.AudienceListView;
import com.trtc.uikit.livekit.component.barrage.BarrageInputView;
import com.trtc.uikit.livekit.component.barrage.BarrageStreamView;
import com.trtc.uikit.livekit.component.gift.GiftPlayView;
import com.trtc.uikit.livekit.component.giftaccess.store.GiftStore;
import com.trtc.uikit.livekit.component.giftaccess.view.GiftBarrageAdapter;
import com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView;
import com.trtc.uikit.livekit.component.pippanel.PIPPanelStore;
import com.trtc.uikit.livekit.component.roominfo.LiveInfoView;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorBattleStore;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import com.trtc.uikit.livekit.features.anchorboardcast.store.MediaStore;
import com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView;
import com.trtc.uikit.livekit.features.anchorboardcast.view.battle.panel.AnchorEndBattleDialog;
import com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.BattleInfoView;
import com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.BattleMemberInfoView;
import com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorCoGuestManageDialog;
import com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog;
import com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.ApplyCoGuestFloatView;
import com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.CoGuestIconView;
import com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.widgets.AnchorEmptySeatView;
import com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.widgets.CoGuestBackgroundWidgetsView;
import com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.widgets.CoGuestForegroundWidgetsView;
import com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.AnchorCoHostManageDialog;
import com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.widgets.CoHostBackgroundWidgetsView;
import com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.widgets.CoHostForegroundWidgetsView;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveEntranceConfigEntity;
import com.trtc.uikit.livekit.p180kc.helper.LiveRemoteConfigHelper;
import com.trtc.uikit.livekit.p180kc.roominfo.service.KCRoomInfoService;
import com.trtc.uikit.livekit.p180kc.widget.KCPeopleCountView;
import com.trtc.uikit.livekit.p180kc.widget.KCTradeCardView;
import fd0.C37436d;
import io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.AtomicAlertDialog;
import io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.C39361f;
import io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.barrage.Barrage;
import io.trtc.tuikit.atomicxcore.api.device.DeviceError;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.gift.Gift;
import io.trtc.tuikit.atomicxcore.api.live.BattleConfig;
import io.trtc.tuikit.atomicxcore.api.live.BattleEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.BattleListener;
import io.trtc.tuikit.atomicxcore.api.live.BattleRequestCallback;
import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.CoHostListener;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.HostListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveKickedOutReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveListListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.NoResponseReason;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.StopLiveCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.TakeSeatMode;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import io.trtc.tuikit.atomicxcore.api.view.CoreViewType;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import io.trtc.tuikit.atomicxcore.api.view.VideoViewAdapter;
import io.trtc.tuikit.atomicxcore.api.view.ViewLayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jd0.C40392a;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import ne0.C42816a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import rd0.C43992b;
import ro.C44128b;
import sd0.C44394a;
import uc0.C45152a;
import vc0.C45496e;
import vc0.C45497f;
import wd0.AnchorBattleState;
import wd0.AnchorState;
import wd0.BattleUser;
import wd0.C45802f;
import wd0.C45804h;
import wd0.C45812p;
import wd0.MediaState;
import zd0.DialogC46765d;

/* JADX INFO: compiled from: AnchorView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000Ç\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0005ILORU\b\u0007\u0018\u0000 Å\u00012\u00020\u0001:\u0002Å\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010W\u001a\u00020XH\u0014J6\u0010Y\u001a\u00020X2\u0006\u0010>\u001a\u00020?2\b\u0010Z\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\r2\u0014\u0010[\u001a\u0010\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020]\u0018\u00010\\J\u0006\u0010^\u001a\u00020XJ\u000e\u0010_\u001a\u00020X2\u0006\u0010`\u001a\u00020aJ\u000e\u0010b\u001a\u00020X2\u0006\u0010`\u001a\u00020aJ\u0006\u0010c\u001a\u00020dJ\u000e\u0010e\u001a\u00020X2\u0006\u0010f\u001a\u00020AJ\u0015\u0010g\u001a\u00020X2\b\u0010h\u001a\u0004\u0018\u00010A¢\u0006\u0002\u0010iJ\u0015\u0010j\u001a\u00020X2\b\u0010h\u001a\u0004\u0018\u00010A¢\u0006\u0002\u0010iJ\u0015\u0010k\u001a\u00020X2\b\u0010h\u001a\u0004\u0018\u00010A¢\u0006\u0002\u0010iJ\u0015\u0010l\u001a\u00020X2\b\u0010h\u001a\u0004\u0018\u00010A¢\u0006\u0002\u0010iJ\u0015\u0010m\u001a\u00020X2\b\u0010h\u001a\u0004\u0018\u00010A¢\u0006\u0002\u0010iJ\u0015\u0010n\u001a\u00020X2\b\u0010h\u001a\u0004\u0018\u00010A¢\u0006\u0002\u0010iJ\b\u0010o\u001a\u00020XH\u0014J\b\u0010p\u001a\u00020XH\u0014J\u0012\u0010q\u001a\u00020X2\b\u0010r\u001a\u0004\u0018\u00010sH\u0002J\u0012\u0010t\u001a\u00020X2\b\u0010Z\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010u\u001a\u00020XH\u0002J\b\u0010v\u001a\u00020XH\u0002J\b\u0010w\u001a\u00020XH\u0002J\b\u0010x\u001a\u00020XH\u0002J\u0010\u0010y\u001a\u00020X2\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010z\u001a\u00020XH\u0002J\b\u0010{\u001a\u00020XH\u0002J\b\u0010|\u001a\u00020XH\u0002J\b\u0010}\u001a\u00020XH\u0002J\b\u0010~\u001a\u00020XH\u0002J\b\u0010\u007f\u001a\u00020XH\u0002J\t\u0010\u0080\u0001\u001a\u00020XH\u0002J\t\u0010\u0081\u0001\u001a\u00020XH\u0002J\t\u0010\u0082\u0001\u001a\u00020XH\u0002J\t\u0010\u0083\u0001\u001a\u00020XH\u0002J\u0012\u0010\u0084\u0001\u001a\u00020X2\u0007\u0010\u0085\u0001\u001a\u00020AH\u0002J\u0012\u0010\u0086\u0001\u001a\u00020X2\u0007\u0010\u0087\u0001\u001a\u00020\u0007H\u0002J\t\u0010\u0088\u0001\u001a\u00020XH\u0002J\t\u0010\u0089\u0001\u001a\u00020XH\u0002J\t\u0010\u008a\u0001\u001a\u00020XH\u0002J\t\u0010\u008b\u0001\u001a\u00020XH\u0002J\t\u0010\u008c\u0001\u001a\u00020XH\u0002J\t\u0010\u008d\u0001\u001a\u00020XH\u0002J\t\u0010\u008e\u0001\u001a\u00020XH\u0002J\u0013\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0082@¢\u0006\u0003\u0010\u0091\u0001J\t\u0010\u0092\u0001\u001a\u00020XH\u0014J\t\u0010\u0093\u0001\u001a\u00020XH\u0014J\t\u0010\u0094\u0001\u001a\u00020XH\u0002J\u0013\u0010\u0095\u0001\u001a\u00020X2\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0002J\t\u0010\u0098\u0001\u001a\u00020XH\u0002J\u0015\u0010\u0099\u0001\u001a\u00020X2\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0002J$\u0010\u009c\u0001\u001a\u00020X2\u0007\u0010\u009d\u0001\u001a\u00020E2\u0007\u0010\u009e\u0001\u001a\u00020E2\u0007\u0010\u009f\u0001\u001a\u00020EH\u0002J\u0010\u0010 \u0001\u001a\u00020XH\u0083@¢\u0006\u0003\u0010\u0091\u0001J\u0010\u0010¡\u0001\u001a\u00020XH\u0082@¢\u0006\u0003\u0010\u0091\u0001J\u0010\u0010¢\u0001\u001a\u00020XH\u0082@¢\u0006\u0003\u0010\u0091\u0001J\u0015\u0010£\u0001\u001a\u00020X2\n\u0010¤\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0002J\t\u0010¦\u0001\u001a\u00020XH\u0002J\t\u0010§\u0001\u001a\u00020XH\u0002J\t\u0010¨\u0001\u001a\u00020XH\u0002J\u0010\u0010©\u0001\u001a\u00020XH\u0082@¢\u0006\u0003\u0010\u0091\u0001J\u0010\u0010ª\u0001\u001a\u00020XH\u0082@¢\u0006\u0003\u0010\u0091\u0001J\u0010\u0010«\u0001\u001a\u00020XH\u0082@¢\u0006\u0003\u0010\u0091\u0001J\t\u0010¬\u0001\u001a\u00020XH\u0002J\u001a\u0010\u00ad\u0001\u001a\u00020X2\u0007\u0010®\u0001\u001a\u00020\u00192\u0006\u0010f\u001a\u00020AH\u0002J\u001f\u0010¯\u0001\u001a\u00020X2\u0014\u0010[\u001a\u0010\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020]\u0018\u00010\\H\u0002J\t\u0010°\u0001\u001a\u00020XH\u0002J\u0010\u0010±\u0001\u001a\u00020XH\u0082@¢\u0006\u0003\u0010\u0091\u0001J\u0010\u0010²\u0001\u001a\u00020XH\u0082@¢\u0006\u0003\u0010\u0091\u0001J\u0010\u0010³\u0001\u001a\u00020XH\u0082@¢\u0006\u0003\u0010\u0091\u0001J\u0010\u0010´\u0001\u001a\u00020XH\u0082@¢\u0006\u0003\u0010\u0091\u0001J\u0010\u0010µ\u0001\u001a\u00020XH\u0082@¢\u0006\u0003\u0010\u0091\u0001J\t\u0010¶\u0001\u001a\u00020XH\u0002J\t\u0010·\u0001\u001a\u00020XH\u0002J\u001a\u0010¸\u0001\u001a\u00020X2\u000f\u0010¹\u0001\u001a\n\u0012\u0005\u0012\u00030»\u00010º\u0001H\u0002J\u0010\u0010¼\u0001\u001a\u00020XH\u0082@¢\u0006\u0003\u0010\u0091\u0001J\t\u0010½\u0001\u001a\u00020AH\u0002J\t\u0010¾\u0001\u001a\u00020XH\u0002J \u0010¿\u0001\u001a\u00020X2\n\b\u0002\u0010À\u0001\u001a\u00030Á\u00012\t\b\u0002\u0010Â\u0001\u001a\u00020AH\u0002J\u0014\u0010Ã\u0001\u001a\u00020X2\t\b\u0002\u0010Â\u0001\u001a\u00020AH\u0002J\t\u0010Ä\u0001\u001a\u00020XH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082.¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020EX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020EX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u00020IX\u0082\u0004¢\u0006\u0004\n\u0002\u0010JR\u0010\u0010K\u001a\u00020LX\u0082\u0004¢\u0006\u0004\n\u0002\u0010MR\u0010\u0010N\u001a\u00020OX\u0082\u0004¢\u0006\u0004\n\u0002\u0010PR\u0010\u0010Q\u001a\u00020RX\u0082\u0004¢\u0006\u0004\n\u0002\u0010SR\u0010\u0010T\u001a\u00020UX\u0082\u0004¢\u0006\u0004\n\u0002\u0010V¨\u0006Æ\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "behavior", "Lcom/trtc/uikit/livekit/features/anchorboardcast/RoomBehavior;", "layoutCoreViewContainer", "Lcom/trtc/uikit/livekit/common/ui/RoundFrameLayout;", "liveCoreView", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;", "layoutComponentsContainer", "Landroid/widget/FrameLayout;", "layoutHeaderContainer", "imageEndLive", "Landroid/widget/ImageView;", "imageFloatWindow", "viewCoGuest", "Landroid/view/View;", "viewCoHost", "viewBattle", "audienceListView", "Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;", "roomInfoView", "Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "peopleCountView", "Lcom/trtc/uikit/livekit/kc/widget/KCPeopleCountView;", "tradeCardView", "Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView;", "kcRoomInfoService", "Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;", "networkInfoView", "Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;", "barrageInputView", "Lcom/trtc/uikit/livekit/component/barrage/BarrageInputView;", "barrageStreamView", "Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;", "giftPlayView", "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;", "applyCoGuestFloatView", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;", "anchorCoHostManageDialog", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/cohost/panel/AnchorCoHostManageDialog;", "processConnectionDialog", "Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;", "processBattleDialog", "battleCountdownDialog", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownDialog;", "anchorManagerDialog", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;", "anchorEndBattleDialog", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/AnchorEndBattleDialog;", "realEndBattleDialog", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "isDestroy", "", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "EVENT_KEY_TIME_LIMIT", "", "EVENT_SUB_KEY_COUNTDOWN_START", "EVENT_SUB_KEY_COUNTDOWN_END", "coHostListener", "com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$coHostListener$1", "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$coHostListener$1;", "coGuestListener", "com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$coGuestListener$1", "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$coGuestListener$1;", "battleListener", "com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$battleListener$1", "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$battleListener$1;", "liveListListener", "com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$liveListListener$1", "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$liveListListener$1;", "liveAudienceListener", "com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$liveAudienceListener$1", "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$liveAudienceListener$1;", "initView", "", "init", "coreView", ReportDataTable.COLUMN_PARAMS, "", "", "unInit", "addAnchorViewListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorViewListener;", "removeAnchorViewListener", "getState", "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorBoardcastState;", "enablePipMode", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "disableHeaderLiveData", "disable", "(Ljava/lang/Boolean;)V", "disableHeaderVisitorCnt", "disableFooterCoGuest", "disableFooterCoHost", "disableFooterBattle", "disableFooterSoundEffect", "onDetachedFromWindow", "refreshView", "showCoGuestManageDialog", "userInfo", "Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;", "initLiveCoreView", "createVideoMuteBitmap", "createOrEnterRoom", "enterRoom", "createRoom", "startLocalPreview", "initComponentView", "initNetworkView", "initSettingsPanel", "showAlertUserLiveTips", "initAudienceListView", "initEndLiveStreamView", "initFloatWindowView", "initRoomInfoView", "initPeopleCountView", "initTradeCardView", "updateBarrageStreamViewMargin", "isTradeCardVisible", "setCoreViewLayoutParamsWhenLandscape", "template", "initBarrageInputView", "initBarrageStreamView", "initCoGuestView", "initCoHostView", "initBattleView", "initApplyCoGuestFloatView", "initGiftPlayView", "loadLiveEntranceConfig", "Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addObserver", "removeObserver", "showLiveStreamEndDialog", "exitLive", "store", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "onRoomExitEndStatistics", "onReceivedCoHostRequest", "receivedConnectionRequest", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "showConnectionRequestDialog", "content", TUIConstantDefine.AVATAR_URL, "roomId", "onCoHostUserListChange", "onBattleUserChange", "onCoGuestUserListChange", "onReceivedBattleRequestChange", "user", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/BattleUser;", "showBattleCountdownDialog", "dismissBattleCountdownDialog", "finishActivity", "onInWaitingChange", "onBattleStartChange", "onBattleResultDisplay", "updateBattleView", "enableView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "parseParams", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "onDisableLiveDataChange", "onDisableVisitorCntChange", "ondDisableCoGuestChange", "onDisableCoHostChange", "onDisableBattleChange", "startForegroundService", "stopForegroundService", "onCoGuestApplicantsChange", "applicants", "", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "onPipModeObserver", "isPipModeAbnormalPhoneModel", "checkCameraStateAndRestore", "endLive", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;", "isFinish", "leaveLive", "showEndBattleDialog", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAnchorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorView.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/AnchorView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1802:1\n827#2:1803\n855#2,2:1804\n*S KotlinDebug\n*F\n+ 1 AnchorView.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/AnchorView\n*L\n1254#1:1803\n1254#1:1804,2\n*E\n"})
public final class AnchorView extends BasicView {

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f78019e0 = new Companion(null);

    /* JADX INFO: renamed from: A */
    @NotNull
    public final InterfaceC41709m0 f78020A;

    /* JADX INFO: renamed from: B */
    public KCPeopleCountView f78021B;

    /* JADX INFO: renamed from: C */
    public KCTradeCardView f78022C;

    /* JADX INFO: renamed from: D */
    public KCRoomInfoService f78023D;

    /* JADX INFO: renamed from: E */
    public NetworkInfoView f78024E;

    /* JADX INFO: renamed from: F */
    public BarrageInputView f78025F;

    /* JADX INFO: renamed from: G */
    public BarrageStreamView f78026G;

    /* JADX INFO: renamed from: H */
    public GiftPlayView f78027H;

    /* JADX INFO: renamed from: I */
    public ApplyCoGuestFloatView f78028I;

    /* JADX INFO: renamed from: J */
    @Nullable
    public AnchorCoHostManageDialog f78029J;

    /* JADX INFO: renamed from: K */
    @Nullable
    public AtomicAlertDialog f78030K;

    /* JADX INFO: renamed from: L */
    @Nullable
    public AtomicAlertDialog f78031L;

    /* JADX INFO: renamed from: M */
    @Nullable
    public DialogC46765d f78032M;

    /* JADX INFO: renamed from: N */
    @Nullable
    public AnchorManagerDialog f78033N;

    /* JADX INFO: renamed from: O */
    @Nullable
    public AnchorEndBattleDialog f78034O;

    /* JADX INFO: renamed from: P */
    @Nullable
    public AtomicAlertDialog f78035P;

    /* JADX INFO: renamed from: Q */
    public LiveInfo f78036Q;

    /* JADX INFO: renamed from: R */
    public boolean f78037R;

    /* JADX INFO: renamed from: S */
    @Nullable
    public InterfaceC41775x1 f78038S;

    /* JADX INFO: renamed from: T */
    @NotNull
    public final String f78039T;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final String f78040U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final String f78041V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final C35997c f78042W;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final C35995b f78043a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final C35979a f78044b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final C36013o f78045c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final C36012n f78046d0;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final LiveKitLogger f78047n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public RoomBehavior f78048o;

    /* JADX INFO: renamed from: p */
    public RoundFrameLayout f78049p;

    /* JADX INFO: renamed from: q */
    public LiveCoreView f78050q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f78051r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f78052s;

    /* JADX INFO: renamed from: t */
    public ImageView f78053t;

    /* JADX INFO: renamed from: u */
    public ImageView f78054u;

    /* JADX INFO: renamed from: v */
    public View f78055v;

    /* JADX INFO: renamed from: w */
    public View f78056w;

    /* JADX INFO: renamed from: x */
    public View f78057x;

    /* JADX INFO: renamed from: y */
    public AudienceListView f78058y;

    /* JADX INFO: renamed from: z */
    public LiveInfoView f78059z;

    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$Companion;", "", "<init>", "()V", "ADMINISTRATOR", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$a */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J \u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J \u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¨\u0006\u0018"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$battleListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;", "onBattleStarted", "", "battleInfo", "Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;", "inviter", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "invitees", "", "onBattleEnded", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/BattleEndedReason;", "onUserJoinBattle", "battleID", "", "battleUser", "onUserExitBattle", "onBattleRequestReceived", "invitee", "onBattleRequestCancelled", "onBattleRequestTimeout", "onBattleRequestAccept", "onBattleRequestReject", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35979a extends BattleListener {
        public C35979a() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleEnded(BattleInfo battleInfo, BattleEndedReason reason) {
            AnchorBattleStore f78177j;
            Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
            AnchorView.this.f78047n.m79404b(hashCode() + " onBattleEnded:[battleInfo:" + battleInfo + ']');
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null || (f78177j = f78203h.getF78177j()) == null) {
                return;
            }
            f78177j.m80200j(battleInfo);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleRequestAccept(String battleID, SeatUserInfo inviter, SeatUserInfo invitee) {
            AnchorBattleStore f78177j;
            Intrinsics.checkNotNullParameter(battleID, "battleID");
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(invitee, "invitee");
            AnchorView.this.f78047n.m79404b(hashCode() + " onBattleRequestAccept:[battleID:" + battleID + ",inviter:" + inviter + ",invitee:" + invitee + ']');
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null || (f78177j = f78203h.getF78177j()) == null) {
                return;
            }
            f78177j.m80201m(invitee);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleRequestCancelled(String battleID, SeatUserInfo inviter, SeatUserInfo invitee) {
            AnchorBattleStore f78177j;
            Intrinsics.checkNotNullParameter(battleID, "battleID");
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(invitee, "invitee");
            AnchorView.this.f78047n.m79404b(hashCode() + " onBattleRequestCancelled:[battleID:" + battleID + ",inviter:" + inviter + ",invitee:" + invitee + ']');
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null || (f78177j = f78203h.getF78177j()) == null) {
                return;
            }
            f78177j.m80202n(inviter);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleRequestReceived(String battleID, SeatUserInfo inviter, SeatUserInfo invitee) {
            AnchorBattleStore f78177j;
            Intrinsics.checkNotNullParameter(battleID, "battleID");
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(invitee, "invitee");
            AnchorView.this.f78047n.m79404b(hashCode() + " onBattleRequestReceived:[battleID:" + battleID + ",inviter:" + inviter + ",invitee:" + invitee + ']');
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null || (f78177j = f78203h.getF78177j()) == null) {
                return;
            }
            f78177j.m80203o(battleID, inviter);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleRequestReject(String battleID, SeatUserInfo inviter, SeatUserInfo invitee) {
            AnchorBattleStore f78177j;
            Intrinsics.checkNotNullParameter(battleID, "battleID");
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(invitee, "invitee");
            AnchorView.this.f78047n.m79404b(hashCode() + " onBattleRequestReject:[battleID:" + battleID + ",inviter:" + inviter + ",invitee:" + invitee + ']');
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null || (f78177j = f78203h.getF78177j()) == null) {
                return;
            }
            f78177j.m80204p(invitee);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleRequestTimeout(String battleID, SeatUserInfo inviter, SeatUserInfo invitee) {
            AnchorBattleStore f78177j;
            Intrinsics.checkNotNullParameter(battleID, "battleID");
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(invitee, "invitee");
            AnchorView.this.f78047n.m79404b(hashCode() + " onBattleRequestTimeout:[battleID:" + battleID + ",inviter:" + inviter + ",invitee:" + invitee + ']');
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null || (f78177j = f78203h.getF78177j()) == null) {
                return;
            }
            f78177j.m80205q(inviter, invitee);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleStarted(BattleInfo battleInfo, SeatUserInfo inviter, List<SeatUserInfo> invitees) {
            AnchorBattleStore f78177j;
            Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(invitees, "invitees");
            AnchorView.this.f78047n.m79404b(hashCode() + " onBattleStarted:[battleInfo:" + battleInfo + ']');
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null || (f78177j = f78203h.getF78177j()) == null) {
                return;
            }
            f78177j.m80206r(battleInfo, inviter, invitees);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onUserExitBattle(String battleID, SeatUserInfo battleUser) {
            AnchorBattleStore f78177j;
            Intrinsics.checkNotNullParameter(battleID, "battleID");
            Intrinsics.checkNotNullParameter(battleUser, "battleUser");
            AnchorView.this.f78047n.m79404b(hashCode() + " onUserExitBattle:[battleID:" + battleID + ",battleUser:" + battleUser + ']');
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null || (f78177j = f78203h.getF78177j()) == null) {
                return;
            }
            f78177j.m80211w(battleUser);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onUserJoinBattle(String battleID, SeatUserInfo battleUser) {
            Intrinsics.checkNotNullParameter(battleID, "battleID");
            Intrinsics.checkNotNullParameter(battleUser, "battleUser");
            AnchorView.this.f78047n.m79404b(hashCode() + " onUserJoinBattle:[battleID:" + battleID + ",battleUser:" + battleUser + ']');
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$a0 */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$onReceivedBattleRequestChange$1$1$1$1$1$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35980a0 implements CompletionHandler {
        public C35980a0() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            AnchorView.this.f78047n.m79403a("respondToBattle failed:code:" + code + ",desc:" + desc);
            ErrorLocalized.f77561a.onError(code);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
            AnchorBattleStore f78177j;
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null || (f78177j = f78203h.getF78177j()) == null) {
                return;
            }
            f78177j.m80210v();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$b */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$coGuestListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/HostListener;", "onGuestApplicationReceived", "", "guestUser", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "onGuestApplicationCancelled", "onGuestApplicationProcessedByOtherHost", "hostUser", "onHostInvitationResponded", "isAccept", "", "onHostInvitationNoResponse", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35995b extends HostListener {
        public C35995b() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.HostListener
        public void onGuestApplicationCancelled(LiveUserInfo guestUser) {
            Intrinsics.checkNotNullParameter(guestUser, "guestUser");
            AnchorView.this.f78047n.m79404b(hashCode() + " onUserConnectionCancelled:[inviterUser:" + guestUser + ']');
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.HostListener
        public void onGuestApplicationProcessedByOtherHost(LiveUserInfo guestUser, LiveUserInfo hostUser) {
            Intrinsics.checkNotNullParameter(guestUser, "guestUser");
            Intrinsics.checkNotNullParameter(hostUser, "hostUser");
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.HostListener
        public void onGuestApplicationReceived(LiveUserInfo guestUser) throws Exception {
            Intrinsics.checkNotNullParameter(guestUser, "guestUser");
            AnchorView.this.f78047n.m79404b(hashCode() + " onGuestApplicationReceived:[inviterUser:" + new Gson().toJson(guestUser) + ']');
            CoGuestStore.Companion companion = CoGuestStore.INSTANCE;
            LiveInfo liveInfo = AnchorView.this.f78036Q;
            if (liveInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
                liveInfo = null;
            }
            CoGuestStore coGuestStoreCreate = companion.create(liveInfo.getLiveID());
            CoHostStore.Companion companion2 = CoHostStore.INSTANCE;
            LiveInfo liveInfo2 = AnchorView.this.f78036Q;
            if (liveInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
                liveInfo2 = null;
            }
            CoHostStore coHostStoreCreate = companion2.create(liveInfo2.getLiveID());
            if (coHostStoreCreate.getCoHostState().getInvitees().getValue().isEmpty() && coHostStoreCreate.getCoHostState().getConnected().getValue().isEmpty() && coHostStoreCreate.getCoHostState().getApplicant().getValue() == null) {
                return;
            }
            coGuestStoreCreate.rejectApplication(guestUser.getUserID(), null);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.HostListener
        public void onHostInvitationNoResponse(LiveUserInfo guestUser, NoResponseReason reason) {
            Intrinsics.checkNotNullParameter(guestUser, "guestUser");
            Intrinsics.checkNotNullParameter(reason, "reason");
            if (reason == NoResponseReason.TIMEOUT) {
                AnchorView.this.f78047n.m79404b(hashCode() + " onUserConnectionAccepted:[guestUser:" + guestUser + ']');
                Context contextM79397b = ContextProvider.m79397b();
                AtomicToast atomicToast = AtomicToast.f87566a;
                Intrinsics.checkNotNull(contextM79397b);
                String string = contextM79397b.getResources().getString(R$string.common_voiceroom_take_seat_timeout);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                AtomicToast.m88196j(atomicToast, contextM79397b, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
            }
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.HostListener
        public void onHostInvitationResponded(boolean isAccept, LiveUserInfo guestUser) {
            Intrinsics.checkNotNullParameter(guestUser, "guestUser");
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$b0 */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$onReceivedBattleRequestChange$1$1$1$2$1$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35996b0 implements CompletionHandler {
        public C35996b0() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            AnchorView.this.f78047n.m79403a("respondToBattle failed:code:" + code + ",desc:" + desc);
            ErrorLocalized.f77561a.onError(code);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
            AnchorBattleStore f78177j;
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null || (f78177j = f78203h.getF78177j()) == null) {
                return;
            }
            f78177j.m80210v();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$c */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\r"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$coHostListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/CoHostListener;", "onCoHostRequestReceived", "", "inviter", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "extensionInfo", "", "onCoHostRequestCancelled", "invitee", "onCoHostRequestAccepted", "onCoHostRequestRejected", "onCoHostRequestTimeout", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35997c extends CoHostListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f78067b;

        public C35997c(Context context) {
            this.f78067b = context;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostListener
        public void onCoHostRequestAccepted(SeatUserInfo invitee) {
            C45802f f78176i;
            Intrinsics.checkNotNullParameter(invitee, "invitee");
            AnchorView.this.f78047n.m79404b(hashCode() + " onCrossRoomConnectionAccepted:[invitee:" + invitee + ']');
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null || (f78176i = f78203h.getF78176i()) == null) {
                return;
            }
            f78176i.m101146f(invitee);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostListener
        public void onCoHostRequestCancelled(SeatUserInfo inviter, SeatUserInfo invitee) {
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            AnchorView.this.f78047n.m79404b(hashCode() + " onCrossRoomConnectionCancelled:[inviter:" + inviter);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostListener
        public void onCoHostRequestReceived(SeatUserInfo inviter, String extensionInfo) throws Exception {
            C45802f f78176i;
            InterfaceC41678w<Boolean> interfaceC41678wM101183c;
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
            AnchorView.this.f78047n.m79404b(hashCode() + " onCoHostRequestReceived:[inviter:" + new Gson().toJson(inviter) + ']');
            CoGuestStore.Companion companion = CoGuestStore.INSTANCE;
            LiveInfo liveInfo = AnchorView.this.f78036Q;
            if (liveInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
                liveInfo = null;
            }
            CoGuestStore coGuestStoreCreate = companion.create(liveInfo.getLiveID());
            CoHostStore.Companion companion2 = CoHostStore.INSTANCE;
            LiveInfo liveInfo2 = AnchorView.this.f78036Q;
            if (liveInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
                liveInfo2 = null;
            }
            CoHostStore coHostStoreCreate = companion2.create(liveInfo2.getLiveID());
            ArrayList arrayList = new ArrayList();
            for (SeatUserInfo seatUserInfo : coGuestStoreCreate.getCoGuestState().getConnected().getValue()) {
                String userID = seatUserInfo.getUserID();
                UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
                if (!Intrinsics.areEqual(userID, value != null ? value.getUserID() : null)) {
                    String liveID = seatUserInfo.getLiveID();
                    LiveInfo liveInfo3 = AnchorView.this.f78036Q;
                    if (liveInfo3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
                        liveInfo3 = null;
                    }
                    if (Intrinsics.areEqual(liveID, liveInfo3.getLiveID())) {
                        arrayList.add(seatUserInfo);
                    }
                }
            }
            if (!arrayList.isEmpty() || !coGuestStoreCreate.getCoGuestState().getApplicants().getValue().isEmpty() || !coGuestStoreCreate.getCoGuestState().getInvitees().getValue().isEmpty()) {
                coHostStoreCreate.rejectHostConnection(inviter.getLiveID(), null);
                return;
            }
            MediaState f78202g = AnchorView.this.getF78202g();
            if (f78202g == null || (interfaceC41678wM101183c = f78202g.m101183c()) == null || !interfaceC41678wM101183c.getValue().booleanValue()) {
                String string = this.f78067b.getString(R$string.common_connect_inviting_append, inviter.getUserName());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                AnchorView.this.m80130i2(string, inviter.getAvatarURL(), inviter.getLiveID());
                AnchorStore f78203h = AnchorView.this.getF78203h();
                if (f78203h == null || (f78176i = f78203h.getF78176i()) == null) {
                    return;
                }
                f78176i.m101147g(inviter);
            }
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostListener
        public void onCoHostRequestRejected(SeatUserInfo invitee) {
            C45802f f78176i;
            Intrinsics.checkNotNullParameter(invitee, "invitee");
            AnchorView.this.f78047n.m79404b(hashCode() + " onConnectionRequestReject:[invitee:" + invitee + ']');
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null || (f78176i = f78203h.getF78176i()) == null) {
                return;
            }
            f78176i.m101148h(invitee);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostListener
        public void onCoHostRequestTimeout(SeatUserInfo inviter, SeatUserInfo invitee) {
            C45802f f78176i;
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(invitee, "invitee");
            AnchorView.this.f78047n.m79404b(hashCode() + " onCrossRoomConnectionTimeout:[inviter:" + inviter + ",invitee:" + invitee);
            AtomicAlertDialog atomicAlertDialog = AnchorView.this.f78030K;
            if (atomicAlertDialog != null) {
                atomicAlertDialog.m88063s();
            }
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null || (f78176i = f78203h.getF78176i()) == null) {
                return;
            }
            f78176i.m101149i(inviter, invitee);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$c0 */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35998c0<T> implements InterfaceC41635f {
        public C35998c0() {
        }

        /* JADX INFO: renamed from: a */
        public final Object m80145a(boolean z11, Continuation<? super Unit> continuation) {
            View view = AnchorView.this.f78055v;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewCoGuest");
                view = null;
            }
            view.setVisibility(z11 ? 8 : 0);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m80145a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$d */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001e\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u000b"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$createOrEnterRoom$1", "Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;", "createCoGuestView", "Landroid/view/View;", "seatInfo", "Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;", "viewLayer", "Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;", "createCoHostView", "createBattleView", "createBattleContainerView", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35999d implements VideoViewAdapter {
        @Override // io.trtc.tuikit.atomicxcore.api.view.VideoViewAdapter
        public View createCoGuestView(final SeatInfo seatInfo, ViewLayer viewLayer) {
            SeatUserInfo userInfo;
            if (TextUtils.isEmpty((seatInfo == null || (userInfo = seatInfo.getUserInfo()) == null) ? null : userInfo.getUserID())) {
                if (viewLayer != ViewLayer.BACKGROUND) {
                    return null;
                }
                Context context = AnchorView.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                AnchorEmptySeatView anchorEmptySeatView = new AnchorEmptySeatView(context, null, 0, 6, null);
                if (AnchorView.this.getF78203h() != null && seatInfo != null) {
                    AnchorStore f78203h = AnchorView.this.getF78203h();
                    Intrinsics.checkNotNull(f78203h);
                    anchorEmptySeatView.m80471g(f78203h, seatInfo);
                }
                return anchorEmptySeatView;
            }
            if (viewLayer == ViewLayer.BACKGROUND) {
                Context context2 = AnchorView.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                CoGuestBackgroundWidgetsView coGuestBackgroundWidgetsView = new CoGuestBackgroundWidgetsView(context2, null, 0, 6, null);
                if (AnchorView.this.getF78203h() != null && seatInfo != null) {
                    AnchorStore f78203h2 = AnchorView.this.getF78203h();
                    Intrinsics.checkNotNull(f78203h2);
                    coGuestBackgroundWidgetsView.m80475g(f78203h2, seatInfo);
                }
                return coGuestBackgroundWidgetsView;
            }
            Context context3 = AnchorView.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            CoGuestForegroundWidgetsView coGuestForegroundWidgetsView = new CoGuestForegroundWidgetsView(context3, null, 0, 6, null);
            if (AnchorView.this.getF78203h() != null && seatInfo != null) {
                AnchorStore f78203h3 = AnchorView.this.getF78203h();
                Intrinsics.checkNotNull(f78203h3);
                coGuestForegroundWidgetsView.m80483j(f78203h3, seatInfo);
            }
            final AnchorView anchorView = AnchorView.this;
            coGuestForegroundWidgetsView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnchorView.C35999d.m80147b(anchorView, seatInfo, view);
                }
            });
            return coGuestForegroundWidgetsView;
        }

        public C35999d() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.view.VideoViewAdapter
        public View createBattleContainerView() {
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null) {
                return null;
            }
            BattleInfoView battleInfoView = new BattleInfoView(AnchorView.this.getF78197b(), null, 2, null);
            battleInfoView.m80259b(f78203h);
            return battleInfoView;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.view.VideoViewAdapter
        public View createBattleView(SeatInfo seatInfo) {
            if (AnchorView.this.getF78203h() == null || seatInfo == null) {
                return null;
            }
            BattleMemberInfoView battleMemberInfoView = new BattleMemberInfoView(AnchorView.this.getF78197b(), null, 2, null);
            AnchorStore f78203h = AnchorView.this.getF78203h();
            Intrinsics.checkNotNull(f78203h);
            battleMemberInfoView.m80333q(f78203h, seatInfo.getUserInfo().getUserID());
            return battleMemberInfoView;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.view.VideoViewAdapter
        public View createCoHostView(SeatInfo seatInfo, ViewLayer viewLayer) {
            if (AnchorView.this.getF78203h() == null || seatInfo == null) {
                return null;
            }
            if (viewLayer == ViewLayer.BACKGROUND) {
                CoHostBackgroundWidgetsView coHostBackgroundWidgetsView = new CoHostBackgroundWidgetsView(AnchorView.this.getF78197b(), null, 0, 6, null);
                AnchorStore f78203h = AnchorView.this.getF78203h();
                Intrinsics.checkNotNull(f78203h);
                coHostBackgroundWidgetsView.m80558g(f78203h, seatInfo);
                return coHostBackgroundWidgetsView;
            }
            CoHostForegroundWidgetsView coHostForegroundWidgetsView = new CoHostForegroundWidgetsView(AnchorView.this.getF78197b(), null, 0, 6, null);
            AnchorStore f78203h2 = AnchorView.this.getF78203h();
            Intrinsics.checkNotNull(f78203h2);
            coHostForegroundWidgetsView.m80571k(f78203h2, seatInfo);
            return coHostForegroundWidgetsView;
        }

        /* JADX INFO: renamed from: b */
        public static final void m80147b(AnchorView anchorView, SeatInfo seatInfo, View view) {
            anchorView.m80128h2(seatInfo);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$d0 */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$showEndBattleDialog$1$2$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36000d0 implements CompletionHandler {
        public C36000d0() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            AnchorView.this.f78047n.m79403a("AtomicAlertDialog terminateBattle failed:code:" + code + ",desc:" + desc);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$e */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$createRoom$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;", "onSuccess", "", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36001e implements LiveInfoCompletionHandler {
        public C36001e() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            AnchorView.this.f78047n.m79403a("startLiveStream failed:error:" + code + ",desc:" + desc);
            PIPPanelStore.f77996b.sharedInstance().getF77998a().m99362g(false);
            ErrorLocalized.f77561a.onError(code);
            AnchorView.this.m80123f1();
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler
        public void onSuccess(LiveInfo liveInfo) {
            Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
            AnchorView.this.f78036Q = liveInfo;
            Context f78197b = AnchorView.this.getF78197b();
            Intrinsics.checkNotNull(f78197b, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) f78197b;
            if (activity.isFinishing() || activity.isDestroyed()) {
                AnchorView.this.f78047n.m79406d("activity is exit, stopLiveStream");
                LiveListStore.INSTANCE.shared().endLive(null);
                TUICore.notifyEvent(TUIConstants.Privacy.EVENT_ROOM_STATE_CHANGED, TUIConstants.Privacy.EVENT_SUB_KEY_ROOM_STATE_STOP, null);
                TUICore.notifyEvent(AnchorView.this.f78039T, AnchorView.this.f78041V, null);
                LiveCoreView liveCoreView = AnchorView.this.f78050q;
                if (liveCoreView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
                    liveCoreView = null;
                }
                liveCoreView.setLocalVideoMuteImage(null, null);
                return;
            }
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h != null) {
                f78203h.m80225E(liveInfo);
            }
            KCRoomInfoService kCRoomInfoService = AnchorView.this.f78023D;
            if (kCRoomInfoService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kcRoomInfoService");
                kCRoomInfoService = null;
            }
            kCRoomInfoService.m81565j(liveInfo, AnchorView.this.f78020A);
            AnchorView.this.m80138t1();
            AnchorView.this.m80124f2();
            TUICore.notifyEvent(AnchorView.this.f78039T, AnchorView.this.f78040U, null);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$e0 */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$showLiveStreamEndDialog$1$1$1$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36002e0 implements CompletionHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AnchorStore f78072a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Dialog f78073b;

        public C36002e0(AnchorStore anchorStore, Dialog dialog) {
            this.f78072a = anchorStore;
            this.f78073b = dialog;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.f78073b.dismiss();
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
            this.f78072a.getF78177j().m80208t();
            this.f78073b.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$f */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$enterRoom$1$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;", "onSuccess", "", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36003f implements LiveInfoCompletionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LiveListStore f78075b;

        public C36003f(LiveListStore liveListStore) {
            this.f78075b = liveListStore;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            PIPPanelStore.f77996b.sharedInstance().getF77998a().m99362g(false);
            ErrorLocalized.f77561a.onError(code);
            AnchorView.this.m80123f1();
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler
        public void onSuccess(LiveInfo liveInfo) {
            Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
            AnchorView.this.f78036Q = liveInfo;
            AnchorView.this.setCoreViewLayoutParamsWhenLandscape(liveInfo.getSeatLayoutTemplateID());
            KCRoomInfoService kCRoomInfoService = AnchorView.this.f78023D;
            if (kCRoomInfoService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kcRoomInfoService");
                kCRoomInfoService = null;
            }
            kCRoomInfoService.m81565j(liveInfo, AnchorView.this.f78020A);
            AnchorView.this.m80082G2(liveInfo);
            Context f78197b = AnchorView.this.getF78197b();
            Intrinsics.checkNotNull(f78197b, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) f78197b;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                AnchorStore f78203h = AnchorView.this.getF78203h();
                if (f78203h != null) {
                    f78203h.m80225E(liveInfo);
                }
                AnchorView.this.m80138t1();
                return;
            }
            AnchorView.this.f78047n.m79406d("activity is exit");
            LiveCoreView liveCoreView = AnchorView.this.f78050q;
            if (liveCoreView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
                liveCoreView = null;
            }
            liveCoreView.setVideoViewAdapter(null);
            if (liveInfo.getKeepOwnerOnSeat()) {
                this.f78075b.endLive(null);
            } else {
                this.f78075b.leaveLive(null);
            }
            TUICore.notifyEvent(TUIConstants.Privacy.EVENT_ROOM_STATE_CHANGED, TUIConstants.Privacy.EVENT_SUB_KEY_ROOM_STATE_STOP, null);
            TUICore.notifyEvent(AnchorView.this.f78039T, AnchorView.this.f78041V, null);
            LiveCoreView liveCoreView2 = AnchorView.this.f78050q;
            if (liveCoreView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
                liveCoreView2 = null;
            }
            liveCoreView2.setLocalVideoMuteImage(null, null);
            PIPPanelStore.f77996b.sharedInstance().getF77998a().m99362g(false);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$f0 */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$startLocalPreview$1", "Lcom/trtc/tuikit/common/permission/PermissionCallback;", "onGranted", "", "onDenied", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36004f0 extends AbstractC35867d {

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$f0$a */
        /* JADX INFO: compiled from: AnchorView.kt */
        @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$startLocalPreview$1$onGranted$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements CompletionHandler {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AnchorView f78077a;

            /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$f0$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: AnchorView.kt */
            @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$startLocalPreview$1$onGranted$1$onSuccess$1", "Lcom/trtc/tuikit/common/permission/PermissionCallback;", "onGranted", "", "onDenied", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final class C47002a extends AbstractC35867d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AnchorView f78078a;

                public C47002a(AnchorView anchorView) {
                    this.f78078a = anchorView;
                }

                @Override // com.trtc.tuikit.common.permission.AbstractC35867d
                /* JADX INFO: renamed from: a */
                public void mo79393a() {
                    this.f78078a.f78047n.m79403a("requestMicrophonePermissions:[onDenied]");
                }

                @Override // com.trtc.tuikit.common.permission.AbstractC35867d
                /* JADX INFO: renamed from: b */
                public void mo79394b() {
                    this.f78078a.f78047n.m79404b("requestMicrophonePermissions success");
                    DeviceStore.INSTANCE.shared().openLocalMicrophone(null);
                }
            }

            public a(AnchorView anchorView) {
                this.f78077a = anchorView;
            }

            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onFailure(int code, String desc) {
                Intrinsics.checkNotNullParameter(desc, "desc");
                this.f78077a.f78047n.m79403a("startCamera failed:code:" + code + ",desc:" + desc);
            }

            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onSuccess() {
                this.f78077a.f78047n.m79404b("startCamera success, requestMicrophonePermissions");
                C45497f c45497f = C45497f.f102528a;
                Context contextM79397b = ContextProvider.m79397b();
                Intrinsics.checkNotNullExpressionValue(contextM79397b, "getApplicationContext(...)");
                c45497f.m100467b(contextM79397b, new C47002a(this.f78077a));
            }
        }

        public C36004f0() {
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: a */
        public void mo79393a() {
            AnchorView.this.f78047n.m79403a("requestCameraPermissions:[onDenied]");
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: b */
        public void mo79394b() {
            AnchorView.this.f78047n.m79404b("requestCameraPermissions:[onGranted]");
            DeviceStore.INSTANCE.shared().openLocalCamera(true, new a(AnchorView.this));
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$g */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$exitLive$1", "Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;", "onSuccess", "", "statisticsData", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36005g implements StopLiveCompletionHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AnchorStore f78079a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AnchorView f78080b;

        public C36005g(AnchorStore anchorStore, AnchorView anchorView) {
            this.f78079a = anchorStore;
            this.f78080b = anchorView;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.StopLiveCompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.f78080b.m80114b2();
            AnchorStore.m80219w(this.f78079a, null, 1, null);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.StopLiveCompletionHandler
        public void onSuccess(TUILiveListManager.LiveStatisticsData statisticsData) {
            Intrinsics.checkNotNullParameter(statisticsData, "statisticsData");
            this.f78079a.m80223C(statisticsData);
            this.f78080b.m80114b2();
            AnchorStore.m80219w(this.f78079a, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$h */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$initAudienceListView$1$1", "Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$OnUserItemClickListener;", "onUserItemClick", "", "userInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36006h implements AudienceListView.InterfaceC35869a {
        public C36006h() {
        }

        @Override // com.trtc.uikit.livekit.component.audiencelist.AudienceListView.InterfaceC35869a
        /* JADX INFO: renamed from: a */
        public void mo79430a(LiveUserInfo userInfo) {
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h != null) {
                new DialogC0295f(AnchorView.this.getF78197b(), f78203h, userInfo).show();
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$i */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$initBarrageStreamView$1", "Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$OnMessageClickListener;", "onMessageClick", "", "userInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36007i implements BarrageStreamView.InterfaceC35881a {
        public C36007i() {
        }

        @Override // com.trtc.uikit.livekit.component.barrage.BarrageStreamView.InterfaceC35881a
        /* JADX INFO: renamed from: a */
        public void mo79480a(LiveUserInfo userInfo) {
            AnchorStore f78203h;
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            if (TextUtils.isEmpty(userInfo.getUserID())) {
                return;
            }
            String userID = userInfo.getUserID();
            UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
            if (Intrinsics.areEqual(userID, value != null ? value.getUserID() : null) || Intrinsics.areEqual(userInfo.getUserID(), "administrator") || StringsKt.startsWith$default(userInfo.getUserID(), "guest_", false, 2, (Object) null) || (f78203h = AnchorView.this.getF78203h()) == null) {
                return;
            }
            new DialogC0295f(AnchorView.this.getF78197b(), f78203h, userInfo).show();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$j */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$initBattleView$1$1", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/AnchorEndBattleDialog$OnEndBattleListener;", "onEndBattle", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36008j implements AnchorEndBattleDialog.InterfaceC36067a {
        public C36008j() {
        }

        @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.battle.panel.AnchorEndBattleDialog.InterfaceC36067a
        /* JADX INFO: renamed from: a */
        public void mo80150a() {
            AnchorView.this.m80134m2();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$k */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\bH\u0016¨\u0006\r"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$initBattleView$1$3", "Lio/trtc/tuikit/atomicxcore/api/live/BattleRequestCallback;", "onSuccess", "", "battleInfo", "Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;", "resultMap", "", "", "", "onError", "code", "desc", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36009k implements BattleRequestCallback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<String> f78085b;

        public C36009k(List<String> list) {
            this.f78085b = list;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleRequestCallback
        public void onError(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            AnchorView.this.f78047n.m79403a("requestBattle failed:code:" + code + ",desc:" + desc);
            ErrorLocalized.f77561a.onError(code);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleRequestCallback
        public void onSuccess(BattleInfo battleInfo, Map<String, Integer> resultMap) {
            AnchorBattleStore f78177j;
            Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
            Intrinsics.checkNotNullParameter(resultMap, "resultMap");
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null || (f78177j = f78203h.getF78177j()) == null) {
                return;
            }
            f78177j.m80209u(battleInfo.getBattleID(), this.f78085b);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$l */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\r"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$initGiftPlayView$1", "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$TUIGiftPlayViewListener;", "onReceiveGift", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;", "gift", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "giftCount", "", TUIConstants.TUICalling.SENDER, "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "onPlayGiftAnimation", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36010l implements GiftPlayView.InterfaceC35914c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C43992b f78087b;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$l$a */
        /* JADX INFO: compiled from: AnchorView.kt */
        @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$initGiftPlayView$1$onPlayGiftAnimation$1", "Lcom/trtc/uikit/livekit/component/giftaccess/service/GiftCacheService$Callback;", "", "onResult", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", DbParams.KEY_CHANNEL_RESULT, "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements C43992b.a<String> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ GiftPlayView f78088a;

            public a(GiftPlayView giftPlayView) {
                this.f78088a = giftPlayView;
            }

            @Override // rd0.C43992b.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void mo80151a(int i11, String str) {
                GiftPlayView giftPlayView;
                if (i11 != 0 || str == null || (giftPlayView = this.f78088a) == null) {
                    return;
                }
                giftPlayView.m79649t(str);
            }
        }

        public C36010l(C43992b c43992b) {
            this.f78087b = c43992b;
        }

        @Override // com.trtc.uikit.livekit.component.gift.GiftPlayView.InterfaceC35914c
        /* JADX INFO: renamed from: a */
        public void mo79652a(GiftPlayView giftPlayView, Gift gift) {
            Intrinsics.checkNotNullParameter(gift, "gift");
            this.f78087b.m96953d(gift.getResourceURL(), new a(giftPlayView));
        }

        @Override // com.trtc.uikit.livekit.component.gift.GiftPlayView.InterfaceC35914c
        /* JADX INFO: renamed from: b */
        public void mo79653b(GiftPlayView giftPlayView, Gift gift, int i11, LiveUserInfo sender) {
            Intrinsics.checkNotNullParameter(gift, "gift");
            Intrinsics.checkNotNullParameter(sender, "sender");
            Barrage barrage = new Barrage(null, null, 0L, 0L, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
            AnchorView anchorView = AnchorView.this;
            barrage.setTextContent("gift");
            barrage.getSender().setUserID(sender.getUserID());
            barrage.getSender().setUserName(TextUtils.isEmpty(sender.getUserName()) ? sender.getUserID() : sender.getUserName());
            barrage.getSender().setAvatarURL(sender.getAvatarURL());
            barrage.setExtensionInfo(MapsKt.hashMapOf(TuplesKt.m90091to("gift_view_type", "1"), TuplesKt.m90091to("gift_name", gift.getName()), TuplesKt.m90091to("gift_count", String.valueOf(i11)), TuplesKt.m90091to("gift_icon_url", gift.getIconURL()), TuplesKt.m90091to("gift_receiver_username", anchorView.getContext().getString(R$string.common_gift_me))));
            BarrageStreamView barrageStreamView = AnchorView.this.f78026G;
            if (barrageStreamView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
                barrageStreamView = null;
            }
            barrageStreamView.m79474k(barrage);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$m */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$initTradeCardView$1", "Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView$OnVisibilityChangeListener;", "onVisibilityChanged", "", "isVisible", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36011m implements KCTradeCardView.InterfaceC36444a {
        public C36011m() {
        }

        @Override // com.trtc.uikit.livekit.p180kc.widget.KCTradeCardView.InterfaceC36444a
        /* JADX INFO: renamed from: a */
        public void mo80153a(boolean z11) {
            AnchorView.this.m80087J2(z11);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$n */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$liveAudienceListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;", "onAudienceMessageDisabled", "", "audience", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "isDisable", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36012n extends LiveAudienceListener {
        public C36012n() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener
        public void onAudienceMessageDisabled(LiveUserInfo audience, boolean isDisable) {
            C45812p f78174g;
            Intrinsics.checkNotNullParameter(audience, "audience");
            AnchorView.this.f78047n.m79404b(hashCode() + " onAudienceMessageDisabled:[userID:" + audience.getUserID() + ",isDisable:" + isDisable + ']');
            AnchorStore f78203h = AnchorView.this.getF78203h();
            if (f78203h == null || (f78174g = f78203h.getF78174g()) == null) {
                return;
            }
            f78174g.m101195i(audience.getUserID(), isDisable);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$o */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$liveListListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;", "onLiveEnded", "", "liveID", "", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;", "message", "onKickedOutOfLive", "Lio/trtc/tuikit/atomicxcore/api/live/LiveKickedOutReason;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36013o extends LiveListListener {
        public C36013o() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListListener
        public void onKickedOutOfLive(String liveID, LiveKickedOutReason reason, String message) {
            Intrinsics.checkNotNullParameter(liveID, "liveID");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(message, "message");
            LiveInfo liveInfo = AnchorView.this.f78036Q;
            if (liveInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
                liveInfo = null;
            }
            if (Intrinsics.areEqual(liveID, liveInfo.getLiveID())) {
                AtomicToast atomicToast = AtomicToast.f87566a;
                Context f78197b = AnchorView.this.getF78197b();
                String string = AnchorView.this.getF78197b().getString(R$string.common_kicked_out_of_room_by_owner);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                AtomicToast.m88196j(atomicToast, f78197b, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
                AnchorView.m80008c1(AnchorView.this, null, false, 3, null);
            }
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListListener
        public void onLiveEnded(String liveID, LiveEndedReason reason, String message) {
            Intrinsics.checkNotNullParameter(liveID, "liveID");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(message, "message");
            LiveInfo liveInfo = AnchorView.this.f78036Q;
            if (liveInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
                liveInfo = null;
            }
            if (Intrinsics.areEqual(liveID, liveInfo.getLiveID())) {
                AnchorView.this.m80113b1(reason, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$p */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36014p<T> implements InterfaceC41635f {
        public C36014p() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
            final AnchorView anchorView = AnchorView.this;
            anchorView.post(new Runnable() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.k0
                @Override // java.lang.Runnable
                public final void run() {
                    AnchorView.C36014p.m80155f(anchorView);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final void m80155f(AnchorView anchorView) {
            anchorView.m80090L2();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$q */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36015q<T> implements InterfaceC41635f {
        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
            AtomicAlertDialog atomicAlertDialog;
            AnchorEndBattleDialog anchorEndBattleDialog;
            InterfaceC41678w<List<BattleUser>> interfaceC41678wM101126b;
            List<BattleUser> value;
            View view = null;
            if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                AnchorBattleState f78200e = AnchorView.this.getF78200e();
                if (f78200e != null && (interfaceC41678wM101126b = f78200e.m101126b()) != null && (value = interfaceC41678wM101126b.getValue()) != null) {
                    AnchorView anchorView = AnchorView.this;
                    for (BattleUser battleUser : value) {
                        UserProfile value2 = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
                        if (TextUtils.equals(value2 != null ? value2.getUserID() : null, battleUser.getUserId())) {
                            View view2 = anchorView.f78056w;
                            if (view2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewCoHost");
                            } else {
                                view = view2;
                            }
                            anchorView.m80111a1(view, false);
                            break;
                        }
                    }
                }
            } else {
                AnchorView anchorView2 = AnchorView.this;
                View view3 = anchorView2.f78056w;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewCoHost");
                } else {
                    view = view3;
                }
                anchorView2.m80111a1(view, true);
                AnchorEndBattleDialog anchorEndBattleDialog2 = AnchorView.this.f78034O;
                if (anchorEndBattleDialog2 != null && anchorEndBattleDialog2.isShowing() && (anchorEndBattleDialog = AnchorView.this.f78034O) != null) {
                    anchorEndBattleDialog.dismiss();
                }
                AtomicAlertDialog atomicAlertDialog2 = AnchorView.this.f78035P;
                if (atomicAlertDialog2 != null && atomicAlertDialog2.m88066v() && (atomicAlertDialog = AnchorView.this.f78035P) != null) {
                    atomicAlertDialog.m88063s();
                }
            }
            return Unit.INSTANCE;
        }

        public C36015q() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$r */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36016r<T> implements InterfaceC41635f {
        public C36016r() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<BattleUser> list, Continuation<? super Unit> continuation) {
            final AnchorView anchorView = AnchorView.this;
            anchorView.post(new Runnable() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.l0
                @Override // java.lang.Runnable
                public final void run() {
                    AnchorView.C36016r.m80159f(anchorView);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final void m80159f(AnchorView anchorView) {
            anchorView.m80090L2();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$s */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36017s<T> implements InterfaceC41635f {
        public C36017s() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
            AnchorView anchorView = AnchorView.this;
            View view = anchorView.f78056w;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewCoHost");
                view = null;
            }
            anchorView.m80111a1(view, list.size() <= 1);
            CoGuestIconView coGuestIconView = (CoGuestIconView) AnchorView.this.findViewById(R$id.co_guest_icon);
            if (list.size() > 1) {
                coGuestIconView.m80454d();
            } else {
                coGuestIconView.m80455e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$t */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36018t<T> implements InterfaceC41635f {
        public C36018t() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
            AnchorView.this.m80090L2();
            AnchorView anchorView = AnchorView.this;
            View view = anchorView.f78055v;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewCoGuest");
                view = null;
            }
            anchorView.m80111a1(view, list.isEmpty());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$u */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36019u<T> implements InterfaceC41635f {
        public C36019u() {
        }

        /* JADX INFO: renamed from: a */
        public final Object m80163a(boolean z11, Continuation<? super Unit> continuation) {
            View view = AnchorView.this.f78057x;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewBattle");
                view = null;
            }
            view.setVisibility(z11 ? 8 : 0);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m80163a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$v */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36020v<T> implements InterfaceC41635f {
        public C36020v() {
        }

        /* JADX INFO: renamed from: a */
        public final Object m80164a(boolean z11, Continuation<? super Unit> continuation) {
            View view = AnchorView.this.f78056w;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewCoHost");
                view = null;
            }
            view.setVisibility(z11 ? 8 : 0);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m80164a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$w */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36021w<T> implements InterfaceC41635f {
        public C36021w() {
        }

        /* JADX INFO: renamed from: a */
        public final Object m80165a(boolean z11, Continuation<? super Unit> continuation) {
            FrameLayout frameLayout = AnchorView.this.f78052s;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutHeaderContainer");
                frameLayout = null;
            }
            frameLayout.setVisibility(z11 ? 8 : 0);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m80165a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$x */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36022x<T> implements InterfaceC41635f {
        public C36022x() {
        }

        /* JADX INFO: renamed from: a */
        public final Object m80166a(boolean z11, Continuation<? super Unit> continuation) {
            AudienceListView audienceListView = AnchorView.this.f78058y;
            if (audienceListView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audienceListView");
                audienceListView = null;
            }
            audienceListView.setVisibility(z11 ? 8 : 0);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m80166a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$y */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36023y<T> implements InterfaceC41635f {
        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
            if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                AnchorView.this.m80126g2();
            } else {
                AnchorView.this.m80108Y0();
            }
            return Unit.INSTANCE;
        }

        public C36023y() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$z */
    /* JADX INFO: compiled from: AnchorView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36024z<T> implements InterfaceC41635f {
        public C36024z() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final void m80169f(AnchorView anchorView) {
            InterfaceC41678w<BattleUser> interfaceC41678wM101128d;
            CoHostStore.Companion companion = CoHostStore.INSTANCE;
            LiveInfo liveInfo = anchorView.f78036Q;
            BattleUser value = null;
            if (liveInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
                liveInfo = null;
            }
            anchorView.m80112a2(companion.create(liveInfo.getLiveID()).getCoHostState().getApplicant().getValue());
            AnchorBattleState f78200e = anchorView.getF78200e();
            if (f78200e != null && (interfaceC41678wM101128d = f78200e.m101128d()) != null) {
                value = interfaceC41678wM101128d.getValue();
            }
            anchorView.m80106W1(value);
            anchorView.m80098S0();
        }

        /* JADX INFO: renamed from: c */
        public final Object m80170c(boolean z11, Continuation<? super Unit> continuation) {
            if (!z11) {
                LiveInfo liveInfo = AnchorView.this.f78036Q;
                if (liveInfo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
                    liveInfo = null;
                }
                if (liveInfo.getLiveID().length() > 0) {
                    final AnchorView anchorView = AnchorView.this;
                    anchorView.postDelayed(new Runnable() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.m0
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnchorView.C36024z.m80169f(anchorView);
                        }
                    }, AnchorView.this.m80081G1() ? 500L : 0L);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m80170c(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnchorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ void m79974I1(AnchorView anchorView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        anchorView.m80083H1(z11);
    }

    /* JADX INFO: renamed from: p1 */
    public static final void m80040p1(View view, DialogInterface dialogInterface) {
        view.setEnabled(true);
    }

    /* JADX INFO: renamed from: s1 */
    public static final void m80050s1(View view, DialogInterface dialogInterface) {
        view.setEnabled(true);
    }

    /* JADX INFO: renamed from: z1 */
    public final void m80142z1(LiveCoreView liveCoreView) {
        LiveCoreView liveCoreView2 = null;
        if (liveCoreView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            liveCoreView = new LiveCoreView(context, null, 0, CoreViewType.PUSH_VIEW);
        } else if (liveCoreView.getParent() != null) {
            ViewParent parent = liveCoreView.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(liveCoreView);
        }
        this.f78050q = liveCoreView;
        LiveInfo liveInfo = this.f78036Q;
        if (liveInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo = null;
        }
        liveCoreView.setLiveId(liveInfo.getLiveID());
        RoundFrameLayout roundFrameLayout = this.f78049p;
        if (roundFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutCoreViewContainer");
            roundFrameLayout = null;
        }
        LiveCoreView liveCoreView3 = this.f78050q;
        if (liveCoreView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
        } else {
            liveCoreView2 = liveCoreView3;
        }
        roundFrameLayout.addView(liveCoreView2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnchorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: A2 */
    public static final Unit m79952A2(Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B2 */
    public static final Unit m79955B2(AnchorView anchorView, AnchorStore anchorStore, Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        anchorView.m80121e1(anchorStore);
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C2 */
    public static final Unit m79958C2(final AnchorView anchorView, final AnchorStore anchorStore, AtomicAlertDialog.DialogConfig init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        String string = anchorView.getF78197b().getString(R$string.live_end_live_tips);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C39361f.m88099i(init, string, null, null, false, 14, null);
        String string2 = anchorView.getF78197b().getString(R$string.common_cancel);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C39361f.m88095e(init, string2, AtomicAlertDialog.TextColorPreset.GREY, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m79961D2((Dialog) obj);
            }
        }, 4, null);
        String string3 = anchorView.getF78197b().getString(R$string.common_end_live);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C39361f.m88097g(init, string3, AtomicAlertDialog.TextColorPreset.RED, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m79965E2(this.f78195b, anchorStore, (Dialog) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D2 */
    public static final Unit m79961D2(Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E2 */
    public static final Unit m79965E2(AnchorView anchorView, AnchorStore anchorStore, Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        anchorView.m80121e1(anchorStore);
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K2 */
    public static final void m79979K2(AnchorView anchorView) {
        BarrageStreamView barrageStreamView = anchorView.f78026G;
        if (barrageStreamView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
            barrageStreamView = null;
        }
        barrageStreamView.m79475l();
    }

    /* JADX INFO: renamed from: T0 */
    public static final void m79995T0() {
        DeviceStore.Companion companion = DeviceStore.INSTANCE;
        companion.shared().openLocalCamera(companion.shared().getDeviceState().isFrontCamera().getValue().booleanValue(), null);
    }

    /* JADX INFO: renamed from: X1 */
    public static final Unit m80000X1(String str, final AnchorView anchorView, AtomicAlertDialog.DialogConfig init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        init.m88090o(str);
        init.m88088m(0L);
        String string = anchorView.getContext().getString(R$string.common_receive);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C39361f.m88097g(init, string, AtomicAlertDialog.TextColorPreset.BLUE, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m80002Y1(this.f78116b, (Dialog) obj);
            }
        }, 4, null);
        String string2 = anchorView.getContext().getString(R$string.common_reject);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C39361f.m88095e(init, string2, AtomicAlertDialog.TextColorPreset.GREY, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m80004Z1(this.f78119b, (Dialog) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y1 */
    public static final Unit m80002Y1(AnchorView anchorView, Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismiss();
        LiveInfo liveInfo = null;
        anchorView.f78031L = null;
        AnchorBattleState f78200e = anchorView.getF78200e();
        if (f78200e != null) {
            BattleStore.Companion companion = BattleStore.INSTANCE;
            LiveInfo liveInfo2 = anchorView.f78036Q;
            if (liveInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            } else {
                liveInfo = liveInfo2;
            }
            companion.create(liveInfo.getLiveID()).acceptBattle(f78200e.getBattleId(), anchorView.new C35980a0());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z1 */
    public static final Unit m80004Z1(AnchorView anchorView, Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismiss();
        LiveInfo liveInfo = null;
        anchorView.f78031L = null;
        AnchorBattleState f78200e = anchorView.getF78200e();
        if (f78200e != null) {
            BattleStore.Companion companion = BattleStore.INSTANCE;
            LiveInfo liveInfo2 = anchorView.f78036Q;
            if (liveInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            } else {
                liveInfo = liveInfo2;
            }
            companion.create(liveInfo.getLiveID()).rejectBattle(f78200e.getBattleId(), anchorView.new C35996b0());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ void m80008c1(AnchorView anchorView, LiveEndedReason liveEndedReason, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            liveEndedReason = LiveEndedReason.ENDED_BY_HOST;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        anchorView.m80113b1(liveEndedReason, z11);
    }

    /* JADX INFO: renamed from: j2 */
    public static final Unit m80021j2(String str, final AnchorView anchorView, final String str2, AtomicAlertDialog.DialogConfig init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        init.m88090o(str);
        init.m88088m(0L);
        String string = anchorView.getContext().getString(R$string.common_receive);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C39361f.m88097g(init, string, AtomicAlertDialog.TextColorPreset.BLUE, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m80024k2(this.f78117b, str2, (Dialog) obj);
            }
        }, 4, null);
        String string2 = anchorView.getContext().getString(R$string.common_reject);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C39361f.m88095e(init, string2, AtomicAlertDialog.TextColorPreset.GREY, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m80027l2(this.f78120b, str2, (Dialog) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k2 */
    public static final Unit m80024k2(AnchorView anchorView, String str, Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        CoHostStore.Companion companion = CoHostStore.INSTANCE;
        LiveInfo liveInfo = anchorView.f78036Q;
        if (liveInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo = null;
        }
        companion.create(liveInfo.getLiveID()).acceptHostConnection(str, null);
        dialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l2 */
    public static final Unit m80027l2(AnchorView anchorView, String str, Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        CoHostStore.Companion companion = CoHostStore.INSTANCE;
        LiveInfo liveInfo = anchorView.f78036Q;
        if (liveInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo = null;
        }
        companion.create(liveInfo.getLiveID()).rejectHostConnection(str, null);
        dialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n2 */
    public static final Unit m80033n2(final AnchorView anchorView, AtomicAlertDialog.DialogConfig init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        String string = anchorView.getContext().getString(R$string.common_battle_end_pk_tips);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C39361f.m88099i(init, string, null, null, false, 8, null);
        String string2 = anchorView.getContext().getString(R$string.common_disconnect_cancel);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C39361f.m88095e(init, string2, null, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m80037o2((Dialog) obj);
            }
        }, 6, null);
        String string3 = anchorView.getContext().getString(R$string.common_battle_end_pk);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C39361f.m88097g(init, string3, AtomicAlertDialog.TextColorPreset.RED, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m80041p2(this.f78444b, (Dialog) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o2 */
    public static final Unit m80037o2(Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p2 */
    public static final Unit m80041p2(AnchorView anchorView, Dialog it) {
        AnchorBattleState anchorBattleStateM80232i;
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        AnchorStore f78203h = anchorView.getF78203h();
        BattleStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).exitBattle((f78203h == null || (anchorBattleStateM80232i = f78203h.m80232i()) == null) ? null : anchorBattleStateM80232i.getBattleId(), anchorView.new C36000d0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r2 */
    public static final Unit m80047r2(String str, final AnchorView anchorView, final AnchorStore anchorStore, final String str2, AtomicAlertDialog.DialogConfig init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        C39361f.m88099i(init, str, null, null, false, 14, null);
        String string = anchorView.getF78197b().getString(R$string.common_end_pk);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C39361f.m88093c(init, string, AtomicAlertDialog.TextColorPreset.RED, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m80051s2(anchorStore, str2, (Dialog) obj);
            }
        }, 4, null);
        String string2 = anchorView.getF78197b().getString(R$string.common_end_live);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        AtomicAlertDialog.TextColorPreset textColorPreset = AtomicAlertDialog.TextColorPreset.PRIMARY;
        C39361f.m88093c(init, string2, textColorPreset, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m80054t2(this.f78448b, anchorStore, (Dialog) obj);
            }
        }, 4, null);
        String string3 = anchorView.getF78197b().getString(R$string.common_cancel);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C39361f.m88093c(init, string3, textColorPreset, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m80057u2((Dialog) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s2 */
    public static final Unit m80051s2(AnchorStore anchorStore, String str, Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BattleStore.INSTANCE.create(str).exitBattle(anchorStore.m80232i().getBattleId(), new C36002e0(anchorStore, it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCoreViewLayoutParamsWhenLandscape(int template) {
        this.f78047n.m79404b("setCoreViewLayoutParamsWhenLandscape:template:" + template + ',');
        if (template == 200) {
            RoundFrameLayout roundFrameLayout = this.f78049p;
            RoundFrameLayout roundFrameLayout2 = null;
            if (roundFrameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutCoreViewContainer");
                roundFrameLayout = null;
            }
            roundFrameLayout.setRadius(0);
            RoundFrameLayout roundFrameLayout3 = this.f78049p;
            if (roundFrameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutCoreViewContainer");
                roundFrameLayout3 = null;
            }
            ViewGroup.LayoutParams layoutParams = roundFrameLayout3.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = ScreenUtil.dip2px(110.0f);
            layoutParams2.height = (C45152a.m99800b(getContext()) * 9) / 16;
            RoundFrameLayout roundFrameLayout4 = this.f78049p;
            if (roundFrameLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutCoreViewContainer");
            } else {
                roundFrameLayout2 = roundFrameLayout4;
            }
            roundFrameLayout2.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: t2 */
    public static final Unit m80054t2(AnchorView anchorView, AnchorStore anchorStore, Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        anchorView.m80121e1(anchorStore);
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u2 */
    public static final Unit m80057u2(Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v2 */
    public static final Unit m80061v2(String str, final AnchorView anchorView, final String str2, final AnchorStore anchorStore, AtomicAlertDialog.DialogConfig init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        C39361f.m88099i(init, str, null, null, false, 14, null);
        String string = anchorView.getF78197b().getString(R$string.common_end_connection);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C39361f.m88093c(init, string, AtomicAlertDialog.TextColorPreset.RED, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m80064w2(str2, (Dialog) obj);
            }
        }, 4, null);
        String string2 = anchorView.getF78197b().getString(R$string.common_end_live);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        AtomicAlertDialog.TextColorPreset textColorPreset = AtomicAlertDialog.TextColorPreset.PRIMARY;
        C39361f.m88093c(init, string2, textColorPreset, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m80068x2(this.f78151b, anchorStore, (Dialog) obj);
            }
        }, 4, null);
        String string3 = anchorView.getF78197b().getString(R$string.common_cancel);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C39361f.m88093c(init, string3, textColorPreset, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m80071y2((Dialog) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w2 */
    public static final Unit m80064w2(String str, Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CoHostStore.INSTANCE.create(str).exitHostConnection(null);
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x2 */
    public static final Unit m80068x2(AnchorView anchorView, AnchorStore anchorStore, Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        anchorView.m80121e1(anchorStore);
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y2 */
    public static final Unit m80071y2(Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z2 */
    public static final Unit m80074z2(String str, final AnchorView anchorView, final AnchorStore anchorStore, AtomicAlertDialog.DialogConfig init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        C39361f.m88099i(init, str, null, null, false, 14, null);
        String string = anchorView.getF78197b().getString(R$string.common_cancel);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C39361f.m88095e(init, string, AtomicAlertDialog.TextColorPreset.GREY, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m79952A2((Dialog) obj);
            }
        }, 4, null);
        String string2 = anchorView.getF78197b().getString(R$string.common_end_live);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C39361f.m88097g(init, string2, AtomicAlertDialog.TextColorPreset.RED, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m79955B2(this.f78153b, anchorStore, (Dialog) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D1 */
    public final void m80078D1() {
        findViewById(R$id.iv_more).setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnchorView.m79964E1(this.f78114b, view);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    public final void m80079F1() {
        KCTradeCardView kCTradeCardView = this.f78022C;
        KCTradeCardView kCTradeCardView2 = null;
        if (kCTradeCardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tradeCardView");
            kCTradeCardView = null;
        }
        KCRoomInfoService kCRoomInfoService = this.f78023D;
        if (kCRoomInfoService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kcRoomInfoService");
            kCRoomInfoService = null;
        }
        kCTradeCardView.m81700i(kCRoomInfoService);
        KCTradeCardView kCTradeCardView3 = this.f78022C;
        if (kCTradeCardView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tradeCardView");
        } else {
            kCTradeCardView2 = kCTradeCardView3;
        }
        kCTradeCardView2.setOnVisibilityChangeListener(new C36011m());
    }

    /* JADX INFO: renamed from: G1 */
    public final boolean m80081G1() {
        String str = Build.MANUFACTURER;
        return StringsKt.equals(str, "HUAWEI", true) || StringsKt.equals(str, "samsung", true);
    }

    /* JADX INFO: renamed from: G2 */
    public final void m80082G2(LiveInfo liveInfo) {
        C44128b.m97266j("Live", "startLocalPreview:" + liveInfo);
        if (liveInfo.getKeepOwnerOnSeat()) {
            C45497f c45497f = C45497f.f102528a;
            Context contextM79397b = ContextProvider.m79397b();
            Intrinsics.checkNotNullExpressionValue(contextM79397b, "getApplicationContext(...)");
            c45497f.m100466a(contextM79397b, new C36004f0());
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m80083H1(boolean z11) {
        PIPPanelStore.f77996b.sharedInstance().getF77998a().m99362g(false);
        LiveCoreView liveCoreView = this.f78050q;
        if (liveCoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView = null;
        }
        liveCoreView.setLocalVideoMuteImage(null, null);
        LiveListStore.INSTANCE.shared().leaveLive(null);
        TUICore.notifyEvent(TUIConstants.Privacy.EVENT_ROOM_STATE_CHANGED, TUIConstants.Privacy.EVENT_SUB_KEY_ROOM_STATE_STOP, null);
        TUICore.notifyEvent(this.f78039T, this.f78041V, null);
        if (z11) {
            m80123f1();
        }
    }

    /* JADX INFO: renamed from: J2 */
    public final void m80087J2(boolean z11) {
        BarrageStreamView barrageStreamView = this.f78026G;
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
        BarrageStreamView barrageStreamView3 = this.f78026G;
        if (barrageStreamView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
            barrageStreamView3 = null;
        }
        barrageStreamView3.setLayoutParams(layoutParams2);
        BarrageStreamView barrageStreamView4 = this.f78026G;
        if (barrageStreamView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
        } else {
            barrageStreamView2 = barrageStreamView4;
        }
        barrageStreamView2.post(new Runnable() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.g0
            @Override // java.lang.Runnable
            public final void run() {
                AnchorView.m79979K2(this.f78127b);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: K1 */
    public final Object m80088K1(Continuation<? super Unit> continuation) {
        AnchorView$onBattleResultDisplay$1 anchorView$onBattleResultDisplay$1;
        InterfaceC41678w<Boolean> interfaceC41678wM101131g;
        if (continuation instanceof AnchorView$onBattleResultDisplay$1) {
            anchorView$onBattleResultDisplay$1 = (AnchorView$onBattleResultDisplay$1) continuation;
            int i11 = anchorView$onBattleResultDisplay$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorView$onBattleResultDisplay$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorView$onBattleResultDisplay$1 = new AnchorView$onBattleResultDisplay$1(this, continuation);
            }
        } else {
            anchorView$onBattleResultDisplay$1 = new AnchorView$onBattleResultDisplay$1(this, continuation);
        }
        Object obj = anchorView$onBattleResultDisplay$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorView$onBattleResultDisplay$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AnchorBattleState f78200e = getF78200e();
            if (f78200e == null || (interfaceC41678wM101131g = f78200e.m101131g()) == null) {
                return Unit.INSTANCE;
            }
            C36014p c36014p = new C36014p();
            anchorView$onBattleResultDisplay$1.label = 1;
            if (interfaceC41678wM101131g.collect(c36014p, anchorView$onBattleResultDisplay$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: L1 */
    public final Object m80089L1(Continuation<? super Unit> continuation) {
        AnchorView$onBattleStartChange$1 anchorView$onBattleStartChange$1;
        InterfaceC41678w<Boolean> interfaceC41678wM101129e;
        if (continuation instanceof AnchorView$onBattleStartChange$1) {
            anchorView$onBattleStartChange$1 = (AnchorView$onBattleStartChange$1) continuation;
            int i11 = anchorView$onBattleStartChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorView$onBattleStartChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorView$onBattleStartChange$1 = new AnchorView$onBattleStartChange$1(this, continuation);
            }
        } else {
            anchorView$onBattleStartChange$1 = new AnchorView$onBattleStartChange$1(this, continuation);
        }
        Object obj = anchorView$onBattleStartChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorView$onBattleStartChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AnchorBattleState f78200e = getF78200e();
            if (f78200e == null || (interfaceC41678wM101129e = f78200e.m101129e()) == null) {
                return Unit.INSTANCE;
            }
            C36015q c36015q = new C36015q();
            anchorView$onBattleStartChange$1.label = 1;
            if (interfaceC41678wM101129e.collect(c36015q, anchorView$onBattleStartChange$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: L2 */
    public final void m80090L2() {
        InterfaceC41678w<Boolean> interfaceC41678wM101131g;
        View view = this.f78057x;
        Boolean value = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBattle");
            view = null;
        }
        View viewFindViewById = view.findViewById(R$id.v_battle_icon);
        AnchorBattleState f78200e = getF78200e();
        if (f78200e != null && (interfaceC41678wM101131g = f78200e.m101131g()) != null) {
            value = interfaceC41678wM101131g.getValue();
        }
        if (getF78204i() == null || getF78205j() == null) {
            return;
        }
        C45802f f78204i = getF78204i();
        Intrinsics.checkNotNull(f78204i);
        if (!f78204i.m101145e()) {
            viewFindViewById.setBackgroundResource(R$drawable.livekit_function_battle_disable);
            return;
        }
        AnchorBattleStore f78205j = getF78205j();
        Intrinsics.checkNotNull(f78205j);
        if (f78205j.m80199i()) {
            viewFindViewById.setBackgroundResource(R$drawable.livekit_function_battle_exit);
        } else {
            viewFindViewById.setBackgroundResource(R$drawable.livekit_function_battle);
        }
        if (Intrinsics.areEqual(value, Boolean.TRUE)) {
            viewFindViewById.setBackgroundResource(R$drawable.livekit_function_battle_disable);
        } else {
            viewFindViewById.setBackgroundResource(R$drawable.livekit_function_battle);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: M1 */
    public final Object m80091M1(Continuation<? super Unit> continuation) {
        AnchorView$onBattleUserChange$1 anchorView$onBattleUserChange$1;
        InterfaceC41678w<List<BattleUser>> interfaceC41678wM101126b;
        if (continuation instanceof AnchorView$onBattleUserChange$1) {
            anchorView$onBattleUserChange$1 = (AnchorView$onBattleUserChange$1) continuation;
            int i11 = anchorView$onBattleUserChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorView$onBattleUserChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorView$onBattleUserChange$1 = new AnchorView$onBattleUserChange$1(this, continuation);
            }
        } else {
            anchorView$onBattleUserChange$1 = new AnchorView$onBattleUserChange$1(this, continuation);
        }
        Object obj = anchorView$onBattleUserChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorView$onBattleUserChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AnchorBattleState f78200e = getF78200e();
            if (f78200e == null || (interfaceC41678wM101126b = f78200e.m101126b()) == null) {
                return Unit.INSTANCE;
            }
            C36016r c36016r = new C36016r();
            anchorView$onBattleUserChange$1.label = 1;
            if (interfaceC41678wM101126b.collect(c36016r, anchorView$onBattleUserChange$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: N1 */
    public final void m80092N1(List<LiveUserInfo> list) {
        View view = this.f78056w;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewCoHost");
            view = null;
        }
        m80111a1(view, list.isEmpty());
        AnchorCoHostManageDialog anchorCoHostManageDialog = this.f78029J;
        if (anchorCoHostManageDialog != null) {
            anchorCoHostManageDialog.dismiss();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: O1 */
    public final Object m80093O1(Continuation<? super Unit> continuation) throws Exception {
        AnchorView$onCoGuestUserListChange$1 anchorView$onCoGuestUserListChange$1;
        if (continuation instanceof AnchorView$onCoGuestUserListChange$1) {
            anchorView$onCoGuestUserListChange$1 = (AnchorView$onCoGuestUserListChange$1) continuation;
            int i11 = anchorView$onCoGuestUserListChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorView$onCoGuestUserListChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorView$onCoGuestUserListChange$1 = new AnchorView$onCoGuestUserListChange$1(this, continuation);
            }
        } else {
            anchorView$onCoGuestUserListChange$1 = new AnchorView$onCoGuestUserListChange$1(this, continuation);
        }
        Object obj = anchorView$onCoGuestUserListChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorView$onCoGuestUserListChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            CoGuestStore.Companion companion = CoGuestStore.INSTANCE;
            LiveInfo liveInfo = this.f78036Q;
            if (liveInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
                liveInfo = null;
            }
            CoGuestStore coGuestStoreCreate = companion.create(liveInfo.getLiveID());
            InterfaceC41678w<List<SeatUserInfo>> connected = coGuestStoreCreate.getCoGuestState().getConnected();
            C36017s c36017s = new C36017s();
            anchorView$onCoGuestUserListChange$1.L$0 = SpillingKt.nullOutSpilledVariable(coGuestStoreCreate);
            anchorView$onCoGuestUserListChange$1.label = 1;
            if (connected.collect(c36017s, anchorView$onCoGuestUserListChange$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: P1 */
    public final Object m80094P1(Continuation<? super Unit> continuation) throws Exception {
        AnchorView$onCoHostUserListChange$1 anchorView$onCoHostUserListChange$1;
        if (continuation instanceof AnchorView$onCoHostUserListChange$1) {
            anchorView$onCoHostUserListChange$1 = (AnchorView$onCoHostUserListChange$1) continuation;
            int i11 = anchorView$onCoHostUserListChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorView$onCoHostUserListChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorView$onCoHostUserListChange$1 = new AnchorView$onCoHostUserListChange$1(this, continuation);
            }
        } else {
            anchorView$onCoHostUserListChange$1 = new AnchorView$onCoHostUserListChange$1(this, continuation);
        }
        Object obj = anchorView$onCoHostUserListChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorView$onCoHostUserListChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            CoHostStore.Companion companion = CoHostStore.INSTANCE;
            LiveInfo liveInfo = this.f78036Q;
            if (liveInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
                liveInfo = null;
            }
            CoHostStore coHostStoreCreate = companion.create(liveInfo.getLiveID());
            InterfaceC41678w<List<SeatUserInfo>> connected = coHostStoreCreate.getCoHostState().getConnected();
            C36018t c36018t = new C36018t();
            anchorView$onCoHostUserListChange$1.L$0 = SpillingKt.nullOutSpilledVariable(coHostStoreCreate);
            anchorView$onCoHostUserListChange$1.label = 1;
            if (connected.collect(c36018t, anchorView$onCoHostUserListChange$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Q1 */
    public final Object m80095Q1(Continuation<? super Unit> continuation) {
        AnchorView$onDisableBattleChange$1 anchorView$onDisableBattleChange$1;
        if (continuation instanceof AnchorView$onDisableBattleChange$1) {
            anchorView$onDisableBattleChange$1 = (AnchorView$onDisableBattleChange$1) continuation;
            int i11 = anchorView$onDisableBattleChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorView$onDisableBattleChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorView$onDisableBattleChange$1 = new AnchorView$onDisableBattleChange$1(this, continuation);
            }
        } else {
            anchorView$onDisableBattleChange$1 = new AnchorView$onDisableBattleChange$1(this, continuation);
        }
        Object obj = anchorView$onDisableBattleChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorView$onDisableBattleChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41669n<Boolean> interfaceC41669nM101154a = C45804h.f103238a.m101154a();
            C36019u c36019u = new C36019u();
            anchorView$onDisableBattleChange$1.label = 1;
            if (interfaceC41669nM101154a.collect(c36019u, anchorView$onDisableBattleChange$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: R0 */
    public final void m80096R0(@NotNull AnchorViewListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        AnchorStore f78203h = getF78203h();
        if (f78203h != null) {
            f78203h.m80226c(listener);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: R1 */
    public final Object m80097R1(Continuation<? super Unit> continuation) {
        AnchorView$onDisableCoHostChange$1 anchorView$onDisableCoHostChange$1;
        if (continuation instanceof AnchorView$onDisableCoHostChange$1) {
            anchorView$onDisableCoHostChange$1 = (AnchorView$onDisableCoHostChange$1) continuation;
            int i11 = anchorView$onDisableCoHostChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorView$onDisableCoHostChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorView$onDisableCoHostChange$1 = new AnchorView$onDisableCoHostChange$1(this, continuation);
            }
        } else {
            anchorView$onDisableCoHostChange$1 = new AnchorView$onDisableCoHostChange$1(this, continuation);
        }
        Object obj = anchorView$onDisableCoHostChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorView$onDisableCoHostChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41669n<Boolean> interfaceC41669nM101156c = C45804h.f103238a.m101156c();
            C36020v c36020v = new C36020v();
            anchorView$onDisableCoHostChange$1.label = 1;
            if (interfaceC41669nM101156c.collect(c36020v, anchorView$onDisableCoHostChange$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: S1 */
    public final Object m80099S1(Continuation<? super Unit> continuation) {
        AnchorView$onDisableLiveDataChange$1 anchorView$onDisableLiveDataChange$1;
        if (continuation instanceof AnchorView$onDisableLiveDataChange$1) {
            anchorView$onDisableLiveDataChange$1 = (AnchorView$onDisableLiveDataChange$1) continuation;
            int i11 = anchorView$onDisableLiveDataChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorView$onDisableLiveDataChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorView$onDisableLiveDataChange$1 = new AnchorView$onDisableLiveDataChange$1(this, continuation);
            }
        } else {
            anchorView$onDisableLiveDataChange$1 = new AnchorView$onDisableLiveDataChange$1(this, continuation);
        }
        Object obj = anchorView$onDisableLiveDataChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorView$onDisableLiveDataChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41669n<Boolean> interfaceC41669nM101158e = C45804h.f103238a.m101158e();
            C36021w c36021w = new C36021w();
            anchorView$onDisableLiveDataChange$1.label = 1;
            if (interfaceC41669nM101158e.collect(c36021w, anchorView$onDisableLiveDataChange$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: T1 */
    public final Object m80100T1(Continuation<? super Unit> continuation) {
        AnchorView$onDisableVisitorCntChange$1 anchorView$onDisableVisitorCntChange$1;
        if (continuation instanceof AnchorView$onDisableVisitorCntChange$1) {
            anchorView$onDisableVisitorCntChange$1 = (AnchorView$onDisableVisitorCntChange$1) continuation;
            int i11 = anchorView$onDisableVisitorCntChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorView$onDisableVisitorCntChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorView$onDisableVisitorCntChange$1 = new AnchorView$onDisableVisitorCntChange$1(this, continuation);
            }
        } else {
            anchorView$onDisableVisitorCntChange$1 = new AnchorView$onDisableVisitorCntChange$1(this, continuation);
        }
        Object obj = anchorView$onDisableVisitorCntChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorView$onDisableVisitorCntChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41669n<Boolean> interfaceC41669nM101159f = C45804h.f103238a.m101159f();
            C36022x c36022x = new C36022x();
            anchorView$onDisableVisitorCntChange$1.label = 1;
            if (interfaceC41669nM101159f.collect(c36022x, anchorView$onDisableVisitorCntChange$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m80101U0() throws Exception {
        C45496e.m100465b(21);
        LiveCoreView liveCoreView = this.f78050q;
        if (liveCoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView = null;
        }
        liveCoreView.setVideoViewAdapter(new C35999d());
        PIPPanelStore.f77996b.sharedInstance().getF77998a().m99362g(true);
        if (this.f78048o == RoomBehavior.ENTER_ROOM) {
            m80118d1();
        } else {
            m80103V0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: U1 */
    public final Object m80102U1(Continuation<? super Unit> continuation) {
        AnchorView$onInWaitingChange$1 anchorView$onInWaitingChange$1;
        InterfaceC41678w<Boolean> interfaceC41678wM101130f;
        if (continuation instanceof AnchorView$onInWaitingChange$1) {
            anchorView$onInWaitingChange$1 = (AnchorView$onInWaitingChange$1) continuation;
            int i11 = anchorView$onInWaitingChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorView$onInWaitingChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorView$onInWaitingChange$1 = new AnchorView$onInWaitingChange$1(this, continuation);
            }
        } else {
            anchorView$onInWaitingChange$1 = new AnchorView$onInWaitingChange$1(this, continuation);
        }
        Object obj = anchorView$onInWaitingChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorView$onInWaitingChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AnchorBattleState f78200e = getF78200e();
            if (f78200e == null || (interfaceC41678wM101130f = f78200e.m101130f()) == null) {
                return Unit.INSTANCE;
            }
            C36023y c36023y = new C36023y();
            anchorView$onInWaitingChange$1.label = 1;
            if (interfaceC41678wM101130f.collect(c36023y, anchorView$onInWaitingChange$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: V0 */
    public final void m80103V0() throws Exception {
        LiveInfo liveInfo = this.f78036Q;
        LiveInfo liveInfo2 = null;
        if (liveInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo = null;
        }
        liveInfo.setKeepOwnerOnSeat(true);
        LiveInfo liveInfo3 = this.f78036Q;
        if (liveInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo3 = null;
        }
        liveInfo3.setSeatEnabled(true);
        LiveInfo liveInfo4 = this.f78036Q;
        if (liveInfo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo4 = null;
        }
        liveInfo4.setSeatMode(TakeSeatMode.APPLY);
        LiveCoreView liveCoreView = this.f78050q;
        if (liveCoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView = null;
        }
        MediaState f78202g = getF78202g();
        Bitmap bigMuteBitmap = f78202g != null ? f78202g.getBigMuteBitmap() : null;
        MediaState f78202g2 = getF78202g();
        liveCoreView.setLocalVideoMuteImage(bigMuteBitmap, f78202g2 != null ? f78202g2.getSmallMuteBitmap() : null);
        LiveListStore liveListStoreShared = LiveListStore.INSTANCE.shared();
        LiveInfo liveInfo5 = this.f78036Q;
        if (liveInfo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
        } else {
            liveInfo2 = liveInfo5;
        }
        liveListStoreShared.createLive(liveInfo2, new C36001e());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: V1 */
    public final Object m80104V1(Continuation<? super Unit> continuation) {
        AnchorView$onPipModeObserver$1 anchorView$onPipModeObserver$1;
        InterfaceC41678w<Boolean> interfaceC41678wM101183c;
        if (continuation instanceof AnchorView$onPipModeObserver$1) {
            anchorView$onPipModeObserver$1 = (AnchorView$onPipModeObserver$1) continuation;
            int i11 = anchorView$onPipModeObserver$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorView$onPipModeObserver$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorView$onPipModeObserver$1 = new AnchorView$onPipModeObserver$1(this, continuation);
            }
        } else {
            anchorView$onPipModeObserver$1 = new AnchorView$onPipModeObserver$1(this, continuation);
        }
        Object obj = anchorView$onPipModeObserver$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorView$onPipModeObserver$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            MediaState f78202g = getF78202g();
            if (f78202g == null || (interfaceC41678wM101183c = f78202g.m101183c()) == null) {
                return Unit.INSTANCE;
            }
            C36024z c36024z = new C36024z();
            anchorView$onPipModeObserver$1.label = 1;
            if (interfaceC41678wM101183c.collect(c36024z, anchorView$onPipModeObserver$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: X0 */
    public final void m80107X0() {
        if (this.f78037R) {
            return;
        }
        this.f78037R = true;
        DeviceStore.Companion companion = DeviceStore.INSTANCE;
        companion.shared().closeLocalCamera();
        companion.shared().closeLocalMicrophone();
        C37436d.m84222d();
        C40392a.m89013a();
        AnchorStore f78203h = getF78203h();
        if (f78203h != null) {
            f78203h.m80228e();
        }
        m80084H2();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m80108Y0() {
        DialogC46765d dialogC46765d = this.f78032M;
        if (dialogC46765d != null) {
            dialogC46765d.dismiss();
        }
        this.f78032M = null;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m80113b1(LiveEndedReason liveEndedReason, boolean z11) {
        PIPPanelStore.f77996b.sharedInstance().getF77998a().m99362g(false);
        LiveCoreView liveCoreView = this.f78050q;
        if (liveCoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView = null;
        }
        liveCoreView.setLocalVideoMuteImage(null, null);
        LiveListStore.INSTANCE.shared().endLive(null);
        TUICore.notifyEvent(TUIConstants.Privacy.EVENT_ROOM_STATE_CHANGED, TUIConstants.Privacy.EVENT_SUB_KEY_ROOM_STATE_STOP, null);
        TUICore.notifyEvent(this.f78039T, this.f78041V, null);
        AnchorStore f78203h = getF78203h();
        if (f78203h != null) {
            f78203h.m80244v(liveEndedReason);
        }
        if (z11) {
            m80123f1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c2 */
    public final Object m80116c2(Continuation<? super Unit> continuation) {
        AnchorView$ondDisableCoGuestChange$1 anchorView$ondDisableCoGuestChange$1;
        if (continuation instanceof AnchorView$ondDisableCoGuestChange$1) {
            anchorView$ondDisableCoGuestChange$1 = (AnchorView$ondDisableCoGuestChange$1) continuation;
            int i11 = anchorView$ondDisableCoGuestChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorView$ondDisableCoGuestChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorView$ondDisableCoGuestChange$1 = new AnchorView$ondDisableCoGuestChange$1(this, continuation);
            }
        } else {
            anchorView$ondDisableCoGuestChange$1 = new AnchorView$ondDisableCoGuestChange$1(this, continuation);
        }
        Object obj = anchorView$ondDisableCoGuestChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorView$ondDisableCoGuestChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41669n<Boolean> interfaceC41669nM101155b = C45804h.f103238a.m101155b();
            C35998c0 c35998c0 = new C35998c0();
            anchorView$ondDisableCoGuestChange$1.label = 1;
            if (interfaceC41669nM101155b.collect(c35998c0, anchorView$ondDisableCoGuestChange$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: d2 */
    public final void m80119d2(Map<String, ? extends Object> map) {
        Object obj;
        AnchorStore f78203h;
        C45802f f78176i;
        if (map == null || (obj = map.get("coHostTemplateId")) == null || !(obj instanceof Integer) || (f78203h = getF78203h()) == null || (f78176i = f78203h.getF78176i()) == null) {
            return;
        }
        f78176i.m101151k(((Number) obj).intValue());
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: e */
    public void mo80120e() {
        InterfaceC41775x1 interfaceC41775x1 = this.f78038S;
        LiveInfo liveInfo = null;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        CoHostStore.Companion companion = CoHostStore.INSTANCE;
        LiveInfo liveInfo2 = this.f78036Q;
        if (liveInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo2 = null;
        }
        companion.create(liveInfo2.getLiveID()).removeCoHostListener(this.f78042W);
        CoGuestStore.Companion companion2 = CoGuestStore.INSTANCE;
        LiveInfo liveInfo3 = this.f78036Q;
        if (liveInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo3 = null;
        }
        companion2.create(liveInfo3.getLiveID()).removeHostListener(this.f78043a0);
        BattleStore.Companion companion3 = BattleStore.INSTANCE;
        LiveInfo liveInfo4 = this.f78036Q;
        if (liveInfo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo4 = null;
        }
        companion3.create(liveInfo4.getLiveID()).removeBattleListener(this.f78044b0);
        LiveListStore.INSTANCE.shared().removeLiveListListener(this.f78045c0);
        LiveAudienceStore.Companion companion4 = LiveAudienceStore.INSTANCE;
        LiveInfo liveInfo5 = this.f78036Q;
        if (liveInfo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
        } else {
            liveInfo = liveInfo5;
        }
        companion4.create(liveInfo.getLiveID()).removeLiveAudienceListener(this.f78046d0);
    }

    /* JADX INFO: renamed from: e2 */
    public final void m80122e2(@NotNull AnchorViewListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        AnchorStore f78203h = getF78203h();
        if (f78203h != null) {
            f78203h.m80246z(listener);
        }
    }

    /* JADX INFO: renamed from: f2 */
    public final void m80124f2() {
        try {
            Context context = getContext();
            Objects.requireNonNull(context);
            TUICore.notifyEvent(TUIConstants.Privacy.EVENT_ROOM_STATE_CHANGED, TUIConstants.Privacy.EVENT_SUB_KEY_ROOM_STATE_START, MapsKt.hashMapOf(TuplesKt.m90091to(TUIConstants.Privacy.PARAM_DIALOG_CONTEXT, context)));
        } catch (Exception e11) {
            this.f78047n.m79403a("showAlertUserLiveTips exception:" + e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m80125g1(@NotNull LiveInfo liveInfo, @Nullable LiveCoreView liveCoreView, @NotNull RoomBehavior behavior, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        this.f78048o = behavior;
        this.f78036Q = liveInfo;
        setAnchorStore(new AnchorStore(liveInfo));
        m80142z1(liveCoreView);
        AnchorStore f78203h = getF78203h();
        Intrinsics.checkNotNull(f78203h);
        super.m80259b(f78203h);
        m80119d2(map);
        m80105W0();
        this.f78023D = new KCRoomInfoService();
        m80101U0();
        m80080F2();
    }

    /* JADX INFO: renamed from: h2 */
    public final void m80128h2(SeatInfo seatInfo) {
        AnchorStore f78203h;
        if (seatInfo == null || TextUtils.isEmpty(seatInfo.getUserInfo().getUserID()) || StringsKt.endsWith$default(seatInfo.getUserInfo().getUserID(), "_r", false, 2, (Object) null) || (f78203h = getF78203h()) == null) {
            return;
        }
        if (this.f78033N == null) {
            this.f78033N = new AnchorManagerDialog(getF78197b(), f78203h);
        }
        AnchorManagerDialog anchorManagerDialog = this.f78033N;
        if (anchorManagerDialog != null) {
            anchorManagerDialog.m80432u0(seatInfo);
        }
        AnchorManagerDialog anchorManagerDialog2 = this.f78033N;
        if (anchorManagerDialog2 != null) {
            anchorManagerDialog2.show();
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final void m80130i2(final String str, String str2, final String str3) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AtomicAlertDialog atomicAlertDialog = new AtomicAlertDialog(context, null, 2, null);
        atomicAlertDialog.m88065u(new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m80021j2(str, this, str3, (AtomicAlertDialog.DialogConfig) obj);
            }
        });
        this.f78030K = atomicAlertDialog;
        atomicAlertDialog.m88054I();
    }

    /* JADX INFO: renamed from: k1 */
    public final void m80132k1() {
        LiveInfo liveInfo = this.f78036Q;
        BarrageStreamView barrageStreamView = null;
        if (liveInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo = null;
        }
        if (liveInfo.getSeatLayoutTemplateID() == 200) {
            int iM6183e = C5267e0.m6183e();
            int iM6182d = C5267e0.m6182d();
            int i11 = (iM6183e * 9) / 16;
            BarrageStreamView barrageStreamView2 = this.f78026G;
            if (barrageStreamView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
                barrageStreamView2 = null;
            }
            barrageStreamView2.getLayoutParams().height = ((((iM6182d - ScreenUtil.dip2px(110.0f)) - ScreenUtil.dip2px(126.0f)) - i11) - ScreenUtil.dip2px(12.0f)) - EdgeToEdgeCompat.f48106a.m58271i();
        }
        LiveListStore.Companion companion = LiveListStore.INSTANCE;
        String userID = companion.shared().getLiveState().getCurrentLive().getValue().getLiveOwner().getUserID();
        String liveID = companion.shared().getLiveState().getCurrentLive().getValue().getLiveID();
        BarrageStreamView barrageStreamView3 = this.f78026G;
        if (barrageStreamView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
            barrageStreamView3 = null;
        }
        barrageStreamView3.m79473j(liveID, userID);
        BarrageStreamView barrageStreamView4 = this.f78026G;
        if (barrageStreamView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
            barrageStreamView4 = null;
        }
        barrageStreamView4.setItemTypeDelegate(new C44394a());
        BarrageStreamView barrageStreamView5 = this.f78026G;
        if (barrageStreamView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
            barrageStreamView5 = null;
        }
        barrageStreamView5.m79479r(1, new GiftBarrageAdapter(getF78197b()));
        BarrageStreamView barrageStreamView6 = this.f78026G;
        if (barrageStreamView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
        } else {
            barrageStreamView = barrageStreamView6;
        }
        barrageStreamView.setOnMessageClickListener(new C36007i());
        m80087J2(false);
    }

    /* JADX INFO: renamed from: l1 */
    public final void m80133l1() {
        View view = this.f78057x;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBattle");
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AnchorView.m80030m1(this.f78115b, view2);
            }
        });
    }

    /* JADX INFO: renamed from: m2 */
    public final void m80134m2() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AtomicAlertDialog atomicAlertDialog = new AtomicAlertDialog(context, null, 2, null);
        this.f78035P = atomicAlertDialog;
        atomicAlertDialog.m88065u(new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorView.m80033n2(this.f78149b, (AtomicAlertDialog.DialogConfig) obj);
            }
        });
        AtomicAlertDialog atomicAlertDialog2 = this.f78035P;
        if (atomicAlertDialog2 != null) {
            atomicAlertDialog2.m88054I();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m80135n1() {
        View view = this.f78055v;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewCoGuest");
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AnchorView.m80036o1(this.f78445b, view2);
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public final void m80136q1() {
        View view = this.f78056w;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewCoHost");
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AnchorView.m80046r1(this.f78132b, view2);
            }
        });
    }

    /* JADX INFO: renamed from: u1 */
    public final void m80139u1() {
        ImageView imageView = this.f78053t;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageEndLive");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnchorView.m80060v1(this.f78113b, view);
            }
        });
    }

    /* JADX INFO: renamed from: w1 */
    public final void m80140w1() {
        View view = null;
        if (LiveRemoteConfigHelper.f79162a.m81520b()) {
            ImageView imageView = this.f78054u;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageFloatWindow");
            } else {
                view = imageView;
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AnchorView.m80067x1(this.f78122b, view2);
                }
            });
            return;
        }
        ImageView imageView2 = this.f78054u;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageFloatWindow");
            imageView2 = null;
        }
        imageView2.setVisibility(8);
        KCPeopleCountView kCPeopleCountView = this.f78021B;
        if (kCPeopleCountView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("peopleCountView");
            kCPeopleCountView = null;
        }
        ViewGroup.LayoutParams layoutParams = kCPeopleCountView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(ScreenUtil.dip2px(56.0f));
        KCPeopleCountView kCPeopleCountView2 = this.f78021B;
        if (kCPeopleCountView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("peopleCountView");
        } else {
            view = kCPeopleCountView2;
        }
        view.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: y1 */
    public final void m80141y1() {
        C43992b f77880a = GiftStore.f77878b.getInstance().getF77880a();
        GiftPlayView giftPlayView = this.f78027H;
        GiftPlayView giftPlayView2 = null;
        if (giftPlayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("giftPlayView");
            giftPlayView = null;
        }
        giftPlayView.setListener(new C36010l(f77880a));
        AnchorState f78198c = getF78198c();
        if (f78198c != null) {
            GiftPlayView giftPlayView3 = this.f78027H;
            if (giftPlayView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("giftPlayView");
            } else {
                giftPlayView2 = giftPlayView3;
            }
            giftPlayView2.mo79409b(f78198c.getRoomId());
        }
    }

    public /* synthetic */ AnchorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: E1 */
    public static final void m79964E1(AnchorView anchorView, View view) {
        if (view.isEnabled()) {
            view.setEnabled(false);
            AnchorStore f78203h = anchorView.getF78203h();
            if (f78203h != null && C41696j.m91104d(anchorView.f78020A, null, null, new AnchorView$initSettingsPanel$1$1$1(anchorView, view, f78203h, null), 3, null) != null) {
                return;
            }
            view.setEnabled(true);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: m1 */
    public static final void m80030m1(AnchorView anchorView, View view) {
        boolean zAreEqual;
        String userID;
        InterfaceC41678w<Boolean> interfaceC41678wM101131g;
        InterfaceC41678w<Boolean> interfaceC41678wM101129e;
        if (anchorView.getF78205j() != null && anchorView.getF78203h() != null && anchorView.getF78204i() != null) {
            AnchorBattleState f78200e = anchorView.getF78200e();
            boolean zAreEqual2 = false;
            if (f78200e != null && (interfaceC41678wM101129e = f78200e.m101129e()) != null) {
                zAreEqual = Intrinsics.areEqual(interfaceC41678wM101129e.getValue(), Boolean.TRUE);
            } else {
                zAreEqual = false;
            }
            if (zAreEqual) {
                AnchorBattleStore f78205j = anchorView.getF78205j();
                Intrinsics.checkNotNull(f78205j);
                if (f78205j.m80199i()) {
                    if (anchorView.f78034O == null) {
                        AnchorEndBattleDialog anchorEndBattleDialog = new AnchorEndBattleDialog(anchorView.getF78197b());
                        anchorView.f78034O = anchorEndBattleDialog;
                        anchorEndBattleDialog.setOnEndBattleListener(anchorView.new C36008j());
                    }
                    AnchorEndBattleDialog anchorEndBattleDialog2 = anchorView.f78034O;
                    if (anchorEndBattleDialog2 != null) {
                        anchorEndBattleDialog2.show();
                        return;
                    }
                    return;
                }
            }
            AnchorBattleState f78200e2 = anchorView.getF78200e();
            if (f78200e2 != null && (interfaceC41678wM101131g = f78200e2.m101131g()) != null) {
                zAreEqual2 = Intrinsics.areEqual(interfaceC41678wM101131g.getValue(), Boolean.TRUE);
            }
            if (!zAreEqual2) {
                C45802f f78204i = anchorView.getF78204i();
                Intrinsics.checkNotNull(f78204i);
                if (f78204i.m101145e()) {
                    ArrayList arrayList = new ArrayList();
                    UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
                    LiveInfo liveInfo = null;
                    if (value != null) {
                        userID = value.getUserID();
                    } else {
                        userID = null;
                    }
                    AnchorState f78198c = anchorView.getF78198c();
                    if (f78198c != null) {
                        for (SeatUserInfo seatUserInfo : CoHostStore.INSTANCE.create(f78198c.getRoomId()).getCoHostState().getConnected().getValue()) {
                            if (!Intrinsics.areEqual(seatUserInfo.getUserID(), userID)) {
                                arrayList.add(seatUserInfo.getUserID());
                            }
                        }
                    }
                    BattleConfig battleConfig = new BattleConfig(0, false, null, 7, null);
                    battleConfig.setDuration(30);
                    battleConfig.setNeedResponse(true);
                    battleConfig.setExtensionInfo("");
                    BattleStore.Companion companion = BattleStore.INSTANCE;
                    LiveInfo liveInfo2 = anchorView.f78036Q;
                    if (liveInfo2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
                    } else {
                        liveInfo = liveInfo2;
                    }
                    companion.create(liveInfo.getLiveID()).requestBattle(battleConfig, arrayList, 10, anchorView.new C36009k(arrayList));
                    return;
                }
            }
            anchorView.f78047n.m79406d("can not requestBattle");
        }
    }

    /* JADX INFO: renamed from: o1 */
    public static final void m80036o1(AnchorView anchorView, final View view) {
        if (!view.isEnabled()) {
            return;
        }
        view.setEnabled(false);
        Context f78197b = anchorView.getF78197b();
        AnchorStore f78203h = anchorView.getF78203h();
        LiveCoreView liveCoreView = anchorView.f78050q;
        if (liveCoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView = null;
        }
        AnchorCoGuestManageDialog anchorCoGuestManageDialog = new AnchorCoGuestManageDialog(f78197b, f78203h, liveCoreView);
        anchorCoGuestManageDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.l
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AnchorView.m80040p1(view, dialogInterface);
            }
        });
        anchorCoGuestManageDialog.show();
    }

    /* JADX INFO: renamed from: r1 */
    public static final void m80046r1(AnchorView anchorView, final View view) {
        if (view.isEnabled()) {
            view.setEnabled(false);
            AnchorStore f78203h = anchorView.getF78203h();
            if (f78203h != null) {
                Context f78197b = anchorView.getF78197b();
                LiveCoreView liveCoreView = anchorView.f78050q;
                if (liveCoreView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
                    liveCoreView = null;
                }
                AnchorCoHostManageDialog anchorCoHostManageDialog = new AnchorCoHostManageDialog(f78197b, f78203h, liveCoreView);
                anchorView.f78029J = anchorCoHostManageDialog;
                anchorCoHostManageDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.k
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        AnchorView.m80050s1(view, dialogInterface);
                    }
                });
                AnchorCoHostManageDialog anchorCoHostManageDialog2 = anchorView.f78029J;
                if (anchorCoHostManageDialog2 != null) {
                    anchorCoHostManageDialog2.show();
                }
            }
        }
    }

    /* JADX INFO: renamed from: v1 */
    public static final void m80060v1(AnchorView anchorView, View view) {
        anchorView.m80137q2();
    }

    /* JADX INFO: renamed from: x1 */
    public static final void m80067x1(AnchorView anchorView, View view) {
        AnchorStore f78203h = anchorView.getF78203h();
        if (f78203h != null) {
            f78203h.m80243t();
        }
    }

    /* JADX INFO: renamed from: A1 */
    public final void m80075A1() {
        AnchorState f78198c = getF78198c();
        if (f78198c != null) {
            NetworkInfoView networkInfoView = this.f78024E;
            if (networkInfoView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("networkInfoView");
                networkInfoView = null;
            }
            networkInfoView.m79788s(f78198c.getLiveInfo());
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final void m80076B1() {
        AnchorState f78198c = getF78198c();
        if (f78198c != null) {
            KCPeopleCountView kCPeopleCountView = this.f78021B;
            KCRoomInfoService kCRoomInfoService = null;
            if (kCPeopleCountView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("peopleCountView");
                kCPeopleCountView = null;
            }
            LiveInfo liveInfo = f78198c.getLiveInfo();
            KCRoomInfoService kCRoomInfoService2 = this.f78023D;
            if (kCRoomInfoService2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kcRoomInfoService");
            } else {
                kCRoomInfoService = kCRoomInfoService2;
            }
            kCPeopleCountView.m81661e(liveInfo, kCRoomInfoService);
        }
    }

    /* JADX INFO: renamed from: C1 */
    public final void m80077C1() {
        AnchorState f78198c = getF78198c();
        if (f78198c != null) {
            LiveInfoView liveInfoView = this.f78059z;
            KCRoomInfoService kCRoomInfoService = null;
            if (liveInfoView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("roomInfoView");
                liveInfoView = null;
            }
            LiveInfo liveInfo = f78198c.getLiveInfo();
            KCRoomInfoService kCRoomInfoService2 = this.f78023D;
            if (kCRoomInfoService2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kcRoomInfoService");
            } else {
                kCRoomInfoService = kCRoomInfoService2;
            }
            liveInfoView.m79935l(liveInfo, kCRoomInfoService);
        }
    }

    /* JADX INFO: renamed from: F2 */
    public final void m80080F2() {
        Context contextM79397b = ContextProvider.m79397b();
        Intrinsics.checkNotNull(contextM79397b);
        VideoForegroundService.m79357d(contextM79397b, C42816a.m93881a(contextM79397b), contextM79397b.getString(R$string.common_app_running), 0);
    }

    /* JADX INFO: renamed from: H2 */
    public final void m80084H2() {
        VideoForegroundService.m79358e(ContextProvider.m79397b());
    }

    /* JADX INFO: renamed from: I2 */
    public final void m80085I2() {
        AnchorState f78170c;
        LiveInfo liveInfo;
        AnchorStore f78203h = getF78203h();
        if (f78203h != null && (f78170c = f78203h.getF78170c()) != null && (liveInfo = f78170c.getLiveInfo()) != null && liveInfo.getKeepOwnerOnSeat()) {
            LiveListStore.INSTANCE.shared().endLive(null);
        } else {
            LiveListStore.INSTANCE.shared().leaveLive(null);
        }
        m80107X0();
        TUICore.notifyEvent(TUIConstants.Privacy.EVENT_ROOM_STATE_CHANGED, TUIConstants.Privacy.EVENT_SUB_KEY_ROOM_STATE_STOP, null);
        TUICore.notifyEvent(this.f78039T, this.f78041V, null);
    }

    /* JADX INFO: renamed from: J1 */
    public final Object m80086J1(Continuation<? super LiveEntranceConfigEntity> continuation) {
        return C41686h.m91049g(C41782z0.m91392b(), new AnchorView$loadLiveEntranceConfig$2(this, null), continuation);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m80098S0() {
        if (getF78202g() != null) {
            DeviceStore.Companion companion = DeviceStore.INSTANCE;
            if (companion.shared().getDeviceState().getCameraLastError().getValue() == DeviceError.OCCUPIED_ERROR && companion.shared().getDeviceState().getCameraStatus().getValue() == DeviceStatus.ON) {
                companion.shared().closeLocalCamera();
                postDelayed(new Runnable() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnchorView.m79995T0();
                    }
                }, 500L);
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m80105W0() {
        MediaStore f78207l = getF78207l();
        if (f78207l != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int i11 = R$drawable.livekit_local_mute_image_multi;
            f78207l.m80250c(context, i11, i11);
        }
    }

    /* JADX INFO: renamed from: W1 */
    public final void m80106W1(BattleUser battleUser) {
        InterfaceC41678w<Boolean> interfaceC41678wM101183c;
        MediaState f78202g = getF78202g();
        if (f78202g != null && (interfaceC41678wM101183c = f78202g.m101183c()) != null && interfaceC41678wM101183c.getValue().booleanValue()) {
            return;
        }
        AtomicAlertDialog atomicAlertDialog = this.f78031L;
        if (atomicAlertDialog != null) {
            atomicAlertDialog.m88063s();
        }
        this.f78031L = null;
        if (battleUser != null) {
            final String string = getContext().getString(R$string.common_battle_inviting, battleUser.getUserName());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            AtomicAlertDialog atomicAlertDialog2 = new AtomicAlertDialog(context, null, 2, null);
            atomicAlertDialog2.m88065u(new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AnchorView.m80000X1(string, this, (AtomicAlertDialog.DialogConfig) obj);
                }
            });
            this.f78031L = atomicAlertDialog2;
            atomicAlertDialog2.m88054I();
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m80109Z0(boolean z11) {
        AnchorStore f78203h = getF78203h();
        if (f78203h != null) {
            f78203h.m80229f(z11);
        }
        RoundFrameLayout roundFrameLayout = this.f78049p;
        RoundFrameLayout roundFrameLayout2 = null;
        if (roundFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutCoreViewContainer");
            roundFrameLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = roundFrameLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (z11) {
            layoutParams2.setMargins(0, 0, 0, 0);
            RoundFrameLayout roundFrameLayout3 = this.f78049p;
            if (roundFrameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutCoreViewContainer");
                roundFrameLayout3 = null;
            }
            roundFrameLayout3.setRadius(C45152a.m99799a(0.0f));
            FrameLayout frameLayout = this.f78051r;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutComponentsContainer");
                frameLayout = null;
            }
            frameLayout.setVisibility(8);
        } else {
            layoutParams2.setMargins(0, C45152a.m99799a(44.0f), 0, C45152a.m99799a(96.0f));
            RoundFrameLayout roundFrameLayout4 = this.f78049p;
            if (roundFrameLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutCoreViewContainer");
                roundFrameLayout4 = null;
            }
            roundFrameLayout4.setRadius(C45152a.m99799a(16.0f));
            FrameLayout frameLayout2 = this.f78051r;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutComponentsContainer");
                frameLayout2 = null;
            }
            frameLayout2.setVisibility(0);
        }
        RoundFrameLayout roundFrameLayout5 = this.f78049p;
        if (roundFrameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutCoreViewContainer");
        } else {
            roundFrameLayout2 = roundFrameLayout5;
        }
        roundFrameLayout2.setLayoutParams(layoutParams2);
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: a */
    public void mo80110a() {
        LiveInfo liveInfo = null;
        this.f78038S = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new AnchorView$addObserver$1(this, null), 3, null);
        CoHostStore.Companion companion = CoHostStore.INSTANCE;
        LiveInfo liveInfo2 = this.f78036Q;
        if (liveInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo2 = null;
        }
        companion.create(liveInfo2.getLiveID()).addCoHostListener(this.f78042W);
        CoGuestStore.Companion companion2 = CoGuestStore.INSTANCE;
        LiveInfo liveInfo3 = this.f78036Q;
        if (liveInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo3 = null;
        }
        companion2.create(liveInfo3.getLiveID()).addHostListener(this.f78043a0);
        BattleStore.Companion companion3 = BattleStore.INSTANCE;
        LiveInfo liveInfo4 = this.f78036Q;
        if (liveInfo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo4 = null;
        }
        companion3.create(liveInfo4.getLiveID()).addBattleListener(this.f78044b0);
        LiveListStore.INSTANCE.shared().addLiveListListener(this.f78045c0);
        LiveAudienceStore.Companion companion4 = LiveAudienceStore.INSTANCE;
        LiveInfo liveInfo5 = this.f78036Q;
        if (liveInfo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
        } else {
            liveInfo = liveInfo5;
        }
        companion4.create(liveInfo.getLiveID()).addLiveAudienceListener(this.f78046d0);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m80111a1(View view, boolean z11) {
        float f11;
        view.setEnabled(z11);
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        view.setAlpha(f11);
    }

    /* JADX INFO: renamed from: a2 */
    public final void m80112a2(SeatUserInfo seatUserInfo) {
        InterfaceC41678w<Boolean> interfaceC41678wM101183c;
        MediaState f78202g = getF78202g();
        if (f78202g != null && (interfaceC41678wM101183c = f78202g.m101183c()) != null && interfaceC41678wM101183c.getValue().booleanValue()) {
            return;
        }
        if (seatUserInfo == null) {
            AtomicAlertDialog atomicAlertDialog = this.f78030K;
            if (atomicAlertDialog != null) {
                atomicAlertDialog.m88063s();
                return;
            }
            return;
        }
        String string = getContext().getString(R$string.common_connect_inviting_append, seatUserInfo.getUserName());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m80130i2(string, seatUserInfo.getAvatarURL(), seatUserInfo.getLiveID());
    }

    /* JADX INFO: renamed from: b2 */
    public final void m80114b2() {
        AnchorStore f78203h = getF78203h();
        if (f78203h != null) {
            BarrageStreamView barrageStreamView = this.f78026G;
            if (barrageStreamView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barrageStreamView");
                barrageStreamView = null;
            }
            f78203h.m80222B(barrageStreamView.getBarrageCount());
        }
        PIPPanelStore.f77996b.sharedInstance().getF77998a().m99362g(false);
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: c */
    public void mo80115c() {
        LayoutInflater.from(getF78197b()).inflate(R$layout.livekit_livestream_anchor_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.fl_video_view_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78049p = (RoundFrameLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.rl_component_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78051r = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.fl_header_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78052s = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.audience_list_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f78058y = (AudienceListView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.iv_end_live_stream);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f78053t = (ImageView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.iv_float_window);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f78054u = (ImageView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R$id.ll_co_guest);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f78055v = viewFindViewById7;
        View viewFindViewById8 = findViewById(R$id.ll_co_host);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f78056w = viewFindViewById8;
        View viewFindViewById9 = findViewById(R$id.ll_battle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f78057x = viewFindViewById9;
        View viewFindViewById10 = findViewById(R$id.barrage_input_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f78025F = (BarrageInputView) viewFindViewById10;
        View viewFindViewById11 = findViewById(R$id.barrage_stream_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f78026G = (BarrageStreamView) viewFindViewById11;
        View viewFindViewById12 = findViewById(R$id.room_info_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f78059z = (LiveInfoView) viewFindViewById12;
        View viewFindViewById13 = findViewById(R$id.people_count_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f78021B = (KCPeopleCountView) viewFindViewById13;
        View viewFindViewById14 = findViewById(R$id.trade_card_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f78022C = (KCTradeCardView) viewFindViewById14;
        View viewFindViewById15 = findViewById(R$id.network_info_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.f78024E = (NetworkInfoView) viewFindViewById15;
        View viewFindViewById16 = findViewById(R$id.rl_apply_link_audience);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        this.f78028I = (ApplyCoGuestFloatView) viewFindViewById16;
        View viewFindViewById17 = findViewById(R$id.gift_play_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        this.f78027H = (GiftPlayView) viewFindViewById17;
        RoundFrameLayout roundFrameLayout = this.f78049p;
        if (roundFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutCoreViewContainer");
            roundFrameLayout = null;
        }
        roundFrameLayout.setRadius(C45152a.m99799a(16.0f));
    }

    /* JADX INFO: renamed from: d1 */
    public final void m80118d1() throws Exception {
        Bitmap bigMuteBitmap;
        AnchorState f78198c = getF78198c();
        if (f78198c != null) {
            LiveCoreView liveCoreView = this.f78050q;
            Bitmap smallMuteBitmap = null;
            if (liveCoreView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
                liveCoreView = null;
            }
            MediaState f78202g = getF78202g();
            if (f78202g != null) {
                bigMuteBitmap = f78202g.getBigMuteBitmap();
            } else {
                bigMuteBitmap = null;
            }
            MediaState f78202g2 = getF78202g();
            if (f78202g2 != null) {
                smallMuteBitmap = f78202g2.getSmallMuteBitmap();
            }
            liveCoreView.setLocalVideoMuteImage(bigMuteBitmap, smallMuteBitmap);
            LiveListStore liveListStoreShared = LiveListStore.INSTANCE.shared();
            liveListStoreShared.joinLive(f78198c.getRoomId(), new C36003f(liveListStoreShared));
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final void m80121e1(AnchorStore anchorStore) {
        if (anchorStore.getF78170c().getLiveInfo().getKeepOwnerOnSeat()) {
            LiveListStore.INSTANCE.shared().endLive(new C36005g(anchorStore, this));
        } else {
            m79974I1(this, false, 1, null);
        }
        TUICore.notifyEvent(TUIConstants.Privacy.EVENT_ROOM_STATE_CHANGED, TUIConstants.Privacy.EVENT_SUB_KEY_ROOM_STATE_STOP, null);
        TUICore.notifyEvent("RTCRoomTimeLimitService", "CountdownEnd", null);
        LiveCoreView liveCoreView = this.f78050q;
        if (liveCoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView = null;
        }
        liveCoreView.setLocalVideoMuteImage(null, null);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m80123f1() {
        if (getF78197b() instanceof Activity) {
            ((Activity) getF78197b()).setResult(-1, new Intent());
            ((Activity) getF78197b()).finishAndRemoveTask();
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final void m80126g2() {
        AnchorStore f78203h = getF78203h();
        if (f78203h != null) {
            if (this.f78032M == null) {
                this.f78032M = new DialogC46765d(getF78197b(), f78203h);
            }
            DialogC46765d dialogC46765d = this.f78032M;
            if (dialogC46765d != null) {
                dialogC46765d.show();
            }
        }
    }

    @NotNull
    public final AnchorBoardcastState getState() {
        AnchorBoardcastState f78181n;
        AnchorStore f78203h = getF78203h();
        if (f78203h != null && (f78181n = f78203h.getF78181n()) != null) {
            return f78181n;
        }
        return new AnchorBoardcastState();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m80127h1() {
        AnchorStore f78203h = getF78203h();
        if (f78203h != null) {
            ApplyCoGuestFloatView applyCoGuestFloatView = this.f78028I;
            LiveCoreView liveCoreView = null;
            if (applyCoGuestFloatView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applyCoGuestFloatView");
                applyCoGuestFloatView = null;
            }
            LiveCoreView liveCoreView2 = this.f78050q;
            if (liveCoreView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            } else {
                liveCoreView = liveCoreView2;
            }
            applyCoGuestFloatView.m80446j(f78203h, liveCoreView);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m80129i1() {
        AnchorState f78198c = getF78198c();
        if (f78198c != null) {
            AudienceListView audienceListView = this.f78058y;
            AudienceListView audienceListView2 = null;
            if (audienceListView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audienceListView");
                audienceListView = null;
            }
            audienceListView.m79422n(f78198c.getLiveInfo());
            AudienceListView audienceListView3 = this.f78058y;
            if (audienceListView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audienceListView");
            } else {
                audienceListView2 = audienceListView3;
            }
            audienceListView2.setOnUserItemClickListener(new C36006h());
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final void m80131j1() {
        AnchorState f78198c = getF78198c();
        if (f78198c != null) {
            BarrageInputView barrageInputView = this.f78025F;
            if (barrageInputView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barrageInputView");
                barrageInputView = null;
            }
            barrageInputView.mo79409b(f78198c.getRoomId());
        }
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m80107X0();
    }

    /* JADX INFO: renamed from: q2 */
    public final void m80137q2() {
        final AnchorStore f78203h = getF78203h();
        if (f78203h == null) {
            return;
        }
        final String liveID = LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID();
        List<SeatUserInfo> value = CoGuestStore.INSTANCE.create(liveID).getCoGuestState().getConnected().getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (Intrinsics.areEqual(((SeatUserInfo) obj).getLiveID(), liveID)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        boolean z11 = true;
        if (size <= 1) {
            z11 = false;
        }
        boolean zIsEmpty = CoHostStore.INSTANCE.create(liveID).getCoHostState().getConnected().getValue().isEmpty();
        boolean zAreEqual = Intrinsics.areEqual(f78203h.m80232i().m101129e().getValue(), Boolean.TRUE);
        AtomicAlertDialog atomicAlertDialog = new AtomicAlertDialog(getF78197b(), null, 2, null);
        if (zAreEqual) {
            final String string = getF78197b().getString(R$string.common_end_pk_tips);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            atomicAlertDialog.m88065u(new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AnchorView.m80047r2(string, this, f78203h, liveID, (AtomicAlertDialog.DialogConfig) obj2);
                }
            });
        } else if (!zIsEmpty) {
            final String string2 = getF78197b().getString(R$string.common_end_connection_tips);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            atomicAlertDialog.m88065u(new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AnchorView.m80061v2(string2, this, liveID, f78203h, (AtomicAlertDialog.DialogConfig) obj2);
                }
            });
        } else if (z11) {
            final String string3 = getF78197b().getString(R$string.common_anchor_end_link_tips);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            atomicAlertDialog.m88065u(new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AnchorView.m80074z2(string3, this, f78203h, (AtomicAlertDialog.DialogConfig) obj2);
                }
            });
        } else {
            atomicAlertDialog.m88065u(new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AnchorView.m79958C2(this.f78138b, f78203h, (AtomicAlertDialog.DialogConfig) obj2);
                }
            });
        }
        atomicAlertDialog.m88054I();
    }

    /* JADX INFO: renamed from: t1 */
    public final void m80138t1() {
        m80077C1();
        m80076B1();
        m80079F1();
        m80129i1();
        m80075A1();
        m80139u1();
        m80140w1();
        m80131j1();
        m80132k1();
        m80135n1();
        m80136q1();
        m80133l1();
        m80078D1();
        m80127h1();
        m80141y1();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnchorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78047n = LiveKitLogger.f77564c.getFeaturesLogger("AnchorView");
        this.f78048o = RoomBehavior.CREATE_ROOM;
        this.f78020A = C41713n0.m91126b();
        this.f78039T = "RTCRoomTimeLimitService";
        this.f78040U = "CountdownStart";
        this.f78041V = "CountdownEnd";
        this.f78042W = new C35997c(context);
        this.f78043a0 = new C35995b();
        this.f78044b0 = new C35979a();
        this.f78045c0 = new C36013o();
        this.f78046d0 = new C36012n();
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: d */
    public void mo80117d() {
    }
}
