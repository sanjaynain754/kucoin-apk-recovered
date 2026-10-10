.class public final Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;
.super Ljava/lang/Object;
.source "Delegate.kt"

# interfaces
.implements Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001$B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J)\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001fR*\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\"\u00a8\u0006%"
    }
    d2 = {
        "Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;",
        "",
        "Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;",
        "<init>",
        "()V",
        "Landroid/app/Activity;",
        "activity",
        "",
        "d",
        "(Landroid/app/Activity;)V",
        "Lio/flutter/plugin/common/MethodChannel$Result;",
        "result",
        "b",
        "(Lio/flutter/plugin/common/MethodChannel$Result;)V",
        "",
        "key",
        "value",
        "e",
        "(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V",
        "c",
        "(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "",
        "onActivityResult",
        "(IILandroid/content/Intent;)Z",
        "Landroid/app/Activity;",
        "Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;",
        "Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;",
        "storage",
        "Lkotlin/Triple;",
        "Lkotlin/Triple;",
        "currentData",
        "Companion",
        "cloud_storage_plugin_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public b:Landroid/app/Activity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final c:Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:Lkotlin/Triple;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Triple<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "+",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->e:Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate$Companion;

    .line 9
    return-void
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->c:Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;

    .line 11
    return-void
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
.end method

.method public static final synthetic a(Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;)Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->c:Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;

    .line 3
    return-object p0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method


# virtual methods
.method public b(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3
    .param p1    # Lio/flutter/plugin/common/MethodChannel$Result;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "result"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->b:Landroid/app/Activity;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "activity is null"

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    const-string v2, "-1"

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v2, v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->c:Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;->c(Landroid/content/Context;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 32
    return-void
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
.end method

.method public c(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/flutter/plugin/common/MethodChannel$Result;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "key"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "result"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->b:Landroid/app/Activity;

    .line 13
    .line 14
    instance-of v1, v0, Landroidx/fragment/app/FragmentActivity;

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v0, v2

    .line 22
    .line 23
    :goto_0
    const-string v1, "-1"

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string p1, "activity is null"

    .line 28
    .line 29
    .line 30
    invoke-interface {p2, v1, p1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 31
    return-void

    .line 32
    .line 33
    :cond_1
    const-string v2, "Delegate:getCloudStorageValue"

    .line 34
    .line 35
    .line 36
    invoke-static {v2}, Lro/b;->i(Ljava/lang/String;)V

    .line 37
    .line 38
    iget-object v2, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->c:Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v0}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;->c(Landroid/content/Context;)Z

    .line 42
    move-result v2

    .line 43
    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    .line 47
    invoke-interface {p2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 48
    return-void

    .line 49
    .line 50
    :cond_2
    new-instance v1, Lkotlin/Triple;

    .line 51
    .line 52
    const-string v2, ""

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, p1, v2, p2}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    iput-object v1, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->d:Lkotlin/Triple;

    .line 58
    .line 59
    iget-object p1, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->b:Landroid/app/Activity;

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    iget-object p2, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->c:Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, v0}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;->j(Landroid/content/Context;)Landroid/content/Intent;

    .line 67
    move-result-object p2

    .line 68
    .line 69
    .line 70
    const v0, 0x30d42

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 74
    :cond_3
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
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
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
.end method

.method public final d(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->b:Landroid/app/Activity;

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->d:Lkotlin/Triple;

    .line 8
    :cond_0
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
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/flutter/plugin/common/MethodChannel$Result;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "key"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "value"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v0, "result"

    .line 14
    .line 15
    .line 16
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    iget-object v0, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->b:Landroid/app/Activity;

    .line 19
    .line 20
    instance-of v1, v0, Landroidx/fragment/app/FragmentActivity;

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v0, v2

    .line 28
    .line 29
    :goto_0
    if-nez v0, :cond_1

    .line 30
    .line 31
    const-string p1, "-1"

    .line 32
    .line 33
    const-string p2, "activity is null"

    .line 34
    .line 35
    .line 36
    invoke-interface {p3, p1, p2, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 37
    return-void

    .line 38
    .line 39
    :cond_1
    const-string v1, "Delegate:setCloudStorageValue"

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, Lro/b;->i(Ljava/lang/String;)V

    .line 43
    .line 44
    iget-object v1, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->c:Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;->c(Landroid/content/Context;)Z

    .line 48
    move-result v1

    .line 49
    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    invoke-interface {p3, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 56
    return-void

    .line 57
    .line 58
    :cond_2
    new-instance v1, Lkotlin/Triple;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1, p1, p2, p3}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    iput-object v1, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->d:Lkotlin/Triple;

    .line 64
    .line 65
    iget-object p1, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->b:Landroid/app/Activity;

    .line 66
    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    iget-object p2, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->c:Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, v0}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;->j(Landroid/content/Context;)Landroid/content/Intent;

    .line 73
    move-result-object p2

    .line 74
    .line 75
    .line 76
    const p3, 0x30d41

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p2, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 80
    :cond_3
    return-void
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
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 4
    .param p3    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object p2, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->b:Landroid/app/Activity;

    .line 3
    .line 4
    instance-of v0, p2, Landroidx/fragment/app/FragmentActivity;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p2, Landroidx/fragment/app/FragmentActivity;

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p2, v1

    .line 12
    :goto_0
    const/4 v0, 0x0

    .line 13
    .line 14
    if-nez p2, :cond_1

    .line 15
    return v0

    .line 16
    .line 17
    :cond_1
    iget-object v2, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->d:Lkotlin/Triple;

    .line 18
    .line 19
    if-nez v2, :cond_2

    .line 20
    return v0

    .line 21
    .line 22
    :cond_2
    iget-object v3, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->c:Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, p2, p3}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;->e(Landroid/content/Context;Landroid/content/Intent;)Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;

    .line 26
    move-result-object p3

    .line 27
    .line 28
    .line 29
    packed-switch p1, :pswitch_data_0

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :pswitch_0
    if-eqz p3, :cond_3

    .line 33
    .line 34
    .line 35
    invoke-static {p2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    new-instance p2, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate$onActivityResult$2;

    .line 39
    .line 40
    .line 41
    invoke-direct {p2, p0, p3, v2, v1}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate$onActivityResult$2;-><init>(Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;Lkotlin/Triple;Lkotlin/coroutines/Continuation;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p2}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 45
    goto :goto_1

    .line 46
    .line 47
    .line 48
    :cond_3
    invoke-virtual {v2}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    check-cast p1, Lio/flutter/plugin/common/MethodChannel$Result;

    .line 52
    .line 53
    const-string p2, "-1"

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 57
    goto :goto_1

    .line 58
    .line 59
    :pswitch_1
    if-eqz p3, :cond_4

    .line 60
    .line 61
    .line 62
    invoke-static {p2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    new-instance p2, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate$onActivityResult$1;

    .line 66
    .line 67
    .line 68
    invoke-direct {p2, p0, p3, v2, v1}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate$onActivityResult$1;-><init>(Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;Lkotlin/Triple;Lkotlin/coroutines/Continuation;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p2}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 72
    goto :goto_1

    .line 73
    .line 74
    .line 75
    :cond_4
    invoke-virtual {v2}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    check-cast p1, Lio/flutter/plugin/common/MethodChannel$Result;

    .line 79
    .line 80
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 84
    .line 85
    :goto_1
    iput-object v1, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;->d:Lkotlin/Triple;

    .line 86
    return v0

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    :pswitch_data_0
    .packed-switch 0x30d41
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
