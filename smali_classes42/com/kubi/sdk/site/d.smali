.class public final Lcom/kubi/sdk/site/d;
.super Ljava/lang/Object;
.source "SiteStorageIds.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006\"\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0006\"\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0006\u00a8\u0006\r"
    }
    d2 = {
        "SID_CATEGORY",
        "",
        "latestRebirthTimeSid",
        "Lcom/kubi/utils/storage/StorageId;",
        "",
        "getLatestRebirthTimeSid",
        "()Lcom/kubi/utils/storage/StorageId;",
        "migrationSiteSid",
        "getMigrationSiteSid",
        "needMigrationHomeShowTime",
        "getNeedMigrationHomeShowTime",
        "needMigrationShowTime",
        "getNeedMigrationShowTime",
        "LSite_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Ly70/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly70/g<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ly70/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly70/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Ly70/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly70/g<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Ly70/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly70/g<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Ly70/g;

    .line 3
    .line 4
    sget-object v4, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 5
    .line 6
    const/16 v5, 0x8

    .line 7
    const/4 v6, 0x0

    .line 8
    .line 9
    const-string v1, "site"

    .line 10
    .line 11
    const-string v2, "latest_change_time"

    .line 12
    move-object v3, v4

    .line 13
    const/4 v4, 0x0

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v6}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    move-object v4, v3

    .line 18
    .line 19
    sput-object v0, Lcom/kubi/sdk/site/d;->a:Ly70/g;

    .line 20
    .line 21
    new-instance v1, Ly70/g;

    .line 22
    .line 23
    const/16 v6, 0x8

    .line 24
    const/4 v7, 0x0

    .line 25
    .line 26
    const-string v2, "site"

    .line 27
    .line 28
    const-string v3, "latest_migration_site"

    .line 29
    const/4 v5, 0x0

    .line 30
    .line 31
    .line 32
    invoke-direct/range {v1 .. v7}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    .line 34
    sput-object v1, Lcom/kubi/sdk/site/d;->b:Ly70/g;

    .line 35
    .line 36
    new-instance v1, Ly70/g;

    .line 37
    .line 38
    const-string v2, "site"

    .line 39
    .line 40
    const-string v3, "need_migration_dialog_home"

    .line 41
    .line 42
    .line 43
    invoke-direct/range {v1 .. v7}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 44
    .line 45
    sput-object v1, Lcom/kubi/sdk/site/d;->c:Ly70/g;

    .line 46
    .line 47
    new-instance v1, Ly70/g;

    .line 48
    .line 49
    const-string v2, "site"

    .line 50
    .line 51
    const-string v3, "need_migration_dialog"

    .line 52
    .line 53
    .line 54
    invoke-direct/range {v1 .. v7}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 55
    .line 56
    sput-object v1, Lcom/kubi/sdk/site/d;->d:Ly70/g;

    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public static final a()Ly70/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly70/g<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/d;->a:Ly70/g;

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
.end method

.method public static final b()Ly70/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly70/g<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/d;->c:Ly70/g;

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
.end method

.method public static final c()Ly70/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly70/g<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/d;->d:Ly70/g;

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
.end method
