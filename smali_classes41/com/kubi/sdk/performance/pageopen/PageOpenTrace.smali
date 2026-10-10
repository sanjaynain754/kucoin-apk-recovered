.class public final Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;
.super Ljava/lang/Object;
.source "PageOpenTrace.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$Companion;,
        Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;,
        Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 52\u00020\u0001:\u00045678B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u0018J\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001dJ\u0017\u0010!\u001a\u00020\u00102\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\u0010J;\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\'2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010)2\u000e\u0008\u0002\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+\u00a2\u0006\u0002\u0010-J)\u0010.\u001a\u00020\u00102\u0008\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010/\u001a\u0002002\u0008\u00101\u001a\u0004\u0018\u000100H\u0002\u00a2\u0006\u0002\u00102J\u0012\u00103\u001a\u0004\u0018\u0001042\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0011\u00a8\u00069"
    }
    d2 = {
        "Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;",
        "",
        "config",
        "Lcom/kubi/sdk/performance/pageopen/PageOpenTraceConfig;",
        "clock",
        "Lcom/kubi/sdk/performance/pageopen/PageOpenClock;",
        "reportSink",
        "Lcom/kubi/sdk/performance/pageopen/PageOpenReportSink;",
        "<init>",
        "(Lcom/kubi/sdk/performance/pageopen/PageOpenTraceConfig;Lcom/kubi/sdk/performance/pageopen/PageOpenClock;Lcom/kubi/sdk/performance/pageopen/PageOpenReportSink;)V",
        "getConfig",
        "()Lcom/kubi/sdk/performance/pageopen/PageOpenTraceConfig;",
        "lock",
        "snapshot",
        "Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$Snapshot;",
        "isTerminal",
        "",
        "()Z",
        "hasPageBinding",
        "getHasPageBinding",
        "hasDataReady",
        "getHasDataReady",
        "bindPage",
        "pageId",
        "",
        "routeKey",
        "matchesBinding",
        "recordFirstFrame",
        "beginStage",
        "Lcom/kubi/sdk/performance/pageopen/PageOpenStageToken;",
        "name",
        "endStage",
        "token",
        "reportDataReady",
        "cacheHit",
        "(Ljava/lang/Boolean;)Z",
        "recordRenderComplete",
        "finish",
        "result",
        "Lcom/kubi/sdk/performance/pageopen/PageOpenResult;",
        "phaseTimings",
        "Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;",
        "externalStages",
        "",
        "Lcom/kubi/sdk/performance/pageopen/PageOpenStageRecord;",
        "(Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Boolean;Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;Ljava/util/List;)Z",
        "isValidPhaseTimings",
        "totalDurationMs",
        "",
        "ttidMs",
        "(Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;JLjava/lang/Long;)Z",
        "buildReport",
        "Lcom/kubi/sdk/performance/pageopen/PageOpenReport;",
        "Companion",
        "RunningStage",
        "TerminalData",
        "Snapshot",
        "LBase_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPageOpenTrace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageOpenTrace.kt\ncom/kubi/sdk/performance/pageopen/PageOpenTrace\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1#2:361\n*E\n"
    }
.end annotation


# static fields
.field public static final f:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/kubi/sdk/performance/pageopen/k;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/kubi/sdk/performance/pageopen/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/kubi/sdk/performance/pageopen/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->f:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$Companion;

    .line 9
    return-void
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
.end method

.method public constructor <init>(Lcom/kubi/sdk/performance/pageopen/k;Lcom/kubi/sdk/performance/pageopen/b;Lcom/kubi/sdk/performance/pageopen/e;)V
    .locals 12
    .param p1    # Lcom/kubi/sdk/performance/pageopen/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/sdk/performance/pageopen/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/sdk/performance/pageopen/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reportSink"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->a:Lcom/kubi/sdk/performance/pageopen/k;

    .line 3
    iput-object p2, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->b:Lcom/kubi/sdk/performance/pageopen/b;

    .line 4
    iput-object p3, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->c:Lcom/kubi/sdk/performance/pageopen/e;

    .line 5
    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->d:Ljava/lang/Object;

    .line 6
    new-instance v0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    invoke-virtual {p1}, Lcom/kubi/sdk/performance/pageopen/k;->a()Ljava/lang/String;

    move-result-object v1

    const/16 v10, 0x1fe

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v11}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/List;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->e:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/sdk/performance/pageopen/k;Lcom/kubi/sdk/performance/pageopen/b;Lcom/kubi/sdk/performance/pageopen/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 7
    sget-object p2, Lcom/kubi/sdk/performance/pageopen/a;->a:Lcom/kubi/sdk/performance/pageopen/a;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 8
    sget-object p3, Lcom/kubi/sdk/performance/pageopen/PageOpenReporter;->d:Lcom/kubi/sdk/performance/pageopen/PageOpenReporter$Companion;

    invoke-virtual {p3}, Lcom/kubi/sdk/performance/pageopen/PageOpenReporter$Companion;->getDefault()Lcom/kubi/sdk/performance/pageopen/PageOpenReporter;

    move-result-object p3

    .line 9
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;-><init>(Lcom/kubi/sdk/performance/pageopen/k;Lcom/kubi/sdk/performance/pageopen/b;Lcom/kubi/sdk/performance/pageopen/e;)V

    return-void
.end method

.method public static synthetic a(Lcom/kubi/sdk/performance/pageopen/h;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->e(Lcom/kubi/sdk/performance/pageopen/h;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static synthetic b(JLcom/kubi/sdk/performance/pageopen/h;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->f(JLcom/kubi/sdk/performance/pageopen/h;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
.end method

.method public static final e(Lcom/kubi/sdk/performance/pageopen/h;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/sdk/performance/pageopen/l;->a:Lcom/kubi/sdk/performance/pageopen/l;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/sdk/performance/pageopen/h;->b()Ljava/lang/String;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lcom/kubi/sdk/performance/pageopen/l;->e(Ljava/lang/String;)Z

    .line 15
    move-result p0

    .line 16
    return p0
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
.end method

.method public static final f(JLcom/kubi/sdk/performance/pageopen/h;)Z
    .locals 3

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/sdk/performance/pageopen/l;->a:Lcom/kubi/sdk/performance/pageopen/l;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/kubi/sdk/performance/pageopen/h;->a()J

    .line 11
    move-result-wide v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, v2, p0, p1}, Lcom/kubi/sdk/performance/pageopen/l;->a(JJ)Z

    .line 15
    move-result p0

    .line 16
    return p0
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
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
.end method

.method public static synthetic h(Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Boolean;Lcom/kubi/sdk/performance/pageopen/c;Ljava/util/List;ILjava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    and-int/lit8 p6, p5, 0x2

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    if-eqz p6, :cond_0

    .line 6
    move-object p2, v0

    .line 7
    .line 8
    :cond_0
    and-int/lit8 p6, p5, 0x4

    .line 9
    .line 10
    if-eqz p6, :cond_1

    .line 11
    move-object p3, v0

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p5, p5, 0x8

    .line 14
    .line 15
    if-eqz p5, :cond_2

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 19
    move-result-object p4

    .line 20
    .line 21
    .line 22
    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->g(Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Boolean;Lcom/kubi/sdk/performance/pageopen/c;Ljava/util/List;)Z

    .line 23
    move-result p0

    .line 24
    return p0
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
.end method


# virtual methods
.method public final c(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 28
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v3, p1

    .line 5
    .line 6
    move-object/from16 v4, p2

    .line 7
    .line 8
    const-string v0, "pageId"

    .line 9
    .line 10
    .line 11
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v0, "routeKey"

    .line 14
    .line 15
    .line 16
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    sget-object v0, Lcom/kubi/sdk/performance/pageopen/l;->a:Lcom/kubi/sdk/performance/pageopen/l;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v3}, Lcom/kubi/sdk/performance/pageopen/l;->c(Ljava/lang/String;)Z

    .line 22
    move-result v2

    .line 23
    const/4 v5, 0x0

    .line 24
    .line 25
    if-eqz v2, :cond_8

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v4}, Lcom/kubi/sdk/performance/pageopen/l;->d(Ljava/lang/String;)Z

    .line 29
    move-result v0

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_0
    iget-object v14, v1, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->d:Ljava/lang/Object;

    .line 36
    monitor-enter v14

    .line 37
    .line 38
    :try_start_0
    iget-object v2, v1, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->e:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->c()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    const/4 v15, 0x0

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->c()Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    move-result v0

    .line 54
    .line 55
    if-eqz v0, :cond_5

    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    .line 62
    :cond_1
    :goto_0
    invoke-virtual {v2}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->d()Ljava/lang/String;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->d()Ljava/lang/String;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    .line 72
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    move-result v0

    .line 74
    .line 75
    if-nez v0, :cond_2

    .line 76
    goto :goto_2

    .line 77
    .line 78
    :cond_2
    const/16 v12, 0x1fc

    .line 79
    const/4 v13, 0x0

    .line 80
    const/4 v5, 0x0

    .line 81
    const/4 v6, 0x0

    .line 82
    const/4 v7, 0x0

    .line 83
    const/4 v8, 0x0

    .line 84
    const/4 v9, 0x0

    .line 85
    const/4 v10, 0x0

    .line 86
    const/4 v11, 0x0

    .line 87
    .line 88
    .line 89
    invoke-static/range {v2 .. v13}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->b(Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/List;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;ZILjava/lang/Object;)Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->j()Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;

    .line 94
    move-result-object v2

    .line 95
    .line 96
    if-eqz v2, :cond_4

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->i()Z

    .line 100
    move-result v2

    .line 101
    .line 102
    if-nez v2, :cond_4

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v0}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->d(Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;)Lcom/kubi/sdk/performance/pageopen/d;

    .line 106
    move-result-object v15

    .line 107
    .line 108
    if-eqz v15, :cond_3

    .line 109
    .line 110
    const/16 v26, 0xff

    .line 111
    .line 112
    const/16 v27, 0x0

    .line 113
    .line 114
    const/16 v17, 0x0

    .line 115
    .line 116
    const/16 v18, 0x0

    .line 117
    .line 118
    const/16 v19, 0x0

    .line 119
    .line 120
    const/16 v20, 0x0

    .line 121
    .line 122
    const/16 v21, 0x0

    .line 123
    .line 124
    const/16 v22, 0x0

    .line 125
    .line 126
    const/16 v23, 0x0

    .line 127
    .line 128
    const/16 v24, 0x0

    .line 129
    .line 130
    const/16 v25, 0x1

    .line 131
    .line 132
    move-object/from16 v16, v0

    .line 133
    .line 134
    .line 135
    invoke-static/range {v16 .. v27}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->b(Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/List;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;ZILjava/lang/Object;)Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    .line 136
    move-result-object v0

    .line 137
    goto :goto_1

    .line 138
    .line 139
    :cond_3
    move-object/from16 v16, v0

    .line 140
    goto :goto_1

    .line 141
    .line 142
    :cond_4
    move-object/from16 v16, v0

    .line 143
    .line 144
    move-object/from16 v0, v16

    .line 145
    .line 146
    :goto_1
    iput-object v0, v1, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->e:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    const/4 v5, 0x1

    .line 148
    :cond_5
    :goto_2
    monitor-exit v14

    .line 149
    .line 150
    if-eqz v15, :cond_7

    .line 151
    .line 152
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 153
    .line 154
    iget-object v0, v1, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->c:Lcom/kubi/sdk/performance/pageopen/e;

    .line 155
    .line 156
    .line 157
    invoke-interface {v0, v15}, Lcom/kubi/sdk/performance/pageopen/e;->a(Lcom/kubi/sdk/performance/pageopen/d;)V

    .line 158
    .line 159
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 160
    .line 161
    .line 162
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 164
    goto :goto_3

    .line 165
    :catchall_1
    move-exception v0

    .line 166
    .line 167
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 168
    .line 169
    .line 170
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 171
    move-result-object v0

    .line 172
    .line 173
    .line 174
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    move-result-object v0

    .line 176
    .line 177
    .line 178
    :goto_3
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 179
    move-result-object v2

    .line 180
    .line 181
    if-eqz v2, :cond_6

    .line 182
    .line 183
    const-string v2, "PageOpenTrace"

    .line 184
    .line 185
    const-string v3, "PageOpen report dispatch failed"

    .line 186
    .line 187
    .line 188
    invoke-static {v2, v3}, Lro/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_6
    invoke-static {v0}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 192
    :cond_7
    return v5

    .line 193
    :goto_4
    monitor-exit v14

    .line 194
    throw v0

    .line 195
    :cond_8
    :goto_5
    return v5
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
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
.end method

.method public final d(Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;)Lcom/kubi/sdk/performance/pageopen/d;
    .locals 20

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->j()Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;

    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    return-object v2

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->c()Ljava/lang/String;

    .line 14
    move-result-object v3

    .line 15
    .line 16
    if-eqz v3, :cond_c

    .line 17
    .line 18
    sget-object v4, Lcom/kubi/sdk/performance/pageopen/l;->a:Lcom/kubi/sdk/performance/pageopen/l;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v4, v3}, Lcom/kubi/sdk/performance/pageopen/l;->c(Ljava/lang/String;)Z

    .line 22
    move-result v5

    .line 23
    .line 24
    if-eqz v5, :cond_1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v3, v2

    .line 27
    .line 28
    :goto_0
    if-eqz v3, :cond_c

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;->c()J

    .line 32
    move-result-wide v5

    .line 33
    .line 34
    iget-object v7, v0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->a:Lcom/kubi/sdk/performance/pageopen/k;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7}, Lcom/kubi/sdk/performance/pageopen/k;->f()J

    .line 38
    move-result-wide v7

    .line 39
    sub-long/2addr v5, v7

    .line 40
    const/4 v9, 0x2

    .line 41
    const/4 v10, 0x0

    .line 42
    .line 43
    const-wide/16 v7, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static/range {v4 .. v10}, Lcom/kubi/sdk/performance/pageopen/l;->b(Lcom/kubi/sdk/performance/pageopen/l;JJILjava/lang/Object;)Z

    .line 47
    move-result v4

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    return-object v2

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->h()Ljava/lang/Long;

    .line 54
    move-result-object v4

    .line 55
    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    .line 59
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->g()Ljava/lang/Long;

    .line 60
    move-result-object v7

    .line 61
    .line 62
    if-eqz v7, :cond_3

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 66
    move-result-wide v7

    .line 67
    .line 68
    .line 69
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->g()Ljava/lang/Long;

    .line 70
    move-result-object v9

    .line 71
    .line 72
    .line 73
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 74
    move-result-wide v9

    .line 75
    .line 76
    .line 77
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 78
    move-result-wide v7

    .line 79
    .line 80
    .line 81
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 82
    move-result-object v7

    .line 83
    goto :goto_1

    .line 84
    :cond_3
    move-object v7, v2

    .line 85
    .line 86
    :goto_1
    if-eqz v7, :cond_4

    .line 87
    .line 88
    if-eqz v4, :cond_4

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 92
    move-result-wide v8

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 96
    move-result-wide v10

    .line 97
    sub-long/2addr v8, v10

    .line 98
    .line 99
    .line 100
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 101
    move-result-object v8

    .line 102
    goto :goto_2

    .line 103
    :cond_4
    move-object v8, v2

    .line 104
    .line 105
    :goto_2
    if-eqz v7, :cond_5

    .line 106
    .line 107
    .line 108
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 109
    move-result-wide v9

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;->c()J

    .line 113
    move-result-wide v11

    .line 114
    sub-long/2addr v11, v9

    .line 115
    .line 116
    .line 117
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 118
    move-result-object v7

    .line 119
    goto :goto_3

    .line 120
    :cond_5
    move-object v7, v2

    .line 121
    .line 122
    .line 123
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->f()Ljava/util/List;

    .line 124
    move-result-object v9

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;->b()Ljava/util/List;

    .line 128
    move-result-object v10

    .line 129
    .line 130
    .line 131
    invoke-static {v9, v10}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 132
    move-result-object v9

    .line 133
    .line 134
    .line 135
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->asSequence(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    .line 136
    move-result-object v9

    .line 137
    .line 138
    new-instance v10, Lcom/kubi/sdk/performance/pageopen/i;

    .line 139
    .line 140
    .line 141
    invoke-direct {v10}, Lcom/kubi/sdk/performance/pageopen/i;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-static {v9, v10}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    .line 145
    move-result-object v9

    .line 146
    .line 147
    new-instance v10, Lcom/kubi/sdk/performance/pageopen/j;

    .line 148
    .line 149
    .line 150
    invoke-direct {v10, v5, v6}, Lcom/kubi/sdk/performance/pageopen/j;-><init>(J)V

    .line 151
    .line 152
    .line 153
    invoke-static {v9, v10}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    .line 154
    move-result-object v9

    .line 155
    .line 156
    const/16 v10, 0x14

    .line 157
    .line 158
    .line 159
    invoke-static {v9, v10}, Lkotlin/sequences/SequencesKt;->take(Lkotlin/sequences/Sequence;I)Lkotlin/sequences/Sequence;

    .line 160
    move-result-object v9

    .line 161
    .line 162
    .line 163
    invoke-static {v9}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    .line 164
    move-result-object v18

    .line 165
    .line 166
    iget-object v9, v0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->a:Lcom/kubi/sdk/performance/pageopen/k;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9}, Lcom/kubi/sdk/performance/pageopen/k;->c()Ljava/lang/String;

    .line 170
    move-result-object v9

    .line 171
    .line 172
    iget-object v10, v0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->a:Lcom/kubi/sdk/performance/pageopen/k;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v10}, Lcom/kubi/sdk/performance/pageopen/k;->b()Lcom/kubi/sdk/performance/pageopen/PageOpenMode;

    .line 176
    move-result-object v10

    .line 177
    .line 178
    iget-object v11, v0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->a:Lcom/kubi/sdk/performance/pageopen/k;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v11}, Lcom/kubi/sdk/performance/pageopen/k;->e()Ljava/lang/String;

    .line 182
    move-result-object v11

    .line 183
    move-object v12, v7

    .line 184
    move-object v7, v9

    .line 185
    move-object v9, v10

    .line 186
    move-object v10, v11

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;->e()Lcom/kubi/sdk/performance/pageopen/PageOpenResult;

    .line 190
    move-result-object v11

    .line 191
    .line 192
    if-eqz v4, :cond_6

    .line 193
    .line 194
    .line 195
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 196
    move-result-wide v13

    .line 197
    .line 198
    iget-object v4, v0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->a:Lcom/kubi/sdk/performance/pageopen/k;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4}, Lcom/kubi/sdk/performance/pageopen/k;->f()J

    .line 202
    move-result-wide v15

    .line 203
    sub-long/2addr v13, v15

    .line 204
    .line 205
    .line 206
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 207
    move-result-object v4

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 211
    move-result-wide v13

    .line 212
    .line 213
    const-wide/16 v15, 0x0

    .line 214
    .line 215
    cmp-long v13, v13, v15

    .line 216
    .line 217
    if-ltz v13, :cond_6

    .line 218
    goto :goto_4

    .line 219
    :cond_6
    move-object v4, v2

    .line 220
    .line 221
    .line 222
    :goto_4
    invoke-virtual {v1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;->e()Lcom/kubi/sdk/performance/pageopen/PageOpenResult;

    .line 223
    move-result-object v13

    .line 224
    .line 225
    sget-object v14, Lcom/kubi/sdk/performance/pageopen/PageOpenResult;->SUCCESS:Lcom/kubi/sdk/performance/pageopen/PageOpenResult;

    .line 226
    .line 227
    if-ne v13, v14, :cond_9

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;->d()Lcom/kubi/sdk/performance/pageopen/c;

    .line 231
    move-result-object v13

    .line 232
    .line 233
    if-eqz v13, :cond_8

    .line 234
    .line 235
    .line 236
    invoke-virtual {v13}, Lcom/kubi/sdk/performance/pageopen/c;->a()Ljava/lang/Long;

    .line 237
    move-result-object v13

    .line 238
    .line 239
    if-nez v13, :cond_7

    .line 240
    goto :goto_5

    .line 241
    :cond_7
    move-object v15, v13

    .line 242
    goto :goto_6

    .line 243
    :cond_8
    :goto_5
    move-object v15, v8

    .line 244
    goto :goto_6

    .line 245
    :cond_9
    move-object v15, v2

    .line 246
    .line 247
    .line 248
    :goto_6
    invoke-virtual {v1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;->e()Lcom/kubi/sdk/performance/pageopen/PageOpenResult;

    .line 249
    move-result-object v8

    .line 250
    .line 251
    if-ne v8, v14, :cond_a

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;->d()Lcom/kubi/sdk/performance/pageopen/c;

    .line 255
    move-result-object v2

    .line 256
    .line 257
    if-eqz v2, :cond_b

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2}, Lcom/kubi/sdk/performance/pageopen/c;->b()Ljava/lang/Long;

    .line 261
    move-result-object v2

    .line 262
    .line 263
    if-nez v2, :cond_a

    .line 264
    goto :goto_7

    .line 265
    .line 266
    :cond_a
    move-object/from16 v16, v2

    .line 267
    goto :goto_8

    .line 268
    .line 269
    :cond_b
    :goto_7
    move-object/from16 v16, v12

    .line 270
    .line 271
    .line 272
    :goto_8
    invoke-virtual {v1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;->a()Ljava/lang/Boolean;

    .line 273
    move-result-object v17

    .line 274
    .line 275
    iget-object v1, v0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->a:Lcom/kubi/sdk/performance/pageopen/k;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1}, Lcom/kubi/sdk/performance/pageopen/k;->d()Z

    .line 279
    move-result v19

    .line 280
    move-wide v13, v5

    .line 281
    .line 282
    new-instance v6, Lcom/kubi/sdk/performance/pageopen/d;

    .line 283
    move-object v8, v3

    .line 284
    move-object v12, v4

    .line 285
    .line 286
    .line 287
    invoke-direct/range {v6 .. v19}, Lcom/kubi/sdk/performance/pageopen/d;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenMode;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Z)V

    .line 288
    return-object v6

    .line 289
    :cond_c
    return-object v2
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
.end method

.method public final g(Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Boolean;Lcom/kubi/sdk/performance/pageopen/c;Ljava/util/List;)Z
    .locals 34
    .param p1    # Lcom/kubi/sdk/performance/pageopen/PageOpenResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/sdk/performance/pageopen/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/sdk/performance/pageopen/PageOpenResult;",
            "Ljava/lang/Boolean;",
            "Lcom/kubi/sdk/performance/pageopen/c;",
            "Ljava/util/List<",
            "Lcom/kubi/sdk/performance/pageopen/h;",
            ">;)Z"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v3, p1

    .line 5
    .line 6
    const-string v0, "result"

    .line 7
    .line 8
    .line 9
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    const-string v0, "externalStages"

    .line 12
    .line 13
    move-object/from16 v8, p4

    .line 14
    .line 15
    .line 16
    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    iget-object v9, v1, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->d:Ljava/lang/Object;

    .line 19
    monitor-enter v9

    .line 20
    .line 21
    :try_start_0
    iget-object v10, v1, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->e:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v10}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->j()Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;

    .line 25
    move-result-object v0

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :cond_0
    sget-object v0, Lcom/kubi/sdk/performance/pageopen/PageOpenResult;->SUCCESS:Lcom/kubi/sdk/performance/pageopen/PageOpenResult;

    .line 34
    .line 35
    if-eq v3, v0, :cond_1

    .line 36
    .line 37
    sget-object v5, Lcom/kubi/sdk/performance/pageopen/l;->a:Lcom/kubi/sdk/performance/pageopen/l;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v10}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->c()Ljava/lang/String;

    .line 41
    move-result-object v6

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v6}, Lcom/kubi/sdk/performance/pageopen/l;->c(Ljava/lang/String;)Z

    .line 45
    move-result v5

    .line 46
    .line 47
    if-nez v5, :cond_1

    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    .line 52
    goto/16 :goto_7

    .line 53
    .line 54
    :cond_1
    iget-object v5, v1, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->b:Lcom/kubi/sdk/performance/pageopen/b;

    .line 55
    .line 56
    .line 57
    invoke-interface {v5}, Lcom/kubi/sdk/performance/pageopen/b;->a()J

    .line 58
    move-result-wide v5

    .line 59
    .line 60
    iget-object v7, v1, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->a:Lcom/kubi/sdk/performance/pageopen/k;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7}, Lcom/kubi/sdk/performance/pageopen/k;->f()J

    .line 64
    move-result-wide v11

    .line 65
    .line 66
    sub-long v14, v5, v11

    .line 67
    .line 68
    sget-object v13, Lcom/kubi/sdk/performance/pageopen/l;->a:Lcom/kubi/sdk/performance/pageopen/l;

    .line 69
    .line 70
    const/16 v18, 0x2

    .line 71
    .line 72
    const/16 v19, 0x0

    .line 73
    .line 74
    const-wide/16 v16, 0x0

    .line 75
    .line 76
    .line 77
    invoke-static/range {v13 .. v19}, Lcom/kubi/sdk/performance/pageopen/l;->b(Lcom/kubi/sdk/performance/pageopen/l;JJILjava/lang/Object;)Z

    .line 78
    move-result v7

    .line 79
    .line 80
    if-nez v7, :cond_2

    .line 81
    .line 82
    goto/16 :goto_5

    .line 83
    .line 84
    :cond_2
    if-ne v3, v0, :cond_3

    .line 85
    .line 86
    .line 87
    invoke-virtual {v10}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->h()Ljava/lang/Long;

    .line 88
    move-result-object v7

    .line 89
    .line 90
    if-nez v7, :cond_3

    .line 91
    .line 92
    goto/16 :goto_5

    .line 93
    .line 94
    :cond_3
    if-ne v3, v0, :cond_5

    .line 95
    .line 96
    .line 97
    invoke-virtual {v10}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->h()Ljava/lang/Long;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 104
    move-result-wide v11

    .line 105
    .line 106
    iget-object v0, v1, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->a:Lcom/kubi/sdk/performance/pageopen/k;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/kubi/sdk/performance/pageopen/k;->f()J

    .line 110
    move-result-wide v16

    .line 111
    .line 112
    sub-long v11, v11, v16

    .line 113
    .line 114
    .line 115
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    :goto_0
    move-object/from16 v7, p3

    .line 119
    goto :goto_1

    .line 120
    :cond_4
    move-object v0, v4

    .line 121
    goto :goto_0

    .line 122
    .line 123
    .line 124
    :goto_1
    invoke-virtual {v1, v7, v14, v15, v0}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->m(Lcom/kubi/sdk/performance/pageopen/c;JLjava/lang/Long;)Z

    .line 125
    move-result v0

    .line 126
    .line 127
    if-nez v0, :cond_6

    .line 128
    goto :goto_5

    .line 129
    .line 130
    :cond_5
    move-object/from16 v7, p3

    .line 131
    .line 132
    :cond_6
    if-nez p2, :cond_7

    .line 133
    .line 134
    .line 135
    invoke-virtual {v10}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->e()Ljava/lang/Boolean;

    .line 136
    move-result-object v0

    .line 137
    move-object v15, v0

    .line 138
    goto :goto_2

    .line 139
    .line 140
    :cond_7
    move-object/from16 v15, p2

    .line 141
    .line 142
    .line 143
    :goto_2
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 144
    move-result-object v16

    .line 145
    .line 146
    new-instance v2, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;

    .line 147
    .line 148
    if-nez p2, :cond_8

    .line 149
    .line 150
    .line 151
    invoke-virtual {v10}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->e()Ljava/lang/Boolean;

    .line 152
    move-result-object v0

    .line 153
    move-wide v4, v5

    .line 154
    move-object v6, v0

    .line 155
    goto :goto_3

    .line 156
    :cond_8
    move-wide v4, v5

    .line 157
    .line 158
    move-object/from16 v6, p2

    .line 159
    .line 160
    .line 161
    :goto_3
    invoke-direct/range {v2 .. v8}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;-><init>(Lcom/kubi/sdk/performance/pageopen/PageOpenResult;JLjava/lang/Boolean;Lcom/kubi/sdk/performance/pageopen/c;Ljava/util/List;)V

    .line 162
    .line 163
    const/16 v20, 0x14f

    .line 164
    .line 165
    const/16 v21, 0x0

    .line 166
    const/4 v11, 0x0

    .line 167
    const/4 v12, 0x0

    .line 168
    const/4 v13, 0x0

    .line 169
    const/4 v14, 0x0

    .line 170
    .line 171
    const/16 v17, 0x0

    .line 172
    .line 173
    const/16 v19, 0x0

    .line 174
    .line 175
    move-object/from16 v18, v2

    .line 176
    .line 177
    .line 178
    invoke-static/range {v10 .. v21}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->b(Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/List;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;ZILjava/lang/Object;)Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    .line 179
    move-result-object v0

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v0}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->d(Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;)Lcom/kubi/sdk/performance/pageopen/d;

    .line 183
    move-result-object v4

    .line 184
    .line 185
    if-eqz v4, :cond_9

    .line 186
    .line 187
    const/16 v32, 0xff

    .line 188
    .line 189
    const/16 v33, 0x0

    .line 190
    .line 191
    const/16 v23, 0x0

    .line 192
    .line 193
    const/16 v24, 0x0

    .line 194
    .line 195
    const/16 v25, 0x0

    .line 196
    .line 197
    const/16 v26, 0x0

    .line 198
    .line 199
    const/16 v27, 0x0

    .line 200
    .line 201
    const/16 v28, 0x0

    .line 202
    .line 203
    const/16 v29, 0x0

    .line 204
    .line 205
    const/16 v30, 0x0

    .line 206
    .line 207
    const/16 v31, 0x1

    .line 208
    .line 209
    move-object/from16 v22, v0

    .line 210
    .line 211
    .line 212
    invoke-static/range {v22 .. v33}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->b(Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/List;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;ZILjava/lang/Object;)Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    .line 213
    move-result-object v0

    .line 214
    goto :goto_4

    .line 215
    .line 216
    :cond_9
    move-object/from16 v22, v0

    .line 217
    .line 218
    :goto_4
    iput-object v0, v1, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->e:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 219
    const/4 v2, 0x1

    .line 220
    :goto_5
    monitor-exit v9

    .line 221
    .line 222
    if-eqz v4, :cond_b

    .line 223
    .line 224
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 225
    .line 226
    iget-object v0, v1, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->c:Lcom/kubi/sdk/performance/pageopen/e;

    .line 227
    .line 228
    .line 229
    invoke-interface {v0, v4}, Lcom/kubi/sdk/performance/pageopen/e;->a(Lcom/kubi/sdk/performance/pageopen/d;)V

    .line 230
    .line 231
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 232
    .line 233
    .line 234
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 236
    goto :goto_6

    .line 237
    :catchall_1
    move-exception v0

    .line 238
    .line 239
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 240
    .line 241
    .line 242
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 243
    move-result-object v0

    .line 244
    .line 245
    .line 246
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    move-result-object v0

    .line 248
    .line 249
    .line 250
    :goto_6
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 251
    move-result-object v3

    .line 252
    .line 253
    if-eqz v3, :cond_a

    .line 254
    .line 255
    const-string v3, "PageOpenTrace"

    .line 256
    .line 257
    const-string v4, "PageOpen report dispatch failed"

    .line 258
    .line 259
    .line 260
    invoke-static {v3, v4}, Lro/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    :cond_a
    invoke-static {v0}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 264
    :cond_b
    return v2

    .line 265
    :goto_7
    monitor-exit v9

    .line 266
    throw v0
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
.end method

.method public final i()Lcom/kubi/sdk/performance/pageopen/k;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->a:Lcom/kubi/sdk/performance/pageopen/k;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public final j()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->d:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->e:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->g()Ljava/lang/Long;

    .line 9
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    const/4 v1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    monitor-exit v0

    .line 16
    return v1

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0

    .line 19
    throw v1
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
.end method

.method public final k()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->d:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/kubi/sdk/performance/pageopen/l;->a:Lcom/kubi/sdk/performance/pageopen/l;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->e:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->c()Ljava/lang/String;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lcom/kubi/sdk/performance/pageopen/l;->c(Ljava/lang/String;)Z

    .line 15
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit v0

    .line 17
    return v1

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    monitor-exit v0

    .line 20
    throw v1
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
.end method

.method public final l()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->d:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->e:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->j()Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;

    .line 9
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    const/4 v1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    monitor-exit v0

    .line 16
    return v1

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0

    .line 19
    throw v1
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
.end method

.method public final m(Lcom/kubi/sdk/performance/pageopen/c;JLjava/lang/Long;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/kubi/sdk/performance/pageopen/c;->a()Ljava/lang/Long;

    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    .line 11
    :goto_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/kubi/sdk/performance/pageopen/c;->b()Ljava/lang/Long;

    .line 15
    move-result-object v0

    .line 16
    :cond_1
    const/4 p1, 0x1

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    if-nez v1, :cond_2

    .line 20
    move v3, p1

    .line 21
    goto :goto_1

    .line 22
    :cond_2
    move v3, v2

    .line 23
    .line 24
    :goto_1
    if-nez v0, :cond_3

    .line 25
    move v4, p1

    .line 26
    goto :goto_2

    .line 27
    :cond_3
    move v4, v2

    .line 28
    .line 29
    :goto_2
    if-eq v3, v4, :cond_4

    .line 30
    return v2

    .line 31
    .line 32
    :cond_4
    if-eqz v1, :cond_5

    .line 33
    .line 34
    sget-object v3, Lcom/kubi/sdk/performance/pageopen/l;->a:Lcom/kubi/sdk/performance/pageopen/l;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 38
    move-result-wide v4

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v4, v5, p2, p3}, Lcom/kubi/sdk/performance/pageopen/l;->a(JJ)Z

    .line 42
    move-result v3

    .line 43
    .line 44
    if-nez v3, :cond_5

    .line 45
    return v2

    .line 46
    .line 47
    :cond_5
    if-eqz v0, :cond_6

    .line 48
    .line 49
    sget-object v3, Lcom/kubi/sdk/performance/pageopen/l;->a:Lcom/kubi/sdk/performance/pageopen/l;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 53
    move-result-wide v4

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v4, v5, p2, p3}, Lcom/kubi/sdk/performance/pageopen/l;->a(JJ)Z

    .line 57
    move-result v3

    .line 58
    .line 59
    if-nez v3, :cond_6

    .line 60
    return v2

    .line 61
    .line 62
    :cond_6
    if-eqz v1, :cond_b

    .line 63
    .line 64
    if-nez v0, :cond_7

    .line 65
    goto :goto_4

    .line 66
    .line 67
    :cond_7
    if-eqz p4, :cond_8

    .line 68
    .line 69
    sget-object v3, Lcom/kubi/sdk/performance/pageopen/l;->a:Lcom/kubi/sdk/performance/pageopen/l;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    .line 73
    move-result-wide v4

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, v4, v5, p2, p3}, Lcom/kubi/sdk/performance/pageopen/l;->a(JJ)Z

    .line 77
    move-result v3

    .line 78
    .line 79
    if-nez v3, :cond_8

    .line 80
    return v2

    .line 81
    .line 82
    :cond_8
    if-eqz p4, :cond_9

    .line 83
    .line 84
    .line 85
    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    .line 86
    move-result-wide v3

    .line 87
    goto :goto_3

    .line 88
    .line 89
    :cond_9
    const-wide/16 v3, 0x0

    .line 90
    .line 91
    .line 92
    :goto_3
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 93
    move-result-wide v5

    .line 94
    add-long/2addr v3, v5

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 98
    move-result-wide v0

    .line 99
    add-long/2addr v3, v0

    .line 100
    .line 101
    cmp-long p2, v3, p2

    .line 102
    .line 103
    if-gtz p2, :cond_a

    .line 104
    return p1

    .line 105
    :cond_a
    return v2

    .line 106
    :cond_b
    :goto_4
    return p1
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
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "pageId"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "routeKey"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->d:Ljava/lang/Object;

    .line 13
    monitor-enter v0

    .line 14
    .line 15
    :try_start_0
    iget-object v1, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->e:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->c()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    move-result p1

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->e:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->d()Ljava/lang/String;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    if-eqz p1, :cond_0

    .line 38
    const/4 p1, 0x1

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    :goto_0
    monitor-exit v0

    .line 44
    return p1

    .line 45
    :goto_1
    monitor-exit v0

    .line 46
    throw p1
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
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
.end method

.method public final o()Z
    .locals 14

    .line 1
    .line 2
    iget-object v1, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->d:Ljava/lang/Object;

    .line 3
    monitor-enter v1

    .line 4
    .line 5
    :try_start_0
    iget-object v2, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->e:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v2}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->j()Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;

    .line 9
    move-result-object v0

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->h()Ljava/lang/Long;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->b:Lcom/kubi/sdk/performance/pageopen/b;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Lcom/kubi/sdk/performance/pageopen/b;->a()J

    .line 25
    move-result-wide v4

    .line 26
    .line 27
    iget-object v0, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->a:Lcom/kubi/sdk/performance/pageopen/k;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/kubi/sdk/performance/pageopen/k;->f()J

    .line 31
    move-result-wide v6

    .line 32
    .line 33
    cmp-long v0, v4, v6

    .line 34
    .line 35
    if-gez v0, :cond_1

    .line 36
    goto :goto_0

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    move-result-object v5

    .line 41
    .line 42
    const/16 v12, 0x1fb

    .line 43
    const/4 v13, 0x0

    .line 44
    const/4 v3, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v10, 0x0

    .line 51
    const/4 v11, 0x0

    .line 52
    .line 53
    .line 54
    invoke-static/range {v2 .. v13}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->b(Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/List;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;ZILjava/lang/Object;)Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    iput-object v0, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->e:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    const/4 v3, 0x1

    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    :goto_0
    monitor-exit v1

    .line 63
    return v3

    .line 64
    :goto_1
    monitor-exit v1

    .line 65
    throw v0
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
.end method

.method public final p(Ljava/lang/Boolean;)Z
    .locals 14
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v1, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->d:Ljava/lang/Object;

    .line 3
    monitor-enter v1

    .line 4
    .line 5
    :try_start_0
    iget-object v2, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->e:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v2}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->j()Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->g()Ljava/lang/Long;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->b:Lcom/kubi/sdk/performance/pageopen/b;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Lcom/kubi/sdk/performance/pageopen/b;->a()J

    .line 24
    move-result-wide v3

    .line 25
    .line 26
    .line 27
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    move-result-object v6

    .line 29
    .line 30
    const/16 v12, 0x1e7

    .line 31
    const/4 v13, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v9, 0x0

    .line 37
    const/4 v10, 0x0

    .line 38
    const/4 v11, 0x0

    .line 39
    move-object v7, p1

    .line 40
    .line 41
    .line 42
    invoke-static/range {v2 .. v13}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;->b(Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/List;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$b;ZILjava/lang/Object;)Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    iput-object p1, p0, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->e:Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    const/4 p1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    move-object p1, v0

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 52
    :goto_1
    monitor-exit v1

    .line 53
    return p1

    .line 54
    :goto_2
    monitor-exit v1

    .line 55
    throw p1
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
.end method
