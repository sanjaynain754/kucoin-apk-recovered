package io.trtc.tuikit.atomicxcore.api.live.deprecated;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39394d;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39395e;
import io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore;
import io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore;
import io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.device.MirrorType;
import io.trtc.tuikit.atomicxcore.api.gift.GiftStore;
import io.trtc.tuikit.atomicxcore.api.live.BattleConfig;
import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.CoHostLayoutTemplate;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.LikeStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import io.trtc.tuikit.atomicxcore.impl.barrage.C39468e;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39646c;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39649f;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39654k;
import io.trtc.tuikit.atomicxcore.impl.device.C39647d;
import io.trtc.tuikit.atomicxcore.impl.device.C39650g;
import io.trtc.tuikit.atomicxcore.impl.device.C39661r;
import io.trtc.tuikit.atomicxcore.impl.gift.C39667f;
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39769q1;
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39782w0;
import io.trtc.tuikit.atomicxcore.impl.live.C39692M;
import io.trtc.tuikit.atomicxcore.impl.live.C39695N0;
import io.trtc.tuikit.atomicxcore.impl.live.C39716Y0;
import io.trtc.tuikit.atomicxcore.impl.live.C39726c0;
import io.trtc.tuikit.atomicxcore.impl.live.C39733e1;
import io.trtc.tuikit.atomicxcore.impl.live.C39744i0;
import io.trtc.tuikit.atomicxcore.impl.live.C39767q;
import io.trtc.tuikit.atomicxcore.impl.live.C39772r1;
import io.trtc.tuikit.atomicxcore.impl.live.C39774s0;
import io.trtc.tuikit.atomicxcore.impl.view.live.AbstractC40069N;
import io.trtc.tuikit.atomicxcore.impl.view.live.AbstractC40145z;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40084V;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40085V0;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40086W;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40088Y;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40090a;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40092b;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40094c;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40096d;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40098e;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40102g;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40104h;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40106i;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40108j;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40110k;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40112l;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40119m;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40121n;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40123o;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40125p;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40127q;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40129r;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40131s;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40135u;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40137v;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40139w;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40141x;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40143y;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Lazy;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\b&\u0018\u0000 \u008a\u00012\u00020\u0001:\u0002\u008a\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u000f\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0016\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u0016\u0010\u0019J!\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001c\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u001f\u0010\u0017J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020 H\u0007¢\u0006\u0004\b%\u0010#J!\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b)\u0010\u0017J\u000f\u0010*\u001a\u00020\u000eH\u0007¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b,\u0010\u0017J\u000f\u0010-\u001a\u00020\u000eH\u0007¢\u0006\u0004\b-\u0010+J\u000f\u0010.\u001a\u00020\u000eH\u0007¢\u0006\u0004\b.\u0010+J1\u00102\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b2\u00103J9\u00102\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00105\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b2\u00106J!\u00107\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b7\u00108J)\u0010:\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u001a2\u0006\u00109\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b:\u0010;J!\u0010<\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b<\u00108J\u000f\u0010=\u001a\u00020\u000eH\u0007¢\u0006\u0004\b=\u0010+J)\u0010?\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010>H\u0007¢\u0006\u0004\b?\u0010@J!\u0010A\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\bA\u00108J)\u0010B\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00109\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\bB\u0010;J\u000f\u0010C\u001a\u00020\u000eH\u0007¢\u0006\u0004\bC\u0010+J7\u0010I\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020D2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001a0F2\u0006\u00100\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010HH\u0007¢\u0006\u0004\bI\u0010JJ/\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u001a2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001a0F2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\bL\u0010MJ)\u0010N\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u001a2\u0006\u00109\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\bN\u0010;J!\u0010O\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\bO\u00108J\u0017\u0010R\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020PH\u0007¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020PH\u0007¢\u0006\u0004\bT\u0010SJ\u0017\u0010V\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020UH\u0007¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020UH\u0007¢\u0006\u0004\bX\u0010WJ'\u0010]\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010[\u001a\u00020 2\u0006\u0010\\\u001a\u00020\u001aH\u0007¢\u0006\u0004\b]\u0010^J#\u0010b\u001a\u00020\u000e2\b\u0010`\u001a\u0004\u0018\u00010_2\b\u0010a\u001a\u0004\u0018\u00010_H\u0007¢\u0006\u0004\bb\u0010cJ\u0011\u0010e\u001a\u0004\u0018\u00010dH\u0007¢\u0006\u0004\be\u0010fR\"\u0010g\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010n\u001a\u00020m8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001a\u0010u\u001a\u00020t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR$\u0010y\u001a\u0004\u0018\u00010_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u007f\u001a\u0004\u0018\u00010_8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010z\u001a\u0005\b\u0080\u0001\u0010|\"\u0005\b\u0081\u0001\u0010~R(\u0010\u0082\u0001\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0005\b\u0086\u0001\u0010#R(\u0010\u0087\u0001\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0087\u0001\u0010\u0083\u0001\u001a\u0006\b\u0088\u0001\u0010\u0085\u0001\"\u0005\b\u0089\u0001\u0010#¨\u0006\u008b\u0001"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;", "roomInfo", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;", TUIConstants.TUIChat.CALL_BACK, "", "startLiveStream", "(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;", "liveInfo", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;", "(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;", "stopLiveStream", "(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$StopLiveCallback;", "(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$StopLiveCallback;)V", "", "roomId", "joinLiveStream", "(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V", "(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V", "leaveLiveStream", "", "isFront", "switchCamera", "(Z)V", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "enableMirror", "useFrontCamera", "startCamera", "(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V", "startMicrophone", "muteMicrophone", "()V", "unmuteMicrophone", "stopCamera", "stopMicrophone", "userId", "timeout", "openCamera", "requestIntraRoomConnection", "(Ljava/lang/String;IZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V", "index", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "(Ljava/lang/String;IIZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V", "cancelIntraRoomConnection", "(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V", "isAccepted", "respondIntraRoomConnection", "(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V", "disconnectUser", "terminateIntraRoomConnection", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;", "requestCrossRoomConnection", "(Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;)V", "cancelCrossRoomConnection", "respondToCrossRoomConnection", "terminateCrossRoomConnection", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;", "config", "", "userIdList", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleRequestCallback;", "requestBattle", "(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;Ljava/util/List;ILio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleRequestCallback;)V", "battleId", "cancelBattle", "(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V", "respondToBattle", "terminateBattle", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;", "observer", "registerConnectionObserver", "(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V", "unregisterConnectionObserver", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleObserver;", "registerBattleObserver", "(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleObserver;)V", "unregisterBattleObserver", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$LayoutMode;", "layoutModel", "showEmptySeat", "layoutJson", "setLayoutMode", "(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$LayoutMode;ZLjava/lang/String;)V", "Landroid/graphics/Bitmap;", "bigBitmap", "smallBitmap", "setLocalVideoMuteImage", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;", "getCoreState", "()Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;", "liveId", "Ljava/lang/String;", "getLiveId$atomicxcore_release", "()Ljava/lang/String;", "setLiveId$atomicxcore_release", "(Ljava/lang/String;)V", "Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;", "callbackHandler", "Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;", "getCallbackHandler$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;", "setCallbackHandler$atomicxcore_release", "(Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;)V", "Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;", "coreStateProvider", "Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;", "getCoreStateProvider$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;", "bigPlaceholderBitmap", "Landroid/graphics/Bitmap;", "getBigPlaceholderBitmap$atomicxcore_release", "()Landroid/graphics/Bitmap;", "setBigPlaceholderBitmap$atomicxcore_release", "(Landroid/graphics/Bitmap;)V", "smallPlaceholderBitmap", "getSmallPlaceholderBitmap$atomicxcore_release", "setSmallPlaceholderBitmap$atomicxcore_release", "coGuestAutoOpenCamera", "Z", "getCoGuestAutoOpenCamera$atomicxcore_release", "()Z", "setCoGuestAutoOpenCamera$atomicxcore_release", "coGuestAutoOpenMicrophone", "getCoGuestAutoOpenMicrophone$atomicxcore_release", "setCoGuestAutoOpenMicrophone$atomicxcore_release", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class LiveCoreViewDeprecated extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int coHostTemplateId = 600;

    @Nullable
    private Bitmap bigPlaceholderBitmap;

    @NotNull
    private C40088Y callbackHandler;
    private boolean coGuestAutoOpenCamera;
    private boolean coGuestAutoOpenMicrophone;

    @NotNull
    private final C40085V0 coreStateProvider;

    @NotNull
    private String liveId;

    @Nullable
    private Bitmap smallPlaceholderBitmap;

    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated$Companion;", "", "()V", "coHostTemplateId", "", "getCoHostTemplateId", "()I", "setCoHostTemplateId", "(I)V", "callExperimentalAPI", "", "jsonStr", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Deprecated(message = "")
        @JvmStatic
        public final void callExperimentalAPI(@NotNull String jsonStr) {
            Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            AbstractC40145z.m88494a(jsonStr);
        }

        public final int getCoHostTemplateId() {
            return LiveCoreViewDeprecated.coHostTemplateId;
        }

        public final void setCoHostTemplateId(int i11) {
            LiveCoreViewDeprecated.coHostTemplateId = i11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveCoreViewDeprecated(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Deprecated(message = "")
    public final void joinLiveStream(@NotNull String roomId, @Nullable TUIRoomDefine.GetRoomInfoCallback callback) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        AbstractC40145z.m88493a(this, roomId, new C40098e(callback));
    }

    @Deprecated(message = "")
    public final void requestIntraRoomConnection(@NotNull String userId, int index, int timeout, boolean open, @Nullable TUIRoomDefine.ActionCallback callback) throws Exception {
        CoGuestStore coGuestStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(userId, "userId");
        setCoGuestAutoOpenMicrophone$atomicxcore_release(true);
        setCoGuestAutoOpenCamera$atomicxcore_release(open);
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(CoGuestStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88293a;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88294a;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88298a;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(CoGuestStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, CoGuestStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = CoGuestStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            coGuestStore = (CoGuestStore) obj;
        }
        coGuestStore.applyForSeat(index, timeout, String.valueOf(open), new C40110k(callback));
        if (callback != null) {
            callback.onSuccess();
        }
    }

    @Deprecated(message = "")
    public final void startLiveStream(@NotNull TUIRoomDefine.RoomInfo roomInfo, @Nullable TUIRoomDefine.GetRoomInfoCallback callback) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        TUILiveListManager.LiveInfo liveInfo = new TUILiveListManager.LiveInfo();
        liveInfo.roomId = roomInfo.roomId;
        liveInfo.ownerId = roomInfo.ownerId;
        liveInfo.ownerName = roomInfo.ownerName;
        liveInfo.ownerAvatarUrl = roomInfo.ownerAvatarUrl;
        liveInfo.name = roomInfo.name;
        liveInfo.isMessageDisableForAllUser = roomInfo.isMessageDisableForAllUser;
        liveInfo.isSeatEnabled = roomInfo.isSeatEnabled;
        liveInfo.keepOwnerOnSeat = roomInfo.keepOwnerOnSeat;
        liveInfo.maxSeatCount = roomInfo.maxSeatCount;
        liveInfo.seatMode = roomInfo.seatMode;
        liveInfo.createTime = roomInfo.createTime;
        liveInfo.categoryList = Collections.EMPTY_LIST;
        AbstractC40145z.m88492a(this, liveInfo, new C40131s(callback));
    }

    @Deprecated(message = "")
    public final void stopLiveStream(@Nullable TUILiveListManager.StopLiveCallback callback) throws Exception {
        LiveListStore liveListStoreM88331a;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(this, "<this>");
        getCallbackHandler().m88489b(getLiveId());
        InterfaceC41775x1 interfaceC41775x1 = getCoreStateProvider().f89158c;
        if (interfaceC41775x1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscribeAfterEnterRoomState");
            interfaceC41775x1 = null;
        }
        InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(LiveListStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            liveListStoreM88331a = (LiveListStore) objM88293a;
        } else if (Intrinsics.areEqual(LiveListStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            liveListStoreM88331a = (LiveListStore) objM88294a;
        } else if (Intrinsics.areEqual(LiveListStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            liveListStoreM88331a = (LiveListStore) objM88298a;
        } else if (Intrinsics.areEqual(LiveListStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            liveListStoreM88331a = AbstractC39782w0.m88331a();
            if (liveListStoreM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(LiveListStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, LiveListStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = LiveListStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            liveListStoreM88331a = (LiveListStore) obj;
        }
        AbstractC40069N.m88430a((LiveCoreView) this);
        liveListStoreM88331a.endLive(new C40139w(callback));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveCoreViewDeprecated(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final void callExperimentalAPI(@NotNull String str) {
        INSTANCE.callExperimentalAPI(str);
    }

    @Deprecated(message = "")
    public final void cancelBattle(@NotNull String battleId, @NotNull List<String> userIdList, @Nullable TUIRoomDefine.ActionCallback callback) throws Exception {
        BattleStore battleStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(battleId, "battleId");
        Intrinsics.checkNotNullParameter(userIdList, "userIdList");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(battleId, "battleId");
        Intrinsics.checkNotNullParameter(userIdList, "userIdList");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(BattleStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88293a;
        } else if (Intrinsics.areEqual(BattleStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88294a;
        } else if (Intrinsics.areEqual(BattleStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88298a;
        } else if (Intrinsics.areEqual(BattleStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(BattleStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, BattleStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = BattleStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            battleStore = (BattleStore) obj;
        }
        battleStore.cancelBattleRequest(battleId, userIdList, new C40090a(callback));
    }

    @Deprecated(message = "")
    public final void cancelCrossRoomConnection(@NotNull String roomId, @Nullable TUIRoomDefine.ActionCallback callback) throws Exception {
        CoHostStore coHostStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(CoHostStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88293a;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88294a;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88298a;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(CoHostStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, CoHostStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = CoHostStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            coHostStore = (CoHostStore) obj;
        }
        coHostStore.cancelHostConnection(roomId, new C40092b(callback));
    }

    @Deprecated(message = "")
    public final void enableMirror(boolean enable) throws Exception {
        DeviceStore deviceStoreM88298a;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(DeviceStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88293a;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88294a;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            deviceStoreM88298a = AbstractC39654k.m88298a();
            if (deviceStoreM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(DeviceStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, DeviceStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = DeviceStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            deviceStoreM88298a = (DeviceStore) obj;
        }
        deviceStoreM88298a.switchMirror(enable ? MirrorType.ENABLE : MirrorType.DISABLE);
    }

    @Nullable
    /* JADX INFO: renamed from: getBigPlaceholderBitmap$atomicxcore_release, reason: from getter */
    public final Bitmap getBigPlaceholderBitmap() {
        return this.bigPlaceholderBitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: getCallbackHandler$atomicxcore_release, reason: from getter */
    public final C40088Y getCallbackHandler() {
        return this.callbackHandler;
    }

    /* JADX INFO: renamed from: getCoGuestAutoOpenCamera$atomicxcore_release, reason: from getter */
    public final boolean getCoGuestAutoOpenCamera() {
        return this.coGuestAutoOpenCamera;
    }

    /* JADX INFO: renamed from: getCoGuestAutoOpenMicrophone$atomicxcore_release, reason: from getter */
    public final boolean getCoGuestAutoOpenMicrophone() {
        return this.coGuestAutoOpenMicrophone;
    }

    @Deprecated(message = "")
    @Nullable
    public final LiveCoreViewDefine.CoreState getCoreState() {
        return this.coreStateProvider.f89156a;
    }

    @NotNull
    /* JADX INFO: renamed from: getCoreStateProvider$atomicxcore_release, reason: from getter */
    public final C40085V0 getCoreStateProvider() {
        return this.coreStateProvider;
    }

    @NotNull
    /* JADX INFO: renamed from: getLiveId$atomicxcore_release, reason: from getter */
    public final String getLiveId() {
        return this.liveId;
    }

    @Nullable
    /* JADX INFO: renamed from: getSmallPlaceholderBitmap$atomicxcore_release, reason: from getter */
    public final Bitmap getSmallPlaceholderBitmap() {
        return this.smallPlaceholderBitmap;
    }

    @Deprecated(message = "")
    public final void leaveLiveStream(@Nullable TUIRoomDefine.ActionCallback callback) throws Exception {
        LiveListStore liveListStoreM88331a;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(this, "<this>");
        getCallbackHandler().m88489b(getLiveId());
        InterfaceC41775x1 interfaceC41775x1 = getCoreStateProvider().f89158c;
        if (interfaceC41775x1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscribeAfterEnterRoomState");
            interfaceC41775x1 = null;
        }
        InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(LiveListStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            liveListStoreM88331a = (LiveListStore) objM88293a;
        } else if (Intrinsics.areEqual(LiveListStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            liveListStoreM88331a = (LiveListStore) objM88294a;
        } else if (Intrinsics.areEqual(LiveListStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            liveListStoreM88331a = (LiveListStore) objM88298a;
        } else if (Intrinsics.areEqual(LiveListStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            liveListStoreM88331a = AbstractC39782w0.m88331a();
            if (liveListStoreM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(LiveListStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, LiveListStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = LiveListStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            liveListStoreM88331a = (LiveListStore) obj;
        }
        LiveCoreView liveCoreView = (LiveCoreView) this;
        AbstractC40069N.m88430a(liveCoreView);
        liveCoreView.getLayoutBattleWidgetsLayerLayer$atomicxcore_release().removeAllViews();
        liveListStoreM88331a.leaveLive(new C40102g(callback));
    }

    @Deprecated(message = "")
    public final void muteMicrophone() throws Exception {
        LiveSeatStore liveSeatStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(LiveSeatStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            liveSeatStore = (LiveSeatStore) objM88293a;
        } else if (Intrinsics.areEqual(LiveSeatStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            liveSeatStore = (LiveSeatStore) objM88294a;
        } else if (Intrinsics.areEqual(LiveSeatStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            liveSeatStore = (LiveSeatStore) objM88298a;
        } else if (Intrinsics.areEqual(LiveSeatStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            liveSeatStore = (LiveSeatStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(LiveSeatStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, LiveSeatStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = LiveSeatStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            liveSeatStore = (LiveSeatStore) obj;
        }
        liveSeatStore.muteMicrophone();
        LiveData<Boolean> liveData = getCoreStateProvider().f89156a.mediaState.isMicrophoneMuted;
        Intrinsics.checkNotNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Boolean>");
        ((MutableLiveData) liveData).setValue(Boolean.TRUE);
    }

    @Deprecated(message = "")
    public final void registerBattleObserver(@NotNull LiveCoreViewDefine.BattleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        C40088Y c40088y = this.callbackHandler;
        c40088y.getClass();
        Intrinsics.checkNotNullParameter(observer, "observer");
        c40088y.f89165e.add(new WeakReference(observer));
    }

    @Deprecated(message = "")
    public final void registerConnectionObserver(@NotNull LiveCoreViewDefine.ConnectionObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        C40088Y c40088y = this.callbackHandler;
        c40088y.getClass();
        Intrinsics.checkNotNullParameter(observer, "observer");
        c40088y.f89164d.add(new WeakReference(observer));
    }

    @Deprecated(message = "")
    public final void requestBattle(@NotNull TUILiveBattleManager.BattleConfig config, @NotNull List<String> userIdList, int timeout, @Nullable LiveCoreViewDefine.BattleRequestCallback callback) throws Exception {
        BattleStore battleStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(userIdList, "userIdList");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(userIdList, "userIdList");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(BattleStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88293a;
        } else if (Intrinsics.areEqual(BattleStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88294a;
        } else if (Intrinsics.areEqual(BattleStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88298a;
        } else if (Intrinsics.areEqual(BattleStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(BattleStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, BattleStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = BattleStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            battleStore = (BattleStore) obj;
        }
        Intrinsics.checkNotNullParameter(config, "battleConfig");
        int i11 = config.duration;
        boolean z11 = config.needResponse;
        String extensionInfo = config.extensionInfo;
        Intrinsics.checkNotNullExpressionValue(extensionInfo, "extensionInfo");
        battleStore.requestBattle(new BattleConfig(i11, z11, extensionInfo), userIdList, timeout, new C40104h(callback));
    }

    @Deprecated(message = "")
    public final void requestCrossRoomConnection(@NotNull String roomId, int timeout, @Nullable TUILiveConnectionManager.ConnectionRequestCallback callback) throws Exception {
        Class cls;
        Class cls2;
        CoGuestStore coGuestStore;
        Object objPutIfAbsent;
        CoHostStore coHostStore;
        Object c39733e1;
        Object objPutIfAbsent2;
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(CoGuestStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88293a;
            cls = LikeStore.class;
            cls2 = GiftStore.class;
        } else {
            cls = LikeStore.class;
            cls2 = GiftStore.class;
            if (Intrinsics.areEqual(CoGuestStore.class.getName(), BaseBeautyStore.class.getName())) {
                Lazy lazy3 = C39650g.f88077g;
                Object objM88294a = AbstractC39649f.m88294a();
                if (objM88294a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
                }
                coGuestStore = (CoGuestStore) objM88294a;
            } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), DeviceStore.class.getName())) {
                Lazy lazy4 = C39661r.f88102s;
                Object objM88298a = AbstractC39654k.m88298a();
                if (objM88298a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
                }
                coGuestStore = (CoGuestStore) objM88298a;
            } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), LiveListStore.class.getName())) {
                Lazy lazy5 = C39695N0.f88198j;
                Object objM88331a = AbstractC39782w0.m88331a();
                if (objM88331a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
                }
                coGuestStore = (CoGuestStore) objM88331a;
            } else {
                C39510r c39510r = c39772r1M88324a.f88380b;
                c39510r.m88251a(1, AbstractC39394d.m88223a(CoGuestStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
                ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
                Object concurrentHashMap2 = concurrentHashMap.get(liveId);
                if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                    concurrentHashMap2 = objPutIfAbsent;
                }
                Map map = (Map) concurrentHashMap2;
                String strM88224a = AbstractC39395e.m88224a(map, CoGuestStore.class, "getName(...)");
                Object c39733e2 = map.get(strM88224a);
                if (c39733e2 == null) {
                    String name = CoGuestStore.class.getName();
                    if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                        c39733e2 = new C39468e(liveId);
                    } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                        c39733e2 = new C39767q(liveId);
                    } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                        c39733e2 = new C39692M(liveId);
                    } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                        c39733e2 = new C39726c0(liveId);
                    } else if (Intrinsics.areEqual(name, cls2.getName())) {
                        c39733e2 = new C39667f(liveId);
                    } else if (Intrinsics.areEqual(name, cls.getName())) {
                        c39733e2 = new C39744i0(liveId);
                    } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                        c39733e2 = new C39774s0(liveId);
                    } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                        c39733e2 = new C39716Y0(liveId);
                    } else {
                        if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                            throw new Exception("type is not supported");
                        }
                        c39733e2 = new C39733e1(liveId);
                    }
                    map.put(strM88224a, c39733e2);
                }
                coGuestStore = (CoGuestStore) c39733e2;
            }
        }
        if (!coGuestStore.getCoGuestState().getApplicants().getValue().isEmpty() || !coGuestStore.getCoGuestState().getInvitees().getValue().isEmpty() || coGuestStore.getCoGuestState().getConnected().getValue().size() > 1) {
            if (callback != null) {
                callback.onError(TUICommonDefine.Error.ALREADY_IN_SEAT, "Cross-room connections are not allowed when there are viewers connected in the room");
                return;
            }
            return;
        }
        C39772r1 c39772r1M88324a2 = AbstractC39769q1.m88324a();
        String liveId2 = getLiveId();
        if (Intrinsics.areEqual(CoHostStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy6 = C39647d.f88068h;
            Object objM88293a2 = AbstractC39646c.m88293a();
            if (objM88293a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88293a2;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy7 = C39650g.f88077g;
            Object objM88294a2 = AbstractC39649f.m88294a();
            if (objM88294a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88294a2;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy8 = C39661r.f88102s;
            Object objM88298a2 = AbstractC39654k.m88298a();
            if (objM88298a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88298a2;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy9 = C39695N0.f88198j;
            Object objM88331a2 = AbstractC39782w0.m88331a();
            if (objM88331a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88331a2;
        } else {
            C39510r c39510r2 = c39772r1M88324a2.f88380b;
            c39510r2.m88251a(1, AbstractC39394d.m88223a(CoHostStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r2, "message"));
            ConcurrentHashMap concurrentHashMap3 = c39772r1M88324a2.f88379a;
            Object concurrentHashMap4 = concurrentHashMap3.get(liveId2);
            if (concurrentHashMap4 == null && (objPutIfAbsent2 = concurrentHashMap3.putIfAbsent(liveId2, (concurrentHashMap4 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap4 = objPutIfAbsent2;
            }
            Map map2 = (Map) concurrentHashMap4;
            String strM88224a2 = AbstractC39395e.m88224a(map2, CoHostStore.class, "getName(...)");
            Object obj = map2.get(strM88224a2);
            if (obj == null) {
                String name2 = CoHostStore.class.getName();
                if (Intrinsics.areEqual(name2, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId2);
                } else if (Intrinsics.areEqual(name2, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId2);
                } else if (Intrinsics.areEqual(name2, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId2);
                } else if (Intrinsics.areEqual(name2, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId2);
                } else if (Intrinsics.areEqual(name2, cls2.getName())) {
                    c39733e1 = new C39667f(liveId2);
                } else if (Intrinsics.areEqual(name2, cls.getName())) {
                    c39733e1 = new C39744i0(liveId2);
                } else if (Intrinsics.areEqual(name2, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId2);
                } else if (Intrinsics.areEqual(name2, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId2);
                } else {
                    if (!Intrinsics.areEqual(name2, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId2);
                }
                obj = c39733e1;
                map2.put(strM88224a2, obj);
            }
            coHostStore = (CoHostStore) obj;
        }
        CoHostLayoutTemplate coHostLayoutTemplate = CoHostLayoutTemplate.HOST_DYNAMIC_GRID;
        if (coHostLayoutTemplate.getValue() != INSTANCE.getCoHostTemplateId()) {
            coHostLayoutTemplate = CoHostLayoutTemplate.HOST_DYNAMIC_1V6;
        }
        coHostStore.requestHostConnection(roomId, coHostLayoutTemplate, timeout, "", new C40106i(roomId, callback));
    }

    @Deprecated(message = "")
    public final void respondToBattle(@NotNull String battleId, boolean isAccepted, @Nullable TUIRoomDefine.ActionCallback callback) throws Exception {
        BattleStore battleStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(battleId, "battleId");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(battleId, "battleId");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(BattleStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88293a;
        } else if (Intrinsics.areEqual(BattleStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88294a;
        } else if (Intrinsics.areEqual(BattleStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88298a;
        } else if (Intrinsics.areEqual(BattleStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(BattleStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, BattleStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = BattleStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            battleStore = (BattleStore) obj;
        }
        if (isAccepted) {
            battleStore.acceptBattle(battleId, new C40121n(callback));
        } else {
            battleStore.rejectBattle(battleId, new C40123o(callback));
        }
    }

    @Deprecated(message = "")
    public final void respondToCrossRoomConnection(@NotNull String roomId, boolean isAccepted, @Nullable TUIRoomDefine.ActionCallback callback) throws Exception {
        CoHostStore coHostStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(CoHostStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88293a;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88294a;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88298a;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(CoHostStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, CoHostStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = CoHostStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            coHostStore = (CoHostStore) obj;
        }
        if (isAccepted) {
            coHostStore.acceptHostConnection(roomId, new C40125p(callback));
        } else {
            coHostStore.rejectHostConnection(roomId, new C40127q(callback));
        }
    }

    public final void setBigPlaceholderBitmap$atomicxcore_release(@Nullable Bitmap bitmap) {
        this.bigPlaceholderBitmap = bitmap;
    }

    public final void setCallbackHandler$atomicxcore_release(@NotNull C40088Y c40088y) {
        Intrinsics.checkNotNullParameter(c40088y, "<set-?>");
        this.callbackHandler = c40088y;
    }

    public final void setCoGuestAutoOpenCamera$atomicxcore_release(boolean z11) {
        this.coGuestAutoOpenCamera = z11;
    }

    public final void setCoGuestAutoOpenMicrophone$atomicxcore_release(boolean z11) {
        this.coGuestAutoOpenMicrophone = z11;
    }

    @Deprecated(message = "")
    public final void setLayoutMode(@NotNull LiveCoreViewDefine.LayoutMode layoutModel, boolean showEmptySeat, @NotNull String layoutJson) {
        Intrinsics.checkNotNullParameter(layoutModel, "layoutModel");
        Intrinsics.checkNotNullParameter(layoutJson, "layoutJson");
    }

    public final void setLiveId$atomicxcore_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.liveId = str;
    }

    @Deprecated(message = "")
    public final void setLocalVideoMuteImage(@Nullable Bitmap bigBitmap, @Nullable Bitmap smallBitmap) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        setBigPlaceholderBitmap$atomicxcore_release(bigBitmap);
        setSmallPlaceholderBitmap$atomicxcore_release(smallBitmap);
        List<TUILiveConnectionManager.ConnectionUser> value = getCoreStateProvider().f89156a.coHostState.connectedUserList.getValue();
        boolean z11 = (value != null ? value.size() : 0) <= 1;
        List<TUIRoomDefine.UserInfo> value2 = getCoreStateProvider().f89156a.coGuestState.connectedUserList.getValue();
        boolean z12 = (value2 != null ? value2.size() : 0) <= 1 ? z11 : false;
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (getBigPlaceholderBitmap() == null || getSmallPlaceholderBitmap() == null) {
            return;
        }
        TUIRoomEngine.sharedInstance().setLocalVideoMuteImage(z12 ? getBigPlaceholderBitmap() : getSmallPlaceholderBitmap());
    }

    public final void setSmallPlaceholderBitmap$atomicxcore_release(@Nullable Bitmap bitmap) {
        this.smallPlaceholderBitmap = bitmap;
    }

    @Deprecated(message = "")
    public final void startCamera(boolean useFrontCamera, @Nullable TUIRoomDefine.ActionCallback callback) throws Exception {
        DeviceStore deviceStoreM88298a;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(DeviceStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88293a;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88294a;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            deviceStoreM88298a = AbstractC39654k.m88298a();
            if (deviceStoreM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(DeviceStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, DeviceStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = DeviceStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            deviceStoreM88298a = (DeviceStore) obj;
        }
        deviceStoreM88298a.openLocalCamera(useFrontCamera, new C40129r(callback));
    }

    @Deprecated(message = "")
    public final void startMicrophone(@Nullable TUIRoomDefine.ActionCallback callback) throws Exception {
        DeviceStore deviceStoreM88298a;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(DeviceStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88293a;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88294a;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            deviceStoreM88298a = AbstractC39654k.m88298a();
            if (deviceStoreM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(DeviceStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, DeviceStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = DeviceStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            deviceStoreM88298a = (DeviceStore) obj;
        }
        deviceStoreM88298a.openLocalMicrophone(new C40135u(callback));
    }

    @Deprecated(message = "")
    public final void stopCamera() throws Exception {
        DeviceStore deviceStoreM88298a;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(DeviceStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88293a;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88294a;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            deviceStoreM88298a = AbstractC39654k.m88298a();
            if (deviceStoreM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(DeviceStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, DeviceStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = DeviceStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            deviceStoreM88298a = (DeviceStore) obj;
        }
        deviceStoreM88298a.closeLocalCamera();
    }

    @Deprecated(message = "")
    public final void stopMicrophone() throws Exception {
        DeviceStore deviceStoreM88298a;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(DeviceStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88293a;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88294a;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            deviceStoreM88298a = AbstractC39654k.m88298a();
            if (deviceStoreM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(DeviceStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, DeviceStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = DeviceStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            deviceStoreM88298a = (DeviceStore) obj;
        }
        deviceStoreM88298a.closeLocalMicrophone();
    }

    @Deprecated(message = "")
    public final void switchCamera(boolean isFront) throws Exception {
        DeviceStore deviceStoreM88298a;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(DeviceStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88293a;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88294a;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            deviceStoreM88298a = AbstractC39654k.m88298a();
            if (deviceStoreM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(DeviceStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, DeviceStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = DeviceStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            deviceStoreM88298a = (DeviceStore) obj;
        }
        deviceStoreM88298a.switchCamera(isFront);
    }

    @Deprecated(message = "")
    public final void terminateBattle(@NotNull String battleId, @Nullable TUIRoomDefine.ActionCallback callback) throws Exception {
        BattleStore battleStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(battleId, "battleId");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(battleId, "battleId");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(BattleStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88293a;
        } else if (Intrinsics.areEqual(BattleStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88294a;
        } else if (Intrinsics.areEqual(BattleStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88298a;
        } else if (Intrinsics.areEqual(BattleStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(BattleStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, BattleStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = BattleStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            battleStore = (BattleStore) obj;
        }
        battleStore.exitBattle(battleId, new C40141x(callback));
    }

    @Deprecated(message = "")
    public final void terminateCrossRoomConnection() throws Exception {
        CoHostStore coHostStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(CoHostStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88293a;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88294a;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88298a;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(CoHostStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, CoHostStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = CoHostStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            coHostStore = (CoHostStore) obj;
        }
        coHostStore.exitHostConnection(null);
    }

    @Deprecated(message = "")
    public final void terminateIntraRoomConnection() throws Exception {
        CoGuestStore coGuestStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (getCoGuestAutoOpenCamera()) {
            stopCamera();
            setCoGuestAutoOpenCamera$atomicxcore_release(false);
        }
        if (getCoGuestAutoOpenMicrophone()) {
            stopMicrophone();
            setCoGuestAutoOpenMicrophone$atomicxcore_release(false);
        }
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(CoGuestStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88293a;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88294a;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88298a;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(CoGuestStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, CoGuestStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = CoGuestStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            coGuestStore = (CoGuestStore) obj;
        }
        coGuestStore.disconnect(null);
    }

    @Deprecated(message = "")
    public final void unmuteMicrophone(@Nullable TUIRoomDefine.ActionCallback callback) throws Exception {
        LiveSeatStore liveSeatStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(LiveSeatStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            liveSeatStore = (LiveSeatStore) objM88293a;
        } else if (Intrinsics.areEqual(LiveSeatStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            liveSeatStore = (LiveSeatStore) objM88294a;
        } else if (Intrinsics.areEqual(LiveSeatStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            liveSeatStore = (LiveSeatStore) objM88298a;
        } else if (Intrinsics.areEqual(LiveSeatStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            liveSeatStore = (LiveSeatStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(LiveSeatStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, LiveSeatStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = LiveSeatStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            liveSeatStore = (LiveSeatStore) obj;
        }
        liveSeatStore.unmuteMicrophone(new C40143y(this, callback));
    }

    @Deprecated(message = "")
    public final void unregisterBattleObserver(@NotNull LiveCoreViewDefine.BattleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        C40088Y c40088y = this.callbackHandler;
        c40088y.getClass();
        Intrinsics.checkNotNullParameter(observer, "observer");
        CollectionsKt.removeAll((List) c40088y.f89165e, (Function1) new C40084V(observer));
    }

    @Deprecated(message = "")
    public final void unregisterConnectionObserver(@NotNull LiveCoreViewDefine.ConnectionObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        C40088Y c40088y = this.callbackHandler;
        c40088y.getClass();
        Intrinsics.checkNotNullParameter(observer, "observer");
        CollectionsKt.removeAll((List) c40088y.f89164d, (Function1) new C40086W(observer));
    }

    public /* synthetic */ LiveCoreViewDeprecated(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Deprecated(message = "")
    public final void cancelIntraRoomConnection(@NotNull String userId, @Nullable TUIRoomDefine.ActionCallback callback) throws Exception {
        CoGuestStore coGuestStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(CoGuestStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a != null) {
                coGuestStore = (CoGuestStore) objM88293a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a != null) {
                coGuestStore = (CoGuestStore) objM88294a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a != null) {
                coGuestStore = (CoGuestStore) objM88298a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a != null) {
                coGuestStore = (CoGuestStore) objM88331a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(CoGuestStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, CoGuestStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = CoGuestStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                    c39733e1 = new C39733e1(liveId);
                } else {
                    throw new Exception("type is not supported");
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            coGuestStore = (CoGuestStore) obj;
        }
        coGuestStore.cancelApplication(new C40094c(callback));
    }

    @Deprecated(message = "")
    public final void disconnectUser(@NotNull String userId, @Nullable TUIRoomDefine.ActionCallback callback) throws Exception {
        LiveSeatStore liveSeatStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(LiveSeatStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a != null) {
                liveSeatStore = (LiveSeatStore) objM88293a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
        } else if (Intrinsics.areEqual(LiveSeatStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a != null) {
                liveSeatStore = (LiveSeatStore) objM88294a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
        } else if (Intrinsics.areEqual(LiveSeatStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a != null) {
                liveSeatStore = (LiveSeatStore) objM88298a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
        } else if (Intrinsics.areEqual(LiveSeatStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a != null) {
                liveSeatStore = (LiveSeatStore) objM88331a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(LiveSeatStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, LiveSeatStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = LiveSeatStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                    c39733e1 = new C39733e1(liveId);
                } else {
                    throw new Exception("type is not supported");
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            liveSeatStore = (LiveSeatStore) obj;
        }
        liveSeatStore.kickUserOutOfSeat(userId, new C40096d(callback));
    }

    @Deprecated(message = "")
    public final void joinLiveStream(@NotNull String roomId, @Nullable TUILiveListManager.LiveInfoCallback callback) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        AbstractC40145z.m88493a(this, roomId, callback);
    }

    @Deprecated(message = "This operation requires opening the camera and microphone. You need to have camera and microphone permissions before calling")
    public final void respondIntraRoomConnection(@NotNull String userId, boolean isAccepted, @Nullable TUIRoomDefine.ActionCallback callback) throws Exception {
        CoGuestStore coGuestStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(CoGuestStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a != null) {
                coGuestStore = (CoGuestStore) objM88293a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a != null) {
                coGuestStore = (CoGuestStore) objM88294a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a != null) {
                coGuestStore = (CoGuestStore) objM88298a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a != null) {
                coGuestStore = (CoGuestStore) objM88331a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(CoGuestStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, CoGuestStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = CoGuestStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                    c39733e1 = new C39733e1(liveId);
                } else {
                    throw new Exception("type is not supported");
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            coGuestStore = (CoGuestStore) obj;
        }
        if (isAccepted) {
            coGuestStore.acceptApplication(userId, new C40112l(callback));
        } else {
            coGuestStore.rejectApplication(userId, new C40119m(callback));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveCoreViewDeprecated(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.liveId = "";
        this.callbackHandler = new C40088Y();
        this.coreStateProvider = new C40085V0();
        C40088Y c40088y = this.callbackHandler;
        c40088y.getClass();
        Intrinsics.checkNotNullParameter(this, "deprecated");
        c40088y.f89163c = new WeakReference(this);
    }

    @Deprecated(message = "")
    public final void startLiveStream(@NotNull TUILiveListManager.LiveInfo liveInfo, @Nullable TUILiveListManager.LiveInfoCallback callback) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        AbstractC40145z.m88492a(this, liveInfo, callback);
    }

    @Deprecated(message = "")
    public final void requestIntraRoomConnection(@NotNull String userId, int timeout, boolean openCamera, @Nullable TUIRoomDefine.ActionCallback callback) throws Exception {
        CoGuestStore coGuestStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(userId, "userId");
        setCoGuestAutoOpenMicrophone$atomicxcore_release(true);
        setCoGuestAutoOpenCamera$atomicxcore_release(openCamera);
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(CoGuestStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88293a;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88294a;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88298a;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(CoGuestStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, CoGuestStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = CoGuestStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            coGuestStore = (CoGuestStore) obj;
        }
        coGuestStore.applyForSeat(-1, timeout, String.valueOf(openCamera), new C40108j(callback));
        if (callback != null) {
            callback.onSuccess();
        }
    }

    @Deprecated(message = "")
    public final void stopLiveStream(@Nullable TUIRoomDefine.ActionCallback callback) throws Exception {
        LiveListStore liveListStoreM88331a;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(this, "<this>");
        getCallbackHandler().m88489b(getLiveId());
        InterfaceC41775x1 interfaceC41775x1 = getCoreStateProvider().f89158c;
        if (interfaceC41775x1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscribeAfterEnterRoomState");
            interfaceC41775x1 = null;
        }
        InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = getLiveId();
        if (Intrinsics.areEqual(LiveListStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            liveListStoreM88331a = (LiveListStore) objM88293a;
        } else if (Intrinsics.areEqual(LiveListStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            liveListStoreM88331a = (LiveListStore) objM88294a;
        } else if (!Intrinsics.areEqual(LiveListStore.class.getName(), DeviceStore.class.getName())) {
            if (Intrinsics.areEqual(LiveListStore.class.getName(), LiveListStore.class.getName())) {
                Lazy lazy4 = C39695N0.f88198j;
                liveListStoreM88331a = AbstractC39782w0.m88331a();
                if (liveListStoreM88331a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
                }
            } else {
                C39510r c39510r = c39772r1M88324a.f88380b;
                c39510r.m88251a(1, AbstractC39394d.m88223a(LiveListStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
                ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
                Object concurrentHashMap2 = concurrentHashMap.get(liveId);
                if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                    concurrentHashMap2 = objPutIfAbsent;
                }
                Map map = (Map) concurrentHashMap2;
                String strM88224a = AbstractC39395e.m88224a(map, LiveListStore.class, "getName(...)");
                Object obj = map.get(strM88224a);
                if (obj == null) {
                    String name = LiveListStore.class.getName();
                    if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                        c39733e1 = new C39468e(liveId);
                    } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                        c39733e1 = new C39767q(liveId);
                    } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                        c39733e1 = new C39692M(liveId);
                    } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                        c39733e1 = new C39726c0(liveId);
                    } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                        c39733e1 = new C39667f(liveId);
                    } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                        c39733e1 = new C39744i0(liveId);
                    } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                        c39733e1 = new C39774s0(liveId);
                    } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                        c39733e1 = new C39716Y0(liveId);
                    } else {
                        if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                            throw new Exception("type is not supported");
                        }
                        c39733e1 = new C39733e1(liveId);
                    }
                    obj = c39733e1;
                    map.put(strM88224a, obj);
                }
                liveListStoreM88331a = (LiveListStore) obj;
            }
        } else {
            Lazy lazy5 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            liveListStoreM88331a = (LiveListStore) objM88298a;
        }
        AbstractC40069N.m88430a((LiveCoreView) this);
        liveListStoreM88331a.endLive(new C40137v(callback));
    }
}
