.class public final Lg6/f;
.super Ljava/lang/Object;
.source "JfifUtil.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u000b\u00a8\u0006\u0014"
    }
    d2 = {
        "Lg6/f;",
        "",
        "<init>",
        "()V",
        "",
        "orientation",
        "a",
        "(I)I",
        "Ljava/io/InputStream;",
        "inputStream",
        "b",
        "(Ljava/io/InputStream;)I",
        "markerToFind",
        "",
        "e",
        "(Ljava/io/InputStream;I)Z",
        "marker",
        "c",
        "(I)Z",
        "d",
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
.field public static final a:Lg6/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lg6/f;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lg6/f;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lg6/f;->a:Lg6/f;

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
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lg6/h;->a(I)I

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final b(Ljava/io/InputStream;)I
    .locals 2
    .param p0    # Ljava/io/InputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "inputStream"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    :try_start_0
    sget-object v1, Lg6/f;->a:Lg6/f;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p0}, Lg6/f;->d(Ljava/io/InputStream;)I

    .line 12
    move-result v1

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    return v0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {p0, v1}, Lg6/h;->d(Ljava/io/InputStream;I)I

    .line 19
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    return p0

    .line 21
    :catch_0
    return v0
    .line 22
    .line 23
.end method

.method public static final e(Ljava/io/InputStream;I)Z
    .locals 4
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
    const-string v0, "inputStream"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v0, v1}, Lg6/g;->a(Ljava/io/InputStream;IZ)I

    .line 11
    move-result v2

    .line 12
    .line 13
    const/16 v3, 0xff

    .line 14
    .line 15
    if-ne v2, v3, :cond_4

    .line 16
    move v2, v3

    .line 17
    .line 18
    :goto_1
    if-ne v2, v3, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0, v1}, Lg6/g;->a(Ljava/io/InputStream;IZ)I

    .line 22
    move-result v2

    .line 23
    goto :goto_1

    .line 24
    .line 25
    :cond_1
    const/16 v3, 0xc0

    .line 26
    .line 27
    if-ne p1, v3, :cond_2

    .line 28
    .line 29
    sget-object v3, Lg6/f;->a:Lg6/f;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v2}, Lg6/f;->c(I)Z

    .line 33
    move-result v3

    .line 34
    .line 35
    if-eqz v3, :cond_2

    .line 36
    return v0

    .line 37
    .line 38
    :cond_2
    if-ne v2, p1, :cond_3

    .line 39
    return v0

    .line 40
    .line 41
    :cond_3
    if-eq v2, v0, :cond_0

    .line 42
    .line 43
    const/16 v0, 0xd8

    .line 44
    .line 45
    if-eq v2, v0, :cond_0

    .line 46
    .line 47
    const/16 v0, 0xd9

    .line 48
    .line 49
    if-eq v2, v0, :cond_4

    .line 50
    .line 51
    const/16 v0, 0xda

    .line 52
    .line 53
    if-eq v2, v0, :cond_4

    .line 54
    const/4 v0, 0x2

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v0, v1}, Lg6/g;->a(Ljava/io/InputStream;IZ)I

    .line 58
    move-result v1

    .line 59
    sub-int/2addr v1, v0

    .line 60
    int-to-long v0, v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0, v1}, Ljava/io/InputStream;->skip(J)J

    .line 64
    goto :goto_0

    .line 65
    :cond_4
    return v1
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
.method public final c(I)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    :pswitch_0
    const/4 p1, 0x0

    .line 5
    return p1

    .line 6
    :pswitch_1
    const/4 p1, 0x1

    .line 7
    return p1

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
    .line 21
    .line 22
    .line 23
    :pswitch_data_0
    .packed-switch 0xc0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final d(Ljava/io/InputStream;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0xe1

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lg6/f;->e(Ljava/io/InputStream;I)Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    const/4 v0, 0x2

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0, v1}, Lg6/g;->a(Ljava/io/InputStream;IZ)I

    .line 14
    move-result v2

    .line 15
    .line 16
    add-int/lit8 v3, v2, -0x2

    .line 17
    const/4 v4, 0x6

    .line 18
    .line 19
    if-le v3, v4, :cond_0

    .line 20
    const/4 v3, 0x4

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v3, v1}, Lg6/g;->a(Ljava/io/InputStream;IZ)I

    .line 24
    move-result v3

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0, v1}, Lg6/g;->a(Ljava/io/InputStream;IZ)I

    .line 28
    move-result p1

    .line 29
    .line 30
    add-int/lit8 v2, v2, -0x8

    .line 31
    .line 32
    .line 33
    const v0, 0x45786966

    .line 34
    .line 35
    if-ne v3, v0, :cond_0

    .line 36
    .line 37
    if-nez p1, :cond_0

    .line 38
    return v2

    .line 39
    :cond_0
    return v1
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
