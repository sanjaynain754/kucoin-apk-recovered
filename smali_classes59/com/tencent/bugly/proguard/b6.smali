.class public Lcom/tencent/bugly/proguard/b6;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = "RMonitor_FdLeak_FdHeapAnalyzeHelper"

.field public static final b:Ljava/lang/String; = "key_hprof_data"

.field public static final c:Ljava/lang/String; = "key_result_receiver"

.field public static final d:Ljava/lang/String; = "key_analyze_result"

.field public static final e:Ljava/lang/String; = "key_analyze_error_message"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 17
.end method

.method public static a(Lcom/tencent/bugly/proguard/u8;Lcom/tencent/bugly/proguard/i6;)Lcom/tencent/bugly/proguard/j6;
    .locals 2

    .line 27
    :try_start_0
    invoke-interface {p0, p1}, Lcom/tencent/bugly/proguard/v8;->a(Lcom/tencent/bugly/proguard/i6;)Lcom/tencent/bugly/proguard/j6;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p1

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "pre analyze failed, type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/tencent/bugly/proguard/v8;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ": "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "RMonitor_FdLeak_FdHeapAnalyzeHelper"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/fb;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Lcom/tencent/bugly/proguard/i6;)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/proguard/i6;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/j6;",
            ">;"
        }
    .end annotation

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    invoke-static {p0}, Lcom/tencent/bugly/proguard/y0;->b(Lcom/tencent/bugly/proguard/i6;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    .line 15
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/e6;->a()[Lcom/tencent/bugly/proguard/u8;

    move-result-object v1

    .line 16
    new-instance v2, Ljava/util/HashMap;

    array-length v3, v1

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 17
    array-length v3, v1

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_1

    aget-object v6, v1, v5

    .line 18
    invoke-static {v6, p0}, Lcom/tencent/bugly/proguard/b6;->a(Lcom/tencent/bugly/proguard/u8;Lcom/tencent/bugly/proguard/i6;)Lcom/tencent/bugly/proguard/j6;

    move-result-object v7

    .line 19
    invoke-interface {v6}, Lcom/tencent/bugly/proguard/v8;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i6;->d()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/tencent/bugly/proguard/c6;

    .line 21
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/c6;->a()Lshark/i;

    move-result-object v3

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/c6;->b()Ljava/util/Set;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/tencent/rmonitor/fd/utils/SharkAnalysisUtil;->findPathsFromGcRoots(Lshark/i;Ljava/util/Set;)Ljava/util/Map;

    move-result-object v3

    .line 22
    array-length v5, v1

    :goto_1
    if-ge v4, v5, :cond_3

    aget-object v6, v1, v4

    .line 23
    invoke-interface {v6}, Lcom/tencent/bugly/proguard/v8;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tencent/bugly/proguard/j6;

    if-eqz v7, :cond_2

    .line 24
    invoke-interface {v6, p0, v7, v3}, Lcom/tencent/bugly/proguard/u8;->a(Lcom/tencent/bugly/proguard/c6;Lcom/tencent/bugly/proguard/j6;Ljava/util/Map;)V

    .line 25
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    const-string/jumbo v8, "onAnalyzeFinished: "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "RMonitor_FdLeak_FdHeapAnalyzeHelper"

    invoke-static {v7, v6}, Lcom/tencent/bugly/proguard/fb;->c(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    return-object v0
.end method

.method public static a(Lcom/tencent/bugly/proguard/i6;Landroid/os/ResultReceiver;)V
    .locals 4

    const-string v0, "RMonitor_FdLeak_FdHeapAnalyzeHelper"

    if-nez p1, :cond_0

    .line 1
    const-string/jumbo p0, "onHandleIntent, result receiver is null."

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/fb;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 2
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    if-nez p0, :cond_1

    .line 3
    const-string/jumbo p0, "onHandleIntent, result is null."

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/fb;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p0, 0x8

    .line 4
    invoke-virtual {p1, p0, v1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    return-void

    .line 5
    :cond_1
    const-string/jumbo v2, "runAnalysis."

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/fb;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-static {p0}, Lcom/tencent/bugly/proguard/b6;->b(Lcom/tencent/bugly/proguard/i6;)Lcom/tencent/bugly/proguard/c6;

    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/i6;->a(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/s5;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "key_analyze_error_message"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_2

    .line 9
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/s5;->a()I

    move-result p0

    invoke-virtual {p1, p0, v1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    return-void

    .line 10
    :cond_2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/b6;->a(Lcom/tencent/bugly/proguard/i6;)Ljava/util/ArrayList;

    move-result-object p0

    .line 11
    const-string v0, "key_analyze_result"

    invoke-virtual {v1, v0, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const/4 p0, 0x0

    .line 12
    invoke-virtual {p1, p0, v1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    return-void
.end method

.method public static b(Lcom/tencent/bugly/proguard/i6;)Lcom/tencent/bugly/proguard/c6;
    .locals 4

    .line 1
    .line 2
    const-string v0, "RMonitor_FdLeak_FdHeapAnalyzeHelper"

    .line 3
    .line 4
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i6;->f()Ljava/lang/String;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getHprofHeapGraph(Ljava/io/File;)Lcom/tencent/bugly/proguard/c6;

    .line 15
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    return-object p0

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception v1

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string/jumbo v3, "parse hprof failed due to exception: "

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/fb;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    const/4 v0, 0x6

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/s5;->a(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/s5;->a(Ljava/lang/String;)V

    .line 54
    goto :goto_2

    .line 55
    .line 56
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string/jumbo v3, "parse hprof failed due to OOM: "

    .line 60
    .line 61
    .line 62
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 66
    move-result-object v3

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    move-result-object v2

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/fb;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    const/4 v0, 0x7

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/s5;->a(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/s5;->a(Ljava/lang/String;)V

    .line 88
    :goto_2
    const/4 p0, 0x0

    .line 89
    return-object p0
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method
