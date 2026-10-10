.class public Lcom/squareup/picasso/MediaStoreRequestHandler;
.super Lcom/squareup/picasso/g;
.source "MediaStoreRequestHandler.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;
    }
.end annotation


# static fields
.field public static final b:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "orientation"

    .line 4
    .line 5
    .line 6
    filled-new-array {v0}, [Ljava/lang/String;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    sput-object v0, Lcom/squareup/picasso/MediaStoreRequestHandler;->b:[Ljava/lang/String;

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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/squareup/picasso/g;-><init>(Landroid/content/Context;)V

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
.end method

.method public static k(Landroid/content/ContentResolver;Landroid/net/Uri;)I
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    :try_start_0
    sget-object v4, Lcom/squareup/picasso/MediaStoreRequestHandler;->b:[Ljava/lang/String;

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v7, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    move-object v2, p0

    .line 9
    move-object v3, p1

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 19
    move-result p0

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    goto :goto_0

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 26
    move-result p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 30
    return p0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    move-object p0, v0

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 36
    .line 37
    .line 38
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 39
    :cond_2
    return v0

    .line 40
    .line 41
    :goto_1
    if-eqz v1, :cond_3

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 45
    :cond_3
    throw p0

    .line 46
    .line 47
    :catch_0
    if-eqz v1, :cond_4

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 51
    :cond_4
    return v0
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

.method public static l(II)Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;->MICRO:Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;

    .line 3
    .line 4
    iget v1, v0, Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;->width:I

    .line 5
    .line 6
    if-gt p0, v1, :cond_0

    .line 7
    .line 8
    iget v1, v0, Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;->height:I

    .line 9
    .line 10
    if-gt p1, v1, :cond_0

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;->MINI:Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;

    .line 14
    .line 15
    iget v1, v0, Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;->width:I

    .line 16
    .line 17
    if-gt p0, v1, :cond_1

    .line 18
    .line 19
    iget p0, v0, Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;->height:I

    .line 20
    .line 21
    if-gt p1, p0, :cond_1

    .line 22
    return-object v0

    .line 23
    .line 24
    :cond_1
    sget-object p0, Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;->FULL:Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;

    .line 25
    return-object p0
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
.method public c(Lcom/squareup/picasso/r;)Z
    .locals 2

    .line 1
    .line 2
    iget-object p1, p1, Lcom/squareup/picasso/r;->d:Landroid/net/Uri;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "content"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string v0, "media"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    move-result p1

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    return p1
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

.method public f(Lcom/squareup/picasso/r;I)Lcom/squareup/picasso/t$a;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object p2, p0, Lcom/squareup/picasso/g;->a:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    iget-object v0, p1, Lcom/squareup/picasso/r;->d:Landroid/net/Uri;

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lcom/squareup/picasso/MediaStoreRequestHandler;->k(Landroid/content/ContentResolver;Landroid/net/Uri;)I

    .line 12
    move-result v0

    .line 13
    .line 14
    iget-object v1, p1, Lcom/squareup/picasso/r;->d:Landroid/net/Uri;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, v1}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x1

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    .line 24
    const-string/jumbo v3, "video/"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    move-result v1

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    move v1, v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v1, 0x0

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {p1}, Lcom/squareup/picasso/r;->c()Z

    .line 37
    move-result v3

    .line 38
    const/4 v4, 0x0

    .line 39
    .line 40
    if-eqz v3, :cond_4

    .line 41
    .line 42
    iget v3, p1, Lcom/squareup/picasso/r;->h:I

    .line 43
    .line 44
    iget v5, p1, Lcom/squareup/picasso/r;->i:I

    .line 45
    .line 46
    .line 47
    invoke-static {v3, v5}, Lcom/squareup/picasso/MediaStoreRequestHandler;->l(II)Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;

    .line 48
    move-result-object v3

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    sget-object v5, Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;->FULL:Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;

    .line 53
    .line 54
    if-ne v3, v5, :cond_1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lcom/squareup/picasso/g;->j(Lcom/squareup/picasso/r;)Ljava/io/InputStream;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Lokio/Okio;->source(Ljava/io/InputStream;)Lokio/Source;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    new-instance p2, Lcom/squareup/picasso/t$a;

    .line 65
    .line 66
    sget-object v1, Lcom/squareup/picasso/Picasso$LoadedFrom;->DISK:Lcom/squareup/picasso/Picasso$LoadedFrom;

    .line 67
    .line 68
    .line 69
    invoke-direct {p2, v4, p1, v1, v0}, Lcom/squareup/picasso/t$a;-><init>(Landroid/graphics/Bitmap;Lokio/Source;Lcom/squareup/picasso/Picasso$LoadedFrom;I)V

    .line 70
    return-object p2

    .line 71
    .line 72
    :cond_1
    iget-object v5, p1, Lcom/squareup/picasso/r;->d:Landroid/net/Uri;

    .line 73
    .line 74
    .line 75
    invoke-static {v5}, Landroid/content/ContentUris;->parseId(Landroid/net/Uri;)J

    .line 76
    move-result-wide v5

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, Lcom/squareup/picasso/t;->d(Lcom/squareup/picasso/r;)Landroid/graphics/BitmapFactory$Options;

    .line 80
    move-result-object v11

    .line 81
    .line 82
    iput-boolean v2, v11, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 83
    .line 84
    iget v7, p1, Lcom/squareup/picasso/r;->h:I

    .line 85
    .line 86
    iget v8, p1, Lcom/squareup/picasso/r;->i:I

    .line 87
    .line 88
    iget v9, v3, Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;->width:I

    .line 89
    .line 90
    iget v10, v3, Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;->height:I

    .line 91
    move-object v12, p1

    .line 92
    .line 93
    .line 94
    invoke-static/range {v7 .. v12}, Lcom/squareup/picasso/t;->a(IIIILandroid/graphics/BitmapFactory$Options;Lcom/squareup/picasso/r;)V

    .line 95
    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    sget-object p1, Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;->FULL:Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;

    .line 99
    .line 100
    if-ne v3, p1, :cond_2

    .line 101
    goto :goto_1

    .line 102
    .line 103
    :cond_2
    iget v2, v3, Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;->androidKind:I

    .line 104
    .line 105
    .line 106
    :goto_1
    invoke-static {p2, v5, v6, v2, v11}, Landroid/provider/MediaStore$Video$Thumbnails;->getThumbnail(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 107
    move-result-object p1

    .line 108
    goto :goto_2

    .line 109
    .line 110
    :cond_3
    iget p1, v3, Lcom/squareup/picasso/MediaStoreRequestHandler$PicassoKind;->androidKind:I

    .line 111
    .line 112
    .line 113
    invoke-static {p2, v5, v6, p1, v11}, Landroid/provider/MediaStore$Images$Thumbnails;->getThumbnail(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 114
    move-result-object p1

    .line 115
    .line 116
    :goto_2
    if-eqz p1, :cond_5

    .line 117
    .line 118
    new-instance p2, Lcom/squareup/picasso/t$a;

    .line 119
    .line 120
    sget-object v1, Lcom/squareup/picasso/Picasso$LoadedFrom;->DISK:Lcom/squareup/picasso/Picasso$LoadedFrom;

    .line 121
    .line 122
    .line 123
    invoke-direct {p2, p1, v4, v1, v0}, Lcom/squareup/picasso/t$a;-><init>(Landroid/graphics/Bitmap;Lokio/Source;Lcom/squareup/picasso/Picasso$LoadedFrom;I)V

    .line 124
    return-object p2

    .line 125
    :cond_4
    move-object v12, p1

    .line 126
    .line 127
    .line 128
    :cond_5
    invoke-virtual {p0, v12}, Lcom/squareup/picasso/g;->j(Lcom/squareup/picasso/r;)Ljava/io/InputStream;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    .line 132
    invoke-static {p1}, Lokio/Okio;->source(Ljava/io/InputStream;)Lokio/Source;

    .line 133
    move-result-object p1

    .line 134
    .line 135
    new-instance p2, Lcom/squareup/picasso/t$a;

    .line 136
    .line 137
    sget-object v1, Lcom/squareup/picasso/Picasso$LoadedFrom;->DISK:Lcom/squareup/picasso/Picasso$LoadedFrom;

    .line 138
    .line 139
    .line 140
    invoke-direct {p2, v4, p1, v1, v0}, Lcom/squareup/picasso/t$a;-><init>(Landroid/graphics/Bitmap;Lokio/Source;Lcom/squareup/picasso/Picasso$LoadedFrom;I)V

    .line 141
    return-object p2
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
