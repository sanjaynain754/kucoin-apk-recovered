.class public final Lnh0/a;
.super Ljava/lang/Object;
.source "DataUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnh0/a$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static final b:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "(?i)\\bcharset=\\s*(?:[\"\'])?([^\\s,;\"\']*)"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lnh0/a;->a:Ljava/util/regex/Pattern;

    .line 9
    .line 10
    const-string v0, "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Lnh0/a;->b:[C

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static a(Ljava/nio/ByteBuffer;)Lnh0/a$a;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/Buffer;->mark()Ljava/nio/Buffer;

    .line 4
    const/4 v0, 0x4

    .line 5
    .line 6
    new-array v1, v0, [B

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 10
    move-result v2

    .line 11
    .line 12
    if-lt v2, v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    .line 21
    aget-byte v0, v1, p0

    .line 22
    const/4 v2, 0x3

    .line 23
    const/4 v3, 0x2

    .line 24
    const/4 v4, -0x1

    .line 25
    const/4 v5, -0x2

    .line 26
    const/4 v6, 0x1

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    aget-byte v7, v1, v6

    .line 31
    .line 32
    if-nez v7, :cond_1

    .line 33
    .line 34
    aget-byte v7, v1, v3

    .line 35
    .line 36
    if-ne v7, v5, :cond_1

    .line 37
    .line 38
    aget-byte v7, v1, v2

    .line 39
    .line 40
    if-eq v7, v4, :cond_2

    .line 41
    .line 42
    :cond_1
    if-ne v0, v4, :cond_3

    .line 43
    .line 44
    aget-byte v7, v1, v6

    .line 45
    .line 46
    if-ne v7, v5, :cond_3

    .line 47
    .line 48
    aget-byte v7, v1, v3

    .line 49
    .line 50
    if-nez v7, :cond_3

    .line 51
    .line 52
    aget-byte v2, v1, v2

    .line 53
    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    :cond_2
    new-instance v0, Lnh0/a$a;

    .line 57
    .line 58
    const-string v1, "UTF-32"

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v1, p0}, Lnh0/a$a;-><init>(Ljava/lang/String;Z)V

    .line 62
    return-object v0

    .line 63
    .line 64
    :cond_3
    if-ne v0, v5, :cond_4

    .line 65
    .line 66
    aget-byte v2, v1, v6

    .line 67
    .line 68
    if-eq v2, v4, :cond_5

    .line 69
    .line 70
    :cond_4
    if-ne v0, v4, :cond_6

    .line 71
    .line 72
    aget-byte v2, v1, v6

    .line 73
    .line 74
    if-ne v2, v5, :cond_6

    .line 75
    .line 76
    :cond_5
    new-instance v0, Lnh0/a$a;

    .line 77
    .line 78
    const-string v1, "UTF-16"

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, v1, p0}, Lnh0/a$a;-><init>(Ljava/lang/String;Z)V

    .line 82
    return-object v0

    .line 83
    .line 84
    :cond_6
    const/16 p0, -0x11

    .line 85
    .line 86
    if-ne v0, p0, :cond_7

    .line 87
    .line 88
    aget-byte p0, v1, v6

    .line 89
    .line 90
    const/16 v0, -0x45

    .line 91
    .line 92
    if-ne p0, v0, :cond_7

    .line 93
    .line 94
    aget-byte p0, v1, v3

    .line 95
    .line 96
    const/16 v0, -0x41

    .line 97
    .line 98
    if-ne p0, v0, :cond_7

    .line 99
    .line 100
    new-instance p0, Lnh0/a$a;

    .line 101
    .line 102
    const-string v0, "UTF-8"

    .line 103
    .line 104
    .line 105
    invoke-direct {p0, v0, v6}, Lnh0/a$a;-><init>(Ljava/lang/String;Z)V

    .line 106
    return-object p0

    .line 107
    :cond_7
    const/4 p0, 0x0

    .line 108
    return-object p0
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
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    return-object v0

    .line 5
    .line 6
    :cond_0
    sget-object v1, Lnh0/a;->a:Ljava/util/regex/Pattern;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    const/4 v0, 0x1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 21
    move-result-object p0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 25
    move-result-object p0

    .line 26
    .line 27
    const-string v0, "charset="

    .line 28
    .line 29
    const-string v1, ""

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Lnh0/a;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_1
    return-object v0
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
.end method

.method public static c(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/Document;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lorg/jsoup/parser/e;->b()Lorg/jsoup/parser/e;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1, p2, v0}, Lnh0/a;->d(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;Lorg/jsoup/parser/e;)Lorg/jsoup/nodes/Document;

    .line 8
    move-result-object p0

    .line 9
    return-object p0
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
.end method

.method public static d(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;Lorg/jsoup/parser/e;)Lorg/jsoup/nodes/Document;
    .locals 17
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
    move-object/from16 v1, p2

    .line 5
    .line 6
    move-object/from16 v2, p3

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lorg/jsoup/nodes/Document;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Lorg/jsoup/nodes/Document;-><init>(Ljava/lang/String;)V

    .line 14
    return-object v0

    .line 15
    .line 16
    .line 17
    :cond_0
    const v3, 0x8000

    .line 18
    const/4 v4, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v3, v4}, Loh0/a;->g(Ljava/io/InputStream;II)Loh0/a;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v3}, Ljava/io/InputStream;->mark(I)V

    .line 26
    .line 27
    const/16 v5, 0x13ff

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v5}, Lnh0/a;->e(Ljava/io/InputStream;I)Ljava/nio/ByteBuffer;

    .line 31
    move-result-object v5

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 35
    move-result v6

    .line 36
    const/4 v7, -0x1

    .line 37
    const/4 v8, 0x1

    .line 38
    .line 39
    if-ne v6, v7, :cond_1

    .line 40
    move v6, v8

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move v6, v4

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    .line 46
    .line 47
    .line 48
    invoke-static {v5}, Lnh0/a;->a(Ljava/nio/ByteBuffer;)Lnh0/a$a;

    .line 49
    move-result-object v7

    .line 50
    .line 51
    if-eqz v7, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-static {v7}, Lnh0/a$a;->a(Lnh0/a$a;)Ljava/lang/String;

    .line 55
    move-result-object v9

    .line 56
    goto :goto_1

    .line 57
    .line 58
    :cond_2
    move-object/from16 v9, p1

    .line 59
    .line 60
    :goto_1
    const-string v10, "UTF-8"

    .line 61
    const/4 v11, 0x0

    .line 62
    .line 63
    if-nez v9, :cond_d

    .line 64
    .line 65
    .line 66
    :try_start_0
    invoke-static {v10}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 67
    move-result-object v12

    .line 68
    .line 69
    .line 70
    invoke-virtual {v12, v5}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    .line 71
    move-result-object v5

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/nio/CharBuffer;->hasArray()Z

    .line 75
    move-result v12

    .line 76
    .line 77
    if-eqz v12, :cond_3

    .line 78
    .line 79
    new-instance v12, Ljava/io/CharArrayReader;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/nio/CharBuffer;->array()[C

    .line 83
    move-result-object v5

    .line 84
    .line 85
    .line 86
    invoke-direct {v12, v5}, Ljava/io/CharArrayReader;-><init>([C)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v12, v1}, Lorg/jsoup/parser/e;->d(Ljava/io/Reader;Ljava/lang/String;)Lorg/jsoup/nodes/Document;

    .line 90
    move-result-object v5

    .line 91
    goto :goto_2

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-virtual {v5}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    .line 95
    move-result-object v5

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v5, v1}, Lorg/jsoup/parser/e;->e(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/Document;

    .line 99
    move-result-object v5
    :try_end_0
    .catch Lorg/jsoup/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    .line 101
    :goto_2
    const-string v12, "meta[http-equiv=content-type], meta[charset]"

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, v12}, Lorg/jsoup/nodes/Element;->Y0(Ljava/lang/String;)Lorg/jsoup/select/Elements;

    .line 105
    move-result-object v12

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 109
    move-result-object v12

    .line 110
    move-object v13, v11

    .line 111
    .line 112
    .line 113
    :cond_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    move-result v14

    .line 115
    .line 116
    if-eqz v14, :cond_7

    .line 117
    .line 118
    .line 119
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    move-result-object v14

    .line 121
    .line 122
    check-cast v14, Lorg/jsoup/nodes/Element;

    .line 123
    .line 124
    const-string v15, "http-equiv"

    .line 125
    .line 126
    .line 127
    invoke-virtual {v14, v15}, Lorg/jsoup/nodes/g;->v(Ljava/lang/String;)Z

    .line 128
    move-result v15

    .line 129
    .line 130
    if-eqz v15, :cond_5

    .line 131
    .line 132
    const-string v13, "content"

    .line 133
    .line 134
    .line 135
    invoke-virtual {v14, v13}, Lorg/jsoup/nodes/g;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    move-result-object v13

    .line 137
    .line 138
    .line 139
    invoke-static {v13}, Lnh0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    move-result-object v13

    .line 141
    .line 142
    :cond_5
    if-nez v13, :cond_6

    .line 143
    .line 144
    const-string v15, "charset"

    .line 145
    .line 146
    .line 147
    invoke-virtual {v14, v15}, Lorg/jsoup/nodes/g;->v(Ljava/lang/String;)Z

    .line 148
    move-result v16

    .line 149
    .line 150
    if-eqz v16, :cond_6

    .line 151
    .line 152
    .line 153
    invoke-virtual {v14, v15}, Lorg/jsoup/nodes/g;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    move-result-object v13

    .line 155
    .line 156
    :cond_6
    if-eqz v13, :cond_4

    .line 157
    .line 158
    :cond_7
    if-nez v13, :cond_a

    .line 159
    .line 160
    .line 161
    invoke-virtual {v5}, Lorg/jsoup/nodes/Element;->m()I

    .line 162
    move-result v12

    .line 163
    .line 164
    if-lez v12, :cond_a

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5, v4}, Lorg/jsoup/nodes/g;->l(I)Lorg/jsoup/nodes/g;

    .line 168
    move-result-object v12

    .line 169
    .line 170
    instance-of v14, v12, Lorg/jsoup/nodes/k;

    .line 171
    .line 172
    if-eqz v14, :cond_8

    .line 173
    .line 174
    check-cast v12, Lorg/jsoup/nodes/k;

    .line 175
    goto :goto_3

    .line 176
    .line 177
    :cond_8
    instance-of v14, v12, Lorg/jsoup/nodes/d;

    .line 178
    .line 179
    if-eqz v14, :cond_9

    .line 180
    .line 181
    check-cast v12, Lorg/jsoup/nodes/d;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12}, Lorg/jsoup/nodes/d;->f0()Z

    .line 185
    move-result v14

    .line 186
    .line 187
    if-eqz v14, :cond_9

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12}, Lorg/jsoup/nodes/d;->c0()Lorg/jsoup/nodes/k;

    .line 191
    move-result-object v12

    .line 192
    goto :goto_3

    .line 193
    :cond_9
    move-object v12, v11

    .line 194
    .line 195
    :goto_3
    if-eqz v12, :cond_a

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12}, Lorg/jsoup/nodes/k;->e0()Ljava/lang/String;

    .line 199
    move-result-object v14

    .line 200
    .line 201
    .line 202
    const-string/jumbo v15, "xml"

    .line 203
    .line 204
    .line 205
    invoke-virtual {v14, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 206
    move-result v14

    .line 207
    .line 208
    if-eqz v14, :cond_a

    .line 209
    .line 210
    const-string v13, "encoding"

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v13}, Lorg/jsoup/nodes/k;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 214
    move-result-object v13

    .line 215
    .line 216
    .line 217
    :cond_a
    invoke-static {v13}, Lnh0/a;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    move-result-object v12

    .line 219
    .line 220
    if-eqz v12, :cond_b

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 224
    move-result v13

    .line 225
    .line 226
    if-nez v13, :cond_b

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 230
    move-result-object v5

    .line 231
    .line 232
    const-string v6, "[\"\']"

    .line 233
    .line 234
    const-string v9, ""

    .line 235
    .line 236
    .line 237
    invoke-virtual {v5, v6, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    move-result-object v9

    .line 239
    goto :goto_4

    .line 240
    .line 241
    :cond_b
    if-nez v6, :cond_c

    .line 242
    goto :goto_4

    .line 243
    :cond_c
    move-object v11, v5

    .line 244
    goto :goto_4

    .line 245
    :catch_0
    move-exception v0

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Lorg/jsoup/UncheckedIOException;->ioException()Ljava/io/IOException;

    .line 249
    move-result-object v0

    .line 250
    throw v0

    .line 251
    .line 252
    :cond_d
    const-string v5, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML"

    .line 253
    .line 254
    .line 255
    invoke-static {v9, v5}, Lnh0/b;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    .line 257
    :goto_4
    if-nez v11, :cond_11

    .line 258
    .line 259
    if-nez v9, :cond_e

    .line 260
    move-object v9, v10

    .line 261
    .line 262
    :cond_e
    new-instance v5, Ljava/io/BufferedReader;

    .line 263
    .line 264
    new-instance v6, Ljava/io/InputStreamReader;

    .line 265
    .line 266
    .line 267
    invoke-direct {v6, v0, v9}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-direct {v5, v6, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 271
    .line 272
    if-eqz v7, :cond_10

    .line 273
    .line 274
    .line 275
    invoke-static {v7}, Lnh0/a$a;->b(Lnh0/a$a;)Z

    .line 276
    move-result v3

    .line 277
    .line 278
    if-eqz v3, :cond_10

    .line 279
    .line 280
    const-wide/16 v6, 0x1

    .line 281
    .line 282
    .line 283
    invoke-virtual {v5, v6, v7}, Ljava/io/BufferedReader;->skip(J)J

    .line 284
    move-result-wide v11

    .line 285
    .line 286
    cmp-long v3, v11, v6

    .line 287
    .line 288
    if-nez v3, :cond_f

    .line 289
    move v4, v8

    .line 290
    .line 291
    .line 292
    :cond_f
    invoke-static {v4}, Lnh0/b;->c(Z)V

    .line 293
    .line 294
    .line 295
    :cond_10
    :try_start_1
    invoke-virtual {v2, v5, v1}, Lorg/jsoup/parser/e;->d(Ljava/io/Reader;Ljava/lang/String;)Lorg/jsoup/nodes/Document;

    .line 296
    move-result-object v11
    :try_end_1
    .catch Lorg/jsoup/UncheckedIOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 297
    .line 298
    .line 299
    invoke-static {v9}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 300
    move-result-object v1

    .line 301
    .line 302
    .line 303
    invoke-virtual {v11}, Lorg/jsoup/nodes/Document;->s1()Lorg/jsoup/nodes/Document$OutputSettings;

    .line 304
    move-result-object v2

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v1}, Lorg/jsoup/nodes/Document$OutputSettings;->c(Ljava/nio/charset/Charset;)Lorg/jsoup/nodes/Document$OutputSettings;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/nio/charset/Charset;->canEncode()Z

    .line 311
    move-result v1

    .line 312
    .line 313
    if-nez v1, :cond_11

    .line 314
    .line 315
    .line 316
    invoke-static {v10}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 317
    move-result-object v1

    .line 318
    .line 319
    .line 320
    invoke-virtual {v11, v1}, Lorg/jsoup/nodes/Document;->n1(Ljava/nio/charset/Charset;)V

    .line 321
    goto :goto_5

    .line 322
    :catch_1
    move-exception v0

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0}, Lorg/jsoup/UncheckedIOException;->ioException()Ljava/io/IOException;

    .line 326
    move-result-object v0

    .line 327
    throw v0

    .line 328
    .line 329
    .line 330
    :cond_11
    :goto_5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 331
    return-object v11
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
.end method

.method public static e(Ljava/io/InputStream;I)Ljava/nio/ByteBuffer;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    if-ltz p1, :cond_0

    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    .line 7
    :goto_0
    const-string v1, "maxSize must be 0 (unlimited) or larger"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lnh0/b;->d(ZLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const v0, 0x8000

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0, p1}, Loh0/a;->g(Ljava/io/InputStream;II)Loh0/a;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Loh0/a;->b(I)Ljava/nio/ByteBuffer;

    .line 21
    move-result-object p0

    .line 22
    return-object p0
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
.end method

.method public static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p0, :cond_2

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    move-result v1

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    const-string v1, "[\"\']"

    .line 17
    .line 18
    const-string v2, ""

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object p0

    .line 23
    .line 24
    .line 25
    :try_start_0
    invoke-static {p0}, Ljava/nio/charset/Charset;->isSupported(Ljava/lang/String;)Z

    .line 26
    move-result v1

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    return-object p0

    .line 30
    .line 31
    :cond_1
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 35
    move-result-object p0

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Ljava/nio/charset/Charset;->isSupported(Ljava/lang/String;)Z

    .line 39
    move-result v1
    :try_end_0
    .catch Ljava/nio/charset/IllegalCharsetNameException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    return-object p0

    .line 43
    :catch_0
    :cond_2
    :goto_0
    return-object v0
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
.end method
