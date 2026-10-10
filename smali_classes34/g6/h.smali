.class public final Lg6/h;
.super Ljava/lang/Object;
.source "TiffUtil.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg6/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\u0008\u00030\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lg6/h;",
        "",
        "<init>",
        "()V",
        "",
        "orientation",
        "a",
        "(I)I",
        "Ljava/io/InputStream;",
        "stream",
        "length",
        "d",
        "(Ljava/io/InputStream;I)I",
        "Lg6/h$a;",
        "tiffHeader",
        "e",
        "(Ljava/io/InputStream;ILg6/h$a;)I",
        "",
        "isLittleEndian",
        "tagToFind",
        "c",
        "(Ljava/io/InputStream;IZI)I",
        "b",
        "(Ljava/io/InputStream;IZ)I",
        "Ljava/lang/Class;",
        "Ljava/lang/Class;",
        "TAG",
        "imagepipeline-base_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lg6/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lg6/h;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lg6/h;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lg6/h;->a:Lg6/h;

    .line 8
    .line 9
    const-class v0, Lg6/h;

    .line 10
    .line 11
    sput-object v0, Lg6/h;->b:Ljava/lang/Class;

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static final a(I)I
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p0, :cond_3

    .line 4
    const/4 v1, 0x1

    .line 5
    .line 6
    if-eq p0, v1, :cond_3

    .line 7
    const/4 v1, 0x3

    .line 8
    .line 9
    if-eq p0, v1, :cond_2

    .line 10
    const/4 v1, 0x6

    .line 11
    .line 12
    if-eq p0, v1, :cond_1

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    if-eq p0, v1, :cond_0

    .line 17
    return v0

    .line 18
    .line 19
    :cond_0
    const/16 p0, 0x10e

    .line 20
    return p0

    .line 21
    .line 22
    :cond_1
    const/16 p0, 0x5a

    .line 23
    return p0

    .line 24
    .line 25
    :cond_2
    const/16 p0, 0xb4

    .line 26
    return p0

    .line 27
    :cond_3
    return v0
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
.end method

.method public static final d(Ljava/io/InputStream;I)I
    .locals 5
    .param p0    # Ljava/io/InputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "stream"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    new-instance v0, Lg6/h$a;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Lg6/h$a;-><init>()V

    .line 12
    .line 13
    sget-object v1, Lg6/h;->a:Lg6/h;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p0, p1, v0}, Lg6/h;->e(Ljava/io/InputStream;ILg6/h$a;)I

    .line 17
    move-result p1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lg6/h$a;->b()I

    .line 21
    move-result v2

    .line 22
    .line 23
    add-int/lit8 v2, v2, -0x8

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    if-le v2, p1, :cond_0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    int-to-long v3, v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v3, v4}, Ljava/io/InputStream;->skip(J)J

    .line 33
    sub-int/2addr p1, v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lg6/h$a;->c()Z

    .line 37
    move-result v2

    .line 38
    .line 39
    const/16 v3, 0x112

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p0, p1, v2, v3}, Lg6/h;->c(Ljava/io/InputStream;IZI)I

    .line 43
    move-result p1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lg6/h$a;->c()Z

    .line 47
    move-result v0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p0, p1, v0}, Lg6/h;->b(Ljava/io/InputStream;IZ)I

    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 54
    return p0
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
.end method


# virtual methods
.method public final b(Ljava/io/InputStream;IZ)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0xa

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-ge p2, v0, :cond_0

    .line 6
    return v1

    .line 7
    :cond_0
    const/4 p2, 0x2

    .line 8
    .line 9
    .line 10
    invoke-static {p1, p2, p3}, Lg6/g;->a(Ljava/io/InputStream;IZ)I

    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x3

    .line 13
    .line 14
    if-eq v0, v2, :cond_1

    .line 15
    return v1

    .line 16
    :cond_1
    const/4 v0, 0x4

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0, p3}, Lg6/g;->a(Ljava/io/InputStream;IZ)I

    .line 20
    move-result v0

    .line 21
    const/4 v2, 0x1

    .line 22
    .line 23
    if-eq v0, v2, :cond_2

    .line 24
    return v1

    .line 25
    .line 26
    .line 27
    :cond_2
    invoke-static {p1, p2, p3}, Lg6/g;->a(Ljava/io/InputStream;IZ)I

    .line 28
    move-result p1

    .line 29
    return p1
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
.end method

.method public final c(Ljava/io/InputStream;IZI)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0xe

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-ge p2, v0, :cond_0

    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x2

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, p3}, Lg6/g;->a(Ljava/io/InputStream;IZ)I

    .line 11
    move-result v2

    .line 12
    .line 13
    add-int/lit8 p2, p2, -0x2

    .line 14
    .line 15
    :goto_0
    add-int/lit8 v3, v2, -0x1

    .line 16
    .line 17
    if-lez v2, :cond_2

    .line 18
    .line 19
    const/16 v2, 0xc

    .line 20
    .line 21
    if-lt p2, v2, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0, p3}, Lg6/g;->a(Ljava/io/InputStream;IZ)I

    .line 25
    move-result v2

    .line 26
    .line 27
    add-int/lit8 v4, p2, -0x2

    .line 28
    .line 29
    if-ne v2, p4, :cond_1

    .line 30
    return v4

    .line 31
    .line 32
    :cond_1
    const-wide/16 v4, 0xa

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v4, v5}, Ljava/io/InputStream;->skip(J)J

    .line 36
    .line 37
    add-int/lit8 p2, p2, -0xc

    .line 38
    move v2, v3

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    return v1
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
.end method

.method public final e(Ljava/io/InputStream;ILg6/h$a;)I
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
    const/16 v1, 0x8

    .line 4
    .line 5
    if-gt p2, v1, :cond_0

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v2, 0x4

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v2, v0}, Lg6/g;->a(Ljava/io/InputStream;IZ)I

    .line 11
    move-result v3

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3, v3}, Lg6/h$a;->d(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p3}, Lg6/h$a;->a()I

    .line 18
    move-result v3

    .line 19
    .line 20
    .line 21
    const v4, 0x49492a00    # 823968.0f

    .line 22
    .line 23
    if-eq v3, v4, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p3}, Lg6/h$a;->a()I

    .line 27
    move-result v3

    .line 28
    .line 29
    .line 30
    const v5, 0x4d4d002a    # 2.1495875E8f

    .line 31
    .line 32
    if-eq v3, v5, :cond_1

    .line 33
    .line 34
    sget-object p1, Lg6/h;->b:Ljava/lang/Class;

    .line 35
    .line 36
    const-string p2, "Invalid TIFF header"

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2}, Lx3/a;->i(Ljava/lang/Class;Ljava/lang/String;)V

    .line 40
    return v0

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {p3}, Lg6/h$a;->a()I

    .line 44
    move-result v3

    .line 45
    .line 46
    if-ne v3, v4, :cond_2

    .line 47
    const/4 v3, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move v3, v0

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-virtual {p3, v3}, Lg6/h$a;->f(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3}, Lg6/h$a;->c()Z

    .line 56
    move-result v3

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v2, v3}, Lg6/g;->a(Ljava/io/InputStream;IZ)I

    .line 60
    move-result p1

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3, p1}, Lg6/h$a;->e(I)V

    .line 64
    .line 65
    add-int/lit8 p2, p2, -0x8

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3}, Lg6/h$a;->b()I

    .line 69
    move-result p1

    .line 70
    .line 71
    if-lt p1, v1, :cond_4

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3}, Lg6/h$a;->b()I

    .line 75
    move-result p1

    .line 76
    sub-int/2addr p1, v1

    .line 77
    .line 78
    if-le p1, p2, :cond_3

    .line 79
    goto :goto_1

    .line 80
    :cond_3
    return p2

    .line 81
    .line 82
    :cond_4
    :goto_1
    sget-object p1, Lg6/h;->b:Ljava/lang/Class;

    .line 83
    .line 84
    const-string p2, "Invalid offset"

    .line 85
    .line 86
    .line 87
    invoke-static {p1, p2}, Lx3/a;->i(Ljava/lang/Class;Ljava/lang/String;)V

    .line 88
    return v0
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
.end method
