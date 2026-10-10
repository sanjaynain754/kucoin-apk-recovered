.class public Lcom/tencent/bugly/proguard/l5$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/l5;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/tencent/bugly/proguard/l5;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/l5;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/l5$a;->b:Lcom/tencent/bugly/proguard/l5;

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
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l5$a;->b:Lcom/tencent/bugly/proguard/l5;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/bugly/proguard/l5;->a(Lcom/tencent/bugly/proguard/l5;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    iget-object v2, p0, Lcom/tencent/bugly/proguard/l5$a;->b:Lcom/tencent/bugly/proguard/l5;

    .line 15
    .line 16
    iget-object v2, v2, Lcom/tencent/bugly/proguard/l5;->c:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, "exit_data_"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    sget-object v2, Lcom/tencent/bugly/proguard/l2;->I0:Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    iget-object v2, p0, Lcom/tencent/bugly/proguard/l5$a;->b:Lcom/tencent/bugly/proguard/l5;

    .line 41
    .line 42
    iget-object v3, v2, Lcom/tencent/bugly/proguard/l5;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v3}, Lcom/tencent/bugly/proguard/l5;->a(Ljava/util/concurrent/ConcurrentMap;)Ljava/lang/String;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    new-instance v3, Ljava/io/ByteArrayInputStream;

    .line 49
    .line 50
    const-string v4, "UTF-8"

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 54
    move-result-object v2

    .line 55
    .line 56
    .line 57
    invoke-direct {v3, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 58
    const/4 v2, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v3, v2}, Lcom/tencent/bugly/common/utils/FileUtil;->writeFile(Ljava/lang/String;Ljava/io/InputStream;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v1

    .line 64
    .line 65
    .line 66
    :try_start_1
    invoke-static {v1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 67
    :goto_0
    monitor-exit v0

    .line 68
    return-void

    .line 69
    :catchall_1
    move-exception v1

    .line 70
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 71
    throw v1
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
