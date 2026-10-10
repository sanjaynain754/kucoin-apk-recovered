.class Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$1;
.super Ljava/lang/Object;
.source "SQLiteDBHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;->execute(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;

.field final synthetic val$sqlStr:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$1;->this$0:Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$1;->val$sqlStr:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$1;->this$0:Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$1;->val$sqlStr:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$1;->this$0:Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;

    .line 14
    .line 15
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->SUCCESS:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 19
    move-result v1

    .line 20
    .line 21
    .line 22
    const-string/jumbo v2, "success"

    .line 23
    const/4 v3, 0x1

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, v2, v3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;->access$000(Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;ILjava/lang/String;Z)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    return-void

    .line 28
    .line 29
    :catch_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$1;->this$0:Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;

    .line 30
    .line 31
    const-string v1, "failed to execute SQL statement"

    .line 32
    const/4 v2, 0x0

    .line 33
    .line 34
    const/16 v3, -0x13ed

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v3, v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;->access$000(Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;ILjava/lang/String;Z)V

    .line 38
    return-void
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
