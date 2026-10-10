.class public final Lcom/kubi/sdk/protocol/jsapi/b;
.super Ljava/lang/Object;
.source "KCJsApiMap.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0008\u0005\")\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "",
        "",
        "a",
        "Ljava/util/Map;",
        "()Ljava/util/Map;",
        "jsApiMap",
        "KcProtocol_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 308

    .line 1
    const-string v0, "h5"

    const-string v1, "rn"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "jumpMultiAddFundsDialog"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 2
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v4, "jumpMultiAccountUseDialog"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    .line 3
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v5, "jumpHoldEarnDialog"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 4
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const-string v6, "jumpMultiAccountSelectDialog"

    invoke-static {v6, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 5
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const-string v7, "getHideAssetsEyeStatus"

    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    .line 6
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const-string v8, "setHideAssetsEyeStatus"

    invoke-static {v8, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    .line 7
    const-string v8, "goBindEmail"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    .line 8
    const-string v9, "goBindGoogle"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    .line 9
    const-string v10, "goBindPhone"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    .line 10
    const-string v11, "goSetPassword"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    .line 11
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const-string v13, "getPnlCalcMethod"

    invoke-static {v13, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    .line 12
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const-string v14, "setPnlCalcMethod"

    invoke-static {v14, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    .line 13
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const-string v15, "getPnlDaysRange"

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 14
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v16, v14

    const-string v14, "setPnlDaysRange"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 15
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v17, v14

    const-string v14, "setPricingCurrency"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 16
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v18, v14

    const-string v14, "openPnlDietalDialog"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 17
    const-string v15, "captchaAuthorize"

    move-object/from16 v19, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 18
    const-string v15, "captchaAuthorizeV2"

    move-object/from16 v20, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 19
    const-string v15, "appleAuthorize"

    move-object/from16 v21, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 20
    const-string v15, "appleAuthorizeV2"

    move-object/from16 v22, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 21
    const-string v15, "telegramAuthorize"

    move-object/from16 v23, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 22
    const-string v15, "telegramAuthorizeV2"

    move-object/from16 v24, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 23
    const-string v15, "passkeyAuthorize"

    move-object/from16 v25, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 24
    const-string v15, "passkeyAuthorizeV2"

    move-object/from16 v26, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 25
    const-string v15, "isPasskeyEnabled"

    move-object/from16 v27, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 26
    const-string v15, "googleAuthorizeV2"

    move-object/from16 v28, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 27
    const-string v15, "isGoogleSignInAvailable"

    move-object/from16 v29, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 28
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v30, v14

    const-string v14, "getPermission"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 29
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v31, v14

    const-string v14, "requestPermission"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 30
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v32, v14

    const-string v14, "queryCalendar"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 31
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v33, v14

    const-string v14, "updateCalendarItem"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 32
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v34, v14

    const-string v14, "deleteCalendarItem"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 33
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v35, v14

    const-string v14, "getAppInfo"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 34
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v36, v14

    const-string v14, "refreshAppSession"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 35
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v37, v14

    const-string v14, "getAppVersion"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 36
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v38, v14

    const-string v14, "showToast"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 37
    const-string v15, "updateRnContainerUi"

    move-object/from16 v39, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 38
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v40, v14

    const-string v14, "close"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 39
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v41, v14

    const-string v14, "openFlutterDialog"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 40
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v42, v14

    const-string v14, "getAppNotificationPermissionEnabled"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 41
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v43, v14

    const-string v14, "openAppNotificationSettings"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 42
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v44, v14

    const-string v14, "showAppUpgradeAlert"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 43
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v45, v14

    const-string v14, "openSupportTicketPage"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 44
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v46, v14

    const-string v14, "refreshAppUserInfo"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 45
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v47, v14

    const-string v14, "reload"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 46
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v48, v14

    const-string v14, "sharePageView"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 47
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v49, v14

    const-string v14, "vibrate"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 48
    const-string v15, "playAppSound"

    move-object/from16 v50, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 49
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v51, v14

    const-string v14, "showAddHomePageDialog"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 50
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v52, v14

    const-string v14, "getPasteBoardContent"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 51
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v53, v14

    const-string v14, "copyToClipboard"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 52
    const-string v15, "closeDialog"

    move-object/from16 v54, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 53
    const-string v15, "submitData"

    move-object/from16 v55, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 54
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v56, v14

    const-string v14, "getAllBizControlConfig"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 55
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v57, v14

    const-string v14, "queryBizControlConfig"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 56
    const-string v15, "forwardUrl"

    move-object/from16 v58, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 57
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v59, v14

    const-string v14, "syncCpsFromApp"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 58
    const-string v15, "getDeviceInfo"

    move-object/from16 v60, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 59
    const-string v15, "isClipboardReadAccessOpen"

    move-object/from16 v61, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 60
    const-string v15, "setClipboardReadAccessOpen"

    move-object/from16 v62, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 61
    const-string v15, "clearClipboardContent"

    move-object/from16 v63, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 62
    const-string v15, "playVideo"

    move-object/from16 v64, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 63
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v65, v14

    const-string v14, "getLegalPriceRate"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 64
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v66, v14

    const-string v14, "showBottomSheetDialog"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 65
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v67, v14

    const-string v14, "getFingerToken"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 66
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v68, v14

    const-string v14, "openScan"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 67
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v69, v14

    const-string v14, "isUtaTrading"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 68
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v70, v14

    const-string v14, "getFormatSymbol"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 69
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v71, v14

    const-string v14, "getContract"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 70
    const-string v15, "shareOptionPosition"

    move-object/from16 v72, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 71
    const-string v15, "shareCopyTradingPosition"

    move-object/from16 v73, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 72
    const-string v15, "shareLeadTraderTotalPnl"

    move-object/from16 v74, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 73
    const-string v15, "shareCopyTraderTotalPnl"

    move-object/from16 v75, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 74
    const-string v15, "shareCopyTraderFollowOneTraderPnl"

    move-object/from16 v76, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 75
    const-string v15, "shareLeadUserInfo"

    move-object/from16 v77, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 76
    const-string v15, "requestFutureMarketClosePosition"

    move-object/from16 v78, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 77
    const-string v15, "requestFuturePositionTpSl"

    move-object/from16 v79, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 78
    const-string v15, "requestRefreshCopyTradingAccountInfo"

    move-object/from16 v80, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 79
    const-string v15, "openPicker"

    move-object/from16 v81, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 80
    const-string v15, "loadCountries"

    move-object/from16 v82, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 81
    const-string v15, "loadIpCountry"

    move-object/from16 v83, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 82
    const-string v15, "getDefaultMobileCode"

    move-object/from16 v84, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 83
    const-string v15, "isCountryCodeValid"

    move-object/from16 v85, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 84
    const-string v15, "isMobileCodeValid"

    move-object/from16 v86, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 85
    const-string v15, "isVoiceCodeSupported"

    move-object/from16 v87, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 86
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v88, v14

    const-string v14, "onAccountChanged"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 87
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v89, v14

    const-string v14, "offAccountChanged"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 88
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v90, v14

    const-string v14, "onUcAlternativeAccountsUpdated"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 89
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v91, v14

    const-string v14, "offUcAlternativeAccountsUpdated"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 90
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v92, v14

    const-string v14, "onUcAlternativeAccountAbnormalStatus"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 91
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v93, v14

    const-string v14, "offUcAlternativeAccountAbnormalStatus"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 92
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v94, v14

    const-string v14, "onUserInfoUpdated"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 93
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v95, v14

    const-string v14, "offUserInfoUpdated"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 94
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v96, v14

    const-string v14, "onLoginSuccess"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 95
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v97, v14

    const-string v14, "offLoginSuccess"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 96
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v98, v14

    const-string v14, "onLoginStateChange"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 97
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v99, v14

    const-string v14, "offLoginStateChange"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 98
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v100, v14

    const-string v14, "onUserinfoChange"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 99
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v101, v14

    const-string v14, "offUserinfoChange"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 100
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v102, v14

    const-string v14, "onHideAssetsEyeStatusChange"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 101
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v103, v14

    const-string v14, "offHideAssetsEyeStatusChange"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 102
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v104, v14

    const-string v14, "onAppInfoChange"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 103
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v105, v14

    const-string v14, "offAppInfoChange"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 104
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v106, v14

    const-string v14, "onNetworkChange"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 105
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v107, v14

    const-string v14, "offNetworkChange"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 106
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v108, v14

    const-string v14, "getExperimentResult"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 107
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v109, v14

    const-string v14, "pickFile"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 108
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v110, v14

    const-string v14, "previewFile"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 109
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v111, v14

    const-string v14, "downloadFile"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 110
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v112, v14

    const-string v14, "getFeaturesConfig"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 111
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v113, v14

    const-string v14, "handleMenuAction"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 112
    const-string v15, "shareFuturesPositionPnl"

    move-object/from16 v114, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 113
    const-string v15, "syncGestureRecognizerToNative"

    move-object/from16 v115, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 114
    const-string v15, "setHomeFeedRouteReadyState"

    move-object/from16 v116, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 115
    const-string v15, "recordStartupTrace"

    move-object/from16 v117, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 116
    const-string v15, "setHomeBottomTabScrollToTopState"

    move-object/from16 v118, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 117
    const-string v15, "launchLiteMainActivity"

    move-object/from16 v119, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 118
    const-string v15, "onHomeBottomTabReselected"

    move-object/from16 v120, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 119
    const-string v15, "getHomeFeedTabs"

    move-object/from16 v121, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 120
    const-string v15, "updateHomeFeedTabs"

    move-object/from16 v122, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 121
    const-string v15, "getNativeFeedVisibleHeight"

    move-object/from16 v123, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 122
    const-string v15, "onClickHomeFeedTab"

    move-object/from16 v124, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 123
    const-string v15, "scrollWithVelocity"

    move-object/from16 v125, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 124
    const-string v15, "getFeedTabPos"

    move-object/from16 v126, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 125
    const-string v15, "sendFeedTabOffsetX"

    move-object/from16 v127, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 126
    const-string v15, "isFeedLiveTabRemoteConfigOpen"

    move-object/from16 v128, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 127
    const-string v15, "sendFeedEvent"

    move-object/from16 v129, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 128
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v130, v14

    const-string v14, "startSocketTask"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 129
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v131, v14

    const-string v14, "endSocketTask"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 130
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v132, v14

    const-string v14, "gotoBindEmail"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 131
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v133, v14

    const-string v14, "gotoBindPhone"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 132
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v134, v14

    const-string v14, "openAdvancedCertification"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 133
    const-string v15, "enterHome"

    move-object/from16 v135, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 134
    const-string v15, "supportedModes"

    move-object/from16 v136, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 135
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v137, v14

    const-string v14, "pageDidMount"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 136
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v138, v14

    const-string v14, "onShow"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 137
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v139, v14

    const-string v14, "offShow"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 138
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v140, v14

    const-string v14, "onHide"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 139
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v141, v14

    const-string v14, "offHide"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 140
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v142, v14

    const-string v14, "onPageMount"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 141
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v143, v14

    const-string v14, "offPageMount"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 142
    const-string v15, "getPrefetchedLocales"

    move-object/from16 v144, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 143
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v145, v14

    const-string v14, "getAlphaFavoriteList"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 144
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v146, v14

    const-string v14, "isAlphaFavorite"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 145
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v147, v14

    const-string v14, "changeAlphaFavorite"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 146
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v148, v14

    const-string v14, "getSpotFavoriteList"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 147
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v149, v14

    const-string v14, "isSpotFavorite"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 148
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v150, v14

    const-string v14, "changeSpotFavorite"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 149
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v151, v14

    const-string v14, "getFutureFavoriteList"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 150
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v152, v14

    const-string v14, "isFutureFavorite"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 151
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v153, v14

    const-string v14, "changeFutureFavorite"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 152
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v154, v14

    const-string v14, "getFutureTag"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 153
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v155, v14

    const-string v14, "getUsStockExcludes"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 154
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v156, v14

    const-string v14, "request"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 155
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v157, v14

    const-string v14, "httpRequest"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 156
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v158, v14

    const-string v14, "getClientNetworkConfig"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 157
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v159, v14

    const-string v14, "uploadFile"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 158
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v160, v14

    const-string v14, "uploadFileV2"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 159
    const-string v15, "updatePackageVersion"

    move-object/from16 v161, v14

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 160
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v162, v14

    const-string v14, "paymentJumpScanQrcode"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 161
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v163, v14

    const-string v14, "paymentPickContactPhone"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 162
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v164, v14

    const-string v14, "selectRecurringFrequency"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 163
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v165, v14

    const-string v14, "isSupportGooglePay"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 164
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v166, v14

    const-string v14, "isSupportApplePay"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 165
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v167, v14

    const-string v14, "showFastTradeGooglePay"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 166
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v168, v14

    const-string v14, "getForterMobileUid"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 167
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v169, v14

    const-string v14, "getRiskSessionId"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 168
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v170, v14

    const-string v14, "showCouponPopup"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 169
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v171, v14

    const-string v14, "goToUpgrade"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 170
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v172, v14

    const-string v14, "jumpPaymentMethodPage"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 171
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v173, v14

    const-string v14, "investmentCheckSafeVerify"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 172
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v174, v14

    const-string v14, "jumpP2PChatPage"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 173
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v175, v14

    const-string v14, "openThirdPurchaseOrderChannel"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 174
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v176, v14

    const-string v14, "uploadThirdPurchaseKycImage"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 175
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v177, v14

    const-string v14, "chatLoginout"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 176
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v178, v14

    const-string v14, "openWebUrlByIgnoreWhiteList"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 177
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v179, v14

    const-string v14, "paymentPickImageAndVideoAndFile"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 178
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v180, v14

    const-string v14, "paymentUploadFileList"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 179
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v181, v14

    const-string v14, "paymentViewVideo"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 180
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v182, v14

    const-string v14, "paymentViewPdf"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 181
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v183, v14

    const-string v14, "paymentGetVideoThumbnail"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 182
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v184, v14

    const-string v14, "getTotalBalance"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 183
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v185, v14

    const-string v14, "checkWithdrawLimit"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 184
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v186, v14

    const-string v14, "toAdaChatDirectly"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 185
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v187, v14

    const-string v14, "playCancelOrderAudio"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 186
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v188, v14

    const-string v14, "getP2PProtocalUrls"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 187
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v189, v14

    const-string v14, "takePicture"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 188
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v190, v14

    const-string v14, "appAlbumSelect"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 189
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v191, v14

    const-string v14, "openQrScan"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 190
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v192, v14

    const-string v14, "scanQrCode"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 191
    const-string v15, "checkRedpacketCodeValid"

    move-object/from16 v193, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 192
    const-string v15, "requestRedpacketInfoByCode"

    move-object/from16 v194, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 193
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v195, v14

    const-string v14, "fastFetchAbTest"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 194
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v196, v14

    const-string v14, "getRemoteConfig"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 195
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v197, v14

    const-string v14, "navigateTo"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 196
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v198, v14

    const-string v14, "openSafeValidation"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 197
    const-string v15, "startScreenShare"

    move-object/from16 v199, v14

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 198
    const-string v15, "stopScreenShare"

    move-object/from16 v200, v14

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 199
    const-string v15, "isScreenShareEnable"

    move-object/from16 v201, v14

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 200
    const-string v15, "startToFloating"

    move-object/from16 v202, v14

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 201
    const-string v15, "refreshTokenByManual"

    move-object/from16 v203, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 202
    const-string v15, "advanceLivenessRecognition"

    move-object/from16 v204, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 203
    const-string v15, "handleSafeSecurityCallback"

    move-object/from16 v205, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 204
    const-string v15, "hasLogin"

    move-object/from16 v206, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 205
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v207, v14

    const-string v14, "fastFetchJsonTest"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 206
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v208, v14

    const-string v14, "fastFetchIntegerTest"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 207
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v209, v14

    const-string v14, "fastFetchStringTest"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 208
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v210, v14

    const-string v14, "fastFetchBoolTest"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 209
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v211, v14

    const-string v14, "sensorsTrackTurbo"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 210
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v212, v14

    const-string v14, "sensorsExpose"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 211
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v213, v14

    const-string v14, "fetchKcAbTest"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 212
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v214, v14

    const-string v14, "share"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 213
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v215, v14

    const-string v14, "saveShareImage"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 214
    const-string v15, "showShareView"

    move-object/from16 v216, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 215
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v217, v14

    const-string v14, "shareWithOptions"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 216
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v218, v14

    const-string v14, "startChangeSite"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 217
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v219, v14

    const-string v14, "startChangeSiteDirectly"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 218
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v220, v14

    const-string v14, "isSiteTypeSupport"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 219
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v221, v14

    const-string v14, "getSupportSiteList"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 220
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v222, v14

    const-string v14, "querySiteVisibleConfig"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 221
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v223, v14

    const-string v14, "querySiteBizConfig"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 222
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v224, v14

    const-string v14, "querySiteExtConfig"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 223
    const-string v15, "getSiteConfig"

    move-object/from16 v225, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 224
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v226, v14

    const-string v14, "createPlainSocketTask"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 225
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v227, v14

    const-string v14, "createPollingSocketTask"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 226
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v228, v14

    const-string v14, "createHybridSocketHttpTask"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 227
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v229, v14

    const-string v14, "startTask"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 228
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v230, v14

    const-string v14, "pauseTask"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 229
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v231, v14

    const-string v14, "onSocketJsData"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 230
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v232, v14

    const-string v14, "setItem"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 231
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v233, v14

    const-string v14, "getItem"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 232
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v234, v14

    const-string v14, "removeItem"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 233
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v235, v14

    const-string v14, "containsKey"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 234
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v236, v14

    const-string v14, "getAllKeys"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 235
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v237, v14

    const-string v14, "clear"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 236
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v238, v14

    const-string v14, "getSpotCoinInfo"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 237
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v239, v14

    const-string v14, "getSpotCoinInfoBatch"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 238
    const-string v15, "getSpotCoinInfoBatchByPage"

    move-object/from16 v240, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 239
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v241, v14

    const-string v14, "getSpotSymbol"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 240
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v242, v14

    const-string v14, "getSpotSymbolBatch"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 241
    const-string v15, "getSpotSymbolBatchByPage"

    move-object/from16 v243, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 242
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v244, v14

    const-string v14, "getFuturesCoinInfo"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 243
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v245, v14

    const-string v14, "getFuturesCoinInfoBatch"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 244
    const-string v15, "getFuturesCoinInfoBatchByPage"

    move-object/from16 v246, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 245
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v247, v14

    const-string v14, "getFuturesSymbolInfo"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 246
    const-string v15, "getFuturesDisplayInfo"

    move-object/from16 v248, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 247
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v249, v14

    const-string v14, "getFuturesSymbolInfoBatch"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 248
    const-string v15, "getFuturesSymbolInfoBatchByPage"

    move-object/from16 v250, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 249
    const-string v15, "getLanguageList"

    move-object/from16 v251, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 250
    const-string v15, "getCurrencyList"

    move-object/from16 v252, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 251
    const-string v15, "changeLanguage"

    move-object/from16 v253, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 252
    const-string v15, "changeCurrency"

    move-object/from16 v254, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 253
    const-string v15, "getSoundSettings"

    move-object/from16 v255, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 254
    const-string v15, "setSoundSetting"

    move-object/16 v256, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 255
    const-string v15, "closeAllSoundSettings"

    move-object/16 v257, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 256
    const-string v15, "getSettingsSnapshot"

    move-object/16 v258, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 257
    const-string v15, "getAppTheme"

    move-object/16 v259, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 258
    const-string v15, "getCacheSize"

    move-object/16 v260, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 259
    const-string v15, "setAppTheme"

    move-object/16 v261, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 260
    const-string v15, "setUpDownColor"

    move-object/16 v262, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 261
    const-string v15, "setVolumeUnit"

    move-object/16 v263, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 262
    const-string v15, "clearCache"

    move-object/16 v264, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 263
    const-string v15, "uploadMobileLog"

    move-object/16 v265, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 264
    const-string v15, "logout"

    move-object/16 v266, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 265
    const-string v15, "getEnvironmentInfo"

    move-object/16 v267, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 266
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v268, v14

    const-string v14, "afTrack"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 267
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v269, v14

    const-string v14, "kunlunTrack"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 268
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v270, v14

    const-string v14, "kunlunEventTrack"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 269
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v271, v14

    const-string v14, "kunlunBizTrack"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 270
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v272, v14

    const-string v14, "kunlunTechTrack"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 271
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v273, v14

    const-string v14, "setKunlunMonitorApis"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 272
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v274, v14

    const-string v14, "kunlunLog"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 273
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v275, v14

    const-string v14, "clsTrack"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 274
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v276, v14

    const-string v14, "fbTrack"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 275
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v277, v14

    const-string v14, "firebaseTrack"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 276
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v278, v14

    const-string v14, "firebaseAddBreadcrumb"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 277
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v279, v14

    const-string v14, "isUtaGray"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 278
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v280, v14

    const-string v14, "isUtaHasOpend"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 279
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v281, v14

    const-string v14, "openOrderDetail"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 280
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v282, v14

    const-string v14, "openNativeMarketsSymbolDialog"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 281
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v283, v14

    const-string v14, "getContractTradeUnit"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 282
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v284, v14

    const-string v14, "getAlphaCurrencyInfo"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 283
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v285, v14

    const-string v14, "getAlphaCurrencyInfoBatch"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 284
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v286, v14

    const-string v14, "getIsolatedMarginConfig"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 285
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v287, v14

    const-string v14, "getIsolatedMarginConfigBatch"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 286
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v288, v14

    const-string v14, "getMarginCurrencyList"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 287
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v289, v14

    const-string v14, "getMarginConfig"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 288
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v290, v14

    const-string v14, "getMarginCurrency"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 289
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v291, v14

    const-string v14, "fetchMarginCurrency"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 290
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v292, v14

    const-string v14, "fetchSymbolOfflineInfoList"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 291
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v293, v14

    const-string v14, "getSymbolOfflineInfo"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 292
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v294, v14

    const-string v14, "getUserInfo"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 293
    const-string v15, "persistUserData"

    move-object/16 v295, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 294
    const-string v15, "removeAccounts"

    move-object/16 v296, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 295
    const-string v15, "logoutAccounts"

    move-object/16 v297, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 296
    const-string v15, "setActiveAccount"

    move-object/16 v298, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 297
    const-string v15, "getAlternativeAccounts"

    move-object/16 v299, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 298
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    move-object/16 v300, v0

    const-string v0, "gotoCheckLoginPage"

    invoke-static {v0, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 299
    const-string v15, "getAccountInfoById"

    move-object/16 v301, v1

    invoke-static/range {v301 .. v301}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 300
    const-string v15, "getTradePwd"

    move-object/16 v302, v1

    invoke-static/range {v300 .. v300}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 301
    const-string v15, "supportDeactivateAccount"

    move-object/16 v300, v1

    invoke-static/range {v301 .. v301}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 302
    const-string v15, "fetchTermId"

    move-object/16 v303, v1

    invoke-static/range {v301 .. v301}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 303
    const-string v15, "fetchTermInfo"

    move-object/16 v304, v1

    invoke-static/range {v301 .. v301}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 304
    const-string v15, "getReferralCode"

    move-object/16 v305, v1

    invoke-static/range {v301 .. v301}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 305
    const-string v15, "openChooseResidence"

    move-object/16 v306, v1

    invoke-static/range {v301 .. v301}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 306
    const-string v15, "handleChooseResidenceCallback"

    move-object/16 v307, v1

    invoke-static/range {v301 .. v301}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v15, 0x132

    new-array v15, v15, [Lkotlin/Pair;

    move-object/16 v301, v16

    const/16 v16, 0x0

    aput-object v2, v15, v16

    const/4 v2, 0x1

    aput-object v3, v15, v2

    const/4 v2, 0x2

    aput-object v4, v15, v2

    const/4 v2, 0x3

    aput-object v5, v15, v2

    const/4 v2, 0x4

    aput-object v6, v15, v2

    const/4 v2, 0x5

    aput-object v7, v15, v2

    const/4 v2, 0x6

    aput-object v8, v15, v2

    const/4 v2, 0x7

    aput-object v9, v15, v2

    const/16 v2, 0x8

    aput-object v10, v15, v2

    const/16 v2, 0x9

    aput-object v11, v15, v2

    const/16 v2, 0xa

    aput-object v12, v15, v2

    const/16 v2, 0xb

    aput-object v13, v15, v2

    const/16 v2, 0xc

    move-object/from16 v16, v301

    aput-object v16, v15, v2

    const/16 v2, 0xd

    aput-object v17, v15, v2

    const/16 v2, 0xe

    aput-object v18, v15, v2

    const/16 v2, 0xf

    aput-object v19, v15, v2

    const/16 v2, 0x10

    aput-object v20, v15, v2

    const/16 v2, 0x11

    aput-object v21, v15, v2

    const/16 v2, 0x12

    aput-object v22, v15, v2

    const/16 v2, 0x13

    aput-object v23, v15, v2

    const/16 v2, 0x14

    aput-object v24, v15, v2

    const/16 v2, 0x15

    aput-object v25, v15, v2

    const/16 v2, 0x16

    aput-object v26, v15, v2

    const/16 v2, 0x17

    aput-object v27, v15, v2

    const/16 v2, 0x18

    aput-object v28, v15, v2

    const/16 v2, 0x19

    aput-object v29, v15, v2

    const/16 v2, 0x1a

    aput-object v30, v15, v2

    const/16 v2, 0x1b

    aput-object v31, v15, v2

    const/16 v2, 0x1c

    aput-object v32, v15, v2

    const/16 v2, 0x1d

    aput-object v33, v15, v2

    const/16 v2, 0x1e

    aput-object v34, v15, v2

    const/16 v2, 0x1f

    aput-object v35, v15, v2

    const/16 v2, 0x20

    aput-object v36, v15, v2

    const/16 v2, 0x21

    aput-object v37, v15, v2

    const/16 v2, 0x22

    aput-object v38, v15, v2

    const/16 v2, 0x23

    aput-object v39, v15, v2

    const/16 v2, 0x24

    aput-object v40, v15, v2

    const/16 v2, 0x25

    aput-object v41, v15, v2

    const/16 v2, 0x26

    aput-object v42, v15, v2

    const/16 v2, 0x27

    aput-object v43, v15, v2

    const/16 v2, 0x28

    aput-object v44, v15, v2

    const/16 v2, 0x29

    aput-object v45, v15, v2

    const/16 v2, 0x2a

    aput-object v46, v15, v2

    const/16 v2, 0x2b

    aput-object v47, v15, v2

    const/16 v2, 0x2c

    aput-object v48, v15, v2

    const/16 v2, 0x2d

    aput-object v49, v15, v2

    const/16 v2, 0x2e

    aput-object v50, v15, v2

    const/16 v2, 0x2f

    aput-object v51, v15, v2

    const/16 v2, 0x30

    aput-object v52, v15, v2

    const/16 v2, 0x31

    aput-object v53, v15, v2

    const/16 v2, 0x32

    aput-object v54, v15, v2

    const/16 v2, 0x33

    aput-object v55, v15, v2

    const/16 v2, 0x34

    aput-object v56, v15, v2

    const/16 v2, 0x35

    aput-object v57, v15, v2

    const/16 v2, 0x36

    aput-object v58, v15, v2

    const/16 v2, 0x37

    aput-object v59, v15, v2

    const/16 v2, 0x38

    aput-object v60, v15, v2

    const/16 v2, 0x39

    aput-object v61, v15, v2

    const/16 v2, 0x3a

    aput-object v62, v15, v2

    const/16 v2, 0x3b

    aput-object v63, v15, v2

    const/16 v2, 0x3c

    aput-object v64, v15, v2

    const/16 v2, 0x3d

    aput-object v65, v15, v2

    const/16 v2, 0x3e

    aput-object v66, v15, v2

    const/16 v2, 0x3f

    aput-object v67, v15, v2

    const/16 v2, 0x40

    aput-object v68, v15, v2

    const/16 v2, 0x41

    aput-object v69, v15, v2

    const/16 v2, 0x42

    aput-object v70, v15, v2

    const/16 v2, 0x43

    aput-object v71, v15, v2

    const/16 v2, 0x44

    aput-object v72, v15, v2

    const/16 v2, 0x45

    aput-object v73, v15, v2

    const/16 v2, 0x46

    aput-object v74, v15, v2

    const/16 v2, 0x47

    aput-object v75, v15, v2

    const/16 v2, 0x48

    aput-object v76, v15, v2

    const/16 v2, 0x49

    aput-object v77, v15, v2

    const/16 v2, 0x4a

    aput-object v78, v15, v2

    const/16 v2, 0x4b

    aput-object v79, v15, v2

    const/16 v2, 0x4c

    aput-object v80, v15, v2

    const/16 v2, 0x4d

    aput-object v81, v15, v2

    const/16 v2, 0x4e

    aput-object v82, v15, v2

    const/16 v2, 0x4f

    aput-object v83, v15, v2

    const/16 v2, 0x50

    aput-object v84, v15, v2

    const/16 v2, 0x51

    aput-object v85, v15, v2

    const/16 v2, 0x52

    aput-object v86, v15, v2

    const/16 v2, 0x53

    aput-object v87, v15, v2

    const/16 v2, 0x54

    aput-object v88, v15, v2

    const/16 v2, 0x55

    aput-object v89, v15, v2

    const/16 v2, 0x56

    aput-object v90, v15, v2

    const/16 v2, 0x57

    aput-object v91, v15, v2

    const/16 v2, 0x58

    aput-object v92, v15, v2

    const/16 v2, 0x59

    aput-object v93, v15, v2

    const/16 v2, 0x5a

    aput-object v94, v15, v2

    const/16 v2, 0x5b

    aput-object v95, v15, v2

    const/16 v2, 0x5c

    aput-object v96, v15, v2

    const/16 v2, 0x5d

    aput-object v97, v15, v2

    const/16 v2, 0x5e

    aput-object v98, v15, v2

    const/16 v2, 0x5f

    aput-object v99, v15, v2

    const/16 v2, 0x60

    aput-object v100, v15, v2

    const/16 v2, 0x61

    aput-object v101, v15, v2

    const/16 v2, 0x62

    aput-object v102, v15, v2

    const/16 v2, 0x63

    aput-object v103, v15, v2

    const/16 v2, 0x64

    aput-object v104, v15, v2

    const/16 v2, 0x65

    aput-object v105, v15, v2

    const/16 v2, 0x66

    aput-object v106, v15, v2

    const/16 v2, 0x67

    aput-object v107, v15, v2

    const/16 v2, 0x68

    aput-object v108, v15, v2

    const/16 v2, 0x69

    aput-object v109, v15, v2

    const/16 v2, 0x6a

    aput-object v110, v15, v2

    const/16 v2, 0x6b

    aput-object v111, v15, v2

    const/16 v2, 0x6c

    aput-object v112, v15, v2

    const/16 v2, 0x6d

    aput-object v113, v15, v2

    const/16 v2, 0x6e

    aput-object v114, v15, v2

    const/16 v2, 0x6f

    aput-object v115, v15, v2

    const/16 v2, 0x70

    aput-object v116, v15, v2

    const/16 v2, 0x71

    aput-object v117, v15, v2

    const/16 v2, 0x72

    aput-object v118, v15, v2

    const/16 v2, 0x73

    aput-object v119, v15, v2

    const/16 v2, 0x74

    aput-object v120, v15, v2

    const/16 v2, 0x75

    aput-object v121, v15, v2

    const/16 v2, 0x76

    aput-object v122, v15, v2

    const/16 v2, 0x77

    aput-object v123, v15, v2

    const/16 v2, 0x78

    aput-object v124, v15, v2

    const/16 v2, 0x79

    aput-object v125, v15, v2

    const/16 v2, 0x7a

    aput-object v126, v15, v2

    const/16 v2, 0x7b

    aput-object v127, v15, v2

    const/16 v2, 0x7c

    aput-object v128, v15, v2

    const/16 v2, 0x7d

    aput-object v129, v15, v2

    const/16 v2, 0x7e

    aput-object v130, v15, v2

    const/16 v2, 0x7f

    aput-object v131, v15, v2

    const/16 v2, 0x80

    aput-object v132, v15, v2

    const/16 v2, 0x81

    aput-object v133, v15, v2

    const/16 v2, 0x82

    aput-object v134, v15, v2

    const/16 v2, 0x83

    aput-object v135, v15, v2

    const/16 v2, 0x84

    aput-object v136, v15, v2

    const/16 v2, 0x85

    aput-object v137, v15, v2

    const/16 v2, 0x86

    aput-object v138, v15, v2

    const/16 v2, 0x87

    aput-object v139, v15, v2

    const/16 v2, 0x88

    aput-object v140, v15, v2

    const/16 v2, 0x89

    aput-object v141, v15, v2

    const/16 v2, 0x8a

    aput-object v142, v15, v2

    const/16 v2, 0x8b

    aput-object v143, v15, v2

    const/16 v2, 0x8c

    aput-object v144, v15, v2

    const/16 v2, 0x8d

    aput-object v145, v15, v2

    const/16 v2, 0x8e

    aput-object v146, v15, v2

    const/16 v2, 0x8f

    aput-object v147, v15, v2

    const/16 v2, 0x90

    aput-object v148, v15, v2

    const/16 v2, 0x91

    aput-object v149, v15, v2

    const/16 v2, 0x92

    aput-object v150, v15, v2

    const/16 v2, 0x93

    aput-object v151, v15, v2

    const/16 v2, 0x94

    aput-object v152, v15, v2

    const/16 v2, 0x95

    aput-object v153, v15, v2

    const/16 v2, 0x96

    aput-object v154, v15, v2

    const/16 v2, 0x97

    aput-object v155, v15, v2

    const/16 v2, 0x98

    aput-object v156, v15, v2

    const/16 v2, 0x99

    aput-object v157, v15, v2

    const/16 v2, 0x9a

    aput-object v158, v15, v2

    const/16 v2, 0x9b

    aput-object v159, v15, v2

    const/16 v2, 0x9c

    aput-object v160, v15, v2

    const/16 v2, 0x9d

    aput-object v161, v15, v2

    const/16 v2, 0x9e

    aput-object v162, v15, v2

    const/16 v2, 0x9f

    aput-object v163, v15, v2

    const/16 v2, 0xa0

    aput-object v164, v15, v2

    const/16 v2, 0xa1

    aput-object v165, v15, v2

    const/16 v2, 0xa2

    aput-object v166, v15, v2

    const/16 v2, 0xa3

    aput-object v167, v15, v2

    const/16 v2, 0xa4

    aput-object v168, v15, v2

    const/16 v2, 0xa5

    aput-object v169, v15, v2

    const/16 v2, 0xa6

    aput-object v170, v15, v2

    const/16 v2, 0xa7

    aput-object v171, v15, v2

    const/16 v2, 0xa8

    aput-object v172, v15, v2

    const/16 v2, 0xa9

    aput-object v173, v15, v2

    const/16 v2, 0xaa

    aput-object v174, v15, v2

    const/16 v2, 0xab

    aput-object v175, v15, v2

    const/16 v2, 0xac

    aput-object v176, v15, v2

    const/16 v2, 0xad

    aput-object v177, v15, v2

    const/16 v2, 0xae

    aput-object v178, v15, v2

    const/16 v2, 0xaf

    aput-object v179, v15, v2

    const/16 v2, 0xb0

    aput-object v180, v15, v2

    const/16 v2, 0xb1

    aput-object v181, v15, v2

    const/16 v2, 0xb2

    aput-object v182, v15, v2

    const/16 v2, 0xb3

    aput-object v183, v15, v2

    const/16 v2, 0xb4

    aput-object v184, v15, v2

    const/16 v2, 0xb5

    aput-object v185, v15, v2

    const/16 v2, 0xb6

    aput-object v186, v15, v2

    const/16 v2, 0xb7

    aput-object v187, v15, v2

    const/16 v2, 0xb8

    aput-object v188, v15, v2

    const/16 v2, 0xb9

    aput-object v189, v15, v2

    const/16 v2, 0xba

    aput-object v190, v15, v2

    const/16 v2, 0xbb

    aput-object v191, v15, v2

    const/16 v2, 0xbc

    aput-object v192, v15, v2

    const/16 v2, 0xbd

    aput-object v193, v15, v2

    const/16 v2, 0xbe

    aput-object v194, v15, v2

    const/16 v2, 0xbf

    aput-object v195, v15, v2

    const/16 v2, 0xc0

    aput-object v196, v15, v2

    const/16 v2, 0xc1

    aput-object v197, v15, v2

    const/16 v2, 0xc2

    aput-object v198, v15, v2

    const/16 v2, 0xc3

    aput-object v199, v15, v2

    const/16 v2, 0xc4

    aput-object v200, v15, v2

    const/16 v2, 0xc5

    aput-object v201, v15, v2

    const/16 v2, 0xc6

    aput-object v202, v15, v2

    const/16 v2, 0xc7

    aput-object v203, v15, v2

    const/16 v2, 0xc8

    aput-object v204, v15, v2

    const/16 v2, 0xc9

    aput-object v205, v15, v2

    const/16 v2, 0xca

    aput-object v206, v15, v2

    const/16 v2, 0xcb

    aput-object v207, v15, v2

    const/16 v2, 0xcc

    aput-object v208, v15, v2

    const/16 v2, 0xcd

    aput-object v209, v15, v2

    const/16 v2, 0xce

    aput-object v210, v15, v2

    const/16 v2, 0xcf

    aput-object v211, v15, v2

    const/16 v2, 0xd0

    aput-object v212, v15, v2

    const/16 v2, 0xd1

    aput-object v213, v15, v2

    const/16 v2, 0xd2

    aput-object v214, v15, v2

    const/16 v2, 0xd3

    aput-object v215, v15, v2

    const/16 v2, 0xd4

    aput-object v216, v15, v2

    const/16 v2, 0xd5

    aput-object v217, v15, v2

    const/16 v2, 0xd6

    aput-object v218, v15, v2

    const/16 v2, 0xd7

    aput-object v219, v15, v2

    const/16 v2, 0xd8

    aput-object v220, v15, v2

    const/16 v2, 0xd9

    aput-object v221, v15, v2

    const/16 v2, 0xda

    aput-object v222, v15, v2

    const/16 v2, 0xdb

    aput-object v223, v15, v2

    const/16 v2, 0xdc

    aput-object v224, v15, v2

    const/16 v2, 0xdd

    aput-object v225, v15, v2

    const/16 v2, 0xde

    aput-object v226, v15, v2

    const/16 v2, 0xdf

    aput-object v227, v15, v2

    const/16 v2, 0xe0

    aput-object v228, v15, v2

    const/16 v2, 0xe1

    aput-object v229, v15, v2

    const/16 v2, 0xe2

    aput-object v230, v15, v2

    const/16 v2, 0xe3

    aput-object v231, v15, v2

    const/16 v2, 0xe4

    aput-object v232, v15, v2

    const/16 v2, 0xe5

    aput-object v233, v15, v2

    const/16 v2, 0xe6

    aput-object v234, v15, v2

    const/16 v2, 0xe7

    aput-object v235, v15, v2

    const/16 v2, 0xe8

    aput-object v236, v15, v2

    const/16 v2, 0xe9

    aput-object v237, v15, v2

    const/16 v2, 0xea

    aput-object v238, v15, v2

    const/16 v2, 0xeb

    aput-object v239, v15, v2

    const/16 v2, 0xec

    aput-object v240, v15, v2

    const/16 v2, 0xed

    aput-object v241, v15, v2

    const/16 v2, 0xee

    aput-object v242, v15, v2

    const/16 v2, 0xef

    aput-object v243, v15, v2

    const/16 v2, 0xf0

    aput-object v244, v15, v2

    const/16 v2, 0xf1

    aput-object v245, v15, v2

    const/16 v2, 0xf2

    aput-object v246, v15, v2

    const/16 v2, 0xf3

    aput-object v247, v15, v2

    const/16 v2, 0xf4

    aput-object v248, v15, v2

    const/16 v2, 0xf5

    aput-object v249, v15, v2

    const/16 v2, 0xf6

    aput-object v250, v15, v2

    const/16 v2, 0xf7

    aput-object v251, v15, v2

    const/16 v2, 0xf8

    aput-object v252, v15, v2

    const/16 v2, 0xf9

    aput-object v253, v15, v2

    const/16 v2, 0xfa

    aput-object v254, v15, v2

    const/16 v2, 0xfb

    aput-object v255, v15, v2

    const/16 v2, 0xfc

    move-object/from16 v3, v256

    aput-object v3, v15, v2

    const/16 v2, 0xfd

    move-object/from16 v3, v257

    aput-object v3, v15, v2

    const/16 v2, 0xfe

    move-object/from16 v3, v258

    aput-object v3, v15, v2

    const/16 v2, 0xff

    move-object/from16 v3, v259

    aput-object v3, v15, v2

    const/16 v2, 0x100

    move-object/from16 v3, v260

    aput-object v3, v15, v2

    const/16 v2, 0x101

    move-object/from16 v3, v261

    aput-object v3, v15, v2

    const/16 v2, 0x102

    move-object/from16 v3, v262

    aput-object v3, v15, v2

    const/16 v2, 0x103

    move-object/from16 v3, v263

    aput-object v3, v15, v2

    const/16 v2, 0x104

    move-object/from16 v3, v264

    aput-object v3, v15, v2

    const/16 v2, 0x105

    move-object/from16 v3, v265

    aput-object v3, v15, v2

    const/16 v2, 0x106

    move-object/from16 v3, v266

    aput-object v3, v15, v2

    const/16 v2, 0x107

    move-object/from16 v3, v267

    aput-object v3, v15, v2

    const/16 v2, 0x108

    move-object/from16 v3, v268

    aput-object v3, v15, v2

    const/16 v2, 0x109

    move-object/from16 v3, v269

    aput-object v3, v15, v2

    const/16 v2, 0x10a

    move-object/from16 v3, v270

    aput-object v3, v15, v2

    const/16 v2, 0x10b

    move-object/from16 v3, v271

    aput-object v3, v15, v2

    const/16 v2, 0x10c

    move-object/from16 v3, v272

    aput-object v3, v15, v2

    const/16 v2, 0x10d

    move-object/from16 v3, v273

    aput-object v3, v15, v2

    const/16 v2, 0x10e

    move-object/from16 v3, v274

    aput-object v3, v15, v2

    const/16 v2, 0x10f

    move-object/from16 v3, v275

    aput-object v3, v15, v2

    const/16 v2, 0x110

    move-object/from16 v3, v276

    aput-object v3, v15, v2

    const/16 v2, 0x111

    move-object/from16 v3, v277

    aput-object v3, v15, v2

    const/16 v2, 0x112

    move-object/from16 v3, v278

    aput-object v3, v15, v2

    const/16 v2, 0x113

    move-object/from16 v3, v279

    aput-object v3, v15, v2

    const/16 v2, 0x114

    move-object/from16 v3, v280

    aput-object v3, v15, v2

    const/16 v2, 0x115

    move-object/from16 v3, v281

    aput-object v3, v15, v2

    const/16 v2, 0x116

    move-object/from16 v3, v282

    aput-object v3, v15, v2

    const/16 v2, 0x117

    move-object/from16 v3, v283

    aput-object v3, v15, v2

    const/16 v2, 0x118

    move-object/from16 v3, v284

    aput-object v3, v15, v2

    const/16 v2, 0x119

    move-object/from16 v3, v285

    aput-object v3, v15, v2

    const/16 v2, 0x11a

    move-object/from16 v3, v286

    aput-object v3, v15, v2

    const/16 v2, 0x11b

    move-object/from16 v3, v287

    aput-object v3, v15, v2

    const/16 v2, 0x11c

    move-object/from16 v3, v288

    aput-object v3, v15, v2

    const/16 v2, 0x11d

    move-object/from16 v3, v289

    aput-object v3, v15, v2

    const/16 v2, 0x11e

    move-object/from16 v3, v290

    aput-object v3, v15, v2

    const/16 v2, 0x11f

    move-object/from16 v3, v291

    aput-object v3, v15, v2

    const/16 v2, 0x120

    move-object/from16 v3, v292

    aput-object v3, v15, v2

    const/16 v2, 0x121

    move-object/from16 v3, v293

    aput-object v3, v15, v2

    const/16 v2, 0x122

    move-object/from16 v3, v294

    aput-object v3, v15, v2

    const/16 v2, 0x123

    move-object/from16 v3, v295

    aput-object v3, v15, v2

    const/16 v2, 0x124

    move-object/from16 v3, v296

    aput-object v3, v15, v2

    const/16 v2, 0x125

    move-object/from16 v3, v297

    aput-object v3, v15, v2

    const/16 v2, 0x126

    move-object/from16 v3, v298

    aput-object v3, v15, v2

    const/16 v2, 0x127

    move-object/from16 v3, v299

    aput-object v3, v15, v2

    const/16 v2, 0x128

    aput-object v14, v15, v2

    const/16 v2, 0x129

    aput-object v0, v15, v2

    const/16 v0, 0x12a

    move-object/from16 v2, v302

    aput-object v2, v15, v0

    const/16 v0, 0x12b

    move-object/from16 v2, v300

    aput-object v2, v15, v0

    const/16 v0, 0x12c

    move-object/from16 v2, v303

    aput-object v2, v15, v0

    const/16 v0, 0x12d

    move-object/from16 v2, v304

    aput-object v2, v15, v0

    const/16 v0, 0x12e

    move-object/from16 v2, v305

    aput-object v2, v15, v0

    const/16 v0, 0x12f

    move-object/from16 v2, v306

    aput-object v2, v15, v0

    const/16 v0, 0x130

    move-object/from16 v2, v307

    aput-object v2, v15, v0

    const/16 v0, 0x131

    aput-object v1, v15, v0

    .line 307
    invoke-static {v15}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/kubi/sdk/protocol/jsapi/b;->a:Ljava/util/Map;

    return-void
.end method

.method public static final a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/protocol/jsapi/b;->a:Ljava/util/Map;

    .line 3
    return-object v0
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
.end method
