.class public final Lsa/a;
.super Ljava/lang/Object;
.source "AssetConstant.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/kubi/assets/constant/AssetConstant;",
        "",
        "<init>",
        "()V",
        "TAB_FROM",
        "",
        "EVENT_SHOW_DEPOSIT_DISABLE_DIALOG",
        "EVENT_OVERVIEW_CUSTOM_ORDER",
        "CATEGORY",
        "KEY_OVERVIEW_CUSTOM_ORDER",
        "Lcom/kubi/utils/storage/StorageId;",
        "",
        "getKEY_OVERVIEW_CUSTOM_ORDER",
        "()Lcom/kubi/utils/storage/StorageId;",
        "AssetsCenterApi_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lsa/a;
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


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lsa/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lsa/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lsa/a;->a:Lsa/a;

    .line 8
    .line 9
    new-instance v0, Ly70/g;

    .line 10
    .line 11
    sget-object v1, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    const-string v3, "asset"

    .line 15
    .line 16
    const-string v4, "key_overview_custom_order"

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v3, v4, v1, v2}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;Z)V

    .line 20
    .line 21
    sput-object v0, Lsa/a;->b:Ly70/g;

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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
.end method


# virtual methods
.method public final a()Ly70/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly70/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lsa/a;->b:Ly70/g;

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
.end method
