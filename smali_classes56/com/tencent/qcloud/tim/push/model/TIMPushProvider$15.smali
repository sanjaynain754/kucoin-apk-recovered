.class Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;


# direct methods
.method public constructor <init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$15;->a:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

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
.method public run()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$15;->a:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->b(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$15;->a:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 13
    .line 14
    const-wide/16 v1, 0x1f4

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->b(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;J)V

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$15;->a:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->b(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)I

    .line 24
    move-result v0

    .line 25
    .line 26
    const/16 v1, 0xf

    .line 27
    .line 28
    if-ge v0, v1, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$15;->a:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 31
    .line 32
    const-wide/16 v1, 0x3e8

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1, v2}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->b(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;J)V

    .line 36
    return-void

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-static {}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a()Ljava/lang/String;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    const-string v1, "exceed MAX_NOTIFY_NOTIFICATION_COUNT"

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$15;->a:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 48
    const/4 v1, 0x0

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$15;->a:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->c(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)Landroid/os/Handler;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 61
    return-void
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
