.class public final Lcom/kubi/sdk/util/a;
.super Ljava/lang/Object;
.source "AppInstallStatusManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/kubi/sdk/util/AppInstallStatusManager;",
        "",
        "<init>",
        "()V",
        "CATEGORY",
        "",
        "installedSid",
        "Lcom/kubi/utils/storage/StorageId;",
        "",
        "AGREE_PROTOCOL",
        "value",
        "isFirstInstall",
        "()Z",
        "init",
        "",
        "LBase_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAppInstallStatusManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppInstallStatusManager.kt\ncom/kubi/sdk/util/AppInstallStatusManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,42:1\n10#2:43\n126#2,2:44\n136#2:46\n*S KotlinDebug\n*F\n+ 1 AppInstallStatusManager.kt\ncom/kubi/sdk/util/AppInstallStatusManager\n*L\n33#1:43\n34#1:44,2\n38#1:46\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/sdk/util/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ly70/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly70/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/util/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/sdk/util/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/sdk/util/a;->a:Lcom/kubi/sdk/util/a;

    .line 8
    .line 9
    new-instance v1, Ly70/g;

    .line 10
    .line 11
    sget-object v4, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 12
    .line 13
    const/16 v6, 0x8

    .line 14
    const/4 v7, 0x0

    .line 15
    .line 16
    const-string v2, "install"

    .line 17
    .line 18
    const-string v3, "installed"

    .line 19
    const/4 v5, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct/range {v1 .. v7}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    sput-object v1, Lcom/kubi/sdk/util/a;->b:Ly70/g;

    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

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
.method public final a()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/util/a;->b:Ly70/g;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ly70/a;->b(Ly70/g;)Z

    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v3}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 14
    .line 15
    sget-object v0, Lcom/kubi/utils/DataMapUtil;->a:Lcom/kubi/utils/DataMapUtil;

    .line 16
    .line 17
    const-string v1, "AGREE_PROTOCOL"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Lcom/kubi/utils/DataMapUtil;->a(Ljava/lang/String;Z)Z

    .line 21
    move-result v0

    .line 22
    goto :goto_0

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-static {v0, v2}, Ly70/a;->d(Ly70/g;Z)Z

    .line 26
    move-result v0

    .line 27
    :goto_0
    xor-int/2addr v0, v3

    .line 28
    .line 29
    sput-boolean v0, Lcom/kubi/sdk/util/a;->c:Z

    .line 30
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/kubi/sdk/util/a;->c:Z

    .line 3
    return v0
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
.end method
