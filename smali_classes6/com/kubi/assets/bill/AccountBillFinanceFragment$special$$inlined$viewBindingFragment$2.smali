.class public final Lcom/kubi/assets/bill/AccountBillFinanceFragment$special$$inlined$viewBindingFragment$2;
.super Lkotlin/jvm/internal/Lambda;
.source "FragmentViewBindings.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/bill/AccountBillFinanceFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/kubi/assets/bill/AccountBillFinanceFragment;",
        "Lta/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0008\u0008\u0000\u0010\u0002*\u00020\u0003\"\u0008\u0008\u0001\u0010\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "<anonymous>",
        "T",
        "F",
        "Landroidx/fragment/app/Fragment;",
        "Landroidx/viewbinding/ViewBinding;",
        "fragment",
        "invoke",
        "(Landroidx/fragment/app/Fragment;)Landroidx/viewbinding/ViewBinding;",
        "com/kubi/sdk/viewbindingdelegate/FragmentViewBindings$viewBinding1$3"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFragmentViewBindings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings$viewBinding1$3\n+ 2 AccountBillFinanceFragment.kt\ncom/kubi/assets/bill/AccountBillFinanceFragment\n*L\n1#1,266:1\n40#2:267\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kubi/assets/bill/AccountBillFinanceFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/assets/bill/AccountBillFinanceFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/bill/AccountBillFinanceFragment$special$$inlined$viewBindingFragment$2;->this$0:Lcom/kubi/assets/bill/AccountBillFinanceFragment;

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
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
.end method


# virtual methods
.method public final invoke(Landroidx/fragment/app/Fragment;)Landroidx/viewbinding/ViewBinding;
    .locals 1
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/bill/AccountBillFinanceFragment;",
            ")",
            "Lta/d;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    check-cast p1, Lcom/kubi/assets/bill/AccountBillFinanceFragment;

    .line 2
    iget-object p1, p0, Lcom/kubi/assets/bill/AccountBillFinanceFragment$special$$inlined$viewBindingFragment$2;->this$0:Lcom/kubi/assets/bill/AccountBillFinanceFragment;

    invoke-virtual {p1}, Lcom/kubi/sdk/BaseFragment;->getContentView()Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lta/d;->a(Landroid/view/View;)Lta/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    check-cast p1, Landroidx/fragment/app/Fragment;

    invoke-virtual {p0, p1}, Lcom/kubi/assets/bill/AccountBillFinanceFragment$special$$inlined$viewBindingFragment$2;->invoke(Landroidx/fragment/app/Fragment;)Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    return-object p1
.end method
