.class public Lcom/tencent/bugly/proguard/j3;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/j3$g;,
        Lcom/tencent/bugly/proguard/j3$m;,
        Lcom/tencent/bugly/proguard/j3$l;,
        Lcom/tencent/bugly/proguard/j3$o;,
        Lcom/tencent/bugly/proguard/j3$n;,
        Lcom/tencent/bugly/proguard/j3$k;,
        Lcom/tencent/bugly/proguard/j3$j;,
        Lcom/tencent/bugly/proguard/j3$i;,
        Lcom/tencent/bugly/proguard/j3$h;
    }
.end annotation


# static fields
.field public static h:I = 0x0

.field public static final i:Ljava/lang/String; = "hasUserCallback"

.field public static final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/j3$g;",
            ">;"
        }
    .end annotation
.end field

.field public static final m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/tencent/bugly/proguard/rh;

.field public final c:Lcom/tencent/bugly/proguard/e4;

.field public final d:Lcom/tencent/bugly/proguard/pg;

.field public e:Lcom/tencent/bugly/proguard/zf;

.field public f:Lcom/tencent/bugly/proguard/b2$a;

.field public g:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/j3$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/j3$a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/j3;->j:Ljava/util/List;

    .line 8
    .line 9
    new-instance v0, Lcom/tencent/bugly/proguard/j3$b;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/j3$b;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/tencent/bugly/proguard/j3;->k:Ljava/util/Map;

    .line 15
    .line 16
    new-instance v0, Lcom/tencent/bugly/proguard/j3$c;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/j3$c;-><init>()V

    .line 20
    .line 21
    sput-object v0, Lcom/tencent/bugly/proguard/j3;->l:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance v0, Lcom/tencent/bugly/proguard/j3$d;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/j3$d;-><init>()V

    .line 27
    .line 28
    sput-object v0, Lcom/tencent/bugly/proguard/j3;->m:Ljava/util/Map;

    .line 29
    .line 30
    new-instance v0, Lcom/tencent/bugly/proguard/j3$e;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/j3$e;-><init>()V

    .line 34
    .line 35
    sput-object v0, Lcom/tencent/bugly/proguard/j3;->n:Ljava/util/Map;

    .line 36
    .line 37
    new-instance v0, Lcom/tencent/bugly/proguard/j3$f;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/j3$f;-><init>()V

    .line 41
    .line 42
    sput-object v0, Lcom/tencent/bugly/proguard/j3;->o:Ljava/util/Map;

    .line 43
    return-void
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

.method public constructor <init>(ILandroid/content/Context;Lcom/tencent/bugly/proguard/rh;Lcom/tencent/bugly/proguard/e4;Lcom/tencent/bugly/proguard/pg;Lcom/tencent/bugly/proguard/b2$a;Lcom/tencent/bugly/proguard/zf;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/j3;->g:Z

    .line 7
    .line 8
    sput p1, Lcom/tencent/bugly/proguard/j3;->h:I

    .line 9
    .line 10
    iput-object p2, p0, Lcom/tencent/bugly/proguard/j3;->a:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p3, p0, Lcom/tencent/bugly/proguard/j3;->b:Lcom/tencent/bugly/proguard/rh;

    .line 13
    .line 14
    iput-object p4, p0, Lcom/tencent/bugly/proguard/j3;->c:Lcom/tencent/bugly/proguard/e4;

    .line 15
    .line 16
    iput-object p5, p0, Lcom/tencent/bugly/proguard/j3;->d:Lcom/tencent/bugly/proguard/pg;

    .line 17
    .line 18
    iput-object p6, p0, Lcom/tencent/bugly/proguard/j3;->f:Lcom/tencent/bugly/proguard/b2$a;

    .line 19
    .line 20
    iput-object p7, p0, Lcom/tencent/bugly/proguard/j3;->e:Lcom/tencent/bugly/proguard/zf;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b;->d()Lcom/tencent/rmonitor/base/config/b;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    const-string p2, "error_report"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    instance-of p2, p1, Lcom/tencent/bugly/proguard/d5;

    .line 33
    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    check-cast p1, Lcom/tencent/bugly/proguard/d5;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/d5;->b()Z

    .line 40
    move-result p1

    .line 41
    .line 42
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/j3;->g:Z

    .line 43
    :cond_0
    return-void
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
.end method

.method public static a(Landroid/content/Context;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lcom/tencent/bugly/proguard/l2;)Lcom/tencent/bugly/proguard/h5;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    if-nez v2, :cond_0

    goto/16 :goto_0

    .line 174
    :cond_0
    new-instance v5, Lcom/tencent/bugly/proguard/h5;

    invoke-direct {v5}, Lcom/tencent/bugly/proguard/h5;-><init>()V

    .line 175
    invoke-static {v1}, Lcom/tencent/bugly/proguard/j3;->d(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lcom/tencent/bugly/proguard/h5;->q:Ljava/lang/String;

    .line 176
    iget-wide v6, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    iput-wide v6, v5, Lcom/tencent/bugly/proguard/h5;->r:J

    .line 177
    iget-object v6, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    iput-object v6, v5, Lcom/tencent/bugly/proguard/h5;->s:Ljava/lang/String;

    .line 178
    iget-object v6, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->x:Ljava/lang/String;

    iput-object v6, v5, Lcom/tencent/bugly/proguard/h5;->t:Ljava/lang/String;

    .line 179
    iget-object v6, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->y:Ljava/lang/String;

    iput-object v6, v5, Lcom/tencent/bugly/proguard/h5;->u:Ljava/lang/String;

    .line 180
    iget-object v6, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    iput-object v6, v5, Lcom/tencent/bugly/proguard/h5;->w:Ljava/lang/String;

    .line 181
    iget-object v6, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->I:Ljava/util/Map;

    iput-object v6, v5, Lcom/tencent/bugly/proguard/h5;->x:Ljava/util/Map;

    .line 182
    iget-object v6, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d:Ljava/lang/String;

    iput-object v6, v5, Lcom/tencent/bugly/proguard/h5;->y:Ljava/lang/String;

    .line 183
    iput-object v4, v5, Lcom/tencent/bugly/proguard/h5;->z:Lcom/tencent/bugly/proguard/i0;

    .line 184
    iget-object v6, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->v:Ljava/lang/String;

    iput-object v6, v5, Lcom/tencent/bugly/proguard/h5;->B:Ljava/lang/String;

    .line 185
    iget-object v6, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i:Ljava/lang/String;

    iput-object v6, v5, Lcom/tencent/bugly/proguard/h5;->C:Ljava/lang/String;

    .line 186
    iget-object v6, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->K:Ljava/lang/String;

    iput-object v6, v5, Lcom/tencent/bugly/proguard/h5;->v:Ljava/lang/String;

    .line 187
    iput-object v4, v5, Lcom/tencent/bugly/proguard/h5;->D:Lcom/tencent/bugly/proguard/w;

    .line 188
    invoke-static {v1}, Lcom/tencent/bugly/proguard/j3;->e(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Ljava/util/ArrayList;

    move-result-object v4

    iput-object v4, v5, Lcom/tencent/bugly/proguard/h5;->F:Ljava/util/ArrayList;

    .line 189
    iget-object v4, v5, Lcom/tencent/bugly/proguard/h5;->E:Ljava/util/ArrayList;

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v6, "libInfo %s"

    invoke-static {v6, v4}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 190
    invoke-static {v1, v2, v0, v3}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lcom/tencent/bugly/proguard/l2;Landroid/content/Context;Z)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, v5, Lcom/tencent/bugly/proguard/h5;->G:Ljava/util/ArrayList;

    .line 191
    iget-boolean v0, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->s:Z

    if-eqz v0, :cond_1

    .line 192
    iget v0, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->C:I

    iput v0, v5, Lcom/tencent/bugly/proguard/h5;->A:I

    :cond_1
    const/4 v0, 0x1

    .line 193
    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lcom/tencent/bugly/proguard/l2;Z)Ljava/util/Map;

    move-result-object v4

    iput-object v4, v5, Lcom/tencent/bugly/proguard/h5;->H:Ljava/util/Map;

    .line 194
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    iput-object v4, v5, Lcom/tencent/bugly/proguard/h5;->I:Ljava/util/Map;

    .line 195
    iget-object v4, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d0:Ljava/util/Map;

    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v4

    if-lez v4, :cond_2

    .line 196
    iget-object v4, v5, Lcom/tencent/bugly/proguard/h5;->I:Ljava/util/Map;

    iget-object v6, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d0:Ljava/util/Map;

    invoke-interface {v4, v6}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 197
    iget-object v4, v5, Lcom/tencent/bugly/proguard/h5;->I:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    .line 198
    sget-object v6, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string/jumbo v7, "setted message size %d"

    invoke-static {v6, v7, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 199
    :cond_2
    iget-object v4, v5, Lcom/tencent/bugly/proguard/h5;->I:Ljava/util/Map;

    invoke-static {v4, v1, v2}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/Map;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lcom/tencent/bugly/proguard/l2;)V

    .line 200
    iget-object v6, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    iget-object v7, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d:Ljava/lang/String;

    .line 201
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/l2;->B()Ljava/lang/String;

    move-result-object v8

    iget-wide v9, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    iget-wide v11, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b0:J

    sub-long/2addr v9, v11

    const-wide/16 v11, 0x3e8

    div-long/2addr v9, v11

    .line 202
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    iget-boolean v2, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->t:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    iget-boolean v2, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c0:Z

    .line 203
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    iget-boolean v2, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->s:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    iget v2, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    if-ne v2, v0, :cond_3

    move v3, v0

    .line 204
    :cond_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    iget v0, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->C:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iget-object v15, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    iget-boolean v0, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->g:Z

    .line 205
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v16

    iget-object v0, v5, Lcom/tencent/bugly/proguard/h5;->H:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    filled-new-array/range {v6 .. v17}, [Ljava/lang/Object;

    move-result-object v0

    .line 206
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v2, "%s rid:%s sess:%s ls:%ds isR:%b isF:%b isM:%b isN:%b mc:%d ,%s ,isUp:%b ,vm:%d"

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v5

    .line 207
    :cond_4
    :goto_0
    new-array v0, v3, [Ljava/lang/Object;

    const-string v1, "enExp args == null"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v4
.end method

.method public static a(Landroid/content/Context;Ljava/util/List;Lcom/tencent/bugly/proguard/l2;)Lcom/tencent/bugly/proguard/i5;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            ">;",
            "Lcom/tencent/bugly/proguard/l2;",
            ")",
            "Lcom/tencent/bugly/proguard/i5;"
        }
    .end annotation

    if-eqz p0, :cond_2

    if-eqz p1, :cond_2

    .line 222
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    if-nez p2, :cond_0

    goto :goto_1

    .line 223
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/i5;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/i5;-><init>()V

    .line 224
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/tencent/bugly/proguard/i5;->q:Ljava/util/ArrayList;

    .line 225
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 226
    iget-object v2, v0, Lcom/tencent/bugly/proguard/i5;->q:Ljava/util/ArrayList;

    invoke-static {p0, v1, p2}, Lcom/tencent/bugly/proguard/j3;->a(Landroid/content/Context;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lcom/tencent/bugly/proguard/l2;)Lcom/tencent/bugly/proguard/h5;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 227
    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "enEXPPkg args == null!"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/bugly/proguard/s0;
    .locals 6

    const-string v0, "del tmp"

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p2, :cond_a

    if-nez p1, :cond_0

    goto/16 :goto_7

    .line 228
    :cond_0
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v3

    const-string/jumbo v4, "zip %s"

    invoke-static {v4, v3}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 229
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 230
    new-instance p2, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/16 p0, 0x1388

    .line 231
    invoke-static {v3, p2, p0}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/io/File;Ljava/io/File;I)Z

    move-result p0

    if-nez p0, :cond_1

    .line 232
    new-array p0, v2, [Ljava/lang/Object;

    .line 233
    sget-object p1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string/jumbo p2, "zip fail!"

    invoke-static {p1, p2, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v1

    .line 234
    :cond_1
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 235
    :try_start_0
    new-instance p1, Ljava/io/FileInputStream;

    invoke-direct {p1, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v3, 0x1000

    .line 236
    :try_start_1
    new-array v3, v3, [B

    .line 237
    :goto_0
    invoke-virtual {p1, v3}, Ljava/io/FileInputStream;->read([B)I

    move-result v4

    if-lez v4, :cond_2

    .line 238
    invoke-virtual {p0, v3, v2, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 239
    invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V

    goto :goto_0

    .line 240
    :cond_2
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    .line 241
    const-string/jumbo v3, "read bytes :%d"

    array-length v4, p0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    .line 242
    sget-object v5, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v5, v3, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 243
    new-instance v3, Lcom/tencent/bugly/proguard/s0;

    .line 244
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    invoke-direct {v3, v5, v4, p0}, Lcom/tencent/bugly/proguard/s0;-><init>(BLjava/lang/String;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 245
    :try_start_2
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 246
    sget-object p1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 247
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 248
    :cond_3
    :goto_1
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_4

    .line 249
    new-array p0, v2, [Ljava/lang/Object;

    .line 250
    sget-object p1, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {p1, v0, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 251
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    :cond_4
    return-object v3

    :catchall_0
    move-exception p0

    goto :goto_2

    :catchall_1
    move-exception p0

    move-object p1, v1

    .line 252
    :goto_2
    :try_start_3
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v3, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 253
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception p0

    goto :goto_5

    :cond_5
    :goto_3
    if-eqz p1, :cond_6

    .line 254
    :try_start_4
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_4

    :catch_1
    move-exception p0

    .line 255
    sget-object p1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 256
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 257
    :cond_6
    :goto_4
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_7

    .line 258
    new-array p0, v2, [Ljava/lang/Object;

    .line 259
    sget-object p1, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {p1, v0, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 260
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    :cond_7
    return-object v1

    :goto_5
    if-eqz p1, :cond_8

    .line 261
    :try_start_5
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_6

    :catch_2
    move-exception p1

    .line 262
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 263
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 264
    :cond_8
    :goto_6
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 265
    new-array p1, v2, [Ljava/lang/Object;

    .line 266
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v1, v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 267
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 268
    :cond_9
    throw p0

    .line 269
    :cond_a
    :goto_7
    new-array p0, v2, [Ljava/lang/Object;

    const-string/jumbo p1, "rqdp{  createZipAttachment sourcePath == null || context == null ,pls check}"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v1
.end method

.method public static a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lcom/tencent/bugly/proguard/l2;Landroid/content/Context;Z)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            "Lcom/tencent/bugly/proguard/l2;",
            "Landroid/content/Context;",
            "Z)",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/s0;",
            ">;"
        }
    .end annotation

    .line 367
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0x14

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 368
    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/ArrayList;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 369
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->F:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/j3;->c(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 370
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->G:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/j3;->b(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 371
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->k0:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 372
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->H:[B

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/j3;->b(Ljava/util/ArrayList;[B)V

    .line 373
    invoke-static {p1, p0, p2}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/ArrayList;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Landroid/content/Context;)V

    .line 374
    invoke-static {p1, p0, p2}, Lcom/tencent/bugly/proguard/j3;->b(Ljava/util/ArrayList;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Landroid/content/Context;)V

    .line 375
    iget-object p2, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->p:Ljava/util/List;

    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 376
    iget-object p2, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->j0:[B

    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/ArrayList;[B)V

    if-eqz p3, :cond_2

    .line 377
    iget-object p2, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d0:Ljava/util/Map;

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result p2

    if-lez p2, :cond_0

    .line 378
    iget-object p2, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d0:Ljava/util/Map;

    .line 379
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    .line 380
    const-string/jumbo p3, "user_datas.log"

    invoke-static {p1, p3, p2}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    :cond_0
    iget-object p2, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h0:Ljava/util/Map;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result p2

    if-lez p2, :cond_2

    .line 382
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 383
    iget-object p0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h0:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    .line 384
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "C03_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    const-string v0, ":"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    const-string p3, ";"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 388
    :cond_1
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 389
    const-string/jumbo p2, "valueMapOthers.txt"

    invoke-static {p1, p2, p0}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-object p1
.end method

.method public static a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lcom/tencent/bugly/proguard/l2;Z)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            "Lcom/tencent/bugly/proguard/l2;",
            "Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, ""

    .line 445
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0x1e

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 446
    :try_start_0
    const-string v2, "A9"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->L:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    const-string v2, "A11"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->M:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    const-string v2, "A10"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->N:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    const-string v2, "A23"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->l:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    const-string v2, "A7"

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    const-string v2, "A6"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->k()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    const-string v2, "A5"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->m()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    const-string v2, "A22"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    const-string v2, "A2"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->P:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    const-string v2, "A1"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->O:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    const-string v2, "A24"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p1, Lcom/tencent/bugly/proguard/l2;->o:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    const-string v2, "A17"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->Q:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    const-string v2, "A25"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    const-string v2, "A15"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->j()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    const-string v2, "A13"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->t()Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    const-string v2, "A34"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->J:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    if-eqz p2, :cond_1

    .line 462
    iget p2, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x3

    const-string v4, "crash_identify"

    if-eq p2, v3, :cond_0

    if-eqz p2, :cond_0

    if-eq p2, v2, :cond_0

    .line 463
    :try_start_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, v4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catch_0
    move-exception p0

    goto/16 :goto_1

    .line 464
    :cond_0
    iget-object p2, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e:Ljava/lang/String;

    invoke-virtual {v1, v4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    :cond_1
    :goto_0
    const-string/jumbo p2, "productIdentify"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->m:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, p2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    const-string p2, "A26"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->W:Ljava/lang/String;

    const-string/jumbo v5, "utf-8"

    invoke-static {v4, v5}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, p2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    iget p2, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    if-ne p2, v2, :cond_2

    .line 468
    const-string p2, "A27"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->Z:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, p2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    const-string p2, "A28"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->Y:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, p2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    const-string p2, "A29"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->t:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, p2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    :cond_2
    const-string p2, "A30"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->a0:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, p2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    const-string p2, "A18"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b0:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, p2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    const-string p2, "A36"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v4, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c0:Z

    xor-int/2addr v2, v4

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    const-string p2, "F02"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, p1, Lcom/tencent/bugly/proguard/l2;->Z:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    const-string p2, "F03"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, p1, Lcom/tencent/bugly/proguard/l2;->a0:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    const-string p2, "F04"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->B()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    const-string p2, "F05"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, p1, Lcom/tencent/bugly/proguard/l2;->b0:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    const-string p2, "F06"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p1, Lcom/tencent/bugly/proguard/l2;->Y:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    const-string p2, "F08"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p1, Lcom/tencent/bugly/proguard/l2;->e0:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    const-string p2, "F09"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p1, Lcom/tencent/bugly/proguard/l2;->f0:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    const-string p2, "F10"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, p1, Lcom/tencent/bugly/proguard/l2;->c0:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/Map;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v1

    .line 483
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 484
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    return-object v1
.end method

.method public static a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 4

    .line 25
    iget-wide v0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    iget-wide v2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 27
    iget v0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->C:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->C:I

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, "\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            ">;)V"
        }
    .end annotation

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x1

    move v2, v1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 17
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 18
    iget-object v3, v3, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    if-nez v3, :cond_0

    goto :goto_2

    .line 19
    :cond_0
    const-string v4, "\n"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_2

    .line 20
    :cond_1
    array-length v5, v3

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_3

    aget-object v7, v3, v6

    .line 21
    iget-object v8, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    invoke-virtual {v8, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_2

    .line 22
    iget v8, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->C:I

    add-int/2addr v8, v1

    iput v8, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->C:I

    .line 23
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 24
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    return-void
.end method

.method public static a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    .line 348
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    .line 349
    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    iput-object v1, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d0:Ljava/util/Map;

    .line 350
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 351
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 352
    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 353
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x64

    if-le v3, v4, :cond_2

    .line 354
    invoke-virtual {v2, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 355
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v3

    .line 356
    const-string/jumbo v4, "setted key length is over limit %d substring to %s"

    invoke-static {v4, v3}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 357
    :cond_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 358
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const v4, 0x186a0

    if-le v3, v4, :cond_3

    .line 359
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 360
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v4

    invoke-virtual {v3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 361
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 362
    const-string/jumbo v4, "setted %s value length is over limit %d substring"

    invoke-static {v4, v3}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_1

    .line 363
    :cond_3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 364
    :goto_1
    iget-object v3, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d0:Ljava/util/Map;

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "add setted key %s value size:%d"

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_4
    return-void

    .line 366
    :cond_5
    :goto_2
    new-array p0, v0, [Ljava/lang/Object;

    const-string p1, "extra map is empty. CrashBean won\'t have userDatas."

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;[B)V
    .locals 3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    .line 335
    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "extra user byte is null. CrashBean won\'t have userExtraByteDatas."

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 336
    :cond_0
    array-length v0, p1

    const v1, 0x186a0

    if-gt v0, v1, :cond_1

    .line 337
    iput-object p1, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->j0:[B

    goto :goto_0

    .line 338
    :cond_1
    array-length v0, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 339
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v0

    .line 340
    const-string v2, "extra bytes size %d is over limit %d will drop over part"

    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 341
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->j0:[B

    .line 342
    :goto_0
    array-length p0, p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "add extra bytes %d "

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 7

    .line 281
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    if-eqz v0, :cond_6

    if-nez p5, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v1, 0x0

    .line 282
    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "#++++++++++Record By Bugly++++++++++#"

    invoke-static {v3, v2}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 283
    const-string v2, "# PKG NAME: %s"

    iget-object v3, v0, Lcom/tencent/bugly/proguard/l2;->e:Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 284
    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v4, v2, v3}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 285
    const-string v2, "# APP VER: %s"

    iget-object v3, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->l:Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 286
    invoke-static {v4, v2, v3}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 287
    const-string v2, "# SDK VER: %s"

    iget-object v3, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->k:Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 288
    invoke-static {v4, v2, v3}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 289
    const-string v2, "# LAUNCH TIME: %s"

    new-instance v3, Ljava/util/Date;

    .line 290
    const-class v5, Lcom/tencent/bugly/proguard/l2;

    monitor-enter v5

    .line 291
    :try_start_0
    sget-object v6, Lcom/tencent/bugly/proguard/l2;->C0:Lcom/tencent/bugly/proguard/l2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v5

    .line 292
    iget-wide v5, v6, Lcom/tencent/bugly/proguard/l2;->c:J

    invoke-direct {v3, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-static {v3}, Lcom/tencent/bugly/proguard/bi;->b(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 293
    invoke-static {v4, v2, v3}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 294
    const-string v2, "# CRASH TYPE: %s"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 295
    invoke-static {v4, v2, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 296
    const-string p0, "# CRASH TIME: %s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 297
    invoke-static {v4, p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 298
    const-string p0, "# CRASH PROCESS: %s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p1

    .line 299
    invoke-static {v4, p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 300
    const-string p0, "# CRASH FOREGROUND: %s"

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->K()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 301
    invoke-static {v4, p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 302
    const-string p0, "# CRASH THREAD: %s"

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p1

    .line 303
    invoke-static {v4, p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 304
    const-string p0, "# REPORT ID: %s"

    iget-object p1, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d:Ljava/lang/String;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 305
    invoke-static {v4, p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 306
    const-string p0, "# CRASH DEVICE: %s %s"

    iget-object p1, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->j:Ljava/lang/String;

    .line 307
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->t()Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "ROOTED"

    goto :goto_0

    :cond_1
    const-string p2, "UNROOT"

    :goto_0
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    .line 308
    invoke-static {v4, p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 309
    const-string p0, "# RUNTIME AVAIL RAM:%d ROM:%d SD:%d"

    iget-wide p1, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->L:J

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iget-wide p2, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->M:J

    .line 310
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iget-wide v2, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->N:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    .line 311
    invoke-static {v4, p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 312
    const-string p0, "# RUNTIME TOTAL RAM:%d ROM:%d SD:%d"

    iget-wide p1, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->O:J

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iget-wide p2, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->P:J

    .line 313
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iget-wide v2, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->Q:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    .line 314
    invoke-static {v4, p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 315
    iget-object p0, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->Z:Ljava/lang/String;

    invoke-static {p0}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    .line 316
    const-string p0, "# EXCEPTION FIRED BY %s %s"

    iget-object p1, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->Z:Ljava/lang/String;

    iget-object p2, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->Y:Ljava/lang/String;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    .line 317
    invoke-static {v4, p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_2

    .line 318
    :cond_2
    iget p0, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    const/4 p1, 0x3

    if-ne p0, p1, :cond_4

    .line 319
    const-string p0, "# EXCEPTION ANR MESSAGE:\n %s"

    iget-object p1, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e0:Ljava/util/Map;

    if-nez p1, :cond_3

    const-string/jumbo p1, "null"

    goto :goto_1

    .line 320
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, ""

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e0:Ljava/util/Map;

    const-string p3, "BUGLY_CR_01"

    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_1
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 321
    invoke-static {v4, p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 322
    :cond_4
    :goto_2
    invoke-static {p4}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_5

    .line 323
    const-string p0, "# CRASH STACK: "

    new-array p1, v1, [Ljava/lang/Object;

    .line 324
    invoke-static {v4, p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 325
    new-array p0, v1, [Ljava/lang/Object;

    .line 326
    invoke-static {v4, p4, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 327
    :cond_5
    const-string p0, "#++++++++++++++++++++++++++++++++++++++++++#"

    new-array p1, v1, [Ljava/lang/Object;

    .line 328
    invoke-static {v4, p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v5

    throw p0

    :cond_6
    :goto_3
    return-void
.end method

.method public static a(Ljava/util/ArrayList;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/s0;",
            ">;",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            ")V"
        }
    .end annotation

    .line 390
    iget-boolean v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->s:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 391
    :cond_0
    iget-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 392
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/s0;

    const-string v1, "alltimes.txt"

    iget-object p1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    const-string/jumbo v2, "utf-8"

    .line 393
    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1, p1}, Lcom/tencent/bugly/proguard/s0;-><init>(BLjava/lang/String;[B)V

    .line 394
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 395
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 396
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Ljava/util/ArrayList;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Landroid/content/Context;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/s0;",
            ">;",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 413
    const-string v0, "BUGLY_CR_01"

    iget v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 414
    :cond_0
    iget-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e0:Ljava/util/Map;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "crashBean.anrMessages:%s"

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 415
    :try_start_0
    iget-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e0:Ljava/util/Map;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 416
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 417
    iget-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e0:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 418
    new-instance v1, Lcom/tencent/bugly/proguard/s0;

    const-string v3, "anrMessage.txt"

    iget-object v4, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e0:Ljava/util/Map;

    .line 419
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string/jumbo v5, "utf-8"

    .line 420
    invoke-virtual {v4, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v4

    const/4 v5, 0x1

    invoke-direct {v1, v5, v3, v4}, Lcom/tencent/bugly/proguard/s0;-><init>(BLjava/lang/String;[B)V

    .line 421
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 422
    const-string v1, "attach anr message"

    new-array v3, v2, [Ljava/lang/Object;

    .line 423
    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v4, v1, v3}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 424
    :cond_1
    iget-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e0:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    :cond_2
    iget-object p1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->E:Ljava/lang/String;

    if-eqz p1, :cond_3

    .line 426
    const-string/jumbo v0, "trace.zip"

    invoke-static {v0, p2, p1}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/bugly/proguard/s0;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 427
    const-string p2, "attach traces"

    new-array v0, v2, [Ljava/lang/Object;

    .line 428
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v1, p2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 429
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 430
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 431
    sget-object p1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    :cond_3
    :goto_0
    return-void
.end method

.method public static a(Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/s0;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 401
    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 402
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/s0;

    const-string v1, "crashInfos.txt"

    const-string/jumbo v2, "utf-8"

    .line 403
    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1, p1}, Lcom/tencent/bugly/proguard/s0;-><init>(BLjava/lang/String;[B)V

    .line 404
    const-string p1, "attach crash infos"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 405
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 406
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 407
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method public static a(Ljava/util/ArrayList;Ljava/lang/String;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/s0;",
            ">;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 408
    :try_start_0
    const-string v0, "backupRecord.zip"

    .line 409
    invoke-static {v0, p2, p1}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/bugly/proguard/s0;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 410
    const-string p2, "attach backup record"

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 411
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 412
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method public static a(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/s0;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 397
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/s0;

    const-string/jumbo v1, "utf-8"

    .line 398
    invoke-virtual {p2, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1, p2}, Lcom/tencent/bugly/proguard/s0;-><init>(BLjava/lang/String;[B)V

    .line 399
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 400
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method public static a(Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/s0;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 432
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 433
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 434
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 435
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 436
    :cond_0
    :try_start_0
    new-instance p1, Lcom/tencent/bugly/proguard/s0;

    const-string v1, "martianlog.txt"

    .line 437
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v2, "utf-8"

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v2, 0x1

    invoke-direct {p1, v2, v1, v0}, Lcom/tencent/bugly/proguard/s0;-><init>(BLjava/lang/String;[B)V

    .line 438
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 439
    const-string p0, "attach pageTracingList"

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 440
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return-void
.end method

.method public static a(Ljava/util/ArrayList;[B)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/s0;",
            ">;[B)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 441
    array-length v0, p1

    if-lez v0, :cond_0

    .line 442
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/s0;

    const-string/jumbo v1, "userExtraByteData"

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1, p1}, Lcom/tencent/bugly/proguard/s0;-><init>(BLjava/lang/String;[B)V

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 443
    const-string p0, "attach extraData"

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 444
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method public static a(Ljava/util/Map;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            ")V"
        }
    .end annotation

    .line 485
    iget v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->f0:I

    const-string v1, ""

    if-ltz v0, :cond_0

    .line 486
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->f0:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "C01"

    invoke-interface {p0, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    :cond_0
    iget v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->g0:I

    if-ltz v0, :cond_1

    .line 488
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->g0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "C02"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    :cond_1
    iget-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h0:Ljava/util/Map;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 490
    iget-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h0:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 491
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "C03_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 492
    :cond_2
    iget-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i0:Ljava/util/Map;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 493
    iget-object p1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i0:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 494
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "C04_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-void
.end method

.method public static a(Ljava/util/Map;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lcom/tencent/bugly/proguard/l2;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            "Lcom/tencent/bugly/proguard/l2;",
            ")V"
        }
    .end annotation

    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "pss:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->R:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " vss:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->S:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " javaHeap:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->T:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " jvmMaxRam:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->U:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " jvmAllocRam:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->V:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 209
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->R:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "SDK_UPLOAD_U1"

    invoke-interface {p0, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->S:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "SDK_UPLOAD_U2"

    invoke-interface {p0, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->T:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "SDK_UPLOAD_U3"

    invoke-interface {p0, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->U:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "SDK_UPLOAD_U4"

    invoke-interface {p0, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->V:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SDK_UPLOAD_U5"

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->p()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SDK_UPLOAD_U6"

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SDK_UPLOAD_U7"

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "emulator confidence: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p2, Lcom/tencent/bugly/proguard/l2;->L:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\nemulator reason: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p2, Lcom/tencent/bugly/proguard/l2;->M:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    .line 217
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v3, p1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 218
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->m()Ljava/lang/String;

    move-result-object p1

    .line 219
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "SDK_UPLOAD_U8"

    invoke-interface {p0, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p2, "device cpu type: "

    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array p1, v1, [Ljava/lang/Object;

    .line 221
    invoke-static {v3, p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/util/List;Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e3;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e3;",
            ">;)Z"
        }
    .end annotation

    .line 71
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/e3;

    .line 72
    iget-wide v2, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b:J

    iget-wide v4, v1, Lcom/tencent/bugly/proguard/e3;->b:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->D:Ljava/lang/String;

    iget-object v3, v1, Lcom/tencent/bugly/proguard/e3;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 73
    iget-boolean v2, v1, Lcom/tencent/bugly/proguard/e3;->f:Z

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    .line 74
    :cond_1
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return v0
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 3

    .line 66
    sget-object v0, Lcom/tencent/bugly/proguard/k3;->P:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    sget-object v0, Lcom/tencent/bugly/proguard/k3;->P:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "Crash filter for crash stack is: %s"

    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 68
    sget-object v0, Lcom/tencent/bugly/proguard/k3;->P:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 69
    new-array p0, v1, [Ljava/lang/Object;

    .line 70
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v1, "This crash contains the filter string set. It will not be record and upload."

    invoke-static {v0, v1, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 p0, 0x1

    return p0

    :cond_0
    return v1
.end method

.method public static b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    .line 9
    iput-boolean p0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->s:Z

    const/4 p0, 0x0

    .line 10
    iput p0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->C:I

    .line 11
    const-string p0, ""

    iput-object p0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    return-object p1

    :cond_0
    return-object p0
.end method

.method public static b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e3;",
            ">;)V"
        }
    .end annotation

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 13
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/e3;

    .line 14
    iget-boolean v2, v1, Lcom/tencent/bugly/proguard/e3;->f:Z

    if-nez v2, :cond_0

    iget-boolean v2, v1, Lcom/tencent/bugly/proguard/e3;->e:Z

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, v1, Lcom/tencent/bugly/proguard/e3;->c:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 15
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 16
    iget v2, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->C:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->C:I

    .line 17
    iget-wide v1, v1, Lcom/tencent/bugly/proguard/e3;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 18
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/util/ArrayList;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Landroid/content/Context;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/s0;",
            ">;",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 128
    iget v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 129
    :cond_0
    iget-object p1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->E:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 130
    :try_start_0
    const-string/jumbo v0, "tomb.zip"

    .line 131
    invoke-static {v0, p2, p1}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/bugly/proguard/s0;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 132
    const-string p2, "attach tombs"

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 133
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 134
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static b(Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/s0;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 118
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/s0;

    const-string v1, "jniLog.txt"

    const-string/jumbo v2, "utf-8"

    .line 119
    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1, p1}, Lcom/tencent/bugly/proguard/s0;-><init>(BLjava/lang/String;[B)V

    .line 120
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 121
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 122
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method public static b(Ljava/util/ArrayList;[B)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/s0;",
            ">;[B)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 123
    array-length v0, p1

    if-lez v0, :cond_0

    .line 124
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/s0;

    const-string v1, "buglylog.zip"

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1, p1}, Lcom/tencent/bugly/proguard/s0;-><init>(BLjava/lang/String;[B)V

    .line 125
    const-string p1, "attach user log"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 126
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 127
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 3

    .line 19
    sget-object v0, Lcom/tencent/bugly/proguard/k3;->Q:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 20
    :try_start_0
    const-string v0, "Crash regular filter for crash stack is: %s"

    sget-object v2, Lcom/tencent/bugly/proguard/k3;->Q:Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 21
    sget-object v0, Lcom/tencent/bugly/proguard/k3;->Q:Ljava/lang/String;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 22
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 23
    const-string p0, "This crash matches the regular filter string set. It will not be record and upload."

    new-array v0, v1, [Ljava/lang/Object;

    .line 24
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, p0, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p0

    .line 25
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 26
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "Failed to compile "

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/bugly/proguard/k3;->Q:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array v0, v1, [Ljava/lang/Object;

    .line 27
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, p0, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_0
    return v1
.end method

.method public static c(Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/s0;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 25
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/s0;

    const-string v1, "log.txt"

    const-string/jumbo v2, "utf-8"

    .line 26
    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1, p1}, Lcom/tencent/bugly/proguard/s0;-><init>(BLjava/lang/String;[B)V

    .line 27
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 29
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method public static d(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Ljava/lang/String;
    .locals 3

    .line 13
    const-string v0, ""

    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/j3;->k:Ljava/util/Map;

    iget v2, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    if-nez v1, :cond_0

    .line 14
    const-string v1, "crash type error! %d"

    iget p0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v0

    :catch_0
    move-exception p0

    goto :goto_0

    .line 15
    :cond_0
    iget-boolean p0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->s:Z

    if-eqz p0, :cond_1

    .line 16
    iget-object p0, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    return-object p0

    .line 17
    :cond_1
    iget-object p0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 18
    :goto_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    return-object v0
.end method

.method public static e(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/w;",
            ">;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->q:Ljava/util/Map;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 12
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->q:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    iget-object p0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->q:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 14
    new-instance v2, Lcom/tencent/bugly/proguard/w;

    invoke-direct {v2}, Lcom/tencent/bugly/proguard/w;-><init>()V

    .line 15
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/crashreport/common/info/PlugInBean;

    iget-object v3, v3, Lcom/tencent/bugly/crashreport/common/info/PlugInBean;->b:Ljava/lang/String;

    iput-object v3, v2, Lcom/tencent/bugly/proguard/w;->q:Ljava/lang/String;

    .line 16
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/crashreport/common/info/PlugInBean;

    iget-object v3, v3, Lcom/tencent/bugly/crashreport/common/info/PlugInBean;->d:Ljava/lang/String;

    iput-object v3, v2, Lcom/tencent/bugly/proguard/w;->s:Ljava/lang/String;

    .line 17
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/crashreport/common/info/PlugInBean;

    iget-object v1, v1, Lcom/tencent/bugly/crashreport/common/info/PlugInBean;->c:Ljava/lang/String;

    iput-object v1, v2, Lcom/tencent/bugly/proguard/w;->u:Ljava/lang/String;

    .line 18
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static k(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Z
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/j3;->l:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lcom/tencent/bugly/proguard/j3$g;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0}, Lcom/tencent/bugly/proguard/j3$g;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Z

    .line 22
    move-result v2

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/j3$g;->a()Z

    .line 28
    move-result p0

    .line 29
    return p0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    return p0
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
.end method

.method public static l(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 5

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/tencent/bugly/proguard/j3;->j:Ljava/util/List;

    .line 3
    .line 4
    iget v1, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Lcom/tencent/bugly/proguard/ab;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ab;-><init>()V

    .line 21
    const/4 v2, 0x1

    .line 22
    .line 23
    iput v2, v0, Lcom/tencent/bugly/proguard/ab;->b:I

    .line 24
    .line 25
    iget-object v3, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->J:Ljava/lang/String;

    .line 26
    .line 27
    iput-object v3, v0, Lcom/tencent/bugly/proguard/ab;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->K:Ljava/lang/String;

    .line 30
    .line 31
    iput-object v3, v0, Lcom/tencent/bugly/proguard/ab;->d:Ljava/lang/String;

    .line 32
    .line 33
    iget-wide v3, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    .line 34
    .line 35
    iput-wide v3, v0, Lcom/tencent/bugly/proguard/ab;->e:J

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    .line 39
    move-result-object p0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/e4;->c(I)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    .line 46
    move-result-object p0

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/e4;->d(Lcom/tencent/bugly/proguard/ab;)Z

    .line 50
    .line 51
    const-string p0, "[crash] a crash occur, handling..."

    .line 52
    .line 53
    new-array v0, v1, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v0}, Lcom/tencent/bugly/proguard/x4;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 57
    return-void

    .line 58
    .line 59
    :cond_0
    const-string p0, "[crash] a caught exception occur, handling..."

    .line 60
    .line 61
    new-array v0, v1, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v0}, Lcom/tencent/bugly/proguard/x4;->e(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    return-void

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    .line 68
    .line 69
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 70
    return-void
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
.end method


# virtual methods
.method public a(Ljava/util/List;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e3;",
            ">;",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            ")",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;"
        }
    .end annotation

    if-eqz p1, :cond_4

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/e3;

    .line 4
    iget-boolean v3, v2, Lcom/tencent/bugly/proguard/e3;->f:Z

    if-eqz v3, :cond_1

    .line 5
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 7
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 9
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    const/4 v1, 0x0

    .line 10
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 11
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/util/List;)V

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    .line 12
    :goto_1
    invoke-static {v1, p2}, Lcom/tencent/bugly/proguard/j3;->b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    move-result-object v0

    .line 13
    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/j3;->b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/util/List;)V

    .line 14
    invoke-static {v0, p2}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    return-object v0

    :cond_4
    :goto_2
    return-object p2
.end method

.method public a(Landroid/database/Cursor;)Lcom/tencent/bugly/proguard/e3;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 129
    :cond_0
    :try_start_0
    new-instance v1, Lcom/tencent/bugly/proguard/e3;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/e3;-><init>()V

    .line 130
    const-string v2, "_id"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/proguard/e3;->b:J

    .line 131
    const-string v2, "_tm"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/proguard/e3;->c:J

    .line 132
    const-string v2, "_s1"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/bugly/proguard/e3;->d:Ljava/lang/String;

    .line 133
    const-string v2, "_up"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, v4, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    iput-boolean v2, v1, Lcom/tencent/bugly/proguard/e3;->e:Z

    .line 134
    const-string v2, "_me"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    if-ne v2, v4, :cond_2

    move v3, v4

    :cond_2
    iput-boolean v3, v1, Lcom/tencent/bugly/proguard/e3;->f:Z

    .line 135
    const-string v2, "_uc"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    iput p1, v1, Lcom/tencent/bugly/proguard/e3;->g:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception p1

    .line 136
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 137
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    return-object v0
.end method

.method public a()Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e3;",
            ">;"
        }
    .end annotation

    const-string v0, "_id"

    .line 138
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    .line 139
    :try_start_0
    const-string v3, "_id"

    const-string v4, "_tm"

    const-string v5, "_s1"

    const-string v6, "_up"

    const-string v7, "_me"

    const-string v8, "_uc"

    filled-new-array/range {v3 .. v8}, [Ljava/lang/String;

    move-result-object v11

    .line 140
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v9

    const-string/jumbo v10, "t_cr"

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-virtual/range {v9 .. v15}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)Landroid/database/Cursor;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-nez v3, :cond_1

    if-eqz v3, :cond_0

    .line 141
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    :cond_0
    return-object v2

    .line 142
    :cond_1
    :try_start_1
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v4, 0x1

    if-ge v2, v4, :cond_2

    .line 143
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    return-object v1

    .line 144
    :cond_2
    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " in "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "("

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v4, 0x0

    move v5, v4

    .line 146
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const-string v7, ","

    if-eqz v6, :cond_4

    move-object/from16 v6, p0

    .line 147
    :try_start_3
    invoke-virtual {v6, v3}, Lcom/tencent/bugly/proguard/j3;->a(Landroid/database/Cursor;)Lcom/tencent/bugly/proguard/e3;

    move-result-object v8

    if-eqz v8, :cond_3

    .line 148
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_1
    move-object v2, v3

    goto :goto_2

    .line 149
    :cond_3
    :try_start_4
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    .line 150
    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 151
    :catchall_1
    :try_start_5
    const-string/jumbo v7, "unknown id!"

    new-array v8, v4, [Ljava/lang/Object;

    invoke-static {v7, v8}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    move-object/from16 v6, p0

    .line 152
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v2, v4, v7}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v2, v0

    .line 154
    :cond_5
    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 156
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    if-lez v5, :cond_6

    .line 157
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v7

    const-string/jumbo v8, "t_cr"

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v10, 0x0

    invoke-virtual/range {v7 .. v12}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)I

    move-result v0

    .line 158
    const-string v2, "deleted %s illegal data %d"

    const-string/jumbo v4, "t_cr"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 159
    :cond_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    return-object v1

    :catchall_2
    move-exception v0

    move-object/from16 v6, p0

    goto :goto_1

    :catchall_3
    move-exception v0

    move-object/from16 v6, p0

    .line 160
    :goto_2
    :try_start_6
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v3

    if-nez v3, :cond_7

    .line 161
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_3

    :catchall_4
    move-exception v0

    goto :goto_4

    :cond_7
    :goto_3
    if-eqz v2, :cond_8

    .line 162
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_8
    return-object v1

    :goto_4
    if-eqz v2, :cond_9

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 163
    :cond_9
    throw v0
.end method

.method public a(Ljava/util/List;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e3;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            ">;"
        }
    .end annotation

    const-string v0, "_id"

    const/4 v1, 0x0

    if-eqz p1, :cond_c

    .line 98
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_5

    .line 99
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    const-string v3, "_id in ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, ","

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/proguard/e3;

    .line 102
    iget-wide v5, v3, Lcom/tencent/bugly/proguard/e3;->b:J

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 103
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v3, 0x0

    if-eqz p1, :cond_2

    .line 104
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v2, p1

    .line 105
    :cond_2
    const-string p1, ")"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 107
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 108
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v5

    const-string/jumbo v6, "t_cr"

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v5 .. v11}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)Landroid/database/Cursor;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v5, :cond_4

    if-eqz v5, :cond_3

    .line 109
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_3
    return-object v1

    .line 110
    :cond_4
    :try_start_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 111
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " in "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "("

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v7, v3

    .line 112
    :goto_1
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v8

    if-eqz v8, :cond_6

    .line 113
    invoke-virtual {p0, v5}, Lcom/tencent/bugly/proguard/j3;->b(Landroid/database/Cursor;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    move-result-object v8

    if-eqz v8, :cond_5

    .line 114
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    .line 115
    :cond_5
    :try_start_2
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v5, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    .line 116
    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 117
    :catchall_1
    :try_start_3
    const-string/jumbo v8, "unknown id!"

    new-array v9, v3, [Ljava/lang/Object;

    invoke-static {v8, v9}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_1

    .line 118
    :cond_6
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v2, v0

    .line 120
    :cond_7
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    if-lez v7, :cond_8

    .line 122
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v8

    const-string/jumbo v9, "t_cr"

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v11, 0x0

    invoke-virtual/range {v8 .. v13}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)I

    move-result p1

    .line 123
    const-string v0, "deleted %s illegal data %d"

    const-string/jumbo v2, "t_cr"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 124
    :cond_8
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    return-object v6

    :catchall_2
    move-exception v0

    move-object p1, v0

    move-object v5, v1

    .line 125
    :goto_2
    :try_start_4
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 126
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :cond_9
    :goto_3
    if-eqz v5, :cond_a

    .line 127
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_a
    return-object v1

    :goto_4
    if-eqz v5, :cond_b

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 128
    :cond_b
    throw p1

    :cond_c
    :goto_5
    return-object v1
.end method

.method public a(I)V
    .locals 7

    if-gtz p1, :cond_0

    goto :goto_0

    .line 164
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    const-string v1, "_id in (SELECT _id FROM t_cr order by _id limit "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 167
    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 p1, 0x0

    .line 169
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 170
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v1

    const-string/jumbo v2, "t_cr"

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)I

    move-result p1

    .line 171
    const-string v0, "deleted first record %s data %d"

    const-string/jumbo v1, "t_cr"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 172
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 173
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;JZ)V
    .locals 10

    .line 80
    sget-boolean v0, Lcom/tencent/bugly/proguard/k3;->I:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 81
    new-array v0, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "try to upload right now"

    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 82
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 83
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    iget p1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    const/4 v0, 0x7

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    move v8, v1

    move v9, p4

    move-object v3, p0

    move-wide v5, p2

    move v7, p4

    invoke-virtual/range {v3 .. v9}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/List;JZZZ)V

    return-void

    .line 85
    :cond_1
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "do not upload spot crash right now, crash would be uploaded when app next start"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;ZI)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 343
    iget-object v2, v0, Lcom/tencent/bugly/proguard/j3;->e:Lcom/tencent/bugly/proguard/zf;

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 344
    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "Calling \'onCrashSaving\' of RQD crash listener."

    invoke-static {v4, v3}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 345
    iget-object v5, v0, Lcom/tencent/bugly/proguard/j3;->e:Lcom/tencent/bugly/proguard/zf;

    iget-object v7, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    iget-object v8, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->x:Ljava/lang/String;

    iget-object v9, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->y:Ljava/lang/String;

    iget-object v10, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    iget-wide v12, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    iget-object v14, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->v:Ljava/lang/String;

    iget-object v15, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i:Ljava/lang/String;

    iget-object v3, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d:Ljava/lang/String;

    iget-object v4, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->J:Ljava/lang/String;

    iget-object v1, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->K:Ljava/lang/String;

    move/from16 v6, p2

    move/from16 v11, p3

    move-object/from16 v18, v1

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    invoke-interface/range {v5 .. v18}, Lcom/tencent/bugly/proguard/zf;->a(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 346
    new-array v1, v2, [Ljava/lang/Object;

    .line 347
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v3, "Crash listener \'onCrashSaving\' return \'false\' thus will not handle this crash."

    invoke-static {v2, v3, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public a(Ljava/util/List;JZZZ)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            ">;JZZZ)V"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/tencent/bugly/proguard/j3;->b:Lcom/tencent/bugly/proguard/rh;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 87
    new-array p1, v1, [Ljava/lang/Object;

    const-string/jumbo p2, "warn: upload manager is null"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_0
    if-nez p6, :cond_1

    .line 88
    sget v2, Lcom/tencent/bugly/proguard/k3;->n:I

    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/rh;->a(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 89
    new-array p1, v1, [Ljava/lang/Object;

    const-string/jumbo p2, "warn: not crashHappen or not should upload"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 90
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/j3;->d:Lcom/tencent/bugly/proguard/pg;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pg;->c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    move-result-object v0

    .line 91
    iget-boolean v0, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->d:Z

    if-nez v0, :cond_2

    .line 92
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "[crash] server closed bugly in this app. please check your app id if is correct, and re-install it"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_2
    if-eqz p1, :cond_5

    .line 93
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 94
    :cond_3
    sget-boolean v0, Lcom/tencent/bugly/proguard/l2;->H0:Z

    if-eqz v0, :cond_4

    .line 95
    iget-object v1, p0, Lcom/tencent/bugly/proguard/j3;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/tencent/bugly/proguard/j3;->b:Lcom/tencent/bugly/proguard/rh;

    move-object v3, p1

    move-wide v4, p2

    move/from16 v6, p4

    invoke-static/range {v1 .. v6}, Lcom/tencent/bugly/proguard/v3;->a(Landroid/content/Context;Lcom/tencent/bugly/proguard/rh;Ljava/util/List;JZ)V

    return-void

    .line 96
    :cond_4
    iget-object v3, p0, Lcom/tencent/bugly/proguard/j3;->a:Landroid/content/Context;

    iget-object v4, p0, Lcom/tencent/bugly/proguard/j3;->d:Lcom/tencent/bugly/proguard/pg;

    sget v5, Lcom/tencent/bugly/proguard/j3;->h:I

    iget-object v6, p0, Lcom/tencent/bugly/proguard/j3;->b:Lcom/tencent/bugly/proguard/rh;

    move-object v7, p1

    move-wide v8, p2

    move/from16 v10, p4

    move/from16 v11, p5

    invoke-static/range {v3 .. v11}, Lcom/tencent/bugly/proguard/v3;->a(Landroid/content/Context;Lcom/tencent/bugly/proguard/pg;ILcom/tencent/bugly/proguard/rh;Ljava/util/List;JZZ)V

    return-void

    .line 97
    :cond_5
    :goto_0
    new-array p1, v1, [Ljava/lang/Object;

    const-string/jumbo p2, "warn: crashList is null or crashList num is 0"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Z
    .locals 4

    .line 75
    iget v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-eq v0, v2, :cond_1

    const/4 v3, 0x3

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    .line 76
    :goto_1
    sget-boolean v3, Lcom/tencent/bugly/proguard/rc;->i:Z

    if-eqz v3, :cond_2

    return v1

    :cond_2
    if-nez v0, :cond_3

    .line 77
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/j3;->g:Z

    xor-int/2addr p1, v2

    return p1

    .line 78
    :cond_3
    iget-object p1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->f:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->K()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    .line 79
    :cond_4
    sget-boolean p1, Lcom/tencent/bugly/proguard/k3;->w:Z

    return p1

    :cond_5
    :goto_2
    return v1
.end method

.method public a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;IZ)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v1, :cond_0

    .line 30
    new-array v1, v3, [Ljava/lang/Object;

    const-string v2, "CrashBean is null, won\'t handle."

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v4

    .line 31
    :cond_0
    invoke-virtual/range {p0 .. p1}, Lcom/tencent/bugly/proguard/j3;->i(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 32
    iget v5, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    if-nez v5, :cond_1

    .line 33
    invoke-static {}, Lcom/tencent/bugly/proguard/se;->a()Lcom/tencent/bugly/proguard/se;

    move-result-object v5

    sget-object v6, Lcom/tencent/bugly/proguard/se$c;->i:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    invoke-virtual {v5, v6, v4, v4}, Lcom/tencent/bugly/proguard/se;->a(IZZ)V

    .line 34
    :cond_1
    iget v5, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    const/4 v6, 0x3

    if-ne v5, v6, :cond_2

    .line 35
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v5

    sget-object v7, Lcom/tencent/bugly/proguard/se$c;->i:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    invoke-virtual {v5, v7, v4}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyProcessingState(IZ)V

    .line 36
    :cond_2
    iget v5, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    const v7, -0x75bcd15

    if-ne v5, v4, :cond_3

    if-eq v2, v7, :cond_3

    .line 37
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v5

    sget-object v8, Lcom/tencent/bugly/proguard/se$c;->i:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    invoke-virtual {v5, v8, v4}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyProcessingState(IZ)V

    .line 38
    :cond_3
    iget v5, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    if-eq v5, v4, :cond_5

    .line 39
    iget-object v8, v0, Lcom/tencent/bugly/proguard/j3;->a:Landroid/content/Context;

    sget v9, Lcom/tencent/bugly/proguard/k3;->x:I

    sget v10, Lcom/tencent/bugly/proguard/k3;->y:I

    sget-object v11, Lcom/tencent/bugly/proguard/k3;->E:Ljava/lang/String;

    iget-wide v12, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    sget-wide v14, Lcom/tencent/bugly/proguard/k3;->K:J

    sget v16, Lcom/tencent/bugly/proguard/k3;->z:I

    invoke-static/range {v8 .. v16}, Lcom/tencent/bugly/proguard/bi;->a(Landroid/content/Context;IILjava/lang/String;JJI)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->F:Ljava/lang/String;

    if-eqz v5, :cond_5

    .line 40
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v8, 0x32

    if-lt v5, v8, :cond_5

    .line 41
    iget v5, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    if-nez v5, :cond_4

    .line 42
    invoke-static {}, Lcom/tencent/bugly/proguard/se;->a()Lcom/tencent/bugly/proguard/se;

    move-result-object v5

    sget-object v8, Lcom/tencent/bugly/proguard/se$b;->d:Lcom/tencent/bugly/proguard/se$b;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    invoke-virtual {v5, v8, v4}, Lcom/tencent/bugly/proguard/se;->a(IZ)V

    goto :goto_0

    :cond_4
    if-ne v5, v6, :cond_5

    .line 43
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v5

    sget-object v8, Lcom/tencent/bugly/proguard/se$b;->d:Lcom/tencent/bugly/proguard/se$b;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    invoke-virtual {v5, v8}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyAttachmentState(I)V

    :cond_5
    :goto_0
    if-eqz p3, :cond_6

    .line 44
    invoke-virtual/range {p0 .. p1}, Lcom/tencent/bugly/proguard/j3;->f(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 45
    :cond_6
    iget v5, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    if-nez v5, :cond_7

    .line 46
    invoke-static {}, Lcom/tencent/bugly/proguard/se;->a()Lcom/tencent/bugly/proguard/se;

    move-result-object v5

    sget-object v8, Lcom/tencent/bugly/proguard/se$c;->j:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    invoke-virtual {v5, v8, v3, v4}, Lcom/tencent/bugly/proguard/se;->a(IZZ)V

    .line 47
    :cond_7
    iget v5, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    if-ne v5, v6, :cond_8

    .line 48
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v5

    sget-object v6, Lcom/tencent/bugly/proguard/se$c;->j:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    invoke-virtual {v5, v6, v3}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyProcessingState(IZ)V

    .line 49
    :cond_8
    iget v5, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    if-ne v5, v4, :cond_9

    if-eq v2, v7, :cond_9

    .line 50
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v2

    sget-object v5, Lcom/tencent/bugly/proguard/se$c;->j:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    invoke-virtual {v2, v5, v3}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyProcessingState(IZ)V

    .line 51
    :cond_9
    iget-object v2, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    invoke-static {v2}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    return v4

    .line 52
    :cond_a
    iget-object v2, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    invoke-static {v2}, Lcom/tencent/bugly/proguard/j3;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    return v4

    .line 53
    :cond_b
    invoke-static {v1}, Lcom/tencent/bugly/proguard/j3;->l(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 54
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/j3;->a()Ljava/util/List;

    move-result-object v2

    .line 55
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz v2, :cond_d

    .line 56
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_d

    .line 57
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/j3;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 58
    invoke-interface {v2, v5}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 59
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    int-to-long v6, v6

    const-wide/16 v8, 0x14

    cmp-long v6, v6, v8

    if-lez v6, :cond_c

    const/4 v6, 0x5

    .line 60
    invoke-virtual {v0, v6}, Lcom/tencent/bugly/proguard/j3;->a(I)V

    .line 61
    :cond_c
    invoke-virtual {v0, v1, v2, v5}, Lcom/tencent/bugly/proguard/j3;->b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/util/List;Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_d

    return v4

    .line 62
    :cond_d
    invoke-virtual/range {p0 .. p1}, Lcom/tencent/bugly/proguard/j3;->i(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 63
    invoke-virtual/range {p0 .. p1}, Lcom/tencent/bugly/proguard/j3;->h(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 64
    invoke-virtual {v0, v5}, Lcom/tencent/bugly/proguard/j3;->c(Ljava/util/List;)V

    .line 65
    new-array v1, v3, [Ljava/lang/Object;

    const-string v2, "[crash] save crash success"

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v3
.end method

.method public a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Z)Z
    .locals 1

    const v0, -0x75bcd15

    .line 29
    invoke-virtual {p0, p1, v0, p2}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;IZ)Z

    move-result p1

    return p1
.end method

.method public final a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;IZI)[B
    .locals 9

    .line 329
    iget-object v0, p0, Lcom/tencent/bugly/proguard/j3;->e:Lcom/tencent/bugly/proguard/zf;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 330
    new-array p2, v1, [Ljava/lang/Object;

    const-string v0, "Calling \'getCrashExtraData\' of RQD crash listener."

    invoke-static {v0, p2}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 331
    iget-object v1, p0, Lcom/tencent/bugly/proguard/j3;->e:Lcom/tencent/bugly/proguard/zf;

    iget-object v3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    iget-object v4, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->y:Ljava/lang/String;

    iget-object v5, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    iget-wide v7, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    move v2, p3

    move v6, p4

    invoke-interface/range {v1 .. v8}, Lcom/tencent/bugly/proguard/zf;->getCrashExtraData(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)[B

    move-result-object p1

    return-object p1

    .line 332
    :cond_0
    iget-object p3, p0, Lcom/tencent/bugly/proguard/j3;->f:Lcom/tencent/bugly/proguard/b2$a;

    if-eqz p3, :cond_1

    .line 333
    new-array p3, v1, [Ljava/lang/Object;

    const-string p4, "Calling \'onCrashHandleStart2GetExtraDatas\' of Bugly crash listener."

    invoke-static {p4, p3}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 334
    iget-object p3, p0, Lcom/tencent/bugly/proguard/j3;->f:Lcom/tencent/bugly/proguard/b2$a;

    iget-object p4, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    iget-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->x:Ljava/lang/String;

    iget-object p1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    invoke-virtual {p3, p2, p4, v0, p1}, Lcom/tencent/bugly/proguard/b2$a;->b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public a(Ljava/util/List;Z)[B
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            ">;Z)[B"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 270
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 271
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/j3;->a:Landroid/content/Context;

    .line 272
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v2

    invoke-static {v1, p1, v2}, Lcom/tencent/bugly/proguard/j3;->a(Landroid/content/Context;Ljava/util/List;Lcom/tencent/bugly/proguard/l2;)Lcom/tencent/bugly/proguard/i5;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 273
    const-string p1, "create eupPkg fail!"

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 274
    :cond_1
    invoke-static {v1}, Lcom/tencent/bugly/proguard/ue;->a(Lcom/tencent/bugly/proguard/JceStruct;)[B

    move-result-object v1

    if-nez v1, :cond_2

    .line 275
    const-string/jumbo p1, "send encode fail!"

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v0

    .line 276
    :cond_2
    iget-object v2, p0, Lcom/tencent/bugly/proguard/j3;->a:Landroid/content/Context;

    const/16 v3, 0x276

    const/4 v4, 0x1

    invoke-static {v2, v3, v4, v1}, Lcom/tencent/bugly/proguard/ue;->a(Landroid/content/Context;IZ[B)Lcom/tencent/bugly/proguard/tf;

    move-result-object v1

    .line 277
    invoke-static {v1}, Lcom/tencent/bugly/proguard/ue;->a(Ljava/lang/Object;)[B

    move-result-object v1

    .line 278
    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/v3;->a(ZLjava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    .line 279
    :goto_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 280
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    :goto_1
    return-object v0
.end method

.method public b(Landroid/database/Cursor;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 101
    :cond_0
    :try_start_0
    const-string v1, "_dt"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    .line 102
    :cond_1
    const-string v2, "_id"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    .line 103
    sget-object p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/bi;->a([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    if-eqz p1, :cond_2

    .line 104
    iput-wide v2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    return-object p1

    .line 105
    :goto_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 106
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    return-object v0
.end method

.method public final b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Lcom/tencent/bugly/proguard/e3;
    .locals 3

    .line 28
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/e3;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/e3;-><init>()V

    .line 29
    iget-wide v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b:J

    iput-wide v1, v0, Lcom/tencent/bugly/proguard/e3;->b:J

    .line 30
    iget-wide v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    iput-wide v1, v0, Lcom/tencent/bugly/proguard/e3;->c:J

    .line 31
    iget-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->D:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/proguard/e3;->d:Ljava/lang/String;

    .line 32
    iget-boolean v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->g:Z

    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/e3;->e:Z

    .line 33
    iget-boolean v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->s:Z

    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/e3;->f:Z

    .line 34
    iget p1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->u:I

    iput p1, v0, Lcom/tencent/bugly/proguard/e3;->g:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception p1

    .line 35
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public b()Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 56
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->b()Lcom/tencent/bugly/proguard/pg;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/pg;->c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v1, :cond_0

    .line 57
    new-array v1, v3, [Ljava/lang/Object;

    const-string v3, "have not synced remote!"

    invoke-static {v3, v1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v2

    .line 58
    :cond_0
    iget-boolean v1, v1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->d:Z

    if-nez v1, :cond_1

    .line 59
    new-array v1, v3, [Ljava/lang/Object;

    const-string v4, "Crashreport remote closed, please check your APP ID correct and Version available, then uninstall and reinstall your app."

    invoke-static {v4, v1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 60
    new-array v1, v3, [Ljava/lang/Object;

    .line 61
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v4, "[init] WARNING! Crashreport closed by server, please check your APP ID correct and Version available, then uninstall and reinstall your app."

    invoke-static {v3, v4, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v2

    .line 62
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 63
    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->b()J

    move-result-wide v5

    .line 64
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/j3;->a()Ljava/util/List;

    move-result-object v1

    .line 65
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    const-string v8, "Size of crash list loaded from DB: %s"

    invoke-static {v8, v7}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 66
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    if-gtz v7, :cond_2

    return-object v2

    .line 67
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 68
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 69
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/j3;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 70
    invoke-interface {v1, v2}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 71
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 72
    :cond_3
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    .line 73
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/tencent/bugly/proguard/e3;

    .line 74
    iget-wide v10, v9, Lcom/tencent/bugly/proguard/e3;->c:J

    sget-wide v12, Lcom/tencent/bugly/proguard/k3;->D:J

    sub-long v12, v5, v12

    cmp-long v12, v10, v12

    if-gez v12, :cond_4

    .line 75
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    .line 77
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 78
    :cond_4
    iget-boolean v12, v9, Lcom/tencent/bugly/proguard/e3;->e:Z

    const-wide/32 v13, 0x5265c00

    if-eqz v12, :cond_6

    sub-long v12, v3, v13

    cmp-long v10, v10, v12

    if-ltz v10, :cond_5

    .line 79
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 80
    :cond_5
    iget-boolean v10, v9, Lcom/tencent/bugly/proguard/e3;->f:Z

    if-nez v10, :cond_3

    .line 81
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    .line 82
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 83
    :cond_6
    iget v12, v9, Lcom/tencent/bugly/proguard/e3;->g:I

    move-wide v15, v13

    int-to-long v13, v12

    const-wide/16 v17, 0x3

    cmp-long v12, v13, v17

    if-ltz v12, :cond_3

    sub-long v12, v3, v15

    cmp-long v10, v10, v12

    if-gez v10, :cond_3

    .line 84
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    .line 85
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 86
    :cond_7
    invoke-virtual {v0, v7}, Lcom/tencent/bugly/proguard/j3;->e(Ljava/util/List;)V

    .line 87
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_8

    .line 88
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/j3;->c(Ljava/util/List;)V

    .line 89
    :cond_8
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 90
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_a

    .line 91
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_a

    .line 92
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v3

    iget-object v3, v3, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    .line 93
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 94
    :cond_9
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    .line 95
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 96
    iget-object v6, v5, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->l:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    .line 97
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 98
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 99
    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_b

    .line 100
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/j3;->d(Ljava/util/List;)V

    :cond_b
    return-object v1
.end method

.method public b(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e3;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e3;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 5
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 6
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/proguard/e3;

    .line 7
    iget-boolean v4, v3, Lcom/tencent/bugly/proguard/e3;->e:Z

    if-eqz v4, :cond_1

    iget-wide v4, v3, Lcom/tencent/bugly/proguard/e3;->c:J

    const-wide/32 v6, 0x5265c00

    sub-long v6, v0, v6

    cmp-long v4, v4, v6

    if-gtz v4, :cond_1

    .line 8
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v2

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;IZI)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            "IZI)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 107
    iget-object v0, p0, Lcom/tencent/bugly/proguard/j3;->e:Lcom/tencent/bugly/proguard/zf;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 108
    new-array p2, v1, [Ljava/lang/Object;

    const-string v0, "Calling \'onCrashHandleStart\' of RQD crash listener."

    invoke-static {v0, p2}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 109
    iget-object p2, p0, Lcom/tencent/bugly/proguard/j3;->e:Lcom/tencent/bugly/proguard/zf;

    iget-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->x:Ljava/lang/String;

    invoke-interface {p2, p3, v0}, Lcom/tencent/bugly/proguard/zf;->onCrashHandleStart(ZLjava/lang/String;)V

    .line 110
    new-array p2, v1, [Ljava/lang/Object;

    .line 111
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v1, "Calling \'getCrashExtraMessage\' of RQD crash listener."

    invoke-static {v0, v1, p2}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 112
    iget-object v2, p0, Lcom/tencent/bugly/proguard/j3;->e:Lcom/tencent/bugly/proguard/zf;

    iget-object v4, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    iget-object v5, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->y:Ljava/lang/String;

    iget-object v6, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    iget-wide v8, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    move v3, p3

    move v7, p4

    invoke-interface/range {v2 .. v9}, Lcom/tencent/bugly/proguard/zf;->getCrashExtraMessage(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 113
    new-instance p2, Ljava/util/HashMap;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Ljava/util/HashMap;-><init>(I)V

    .line 114
    const-string/jumbo p3, "userData"

    invoke-virtual {p2, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    .line 115
    :cond_0
    iget-object p3, p0, Lcom/tencent/bugly/proguard/j3;->f:Lcom/tencent/bugly/proguard/b2$a;

    if-eqz p3, :cond_1

    .line 116
    new-array p3, v1, [Ljava/lang/Object;

    const-string p4, "Calling \'onCrashHandleStart\' of Bugly crash listener."

    invoke-static {p4, p3}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 117
    iget-object p3, p0, Lcom/tencent/bugly/proguard/j3;->f:Lcom/tencent/bugly/proguard/b2$a;

    iget-object p4, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    iget-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->x:Ljava/lang/String;

    iget-object p1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    invoke-virtual {p3, p2, p4, v0, p1}, Lcom/tencent/bugly/proguard/b2$a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/util/List;Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e3;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e3;",
            ">;)Z"
        }
    .end annotation

    .line 37
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 38
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    invoke-static {p1, p2, v0}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/util/List;Ljava/util/List;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 40
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    sget v2, Lcom/tencent/bugly/proguard/k3;->v:I

    if-lt p2, v2, :cond_5

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    .line 41
    :cond_1
    :goto_0
    const-string/jumbo p2, "same crash occur too much do merged!"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p2, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 42
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/List;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    move-result-object p2

    .line 43
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/e3;

    .line 44
    iget-wide v3, v2, Lcom/tencent/bugly/proguard/e3;->b:J

    iget-wide v5, p2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_2

    .line 45
    invoke-interface {p3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 46
    :cond_3
    iget-wide v2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b:J

    iget-wide v4, p2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_4

    .line 47
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/j3;->b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Lcom/tencent/bugly/proguard/e3;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 48
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    :cond_4
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/j3;->i(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 50
    invoke-virtual {p0, p3}, Lcom/tencent/bugly/proguard/j3;->c(Ljava/util/List;)V

    .line 51
    const-string p1, "[crash] save crash success. For this device crash many times, it will not upload crashes immediately"

    new-array p2, v1, [Ljava/lang/Object;

    .line 52
    sget-object p3, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {p3, p1, p2}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    .line 53
    :goto_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 54
    new-array p1, v1, [Ljava/lang/Object;

    .line 55
    sget-object p2, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string p3, "Failed to merge crash."

    invoke-static {p2, p3, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_5
    return v1
.end method

.method public c(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Landroid/content/ContentValues;
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    :try_start_0
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 2
    iget-wide v2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_1

    .line 3
    const-string v4, "_id"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    const-string v2, "_tm"

    iget-wide v3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 5
    const-string v2, "_s1"

    iget-object v3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->D:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    const-string v2, "_up"

    iget-boolean v3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->g:Z

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 7
    const-string v2, "_me"

    iget-boolean v3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->s:Z

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 8
    const-string v2, "_uc"

    iget v3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->u:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 9
    const-string v2, "_dt"

    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->a(Landroid/os/Parcelable;)[B

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    .line 10
    :goto_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    return-object v0
.end method

.method public c(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e3;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 12
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    const-string v1, "_id in ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, ","

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/e3;

    .line 16
    iget-wide v3, v1, Lcom/tencent/bugly/proguard/e3;->b:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 17
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    const-string v0, ")"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 20
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 21
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v3

    const-string/jumbo v4, "t_cr"

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v6, 0x0

    invoke-virtual/range {v3 .. v8}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)I

    move-result p1

    .line 22
    const-string v0, "deleted %s data %d"

    const-string/jumbo v1, "t_cr"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 23
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_1
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 4
    const-string v2, " or "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_id"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, 0x4

    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_2
    move-object v2, p1

    const/4 p1, 0x0

    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v0

    const-string/jumbo v1, "t_cr"

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)I

    move-result p1

    .line 10
    const-string v0, "deleted %s data %d"

    const-string/jumbo v1, "t_cr"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 11
    :goto_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    :goto_2
    return-void
.end method

.method public final e(Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e3;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 5
    sget-object v2, Lcom/tencent/bugly/proguard/j3;->o:Ljava/util/Map;

    iget v3, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    .line 6
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    iget-object v2, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d:Ljava/lang/String;

    filled-new-array {v2, v5}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "find expired data,crashId:%s eventType:%s"

    invoke-static {v3, v2}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 8
    new-instance v3, Lcom/tencent/bugly/proguard/cg$d;

    iget-object v4, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d:Ljava/lang/String;

    iget-wide v6, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    const-string v11, "expired"

    const/4 v12, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/tencent/bugly/proguard/cg$d;-><init>(Ljava/lang/String;Ljava/lang/String;JZJLjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_2
    invoke-static {}, Lcom/tencent/bugly/proguard/cg$b;->a()Lcom/tencent/bugly/proguard/cg;

    move-result-object p1

    .line 10
    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/cg;->b(Ljava/util/List;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public f(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 5

    .line 1
    .line 2
    const-string v0, "Cannot get crash type for crashBean type:"

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto/16 :goto_2

    .line 7
    .line 8
    :cond_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/j3;->f:Lcom/tencent/bugly/proguard/b2$a;

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lcom/tencent/bugly/proguard/j3;->e:Lcom/tencent/bugly/proguard/zf;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/j3;->k(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Z

    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    new-array p1, v2, [Ljava/lang/Object;

    .line 26
    .line 27
    const-string v0, "Should not call back."

    .line 28
    .line 29
    .line 30
    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 31
    return-void

    .line 32
    .line 33
    :cond_2
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/j3;->m:Ljava/util/Map;

    .line 34
    .line 35
    iget v3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    .line 36
    .line 37
    .line 38
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    .line 42
    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 43
    move-result v3

    .line 44
    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    iget p1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    new-array v0, v2, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 65
    return-void

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    goto :goto_1

    .line 68
    .line 69
    :cond_3
    iget v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    check-cast v0, Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 83
    move-result v0

    .line 84
    .line 85
    iget v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    .line 86
    const/4 v3, 0x1

    .line 87
    .line 88
    if-ne v1, v3, :cond_4

    .line 89
    goto :goto_0

    .line 90
    :cond_4
    move v3, v2

    .line 91
    .line 92
    .line 93
    :goto_0
    const v1, -0x499602d2

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p1, v0, v3, v1}, Lcom/tencent/bugly/proguard/j3;->b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;IZI)Ljava/util/Map;

    .line 97
    move-result-object v4

    .line 98
    .line 99
    .line 100
    invoke-static {p1, v4}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/util/Map;)V

    .line 101
    .line 102
    const-string v4, "[crash callback] start user\'s callback:onCrashHandleStart2GetExtraDatas()"

    .line 103
    .line 104
    new-array v2, v2, [Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    invoke-static {v4, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, p1, v0, v3, v1}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;IZI)[B

    .line 111
    move-result-object v0

    .line 112
    .line 113
    .line 114
    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;[B)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p1, v3, v1}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;ZI)V

    .line 118
    .line 119
    .line 120
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->H()I

    .line 125
    move-result v0

    .line 126
    .line 127
    iput v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->f0:I

    .line 128
    .line 129
    const-class v0, Lcom/tencent/bugly/proguard/l2;

    .line 130
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    .line 132
    :try_start_1
    sget-object v1, Lcom/tencent/bugly/proguard/l2;->C0:Lcom/tencent/bugly/proguard/l2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 133
    :try_start_2
    monitor-exit v0

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->A()I

    .line 137
    move-result v0

    .line 138
    .line 139
    iput v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->g0:I

    .line 140
    .line 141
    .line 142
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->i()Ljava/util/Map;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h0:Ljava/util/Map;

    .line 150
    .line 151
    .line 152
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    .line 153
    move-result-object v0

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->h()Ljava/util/Map;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i0:Ljava/util/Map;

    .line 160
    .line 161
    iget-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h0:Ljava/util/Map;

    .line 162
    .line 163
    if-nez v0, :cond_5

    .line 164
    .line 165
    new-instance v0, Ljava/util/HashMap;

    .line 166
    .line 167
    .line 168
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 169
    .line 170
    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h0:Ljava/util/Map;

    .line 171
    .line 172
    :cond_5
    iget-object p1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h0:Ljava/util/Map;

    .line 173
    .line 174
    const-string v0, "hasUserCallback"

    .line 175
    .line 176
    .line 177
    const-string/jumbo v1, "true"

    .line 178
    .line 179
    .line 180
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    return-void

    .line 182
    :catchall_1
    move-exception p1

    .line 183
    monitor-exit v0

    .line 184
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 185
    .line 186
    .line 187
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    move-result-object v0

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 192
    move-result-object v0

    .line 193
    .line 194
    .line 195
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 196
    move-result-object v0

    .line 197
    .line 198
    const-string v1, "crash handle callback something wrong! %s"

    .line 199
    .line 200
    .line 201
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 202
    .line 203
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 204
    .line 205
    .line 206
    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    .line 207
    move-result v0

    .line 208
    .line 209
    if-nez v0, :cond_6

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 213
    :cond_6
    :goto_2
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
.end method

.method public g(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 4

    .line 1
    .line 2
    iget v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    const/4 v2, 0x3

    .line 9
    .line 10
    if-eq v0, v2, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->r()Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-nez v0, :cond_3

    .line 22
    goto :goto_2

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->s()Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    goto :goto_2

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->s()Z

    .line 41
    move-result v0

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    goto :goto_2

    .line 45
    .line 46
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/j3;->e:Lcom/tencent/bugly/proguard/zf;

    .line 47
    .line 48
    if-eqz v0, :cond_5

    .line 49
    const/4 v0, 0x0

    .line 50
    .line 51
    new-array v2, v0, [Ljava/lang/Object;

    .line 52
    .line 53
    const-string v3, "Calling \'onCrashHandleEnd\' of RQD crash listener."

    .line 54
    .line 55
    .line 56
    invoke-static {v3, v2}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 57
    .line 58
    iget-object v2, p0, Lcom/tencent/bugly/proguard/j3;->e:Lcom/tencent/bugly/proguard/zf;

    .line 59
    .line 60
    iget p1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    .line 61
    .line 62
    if-ne p1, v1, :cond_4

    .line 63
    goto :goto_1

    .line 64
    :cond_4
    move v1, v0

    .line 65
    .line 66
    .line 67
    :goto_1
    invoke-interface {v2, v1}, Lcom/tencent/bugly/proguard/zf;->onCrashHandleEnd(Z)Z

    .line 68
    :cond_5
    :goto_2
    return-void
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
.end method

.method public final h(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 11

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/j3;->n:Ljava/util/Map;

    .line 3
    .line 4
    iget v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    move-object v3, v0

    .line 14
    .line 15
    check-cast v3, Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    return-void

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/cg$b;->a()Lcom/tencent/bugly/proguard/cg;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    new-instance v1, Lcom/tencent/bugly/proguard/cg$d;

    .line 29
    .line 30
    iget-object v2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d:Ljava/lang/String;

    .line 31
    .line 32
    iget-wide v4, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    .line 33
    .line 34
    .line 35
    const-string/jumbo v9, "realtime"

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v6, 0x1

    .line 38
    .line 39
    const-wide/16 v7, 0x0

    .line 40
    .line 41
    .line 42
    invoke-direct/range {v1 .. v10}, Lcom/tencent/bugly/proguard/cg$d;-><init>(Ljava/lang/String;Ljava/lang/String;JZJLjava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/cg;->b(Lcom/tencent/bugly/proguard/cg$d;)V

    .line 46
    return-void
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
.end method

.method public i(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 5

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/j3;->c(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Landroid/content/ContentValues;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    const-string/jumbo v4, "t_cr"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v4, v0, v2, v3}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;Landroid/content/ContentValues;Lcom/tencent/bugly/proguard/d4;Z)J

    .line 22
    move-result-wide v0

    .line 23
    .line 24
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    cmp-long v2, v0, v2

    .line 27
    .line 28
    if-ltz v2, :cond_1

    .line 29
    .line 30
    .line 31
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    const-string v3, "insert %s success!"

    .line 35
    .line 36
    .line 37
    invoke-static {v3, v2}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 38
    .line 39
    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b:J

    .line 40
    .line 41
    :cond_1
    sget-boolean v0, Lcom/tencent/bugly/proguard/k3;->F:Z

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/j3;->j(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 47
    :cond_2
    :goto_0
    return-void
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
.end method

.method public final j(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 6

    .line 1
    .line 2
    const-string v0, "#--------\npackage:"

    .line 3
    .line 4
    .line 5
    :try_start_0
    const-string/jumbo v1, "save eup logs"

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    new-array v2, v2, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    iget-object v2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->l:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->k:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v4, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->J:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v5, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v0, "\nversion:"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v0, "\nsdk:"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v0, "\nprocess:"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v0, "\ndate:"

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    new-instance v0, Ljava/util/Date;

    .line 65
    .line 66
    iget-wide v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->b(Ljava/util/Date;)Ljava/lang/String;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v0, "\ntype:"

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    iget-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v0, "\nmessage:"

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    iget-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->x:Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v0, "\nstack:\n"

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    iget-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v0, "\neupID:"

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    iget-object p1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d:Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string p1, "\n"

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    move-result-object p1

    .line 126
    .line 127
    sget-object v0, Lcom/tencent/bugly/proguard/k3;->G:Ljava/lang/String;

    .line 128
    .line 129
    if-nez v0, :cond_1

    .line 130
    .line 131
    iget-object v0, p0, Lcom/tencent/bugly/proguard/j3;->a:Landroid/content/Context;

    .line 132
    .line 133
    const-string v1, "/Tencent/Bugly"

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 137
    move-result-object v0

    .line 138
    .line 139
    if-eqz v0, :cond_0

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 143
    move-result-object v0

    .line 144
    goto :goto_0

    .line 145
    :catchall_0
    move-exception p1

    .line 146
    goto :goto_1

    .line 147
    :cond_0
    const/4 v0, 0x0

    .line 148
    goto :goto_0

    .line 149
    .line 150
    :cond_1
    new-instance v0, Ljava/io/File;

    .line 151
    .line 152
    sget-object v1, Lcom/tencent/bugly/proguard/k3;->G:Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 159
    move-result v1

    .line 160
    .line 161
    if-eqz v1, :cond_2

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 165
    move-result-object v0

    .line 166
    .line 167
    .line 168
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 169
    move-result-object v0

    .line 170
    .line 171
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    const-string v0, "/euplog.txt"

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    move-result-object v0

    .line 187
    .line 188
    sget v1, Lcom/tencent/bugly/proguard/k3;->H:I

    .line 189
    .line 190
    .line 191
    invoke-static {v0, p1, v1}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/lang/String;Ljava/lang/String;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    return-void

    .line 193
    .line 194
    .line 195
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 196
    move-result-object v0

    .line 197
    .line 198
    .line 199
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 200
    move-result-object v0

    .line 201
    .line 202
    .line 203
    const-string/jumbo v1, "rqdp{  save error} %s"

    .line 204
    .line 205
    .line 206
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 207
    .line 208
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 209
    .line 210
    .line 211
    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    .line 212
    move-result v0

    .line 213
    .line 214
    if-nez v0, :cond_3

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 218
    :cond_3
    return-void
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
