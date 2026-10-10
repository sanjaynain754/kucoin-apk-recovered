.class public Lai/advance/sdk/global/iqa/c$a;
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
    iput-object p1, p0, Lai/advance/sdk/global/iqa/c$a;->b:Lai/advance/sdk/global/iqa/c;

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
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c$a;->b:Lai/advance/sdk/global/iqa/c;

    .line 3
    .line 4
    iget-object p1, p1, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->s()V

    .line 8
    .line 9
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c$a;->b:Lai/advance/sdk/global/iqa/c;

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lai/advance/sdk/global/iqa/c;->c(Lai/advance/sdk/global/iqa/c;)Landroid/widget/ImageView;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c$a;->b:Lai/advance/sdk/global/iqa/c;

    .line 16
    .line 17
    iget-object v0, v0, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->g()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    sget v0, Lai/advance/sdk/global/iqa/R$drawable;->iqa_light_off:I

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    sget v0, Lai/advance/sdk/global/iqa/R$drawable;->iqa_light_on:I

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

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
