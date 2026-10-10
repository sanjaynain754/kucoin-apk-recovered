.class final Lcom/tencent/liteav/base/networkbinder/NetworkBinder$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/base/networkbinder/NetworkBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/base/networkbinder/NetworkBinder;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/base/networkbinder/NetworkBinder;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/base/networkbinder/NetworkBinder$1;->a:Lcom/tencent/liteav/base/networkbinder/NetworkBinder;

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
    .line 25
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/base/networkbinder/NetworkBinder$1;->a:Lcom/tencent/liteav/base/networkbinder/NetworkBinder;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/liteav/base/networkbinder/NetworkBinder;->access$000(Lcom/tencent/liteav/base/networkbinder/NetworkBinder;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/base/networkbinder/NetworkBinder$1;->a:Lcom/tencent/liteav/base/networkbinder/NetworkBinder;

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lcom/tencent/liteav/base/networkbinder/NetworkBinder;->access$100(Lcom/tencent/liteav/base/networkbinder/NetworkBinder;)Z

    .line 13
    move-result v1

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/tencent/liteav/base/networkbinder/NetworkBinder$1;->a:Lcom/tencent/liteav/base/networkbinder/NetworkBinder;

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lcom/tencent/liteav/base/networkbinder/NetworkBinder;->access$200(Lcom/tencent/liteav/base/networkbinder/NetworkBinder;)Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lcom/tencent/liteav/base/networkbinder/NetworkBinder$1;->a:Lcom/tencent/liteav/base/networkbinder/NetworkBinder;

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lcom/tencent/liteav/base/networkbinder/NetworkBinder;->access$300(Lcom/tencent/liteav/base/networkbinder/NetworkBinder;)J

    .line 29
    move-result-wide v1

    .line 30
    .line 31
    const-string v3, ""

    .line 32
    const/4 v4, 0x0

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v2, v3, v4}, Lcom/tencent/liteav/base/networkbinder/NetworkBinder;->access$400(JLjava/lang/String;Z)V

    .line 36
    .line 37
    const-string v1, "NetworkBinder"

    .line 38
    .line 39
    const-string v2, "[BindSocket]:activate network timeout"

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    iget-object v1, p0, Lcom/tencent/liteav/base/networkbinder/NetworkBinder$1;->a:Lcom/tencent/liteav/base/networkbinder/NetworkBinder;

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v4}, Lcom/tencent/liteav/base/networkbinder/NetworkBinder;->access$102(Lcom/tencent/liteav/base/networkbinder/NetworkBinder;Z)Z

    .line 48
    .line 49
    iget-object v1, p0, Lcom/tencent/liteav/base/networkbinder/NetworkBinder$1;->a:Lcom/tencent/liteav/base/networkbinder/NetworkBinder;

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v4}, Lcom/tencent/liteav/base/networkbinder/NetworkBinder;->access$502(Lcom/tencent/liteav/base/networkbinder/NetworkBinder;Z)Z

    .line 53
    .line 54
    iget-object v1, p0, Lcom/tencent/liteav/base/networkbinder/NetworkBinder$1;->a:Lcom/tencent/liteav/base/networkbinder/NetworkBinder;

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Lcom/tencent/liteav/base/networkbinder/NetworkBinder;->access$600(Lcom/tencent/liteav/base/networkbinder/NetworkBinder;)V

    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v1

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    :goto_0
    monitor-exit v0

    .line 62
    return-void

    .line 63
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    throw v1
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
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
