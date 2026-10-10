.class public final Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;
.super Ljava/lang/Object;
.source "OpenSourceMergedSoMapping.kt"

# interfaces
.implements Lcom/facebook/soloader/ExternalSoMapping;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0015\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0005H\u0016J\t\u0010\n\u001a\u00020\u000bH\u0086 J\t\u0010\u000c\u001a\u00020\u000bH\u0086 J\t\u0010\r\u001a\u00020\u000bH\u0086 J\t\u0010\u000e\u001a\u00020\u000bH\u0086 J\t\u0010\u000f\u001a\u00020\u000bH\u0086 J\t\u0010\u0010\u001a\u00020\u000bH\u0086 J\t\u0010\u0011\u001a\u00020\u000bH\u0086 J\t\u0010\u0012\u001a\u00020\u000bH\u0086 J\t\u0010\u0013\u001a\u00020\u000bH\u0086 J\t\u0010\u0014\u001a\u00020\u000bH\u0086 J\t\u0010\u0015\u001a\u00020\u000bH\u0086 J\t\u0010\u0016\u001a\u00020\u000bH\u0086 J\t\u0010\u0017\u001a\u00020\u000bH\u0086 J\t\u0010\u0018\u001a\u00020\u000bH\u0086 J\t\u0010\u0019\u001a\u00020\u000bH\u0086 J\t\u0010\u001a\u001a\u00020\u000bH\u0086 J\t\u0010\u001b\u001a\u00020\u000bH\u0086 J\t\u0010\u001c\u001a\u00020\u000bH\u0086 J\t\u0010\u001d\u001a\u00020\u000bH\u0086 J\t\u0010\u001e\u001a\u00020\u000bH\u0086 J\t\u0010\u001f\u001a\u00020\u000bH\u0086 \u00a8\u0006 "
    }
    d2 = {
        "Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;",
        "Lcom/facebook/soloader/ExternalSoMapping;",
        "<init>",
        "()V",
        "mapLibName",
        "",
        "input",
        "invokeJniOnload",
        "",
        "libraryName",
        "libfabricjni_so",
        "",
        "libhermes_executor_so",
        "libhermesinstancejni_so",
        "libhermestooling_so",
        "libjscexecutor_so",
        "libjscinstance_so",
        "libjscruntime_so",
        "libjsctooling_so",
        "libjsijniprofiler_so",
        "libjsinspector_so",
        "libmapbufferjni_so",
        "libreact_devsupportjni_so",
        "libreact_featureflagsjni_so",
        "libreact_newarchdefaults_so",
        "libreactnative_so",
        "libreactnativeblob_so",
        "libreactnativejni_so",
        "librninstance_so",
        "libturbomodulejsijni_so",
        "libuimanagerjni_so",
        "libyoga_so",
        "ReactAndroid_release"
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
.field public static final INSTANCE:Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->INSTANCE:Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;

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

.method private constructor <init>()V
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


# virtual methods
.method public invokeJniOnload(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "libraryName"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 9
    move-result v0

    .line 10
    .line 11
    .line 12
    sparse-switch v0, :sswitch_data_0

    .line 13
    .line 14
    goto/16 :goto_0

    .line 15
    .line 16
    :sswitch_0
    const-string v0, "fabricjni"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    move-result p1

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libfabricjni_so()I

    .line 28
    return-void

    .line 29
    .line 30
    :sswitch_1
    const-string v0, "jsinspector"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    move-result p1

    .line 35
    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libjsinspector_so()I

    .line 42
    return-void

    .line 43
    .line 44
    :sswitch_2
    const-string v0, "jscruntime"

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    move-result p1

    .line 49
    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libjscruntime_so()I

    .line 56
    return-void

    .line 57
    .line 58
    :sswitch_3
    const-string v0, "jscexecutor"

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    move-result p1

    .line 63
    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libjscexecutor_so()I

    .line 70
    return-void

    .line 71
    .line 72
    .line 73
    :sswitch_4
    const-string/jumbo v0, "uimanagerjni"

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    move-result p1

    .line 78
    .line 79
    if-nez p1, :cond_4

    .line 80
    .line 81
    goto/16 :goto_0

    .line 82
    .line 83
    .line 84
    :cond_4
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libuimanagerjni_so()I

    .line 85
    return-void

    .line 86
    .line 87
    .line 88
    :sswitch_5
    const-string/jumbo v0, "react_devsupportjni"

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    move-result p1

    .line 93
    .line 94
    if-nez p1, :cond_5

    .line 95
    .line 96
    goto/16 :goto_0

    .line 97
    .line 98
    .line 99
    :cond_5
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libreact_devsupportjni_so()I

    .line 100
    return-void

    .line 101
    .line 102
    :sswitch_6
    const-string v0, "hermestooling"

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    move-result p1

    .line 107
    .line 108
    if-nez p1, :cond_6

    .line 109
    .line 110
    goto/16 :goto_0

    .line 111
    .line 112
    .line 113
    :cond_6
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libhermestooling_so()I

    .line 114
    return-void

    .line 115
    .line 116
    :sswitch_7
    const-string v0, "hermes_executor"

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    move-result p1

    .line 121
    .line 122
    if-nez p1, :cond_7

    .line 123
    .line 124
    goto/16 :goto_0

    .line 125
    .line 126
    .line 127
    :cond_7
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libhermes_executor_so()I

    .line 128
    return-void

    .line 129
    .line 130
    :sswitch_8
    const-string v0, "jsijniprofiler"

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    move-result p1

    .line 135
    .line 136
    if-nez p1, :cond_8

    .line 137
    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    .line 141
    :cond_8
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libjsijniprofiler_so()I

    .line 142
    return-void

    .line 143
    .line 144
    :sswitch_9
    const-string v0, "hermesinstancejni"

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    move-result p1

    .line 149
    .line 150
    if-nez p1, :cond_9

    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    .line 155
    :cond_9
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libhermesinstancejni_so()I

    .line 156
    return-void

    .line 157
    .line 158
    .line 159
    :sswitch_a
    const-string/jumbo v0, "yoga"

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    move-result p1

    .line 164
    .line 165
    if-nez p1, :cond_a

    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    .line 170
    :cond_a
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libyoga_so()I

    .line 171
    return-void

    .line 172
    .line 173
    .line 174
    :sswitch_b
    const-string/jumbo v0, "turbomodulejsijni"

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    move-result p1

    .line 179
    .line 180
    if-nez p1, :cond_b

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    .line 185
    :cond_b
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libturbomodulejsijni_so()I

    .line 186
    return-void

    .line 187
    .line 188
    .line 189
    :sswitch_c
    const-string/jumbo v0, "react_newarchdefaults"

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    move-result p1

    .line 194
    .line 195
    if-nez p1, :cond_c

    .line 196
    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    .line 200
    :cond_c
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libreact_newarchdefaults_so()I

    .line 201
    return-void

    .line 202
    .line 203
    :sswitch_d
    const-string v0, "jscinstance"

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    move-result p1

    .line 208
    .line 209
    if-nez p1, :cond_d

    .line 210
    goto :goto_0

    .line 211
    .line 212
    .line 213
    :cond_d
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libjscinstance_so()I

    .line 214
    return-void

    .line 215
    .line 216
    .line 217
    :sswitch_e
    const-string/jumbo v0, "reactnative"

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    move-result p1

    .line 222
    .line 223
    if-nez p1, :cond_e

    .line 224
    goto :goto_0

    .line 225
    .line 226
    .line 227
    :cond_e
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libreactnative_so()I

    .line 228
    return-void

    .line 229
    .line 230
    .line 231
    :sswitch_f
    const-string/jumbo v0, "react_featureflagsjni"

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    move-result p1

    .line 236
    .line 237
    if-nez p1, :cond_f

    .line 238
    goto :goto_0

    .line 239
    .line 240
    .line 241
    :cond_f
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libreact_featureflagsjni_so()I

    .line 242
    return-void

    .line 243
    .line 244
    .line 245
    :sswitch_10
    const-string/jumbo v0, "reactnativeblob"

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    move-result p1

    .line 250
    .line 251
    if-nez p1, :cond_10

    .line 252
    goto :goto_0

    .line 253
    .line 254
    .line 255
    :cond_10
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libreactnativeblob_so()I

    .line 256
    return-void

    .line 257
    .line 258
    :sswitch_11
    const-string v0, "jsctooling"

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    move-result p1

    .line 263
    .line 264
    if-nez p1, :cond_11

    .line 265
    goto :goto_0

    .line 266
    .line 267
    .line 268
    :cond_11
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libjsctooling_so()I

    .line 269
    return-void

    .line 270
    .line 271
    .line 272
    :sswitch_12
    const-string/jumbo v0, "reactnativejni"

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    move-result p1

    .line 277
    .line 278
    if-nez p1, :cond_12

    .line 279
    goto :goto_0

    .line 280
    .line 281
    .line 282
    :cond_12
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libreactnativejni_so()I

    .line 283
    return-void

    .line 284
    .line 285
    .line 286
    :sswitch_13
    const-string/jumbo v0, "rninstance"

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 290
    move-result p1

    .line 291
    .line 292
    if-nez p1, :cond_13

    .line 293
    goto :goto_0

    .line 294
    .line 295
    .line 296
    :cond_13
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->librninstance_so()I

    .line 297
    return-void

    .line 298
    .line 299
    :sswitch_14
    const-string v0, "mapbufferjni"

    .line 300
    .line 301
    .line 302
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    move-result p1

    .line 304
    .line 305
    if-nez p1, :cond_14

    .line 306
    :goto_0
    return-void

    .line 307
    .line 308
    .line 309
    :cond_14
    invoke-virtual {p0}, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->libmapbufferjni_so()I

    .line 310
    return-void

    .line 311
    .line 312
    .line 313
    .line 314
    :sswitch_data_0
    .sparse-switch
        -0x6ae8be77 -> :sswitch_14
        -0x60cd592f -> :sswitch_13
        -0x5d9ada71 -> :sswitch_12
        -0x56b94a30 -> :sswitch_11
        -0x55c41d0d -> :sswitch_10
        -0x526a3e0c -> :sswitch_f
        -0x3d9731aa -> :sswitch_e
        -0x24c2a931 -> :sswitch_d
        -0x22836878 -> :sswitch_c
        -0x2f0f211 -> :sswitch_b
        0x38ae70 -> :sswitch_a
        0x3e8008a -> :sswitch_9
        0x5230e4e -> :sswitch_8
        0x1503864c -> :sswitch_7
        0x24a041e4 -> :sswitch_6
        0x2905a48b -> :sswitch_5
        0x2ab6b66c -> :sswitch_4
        0x33ecbb0d -> :sswitch_3
        0x49acde5e -> :sswitch_2
        0x5ecc0fce -> :sswitch_1
        0x7837a0e0 -> :sswitch_0
    .end sparse-switch
.end method

.method public final native libfabricjni_so()I
.end method

.method public final native libhermes_executor_so()I
.end method

.method public final native libhermesinstancejni_so()I
.end method

.method public final native libhermestooling_so()I
.end method

.method public final native libjscexecutor_so()I
.end method

.method public final native libjscinstance_so()I
.end method

.method public final native libjscruntime_so()I
.end method

.method public final native libjsctooling_so()I
.end method

.method public final native libjsijniprofiler_so()I
.end method

.method public final native libjsinspector_so()I
.end method

.method public final native libmapbufferjni_so()I
.end method

.method public final native libreact_devsupportjni_so()I
.end method

.method public final native libreact_featureflagsjni_so()I
.end method

.method public final native libreact_newarchdefaults_so()I
.end method

.method public final native libreactnative_so()I
.end method

.method public final native libreactnativeblob_so()I
.end method

.method public final native libreactnativejni_so()I
.end method

.method public final native librninstance_so()I
.end method

.method public final native libturbomodulejsijni_so()I
.end method

.method public final native libuimanagerjni_so()I
.end method

.method public final native libyoga_so()I
.end method

.method public mapLibName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "input"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 9
    move-result v0

    .line 10
    .line 11
    .line 12
    sparse-switch v0, :sswitch_data_0

    .line 13
    .line 14
    goto/16 :goto_0

    .line 15
    .line 16
    :sswitch_0
    const-string v0, "fabricjni"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :sswitch_1
    const-string v0, "jsinspector"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :sswitch_2
    const-string v0, "jscruntime"

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    move-result v0

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :sswitch_3
    const-string v0, "jscexecutor"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    move-result v0

    .line 51
    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    .line 57
    :sswitch_4
    const-string/jumbo v0, "uimanagerjni"

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    move-result v0

    .line 62
    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    .line 68
    :sswitch_5
    const-string/jumbo v0, "react_devsupportjni"

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    move-result v0

    .line 73
    .line 74
    if-nez v0, :cond_2

    .line 75
    .line 76
    goto/16 :goto_0

    .line 77
    .line 78
    :sswitch_6
    const-string v0, "hermes_executor"

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    move-result v0

    .line 83
    .line 84
    if-nez v0, :cond_0

    .line 85
    .line 86
    goto/16 :goto_0

    .line 87
    .line 88
    :sswitch_7
    const-string v0, "jsijniprofiler"

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    move-result v0

    .line 93
    .line 94
    if-nez v0, :cond_0

    .line 95
    .line 96
    goto/16 :goto_0

    .line 97
    .line 98
    :sswitch_8
    const-string v0, "hermesinstancejni"

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    move-result v0

    .line 103
    .line 104
    if-nez v0, :cond_0

    .line 105
    goto :goto_0

    .line 106
    .line 107
    :cond_0
    const-string p1, "hermestooling"

    .line 108
    return-object p1

    .line 109
    .line 110
    .line 111
    :sswitch_9
    const-string/jumbo v0, "yoga"

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    move-result v0

    .line 116
    .line 117
    if-nez v0, :cond_2

    .line 118
    goto :goto_0

    .line 119
    .line 120
    .line 121
    :sswitch_a
    const-string/jumbo v0, "turbomodulejsijni"

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    move-result v0

    .line 126
    .line 127
    if-nez v0, :cond_2

    .line 128
    goto :goto_0

    .line 129
    .line 130
    .line 131
    :sswitch_b
    const-string/jumbo v0, "react_newarchdefaults"

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    move-result v0

    .line 136
    .line 137
    if-nez v0, :cond_2

    .line 138
    goto :goto_0

    .line 139
    .line 140
    :sswitch_c
    const-string v0, "jscinstance"

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    move-result v0

    .line 145
    .line 146
    if-nez v0, :cond_1

    .line 147
    goto :goto_0

    .line 148
    .line 149
    :cond_1
    const-string p1, "jsctooling"

    .line 150
    return-object p1

    .line 151
    .line 152
    .line 153
    :sswitch_d
    const-string/jumbo v0, "react_featureflagsjni"

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    move-result v0

    .line 158
    .line 159
    if-nez v0, :cond_2

    .line 160
    goto :goto_0

    .line 161
    .line 162
    .line 163
    :sswitch_e
    const-string/jumbo v0, "reactnativeblob"

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    move-result v0

    .line 168
    .line 169
    if-nez v0, :cond_2

    .line 170
    goto :goto_0

    .line 171
    .line 172
    .line 173
    :sswitch_f
    const-string/jumbo v0, "reactnativejni"

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    move-result v0

    .line 178
    .line 179
    if-nez v0, :cond_2

    .line 180
    goto :goto_0

    .line 181
    .line 182
    .line 183
    :sswitch_10
    const-string/jumbo v0, "rninstance"

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    move-result v0

    .line 188
    .line 189
    if-nez v0, :cond_2

    .line 190
    goto :goto_0

    .line 191
    .line 192
    :sswitch_11
    const-string v0, "mapbufferjni"

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    move-result v0

    .line 197
    .line 198
    if-eqz v0, :cond_3

    .line 199
    .line 200
    .line 201
    :cond_2
    const-string/jumbo p1, "reactnative"

    .line 202
    :cond_3
    :goto_0
    return-object p1

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
    :sswitch_data_0
    .sparse-switch
        -0x6ae8be77 -> :sswitch_11
        -0x60cd592f -> :sswitch_10
        -0x5d9ada71 -> :sswitch_f
        -0x55c41d0d -> :sswitch_e
        -0x526a3e0c -> :sswitch_d
        -0x24c2a931 -> :sswitch_c
        -0x22836878 -> :sswitch_b
        -0x2f0f211 -> :sswitch_a
        0x38ae70 -> :sswitch_9
        0x3e8008a -> :sswitch_8
        0x5230e4e -> :sswitch_7
        0x1503864c -> :sswitch_6
        0x2905a48b -> :sswitch_5
        0x2ab6b66c -> :sswitch_4
        0x33ecbb0d -> :sswitch_3
        0x49acde5e -> :sswitch_2
        0x5ecc0fce -> :sswitch_1
        0x7837a0e0 -> :sswitch_0
    .end sparse-switch
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
.end method
