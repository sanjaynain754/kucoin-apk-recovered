.class public Lcom/tencent/bugly/proguard/ji$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/ji;->d(Landroid/os/CancellationSignal;)V
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
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ji$a;->c:Lcom/tencent/bugly/proguard/ji;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/proguard/ji$a;->b:Landroid/os/CancellationSignal;

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
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v1, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "Going to warm up."

    .line 6
    .line 7
    const-string v3, "Matrix.WarmUpDelegate"

    .line 8
    .line 9
    .line 10
    invoke-static {v3, v2, v1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 14
    .line 15
    iget-object v4, p0, Lcom/tencent/bugly/proguard/ji$a;->c:Lcom/tencent/bugly/proguard/ji;

    .line 16
    .line 17
    iget-object v4, v4, Lcom/tencent/bugly/proguard/ji;->f:Lcom/tencent/bugly/proguard/pi$c;

    .line 18
    .line 19
    .line 20
    invoke-static {v4}, Lcom/tencent/bugly/proguard/oi;->c(Lcom/tencent/bugly/proguard/pi$c;)Ljava/lang/String;

    .line 21
    move-result-object v4

    .line 22
    .line 23
    .line 24
    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 28
    move-result v2

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    const-string v2, "Saving path is not a directory."

    .line 33
    .line 34
    new-array v4, v0, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-static {v3, v2, v4}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ji$a;->c:Lcom/tencent/bugly/proguard/ji;

    .line 40
    .line 41
    iget-object v2, v2, Lcom/tencent/bugly/proguard/ji;->e:Lcom/tencent/bugly/proguard/mi;

    .line 42
    .line 43
    sget-object v4, Lcom/tencent/bugly/proguard/mi$d;->b:Lcom/tencent/bugly/proguard/mi$d;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v4}, Lcom/tencent/bugly/proguard/mi;->d(Lcom/tencent/bugly/proguard/mi$d;)V

    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception v2

    .line 49
    goto :goto_2

    .line 50
    .line 51
    :cond_0
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ji$a;->c:Lcom/tencent/bugly/proguard/ji;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/ji;->a()Lcom/tencent/bugly/proguard/ki;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    const-string v2, "Failed to acquire warm-up invoker"

    .line 60
    .line 61
    new-array v4, v0, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-static {v3, v2, v4}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/OperationCanceledException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    if-eqz v1, :cond_7

    .line 67
    .line 68
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji$a;->c:Lcom/tencent/bugly/proguard/ji;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/ji;->a(Lcom/tencent/bugly/proguard/ki;)V

    .line 72
    return-void

    .line 73
    .line 74
    :cond_1
    :try_start_1
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ji$a;->c:Lcom/tencent/bugly/proguard/ji;

    .line 75
    .line 76
    iget-object v2, v2, Lcom/tencent/bugly/proguard/ji;->f:Lcom/tencent/bugly/proguard/pi$c;

    .line 77
    .line 78
    iget-object v2, v2, Lcom/tencent/bugly/proguard/pi$c;->c:Ljava/util/HashSet;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    move-result v4

    .line 87
    .line 88
    if-eqz v4, :cond_2

    .line 89
    .line 90
    .line 91
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    move-result-object v4

    .line 93
    .line 94
    check-cast v4, Ljava/lang/String;

    .line 95
    .line 96
    new-instance v5, Ljava/io/File;

    .line 97
    .line 98
    .line 99
    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    iget-object v4, p0, Lcom/tencent/bugly/proguard/ji$a;->b:Landroid/os/CancellationSignal;

    .line 102
    .line 103
    new-instance v6, Lcom/tencent/bugly/proguard/ji$a$a;

    .line 104
    .line 105
    .line 106
    invoke-direct {v6, p0, v1}, Lcom/tencent/bugly/proguard/ji$a$a;-><init>(Lcom/tencent/bugly/proguard/ji$a;Lcom/tencent/bugly/proguard/ki;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v5, v4, v6}, Lcom/tencent/bugly/proguard/oi;->a(Ljava/io/File;Landroid/os/CancellationSignal;Ljava/io/FileFilter;)V
    :try_end_1
    .catch Landroid/os/OperationCanceledException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    goto :goto_0

    .line 111
    :cond_2
    :goto_1
    move v2, v0

    .line 112
    goto :goto_3

    .line 113
    .line 114
    :goto_2
    :try_start_2
    const-string v4, ""

    .line 115
    .line 116
    new-array v5, v0, [Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    invoke-static {v3, v2, v4, v5}, Lcom/tencent/bugly/proguard/pb;->a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 120
    .line 121
    if-eqz v1, :cond_3

    .line 122
    goto :goto_1

    .line 123
    :cond_3
    move v2, v0

    .line 124
    goto :goto_4

    .line 125
    :catchall_1
    move-exception v0

    .line 126
    .line 127
    if-eqz v1, :cond_4

    .line 128
    .line 129
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ji$a;->c:Lcom/tencent/bugly/proguard/ji;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v1}, Lcom/tencent/bugly/proguard/ji;->a(Lcom/tencent/bugly/proguard/ki;)V

    .line 133
    :cond_4
    throw v0

    .line 134
    :catch_0
    const/4 v2, 0x1

    .line 135
    .line 136
    if-eqz v1, :cond_5

    .line 137
    .line 138
    :goto_3
    iget-object v4, p0, Lcom/tencent/bugly/proguard/ji$a;->c:Lcom/tencent/bugly/proguard/ji;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v1}, Lcom/tencent/bugly/proguard/ji;->a(Lcom/tencent/bugly/proguard/ki;)V

    .line 142
    .line 143
    :cond_5
    :goto_4
    if-nez v2, :cond_6

    .line 144
    .line 145
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ji$a;->c:Lcom/tencent/bugly/proguard/ji;

    .line 146
    .line 147
    iget-object v1, v1, Lcom/tencent/bugly/proguard/ji;->e:Lcom/tencent/bugly/proguard/mi;

    .line 148
    .line 149
    sget-object v2, Lcom/tencent/bugly/proguard/mi$d;->b:Lcom/tencent/bugly/proguard/mi$d;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/mi;->d(Lcom/tencent/bugly/proguard/mi$d;)V

    .line 153
    .line 154
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ji$a;->c:Lcom/tencent/bugly/proguard/ji;

    .line 155
    .line 156
    iget-object v2, v1, Lcom/tencent/bugly/proguard/ji;->f:Lcom/tencent/bugly/proguard/pi$c;

    .line 157
    .line 158
    iget-object v2, v2, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/ji;->a(Landroid/content/Context;)V

    .line 162
    .line 163
    new-array v0, v0, [Ljava/lang/Object;

    .line 164
    .line 165
    const-string v1, "Warm-up done."

    .line 166
    .line 167
    .line 168
    invoke-static {v3, v1, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    goto :goto_5

    .line 170
    .line 171
    :cond_6
    new-array v0, v0, [Ljava/lang/Object;

    .line 172
    .line 173
    const-string v1, "Warm-up cancelled."

    .line 174
    .line 175
    .line 176
    invoke-static {v3, v1, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    :cond_7
    :goto_5
    return-void
.end method
