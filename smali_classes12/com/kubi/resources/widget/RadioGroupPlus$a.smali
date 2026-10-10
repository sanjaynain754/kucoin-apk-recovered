.class public final Lcom/kubi/resources/widget/RadioGroupPlus$a;
.super Ljava/lang/Object;
.source "RadioGroupPlus.kt"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/resources/widget/RadioGroupPlus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/kubi/resources/widget/RadioGroupPlus$CheckedStateTracker;",
        "Landroid/widget/CompoundButton$OnCheckedChangeListener;",
        "<init>",
        "(Lcom/kubi/resources/widget/RadioGroupPlus;)V",
        "onCheckedChanged",
        "",
        "buttonView",
        "Landroid/widget/CompoundButton;",
        "isChecked",
        "",
        "LComponent_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/resources/widget/RadioGroupPlus;


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/RadioGroupPlus;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/RadioGroupPlus$a;->b:Lcom/kubi/resources/widget/RadioGroupPlus;

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
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3
    .param p1    # Landroid/widget/CompoundButton;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "buttonView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/resources/widget/RadioGroupPlus$a;->b:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/kubi/resources/widget/RadioGroupPlus;->b(Lcom/kubi/resources/widget/RadioGroupPlus;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/RadioGroupPlus$a;->b:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/kubi/resources/widget/RadioGroupPlus;->e(Lcom/kubi/resources/widget/RadioGroupPlus;Z)V

    .line 21
    .line 22
    iget-object v0, p0, Lcom/kubi/resources/widget/RadioGroupPlus$a;->b:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/kubi/resources/widget/RadioGroupPlus;->getCheckedRadioButtonId()I

    .line 26
    move-result v0

    .line 27
    const/4 v1, -0x1

    .line 28
    const/4 v2, 0x0

    .line 29
    .line 30
    if-eq v0, v1, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/kubi/resources/widget/RadioGroupPlus$a;->b:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/kubi/resources/widget/RadioGroupPlus;->getCheckedRadioButtonId()I

    .line 36
    move-result v1

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, v2}, Lcom/kubi/resources/widget/RadioGroupPlus;->d(Lcom/kubi/resources/widget/RadioGroupPlus;IZ)V

    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/RadioGroupPlus$a;->b:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v2}, Lcom/kubi/resources/widget/RadioGroupPlus;->e(Lcom/kubi/resources/widget/RadioGroupPlus;Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 48
    move-result p1

    .line 49
    .line 50
    iget-object v0, p0, Lcom/kubi/resources/widget/RadioGroupPlus$a;->b:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 51
    .line 52
    .line 53
    invoke-static {v0, p1, p2}, Lcom/kubi/resources/widget/RadioGroupPlus;->c(Lcom/kubi/resources/widget/RadioGroupPlus;IZ)V

    .line 54
    return-void
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
.end method
