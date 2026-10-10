.class public final enum Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;
.super Ljava/lang/Enum;
.source "BubbleStyle.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/cpiz/android/bubbleview/BubbleStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ArrowPosPolicy"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum SelfBegin:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

.field public static final enum SelfCenter:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

.field public static final enum SelfEnd:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

.field public static final enum TargetCenter:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

.field public static final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic c:[Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;


# instance fields
.field private mValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 3
    .line 4
    const-string v1, "TargetCenter"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v2}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    sput-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->TargetCenter:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 11
    .line 12
    new-instance v1, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 13
    .line 14
    const-string v3, "SelfCenter"

    .line 15
    const/4 v4, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v3, v4, v4}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    sput-object v1, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->SelfCenter:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 21
    .line 22
    new-instance v3, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 23
    .line 24
    const-string v4, "SelfBegin"

    .line 25
    const/4 v5, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v3, v4, v5, v5}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    sput-object v3, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->SelfBegin:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 31
    .line 32
    new-instance v4, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 33
    .line 34
    const-string v5, "SelfEnd"

    .line 35
    const/4 v6, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v4, v5, v6, v6}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    sput-object v4, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->SelfEnd:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 41
    .line 42
    .line 43
    filled-new-array {v0, v1, v3, v4}, [Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    sput-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->c:[Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 47
    .line 48
    new-instance v0, Landroid/util/SparseArray;

    .line 49
    .line 50
    .line 51
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 52
    .line 53
    sput-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->b:Landroid/util/SparseArray;

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->values()[Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 57
    move-result-object v0

    .line 58
    array-length v1, v0

    .line 59
    .line 60
    :goto_0
    if-ge v2, v1, :cond_0

    .line 61
    .line 62
    aget-object v3, v0, v2

    .line 63
    .line 64
    sget-object v4, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->b:Landroid/util/SparseArray;

    .line 65
    .line 66
    iget v5, v3, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->mValue:I

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, v5, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 70
    .line 71
    add-int/lit8 v2, v2, 0x1

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput p3, p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->mValue:I

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
.end method

.method public static valueOf(I)Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;
    .locals 1

    .line 2
    sget-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    if-nez p0, :cond_0

    .line 3
    sget-object p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->TargetCenter:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    :cond_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;
    .locals 1

    .line 1
    const-class v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    return-object p0
.end method

.method public static values()[Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->c:[Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->mValue:I

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method
