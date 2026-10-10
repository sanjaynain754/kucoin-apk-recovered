.class public Lx7/i;
.super Ljava/lang/Object;
.source "ElfParser.java"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final b:I

.field public final c:Ljava/nio/channels/FileChannel;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const v0, 0x464c457f

    .line 7
    .line 8
    iput v0, p0, Lx7/i;->b:I

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Ljava/io/FileInputStream;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    iput-object p1, p0, Lx7/i;->c:Ljava/nio/channels/FileChannel;

    .line 28
    return-void

    .line 29
    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string v0, "File is null or does not exist"

    .line 33
    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    throw p1
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


# virtual methods
.method public final a(Lx7/d;JJ)J
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    :goto_0
    cmp-long v2, v0, p2

    .line 5
    .line 6
    if-gez v2, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Lx7/d;->b(J)Lx7/e;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    iget-wide v3, v2, Lx7/e;->a:J

    .line 13
    .line 14
    const-wide/16 v5, 0x1

    .line 15
    .line 16
    cmp-long v3, v3, v5

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    iget-wide v3, v2, Lx7/e;->c:J

    .line 21
    .line 22
    cmp-long v7, v3, p4

    .line 23
    .line 24
    if-gtz v7, :cond_0

    .line 25
    .line 26
    iget-wide v7, v2, Lx7/e;->d:J

    .line 27
    add-long/2addr v7, v3

    .line 28
    .line 29
    cmp-long v7, p4, v7

    .line 30
    .line 31
    if-gtz v7, :cond_0

    .line 32
    sub-long/2addr p4, v3

    .line 33
    .line 34
    iget-wide p1, v2, Lx7/e;->b:J

    .line 35
    add-long/2addr p4, p1

    .line 36
    return-wide p4

    .line 37
    :cond_0
    add-long/2addr v0, v5

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "Could not map vma to file offset!"

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    throw p1
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
.end method

.method public b()Lx7/d;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lx7/i;->c:Ljava/nio/channels/FileChannel;

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, v1, v2}, Lx7/i;->m(Ljava/nio/ByteBuffer;J)J

    .line 22
    move-result-wide v1

    .line 23
    .line 24
    .line 25
    const-wide/32 v3, 0x464c457f

    .line 26
    .line 27
    cmp-long v1, v1, v3

    .line 28
    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    const-wide/16 v1, 0x4

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0, v1, v2}, Lx7/i;->i(Ljava/nio/ByteBuffer;J)S

    .line 35
    move-result v1

    .line 36
    .line 37
    const-wide/16 v2, 0x5

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0, v2, v3}, Lx7/i;->i(Ljava/nio/ByteBuffer;J)S

    .line 41
    move-result v0

    .line 42
    const/4 v2, 0x1

    .line 43
    const/4 v3, 0x2

    .line 44
    .line 45
    if-ne v0, v3, :cond_0

    .line 46
    move v0, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 v0, 0x0

    .line 49
    .line 50
    :goto_0
    if-ne v1, v2, :cond_1

    .line 51
    .line 52
    new-instance v1, Lx7/g;

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, v0, p0}, Lx7/g;-><init>(ZLx7/i;)V

    .line 56
    return-object v1

    .line 57
    .line 58
    :cond_1
    if-ne v1, v3, :cond_2

    .line 59
    .line 60
    new-instance v1, Lx7/h;

    .line 61
    .line 62
    .line 63
    invoke-direct {v1, v0, p0}, Lx7/h;-><init>(ZLx7/i;)V

    .line 64
    return-object v1

    .line 65
    .line 66
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v1, "Invalid class type!"

    .line 69
    .line 70
    .line 71
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    throw v0

    .line 73
    .line 74
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 75
    .line 76
    const-string v1, "Invalid ELF Magic!"

    .line 77
    .line 78
    .line 79
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    throw v0
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
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lx7/i;->c:Ljava/nio/channels/FileChannel;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

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
.end method

.method public g()Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lx7/i;->c:Ljava/nio/channels/FileChannel;

    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v2, v3}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 10
    .line 11
    new-instance v6, Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lx7/i;->b()Lx7/d;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    const/16 v4, 0x8

    .line 21
    .line 22
    .line 23
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 24
    move-result-object v7

    .line 25
    .line 26
    iget-boolean v4, v1, Lx7/d;->a:Z

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    sget-object v4, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_0
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {v7, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    iget v4, v1, Lx7/d;->f:I

    .line 39
    int-to-long v4, v4

    .line 40
    .line 41
    .line 42
    const-wide/32 v8, 0xffff

    .line 43
    .line 44
    cmp-long v8, v4, v8

    .line 45
    const/4 v9, 0x0

    .line 46
    .line 47
    if-nez v8, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v9}, Lx7/d;->c(I)Lx7/f;

    .line 51
    move-result-object v4

    .line 52
    .line 53
    iget-wide v4, v4, Lx7/f;->a:J

    .line 54
    :cond_1
    move-wide v10, v2

    .line 55
    .line 56
    :goto_1
    cmp-long v8, v10, v4

    .line 57
    .line 58
    const-wide/16 v12, 0x1

    .line 59
    .line 60
    if-gez v8, :cond_3

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v10, v11}, Lx7/d;->b(J)Lx7/e;

    .line 64
    move-result-object v8

    .line 65
    .line 66
    iget-wide v14, v8, Lx7/e;->a:J

    .line 67
    .line 68
    const-wide/16 v16, 0x2

    .line 69
    .line 70
    cmp-long v14, v14, v16

    .line 71
    .line 72
    if-nez v14, :cond_2

    .line 73
    .line 74
    iget-wide v10, v8, Lx7/e;->b:J

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    add-long/2addr v10, v12

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    move-wide v10, v2

    .line 79
    .line 80
    :goto_2
    cmp-long v8, v10, v2

    .line 81
    .line 82
    if-nez v8, :cond_4

    .line 83
    .line 84
    .line 85
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 86
    move-result-object v1

    .line 87
    return-object v1

    .line 88
    .line 89
    :cond_4
    new-instance v8, Ljava/util/ArrayList;

    .line 90
    .line 91
    .line 92
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 93
    move-wide v14, v2

    .line 94
    .line 95
    move-wide/from16 v16, v14

    .line 96
    .line 97
    .line 98
    :goto_3
    invoke-virtual {v1, v10, v11, v9}, Lx7/d;->a(JI)Lx7/c;

    .line 99
    move-result-object v2

    .line 100
    .line 101
    move-wide/from16 v18, v12

    .line 102
    .line 103
    iget-wide v12, v2, Lx7/c;->a:J

    .line 104
    .line 105
    cmp-long v3, v12, v18

    .line 106
    .line 107
    if-nez v3, :cond_5

    .line 108
    .line 109
    iget-wide v12, v2, Lx7/c;->b:J

    .line 110
    .line 111
    .line 112
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 113
    move-result-object v3

    .line 114
    .line 115
    .line 116
    invoke-interface {v8, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    goto :goto_4

    .line 118
    .line 119
    :cond_5
    const-wide/16 v20, 0x5

    .line 120
    .line 121
    cmp-long v3, v12, v20

    .line 122
    .line 123
    if-nez v3, :cond_6

    .line 124
    .line 125
    iget-wide v14, v2, Lx7/c;->b:J

    .line 126
    .line 127
    :cond_6
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 128
    .line 129
    iget-wide v2, v2, Lx7/c;->a:J

    .line 130
    .line 131
    cmp-long v2, v2, v16

    .line 132
    .line 133
    if-nez v2, :cond_9

    .line 134
    .line 135
    cmp-long v2, v14, v16

    .line 136
    .line 137
    if-eqz v2, :cond_8

    .line 138
    move-wide v2, v4

    .line 139
    move-wide v4, v14

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v0 .. v5}, Lx7/i;->a(Lx7/d;JJ)J

    .line 143
    move-result-wide v1

    .line 144
    .line 145
    .line 146
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 147
    move-result-object v3

    .line 148
    .line 149
    .line 150
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    move-result v4

    .line 152
    .line 153
    if-eqz v4, :cond_7

    .line 154
    .line 155
    .line 156
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    move-result-object v4

    .line 158
    .line 159
    check-cast v4, Ljava/lang/Long;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 163
    move-result-wide v4

    .line 164
    add-long/2addr v4, v1

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v7, v4, v5}, Lx7/i;->l(Ljava/nio/ByteBuffer;J)Ljava/lang/String;

    .line 168
    move-result-object v4

    .line 169
    .line 170
    .line 171
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 172
    goto :goto_5

    .line 173
    :cond_7
    return-object v6

    .line 174
    .line 175
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 176
    .line 177
    const-string v2, "String table offset not found!"

    .line 178
    .line 179
    .line 180
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 181
    throw v1

    .line 182
    :cond_9
    move-wide v2, v4

    .line 183
    move-wide v4, v14

    .line 184
    .line 185
    move-wide/from16 v12, v18

    .line 186
    move-wide v4, v2

    .line 187
    goto :goto_3
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
.end method

.method public h(Ljava/nio/ByteBuffer;JI)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    :goto_0
    int-to-long v3, p4

    .line 11
    .line 12
    cmp-long v3, v1, v3

    .line 13
    .line 14
    if-gez v3, :cond_1

    .line 15
    .line 16
    iget-object v3, p0, Lx7/i;->c:Ljava/nio/channels/FileChannel;

    .line 17
    .line 18
    add-long v4, p2, v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, p1, v4, v5}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;J)I

    .line 22
    move-result v3

    .line 23
    const/4 v4, -0x1

    .line 24
    .line 25
    if-eq v3, v4, :cond_0

    .line 26
    int-to-long v3, v3

    .line 27
    add-long/2addr v1, v3

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 31
    .line 32
    .line 33
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 34
    throw p1

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

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
.end method

.method public i(Ljava/nio/ByteBuffer;J)S
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, p3, v0}, Lx7/i;->h(Ljava/nio/ByteBuffer;JI)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 8
    move-result p1

    .line 9
    .line 10
    and-int/lit16 p1, p1, 0xff

    .line 11
    int-to-short p1, p1

    .line 12
    return p1
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

.method public j(Ljava/nio/ByteBuffer;J)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, p3, v0}, Lx7/i;->h(Ljava/nio/ByteBuffer;JI)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 8
    move-result p1

    .line 9
    .line 10
    .line 11
    const p2, 0xffff

    .line 12
    and-int/2addr p1, p2

    .line 13
    return p1
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

.method public k(Ljava/nio/ByteBuffer;J)J
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x8

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3, v0}, Lx7/i;->h(Ljava/nio/ByteBuffer;JI)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getLong()J

    .line 9
    move-result-wide p1

    .line 10
    return-wide p1
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

.method public l(Ljava/nio/ByteBuffer;J)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    :goto_0
    const-wide/16 v1, 0x1

    .line 8
    add-long/2addr v1, p2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, Lx7/i;->i(Ljava/nio/ByteBuffer;J)S

    .line 12
    move-result p2

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    int-to-char p2, p2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    move-wide p2, v1

    .line 20
    goto :goto_0

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object p1

    .line 25
    return-object p1
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

.method public m(Ljava/nio/ByteBuffer;J)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, p3, v0}, Lx7/i;->h(Ljava/nio/ByteBuffer;JI)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 8
    move-result p1

    .line 9
    int-to-long p1, p1

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const-wide v0, 0xffffffffL

    .line 15
    and-long/2addr p1, v0

    .line 16
    return-wide p1
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
