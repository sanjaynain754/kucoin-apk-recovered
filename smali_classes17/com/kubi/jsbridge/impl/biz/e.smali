.class public final Lcom/kubi/jsbridge/impl/biz/e;
.super Ljava/lang/Object;
.source "KCJSApiPhotoModuleImpl.kt"

# interfaces
.implements Ld00/r;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\\\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102(\u0010\u0011\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00070\u0012H\u0016Jd\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2(\u0010\u0011\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00070\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/kubi/jsbridge/impl/biz/KCJSApiPhotoModuleImpl;",
        "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPhotoModule;",
        "<init>",
        "()V",
        "TAG",
        "",
        "takePicture",
        "",
        "ctx",
        "Landroid/content/Context;",
        "obj",
        "Ljava/lang/Object;",
        "source",
        "capture",
        "",
        "maxCount",
        "",
        "callback",
        "Lkotlin/Function2;",
        "",
        "",
        "Lcom/kubi/sdk/protocol/ProtocolException;",
        "appAlbumSelect",
        "mediaType",
        "JsBridgeLib_googleRelease"
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
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, "KCJSApiPhotoModuleImpl"

    .line 6
    .line 7
    iput-object v0, p0, Lcom/kubi/jsbridge/impl/biz/e;->a:Ljava/lang/String;

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
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;JLjava/lang/String;ZLkotlin/jvm/functions/Function2;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;-",
            "Lcom/kubi/sdk/protocol/ProtocolException;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string p2, "ctx"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "source"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string p1, "mediaType"

    .line 13
    .line 14
    .line 15
    invoke-static {p6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string p1, "callback"

    .line 18
    .line 19
    .line 20
    invoke-static {p8, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/blankj/utilcode/util/a;->h()Landroid/app/Activity;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    instance-of p2, p1, Lcom/kubi/widget/web/ui/KWebBaseActivity;

    .line 27
    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    if-nez p1, :cond_1

    .line 31
    :cond_0
    move-object p4, p8

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_1
    new-instance p3, Lcom/kubi/jsbridge/impl/command/TakePictureCommand;

    .line 35
    .line 36
    check-cast p1, Lcom/kubi/sdk/BaseActivity;

    .line 37
    long-to-int p2, p4

    .line 38
    move-object p5, p1

    .line 39
    move-object p4, p8

    .line 40
    move-object p8, p6

    .line 41
    move p6, p7

    .line 42
    move p7, p2

    .line 43
    .line 44
    .line 45
    invoke-direct/range {p3 .. p8}, Lcom/kubi/jsbridge/impl/command/TakePictureCommand;-><init>(Lkotlin/jvm/functions/Function2;Lcom/kubi/sdk/BaseActivity;ZILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3}, Lcom/kubi/jsbridge/impl/command/TakePictureCommand;->h()V

    .line 49
    return-void

    .line 50
    .line 51
    :goto_0
    iget-object p1, p0, Lcom/kubi/jsbridge/impl/biz/e;->a:Ljava/lang/String;

    .line 52
    .line 53
    const-string p2, "appAlbumSelect: top activity is not KWebBaseActivity or not ActivityResultHost"

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p2}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    new-instance v0, Lcom/kubi/sdk/protocol/ProtocolException;

    .line 59
    .line 60
    const/16 v5, 0xe

    .line 61
    const/4 v6, 0x0

    .line 62
    .line 63
    const-string v1, "appAlbumSelect: invalid activity"

    .line 64
    const/4 v2, 0x0

    .line 65
    const/4 v3, 0x0

    .line 66
    const/4 v4, 0x0

    .line 67
    .line 68
    .line 69
    invoke-direct/range {v0 .. v6}, Lcom/kubi/sdk/protocol/ProtocolException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 70
    const/4 p1, 0x0

    .line 71
    .line 72
    .line 73
    invoke-interface {p4, p1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    return-void
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
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
.end method

.method public b(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;ZJLkotlin/jvm/functions/Function2;)V
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "ZJ",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;-",
            "Lcom/kubi/sdk/protocol/ProtocolException;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p7

    .line 3
    .line 4
    const-string p2, "ctx"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string p1, "source"

    .line 10
    .line 11
    .line 12
    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    const-string p1, "callback"

    .line 15
    .line 16
    .line 17
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lcom/blankj/utilcode/util/a;->h()Landroid/app/Activity;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    instance-of p2, p1, Lcom/kubi/widget/web/ui/KWebBaseActivity;

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    if-nez p1, :cond_0

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    new-instance v0, Lcom/kubi/jsbridge/impl/command/TakePictureCommand;

    .line 31
    move-object v2, p1

    .line 32
    .line 33
    check-cast v2, Lcom/kubi/sdk/BaseActivity;

    .line 34
    long-to-int v4, p5

    .line 35
    .line 36
    const/16 v6, 0x10

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    move v3, p4

    .line 40
    .line 41
    .line 42
    invoke-direct/range {v0 .. v7}, Lcom/kubi/jsbridge/impl/command/TakePictureCommand;-><init>(Lkotlin/jvm/functions/Function2;Lcom/kubi/sdk/BaseActivity;ZILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/kubi/jsbridge/impl/command/TakePictureCommand;->h()V

    .line 46
    return-void

    .line 47
    .line 48
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/kubi/jsbridge/impl/biz/e;->a:Ljava/lang/String;

    .line 49
    .line 50
    const-string p2, "takePicture: top activity is not KWebBaseActivity or not ActivityResultHost"

    .line 51
    .line 52
    .line 53
    invoke-static {p1, p2}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    new-instance v2, Lcom/kubi/sdk/protocol/ProtocolException;

    .line 56
    .line 57
    const/16 v7, 0xe

    .line 58
    const/4 v8, 0x0

    .line 59
    .line 60
    const-string v3, "takePicture: invalid activity"

    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    .line 65
    .line 66
    invoke-direct/range {v2 .. v8}, Lcom/kubi/sdk/protocol/ProtocolException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 67
    const/4 p1, 0x0

    .line 68
    .line 69
    .line 70
    invoke-interface {v1, p1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    return-void
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
.end method
