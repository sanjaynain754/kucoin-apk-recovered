.class Lio/chad/library/adapter/base/BaseQuickAdapter$6;
.super Ljava/lang/Object;
.source "BaseQuickAdapter.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/chad/library/adapter/base/BaseQuickAdapter;->bindViewClickListener(Lio/chad/library/adapter/base/BaseViewHolder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/chad/library/adapter/base/BaseQuickAdapter;

.field final synthetic val$baseViewHolder:Lio/chad/library/adapter/base/BaseViewHolder;


# direct methods
.method public constructor <init>(Lio/chad/library/adapter/base/BaseQuickAdapter;Lio/chad/library/adapter/base/BaseViewHolder;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/chad/library/adapter/base/BaseQuickAdapter$6;->this$0:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 3
    .line 4
    iput-object p2, p0, Lio/chad/library/adapter/base/BaseQuickAdapter$6;->val$baseViewHolder:Lio/chad/library/adapter/base/BaseViewHolder;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseQuickAdapter$6;->this$0:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 3
    .line 4
    iget-object v1, p0, Lio/chad/library/adapter/base/BaseQuickAdapter$6;->val$baseViewHolder:Lio/chad/library/adapter/base/BaseViewHolder;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    .line 8
    move-result v1

    .line 9
    .line 10
    iget-object v2, p0, Lio/chad/library/adapter/base/BaseQuickAdapter$6;->this$0:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 14
    move-result v2

    .line 15
    sub-int/2addr v1, v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setOnItemLongClick(Landroid/view/View;I)Z

    .line 19
    move-result p1

    .line 20
    return p1
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
