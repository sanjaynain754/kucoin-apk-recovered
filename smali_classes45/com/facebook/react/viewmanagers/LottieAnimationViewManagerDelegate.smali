.class public Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "LottieAnimationViewManagerDelegate.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        "U:",
        "Lcom/facebook/react/uimanager/BaseViewManager<",
        "TT;+",
        "Lcom/facebook/react/uimanager/LayoutShadowNode;",
        ">;:",
        "Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface<",
        "TT;>;>",
        "Lcom/facebook/react/uimanager/BaseViewManagerDelegate<",
        "TT;TU;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/BaseViewManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

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
.end method


# virtual methods
.method public receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 4
    .param p3    # Lcom/facebook/react/bridge/ReadableArray;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/ReadableArray;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    const/4 v2, -0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 10
    move-result v3

    .line 11
    .line 12
    .line 13
    sparse-switch v3, :sswitch_data_0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    .line 17
    :sswitch_0
    const-string/jumbo v3, "reset"

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    move-result p2

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v2, 0x3

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :sswitch_1
    const-string v3, "pause"

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    move-result p2

    .line 33
    .line 34
    if-nez p2, :cond_1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v2, 0x2

    .line 37
    goto :goto_0

    .line 38
    .line 39
    .line 40
    :sswitch_2
    const-string/jumbo v3, "play"

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    move-result p2

    .line 45
    .line 46
    if-nez p2, :cond_2

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move v2, v0

    .line 49
    goto :goto_0

    .line 50
    .line 51
    .line 52
    :sswitch_3
    const-string/jumbo v3, "resume"

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    move-result p2

    .line 57
    .line 58
    if-nez p2, :cond_3

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    move v2, v1

    .line 61
    .line 62
    .line 63
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 64
    return-void

    .line 65
    .line 66
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 67
    .line 68
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 69
    .line 70
    .line 71
    invoke-interface {p2, p1}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->reset(Landroid/view/View;)V

    .line 72
    return-void

    .line 73
    .line 74
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 75
    .line 76
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 77
    .line 78
    .line 79
    invoke-interface {p2, p1}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->pause(Landroid/view/View;)V

    .line 80
    return-void

    .line 81
    .line 82
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 83
    .line 84
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 85
    .line 86
    .line 87
    invoke-interface {p3, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 88
    move-result v1

    .line 89
    .line 90
    .line 91
    invoke-interface {p3, v0}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 92
    move-result p3

    .line 93
    .line 94
    .line 95
    invoke-interface {p2, p1, v1, p3}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->play(Landroid/view/View;II)V

    .line 96
    return-void

    .line 97
    .line 98
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 99
    .line 100
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 101
    .line 102
    .line 103
    invoke-interface {p2, p1}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->resume(Landroid/view/View;)V

    .line 104
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x37b237d3 -> :sswitch_3
        0x348b34 -> :sswitch_2
        0x65825f6 -> :sswitch_1
        0x6761d4f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, -0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 10
    move-result v3

    .line 11
    .line 12
    .line 13
    sparse-switch v3, :sswitch_data_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :sswitch_0
    const-string v3, "enableMergePathsAndroidForKitKatAndAbove"

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    move-result v3

    .line 22
    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_0
    const/16 v2, 0x12

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    .line 32
    :sswitch_1
    const-string/jumbo v3, "resizeMode"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    move-result v3

    .line 37
    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_1
    const/16 v2, 0x11

    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :sswitch_2
    const-string v3, "autoPlay"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    move-result v3

    .line 51
    .line 52
    if-nez v3, :cond_2

    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :cond_2
    const/16 v2, 0x10

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :sswitch_3
    const-string v3, "colorFilters"

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    move-result v3

    .line 65
    .line 66
    if-nez v3, :cond_3

    .line 67
    .line 68
    goto/16 :goto_0

    .line 69
    .line 70
    :cond_3
    const/16 v2, 0xf

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    .line 75
    :sswitch_4
    const-string/jumbo v3, "renderMode"

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    move-result v3

    .line 80
    .line 81
    if-nez v3, :cond_4

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :cond_4
    const/16 v2, 0xe

    .line 86
    .line 87
    goto/16 :goto_0

    .line 88
    .line 89
    :sswitch_5
    const-string v3, "enableSafeModeAndroid"

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    move-result v3

    .line 94
    .line 95
    if-nez v3, :cond_5

    .line 96
    .line 97
    goto/16 :goto_0

    .line 98
    .line 99
    :cond_5
    const/16 v2, 0xd

    .line 100
    .line 101
    goto/16 :goto_0

    .line 102
    .line 103
    :sswitch_6
    const-string v3, "hardwareAccelerationAndroid"

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    move-result v3

    .line 108
    .line 109
    if-nez v3, :cond_6

    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :cond_6
    const/16 v2, 0xc

    .line 114
    .line 115
    goto/16 :goto_0

    .line 116
    .line 117
    .line 118
    :sswitch_7
    const-string/jumbo v3, "speed"

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    move-result v3

    .line 123
    .line 124
    if-nez v3, :cond_7

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :cond_7
    const/16 v2, 0xb

    .line 129
    .line 130
    goto/16 :goto_0

    .line 131
    .line 132
    :sswitch_8
    const-string v3, "dummy"

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    move-result v3

    .line 137
    .line 138
    if-nez v3, :cond_8

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :cond_8
    const/16 v2, 0xa

    .line 143
    .line 144
    goto/16 :goto_0

    .line 145
    .line 146
    :sswitch_9
    const-string v3, "loop"

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    move-result v3

    .line 151
    .line 152
    if-nez v3, :cond_9

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_9
    const/16 v2, 0x9

    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    .line 161
    :sswitch_a
    const-string/jumbo v3, "sourceDotLottieURI"

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    move-result v3

    .line 166
    .line 167
    if-nez v3, :cond_a

    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_a
    const/16 v2, 0x8

    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    .line 176
    :sswitch_b
    const-string/jumbo v3, "textFiltersAndroid"

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    move-result v3

    .line 181
    .line 182
    if-nez v3, :cond_b

    .line 183
    goto :goto_0

    .line 184
    :cond_b
    const/4 v2, 0x7

    .line 185
    goto :goto_0

    .line 186
    .line 187
    .line 188
    :sswitch_c
    const-string/jumbo v3, "progress"

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    move-result v3

    .line 193
    .line 194
    if-nez v3, :cond_c

    .line 195
    goto :goto_0

    .line 196
    :cond_c
    const/4 v2, 0x6

    .line 197
    goto :goto_0

    .line 198
    .line 199
    :sswitch_d
    const-string v3, "cacheComposition"

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    move-result v3

    .line 204
    .line 205
    if-nez v3, :cond_d

    .line 206
    goto :goto_0

    .line 207
    :cond_d
    const/4 v2, 0x5

    .line 208
    goto :goto_0

    .line 209
    .line 210
    .line 211
    :sswitch_e
    const-string/jumbo v3, "sourceName"

    .line 212
    .line 213
    .line 214
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    move-result v3

    .line 216
    .line 217
    if-nez v3, :cond_e

    .line 218
    goto :goto_0

    .line 219
    :cond_e
    const/4 v2, 0x4

    .line 220
    goto :goto_0

    .line 221
    .line 222
    .line 223
    :sswitch_f
    const-string/jumbo v3, "sourceJson"

    .line 224
    .line 225
    .line 226
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    move-result v3

    .line 228
    .line 229
    if-nez v3, :cond_f

    .line 230
    goto :goto_0

    .line 231
    :cond_f
    const/4 v2, 0x3

    .line 232
    goto :goto_0

    .line 233
    .line 234
    .line 235
    :sswitch_10
    const-string/jumbo v3, "textFiltersIOS"

    .line 236
    .line 237
    .line 238
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 239
    move-result v3

    .line 240
    .line 241
    if-nez v3, :cond_10

    .line 242
    goto :goto_0

    .line 243
    :cond_10
    const/4 v2, 0x2

    .line 244
    goto :goto_0

    .line 245
    .line 246
    .line 247
    :sswitch_11
    const-string/jumbo v3, "sourceURL"

    .line 248
    .line 249
    .line 250
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    move-result v3

    .line 252
    .line 253
    if-nez v3, :cond_11

    .line 254
    goto :goto_0

    .line 255
    :cond_11
    const/4 v2, 0x1

    .line 256
    goto :goto_0

    .line 257
    .line 258
    :sswitch_12
    const-string v3, "imageAssetsFolder"

    .line 259
    .line 260
    .line 261
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    move-result v3

    .line 263
    .line 264
    if-nez v3, :cond_12

    .line 265
    goto :goto_0

    .line 266
    :cond_12
    move v2, v0

    .line 267
    .line 268
    .line 269
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 270
    .line 271
    .line 272
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 273
    return-void

    .line 274
    .line 275
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 276
    .line 277
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 278
    .line 279
    if-nez p3, :cond_13

    .line 280
    goto :goto_1

    .line 281
    .line 282
    :cond_13
    check-cast p3, Ljava/lang/Boolean;

    .line 283
    .line 284
    .line 285
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 286
    move-result v0

    .line 287
    .line 288
    .line 289
    :goto_1
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setEnableMergePathsAndroidForKitKatAndAbove(Landroid/view/View;Z)V

    .line 290
    return-void

    .line 291
    .line 292
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 293
    .line 294
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 295
    .line 296
    if-nez p3, :cond_14

    .line 297
    goto :goto_2

    .line 298
    :cond_14
    move-object v1, p3

    .line 299
    .line 300
    check-cast v1, Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    :goto_2
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setResizeMode(Landroid/view/View;Ljava/lang/String;)V

    .line 304
    return-void

    .line 305
    .line 306
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 307
    .line 308
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 309
    .line 310
    if-nez p3, :cond_15

    .line 311
    goto :goto_3

    .line 312
    .line 313
    :cond_15
    check-cast p3, Ljava/lang/Boolean;

    .line 314
    .line 315
    .line 316
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 317
    move-result v0

    .line 318
    .line 319
    .line 320
    :goto_3
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setAutoPlay(Landroid/view/View;Z)V

    .line 321
    return-void

    .line 322
    .line 323
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 324
    .line 325
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 326
    .line 327
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 328
    .line 329
    .line 330
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setColorFilters(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 331
    return-void

    .line 332
    .line 333
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 334
    .line 335
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 336
    .line 337
    if-nez p3, :cond_16

    .line 338
    goto :goto_4

    .line 339
    :cond_16
    move-object v1, p3

    .line 340
    .line 341
    check-cast v1, Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    :goto_4
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setRenderMode(Landroid/view/View;Ljava/lang/String;)V

    .line 345
    return-void

    .line 346
    .line 347
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 348
    .line 349
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 350
    .line 351
    if-nez p3, :cond_17

    .line 352
    goto :goto_5

    .line 353
    .line 354
    :cond_17
    check-cast p3, Ljava/lang/Boolean;

    .line 355
    .line 356
    .line 357
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 358
    move-result v0

    .line 359
    .line 360
    .line 361
    :goto_5
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setEnableSafeModeAndroid(Landroid/view/View;Z)V

    .line 362
    return-void

    .line 363
    .line 364
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 365
    .line 366
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 367
    .line 368
    if-nez p3, :cond_18

    .line 369
    goto :goto_6

    .line 370
    .line 371
    :cond_18
    check-cast p3, Ljava/lang/Boolean;

    .line 372
    .line 373
    .line 374
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 375
    move-result v0

    .line 376
    .line 377
    .line 378
    :goto_6
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setHardwareAccelerationAndroid(Landroid/view/View;Z)V

    .line 379
    return-void

    .line 380
    .line 381
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 382
    .line 383
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 384
    .line 385
    if-nez p3, :cond_19

    .line 386
    .line 387
    const-wide/16 v0, 0x0

    .line 388
    goto :goto_7

    .line 389
    .line 390
    :cond_19
    check-cast p3, Ljava/lang/Double;

    .line 391
    .line 392
    .line 393
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 394
    move-result-wide v0

    .line 395
    .line 396
    .line 397
    :goto_7
    invoke-interface {p2, p1, v0, v1}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setSpeed(Landroid/view/View;D)V

    .line 398
    return-void

    .line 399
    .line 400
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 401
    .line 402
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 403
    .line 404
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 405
    .line 406
    .line 407
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setDummy(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 408
    return-void

    .line 409
    .line 410
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 411
    .line 412
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 413
    .line 414
    if-nez p3, :cond_1a

    .line 415
    goto :goto_8

    .line 416
    .line 417
    :cond_1a
    check-cast p3, Ljava/lang/Boolean;

    .line 418
    .line 419
    .line 420
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 421
    move-result v0

    .line 422
    .line 423
    .line 424
    :goto_8
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setLoop(Landroid/view/View;Z)V

    .line 425
    return-void

    .line 426
    .line 427
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 428
    .line 429
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 430
    .line 431
    if-nez p3, :cond_1b

    .line 432
    goto :goto_9

    .line 433
    :cond_1b
    move-object v1, p3

    .line 434
    .line 435
    check-cast v1, Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    :goto_9
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setSourceDotLottieURI(Landroid/view/View;Ljava/lang/String;)V

    .line 439
    return-void

    .line 440
    .line 441
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 442
    .line 443
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 444
    .line 445
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 446
    .line 447
    .line 448
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setTextFiltersAndroid(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 449
    return-void

    .line 450
    .line 451
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 452
    .line 453
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 454
    .line 455
    if-nez p3, :cond_1c

    .line 456
    const/4 p3, 0x0

    .line 457
    goto :goto_a

    .line 458
    .line 459
    :cond_1c
    check-cast p3, Ljava/lang/Double;

    .line 460
    .line 461
    .line 462
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 463
    move-result p3

    .line 464
    .line 465
    .line 466
    :goto_a
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setProgress(Landroid/view/View;F)V

    .line 467
    return-void

    .line 468
    .line 469
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 470
    .line 471
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 472
    .line 473
    if-nez p3, :cond_1d

    .line 474
    goto :goto_b

    .line 475
    .line 476
    :cond_1d
    check-cast p3, Ljava/lang/Boolean;

    .line 477
    .line 478
    .line 479
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 480
    move-result v0

    .line 481
    .line 482
    .line 483
    :goto_b
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setCacheComposition(Landroid/view/View;Z)V

    .line 484
    return-void

    .line 485
    .line 486
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 487
    .line 488
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 489
    .line 490
    if-nez p3, :cond_1e

    .line 491
    goto :goto_c

    .line 492
    :cond_1e
    move-object v1, p3

    .line 493
    .line 494
    check-cast v1, Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    :goto_c
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setSourceName(Landroid/view/View;Ljava/lang/String;)V

    .line 498
    return-void

    .line 499
    .line 500
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 501
    .line 502
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 503
    .line 504
    if-nez p3, :cond_1f

    .line 505
    goto :goto_d

    .line 506
    :cond_1f
    move-object v1, p3

    .line 507
    .line 508
    check-cast v1, Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    :goto_d
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setSourceJson(Landroid/view/View;Ljava/lang/String;)V

    .line 512
    return-void

    .line 513
    .line 514
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 515
    .line 516
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 517
    .line 518
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 519
    .line 520
    .line 521
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setTextFiltersIOS(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 522
    return-void

    .line 523
    .line 524
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 525
    .line 526
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 527
    .line 528
    if-nez p3, :cond_20

    .line 529
    goto :goto_e

    .line 530
    :cond_20
    move-object v1, p3

    .line 531
    .line 532
    check-cast v1, Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    :goto_e
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setSourceURL(Landroid/view/View;Ljava/lang/String;)V

    .line 536
    return-void

    .line 537
    .line 538
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 539
    .line 540
    check-cast p2, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;

    .line 541
    .line 542
    if-nez p3, :cond_21

    .line 543
    goto :goto_f

    .line 544
    :cond_21
    move-object v1, p3

    .line 545
    .line 546
    check-cast v1, Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    :goto_f
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;->setImageAssetsFolder(Landroid/view/View;Ljava/lang/String;)V

    .line 550
    return-void

    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    :sswitch_data_0
    .sparse-switch
        -0x731ba534 -> :sswitch_12
        -0x653bd8ac -> :sswitch_11
        -0x609b00e1 -> :sswitch_10
        -0x4243bc5d -> :sswitch_f
        -0x42422eba -> :sswitch_e
        -0x3ff56338 -> :sswitch_d
        -0x3bab3dd3 -> :sswitch_c
        -0x18a4377f -> :sswitch_b
        -0xc29f641 -> :sswitch_a
        0x32c6a4 -> :sswitch_9
        0x5b804a8 -> :sswitch_8
        0x6890047 -> :sswitch_7
        0x17c972c7 -> :sswitch_6
        0x470d217c -> :sswitch_5
        0x47293459 -> :sswitch_4
        0x54138718 -> :sswitch_3
        0x55bf6d83 -> :sswitch_2
        0x7a2cd077 -> :sswitch_1
        0x7dd7e061 -> :sswitch_0
    .end sparse-switch

    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
.end method
