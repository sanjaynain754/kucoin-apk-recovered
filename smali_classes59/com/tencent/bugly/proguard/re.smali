.class public Lcom/tencent/bugly/proguard/re;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/re$c;,
        Lcom/tencent/bugly/proguard/re$b;
    }
.end annotation


# static fields
.field public static final O:Ljava/lang/String; = "ProcessCpuTracker"

.field public static final P:Z = false

.field public static final Q:[I

.field public static final R:I = 0x0

.field public static final S:I = 0x1

.field public static final T:I = 0x2

.field public static final U:I = 0x3

.field public static final V:[I

.field public static final W:I = 0x1

.field public static final X:I = 0x2

.field public static final Y:I = 0x3

.field public static final Z:I = 0x4

.field public static final a0:I = 0x5

.field public static final b0:[I

.field public static final c0:I = 0x0

.field public static final d0:I = 0x1

.field public static final e0:[I

.field public static final f0:[I

.field public static final g0:I = 0xa

.field public static final h0:I = 0x3

.field public static final i0:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/tencent/bugly/proguard/re$c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:I

.field public B:I

.field public C:Z

.field public D:[I

.field public E:[I

.field public final F:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/re$c;",
            ">;"
        }
    .end annotation
.end field

.field public final G:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/re$c;",
            ">;"
        }
    .end annotation
.end field

.field public H:Z

.field public I:Z

.field public J:I

.field public K:Z

.field public L:[Lcom/tencent/bugly/proguard/le;

.field public M:Z

.field public N:Z

.field public final a:[J

.field public final b:[Ljava/lang/String;

.field public final c:[J

.field public final d:[J

.field public final e:[F

.field public final f:Z

.field public final g:J

.field public h:F

.field public i:F

.field public j:F

.field public k:J

.field public l:J

.field public m:J

.field public n:J

.field public o:J

.field public p:J

.field public q:J

.field public r:J

.field public s:J

.field public t:J

.field public u:J

.field public v:J

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x2020

    .line 3
    .line 4
    const/16 v1, 0xf

    .line 5
    .line 6
    new-array v1, v1, [I

    .line 7
    .line 8
    .line 9
    fill-array-data v1, :array_0

    .line 10
    .line 11
    sput-object v1, Lcom/tencent/bugly/proguard/re;->Q:[I

    .line 12
    .line 13
    const/16 v1, 0x17

    .line 14
    .line 15
    new-array v1, v1, [I

    .line 16
    .line 17
    .line 18
    fill-array-data v1, :array_1

    .line 19
    .line 20
    sput-object v1, Lcom/tencent/bugly/proguard/re;->V:[I

    .line 21
    .line 22
    .line 23
    filled-new-array {v0, v0}, [I

    .line 24
    move-result-object v0

    .line 25
    .line 26
    sput-object v0, Lcom/tencent/bugly/proguard/re;->b0:[I

    .line 27
    .line 28
    const/16 v0, 0x8

    .line 29
    .line 30
    new-array v0, v0, [I

    .line 31
    .line 32
    .line 33
    fill-array-data v0, :array_2

    .line 34
    .line 35
    sput-object v0, Lcom/tencent/bugly/proguard/re;->e0:[I

    .line 36
    .line 37
    const/16 v0, 0x4020

    .line 38
    .line 39
    .line 40
    filled-new-array {v0, v0, v0}, [I

    .line 41
    move-result-object v0

    .line 42
    .line 43
    sput-object v0, Lcom/tencent/bugly/proguard/re;->f0:[I

    .line 44
    .line 45
    new-instance v0, Lcom/tencent/bugly/proguard/re$a;

    .line 46
    .line 47
    .line 48
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/re$a;-><init>()V

    .line 49
    .line 50
    sput-object v0, Lcom/tencent/bugly/proguard/re;->i0:Ljava/util/Comparator;

    .line 51
    return-void

    .line 52
    nop

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    :array_0
    .array-data 4
        0x20
        0x220
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x2020
        0x20
        0x2020
        0x20
        0x2020
        0x2020
    .end array-data

    :array_1
    .array-data 4
        0x20
        0x1220
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x2020
        0x20
        0x2020
        0x20
        0x2020
        0x2020
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x2020
    .end array-data

    :array_2
    .array-data 4
        0x120
        0x2020
        0x2020
        0x2020
        0x2020
        0x2020
        0x2020
        0x2020
    .end array-data
.end method

.method public constructor <init>(Z)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x4

    .line 5
    .line 6
    new-array v0, v0, [J

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/bugly/proguard/re;->a:[J

    .line 9
    const/4 v0, 0x6

    .line 10
    .line 11
    new-array v1, v0, [Ljava/lang/String;

    .line 12
    .line 13
    iput-object v1, p0, Lcom/tencent/bugly/proguard/re;->b:[Ljava/lang/String;

    .line 14
    .line 15
    new-array v0, v0, [J

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/proguard/re;->c:[J

    .line 18
    const/4 v0, 0x7

    .line 19
    .line 20
    new-array v0, v0, [J

    .line 21
    .line 22
    iput-object v0, p0, Lcom/tencent/bugly/proguard/re;->d:[J

    .line 23
    const/4 v0, 0x3

    .line 24
    .line 25
    new-array v0, v0, [F

    .line 26
    .line 27
    iput-object v0, p0, Lcom/tencent/bugly/proguard/re;->e:[F

    .line 28
    const/4 v0, 0x0

    .line 29
    .line 30
    iput v0, p0, Lcom/tencent/bugly/proguard/re;->h:F

    .line 31
    .line 32
    iput v0, p0, Lcom/tencent/bugly/proguard/re;->i:F

    .line 33
    .line 34
    iput v0, p0, Lcom/tencent/bugly/proguard/re;->j:F

    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    iput-object v0, p0, Lcom/tencent/bugly/proguard/re;->F:Ljava/util/ArrayList;

    .line 42
    .line 43
    new-instance v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    iput-object v0, p0, Lcom/tencent/bugly/proguard/re;->G:Ljava/util/ArrayList;

    .line 49
    const/4 v0, 0x1

    .line 50
    .line 51
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/re;->I:Z

    .line 52
    .line 53
    .line 54
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 59
    move-result v0

    .line 60
    .line 61
    iput v0, p0, Lcom/tencent/bugly/proguard/re;->J:I

    .line 62
    const/4 v1, 0x0

    .line 63
    .line 64
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/re;->K:Z

    .line 65
    .line 66
    new-array v0, v0, [Lcom/tencent/bugly/proguard/le;

    .line 67
    .line 68
    iput-object v0, p0, Lcom/tencent/bugly/proguard/re;->L:[Lcom/tencent/bugly/proguard/le;

    .line 69
    .line 70
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/re;->f:Z

    .line 71
    .line 72
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/re;->M:Z

    .line 73
    .line 74
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/re;->N:Z

    .line 75
    .line 76
    sget p1, Landroid/system/OsConstants;->_SC_CLK_TCK:I

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, Landroid/system/Os;->sysconf(I)J

    .line 80
    move-result-wide v0

    .line 81
    .line 82
    const-wide/16 v2, 0x3e8

    .line 83
    div-long/2addr v2, v0

    .line 84
    .line 85
    iput-wide v2, p0, Lcom/tencent/bugly/proguard/re;->g:J

    .line 86
    return-void
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
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method

.method public a(I)J
    .locals 5

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "/proc/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "/schedstat"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x4

    .line 95
    new-array v0, v0, [J

    .line 96
    sget-object v1, Lcom/tencent/bugly/proguard/re;->b0:[I

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0, v2}, Lcom/tencent/bugly/common/utils/cpu/Process;->readProcFile(Ljava/lang/String;[I[Ljava/lang/String;[J[F)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 97
    aget-wide v1, v0, p1

    const-wide/32 v3, 0xf4240

    div-long/2addr v1, v3

    return-wide v1

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final a(J)Ljava/lang/String;
    .locals 1

    const v0, 0x7fffffff

    .line 118
    invoke-virtual {p0, p1, p2, v0}, Lcom/tencent/bugly/proguard/re;->a(JI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(JI)Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p0

    .line 119
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string/jumbo v2, "yyyy-MM-dd HH:mm:ss.SSS"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 120
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/re;->a()V

    .line 121
    new-instance v13, Ljava/io/StringWriter;

    invoke-direct {v13}, Ljava/io/StringWriter;-><init>()V

    .line 122
    new-instance v2, Ljava/io/PrintWriter;

    const/4 v14, 0x0

    invoke-direct {v2, v13, v14}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;Z)V

    .line 123
    const-string v3, "CPU usage from "

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 124
    iget-wide v3, v0, Lcom/tencent/bugly/proguard/re;->l:J

    cmp-long v5, p1, v3

    const-string/jumbo v6, "ms to "

    if-lez v5, :cond_0

    sub-long v3, p1, v3

    .line 125
    invoke-virtual {v2, v3, v4}, Ljava/io/PrintWriter;->print(J)V

    .line 126
    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 127
    iget-wide v3, v0, Lcom/tencent/bugly/proguard/re;->k:J

    sub-long v3, p1, v3

    invoke-virtual {v2, v3, v4}, Ljava/io/PrintWriter;->print(J)V

    .line 128
    const-string/jumbo v3, "ms ago"

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sub-long v3, v3, p1

    .line 129
    invoke-virtual {v2, v3, v4}, Ljava/io/PrintWriter;->print(J)V

    .line 130
    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 131
    iget-wide v3, v0, Lcom/tencent/bugly/proguard/re;->k:J

    sub-long v3, v3, p1

    invoke-virtual {v2, v3, v4}, Ljava/io/PrintWriter;->print(J)V

    .line 132
    const-string/jumbo v3, "ms later"

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 133
    :goto_0
    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 134
    new-instance v3, Ljava/util/Date;

    iget-wide v4, v0, Lcom/tencent/bugly/proguard/re;->p:J

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 135
    const-string v3, " to "

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 136
    new-instance v3, Ljava/util/Date;

    iget-wide v4, v0, Lcom/tencent/bugly/proguard/re;->o:J

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 137
    const-string v1, ")"

    invoke-virtual {v2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 138
    iget-wide v3, v0, Lcom/tencent/bugly/proguard/re;->k:J

    iget-wide v5, v0, Lcom/tencent/bugly/proguard/re;->l:J

    sub-long/2addr v3, v5

    .line 139
    iget-wide v5, v0, Lcom/tencent/bugly/proguard/re;->m:J

    iget-wide v7, v0, Lcom/tencent/bugly/proguard/re;->n:J

    sub-long/2addr v5, v7

    const-wide/16 v7, 0x0

    cmp-long v1, v5, v7

    const-wide/16 v9, 0x64

    if-lez v1, :cond_1

    mul-long/2addr v3, v9

    .line 140
    div-long v7, v3, v5

    :cond_1
    cmp-long v1, v7, v9

    if-eqz v1, :cond_2

    .line 141
    const-string v1, " with "

    invoke-virtual {v2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 142
    invoke-virtual {v2, v7, v8}, Ljava/io/PrintWriter;->print(J)V

    .line 143
    const-string v1, "% awake"

    invoke-virtual {v2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 144
    :cond_2
    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 145
    iget v1, v0, Lcom/tencent/bugly/proguard/re;->w:I

    iget v3, v0, Lcom/tencent/bugly/proguard/re;->x:I

    add-int/2addr v1, v3

    iget v3, v0, Lcom/tencent/bugly/proguard/re;->y:I

    add-int/2addr v1, v3

    iget v3, v0, Lcom/tencent/bugly/proguard/re;->z:I

    add-int/2addr v1, v3

    iget v3, v0, Lcom/tencent/bugly/proguard/re;->A:I

    add-int/2addr v1, v3

    iget v3, v0, Lcom/tencent/bugly/proguard/re;->B:I

    add-int v15, v1, v3

    .line 146
    iget-object v1, v0, Lcom/tencent/bugly/proguard/re;->G:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move/from16 v3, p3

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    move v3, v14

    :goto_1
    if-ge v3, v1, :cond_8

    .line 147
    iget-object v4, v0, Lcom/tencent/bugly/proguard/re;->G:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/tencent/bugly/proguard/re$c;

    .line 148
    iget-boolean v5, v4, Lcom/tencent/bugly/proguard/re$c;->y:Z

    if-eqz v5, :cond_3

    const-string v5, " +"

    :goto_2
    move v6, v3

    goto :goto_3

    :cond_3
    iget-boolean v5, v4, Lcom/tencent/bugly/proguard/re$c;->z:Z

    if-eqz v5, :cond_4

    const-string v5, " -"

    goto :goto_2

    :cond_4
    const-string v5, "  "

    goto :goto_2

    :goto_3
    iget v3, v4, Lcom/tencent/bugly/proguard/re$c;->a:I

    iget-object v7, v4, Lcom/tencent/bugly/proguard/re$c;->j:Ljava/lang/String;

    iget-wide v8, v4, Lcom/tencent/bugly/proguard/re$c;->n:J

    long-to-int v8, v8

    move v9, v6

    iget v6, v4, Lcom/tencent/bugly/proguard/re$c;->q:I

    move-object v10, v7

    iget v7, v4, Lcom/tencent/bugly/proguard/re$c;->r:I

    iget v11, v4, Lcom/tencent/bugly/proguard/re$c;->u:I

    iget v12, v4, Lcom/tencent/bugly/proguard/re$c;->v:I

    move/from16 v16, v9

    const/4 v9, 0x0

    move-object/from16 v17, v4

    move-object v4, v10

    const/4 v10, 0x0

    move/from16 v18, v1

    move-object v1, v2

    move-object v2, v5

    move v5, v8

    const/4 v8, 0x0

    move-object/from16 v14, v17

    invoke-virtual/range {v0 .. v12}, Lcom/tencent/bugly/proguard/re;->a(Ljava/io/PrintWriter;Ljava/lang/String;ILjava/lang/String;IIIIIIII)V

    .line 149
    iget-boolean v0, v14, Lcom/tencent/bugly/proguard/re$c;->z:Z

    if-nez v0, :cond_7

    iget-object v0, v14, Lcom/tencent/bugly/proguard/re$c;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    .line 150
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v0, :cond_7

    .line 151
    iget-object v3, v14, Lcom/tencent/bugly/proguard/re$c;->g:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/proguard/re$c;

    .line 152
    iget-boolean v4, v3, Lcom/tencent/bugly/proguard/re$c;->y:Z

    if-eqz v4, :cond_5

    const-string v4, "   +"

    goto :goto_5

    :cond_5
    iget-boolean v4, v3, Lcom/tencent/bugly/proguard/re$c;->z:Z

    if-eqz v4, :cond_6

    const-string v4, "   -"

    goto :goto_5

    :cond_6
    const-string v4, "    "

    :goto_5
    iget v5, v3, Lcom/tencent/bugly/proguard/re$c;->a:I

    move v6, v2

    move-object v2, v4

    iget-object v4, v3, Lcom/tencent/bugly/proguard/re$c;->j:Ljava/lang/String;

    iget-wide v7, v14, Lcom/tencent/bugly/proguard/re$c;->n:J

    long-to-int v7, v7

    move v8, v6

    iget v6, v3, Lcom/tencent/bugly/proguard/re$c;->q:I

    iget v3, v3, Lcom/tencent/bugly/proguard/re$c;->r:I

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move/from16 v19, v10

    const/4 v10, 0x0

    move/from16 v20, v7

    move v7, v3

    move v3, v5

    move/from16 v5, v20

    move/from16 v20, v19

    move/from16 v19, v0

    move-object/from16 v0, p0

    .line 153
    invoke-virtual/range {v0 .. v12}, Lcom/tencent/bugly/proguard/re;->a(Ljava/io/PrintWriter;Ljava/lang/String;ILjava/lang/String;IIIIIIII)V

    add-int/lit8 v2, v20, 0x1

    move/from16 v0, v19

    goto :goto_4

    :cond_7
    move-object/from16 v0, p0

    add-int/lit8 v3, v16, 0x1

    move-object v2, v1

    move/from16 v1, v18

    const/4 v14, 0x0

    goto/16 :goto_1

    :cond_8
    move-object v1, v2

    .line 154
    iget v6, v0, Lcom/tencent/bugly/proguard/re;->w:I

    iget v7, v0, Lcom/tencent/bugly/proguard/re;->x:I

    iget v8, v0, Lcom/tencent/bugly/proguard/re;->y:I

    iget v9, v0, Lcom/tencent/bugly/proguard/re;->z:I

    iget v10, v0, Lcom/tencent/bugly/proguard/re;->A:I

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v2, ""

    const/4 v3, -0x1

    const-string v4, "TOTAL"

    move v5, v15

    invoke-virtual/range {v0 .. v12}, Lcom/tencent/bugly/proguard/re;->a(Ljava/io/PrintWriter;Ljava/lang/String;ILjava/lang/String;IIIIIIII)V

    .line 155
    invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V

    .line 156
    invoke-virtual {v13}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/tencent/bugly/proguard/re$b;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/proguard/re$b;",
            ")",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/re$c;",
            ">;"
        }
    .end annotation

    .line 113
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/re;->F:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 114
    iget-object v1, p0, Lcom/tencent/bugly/proguard/re;->F:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 115
    iget-object v3, p0, Lcom/tencent/bugly/proguard/re;->F:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/proguard/re$c;

    .line 116
    invoke-interface {p1, v3}, Lcom/tencent/bugly/proguard/re$b;->a(Lcom/tencent/bugly/proguard/re$c;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 117
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final a()V
    .locals 8

    .line 98
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/re;->H:Z

    if-nez v0, :cond_4

    .line 99
    iget-object v0, p0, Lcom/tencent/bugly/proguard/re;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 100
    iget-object v0, p0, Lcom/tencent/bugly/proguard/re;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v0, :cond_3

    .line 101
    iget-object v4, p0, Lcom/tencent/bugly/proguard/re;->F:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/tencent/bugly/proguard/re$c;

    .line 102
    iget-boolean v5, v4, Lcom/tencent/bugly/proguard/re$c;->x:Z

    if-eqz v5, :cond_2

    .line 103
    iget-object v5, p0, Lcom/tencent/bugly/proguard/re;->G:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    iget-object v5, v4, Lcom/tencent/bugly/proguard/re$c;->f:Ljava/util/ArrayList;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-le v5, v3, :cond_2

    .line 105
    iget-object v3, v4, Lcom/tencent/bugly/proguard/re$c;->g:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 106
    iget-object v3, v4, Lcom/tencent/bugly/proguard/re$c;->f:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v5, v1

    :goto_1
    if-ge v5, v3, :cond_1

    .line 107
    iget-object v6, v4, Lcom/tencent/bugly/proguard/re$c;->f:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/tencent/bugly/proguard/re$c;

    .line 108
    iget-boolean v7, v6, Lcom/tencent/bugly/proguard/re$c;->x:Z

    if-eqz v7, :cond_0

    .line 109
    iget-object v7, v4, Lcom/tencent/bugly/proguard/re$c;->g:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 110
    :cond_1
    iget-object v3, v4, Lcom/tencent/bugly/proguard/re$c;->g:Ljava/util/ArrayList;

    sget-object v4, Lcom/tencent/bugly/proguard/re;->i0:Ljava/util/Comparator;

    invoke-static {v3, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 111
    :cond_3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/re;->G:Ljava/util/ArrayList;

    sget-object v1, Lcom/tencent/bugly/proguard/re;->i0:Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 112
    iput-boolean v3, p0, Lcom/tencent/bugly/proguard/re;->H:Z

    :cond_4
    return-void
.end method

.method public a(FFF)V
    .locals 0

    .line 2
    return-void
.end method

.method public final a(Lcom/tencent/bugly/proguard/re$c;Ljava/lang/String;)V
    .locals 3

    .line 190
    iget-object v0, p1, Lcom/tencent/bugly/proguard/re$c;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 191
    const-string v1, "app_process"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p1, Lcom/tencent/bugly/proguard/re$c;->j:Ljava/lang/String;

    .line 192
    const-string v2, "<pre-initialized>"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p1, Lcom/tencent/bugly/proguard/re$c;->j:Ljava/lang/String;

    .line 193
    const-string/jumbo v2, "usap32"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p1, Lcom/tencent/bugly/proguard/re$c;->j:Ljava/lang/String;

    .line 194
    const-string/jumbo v2, "usap64"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_0
    const/4 v1, 0x0

    .line 195
    invoke-static {p2, v1}, Lcom/tencent/bugly/proguard/ke;->a(Ljava/lang/String;B)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 196
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_2

    .line 197
    const-string v0, "/"

    invoke-virtual {p2, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    .line 198
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_1

    add-int/2addr v0, v2

    .line 199
    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, p2

    :cond_2
    :goto_0
    if-nez v0, :cond_3

    .line 200
    iget-object v0, p1, Lcom/tencent/bugly/proguard/re$c;->i:Ljava/lang/String;

    .line 201
    :cond_3
    iget-object p2, p1, Lcom/tencent/bugly/proguard/re$c;->j:Ljava/lang/String;

    if-eqz p2, :cond_5

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_1

    :cond_4
    return-void

    .line 202
    :cond_5
    :goto_1
    iput-object v0, p1, Lcom/tencent/bugly/proguard/re$c;->j:Ljava/lang/String;

    .line 203
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/re;->a(Ljava/lang/String;)I

    move-result p2

    iput p2, p1, Lcom/tencent/bugly/proguard/re$c;->k:I

    return-void
.end method

.method public final a(Ljava/io/PrintWriter;JJ)V
    .locals 3

    const-wide/16 v0, 0x3e8

    mul-long/2addr p2, v0

    .line 157
    div-long/2addr p2, p4

    const-wide/16 p4, 0xa

    .line 158
    div-long v0, p2, p4

    .line 159
    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->print(J)V

    cmp-long v2, v0, p4

    if-gez v2, :cond_0

    mul-long/2addr v0, p4

    sub-long/2addr p2, v0

    const-wide/16 p4, 0x0

    cmp-long p4, p2, p4

    if-eqz p4, :cond_0

    const/16 p4, 0x2e

    .line 160
    invoke-virtual {p1, p4}, Ljava/io/PrintWriter;->print(C)V

    .line 161
    invoke-virtual {p1, p2, p3}, Ljava/io/PrintWriter;->print(J)V

    :cond_0
    return-void
.end method

.method public final a(Ljava/io/PrintWriter;Ljava/lang/String;ILjava/lang/String;IIIIIIII)V
    .locals 14

    move/from16 v6, p3

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    .line 162
    invoke-virtual/range {p1 .. p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    if-nez p5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move/from16 v0, p5

    :goto_0
    add-int v1, v7, v8

    add-int/2addr v1, v9

    add-int/2addr v1, v10

    add-int/2addr v1, v11

    int-to-long v2, v1

    int-to-long v4, v0

    move-object v0, p0

    move-object v1, p1

    .line 163
    invoke-virtual/range {v0 .. v5}, Lcom/tencent/bugly/proguard/re;->a(Ljava/io/PrintWriter;JJ)V

    .line 164
    const-string v0, "% "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    if-ltz v6, :cond_1

    .line 165
    invoke-virtual {p1, v6}, Ljava/io/PrintWriter;->print(I)V

    .line 166
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_1
    move-object/from16 v0, p4

    .line 167
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 168
    const-string v0, ": "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    int-to-long v2, v7

    move-object v0, p0

    move-object v1, p1

    .line 169
    invoke-virtual/range {v0 .. v5}, Lcom/tencent/bugly/proguard/re;->a(Ljava/io/PrintWriter;JJ)V

    .line 170
    const-string v0, "% user + "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    int-to-long v2, v8

    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-wide/from16 p4, v2

    move-wide/from16 p6, v4

    .line 171
    invoke-virtual/range {p2 .. p7}, Lcom/tencent/bugly/proguard/re;->a(Ljava/io/PrintWriter;JJ)V

    .line 172
    const-string v0, "% kernel"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " + "

    if-lez v9, :cond_2

    .line 173
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    int-to-long v2, v9

    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-wide/from16 p4, v2

    move-wide/from16 p6, v4

    .line 174
    invoke-virtual/range {p2 .. p7}, Lcom/tencent/bugly/proguard/re;->a(Ljava/io/PrintWriter;JJ)V

    .line 175
    const-string v2, "% iowait"

    invoke-virtual {p1, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_2
    if-lez v10, :cond_3

    .line 176
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    int-to-long v2, v10

    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-wide/from16 p4, v2

    move-wide/from16 p6, v4

    .line 177
    invoke-virtual/range {p2 .. p7}, Lcom/tencent/bugly/proguard/re;->a(Ljava/io/PrintWriter;JJ)V

    .line 178
    const-string v2, "% irq"

    invoke-virtual {p1, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_3
    if-lez v11, :cond_4

    .line 179
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    int-to-long v2, v11

    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-wide/from16 p4, v2

    move-wide/from16 p6, v4

    .line 180
    invoke-virtual/range {p2 .. p7}, Lcom/tencent/bugly/proguard/re;->a(Ljava/io/PrintWriter;JJ)V

    .line 181
    const-string v0, "% softirq"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_4
    if-gtz v12, :cond_5

    if-lez v13, :cond_7

    .line 182
    :cond_5
    const-string v0, " / faults:"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " "

    if-lez v12, :cond_6

    .line 183
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 184
    invoke-virtual {p1, v12}, Ljava/io/PrintWriter;->print(I)V

    .line 185
    const-string v2, " minor"

    invoke-virtual {p1, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_6
    if-lez v13, :cond_7

    .line 186
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 187
    invoke-virtual {p1, v13}, Ljava/io/PrintWriter;->print(I)V

    .line 188
    const-string v0, " major"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 189
    :cond_7
    invoke-virtual {p1}, Ljava/io/PrintWriter;->println()V

    return-void
.end method

.method public final a(Ljava/lang/String;IZ[ILjava/util/ArrayList;)[I
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IZ[I",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/re$c;",
            ">;)[I"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p5

    .line 3
    iget-boolean v1, v0, Lcom/tencent/bugly/proguard/re;->f:Z

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    .line 4
    invoke-static {v1, v2}, Lcom/tencent/bugly/common/utils/cpu/Process;->getPids(Ljava/lang/String;[I)[I

    move-result-object v1

    :goto_0
    move-object v10, v1

    goto :goto_1

    .line 5
    :cond_0
    new-array v1, v8, [I

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    aput v2, v1, v9

    goto :goto_0

    :goto_1
    if-nez v10, :cond_1

    move v11, v9

    goto :goto_2

    .line 6
    :cond_1
    array-length v1, v10

    move v11, v1

    .line 7
    :goto_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v12, v1

    move v1, v9

    move v13, v1

    :goto_3
    const-string v2, "ProcessCpuTracker"

    move-object v3, v2

    if-ge v13, v11, :cond_2

    .line 8
    aget v2, v10, v13

    if-gez v2, :cond_3

    :cond_2
    move v2, v8

    move-object/from16 v27, v10

    move/from16 v19, v12

    goto/16 :goto_e

    :cond_3
    const/4 v4, 0x0

    if-ge v1, v12, :cond_4

    .line 9
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/proguard/re$c;

    move-object v14, v5

    goto :goto_4

    :cond_4
    move-object v14, v4

    :goto_4
    const/4 v15, 0x2

    const/16 p1, 0x3

    if-eqz v14, :cond_a

    .line 10
    iget v5, v14, Lcom/tencent/bugly/proguard/re$c;->a:I

    if-ne v5, v2, :cond_a

    .line 11
    iput-boolean v9, v14, Lcom/tencent/bugly/proguard/re$c;->y:Z

    .line 12
    iput-boolean v9, v14, Lcom/tencent/bugly/proguard/re$c;->x:Z

    add-int/lit8 v16, v1, 0x1

    .line 13
    iget-boolean v1, v14, Lcom/tencent/bugly/proguard/re$c;->h:Z

    if-eqz v1, :cond_5

    move/from16 v17, v8

    move/from16 v18, v9

    .line 14
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    .line 15
    iget-object v1, v0, Lcom/tencent/bugly/proguard/re;->a:[J

    .line 16
    iget-object v3, v14, Lcom/tencent/bugly/proguard/re$c;->c:Ljava/lang/String;

    sget-object v5, Lcom/tencent/bugly/proguard/re;->Q:[I

    invoke-static {v3, v5, v4, v1, v4}, Lcom/tencent/bugly/common/utils/cpu/Process;->readProcFile(Ljava/lang/String;[I[Ljava/lang/String;[J[F)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    :goto_5
    move-object/from16 v27, v10

    move/from16 v28, v11

    move/from16 v19, v12

    move/from16 v20, v13

    goto/16 :goto_7

    .line 17
    :cond_6
    aget-wide v3, v1, v18

    move-wide/from16 v19, v3

    .line 18
    aget-wide v3, v1, v17

    .line 19
    aget-wide v21, v1, v15

    move-object v5, v1

    move/from16 p4, v2

    iget-wide v1, v0, Lcom/tencent/bugly/proguard/re;->g:J

    move-wide/from16 v23, v3

    mul-long v3, v21, v1

    .line 20
    aget-wide v21, v5, p1

    mul-long v21, v21, v1

    .line 21
    iget-wide v1, v14, Lcom/tencent/bugly/proguard/re$c;->o:J

    cmp-long v1, v3, v1

    if-nez v1, :cond_7

    iget-wide v1, v14, Lcom/tencent/bugly/proguard/re$c;->p:J

    cmp-long v1, v21, v1

    if-nez v1, :cond_7

    move/from16 v1, v18

    .line 22
    iput v1, v14, Lcom/tencent/bugly/proguard/re$c;->q:I

    .line 23
    iput v1, v14, Lcom/tencent/bugly/proguard/re$c;->r:I

    .line 24
    iput v1, v14, Lcom/tencent/bugly/proguard/re$c;->u:I

    .line 25
    iput v1, v14, Lcom/tencent/bugly/proguard/re$c;->v:I

    .line 26
    iget-boolean v2, v14, Lcom/tencent/bugly/proguard/re$c;->w:Z

    if-eqz v2, :cond_5

    .line 27
    iput-boolean v1, v14, Lcom/tencent/bugly/proguard/re$c;->w:Z

    goto :goto_5

    .line 28
    :cond_7
    iget-boolean v1, v14, Lcom/tencent/bugly/proguard/re$c;->w:Z

    if-nez v1, :cond_8

    move/from16 v1, v17

    .line 29
    iput-boolean v1, v14, Lcom/tencent/bugly/proguard/re$c;->w:Z

    :cond_8
    if-gez p2, :cond_9

    .line 30
    iget-object v1, v14, Lcom/tencent/bugly/proguard/re$c;->d:Ljava/lang/String;

    invoke-virtual {v0, v14, v1}, Lcom/tencent/bugly/proguard/re;->a(Lcom/tencent/bugly/proguard/re$c;Ljava/lang/String;)V

    .line 31
    iget-object v5, v14, Lcom/tencent/bugly/proguard/re$c;->f:Ljava/util/ArrayList;

    if-eqz v5, :cond_9

    .line 32
    iget-object v1, v14, Lcom/tencent/bugly/proguard/re$c;->e:Ljava/lang/String;

    move-wide v2, v3

    iget-object v4, v0, Lcom/tencent/bugly/proguard/re;->E:[I

    move-wide/from16 v25, v2

    const/4 v3, 0x0

    move/from16 v2, p4

    move-object/from16 v27, v10

    move/from16 v28, v11

    move-wide/from16 v10, v19

    move-wide/from16 v6, v25

    move/from16 v19, v12

    move/from16 v20, v13

    move-wide/from16 v12, v21

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/bugly/proguard/re;->a(Ljava/lang/String;IZ[ILjava/util/ArrayList;)[I

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/proguard/re;->E:[I

    goto :goto_6

    :cond_9
    move-wide v6, v3

    move-object/from16 v27, v10

    move/from16 v28, v11

    move-wide/from16 v10, v19

    move/from16 v19, v12

    move/from16 v20, v13

    move-wide/from16 v12, v21

    .line 33
    :goto_6
    iget-wide v1, v14, Lcom/tencent/bugly/proguard/re$c;->m:J

    sub-long v1, v8, v1

    iput-wide v1, v14, Lcom/tencent/bugly/proguard/re$c;->n:J

    .line 34
    iput-wide v8, v14, Lcom/tencent/bugly/proguard/re$c;->m:J

    .line 35
    iget-wide v1, v14, Lcom/tencent/bugly/proguard/re$c;->o:J

    sub-long v3, v6, v1

    long-to-int v1, v3

    iput v1, v14, Lcom/tencent/bugly/proguard/re$c;->q:I

    .line 36
    iget-wide v1, v14, Lcom/tencent/bugly/proguard/re$c;->p:J

    sub-long v1, v12, v1

    long-to-int v1, v1

    iput v1, v14, Lcom/tencent/bugly/proguard/re$c;->r:I

    .line 37
    iput-wide v6, v14, Lcom/tencent/bugly/proguard/re$c;->o:J

    .line 38
    iput-wide v12, v14, Lcom/tencent/bugly/proguard/re$c;->p:J

    .line 39
    iget-wide v1, v14, Lcom/tencent/bugly/proguard/re$c;->s:J

    sub-long v3, v10, v1

    long-to-int v1, v3

    iput v1, v14, Lcom/tencent/bugly/proguard/re$c;->u:I

    .line 40
    iget-wide v1, v14, Lcom/tencent/bugly/proguard/re$c;->t:J

    sub-long v3, v23, v1

    long-to-int v1, v3

    iput v1, v14, Lcom/tencent/bugly/proguard/re$c;->v:I

    .line 41
    iput-wide v10, v14, Lcom/tencent/bugly/proguard/re$c;->s:J

    move-wide/from16 v1, v23

    .line 42
    iput-wide v1, v14, Lcom/tencent/bugly/proguard/re$c;->t:J

    const/4 v1, 0x1

    .line 43
    iput-boolean v1, v14, Lcom/tencent/bugly/proguard/re$c;->x:Z

    :goto_7
    move/from16 v8, p2

    move-object/from16 v7, p5

    move/from16 v1, v16

    move/from16 v12, v19

    move/from16 v13, v20

    :goto_8
    const/4 v2, 0x1

    goto/16 :goto_d

    :cond_a
    move-object/from16 v27, v10

    move/from16 v28, v11

    move/from16 v19, v12

    move/from16 v20, v13

    if-eqz v14, :cond_b

    .line 44
    iget v5, v14, Lcom/tencent/bugly/proguard/re$c;->a:I

    if-le v5, v2, :cond_c

    :cond_b
    move-object/from16 v7, p5

    goto :goto_9

    :cond_c
    const/4 v5, 0x0

    .line 45
    iput v5, v14, Lcom/tencent/bugly/proguard/re$c;->q:I

    .line 46
    iput v5, v14, Lcom/tencent/bugly/proguard/re$c;->r:I

    .line 47
    iput v5, v14, Lcom/tencent/bugly/proguard/re$c;->u:I

    .line 48
    iput v5, v14, Lcom/tencent/bugly/proguard/re$c;->v:I

    const/4 v2, 0x1

    .line 49
    iput-boolean v2, v14, Lcom/tencent/bugly/proguard/re$c;->z:Z

    .line 50
    iput-boolean v2, v14, Lcom/tencent/bugly/proguard/re$c;->x:Z

    move-object/from16 v7, p5

    .line 51
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v12, v19, -0x1

    add-int/lit8 v13, v20, -0x1

    move/from16 v8, p2

    goto :goto_8

    .line 52
    :goto_9
    new-instance v6, Lcom/tencent/bugly/proguard/re$c;

    iget-boolean v5, v0, Lcom/tencent/bugly/proguard/re;->f:Z

    move/from16 v8, p2

    invoke-direct {v6, v2, v8, v5}, Lcom/tencent/bugly/proguard/re$c;-><init>(IIZ)V

    .line 53
    invoke-virtual {v7, v1, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v9, v1, 0x1

    add-int/lit8 v12, v19, 0x1

    .line 54
    iget-object v1, v0, Lcom/tencent/bugly/proguard/re;->b:[Ljava/lang/String;

    .line 55
    iget-object v5, v0, Lcom/tencent/bugly/proguard/re;->c:[J

    .line 56
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v10

    iput-wide v10, v6, Lcom/tencent/bugly/proguard/re$c;->m:J

    .line 57
    iget-object v10, v6, Lcom/tencent/bugly/proguard/re$c;->c:Ljava/lang/String;

    .line 58
    sget-object v11, Lcom/tencent/bugly/proguard/re;->V:[I

    invoke-static {v10, v11, v1, v5, v4}, Lcom/tencent/bugly/common/utils/cpu/Process;->readProcFile(Ljava/lang/String;[I[Ljava/lang/String;[J[F)Z

    move-result v4

    if-eqz v4, :cond_d

    const/4 v3, 0x5

    .line 59
    aget-wide v3, v5, v3

    iput-wide v3, v6, Lcom/tencent/bugly/proguard/re$c;->l:J

    const/4 v3, 0x1

    .line 60
    iput-boolean v3, v6, Lcom/tencent/bugly/proguard/re$c;->h:Z

    const/16 v18, 0x0

    .line 61
    aget-object v1, v1, v18

    iput-object v1, v6, Lcom/tencent/bugly/proguard/re$c;->i:Ljava/lang/String;

    .line 62
    aget-wide v10, v5, v3

    iput-wide v10, v6, Lcom/tencent/bugly/proguard/re$c;->s:J

    .line 63
    aget-wide v3, v5, v15

    iput-wide v3, v6, Lcom/tencent/bugly/proguard/re$c;->t:J

    .line 64
    aget-wide v3, v5, p1

    iget-wide v10, v0, Lcom/tencent/bugly/proguard/re;->g:J

    mul-long/2addr v3, v10

    iput-wide v3, v6, Lcom/tencent/bugly/proguard/re$c;->o:J

    const/4 v1, 0x4

    .line 65
    aget-wide v3, v5, v1

    mul-long/2addr v3, v10

    iput-wide v3, v6, Lcom/tencent/bugly/proguard/re$c;->p:J

    goto :goto_a

    .line 66
    :cond_d
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 67
    const-string v4, "Skipping unknown process pid "

    invoke-static {v4, v2}, Lcom/tencent/bugly/proguard/vi;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 68
    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 69
    const-string v1, "<unknown>"

    iput-object v1, v6, Lcom/tencent/bugly/proguard/re$c;->i:Ljava/lang/String;

    const-wide/16 v3, 0x0

    .line 70
    iput-wide v3, v6, Lcom/tencent/bugly/proguard/re$c;->p:J

    iput-wide v3, v6, Lcom/tencent/bugly/proguard/re$c;->o:J

    .line 71
    iput-wide v3, v6, Lcom/tencent/bugly/proguard/re$c;->t:J

    iput-wide v3, v6, Lcom/tencent/bugly/proguard/re$c;->s:J

    :goto_a
    if-gez v8, :cond_f

    .line 72
    iget-object v1, v6, Lcom/tencent/bugly/proguard/re$c;->d:Ljava/lang/String;

    invoke-virtual {v0, v6, v1}, Lcom/tencent/bugly/proguard/re;->a(Lcom/tencent/bugly/proguard/re$c;Ljava/lang/String;)V

    .line 73
    iget-object v5, v6, Lcom/tencent/bugly/proguard/re$c;->f:Ljava/util/ArrayList;

    if-eqz v5, :cond_e

    .line 74
    iget-object v1, v6, Lcom/tencent/bugly/proguard/re$c;->e:Ljava/lang/String;

    iget-object v4, v0, Lcom/tencent/bugly/proguard/re;->E:[I

    const/4 v3, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/bugly/proguard/re;->a(Ljava/lang/String;IZ[ILjava/util/ArrayList;)[I

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/proguard/re;->E:[I

    :cond_e
    :goto_b
    const/4 v1, 0x0

    goto :goto_c

    .line 75
    :cond_f
    iget-boolean v1, v6, Lcom/tencent/bugly/proguard/re$c;->h:Z

    if-eqz v1, :cond_e

    .line 76
    iget-object v1, v6, Lcom/tencent/bugly/proguard/re$c;->i:Ljava/lang/String;

    iput-object v1, v6, Lcom/tencent/bugly/proguard/re$c;->j:Ljava/lang/String;

    .line 77
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/re;->a(Ljava/lang/String;)I

    move-result v1

    iput v1, v6, Lcom/tencent/bugly/proguard/re$c;->k:I

    goto :goto_b

    .line 78
    :goto_c
    iput v1, v6, Lcom/tencent/bugly/proguard/re$c;->q:I

    .line 79
    iput v1, v6, Lcom/tencent/bugly/proguard/re$c;->r:I

    .line 80
    iput v1, v6, Lcom/tencent/bugly/proguard/re$c;->u:I

    .line 81
    iput v1, v6, Lcom/tencent/bugly/proguard/re$c;->v:I

    const/4 v2, 0x1

    .line 82
    iput-boolean v2, v6, Lcom/tencent/bugly/proguard/re$c;->y:Z

    if-nez p3, :cond_10

    .line 83
    iget-boolean v1, v6, Lcom/tencent/bugly/proguard/re$c;->h:Z

    if-eqz v1, :cond_10

    .line 84
    iput-boolean v2, v6, Lcom/tencent/bugly/proguard/re$c;->x:Z

    :cond_10
    move v1, v9

    move/from16 v13, v20

    :goto_d
    add-int/2addr v13, v2

    move v8, v2

    move-object/from16 v10, v27

    move/from16 v11, v28

    const/4 v9, 0x0

    goto/16 :goto_3

    :goto_e
    move/from16 v12, v19

    :goto_f
    if-ge v1, v12, :cond_11

    .line 85
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/tencent/bugly/proguard/re$c;

    const/4 v5, 0x0

    .line 86
    iput v5, v4, Lcom/tencent/bugly/proguard/re$c;->q:I

    .line 87
    iput v5, v4, Lcom/tencent/bugly/proguard/re$c;->r:I

    .line 88
    iput v5, v4, Lcom/tencent/bugly/proguard/re$c;->u:I

    .line 89
    iput v5, v4, Lcom/tencent/bugly/proguard/re$c;->v:I

    .line 90
    iput-boolean v2, v4, Lcom/tencent/bugly/proguard/re$c;->z:Z

    .line 91
    iput-boolean v2, v4, Lcom/tencent/bugly/proguard/re$c;->x:Z

    .line 92
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v12, v12, -0x1

    .line 93
    sget-object v6, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Removed pid "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v9, v4, Lcom/tencent/bugly/proguard/re$c;->a:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ": "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V

    goto :goto_f

    :cond_11
    return-object v27
.end method

.method public final b()I
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/re;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public b(I)J
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "/proc/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "/stat"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [J

    .line 3
    sget-object v1, Lcom/tencent/bugly/proguard/re;->Q:[I

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0, v2}, Lcom/tencent/bugly/common/utils/cpu/Process;->readProcFile(Ljava/lang/String;[I[Ljava/lang/String;[J[F)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    .line 4
    aget-wide v1, v0, p1

    const/4 p1, 0x3

    aget-wide v3, v0, p1

    add-long/2addr v1, v3

    .line 5
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/re;->g:J

    mul-long/2addr v1, v3

    return-wide v1

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final c()I
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/re;->a()V

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/re;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final c(I)Lcom/tencent/bugly/proguard/re$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/re;->F:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/proguard/re$c;

    return-object p1
.end method

.method public final d()J
    .locals 7

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    move v3, v2

    .line 1
    :goto_0
    iget v4, p0, Lcom/tencent/bugly/proguard/re;->J:I

    if-ge v3, v4, :cond_2

    move v4, v2

    :goto_1
    const/4 v5, 0x3

    if-ge v4, v5, :cond_1

    .line 2
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "/sys/devices/system/cpu/cpu"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "/cpuidle/state"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "/time"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 3
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 5
    invoke-static {v5}, Lcom/tencent/bugly/common/utils/FileUtil;->readOutputFromFile(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    add-long/2addr v0, v5

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const-wide/16 v2, 0x3e8

    .line 6
    div-long/2addr v0, v2

    return-wide v0
.end method

.method public final d(I)Lcom/tencent/bugly/proguard/re$c;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/re;->G:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/proguard/re$c;

    return-object p1
.end method

.method public final e()J
    .locals 9

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/re;->K:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/re;->p()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    .line 11
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 12
    .line 13
    const-string v2, "ProcessCpuTracker"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    :goto_0
    const/4 v0, 0x1

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/re;->K:Z

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    .line 22
    const-wide/16 v1, 0x0

    .line 23
    move v3, v0

    .line 24
    .line 25
    :goto_1
    iget v4, p0, Lcom/tencent/bugly/proguard/re;->J:I

    .line 26
    .line 27
    if-ge v3, v4, :cond_2

    .line 28
    .line 29
    const-string v4, "/sys/devices/system/cpu/cpu"

    .line 30
    .line 31
    .line 32
    invoke-static {v4, v3}, Lcom/tencent/bugly/proguard/vi;->a(Ljava/lang/String;I)Ljava/lang/String;

    .line 33
    move-result-object v4

    .line 34
    .line 35
    new-instance v5, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v4, "/cpufreq/stats"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    move-result-object v4

    .line 51
    .line 52
    new-array v5, v0, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-static {v4, v5}, Lcom/datavisorobfus/c1;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 56
    move-result-object v4

    .line 57
    .line 58
    .line 59
    const-string/jumbo v5, "time_in_state"

    .line 60
    .line 61
    .line 62
    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/fj;->a(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/Path;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    iget-object v5, p0, Lcom/tencent/bugly/proguard/re;->L:[Lcom/tencent/bugly/proguard/le;

    .line 66
    .line 67
    aget-object v5, v5, v3

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, v4}, Lcom/tencent/bugly/proguard/le;->a(Ljava/nio/file/Path;)[J

    .line 71
    move-result-object v4

    .line 72
    array-length v5, v4

    .line 73
    move v6, v0

    .line 74
    .line 75
    :goto_2
    if-ge v6, v5, :cond_1

    .line 76
    .line 77
    aget-wide v7, v4, v6

    .line 78
    add-long/2addr v1, v7

    .line 79
    .line 80
    add-int/lit8 v6, v6, 0x1

    .line 81
    goto :goto_2

    .line 82
    .line 83
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    return-wide v1
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

.method public final f()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/re;->B:I

    .line 3
    return v0
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
.end method

.method public final g()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/re;->y:I

    .line 3
    return v0
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
.end method

.method public final h()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/re;->z:I

    .line 3
    return v0
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
.end method

.method public final i()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/re;->A:I

    .line 3
    return v0
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
.end method

.method public final j()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/re;->x:I

    .line 3
    return v0
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
.end method

.method public final k()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/re;->w:I

    .line 3
    return v0
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
.end method

.method public final l()Lcom/tencent/bugly/proguard/re$c;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/re;->a()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/re;->G:Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/tencent/bugly/proguard/re;->G:Ljava/util/ArrayList;

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Lcom/tencent/bugly/proguard/re$c;

    .line 21
    return-object v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return-object v0
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

.method public final m()F
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/re;->w:I

    .line 3
    .line 4
    iget v1, p0, Lcom/tencent/bugly/proguard/re;->x:I

    .line 5
    add-int/2addr v0, v1

    .line 6
    .line 7
    iget v1, p0, Lcom/tencent/bugly/proguard/re;->z:I

    .line 8
    add-int/2addr v0, v1

    .line 9
    .line 10
    iget v1, p0, Lcom/tencent/bugly/proguard/re;->B:I

    .line 11
    add-int/2addr v1, v0

    .line 12
    .line 13
    if-gtz v1, :cond_0

    .line 14
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_0
    int-to-float v0, v0

    .line 17
    .line 18
    const/high16 v2, 0x42c80000    # 100.0f

    .line 19
    mul-float/2addr v0, v2

    .line 20
    int-to-float v1, v1

    .line 21
    div-float/2addr v0, v1

    .line 22
    return v0
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

.method public final n()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/re;->C:Z

    .line 3
    return v0
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
.end method

.method public o()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/re;->I:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/re;->r()V

    .line 7
    return-void
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

.method public final p()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    :goto_0
    iget v2, p0, Lcom/tencent/bugly/proguard/re;->J:I

    .line 5
    .line 6
    if-ge v1, v2, :cond_1

    .line 7
    .line 8
    const-string v2, "/sys/devices/system/cpu/cpu"

    .line 9
    .line 10
    .line 11
    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/vi;->a(Ljava/lang/String;I)Ljava/lang/String;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    new-instance v3, Ljava/io/File;

    .line 15
    .line 16
    .line 17
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 21
    move-result v3

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    new-instance v3, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v2, "/cpufreq/stats"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    new-array v3, v0, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3}, Lcom/datavisorobfus/c1;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    const-string/jumbo v3, "time_in_state"

    .line 50
    .line 51
    .line 52
    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/fj;->a(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/Path;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    new-instance v3, Lcom/tencent/bugly/proguard/le;

    .line 56
    .line 57
    .line 58
    invoke-direct {v3, v2}, Lcom/tencent/bugly/proguard/le;-><init>(Ljava/nio/file/Path;)V

    .line 59
    .line 60
    iget-object v2, p0, Lcom/tencent/bugly/proguard/re;->L:[Lcom/tencent/bugly/proguard/le;

    .line 61
    .line 62
    aput-object v3, v2, v1

    .line 63
    .line 64
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    return-void
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

.method public final q()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/io/StringWriter;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 6
    .line 7
    new-instance v1, Ljava/io/PrintWriter;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 11
    .line 12
    const-string v2, "Load: "

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 16
    .line 17
    iget v2, p0, Lcom/tencent/bugly/proguard/re;->h:F

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->print(F)V

    .line 21
    .line 22
    const-string v2, " / "

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 26
    .line 27
    iget v3, p0, Lcom/tencent/bugly/proguard/re;->i:F

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v3}, Ljava/io/PrintWriter;->print(F)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 34
    .line 35
    iget v2, p0, Lcom/tencent/bugly/proguard/re;->j:F

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->println(F)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 45
    move-result-object v0

    .line 46
    return-object v0
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

.method public r()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    move-result-wide v2

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    move-result-wide v4

    .line 13
    .line 14
    iget-boolean v6, p0, Lcom/tencent/bugly/proguard/re;->M:Z

    .line 15
    .line 16
    if-eqz v6, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/re;->s()V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/re;->u()V

    .line 23
    .line 24
    iget-boolean v6, p0, Lcom/tencent/bugly/proguard/re;->N:Z

    .line 25
    .line 26
    if-eqz v6, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/re;->t()V

    .line 30
    .line 31
    :cond_1
    iget-wide v6, p0, Lcom/tencent/bugly/proguard/re;->k:J

    .line 32
    .line 33
    iput-wide v6, p0, Lcom/tencent/bugly/proguard/re;->l:J

    .line 34
    .line 35
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/re;->k:J

    .line 36
    .line 37
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/re;->m:J

    .line 38
    .line 39
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/re;->n:J

    .line 40
    .line 41
    iput-wide v2, p0, Lcom/tencent/bugly/proguard/re;->m:J

    .line 42
    .line 43
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/re;->o:J

    .line 44
    .line 45
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/re;->p:J

    .line 46
    .line 47
    iput-wide v4, p0, Lcom/tencent/bugly/proguard/re;->o:J

    .line 48
    const/4 v0, 0x0

    .line 49
    .line 50
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/re;->H:Z

    .line 51
    .line 52
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/re;->I:Z

    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public s()V
    .locals 28

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/tencent/bugly/proguard/re;->d:[J

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverO()Z

    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x4

    .line 11
    const/4 v5, 0x5

    .line 12
    const/4 v6, 0x6

    .line 13
    const/4 v7, 0x3

    .line 14
    const/4 v8, 0x1

    .line 15
    const/4 v9, 0x0

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    sget-object v2, Lcom/tencent/bugly/proguard/re;->e0:[I

    .line 20
    .line 21
    const-string v10, "/proc/stat"

    .line 22
    const/4 v11, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static {v10, v2, v11, v1, v11}, Lcom/tencent/bugly/common/utils/cpu/Process;->readProcFile(Ljava/lang/String;[I[Ljava/lang/String;[J[F)Z

    .line 26
    move-result v2

    .line 27
    goto :goto_0

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/re;->e()J

    .line 31
    move-result-wide v10

    .line 32
    .line 33
    aput-wide v10, v1, v9

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/re;->d()J

    .line 37
    move-result-wide v10

    .line 38
    .line 39
    aput-wide v10, v1, v7

    .line 40
    .line 41
    const-wide/16 v10, 0x0

    .line 42
    .line 43
    aput-wide v10, v1, v6

    .line 44
    .line 45
    aput-wide v10, v1, v5

    .line 46
    .line 47
    aput-wide v10, v1, v4

    .line 48
    .line 49
    aput-wide v10, v1, v3

    .line 50
    .line 51
    aput-wide v10, v1, v8

    .line 52
    move v2, v8

    .line 53
    .line 54
    :goto_0
    if-eqz v2, :cond_2

    .line 55
    .line 56
    aget-wide v10, v1, v9

    .line 57
    .line 58
    aget-wide v12, v1, v8

    .line 59
    add-long/2addr v10, v12

    .line 60
    .line 61
    iget-wide v12, v0, Lcom/tencent/bugly/proguard/re;->g:J

    .line 62
    mul-long/2addr v10, v12

    .line 63
    .line 64
    aget-wide v2, v1, v3

    .line 65
    mul-long/2addr v2, v12

    .line 66
    .line 67
    aget-wide v14, v1, v7

    .line 68
    mul-long/2addr v14, v12

    .line 69
    .line 70
    aget-wide v16, v1, v4

    .line 71
    move v4, v5

    .line 72
    move v7, v6

    .line 73
    .line 74
    mul-long v5, v16, v12

    .line 75
    .line 76
    aget-wide v16, v1, v4

    .line 77
    .line 78
    move-wide/from16 v18, v10

    .line 79
    .line 80
    mul-long v9, v16, v12

    .line 81
    .line 82
    aget-wide v16, v1, v7

    .line 83
    .line 84
    mul-long v11, v16, v12

    .line 85
    .line 86
    move-wide/from16 v16, v5

    .line 87
    .line 88
    iget-wide v4, v0, Lcom/tencent/bugly/proguard/re;->q:J

    .line 89
    .line 90
    cmp-long v6, v18, v4

    .line 91
    .line 92
    if-ltz v6, :cond_1

    .line 93
    .line 94
    iget-wide v6, v0, Lcom/tencent/bugly/proguard/re;->r:J

    .line 95
    .line 96
    cmp-long v13, v2, v6

    .line 97
    .line 98
    if-ltz v13, :cond_1

    .line 99
    .line 100
    move-wide/from16 v20, v2

    .line 101
    .line 102
    iget-wide v1, v0, Lcom/tencent/bugly/proguard/re;->s:J

    .line 103
    .line 104
    cmp-long v13, v16, v1

    .line 105
    .line 106
    if-ltz v13, :cond_1

    .line 107
    .line 108
    move-wide/from16 v22, v4

    .line 109
    .line 110
    iget-wide v3, v0, Lcom/tencent/bugly/proguard/re;->t:J

    .line 111
    .line 112
    cmp-long v13, v9, v3

    .line 113
    .line 114
    if-ltz v13, :cond_1

    .line 115
    .line 116
    move-wide/from16 v24, v6

    .line 117
    .line 118
    iget-wide v5, v0, Lcom/tencent/bugly/proguard/re;->u:J

    .line 119
    .line 120
    cmp-long v13, v11, v5

    .line 121
    .line 122
    if-ltz v13, :cond_1

    .line 123
    .line 124
    iget-wide v7, v0, Lcom/tencent/bugly/proguard/re;->v:J

    .line 125
    .line 126
    cmp-long v26, v14, v7

    .line 127
    .line 128
    if-ltz v26, :cond_1

    .line 129
    .line 130
    move-wide/from16 v26, v14

    .line 131
    .line 132
    sub-long v13, v18, v22

    .line 133
    long-to-int v13, v13

    .line 134
    .line 135
    iput v13, v0, Lcom/tencent/bugly/proguard/re;->w:I

    .line 136
    .line 137
    sub-long v13, v20, v24

    .line 138
    long-to-int v13, v13

    .line 139
    .line 140
    iput v13, v0, Lcom/tencent/bugly/proguard/re;->x:I

    .line 141
    .line 142
    sub-long v1, v16, v1

    .line 143
    long-to-int v1, v1

    .line 144
    .line 145
    iput v1, v0, Lcom/tencent/bugly/proguard/re;->y:I

    .line 146
    .line 147
    sub-long v1, v9, v3

    .line 148
    long-to-int v1, v1

    .line 149
    .line 150
    iput v1, v0, Lcom/tencent/bugly/proguard/re;->z:I

    .line 151
    .line 152
    sub-long v1, v11, v5

    .line 153
    long-to-int v1, v1

    .line 154
    .line 155
    iput v1, v0, Lcom/tencent/bugly/proguard/re;->A:I

    .line 156
    .line 157
    sub-long v1, v26, v7

    .line 158
    long-to-int v1, v1

    .line 159
    .line 160
    iput v1, v0, Lcom/tencent/bugly/proguard/re;->B:I

    .line 161
    const/4 v15, 0x1

    .line 162
    .line 163
    iput-boolean v15, v0, Lcom/tencent/bugly/proguard/re;->C:Z

    .line 164
    .line 165
    move-wide/from16 v1, v18

    .line 166
    .line 167
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/re;->q:J

    .line 168
    .line 169
    move-wide/from16 v2, v20

    .line 170
    .line 171
    iput-wide v2, v0, Lcom/tencent/bugly/proguard/re;->r:J

    .line 172
    .line 173
    move-wide/from16 v1, v16

    .line 174
    .line 175
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/re;->s:J

    .line 176
    .line 177
    iput-wide v9, v0, Lcom/tencent/bugly/proguard/re;->t:J

    .line 178
    .line 179
    iput-wide v11, v0, Lcom/tencent/bugly/proguard/re;->u:J

    .line 180
    .line 181
    move-wide/from16 v14, v26

    .line 182
    .line 183
    iput-wide v14, v0, Lcom/tencent/bugly/proguard/re;->v:J

    .line 184
    return-void

    .line 185
    :cond_1
    const/4 v1, 0x0

    .line 186
    .line 187
    iput v1, v0, Lcom/tencent/bugly/proguard/re;->w:I

    .line 188
    .line 189
    iput v1, v0, Lcom/tencent/bugly/proguard/re;->x:I

    .line 190
    .line 191
    iput v1, v0, Lcom/tencent/bugly/proguard/re;->y:I

    .line 192
    .line 193
    iput v1, v0, Lcom/tencent/bugly/proguard/re;->z:I

    .line 194
    .line 195
    iput v1, v0, Lcom/tencent/bugly/proguard/re;->A:I

    .line 196
    .line 197
    iput v1, v0, Lcom/tencent/bugly/proguard/re;->B:I

    .line 198
    .line 199
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/re;->C:Z

    .line 200
    .line 201
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 202
    .line 203
    const-string v2, "ProcessCpuTracker"

    .line 204
    .line 205
    const-string v3, "/proc/stats has gone backwards; skipping CPU update"

    .line 206
    .line 207
    .line 208
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 209
    move-result-object v2

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 213
    :cond_2
    return-void
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
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method public t()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/re;->e:[F

    .line 3
    .line 4
    sget-object v1, Lcom/tencent/bugly/proguard/re;->f0:[I

    .line 5
    .line 6
    const-string v2, "/proc/loadavg"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v2, v1, v3, v3, v0}, Lcom/tencent/bugly/common/utils/cpu/Process;->readProcFile(Ljava/lang/String;[I[Ljava/lang/String;[J[F)Z

    .line 11
    move-result v1

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    aget v1, v0, v1

    .line 17
    const/4 v2, 0x1

    .line 18
    .line 19
    aget v2, v0, v2

    .line 20
    const/4 v3, 0x2

    .line 21
    .line 22
    aget v0, v0, v3

    .line 23
    .line 24
    iget v3, p0, Lcom/tencent/bugly/proguard/re;->h:F

    .line 25
    .line 26
    cmpl-float v3, v1, v3

    .line 27
    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    iget v3, p0, Lcom/tencent/bugly/proguard/re;->i:F

    .line 31
    .line 32
    cmpl-float v3, v2, v3

    .line 33
    .line 34
    if-nez v3, :cond_0

    .line 35
    .line 36
    iget v3, p0, Lcom/tencent/bugly/proguard/re;->j:F

    .line 37
    .line 38
    cmpl-float v3, v0, v3

    .line 39
    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    :cond_0
    iput v1, p0, Lcom/tencent/bugly/proguard/re;->h:F

    .line 43
    .line 44
    iput v2, p0, Lcom/tencent/bugly/proguard/re;->i:F

    .line 45
    .line 46
    iput v0, p0, Lcom/tencent/bugly/proguard/re;->j:F

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v1, v2, v0}, Lcom/tencent/bugly/proguard/re;->a(FFF)V

    .line 50
    :cond_1
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public u()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 4
    move-result-object v1

    .line 5
    .line 6
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/re;->f:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v3, "/proc/self/task"

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 14
    move-result v4

    .line 15
    .line 16
    iget-boolean v5, p0, Lcom/tencent/bugly/proguard/re;->I:Z

    .line 17
    .line 18
    iget-object v6, p0, Lcom/tencent/bugly/proguard/re;->D:[I

    .line 19
    .line 20
    iget-object v7, p0, Lcom/tencent/bugly/proguard/re;->F:Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    move-object v2, p0

    .line 22
    .line 23
    .line 24
    :try_start_1
    invoke-virtual/range {v2 .. v7}, Lcom/tencent/bugly/proguard/re;->a(Ljava/lang/String;IZ[ILjava/util/ArrayList;)[I

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iput-object v0, v2, Lcom/tencent/bugly/proguard/re;->D:[I

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_1

    .line 31
    :catchall_1
    move-exception v0

    .line 32
    move-object v2, p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move-object v2, p0

    .line 35
    .line 36
    const-string v3, "/proc/self/task"

    .line 37
    .line 38
    iget-boolean v5, v2, Lcom/tencent/bugly/proguard/re;->I:Z

    .line 39
    .line 40
    iget-object v6, v2, Lcom/tencent/bugly/proguard/re;->D:[I

    .line 41
    .line 42
    iget-object v7, v2, Lcom/tencent/bugly/proguard/re;->F:Ljava/util/ArrayList;

    .line 43
    const/4 v4, -0x1

    .line 44
    .line 45
    .line 46
    invoke-virtual/range {v2 .. v7}, Lcom/tencent/bugly/proguard/re;->a(Ljava/lang/String;IZ[ILjava/util/ArrayList;)[I

    .line 47
    move-result-object v0

    .line 48
    .line 49
    iput-object v0, v2, Lcom/tencent/bugly/proguard/re;->D:[I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-static {v1}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 53
    return-void

    .line 54
    .line 55
    .line 56
    :goto_1
    invoke-static {v1}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 57
    throw v0
.end method
