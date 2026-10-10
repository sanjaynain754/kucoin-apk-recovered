.class final Lcom/kubi/sdk/pkg/hybird/HybridVersionManager$pkgInfoMap$2;
.super Lkotlin/jvm/internal/Lambda;
.source "HybridVersionManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/sdk/pkg/hybird/HybridVersionManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/concurrent/ConcurrentHashMap<",
        "Ljava/lang/String;",
        "Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfo;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "",
        "Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfo;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHybridVersionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridVersionManager.kt\ncom/kubi/sdk/pkg/hybird/HybridVersionManager$pkgInfoMap$2\n+ 2 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelper\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,139:1\n139#2:140\n17#2:141\n178#3:142\n1855#4,2:143\n*S KotlinDebug\n*F\n+ 1 HybridVersionManager.kt\ncom/kubi/sdk/pkg/hybird/HybridVersionManager$pkgInfoMap$2\n*L\n34#1:140\n34#1:141\n34#1:142\n34#1:143,2\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/kubi/sdk/pkg/hybird/HybridVersionManager$pkgInfoMap$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/pkg/hybird/HybridVersionManager$pkgInfoMap$2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/sdk/pkg/hybird/HybridVersionManager$pkgInfoMap$2;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/sdk/pkg/hybird/HybridVersionManager$pkgInfoMap$2;->INSTANCE:Lcom/kubi/sdk/pkg/hybird/HybridVersionManager$pkgInfoMap$2;

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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    return-void
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
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kubi/sdk/pkg/hybird/HybridVersionManager$pkgInfoMap$2;->invoke()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 3
    sget-object v1, Ly70/e;->a:Ly70/e;

    .line 4
    new-instance v1, Ly70/g;

    sget-object v2, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    const/4 v3, 0x1

    const-string v4, "hybrid"

    const-string v5, "hybrid_version_list"

    invoke-direct {v1, v4, v5, v2, v3}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;Z)V

    .line 5
    sget-object v2, Ly70/a;->a:Ly70/a;

    const-class v3, Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfoMemento;

    const/4 v4, 0x0

    invoke-virtual {v2, v1, v3, v4}, Ly70/a;->j(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    move-result-object v1

    .line 6
    check-cast v1, Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfoMemento;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfoMemento;->getPackages()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 7
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfo;

    .line 8
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfo;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method
