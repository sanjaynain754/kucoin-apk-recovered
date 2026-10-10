.class public final synthetic Lrs/a;
.super Ljava/lang/Object;
.source "R8$$SyntheticClass"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic b:Landroid/widget/TextView;

.field public final synthetic c:Lrs/c;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Lrs/c;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lrs/a;->b:Landroid/widget/TextView;

    .line 6
    .line 7
    iput-object p2, p0, Lrs/a;->c:Lrs/c;

    .line 8
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 11

    .line 1
    iget-object v0, p0, Lrs/a;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lrs/a;->c:Lrs/c;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-static/range {v0 .. v10}, Lrs/b;->a(Landroid/widget/TextView;Lrs/c;Landroid/view/View;IIIIIIII)V

    return-void
.end method
