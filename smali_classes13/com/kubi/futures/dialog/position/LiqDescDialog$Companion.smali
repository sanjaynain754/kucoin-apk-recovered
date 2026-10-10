.class public final Lcom/kubi/futures/dialog/position/LiqDescDialog$Companion;
.super Ljava/lang/Object;
.source "LiqDescDialog.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/futures/dialog/position/LiqDescDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\rJ\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/kubi/futures/dialog/position/LiqDescDialog$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "MAX_DIALOG_HEIGHT_RATIO",
        "",
        "newInstance",
        "Lcom/kubi/futures/dialog/position/LiqDescDialog;",
        "isCross",
        "",
        "position",
        "Lcom/kubi/kumex/data/trade/model/PositionEntity;",
        "params",
        "Lcom/kubi/futures/dialog/position/LiqDescParams;",
        "KumexLib_googleRelease"
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
    invoke-direct {p0}, Lcom/kubi/futures/dialog/position/LiqDescDialog$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final newInstance(Lcom/kubi/futures/dialog/position/LiqDescParams;)Lcom/kubi/futures/dialog/position/LiqDescDialog;
    .locals 3
    .param p1    # Lcom/kubi/futures/dialog/position/LiqDescParams;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lcom/kubi/futures/dialog/position/LiqDescDialog;

    invoke-direct {v0}, Lcom/kubi/futures/dialog/position/LiqDescDialog;-><init>()V

    .line 4
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 5
    const-string v2, "data"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 6
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final newInstance(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Lcom/kubi/futures/dialog/position/LiqDescDialog;
    .locals 1
    .param p1    # Lcom/kubi/kumex/data/trade/model/PositionEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "position"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/kubi/futures/dialog/position/LiqDescParams;->Companion:Lcom/kubi/futures/dialog/position/LiqDescParams$Companion;

    invoke-virtual {v0, p1}, Lcom/kubi/futures/dialog/position/LiqDescParams$Companion;->from(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Lcom/kubi/futures/dialog/position/LiqDescParams;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/kubi/futures/dialog/position/LiqDescDialog$Companion;->newInstance(Lcom/kubi/futures/dialog/position/LiqDescParams;)Lcom/kubi/futures/dialog/position/LiqDescDialog;

    move-result-object p1

    return-object p1
.end method

.method public final newInstance(Z)Lcom/kubi/futures/dialog/position/LiqDescDialog;
    .locals 11
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/kubi/futures/dialog/position/LiqDescParams;

    const/16 v9, 0xfe

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v1, p1

    invoke-direct/range {v0 .. v10}, Lcom/kubi/futures/dialog/position/LiqDescParams;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0}, Lcom/kubi/futures/dialog/position/LiqDescDialog$Companion;->newInstance(Lcom/kubi/futures/dialog/position/LiqDescParams;)Lcom/kubi/futures/dialog/position/LiqDescDialog;

    move-result-object p1

    return-object p1
.end method
