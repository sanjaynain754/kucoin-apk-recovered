.class public final Lcom/revolut/revolutpay/ui/picker/c;
.super Landroidx/recyclerview/widget/ListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/ListAdapter<",
        "Lxa0/d;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Lcom/revolut/revolutpay/ui_kit/delegate/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/revolut/revolutpay/ui_kit/delegate/a;)V
    .locals 1
    .param p1    # Lcom/revolut/revolutpay/ui_kit/delegate/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "rowWidgetDelegate"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    sget-object v0, Lcom/revolut/revolutpay/ui/picker/b;->a:Lcom/revolut/revolutpay/ui/picker/b;

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/ListAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    .line 12
    .line 13
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/picker/c;->i:Lcom/revolut/revolutpay/ui_kit/delegate/a;

    .line 14
    return-void
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
.end method


# virtual methods
.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 3
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "holder"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/picker/c;->i:Lcom/revolut/revolutpay/ui_kit/delegate/a;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v1, "null cannot be cast to non-null type com.revolut.revolutpay.ui_kit.arch.RecyclerViewDelegate<com.revolut.revolutpay.ui_kit.model.ListItem, androidx.recyclerview.widget.RecyclerView.ViewHolder>"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    const-string v2, "getItem(position)"

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    check-cast v1, Lxa0/d;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, p1, v1, p2}, Lra0/b;->a(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lxa0/d;I)V

    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo p2, "viewGroup"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object p2, p0, Lcom/revolut/revolutpay/ui/picker/c;->i:Lcom/revolut/revolutpay/ui_kit/delegate/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, p1}, Lcom/revolut/revolutpay/ui_kit/delegate/a;->f(Landroid/view/ViewGroup;)Lcom/revolut/revolutpay/ui_kit/delegate/a$c;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method
