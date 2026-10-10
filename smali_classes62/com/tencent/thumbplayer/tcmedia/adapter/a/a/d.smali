.class public Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d$a;
    }
.end annotation


# instance fields
.field private a:Lcom/tencent/thumbplayer/tcmedia/e/a;

.field private b:Lcom/tencent/thumbplayer/tcmedia/e/b;

.field private c:Landroid/content/Context;

.field private d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

.field private e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

.field private f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

.field private g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d$a;

.field private h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

.field private i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

.field private j:Lcom/tencent/thumbplayer/tcmedia/adapter/b;

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;",
            ">;"
        }
    .end annotation
.end field

.field private l:I

.field private m:Z

.field private n:Z

.field private o:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/tencent/thumbplayer/tcmedia/e/b;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->l:I

    .line 7
    .line 8
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/e/b;

    .line 9
    .line 10
    const-string v1, "TPSystemClipPlayer"

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p2, v1}, Lcom/tencent/thumbplayer/tcmedia/e/b;-><init>(Lcom/tencent/thumbplayer/tcmedia/e/b;Ljava/lang/String;)V

    .line 14
    .line 15
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->b:Lcom/tencent/thumbplayer/tcmedia/e/b;

    .line 16
    .line 17
    new-instance p2, Lcom/tencent/thumbplayer/tcmedia/e/a;

    .line 18
    .line 19
    .line 20
    invoke-direct {p2, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;-><init>(Lcom/tencent/thumbplayer/tcmedia/e/b;)V

    .line 21
    .line 22
    iput-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    .line 23
    .line 24
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->c:Landroid/content/Context;

    .line 25
    .line 26
    new-instance p1, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    .line 27
    .line 28
    .line 29
    invoke-direct {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;-><init>()V

    .line 30
    .line 31
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    .line 32
    .line 33
    new-instance p1, Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    .line 34
    .line 35
    .line 36
    invoke-direct {p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;-><init>()V

    .line 37
    .line 38
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    .line 39
    .line 40
    new-instance p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d$a;

    .line 41
    const/4 p2, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct {p1, p0, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d$a;-><init>(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d$1;)V

    .line 45
    .line 46
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d$a;

    .line 47
    .line 48
    new-instance p1, Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    .line 49
    .line 50
    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->b()Ljava/lang/String;

    .line 54
    move-result-object p2

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    .line 60
    .line 61
    new-instance p1, Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    .line 62
    .line 63
    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    .line 64
    .line 65
    .line 66
    invoke-direct {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;-><init>(Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;)V

    .line 67
    .line 68
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    .line 69
    .line 70
    new-instance p1, Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    .line 76
    return-void
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
.end method

.method public static synthetic a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;

    move-result-object p0

    return-object p0
.end method

.method private a(Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;

    move-result-object p1

    return-object p1
.end method

.method private a()V
    .locals 8

    .line 3
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->l:I

    int-to-long v2, v1

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/16 v1, 0x98

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(IJJLjava/lang/Object;)V

    :cond_0
    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->m:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i()V

    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->n:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->o:Ljava/util/LinkedList;

    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/utils/b;->a(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->o:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x3

    invoke-virtual/range {v1 .. v7}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(IJJLjava/lang/Object;)V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->n:Z

    return-void

    :cond_2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->b(I)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    return-void

    :cond_4
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->changeState(I)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a()V

    :cond_5
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    invoke-direct {p0, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->b(Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;)V

    return-void
.end method

.method private a(IIJJ)V
    .locals 8

    .line 7
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    move v2, p1

    move v3, p2

    move-wide v4, p3

    move-wide v6, p5

    invoke-virtual/range {v1 .. v7}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(IIJJ)V

    return-void
.end method

.method private a(IJJLjava/lang/Object;)V
    .locals 8

    .line 9
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(IJJLjava/lang/Object;)V

    return-void
.end method

.method private a(JJ)V
    .locals 2

    .line 10
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/b;

    invoke-virtual {v0, p3, p4}, Lcom/tencent/thumbplayer/tcmedia/adapter/b;->b(J)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/b;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/b;->a(J)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(JJ)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a()V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;IIJJ)V
    .locals 0

    .line 16
    invoke-direct/range {p0 .. p6}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a(IIJJ)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;IJJLjava/lang/Object;)V
    .locals 0

    .line 17
    invoke-direct/range {p0 .. p6}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a(IJJLjava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;JJ)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a(JJ)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleData;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleData;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;)V

    return-void
.end method

.method private a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;)V
    .locals 7

    .line 22
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->e()Lcom/tencent/thumbplayer/tcmedia/adapter/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/h;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->e()Lcom/tencent/thumbplayer/tcmedia/adapter/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/h;->c()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Landroid/os/ParcelFileDescriptor;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->e()Lcom/tencent/thumbplayer/tcmedia/adapter/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/h;->g()I

    move-result v0

    const/4 v1, 0x4

    if-ne v1, v0, :cond_1

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->e()Lcom/tencent/thumbplayer/tcmedia/adapter/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/h;->d()Landroid/content/res/AssetFileDescriptor;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Landroid/content/res/AssetFileDescriptor;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->e()Lcom/tencent/thumbplayer/tcmedia/adapter/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/h;->g()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->e()Lcom/tencent/thumbplayer/tcmedia/adapter/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/h;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->e()Lcom/tencent/thumbplayer/tcmedia/adapter/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/h;->b()Ljava/util/Map;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Ljava/lang/String;Ljava/util/Map;)V

    :cond_2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    invoke-interface {p1, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->m()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/thumbplayer/tcmedia/adapter/c$d;

    iget-object v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/c$d;->a:Ljava/lang/String;

    iget-object v3, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/c$d;->d:Ljava/util/Map;

    iget-object v4, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/c$d;->b:Ljava/lang/String;

    iget-object v1, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/c$d;->c:Ljava/lang/String;

    invoke-interface {p1, v2, v3, v4, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->n()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/thumbplayer/tcmedia/adapter/c$a;

    iget-object v2, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/c$a;->a:Ljava/lang/String;

    iget-object v3, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/c$a;->d:Ljava/util/Map;

    iget-object v4, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/c$a;->b:Ljava/lang/String;

    iget-object v1, v1, Lcom/tencent/thumbplayer/tcmedia/adapter/c$a;->c:Ljava/util/List;

    invoke-interface {p1, v2, v3, v4, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->k()Lcom/tencent/thumbplayer/tcmedia/adapter/c$b;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->k()Lcom/tencent/thumbplayer/tcmedia/adapter/c$b;

    move-result-object v0

    iget-boolean v2, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/c$b;->a:Z

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->k()Lcom/tencent/thumbplayer/tcmedia/adapter/c$b;

    move-result-object v0

    iget-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/c$b;->b:J

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->k()Lcom/tencent/thumbplayer/tcmedia/adapter/c$b;

    move-result-object v0

    iget-wide v5, v0, Lcom/tencent/thumbplayer/tcmedia/adapter/c$b;->c:J

    move-object v1, p1

    invoke-interface/range {v1 .. v6}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(ZJJ)V

    goto :goto_4

    :cond_6
    move-object v1, p1

    :goto_4
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->g()Z

    move-result p1

    invoke-interface {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Z)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->h()F

    move-result p1

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->h()F

    move-result p1

    invoke-interface {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(F)V

    :cond_7
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->j()F

    move-result p1

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->j()F

    move-result p1

    invoke-interface {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->b(F)V

    :cond_8
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->d()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Landroid/view/SurfaceHolder;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/SurfaceHolder;

    invoke-interface {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Landroid/view/SurfaceHolder;)V

    goto :goto_5

    :cond_9
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->d()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Landroid/view/Surface;

    if-eqz p1, :cond_a

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/Surface;

    invoke-interface {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Landroid/view/Surface;)V

    :cond_a
    :goto_5
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d$a;

    invoke-interface {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d$a;

    invoke-interface {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d$a;

    invoke-interface {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d$a;

    invoke-interface {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d$a;

    invoke-interface {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d$a;

    invoke-interface {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d$a;

    invoke-interface {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;)V

    return-void
.end method

.method private a(Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;)V
    .locals 2

    .line 38
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;)V

    return-void
.end method

.method private a(Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleData;)V
    .locals 2

    .line 41
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleData;)V

    return-void
.end method

.method private a(Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;)V
    .locals 2

    .line 42
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;)V

    return-void
.end method

.method public static synthetic b(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->b(Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;

    move-result-object p0

    return-object p0
.end method

.method private b(Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->b(Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;

    move-result-object p1

    return-object p1
.end method

.method private b(Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;",
            ")",
            "Ljava/util/List<",
            "Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;",
            ">;"
        }
    .end annotation

    .line 4
    instance-of v0, p1, Lcom/tencent/thumbplayer/tcmedia/b/e;

    if-nez v0, :cond_1

    instance-of v1, p1, Lcom/tencent/thumbplayer/tcmedia/b/g;

    if-nez v1, :cond_1

    instance-of v1, p1, Lcom/tencent/thumbplayer/tcmedia/b/h;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "system mediaPlayer : media asset is illegal source!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/b/e;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/b/e;->getAllAVTracks()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/utils/b;->a(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrack;

    invoke-interface {p1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrack;->getAllTrackClips()Ljava/util/List;

    move-result-object v1

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "empty av tracks when set data source!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    instance-of v0, p1, Lcom/tencent/thumbplayer/tcmedia/b/g;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/b/g;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/b/g;->getAllTrackClips()Ljava/util/List;

    move-result-object v1

    goto :goto_1

    :cond_4
    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    const-wide/16 v3, 0x0

    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {p1, v3, v4}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->setStartPositionMs(J)V

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {p1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getOriginalDurationMs()J

    move-result-wide v5

    add-long/2addr v3, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    return-object v1
.end method

.method private b()V
    .locals 4

    .line 5
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->l:I

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->changeState(I)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->b()V

    return-void

    :cond_1
    :try_start_0
    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->l:I

    add-int/lit8 v0, v0, 0x1

    const-wide/16 v1, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "handleOnComplete:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->b()V

    return-void
.end method

.method private b(Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;)V
    .locals 4

    .line 9
    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->s()[Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_2

    aget-object v2, v0, v1

    invoke-virtual {v2}, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->getTrackType()I

    move-result v2

    iget-object v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v3, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->a(I)Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    move-result-object v2

    aget-object v3, v0, v1

    invoke-virtual {v3, v2}, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-wide/16 v2, -0x1

    invoke-interface {p1, v1, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(IJ)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private c()Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->l:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    return-object v0
.end method

.method public static synthetic c(Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d()V

    return-void
.end method

.method private d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->is(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i()V

    :cond_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->c()V

    return-void
.end method

.method private d(I)V
    .locals 7

    .line 2
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {v1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getStartPositionMs()J

    move-result-wide v1

    int-to-long v3, p1

    cmp-long v1, v1, v3

    if-gtz v1, :cond_0

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {v1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getStartPositionMs()J

    move-result-wide v1

    iget-object v5, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {v5}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getOriginalDurationMs()J

    move-result-wide v5

    add-long/2addr v1, v5

    cmp-long v1, v3, v1

    if-gtz v1, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {v1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getStartPositionMs()J

    move-result-wide v1

    sub-long/2addr v3, v1

    invoke-direct {p0, v0, v3, v4}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "selectClipPlayer:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private d(IJ)V
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "switchPlayer: clipNo:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "   startPostion:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->m()V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->m:Z

    iput p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->l:I

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {p1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getFilePath()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->l:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {v1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;->getHttpHeader()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->a(Ljava/lang/String;Ljava/util/Map;)V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e()Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    if-eqz p1, :cond_1

    new-instance p1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    invoke-direct {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    const/16 v0, 0x64

    invoke-virtual {p1, v0, p2, p3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    move-result-object p1

    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    invoke-interface {p2, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    invoke-interface {p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->g()V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "error , create player failed"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private e()Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->c:Landroid/content/Context;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->b:Lcom/tencent/thumbplayer/tcmedia/e/b;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;-><init>(Landroid/content/Context;Lcom/tencent/thumbplayer/tcmedia/e/b;)V

    .line 10
    .line 11
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/b;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/adapter/b;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/b;-><init>()V

    .line 19
    .line 20
    iput-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/b;

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-direct {p0, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;)V

    .line 24
    return-object v0
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


# virtual methods
.method public a(F)V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(F)V

    :cond_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->a(F)V

    return-void
.end method

.method public a(I)V
    .locals 6

    .line 5
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    int-to-long v0, p1

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->c()Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    move-result-object v2

    invoke-interface {v2}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getStartPositionMs()J

    move-result-wide v2

    cmp-long v2, v0, v2

    if-ltz v2, :cond_2

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->c()Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    move-result-object v2

    invoke-interface {v2}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getStartPositionMs()J

    move-result-wide v2

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->c()Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    move-result-object v4

    invoke-interface {v4}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getOriginalDurationMs()J

    move-result-wide v4

    add-long/2addr v2, v4

    cmp-long v2, v0, v2

    if-gtz v2, :cond_2

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v3, "seek to:"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->b(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->c()Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    move-result-object v2

    invoke-interface {v2}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getStartPositionMs()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    invoke-interface {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(I)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    invoke-direct {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d(I)V

    return-void
.end method

.method public a(II)V
    .locals 6
    .param p2    # I
        .annotation runtime Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TPSeekMode;
        .end annotation
    .end param

    .line 6
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    int-to-long v0, p1

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->c()Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    move-result-object v2

    invoke-interface {v2}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getStartPositionMs()J

    move-result-wide v2

    cmp-long v2, v0, v2

    if-ltz v2, :cond_2

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->c()Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    move-result-object v2

    invoke-interface {v2}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getStartPositionMs()J

    move-result-wide v2

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->c()Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    move-result-object v4

    invoke-interface {v4}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getOriginalDurationMs()J

    move-result-wide v4

    add-long/2addr v2, v4

    cmp-long v2, v0, v2

    if-gtz v2, :cond_2

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "seek to:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "/mode="

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->b(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->c()Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    move-result-object v2

    invoke-interface {v2}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getStartPositionMs()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    invoke-interface {p1, v0, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(II)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    invoke-direct {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d(I)V

    return-void
.end method

.method public a(IJ)V
    .locals 0

    .line 8
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string p2, "selectTrack not supported."

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/content/res/AssetFileDescriptor;)V
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->a(Landroid/content/res/AssetFileDescriptor;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->changeState(I)V

    return-void
.end method

.method public a(Landroid/os/ParcelFileDescriptor;)V
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->a(Landroid/os/ParcelFileDescriptor;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->changeState(I)V

    return-void
.end method

.method public a(Landroid/view/Surface;)V
    .locals 2

    .line 13
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Landroid/view/Surface;)V

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->a(Landroid/view/Surface;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "setSurface , state invalid"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 14
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Landroid/view/SurfaceHolder;)V

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->a(Landroid/view/SurfaceHolder;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "setSurfaceHolder , state invalid"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$a;)V
    .locals 1

    .line 23
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "system Mediaplayer cannot support audio frame out"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$b;)V
    .locals 1

    .line 24
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "system Mediaplayer cannot support audio postprocess frame out"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;)V
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$d;)V
    .locals 0

    .line 26
    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$e;)V
    .locals 0

    .line 27
    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;)V
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$g;)V
    .locals 0

    .line 29
    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;)V
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;)V
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;)V
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;)V
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$m;)V
    .locals 0

    .line 34
    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$n;)V
    .locals 1

    .line 35
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "system Mediaplayer cannot support video frame out"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$o;)V
    .locals 1

    .line 36
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "system Mediaplayer cannot support video postprocess frame out"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;)V
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureParams;Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureCallBack;)V
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureParams;Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureCallBack;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V
    .locals 8

    .line 40
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getKey()I

    move-result v0

    const/16 v1, 0x64

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamLong()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;

    move-result-object v0

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;->value:J

    long-to-int v0, v0

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string v2, "start position:"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->b(Ljava/lang/String;)V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {v2}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getStartPositionMs()J

    move-result-wide v2

    int-to-long v4, v0

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {v2}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getStartPositionMs()J

    move-result-wide v2

    iget-object v6, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {v6}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getOriginalDurationMs()J

    move-result-wide v6

    add-long/2addr v2, v6

    cmp-long v2, v4, v2

    if-gtz v2, :cond_0

    iput v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->l:I

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    iget-object v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {v3}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getFilePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->getParamLong()Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;

    move-result-object v2

    iget-object v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {v3}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getStartPositionMs()J

    move-result-wide v6

    sub-long/2addr v4, v6

    iput-wide v4, v2, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam$OptionalParamLong;->value:J

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    :cond_2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;)V
    .locals 3

    .line 43
    invoke-direct {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->b(Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;)Ljava/util/List;

    move-result-object p1

    :try_start_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->l:I

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {p1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getFilePath()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->l:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    invoke-interface {v1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;->getHttpHeader()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->a(Ljava/lang/String;Ljava/util/Map;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->changeState(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->a(Ljava/lang/Exception;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "exception when system clip player set data source!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;IJ)V
    .locals 2
    .param p2    # I
        .annotation runtime Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TPSwitchDefMode;
        .end annotation
    .end param

    .line 44
    invoke-direct {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->b(Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/utils/b;->a(Ljava/util/Collection;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->o()J

    move-result-wide v0

    :try_start_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->n:Z

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->o:Ljava/util/LinkedList;

    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/utils/b;->a(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->o:Ljava/util/LinkedList;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->o:Ljava/util/LinkedList;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->offer(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "try to switch definition with system clip player, current clipNo:"

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->l:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    long-to-int p1, v0

    invoke-direct {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-virtual {p2, p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->a(Ljava/lang/Exception;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "exception when system clip player switch definition!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "exception when switch Definition with clip mediaAsset empty source!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/e/b;)V
    .locals 3

    .line 45
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/e/b;

    const-string v2, "TPSystemClipPlayer"

    invoke-direct {v1, p1, v2}, Lcom/tencent/thumbplayer/tcmedia/e/b;-><init>(Lcom/tencent/thumbplayer/tcmedia/e/b;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->a(Lcom/tencent/thumbplayer/tcmedia/e/b;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->a()Lcom/tencent/thumbplayer/tcmedia/e/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/e/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 46
    return-void
.end method

.method public a(Ljava/lang/String;IJ)V
    .locals 0
    .param p2    # I
        .annotation runtime Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TPSwitchDefMode;
        .end annotation
    .end param

    .line 47
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
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

    .line 48
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->a(Ljava/lang/String;Ljava/util/Map;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->changeState(I)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;IJ)V
    .locals 0
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

    .line 49
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
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

    .line 50
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string p2, "addSubtitleSource not supported."

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
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

    .line 51
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string p2, "addAudioTrackSource not supported."

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 52
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Z)V

    :cond_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->a(Z)V

    return-void
.end method

.method public a(ZJJ)V
    .locals 8

    .line 53
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    if-eqz v1, :cond_1

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(ZJJ)V

    move-wide v6, v5

    move-wide v4, v3

    move v3, v2

    goto :goto_0

    :cond_1
    move v3, p1

    move-wide v4, p2

    move-wide v6, p4

    :goto_0
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual/range {v2 .. v7}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->a(ZJJ)V

    return-void
.end method

.method public b(I)J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->b(I)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public b(F)V
    .locals 2

    .line 6
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->b(F)V

    :cond_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->b(F)V

    return-void
.end method

.method public b(IJ)V
    .locals 0

    .line 7
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string p2, "deselectTrack not supported."

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    return-void
.end method

.method public b(Z)V
    .locals 2

    .line 10
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->b(Z)V

    :cond_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->b(Z)V

    return-void
.end method

.method public c(Z)Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;
    .locals 0

    .line 2
    const/4 p1, 0x0

    return-object p1
.end method

.method public c(I)Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->c(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public c(IJ)V
    .locals 0

    .line 4
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    const-string p2, "selectProgram not supported."

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    return-void
.end method

.method public g()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->f()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e()Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    .line 29
    const/4 v1, 0x3

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->changeState(I)V

    .line 33
    .line 34
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->g()V

    .line 38
    return-void

    .line 39
    .line 40
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 41
    .line 42
    const-string v1, "error , create player failed"

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    throw v0

    .line 47
    .line 48
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 49
    .line 50
    const-string v1, "error , prepare , data source invalid"

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 54
    throw v0
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

.method public h()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->f()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e()Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    .line 29
    const/4 v1, 0x3

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->changeState(I)V

    .line 33
    .line 34
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->h()V

    .line 38
    return-void

    .line 39
    .line 40
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 41
    .line 42
    const-string v1, "error , create player failed"

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    throw v0

    .line 47
    .line 48
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v1, "error , prepare , state invalid , data source invalid"

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    throw v0
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

.method public i()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    .line 3
    const/4 v1, 0x5

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->i()V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->changeState(I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    return-void

    .line 24
    .line 25
    :catch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "error , start ,state invalid"

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    throw v0

    .line 32
    .line 33
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v1, "error , start , player is null"

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    throw v0
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

.method public j()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    .line 3
    const/4 v1, 0x6

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->j()V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->changeState(I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    return-void

    .line 24
    .line 25
    :catch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "error , pause ,state invalid"

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    throw v0

    .line 32
    .line 33
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v1, "error , pause , player is null"

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    throw v0
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

.method public k()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    .line 3
    const/4 v1, 0x7

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const/16 v0, 0x9

    .line 17
    .line 18
    :try_start_0
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    .line 19
    .line 20
    const/16 v2, 0x8

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->changeState(I)V

    .line 24
    .line 25
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->k()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->changeState(I)V

    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :catch_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v2, "error , pause ,state invalid"

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    :goto_0
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->changeState(I)V

    .line 50
    throw v1

    .line 51
    .line 52
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v1, "error , stop , player is null"

    .line 55
    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    throw v0
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

.method public l()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "reset, current state:"

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    .line 22
    .line 23
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->l()V

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->a()V

    .line 34
    .line 35
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->e()V

    .line 39
    .line 40
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    .line 41
    const/4 v1, 0x1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->changeState(I)V

    .line 45
    return-void
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

.method public m()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "release, current state:"

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    .line 22
    .line 23
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->m()V

    .line 29
    const/4 v0, 0x0

    .line 30
    .line 31
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/c;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/c;->a()V

    .line 37
    .line 38
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/g;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->e()V

    .line 42
    .line 43
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->e:Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;

    .line 44
    .line 45
    const/16 v1, 0xb

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerState;->changeState(I)V

    .line 49
    return-void
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

.method public n()J
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v3

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    check-cast v3, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    .line 21
    .line 22
    .line 23
    invoke-interface {v3}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getOriginalDurationMs()J

    .line 24
    move-result-wide v3

    .line 25
    add-long/2addr v1, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-wide v1
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

.method public o()J
    .locals 5

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    :goto_0
    iget-object v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    .line 6
    .line 7
    .line 8
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 9
    move-result v3

    .line 10
    .line 11
    if-ge v2, v3, :cond_0

    .line 12
    .line 13
    iget v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->l:I

    .line 14
    .line 15
    if-ge v2, v3, :cond_0

    .line 16
    .line 17
    iget-object v3, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->k:Ljava/util/List;

    .line 18
    .line 19
    .line 20
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    check-cast v3, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;

    .line 24
    .line 25
    .line 26
    invoke-interface {v3}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaTrackClip;->getOriginalDurationMs()J

    .line 27
    move-result-wide v3

    .line 28
    add-long/2addr v0, v3

    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_0
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    .line 34
    .line 35
    const/16 v3, 0xc

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    .line 39
    move-result v2

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    return-wide v0

    .line 43
    .line 44
    :cond_1
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 45
    .line 46
    .line 47
    invoke-interface {v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->o()J

    .line 48
    move-result-wide v2

    .line 49
    add-long/2addr v0, v2

    .line 50
    return-wide v0
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

.method public p()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    .line 3
    .line 4
    const/16 v1, 0xf

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/b;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/b;->l()J

    .line 18
    move-result-wide v0

    .line 19
    return-wide v0

    .line 20
    .line 21
    :cond_0
    const-wide/16 v0, 0x0

    .line 22
    return-wide v0

    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->p()J

    .line 28
    move-result-wide v0

    .line 29
    return-wide v0
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

.method public q()I
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/b;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/b;->a()J

    .line 10
    move-result-wide v2

    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v0, v2, v4

    .line 15
    .line 16
    if-lez v0, :cond_1

    .line 17
    .line 18
    :goto_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/b;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/b;->a()J

    .line 22
    move-result-wide v0

    .line 23
    long-to-int v0, v0

    .line 24
    return v0

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    .line 27
    .line 28
    const/16 v2, 0xd

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    return v1

    .line 36
    .line 37
    :cond_2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/b;

    .line 38
    .line 39
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 40
    .line 41
    .line 42
    invoke-interface {v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->q()I

    .line 43
    move-result v1

    .line 44
    int-to-long v1, v1

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/b;->a(J)V

    .line 48
    goto :goto_0
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

.method public r()I
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/b;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/b;->b()J

    .line 10
    move-result-wide v2

    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v0, v2, v4

    .line 15
    .line 16
    if-lez v0, :cond_1

    .line 17
    .line 18
    :goto_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/b;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/b;->b()J

    .line 22
    move-result-wide v0

    .line 23
    long-to-int v0, v0

    .line 24
    return v0

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/i;

    .line 27
    .line 28
    const/16 v2, 0xd

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/i;->a(I)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    return v1

    .line 36
    .line 37
    :cond_2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/b;

    .line 38
    .line 39
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;

    .line 40
    .line 41
    .line 42
    invoke-interface {v1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->r()I

    .line 43
    move-result v1

    .line 44
    int-to-long v1, v1

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/b;->b(J)V

    .line 48
    goto :goto_0
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

.method public s()[Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    .line 3
    .line 4
    const-string v1, "getTrackInfo not supported."

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    new-array v0, v0, [Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    .line 11
    return-object v0
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

.method public t()[Lcom/tencent/thumbplayer/tcmedia/api/TPProgramInfo;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;->a:Lcom/tencent/thumbplayer/tcmedia/e/a;

    .line 3
    .line 4
    const-string v1, "getProgramInfo not supported."

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/e/a;->e(Ljava/lang/String;)V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    new-array v0, v0, [Lcom/tencent/thumbplayer/tcmedia/api/TPProgramInfo;

    .line 11
    return-object v0
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

.method public u()[J
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    new-array v0, v0, [J

    .line 4
    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    return-object v0

    .line 8
    nop

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
    :array_0
    .array-data 8
        -0x1
        -0x1
    .end array-data
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

.method public v()Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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
