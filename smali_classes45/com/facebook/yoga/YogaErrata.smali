.class public final enum Lcom/facebook/yoga/YogaErrata;
.super Ljava/lang/Enum;
.source "YogaErrata.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/yoga/YogaErrata;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ABSOLUTE_PERCENT_AGAINST_INNER_SIZE:Lcom/facebook/yoga/YogaErrata;

.field public static final enum ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING:Lcom/facebook/yoga/YogaErrata;

.field public static final enum ALL:Lcom/facebook/yoga/YogaErrata;

.field public static final enum CLASSIC:Lcom/facebook/yoga/YogaErrata;

.field public static final enum NONE:Lcom/facebook/yoga/YogaErrata;

.field public static final enum STRETCH_FLEX_BASIS:Lcom/facebook/yoga/YogaErrata;

.field public static final synthetic b:[Lcom/facebook/yoga/YogaErrata;


# instance fields
.field private final mIntValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/yoga/YogaErrata;

    .line 3
    .line 4
    const-string v1, "NONE"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/YogaErrata;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    sput-object v0, Lcom/facebook/yoga/YogaErrata;->NONE:Lcom/facebook/yoga/YogaErrata;

    .line 11
    .line 12
    new-instance v0, Lcom/facebook/yoga/YogaErrata;

    .line 13
    .line 14
    const-string v1, "STRETCH_FLEX_BASIS"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/YogaErrata;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    sput-object v0, Lcom/facebook/yoga/YogaErrata;->STRETCH_FLEX_BASIS:Lcom/facebook/yoga/YogaErrata;

    .line 21
    .line 22
    new-instance v0, Lcom/facebook/yoga/YogaErrata;

    .line 23
    .line 24
    const-string v1, "ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/YogaErrata;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    sput-object v0, Lcom/facebook/yoga/YogaErrata;->ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING:Lcom/facebook/yoga/YogaErrata;

    .line 31
    .line 32
    new-instance v0, Lcom/facebook/yoga/YogaErrata;

    .line 33
    .line 34
    const-string v1, "ABSOLUTE_PERCENT_AGAINST_INNER_SIZE"

    .line 35
    const/4 v2, 0x3

    .line 36
    const/4 v3, 0x4

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/yoga/YogaErrata;-><init>(Ljava/lang/String;II)V

    .line 40
    .line 41
    sput-object v0, Lcom/facebook/yoga/YogaErrata;->ABSOLUTE_PERCENT_AGAINST_INNER_SIZE:Lcom/facebook/yoga/YogaErrata;

    .line 42
    .line 43
    new-instance v0, Lcom/facebook/yoga/YogaErrata;

    .line 44
    .line 45
    const-string v1, "ALL"

    .line 46
    .line 47
    .line 48
    const v2, 0x7fffffff

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/yoga/YogaErrata;-><init>(Ljava/lang/String;II)V

    .line 52
    .line 53
    sput-object v0, Lcom/facebook/yoga/YogaErrata;->ALL:Lcom/facebook/yoga/YogaErrata;

    .line 54
    .line 55
    new-instance v0, Lcom/facebook/yoga/YogaErrata;

    .line 56
    const/4 v1, 0x5

    .line 57
    .line 58
    .line 59
    const v2, 0x7ffffffe

    .line 60
    .line 61
    const-string v3, "CLASSIC"

    .line 62
    .line 63
    .line 64
    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/yoga/YogaErrata;-><init>(Ljava/lang/String;II)V

    .line 65
    .line 66
    sput-object v0, Lcom/facebook/yoga/YogaErrata;->CLASSIC:Lcom/facebook/yoga/YogaErrata;

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lcom/facebook/yoga/YogaErrata;->a()[Lcom/facebook/yoga/YogaErrata;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    sput-object v0, Lcom/facebook/yoga/YogaErrata;->b:[Lcom/facebook/yoga/YogaErrata;

    .line 73
    return-void
    .line 74
    .line 75
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
    iput p3, p0, Lcom/facebook/yoga/YogaErrata;->mIntValue:I

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

.method public static synthetic a()[Lcom/facebook/yoga/YogaErrata;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/yoga/YogaErrata;->NONE:Lcom/facebook/yoga/YogaErrata;

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/yoga/YogaErrata;->STRETCH_FLEX_BASIS:Lcom/facebook/yoga/YogaErrata;

    .line 5
    .line 6
    sget-object v2, Lcom/facebook/yoga/YogaErrata;->ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING:Lcom/facebook/yoga/YogaErrata;

    .line 7
    .line 8
    sget-object v3, Lcom/facebook/yoga/YogaErrata;->ABSOLUTE_PERCENT_AGAINST_INNER_SIZE:Lcom/facebook/yoga/YogaErrata;

    .line 9
    .line 10
    sget-object v4, Lcom/facebook/yoga/YogaErrata;->ALL:Lcom/facebook/yoga/YogaErrata;

    .line 11
    .line 12
    sget-object v5, Lcom/facebook/yoga/YogaErrata;->CLASSIC:Lcom/facebook/yoga/YogaErrata;

    .line 13
    .line 14
    .line 15
    filled-new-array/range {v0 .. v5}, [Lcom/facebook/yoga/YogaErrata;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
.end method

.method public static fromInt(I)Lcom/facebook/yoga/YogaErrata;
    .locals 3

    .line 1
    .line 2
    if-eqz p0, :cond_3

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p0, v0, :cond_2

    .line 6
    const/4 v0, 0x2

    .line 7
    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    const/4 v0, 0x4

    .line 10
    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    .line 14
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    const-string v2, "Unknown enum value: "

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    throw v0

    .line 38
    .line 39
    :pswitch_0
    sget-object p0, Lcom/facebook/yoga/YogaErrata;->ALL:Lcom/facebook/yoga/YogaErrata;

    .line 40
    return-object p0

    .line 41
    .line 42
    :pswitch_1
    sget-object p0, Lcom/facebook/yoga/YogaErrata;->CLASSIC:Lcom/facebook/yoga/YogaErrata;

    .line 43
    return-object p0

    .line 44
    .line 45
    :cond_0
    sget-object p0, Lcom/facebook/yoga/YogaErrata;->ABSOLUTE_PERCENT_AGAINST_INNER_SIZE:Lcom/facebook/yoga/YogaErrata;

    .line 46
    return-object p0

    .line 47
    .line 48
    :cond_1
    sget-object p0, Lcom/facebook/yoga/YogaErrata;->ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING:Lcom/facebook/yoga/YogaErrata;

    .line 49
    return-object p0

    .line 50
    .line 51
    :cond_2
    sget-object p0, Lcom/facebook/yoga/YogaErrata;->STRETCH_FLEX_BASIS:Lcom/facebook/yoga/YogaErrata;

    .line 52
    return-object p0

    .line 53
    .line 54
    :cond_3
    sget-object p0, Lcom/facebook/yoga/YogaErrata;->NONE:Lcom/facebook/yoga/YogaErrata;

    .line 55
    return-object p0

    .line 56
    nop

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    :pswitch_data_0
    .packed-switch 0x7ffffffe
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/yoga/YogaErrata;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/facebook/yoga/YogaErrata;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/facebook/yoga/YogaErrata;

    .line 9
    return-object p0
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

.method public static values()[Lcom/facebook/yoga/YogaErrata;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/yoga/YogaErrata;->b:[Lcom/facebook/yoga/YogaErrata;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/facebook/yoga/YogaErrata;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/facebook/yoga/YogaErrata;

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
.method public intValue()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/yoga/YogaErrata;->mIntValue:I

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
