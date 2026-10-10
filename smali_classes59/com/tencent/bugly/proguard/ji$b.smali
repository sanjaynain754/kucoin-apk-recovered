.class public Lcom/tencent/bugly/proguard/ji$b;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/ji;->a(Landroid/os/CancellationSignal;)V
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
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ji$b;->c:Lcom/tencent/bugly/proguard/ji;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/proguard/ji$b;->b:Landroid/os/CancellationSignal;

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
    .locals 6

    .line 1
    .line 2
    new-instance v0, Ljava/io/File;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ji$b;->c:Lcom/tencent/bugly/proguard/ji;

    .line 5
    .line 6
    iget-object v1, v1, Lcom/tencent/bugly/proguard/ji;->f:Lcom/tencent/bugly/proguard/pi$c;

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Lcom/tencent/bugly/proguard/oi;->c(Lcom/tencent/bugly/proguard/pi$c;)Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    const-string v2, "Going to clean up saving path(%s).."

    .line 24
    .line 25
    const-string v3, "Matrix.WarmUpDelegate"

    .line 26
    .line 27
    .line 28
    invoke-static {v3, v2, v1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji$b;->c:Lcom/tencent/bugly/proguard/ji;

    .line 37
    .line 38
    iget-object v0, v0, Lcom/tencent/bugly/proguard/ji;->e:Lcom/tencent/bugly/proguard/mi;

    .line 39
    .line 40
    sget-object v1, Lcom/tencent/bugly/proguard/mi$d;->c:Lcom/tencent/bugly/proguard/mi$d;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/mi;->d(Lcom/tencent/bugly/proguard/mi$d;)V

    .line 44
    return-void

    .line 45
    .line 46
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 50
    const/4 v2, 0x0

    .line 51
    .line 52
    :try_start_0
    iget-object v4, p0, Lcom/tencent/bugly/proguard/ji$b;->b:Landroid/os/CancellationSignal;

    .line 53
    .line 54
    new-instance v5, Lcom/tencent/bugly/proguard/ji$b$a;

    .line 55
    .line 56
    .line 57
    invoke-direct {v5, p0, v1}, Lcom/tencent/bugly/proguard/ji$b$a;-><init>(Lcom/tencent/bugly/proguard/ji$b;Ljava/util/HashMap;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v4, v5}, Lcom/tencent/bugly/proguard/oi;->a(Ljava/io/File;Landroid/os/CancellationSignal;Ljava/io/FileFilter;)V
    :try_end_0
    .catch Landroid/os/OperationCanceledException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception v1

    .line 63
    .line 64
    new-array v4, v2, [Ljava/lang/Object;

    .line 65
    .line 66
    const-string v5, ""

    .line 67
    .line 68
    .line 69
    invoke-static {v3, v1, v5, v4}, Lcom/tencent/bugly/proguard/pb;->a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    :goto_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ji$b;->c:Lcom/tencent/bugly/proguard/ji;

    .line 72
    .line 73
    iget-object v1, v1, Lcom/tencent/bugly/proguard/ji;->f:Lcom/tencent/bugly/proguard/pi$c;

    .line 74
    .line 75
    iget-object v1, v1, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    invoke-static {v1}, Lcom/tencent/bugly/proguard/oi;->d(Landroid/content/Context;)V

    .line 79
    .line 80
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ji$b;->c:Lcom/tencent/bugly/proguard/ji;

    .line 81
    .line 82
    iget-object v1, v1, Lcom/tencent/bugly/proguard/ji;->e:Lcom/tencent/bugly/proguard/mi;

    .line 83
    .line 84
    sget-object v4, Lcom/tencent/bugly/proguard/mi$d;->c:Lcom/tencent/bugly/proguard/mi$d;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v4}, Lcom/tencent/bugly/proguard/mi;->d(Lcom/tencent/bugly/proguard/mi$d;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    .line 94
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    const-string v1, "Clean up saving path(%s) done."

    .line 98
    .line 99
    .line 100
    invoke-static {v3, v1, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    .line 102
    sget-object v0, Lcom/tencent/bugly/proguard/ji;->o:Lcom/tencent/bugly/proguard/li;

    .line 103
    .line 104
    if-eqz v0, :cond_1

    .line 105
    .line 106
    sget-object v1, Lcom/tencent/bugly/proguard/li$a;->c:Lcom/tencent/bugly/proguard/li$a;

    .line 107
    .line 108
    new-array v2, v2, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    invoke-interface {v0, v1, v2}, Lcom/tencent/bugly/proguard/li;->a(Lcom/tencent/bugly/proguard/li$a;[Ljava/lang/Object;)V

    .line 112
    goto :goto_1

    .line 113
    .line 114
    .line 115
    :catch_0
    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    .line 119
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    const-string v1, "Clean up saving path(%s) cancelled."

    .line 123
    .line 124
    .line 125
    invoke-static {v3, v1, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    :cond_1
    :goto_1
    return-void
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
