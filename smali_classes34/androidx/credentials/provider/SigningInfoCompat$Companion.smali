.class public final Landroidx/credentials/provider/SigningInfoCompat$Companion;
.super Ljava/lang/Object;
.source "SigningInfoCompat.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/credentials/provider/SigningInfoCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\u0008\u001a\u00020\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/credentials/provider/SigningInfoCompat$Companion;",
        "",
        "<init>",
        "()V",
        "fromSigningInfo",
        "Landroidx/credentials/provider/SigningInfoCompat;",
        "signingInfo",
        "Landroid/content/pm/SigningInfo;",
        "fromSignatures",
        "signatures",
        "",
        "Landroid/content/pm/Signature;",
        "credentials"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/credentials/provider/SigningInfoCompat$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromSignatures(Ljava/util/List;)Landroidx/credentials/provider/SigningInfoCompat;
    .locals 9
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/DeprecatedSinceApi;
        api = 0x1c
        message = "Use SigningInfoCompat.fromSigningInfo(SigningInfo) instead"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/content/pm/Signature;",
            ">;)",
            "Landroidx/credentials/provider/SigningInfoCompat;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "signatures"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v1, 0x1c

    .line 11
    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 16
    move-result-object v4

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    .line 20
    move-result-object v5

    .line 21
    .line 22
    new-instance v2, Landroidx/credentials/provider/SigningInfoCompat;

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    move-object v3, p1

    .line 27
    .line 28
    .line 29
    invoke-direct/range {v2 .. v8}, Landroidx/credentials/provider/SigningInfoCompat;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/Collection;IZZ)V

    .line 30
    return-object v2

    .line 31
    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    const-string v0, "Use SigningInfoCompat.fromSigningInfo(SigningInfo) instead"

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    throw p1
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

.method public final fromSigningInfo(Landroid/content/pm/SigningInfo;)Landroidx/credentials/provider/SigningInfoCompat;
    .locals 8
    .param p1    # Landroid/content/pm/SigningInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1c
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "signingInfo"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Landroidx/credentials/provider/x;->a(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    move-object v3, v0

    .line 21
    goto :goto_2

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v1, 0x23

    .line 31
    .line 32
    if-lt v0, v1, :cond_3

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Landroidx/credentials/provider/y;->a(Landroid/content/pm/SigningInfo;)Ljava/util/Collection;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    .line 42
    move-result-object v2

    .line 43
    :cond_2
    :goto_3
    move-object v4, v2

    .line 44
    goto :goto_4

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    .line 48
    move-result-object v2

    .line 49
    goto :goto_3

    .line 50
    .line 51
    :goto_4
    if-lt v0, v1, :cond_4

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Landroidx/credentials/provider/z;->a(Landroid/content/pm/SigningInfo;)I

    .line 55
    move-result v0

    .line 56
    :goto_5
    move v5, v0

    .line 57
    goto :goto_6

    .line 58
    :cond_4
    const/4 v0, 0x0

    .line 59
    goto :goto_5

    .line 60
    .line 61
    .line 62
    :goto_6
    invoke-static {p1}, Landroidx/credentials/provider/a0;->a(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    if-eqz v0, :cond_6

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    if-nez v0, :cond_5

    .line 72
    goto :goto_8

    .line 73
    :cond_5
    :goto_7
    move-object v2, v0

    .line 74
    goto :goto_9

    .line 75
    .line 76
    .line 77
    :cond_6
    :goto_8
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 78
    move-result-object v0

    .line 79
    goto :goto_7

    .line 80
    .line 81
    .line 82
    :goto_9
    invoke-static {p1}, Landroidx/credentials/provider/b0;->a(Landroid/content/pm/SigningInfo;)Z

    .line 83
    move-result v6

    .line 84
    .line 85
    .line 86
    invoke-static {p1}, Landroidx/credentials/provider/c0;->a(Landroid/content/pm/SigningInfo;)Z

    .line 87
    move-result v7

    .line 88
    .line 89
    new-instance v1, Landroidx/credentials/provider/SigningInfoCompat;

    .line 90
    .line 91
    .line 92
    invoke-direct/range {v1 .. v7}, Landroidx/credentials/provider/SigningInfoCompat;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/Collection;IZZ)V

    .line 93
    return-object v1
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
