.class public Lai/advance/sdk/global/iqa/lib/UIExtras$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lai/advance/sdk/global/iqa/lib/UIExtras;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lai/advance/sdk/global/iqa/lib/UIExtras;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/UIExtras$a;->a:Lai/advance/sdk/global/iqa/lib/UIExtras;

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
.end method


# virtual methods
.method public a()Lai/advance/sdk/global/iqa/lib/UIExtras;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/UIExtras$a;->a:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 3
    return-object v0
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
    .line 19
    .line 20
.end method

.method public b(Ljava/lang/Integer;)Lai/advance/sdk/global/iqa/lib/UIExtras$a;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x5

    .line 6
    .line 7
    if-gt v0, v1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lai/advance/sdk/global/iqa/lib/UIExtras$a;->a:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->c(Lai/advance/sdk/global/iqa/lib/UIExtras;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 17
    return-object p0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 21
    move-result v0

    .line 22
    .line 23
    const/16 v1, 0x3c

    .line 24
    .line 25
    if-lt v0, v1, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lai/advance/sdk/global/iqa/lib/UIExtras$a;->a:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->c(Lai/advance/sdk/global/iqa/lib/UIExtras;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 35
    return-object p0

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/UIExtras$a;->a:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 38
    .line 39
    .line 40
    invoke-static {v0, p1}, Lai/advance/sdk/global/iqa/lib/UIExtras;->c(Lai/advance/sdk/global/iqa/lib/UIExtras;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 41
    return-object p0
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

.method public c(Lai/advance/sdk/global/iqa/lib/enums/ScreenOrientation;)Lai/advance/sdk/global/iqa/lib/UIExtras$a;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lai/advance/sdk/global/iqa/lib/UIExtras$b;->a:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p1

    .line 7
    .line 8
    aget p1, v0, p1

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    const/4 v0, 0x2

    .line 13
    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    return-object p0

    .line 16
    .line 17
    :cond_0
    iget-object p1, p0, Lai/advance/sdk/global/iqa/lib/UIExtras$a;->a:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->k(Lai/advance/sdk/global/iqa/lib/UIExtras;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 26
    return-object p0

    .line 27
    .line 28
    :cond_1
    iget-object p1, p0, Lai/advance/sdk/global/iqa/lib/UIExtras$a;->a:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 29
    goto :goto_0
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
.end method
