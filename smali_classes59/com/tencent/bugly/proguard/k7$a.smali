.class public Lcom/tencent/bugly/proguard/k7$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/k7;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/tencent/bugly/proguard/k7;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/k7;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k7$a;->b:Lcom/tencent/bugly/proguard/k7;

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
.method public run()V
    .locals 8

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k7$a;->b:Lcom/tencent/bugly/proguard/k7;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k7;->d()Lcom/tencent/bugly/proguard/k7$b;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_5

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/k7$a;->b:Lcom/tencent/bugly/proguard/k7;

    .line 12
    .line 13
    iget-object v2, v1, Lcom/tencent/bugly/proguard/k7;->d:Lcom/tencent/bugly/proguard/k7$b;

    .line 14
    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    iget-wide v3, v0, Lcom/tencent/bugly/proguard/k7$b;->c:J

    .line 18
    .line 19
    iget-wide v5, v2, Lcom/tencent/bugly/proguard/k7$b;->c:J

    .line 20
    .line 21
    cmp-long v3, v3, v5

    .line 22
    .line 23
    const-wide/16 v4, 0x1

    .line 24
    .line 25
    if-lez v3, :cond_1

    .line 26
    move-wide v6, v4

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_1
    const-wide/16 v6, 0x0

    .line 30
    .line 31
    :goto_0
    iput-wide v6, v0, Lcom/tencent/bugly/proguard/k7$b;->k:J

    .line 32
    .line 33
    cmp-long v3, v6, v4

    .line 34
    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    iget-wide v3, v0, Lcom/tencent/bugly/proguard/k7$b;->d:J

    .line 38
    .line 39
    iget-wide v5, v2, Lcom/tencent/bugly/proguard/k7$b;->d:J

    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    goto :goto_4

    .line 43
    .line 44
    :cond_2
    iget-wide v3, v0, Lcom/tencent/bugly/proguard/k7$b;->b:J

    .line 45
    .line 46
    iget-wide v5, v2, Lcom/tencent/bugly/proguard/k7$b;->b:J

    .line 47
    :goto_1
    sub-long/2addr v3, v5

    .line 48
    .line 49
    iput-wide v3, v0, Lcom/tencent/bugly/proguard/k7$b;->l:J

    .line 50
    .line 51
    :cond_3
    iput-object v0, v1, Lcom/tencent/bugly/proguard/k7;->d:Lcom/tencent/bugly/proguard/k7$b;

    .line 52
    .line 53
    iget-object v1, v1, Lcom/tencent/bugly/proguard/k7;->c:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 54
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    :try_start_1
    iget-object v2, p0, Lcom/tencent/bugly/proguard/k7$a;->b:Lcom/tencent/bugly/proguard/k7;

    .line 57
    .line 58
    iget-object v2, v2, Lcom/tencent/bugly/proguard/k7;->c:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v0}, Ljava/util/concurrent/LinkedBlockingDeque;->offer(Ljava/lang/Object;)Z

    .line 62
    move-result v2

    .line 63
    .line 64
    if-nez v2, :cond_4

    .line 65
    .line 66
    iget-object v2, p0, Lcom/tencent/bugly/proguard/k7$a;->b:Lcom/tencent/bugly/proguard/k7;

    .line 67
    .line 68
    iget-object v2, v2, Lcom/tencent/bugly/proguard/k7;->c:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/util/concurrent/LinkedBlockingDeque;->poll()Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v2, p0, Lcom/tencent/bugly/proguard/k7$a;->b:Lcom/tencent/bugly/proguard/k7;

    .line 74
    .line 75
    iget-object v2, v2, Lcom/tencent/bugly/proguard/k7;->c:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v0}, Ljava/util/concurrent/LinkedBlockingDeque;->offer(Ljava/lang/Object;)Z

    .line 79
    goto :goto_2

    .line 80
    :catchall_1
    move-exception v0

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    :goto_2
    monitor-exit v1

    .line 83
    return-void

    .line 84
    :goto_3
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 85
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    .line 87
    :goto_4
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 88
    .line 89
    const-string v2, "GcInfoStatHelper"

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    :goto_5
    return-void
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
