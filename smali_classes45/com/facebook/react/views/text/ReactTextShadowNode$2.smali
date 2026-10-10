.class Lcom/facebook/react/views/text/ReactTextShadowNode$2;
.super Ljava/lang/Object;
.source "ReactTextShadowNode.java"

# interfaces
.implements Ld7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/text/ReactTextShadowNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/text/ReactTextShadowNode;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/views/text/ReactTextShadowNode$2;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

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
.method public baseline(Lcom/facebook/yoga/a;FF)F
    .locals 1

    .line 1
    .line 2
    iget-object p1, p0, Lcom/facebook/react/views/text/ReactTextShadowNode$2;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/facebook/react/views/text/ReactTextShadowNode;->a(Lcom/facebook/react/views/text/ReactTextShadowNode;)Landroid/text/Spannable;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    const-string p3, "Spannable element has not been prepared in onBeforeLayout"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p3}, Lh6/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    check-cast p1, Landroid/text/Spannable;

    .line 15
    .line 16
    iget-object p3, p0, Lcom/facebook/react/views/text/ReactTextShadowNode$2;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 17
    .line 18
    sget-object v0, Lcom/facebook/yoga/YogaMeasureMode;->EXACTLY:Lcom/facebook/yoga/YogaMeasureMode;

    .line 19
    .line 20
    .line 21
    invoke-static {p3, p1, p2, v0}, Lcom/facebook/react/views/text/ReactTextShadowNode;->c(Lcom/facebook/react/views/text/ReactTextShadowNode;Landroid/text/Spannable;FLcom/facebook/yoga/YogaMeasureMode;)Landroid/text/Layout;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/text/Layout;->getLineCount()I

    .line 26
    move-result p2

    .line 27
    .line 28
    add-int/lit8 p2, p2, -0x1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroid/text/Layout;->getLineBaseline(I)I

    .line 32
    move-result p1

    .line 33
    int-to-float p1, p1

    .line 34
    return p1
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
.end method
