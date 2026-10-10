.class public final Lcom/kubi/widget/web/ui/KWebUIConfig$a;
.super Ljava/lang/Object;
.source "KWebUIConfig.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/widget/web/ui/KWebUIConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010,\u001a\u00020-R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u000e\"\u0004\u0008\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\u001d\"\u0004\u0008\"\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010\u000e\"\u0004\u0008%\u0010\u0010R\u001a\u0010&\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010\u001d\"\u0004\u0008(\u0010\u001fR\u001c\u0010)\u001a\u0004\u0018\u00010\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008*\u0010\u000e\"\u0004\u0008+\u0010\u0010\u00a8\u0006."
    }
    d2 = {
        "Lcom/kubi/widget/web/ui/KWebUIConfig$Builder;",
        "",
        "<init>",
        "()V",
        "value",
        "Landroid/net/Uri;",
        "uri",
        "getUri",
        "()Landroid/net/Uri;",
        "setUri",
        "(Landroid/net/Uri;)V",
        "webTitle",
        "",
        "getWebTitle",
        "()Ljava/lang/String;",
        "setWebTitle",
        "(Ljava/lang/String;)V",
        "progressMode",
        "",
        "getProgressMode",
        "()I",
        "setProgressMode",
        "(I)V",
        "spm",
        "getSpm",
        "setSpm",
        "darkTheme",
        "",
        "getDarkTheme",
        "()Z",
        "setDarkTheme",
        "(Z)V",
        "appPushAnimated",
        "getAppPushAnimated",
        "setAppPushAnimated",
        "customUserAgent",
        "getCustomUserAgent",
        "setCustomUserAgent",
        "transparentTitle",
        "getTransparentTitle",
        "setTransparentTitle",
        "navBackgroundColor",
        "getNavBackgroundColor",
        "setNavBackgroundColor",
        "build",
        "Lcom/kubi/widget/web/ui/KWebUIConfig;",
        "LWebWidget_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Landroid/net/Uri;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:I

.field public d:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public e:Z

.field public f:Z

.field public g:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public h:Z

.field public i:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 6
    .line 7
    const-string v1, "EMPTY"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->a:Landroid/net/Uri;

    .line 13
    .line 14
    const-string v0, ""

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->b:Ljava/lang/String;

    .line 17
    const/4 v0, 0x2

    .line 18
    .line 19
    iput v0, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->c:I

    .line 20
    const/4 v0, 0x1

    .line 21
    .line 22
    iput-boolean v0, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->f:Z

    .line 23
    return-void
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


# virtual methods
.method public final a()Lcom/kubi/widget/web/ui/KWebUIConfig;
    .locals 15
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/widget/web/ui/KWebUIConfig;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->a:Landroid/net/Uri;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    const-string/jumbo v2, "toString(...)"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    iget-object v2, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->a:Landroid/net/Uri;

    .line 17
    .line 18
    iget-object v3, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->b:Ljava/lang/String;

    .line 19
    .line 20
    sget-object v4, Lcom/kubi/widget/web/ui/KWebUIConfig;->m:Lcom/kubi/widget/web/ui/KWebUIConfig$Companion;

    .line 21
    .line 22
    iget v5, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->c:I

    .line 23
    .line 24
    .line 25
    invoke-static {v4, v5}, Lcom/kubi/widget/web/ui/KWebUIConfig$Companion;->access$normalizeLoadingMode(Lcom/kubi/widget/web/ui/KWebUIConfig$Companion;I)I

    .line 26
    move-result v4

    .line 27
    .line 28
    iget-object v5, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->d:Ljava/lang/String;

    .line 29
    .line 30
    iget-boolean v6, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->e:Z

    .line 31
    .line 32
    iget-boolean v7, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->f:Z

    .line 33
    .line 34
    iget-object v8, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->g:Ljava/lang/String;

    .line 35
    .line 36
    iget-boolean v9, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->h:Z

    .line 37
    .line 38
    iget-object v10, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->i:Ljava/lang/String;

    .line 39
    .line 40
    const/16 v13, 0xc00

    .line 41
    const/4 v14, 0x0

    .line 42
    const/4 v11, 0x0

    .line 43
    const/4 v12, 0x0

    .line 44
    .line 45
    .line 46
    invoke-direct/range {v0 .. v14}, Lcom/kubi/widget/web/ui/KWebUIConfig;-><init>(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;ILjava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 47
    return-object v0
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

.method public final b(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->e:Z

    .line 3
    return-void
    .line 4
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

.method public final c(Landroid/net/Uri;)V
    .locals 3
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "value"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "dark"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lcom/kubi/widget/web/helper/m;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    iget-boolean v0, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->e:Z

    .line 22
    .line 23
    :goto_0
    iput-boolean v0, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->e:Z

    .line 24
    .line 25
    sget-object v0, Lcom/kubi/widget/web/ui/KWebUIConfig;->m:Lcom/kubi/widget/web/ui/KWebUIConfig$Companion;

    .line 26
    .line 27
    const-string v1, "loading"

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v1}, Lcom/kubi/widget/web/helper/m;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lcom/kubi/utils/extensions/DowngradeExKt;->n(Ljava/lang/String;)Ljava/lang/Integer;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 41
    move-result v1

    .line 42
    goto :goto_1

    .line 43
    .line 44
    :cond_1
    iget v1, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->c:I

    .line 45
    .line 46
    .line 47
    :goto_1
    invoke-static {v0, v1}, Lcom/kubi/widget/web/ui/KWebUIConfig$Companion;->access$normalizeLoadingMode(Lcom/kubi/widget/web/ui/KWebUIConfig$Companion;I)I

    .line 48
    move-result v0

    .line 49
    .line 50
    iput v0, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->c:I

    .line 51
    .line 52
    const-string v0, "appPushAnimated"

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v0}, Lcom/kubi/widget/web/helper/m;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 62
    move-result v0

    .line 63
    goto :goto_2

    .line 64
    .line 65
    :cond_2
    iget-boolean v0, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->f:Z

    .line 66
    .line 67
    :goto_2
    iput-boolean v0, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->f:Z

    .line 68
    .line 69
    .line 70
    const-string/jumbo v0, "transparentTitle"

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v0}, Lcom/kubi/widget/web/helper/m;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lcom/kubi/widget/web/ui/f0;->b(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    move-result v0

    .line 85
    goto :goto_3

    .line 86
    .line 87
    :cond_3
    iget-boolean v0, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->h:Z

    .line 88
    .line 89
    :goto_3
    iput-boolean v0, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->h:Z

    .line 90
    .line 91
    .line 92
    const-string/jumbo v0, "navBackgroundColor"

    .line 93
    .line 94
    .line 95
    invoke-static {p1, v0}, Lcom/kubi/widget/web/helper/m;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    move-result-object v1

    .line 97
    .line 98
    if-nez v1, :cond_4

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    const-string/jumbo v2, "toString(...)"

    .line 106
    .line 107
    .line 108
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v1, v0}, Lcom/kubi/widget/web/ui/f0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    move-result-object v1

    .line 113
    .line 114
    if-nez v1, :cond_4

    .line 115
    .line 116
    iget-object v1, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->i:Ljava/lang/String;

    .line 117
    .line 118
    :cond_4
    iput-object v1, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->i:Ljava/lang/String;

    .line 119
    .line 120
    iput-object p1, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->a:Landroid/net/Uri;

    .line 121
    return-void
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
    .line 238
    .line 239
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->b:Ljava/lang/String;

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
