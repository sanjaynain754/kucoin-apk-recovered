.class public final Lcom/kubi/sdk/startup/StartupRegister;
.super Ljava/lang/Object;
.source "StartupRegister.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/kubi/sdk/startup/StartupRegister;",
        "",
        "()V",
        "injectStartupTask",
        "",
        "list",
        "Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;",
        "Startup_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
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
.end method


# virtual methods
.method public final injectStartupTask(Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;)V
    .locals 19
    .param p1    # Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v2, Lcom/kubi/sdk/site/startup/SiteFetchStartupTask;

    .line 3
    .line 4
    .line 5
    invoke-direct {v2}, Lcom/kubi/sdk/site/startup/SiteFetchStartupTask;-><init>()V

    .line 6
    .line 7
    sget-object v6, Lcom/kubi/sdk/startup/StartupStepType;->MainPage:Lcom/kubi/sdk/startup/StartupStepType;

    .line 8
    .line 9
    sget-object v11, Lcom/kubi/sdk/startup/StartupThreadType;->Async:Lcom/kubi/sdk/startup/StartupThreadType;

    .line 10
    const/4 v5, 0x0

    .line 11
    .line 12
    const-string v1, "site"

    .line 13
    .line 14
    move-object/from16 v0, p1

    .line 15
    move-object v3, v6

    .line 16
    move-object v4, v11

    .line 17
    .line 18
    .line 19
    invoke-interface/range {v0 .. v5}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 20
    .line 21
    new-instance v14, Lcom/kubi/sdk/site/startup/SiteStartupTask;

    .line 22
    .line 23
    .line 24
    invoke-direct {v14}, Lcom/kubi/sdk/site/startup/SiteStartupTask;-><init>()V

    .line 25
    .line 26
    sget-object v15, Lcom/kubi/sdk/startup/StartupStepType;->FirstPage:Lcom/kubi/sdk/startup/StartupStepType;

    .line 27
    .line 28
    sget-object v16, Lcom/kubi/sdk/startup/StartupThreadType;->Await:Lcom/kubi/sdk/startup/StartupThreadType;

    .line 29
    .line 30
    const/16 v17, 0x0

    .line 31
    .line 32
    const-string v13, "site"

    .line 33
    .line 34
    move-object/from16 v12, p1

    .line 35
    .line 36
    .line 37
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 38
    move-object v0, v15

    .line 39
    .line 40
    new-instance v14, Lcom/kubi/app/bizcontrol/BizControlStartUpTask;

    .line 41
    .line 42
    .line 43
    invoke-direct {v14}, Lcom/kubi/app/bizcontrol/BizControlStartUpTask;-><init>()V

    .line 44
    .line 45
    sget-object v15, Lcom/kubi/sdk/startup/StartupStepType;->PreFirstPage:Lcom/kubi/sdk/startup/StartupStepType;

    .line 46
    .line 47
    const-string v13, "biz_control"

    .line 48
    .line 49
    .line 50
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 51
    .line 52
    move-object/from16 v1, v16

    .line 53
    .line 54
    new-instance v14, Lcom/kubi/kucoin/startup/NetworkToggleStartupTask;

    .line 55
    .line 56
    .line 57
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/NetworkToggleStartupTask;-><init>()V

    .line 58
    .line 59
    sget-object v16, Lcom/kubi/sdk/startup/StartupThreadType;->Main:Lcom/kubi/sdk/startup/StartupThreadType;

    .line 60
    .line 61
    const-string v13, "network-toggle"

    .line 62
    .line 63
    .line 64
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 65
    move-object v2, v15

    .line 66
    .line 67
    new-instance v9, Lcom/kubi/sdk/site/startup/SiteConfigFetchStartUpTask;

    .line 68
    .line 69
    .line 70
    invoke-direct {v9}, Lcom/kubi/sdk/site/startup/SiteConfigFetchStartUpTask;-><init>()V

    .line 71
    .line 72
    sget-object v15, Lcom/kubi/sdk/startup/StartupStepType;->Application:Lcom/kubi/sdk/startup/StartupStepType;

    .line 73
    const/4 v12, 0x0

    .line 74
    .line 75
    const-string v8, "site_config_fetch"

    .line 76
    .line 77
    move-object/from16 v7, p1

    .line 78
    move-object v10, v15

    .line 79
    .line 80
    .line 81
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 82
    move-object v3, v10

    .line 83
    .line 84
    new-instance v9, Lcom/kubi/sdk/site/startup/SiteConfigFetchSupportTask;

    .line 85
    .line 86
    .line 87
    invoke-direct {v9}, Lcom/kubi/sdk/site/startup/SiteConfigFetchSupportTask;-><init>()V

    .line 88
    .line 89
    const-string v8, "site_support_config_fetch"

    .line 90
    move-object v10, v0

    .line 91
    .line 92
    .line 93
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 94
    .line 95
    new-instance v14, Lcom/kubi/sdk/site/startup/SiteInitStartupTask;

    .line 96
    .line 97
    .line 98
    invoke-direct {v14}, Lcom/kubi/sdk/site/startup/SiteInitStartupTask;-><init>()V

    .line 99
    .line 100
    sget-object v15, Lcom/kubi/sdk/startup/StartupStepType;->Setup:Lcom/kubi/sdk/startup/StartupStepType;

    .line 101
    .line 102
    const-string v13, "site_init"

    .line 103
    .line 104
    move-object/from16 v12, p1

    .line 105
    .line 106
    .line 107
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 108
    .line 109
    new-instance v14, Lcom/kubi/kucoin/startup/AppConfigStartupTask;

    .line 110
    .line 111
    .line 112
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/AppConfigStartupTask;-><init>()V

    .line 113
    .line 114
    const-string v13, "app_config"

    .line 115
    .line 116
    .line 117
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 118
    move-object v0, v15

    .line 119
    .line 120
    new-instance v14, Lcom/kubi/kucoin/startup/MetricsStartupTask;

    .line 121
    .line 122
    .line 123
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/MetricsStartupTask;-><init>()V

    .line 124
    .line 125
    const-string v13, "metrics"

    .line 126
    move-object v15, v10

    .line 127
    .line 128
    .line 129
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 130
    .line 131
    new-instance v14, Lcom/kubi/kucoin/startup/MonitorStartupTask;

    .line 132
    .line 133
    .line 134
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/MonitorStartupTask;-><init>()V

    .line 135
    .line 136
    const-string v13, "monitor"

    .line 137
    move-object v15, v0

    .line 138
    .line 139
    .line 140
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 141
    .line 142
    new-instance v14, Lcom/kubi/kucoin/startup/WebSocketStartupTask;

    .line 143
    .line 144
    .line 145
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/WebSocketStartupTask;-><init>()V

    .line 146
    .line 147
    const-string v13, "websocket"

    .line 148
    move-object v15, v2

    .line 149
    .line 150
    .line 151
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 152
    .line 153
    new-instance v14, Lcom/kubi/kucoin/startup/LoggerStartupTask;

    .line 154
    .line 155
    .line 156
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/LoggerStartupTask;-><init>()V

    .line 157
    .line 158
    const-string v13, "logger"

    .line 159
    move-object v15, v0

    .line 160
    .line 161
    .line 162
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 163
    .line 164
    new-instance v14, Lcom/kubi/kumex/BKumexWebSocketStartUpTask;

    .line 165
    .line 166
    .line 167
    invoke-direct {v14}, Lcom/kubi/kumex/BKumexWebSocketStartUpTask;-><init>()V

    .line 168
    .line 169
    const-string v13, "b_kumex_websocket"

    .line 170
    move-object v15, v2

    .line 171
    .line 172
    .line 173
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 174
    .line 175
    move-object/from16 v7, v16

    .line 176
    .line 177
    new-instance v14, Lcom/kubi/kucoin/startup/CacheDataManagerStartupTask;

    .line 178
    .line 179
    .line 180
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/CacheDataManagerStartupTask;-><init>()V

    .line 181
    .line 182
    const-string v13, "cache_data"

    .line 183
    .line 184
    move-object/from16 v16, v1

    .line 185
    move-object v15, v10

    .line 186
    .line 187
    .line 188
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 189
    .line 190
    new-instance v14, Lcom/kubi/kucoin/startup/RouterStartupTask;

    .line 191
    .line 192
    .line 193
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/RouterStartupTask;-><init>()V

    .line 194
    .line 195
    const-string v13, "router"

    .line 196
    move-object v15, v0

    .line 197
    .line 198
    move-object/from16 v16, v7

    .line 199
    .line 200
    .line 201
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 202
    .line 203
    new-instance v14, Lcom/kubi/kucoin/startup/RemoteConfigStartupTask;

    .line 204
    .line 205
    .line 206
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/RemoteConfigStartupTask;-><init>()V

    .line 207
    .line 208
    const-string v13, "remote_config"

    .line 209
    .line 210
    .line 211
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 212
    .line 213
    new-instance v14, Lcom/kubi/kucoin/startup/HostStartupTask;

    .line 214
    .line 215
    .line 216
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/HostStartupTask;-><init>()V

    .line 217
    .line 218
    const-string v13, "host"

    .line 219
    .line 220
    .line 221
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 222
    .line 223
    new-instance v14, Lcom/kubi/kucoin/startup/HttpDnsStartupTask;

    .line 224
    .line 225
    .line 226
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/HttpDnsStartupTask;-><init>()V

    .line 227
    .line 228
    const-string v13, "httpdns"

    .line 229
    .line 230
    .line 231
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 232
    .line 233
    new-instance v9, Lcom/kubi/operation/lib/startup/OperationStartupTask;

    .line 234
    .line 235
    .line 236
    invoke-direct {v9}, Lcom/kubi/operation/lib/startup/OperationStartupTask;-><init>()V

    .line 237
    const/4 v12, 0x0

    .line 238
    .line 239
    const-string v8, "operation_init"

    .line 240
    .line 241
    move-object/from16 v7, p1

    .line 242
    .line 243
    .line 244
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 245
    .line 246
    new-instance v14, Lcom/kubi/kucoin/startup/MonitorAppStatusStartupTask;

    .line 247
    .line 248
    .line 249
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/MonitorAppStatusStartupTask;-><init>()V

    .line 250
    .line 251
    const-string v13, "monitor_app_status"

    .line 252
    .line 253
    move-object/from16 v12, p1

    .line 254
    move-object v15, v3

    .line 255
    .line 256
    .line 257
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 258
    .line 259
    move-object/from16 v7, v16

    .line 260
    .line 261
    new-instance v14, Lcom/kubi/kucoin/startup/RealTimeReporterStartupTask;

    .line 262
    .line 263
    .line 264
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/RealTimeReporterStartupTask;-><init>()V

    .line 265
    .line 266
    const-string v13, "logger_real_time"

    .line 267
    .line 268
    move-object/from16 v16, v1

    .line 269
    move-object v15, v10

    .line 270
    .line 271
    .line 272
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 273
    .line 274
    new-instance v14, Lcom/kubi/kucoin/startup/RxJavaStartupTask;

    .line 275
    .line 276
    .line 277
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/RxJavaStartupTask;-><init>()V

    .line 278
    .line 279
    const-string v13, "rxjava"

    .line 280
    move-object v15, v3

    .line 281
    .line 282
    move-object/from16 v16, v7

    .line 283
    .line 284
    .line 285
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 286
    .line 287
    new-instance v9, Lcom/kubi/mine/lib/startup/LanguageStartupTask;

    .line 288
    .line 289
    .line 290
    invoke-direct {v9}, Lcom/kubi/mine/lib/startup/LanguageStartupTask;-><init>()V

    .line 291
    const/4 v12, 0x0

    .line 292
    .line 293
    const-string v8, "language"

    .line 294
    .line 295
    move-object/from16 v7, p1

    .line 296
    .line 297
    .line 298
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 299
    move-object v3, v10

    .line 300
    .line 301
    new-instance v9, Lcom/kubi/mine/lib/startup/RouterCheckUpgradeTask;

    .line 302
    .line 303
    .line 304
    invoke-direct {v9}, Lcom/kubi/mine/lib/startup/RouterCheckUpgradeTask;-><init>()V

    .line 305
    .line 306
    const-string v8, "routerCheckUpgrade"

    .line 307
    move-object v10, v15

    .line 308
    .line 309
    .line 310
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 311
    .line 312
    new-instance v14, Lcom/kubi/redpackage/startup/RedpackageMainStartupTask;

    .line 313
    .line 314
    .line 315
    invoke-direct {v14}, Lcom/kubi/redpackage/startup/RedpackageMainStartupTask;-><init>()V

    .line 316
    .line 317
    const-string v13, "redpackage_main"

    .line 318
    .line 319
    move-object/from16 v12, p1

    .line 320
    .line 321
    .line 322
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 323
    .line 324
    move-object/from16 v4, v16

    .line 325
    .line 326
    new-instance v9, Lcom/kubi/experiment/core/ExperimentStartupTask;

    .line 327
    .line 328
    .line 329
    invoke-direct {v9}, Lcom/kubi/experiment/core/ExperimentStartupTask;-><init>()V

    .line 330
    const/4 v12, 0x0

    .line 331
    .line 332
    const-string v8, "l_experiment"

    .line 333
    move-object v10, v2

    .line 334
    .line 335
    .line 336
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 337
    .line 338
    new-instance v14, Lcom/kubi/kweb/startup/KWebStartupTask;

    .line 339
    .line 340
    .line 341
    invoke-direct {v14}, Lcom/kubi/kweb/startup/KWebStartupTask;-><init>()V

    .line 342
    .line 343
    const-string v13, "k_web"

    .line 344
    .line 345
    move-object/from16 v12, p1

    .line 346
    .line 347
    move-object/from16 v16, v1

    .line 348
    .line 349
    .line 350
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 351
    .line 352
    new-instance v14, Lcom/kubi/user/startup/FingerprintStartupTask;

    .line 353
    .line 354
    .line 355
    invoke-direct {v14}, Lcom/kubi/user/startup/FingerprintStartupTask;-><init>()V

    .line 356
    .line 357
    const-string v13, "fingerprint"

    .line 358
    .line 359
    move-object/from16 v16, v4

    .line 360
    .line 361
    .line 362
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 363
    move-object v4, v15

    .line 364
    .line 365
    new-instance v9, Lcom/kubi/fallback/FallbackStartupTask;

    .line 366
    .line 367
    .line 368
    invoke-direct {v9}, Lcom/kubi/fallback/FallbackStartupTask;-><init>()V

    .line 369
    const/4 v12, 0x0

    .line 370
    .line 371
    const-string v8, "fallback"

    .line 372
    move-object v10, v3

    .line 373
    .line 374
    .line 375
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 376
    .line 377
    new-instance v14, Lcom/kubi/notice/lib/startup/NoticeStartupTask;

    .line 378
    .line 379
    .line 380
    invoke-direct {v14}, Lcom/kubi/notice/lib/startup/NoticeStartupTask;-><init>()V

    .line 381
    .line 382
    const-string v13, "notice"

    .line 383
    .line 384
    move-object/from16 v12, p1

    .line 385
    move-object v15, v10

    .line 386
    .line 387
    .line 388
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 389
    .line 390
    new-instance v9, Lcom/kubi/safe/lib/startup/NewFingerprintStartupTask;

    .line 391
    .line 392
    .line 393
    invoke-direct {v9}, Lcom/kubi/safe/lib/startup/NewFingerprintStartupTask;-><init>()V

    .line 394
    const/4 v12, 0x0

    .line 395
    .line 396
    const-string v8, "newfingerprint"

    .line 397
    move-object v10, v2

    .line 398
    .line 399
    .line 400
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 401
    .line 402
    new-instance v14, Lcom/kubi/unify/UnifyAccountStartupTask;

    .line 403
    .line 404
    .line 405
    invoke-direct {v14}, Lcom/kubi/unify/UnifyAccountStartupTask;-><init>()V

    .line 406
    .line 407
    const-string v13, "unifyAccount"

    .line 408
    .line 409
    move-object/from16 v12, p1

    .line 410
    .line 411
    .line 412
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 413
    move-object v3, v15

    .line 414
    .line 415
    move-object/from16 v7, v16

    .line 416
    .line 417
    new-instance v14, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;

    .line 418
    .line 419
    .line 420
    invoke-direct {v14}, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;-><init>()V

    .line 421
    .line 422
    const-string v13, "k_web_widget"

    .line 423
    .line 424
    move-object/from16 v16, v1

    .line 425
    move-object v15, v4

    .line 426
    .line 427
    .line 428
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 429
    .line 430
    new-instance v14, Lcom/kubi/copytrading/startup/CopyTradingStartupTask;

    .line 431
    .line 432
    .line 433
    invoke-direct {v14}, Lcom/kubi/copytrading/startup/CopyTradingStartupTask;-><init>()V

    .line 434
    .line 435
    const-string v13, "copyTrading"

    .line 436
    move-object v15, v3

    .line 437
    .line 438
    move-object/from16 v16, v7

    .line 439
    .line 440
    .line 441
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 442
    .line 443
    new-instance v14, Lcom/kubi/kucoin/startup/NetworkStartupTask;

    .line 444
    .line 445
    .line 446
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/NetworkStartupTask;-><init>()V

    .line 447
    .line 448
    const-string v13, "network"

    .line 449
    move-object v15, v0

    .line 450
    .line 451
    .line 452
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 453
    .line 454
    new-instance v14, Lcom/kubi/sdk/timpush/startup/TimPushStartupTask;

    .line 455
    .line 456
    .line 457
    invoke-direct {v14}, Lcom/kubi/sdk/timpush/startup/TimPushStartupTask;-><init>()V

    .line 458
    .line 459
    const-string v13, "timpush-config"

    .line 460
    move-object v15, v4

    .line 461
    .line 462
    .line 463
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 464
    .line 465
    new-instance v14, Lcom/kubi/kucoin/startup/LocationAppStatusStartupTask;

    .line 466
    .line 467
    .line 468
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/LocationAppStatusStartupTask;-><init>()V

    .line 469
    .line 470
    const-string v13, "location_app_status"

    .line 471
    .line 472
    .line 473
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 474
    .line 475
    new-instance v14, Lcom/kubi/kucoin/startup/SocketAppStatusStartupTask;

    .line 476
    .line 477
    .line 478
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/SocketAppStatusStartupTask;-><init>()V

    .line 479
    .line 480
    const-string v13, "socket_app_status"

    .line 481
    .line 482
    .line 483
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 484
    move-object v2, v15

    .line 485
    .line 486
    new-instance v14, Lcom/kubi/sdk/function/language/startup/MultiLanguageStartupTask;

    .line 487
    .line 488
    .line 489
    invoke-direct {v14}, Lcom/kubi/sdk/function/language/startup/MultiLanguageStartupTask;-><init>()V

    .line 490
    .line 491
    const-string v13, "multi_language"

    .line 492
    move-object v15, v0

    .line 493
    .line 494
    .line 495
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 496
    .line 497
    new-instance v14, Lcom/kubi/data/startup/DataAppStatusStartupTask;

    .line 498
    .line 499
    .line 500
    invoke-direct {v14}, Lcom/kubi/data/startup/DataAppStatusStartupTask;-><init>()V

    .line 501
    .line 502
    const-string v13, "app_status"

    .line 503
    move-object v15, v3

    .line 504
    .line 505
    .line 506
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 507
    move-object v9, v15

    .line 508
    .line 509
    new-instance v5, Lcom/kubi/rn/startup/RnAccountStateStartupTask;

    .line 510
    .line 511
    .line 512
    invoke-direct {v5}, Lcom/kubi/rn/startup/RnAccountStateStartupTask;-><init>()V

    .line 513
    const/4 v8, 0x0

    .line 514
    .line 515
    const-string v4, "account_state_task"

    .line 516
    .line 517
    move-object/from16 v3, p1

    .line 518
    .line 519
    .line 520
    invoke-interface/range {v3 .. v8}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 521
    .line 522
    new-instance v5, Lcom/kubi/rn/startup/TabBarVisibilityStartupTask;

    .line 523
    .line 524
    .line 525
    invoke-direct {v5}, Lcom/kubi/rn/startup/TabBarVisibilityStartupTask;-><init>()V

    .line 526
    .line 527
    const-string v4, "tabbar_visibility_task"

    .line 528
    .line 529
    .line 530
    invoke-interface/range {v3 .. v8}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 531
    .line 532
    new-instance v14, Lcom/kubi/kucoin/startup/NetworkEncryptionStartupTask;

    .line 533
    .line 534
    .line 535
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/NetworkEncryptionStartupTask;-><init>()V

    .line 536
    .line 537
    const-string v13, "network_encryption"

    .line 538
    move-object v15, v0

    .line 539
    .line 540
    .line 541
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 542
    .line 543
    new-instance v14, Lcom/kubi/HomeStartupTask;

    .line 544
    .line 545
    .line 546
    invoke-direct {v14}, Lcom/kubi/HomeStartupTask;-><init>()V

    .line 547
    .line 548
    const-string v13, "home"

    .line 549
    .line 550
    move-object/from16 v16, v1

    .line 551
    move-object v15, v9

    .line 552
    .line 553
    .line 554
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 555
    .line 556
    new-instance v14, Lcom/kubi/lite/startup/LiteStartupTask;

    .line 557
    .line 558
    .line 559
    invoke-direct {v14}, Lcom/kubi/lite/startup/LiteStartupTask;-><init>()V

    .line 560
    .line 561
    const-string v13, "lite"

    .line 562
    .line 563
    move-object/from16 v16, v7

    .line 564
    .line 565
    .line 566
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 567
    .line 568
    new-instance v14, Lcom/kubi/wallet/startup/WalletStartupTask;

    .line 569
    .line 570
    .line 571
    invoke-direct {v14}, Lcom/kubi/wallet/startup/WalletStartupTask;-><init>()V

    .line 572
    .line 573
    const-string v13, "wallet"

    .line 574
    .line 575
    .line 576
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 577
    move-object v3, v15

    .line 578
    .line 579
    new-instance v9, Lcom/kubi/lite/tab/startup/PreFetchTabConfigStartupTask;

    .line 580
    .line 581
    .line 582
    invoke-direct {v9}, Lcom/kubi/lite/tab/startup/PreFetchTabConfigStartupTask;-><init>()V

    .line 583
    const/4 v12, 0x0

    .line 584
    .line 585
    const-string v8, "pre-fetch"

    .line 586
    .line 587
    move-object/from16 v7, p1

    .line 588
    .line 589
    .line 590
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 591
    .line 592
    new-instance v14, Lcom/kubi/kucoin/startup/EmulatorHelperStartupTask;

    .line 593
    .line 594
    .line 595
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/EmulatorHelperStartupTask;-><init>()V

    .line 596
    .line 597
    const-string v13, "emulator_helper"

    .line 598
    .line 599
    move-object/from16 v12, p1

    .line 600
    move-object v15, v2

    .line 601
    .line 602
    .line 603
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 604
    move-object v4, v15

    .line 605
    .line 606
    new-instance v14, Lcom/kubi/kucoin/startup/AppTrackerClsStartupTask;

    .line 607
    .line 608
    .line 609
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/AppTrackerClsStartupTask;-><init>()V

    .line 610
    .line 611
    const-string v13, "app_tracker_cls"

    .line 612
    move-object v15, v10

    .line 613
    .line 614
    .line 615
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 616
    move-object v2, v15

    .line 617
    .line 618
    new-instance v14, Lcom/kubi/kucoin/startup/ClosePDialogStartupTask;

    .line 619
    .line 620
    .line 621
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/ClosePDialogStartupTask;-><init>()V

    .line 622
    .line 623
    const-string v13, "close_p_Dialog"

    .line 624
    move-object v15, v3

    .line 625
    .line 626
    .line 627
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 628
    .line 629
    new-instance v9, Lcom/kubi/kucoin/startup/DataInitManagerFetchStartupTask;

    .line 630
    .line 631
    .line 632
    invoke-direct {v9}, Lcom/kubi/kucoin/startup/DataInitManagerFetchStartupTask;-><init>()V

    .line 633
    const/4 v12, 0x0

    .line 634
    .line 635
    const-string v8, "data_init_manager_fetch"

    .line 636
    move-object v10, v15

    .line 637
    .line 638
    .line 639
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 640
    .line 641
    new-instance v14, Lcom/kubi/kucoin/startup/DataInitManagerStartupTask;

    .line 642
    .line 643
    .line 644
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/DataInitManagerStartupTask;-><init>()V

    .line 645
    .line 646
    const-string v13, "data_init_manager"

    .line 647
    .line 648
    move-object/from16 v12, p1

    .line 649
    move-object v15, v4

    .line 650
    .line 651
    .line 652
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 653
    .line 654
    new-instance v14, Lcom/kubi/kucoin/startup/EdgeToEdgeStartupTask;

    .line 655
    .line 656
    .line 657
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/EdgeToEdgeStartupTask;-><init>()V

    .line 658
    .line 659
    const-string v13, "edge_to_edge"

    .line 660
    .line 661
    .line 662
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 663
    .line 664
    new-instance v9, Lcom/kubi/kucoin/startup/KunlunReportStartupTask;

    .line 665
    .line 666
    .line 667
    invoke-direct {v9}, Lcom/kubi/kucoin/startup/KunlunReportStartupTask;-><init>()V

    .line 668
    const/4 v12, 0x0

    .line 669
    .line 670
    const-string v8, "Kunlun-report"

    .line 671
    .line 672
    .line 673
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 674
    .line 675
    new-instance v14, Lcom/kubi/kucoin/startup/KunlunStartupTask;

    .line 676
    .line 677
    .line 678
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/KunlunStartupTask;-><init>()V

    .line 679
    .line 680
    const-string v13, "Kunlun"

    .line 681
    .line 682
    move-object/from16 v12, p1

    .line 683
    .line 684
    .line 685
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 686
    .line 687
    new-instance v14, Lcom/kubi/kucoin/startup/LibrarySetStartupTask;

    .line 688
    .line 689
    .line 690
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/LibrarySetStartupTask;-><init>()V

    .line 691
    .line 692
    const-string v13, "library_setup"

    .line 693
    .line 694
    .line 695
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 696
    .line 697
    move-object/from16 v7, v16

    .line 698
    .line 699
    new-instance v14, Lcom/kubi/kucoin/startup/MonitorConfigStartupTask;

    .line 700
    .line 701
    .line 702
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/MonitorConfigStartupTask;-><init>()V

    .line 703
    .line 704
    const-string v13, "monitor_config"

    .line 705
    .line 706
    move-object/from16 v16, v1

    .line 707
    move-object v15, v10

    .line 708
    .line 709
    .line 710
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 711
    .line 712
    new-instance v14, Lcom/kubi/kucoin/startup/SensorsABTestStartupTask;

    .line 713
    .line 714
    .line 715
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/SensorsABTestStartupTask;-><init>()V

    .line 716
    .line 717
    const-string v13, "sensors_abtest"

    .line 718
    move-object v15, v2

    .line 719
    .line 720
    .line 721
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 722
    .line 723
    new-instance v14, Lcom/kubi/kucoin/startup/SensorsStartupTask;

    .line 724
    .line 725
    .line 726
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/SensorsStartupTask;-><init>()V

    .line 727
    .line 728
    const-string v13, "sensors"

    .line 729
    move-object v15, v4

    .line 730
    .line 731
    move-object/from16 v16, v7

    .line 732
    .line 733
    .line 734
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 735
    .line 736
    move-object/from16 v0, v16

    .line 737
    .line 738
    new-instance v5, Lcom/kubi/kucoin/startup/ServerTimeSyncStartupTask;

    .line 739
    .line 740
    .line 741
    invoke-direct {v5}, Lcom/kubi/kucoin/startup/ServerTimeSyncStartupTask;-><init>()V

    .line 742
    const/4 v8, 0x0

    .line 743
    .line 744
    const-string v4, "server_time_sync"

    .line 745
    .line 746
    move-object/from16 v3, p1

    .line 747
    move-object v7, v11

    .line 748
    .line 749
    .line 750
    invoke-interface/range {v3 .. v8}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 751
    .line 752
    new-instance v14, Lcom/kubi/kucoin/startup/UIFontStartupTask;

    .line 753
    .line 754
    .line 755
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/UIFontStartupTask;-><init>()V

    .line 756
    .line 757
    const-string v13, "ui_font"

    .line 758
    .line 759
    move-object/from16 v16, v1

    .line 760
    .line 761
    .line 762
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 763
    .line 764
    new-instance v14, Lcom/kubi/kucoin/startup/UISetupStartupTask;

    .line 765
    .line 766
    .line 767
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/UISetupStartupTask;-><init>()V

    .line 768
    .line 769
    const-string v13, "ui_setup"

    .line 770
    .line 771
    move-object/from16 v16, v0

    .line 772
    .line 773
    .line 774
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 775
    move-object v0, v15

    .line 776
    .line 777
    new-instance v14, Lcom/kubi/payment/ForterStartupTask;

    .line 778
    .line 779
    .line 780
    invoke-direct {v14}, Lcom/kubi/payment/ForterStartupTask;-><init>()V

    .line 781
    .line 782
    const-string v13, "payment_forter"

    .line 783
    move-object v15, v10

    .line 784
    .line 785
    .line 786
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 787
    .line 788
    new-instance v5, Lcom/kubi/payment/WhiteListStartupTask;

    .line 789
    .line 790
    .line 791
    invoke-direct {v5}, Lcom/kubi/payment/WhiteListStartupTask;-><init>()V

    .line 792
    .line 793
    const-string v4, "payment_qr_code_white_list"

    .line 794
    .line 795
    .line 796
    invoke-interface/range {v3 .. v8}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 797
    .line 798
    new-instance v5, Lcom/kubi/base/startup/SymbolsOfflineTask;

    .line 799
    .line 800
    .line 801
    invoke-direct {v5}, Lcom/kubi/base/startup/SymbolsOfflineTask;-><init>()V

    .line 802
    .line 803
    const-string v4, "spot-symbols-offline-task"

    .line 804
    .line 805
    .line 806
    invoke-interface/range {v3 .. v8}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 807
    .line 808
    new-instance v5, Lcom/kubi/home/startup/HomeNavigationStartupTask;

    .line 809
    .line 810
    .line 811
    invoke-direct {v5}, Lcom/kubi/home/startup/HomeNavigationStartupTask;-><init>()V

    .line 812
    .line 813
    const-string v4, "home_navigation_startup_task"

    .line 814
    .line 815
    .line 816
    invoke-interface/range {v3 .. v8}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 817
    .line 818
    new-instance v9, Lcom/kubi/kweb/startup/KWebConfigUpdateStartupTask;

    .line 819
    .line 820
    .line 821
    invoke-direct {v9}, Lcom/kubi/kweb/startup/KWebConfigUpdateStartupTask;-><init>()V

    .line 822
    const/4 v12, 0x0

    .line 823
    .line 824
    const-string v8, "kweb_config_update"

    .line 825
    .line 826
    move-object/from16 v7, p1

    .line 827
    .line 828
    .line 829
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 830
    .line 831
    new-instance v14, Lcom/kubi/user/startup/BUserCenterMainStartupTask;

    .line 832
    .line 833
    .line 834
    invoke-direct {v14}, Lcom/kubi/user/startup/BUserCenterMainStartupTask;-><init>()V

    .line 835
    .line 836
    const-string v13, "b_user_center_main"

    .line 837
    .line 838
    move-object/from16 v12, p1

    .line 839
    move-object v15, v0

    .line 840
    .line 841
    .line 842
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 843
    .line 844
    move-object/from16 v18, v15

    .line 845
    .line 846
    move-object/from16 v0, v16

    .line 847
    .line 848
    new-instance v14, Lcom/kubi/user/startup/BUserCenterStartupTask;

    .line 849
    .line 850
    .line 851
    invoke-direct {v14}, Lcom/kubi/user/startup/BUserCenterStartupTask;-><init>()V

    .line 852
    .line 853
    const-string v13, "b_user_center"

    .line 854
    .line 855
    move-object/from16 v16, v1

    .line 856
    move-object v15, v10

    .line 857
    .line 858
    .line 859
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 860
    .line 861
    new-instance v9, Lcom/kubi/notice/lib/startup/NoticeAsyncStartupTask;

    .line 862
    .line 863
    .line 864
    invoke-direct {v9}, Lcom/kubi/notice/lib/startup/NoticeAsyncStartupTask;-><init>()V

    .line 865
    const/4 v12, 0x0

    .line 866
    .line 867
    const-string v8, "network_async"

    .line 868
    .line 869
    .line 870
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 871
    .line 872
    new-instance v5, Lcom/kubi/safe/lib/startup/GlobalCountdownTimerStartupTask;

    .line 873
    .line 874
    .line 875
    invoke-direct {v5}, Lcom/kubi/safe/lib/startup/GlobalCountdownTimerStartupTask;-><init>()V

    .line 876
    const/4 v8, 0x0

    .line 877
    .line 878
    const-string v4, "global-countdown-timer-startup-task"

    .line 879
    move-object v7, v11

    .line 880
    .line 881
    .line 882
    invoke-interface/range {v3 .. v8}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 883
    .line 884
    new-instance v5, Lcom/kubi/sdk/mode/startup/LiteConfigFetchStartupTask;

    .line 885
    .line 886
    .line 887
    invoke-direct {v5}, Lcom/kubi/sdk/mode/startup/LiteConfigFetchStartupTask;-><init>()V

    .line 888
    .line 889
    const-string v4, "lite_mode_config_fetch"

    .line 890
    .line 891
    .line 892
    invoke-interface/range {v3 .. v8}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 893
    .line 894
    new-instance v9, Lcom/kubi/widget/web/startup/KWebCookieStartupTask;

    .line 895
    .line 896
    .line 897
    invoke-direct {v9}, Lcom/kubi/widget/web/startup/KWebCookieStartupTask;-><init>()V

    .line 898
    .line 899
    const-string v8, "web_cookie"

    .line 900
    .line 901
    move-object/from16 v7, p1

    .line 902
    .line 903
    .line 904
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 905
    .line 906
    new-instance v14, Lcom/kubi/kucoin/startup/PreFetchStartupTask;

    .line 907
    .line 908
    .line 909
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/PreFetchStartupTask;-><init>()V

    .line 910
    .line 911
    const-string v13, "pre-fetch"

    .line 912
    .line 913
    move-object/from16 v12, p1

    .line 914
    .line 915
    move-object/from16 v16, v0

    .line 916
    move-object v15, v2

    .line 917
    .line 918
    .line 919
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 920
    .line 921
    new-instance v9, Lcom/kubi/quotefacade/startup/CacheInitStartUpTask;

    .line 922
    .line 923
    .line 924
    invoke-direct {v9}, Lcom/kubi/quotefacade/startup/CacheInitStartUpTask;-><init>()V

    .line 925
    const/4 v12, 0x0

    .line 926
    .line 927
    const-string v8, "market-cache-init"

    .line 928
    .line 929
    .line 930
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 931
    .line 932
    new-instance v14, Lcom/kubi/kucoin/token/TokenLifecycleStartupTask;

    .line 933
    .line 934
    .line 935
    invoke-direct {v14}, Lcom/kubi/kucoin/token/TokenLifecycleStartupTask;-><init>()V

    .line 936
    .line 937
    const-string v13, "token-lifecycle"

    .line 938
    .line 939
    move-object/from16 v12, p1

    .line 940
    move-object v15, v10

    .line 941
    .line 942
    .line 943
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 944
    move-object v3, v15

    .line 945
    .line 946
    new-instance v9, Lcom/kubi/quotefacade/startup/QuoteBusinessConfigStartupTask;

    .line 947
    .line 948
    .line 949
    invoke-direct {v9}, Lcom/kubi/quotefacade/startup/QuoteBusinessConfigStartupTask;-><init>()V

    .line 950
    const/4 v12, 0x0

    .line 951
    .line 952
    const-string v8, "quote-business-config"

    .line 953
    move-object v10, v2

    .line 954
    .line 955
    .line 956
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 957
    .line 958
    new-instance v14, Lcom/kubi/sdk/push/startup/KPushConfigStartupTask;

    .line 959
    .line 960
    .line 961
    invoke-direct {v14}, Lcom/kubi/sdk/push/startup/KPushConfigStartupTask;-><init>()V

    .line 962
    .line 963
    const/16 v17, 0x1

    .line 964
    .line 965
    const-string v13, "push-config"

    .line 966
    .line 967
    move-object/from16 v12, p1

    .line 968
    .line 969
    move-object/from16 v15, v18

    .line 970
    .line 971
    .line 972
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 973
    move-object v4, v15

    .line 974
    .line 975
    new-instance v14, Lcom/kubi/sdk/push/startup/KPushStartupTask;

    .line 976
    .line 977
    .line 978
    invoke-direct {v14}, Lcom/kubi/sdk/push/startup/KPushStartupTask;-><init>()V

    .line 979
    .line 980
    const-string v13, "push"

    .line 981
    move-object v15, v3

    .line 982
    .line 983
    .line 984
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 985
    move-object v10, v15

    .line 986
    .line 987
    new-instance v14, Lcom/kubi/kucoin/startup/ThemeStartupTask;

    .line 988
    .line 989
    .line 990
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/ThemeStartupTask;-><init>()V

    .line 991
    .line 992
    const/16 v17, 0x0

    .line 993
    .line 994
    const-string v13, "theme_init"

    .line 995
    move-object v15, v4

    .line 996
    .line 997
    .line 998
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 999
    .line 1000
    new-instance v14, Lcom/kubi/sdk/flutter/startup/FlutterStartupTask;

    .line 1001
    .line 1002
    .line 1003
    invoke-direct {v14}, Lcom/kubi/sdk/flutter/startup/FlutterStartupTask;-><init>()V

    .line 1004
    .line 1005
    const-string v13, "flutter"

    .line 1006
    move-object v15, v10

    .line 1007
    .line 1008
    .line 1009
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1010
    .line 1011
    new-instance v14, Lcom/kubi/kucoin/startup/BottomHelperStartupTask;

    .line 1012
    .line 1013
    .line 1014
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/BottomHelperStartupTask;-><init>()V

    .line 1015
    .line 1016
    const-string v13, "bottom_helper"

    .line 1017
    move-object v15, v4

    .line 1018
    .line 1019
    .line 1020
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1021
    .line 1022
    new-instance v14, Lcom/kubi/otc/BOtcMainStartupTask;

    .line 1023
    .line 1024
    .line 1025
    invoke-direct {v14}, Lcom/kubi/otc/BOtcMainStartupTask;-><init>()V

    .line 1026
    .line 1027
    const-string v13, "b_otc_main"

    .line 1028
    .line 1029
    .line 1030
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1031
    move-object v0, v15

    .line 1032
    .line 1033
    new-instance v5, Lcom/kubi/kucoin/startup/DeviceLevelTask;

    .line 1034
    .line 1035
    .line 1036
    invoke-direct {v5}, Lcom/kubi/kucoin/startup/DeviceLevelTask;-><init>()V

    .line 1037
    const/4 v8, 0x0

    .line 1038
    .line 1039
    const-string v4, "device_level"

    .line 1040
    .line 1041
    move-object/from16 v3, p1

    .line 1042
    move-object v7, v11

    .line 1043
    .line 1044
    .line 1045
    invoke-interface/range {v3 .. v8}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1046
    .line 1047
    new-instance v9, Lcom/kubi/kucoin/startup/SafeStartupTask;

    .line 1048
    .line 1049
    .line 1050
    invoke-direct {v9}, Lcom/kubi/kucoin/startup/SafeStartupTask;-><init>()V

    .line 1051
    const/4 v12, 0x0

    .line 1052
    .line 1053
    const-string v8, "safe_report"

    .line 1054
    .line 1055
    move-object/from16 v7, p1

    .line 1056
    .line 1057
    .line 1058
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1059
    .line 1060
    new-instance v14, Lcom/kubi/kucoin/startup/SensorsInstallStartupTask;

    .line 1061
    .line 1062
    .line 1063
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/SensorsInstallStartupTask;-><init>()V

    .line 1064
    .line 1065
    const-string v13, "sensors_install"

    .line 1066
    .line 1067
    move-object/from16 v12, p1

    .line 1068
    move-object v15, v10

    .line 1069
    .line 1070
    .line 1071
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1072
    .line 1073
    move-object/from16 v18, v16

    .line 1074
    .line 1075
    new-instance v14, Lcom/kubi/margin/BMarginKitStartupTask;

    .line 1076
    .line 1077
    .line 1078
    invoke-direct {v14}, Lcom/kubi/margin/BMarginKitStartupTask;-><init>()V

    .line 1079
    .line 1080
    const-string v13, "b_margin"

    .line 1081
    .line 1082
    move-object/from16 v16, v1

    .line 1083
    .line 1084
    .line 1085
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1086
    .line 1087
    new-instance v5, Lcom/kubi/home/realtime/RealtimeStartupTask;

    .line 1088
    .line 1089
    .line 1090
    invoke-direct {v5}, Lcom/kubi/home/realtime/RealtimeStartupTask;-><init>()V

    .line 1091
    const/4 v8, 0x0

    .line 1092
    .line 1093
    const-string v4, "realtime"

    .line 1094
    move-object v7, v11

    .line 1095
    .line 1096
    .line 1097
    invoke-interface/range {v3 .. v8}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1098
    .line 1099
    new-instance v9, Lcom/kubi/user/startup/BUserCenterFetchStartupTask;

    .line 1100
    .line 1101
    .line 1102
    invoke-direct {v9}, Lcom/kubi/user/startup/BUserCenterFetchStartupTask;-><init>()V

    .line 1103
    const/4 v12, 0x0

    .line 1104
    .line 1105
    const-string v8, "b_user_center_fetch"

    .line 1106
    .line 1107
    move-object/from16 v7, p1

    .line 1108
    .line 1109
    .line 1110
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1111
    .line 1112
    new-instance v9, Lcom/kubi/tradingbotkit/start/BTradingBotConfig;

    .line 1113
    .line 1114
    .line 1115
    invoke-direct {v9}, Lcom/kubi/tradingbotkit/start/BTradingBotConfig;-><init>()V

    .line 1116
    .line 1117
    const-string v8, "b_trading_bot_config"

    .line 1118
    .line 1119
    .line 1120
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1121
    .line 1122
    new-instance v14, Lcom/kubi/loan/BLoanKitStartupTask;

    .line 1123
    .line 1124
    .line 1125
    invoke-direct {v14}, Lcom/kubi/loan/BLoanKitStartupTask;-><init>()V

    .line 1126
    .line 1127
    const-string v13, "b_loan"

    .line 1128
    .line 1129
    move-object/from16 v12, p1

    .line 1130
    .line 1131
    .line 1132
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1133
    .line 1134
    new-instance v5, Lcom/kubi/widget/web/startup/KWebWarmupStartupTask;

    .line 1135
    .line 1136
    .line 1137
    invoke-direct {v5}, Lcom/kubi/widget/web/startup/KWebWarmupStartupTask;-><init>()V

    .line 1138
    const/4 v8, 0x0

    .line 1139
    .line 1140
    const-string v4, "k_web_warmup"

    .line 1141
    .line 1142
    move-object/from16 v7, v18

    .line 1143
    .line 1144
    .line 1145
    invoke-interface/range {v3 .. v8}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1146
    .line 1147
    new-instance v9, Lcom/kubi/quotefacade/startup/QuotePreloadStartupTask;

    .line 1148
    .line 1149
    .line 1150
    invoke-direct {v9}, Lcom/kubi/quotefacade/startup/QuotePreloadStartupTask;-><init>()V

    .line 1151
    const/4 v12, 0x0

    .line 1152
    .line 1153
    const-string v8, "quote-preload"

    .line 1154
    .line 1155
    move-object/from16 v7, p1

    .line 1156
    .line 1157
    .line 1158
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1159
    .line 1160
    new-instance v9, Lcom/kubi/sdk/push/startup/KPushBindStartupTask;

    .line 1161
    .line 1162
    .line 1163
    invoke-direct {v9}, Lcom/kubi/sdk/push/startup/KPushBindStartupTask;-><init>()V

    .line 1164
    const/4 v12, 0x1

    .line 1165
    .line 1166
    const-string v8, "push_bind"

    .line 1167
    .line 1168
    .line 1169
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1170
    .line 1171
    new-instance v14, Lcom/kubi/kucoin/startup/LocaleCoinStartupTask;

    .line 1172
    .line 1173
    .line 1174
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/LocaleCoinStartupTask;-><init>()V

    .line 1175
    .line 1176
    const-string v13, "locale_coin_init"

    .line 1177
    .line 1178
    move-object/from16 v12, p1

    .line 1179
    .line 1180
    .line 1181
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1182
    .line 1183
    new-instance v14, Lcom/kubi/kucoin/startup/SymbolInfoUpdateStartupTask;

    .line 1184
    .line 1185
    .line 1186
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/SymbolInfoUpdateStartupTask;-><init>()V

    .line 1187
    .line 1188
    const-string v13, "symbol_info_update"

    .line 1189
    .line 1190
    move-object/from16 v16, v18

    .line 1191
    .line 1192
    .line 1193
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1194
    .line 1195
    new-instance v9, Lcom/kubi/kucoin/startup/SymbolsCoinFetchStartupTask;

    .line 1196
    .line 1197
    .line 1198
    invoke-direct {v9}, Lcom/kubi/kucoin/startup/SymbolsCoinFetchStartupTask;-><init>()V

    .line 1199
    const/4 v12, 0x0

    .line 1200
    .line 1201
    const-string v8, "symbols_fetch"

    .line 1202
    .line 1203
    .line 1204
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1205
    .line 1206
    new-instance v14, Lcom/kubi/kucoin/startup/SymbolsCoinStartupTask;

    .line 1207
    .line 1208
    .line 1209
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/SymbolsCoinStartupTask;-><init>()V

    .line 1210
    .line 1211
    const-string v13, "symbols_init"

    .line 1212
    .line 1213
    move-object/from16 v12, p1

    .line 1214
    .line 1215
    move-object/from16 v16, v1

    .line 1216
    .line 1217
    .line 1218
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1219
    .line 1220
    new-instance v14, Lcom/kubi/kucoin/startup/TradeBeanStartupTask;

    .line 1221
    .line 1222
    .line 1223
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/TradeBeanStartupTask;-><init>()V

    .line 1224
    .line 1225
    const-string v13, "trade_bean_init"

    .line 1226
    .line 1227
    .line 1228
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1229
    .line 1230
    new-instance v9, Lcom/kubi/kumex/BKuMexFetchStartupTask;

    .line 1231
    .line 1232
    .line 1233
    invoke-direct {v9}, Lcom/kubi/kumex/BKuMexFetchStartupTask;-><init>()V

    .line 1234
    const/4 v12, 0x0

    .line 1235
    .line 1236
    const-string v8, "b_kumex_fetch"

    .line 1237
    .line 1238
    .line 1239
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1240
    .line 1241
    new-instance v14, Lcom/kubi/kumex/BKuMexStartupTask;

    .line 1242
    .line 1243
    .line 1244
    invoke-direct {v14}, Lcom/kubi/kumex/BKuMexStartupTask;-><init>()V

    .line 1245
    .line 1246
    const-string v13, "b_kumex"

    .line 1247
    .line 1248
    move-object/from16 v12, p1

    .line 1249
    .line 1250
    .line 1251
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1252
    .line 1253
    new-instance v9, Lcom/kubi/advert/startup/AppsFlyerStartupTask;

    .line 1254
    .line 1255
    .line 1256
    invoke-direct {v9}, Lcom/kubi/advert/startup/AppsFlyerStartupTask;-><init>()V

    .line 1257
    const/4 v12, 0x0

    .line 1258
    .line 1259
    const-string v8, "apps_flyer"

    .line 1260
    move-object v10, v0

    .line 1261
    .line 1262
    .line 1263
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1264
    .line 1265
    new-instance v9, Lcom/kubi/advert/startup/FacebookStartupTask;

    .line 1266
    .line 1267
    .line 1268
    invoke-direct {v9}, Lcom/kubi/advert/startup/FacebookStartupTask;-><init>()V

    .line 1269
    .line 1270
    const-string v8, "facebook_sdk"

    .line 1271
    move-object v10, v15

    .line 1272
    .line 1273
    .line 1274
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1275
    .line 1276
    new-instance v5, Lcom/kubi/operation/lib/startup/OperationRealtimeStartupTask;

    .line 1277
    .line 1278
    .line 1279
    invoke-direct {v5}, Lcom/kubi/operation/lib/startup/OperationRealtimeStartupTask;-><init>()V

    .line 1280
    const/4 v8, 0x0

    .line 1281
    .line 1282
    const-string v4, "operation_realtime"

    .line 1283
    move-object v7, v11

    .line 1284
    .line 1285
    .line 1286
    invoke-interface/range {v3 .. v8}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1287
    .line 1288
    new-instance v9, Lcom/kubi/rn/startup/ReactNativeCommonTask;

    .line 1289
    .line 1290
    .line 1291
    invoke-direct {v9}, Lcom/kubi/rn/startup/ReactNativeCommonTask;-><init>()V

    .line 1292
    .line 1293
    const-string v8, "react_native_common"

    .line 1294
    .line 1295
    move-object/from16 v7, p1

    .line 1296
    .line 1297
    .line 1298
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1299
    .line 1300
    new-instance v9, Lcom/kubi/rn/startup/ReactNativeStartupTask;

    .line 1301
    .line 1302
    .line 1303
    invoke-direct {v9}, Lcom/kubi/rn/startup/ReactNativeStartupTask;-><init>()V

    .line 1304
    .line 1305
    const-string v8, "react_native"

    .line 1306
    .line 1307
    .line 1308
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1309
    .line 1310
    new-instance v9, Lcom/kubi/spot/business/discover/MarketChangeSettingStartupTask;

    .line 1311
    .line 1312
    .line 1313
    invoke-direct {v9}, Lcom/kubi/spot/business/discover/MarketChangeSettingStartupTask;-><init>()V

    .line 1314
    .line 1315
    const-string v8, "MarketChangeSettingStatUpTask"

    .line 1316
    .line 1317
    .line 1318
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1319
    .line 1320
    new-instance v14, Lcom/kubi/kucoin/startup/RouteConfigStartupTask;

    .line 1321
    .line 1322
    .line 1323
    invoke-direct {v14}, Lcom/kubi/kucoin/startup/RouteConfigStartupTask;-><init>()V

    .line 1324
    .line 1325
    const-string v13, "route-config"

    .line 1326
    .line 1327
    move-object/from16 v12, p1

    .line 1328
    move-object v15, v2

    .line 1329
    .line 1330
    move-object/from16 v16, v18

    .line 1331
    .line 1332
    .line 1333
    invoke-interface/range {v12 .. v17}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1334
    .line 1335
    new-instance v9, Lcom/kubi/kucoin/startup/LocateStartupTask;

    .line 1336
    .line 1337
    .line 1338
    invoke-direct {v9}, Lcom/kubi/kucoin/startup/LocateStartupTask;-><init>()V

    .line 1339
    const/4 v12, 0x0

    .line 1340
    .line 1341
    const-string v8, "locate"

    .line 1342
    .line 1343
    .line 1344
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1345
    .line 1346
    new-instance v9, Lcom/kubi/sdk/function/language/startup/LangConfigStartupTask;

    .line 1347
    .line 1348
    .line 1349
    invoke-direct {v9}, Lcom/kubi/sdk/function/language/startup/LangConfigStartupTask;-><init>()V

    .line 1350
    .line 1351
    const-string v8, "dynamic-lang-config"

    .line 1352
    move-object v10, v15

    .line 1353
    .line 1354
    .line 1355
    invoke-interface/range {v7 .. v12}, Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;->addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V

    .line 1356
    .line 1357
    const-string v0, "list"

    .line 1358
    .line 1359
    move-object/from16 v12, p1

    .line 1360
    .line 1361
    .line 1362
    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1363
    return-void
.end method
