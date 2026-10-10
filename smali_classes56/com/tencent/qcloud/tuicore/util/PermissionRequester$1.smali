.class Lcom/tencent/qcloud/tuicore/util/PermissionRequester$1;
.super Ljava/lang/Object;
.source "PermissionRequester.java"

# interfaces
.implements Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->onRequestPermissionsResult(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/qcloud/tuicore/util/PermissionRequester;


# direct methods
.method public constructor <init>(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$1;->this$0:Lcom/tencent/qcloud/tuicore/util/PermissionRequester;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public onApproved()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$1;->this$0:Lcom/tencent/qcloud/tuicore/util/PermissionRequester;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->access$000(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;)Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$1;->this$0:Lcom/tencent/qcloud/tuicore/util/PermissionRequester;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->access$000(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;)Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;->onApproved()V

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$1;->this$0:Lcom/tencent/qcloud/tuicore/util/PermissionRequester;

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->access$002(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;)Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->launchAppDetailsSettings()V

    .line 27
    return-void
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

.method public onRefused()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$1;->this$0:Lcom/tencent/qcloud/tuicore/util/PermissionRequester;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->access$000(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;)Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$1;->this$0:Lcom/tencent/qcloud/tuicore/util/PermissionRequester;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->access$000(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;)Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;->onRefused()V

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$1;->this$0:Lcom/tencent/qcloud/tuicore/util/PermissionRequester;

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->access$002(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;)Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;

    .line 24
    return-void
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
