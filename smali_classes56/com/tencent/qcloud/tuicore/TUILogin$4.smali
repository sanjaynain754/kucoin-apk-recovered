.class Lcom/tencent/qcloud/tuicore/TUILogin$4;
.super Lcom/tencent/imsdk/v2/V2TIMLogListener;
.source "TUILogin.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/qcloud/tuicore/TUILogin;->internalLogin(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

.field final synthetic val$logListener:Lcom/tencent/qcloud/tuicore/interfaces/TUILogListener;


# direct methods
.method public constructor <init>(Lcom/tencent/qcloud/tuicore/TUILogin;Lcom/tencent/qcloud/tuicore/interfaces/TUILogListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/TUILogin$4;->this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/qcloud/tuicore/TUILogin$4;->val$logListener:Lcom/tencent/qcloud/tuicore/interfaces/TUILogListener;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tencent/imsdk/v2/V2TIMLogListener;-><init>()V

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
.method public onLog(ILjava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$4;->val$logListener:Lcom/tencent/qcloud/tuicore/interfaces/TUILogListener;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/tencent/qcloud/tuicore/interfaces/TUILogListener;->onLog(ILjava/lang/String;)V

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
