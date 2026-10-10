.class public final Lcom/kubi/assets/bill/BizTypeDialogFragment$Companion;
.super Ljava/lang/Object;
.source "BizTypeDialogFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/assets/bill/BizTypeDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\u0008\u0012\u0004\u0012\u00020\n`\u000bH\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/assets/bill/BizTypeDialogFragment$Companion;",
        "",
        "<init>",
        "()V",
        "newInstance",
        "Lcom/kubi/assets/bill/BizTypeDialogFragment;",
        "fromType",
        "",
        "initData",
        "Ljava/util/ArrayList;",
        "Lcom/kubi/assets/filter/ParcelizePair;",
        "Lkotlin/collections/ArrayList;",
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
    invoke-direct {p0}, Lcom/kubi/assets/bill/BizTypeDialogFragment$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final newInstance(Ljava/lang/String;Ljava/util/ArrayList;)Lcom/kubi/assets/bill/BizTypeDialogFragment;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/assets/filter/ParcelizePair;",
            ">;)",
            "Lcom/kubi/assets/bill/BizTypeDialogFragment;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "fromType"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v1, "initData"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v1, Lcom/kubi/assets/bill/BizTypeDialogFragment;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1}, Lcom/kubi/assets/bill/BizTypeDialogFragment;-><init>()V

    .line 16
    .line 17
    new-instance v2, Lcom/kubi/utils/h;

    .line 18
    .line 19
    .line 20
    invoke-direct {v2}, Lcom/kubi/utils/h;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v0, p1}, Lcom/kubi/utils/h;->h(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/utils/h;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    const-string v0, "initParams"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0, p2}, Lcom/kubi/utils/h;->f(Ljava/lang/String;Ljava/util/ArrayList;)Lcom/kubi/utils/h;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/kubi/utils/h;->a()Landroid/os/Bundle;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 38
    return-object v1
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
