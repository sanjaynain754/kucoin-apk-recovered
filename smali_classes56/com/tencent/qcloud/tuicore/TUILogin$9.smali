.class final Lcom/tencent/qcloud/tuicore/TUILogin$9;
.super Lcom/tencent/imsdk/v2/V2TIMSDKListener;
.source "TUILogin.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/qcloud/tuicore/TUILogin;->init(Landroid/content/Context;ILcom/tencent/imsdk/v2/V2TIMSDKConfig;Lcom/tencent/imsdk/v2/V2TIMSDKListener;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic val$listener:Lcom/tencent/imsdk/v2/V2TIMSDKListener;


# direct methods
.method public constructor <init>(Lcom/tencent/imsdk/v2/V2TIMSDKListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/TUILogin$9;->val$listener:Lcom/tencent/imsdk/v2/V2TIMSDKListener;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/imsdk/v2/V2TIMSDKListener;-><init>()V

    .line 6
    return-void
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public onConnectFailed(ILjava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$9;->val$listener:Lcom/tencent/imsdk/v2/V2TIMSDKListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2}, Lcom/tencent/qcloud/tuicore/util/ErrorMessageConverter;->convertIMError(ILjava/lang/String;)Ljava/lang/String;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lcom/tencent/imsdk/v2/V2TIMSDKListener;->onConnectFailed(ILjava/lang/String;)V

    .line 12
    :cond_0
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public onConnectSuccess()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$9;->val$listener:Lcom/tencent/imsdk/v2/V2TIMSDKListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMSDKListener;->onConnectSuccess()V

    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public onConnecting()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$9;->val$listener:Lcom/tencent/imsdk/v2/V2TIMSDKListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMSDKListener;->onConnecting()V

    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public onKickedOffline()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$9;->val$listener:Lcom/tencent/imsdk/v2/V2TIMSDKListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMSDKListener;->onKickedOffline()V

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/TUILogin;->setCurrentBusinessScene(I)V

    .line 12
    .line 13
    const-string v0, "eventSubKeyUserKickedOffline"

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    const-string v2, "eventLoginStateChanged"

    .line 17
    .line 18
    .line 19
    invoke-static {v2, v0, v1}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public onSelfInfoUpdated(Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$9;->val$listener:Lcom/tencent/imsdk/v2/V2TIMSDKListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/v2/V2TIMSDKListener;->onSelfInfoUpdated(Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {p1}, Lcom/tencent/qcloud/tuicore/TUIConfig;->setSelfInfo(Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/tencent/qcloud/tuicore/TUILogin;->access$300(Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;)V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public onUserSigExpired()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$9;->val$listener:Lcom/tencent/imsdk/v2/V2TIMSDKListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMSDKListener;->onUserSigExpired()V

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/TUILogin;->setCurrentBusinessScene(I)V

    .line 12
    .line 13
    const-string v0, "eventSubKeyUserSigExpired"

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    const-string v2, "eventLoginStateChanged"

    .line 17
    .line 18
    .line 19
    invoke-static {v2, v0, v1}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method
