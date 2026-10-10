.class public final Lcom/tencent/qcloud/tuicore/TUIConstants$TUICalling;
.super Ljava/lang/Object;
.source "TUIConstants.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/qcloud/tuicore/TUIConstants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TUICalling"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/qcloud/tuicore/TUIConstants$TUICalling$ObjectFactory;
    }
.end annotation


# static fields
.field public static final ACTION_ID_AUDIO_CALL:I = 0x1

.field public static final ACTION_ID_VIDEO_CALL:I = 0x2

.field public static final CALL_ID:Ljava/lang/String; = "callId"

.field public static final CALL_TIMEOUT_BUSINESS_ID:Ljava/lang/Double;

.field public static final CUSTOM_MESSAGE_BUSINESS_ID:Ljava/lang/String; = "av_call"

.field public static final DATA:Ljava/lang/String; = "data"

.field public static final ERROR_INVALID_PARAM:I = -0x3e9

.field public static final ERROR_MIC_PERMISSION_REFUSED:I = -0x3ec

.field public static final ERROR_NONE:I = 0x0

.field public static final ERROR_NO_MESSAGE_TO_RECORD:I = -0x7d4

.field public static final ERROR_PATH_FORMAT_NOT_SUPPORT:I = -0x7d2

.field public static final ERROR_RECORD_FAILED:I = -0x7d3

.field public static final ERROR_RECORD_INIT_FAILED:I = -0x7d1

.field public static final ERROR_REQUEST_AUDIO_FOCUS_FAILED:I = -0x3ed

.field public static final ERROR_SIGNATURE_ERROR:I = -0xbb9

.field public static final ERROR_SIGNATURE_EXPIRED:I = -0xbba

.field public static final ERROR_STATUS_IN_CALL:I = -0x3ea

.field public static final ERROR_STATUS_IS_AUDIO_RECORDING:I = -0x3eb

.field public static final ERR_MIC_NOT_AUTHORIZED:I = -0x525

.field public static final ERR_MIC_OCCUPY:I = -0x527

.field public static final ERR_MIC_SET_PARAM_FAIL:I = -0x526

.field public static final ERR_MIC_START_FAIL:I = -0x516

.field public static final EVENT_ACTIVE_HANGUP:Ljava/lang/String; = "active_hangup"

.field public static final EVENT_KEY_CALLING:Ljava/lang/String; = "calling"

.field public static final EVENT_KEY_NAME:Ljava/lang/String; = "event_name"

.field public static final EVENT_KEY_RECORD_AUDIO_MESSAGE:Ljava/lang/String; = "eventRecordAudioMessage"

.field public static final EVENT_SUB_KEY_RECORD_START:Ljava/lang/String; = "eventSubKeyStartRecordAudioMessage"

.field public static final EVENT_SUB_KEY_RECORD_STOP:Ljava/lang/String; = "eventSubKeyStopRecordAudioMessage"

.field public static final GROUP_ID:Ljava/lang/String; = "groupId"

.field public static final INVITED_LIST:Ljava/lang/String; = "invitedList"

.field public static final METHOD_NAME_CALL:Ljava/lang/String; = "call"

.field public static final METHOD_NAME_ENABLE_FLOAT_WINDOW:Ljava/lang/String; = "methodEnableFloatWindow"

.field public static final METHOD_NAME_ENABLE_INCOMING_BANNER:Ljava/lang/String; = "methodEnableIncomingBanner"

.field public static final METHOD_NAME_ENABLE_MULTI_DEVICE:Ljava/lang/String; = "methodEnableMultiDeviceAbility"

.field public static final METHOD_NAME_ENABLE_VIRTUAL_BACKGROUND:Ljava/lang/String; = "methodEnableVirtualBackground"

.field public static final METHOD_NAME_RECEIVEAPNSCALLED:Ljava/lang/String; = "receiveAPNSCalled"

.field public static final METHOD_NAME_START_RECORD_AUDIO_MESSAGE:Ljava/lang/String; = "methodStartRecordAudioMessage"

.field public static final METHOD_NAME_STOP_RECORD_AUDIO_MESSAGE:Ljava/lang/String; = "methodStopRecordAudioMessage"

.field public static final METHOD_START_CALL:Ljava/lang/String; = "startCall"

.field public static final PARAM_NAME_AUDIO_PATH:Ljava/lang/String; = "path"

.field public static final PARAM_NAME_AUDIO_SIGNATURE:Ljava/lang/String; = "signature"

.field public static final PARAM_NAME_CALLMODEL:Ljava/lang/String; = "call_model_data"

.field public static final PARAM_NAME_ENABLE_FLOAT_WINDOW:Ljava/lang/String; = "enableFloatWindow"

.field public static final PARAM_NAME_ENABLE_INCOMING_BANNER:Ljava/lang/String; = "enableIncomingBanner"

.field public static final PARAM_NAME_ENABLE_MULTI_DEVICE:Ljava/lang/String; = "enableMultiDeviceAbility"

.field public static final PARAM_NAME_ENABLE_VIRTUAL_BACKGROUND:Ljava/lang/String; = "enableVirtualBackground"

.field public static final PARAM_NAME_GROUPID:Ljava/lang/String; = "groupId"

.field public static final PARAM_NAME_SDK_APP_ID:Ljava/lang/String; = "sdkappid"

.field public static final PARAM_NAME_TYPE:Ljava/lang/String; = "type"

.field public static final PARAM_NAME_USERIDS:Ljava/lang/String; = "userIDs"

.field public static final SENDER:Ljava/lang/String; = "sender"

.field public static final SERVICE_NAME:Ljava/lang/String; = "TUICallingService"

.field public static final SERVICE_NAME_AUDIO_RECORD:Ljava/lang/String; = "TUIAudioMessageRecordService"

.field public static final TYPE_AUDIO:Ljava/lang/String; = "audio"

.field public static final TYPE_VIDEO:Ljava/lang/String; = "video"

.field public static final V3_CALL_BUSINESS_ID:Ljava/lang/String; = "rtc_call"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/qcloud/tuicore/TUIConstants$TUICalling;->CALL_TIMEOUT_BUSINESS_ID:Ljava/lang/Double;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method
