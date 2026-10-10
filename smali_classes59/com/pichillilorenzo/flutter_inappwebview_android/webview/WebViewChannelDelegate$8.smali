.class synthetic Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1009
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->values()[Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 10
    .line 11
    :try_start_0
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->getUrl:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    :catch_0
    :try_start_1
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 21
    .line 22
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->getTitle:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x2

    .line 28
    .line 29
    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 30
    .line 31
    :catch_1
    :try_start_2
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 32
    .line 33
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->getProgress:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 37
    move-result v1

    .line 38
    const/4 v2, 0x3

    .line 39
    .line 40
    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 41
    .line 42
    :catch_2
    :try_start_3
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 43
    .line 44
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->loadUrl:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x4

    .line 50
    .line 51
    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 52
    .line 53
    :catch_3
    :try_start_4
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 54
    .line 55
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->postUrl:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 59
    move-result v1

    .line 60
    const/4 v2, 0x5

    .line 61
    .line 62
    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 63
    .line 64
    :catch_4
    :try_start_5
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 65
    .line 66
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->loadData:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 70
    move-result v1

    .line 71
    const/4 v2, 0x6

    .line 72
    .line 73
    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    .line 74
    .line 75
    :catch_5
    :try_start_6
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 76
    .line 77
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->loadFile:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 81
    move-result v1

    .line 82
    const/4 v2, 0x7

    .line 83
    .line 84
    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 85
    .line 86
    :catch_6
    :try_start_7
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 87
    .line 88
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->evaluateJavascript:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 92
    move-result v1

    .line 93
    .line 94
    const/16 v2, 0x8

    .line 95
    .line 96
    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    .line 97
    .line 98
    :catch_7
    :try_start_8
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 99
    .line 100
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->injectJavascriptFileFromUrl:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 104
    move-result v1

    .line 105
    .line 106
    const/16 v2, 0x9

    .line 107
    .line 108
    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    .line 109
    .line 110
    :catch_8
    :try_start_9
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 111
    .line 112
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->injectCSSCode:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 116
    move-result v1

    .line 117
    .line 118
    const/16 v2, 0xa

    .line 119
    .line 120
    aput v2, v0, v1
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    .line 121
    .line 122
    :catch_9
    :try_start_a
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 123
    .line 124
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->injectCSSFileFromUrl:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 128
    move-result v1

    .line 129
    .line 130
    const/16 v2, 0xb

    .line 131
    .line 132
    aput v2, v0, v1
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    .line 133
    .line 134
    :catch_a
    :try_start_b
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 135
    .line 136
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->reload:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 140
    move-result v1

    .line 141
    .line 142
    const/16 v2, 0xc

    .line 143
    .line 144
    aput v2, v0, v1
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    .line 145
    .line 146
    :catch_b
    :try_start_c
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 147
    .line 148
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->goBack:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 152
    move-result v1

    .line 153
    .line 154
    const/16 v2, 0xd

    .line 155
    .line 156
    aput v2, v0, v1
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    .line 157
    .line 158
    :catch_c
    :try_start_d
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 159
    .line 160
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->canGoBack:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 164
    move-result v1

    .line 165
    .line 166
    const/16 v2, 0xe

    .line 167
    .line 168
    aput v2, v0, v1
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    .line 169
    .line 170
    :catch_d
    :try_start_e
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 171
    .line 172
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->goForward:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 176
    move-result v1

    .line 177
    .line 178
    const/16 v2, 0xf

    .line 179
    .line 180
    aput v2, v0, v1
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    .line 181
    .line 182
    :catch_e
    :try_start_f
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 183
    .line 184
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->canGoForward:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 188
    move-result v1

    .line 189
    .line 190
    const/16 v2, 0x10

    .line 191
    .line 192
    aput v2, v0, v1
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    .line 193
    .line 194
    :catch_f
    :try_start_10
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 195
    .line 196
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->goBackOrForward:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 200
    move-result v1

    .line 201
    .line 202
    const/16 v2, 0x11

    .line 203
    .line 204
    aput v2, v0, v1
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_10} :catch_10

    .line 205
    .line 206
    :catch_10
    :try_start_11
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 207
    .line 208
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->canGoBackOrForward:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 212
    move-result v1

    .line 213
    .line 214
    const/16 v2, 0x12

    .line 215
    .line 216
    aput v2, v0, v1
    :try_end_11
    .catch Ljava/lang/NoSuchFieldError; {:try_start_11 .. :try_end_11} :catch_11

    .line 217
    .line 218
    :catch_11
    :try_start_12
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 219
    .line 220
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->stopLoading:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 224
    move-result v1

    .line 225
    .line 226
    const/16 v2, 0x13

    .line 227
    .line 228
    aput v2, v0, v1
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_12} :catch_12

    .line 229
    .line 230
    :catch_12
    :try_start_13
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 231
    .line 232
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->isLoading:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 236
    move-result v1

    .line 237
    .line 238
    const/16 v2, 0x14

    .line 239
    .line 240
    aput v2, v0, v1
    :try_end_13
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_13} :catch_13

    .line 241
    .line 242
    :catch_13
    :try_start_14
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 243
    .line 244
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->takeScreenshot:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 248
    move-result v1

    .line 249
    .line 250
    const/16 v2, 0x15

    .line 251
    .line 252
    aput v2, v0, v1
    :try_end_14
    .catch Ljava/lang/NoSuchFieldError; {:try_start_14 .. :try_end_14} :catch_14

    .line 253
    .line 254
    :catch_14
    :try_start_15
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 255
    .line 256
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->setSettings:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 260
    move-result v1

    .line 261
    .line 262
    const/16 v2, 0x16

    .line 263
    .line 264
    aput v2, v0, v1
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_15 .. :try_end_15} :catch_15

    .line 265
    .line 266
    :catch_15
    :try_start_16
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 267
    .line 268
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->getSettings:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 272
    move-result v1

    .line 273
    .line 274
    const/16 v2, 0x17

    .line 275
    .line 276
    aput v2, v0, v1
    :try_end_16
    .catch Ljava/lang/NoSuchFieldError; {:try_start_16 .. :try_end_16} :catch_16

    .line 277
    .line 278
    :catch_16
    :try_start_17
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 279
    .line 280
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->close:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 284
    move-result v1

    .line 285
    .line 286
    const/16 v2, 0x18

    .line 287
    .line 288
    aput v2, v0, v1
    :try_end_17
    .catch Ljava/lang/NoSuchFieldError; {:try_start_17 .. :try_end_17} :catch_17

    .line 289
    .line 290
    :catch_17
    :try_start_18
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 291
    .line 292
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->show:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 296
    move-result v1

    .line 297
    .line 298
    const/16 v2, 0x19

    .line 299
    .line 300
    aput v2, v0, v1
    :try_end_18
    .catch Ljava/lang/NoSuchFieldError; {:try_start_18 .. :try_end_18} :catch_18

    .line 301
    .line 302
    :catch_18
    :try_start_19
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 303
    .line 304
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->hide:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 308
    move-result v1

    .line 309
    .line 310
    const/16 v2, 0x1a

    .line 311
    .line 312
    aput v2, v0, v1
    :try_end_19
    .catch Ljava/lang/NoSuchFieldError; {:try_start_19 .. :try_end_19} :catch_19

    .line 313
    .line 314
    :catch_19
    :try_start_1a
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 315
    .line 316
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->isHidden:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 320
    move-result v1

    .line 321
    .line 322
    const/16 v2, 0x1b

    .line 323
    .line 324
    aput v2, v0, v1
    :try_end_1a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1a .. :try_end_1a} :catch_1a

    .line 325
    .line 326
    :catch_1a
    :try_start_1b
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 327
    .line 328
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->getCopyBackForwardList:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 332
    move-result v1

    .line 333
    .line 334
    const/16 v2, 0x1c

    .line 335
    .line 336
    aput v2, v0, v1
    :try_end_1b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1b .. :try_end_1b} :catch_1b

    .line 337
    .line 338
    :catch_1b
    :try_start_1c
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 339
    .line 340
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->startSafeBrowsing:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 344
    move-result v1

    .line 345
    .line 346
    const/16 v2, 0x1d

    .line 347
    .line 348
    aput v2, v0, v1
    :try_end_1c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1c .. :try_end_1c} :catch_1c

    .line 349
    .line 350
    :catch_1c
    :try_start_1d
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 351
    .line 352
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->clearCache:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 356
    move-result v1

    .line 357
    .line 358
    const/16 v2, 0x1e

    .line 359
    .line 360
    aput v2, v0, v1
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1d .. :try_end_1d} :catch_1d

    .line 361
    .line 362
    :catch_1d
    :try_start_1e
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 363
    .line 364
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->clearSslPreferences:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 368
    move-result v1

    .line 369
    .line 370
    const/16 v2, 0x1f

    .line 371
    .line 372
    aput v2, v0, v1
    :try_end_1e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1e .. :try_end_1e} :catch_1e

    .line 373
    .line 374
    :catch_1e
    :try_start_1f
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 375
    .line 376
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->findAll:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 380
    move-result v1

    .line 381
    .line 382
    const/16 v2, 0x20

    .line 383
    .line 384
    aput v2, v0, v1
    :try_end_1f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1f .. :try_end_1f} :catch_1f

    .line 385
    .line 386
    :catch_1f
    :try_start_20
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 387
    .line 388
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->findNext:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 392
    move-result v1

    .line 393
    .line 394
    const/16 v2, 0x21

    .line 395
    .line 396
    aput v2, v0, v1
    :try_end_20
    .catch Ljava/lang/NoSuchFieldError; {:try_start_20 .. :try_end_20} :catch_20

    .line 397
    .line 398
    :catch_20
    :try_start_21
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 399
    .line 400
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->clearMatches:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 404
    move-result v1

    .line 405
    .line 406
    const/16 v2, 0x22

    .line 407
    .line 408
    aput v2, v0, v1
    :try_end_21
    .catch Ljava/lang/NoSuchFieldError; {:try_start_21 .. :try_end_21} :catch_21

    .line 409
    .line 410
    :catch_21
    :try_start_22
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 411
    .line 412
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->scrollTo:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 416
    move-result v1

    .line 417
    .line 418
    const/16 v2, 0x23

    .line 419
    .line 420
    aput v2, v0, v1
    :try_end_22
    .catch Ljava/lang/NoSuchFieldError; {:try_start_22 .. :try_end_22} :catch_22

    .line 421
    .line 422
    :catch_22
    :try_start_23
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 423
    .line 424
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->scrollBy:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 428
    move-result v1

    .line 429
    .line 430
    const/16 v2, 0x24

    .line 431
    .line 432
    aput v2, v0, v1
    :try_end_23
    .catch Ljava/lang/NoSuchFieldError; {:try_start_23 .. :try_end_23} :catch_23

    .line 433
    .line 434
    :catch_23
    :try_start_24
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 435
    .line 436
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->pause:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 440
    move-result v1

    .line 441
    .line 442
    const/16 v2, 0x25

    .line 443
    .line 444
    aput v2, v0, v1
    :try_end_24
    .catch Ljava/lang/NoSuchFieldError; {:try_start_24 .. :try_end_24} :catch_24

    .line 445
    .line 446
    :catch_24
    :try_start_25
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 447
    .line 448
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->resume:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 452
    move-result v1

    .line 453
    .line 454
    const/16 v2, 0x26

    .line 455
    .line 456
    aput v2, v0, v1
    :try_end_25
    .catch Ljava/lang/NoSuchFieldError; {:try_start_25 .. :try_end_25} :catch_25

    .line 457
    .line 458
    :catch_25
    :try_start_26
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 459
    .line 460
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->pauseTimers:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 464
    move-result v1

    .line 465
    .line 466
    const/16 v2, 0x27

    .line 467
    .line 468
    aput v2, v0, v1
    :try_end_26
    .catch Ljava/lang/NoSuchFieldError; {:try_start_26 .. :try_end_26} :catch_26

    .line 469
    .line 470
    :catch_26
    :try_start_27
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 471
    .line 472
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->resumeTimers:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 476
    move-result v1

    .line 477
    .line 478
    const/16 v2, 0x28

    .line 479
    .line 480
    aput v2, v0, v1
    :try_end_27
    .catch Ljava/lang/NoSuchFieldError; {:try_start_27 .. :try_end_27} :catch_27

    .line 481
    .line 482
    :catch_27
    :try_start_28
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 483
    .line 484
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->printCurrentPage:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 488
    move-result v1

    .line 489
    .line 490
    const/16 v2, 0x29

    .line 491
    .line 492
    aput v2, v0, v1
    :try_end_28
    .catch Ljava/lang/NoSuchFieldError; {:try_start_28 .. :try_end_28} :catch_28

    .line 493
    .line 494
    :catch_28
    :try_start_29
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 495
    .line 496
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->getContentHeight:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 500
    move-result v1

    .line 501
    .line 502
    const/16 v2, 0x2a

    .line 503
    .line 504
    aput v2, v0, v1
    :try_end_29
    .catch Ljava/lang/NoSuchFieldError; {:try_start_29 .. :try_end_29} :catch_29

    .line 505
    .line 506
    :catch_29
    :try_start_2a
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 507
    .line 508
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->getContentWidth:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 512
    move-result v1

    .line 513
    .line 514
    const/16 v2, 0x2b

    .line 515
    .line 516
    aput v2, v0, v1
    :try_end_2a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2a .. :try_end_2a} :catch_2a

    .line 517
    .line 518
    :catch_2a
    :try_start_2b
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 519
    .line 520
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->zoomBy:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 524
    move-result v1

    .line 525
    .line 526
    const/16 v2, 0x2c

    .line 527
    .line 528
    aput v2, v0, v1
    :try_end_2b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2b .. :try_end_2b} :catch_2b

    .line 529
    .line 530
    :catch_2b
    :try_start_2c
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 531
    .line 532
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->getOriginalUrl:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 536
    move-result v1

    .line 537
    .line 538
    const/16 v2, 0x2d

    .line 539
    .line 540
    aput v2, v0, v1
    :try_end_2c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2c .. :try_end_2c} :catch_2c

    .line 541
    .line 542
    :catch_2c
    :try_start_2d
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 543
    .line 544
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->getZoomScale:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 548
    move-result v1

    .line 549
    .line 550
    const/16 v2, 0x2e

    .line 551
    .line 552
    aput v2, v0, v1
    :try_end_2d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2d .. :try_end_2d} :catch_2d

    .line 553
    .line 554
    :catch_2d
    :try_start_2e
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 555
    .line 556
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->getSelectedText:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 560
    move-result v1

    .line 561
    .line 562
    const/16 v2, 0x2f

    .line 563
    .line 564
    aput v2, v0, v1
    :try_end_2e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2e .. :try_end_2e} :catch_2e

    .line 565
    .line 566
    :catch_2e
    :try_start_2f
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 567
    .line 568
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->getHitTestResult:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 572
    move-result v1

    .line 573
    .line 574
    const/16 v2, 0x30

    .line 575
    .line 576
    aput v2, v0, v1
    :try_end_2f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2f .. :try_end_2f} :catch_2f

    .line 577
    .line 578
    :catch_2f
    :try_start_30
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 579
    .line 580
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->pageDown:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 584
    move-result v1

    .line 585
    .line 586
    const/16 v2, 0x31

    .line 587
    .line 588
    aput v2, v0, v1
    :try_end_30
    .catch Ljava/lang/NoSuchFieldError; {:try_start_30 .. :try_end_30} :catch_30

    .line 589
    .line 590
    :catch_30
    :try_start_31
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 591
    .line 592
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->pageUp:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 596
    move-result v1

    .line 597
    .line 598
    const/16 v2, 0x32

    .line 599
    .line 600
    aput v2, v0, v1
    :try_end_31
    .catch Ljava/lang/NoSuchFieldError; {:try_start_31 .. :try_end_31} :catch_31

    .line 601
    .line 602
    :catch_31
    :try_start_32
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 603
    .line 604
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->saveWebArchive:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 608
    move-result v1

    .line 609
    .line 610
    const/16 v2, 0x33

    .line 611
    .line 612
    aput v2, v0, v1
    :try_end_32
    .catch Ljava/lang/NoSuchFieldError; {:try_start_32 .. :try_end_32} :catch_32

    .line 613
    .line 614
    :catch_32
    :try_start_33
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 615
    .line 616
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->zoomIn:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 620
    move-result v1

    .line 621
    .line 622
    const/16 v2, 0x34

    .line 623
    .line 624
    aput v2, v0, v1
    :try_end_33
    .catch Ljava/lang/NoSuchFieldError; {:try_start_33 .. :try_end_33} :catch_33

    .line 625
    .line 626
    :catch_33
    :try_start_34
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 627
    .line 628
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->zoomOut:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 632
    move-result v1

    .line 633
    .line 634
    const/16 v2, 0x35

    .line 635
    .line 636
    aput v2, v0, v1
    :try_end_34
    .catch Ljava/lang/NoSuchFieldError; {:try_start_34 .. :try_end_34} :catch_34

    .line 637
    .line 638
    :catch_34
    :try_start_35
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 639
    .line 640
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->clearFocus:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 644
    move-result v1

    .line 645
    .line 646
    const/16 v2, 0x36

    .line 647
    .line 648
    aput v2, v0, v1
    :try_end_35
    .catch Ljava/lang/NoSuchFieldError; {:try_start_35 .. :try_end_35} :catch_35

    .line 649
    .line 650
    :catch_35
    :try_start_36
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 651
    .line 652
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->setContextMenu:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 656
    move-result v1

    .line 657
    .line 658
    const/16 v2, 0x37

    .line 659
    .line 660
    aput v2, v0, v1
    :try_end_36
    .catch Ljava/lang/NoSuchFieldError; {:try_start_36 .. :try_end_36} :catch_36

    .line 661
    .line 662
    :catch_36
    :try_start_37
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 663
    .line 664
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->requestFocusNodeHref:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 668
    move-result v1

    .line 669
    .line 670
    const/16 v2, 0x38

    .line 671
    .line 672
    aput v2, v0, v1
    :try_end_37
    .catch Ljava/lang/NoSuchFieldError; {:try_start_37 .. :try_end_37} :catch_37

    .line 673
    .line 674
    :catch_37
    :try_start_38
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 675
    .line 676
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->requestImageRef:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 677
    .line 678
    .line 679
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 680
    move-result v1

    .line 681
    .line 682
    const/16 v2, 0x39

    .line 683
    .line 684
    aput v2, v0, v1
    :try_end_38
    .catch Ljava/lang/NoSuchFieldError; {:try_start_38 .. :try_end_38} :catch_38

    .line 685
    .line 686
    :catch_38
    :try_start_39
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 687
    .line 688
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->getScrollX:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 692
    move-result v1

    .line 693
    .line 694
    const/16 v2, 0x3a

    .line 695
    .line 696
    aput v2, v0, v1
    :try_end_39
    .catch Ljava/lang/NoSuchFieldError; {:try_start_39 .. :try_end_39} :catch_39

    .line 697
    .line 698
    :catch_39
    :try_start_3a
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 699
    .line 700
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->getScrollY:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 704
    move-result v1

    .line 705
    .line 706
    const/16 v2, 0x3b

    .line 707
    .line 708
    aput v2, v0, v1
    :try_end_3a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3a .. :try_end_3a} :catch_3a

    .line 709
    .line 710
    :catch_3a
    :try_start_3b
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 711
    .line 712
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->getCertificate:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 716
    move-result v1

    .line 717
    .line 718
    const/16 v2, 0x3c

    .line 719
    .line 720
    aput v2, v0, v1
    :try_end_3b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3b .. :try_end_3b} :catch_3b

    .line 721
    .line 722
    :catch_3b
    :try_start_3c
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 723
    .line 724
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->clearHistory:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 728
    move-result v1

    .line 729
    .line 730
    const/16 v2, 0x3d

    .line 731
    .line 732
    aput v2, v0, v1
    :try_end_3c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3c .. :try_end_3c} :catch_3c

    .line 733
    .line 734
    :catch_3c
    :try_start_3d
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 735
    .line 736
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->addUserScript:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 740
    move-result v1

    .line 741
    .line 742
    const/16 v2, 0x3e

    .line 743
    .line 744
    aput v2, v0, v1
    :try_end_3d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3d .. :try_end_3d} :catch_3d

    .line 745
    .line 746
    :catch_3d
    :try_start_3e
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 747
    .line 748
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->removeUserScript:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 749
    .line 750
    .line 751
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 752
    move-result v1

    .line 753
    .line 754
    const/16 v2, 0x3f

    .line 755
    .line 756
    aput v2, v0, v1
    :try_end_3e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3e .. :try_end_3e} :catch_3e

    .line 757
    .line 758
    :catch_3e
    :try_start_3f
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 759
    .line 760
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->removeUserScriptsByGroupName:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 761
    .line 762
    .line 763
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 764
    move-result v1

    .line 765
    .line 766
    const/16 v2, 0x40

    .line 767
    .line 768
    aput v2, v0, v1
    :try_end_3f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3f .. :try_end_3f} :catch_3f

    .line 769
    .line 770
    :catch_3f
    :try_start_40
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 771
    .line 772
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->removeAllUserScripts:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 776
    move-result v1

    .line 777
    .line 778
    const/16 v2, 0x41

    .line 779
    .line 780
    aput v2, v0, v1
    :try_end_40
    .catch Ljava/lang/NoSuchFieldError; {:try_start_40 .. :try_end_40} :catch_40

    .line 781
    .line 782
    :catch_40
    :try_start_41
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 783
    .line 784
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->callAsyncJavaScript:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 788
    move-result v1

    .line 789
    .line 790
    const/16 v2, 0x42

    .line 791
    .line 792
    aput v2, v0, v1
    :try_end_41
    .catch Ljava/lang/NoSuchFieldError; {:try_start_41 .. :try_end_41} :catch_41

    .line 793
    .line 794
    :catch_41
    :try_start_42
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 795
    .line 796
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->isSecureContext:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 800
    move-result v1

    .line 801
    .line 802
    const/16 v2, 0x43

    .line 803
    .line 804
    aput v2, v0, v1
    :try_end_42
    .catch Ljava/lang/NoSuchFieldError; {:try_start_42 .. :try_end_42} :catch_42

    .line 805
    .line 806
    :catch_42
    :try_start_43
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 807
    .line 808
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->createWebMessageChannel:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 809
    .line 810
    .line 811
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 812
    move-result v1

    .line 813
    .line 814
    const/16 v2, 0x44

    .line 815
    .line 816
    aput v2, v0, v1
    :try_end_43
    .catch Ljava/lang/NoSuchFieldError; {:try_start_43 .. :try_end_43} :catch_43

    .line 817
    .line 818
    :catch_43
    :try_start_44
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 819
    .line 820
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->postWebMessage:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 821
    .line 822
    .line 823
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 824
    move-result v1

    .line 825
    .line 826
    const/16 v2, 0x45

    .line 827
    .line 828
    aput v2, v0, v1
    :try_end_44
    .catch Ljava/lang/NoSuchFieldError; {:try_start_44 .. :try_end_44} :catch_44

    .line 829
    .line 830
    :catch_44
    :try_start_45
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 831
    .line 832
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->addWebMessageListener:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 836
    move-result v1

    .line 837
    .line 838
    const/16 v2, 0x46

    .line 839
    .line 840
    aput v2, v0, v1
    :try_end_45
    .catch Ljava/lang/NoSuchFieldError; {:try_start_45 .. :try_end_45} :catch_45

    .line 841
    .line 842
    :catch_45
    :try_start_46
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 843
    .line 844
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->canScrollVertically:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 845
    .line 846
    .line 847
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 848
    move-result v1

    .line 849
    .line 850
    const/16 v2, 0x47

    .line 851
    .line 852
    aput v2, v0, v1
    :try_end_46
    .catch Ljava/lang/NoSuchFieldError; {:try_start_46 .. :try_end_46} :catch_46

    .line 853
    .line 854
    :catch_46
    :try_start_47
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 855
    .line 856
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->canScrollHorizontally:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 857
    .line 858
    .line 859
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 860
    move-result v1

    .line 861
    .line 862
    const/16 v2, 0x48

    .line 863
    .line 864
    aput v2, v0, v1
    :try_end_47
    .catch Ljava/lang/NoSuchFieldError; {:try_start_47 .. :try_end_47} :catch_47

    .line 865
    .line 866
    :catch_47
    :try_start_48
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 867
    .line 868
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->isInFullscreen:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 869
    .line 870
    .line 871
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 872
    move-result v1

    .line 873
    .line 874
    const/16 v2, 0x49

    .line 875
    .line 876
    aput v2, v0, v1
    :try_end_48
    .catch Ljava/lang/NoSuchFieldError; {:try_start_48 .. :try_end_48} :catch_48

    .line 877
    .line 878
    :catch_48
    :try_start_49
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$8;->$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods:[I

    .line 879
    .line 880
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;->clearFormData:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegateMethods;

    .line 881
    .line 882
    .line 883
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 884
    move-result v1

    .line 885
    .line 886
    const/16 v2, 0x4a

    .line 887
    .line 888
    aput v2, v0, v1
    :try_end_49
    .catch Ljava/lang/NoSuchFieldError; {:try_start_49 .. :try_end_49} :catch_49

    .line 889
    :catch_49
    return-void
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method
