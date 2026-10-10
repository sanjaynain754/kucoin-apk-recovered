.class Lcom/tencent/qcloud/tuicore/TUILogin$1;
.super Lcom/tencent/imsdk/v2/V2TIMSDKListener;
.source "TUILogin.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/qcloud/tuicore/TUILogin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/qcloud/tuicore/TUILogin;


# direct methods
.method public constructor <init>(Lcom/tencent/qcloud/tuicore/TUILogin;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/TUILogin$1;->this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

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
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$1;->this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/TUILogin;->access$200(Lcom/tencent/qcloud/tuicore/TUILogin;)Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginListener;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1, p2}, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginListener;->onConnectFailed(ILjava/lang/String;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    const-string p1, "eventSubKeyConnectFailed"

    .line 29
    const/4 p2, 0x0

    .line 30
    .line 31
    const-string v0, "eventConnectionStateChanged"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, p1, p2}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 35
    return-void
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
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$1;->this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/TUILogin;->access$200(Lcom/tencent/qcloud/tuicore/TUILogin;)Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginListener;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginListener;->onConnectSuccess()V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    const-string v0, "eventSubKeyConnectSuccess"

    .line 29
    const/4 v1, 0x0

    .line 30
    .line 31
    const-string v2, "eventConnectionStateChanged"

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v0, v1}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 35
    return-void
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

.method public onConnecting()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$1;->this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/TUILogin;->access$200(Lcom/tencent/qcloud/tuicore/TUILogin;)Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginListener;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginListener;->onConnecting()V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    const-string v0, "eventSubKeyConnecting"

    .line 29
    const/4 v1, 0x0

    .line 30
    .line 31
    const-string v2, "eventConnectionStateChanged"

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v0, v1}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 35
    return-void
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

.method public onKickedOffline()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$1;->this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/TUILogin;->access$200(Lcom/tencent/qcloud/tuicore/TUILogin;)Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginListener;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginListener;->onKickedOffline()V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    const-string v0, "eventSubKeyUserKickedOffline"

    .line 29
    const/4 v1, 0x0

    .line 30
    .line 31
    const-string v2, "eventLoginStateChanged"

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v0, v1}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 35
    return-void
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
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/qcloud/tuicore/TUIConfig;->setSelfInfo(Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/tencent/qcloud/tuicore/TUILogin;->access$300(Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;)V

    .line 7
    return-void
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

.method public onUserSigExpired()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$1;->this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/TUILogin;->access$200(Lcom/tencent/qcloud/tuicore/TUILogin;)Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginListener;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginListener;->onUserSigExpired()V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    const-string v0, "eventSubKeyUserSigExpired"

    .line 29
    const/4 v1, 0x0

    .line 30
    .line 31
    const-string v2, "eventLoginStateChanged"

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v0, v1}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 35
    return-void
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
