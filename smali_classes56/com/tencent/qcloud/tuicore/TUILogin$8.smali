.class Lcom/tencent/qcloud/tuicore/TUILogin$8;
.super Ljava/lang/Object;
.source "TUILogin.java"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/qcloud/tuicore/TUILogin;->internalLogout(Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

.field final synthetic val$callback:Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;


# direct methods
.method public constructor <init>(Lcom/tencent/qcloud/tuicore/TUILogin;Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/TUILogin$8;->this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/qcloud/tuicore/TUILogin$8;->val$callback:Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUILogin;->access$900()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    const-string v2, "internalLogout onError code="

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, " desc="

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$8;->val$callback:Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;

    .line 35
    .line 36
    .line 37
    invoke-static {v0, p1, p2}, Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;->onError(Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;ILjava/lang/String;)V

    .line 38
    return-void
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

.method public onSuccess()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUILogin;->access$900()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "internalLogout onSuccess"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$8;->this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tuicore/TUILogin;->access$1002(Lcom/tencent/qcloud/tuicore/TUILogin;I)I

    .line 16
    .line 17
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$8;->this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tuicore/TUILogin;->access$602(Lcom/tencent/qcloud/tuicore/TUILogin;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$8;->this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tuicore/TUILogin;->access$702(Lcom/tencent/qcloud/tuicore/TUILogin;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMManager;->unInitSDK()V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIConfig;->clearSelfInfo()V

    .line 37
    .line 38
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$8;->val$callback:Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;->onSuccess(Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;)V

    .line 42
    .line 43
    const-string v0, "eventLoginStateChanged"

    .line 44
    .line 45
    const-string v2, "eventSubKeyUserLogoutSuccess"

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v2, v1}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 49
    return-void
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
