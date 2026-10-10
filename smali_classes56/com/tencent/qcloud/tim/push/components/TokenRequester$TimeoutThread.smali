.class Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/qcloud/tim/push/components/TokenRequester;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TimeoutThread"
.end annotation


# instance fields
.field public volatile a:Z

.field public b:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

.field public c:I

.field public final synthetic d:Lcom/tencent/qcloud/tim/push/components/TokenRequester;


# direct methods
.method public constructor <init>(Lcom/tencent/qcloud/tim/push/components/TokenRequester;ILcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;->d:Lcom/tencent/qcloud/tim/push/components/TokenRequester;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 6
    const/4 p1, 0x1

    .line 7
    .line 8
    iput-boolean p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;->a:Z

    .line 9
    .line 10
    iput p2, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;->c:I

    .line 11
    .line 12
    iput-object p3, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;->b:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

    .line 13
    return-void
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
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;->a:Z

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

.method public run()V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;->c:I

    .line 3
    int-to-long v0, v0

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 7
    .line 8
    sget-object v0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->f:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    const-string v2, "running ="

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    iget-boolean v2, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;->a:Z

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    iget-boolean v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;->a:Z

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;->b:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;->d:Lcom/tencent/qcloud/tim/push/components/TokenRequester;

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->c(Lcom/tencent/qcloud/tim/push/components/TokenRequester;)Landroid/os/Handler;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    new-instance v1, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread$1;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, p0}, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread$1;-><init>(Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    return-void

    .line 54
    :catch_0
    move-exception v0

    .line 55
    .line 56
    sget-object v1, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->f:Ljava/lang/String;

    .line 57
    .line 58
    new-instance v2, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    const-string v3, "timeout exception ="

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    :cond_0
    return-void
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method
