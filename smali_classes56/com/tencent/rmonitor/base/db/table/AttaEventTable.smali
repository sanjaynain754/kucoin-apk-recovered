.class public final Lcom/tencent/rmonitor/base/db/table/AttaEventTable;
.super Lcom/tencent/rmonitor/base/db/BaseTable;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rmonitor/base/db/table/AttaEventTable$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006J\'\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u000c\u001a\u00020\rH\u0002\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007J3\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0016H\u0002\u00a2\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0016H\u0016J{\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0010\u0008\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0010\u0008\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001f2\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007J\"\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010\u0019\u001a\u00020\u001a2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\'0\u0016H\u0016\u00a8\u0006)"
    }
    d2 = {
        "Lcom/tencent/rmonitor/base/db/table/AttaEventTable;",
        "Lcom/tencent/rmonitor/base/db/BaseTable;",
        "()V",
        "batchDelete",
        "",
        "attaEventList",
        "",
        "Lcom/tencent/rmonitor/sla/AttaEvent;",
        "cursorToAttaEvent",
        "columns",
        "",
        "",
        "cursor",
        "Landroid/database/Cursor;",
        "([Ljava/lang/String;Landroid/database/Cursor;)Lcom/tencent/rmonitor/sla/AttaEvent;",
        "delete",
        "attaEvent",
        "ifContain",
        "",
        "target",
        "list",
        "block",
        "Lkotlin/Function0;",
        "(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V",
        "insert",
        "dataBase",
        "Landroid/database/sqlite/SQLiteDatabase;",
        "query",
        "selection",
        "selectionArgs",
        "distinct",
        "",
        "groupBy",
        "having",
        "orderBy",
        "limit",
        "([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;",
        "replace",
        "search",
        "",
        "Companion",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final COLUMN_APP_BUNDLE_ID:Ljava/lang/String; = "app_bundle_id"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_APP_KEY:Ljava/lang/String; = "app_key"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_APP_NAME:Ljava/lang/String; = "app_name"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_APP_VERSION:Ljava/lang/String; = "app_version"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_CLIENT_TYPE:Ljava/lang/String; = "client_type"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_DEBUG:Ljava/lang/String; = "debug"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_DEVICE_ID:Ljava/lang/String; = "device_id"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_ERROR_CODE:Ljava/lang/String; = "error_code"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_EVENT_CODE:Ljava/lang/String; = "event_code"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_EVENT_COST:Ljava/lang/String; = "event_cost"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_EVENT_RESULT:Ljava/lang/String; = "event_result"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_EVENT_TIME:Ljava/lang/String; = "event_time"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_FULL_OS_VERSION:Ljava/lang/String; = "full_os_version"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_ID:Ljava/lang/String; = "_id"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_MANUFACTURER:Ljava/lang/String; = "manufacturer"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_MODEL:Ljava/lang/String; = "model"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_OS_VERSION:Ljava/lang/String; = "os_version"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_PARAM_0:Ljava/lang/String; = "param_0"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_PARAM_1:Ljava/lang/String; = "param_1"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_PARAM_10:Ljava/lang/String; = "param_10"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_PARAM_11:Ljava/lang/String; = "param_11"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_PARAM_12:Ljava/lang/String; = "param_12"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_PARAM_13:Ljava/lang/String; = "param_13"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_PARAM_2:Ljava/lang/String; = "param_2"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_PARAM_3:Ljava/lang/String; = "param_3"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_PARAM_4:Ljava/lang/String; = "param_4"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_PARAM_5:Ljava/lang/String; = "param_5"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_PARAM_6:Ljava/lang/String; = "param_6"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_PARAM_7:Ljava/lang/String; = "param_7"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_PARAM_8:Ljava/lang/String; = "param_8"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_PARAM_9:Ljava/lang/String; = "param_9"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_PRODUCT_ID:Ljava/lang/String; = "product_id"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_SDK_VERSION:Ljava/lang/String; = "sdk_version"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_UPLOAD_TIME:Ljava/lang/String; = "upload_time"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final COLUMN_USER_ID:Ljava/lang/String; = "user_id"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final CREATE_ATTA_DATA:Ljava/lang/String; = "CREATE TABLE IF NOT EXISTS atta_event (_id INTEGER PRIMARY KEY AUTOINCREMENT,app_version TEXT,app_name TEXT,app_bundle_id TEXT,app_key TEXT,client_type TEXT,user_id TEXT,sdk_version TEXT,event_code TEXT,event_result INT,event_time BIGINT,event_cost INT,error_code INT,upload_time BIGINT,device_id TEXT,os_version TEXT,manufacturer TEXT,model TEXT,debug INT,product_id TEXT,full_os_version TEXT,param_0 TEXT,param_1 TEXT,param_2 TEXT,param_3 TEXT,param_4 TEXT,param_5 TEXT,param_6 TEXT,param_7 TEXT,param_8 TEXT,param_9 TEXT,param_10 TEXT,param_11 TEXT,param_12 TEXT,param_13 TEXT);"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/tencent/rmonitor/base/db/table/AttaEventTable$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final TABLE_ATTA_DATA:Ljava/lang/String; = "atta_event"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "RMonitor_base_AttaEventTable"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final instance$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Lcom/tencent/rmonitor/base/db/table/AttaEventTable;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->Companion:Lcom/tencent/rmonitor/base/db/table/AttaEventTable$Companion;

    .line 9
    .line 10
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->SYNCHRONIZED:Lkotlin/LazyThreadSafetyMode;

    .line 11
    .line 12
    sget-object v1, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$Companion$instance$2;->INSTANCE:Lcom/tencent/rmonitor/base/db/table/AttaEventTable$Companion$instance$2;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->instance$delegate:Lkotlin/Lazy;

    .line 19
    .line 20
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 21
    .line 22
    const-string v1, "RMonitor_base_AttaEventTable"

    .line 23
    .line 24
    const-string v2, "companion object init"

    .line 25
    .line 26
    .line 27
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 32
    .line 33
    new-instance v0, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;-><init>()V

    .line 37
    return-void
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

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "atta_event"

    .line 3
    .line 4
    const-string v1, "CREATE TABLE IF NOT EXISTS atta_event (_id INTEGER PRIMARY KEY AUTOINCREMENT,app_version TEXT,app_name TEXT,app_bundle_id TEXT,app_key TEXT,client_type TEXT,user_id TEXT,sdk_version TEXT,event_code TEXT,event_result INT,event_time BIGINT,event_cost INT,error_code INT,upload_time BIGINT,device_id TEXT,os_version TEXT,manufacturer TEXT,model TEXT,debug INT,product_id TEXT,full_os_version TEXT,param_0 TEXT,param_1 TEXT,param_2 TEXT,param_3 TEXT,param_4 TEXT,param_5 TEXT,param_6 TEXT,param_7 TEXT,param_8 TEXT,param_9 TEXT,param_10 TEXT,param_11 TEXT,param_12 TEXT,param_13 TEXT);"

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/base/db/BaseTable;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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
.end method

.method public static final synthetic access$getInstance$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->instance$delegate:Lkotlin/Lazy;

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
.end method

.method private final cursorToAttaEvent([Ljava/lang/String;Landroid/database/Cursor;)Lcom/tencent/rmonitor/sla/AttaEvent;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lcom/tencent/rmonitor/sla/AttaEvent;

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, v0, v2, v0}, Lcom/tencent/rmonitor/sla/AttaEvent;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    const-string v2, "_id"

    .line 10
    .line 11
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$1;

    .line 12
    .line 13
    .line 14
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$1;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 18
    .line 19
    const-string v2, "app_version"

    .line 20
    .line 21
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$2;

    .line 22
    .line 23
    .line 24
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$2;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 28
    .line 29
    const-string v2, "app_name"

    .line 30
    .line 31
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$3;

    .line 32
    .line 33
    .line 34
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$3;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 38
    .line 39
    const-string v2, "app_bundle_id"

    .line 40
    .line 41
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$4;

    .line 42
    .line 43
    .line 44
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$4;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 48
    .line 49
    const-string v2, "app_key"

    .line 50
    .line 51
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$5;

    .line 52
    .line 53
    .line 54
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$5;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 58
    .line 59
    const-string v2, "user_id"

    .line 60
    .line 61
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$6;

    .line 62
    .line 63
    .line 64
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$6;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 68
    .line 69
    const-string v2, "sdk_version"

    .line 70
    .line 71
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$7;

    .line 72
    .line 73
    .line 74
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$7;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 78
    .line 79
    const-string v2, "event_code"

    .line 80
    .line 81
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$8;

    .line 82
    .line 83
    .line 84
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$8;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 85
    .line 86
    .line 87
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 88
    .line 89
    const-string v2, "event_result"

    .line 90
    .line 91
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$9;

    .line 92
    .line 93
    .line 94
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$9;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 98
    .line 99
    const-string v2, "event_time"

    .line 100
    .line 101
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$10;

    .line 102
    .line 103
    .line 104
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$10;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 108
    .line 109
    const-string v2, "event_cost"

    .line 110
    .line 111
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$11;

    .line 112
    .line 113
    .line 114
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$11;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 115
    .line 116
    .line 117
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 118
    .line 119
    const-string v2, "error_code"

    .line 120
    .line 121
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$12;

    .line 122
    .line 123
    .line 124
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$12;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 128
    .line 129
    const-string v2, "upload_time"

    .line 130
    .line 131
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$13;

    .line 132
    .line 133
    .line 134
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$13;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 135
    .line 136
    .line 137
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 138
    .line 139
    const-string v2, "device_id"

    .line 140
    .line 141
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$14;

    .line 142
    .line 143
    .line 144
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$14;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 145
    .line 146
    .line 147
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 148
    .line 149
    const-string v2, "os_version"

    .line 150
    .line 151
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$15;

    .line 152
    .line 153
    .line 154
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$15;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 155
    .line 156
    .line 157
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 158
    .line 159
    const-string v2, "manufacturer"

    .line 160
    .line 161
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$16;

    .line 162
    .line 163
    .line 164
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$16;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 165
    .line 166
    .line 167
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 168
    .line 169
    const-string v2, "model"

    .line 170
    .line 171
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$17;

    .line 172
    .line 173
    .line 174
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$17;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 175
    .line 176
    .line 177
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 178
    .line 179
    const-string v2, "debug"

    .line 180
    .line 181
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$18;

    .line 182
    .line 183
    .line 184
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$18;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 185
    .line 186
    .line 187
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 188
    .line 189
    const-string v2, "product_id"

    .line 190
    .line 191
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$19;

    .line 192
    .line 193
    .line 194
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$19;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 195
    .line 196
    .line 197
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 198
    .line 199
    const-string v2, "full_os_version"

    .line 200
    .line 201
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$20;

    .line 202
    .line 203
    .line 204
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$20;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 205
    .line 206
    .line 207
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 208
    .line 209
    const-string v2, "param_0"

    .line 210
    .line 211
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$21;

    .line 212
    .line 213
    .line 214
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$21;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 215
    .line 216
    .line 217
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 218
    .line 219
    const-string v2, "param_1"

    .line 220
    .line 221
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$22;

    .line 222
    .line 223
    .line 224
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$22;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 225
    .line 226
    .line 227
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 228
    .line 229
    const-string v2, "param_2"

    .line 230
    .line 231
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$23;

    .line 232
    .line 233
    .line 234
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$23;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 235
    .line 236
    .line 237
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 238
    .line 239
    const-string v2, "param_3"

    .line 240
    .line 241
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$24;

    .line 242
    .line 243
    .line 244
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$24;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 245
    .line 246
    .line 247
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 248
    .line 249
    const-string v2, "param_4"

    .line 250
    .line 251
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$25;

    .line 252
    .line 253
    .line 254
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$25;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 255
    .line 256
    .line 257
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 258
    .line 259
    const-string v2, "param_5"

    .line 260
    .line 261
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$26;

    .line 262
    .line 263
    .line 264
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$26;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 265
    .line 266
    .line 267
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 268
    .line 269
    const-string v2, "param_6"

    .line 270
    .line 271
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$27;

    .line 272
    .line 273
    .line 274
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$27;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 275
    .line 276
    .line 277
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 278
    .line 279
    const-string v2, "param_7"

    .line 280
    .line 281
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$28;

    .line 282
    .line 283
    .line 284
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$28;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 285
    .line 286
    .line 287
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 288
    .line 289
    const-string v2, "param_8"

    .line 290
    .line 291
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$29;

    .line 292
    .line 293
    .line 294
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$29;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 295
    .line 296
    .line 297
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 298
    .line 299
    const-string v2, "param_9"

    .line 300
    .line 301
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$30;

    .line 302
    .line 303
    .line 304
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$30;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 305
    .line 306
    .line 307
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 308
    .line 309
    const-string v2, "param_10"

    .line 310
    .line 311
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$31;

    .line 312
    .line 313
    .line 314
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$31;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 315
    .line 316
    .line 317
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 318
    .line 319
    const-string v2, "param_11"

    .line 320
    .line 321
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$32;

    .line 322
    .line 323
    .line 324
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$32;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 325
    .line 326
    .line 327
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 328
    .line 329
    const-string v2, "param_12"

    .line 330
    .line 331
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$33;

    .line 332
    .line 333
    .line 334
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$33;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 335
    .line 336
    .line 337
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 338
    .line 339
    const-string v2, "param_13"

    .line 340
    .line 341
    new-instance v3, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$34;

    .line 342
    .line 343
    .line 344
    invoke-direct {v3, v1, p2}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable$cursorToAttaEvent$34;-><init>(Lcom/tencent/rmonitor/sla/AttaEvent;Landroid/database/Cursor;)V

    .line 345
    .line 346
    .line 347
    invoke-direct {p0, v2, p1, v3}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 348
    return-object v1

    .line 349
    :catchall_0
    return-object v0
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method private final ifContain(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p2, :cond_2

    .line 3
    array-length v0, p2

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-static {p2, p1}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    move-result p1

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    return-void

    .line 15
    .line 16
    .line 17
    :cond_2
    :goto_0
    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 18
    return-void
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
.end method

.method public static synthetic query$default(Lcom/tencent/rmonitor/base/db/table/AttaEventTable;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    .line 2
    and-int/lit8 p10, p9, 0x1

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    if-eqz p10, :cond_0

    .line 6
    move-object p1, v0

    .line 7
    .line 8
    :cond_0
    and-int/lit8 p10, p9, 0x2

    .line 9
    .line 10
    if-eqz p10, :cond_1

    .line 11
    move-object p2, v0

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p10, p9, 0x4

    .line 14
    .line 15
    if-eqz p10, :cond_2

    .line 16
    move-object p3, v0

    .line 17
    .line 18
    :cond_2
    and-int/lit8 p10, p9, 0x8

    .line 19
    .line 20
    if-eqz p10, :cond_3

    .line 21
    const/4 p4, 0x0

    .line 22
    .line 23
    :cond_3
    and-int/lit8 p10, p9, 0x10

    .line 24
    .line 25
    if-eqz p10, :cond_4

    .line 26
    move-object p5, v0

    .line 27
    .line 28
    :cond_4
    and-int/lit8 p10, p9, 0x20

    .line 29
    .line 30
    if-eqz p10, :cond_5

    .line 31
    move-object p6, v0

    .line 32
    .line 33
    :cond_5
    and-int/lit8 p10, p9, 0x40

    .line 34
    .line 35
    if-eqz p10, :cond_6

    .line 36
    move-object p7, v0

    .line 37
    .line 38
    :cond_6
    and-int/lit16 p9, p9, 0x80

    .line 39
    .line 40
    if-eqz p9, :cond_7

    .line 41
    move-object p8, v0

    .line 42
    .line 43
    .line 44
    :cond_7
    invoke-virtual/range {p0 .. p8}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->query([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 45
    move-result-object p0

    .line 46
    return-object p0
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
.end method


# virtual methods
.method public final batchDelete(Ljava/util/List;)I
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/rmonitor/sla/AttaEvent;",
            ">;)I"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "attaEventList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    move-result v1

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    move-object v2, v1

    .line 26
    .line 27
    check-cast v2, Lcom/tencent/rmonitor/sla/AttaEvent;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/tencent/rmonitor/sla/AttaEvent;->getId()I

    .line 31
    move-result v2

    .line 32
    .line 33
    if-lez v2, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 40
    .line 41
    const/16 v1, 0xa

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 45
    move-result v1

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    move-result v1

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    check-cast v1, Lcom/tencent/rmonitor/sla/AttaEvent;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getId()I

    .line 68
    move-result v1

    .line 69
    .line 70
    .line 71
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    .line 75
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 76
    goto :goto_1

    .line 77
    .line 78
    .line 79
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 80
    move-result v0

    .line 81
    const/4 v1, 0x0

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    return v1

    .line 85
    .line 86
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v2, "_id in ( "

    .line 89
    .line 90
    .line 91
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    const-string v2, ","

    .line 94
    .line 95
    .line 96
    invoke-static {v2, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string p1, " )"

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 112
    .line 113
    const-string v2, "delete sql where:"

    .line 114
    .line 115
    .line 116
    invoke-static {v2, p1}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    move-result-object v2

    .line 118
    .line 119
    const-string v3, "RMonitor_base_AttaEventTable"

    .line 120
    .line 121
    .line 122
    filled-new-array {v3, v2}, [Ljava/lang/String;

    .line 123
    move-result-object v2

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 127
    .line 128
    sget-object v0, Lcom/tencent/rmonitor/base/meta/BaseInfo;->dbHelper:Lcom/tencent/rmonitor/base/db/DBHelper;

    .line 129
    .line 130
    if-eqz v0, :cond_4

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/db/DBHelper;->getDbHandler()Lcom/tencent/rmonitor/base/db/DBHandler;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    if-eqz v0, :cond_4

    .line 137
    .line 138
    const-string v1, "atta_event"

    .line 139
    const/4 v2, 0x0

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1, p1, v2}, Lcom/tencent/rmonitor/base/db/DBHandler;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 143
    move-result p1

    .line 144
    return p1

    .line 145
    :cond_4
    return v1
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
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
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
.end method

.method public final delete(Lcom/tencent/rmonitor/sla/AttaEvent;)I
    .locals 4
    .param p1    # Lcom/tencent/rmonitor/sla/AttaEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "attaEvent"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getId()I

    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    if-gez v0, :cond_0

    .line 13
    return v1

    .line 14
    .line 15
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "_id= "

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getId()I

    .line 24
    move-result p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 34
    .line 35
    const-string v2, "delete sql where:"

    .line 36
    .line 37
    .line 38
    invoke-static {v2, p1}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    const-string v3, "RMonitor_base_AttaEventTable"

    .line 42
    .line 43
    .line 44
    filled-new-array {v3, v2}, [Ljava/lang/String;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 49
    .line 50
    sget-object v0, Lcom/tencent/rmonitor/base/meta/BaseInfo;->dbHelper:Lcom/tencent/rmonitor/base/db/DBHelper;

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/db/DBHelper;->getDbHandler()Lcom/tencent/rmonitor/base/db/DBHandler;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    const-string v1, "atta_event"

    .line 61
    const/4 v2, 0x0

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1, p1, v2}, Lcom/tencent/rmonitor/base/db/DBHandler;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 65
    move-result p1

    .line 66
    return p1

    .line 67
    :cond_1
    return v1
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
    .line 112
.end method

.method public insert(Landroid/database/sqlite/SQLiteDatabase;Lkotlin/jvm/functions/Function0;)I
    .locals 1
    .param p1    # Landroid/database/sqlite/SQLiteDatabase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/sqlite/SQLiteDatabase;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "dataBase"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "block"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    const/4 p1, 0x0

    .line 12
    return p1
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

.method public final query([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .param p1    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/tencent/rmonitor/sla/AttaEvent;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v3, "columns:"

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, " selection:"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v4, " selectionArgs:"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v5, " limit:"

    .line 31
    .line 32
    move-object/from16 v9, p8

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v5, v9}, Lcom/tencent/bugly/proguard/xh;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    const-string v5, "RMonitor_base_AttaEventTable"

    .line 39
    .line 40
    .line 41
    filled-new-array {v5, v1}, [Ljava/lang/String;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 46
    .line 47
    sget-object v0, Lcom/tencent/rmonitor/base/meta/BaseInfo;->dbHelper:Lcom/tencent/rmonitor/base/db/DBHelper;

    .line 48
    const/4 v10, 0x0

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/db/DBHelper;->getDbHandler()Lcom/tencent/rmonitor/base/db/DBHandler;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    const-string v1, "atta_event"

    .line 59
    move-object v2, p1

    .line 60
    move-object v3, p2

    .line 61
    move-object v4, p3

    .line 62
    move v5, p4

    .line 63
    .line 64
    move-object/from16 v6, p5

    .line 65
    .line 66
    move-object/from16 v7, p6

    .line 67
    .line 68
    move-object/from16 v8, p7

    .line 69
    .line 70
    .line 71
    invoke-virtual/range {v0 .. v9}, Lcom/tencent/rmonitor/base/db/DBHandler;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 72
    move-result-object v0

    .line 73
    move-object v1, v0

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    move-object v1, v10

    .line 76
    .line 77
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    .line 78
    .line 79
    .line 80
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    .line 85
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    .line 86
    move-result v3

    .line 87
    .line 88
    if-lez v3, :cond_2

    .line 89
    .line 90
    .line 91
    :cond_1
    :goto_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 92
    move-result v3

    .line 93
    .line 94
    if-eqz v3, :cond_2

    .line 95
    .line 96
    .line 97
    invoke-direct {p0, p1, v1}, Lcom/tencent/rmonitor/base/db/table/AttaEventTable;->cursorToAttaEvent([Ljava/lang/String;Landroid/database/Cursor;)Lcom/tencent/rmonitor/sla/AttaEvent;

    .line 98
    move-result-object v4

    .line 99
    .line 100
    if-eqz v4, :cond_1

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    goto :goto_1

    .line 105
    :catchall_0
    move-exception v0

    .line 106
    move-object v2, v0

    .line 107
    goto :goto_2

    .line 108
    .line 109
    :cond_2
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v10}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 113
    return-object v0

    .line 114
    :goto_2
    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 115
    :catchall_1
    move-exception v0

    .line 116
    .line 117
    .line 118
    invoke-static {v1, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 119
    throw v0

    .line 120
    :cond_3
    return-object v0
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
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
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
.end method

.method public final replace(Lcom/tencent/rmonitor/sla/AttaEvent;)I
    .locals 5
    .param p1    # Lcom/tencent/rmonitor/sla/AttaEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "attaEvent"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Landroid/content/ContentValues;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getId()I

    .line 14
    move-result v1

    .line 15
    .line 16
    const-string v2, "_id"

    .line 17
    .line 18
    if-lez v1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getId()I

    .line 22
    move-result v1

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getAppVersion()Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    const-string v3, "app_version"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getAppName()Ljava/lang/String;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    const-string v3, "app_name"

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getAppBundleId()Ljava/lang/String;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    const-string v3, "app_bundle_id"

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getAppKey()Ljava/lang/String;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    const-string v3, "app_key"

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getClientType()Ljava/lang/String;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    const-string v3, "client_type"

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getUserId()Ljava/lang/String;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    const-string v3, "user_id"

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getSdkVersion()Ljava/lang/String;

    .line 87
    move-result-object v1

    .line 88
    .line 89
    const-string v3, "sdk_version"

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getEventCode()Ljava/lang/String;

    .line 96
    move-result-object v1

    .line 97
    .line 98
    const-string v3, "event_code"

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getEventResult()I

    .line 105
    move-result v1

    .line 106
    .line 107
    .line 108
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    move-result-object v1

    .line 110
    .line 111
    const-string v3, "event_result"

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getEventTime()J

    .line 118
    move-result-wide v3

    .line 119
    .line 120
    .line 121
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    const-string v3, "event_time"

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getEventCost()I

    .line 131
    move-result v1

    .line 132
    .line 133
    .line 134
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    move-result-object v1

    .line 136
    .line 137
    const-string v3, "event_cost"

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getErrorCode()I

    .line 144
    move-result v1

    .line 145
    .line 146
    .line 147
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    const-string v3, "error_code"

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getUploadTime()J

    .line 157
    move-result-wide v3

    .line 158
    .line 159
    .line 160
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 161
    move-result-object v1

    .line 162
    .line 163
    const-string v3, "upload_time"

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getDeviceId()Ljava/lang/String;

    .line 170
    move-result-object v1

    .line 171
    .line 172
    const-string v3, "device_id"

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getOsVersion()Ljava/lang/String;

    .line 179
    move-result-object v1

    .line 180
    .line 181
    const-string v3, "os_version"

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getManufacturer()Ljava/lang/String;

    .line 188
    move-result-object v1

    .line 189
    .line 190
    const-string v3, "manufacturer"

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getModel()Ljava/lang/String;

    .line 197
    move-result-object v1

    .line 198
    .line 199
    const-string v3, "model"

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getDebug()I

    .line 206
    move-result v1

    .line 207
    .line 208
    .line 209
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    move-result-object v1

    .line 211
    .line 212
    const-string v3, "debug"

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getProductId()Ljava/lang/String;

    .line 219
    move-result-object v1

    .line 220
    .line 221
    const-string v3, "product_id"

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getFullOSVersion()Ljava/lang/String;

    .line 228
    move-result-object v1

    .line 229
    .line 230
    const-string v3, "full_os_version"

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam0()Ljava/lang/String;

    .line 237
    move-result-object v1

    .line 238
    .line 239
    const-string v3, "param_0"

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam1()Ljava/lang/String;

    .line 246
    move-result-object v1

    .line 247
    .line 248
    const-string v3, "param_1"

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam2()Ljava/lang/String;

    .line 255
    move-result-object v1

    .line 256
    .line 257
    const-string v3, "param_2"

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam3()Ljava/lang/String;

    .line 264
    move-result-object v1

    .line 265
    .line 266
    const-string v3, "param_3"

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam4()Ljava/lang/String;

    .line 273
    move-result-object v1

    .line 274
    .line 275
    const-string v3, "param_4"

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam5()Ljava/lang/String;

    .line 282
    move-result-object v1

    .line 283
    .line 284
    const-string v3, "param_5"

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam6()Ljava/lang/String;

    .line 291
    move-result-object v1

    .line 292
    .line 293
    const-string v3, "param_6"

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam7()Ljava/lang/String;

    .line 300
    move-result-object v1

    .line 301
    .line 302
    const-string v3, "param_7"

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam8()Ljava/lang/String;

    .line 309
    move-result-object v1

    .line 310
    .line 311
    const-string v3, "param_8"

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam9()Ljava/lang/String;

    .line 318
    move-result-object v1

    .line 319
    .line 320
    const-string v3, "param_9"

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam10()Ljava/lang/String;

    .line 327
    move-result-object v1

    .line 328
    .line 329
    const-string v3, "param_10"

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam11()Ljava/lang/String;

    .line 336
    move-result-object v1

    .line 337
    .line 338
    const-string v3, "param_11"

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam12()Ljava/lang/String;

    .line 345
    move-result-object v1

    .line 346
    .line 347
    const-string v3, "param_12"

    .line 348
    .line 349
    .line 350
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam13()Ljava/lang/String;

    .line 354
    move-result-object v1

    .line 355
    .line 356
    const-string v3, "param_13"

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    .line 361
    sget-object v1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->dbHelper:Lcom/tencent/rmonitor/base/db/DBHelper;

    .line 362
    .line 363
    if-eqz v1, :cond_1

    .line 364
    .line 365
    .line 366
    invoke-virtual {v1}, Lcom/tencent/rmonitor/base/db/DBHelper;->getDbHandler()Lcom/tencent/rmonitor/base/db/DBHandler;

    .line 367
    move-result-object v1

    .line 368
    .line 369
    if-eqz v1, :cond_1

    .line 370
    .line 371
    const-string v3, "atta_event"

    .line 372
    .line 373
    .line 374
    invoke-virtual {v1, v3, v2, v0}, Lcom/tencent/rmonitor/base/db/DBHandler;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)I

    .line 375
    move-result v0

    .line 376
    goto :goto_0

    .line 377
    :cond_1
    const/4 v0, -0x1

    .line 378
    .line 379
    .line 380
    :goto_0
    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/sla/AttaEvent;->setId(I)V

    .line 381
    return v0
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
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
.end method

.method public search(Landroid/database/sqlite/SQLiteDatabase;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    .locals 1
    .param p1    # Landroid/database/sqlite/SQLiteDatabase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/sqlite/SQLiteDatabase;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "dataBase"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "block"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1
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
