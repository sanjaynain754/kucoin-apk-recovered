.class public Lba0/a;
.super Ljava/lang/Object;
.source "DefaultAudioStrategy.java"

# interfaces
.implements Lba0/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lba0/a$b;,
        Lba0/a$c;
    }
.end annotation


# instance fields
.field public a:Lba0/a$c;


# direct methods
.method public constructor <init>(Lba0/a$c;)V
    .locals 0
    .param p1    # Lba0/a$c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lba0/a;->a:Lba0/a$c;

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
.end method

.method public static b()Lba0/a$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lba0/a$b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lba0/a$b;-><init>()V

    .line 6
    return-object v0
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


# virtual methods
.method public a(Ljava/util/List;Landroid/media/MediaFormat;)Lcom/otaliastudios/transcoder/common/TrackStatus;
    .locals 8
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/media/MediaFormat;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/MediaFormat;",
            ">;",
            "Landroid/media/MediaFormat;",
            ")",
            "Lcom/otaliastudios/transcoder/common/TrackStatus;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lba0/a;->a:Lba0/a$c;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lba0/a$c;->a(Lba0/a$c;)I

    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lba0/a;->c(Ljava/util/List;)I

    .line 13
    move-result v0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lba0/a;->a:Lba0/a$c;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lba0/a$c;->a(Lba0/a$c;)I

    .line 20
    move-result v0

    .line 21
    .line 22
    :goto_0
    iget-object v2, p0, Lba0/a;->a:Lba0/a$c;

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Lba0/a$c;->c(Lba0/a$c;)I

    .line 26
    move-result v2

    .line 27
    .line 28
    if-ne v2, v1, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lba0/a;->d(Ljava/util/List;)I

    .line 32
    move-result v2

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_1
    iget-object v2, p0, Lba0/a;->a:Lba0/a$c;

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Lba0/a$c;->c(Lba0/a$c;)I

    .line 39
    move-result v2

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 43
    move-result v3

    .line 44
    const/4 v4, 0x1

    .line 45
    .line 46
    const-wide/high16 v5, -0x8000000000000000L

    .line 47
    .line 48
    const-string v7, "bitrate"

    .line 49
    .line 50
    if-ne v3, v4, :cond_2

    .line 51
    .line 52
    iget-object v3, p0, Lba0/a;->a:Lba0/a$c;

    .line 53
    .line 54
    .line 55
    invoke-static {v3}, Lba0/a$c;->a(Lba0/a$c;)I

    .line 56
    move-result v3

    .line 57
    .line 58
    if-ne v3, v1, :cond_2

    .line 59
    .line 60
    iget-object v3, p0, Lba0/a;->a:Lba0/a$c;

    .line 61
    .line 62
    .line 63
    invoke-static {v3}, Lba0/a$c;->c(Lba0/a$c;)I

    .line 64
    move-result v3

    .line 65
    .line 66
    if-ne v3, v1, :cond_2

    .line 67
    .line 68
    iget-object v1, p0, Lba0/a;->a:Lba0/a$c;

    .line 69
    .line 70
    .line 71
    invoke-static {v1}, Lba0/a$c;->g(Lba0/a$c;)J

    .line 72
    move-result-wide v3

    .line 73
    .line 74
    cmp-long v1, v3, v5

    .line 75
    .line 76
    if-nez v1, :cond_2

    .line 77
    const/4 v1, 0x0

    .line 78
    .line 79
    .line 80
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    move-result-object v3

    .line 82
    .line 83
    check-cast v3, Landroid/media/MediaFormat;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v7}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 87
    move-result v3

    .line 88
    .line 89
    if-eqz v3, :cond_2

    .line 90
    .line 91
    .line 92
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    check-cast p1, Landroid/media/MediaFormat;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v7}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 99
    move-result p1

    .line 100
    int-to-long v3, p1

    .line 101
    goto :goto_2

    .line 102
    .line 103
    :cond_2
    iget-object p1, p0, Lba0/a;->a:Lba0/a$c;

    .line 104
    .line 105
    .line 106
    invoke-static {p1}, Lba0/a$c;->g(Lba0/a$c;)J

    .line 107
    move-result-wide v3

    .line 108
    .line 109
    cmp-long p1, v3, v5

    .line 110
    .line 111
    if-nez p1, :cond_3

    .line 112
    .line 113
    .line 114
    invoke-static {v0, v2}, Lw90/c;->a(II)J

    .line 115
    move-result-wide v3

    .line 116
    goto :goto_2

    .line 117
    .line 118
    :cond_3
    iget-object p1, p0, Lba0/a;->a:Lba0/a$c;

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, Lba0/a$c;->g(Lba0/a$c;)J

    .line 122
    move-result-wide v3

    .line 123
    .line 124
    :goto_2
    iget-object p1, p0, Lba0/a;->a:Lba0/a$c;

    .line 125
    .line 126
    .line 127
    invoke-static {p1}, Lba0/a$c;->e(Lba0/a$c;)Ljava/lang/String;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    .line 131
    const-string/jumbo v1, "mime"

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v1, p1}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const-string/jumbo p1, "sample-rate"

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, p1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 141
    .line 142
    const-string p1, "channel-count"

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, p1, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 146
    long-to-int p1, v3

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, v7, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 150
    .line 151
    iget-object p1, p0, Lba0/a;->a:Lba0/a$c;

    .line 152
    .line 153
    .line 154
    invoke-static {p1}, Lba0/a$c;->e(Lba0/a$c;)Ljava/lang/String;

    .line 155
    move-result-object p1

    .line 156
    .line 157
    const-string v0, "audio/mp4a-latm"

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 161
    move-result p1

    .line 162
    .line 163
    if-eqz p1, :cond_4

    .line 164
    .line 165
    const-string p1, "aac-profile"

    .line 166
    const/4 v0, 0x2

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2, p1, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 170
    .line 171
    :cond_4
    sget-object p1, Lcom/otaliastudios/transcoder/common/TrackStatus;->COMPRESSING:Lcom/otaliastudios/transcoder/common/TrackStatus;

    .line 172
    return-object p1
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

.method public final c(Ljava/util/List;)I
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/MediaFormat;",
            ">;)I"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    .line 8
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    move-result v1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    check-cast v1, Landroid/media/MediaFormat;

    .line 18
    .line 19
    const-string v2, "channel-count"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 23
    move-result v1

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 27
    move-result v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return v0
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
.end method

.method public final d(Ljava/util/List;)I
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/MediaFormat;",
            ">;)I"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    const v0, 0x7fffffff

    .line 8
    .line 9
    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    move-result v1

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    check-cast v1, Landroid/media/MediaFormat;

    .line 20
    .line 21
    .line 22
    const-string/jumbo v2, "sample-rate"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 26
    move-result v1

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 30
    move-result v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return v0
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
