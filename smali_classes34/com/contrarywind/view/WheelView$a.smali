.class public Lcom/contrarywind/view/WheelView$a;
.super Ljava/lang/Object;
.source "WheelView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/contrarywind/view/WheelView;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/contrarywind/view/WheelView;


# direct methods
.method public constructor <init>(Lcom/contrarywind/view/WheelView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/contrarywind/view/WheelView$a;->b:Lcom/contrarywind/view/WheelView;

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
.method public run()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/contrarywind/view/WheelView$a;->b:Lcom/contrarywind/view/WheelView;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/contrarywind/view/WheelView;->a(Lcom/contrarywind/view/WheelView;)Lv2/b;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/contrarywind/view/WheelView$a;->b:Lcom/contrarywind/view/WheelView;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/contrarywind/view/WheelView;->getCurrentItem()I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Lv2/b;->a(I)V

    .line 16
    return-void
    .line 17
    .line 18
.end method
