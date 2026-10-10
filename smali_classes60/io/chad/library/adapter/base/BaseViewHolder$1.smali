.class Lio/chad/library/adapter/base/BaseViewHolder$1;
.super Ljava/lang/Object;
.source "BaseViewHolder.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/chad/library/adapter/base/BaseViewHolder;->addOnClickListener([I)Lio/chad/library/adapter/base/BaseViewHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/chad/library/adapter/base/BaseViewHolder;


# direct methods
.method public constructor <init>(Lio/chad/library/adapter/base/BaseViewHolder;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/chad/library/adapter/base/BaseViewHolder$1;->this$0:Lio/chad/library/adapter/base/BaseViewHolder;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseViewHolder$1;->this$0:Lio/chad/library/adapter/base/BaseViewHolder;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lio/chad/library/adapter/base/BaseViewHolder;->access$000(Lio/chad/library/adapter/base/BaseViewHolder;)Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getOnItemChildClickListener()Lio/chad/library/adapter/base/BaseQuickAdapter$OnItemChildClickListener;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseViewHolder$1;->this$0:Lio/chad/library/adapter/base/BaseViewHolder;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lio/chad/library/adapter/base/BaseViewHolder;->access$000(Lio/chad/library/adapter/base/BaseViewHolder;)Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getOnItemChildClickListener()Lio/chad/library/adapter/base/BaseQuickAdapter$OnItemChildClickListener;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iget-object v1, p0, Lio/chad/library/adapter/base/BaseViewHolder$1;->this$0:Lio/chad/library/adapter/base/BaseViewHolder;

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lio/chad/library/adapter/base/BaseViewHolder;->access$000(Lio/chad/library/adapter/base/BaseViewHolder;)Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    iget-object v2, p0, Lio/chad/library/adapter/base/BaseViewHolder$1;->this$0:Lio/chad/library/adapter/base/BaseViewHolder;

    .line 31
    .line 32
    .line 33
    invoke-static {v2}, Lio/chad/library/adapter/base/BaseViewHolder;->access$100(Lio/chad/library/adapter/base/BaseViewHolder;)I

    .line 34
    move-result v2

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v1, p1, v2}, Lio/chad/library/adapter/base/BaseQuickAdapter$OnItemChildClickListener;->onItemChildClick(Lio/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    .line 38
    :cond_0
    return-void
    .line 39
.end method
