.class public abstract Lio/trtc/tuikit/atomicxcore/impl/call/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lio/trtc/tuikit/atomicxcore/api/call/CallParams;)Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;
    .locals 3

    .line 1
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;

    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;-><init>()V

    if-nez p0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    invoke-direct {v1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;-><init>()V

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->roomId:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/call/CallParams;->getRoomId()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;->strRoomId:Ljava/lang/String;

    .line 4
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/call/CallParams;->getTimeout()I

    move-result v1

    iput v1, v0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->timeout:I

    .line 5
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/call/CallParams;->isEphemeralCall()Z

    move-result v1

    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->isEphemeralCall:Z

    .line 6
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/call/CallParams;->getChatGroupId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->chatGroupId:Ljava/lang/String;

    .line 7
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/call/CallParams;->getUserData()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->userData:Ljava/lang/String;

    .line 8
    new-instance p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;-><init>()V

    .line 9
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iput-object v1, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->title:Ljava/lang/String;

    .line 10
    const-string v1, "You have a new call."

    iput-object v1, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->desc:Ljava/lang/String;

    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, v1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->setIgnoreIOSBadge(Z)V

    .line 12
    const-string v1, "phone_ringing.mp3"

    invoke-virtual {p0, v1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->setIOSSound(Ljava/lang/String;)V

    .line 13
    const-string v1, "phone_ringing"

    iput-object v1, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->androidSound:Ljava/lang/String;

    .line 14
    const-string v1, "IM"

    iput-object v1, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->androidHuaWeiCategory:Ljava/lang/String;

    .line 15
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$IOSOfflinePushType;->VoIP:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$IOSOfflinePushType;

    invoke-virtual {p0, v1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->setIOSPushType(Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$IOSOfflinePushType;)V

    .line 16
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    return-object v0
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallEndReason;)Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    .line 20
    :cond_0
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/call/a;->d:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    packed-switch p0, :pswitch_data_0

    .line 21
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;->Unknown:Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;

    return-object p0

    .line 22
    :pswitch_0
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;->EndByServer:Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;

    return-object p0

    .line 23
    :pswitch_1
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;->OtherDeviceReject:Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;

    return-object p0

    .line 24
    :pswitch_2
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;->OtherDeviceAccepted:Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;

    return-object p0

    .line 25
    :pswitch_3
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;->Canceled:Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;

    return-object p0

    .line 26
    :pswitch_4
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;->Offline:Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;

    return-object p0

    .line 27
    :pswitch_5
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;->NoResponse:Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;

    return-object p0

    .line 28
    :pswitch_6
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;->Reject:Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;

    return-object p0

    .line 29
    :pswitch_7
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;->LineBusy:Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;

    return-object p0

    .line 30
    :pswitch_8
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;->Hangup:Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;)Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    .line 17
    :cond_0
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/call/a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 p0, 0x0

    return-object p0

    .line 18
    :cond_1
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;->Video:Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;

    return-object p0

    .line 19
    :cond_2
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;->Audio:Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;

    return-object p0
.end method
