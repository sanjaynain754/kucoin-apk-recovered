.class public final Lcom/kubi/assets/unify/dialog/UnifiedTradeHistoryDialog$Companion;
.super Ljava/lang/Object;
.source "UnifiedTradeHistoryDialog.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/assets/unify/dialog/UnifiedTradeHistoryDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/kubi/assets/unify/dialog/UnifiedTradeHistoryDialog$Companion;",
        "",
        "<init>",
        "()V",
        "newInstance",
        "Lcom/kubi/resources/dialog/DialogFragmentHelper;",
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
    invoke-direct {p0}, Lcom/kubi/assets/unify/dialog/UnifiedTradeHistoryDialog$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final newInstance()Lcom/kubi/resources/dialog/DialogFragmentHelper;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/unify/dialog/UnifiedTradeHistoryDialog;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/assets/unify/dialog/UnifiedTradeHistoryDialog;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/utils/h;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/kubi/utils/h;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/kubi/utils/h;->a()Landroid/os/Bundle;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 18
    return-object v0
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
