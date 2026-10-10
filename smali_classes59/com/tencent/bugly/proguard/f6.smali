.class public Lcom/tencent/bugly/proguard/f6;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/y8;
.implements Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;


# static fields
.field public static final j:Ljava/lang/String; = "RMFdLeakEvent"

.field public static final k:Ljava/lang/String; = "fd_dump_start"

.field public static final l:Ljava/lang/String; = "fd_dump_finish"

.field public static final m:Ljava/lang/String; = "fd_analyze_start"

.field public static final n:Ljava/lang/String; = "fd_analyze_finish"

.field public static final o:Ljava/lang/String; = "fd_analyze_result"

.field public static final p:Ljava/lang/String; = "fd_upload_start"

.field public static final q:Ljava/lang/String; = "fd_upload_result"

.field public static final r:Ljava/lang/String; = "fd_heap_dump_fail"

.field public static final s:Ljava/lang/String; = "fd_monitor_start"

.field public static final t:I = 0x32a

.field public static final u:I = 0x334


# instance fields
.field public final i:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/tencent/bugly/proguard/f6;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/tencent/bugly/proguard/f6;->i:Ljava/lang/String;

    return-void
.end method

.method public static a(IZLjava/lang/String;)V
    .locals 1

    .line 34
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const-string v0, "fd_heap_dump_fail"

    filled-new-array {v0, p0, p1, p2}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tencent/bugly/proguard/f6;->a([Ljava/lang/String;)V

    return-void
.end method

.method public static varargs a([Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/q0$a;->a()Lcom/tencent/bugly/proguard/q0;

    move-result-object v0

    .line 3
    const-string v1, "RMFdLeakEvent"

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/q0;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    new-instance v0, Lcom/tencent/rmonitor/sla/AttaEvent;

    invoke-direct {v0}, Lcom/tencent/rmonitor/sla/AttaEvent;-><init>()V

    .line 5
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/sla/AttaEvent;->setEventCode(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/sla/AttaEvent;->setParams([Ljava/lang/String;)V

    .line 7
    sget-object p0, Lcom/tencent/rmonitor/sla/AttaEventReporter;->Companion:Lcom/tencent/rmonitor/sla/AttaEventReporter$Companion;

    invoke-virtual {p0}, Lcom/tencent/rmonitor/sla/AttaEventReporter$Companion;->getInstance()Lcom/tencent/rmonitor/sla/AttaEventReporter;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/tencent/rmonitor/sla/AttaEventReporter;->addEvent(Lcom/tencent/rmonitor/sla/AttaEvent;)V

    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    .line 3
    const-string v0, "fd_upload_start"

    filled-new-array {v0, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tencent/bugly/proguard/f6;->a([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(II)Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 p1, 0x0

    return-object p1
.end method

.method public a(ILcom/tencent/bugly/proguard/i6;)V
    .locals 6

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 24
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/i6;->g()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 25
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/s5;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 26
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/s5;->b()Ljava/lang/String;

    move-result-object v3

    .line 27
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/i6;->e()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    .line 28
    invoke-static {}, Lcom/tencent/bugly/proguard/ic;->a()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    const-string v0, "fd_dump_finish"

    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-static {p1}, Lcom/tencent/bugly/proguard/f6;->a([Ljava/lang/String;)V

    return-void

    .line 30
    :cond_0
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/i6;->g()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    .line 31
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/s5;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 32
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/s5;->b()Ljava/lang/String;

    move-result-object p2

    const-string v1, "fd_dump_finish"

    filled-new-array {v1, p1, v0, p2}, [Ljava/lang/String;

    move-result-object p1

    .line 33
    invoke-static {p1}, Lcom/tencent/bugly/proguard/f6;->a([Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/k6;)V
    .locals 9

    .line 8
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k6;->h()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/s5;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/s5;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "fd_analyze_finish"

    filled-new-array {v3, v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-static {v0}, Lcom/tencent/bugly/proguard/f6;->a([Ljava/lang/String;)V

    .line 11
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/s5;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 12
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k6;->d()Ljava/util/Map;

    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 14
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/j6;

    .line 15
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/j6;->a()Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 16
    :cond_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const/16 v5, 0xa

    if-ge v4, v5, :cond_1

    .line 17
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    :cond_1
    const/4 v4, 0x0

    .line 18
    invoke-interface {v3, v4, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/tencent/bugly/proguard/j6;->a(Ljava/util/List;)V

    goto :goto_0

    .line 19
    :cond_2
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k6;->h()I

    move-result v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/s6;->b(I)Ljava/lang/String;

    move-result-object v2

    .line 20
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k6;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 21
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->e()Ljava/lang/String;

    move-result-object v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k6;->g()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k6;->i()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v1, "fd_analyze_result"

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object p1

    .line 23
    invoke-static {p1}, Lcom/tencent/bugly/proguard/f6;->a([Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public b()V
    .locals 1

    .line 2
    const-string v0, "fd_analyze_start"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/f6;->a([Ljava/lang/String;)V

    return-void
.end method

.method public b(I)V
    .locals 1

    .line 1
    const-string v0, "fd_monitor_start"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tencent/bugly/proguard/f6;->a([Ljava/lang/String;)V

    return-void
.end method

.method public c(I)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "fd_dump_start"

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/tencent/bugly/proguard/f6;->a([Ljava/lang/String;)V

    .line 14
    return-void
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

.method public onBlocked(I)V
    .locals 3

    .line 1
    .line 2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/f6;->i:Ljava/lang/String;

    .line 3
    .line 4
    const/16 v0, 0x334

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    const-string v2, "fd_upload_result"

    .line 13
    .line 14
    .line 15
    filled-new-array {v2, p1, v0, v1}, [Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lcom/tencent/bugly/proguard/f6;->a([Ljava/lang/String;)V

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onCached()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/f6;->i:Ljava/lang/String;

    .line 3
    .line 4
    const/16 v1, 0x32a

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const-string v2, ""

    .line 11
    .line 12
    const-string v3, "fd_upload_result"

    .line 13
    .line 14
    .line 15
    filled-new-array {v3, v0, v1, v2}, [Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/tencent/bugly/proguard/f6;->a([Ljava/lang/String;)V

    .line 20
    return-void
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
.end method

.method public onFailure(ILjava/lang/String;II)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object p3, p0, Lcom/tencent/bugly/proguard/f6;->i:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    const-string p4, "fd_upload_result"

    .line 9
    .line 10
    .line 11
    filled-new-array {p4, p3, p1, p2}, [Ljava/lang/String;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/tencent/bugly/proguard/f6;->a([Ljava/lang/String;)V

    .line 16
    return-void
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method

.method public onSuccess(II)V
    .locals 2

    .line 1
    .line 2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/f6;->i:Ljava/lang/String;

    .line 3
    const/4 p2, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    move-result-object p2

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    const-string v1, "fd_upload_result"

    .line 12
    .line 13
    .line 14
    filled-new-array {v1, p1, p2, v0}, [Ljava/lang/String;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lcom/tencent/bugly/proguard/f6;->a([Ljava/lang/String;)V

    .line 19
    return-void
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
