.class public Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;,
        Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;,
        Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$c;,
        Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;,
        Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;,
        Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$a;
    }
.end annotation


# instance fields
.field private A:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;

.field private B:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$m;

.field private volatile C:Landroid/media/MediaPlayer;

.field private D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

.field private E:Lcom/tencent/thumbplayer/tcmedia/a/c;

.field private F:Ljava/lang/Object;

.field private G:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field private final H:Ljava/lang/Object;

.field private I:J

.field private J:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$a;

.field private final K:Ljava/lang/Object;

.field private L:I

.field private M:I

.field private final N:Ljava/lang/Object;

.field private O:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field private P:Z

.field private volatile Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

.field private volatile R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

.field private S:Z

.field private T:J

.field private U:J

.field private V:I

.field private W:I

.field private volatile X:Z

.field private Y:I

.field private Z:I

.field private a:Lcom/tencent/thumbplayer/tcmedia/e/a;

.field private aa:I

.field private ab:I

.field private ac:I

.field private ad:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;",
            ">;"
        }
    .end annotation
.end field

.field private ae:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;",
            ">;"
        }
    .end annotation
.end field

.field private af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

.field private ag:J

.field private ah:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;

.field private ai:Landroid/media/MediaPlayer$OnTimedTextListener;

.field private b:Landroid/content/Context;

.field private c:Z

.field private d:J

.field private e:J

.field private f:Ljava/lang/String;

.field private g:Ljava/io/FileDescriptor;

.field private h:Landroid/content/res/AssetFileDescriptor;

.field private i:Z

.field private j:F

.field private k:F

.field private l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m:I

.field private n:J

.field private o:Z

.field private p:J

.field private q:I

.field private r:I

.field private s:Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;

.field private t:Z

.field private u:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;

.field private v:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;

.field private w:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

.field private x:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;

.field private y:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;

.field private z:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/tencent/thumbplayer/tcmedia/e/b;)V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->c:Z

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    iput-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->d:J

    .line 11
    .line 12
    iput-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->e:J

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->i:Z

    .line 15
    .line 16
    const/high16 v3, 0x3f800000    # 1.0f

    .line 17
    .line 18
    iput v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->j:F

    .line 19
    .line 20
    iput v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->k:F

    .line 21
    .line 22
    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->m:I

    .line 23
    .line 24
    const-wide/16 v3, -0x1

    .line 25
    .line 26
    iput-wide v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->n:J

    .line 27
    .line 28
    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->o:Z

    .line 29
    .line 30
    iput-wide v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->p:J

    .line 31
    const/4 v5, -0x1

    .line 32
    .line 33
    iput v5, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->q:I

    .line 34
    .line 35
    iput v5, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->r:I

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    iput-object v6, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->s:Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;

    .line 39
    const/4 v7, 0x1

    .line 40
    .line 41
    iput-boolean v7, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->t:Z

    .line 42
    .line 43
    iput-object v6, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->G:Ljava/util/concurrent/Future;

    .line 44
    .line 45
    new-instance v8, Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    iput-object v8, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->H:Ljava/lang/Object;

    .line 51
    .line 52
    const-wide/16 v8, 0x61a8

    .line 53
    .line 54
    iput-wide v8, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->I:J

    .line 55
    .line 56
    new-instance v8, Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    iput-object v8, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->K:Ljava/lang/Object;

    .line 62
    const/4 v8, 0x3

    .line 63
    .line 64
    iput v8, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->L:I

    .line 65
    .line 66
    const/16 v8, 0x1e

    .line 67
    .line 68
    iput v8, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->M:I

    .line 69
    .line 70
    new-instance v8, Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    iput-object v8, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->N:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object v6, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->O:Ljava/util/concurrent/Future;

    .line 78
    .line 79
    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->P:Z

    .line 80
    .line 81
    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->S:Z

    .line 82
    .line 83
    iput-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->T:J

    .line 84
    .line 85
    iput-wide v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->U:J

    .line 86
    .line 87
    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->V:I

    .line 88
    .line 89
    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->W:I

    .line 90
    .line 91
    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->X:Z

    .line 92
    .line 93
    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Y:I

    .line 94
    .line 95
    iput v5, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Z:I

    .line 96
    .line 97
    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->aa:I

    .line 98
    .line 99
    iput v5, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ab:I

    .line 100
    .line 101
    iput v5, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ac:I

    .line 102
    .line 103
    new-instance v0, Ljava/util/ArrayList;

    .line 104
    .line 105
    .line 106
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ad:Ljava/util/List;

    .line 109
    .line 110
    new-instance v0, Ljava/util/ArrayList;

    .line 111
    .line 112
    .line 113
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ae:Ljava/util/List;

    .line 116
    .line 117
    iput-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ag:J

    .line 118
    .line 119
    iput-object v6, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ah:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;

    .line 120
    .line 121
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$8;

    .line 122
    .line 123
    .line 124
    invoke-direct {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$8;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)V

    .line 125
    .line 126
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ai:Landroid/media/MediaPlayer$OnTimedTextListener;

    .line 127
    .line 128
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/e/a;

    .line 129
    .line 130
    const-string v1, "TPSystemMediaPlayer"

    .line 131
    .line 132
    .line 133
    invoke-direct {v0, p2, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;-><init>(Lcom/tencent/thumbplayer/tcmedia/e/b;Ljava/lang/String;)V

    .line 134
    .line 135
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    .line 136
    .line 137
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->b:Landroid/content/Context;

    .line 138
    .line 139
    new-instance p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    .line 140
    .line 141
    .line 142
    invoke-direct {p1, p0, v6}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$1;)V

    .line 143
    .line 144
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    .line 145
    .line 146
    new-instance p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;

    .line 147
    .line 148
    .line 149
    invoke-direct {p1, v6}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$1;)V

    .line 150
    .line 151
    new-instance p2, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    .line 152
    .line 153
    .line 154
    invoke-direct {p2}, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;-><init>()V

    .line 155
    .line 156
    iput-object p2, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->a:Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    .line 157
    .line 158
    iput-boolean v7, p2, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isSelected:Z

    .line 159
    .line 160
    const-string v0, "audio_1"

    .line 161
    .line 162
    iput-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->name:Ljava/lang/String;

    .line 163
    .line 164
    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ad:Ljava/util/List;

    .line 165
    .line 166
    .line 167
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->b()V

    .line 171
    .line 172
    new-instance p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/c;

    .line 173
    .line 174
    .line 175
    invoke-direct {p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/c;-><init>()V

    .line 176
    .line 177
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    .line 178
    .line 179
    new-instance p2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$1;

    .line 180
    .line 181
    .line 182
    invoke-direct {p2, p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$1;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)V

    .line 183
    .line 184
    .line 185
    invoke-interface {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a$a;)V

    .line 186
    .line 187
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    .line 188
    .line 189
    new-instance p2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$2;

    .line 190
    .line 191
    .line 192
    invoke-direct {p2, p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$2;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)V

    .line 193
    .line 194
    .line 195
    invoke-interface {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a$d;)V

    .line 196
    .line 197
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    .line 198
    .line 199
    new-instance p2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$3;

    .line 200
    .line 201
    .line 202
    invoke-direct {p2, p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$3;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)V

    .line 203
    .line 204
    .line 205
    invoke-interface {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a$c;)V

    .line 206
    .line 207
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    .line 208
    .line 209
    new-instance p2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$4;

    .line 210
    .line 211
    .line 212
    invoke-direct {p2, p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$4;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)V

    .line 213
    .line 214
    .line 215
    invoke-interface {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a$b;)V

    .line 216
    return-void
.end method

.method public static synthetic A(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->q:I

    return p0
.end method

.method private declared-synchronized A()V
    .locals 3

    .line 2
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->H:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->G:Ljava/util/concurrent/Future;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->G:Ljava/util/concurrent/Future;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v1

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public static synthetic B(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Z:I

    return p0
.end method

.method private B()V
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->K:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->G()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v2, "startCheckBufferingTimer, forbidden check buffer by position"

    invoke-virtual {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->J:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$a;

    if-nez v1, :cond_0

    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$a;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$1;)V

    iput-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->J:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$a;

    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$a;->a:Z

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/utils/o;->a()Lcom/tencent/thumbplayer/tcmedia/utils/o;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/thumbplayer/tcmedia/utils/o;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$6;

    invoke-direct {v3, p0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$6;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$a;)V

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x0

    invoke-interface {v2, v3, v5, v6, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$a;->b:Ljava/util/concurrent/Future;

    goto :goto_0

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private declared-synchronized C()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->K:Ljava/lang/Object;

    .line 4
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    .line 6
    :try_start_1
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->J:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$a;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    iput-boolean v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$a;->a:Z

    .line 12
    .line 13
    iget-object v1, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$a;->b:Ljava/util/concurrent/Future;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    .line 23
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->J:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$a;

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    iput-object v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$a;->b:Ljava/util/concurrent/Future;

    .line 27
    .line 28
    iput-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->J:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$a;

    .line 29
    :cond_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    monitor-exit p0

    .line 31
    return-void

    .line 32
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    :try_start_3
    throw v1

    .line 34
    :catchall_1
    move-exception v0

    .line 35
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 36
    throw v0
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
.end method

.method private D()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->o()J

    move-result-wide v2

    iget-wide v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->U:J

    iput-wide v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->U:J

    iget-object v4, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v5, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    const/4 v7, 0x0

    if-eq v4, v5, :cond_0

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-ne v0, v1, :cond_5

    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->X:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "checkBuffingEvent, pause state and send end buffering"

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iput-boolean v7, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->X:Z

    iput v7, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Y:I

    iget-object v8, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->w:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

    if-eqz v8, :cond_5

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/16 v9, 0xc9

    const-wide/16 v10, 0x0

    invoke-interface/range {v8 .. v14}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;->a(IJJLjava/lang/Object;)V

    return-void

    :cond_0
    iget-boolean v4, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->c:Z

    const-wide/16 v5, 0x0

    if-eqz v4, :cond_1

    iget-wide v8, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->e:J

    cmp-long v4, v8, v5

    if-lez v4, :cond_2

    cmp-long v4, v2, v8

    if-ltz v4, :cond_2

    iget-boolean v4, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->P:Z

    if-nez v4, :cond_2

    iget-object v4, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "checkBuffingEvent, loopback skip end, curPosition:"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, ", mLoopStartPositionMs:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v9, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->d:J

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-wide v8, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->d:J

    long-to-int v8, v8

    invoke-virtual {v4, v8}, Landroid/media/MediaPlayer;->seekTo(I)V

    goto :goto_0

    :cond_1
    iget-wide v8, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->n:J

    cmp-long v4, v8, v5

    if-lez v4, :cond_2

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->n()J

    move-result-wide v8

    iget-wide v10, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->n:J

    sub-long/2addr v8, v10

    cmp-long v4, v2, v8

    if-ltz v4, :cond_2

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "checkBuffingEvent, skip end, mBaseDuration: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->T:J

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ", curPosition:"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", mSkipEndMilsec:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->n:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->e()V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C()V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->v:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;->b()V

    return-void

    :cond_2
    :goto_0
    cmp-long v0, v2, v0

    if-eqz v0, :cond_3

    iget-wide v8, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ag:J

    const-wide/16 v10, 0x1

    add-long/2addr v8, v10

    iput-wide v8, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ag:J

    :cond_3
    if-nez v0, :cond_6

    cmp-long v0, v2, v5

    if-lez v0, :cond_6

    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Y:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Y:I

    iget v4, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->L:I

    if-lt v0, v4, :cond_4

    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->X:Z

    if-nez v0, :cond_4

    iput-boolean v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->X:Z

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "checkBuffingEvent, position no change,send start buffering"

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->w:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

    if-eqz v0, :cond_4

    iget-wide v4, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->T:J

    iget-wide v8, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ag:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const/16 v1, 0xc8

    invoke-interface/range {v0 .. v6}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;->a(IJJLjava/lang/Object;)V

    :cond_4
    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Y:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->M:I

    if-lt v0, v1, :cond_5

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "checkBuffingEvent post error"

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->e()V

    iput-boolean v7, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->X:Z

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C()V

    iget-object v8, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->x:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;

    if-eqz v8, :cond_5

    const/16 v0, -0x6e

    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->g(I)I

    move-result v10

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/16 v9, 0x7d1

    invoke-interface/range {v8 .. v14}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;->a(IIJJ)V

    :cond_5
    return-void

    :cond_6
    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->X:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "checkBuffingEvent, position change, send end buffering"

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->w:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

    if-eqz v0, :cond_7

    iget-wide v4, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->T:J

    iget-wide v8, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ag:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const/16 v1, 0xc9

    invoke-interface/range {v0 .. v6}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;->a(IJJLjava/lang/Object;)V

    :cond_7
    iput-boolean v7, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->X:Z

    iput v7, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Y:I

    return-void
.end method

.method private E()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->N:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->O:Ljava/util/concurrent/Future;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/utils/o;->a()Lcom/tencent/thumbplayer/tcmedia/utils/o;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/tencent/thumbplayer/tcmedia/utils/o;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    new-instance v2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$7;

    .line 18
    .line 19
    .line 20
    invoke-direct {v2, p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$7;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)V

    .line 21
    .line 22
    iget v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->M:I

    .line 23
    .line 24
    mul-int/lit16 v3, v3, 0x190

    .line 25
    int-to-long v3, v3

    .line 26
    .line 27
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 28
    .line 29
    .line 30
    invoke-interface {v1, v2, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    iput-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->O:Ljava/util/concurrent/Future;

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw v1
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
.end method

.method private declared-synchronized F()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->N:Ljava/lang/Object;

    .line 4
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    .line 6
    :try_start_1
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->O:Ljava/util/concurrent/Future;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    .line 12
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    iput-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->O:Ljava/util/concurrent/Future;

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    :try_start_3
    throw v1

    .line 24
    :catchall_1
    move-exception v0

    .line 25
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 26
    throw v0
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
.end method

.method private G()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->o:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->t:Z

    .line 9
    return v0
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
.end method

.method public static synthetic a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->W:I

    return p1
.end method

.method private a()Landroid/media/MediaPlayer;
    .locals 2

    .line 2
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/b;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/b;-><init>()V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ai:Landroid/media/MediaPlayer$OnTimedTextListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnTimedTextListener(Landroid/media/MediaPlayer$OnTimedTextListener;)V

    return-object v0
.end method

.method public static synthetic a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;)Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    return-object p1
.end method

.method public static synthetic a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->A:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;

    return-object p0
.end method

.method private a(Landroid/media/MediaPlayer;)V
    .locals 3

    .line 10
    :try_start_0
    const-class v0, Landroid/media/MediaPlayer;

    const-string v1, "mEventHandler"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    const-class v0, Landroid/os/Handler;

    const-string v2, "mCallback"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler$Callback;

    if-nez v1, :cond_0

    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$c;

    invoke-direct {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$c;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mediaPlayerExceptionHook, "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    return-void
.end method

.method private a(Landroid/media/MediaPlayer;II)V
    .locals 3
    .param p3    # I
        .annotation runtime Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TPSeekMode;
        .end annotation
    .end param

    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    iget-object p3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "os ver is too low, current sdk int:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", is less than 26, use seekTo(int positionMs) instead"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->seekTo(I)V

    return-void

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p3, v0, :cond_2

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    const/4 v2, 0x2

    if-ne p3, v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x3

    if-ne p3, v0, :cond_1

    move v0, v2

    :goto_0
    int-to-long v1, p2

    :try_start_0
    invoke-static {p1, v1, v2, v0}, Lcom/shopify/reactnative/skia/a;->a(Landroid/media/MediaPlayer;JI)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p3

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-virtual {v0, p3}, Lcom/tencent/thumbplayer/tcmedia/e/a;->a(Ljava/lang/Exception;)V

    :try_start_1
    iget-object p3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-ne p3, v0, :cond_4

    sget-object p3, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object p3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_4
    :goto_1
    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->seekTo(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :goto_2
    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-virtual {p2, p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method private declared-synchronized a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;)V
    .locals 11

    .line 15
    monitor-enter p0

    :try_start_0
    iget-object v0, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->g:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->o()J

    move-result-wide v1

    iput-wide v1, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->c:J

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v1, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ac:I

    iput v1, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->e:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Z:I

    iput v1, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->f:I

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "playerResetStart, pos:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->c:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ", state:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->S:Z

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->f()V

    sget-object v2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->a:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->g:Ljava/io/FileDescriptor;

    if-eqz v2, :cond_0

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->g:Ljava/io/FileDescriptor;

    invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_4

    :cond_0
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->h:Landroid/content/res/AssetFileDescriptor;

    if-eqz v2, :cond_1

    invoke-direct {p0, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->b(Landroid/content/res/AssetFileDescriptor;)V

    goto :goto_0

    :cond_1
    iget v2, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->d:I

    invoke-direct {p0, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->e(I)V

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->l:Ljava/util/Map;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-object v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->b:Landroid/content/Context;

    iget-object v4, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->l:Ljava/util/Map;

    invoke-virtual {v2, v3, v0, v4}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v2, v0}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    :goto_0
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->b:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->F:Ljava/lang/Object;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    goto :goto_1

    :cond_3
    instance-of v2, v0, Landroid/view/SurfaceHolder;

    if-eqz v2, :cond_4

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->F:Ljava/lang/Object;

    check-cast v2, Landroid/view/SurfaceHolder;

    invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    goto :goto_1

    :cond_4
    instance-of v0, v0, Landroid/view/Surface;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->F:Ljava/lang/Object;

    check-cast v2, Landroid/view/Surface;

    invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V

    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ah:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;

    if-eqz v0, :cond_8

    iget v2, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->a:I

    iget v3, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->a:I

    if-eq v2, v3, :cond_8

    iget-object v4, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->w:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

    if-ne v2, v1, :cond_6

    const/4 v1, 0x3

    :goto_2
    move v5, v1

    goto :goto_3

    :cond_6
    const/4 v1, 0x4

    goto :goto_2

    :goto_3
    if-eqz v4, :cond_7

    iget-wide v6, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->b:J

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;->a(IJJLjava/lang/Object;)V

    :cond_7
    iget-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v1, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->c:J

    iput-wide v0, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->c:J

    :cond_8
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ah:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;

    iget-object p1, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->c:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq p1, v0, :cond_9

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq p1, v0, :cond_9

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq p1, v0, :cond_9

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-ne p1, v0, :cond_a

    :cond_9
    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_a
    monitor-exit p0

    return-void

    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private a(Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;)V
    .locals 3

    .line 31
    if-nez p1, :cond_0

    return-void

    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->s:Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;

    invoke-virtual {v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;->toAndroidMediaAudioAttributes()Landroid/media/AudioAttributes;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioAttributes(Landroid/media/AudioAttributes;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "set audio attributes into MediaPlayer, API:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ">=21, "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->s:Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;)Z
    .locals 1

    .line 45
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public static synthetic a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;Z)Z
    .locals 0

    .line 46
    iput-boolean p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->X:Z

    return p1
.end method

.method public static synthetic b(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->V:I

    return p1
.end method

.method public static synthetic b(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;)Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    return-object p1
.end method

.method public static synthetic b(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$m;
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->B:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$m;

    return-object p0
.end method

.method private b()V
    .locals 1

    .line 5
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a()Landroid/media/MediaPlayer;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->a:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    return-void
.end method

.method private b(Landroid/content/res/AssetFileDescriptor;)V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/res/AssetFileDescriptor;)V

    return-void
.end method

.method private b(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;)Z
    .locals 1

    .line 10
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic b(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;Z)Z
    .locals 0

    .line 11
    iput-boolean p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->P:Z

    return p1
.end method

.method public static synthetic c(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)Lcom/tencent/thumbplayer/tcmedia/e/a;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    return-object p0
.end method

.method private c()V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    invoke-direct {p0, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "MediaPlayer stop."

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    :cond_0
    return-void
.end method

.method public static synthetic d(I)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->g(I)I

    move-result p0

    return p0
.end method

.method public static synthetic d(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->w:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

    return-object p0
.end method

.method private d()V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    invoke-direct {p0, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->b(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "MediaPlayer release."

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    :cond_0
    return-void
.end method

.method private d(IJ)V
    .locals 2

    .line 4
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$1;)V

    iput-wide p2, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->b:J

    iput p1, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->d:I

    const/4 p1, 0x2

    iput p1, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->a:I

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->f:Ljava/lang/String;

    iput-object p1, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->g:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;)V

    return-void
.end method

.method public static synthetic e(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    return-object p0
.end method

.method private e()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->y()V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->c()V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->d()V

    return-void
.end method

.method private e(I)V
    .locals 7

    .line 3
    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ad:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->w:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

    if-eqz v0, :cond_1

    new-instance v6, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPAudioTrackInfo;

    invoke-direct {v6}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPAudioTrackInfo;-><init>()V

    iget-object v1, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->b:Ljava/lang/String;

    iput-object v1, v6, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPAudioTrackInfo;->audioTrackUrl:Ljava/lang/String;

    iget-object p1, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->c:Ljava/util/List;

    iput-object p1, v6, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPAudioTrackInfo;->paramData:Ljava/util/List;

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "handleDataSource, audioTrack url:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v6, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPAudioTrackInfo;->audioTrackUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/16 v1, 0x3f3

    invoke-interface/range {v0 .. v6}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;->a(IJJLjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private e(IJ)V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;->e()V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ae:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    iget-object v1, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->b:Ljava/lang/String;

    iget-object p1, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->d:Ljava/util/Map;

    invoke-interface {v0, v1, p1, p2, p3}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;->a(Ljava/lang/String;Ljava/util/Map;J)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    invoke-interface {p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;->a()V

    return-void
.end method

.method private f(I)I
    .locals 1

    .line 1
    const/4 v0, 0x2

    if-ne v0, p1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    return v0

    :cond_1
    const/4 v0, 0x4

    if-ne v0, p1, :cond_2

    const/4 p1, 0x3

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic f(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    return-object p0
.end method

.method private f()V
    .locals 5

    .line 3
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->A()V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C()V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->F()V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->e()V

    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/b;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/b;-><init>()V

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$d;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ai:Landroid/media/MediaPlayer$OnTimedTextListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnTimedTextListener(Landroid/media/MediaPlayer$OnTimedTextListener;)V

    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1, v1}, Landroid/media/MediaPlayer;->setVolume(FF)V

    goto :goto_1

    :cond_0
    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->j:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->j:F

    goto :goto_0

    :cond_1
    :goto_1
    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->k:F

    float-to-double v1, v0

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    cmpl-double v1, v1, v3

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->b(F)V

    :cond_2
    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->c:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-boolean v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->c:Z

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    :cond_3
    return-void
.end method

.method private f(IJ)V
    .locals 3

    .line 4
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "deselectSubTrack, trackIndex:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", opaque:"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    invoke-interface {p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;->e()V

    return-void
.end method

.method private static g(I)I
    .locals 4

    .line 1
    const-wide/32 v0, 0x989680

    int-to-long v2, p0

    if-gez p0, :cond_0

    sub-long/2addr v0, v2

    goto :goto_0

    :cond_0
    add-long/2addr v0, v2

    :goto_0
    const-wide/32 v2, 0x7fffffff

    cmp-long p0, v0, v2

    if-ltz p0, :cond_1

    move-wide v0, v2

    :cond_1
    long-to-int p0, v0

    return p0
.end method

.method public static synthetic g(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->e()V

    return-void
.end method

.method public static synthetic h(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->A()V

    return-void
.end method

.method public static synthetic i(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->x:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;

    return-object p0
.end method

.method public static synthetic j(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->D()V

    return-void
.end method

.method public static synthetic k(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)Z
    .locals 0

    .line 2
    iget-boolean p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->X:Z

    return p0
.end method

.method public static synthetic l(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->F()V

    return-void
.end method

.method public static synthetic m(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)Landroid/media/MediaPlayer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    return-object p0
.end method

.method public static synthetic n(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->m:I

    return p0
.end method

.method public static synthetic o(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)Z
    .locals 0

    .line 2
    iget-boolean p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->o:Z

    return p0
.end method

.method public static synthetic p(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->w()V

    return-void
.end method

.method public static synthetic q(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C()V

    return-void
.end method

.method public static synthetic r(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->v:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;

    return-object p0
.end method

.method public static synthetic s(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->G()Z

    move-result p0

    return p0
.end method

.method public static synthetic t(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->E()V

    return-void
.end method

.method public static synthetic u(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->W:I

    return p0
.end method

.method public static synthetic v(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->V:I

    return p0
.end method

.method public static synthetic w(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->z:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;

    return-object p0
.end method

.method private declared-synchronized w()V
    .locals 9

    .line 2
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ah:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "playerResetEnd, actionInfo:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", mSuspend:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->S:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    if-eqz v1, :cond_b

    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->S:Z

    if-eqz v0, :cond_b

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->w:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

    iget v0, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->a:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    const/4 v0, 0x3

    :goto_0
    move v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x4

    goto :goto_0

    :goto_1
    if-eqz v2, :cond_1

    iget-wide v4, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->b:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const-wide/16 v4, 0x3e8

    const-wide/16 v6, 0x0

    invoke-interface/range {v2 .. v8}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;->a(IJJLjava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    :goto_2
    iget v0, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->e:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->e:I

    invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->selectTrack(I)V

    :cond_2
    iget v0, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->f:I

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->f:I

    invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->selectTrack(I)V

    :cond_3
    iget-wide v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->c:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_4

    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->P:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "playerResetEnd, onPrepared(), and seek to:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->c:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-wide v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->c:J

    long-to-int v2, v2

    invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->seekTo(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catch_0
    move-exception v0

    :try_start_2
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-virtual {v2, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->a(Ljava/lang/Exception;)V

    :cond_4
    :goto_3
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "playerResetEnd, restore state:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-object v0, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->a:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v0, v2, :cond_9

    sget-object v2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->b:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v0, v2, :cond_9

    sget-object v2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->c:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-ne v0, v2, :cond_5

    goto :goto_5

    :cond_5
    sget-object v2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v0, v2, :cond_8

    sget-object v2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-ne v0, v2, :cond_6

    goto :goto_4

    :cond_6
    sget-object v2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-ne v0, v2, :cond_7

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v3, "playerResetEnd,  MediaPlayer.start()."

    invoke-virtual {v0, v3}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    iget-object v0, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->B()V

    goto :goto_6

    :cond_7
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "illegal state, state:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->e()V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->x:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;

    if-eqz v1, :cond_a

    const/16 v0, -0x2714

    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->g(I)I

    move-result v3

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/16 v2, 0x7d0

    invoke-interface/range {v1 .. v7}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;->a(IIJJ)V

    goto :goto_6

    :cond_8
    :goto_4
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    goto :goto_6

    :cond_9
    :goto_5
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->u:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;->a()V

    :cond_a
    :goto_6
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->S:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ah:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_b
    :try_start_3
    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->m:I

    if-lez v0, :cond_c

    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->P:Z

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onPrepared(), and seekto:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->m:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->m:I

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_7

    :catch_1
    move-exception v0

    :try_start_5
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-virtual {v1, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->a(Ljava/lang/Exception;)V

    :cond_c
    :goto_7
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->u:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;

    if-eqz v0, :cond_d

    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;->a()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_d
    monitor-exit p0

    return-void

    :goto_8
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v0
.end method

.method public static synthetic x(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    return-object p0
.end method

.method private x()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->s:Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;

    invoke-direct {p0, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;)V

    return-void
.end method

.method public static synthetic y(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->y:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;

    return-object p0
.end method

.method private y()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    return-void
.end method

.method public static synthetic z(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->r:I

    return p0
.end method

.method private z()V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "startCheckPrepareTimeoutTimer"

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->H:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->G:Ljava/util/concurrent/Future;

    if-nez v1, :cond_0

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/utils/o;->a()Lcom/tencent/thumbplayer/tcmedia/utils/o;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/thumbplayer/tcmedia/utils/o;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    new-instance v2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$5;

    invoke-direct {v2, p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$5;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;)V

    iget-wide v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->I:J

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->G:Ljava/util/concurrent/Future;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public a(F)V
    .locals 3

    .line 5
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "setAudioGainRatio, : "

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iput p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->j:F

    :try_start_0
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->j:F

    invoke-virtual {p1, v0, v0}, Landroid/media/MediaPlayer;->setVolume(FF)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setAudioGainRatio ex : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void
.end method

.method public a(I)V
    .locals 3

    .line 6
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "seekTo, position: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->P:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v0, "current media is not seekable, ignore"

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->S:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ah:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;

    if-eqz v0, :cond_1

    int-to-long v1, p1

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->c:J

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-ne v0, v1, :cond_3

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    :cond_3
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    return-void
.end method

.method public a(II)V
    .locals 3
    .param p2    # I
        .annotation runtime Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TPSeekMode;
        .end annotation
    .end param

    .line 7
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "seekTo, position: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", mode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->P:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string p2, "current media is not seekable, ignore"

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->S:Z

    if-eqz v0, :cond_2

    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ah:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;

    if-eqz p2, :cond_1

    int-to-long v0, p1

    iput-wide v0, p2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->c:J

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-direct {p0, v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a(Landroid/media/MediaPlayer;II)V

    return-void
.end method

.method public a(IJ)V
    .locals 16

    .line 8
    move-object/from16 v1, p0

    move/from16 v2, p1

    move-wide/from16 v3, p2

    iget-object v0, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "selectTrack, trackID:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", opaque:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-object v0, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ad:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v5, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ae:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    iget-object v6, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ad:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    iget-object v7, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->w:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

    const/16 v6, -0x2710

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-ltz v2, :cond_0

    if-ge v2, v0, :cond_0

    :try_start_0
    invoke-direct/range {p0 .. p3}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->d(IJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ad:Ljava/util/List;

    iget v3, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->aa:I

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;

    iget-object v0, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->a:Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    iput-boolean v15, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isSelected:Z

    iget-object v0, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ad:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;

    iget-object v0, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->a:Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    iput-boolean v14, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isSelected:Z

    iput v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->aa:I

    return-void

    :catch_0
    move-exception v0

    iget-object v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-virtual {v2, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->a(Ljava/lang/Exception;)V

    if-eqz v7, :cond_9

    invoke-static {v6}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->g(I)I

    move-result v0

    :goto_0
    int-to-long v11, v0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    const/4 v8, 0x4

    const-wide/16 v9, 0x7d0

    :goto_1
    invoke-interface/range {v7 .. v13}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;->a(IJJLjava/lang/Object;)V

    goto/16 :goto_7

    :cond_0
    if-lt v2, v0, :cond_3

    add-int v8, v0, v5

    if-ge v2, v8, :cond_3

    sub-int v8, v2, v0

    :try_start_1
    invoke-direct {v1, v8, v3, v4}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->e(IJ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    move v3, v8

    goto :goto_2

    :catch_1
    move-exception v0

    iget-object v9, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-virtual {v9, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->a(Ljava/lang/Exception;)V

    if-eqz v7, :cond_1

    invoke-static {v6}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->g(I)I

    move-result v0

    int-to-long v11, v0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    move v3, v8

    const/4 v8, 0x4

    const-wide/16 v9, 0x7d0

    invoke-interface/range {v7 .. v13}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;->a(IJJLjava/lang/Object;)V

    :goto_2
    iget v0, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ab:I

    if-ltz v0, :cond_2

    if-ge v0, v5, :cond_2

    iget-object v4, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ae:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;

    iget-object v0, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->a:Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    iput-boolean v15, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isSelected:Z

    :cond_2
    iget-object v0, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ae:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;

    iget-object v0, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->a:Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    iput-boolean v14, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isSelected:Z

    iput v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ab:I

    return-void

    :cond_3
    add-int/2addr v0, v5

    sub-int v0, v2, v0

    iget-object v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v5, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v2, v5, :cond_4

    iget-object v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v5, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v2, v5, :cond_4

    iget-object v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v5, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v2, v5, :cond_4

    iget-object v0, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "selectTrack, illegal state:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    return-void

    :cond_4
    :try_start_2
    iget-object v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getTrackInfo()[Landroid/media/MediaPlayer$TrackInfo;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    iget-object v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v5, "getTrackInfo, android getTrackInfo crash"

    invoke-virtual {v2, v5}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_8

    array-length v5, v2

    if-gt v5, v0, :cond_5

    goto :goto_6

    :cond_5
    aget-object v2, v2, v0

    invoke-virtual {v2}, Landroid/media/MediaPlayer$TrackInfo;->getTrackType()I

    move-result v5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_6

    iput v0, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ac:I

    goto :goto_4

    :cond_6
    invoke-virtual {v2}, Landroid/media/MediaPlayer$TrackInfo;->getTrackType()I

    move-result v2

    const/4 v5, 0x4

    if-ne v2, v5, :cond_7

    iput v0, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Z:I

    :goto_4
    iget-object v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v2, v0}, Landroid/media/MediaPlayer;->selectTrack(I)V

    if-eqz v7, :cond_9

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    const/4 v8, 0x4

    const-wide/16 v9, 0x3e8

    const-wide/16 v11, 0x0

    goto/16 :goto_1

    :cond_7
    if-eqz v7, :cond_9

    const/16 v0, -0x2713

    :goto_5
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->g(I)I

    move-result v0

    goto/16 :goto_0

    :cond_8
    :goto_6
    if-eqz v7, :cond_9

    const/16 v0, -0x2712

    goto :goto_5

    :cond_9
    :goto_7
    return-void
.end method

.method public a(Landroid/content/res/AssetFileDescriptor;)V
    .locals 3

    .line 9
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setDataSource afd\uff0c afd: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->h:Landroid/content/res/AssetFileDescriptor;

    invoke-direct {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->b(Landroid/content/res/AssetFileDescriptor;)V

    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/a/c;

    invoke-direct {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/a/c;-><init>(Landroid/content/res/AssetFileDescriptor;)V

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->E:Lcom/tencent/thumbplayer/tcmedia/a/c;

    sget-object p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->b:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    return-void

    :cond_0
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v0, "setDataSource afd is null "

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "afd is null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Landroid/os/ParcelFileDescriptor;)V
    .locals 3

    .line 12
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setDataSource pfd\uff0c pfd: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->g:Ljava/io/FileDescriptor;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;)V

    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/a/c;

    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/a/c;-><init>(Ljava/io/FileDescriptor;)V

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->E:Lcom/tencent/thumbplayer/tcmedia/a/c;

    sget-object p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->b:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    return-void

    :cond_0
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v0, "setDataSource pfd is null "

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "pfd is null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Landroid/view/Surface;)V
    .locals 3

    .line 13
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "setSurface, surface: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->F:Ljava/lang/Object;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "setSurface over, surface: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/view/SurfaceHolder;)V
    .locals 3

    .line 14
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "setSurfaceHolder, sh: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->F:Ljava/lang/Object;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "setSurfaceHolder over, sh: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$a;)V
    .locals 1

    .line 16
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "system Mediaplayer cannot support audio frame out"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$b;)V
    .locals 1

    .line 17
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "system Mediaplayer cannot support audio postprocess frame out"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->v:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$d;)V
    .locals 0

    .line 19
    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$e;)V
    .locals 0

    .line 20
    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->x:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$g;)V
    .locals 0

    .line 22
    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->w:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->u:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->y:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->A:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$m;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->B:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$m;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$n;)V
    .locals 1

    .line 28
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "system Mediaplayer cannot support video frame out"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$o;)V
    .locals 1

    .line 29
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "system Mediaplayer cannot support video postprocess frame out"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->z:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureParams;Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureCallBack;)V
    .locals 3

    .line 32
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->E:Lcom/tencent/thumbplayer/tcmedia/a/c;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGeneratorParams;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGeneratorParams;-><init>()V

    iget v1, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureParams;->width:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGeneratorParams;->width:I

    iget v1, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureParams;->height:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGeneratorParams;->height:I

    iget v1, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureParams;->format:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGeneratorParams;->format:I

    iget-wide v1, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureParams;->requestedTimeMsToleranceBefore:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGeneratorParams;->requestedTimeMsToleranceBefore:J

    iget-wide v1, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureParams;->requestedTimeMsToleranceAfter:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGeneratorParams;->requestedTimeMsToleranceAfter:J

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->E:Lcom/tencent/thumbplayer/tcmedia/a/c;

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->o()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2, v0, p2}, Lcom/tencent/thumbplayer/tcmedia/a/c;->a(JLcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGeneratorParams;Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureCallBack;)V

    return-void

    :cond_0
    const p1, 0xf424d

    invoke-interface {p2, p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureCallBack;->onCaptureVideoFailed(I)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V
    .locals 5

    .line 33
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getKey()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_e

    const/4 v2, 0x2

    if-eq v0, v2, :cond_d

    const/4 v2, 0x3

    if-eq v0, v2, :cond_c

    const/4 v2, 0x4

    if-eq v0, v2, :cond_b

    const/4 v1, 0x5

    if-eq v0, v1, :cond_a

    const/4 v1, 0x7

    const-wide/16 v2, 0x190

    const-string v4, "(ms)"

    if-eq v0, v1, :cond_9

    const/16 v1, 0x64

    if-eq v0, v1, :cond_8

    const/16 v1, 0x6b

    if-eq v0, v1, :cond_7

    const/16 v1, 0x80

    if-eq v0, v1, :cond_6

    const/16 v1, 0x19e

    if-eq v0, v1, :cond_5

    const/16 v1, 0x1c2

    const-string v2, "TPSystemMediaPlayer"

    if-eq v0, v1, :cond_3

    const/16 v1, 0x1f4

    if-eq v0, v1, :cond_2

    const/16 v1, 0x1fb

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamObject()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamObject;

    move-result-object p1

    iget-object p1, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamObject;->objectValue:Ljava/lang/Object;

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;)V

    :cond_1
    const-string p1, "setPlayerOptionalParam, subtitle render model"

    invoke-static {v2, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamLong()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;

    move-result-object p1

    iget-wide v0, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;->value:J

    iput-wide v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->n:J

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setPlayerOptionalParam, skip end position:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->n:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamLong()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;

    move-result-object v0

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;->value:J

    long-to-int v0, v0

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    if-eqz v1, :cond_4

    invoke-interface {v1, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;->a(I)V

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setPlayerOptionalParam, subtitle type:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamLong()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;

    move-result-object p1

    iget-wide v3, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;->value:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_5
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamObject()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamObject;

    move-result-object p1

    iget-object p1, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamObject;->objectValue:Ljava/lang/Object;

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;

    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->s:Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setPlayerOptionalParam, "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->s:Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;

    invoke-virtual {v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void

    :cond_6
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamLong()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;

    move-result-object p1

    iget-wide v0, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;->value:J

    iput-wide v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->I:J

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setPlayerOptionalParam, prepare timeout:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->I:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void

    :cond_7
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamLong()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;

    move-result-object v0

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;->value:J

    add-long/2addr v0, v2

    div-long/2addr v0, v2

    long-to-int v0, v0

    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->M:I

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setPlayerOptionalParam, buffer timeout:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamLong()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;

    move-result-object p1

    iget-wide v2, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;->value:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void

    :cond_8
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamLong()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;

    move-result-object p1

    iget-wide v0, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;->value:J

    long-to-int p1, v0

    iput p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->m:I

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setPlayerOptionalParam, start position:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->m:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void

    :cond_9
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamLong()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;

    move-result-object v0

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;->value:J

    div-long/2addr v0, v2

    long-to-int v0, v0

    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->L:I

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setPlayerOptionalParam, on buffer timeout:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamLong()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;

    move-result-object p1

    iget-wide v2, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;->value:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void

    :cond_a
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamBoolean()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamBoolean;

    move-result-object p1

    iget-boolean p1, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamBoolean;->value:Z

    iput-boolean p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->t:Z

    return-void

    :cond_b
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamBoolean()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamBoolean;

    move-result-object p1

    iget-boolean p1, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamBoolean;->value:Z

    iput-boolean p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->o:Z

    iput-boolean v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->P:Z

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setPlayerOptionalParam, is live:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->o:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void

    :cond_c
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamLong()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;

    move-result-object p1

    iget-wide v0, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;->value:J

    long-to-int p1, v0

    iput p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->q:I

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setPlayerOptionalParam, video height:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void

    :cond_d
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamLong()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;

    move-result-object p1

    iget-wide v0, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;->value:J

    long-to-int p1, v0

    iput p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->r:I

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setPlayerOptionalParam, video width:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->r:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void

    :cond_e
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamLong()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;

    move-result-object p1

    iget-wide v0, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;->value:J

    iput-wide v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->p:J

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;)V
    .locals 1

    .line 34
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "setDataSource by asset, android mediaplayer not support"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;IJ)V
    .locals 0
    .param p2    # I
        .annotation runtime Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TPSwitchDefMode;
        .end annotation
    .end param

    .line 35
    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/e/b;)V
    .locals 3

    .line 36
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/e/b;

    const-string v2, "TPSystemMediaPlayer"

    invoke-direct {v1, p1, v2}, Lcom/tencent/thumbplayer/tcmedia/e/b;-><init>(Lcom/tencent/thumbplayer/tcmedia/e/b;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->a(Lcom/tencent/thumbplayer/tcmedia/e/b;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 37
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v0, "setAudioNormalizeVolumeParams not supported."

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;IJ)V
    .locals 2
    .param p2    # I
        .annotation runtime Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TPSwitchDefMode;
        .end annotation
    .end param

    .line 38
    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "switchDefinition, defUrl: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string p2, "switchDefinition, defUrl is null"

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->f:Ljava/lang/String;

    new-instance p2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$1;)V

    iput-wide p3, p2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->b:J

    iget p3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->aa:I

    iput p3, p2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->d:I

    const/4 p3, 0x1

    iput p3, p2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->a:I

    iput-object p1, p2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->g:Ljava/lang/String;

    :try_start_0
    invoke-direct {p0, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "playerResetStart"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "setDataSource httpHeader, url: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->f:Ljava/lang/String;

    iput-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->l:Ljava/util/Map;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->l:Ljava/util/Map;

    invoke-virtual {v0, v1, p2, v2}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V

    new-instance p2, Lcom/tencent/thumbplayer/tcmedia/a/c;

    invoke-direct {p2, p1}, Lcom/tencent/thumbplayer/tcmedia/a/c;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->E:Lcom/tencent/thumbplayer/tcmedia/a/c;

    sget-object p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->b:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;IJ)V
    .locals 1
    .param p3    # I
        .annotation runtime Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TPSwitchDefMode;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;IJ)V"
        }
    .end annotation

    .line 40
    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "switchDefinition, defUrl: "

    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string p2, "switchDefinition, defUrl is null"

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->f:Ljava/lang/String;

    new-instance p2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$1;)V

    iput-wide p4, p2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->b:J

    iget p3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->aa:I

    iput p3, p2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->d:I

    const/4 p3, 0x1

    iput p3, p2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->a:I

    iput-object p1, p2, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->g:Ljava/lang/String;

    :try_start_0
    invoke-direct {p0, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "playerResetStart"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 41
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_1

    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p3, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    invoke-direct {p3}, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;-><init>()V

    iput-object p4, p3, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->name:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p3, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isExclusive:Z

    const/4 v0, 0x0

    iput-boolean v0, p3, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isInternal:Z

    iput-boolean v0, p3, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isSelected:Z

    const/4 v0, 0x3

    iput v0, p3, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->trackType:I

    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$1;)V

    iput-object p3, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->a:Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    iput-object p1, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->b:Ljava/lang/String;

    iput-object p2, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->d:Ljava/util/Map;

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "addSubtitleSource, name:"

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p3, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->name:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", url:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ae:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string p2, "addSubtitleSource, illegal argument."

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;",
            ">;)V"
        }
    .end annotation

    .line 42
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;-><init>()V

    iput-object p3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->name:Ljava/lang/String;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isExclusive:Z

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isInternal:Z

    iput-boolean v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isSelected:Z

    const/4 v1, 0x2

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->trackType:I

    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$1;)V

    iput-object v0, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->a:Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    iput-object p1, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->b:Ljava/lang/String;

    iput-object p2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->d:Ljava/util/Map;

    iput-object p4, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->c:Ljava/util/List;

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "addAudioTrackSource, name:"

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p4, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->name:Ljava/lang/String;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", url:"

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ad:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string p2, "addAudioTrackSource, illegal argument."

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    return-void
.end method

.method public a(Z)V
    .locals 3

    .line 43
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "setOutputMute, : "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->i:Z

    if-eqz p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0}, Landroid/media/MediaPlayer;->setVolume(FF)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v0, "setOutputMute, true"

    :goto_0
    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->j:F

    invoke-virtual {p1, v0, v0}, Landroid/media/MediaPlayer;->setVolume(FF)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setOutputMute, false, mAudioGain: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->j:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setOutputMute, Exception: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void
.end method

.method public a(ZJJ)V
    .locals 3

    .line 44
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setLoopback, : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", loopStart: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", loopEnd: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_0

    iget-wide v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->T:J

    cmp-long v2, p2, v0

    if-gtz v2, :cond_0

    cmp-long v0, p4, v0

    if-gtz v0, :cond_0

    iput-boolean p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->c:Z

    iput-wide p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->d:J

    iput-wide p4, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->e:J

    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {p2, p1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "position error, must more than 0 and less than duration"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(I)J
    .locals 2

    .line 2
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public b(F)V
    .locals 3

    .line 6
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "setPlaySpeedRatio, : "

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iput p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->k:F

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "setPlaySpeedRatio play speed:"

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/PlaybackParams;->getSpeed()F

    move-result v1

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public b(IJ)V
    .locals 3

    .line 7
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "deselectTrack, trackID "

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ad:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ae:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt p1, v0, :cond_0

    add-int/2addr v1, v0

    if-ge p1, v1, :cond_0

    sub-int/2addr p1, v0

    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->f(IJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    iget-object p3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-virtual {p3, p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->a(Ljava/lang/Exception;)V

    :goto_0
    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ae:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;

    iget-object p1, p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->a:Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    const/4 p2, 0x0

    iput-boolean p2, p1, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isSelected:Z

    const/4 p1, -0x1

    iput p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ab:I

    return-void

    :cond_0
    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {p2, p1}, Landroid/media/MediaPlayer;->deselectTrack(I)V

    return-void
.end method

.method public b(Z)V
    .locals 3

    .line 9
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "setLoopback, : "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->c:Z

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    return-void
.end method

.method public c(Z)Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;
    .locals 0

    .line 1
    const/4 p1, 0x0

    return-object p1
.end method

.method public c(I)Ljava/lang/String;
    .locals 0

    .line 3
    const/4 p1, 0x0

    return-object p1
.end method

.method public c(IJ)V
    .locals 0

    .line 5
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string p2, "selectProgram, android mediaplayer not support"

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    return-void
.end method

.method public g()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "call prepare() on mMediaPlayerState==COMPLETE"

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->d(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->x()V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "prepare "

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->c:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    return-void
.end method

.method public h()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->x()V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "prepareAsync "

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->c:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->z()V

    return-void
.end method

.method public i()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "start "

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->S:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ah:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "system player is busy."

    :goto_0
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->d(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "start(), illegal state, state:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;->b()V

    :cond_3
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->k:F

    float-to-double v1, v0

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    cmpl-double v1, v1, v3

    if-eqz v1, :cond_4

    invoke-virtual {p0, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->b(F)V

    :cond_4
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->B()V

    return-void
.end method

.method public declared-synchronized j()V
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "pause "

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->S:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ah:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "system player is busy."

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;->c()V

    :cond_2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public declared-synchronized k()V
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "stop "

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->A()V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C()V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->F()V

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->c()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->aa:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ab:I

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ah:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$f;

    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Z:I

    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ac:I

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;->d()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ag:J

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "stop over."

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized l()V
    .locals 3

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "reset "

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->a:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->R:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;->e()V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->m:I

    const-wide/16 v1, -0x1

    iput-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->n:J

    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->o:Z

    iput-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->p:J

    const/4 v0, -0x1

    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->q:I

    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->r:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->s:Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->A()V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C()V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->F()V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "reset over."

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized m()V
    .locals 2

    .line 2
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "release "

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->af:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;

    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/a;->f()V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->A()V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C()V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->F()V

    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->e()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->u:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->v:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->w:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->x:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->y:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->z:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->A:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->F:Ljava/lang/Object;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "release over."

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public n()J
    .locals 7

    .line 2
    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->o:Z

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->S:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->T:J

    return-wide v0

    :cond_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v0, v3, :cond_2

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v0, v3, :cond_2

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v0, v3, :cond_2

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_2
    iget-wide v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->T:J

    cmp-long v0, v3, v1

    if-gtz v0, :cond_3

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    int-to-long v3, v0

    iput-wide v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->T:J

    :cond_3
    iget-wide v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->p:J

    cmp-long v0, v3, v1

    if-lez v0, :cond_5

    iget-wide v5, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->T:J

    cmp-long v0, v5, v1

    if-gtz v0, :cond_4

    iput-wide v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->T:J

    goto :goto_0

    :cond_4
    sub-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x64

    mul-long/2addr v0, v2

    iget-wide v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->p:J

    div-long/2addr v0, v2

    const-wide/16 v4, 0x1

    cmp-long v0, v0, v4

    if-lez v0, :cond_5

    iput-wide v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->T:J

    :cond_5
    :goto_0
    iget-wide v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->T:J

    return-wide v0
.end method

.method public o()J
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->o:Z

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->S:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-ne v0, v1, :cond_1

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->a:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->b:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->c:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-ne v0, v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    :goto_0
    int-to-long v0, v0

    return-wide v0

    :cond_3
    :goto_1
    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->m:I

    goto :goto_0

    :cond_4
    :goto_2
    iget-wide v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->U:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_5
    return-wide v0
.end method

.method public p()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public q()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "getVideoWidth, width:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->V:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->V:I

    return v0
.end method

.method public r()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "getVideoHeight, height:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->W:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->W:I

    return v0
.end method

.method public s()[Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;
    .locals 9

    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->Q:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$e;

    if-ne v0, v1, :cond_1

    :cond_0
    sget v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->SDK_INT:I

    const/16 v1, 0x10

    if-le v0, v1, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->C:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getTrackInfo()[Landroid/media/MediaPlayer$TrackInfo;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v1, "getTrackInfo, android getTrackInfo crash"

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ad:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ae:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    new-array v0, v1, [Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    return-object v0

    :cond_2
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ad:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ae:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v2, v3

    if-nez v0, :cond_3

    move v3, v1

    goto :goto_1

    :cond_3
    array-length v3, v0

    :goto_1
    add-int/2addr v2, v3

    new-array v2, v2, [Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    iget-object v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ad:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v1

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;

    add-int/lit8 v6, v4, 0x1

    iget-object v5, v5, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->a:Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    aput-object v5, v2, v4

    move v4, v6

    goto :goto_2

    :cond_4
    iget-object v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->ae:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;

    add-int/lit8 v6, v4, 0x1

    iget-object v5, v5, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e$b;->a:Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    aput-object v5, v2, v4

    move v4, v6

    goto :goto_3

    :cond_5
    if-eqz v0, :cond_7

    array-length v3, v0

    if-gtz v3, :cond_6

    goto :goto_5

    :cond_6
    array-length v3, v0

    :goto_4
    if-ge v1, v3, :cond_7

    aget-object v5, v0, v1

    new-instance v6, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    invoke-direct {v6}, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;-><init>()V

    invoke-virtual {v5}, Landroid/media/MediaPlayer$TrackInfo;->getLanguage()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->name:Ljava/lang/String;

    invoke-virtual {v5}, Landroid/media/MediaPlayer$TrackInfo;->getTrackType()I

    move-result v5

    invoke-direct {p0, v5}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->f(I)I

    move-result v5

    iput v5, v6, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->trackType:I

    iget-object v5, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "getTrackInfo index:"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ", type:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v8, v6, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->trackType:I

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ", isselcted:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v8, v6, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isSelected:Z

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v8, ", name:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v6, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->name:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    add-int/lit8 v5, v4, 0x1

    aput-object v6, v2, v4

    add-int/lit8 v1, v1, 0x1

    move v4, v5

    goto :goto_4

    :cond_7
    :goto_5
    return-object v2
.end method

.method public t()[Lcom/tencent/thumbplayer/tcmedia/api/TPProgramInfo;
    .locals 1

    .line 2
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/tencent/thumbplayer/tcmedia/api/TPProgramInfo;

    return-object v0
.end method

.method public u()[J
    .locals 1

    .line 2
    const/4 v0, 0x2

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 8
        -0x1
        -0x1
    .end array-data
.end method

.method public v()Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;
    .locals 1

    .line 2
    const/4 v0, 0x0

    return-object v0
.end method
