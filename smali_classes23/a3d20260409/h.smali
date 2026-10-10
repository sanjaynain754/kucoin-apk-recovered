.class public La3d20260409/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La3d20260409/h$o;,
        La3d20260409/h$i;
    }
.end annotation


# instance fields
.field public final A:Ljava/lang/Object;

.field public B:Lorg/json/JSONObject;

.field public final C:Lg/e;

.field public final D:Lwe0/c;

.field public final E:Lwe0/g;

.field public F:J

.field public G:J

.field public volatile H:Z

.field public volatile I:Z

.field public J:La3d20260409/d;

.field public K:I

.field public L:La3d20260409/o0o00;

.field public final a:Landroid/content/Context;

.field public b:J

.field public c:Laai/liveness/Detector$DetectionType;

.field public d:Lc/a;

.field public volatile e:Z

.field public f:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "La3d20260409/d;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "La3d20260409/c;",
            ">;"
        }
    .end annotation
.end field

.field public h:La3d20260409/h$o;

.field public i:Lc/b;

.field public j:La3d20260409/f;

.field public k:I

.field public l:Ljava/util/concurrent/ExecutorService;

.field public m:La3d20260409/c;

.field public n:La3d20260409/c;

.field public o:La3d20260409/c;

.field public final p:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final q:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final r:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final s:Landroid/content/res/AssetManager;

.field public final t:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final u:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final v:Lk/e;

.field public final w:Lk/e;

.field public final x:Lk/e;

.field public final y:La3d20260409/k;

.field public z:Lintl/OoOOoOoO;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lg/e;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0x5a

    .line 6
    .line 7
    iput v0, p0, La3d20260409/h;->k:I

    .line 8
    .line 9
    new-instance v0, Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    iput-object v0, p0, La3d20260409/h;->A:Ljava/lang/Object;

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    iput-boolean v0, p0, La3d20260409/h;->I:Z

    .line 18
    .line 19
    sget-object v1, Lintl/OoOOoOoO;->OOOOooOOOO:Lintl/OoOOoOoO;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 23
    .line 24
    iput-object p2, p0, La3d20260409/h;->C:Lg/e;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    iput-object p2, p0, La3d20260409/h;->a:Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    invoke-static {}, La3d20260409/s;->i()I

    .line 34
    move-result v1

    .line 35
    .line 36
    .line 37
    invoke-static {v1, p1}, Lk/c;->e(ILandroid/app/Activity;)I

    .line 38
    move-result v1

    .line 39
    .line 40
    iput v1, p0, La3d20260409/h;->k:I

    .line 41
    .line 42
    new-instance v1, La3d20260409/f;

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, p2}, La3d20260409/f;-><init>(Landroid/content/Context;)V

    .line 46
    .line 47
    iput-object v1, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    iput-object p1, p0, La3d20260409/h;->s:Landroid/content/res/AssetManager;

    .line 54
    .line 55
    new-instance p1, Lwe0/g;

    .line 56
    .line 57
    .line 58
    invoke-direct {p1}, Lwe0/g;-><init>()V

    .line 59
    .line 60
    iput-object p1, p0, La3d20260409/h;->E:Lwe0/g;

    .line 61
    .line 62
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 66
    .line 67
    iput-object p1, p0, La3d20260409/h;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 68
    .line 69
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 70
    .line 71
    .line 72
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 73
    .line 74
    iput-object p1, p0, La3d20260409/h;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 75
    .line 76
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 77
    .line 78
    .line 79
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 80
    .line 81
    iput-object p1, p0, La3d20260409/h;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 82
    .line 83
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 87
    .line 88
    iput-object p1, p0, La3d20260409/h;->t:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 89
    .line 90
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 91
    .line 92
    .line 93
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 94
    .line 95
    iput-object p1, p0, La3d20260409/h;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 96
    .line 97
    new-instance p1, Lk/e;

    .line 98
    .line 99
    .line 100
    invoke-direct {p1}, Lk/e;-><init>()V

    .line 101
    .line 102
    iput-object p1, p0, La3d20260409/h;->v:Lk/e;

    .line 103
    .line 104
    new-instance p1, Lk/e;

    .line 105
    .line 106
    .line 107
    invoke-direct {p1}, Lk/e;-><init>()V

    .line 108
    .line 109
    iput-object p1, p0, La3d20260409/h;->w:Lk/e;

    .line 110
    .line 111
    new-instance p1, Lk/e;

    .line 112
    .line 113
    .line 114
    invoke-direct {p1}, Lk/e;-><init>()V

    .line 115
    .line 116
    iput-object p1, p0, La3d20260409/h;->x:Lk/e;

    .line 117
    .line 118
    new-instance p1, La3d20260409/k;

    .line 119
    .line 120
    .line 121
    invoke-direct {p1}, La3d20260409/k;-><init>()V

    .line 122
    .line 123
    iput-object p1, p0, La3d20260409/h;->y:La3d20260409/k;

    .line 124
    .line 125
    new-instance p1, Lwe0/c;

    .line 126
    .line 127
    .line 128
    invoke-direct {p1}, Lwe0/c;-><init>()V

    .line 129
    .line 130
    iput-object p1, p0, La3d20260409/h;->D:Lwe0/c;

    .line 131
    .line 132
    sget-object p1, La3d20260409/O0000o0o0;->OOOOooOOOO:La3d20260409/O0000o0o0;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p1}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 136
    .line 137
    sget-object p1, Lintl/OoooOOOoooooo;->OoooOOOoooooo:Lintl/OoooOOOoooooo;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, p1}, La3d20260409/h;->H(Lintl/OoooOOOoooooo;)V

    .line 141
    .line 142
    sget-object p1, Lintl/OoOOoOoO;->O0OOOoOooo:Lintl/OoOOoOoO;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, p1}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, La3d20260409/h;->U()V

    .line 149
    .line 150
    new-instance p1, La3d20260409/h$n;

    .line 151
    .line 152
    .line 153
    invoke-direct {p1, p0}, La3d20260409/h$n;-><init>(La3d20260409/h;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, p1}, La3d20260409/h;->j(Lg/a;)V

    .line 157
    return-void
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
.end method

.method public static synthetic A(La3d20260409/h;Lintl/OoooOOOoooooo;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, La3d20260409/h;->H(Lintl/OoooOOOoooooo;)V

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
.end method

.method public static synthetic B(La3d20260409/h;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, La3d20260409/h;->k(Ljava/lang/String;)V

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
.end method

.method public static synthetic N(La3d20260409/h;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, La3d20260409/h;->e:Z

    .line 3
    return p1
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
.end method

.method public static synthetic P(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    return-object p0
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
.end method

.method public static synthetic R(La3d20260409/h;La3d20260409/c;)La3d20260409/c;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/h;->o:La3d20260409/c;

    .line 3
    return-object p1
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
.end method

.method public static synthetic S(Z)Lg/c;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lg/c$b;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "no_best_image"

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lg/c$b;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const-string p0, "distant_image_empty"

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    const-string/jumbo p0, "near_image_empty"

    .line 17
    .line 18
    .line 19
    :goto_0
    const-string/jumbo v1, "label"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, p0}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 23
    move-result-object p0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lg/c$b;->d()Lg/c;

    .line 27
    move-result-object p0

    .line 28
    return-object p0
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
.end method

.method public static synthetic T(La3d20260409/h;)Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->g:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 3
    return-object p0
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
.end method

.method public static synthetic V(La3d20260409/h;)Lk/e;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->w:Lk/e;

    .line 3
    return-object p0
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
.end method

.method public static synthetic X(La3d20260409/h;)La3d20260409/o0o00;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->L:La3d20260409/o0o00;

    .line 3
    return-object p0
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
.end method

.method public static synthetic Z(La3d20260409/h;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, La3d20260409/h;->e:Z

    .line 3
    return p0
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
.end method

.method public static synthetic a(Z)Lg/c;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, La3d20260409/h;->S(Z)Lg/c;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic a0(La3d20260409/h;)Lk/e;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->v:Lk/e;

    .line 3
    return-object p0
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
.end method

.method public static synthetic b(La3d20260409/h;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, La3d20260409/h;->b:J

    .line 3
    return-wide v0
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
.end method

.method public static c0()J
    .locals 2

    .line 1
    .line 2
    sget-wide v0, La3d20260409/s;->h:J

    .line 3
    return-wide v0
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
.end method

.method public static synthetic d(La3d20260409/h;La3d20260409/c;)La3d20260409/c;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/h;->n:La3d20260409/c;

    .line 3
    return-object p1
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
.end method

.method public static synthetic d0(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    return-object p0
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
.end method

.method public static synthetic f(La3d20260409/h;)Lwe0/c;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->D:Lwe0/c;

    .line 3
    return-object p0
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
.end method

.method public static synthetic g0(La3d20260409/h;)Ljava/util/concurrent/BlockingQueue;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->f:Ljava/util/concurrent/BlockingQueue;

    .line 3
    return-object p0
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
.end method

.method public static synthetic h(La3d20260409/h;Lg/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, La3d20260409/h;->E(Lg/a;)V

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
.end method

.method public static synthetic h0(La3d20260409/h;)La3d20260409/c;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->n:La3d20260409/c;

    .line 3
    return-object p0
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
.end method

.method public static synthetic i(La3d20260409/h;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, La3d20260409/h;->I(Ljava/lang/String;)V

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
.end method

.method public static synthetic j0(La3d20260409/h;)La3d20260409/c;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->o:La3d20260409/c;

    .line 3
    return-object p0
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
.end method

.method public static synthetic l(La3d20260409/h;)Lwe0/g;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->E:Lwe0/g;

    .line 3
    return-object p0
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
.end method

.method public static synthetic l0(La3d20260409/h;)Lg/e;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->C:Lg/e;

    .line 3
    return-object p0
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
.end method

.method public static synthetic m(La3d20260409/h;)Lc/a;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->d:Lc/a;

    .line 3
    return-object p0
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
.end method

.method public static synthetic n0(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->t:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    return-object p0
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
.end method

.method public static synthetic o(La3d20260409/h;)Landroid/content/Context;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->a:Landroid/content/Context;

    .line 3
    return-object p0
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
.end method

.method public static synthetic o0(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    return-object p0
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
.end method

.method public static synthetic p0(La3d20260409/h;)La3d20260409/c;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->m:La3d20260409/c;

    .line 3
    return-object p0
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
.end method

.method public static synthetic q()J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, La3d20260409/h;->c0()J

    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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
.end method

.method public static synthetic r(La3d20260409/h;La3d20260409/c;)La3d20260409/c;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/h;->m:La3d20260409/c;

    .line 3
    return-object p1
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
.end method

.method public static synthetic r0(La3d20260409/h;)Lk/e;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->x:Lk/e;

    .line 3
    return-object p0
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
.end method

.method public static synthetic s(La3d20260409/h;Laai/liveness/Detector$DetectionType;)Laai/liveness/Detector$DetectionType;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/h;->c:Laai/liveness/Detector$DetectionType;

    .line 3
    return-object p1
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
.end method

.method public static synthetic t(La3d20260409/h;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->B:Lorg/json/JSONObject;

    .line 3
    return-object p0
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
.end method

.method public static synthetic t0(La3d20260409/h;)Lintl/OoOOoOoO;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->z:Lintl/OoOOoOoO;

    .line 3
    return-object p0
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
.end method

.method public static synthetic u0(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    return-object p0
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
.end method

.method public static synthetic v0(La3d20260409/h;)Laai/liveness/Detector$DetectionType;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h;->c:Laai/liveness/Detector$DetectionType;

    .line 3
    return-object p0
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
.end method

.method public static synthetic x(La3d20260409/h;La3d20260409/O0000o0o0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

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
.end method

.method public static synthetic y(La3d20260409/h;La3d20260409/O0000o0o0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La3d20260409/h;->w(La3d20260409/O0000o0o0;Ljava/lang/Object;)V

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
.end method

.method public static synthetic y0(La3d20260409/h;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/h;->g()V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static synthetic z(La3d20260409/h;Lg/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, La3d20260409/h;->j(Lg/a;)V

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
.end method


# virtual methods
.method public A0(Lc/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/h;->d:Lc/a;

    .line 3
    return-void
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
.end method

.method public C(La3d20260409/o0o00;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/h;->L:La3d20260409/o0o00;

    .line 3
    return-void
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
.end method

.method public final D(Laai/liveness/http/entity/ResultEntity;JLg/e;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, La3d20260409/h$p;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p2, p3, p1}, La3d20260409/h$p;-><init>(La3d20260409/h;JLaai/liveness/http/entity/ResultEntity;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, p4}, Lf/h;->y(Lg/a;Lg/e;)V

    .line 13
    return-void
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
.end method

.method public final E(Lg/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/a<",
            "Lg/b;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, La3d20260409/h;->C:Lg/e;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, Lf/h;->y(Lg/a;Lg/e;)V

    .line 10
    return-void
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
.end method

.method public final F(Lg/e;)V
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lintl/oOooooooo0000000000;->oOoOOOOOooooo:Lintl/oOooooooo0000000000;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, La3d20260409/v;->r(Lintl/oOooooooo0000000000;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    const-string/jumbo v1, "wait_bk_cam_start"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, p1}, Lf/h;->G(Ljava/lang/String;Lg/e;)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    move-result-wide v0

    .line 24
    .line 25
    .line 26
    invoke-static {}, La3d20260409/j3d20260409;->OOoooOO000000()I

    .line 27
    move-result v2

    .line 28
    .line 29
    const/16 v3, 0x64

    .line 30
    add-int/2addr v2, v3

    .line 31
    div-int/2addr v2, v3

    .line 32
    const/4 v4, 0x0

    .line 33
    .line 34
    :goto_0
    if-ge v4, v2, :cond_2

    .line 35
    .line 36
    .line 37
    invoke-static {}, La3d20260409/v;->h()Z

    .line 38
    move-result v5

    .line 39
    .line 40
    if-eqz v5, :cond_1

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    int-to-long v5, v3

    .line 43
    .line 44
    .line 45
    :try_start_0
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    goto :goto_1

    .line 47
    :catch_0
    move-exception v5

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v5}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 53
    goto :goto_0

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_2
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    new-instance v3, La3d20260409/h$k;

    .line 60
    .line 61
    .line 62
    invoke-direct {v3, p0, v0, v1}, La3d20260409/h$k;-><init>(La3d20260409/h;J)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v3, p1}, Lf/h;->F(Lg/a;Lg/e;)V

    .line 66
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
.end method

.method public G(Lintl/OoOOoOoO;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h;->A:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iput-object p1, p0, La3d20260409/h;->z:Lintl/OoOOoOoO;

    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1
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
.end method

.method public final H(Lintl/OoooOOOoooooo;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    iget-object v1, p0, La3d20260409/h;->C:Lg/e;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1, v1}, Lf/h;->z(Ljava/lang/String;Lg/e;)V

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
.end method

.method public final I(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, La3d20260409/h;->J(Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    return-void
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
.end method

.method public final J(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, La3d20260409/f;->V(Ljava/lang/String;Ljava/lang/Object;)V

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
.end method

.method public K(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, La3d20260409/f;->W(Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iget-object v1, p0, La3d20260409/h;->C:Lg/e;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1, v1}, Lf/h;->I(Ljava/lang/Throwable;Lg/e;)V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public L(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, La3d20260409/f;->Z(Z)V

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
.end method

.method public final M(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    if-nez p1, :cond_1

    .line 3
    .line 4
    const-string v0, "NO_RESPONSE"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lintl/OOOoooooo;->OOOOooooo:Lintl/OOOoooooo;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, La3d20260409/u;->b(Lintl/OOOoooooo;)V

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    const-string v1, "AUTH_"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, La3d20260409/u;->c(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-static {p3}, La3d20260409/u;->k(Ljava/lang/String;)V

    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, La3d20260409/h;->i:Lc/b;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, p1, p2, p3}, Lc/b;->d(ZLjava/lang/String;Ljava/lang/String;)V

    .line 47
    :cond_2
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
.end method

.method public final O([BLandroid/hardware/Camera$Size;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, La3d20260409/j3d20260409;->oo0ooO([B)Z

    .line 4
    move-result p1

    .line 5
    .line 6
    sget-boolean p2, La3d20260409/s;->d:Z

    .line 7
    return p1
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
.end method

.method public Q()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h;->h:La3d20260409/h$o;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, La3d20260409/h$o;->c()V

    .line 8
    :cond_0
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
.end method

.method public final U()V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Lm/h;

    .line 3
    .line 4
    iget-object v1, p0, La3d20260409/h;->a:Landroid/content/Context;

    .line 5
    .line 6
    const-string v2, "LIVENESS_RISK_INFO"

    .line 7
    .line 8
    const-string v3, "1.0"

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3}, Lm/h;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lm/h;->u()Lorg/json/JSONObject;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iput-object v0, p0, La3d20260409/h;->B:Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :catch_0
    return-void
    .line 19
    .line 20
.end method

.method public final W()Lorg/json/JSONObject;
    .locals 5

    .line 1
    .line 2
    const-string v0, "info"

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v1}, La3d20260409/h;->e(Z)Lorg/json/JSONObject;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    const-string/jumbo v3, "risk"

    .line 15
    .line 16
    iget-object v4, p0, La3d20260409/h;->B:Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    const-string v4, "detail"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    return-object v1

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 35
    return-object v1
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
.end method

.method public final Y()V
    .locals 1

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, La3d20260409/h;->h:La3d20260409/h$o;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, La3d20260409/h;->h:La3d20260409/h$o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public final b0()V
    .locals 6

    .line 1
    .line 2
    iget-boolean v0, p0, La3d20260409/h;->H:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_4

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, La3d20260409/h;->D:Lwe0/c;

    .line 9
    .line 10
    .line 11
    invoke-static {}, La3d20260409/v;->L()I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lwe0/c;->i(I)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, La3d20260409/j3d20260409;->O0ooooo00o00ooOO0o00()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    new-instance v1, La3d20260409/h$e;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, La3d20260409/h$e;-><init>(La3d20260409/h;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1}, La3d20260409/h;->j(Lg/a;)V

    .line 28
    .line 29
    .line 30
    const-string/jumbo v0, "sdk auth success"

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lk/h;->f(Ljava/lang/String;)V

    .line 34
    .line 35
    sget-object v0, La3d20260409/O0000o0o0;->OOOOOoooooooO:La3d20260409/O0000o0o0;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 39
    .line 40
    iget-object v0, p0, La3d20260409/h;->s:Landroid/content/res/AssetManager;

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 48
    move-result-wide v0

    .line 49
    .line 50
    sget-object v2, Lintl/OoOOoOoO;->O0000o0o0:Lintl/OoOOoOoO;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v2}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 54
    .line 55
    iget-object v2, p0, La3d20260409/h;->s:Landroid/content/res/AssetManager;

    .line 56
    .line 57
    .line 58
    invoke-static {v2}, La3d20260409/v;->l(Landroid/content/res/AssetManager;)J

    .line 59
    move-result-wide v2

    .line 60
    .line 61
    iput-wide v2, p0, La3d20260409/h;->b:J

    .line 62
    .line 63
    sget-object v2, Lintl/OoOOoOoO;->Oo000ooo00:Lintl/OoOOoOoO;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v2}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 67
    .line 68
    iget-wide v2, p0, La3d20260409/h;->b:J

    .line 69
    .line 70
    const-wide/16 v4, 0x0

    .line 71
    .line 72
    cmp-long v2, v2, v4

    .line 73
    .line 74
    if-nez v2, :cond_2

    .line 75
    .line 76
    sget-object v2, La3d20260409/O0000o0o0;->OOOOOoooo:La3d20260409/O0000o0o0;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v2}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 80
    .line 81
    sget-object v2, Lintl/OOOoooooo;->OOooOOOOO:Lintl/OOOoooooo;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    move-result-object v2

    .line 86
    const/4 v3, 0x0

    .line 87
    .line 88
    .line 89
    const-string/jumbo v4, "model error"

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v3, v2, v4}, La3d20260409/h;->M(ZLjava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    new-instance v2, La3d20260409/h$m;

    .line 95
    .line 96
    .line 97
    invoke-direct {v2, p0, v0, v1}, La3d20260409/h$m;-><init>(La3d20260409/h;J)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v2}, La3d20260409/h;->E(Lg/a;)V

    .line 101
    return-void

    .line 102
    .line 103
    :cond_2
    new-instance v2, La3d20260409/h$j;

    .line 104
    .line 105
    .line 106
    invoke-direct {v2, p0, v0, v1}, La3d20260409/h$j;-><init>(La3d20260409/h;J)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v2}, La3d20260409/h;->E(Lg/a;)V

    .line 110
    .line 111
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 112
    .line 113
    .line 114
    invoke-static {}, La3d20260409/v;->N()I

    .line 115
    move-result v1

    .line 116
    .line 117
    .line 118
    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    .line 119
    .line 120
    iput-object v0, p0, La3d20260409/h;->f:Ljava/util/concurrent/BlockingQueue;

    .line 121
    .line 122
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 123
    .line 124
    .line 125
    invoke-static {}, La3d20260409/v;->K()I

    .line 126
    move-result v1

    .line 127
    .line 128
    .line 129
    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    .line 130
    .line 131
    iput-object v0, p0, La3d20260409/h;->g:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 132
    .line 133
    .line 134
    invoke-static {}, La3d20260409/v;->U()I

    .line 135
    move-result v0

    .line 136
    const/4 v1, 0x1

    .line 137
    add-int/2addr v0, v1

    .line 138
    .line 139
    .line 140
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    iput-object v0, p0, La3d20260409/h;->l:Ljava/util/concurrent/ExecutorService;

    .line 144
    .line 145
    sget-object v0, La3d20260409/O0000o0o0;->OOOOooooo:La3d20260409/O0000o0o0;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v0}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 149
    .line 150
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, La3d20260409/f;->l0()V

    .line 154
    .line 155
    const-string v0, ""

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v1, v0, v0}, La3d20260409/h;->M(ZLjava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    iget-wide v2, p0, La3d20260409/h;->G:J

    .line 161
    .line 162
    cmp-long v0, v2, v4

    .line 163
    .line 164
    if-eqz v0, :cond_3

    .line 165
    .line 166
    sget-object v0, La3d20260409/O0000o0o0;->ooooOOOOO:La3d20260409/O0000o0o0;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v0}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 170
    .line 171
    :try_start_0
    iget-wide v2, p0, La3d20260409/h;->G:J

    .line 172
    .line 173
    .line 174
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    goto :goto_0

    .line 176
    :catchall_0
    move-exception v0

    .line 177
    .line 178
    sget-object v2, La3d20260409/O0000o0o0;->OOooOOOOO:La3d20260409/O0000o0o0;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, v2}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, v0}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    :cond_3
    :goto_0
    invoke-static {}, La3d20260409/v;->M()I

    .line 188
    move-result v0

    .line 189
    .line 190
    if-lez v0, :cond_5

    .line 191
    .line 192
    .line 193
    const-string/jumbo v2, "prepare_wait_start"

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v2}, La3d20260409/h;->I(Ljava/lang/String;)V

    .line 197
    .line 198
    :try_start_1
    iget-object v2, p0, La3d20260409/h;->d:Lc/a;

    .line 199
    .line 200
    if-eqz v2, :cond_4

    .line 201
    .line 202
    new-instance v2, La3d20260409/j;

    .line 203
    .line 204
    sget-object v3, Laai/liveness/Detector$WarnCode;->FACENOTCENTER:Laai/liveness/Detector$WarnCode;

    .line 205
    .line 206
    .line 207
    invoke-direct {v2, v3}, La3d20260409/j;-><init>(Laai/liveness/Detector$WarnCode;)V

    .line 208
    .line 209
    iput-boolean v1, v2, La3d20260409/j;->b:Z

    .line 210
    .line 211
    iget-object v1, p0, La3d20260409/h;->d:Lc/a;

    .line 212
    .line 213
    .line 214
    invoke-interface {v1, v2}, Lc/a;->m(La3d20260409/j;)V

    .line 215
    goto :goto_1

    .line 216
    :catchall_1
    move-exception v0

    .line 217
    goto :goto_2

    .line 218
    .line 219
    :cond_4
    :goto_1
    sget-object v1, Lintl/OoOOoOoO;->oo00oOO:Lintl/OoOOoOoO;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, v1}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 223
    int-to-long v0, v0

    .line 224
    .line 225
    .line 226
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 227
    .line 228
    sget-object v0, Lintl/OoOOoOoO;->o0O0O:Lintl/OoOOoOoO;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0, v0}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 232
    goto :goto_3

    .line 233
    .line 234
    .line 235
    :goto_2
    invoke-virtual {p0, v0}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 236
    .line 237
    .line 238
    :goto_3
    const-string/jumbo v0, "prepare_wait_finished"

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, v0}, La3d20260409/h;->I(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :cond_5
    invoke-virtual {p0}, La3d20260409/h;->i0()V

    .line 245
    :goto_4
    return-void
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
.end method

.method public c()V
    .locals 2

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, La3d20260409/h;->h:La3d20260409/h$o;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, v0, La3d20260409/h$o;->i:I

    .line 7
    .line 8
    sget-object v1, Lintl/o0oOOOOOooooo;->OOOOooooo:Lintl/o0oOOOOOooooo;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 12
    move-result v1

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    sget-object v0, Lintl/OoooOOOoooooo;->Oo000ooo00:Lintl/OoooOOOoooooo;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, La3d20260409/h;->H(Lintl/OoooOOOoooooo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    :catch_0
    :cond_0
    return-void
.end method

.method public final e(Z)Lorg/json/JSONObject;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 3
    .line 4
    iget-object v1, p0, La3d20260409/h;->x:Lk/e;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lk/e;->a()F

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, La3d20260409/f;->d0(F)V

    .line 12
    .line 13
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 14
    .line 15
    iget-object v1, p0, La3d20260409/h;->v:Lk/e;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lk/e;->a()F

    .line 19
    move-result v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, La3d20260409/f;->m0(F)V

    .line 23
    .line 24
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 25
    .line 26
    iget-object v1, p0, La3d20260409/h;->w:Lk/e;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lk/e;->a()F

    .line 30
    move-result v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, La3d20260409/f;->H(F)V

    .line 34
    .line 35
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 36
    .line 37
    iget-object v1, p0, La3d20260409/h;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 41
    move-result v1

    .line 42
    .line 43
    iget-object v2, p0, La3d20260409/h;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 47
    move-result v2

    .line 48
    .line 49
    iget-object v3, p0, La3d20260409/h;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 53
    move-result v3

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1, v2, v3}, La3d20260409/f;->K(III)V

    .line 57
    .line 58
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 59
    .line 60
    iget-object v1, p0, La3d20260409/h;->t:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 64
    move-result v1

    .line 65
    .line 66
    iget-object v2, p0, La3d20260409/h;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 70
    move-result v2

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, La3d20260409/f;->J(II)V

    .line 74
    .line 75
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 76
    .line 77
    iget-object v1, p0, La3d20260409/h;->y:La3d20260409/k;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, La3d20260409/k;->a()Lorg/json/JSONObject;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    .line 84
    const-string/jumbo v2, "video_info"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v2, v1}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 88
    .line 89
    if-eqz p1, :cond_0

    .line 90
    .line 91
    iget-object p1, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, La3d20260409/f;->w0()V

    .line 95
    goto :goto_0

    .line 96
    .line 97
    :cond_0
    iget-object p1, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, La3d20260409/f;->q0()V

    .line 101
    .line 102
    :goto_0
    iget-object p1, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 103
    .line 104
    iget-object v0, p0, La3d20260409/h;->C:Lg/e;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v0}, La3d20260409/f;->R(Lg/e;)V

    .line 108
    .line 109
    iget-object p1, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, La3d20260409/f;->o0()Lorg/json/JSONObject;

    .line 113
    move-result-object p1

    .line 114
    return-object p1
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
.end method

.method public e0([BLandroid/hardware/Camera$Size;)Z
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La3d20260409/h;->O([BLandroid/hardware/Camera$Size;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    iget-object v1, p0, La3d20260409/h;->f:Ljava/util/concurrent/BlockingQueue;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    iget-object v1, p0, La3d20260409/h;->h:La3d20260409/h$o;

    .line 12
    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    iget-boolean v1, p0, La3d20260409/h;->e:Z

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_0
    if-nez v0, :cond_4

    .line 22
    .line 23
    :try_start_0
    iget-object v0, p0, La3d20260409/h;->f:Ljava/util/concurrent/BlockingQueue;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 27
    move-result v0

    .line 28
    .line 29
    .line 30
    invoke-static {}, La3d20260409/v;->N()I

    .line 31
    move-result v1

    .line 32
    .line 33
    if-ne v0, v1, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, La3d20260409/h;->f:Ljava/util/concurrent/BlockingQueue;

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 39
    .line 40
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, La3d20260409/f;->h0()I

    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p1, v0

    .line 47
    goto :goto_4

    .line 48
    .line 49
    :cond_1
    :goto_0
    iget-object v0, p0, La3d20260409/h;->E:Lwe0/g;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lwe0/g;->f()V

    .line 53
    .line 54
    new-instance v3, La3d20260409/d;

    .line 55
    .line 56
    iget v5, p2, Landroid/hardware/Camera$Size;->width:I

    .line 57
    .line 58
    iget v6, p2, Landroid/hardware/Camera$Size;->height:I

    .line 59
    .line 60
    iget v7, p0, La3d20260409/h;->k:I

    .line 61
    .line 62
    .line 63
    invoke-static {}, La3d20260409/s;->i()I

    .line 64
    move-result v0

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lk/a;->g()I

    .line 68
    move-result v1

    .line 69
    const/4 v9, 0x1

    .line 70
    .line 71
    if-eq v0, v1, :cond_2

    .line 72
    move v8, v9

    .line 73
    :goto_1
    move-object v4, p1

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    move v8, v2

    .line 76
    goto :goto_1

    .line 77
    .line 78
    .line 79
    :goto_2
    invoke-direct/range {v3 .. v8}, La3d20260409/d;-><init>([BIIIZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    :try_start_1
    iget p1, p0, La3d20260409/h;->K:I

    .line 82
    add-int/2addr p1, v9

    .line 83
    .line 84
    iput p1, p0, La3d20260409/h;->K:I

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, p1}, La3d20260409/d;->h(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    goto :goto_3

    .line 89
    :catch_0
    move-exception v0

    .line 90
    move-object p1, v0

    .line 91
    .line 92
    .line 93
    :try_start_2
    invoke-virtual {p0, p1}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    :goto_3
    iget-object p1, p0, La3d20260409/h;->f:Ljava/util/concurrent/BlockingQueue;

    .line 96
    .line 97
    .line 98
    invoke-interface {p1, v3}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 99
    move-result p1

    .line 100
    .line 101
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p2}, Lm/b;->j(Landroid/hardware/Camera$Size;)V

    .line 105
    .line 106
    iget-object p2, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2}, La3d20260409/f;->k0()I

    .line 110
    .line 111
    .line 112
    invoke-static {}, La3d20260409/j3d20260409;->oo00oo0()V

    .line 113
    .line 114
    iget-object p2, p0, La3d20260409/h;->y:La3d20260409/k;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2}, La3d20260409/k;->e()Z

    .line 118
    move-result p2

    .line 119
    .line 120
    if-eqz p2, :cond_3

    .line 121
    .line 122
    iget-object p2, p0, La3d20260409/h;->y:La3d20260409/k;

    .line 123
    .line 124
    new-instance v0, Li/w;

    .line 125
    .line 126
    .line 127
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 128
    move-result-wide v5

    .line 129
    .line 130
    .line 131
    invoke-direct {v0, v4, v5, v6}, Li/w;-><init>([BJ)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v0}, La3d20260409/k;->c(Li/w;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    :cond_3
    return p1

    .line 136
    .line 137
    .line 138
    :goto_4
    invoke-virtual {p0, p1}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 139
    :cond_4
    :goto_5
    return v2
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
.end method

.method public f0(Laai/liveness/Detector$DetectionType;Lc/b;)V
    .locals 1

    .line 1
    .line 2
    iput-object p2, p0, La3d20260409/h;->i:Lc/b;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    move-result-wide p1

    .line 7
    .line 8
    iput-wide p1, p0, La3d20260409/h;->F:J

    .line 9
    .line 10
    iget-object p1, p0, La3d20260409/h;->h:La3d20260409/h$o;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    sget-object p1, Lintl/OOOoooooo;->OoOOoOoO:Lintl/OOOoooooo;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    move-result-object p1

    .line 19
    const/4 p2, 0x0

    .line 20
    .line 21
    const-string v0, "already init"

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p2, p1, v0}, La3d20260409/h;->M(ZLjava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    :cond_0
    new-instance p1, La3d20260409/h$a;

    .line 27
    .line 28
    .line 29
    invoke-direct {p1, p0}, La3d20260409/h$a;-><init>(La3d20260409/h;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 33
    return-void
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
.end method

.method public final g()V
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lintl/OoOOoOoO;->OOOoooooo:Lintl/OoOOoOoO;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 6
    .line 7
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lm/b;->t()V

    .line 11
    .line 12
    sget-object v0, La3d20260409/O0000o0o0;->OOOoooooo:La3d20260409/O0000o0o0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 16
    .line 17
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 18
    .line 19
    iget v1, p0, La3d20260409/h;->k:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lm/b;->i(I)V

    .line 23
    .line 24
    const-string v0, "auth checking"

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lk/h;->f(Ljava/lang/String;)V

    .line 28
    .line 29
    iget-object v0, p0, La3d20260409/h;->i:Lc/b;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Lc/b;->j()V

    .line 35
    .line 36
    :cond_0
    sget-object v0, Lintl/OoooOOOoooooo;->oOoOOOOOooooo:Lintl/OoooOOOoooooo;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, La3d20260409/h;->H(Lintl/OoooOOOoooooo;)V

    .line 40
    .line 41
    iget-object v0, p0, La3d20260409/h;->C:Lg/e;

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lg/e;->b(Lg/e;)Lg/e;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    move-result-wide v1

    .line 50
    .line 51
    .line 52
    invoke-static {}, La3d20260409/j3d20260409;->O0OO0oOo000()Ljava/lang/String;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    .line 56
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 57
    move-result v4

    .line 58
    .line 59
    const-string v5, ""

    .line 60
    .line 61
    const-string v6, "did"

    .line 62
    const/4 v7, 0x0

    .line 63
    .line 64
    if-eqz v4, :cond_3

    .line 65
    .line 66
    iget-object v3, p0, La3d20260409/h;->a:Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    invoke-static {v3, v6}, Lk/d;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    move-result-object v3

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lk/j;->b()Ljava/lang/String;

    .line 74
    move-result-object v4

    .line 75
    .line 76
    iget-object v8, p0, La3d20260409/h;->a:Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    invoke-static {v8, v3}, La3d20260409/t;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    move-result-object v8

    .line 81
    .line 82
    .line 83
    invoke-static {v4, v8, v3}, La3d20260409/j3d20260409;->O0OO0oOo1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    move-result-object v3

    .line 85
    .line 86
    sget-object v4, Lintl/oOooooooooooooo;->OoOOoOoO:Lintl/oOooooooooooooo;

    .line 87
    .line 88
    iget-object v8, p0, La3d20260409/h;->C:Lg/e;

    .line 89
    .line 90
    .line 91
    invoke-static {v4, v3, v8}, La3d20260409/l;->b(Lintl/oOooooooooooooo;Ljava/lang/String;Lg/e;)Landroid/util/Pair;

    .line 92
    move-result-object v3

    .line 93
    .line 94
    iget-object v4, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v4, Ln/h;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Ln/h;->a()Ljava/lang/String;

    .line 100
    move-result-object v4

    .line 101
    .line 102
    .line 103
    invoke-static {v4}, Lk/g;->g(Ljava/lang/String;)Z

    .line 104
    move-result v8

    .line 105
    .line 106
    if-nez v8, :cond_2

    .line 107
    .line 108
    new-instance v7, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    const-string v8, "Request Network Error:\n"

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    iget-object v8, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v8, Ln/h;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8}, Ln/h;->b()Ln/m;

    .line 124
    move-result-object v8

    .line 125
    .line 126
    .line 127
    invoke-virtual {v8}, Ln/m;->c()Ljava/lang/String;

    .line 128
    move-result-object v8

    .line 129
    .line 130
    .line 131
    invoke-static {v8}, Lk/f;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    move-result-object v8

    .line 133
    .line 134
    .line 135
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    move-result-object v7

    .line 140
    .line 141
    .line 142
    invoke-static {v7}, Lk/h;->g(Ljava/lang/String;)V

    .line 143
    .line 144
    iget-object v7, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v7, Ln/h;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7}, Ln/h;->b()Ln/m;

    .line 150
    move-result-object v7

    .line 151
    .line 152
    .line 153
    invoke-virtual {v7}, Ln/m;->a()Ljava/lang/String;

    .line 154
    move-result-object v7

    .line 155
    .line 156
    new-instance v8, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    const-string v9, "NETWORK_ERROR("

    .line 162
    .line 163
    .line 164
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v3, Ln/h;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Ln/h;->b()Ln/m;

    .line 172
    move-result-object v3

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, Ln/m;->b()I

    .line 176
    move-result v3

    .line 177
    .line 178
    .line 179
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    const-string v3, ")"

    .line 182
    .line 183
    .line 184
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    if-nez v7, :cond_1

    .line 187
    move-object v7, v5

    .line 188
    .line 189
    .line 190
    :cond_1
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    move-result-object v7

    .line 195
    :cond_2
    move-object v3, v4

    .line 196
    .line 197
    .line 198
    :cond_3
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 199
    move-result v4

    .line 200
    .line 201
    if-nez v4, :cond_4

    .line 202
    .line 203
    const-string v4, "\n"

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 207
    move-result-object v3

    .line 208
    .line 209
    :cond_4
    const-class v4, Laai/liveness/http/entity/ResultEntity;

    .line 210
    .line 211
    .line 212
    invoke-static {v3, v4}, Lk/g;->h(Ljava/lang/String;Ljava/lang/Class;)Lai/advance/common/entity/BaseResultEntity;

    .line 213
    move-result-object v4

    .line 214
    .line 215
    check-cast v4, Laai/liveness/http/entity/ResultEntity;

    .line 216
    .line 217
    iget-object v5, v4, Lai/advance/common/entity/BaseResultEntity;->code:Ljava/lang/String;

    .line 218
    .line 219
    const-string v8, "NO_RESPONSE"

    .line 220
    .line 221
    .line 222
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    move-result v5

    .line 224
    .line 225
    if-eqz v5, :cond_5

    .line 226
    .line 227
    const-string v5, "NETWORK_ERROR"

    .line 228
    .line 229
    iput-object v5, v4, Lai/advance/common/entity/BaseResultEntity;->code:Ljava/lang/String;

    .line 230
    .line 231
    :cond_5
    iget-boolean v5, v4, Lai/advance/common/entity/BaseResultEntity;->success:Z

    .line 232
    .line 233
    if-eqz v5, :cond_6

    .line 234
    .line 235
    .line 236
    invoke-static {v3}, La3d20260409/j3d20260409;->O0OO0oOo2(Ljava/lang/String;)V

    .line 237
    .line 238
    iget-object v5, p0, La3d20260409/h;->a:Landroid/content/Context;

    .line 239
    .line 240
    .line 241
    invoke-static {}, La3d20260409/j3d20260409;->O00000oo()Ljava/lang/String;

    .line 242
    move-result-object v8

    .line 243
    .line 244
    .line 245
    invoke-static {v5, v6, v8}, Lk/d;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 249
    move-result-wide v5

    .line 250
    sub-long/2addr v5, v1

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0, v4, v5, v6, v0}, La3d20260409/h;->D(Laai/liveness/http/entity/ResultEntity;JLg/e;)V

    .line 254
    .line 255
    iget-boolean v0, v4, Lai/advance/common/entity/BaseResultEntity;->success:Z

    .line 256
    .line 257
    if-eqz v0, :cond_7

    .line 258
    .line 259
    .line 260
    invoke-static {}, Lr/a;->b()Landroid/app/Application;

    .line 261
    move-result-object v0

    .line 262
    .line 263
    .line 264
    invoke-static {}, La3d20260409/v;->I()Z

    .line 265
    move-result v1

    .line 266
    .line 267
    .line 268
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 269
    move-result-object v1

    .line 270
    .line 271
    .line 272
    const-string/jumbo v2, "l"

    .line 273
    .line 274
    .line 275
    invoke-static {v0, v2, v1}, Lk/d;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    .line 277
    :cond_7
    iget-boolean v0, v4, Lai/advance/common/entity/BaseResultEntity;->success:Z

    .line 278
    .line 279
    if-eqz v0, :cond_8

    .line 280
    .line 281
    sget-object v0, Lintl/OoOOoOoO;->OoooOOOoooooo:Lintl/OoOOoOoO;

    .line 282
    .line 283
    .line 284
    invoke-virtual {p0, v0}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 285
    .line 286
    sget-object v0, La3d20260409/O0000o0o0;->OoooOOOoooooo:La3d20260409/O0000o0o0;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0, v0}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 290
    .line 291
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 292
    .line 293
    iget-boolean v1, v4, Lai/advance/common/entity/BaseResultEntity;->success:Z

    .line 294
    .line 295
    iget-object v2, v4, Lai/advance/common/entity/BaseResultEntity;->message:Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v1, v2}, Lm/b;->s(ZLjava/lang/String;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0}, La3d20260409/h;->b0()V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0}, La3d20260409/h;->n()V

    .line 305
    return-void

    .line 306
    .line 307
    :cond_8
    sget-object v0, Lintl/OoOOoOoO;->oOoOOOOOooooo:Lintl/OoOOoOoO;

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0, v0}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 311
    .line 312
    sget-object v0, La3d20260409/O0000o0o0;->oOoOOOOOooooo:La3d20260409/O0000o0o0;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0, v0}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 316
    .line 317
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 318
    .line 319
    iget-boolean v1, v4, Lai/advance/common/entity/BaseResultEntity;->success:Z

    .line 320
    .line 321
    if-nez v7, :cond_9

    .line 322
    .line 323
    iget-object v2, v4, Lai/advance/common/entity/BaseResultEntity;->message:Ljava/lang/String;

    .line 324
    goto :goto_0

    .line 325
    :cond_9
    move-object v2, v7

    .line 326
    .line 327
    .line 328
    :goto_0
    invoke-virtual {v0, v1, v2}, Lm/b;->s(ZLjava/lang/String;)V

    .line 329
    .line 330
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v3}, La3d20260409/f;->B(Ljava/lang/String;)V

    .line 334
    .line 335
    iget-object v0, p0, La3d20260409/h;->i:Lc/b;

    .line 336
    .line 337
    if-eqz v0, :cond_b

    .line 338
    .line 339
    iget-object v0, v4, Lai/advance/common/entity/BaseResultEntity;->code:Ljava/lang/String;

    .line 340
    .line 341
    if-nez v7, :cond_a

    .line 342
    .line 343
    iget-object v7, v4, Lai/advance/common/entity/BaseResultEntity;->message:Ljava/lang/String;

    .line 344
    :cond_a
    const/4 v1, 0x0

    .line 345
    .line 346
    .line 347
    invoke-virtual {p0, v1, v0, v7}, La3d20260409/h;->M(ZLjava/lang/String;Ljava/lang/String;)V

    .line 348
    return-void

    .line 349
    .line 350
    :cond_b
    const-string v0, " sdk auth failed "

    .line 351
    .line 352
    .line 353
    invoke-static {v0}, Lk/h;->f(Ljava/lang/String;)V

    .line 354
    return-void
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
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
.end method

.method public final i0()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, La3d20260409/h;->H:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_3

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, La3d20260409/h;->h:La3d20260409/h$o;

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, La3d20260409/h;->y:La3d20260409/k;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, La3d20260409/k;->g()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, La3d20260409/h;->x0()V

    .line 22
    :cond_1
    const/4 v0, 0x1

    .line 23
    .line 24
    :try_start_0
    iput-boolean v0, p0, La3d20260409/h;->e:Z

    .line 25
    .line 26
    new-instance v0, La3d20260409/h$o;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p0}, La3d20260409/h$o;-><init>(La3d20260409/h;)V

    .line 30
    .line 31
    iput-object v0, p0, La3d20260409/h;->h:La3d20260409/h$o;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 35
    .line 36
    sget-object v0, Lintl/OoOOoOoO;->o0O0000:Lintl/OoOOoOoO;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 40
    .line 41
    sget-object v0, La3d20260409/O0000o0o0;->OoOOoOoO:La3d20260409/O0000o0o0;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    .line 48
    sget-object v1, La3d20260409/O0000o0o0;->oo00oo00:La3d20260409/O0000o0o0;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v1}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    :cond_2
    :goto_0
    :try_start_1
    iget-boolean v0, p0, La3d20260409/h;->H:Z

    .line 57
    .line 58
    if-nez v0, :cond_6

    .line 59
    .line 60
    iget-object v0, p0, La3d20260409/h;->l:Ljava/util/concurrent/ExecutorService;

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 64
    move-result v0

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    goto :goto_3

    .line 68
    :cond_3
    const/4 v0, 0x0

    .line 69
    .line 70
    .line 71
    :goto_1
    invoke-static {}, La3d20260409/v;->U()I

    .line 72
    move-result v1

    .line 73
    .line 74
    if-ge v0, v1, :cond_5

    .line 75
    .line 76
    iget-boolean v1, p0, La3d20260409/h;->H:Z

    .line 77
    .line 78
    if-nez v1, :cond_6

    .line 79
    .line 80
    iget-object v1, p0, La3d20260409/h;->l:Ljava/util/concurrent/ExecutorService;

    .line 81
    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 84
    move-result v1

    .line 85
    .line 86
    if-eqz v1, :cond_4

    .line 87
    goto :goto_3

    .line 88
    .line 89
    :cond_4
    iget-object v1, p0, La3d20260409/h;->l:Ljava/util/concurrent/ExecutorService;

    .line 90
    .line 91
    new-instance v2, La3d20260409/h$i;

    .line 92
    .line 93
    .line 94
    invoke-direct {v2, p0}, La3d20260409/h$i;-><init>(La3d20260409/h;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 98
    .line 99
    add-int/lit8 v0, v0, 0x1

    .line 100
    goto :goto_1

    .line 101
    :catchall_1
    move-exception v0

    .line 102
    goto :goto_2

    .line 103
    .line 104
    :cond_5
    sget-object v0, La3d20260409/O0000o0o0;->O0000o0o0:La3d20260409/O0000o0o0;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v0}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    goto :goto_3

    .line 109
    .line 110
    :goto_2
    sget-object v1, La3d20260409/O0000o0o0;->Oo000ooo00:La3d20260409/O0000o0o0;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v1}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v0}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 117
    :cond_6
    :goto_3
    return-void
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
.end method

.method public final j(Lg/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/a<",
            "Lg/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, La3d20260409/h;->C:Lg/e;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, Lf/h;->F(Lg/a;Lg/e;)V

    .line 10
    return-void
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
.end method

.method public final k(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, La3d20260409/h;->C:Lg/e;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, Lf/h;->G(Ljava/lang/String;Lg/e;)V

    .line 10
    return-void
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
.end method

.method public final k0()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, La3d20260409/h;->I:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La3d20260409/h;->W()Lorg/json/JSONObject;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iget-object v1, p0, La3d20260409/h;->J:La3d20260409/d;

    .line 10
    .line 11
    if-nez v1, :cond_4

    .line 12
    .line 13
    iget-object v1, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, La3d20260409/f;->p0()V

    .line 17
    .line 18
    sget-object v1, Lintl/OoOOoOoO;->OoOOoOoO:Lintl/OoOOoOoO;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 22
    .line 23
    sget-object v1, Lintl/OoooOOOoooooo;->o0O0000:Lintl/OoooOOOoooooo;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1}, La3d20260409/h;->H(Lintl/OoooOOOoooooo;)V

    .line 27
    .line 28
    iget-object v1, p0, La3d20260409/h;->C:Lg/e;

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Lg/e;->b(Lg/e;)Lg/e;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1}, La3d20260409/h;->F(Lg/e;)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lk/j;->b()Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    iget-object v3, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v0}, Lm/b;->o(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lr/a;->b()Landroid/app/Application;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    const-string v4, "esu2fhj1C0QmBl2Z"

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v0, v4, v3}, La3d20260409/j3d20260409;->O0o0Ooo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)[B

    .line 55
    move-result-object v0

    .line 56
    .line 57
    sget-object v2, Lintl/oOooooooooooooo;->OOOoooooo:Lintl/oOooooooooooooo;

    .line 58
    .line 59
    .line 60
    invoke-static {v2, v0, v1}, La3d20260409/l;->d(Lintl/oOooooooooooooo;[BLg/e;)Landroid/util/Pair;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Ln/h;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ln/h;->a()Ljava/lang/String;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    sget-object v3, Lintl/OoOOoOoO;->oo00oo00:Lintl/OoOOoOoO;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v3}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 75
    .line 76
    const-class v3, Laai/liveness/http/entity/ResultEntity;

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v3}, Lk/g;->h(Ljava/lang/String;Ljava/lang/Class;)Lai/advance/common/entity/BaseResultEntity;

    .line 80
    move-result-object v3

    .line 81
    .line 82
    check-cast v3, Laai/liveness/http/entity/ResultEntity;

    .line 83
    .line 84
    .line 85
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 86
    move-result-object v4

    .line 87
    .line 88
    new-instance v5, La3d20260409/h$f;

    .line 89
    .line 90
    .line 91
    invoke-direct {v5, p0, v3, v0}, La3d20260409/h$f;-><init>(La3d20260409/h;Laai/liveness/http/entity/ResultEntity;Landroid/util/Pair;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v5, v1}, Lf/h;->y(Lg/a;Lg/e;)V

    .line 95
    .line 96
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, La3d20260409/f;->u0()V

    .line 100
    .line 101
    .line 102
    invoke-static {}, La3d20260409/j3d20260409;->lIl()Z

    .line 103
    move-result v0

    .line 104
    .line 105
    if-nez v0, :cond_3

    .line 106
    .line 107
    .line 108
    invoke-static {}, La3d20260409/j3d20260409;->lll()Z

    .line 109
    move-result v0

    .line 110
    .line 111
    if-eqz v0, :cond_0

    .line 112
    goto :goto_1

    .line 113
    .line 114
    .line 115
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 116
    move-result-wide v0

    .line 117
    .line 118
    .line 119
    invoke-static {v2, v0, v1}, La3d20260409/j3d20260409;->O0o0Oooo(Ljava/lang/String;J)V

    .line 120
    .line 121
    .line 122
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 123
    move-result v0

    .line 124
    .line 125
    if-eqz v0, :cond_1

    .line 126
    .line 127
    sget-object v0, Lintl/OOOoooooo;->OOOOOoooo:Lintl/OOOoooooo;

    .line 128
    .line 129
    .line 130
    invoke-static {v0}, La3d20260409/u;->b(Lintl/OOOoooooo;)V

    .line 131
    .line 132
    const-string v0, "Please check network"

    .line 133
    .line 134
    .line 135
    invoke-static {v0}, La3d20260409/u;->k(Ljava/lang/String;)V

    .line 136
    .line 137
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 138
    .line 139
    .line 140
    const-string/jumbo v1, "picture_upload_failed"

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, La3d20260409/f;->t0(Ljava/lang/String;)V

    .line 144
    goto :goto_2

    .line 145
    .line 146
    .line 147
    :cond_1
    invoke-static {}, La3d20260409/u;->j()Z

    .line 148
    move-result v0

    .line 149
    .line 150
    const-string v1, "final_success"

    .line 151
    .line 152
    .line 153
    const-string/jumbo v4, "server_detection_success"

    .line 154
    .line 155
    if-eqz v0, :cond_2

    .line 156
    .line 157
    sget-object v0, La3d20260409/O0000o0o0;->o0O0000:La3d20260409/O0000o0o0;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, v0}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 161
    .line 162
    .line 163
    invoke-static {}, La3d20260409/j3d20260409;->O0ooEoo0Co00()V

    .line 164
    .line 165
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 166
    .line 167
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 168
    .line 169
    .line 170
    :goto_0
    invoke-virtual {v0, v4, v2}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 171
    .line 172
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1, v2}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 176
    goto :goto_2

    .line 177
    .line 178
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    const-string v5, "CHECKING_"

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    iget-object v5, v3, Lai/advance/common/entity/BaseResultEntity;->code:Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    move-result-object v0

    .line 196
    .line 197
    .line 198
    invoke-static {v0}, La3d20260409/u;->c(Ljava/lang/String;)V

    .line 199
    .line 200
    sget-object v0, La3d20260409/O0000o0o0;->oOOOOOooooOo:La3d20260409/O0000o0o0;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0, v0}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 204
    .line 205
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v2}, La3d20260409/f;->n0(Ljava/lang/String;)V

    .line 209
    .line 210
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 211
    .line 212
    iget-object v2, v3, Lai/advance/common/entity/BaseResultEntity;->message:Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    const-string/jumbo v3, "server_detection_failed_message"

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v3, v2}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 219
    .line 220
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 221
    .line 222
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 223
    goto :goto_0

    .line 224
    .line 225
    .line 226
    :cond_3
    :goto_1
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 227
    move-result-object v0

    .line 228
    .line 229
    const-string v2, "face_data_cleared_before_upload_finish"

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v2, v1}, Lf/h;->G(Ljava/lang/String;Lg/e;)V

    .line 233
    .line 234
    sget-object v0, Lintl/OOOoooooo;->oo00oo00:Lintl/OOOoooooo;

    .line 235
    .line 236
    .line 237
    invoke-static {v0}, La3d20260409/u;->b(Lintl/OOOoooooo;)V

    .line 238
    .line 239
    .line 240
    const-string/jumbo v0, "user_give_up"

    .line 241
    .line 242
    .line 243
    invoke-static {v0}, La3d20260409/u;->k(Ljava/lang/String;)V

    .line 244
    :goto_2
    const/4 v0, 0x0

    .line 245
    .line 246
    iput-boolean v0, p0, La3d20260409/h;->I:Z

    .line 247
    return-void

    .line 248
    .line 249
    :cond_4
    new-instance v0, La3d20260409/c;

    .line 250
    .line 251
    .line 252
    invoke-direct {v0, v1}, La3d20260409/c;-><init>(La3d20260409/d;)V

    .line 253
    .line 254
    sget-object v1, La3d20260409/oOooooooo0000000000;->OOOOooooo:La3d20260409/oOooooooo0000000000;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v1}, La3d20260409/c;->d(La3d20260409/oOooooooo0000000000;)[B

    .line 258
    .line 259
    iget-object v0, p0, La3d20260409/h;->J:La3d20260409/d;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, La3d20260409/d;->i()J

    .line 263
    .line 264
    sget-boolean v0, La3d20260409/s;->d:Z

    .line 265
    const/4 v0, 0x0

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
.end method

.method public m0()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h;->y:La3d20260409/k;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, La3d20260409/k;->g()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, La3d20260409/h;->y:La3d20260409/k;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, La3d20260409/k;->e()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    :try_start_0
    iget-object v0, p0, La3d20260409/h;->y:La3d20260409/k;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, La3d20260409/k;->f()V

    .line 22
    .line 23
    .line 24
    const-string/jumbo v0, "video_recorder_stopped"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, La3d20260409/h;->I(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    return-void

    .line 29
    :catch_0
    move-exception v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 33
    :cond_0
    return-void
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
.end method

.method public final n()V
    .locals 9

    .line 1
    .line 2
    const-string v0, "dv_token_client_init"

    .line 3
    .line 4
    .line 5
    invoke-static {}, La3d20260409/v;->T()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    move-result v2

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    goto :goto_2

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    move-result-wide v2

    .line 18
    .line 19
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    invoke-direct {v4, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    const-string v1, "a"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 28
    move-result v1

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    sget-object v1, Lintl/OoooOOOoooooo;->OOOOooooo:Lintl/OoooOOOoooooo;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1}, La3d20260409/h;->H(Lintl/OoooOOOoooooo;)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, La3d20260409/s;->f()Lcom/datavisor/vangogh/face/DVTokenClient;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    .line 44
    const-string/jumbo v5, "no_client"

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    goto :goto_1

    .line 48
    .line 49
    :cond_1
    const-string v5, "init_success"

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-virtual {p0, v0, v5}, La3d20260409/h;->J(Ljava/lang/String;Ljava/lang/Object;)V

    .line 53
    .line 54
    new-instance v5, La3d20260409/h$c;

    .line 55
    .line 56
    .line 57
    invoke-direct {v5, p0, v1, v2, v3}, La3d20260409/h$c;-><init>(La3d20260409/h;Lcom/datavisor/vangogh/face/DVTokenClient;J)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v5}, La3d20260409/h;->E(Lg/a;)V

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    const-string v5, "d"

    .line 65
    .line 66
    .line 67
    invoke-static {v4, v5}, Lk/g;->f(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    move-result-object v5

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v5}, Lcom/datavisor/vangogh/face/DVTokenClient;->setDVCustomDomain(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 75
    move-result-wide v5

    .line 76
    .line 77
    const-string v7, "b"

    .line 78
    .line 79
    .line 80
    invoke-static {v4, v7}, Lk/g;->f(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    move-result-object v7

    .line 82
    .line 83
    const-string v8, "c"

    .line 84
    .line 85
    .line 86
    invoke-static {v4, v8}, Lk/g;->f(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    move-result-object v4

    .line 88
    .line 89
    new-instance v8, La3d20260409/h$b;

    .line 90
    .line 91
    .line 92
    invoke-direct {v8, p0, v5, v6}, La3d20260409/h$b;-><init>(La3d20260409/h;J)V

    .line 93
    const/4 v5, 0x0

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v7, v4, v5, v8}, Lcom/datavisor/vangogh/face/DVTokenClient;->initToken(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/datavisor/vangogh/face/DVTokenClient$InitResultListener;)Z

    .line 97
    return-void

    .line 98
    .line 99
    :cond_2
    new-instance v1, La3d20260409/h$d;

    .line 100
    .line 101
    .line 102
    invoke-direct {v1, p0, v2, v3}, La3d20260409/h$d;-><init>(La3d20260409/h;J)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v1}, La3d20260409/h;->E(Lg/a;)V

    .line 106
    .line 107
    const-string v1, "dfp_closed"

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v0, v1}, La3d20260409/h;->J(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    return-void

    .line 112
    .line 113
    :goto_1
    new-instance v4, La3d20260409/h$h;

    .line 114
    .line 115
    .line 116
    invoke-direct {v4, p0, v2, v3, v1}, La3d20260409/h$h;-><init>(La3d20260409/h;JLjava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v4}, La3d20260409/h;->E(Lg/a;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 123
    move-result-object v2

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0, v2}, La3d20260409/h;->J(Ljava/lang/String;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v1}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 130
    :cond_3
    :goto_2
    return-void
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
.end method

.method public p()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, La3d20260409/O0000o0o0;->ooO00O0O0Oo:La3d20260409/O0000o0o0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 6
    .line 7
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, La3d20260409/f;->p0()V

    .line 11
    .line 12
    .line 13
    invoke-static {}, La3d20260409/j3d20260409;->lIl()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    .line 17
    invoke-static {}, La3d20260409/j3d20260409;->lll()Z

    .line 18
    move-result v1

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    goto :goto_0

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-static {}, La3d20260409/v;->O()Z

    .line 27
    move-result v0

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    sget-object v1, La3d20260409/O0000o0o0;->o0O0000:La3d20260409/O0000o0o0;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, "_offline"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, La3d20260409/h;->I(Ljava/lang/String;)V

    .line 62
    return-void

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-virtual {p0}, La3d20260409/h;->k0()V

    .line 66
    return-void

    .line 67
    .line 68
    :cond_2
    :goto_0
    new-instance v1, La3d20260409/g;

    .line 69
    .line 70
    .line 71
    invoke-direct {v1, v0}, La3d20260409/g;-><init>(Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1}, La3d20260409/h;->j(Lg/a;)V

    .line 75
    .line 76
    sget-object v0, Lintl/OOOoooooo;->O0000o0o0:Lintl/OOOoooooo;

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, La3d20260409/u;->b(Lintl/OOOoooooo;)V

    .line 80
    .line 81
    .line 82
    const-string/jumbo v0, "not get best image(sdk message)"

    .line 83
    .line 84
    .line 85
    invoke-static {v0}, La3d20260409/u;->k(Ljava/lang/String;)V

    .line 86
    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    sget-object v1, La3d20260409/O0000o0o0;->oOOOOOooooOo:La3d20260409/O0000o0o0;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 96
    move-result-object v1

    .line 97
    .line 98
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v1, "_no_best_image"

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    move-result-object v0

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v0}, La3d20260409/h;->I(Ljava/lang/String;)V

    .line 118
    .line 119
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, La3d20260409/f;->u0()V

    .line 123
    .line 124
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 125
    .line 126
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 127
    .line 128
    .line 129
    const-string/jumbo v2, "server_detection_success"

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v2, v1}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 133
    .line 134
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 135
    .line 136
    const-string v2, "final_success"

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v2, v1}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 140
    return-void
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
.end method

.method public final q0()V
    .locals 1

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, La3d20260409/h;->l:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public final s0()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, La3d20260409/h$l;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, La3d20260409/h$l;-><init>(La3d20260409/h;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, La3d20260409/h;->E(Lg/a;)V

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
.end method

.method public u(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, La3d20260409/h;->G:J

    .line 3
    return-void
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
.end method

.method public final v(La3d20260409/O0000o0o0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, La3d20260409/h;->w(La3d20260409/O0000o0o0;Ljava/lang/Object;)V

    .line 5
    return-void
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
.end method

.method public final w(La3d20260409/O0000o0o0;Ljava/lang/Object;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, La3d20260409/f;->V(Ljava/lang/String;Ljava/lang/Object;)V

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
.end method

.method public w0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
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
.end method

.method public final x0()V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, La3d20260409/h;->L:La3d20260409/o0o00;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraViewV2;->getPreviewSize()Landroid/hardware/Camera$Size;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, La3d20260409/h;->L:La3d20260409/o0o00;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lai/advance/common/camera/GuardianCameraViewV2;->X()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    const/16 v2, 0x168

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    move v1, v2

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    const/16 v1, 0xb4

    .line 21
    .line 22
    :goto_0
    iget v3, p0, La3d20260409/h;->k:I

    .line 23
    sub-int/2addr v1, v3

    .line 24
    .line 25
    if-gez v1, :cond_1

    .line 26
    .line 27
    add-int/lit16 v1, v1, 0x168

    .line 28
    .line 29
    :cond_1
    if-ne v1, v2, :cond_2

    .line 30
    const/4 v1, 0x0

    .line 31
    .line 32
    :cond_2
    iget-object v2, p0, La3d20260409/h;->y:La3d20260409/k;

    .line 33
    .line 34
    iget v3, v0, Landroid/hardware/Camera$Size;->width:I

    .line 35
    .line 36
    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v3, v0, v1}, La3d20260409/k;->b(III)V

    .line 40
    .line 41
    iget-object v0, p0, La3d20260409/h;->y:La3d20260409/k;

    .line 42
    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    iget-object v2, p0, La3d20260409/h;->a:Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v2, "aai_liveness_"

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 69
    move-result-wide v2

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v2, ".mp4"

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, La3d20260409/k;->d(Ljava/lang/String;)Z

    .line 85
    move-result v0

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    .line 90
    const-string/jumbo v0, "video_recorder_started"

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v0}, La3d20260409/h;->I(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    return-void

    .line 95
    :catch_0
    move-exception v0

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v0}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 99
    :cond_3
    return-void
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
.end method

.method public declared-synchronized z0()V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-boolean v0, p0, La3d20260409/h;->H:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    :try_start_1
    sget-object v0, Lintl/OOOoooooo;->Oo000ooo00:Lintl/OOOoooooo;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-static {}, La3d20260409/u;->e()Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object v0, Lintl/OOOoooooo;->oo00oo00:Lintl/OOOoooooo;

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, La3d20260409/u;->b(Lintl/OOOoooooo;)V

    .line 29
    .line 30
    iget-object v0, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 31
    .line 32
    .line 33
    const-string/jumbo v1, "user_give_up"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, La3d20260409/f;->t0(Ljava/lang/String;)V

    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_1
    :goto_0
    sget-object v0, La3d20260409/O0000o0o0;->O0ooooooooO:La3d20260409/O0000o0o0;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 46
    const/4 v0, 0x1

    .line 47
    .line 48
    iput-boolean v0, p0, La3d20260409/h;->H:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    const/4 v0, 0x0

    .line 50
    const/4 v1, 0x0

    .line 51
    .line 52
    :try_start_2
    iget-object v2, p0, La3d20260409/h;->h:La3d20260409/h$o;

    .line 53
    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    iget-boolean v2, p0, La3d20260409/h;->e:Z

    .line 57
    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    sget-object v2, Lintl/OOOoooooo;->oo00oo00:Lintl/OOOoooooo;

    .line 61
    .line 62
    .line 63
    invoke-static {v2}, La3d20260409/u;->b(Lintl/OOOoooooo;)V

    .line 64
    .line 65
    iget-object v2, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 66
    .line 67
    iget-object v3, p0, La3d20260409/h;->h:La3d20260409/h$o;

    .line 68
    .line 69
    .line 70
    invoke-static {v3}, La3d20260409/h$o;->A(La3d20260409/h$o;)Z

    .line 71
    move-result v3

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v3}, La3d20260409/f;->C(Z)V

    .line 75
    goto :goto_1

    .line 76
    :catchall_1
    move-exception v2

    .line 77
    goto :goto_2

    .line 78
    .line 79
    :cond_2
    :goto_1
    iput-boolean v0, p0, La3d20260409/h;->e:Z

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-virtual {p0}, La3d20260409/h;->q0()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, La3d20260409/h;->Y()V

    .line 86
    .line 87
    iget-object v2, p0, La3d20260409/h;->i:Lc/b;

    .line 88
    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    iput-object v1, p0, La3d20260409/h;->i:Lc/b;

    .line 92
    .line 93
    :cond_4
    iget-wide v2, p0, La3d20260409/h;->b:J

    .line 94
    .line 95
    const-wide/16 v4, 0x0

    .line 96
    .line 97
    cmp-long v6, v2, v4

    .line 98
    .line 99
    if-eqz v6, :cond_5

    .line 100
    .line 101
    .line 102
    invoke-static {v2, v3}, La3d20260409/v;->p(J)V

    .line 103
    .line 104
    iput-wide v4, p0, La3d20260409/h;->b:J

    .line 105
    .line 106
    :cond_5
    iput-object v1, p0, La3d20260409/h;->f:Ljava/util/concurrent/BlockingQueue;

    .line 107
    .line 108
    iget-object v2, p0, La3d20260409/h;->D:Lwe0/c;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Lwe0/c;->q()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 112
    goto :goto_3

    .line 113
    .line 114
    .line 115
    :goto_2
    :try_start_3
    invoke-virtual {p0, v2}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    :goto_3
    sget-object v2, La3d20260409/O0000o0o0;->OO000ooo000ooo:La3d20260409/O0000o0o0;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v2}, La3d20260409/h;->v(La3d20260409/O0000o0o0;)V

    .line 121
    .line 122
    .line 123
    invoke-static {}, La3d20260409/v;->O()Z

    .line 124
    move-result v2

    .line 125
    .line 126
    if-nez v2, :cond_6

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v0}, La3d20260409/h;->e(Z)Lorg/json/JSONObject;

    .line 130
    move-result-object v0

    .line 131
    .line 132
    iget-object v2, p0, La3d20260409/h;->j:La3d20260409/f;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v0}, Lm/b;->o(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 136
    move-result-object v0

    .line 137
    .line 138
    iget-object v2, p0, La3d20260409/h;->a:Landroid/content/Context;

    .line 139
    .line 140
    .line 141
    invoke-static {v0, v2}, La3d20260409/j3d20260409;->OOOOooOOOO(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    .line 142
    .line 143
    iget-object v0, p0, La3d20260409/h;->a:Landroid/content/Context;

    .line 144
    .line 145
    if-eqz v0, :cond_6

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 149
    move-result-object v0

    .line 150
    .line 151
    iget-object v2, p0, La3d20260409/h;->C:Lg/e;

    .line 152
    .line 153
    .line 154
    invoke-static {v2}, Lg/e;->b(Lg/e;)Lg/e;

    .line 155
    move-result-object v2

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v2}, La3d20260409/p;->a(Landroid/content/Context;Lg/e;)V

    .line 159
    .line 160
    .line 161
    :cond_6
    invoke-virtual {p0}, La3d20260409/h;->s0()V

    .line 162
    .line 163
    .line 164
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 165
    move-result-object v0

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Lf/h;->u()V

    .line 169
    .line 170
    iput-object v1, p0, La3d20260409/h;->L:La3d20260409/o0o00;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 171
    monitor-exit p0

    .line 172
    return-void

    .line 173
    :goto_4
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 174
    throw v0
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
.end method
