package com.trtc.uikit.livekit.common;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.tencent.bugly.proguard.C33579c5;
import com.tencent.imsdk.BaseConstants;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.qcloud.tuicore.TUIConfig;
import com.tencent.rtmp.TXVodConstants;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.R$string;
import io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ErrorLocalized.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/trtc/uikit/livekit/common/ErrorLocalized;", "", "<init>", "()V", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ErrorLocalized {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f77561a = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<Integer> f77562b = SetsKt.setOf(-4);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final LiveKitLogger f77563c = LiveKitLogger.f77564c.getCommonLogger("ErrorLocalized");

    /* JADX INFO: compiled from: ErrorLocalized.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bs\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u00020\u0005H\u0007J\u0011\u0010\u007f\u001a\u00030\u0080\u00012\u0006\u0010~\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00050yX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020{X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0081\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/common/ErrorLocalized$Companion;", "", "<init>", "()V", "LIVE_CLIENT_ERROR_SUCCESS", "", "LIVE_CLIENT_ERROR_FREQ_LIMIT", "LIVE_CLIENT_ERROR_REPEAT_OPERATION", "LIVE_CLIENT_ERROR_ROOM_MISMATCH", "LIVE_CLIENT_ERROR_SDK_APP_ID_NOT_FOUND", "LIVE_CLIENT_ERROR_INVALID_PARAMETER", "LIVE_CLIENT_ERROR_SDK_NOT_INITIALIZED", "LIVE_CLIENT_ERROR_PERMISSION_DENIED", "LIVE_CLIENT_ERROR_REQUIRE_PAYMENT", "LIVE_CLIENT_ERROR_CAMERA_START_FAIL", "LIVE_CLIENT_ERROR_CAMERA_NOT_AUTHORIZED", "LIVE_CLIENT_ERROR_CAMERA_OCCUPIED", "LIVE_CLIENT_ERROR_CAMERA_DEVICE_EMPTY", "LIVE_CLIENT_ERROR_MICROPHONE_START_FAIL", "LIVE_CLIENT_ERROR_MICROPHONE_NOT_AUTHORIZED", "LIVE_CLIENT_ERROR_MICROPHONE_OCCUPIED", "LIVE_CLIENT_ERROR_MICROPHONE_DEVICE_EMPTY", "LIVE_CLIENT_ERROR_GET_SCREEN_SHARING_TARGET_FAILED", "LIVE_CLIENT_ERROR_START_SCREEN_SHARING_FAILED", "LIVE_CLIENT_ERROR_OPERATION_INVALID_BEFORE_ENTER_ROOM", "LIVE_CLIENT_ERROR_EXIT_NOT_SUPPORTED_FOR_ROOM_OWNER", "LIVE_CLIENT_ERROR_OPERATION_NOT_SUPPORTED_IN_CURRENT_ROOM_TYPE", "LIVE_CLIENT_ERROR_ROOM_ID_INVALID", "LIVE_CLIENT_ERROR_ROOM_NAME_INVALID", "LIVE_CLIENT_ERROR_ALREADY_IN_OTHER_ROOM", "LIVE_CLIENT_ERROR_USER_NOT_EXIST", "LIVE_CLIENT_ERROR_USER_NEED_OWNER_PERMISSION", "LIVE_CLIENT_ERROR_USER_NEED_ADMIN_PERMISSION", "LIVE_CLIENT_ERROR_REQUEST_NO_PERMISSION", "LIVE_CLIENT_ERROR_REQUEST_ID_INVALID", "LIVE_CLIENT_ERROR_REQUEST_ID_REPEAT", "LIVE_CLIENT_ERROR_MAX_SEAT_COUNT_LIMIT", "LIVE_CLIENT_ERROR_SEAT_INDEX_NOT_EXIST", "LIVE_CLIENT_ERROR_OPEN_MICROPHONE_NEED_SEAT_UNLOCK", "LIVE_CLIENT_ERROR_OPEN_MICROPHONE_NEED_PERMISSION_FROM_ADMIN", "LIVE_CLIENT_ERROR_OPEN_CAMERA_NEED_SEAT_UNLOCK", "LIVE_CLIENT_ERROR_OPEN_CAMERA_NEED_PERMISSION_FROM_ADMIN", "LIVE_CLIENT_ERROR_OPEN_SCREEN_SHARE_NEED_SEAT_UNLOCK", "LIVE_CLIENT_ERROR_OPEN_SCREEN_SHARE_NEED_PERMISSION_FROM_ADMIN", "LIVE_CLIENT_ERROR_SEND_MESSAGE_DISABLED_FOR_ALL", "LIVE_CLIENT_ERROR_SEND_MESSAGE_DISABLED_FOR_CURRENT", "LIVE_CLIENT_ERROR_ROOM_NOT_SUPPORT_PRELOADING", "LIVE_CLIENT_ERROR_CALL_IN_PROGRESS", "LIVE_SERVER_ERROR_SYSTEM_INTERNAL_ERROR", "LIVE_SERVER_ERROR_PARAM_ILLEGAL", "LIVE_SERVER_ERROR_ROOM_ID_EXISTS", "LIVE_SERVER_ERROR_ROOM_DOES_NOT_EXIST", "LIVE_SERVER_ERROR_NOT_A_ROOM_MEMBER", "LIVE_SERVER_ERROR_INSUFFICIENT_OPERATION_PERMISSIONS", "LIVE_SERVER_ERROR_NO_PAYMENT_INFORMATION", "LIVE_SERVER_ERROR_ROOM_IS_FULL", "LIVE_SERVER_ERROR_TAG_QUANTITY_EXCEEDS_UPPER_LIMIT", "LIVE_SERVER_ERROR_ROOM_ID_HAS_BEEN_USED", "LIVE_SERVER_ERROR_ROOM_ID_HAS_BEEN_OCCUPIED_BY_CHAT", "LIVE_SERVER_ERROR_CREATING_ROOMS_EXCEEDS_THE_FREQUENCY_LIMIT", "LIVE_SERVER_ERROR_EXCEEDS_THE_UPPER_LIMIT", "LIVE_SERVER_ERROR_INVALID_ROOM_TYPE", "LIVE_SERVER_ERROR_THIS_MEMBER_HAS_BEEN_BANNED", "LIVE_SERVER_ERROR_THIS_MEMBER_HAS_BEEN_MUTED", "LIVE_SERVER_ERROR_REQUIRES_PASSWORD", "LIVE_SERVER_ERROR_ROOM_ENTRY_PASSWORD_ERROR", "LIVE_SERVER_ERROR_ROOM_ADMIN_QUANTITY_EXCEEDS_THE_UPPER_LIMIT", "LIVE_SERVER_ERROR_SIGNAL_REQUEST_CONFLICT", "LIVE_SERVER_ERROR_MIC_SEAT_IS_LOCKED", "LIVE_SERVER_ERROR_SEAT_IS_ALREADY_OCCUPIED", "LIVE_SERVER_ERROR_ALREADY_ON_THE_MIC_QUEUE", "LIVE_SERVER_ERROR_ALREADY_ON_THE_MIC", "LIVE_SERVER_ERROR_NOT_ON_THE_MIC_QUEUE", "LIVE_SERVER_ERROR_THE_SEATS_ARE_ALL_TAKEN", "LIVE_SERVER_ERROR_NOT_ON_THE_MIC_SEAT", "LIVE_SERVER_ERROR_USER_IS_ALREADY_ON_THE_MIC_SEAT", "LIVE_SERVER_ERROR_ROOM_DOES_NOT_SUPPORT_MIC_ABILITY", "LIVE_SERVER_ERROR_THE_SEAT_LIST_IS_EMPTY", "LIVE_SERVER_ERROR_CONNECTION_DOES_NOT_EXIST", "LIVE_SERVER_ERROR_ROOM_IS_IN_CONNECTION", "LIVE_SERVER_ERROR_THERE_IS_A_PENDING_CONNECTION_REQUEST", "LIVE_SERVER_ERROR_IS_CONNECTING_WITH_OTHER_ROOMS", "LIVE_SERVER_ERROR_HAS_EXCEEDED_THE_LIMIT_IN_CONNECTION_OR_BATTLE", "LIVE_SERVER_ERROR_CREATING_CONNECTIONS_TOO_FREQUENT", "LIVE_SERVER_ERROR_BATTLE_DOES_NOT_EXIST_OR_HAS_ENDED", "LIVE_SERVER_ERROR_NO_ROOMS_IN_THE_BATTLE_IS_VALID", "LIVE_SERVER_ERROR_CREATING_BATTLES_TOO_FREQUENTLY", "LIVE_SERVER_ERROR_THE_ROOM_IS_NOT_IN_THE_BATTLE", "LIVE_SERVER_ERROR_IN_OTHER_BATTLE", "LIVE_SERVER_ERROR_THERE_IS_A_PENDING_BATTLE_REQUEST", "LIVE_SERVER_ERROR_IS_NOT_ALLOWED_TO_CANCEL_BATTLE_FOR_ROOM_IN_BATTLE", "LIVE_SERVER_ERROR_NOT_STARTED_YET", "LIVE_SERVER_ERROR_BATTLE_SESSION_HAS_ENDED", "LIVE_SERVER_ERROR_METADATA_NUMBER_OF_KEYS_EXCEEDS_THE_LIMIT", "LIVE_SERVER_ERROR_METADATA_SIZE_OF_VALUE_EXCEEDS_THE_LIMIT", "LIVE_SERVER_ERROR_METADATA_TOTAL_SIZE_EXCEEDS_THE_LIMIT", "LIVE_SERVER_ERROR_METADATA_NO_VALID_KEYS", "LIVE_SERVER_ERROR_METADATA_THE_SIZE_OF_KEY_EXCEEDS_THE_MAXIMUM_BYTE_LIMIT", "LIVE_CONNECTION_ERROR_ROOM_NOT_EXISTS", "LIVE_CONNECTION_ERROR_CONNECTING", "LIVE_CONNECTION_ERROR_CONNECTING_OTHER_ROOM", "LIVE_CONNECTION_ERROR_CONNECTION_FULL", "LIVE_CONNECTION_ERROR_RETRY", "LIVE_CONNECTION_ROOM_MISMATCH", "LIVE_IM_ERROR_FREQ_LIMIT", "LIVE_IM_ERROR_GROUP_SHUTUP_DENY", "LIVE_IM_ERROR_SENSITIVE_WORD", "LIVE_IM_ERROR_PKG_SIZE_LIMIT", "LIVE_IM_ERROR_NET_DISCONNECT", "LIVE_IM_ERROR_NET_WAIT_ACK_TIMEOUT", "LIVE_IM_ERROR_NET_ALLREADY_CONN", "LIVE_IM_ERROR_NET_CONN_TIMEOUT", "LIVE_IM_ERROR_NET_CONN_REFUSE", "LIVE_IM_ERROR_NET_NET_UNREACH", "LIVE_IM_ERROR_NET_WAIT_INQUEUE_TIMEOUT", "LIVE_IM_ERROR_NET_WAIT_SEND_TIMEOUT", "LIVE_IM_ERROR_NET_WAIT_SEND_REMAINING_TIMEOUT", "LIVE_IM_ERROR_NET_WAIT_SEND_TIMEOUT_NO_NETWORK", "LIVE_IM_ERROR_NET_WAIT_ACK_TIMEOUT_NO_NETWORK", "LIVE_IM_ERROR_NET_SEND_REMAINING_TIMEOUT_NO_NETWORK", "INTERCEPT_TOAST_ONLY_PRINT_LOG", "", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "onError", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "convertToErrorMessage", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        public final void onError(int error) {
            if (error == 0) {
                return;
            }
            String strM79402a = m79402a(error);
            ErrorLocalized.f77563c.m79404b("[error:" + error + ",value:" + error + ",message:" + strM79402a + ']');
            if (ErrorLocalized.f77562b.contains(Integer.valueOf(error))) {
                return;
            }
            Context contextM79397b = ContextProvider.m79397b();
            AtomicToast atomicToast = AtomicToast.f87566a;
            Intrinsics.checkNotNull(contextM79397b);
            AtomicToast.m88196j(atomicToast, contextM79397b, strM79402a, AtomicToast.Style.ERROR, null, null, null, null, null, 248, null);
        }

        /* JADX INFO: renamed from: a */
        public final String m79402a(int i11) {
            Context appContext = TUIConfig.getAppContext();
            if (appContext == null) {
                return "";
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 != 5) {
                                    if (i11 != -2381) {
                                        if (i11 != -2380) {
                                            if (i11 != -2361) {
                                                if (i11 != -2360) {
                                                    if (i11 != -2301) {
                                                        if (i11 != -2300) {
                                                            if (i11 != -2108) {
                                                                if (i11 != -2107) {
                                                                    if (i11 != -3) {
                                                                        if (i11 != -2) {
                                                                            switch (i11) {
                                                                                case TXVodConstants.VOD_PLAY_ERR_UNKNOW /* -6001 */:
                                                                                    String string = appContext.getString(R$string.common_server_error_call_in_progress);
                                                                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                                                    return string;
                                                                                case TXLiteAVCode.ERR_BGM_OPEN_FAILED /* -4001 */:
                                                                                    String string2 = appContext.getString(R$string.common_client_error_room_not_support_preloading);
                                                                                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                                                                    return string2;
                                                                                case -2344:
                                                                                    String string3 = appContext.getString(R$string.common_client_error_seat_index_not_exist);
                                                                                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                                                                    return string3;
                                                                                case -2340:
                                                                                    String string4 = appContext.getString(R$string.common_client_error_max_seat_count_limit);
                                                                                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                                                                    return string4;
                                                                                case -2200:
                                                                                    String string5 = appContext.getString(R$string.common_client_error_user_not_exist);
                                                                                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                                                                    return string5;
                                                                                case -2105:
                                                                                    String string6 = appContext.getString(R$string.common_client_error_room_id_invalid);
                                                                                    Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                                                                                    return string6;
                                                                                case -1109:
                                                                                    String string7 = appContext.getString(R$string.common_client_error_start_screen_sharing_failed);
                                                                                    Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                                                                                    return string7;
                                                                                case -1108:
                                                                                    String string8 = appContext.getString(R$string.common_client_error_get_screen_sharing_target_failed);
                                                                                    Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                                                                                    return string8;
                                                                                case -1107:
                                                                                    String string9 = appContext.getString(R$string.common_client_error_microphone_device_empty);
                                                                                    Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                                                                                    return string9;
                                                                                case -1106:
                                                                                    String string10 = appContext.getString(R$string.common_client_error_microphone_occupied);
                                                                                    Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                                                                                    return string10;
                                                                                case -1105:
                                                                                    String string11 = appContext.getString(R$string.common_client_error_microphone_not_authorized);
                                                                                    Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                                                                                    return string11;
                                                                                case -1104:
                                                                                    String string12 = appContext.getString(R$string.common_client_error_microphone_start_fail);
                                                                                    Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                                                                                    return string12;
                                                                                case -1103:
                                                                                    String string13 = appContext.getString(R$string.common_client_error_camera_device_empty);
                                                                                    Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                                                                                    return string13;
                                                                                case -1102:
                                                                                    String string14 = appContext.getString(R$string.common_client_error_camera_occupied);
                                                                                    Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                                                                                    return string14;
                                                                                case -1101:
                                                                                    String string15 = appContext.getString(R$string.common_client_error_camera_not_authorized);
                                                                                    Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                                                                                    return string15;
                                                                                case -1100:
                                                                                    String string16 = appContext.getString(R$string.common_client_error_camera_start_fail);
                                                                                    Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                                                                                    return string16;
                                                                                case 5:
                                                                                    break;
                                                                                case BaseConstants.ERR_SDK_COMM_API_CALL_FREQUENCY_LIMIT /* 7008 */:
                                                                                    String string17 = appContext.getString(R$string.live_barrage_error_freq_limit);
                                                                                    Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
                                                                                    return string17;
                                                                                case BaseConstants.ERR_SDK_BLOCKED_BY_SENSITIVE_WORD /* 7015 */:
                                                                                    String string18 = appContext.getString(R$string.live_barrage_error_sensitive_word);
                                                                                    Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
                                                                                    return string18;
                                                                                case BaseConstants.ERR_SDK_NET_DISCONNECT /* 9508 */:
                                                                                case BaseConstants.ERR_SDK_NET_ALLREADY_CONN /* 9509 */:
                                                                                case BaseConstants.ERR_SDK_NET_CONN_TIMEOUT /* 9510 */:
                                                                                case BaseConstants.ERR_SDK_NET_CONN_REFUSE /* 9511 */:
                                                                                case BaseConstants.ERR_SDK_NET_NET_UNREACH /* 9512 */:
                                                                                case BaseConstants.ERR_SDK_NET_WAIT_INQUEUE_TIMEOUT /* 9518 */:
                                                                                case BaseConstants.ERR_SDK_NET_WAIT_SEND_TIMEOUT /* 9519 */:
                                                                                case BaseConstants.ERR_SDK_NET_WAIT_ACK_TIMEOUT /* 9520 */:
                                                                                case BaseConstants.ERR_SDK_NET_WAIT_SEND_REMAINING_TIMEOUT /* 9521 */:
                                                                                case BaseConstants.ERR_SDK_NET_WAIT_SEND_TIMEOUT_NO_NETWORK /* 9523 */:
                                                                                case BaseConstants.ERR_SDK_NET_WAIT_ACK_TIMEOUT_NO_NETWORK /* 9524 */:
                                                                                case BaseConstants.ERR_SDK_NET_SEND_REMAINING_TIMEOUT_NO_NETWORK /* 9525 */:
                                                                                    String string19 = appContext.getString(R$string.live_barrage_error_network);
                                                                                    Intrinsics.checkNotNullExpressionValue(string19, "getString(...)");
                                                                                    return string19;
                                                                                case BaseConstants.ERR_SDK_NET_PKG_SIZE_LIMIT /* 9522 */:
                                                                                    String string20 = appContext.getString(R$string.live_barrage_error_content_is_long);
                                                                                    Intrinsics.checkNotNullExpressionValue(string20, "getString(...)");
                                                                                    return string20;
                                                                                case BaseConstants.ERR_SVR_GROUP_SHUTUP_DENY /* 10017 */:
                                                                                    String string21 = appContext.getString(R$string.live_barrage_error_disable_message_by_admin);
                                                                                    Intrinsics.checkNotNullExpressionValue(string21, "getString(...)");
                                                                                    return string21;
                                                                                case TPPlayerMgr.EVENT_ID_APP_ENTER_BACKGROUND /* 100001 */:
                                                                                    String string22 = appContext.getString(R$string.common_server_error_system_internal_error);
                                                                                    Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
                                                                                    return string22;
                                                                                case TPPlayerMgr.EVENT_ID_APP_ENTER_FOREGROUND /* 100002 */:
                                                                                    String string23 = appContext.getString(R$string.common_server_error_param_illegal);
                                                                                    Intrinsics.checkNotNullExpressionValue(string23, "getString(...)");
                                                                                    return string23;
                                                                                case 100003:
                                                                                    String string24 = appContext.getString(R$string.common_server_error_room_id_exists);
                                                                                    Intrinsics.checkNotNullExpressionValue(string24, "getString(...)");
                                                                                    return string24;
                                                                                case 100004:
                                                                                    String string25 = appContext.getString(R$string.common_server_error_room_does_not_exist);
                                                                                    Intrinsics.checkNotNullExpressionValue(string25, "getString(...)");
                                                                                    return string25;
                                                                                case 100005:
                                                                                    String string26 = appContext.getString(R$string.common_server_error_not_a_room_member);
                                                                                    Intrinsics.checkNotNullExpressionValue(string26, "getString(...)");
                                                                                    return string26;
                                                                                case 100006:
                                                                                    String string27 = appContext.getString(R$string.common_server_error_insufficient_operation_permissions);
                                                                                    Intrinsics.checkNotNullExpressionValue(string27, "getString(...)");
                                                                                    return string27;
                                                                                case 100007:
                                                                                    String string28 = appContext.getString(R$string.common_server_error_no_payment_information);
                                                                                    Intrinsics.checkNotNullExpressionValue(string28, "getString(...)");
                                                                                    return string28;
                                                                                case 100008:
                                                                                    String string29 = appContext.getString(R$string.common_server_error_room_is_full);
                                                                                    Intrinsics.checkNotNullExpressionValue(string29, "getString(...)");
                                                                                    return string29;
                                                                                case 100009:
                                                                                    String string30 = appContext.getString(R$string.common_server_error_tag_quantity_exceeds_upper_limit);
                                                                                    Intrinsics.checkNotNullExpressionValue(string30, "getString(...)");
                                                                                    return string30;
                                                                                case C33579c5.f69379q /* 100011 */:
                                                                                    String string31 = appContext.getString(R$string.common_server_error_room_id_has_been_occupied_by_chat);
                                                                                    Intrinsics.checkNotNullExpressionValue(string31, "getString(...)");
                                                                                    return string31;
                                                                                case 100012:
                                                                                    String string32 = appContext.getString(R$string.common_server_error_creating_rooms_exceeds_the_frequency_limit);
                                                                                    Intrinsics.checkNotNullExpressionValue(string32, "getString(...)");
                                                                                    return string32;
                                                                                case 100013:
                                                                                    String string33 = appContext.getString(R$string.common_server_error_exceeds_the_upper_limit);
                                                                                    Intrinsics.checkNotNullExpressionValue(string33, "getString(...)");
                                                                                    return string33;
                                                                                case 100015:
                                                                                    String string34 = appContext.getString(R$string.common_server_error_invalid_room_type);
                                                                                    Intrinsics.checkNotNullExpressionValue(string34, "getString(...)");
                                                                                    return string34;
                                                                                case 100016:
                                                                                    String string35 = appContext.getString(R$string.common_server_error_this_member_has_been_banned);
                                                                                    Intrinsics.checkNotNullExpressionValue(string35, "getString(...)");
                                                                                    return string35;
                                                                                case 100017:
                                                                                    String string36 = appContext.getString(R$string.common_server_error_this_member_has_been_muted);
                                                                                    Intrinsics.checkNotNullExpressionValue(string36, "getString(...)");
                                                                                    return string36;
                                                                                case 100018:
                                                                                    String string37 = appContext.getString(R$string.common_server_error_requires_password);
                                                                                    Intrinsics.checkNotNullExpressionValue(string37, "getString(...)");
                                                                                    return string37;
                                                                                case 100019:
                                                                                    String string38 = appContext.getString(R$string.common_server_error_room_entry_password_error);
                                                                                    Intrinsics.checkNotNullExpressionValue(string38, "getString(...)");
                                                                                    return string38;
                                                                                case C33579c5.f69376n /* 100020 */:
                                                                                    String string39 = appContext.getString(R$string.common_server_error_room_admin_quantity_exceeds_the_upper_limit);
                                                                                    Intrinsics.checkNotNullExpressionValue(string39, "getString(...)");
                                                                                    return string39;
                                                                                case 100102:
                                                                                    String string40 = appContext.getString(R$string.common_server_error_signal_request_conflict);
                                                                                    Intrinsics.checkNotNullExpressionValue(string40, "getString(...)");
                                                                                    return string40;
                                                                                case 100200:
                                                                                    String string41 = appContext.getString(R$string.common_server_error_mic_seat_is_locked);
                                                                                    Intrinsics.checkNotNullExpressionValue(string41, "getString(...)");
                                                                                    return string41;
                                                                                case 100201:
                                                                                    String string42 = appContext.getString(R$string.common_server_error_seat_is_already_occupied);
                                                                                    Intrinsics.checkNotNullExpressionValue(string42, "getString(...)");
                                                                                    return string42;
                                                                                case 100202:
                                                                                    String string43 = appContext.getString(R$string.common_server_error_already_on_the_mic_queue);
                                                                                    Intrinsics.checkNotNullExpressionValue(string43, "getString(...)");
                                                                                    return string43;
                                                                                case 100203:
                                                                                    String string44 = appContext.getString(R$string.common_server_error_already_on_the_mic);
                                                                                    Intrinsics.checkNotNullExpressionValue(string44, "getString(...)");
                                                                                    return string44;
                                                                                case 100204:
                                                                                    String string45 = appContext.getString(R$string.common_server_error_not_on_the_mic_queue);
                                                                                    Intrinsics.checkNotNullExpressionValue(string45, "getString(...)");
                                                                                    return string45;
                                                                                case 100205:
                                                                                    String string46 = appContext.getString(R$string.common_server_error_the_seats_are_all_taken);
                                                                                    Intrinsics.checkNotNullExpressionValue(string46, "getString(...)");
                                                                                    return string46;
                                                                                case 100206:
                                                                                    String string47 = appContext.getString(R$string.common_server_error_not_on_the_mic_seat);
                                                                                    Intrinsics.checkNotNullExpressionValue(string47, "getString(...)");
                                                                                    return string47;
                                                                                case 100210:
                                                                                    String string48 = appContext.getString(R$string.common_server_error_user_is_already_on_the_mic_seat);
                                                                                    Intrinsics.checkNotNullExpressionValue(string48, "getString(...)");
                                                                                    return string48;
                                                                                case 100211:
                                                                                    String string49 = appContext.getString(R$string.common_server_error_room_does_not_support_mic_ability);
                                                                                    Intrinsics.checkNotNullExpressionValue(string49, "getString(...)");
                                                                                    return string49;
                                                                                case 100251:
                                                                                    String string50 = appContext.getString(R$string.common_server_error_the_seat_list_is_empty);
                                                                                    Intrinsics.checkNotNullExpressionValue(string50, "getString(...)");
                                                                                    return string50;
                                                                                case 100400:
                                                                                    String string51 = appContext.getString(R$string.common_server_error_connection_does_not_exist);
                                                                                    Intrinsics.checkNotNullExpressionValue(string51, "getString(...)");
                                                                                    return string51;
                                                                                case 100401:
                                                                                    String string52 = appContext.getString(R$string.common_server_error_room_is_in_connection);
                                                                                    Intrinsics.checkNotNullExpressionValue(string52, "getString(...)");
                                                                                    return string52;
                                                                                case 100402:
                                                                                    String string53 = appContext.getString(R$string.common_server_error_there_is_a_pending_connection_request);
                                                                                    Intrinsics.checkNotNullExpressionValue(string53, "getString(...)");
                                                                                    return string53;
                                                                                case 100403:
                                                                                    String string54 = appContext.getString(R$string.common_server_error_is_connecting_with_other_rooms);
                                                                                    Intrinsics.checkNotNullExpressionValue(string54, "getString(...)");
                                                                                    return string54;
                                                                                case 100404:
                                                                                    String string55 = appContext.getString(R$string.f77516xe9d99c93);
                                                                                    Intrinsics.checkNotNullExpressionValue(string55, "getString(...)");
                                                                                    return string55;
                                                                                case 100405:
                                                                                    String string56 = appContext.getString(R$string.common_server_error_creating_connections_too_frequent);
                                                                                    Intrinsics.checkNotNullExpressionValue(string56, "getString(...)");
                                                                                    return string56;
                                                                                case 100411:
                                                                                    String string57 = appContext.getString(R$string.common_server_error_battle_does_not_exist_or_has_ended);
                                                                                    Intrinsics.checkNotNullExpressionValue(string57, "getString(...)");
                                                                                    return string57;
                                                                                case 100412:
                                                                                    String string58 = appContext.getString(R$string.common_server_error_no_rooms_in_the_battle_is_valid);
                                                                                    Intrinsics.checkNotNullExpressionValue(string58, "getString(...)");
                                                                                    return string58;
                                                                                case 100413:
                                                                                    String string59 = appContext.getString(R$string.common_server_error_creating_battles_too_frequently);
                                                                                    Intrinsics.checkNotNullExpressionValue(string59, "getString(...)");
                                                                                    return string59;
                                                                                case 100414:
                                                                                    String string60 = appContext.getString(R$string.common_server_error_the_room_is_not_in_the_battle);
                                                                                    Intrinsics.checkNotNullExpressionValue(string60, "getString(...)");
                                                                                    return string60;
                                                                                case 100415:
                                                                                    String string61 = appContext.getString(R$string.common_server_error_in_other_battle);
                                                                                    Intrinsics.checkNotNullExpressionValue(string61, "getString(...)");
                                                                                    return string61;
                                                                                case 100416:
                                                                                    String string62 = appContext.getString(R$string.common_server_error_there_is_a_pending_battle_request);
                                                                                    Intrinsics.checkNotNullExpressionValue(string62, "getString(...)");
                                                                                    return string62;
                                                                                case 100419:
                                                                                    String string63 = appContext.getString(R$string.f77517x368faab1);
                                                                                    Intrinsics.checkNotNullExpressionValue(string63, "getString(...)");
                                                                                    return string63;
                                                                                case 100420:
                                                                                    String string64 = appContext.getString(R$string.common_server_error_not_started_yet);
                                                                                    Intrinsics.checkNotNullExpressionValue(string64, "getString(...)");
                                                                                    return string64;
                                                                                case 100421:
                                                                                    String string65 = appContext.getString(R$string.common_server_error_battle_session_has_ended);
                                                                                    Intrinsics.checkNotNullExpressionValue(string65, "getString(...)");
                                                                                    return string65;
                                                                                case 100500:
                                                                                    String string66 = appContext.getString(R$string.common_server_error_metadata_number_of_keys_exceeds_the_limit);
                                                                                    Intrinsics.checkNotNullExpressionValue(string66, "getString(...)");
                                                                                    return string66;
                                                                                case 100501:
                                                                                    String string67 = appContext.getString(R$string.common_server_error_metadata_size_of_value_exceeds_the_limit);
                                                                                    Intrinsics.checkNotNullExpressionValue(string67, "getString(...)");
                                                                                    return string67;
                                                                                case 100502:
                                                                                    String string68 = appContext.getString(R$string.common_server_error_metadata_total_size_exceeds_the_limit);
                                                                                    Intrinsics.checkNotNullExpressionValue(string68, "getString(...)");
                                                                                    return string68;
                                                                                case 100503:
                                                                                    String string69 = appContext.getString(R$string.common_server_error_metadata_no_valid_keys);
                                                                                    Intrinsics.checkNotNullExpressionValue(string69, "getString(...)");
                                                                                    return string69;
                                                                                case 100504:
                                                                                    String string70 = appContext.getString(R$string.f77518x2d70289a);
                                                                                    Intrinsics.checkNotNullExpressionValue(string70, "getString(...)");
                                                                                    return string70;
                                                                                default:
                                                                                    switch (i11) {
                                                                                        case -2373:
                                                                                            String string71 = appContext.getString(R$string.common_client_error_open_screen_share_need_permission_from_admin);
                                                                                            Intrinsics.checkNotNullExpressionValue(string71, "getString(...)");
                                                                                            return string71;
                                                                                        case -2372:
                                                                                            String string72 = appContext.getString(R$string.common_client_error_open_screen_share_need_seat_unlock);
                                                                                            Intrinsics.checkNotNullExpressionValue(string72, "getString(...)");
                                                                                            return string72;
                                                                                        case -2371:
                                                                                            String string73 = appContext.getString(R$string.common_client_error_open_camera_need_permission_from_admin);
                                                                                            Intrinsics.checkNotNullExpressionValue(string73, "getString(...)");
                                                                                            return string73;
                                                                                        case -2370:
                                                                                            String string74 = appContext.getString(R$string.common_client_error_open_camera_need_seat_unlock);
                                                                                            Intrinsics.checkNotNullExpressionValue(string74, "getString(...)");
                                                                                            return string74;
                                                                                        default:
                                                                                            switch (i11) {
                                                                                                case -2312:
                                                                                                    String string75 = appContext.getString(R$string.common_client_error_request_id_repeat);
                                                                                                    Intrinsics.checkNotNullExpressionValue(string75, "getString(...)");
                                                                                                    return string75;
                                                                                                case -2311:
                                                                                                    String string76 = appContext.getString(R$string.common_client_error_request_id_invalid);
                                                                                                    Intrinsics.checkNotNullExpressionValue(string76, "getString(...)");
                                                                                                    return string76;
                                                                                                case -2310:
                                                                                                    String string77 = appContext.getString(R$string.common_client_error_request_no_permission);
                                                                                                    Intrinsics.checkNotNullExpressionValue(string77, "getString(...)");
                                                                                                    return string77;
                                                                                                default:
                                                                                                    switch (i11) {
                                                                                                        case -2103:
                                                                                                            String string78 = appContext.getString(R$string.common_client_error_operation_not_supported_in_current_room_type);
                                                                                                            Intrinsics.checkNotNullExpressionValue(string78, "getString(...)");
                                                                                                            return string78;
                                                                                                        case -2102:
                                                                                                            String string79 = appContext.getString(R$string.common_client_error_exit_not_supported_for_room_owner);
                                                                                                            Intrinsics.checkNotNullExpressionValue(string79, "getString(...)");
                                                                                                            return string79;
                                                                                                        case -2101:
                                                                                                            String string80 = appContext.getString(R$string.common_client_error_operation_invalid_before_enter_room);
                                                                                                            Intrinsics.checkNotNullExpressionValue(string80, "getString(...)");
                                                                                                            return string80;
                                                                                                        default:
                                                                                                            switch (i11) {
                                                                                                                case -1003:
                                                                                                                    String string81 = appContext.getString(R$string.common_client_error_permission_denied);
                                                                                                                    Intrinsics.checkNotNullExpressionValue(string81, "getString(...)");
                                                                                                                    return string81;
                                                                                                                case -1002:
                                                                                                                    String string82 = appContext.getString(R$string.common_client_error_sdk_not_initialized);
                                                                                                                    Intrinsics.checkNotNullExpressionValue(string82, "getString(...)");
                                                                                                                    return string82;
                                                                                                                case -1001:
                                                                                                                    String string83 = appContext.getString(R$string.common_client_error_invalid_parameter);
                                                                                                                    Intrinsics.checkNotNullExpressionValue(string83, "getString(...)");
                                                                                                                    return string83;
                                                                                                                case -1000:
                                                                                                                    String string84 = appContext.getString(R$string.common_client_error_sdk_app_id_not_found);
                                                                                                                    Intrinsics.checkNotNullExpressionValue(string84, "getString(...)");
                                                                                                                    return string84;
                                                                                                                default:
                                                                                                                    return appContext.getString(R$string.common_client_error_failed) + i11;
                                                                                                            }
                                                                                                    }
                                                                                            }
                                                                                    }
                                                                            }
                                                                        } else {
                                                                            String string85 = appContext.getString(R$string.common_client_error_freq_limit);
                                                                            Intrinsics.checkNotNullExpressionValue(string85, "getString(...)");
                                                                            return string85;
                                                                        }
                                                                    } else {
                                                                        String string86 = appContext.getString(R$string.common_client_error_repeat_operation);
                                                                        Intrinsics.checkNotNullExpressionValue(string86, "getString(...)");
                                                                        return string86;
                                                                    }
                                                                } else {
                                                                    String string87 = appContext.getString(R$string.common_client_error_room_name_invalid);
                                                                    Intrinsics.checkNotNullExpressionValue(string87, "getString(...)");
                                                                    return string87;
                                                                }
                                                            } else {
                                                                String string88 = appContext.getString(R$string.common_client_error_already_in_other_room);
                                                                Intrinsics.checkNotNullExpressionValue(string88, "getString(...)");
                                                                return string88;
                                                            }
                                                        } else {
                                                            String string89 = appContext.getString(R$string.common_client_error_user_need_owner_permission);
                                                            Intrinsics.checkNotNullExpressionValue(string89, "getString(...)");
                                                            return string89;
                                                        }
                                                    } else {
                                                        String string90 = appContext.getString(R$string.common_client_error_user_need_admin_permission);
                                                        Intrinsics.checkNotNullExpressionValue(string90, "getString(...)");
                                                        return string90;
                                                    }
                                                } else {
                                                    String string91 = appContext.getString(R$string.common_client_error_open_microphone_need_seat_unlock);
                                                    Intrinsics.checkNotNullExpressionValue(string91, "getString(...)");
                                                    return string91;
                                                }
                                            } else {
                                                String string92 = appContext.getString(R$string.common_client_error_open_microphone_need_permission_from_admin);
                                                Intrinsics.checkNotNullExpressionValue(string92, "getString(...)");
                                                return string92;
                                            }
                                        } else {
                                            String string93 = appContext.getString(R$string.common_client_error_send_message_disabled_for_all);
                                            Intrinsics.checkNotNullExpressionValue(string93, "getString(...)");
                                            return string93;
                                        }
                                    } else {
                                        String string94 = appContext.getString(R$string.common_client_error_send_message_disabled_for_current);
                                        Intrinsics.checkNotNullExpressionValue(string94, "getString(...)");
                                        return string94;
                                    }
                                }
                                String string95 = appContext.getString(R$string.live_error_connection_retry);
                                Intrinsics.checkNotNullExpressionValue(string95, "getString(...)");
                                return string95;
                            }
                            String string96 = appContext.getString(R$string.common_connection_room_full);
                            Intrinsics.checkNotNullExpressionValue(string96, "getString(...)");
                            return string96;
                        }
                        String string97 = appContext.getString(R$string.common_connect_conflict);
                        Intrinsics.checkNotNullExpressionValue(string97, "getString(...)");
                        return string97;
                    }
                    String string98 = appContext.getString(R$string.common_client_error_connection_connecting);
                    Intrinsics.checkNotNullExpressionValue(string98, "getString(...)");
                    return string98;
                }
                String string99 = appContext.getString(R$string.live_error_connection_notexit);
                Intrinsics.checkNotNullExpressionValue(string99, "getString(...)");
                return string99;
            }
            String string100 = appContext.getString(R$string.common_client_error_success);
            Intrinsics.checkNotNullExpressionValue(string100, "getString(...)");
            return string100;
        }
    }
}
