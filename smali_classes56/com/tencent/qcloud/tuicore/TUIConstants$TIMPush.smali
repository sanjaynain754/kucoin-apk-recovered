.class public final Lcom/tencent/qcloud/tuicore/TUIConstants$TIMPush;
.super Ljava/lang/Object;
.source "TUIConstants.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/qcloud/tuicore/TUIConstants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TIMPush"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/qcloud/tuicore/TUIConstants$TIMPush$NOTIFICATION;,
        Lcom/tencent/qcloud/tuicore/TUIConstants$TIMPush$VIVO;,
        Lcom/tencent/qcloud/tuicore/TUIConstants$TIMPush$OPPO;,
        Lcom/tencent/qcloud/tuicore/TUIConstants$TIMPush$MeiZu;,
        Lcom/tencent/qcloud/tuicore/TUIConstants$TIMPush$Honor;,
        Lcom/tencent/qcloud/tuicore/TUIConstants$TIMPush$FCM;,
        Lcom/tencent/qcloud/tuicore/TUIConstants$TIMPush$HuaWei;,
        Lcom/tencent/qcloud/tuicore/TUIConstants$TIMPush$XiaoMi;
    }
.end annotation


# static fields
.field public static final APP_UNREAD_COUNT_KEY:Ljava/lang/String; = "appUnreadCountKey"

.field public static final BROADCAST_IM_LOGIN_AFTER_APP_WAKEUP:Ljava/lang/String; = "com.tencent.TIMPush.BROADCAST_IM_LOGIN_AFTER_APP_WAKEUP"

.field public static final CHECK_PUSH_STATUS_RESULT_LEY:Ljava/lang/String; = "checkTIMPushStatusResultKey"

.field public static final CONFIG_ENABLE_FCM_PRIVATE_RING_KEY:Ljava/lang/String; = "configEnableTIMPushFCMPrivateRingKey"

.field public static final CONFIG_FCM_CHANNEL_ID_KEY:Ljava/lang/String; = "configTIMPushFCMChannelIdKey"

.field public static final CONFIG_FCM_PRIVATE_RING_NAME_KEY:Ljava/lang/String; = "configTIMPushFCMPrivateRingNameKey"

.field public static final CONTEXT:Ljava/lang/String; = "context"

.field public static final CUSTOM_TIMPUSH_CONFINGS_KEY:Ljava/lang/String; = "customTIMPushConfigsKey"

.field public static final DISABLE_AUTO_REGISTER_PUSH_KEY:Ljava/lang/String; = "disableAutoRegisterPushKey"

.field public static final EVENT_IM_LOGIN_AFTER_APP_WAKEUP_KEY:Ljava/lang/String; = "eventIMloginAfterAppWakeUpKey"

.field public static final EVENT_IM_LOGIN_AFTER_APP_WAKEUP_PUSH_MESSAGE_KEY:Ljava/lang/String; = "eventIMloginAfterAppWakeUpPushMessageKey"

.field public static final EVENT_IM_LOGIN_AFTER_APP_WAKEUP_SUB_KEY:Ljava/lang/String; = "eventIMloginAfterAppWakeUpSubKey"

.field public static final EVENT_NOTIFY:Ljava/lang/String; = "TIMPushNotifyEvent"

.field public static final EVENT_NOTIFY_NOTIFICATION:Ljava/lang/String; = "TIMPushNotifyEvent"

.field public static final METHOD_CHECK_PUSH_STATUS:Ljava/lang/String; = "checkTIMPushStatus"

.field public static final METHOD_CONFIG_FCM_PRIVATE_RING:Ljava/lang/String; = "configTIMPushFCMPrivateRing"

.field public static final METHOD_CUSTOM_TIMPUSH_CONFINGS:Ljava/lang/String; = "customTIMPushConfigs"

.field public static final METHOD_DISABLE_AUTO_REGISTER_PUSH:Ljava/lang/String; = "disableAutoRegisterPush"

.field public static final METHOD_DO_BACKGROUND:Ljava/lang/String; = "doBackground"

.field public static final METHOD_DO_FOREGROUND:Ljava/lang/String; = "doForeground"

.field public static final METHOD_GET_PUSH_BRAND_ID:Ljava/lang/String; = "getTIMPushBrandId"

.field public static final METHOD_GET_PUSH_TOKEN:Ljava/lang/String; = "getPushToken"

.field public static final METHOD_GET_REGISTRATION_ID:Ljava/lang/String; = "getRegistrationID"

.field public static final METHOD_PUSH_BUSSINESS_ID_KEY:Ljava/lang/String; = "pushBussinessIdKey"

.field public static final METHOD_PUSH_TOKEN_KEY:Ljava/lang/String; = "pushTokenKey"

.field public static final METHOD_REGISTER_PUSH:Ljava/lang/String; = "registerTIMPush"

.field public static final METHOD_REGISTER_PUSH_WITH_JSON:Ljava/lang/String; = "registerTIMPushWithJsonParam"

.field public static final METHOD_REGISTER_TPUSH:Ljava/lang/String; = "registerTPush"

.field public static final METHOD_REPORT_NOTIFICATION_CLICKED:Ljava/lang/String; = "reportNotificationClicked"

.field public static final METHOD_REPORT_NOTIFICATION_RECIEVED:Ljava/lang/String; = "reportNotificationRecieved"

.field public static final METHOD_SET_CUSTOM_CONFIG_FILE:Ljava/lang/String; = "setCustomConfigFile"

.field public static final METHOD_SET_CUSTOM_CONFIG_JSON:Ljava/lang/String; = "setCustomConfigJson"

.field public static final METHOD_SET_CUSTOM_FCM_RING:Ljava/lang/String; = "setCustomFCMRing"

.field public static final METHOD_SET_PUSH_BRAND_ID:Ljava/lang/String; = "setTIMPushBrandId"

.field public static final METHOD_SET_PUSH_MESSAGE_DATA:Ljava/lang/String; = "setPushMessageData"

.field public static final METHOD_SET_PUSH_TOKEN:Ljava/lang/String; = "setPushToken"

.field public static final METHOD_SET_REGISTRATION_ID:Ljava/lang/String; = "setRegistrationID"

.field public static final METHOD_UNREGISTER_PUSH:Ljava/lang/String; = "unRegiterTIMPush"

.field public static final METHOD_XIAOMI_CLICK_INTENT:Ljava/lang/String; = "xiaomiClickIntent"

.field public static final NOTIFICATION_BROADCAST_ACTION:Ljava/lang/String; = "com.tencent.TIMPush.BROADCAST_PUSH_RECEIVER"

.field public static final NOTIFICATION_CREATED_BY_IM_KEY:Ljava/lang/String; = "notificationCreatedByIMKey"

.field public static final NOTIFICATION_EXT_KEY:Ljava/lang/String; = "ext"

.field public static final NOTIFICATION_INTENT_KEY:Ljava/lang/String; = "TIMPushNotifyIntentKey"

.field public static final NOTIFICATION_UI_ID:Ljava/lang/String; = "notificationUIId"

.field public static final PARAM_APP_SECRET_KEY:Ljava/lang/String; = "paramAppSecret"

.field public static final PARAM_REGISTRATION_ID_KEY:Ljava/lang/String; = "paramRegistrationID"

.field public static final PARAM_SDK_APPID_KEY:Ljava/lang/String; = "paramSdkAppId"

.field public static final PUSH_BRAND_ID_KEY:Ljava/lang/String; = "TIMPushBrandIdKey"

.field public static final PUSH_MESSAGE_DATA_KEY:Ljava/lang/String; = "pushMessageDataKey"

.field public static final REGISTER_PUSH_WITH_JSON_KEY:Ljava/lang/String; = "registerTIMPushwithJsonParamkey"

.field public static final SERVICE_NAME:Ljava/lang/String; = "TIMPushService"

.field public static final SET_CUSTOM_CONFIG_FILE_KEY:Ljava/lang/String; = "setCustomConfigFileKey"

.field public static final SET_CUSTOM_CONFIG_JSON_KEY:Ljava/lang/String; = "setCustomConfigJsonKey"

.field public static final XIAOMI_CLICK_INTENT_KEY:Ljava/lang/String; = "xiaomiClickIntentKey"


# direct methods
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
