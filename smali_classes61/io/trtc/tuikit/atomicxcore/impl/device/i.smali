.class public abstract Lio/trtc/tuikit/atomicxcore/impl/device/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;
    .locals 1

    const-string/jumbo v0, "videoQuality"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/h;->d:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    .line 9
    sget-object p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;->Q_1080P:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 10
    :cond_1
    sget-object p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;->Q_720P:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;

    return-object p0

    .line 11
    :cond_2
    sget-object p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;->Q_540P:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;

    return-object p0

    .line 12
    :cond_3
    sget-object p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;->Q_360P:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;

    return-object p0
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;)Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;
    .locals 1

    const-string v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/h;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    .line 2
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;->UNKNOWN_ERROR:Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;

    return-object p0

    .line 3
    :pswitch_0
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;->NO_SYSTEM_PERMISSION:Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;

    return-object p0

    .line 4
    :pswitch_1
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;->NO_DEVICE_DETECTED:Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;

    return-object p0

    .line 5
    :pswitch_2
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;->NO_DEVICE_DETECTED:Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;

    return-object p0

    .line 6
    :pswitch_3
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;->OCCUPIED_ERROR:Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;

    return-object p0

    .line 7
    :pswitch_4
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;->NO_ERROR:Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;)Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;
    .locals 1

    const-string/jumbo v0, "status"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/h;->f:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    .line 14
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    return-object p0

    .line 15
    :cond_0
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->OFF:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    return-object p0
.end method
