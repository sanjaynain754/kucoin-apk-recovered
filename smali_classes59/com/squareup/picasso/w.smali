.class public Lcom/squareup/picasso/w;
.super Ljava/lang/Object;
.source "StatsSnapshot.java"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:J

.field public final i:J

.field public final j:J

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:J


# direct methods
.method public constructor <init>(IIJJJJJJJJIIIJ)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lcom/squareup/picasso/w;->a:I

    .line 6
    .line 7
    iput p2, p0, Lcom/squareup/picasso/w;->b:I

    .line 8
    .line 9
    iput-wide p3, p0, Lcom/squareup/picasso/w;->c:J

    .line 10
    .line 11
    iput-wide p5, p0, Lcom/squareup/picasso/w;->d:J

    .line 12
    .line 13
    iput-wide p7, p0, Lcom/squareup/picasso/w;->e:J

    .line 14
    .line 15
    iput-wide p9, p0, Lcom/squareup/picasso/w;->f:J

    .line 16
    .line 17
    iput-wide p11, p0, Lcom/squareup/picasso/w;->g:J

    .line 18
    .line 19
    iput-wide p13, p0, Lcom/squareup/picasso/w;->h:J

    .line 20
    move-wide p1, p15

    .line 21
    .line 22
    iput-wide p1, p0, Lcom/squareup/picasso/w;->i:J

    .line 23
    .line 24
    move-wide/from16 p1, p17

    .line 25
    .line 26
    iput-wide p1, p0, Lcom/squareup/picasso/w;->j:J

    .line 27
    .line 28
    move/from16 p1, p19

    .line 29
    .line 30
    iput p1, p0, Lcom/squareup/picasso/w;->k:I

    .line 31
    .line 32
    move/from16 p1, p20

    .line 33
    .line 34
    iput p1, p0, Lcom/squareup/picasso/w;->l:I

    .line 35
    .line 36
    move/from16 p1, p21

    .line 37
    .line 38
    iput p1, p0, Lcom/squareup/picasso/w;->m:I

    .line 39
    .line 40
    move-wide/from16 p1, p22

    .line 41
    .line 42
    iput-wide p1, p0, Lcom/squareup/picasso/w;->n:J

    .line 43
    return-void
.end method


# virtual methods
.method public a(Ljava/io/PrintWriter;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "===============BEGIN PICASSO STATS ==============="

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "Memory Cache Stats"

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "  Max Cache Size: "

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 16
    .line 17
    iget v0, p0, Lcom/squareup/picasso/w;->a:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 21
    .line 22
    const-string v0, "  Cache Size: "

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 26
    .line 27
    iget v0, p0, Lcom/squareup/picasso/w;->b:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 31
    .line 32
    const-string v0, "  Cache % Full: "

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 36
    .line 37
    iget v0, p0, Lcom/squareup/picasso/w;->b:I

    .line 38
    int-to-float v0, v0

    .line 39
    .line 40
    iget v1, p0, Lcom/squareup/picasso/w;->a:I

    .line 41
    int-to-float v1, v1

    .line 42
    div-float/2addr v0, v1

    .line 43
    .line 44
    const/high16 v1, 0x42c80000    # 100.0f

    .line 45
    mul-float/2addr v0, v1

    .line 46
    float-to-double v0, v0

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 50
    move-result-wide v0

    .line 51
    double-to-int v0, v0

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 55
    .line 56
    const-string v0, "  Cache Hits: "

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 60
    .line 61
    iget-wide v0, p0, Lcom/squareup/picasso/w;->c:J

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    .line 65
    .line 66
    const-string v0, "  Cache Misses: "

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 70
    .line 71
    iget-wide v0, p0, Lcom/squareup/picasso/w;->d:J

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    .line 75
    .line 76
    const-string v0, "Network Stats"

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 80
    .line 81
    const-string v0, "  Download Count: "

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 85
    .line 86
    iget v0, p0, Lcom/squareup/picasso/w;->k:I

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 90
    .line 91
    const-string v0, "  Total Download Size: "

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 95
    .line 96
    iget-wide v0, p0, Lcom/squareup/picasso/w;->e:J

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    .line 100
    .line 101
    const-string v0, "  Average Download Size: "

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 105
    .line 106
    iget-wide v0, p0, Lcom/squareup/picasso/w;->h:J

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    .line 110
    .line 111
    const-string v0, "Bitmap Stats"

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 115
    .line 116
    const-string v0, "  Total Bitmaps Decoded: "

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 120
    .line 121
    iget v0, p0, Lcom/squareup/picasso/w;->l:I

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 125
    .line 126
    const-string v0, "  Total Bitmap Size: "

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 130
    .line 131
    iget-wide v0, p0, Lcom/squareup/picasso/w;->f:J

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    .line 135
    .line 136
    const-string v0, "  Total Transformed Bitmaps: "

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 140
    .line 141
    iget v0, p0, Lcom/squareup/picasso/w;->m:I

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 145
    .line 146
    const-string v0, "  Total Transformed Bitmap Size: "

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 150
    .line 151
    iget-wide v0, p0, Lcom/squareup/picasso/w;->g:J

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    .line 155
    .line 156
    const-string v0, "  Average Bitmap Size: "

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 160
    .line 161
    iget-wide v0, p0, Lcom/squareup/picasso/w;->i:J

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    .line 165
    .line 166
    const-string v0, "  Average Transformed Bitmap Size: "

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 170
    .line 171
    iget-wide v0, p0, Lcom/squareup/picasso/w;->j:J

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v0, v1}, Ljava/io/PrintWriter;->println(J)V

    .line 175
    .line 176
    const-string v0, "===============END PICASSO STATS ==============="

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/io/PrintWriter;->flush()V

    .line 183
    return-void
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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "StatsSnapshot{maxSize="

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget v1, p0, Lcom/squareup/picasso/w;->a:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, ", size="

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    iget v1, p0, Lcom/squareup/picasso/w;->b:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, ", cacheHits="

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    iget-wide v1, p0, Lcom/squareup/picasso/w;->c:J

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, ", cacheMisses="

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    iget-wide v1, p0, Lcom/squareup/picasso/w;->d:J

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, ", downloadCount="

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    iget v1, p0, Lcom/squareup/picasso/w;->k:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, ", totalDownloadSize="

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    iget-wide v1, p0, Lcom/squareup/picasso/w;->e:J

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, ", averageDownloadSize="

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    iget-wide v1, p0, Lcom/squareup/picasso/w;->h:J

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v1, ", totalOriginalBitmapSize="

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    iget-wide v1, p0, Lcom/squareup/picasso/w;->f:J

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v1, ", totalTransformedBitmapSize="

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    iget-wide v1, p0, Lcom/squareup/picasso/w;->g:J

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v1, ", averageOriginalBitmapSize="

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    iget-wide v1, p0, Lcom/squareup/picasso/w;->i:J

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v1, ", averageTransformedBitmapSize="

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    iget-wide v1, p0, Lcom/squareup/picasso/w;->j:J

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v1, ", originalBitmapCount="

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    iget v1, p0, Lcom/squareup/picasso/w;->l:I

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v1, ", transformedBitmapCount="

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    iget v1, p0, Lcom/squareup/picasso/w;->m:I

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v1, ", timeStamp="

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    iget-wide v1, p0, Lcom/squareup/picasso/w;->n:J

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const/16 v1, 0x7d

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    move-result-object v0

    .line 155
    return-object v0
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
