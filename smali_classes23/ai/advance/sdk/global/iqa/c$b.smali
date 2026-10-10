.class public Lai/advance/sdk/global/iqa/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lai/advance/sdk/global/iqa/c;->w()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lai/advance/sdk/global/iqa/c;


# direct methods
.method public constructor <init>(Lai/advance/sdk/global/iqa/c;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lai/advance/sdk/global/iqa/c$b;->b:Lai/advance/sdk/global/iqa/c;

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
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c$b;->b:Lai/advance/sdk/global/iqa/c;

    .line 3
    .line 4
    iget-object p1, p1, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->t()V

    .line 8
    .line 9
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c$b;->b:Lai/advance/sdk/global/iqa/c;

    .line 10
    .line 11
    iget-object v0, p1, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->h()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c$b;->b:Lai/advance/sdk/global/iqa/c;

    .line 20
    .line 21
    iget-object v0, v0, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->f()Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    const/4 v0, 0x0

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_0
    const/16 v0, 0x8

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-static {p1, v0}, Lai/advance/sdk/global/iqa/c;->j(Lai/advance/sdk/global/iqa/c;I)V

    .line 35
    .line 36
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c$b;->b:Lai/advance/sdk/global/iqa/c;

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lai/advance/sdk/global/iqa/c;->c(Lai/advance/sdk/global/iqa/c;)Landroid/widget/ImageView;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c$b;->b:Lai/advance/sdk/global/iqa/c;

    .line 43
    .line 44
    iget-object v0, v0, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->g()Z

    .line 48
    move-result v0

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    sget v0, Lai/advance/sdk/global/iqa/R$drawable;->iqa_light_off:I

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :cond_1
    sget v0, Lai/advance/sdk/global/iqa/R$drawable;->iqa_light_on:I

    .line 56
    .line 57
    .line 58
    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 59
    return-void
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
