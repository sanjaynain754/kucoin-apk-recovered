.class public Lcom/tencent/bugly/proguard/ji$c;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/ji;->c(Landroid/os/CancellationSignal;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/os/CancellationSignal;

.field public final synthetic c:Lcom/tencent/bugly/proguard/ji;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/ji;Landroid/os/CancellationSignal;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ji$c;->c:Lcom/tencent/bugly/proguard/ji;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/proguard/ji$c;->b:Landroid/os/CancellationSignal;

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
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v1, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "Going to consume requested QUT."

    .line 6
    .line 7
    const-string v3, "Matrix.WarmUpDelegate"

    .line 8
    .line 9
    .line 10
    invoke-static {v3, v2, v1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/tencent/bugly/matrix/backtrace/WeChatBacktraceNative;->consumeRequestedQut()[Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ji$c;->c:Lcom/tencent/bugly/proguard/ji;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/ji;->a()Lcom/tencent/bugly/proguard/ki;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ji$c;->c:Lcom/tencent/bugly/proguard/ji;

    .line 25
    .line 26
    iget-object v1, v1, Lcom/tencent/bugly/proguard/ji;->e:Lcom/tencent/bugly/proguard/mi;

    .line 27
    .line 28
    sget-object v2, Lcom/tencent/bugly/proguard/mi$d;->d:Lcom/tencent/bugly/proguard/mi$d;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/mi;->d(Lcom/tencent/bugly/proguard/mi$d;)V

    .line 32
    .line 33
    new-array v0, v0, [Ljava/lang/Object;

    .line 34
    .line 35
    const-string v1, "Failed to acquire warm-up invoker."

    .line 36
    .line 37
    .line 38
    invoke-static {v3, v1, v0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    return-void

    .line 40
    :cond_0
    :try_start_0
    array-length v4, v1

    .line 41
    move v5, v0

    .line 42
    .line 43
    :goto_0
    if-ge v5, v4, :cond_5

    .line 44
    .line 45
    aget-object v6, v1, v5

    .line 46
    .line 47
    const/16 v7, 0x3a

    .line 48
    .line 49
    .line 50
    invoke-virtual {v6, v7}, Ljava/lang/String;->lastIndexOf(I)I

    .line 51
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 52
    const/4 v8, -0x1

    .line 53
    .line 54
    if-eq v7, v8, :cond_1

    .line 55
    .line 56
    .line 57
    :try_start_1
    invoke-virtual {v6, v0, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 58
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    .line 60
    add-int/lit8 v7, v7, 0x1

    .line 61
    .line 62
    .line 63
    :try_start_2
    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 64
    move-result-object v7

    .line 65
    .line 66
    .line 67
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 68
    move-result-object v7

    .line 69
    .line 70
    .line 71
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 72
    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    goto :goto_1

    .line 74
    :catchall_0
    move v7, v0

    .line 75
    goto :goto_1

    .line 76
    :catchall_1
    :cond_1
    move v7, v0

    .line 77
    move-object v8, v6

    .line 78
    .line 79
    :goto_1
    :try_start_3
    iget-object v9, p0, Lcom/tencent/bugly/proguard/ji$c;->c:Lcom/tencent/bugly/proguard/ji;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v9, v8, v7}, Lcom/tencent/bugly/proguard/ji;->a(Ljava/lang/String;I)Z

    .line 83
    move-result v9

    .line 84
    .line 85
    if-nez v9, :cond_2

    .line 86
    .line 87
    .line 88
    invoke-interface {v2, v8, v7}, Lcom/tencent/bugly/proguard/ki;->a(Ljava/lang/String;I)Z

    .line 89
    move-result v9

    .line 90
    .line 91
    if-nez v9, :cond_3

    .line 92
    .line 93
    iget-object v10, p0, Lcom/tencent/bugly/proguard/ji$c;->c:Lcom/tencent/bugly/proguard/ji;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v10, v8, v7}, Lcom/tencent/bugly/proguard/ji;->b(Ljava/lang/String;I)V

    .line 97
    goto :goto_2

    .line 98
    :catchall_2
    move-exception v0

    .line 99
    goto :goto_4

    .line 100
    :cond_2
    move v9, v0

    .line 101
    .line 102
    :cond_3
    :goto_2
    const-string v7, "Consumed requested QUT -> %s, ret = %s."

    .line 103
    .line 104
    .line 105
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 106
    move-result-object v8

    .line 107
    .line 108
    .line 109
    filled-new-array {v6, v8}, [Ljava/lang/Object;

    .line 110
    move-result-object v6

    .line 111
    .line 112
    .line 113
    invoke-static {v3, v7, v6}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    .line 115
    iget-object v6, p0, Lcom/tencent/bugly/proguard/ji$c;->b:Landroid/os/CancellationSignal;

    .line 116
    .line 117
    if-eqz v6, :cond_4

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6}, Landroid/os/CancellationSignal;->isCanceled()Z

    .line 121
    move-result v6

    .line 122
    .line 123
    if-eqz v6, :cond_4

    .line 124
    .line 125
    const-string v1, "Consume requested QUT canceled."

    .line 126
    .line 127
    new-array v4, v0, [Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    invoke-static {v3, v1, v4}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    goto :goto_3

    .line 132
    .line 133
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 134
    goto :goto_0

    .line 135
    .line 136
    :cond_5
    :goto_3
    const-string v1, "Consume requested QUT done."

    .line 137
    .line 138
    new-array v0, v0, [Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    invoke-static {v3, v1, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 142
    .line 143
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji$c;->c:Lcom/tencent/bugly/proguard/ji;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/ji;->a(Lcom/tencent/bugly/proguard/ki;)V

    .line 147
    .line 148
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji$c;->c:Lcom/tencent/bugly/proguard/ji;

    .line 149
    .line 150
    iget-object v0, v0, Lcom/tencent/bugly/proguard/ji;->e:Lcom/tencent/bugly/proguard/mi;

    .line 151
    .line 152
    sget-object v1, Lcom/tencent/bugly/proguard/mi$d;->d:Lcom/tencent/bugly/proguard/mi$d;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/mi;->d(Lcom/tencent/bugly/proguard/mi$d;)V

    .line 156
    return-void

    .line 157
    .line 158
    :goto_4
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ji$c;->c:Lcom/tencent/bugly/proguard/ji;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/ji;->a(Lcom/tencent/bugly/proguard/ki;)V

    .line 162
    .line 163
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ji$c;->c:Lcom/tencent/bugly/proguard/ji;

    .line 164
    .line 165
    iget-object v1, v1, Lcom/tencent/bugly/proguard/ji;->e:Lcom/tencent/bugly/proguard/mi;

    .line 166
    .line 167
    sget-object v2, Lcom/tencent/bugly/proguard/mi$d;->d:Lcom/tencent/bugly/proguard/mi$d;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/mi;->d(Lcom/tencent/bugly/proguard/mi$d;)V

    .line 171
    throw v0
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
