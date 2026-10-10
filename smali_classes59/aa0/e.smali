.class public Laa0/e;
.super Laa0/c;
.source "TrimDataSource.java"


# static fields
.field public static final g:Lw90/i;


# instance fields
.field public final b:J

.field public final c:J

.field public d:J

.field public e:J

.field public f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lw90/i;

    .line 3
    .line 4
    const-string v1, "TrimDataSource"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lw90/i;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    sput-object v0, Laa0/e;->g:Lw90/i;

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>(Laa0/b;JJ)V
    .locals 4
    .param p1    # Laa0/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Laa0/c;-><init>(Laa0/b;)V

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Laa0/e;->d:J

    .line 8
    .line 9
    const-wide/high16 v2, -0x8000000000000000L

    .line 10
    .line 11
    iput-wide v2, p0, Laa0/e;->e:J

    .line 12
    const/4 p1, 0x0

    .line 13
    .line 14
    iput-boolean p1, p0, Laa0/e;->f:Z

    .line 15
    .line 16
    cmp-long p1, p2, v0

    .line 17
    .line 18
    if-ltz p1, :cond_0

    .line 19
    .line 20
    cmp-long p1, p4, v0

    .line 21
    .line 22
    if-ltz p1, :cond_0

    .line 23
    .line 24
    iput-wide p2, p0, Laa0/e;->b:J

    .line 25
    .line 26
    iput-wide p4, p0, Laa0/e;->c:J

    .line 27
    return-void

    .line 28
    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    const-string p2, "Trim values cannot be negative."

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    throw p1
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


# virtual methods
.method public a(Lcom/otaliastudios/transcoder/common/TrackType;)Z
    .locals 6
    .param p1    # Lcom/otaliastudios/transcoder/common/TrackType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-boolean v0, p0, Laa0/e;->f:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-wide v0, p0, Laa0/e;->b:J

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v2, v0, v2

    .line 11
    .line 12
    if-lez v2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Laa0/c;->h()Laa0/b;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    iget-wide v3, p0, Laa0/e;->b:J

    .line 19
    .line 20
    .line 21
    invoke-interface {v2, v3, v4}, Laa0/b;->seekTo(J)J

    .line 22
    move-result-wide v2

    .line 23
    sub-long/2addr v0, v2

    .line 24
    .line 25
    iput-wide v0, p0, Laa0/e;->d:J

    .line 26
    .line 27
    sget-object v0, Laa0/e;->g:Lw90/i;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    const-string v2, "canReadTrack(): extraDurationUs="

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    iget-wide v2, p0, Laa0/e;->d:J

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v2, " trimStartUs="

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    iget-wide v2, p0, Laa0/e;->b:J

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v2, " source.seekTo(trimStartUs)="

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    iget-wide v2, p0, Laa0/e;->d:J

    .line 60
    .line 61
    iget-wide v4, p0, Laa0/e;->b:J

    .line 62
    sub-long/2addr v2, v4

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 73
    const/4 v0, 0x1

    .line 74
    .line 75
    iput-boolean v0, p0, Laa0/e;->f:Z

    .line 76
    .line 77
    .line 78
    :cond_0
    invoke-super {p0, p1}, Laa0/c;->a(Lcom/otaliastudios/transcoder/common/TrackType;)Z

    .line 79
    move-result p1

    .line 80
    return p1
    .line 81
.end method

.method public b()Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Laa0/c;->b()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Laa0/e;->getPositionUs()J

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Laa0/e;->getDurationUs()J

    .line 14
    move-result-wide v2

    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    if-ltz v0, :cond_0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0

    .line 22
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 23
    return v0
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

.method public g()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Laa0/c;->g()V

    .line 4
    .line 5
    const-wide/high16 v0, -0x8000000000000000L

    .line 6
    .line 7
    iput-wide v0, p0, Laa0/e;->e:J

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-boolean v0, p0, Laa0/e;->f:Z

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getDurationUs()J
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Laa0/e;->e:J

    .line 3
    .line 4
    iget-wide v2, p0, Laa0/e;->d:J

    .line 5
    add-long/2addr v0, v2

    .line 6
    return-wide v0
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

.method public getPositionUs()J
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Laa0/c;->getPositionUs()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, Laa0/e;->b:J

    .line 7
    sub-long/2addr v0, v2

    .line 8
    .line 9
    iget-wide v2, p0, Laa0/e;->d:J

    .line 10
    add-long/2addr v0, v2

    .line 11
    return-wide v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public initialize()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Laa0/c;->initialize()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Laa0/c;->h()Laa0/b;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Laa0/b;->getDurationUs()J

    .line 11
    move-result-wide v0

    .line 12
    .line 13
    iget-wide v2, p0, Laa0/e;->b:J

    .line 14
    .line 15
    iget-wide v4, p0, Laa0/e;->c:J

    .line 16
    add-long/2addr v2, v4

    .line 17
    .line 18
    cmp-long v2, v2, v0

    .line 19
    .line 20
    if-gez v2, :cond_0

    .line 21
    .line 22
    sget-object v2, Laa0/e;->g:Lw90/i;

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    const-string v4, "initialize(): duration="

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v4, " trimStart="

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    iget-wide v4, p0, Laa0/e;->b:J

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v4, " trimEnd="

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    iget-wide v4, p0, Laa0/e;->c:J

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v4, " trimDuration="

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    iget-wide v4, p0, Laa0/e;->b:J

    .line 63
    .line 64
    sub-long v4, v0, v4

    .line 65
    .line 66
    iget-wide v6, p0, Laa0/e;->c:J

    .line 67
    sub-long/2addr v4, v6

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    move-result-object v3

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v3}, Lw90/i;->c(Ljava/lang/String;)V

    .line 78
    .line 79
    iget-wide v2, p0, Laa0/e;->b:J

    .line 80
    sub-long/2addr v0, v2

    .line 81
    .line 82
    iget-wide v2, p0, Laa0/e;->c:J

    .line 83
    sub-long/2addr v0, v2

    .line 84
    .line 85
    iput-wide v0, p0, Laa0/e;->e:J

    .line 86
    return-void

    .line 87
    .line 88
    :cond_0
    sget-object v2, Laa0/e;->g:Lw90/i;

    .line 89
    .line 90
    new-instance v3, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    const-string v4, "Trim values are too large! start="

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    iget-wide v4, p0, Laa0/e;->b:J

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v4, ", end="

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    iget-wide v4, p0, Laa0/e;->c:J

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v4, ", duration="

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v0}, Lw90/i;->j(Ljava/lang/String;)V

    .line 129
    .line 130
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 131
    .line 132
    const-string v1, "Trim values cannot be greater than media duration."

    .line 133
    .line 134
    .line 135
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 136
    throw v0
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

.method public isInitialized()Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Laa0/c;->isInitialized()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-wide v0, p0, Laa0/e;->e:J

    .line 9
    .line 10
    const-wide/high16 v2, -0x8000000000000000L

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
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
.end method

.method public seekTo(J)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Laa0/e;->b:J

    .line 3
    add-long/2addr v0, p1

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Laa0/c;->h()Laa0/b;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v0, v1}, Laa0/b;->seekTo(J)J

    .line 11
    move-result-wide p1

    .line 12
    .line 13
    iget-wide v0, p0, Laa0/e;->b:J

    .line 14
    sub-long/2addr p1, v0

    .line 15
    return-wide p1
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
