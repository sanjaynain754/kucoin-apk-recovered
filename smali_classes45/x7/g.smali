.class public Lx7/g;
.super Lx7/d;
.source "Elf32Header.java"


# instance fields
.field public final j:Lx7/i;


# direct methods
.method public constructor <init>(ZLx7/i;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lx7/d;-><init>()V

    .line 4
    .line 5
    iput-boolean p1, p0, Lx7/d;->a:Z

    .line 6
    .line 7
    iput-object p2, p0, Lx7/g;->j:Lx7/i;

    .line 8
    const/4 v0, 0x4

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget-object p1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    const-wide/16 v1, 0x10

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, v0, v1, v2}, Lx7/i;->j(Ljava/nio/ByteBuffer;J)I

    .line 28
    move-result p1

    .line 29
    .line 30
    iput p1, p0, Lx7/d;->b:I

    .line 31
    .line 32
    const-wide/16 v1, 0x1c

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v0, v1, v2}, Lx7/i;->m(Ljava/nio/ByteBuffer;J)J

    .line 36
    move-result-wide v1

    .line 37
    .line 38
    iput-wide v1, p0, Lx7/d;->c:J

    .line 39
    .line 40
    const-wide/16 v1, 0x20

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v0, v1, v2}, Lx7/i;->m(Ljava/nio/ByteBuffer;J)J

    .line 44
    move-result-wide v1

    .line 45
    .line 46
    iput-wide v1, p0, Lx7/d;->d:J

    .line 47
    .line 48
    const-wide/16 v1, 0x2a

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, v0, v1, v2}, Lx7/i;->j(Ljava/nio/ByteBuffer;J)I

    .line 52
    move-result p1

    .line 53
    .line 54
    iput p1, p0, Lx7/d;->e:I

    .line 55
    .line 56
    const-wide/16 v1, 0x2c

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v0, v1, v2}, Lx7/i;->j(Ljava/nio/ByteBuffer;J)I

    .line 60
    move-result p1

    .line 61
    .line 62
    iput p1, p0, Lx7/d;->f:I

    .line 63
    .line 64
    const-wide/16 v1, 0x2e

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, v0, v1, v2}, Lx7/i;->j(Ljava/nio/ByteBuffer;J)I

    .line 68
    move-result p1

    .line 69
    .line 70
    iput p1, p0, Lx7/d;->g:I

    .line 71
    .line 72
    const-wide/16 v1, 0x30

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, v0, v1, v2}, Lx7/i;->j(Ljava/nio/ByteBuffer;J)I

    .line 76
    move-result p1

    .line 77
    .line 78
    iput p1, p0, Lx7/d;->h:I

    .line 79
    .line 80
    const-wide/16 v1, 0x32

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, v0, v1, v2}, Lx7/i;->j(Ljava/nio/ByteBuffer;J)I

    .line 84
    move-result p1

    .line 85
    .line 86
    iput p1, p0, Lx7/d;->i:I

    .line 87
    return-void
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
.end method


# virtual methods
.method public a(JI)Lx7/c;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lx7/a;

    .line 3
    .line 4
    iget-object v1, p0, Lx7/g;->j:Lx7/i;

    .line 5
    move-object v2, p0

    .line 6
    move-wide v3, p1

    .line 7
    move v5, p3

    .line 8
    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, Lx7/a;-><init>(Lx7/i;Lx7/d;JI)V

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
.end method

.method public b(J)Lx7/e;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lx7/j;

    .line 3
    .line 4
    iget-object v1, p0, Lx7/g;->j:Lx7/i;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1, p2}, Lx7/j;-><init>(Lx7/i;Lx7/d;J)V

    .line 8
    return-object v0
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
.end method

.method public c(I)Lx7/f;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lx7/l;

    .line 3
    .line 4
    iget-object v1, p0, Lx7/g;->j:Lx7/i;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Lx7/l;-><init>(Lx7/i;Lx7/d;I)V

    .line 8
    return-object v0
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
.end method
