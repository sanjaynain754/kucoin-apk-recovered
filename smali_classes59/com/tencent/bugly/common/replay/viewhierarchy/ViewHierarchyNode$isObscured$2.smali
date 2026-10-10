.class final Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;
.super Lkotlin/jvm/internal/Lambda;
.source "BUGLY"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->isObscured(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "otherNode",
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;",
        "invoke",
        "(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $isObscured:Lkotlin/jvm/internal/Ref$BooleanRef;

.field final synthetic $node:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

.field final synthetic this$0:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;->$isObscured:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;->$node:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;->this$0:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    .line 7
    const/4 p1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 11
    return-void
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method


# virtual methods
.method public final invoke(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)Ljava/lang/Boolean;
    .locals 4
    .param p1    # Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string/jumbo v0, "otherNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getVisibleRect()Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;->$isObscured:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-boolean v0, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 4
    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->isImportantForContentCapture()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 5
    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getVisibleRect()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;->$node:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    invoke-virtual {v1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getVisibleRect()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->contains(Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getElevation()F

    move-result v0

    iget-object v1, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;->$node:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    invoke-virtual {v1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getElevation()F

    move-result v1

    cmpl-float v0, v0, v1

    const/4 v1, 0x1

    if-lez v0, :cond_2

    .line 7
    iget-object p1, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;->$isObscured:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-boolean v1, p1, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 8
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 9
    :cond_2
    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getElevation()F

    move-result v0

    iget-object v2, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;->$node:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    invoke-virtual {v2}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getElevation()F

    move-result v2

    cmpg-float v0, v0, v2

    if-nez v0, :cond_4

    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;->this$0:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    iget-object v2, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;->$node:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    invoke-static {v0, v2, p1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->access$findLCA(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;->component1()Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    move-result-object v2

    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;->component2()Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    move-result-object v3

    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;->component3()Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    move-result-object v0

    .line 11
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    if-eqz v0, :cond_4

    if-eqz v3, :cond_4

    .line 12
    iget-object p1, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;->$isObscured:Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getDistance()I

    move-result v0

    invoke-virtual {v3}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getDistance()I

    move-result v2

    if-le v0, v2, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p1, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 13
    iget-object p1, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;->$isObscured:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-boolean p1, p1, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    xor-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 14
    :cond_4
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 15
    :cond_5
    :goto_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 16
    :cond_6
    :goto_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;->invoke(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
