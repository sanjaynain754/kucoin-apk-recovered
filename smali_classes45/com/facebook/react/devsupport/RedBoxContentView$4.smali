.class Lcom/facebook/react/devsupport/RedBoxContentView$4;
.super Ljava/lang/Object;
.source "RedBoxContentView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/RedBoxContentView;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/RedBoxContentView;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView$4;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

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
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView$4;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/facebook/react/devsupport/RedBoxContentView;->b(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    check-cast p1, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->hideRedboxDialog()V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
