.class public final Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$Companion;
.super Ljava/lang/Object;
.source "AccountBillSearchCoinDialog.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/assets/bill/AccountBillSearchCoinDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "coinListCache",
        "",
        "Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$SearchCoinItemInfo;",
        "create",
        "Lcom/kubi/assets/bill/AccountBillSearchCoinDialog;",
        "currency",
        "accountType",
        "preloadCoinList",
        "",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "AssetsCenterLib_googleRelease"
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
        "SMAP\nAccountBillSearchCoinDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBillSearchCoinDialog.kt\ncom/kubi/assets/bill/AccountBillSearchCoinDialog$Companion\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,283:1\n47#2,4:284\n*S KotlinDebug\n*F\n+ 1 AccountBillSearchCoinDialog.kt\ncom/kubi/assets/bill/AccountBillSearchCoinDialog$Companion\n*L\n63#1:284,4\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/assets/bill/AccountBillSearchCoinDialog;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/bill/AccountBillSearchCoinDialog;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/assets/bill/AccountBillSearchCoinDialog;-><init>()V

    .line 6
    .line 7
    new-instance v1, Landroid/os/Bundle;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 11
    .line 12
    const-string v2, "currency"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string p1, "accountType"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 24
    return-object v0
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

.method public final preloadCoinList(Lkotlinx/coroutines/m0;)V
    .locals 10
    .param p1    # Lkotlinx/coroutines/m0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "coroutineScope"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/assets/bill/AccountBillRepository;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lcom/kubi/assets/bill/AccountBillRepository;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    sget-object v2, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 17
    .line 18
    new-instance v3, Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$Companion$a;

    .line 19
    .line 20
    .line 21
    invoke-direct {v3, v2}, Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$Companion$a;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v3}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 25
    move-result-object v5

    .line 26
    .line 27
    new-instance v7, Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$Companion$preloadCoinList$2;

    .line 28
    const/4 v1, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct {v7, v0, v1}, Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$Companion$preloadCoinList$2;-><init>(Lcom/kubi/assets/bill/AccountBillRepository;Lkotlin/coroutines/Continuation;)V

    .line 32
    const/4 v8, 0x2

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    move-object v4, p1

    .line 36
    .line 37
    .line 38
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
.end method
