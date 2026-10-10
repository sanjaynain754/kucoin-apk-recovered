.class public final Lcom/kubi/mine/lib/ui/MineActivity;
.super Lcom/kubi/sdk/BaseActivity;
.source "MineActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0014J\u0008\u0010\u000e\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/kubi/mine/lib/ui/MineActivity;",
        "Lcom/kubi/sdk/BaseActivity;",
        "<init>",
        "()V",
        "fragment",
        "Lcom/kubi/mine/lib/ui/MineFragment;",
        "getFragment",
        "()Lcom/kubi/mine/lib/ui/MineFragment;",
        "fragment$delegate",
        "Lkotlin/Lazy;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "finish",
        "MineLib_googleRelease"
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
.field public static final synthetic j:I


# instance fields
.field public final i:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/BaseActivity;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/mine/lib/ui/m0;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/mine/lib/ui/m0;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/mine/lib/ui/MineActivity;->i:Lkotlin/Lazy;

    .line 15
    return-void
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

.method public static synthetic T()Lcom/kubi/mine/lib/ui/MineFragment;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/mine/lib/ui/MineActivity;->U()Lcom/kubi/mine/lib/ui/MineFragment;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static final U()Lcom/kubi/mine/lib/ui/MineFragment;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/mine/lib/ui/MineFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/mine/lib/ui/MineFragment;-><init>()V

    .line 6
    return-object v0
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
.method public final V()Lcom/kubi/mine/lib/ui/MineFragment;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/mine/lib/ui/MineActivity;->i:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/mine/lib/ui/MineFragment;

    .line 9
    return-object v0
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

.method public finish()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 4
    .line 5
    sget v0, Lcom/kubi/mine/R$anim;->anim_right_in_300:I

    .line 6
    .line 7
    sget v1, Lcom/kubi/mine/R$anim;->anim_left_out_300:I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 11
    return-void
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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/kubi/sdk/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    sget p1, Lcom/kubi/mine/R$layout;->bmine_layout_activity:I

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/BaseActivity;->setContentView(I)V

    .line 9
    .line 10
    sget p1, Lcom/kubi/mine/R$anim;->anim_left_in_300:I

    .line 11
    .line 12
    sget v0, Lcom/kubi/mine/R$anim;->anim_right_out_300:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseActivity;->hideTitleBar()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/mine/lib/ui/MineActivity;->V()Lcom/kubi/mine/lib/ui/MineFragment;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    sget v1, Lcom/kubi/mine/R$id;->layout_container:I

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v0, v1}, Lcom/blankj/utilcode/util/o;->k(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;I)V

    .line 32
    return-void
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
.end method
