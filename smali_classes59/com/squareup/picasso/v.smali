.class public Lcom/squareup/picasso/v;
.super Ljava/lang/Object;
.source "Stats.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/picasso/v$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/os/HandlerThread;

.field public final b:Lcom/squareup/picasso/d;

.field public final c:Landroid/os/Handler;

.field public d:J

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:J

.field public j:J

.field public k:J

.field public l:I

.field public m:I

.field public n:I


# direct methods
.method public constructor <init>(Lcom/squareup/picasso/d;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/squareup/picasso/v;->b:Lcom/squareup/picasso/d;

    .line 6
    .line 7
    new-instance p1, Landroid/os/HandlerThread;

    .line 8
    .line 9
    const-string v0, "Picasso-Stats"

    .line 10
    .line 11
    const/16 v1, 0xa

    .line 12
    .line 13
    .line 14
    invoke-direct {p1, v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 15
    .line 16
    iput-object p1, p0, Lcom/squareup/picasso/v;->a:Landroid/os/HandlerThread;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/squareup/picasso/y;->h(Landroid/os/Looper;)V

    .line 27
    .line 28
    new-instance v0, Lcom/squareup/picasso/v$a;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, p1, p0}, Lcom/squareup/picasso/v$a;-><init>(Landroid/os/Looper;Lcom/squareup/picasso/v;)V

    .line 36
    .line 37
    iput-object v0, p0, Lcom/squareup/picasso/v;->c:Landroid/os/Handler;

    .line 38
    return-void
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

.method public static g(IJ)J
    .locals 2

    .line 1
    int-to-long v0, p0

    .line 2
    div-long/2addr p1, v0

    .line 3
    return-wide p1
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
.end method


# virtual methods
.method public a()Lcom/squareup/picasso/w;
    .locals 28

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Lcom/squareup/picasso/w;

    .line 5
    .line 6
    iget-object v2, v0, Lcom/squareup/picasso/v;->b:Lcom/squareup/picasso/d;

    .line 7
    .line 8
    .line 9
    invoke-interface {v2}, Lcom/squareup/picasso/d;->a()I

    .line 10
    move-result v2

    .line 11
    .line 12
    iget-object v3, v0, Lcom/squareup/picasso/v;->b:Lcom/squareup/picasso/d;

    .line 13
    .line 14
    .line 15
    invoke-interface {v3}, Lcom/squareup/picasso/d;->size()I

    .line 16
    move-result v3

    .line 17
    .line 18
    iget-wide v4, v0, Lcom/squareup/picasso/v;->d:J

    .line 19
    .line 20
    iget-wide v6, v0, Lcom/squareup/picasso/v;->e:J

    .line 21
    .line 22
    iget-wide v8, v0, Lcom/squareup/picasso/v;->f:J

    .line 23
    .line 24
    iget-wide v10, v0, Lcom/squareup/picasso/v;->g:J

    .line 25
    .line 26
    iget-wide v12, v0, Lcom/squareup/picasso/v;->h:J

    .line 27
    .line 28
    iget-wide v14, v0, Lcom/squareup/picasso/v;->i:J

    .line 29
    .line 30
    move-object/from16 v16, v1

    .line 31
    .line 32
    move/from16 v17, v2

    .line 33
    .line 34
    iget-wide v1, v0, Lcom/squareup/picasso/v;->j:J

    .line 35
    .line 36
    move-wide/from16 v18, v1

    .line 37
    .line 38
    iget-wide v1, v0, Lcom/squareup/picasso/v;->k:J

    .line 39
    .line 40
    move-wide/from16 v20, v1

    .line 41
    .line 42
    iget v1, v0, Lcom/squareup/picasso/v;->l:I

    .line 43
    .line 44
    iget v2, v0, Lcom/squareup/picasso/v;->m:I

    .line 45
    .line 46
    move/from16 v22, v1

    .line 47
    .line 48
    iget v1, v0, Lcom/squareup/picasso/v;->n:I

    .line 49
    .line 50
    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 52
    move-result-wide v23

    .line 53
    .line 54
    move/from16 v25, v22

    .line 55
    .line 56
    move/from16 v22, v1

    .line 57
    .line 58
    move-object/from16 v1, v16

    .line 59
    .line 60
    move-wide/from16 v26, v20

    .line 61
    .line 62
    move/from16 v21, v2

    .line 63
    .line 64
    move/from16 v2, v17

    .line 65
    .line 66
    move-wide/from16 v16, v18

    .line 67
    .line 68
    move-wide/from16 v18, v26

    .line 69
    .line 70
    move/from16 v20, v25

    .line 71
    .line 72
    .line 73
    invoke-direct/range {v1 .. v24}, Lcom/squareup/picasso/w;-><init>(IIJJJJJJJJIIIJ)V

    .line 74
    .line 75
    move-object/from16 v16, v1

    .line 76
    return-object v16
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

.method public b(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/squareup/picasso/v;->m(Landroid/graphics/Bitmap;I)V

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
    .line 25
.end method

.method public c(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/squareup/picasso/v;->m(Landroid/graphics/Bitmap;I)V

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
    .line 25
.end method

.method public d()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/v;->c:Landroid/os/Handler;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

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

.method public e()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/v;->c:Landroid/os/Handler;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

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

.method public f(J)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/v;->c:Landroid/os/Handler;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x4

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 15
    return-void
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

.method public h(J)V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/squareup/picasso/v;->m:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/squareup/picasso/v;->m:I

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/squareup/picasso/v;->g:J

    .line 9
    add-long/2addr v1, p1

    .line 10
    .line 11
    iput-wide v1, p0, Lcom/squareup/picasso/v;->g:J

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Lcom/squareup/picasso/v;->g(IJ)J

    .line 15
    move-result-wide p1

    .line 16
    .line 17
    iput-wide p1, p0, Lcom/squareup/picasso/v;->j:J

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public i(J)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/squareup/picasso/v;->n:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/squareup/picasso/v;->n:I

    .line 7
    .line 8
    iget-wide v0, p0, Lcom/squareup/picasso/v;->h:J

    .line 9
    add-long/2addr v0, p1

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/squareup/picasso/v;->h:J

    .line 12
    .line 13
    iget p1, p0, Lcom/squareup/picasso/v;->m:I

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0, v1}, Lcom/squareup/picasso/v;->g(IJ)J

    .line 17
    move-result-wide p1

    .line 18
    .line 19
    iput-wide p1, p0, Lcom/squareup/picasso/v;->k:J

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public j()V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/squareup/picasso/v;->d:J

    .line 3
    .line 4
    const-wide/16 v2, 0x1

    .line 5
    add-long/2addr v0, v2

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/squareup/picasso/v;->d:J

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
.end method

.method public k()V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/squareup/picasso/v;->e:J

    .line 3
    .line 4
    const-wide/16 v2, 0x1

    .line 5
    add-long/2addr v0, v2

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/squareup/picasso/v;->e:J

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
.end method

.method public l(Ljava/lang/Long;)V
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/squareup/picasso/v;->l:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/squareup/picasso/v;->l:I

    .line 7
    .line 8
    iget-wide v0, p0, Lcom/squareup/picasso/v;->f:J

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 12
    move-result-wide v2

    .line 13
    add-long/2addr v0, v2

    .line 14
    .line 15
    iput-wide v0, p0, Lcom/squareup/picasso/v;->f:J

    .line 16
    .line 17
    iget p1, p0, Lcom/squareup/picasso/v;->l:I

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0, v1}, Lcom/squareup/picasso/v;->g(IJ)J

    .line 21
    move-result-wide v0

    .line 22
    .line 23
    iput-wide v0, p0, Lcom/squareup/picasso/v;->i:J

    .line 24
    return-void
    .line 25
.end method

.method public final m(Landroid/graphics/Bitmap;I)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/squareup/picasso/y;->i(Landroid/graphics/Bitmap;)I

    .line 4
    move-result p1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/squareup/picasso/v;->c:Landroid/os/Handler;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p2, p1, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 15
    return-void
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
