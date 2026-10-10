.class final Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;
.super Lkotlin/jvm/internal/Lambda;
.source "BUGLY"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;->cursorToTrafficInfo([Ljava/lang/String;Landroid/database/Cursor;)Lcom/tencent/rmonitor/base/meta/TrafficInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $cursor:Landroid/database/Cursor;

.field final synthetic $trafficInfo:Lcom/tencent/rmonitor/base/meta/TrafficInfo;


# direct methods
.method public constructor <init>(Lcom/tencent/rmonitor/base/meta/TrafficInfo;Landroid/database/Cursor;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$trafficInfo:Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$cursor:Landroid/database/Cursor;

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

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
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$trafficInfo:Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    iget-object v1, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$cursor:Landroid/database/Cursor;

    const-string v2, "_id"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setId(I)V

    .line 3
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$trafficInfo:Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    iget-object v1, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$cursor:Landroid/database/Cursor;

    const-string v2, "process_name"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "cursor.getString(cursor.\u2026dex(COLUMN_PROCESS_NAME))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setProcessName(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$trafficInfo:Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    iget-object v1, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$cursor:Landroid/database/Cursor;

    const-string v2, "process_launch_id"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "cursor.getString(cursor.\u2026OLUMN_PROCESS_LAUNCH_ID))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setProcessLaunchID(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$trafficInfo:Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    iget-object v1, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$cursor:Landroid/database/Cursor;

    const-string v2, "launch_id"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "cursor.getString(cursor.\u2026       COLUMN_LAUNCH_ID))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setLaunchID(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$trafficInfo:Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    iget-object v1, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$cursor:Landroid/database/Cursor;

    const-string v2, "type"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "cursor.getString(cursor.\u2026            COLUMN_TYPE))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setType(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$trafficInfo:Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    iget-object v1, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$cursor:Landroid/database/Cursor;

    const-string v2, "host"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "cursor.getString(cursor.\u2026ColumnIndex(COLUMN_HOST))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setHost(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$trafficInfo:Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    iget-object v1, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$cursor:Landroid/database/Cursor;

    const-string v2, "front_state"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "cursor.getString(cursor.\u2026ndex(COLUMN_FRONT_STATE))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setFrontState(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$trafficInfo:Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    iget-object v1, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$cursor:Landroid/database/Cursor;

    const-string v2, "net_state"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "cursor.getString(cursor.\u2026nIndex(COLUMN_NET_STATE))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setNetState(Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$trafficInfo:Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    iget-object v1, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$cursor:Landroid/database/Cursor;

    const-string v2, "rx"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setRx(I)V

    .line 11
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$trafficInfo:Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    iget-object v1, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$cursor:Landroid/database/Cursor;

    const-string v2, "tx"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setTx(I)V

    .line 12
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$trafficInfo:Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    iget-object v1, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$cursor:Landroid/database/Cursor;

    const-string v2, "app_version"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "cursor.getString(cursor.\u2026ndex(COLUMN_APP_VERSION))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setAppVersion(Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$trafficInfo:Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    iget-object v1, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$cursor:Landroid/database/Cursor;

    const-string v2, "hot_patch_num"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "cursor.getString(cursor.\u2026ex(COLUMN_HOT_PATCH_NUM))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setHotPatchNum(Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$trafficInfo:Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    new-instance v1, Lorg/json/JSONObject;

    iget-object v2, p0, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$cursorToTrafficInfo$1;->$cursor:Landroid/database/Cursor;

    const-string v3, "user_data"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setUserData(Lorg/json/JSONObject;)V

    return-void
.end method
