.class public Lai/advance/sdk/global/iqa/lib/IQAExtras;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lai/advance/sdk/global/iqa/lib/IQAExtras$a;
    }
.end annotation


# instance fields
.field private a:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

.field private b:I

.field private c:Ljava/lang/String;

.field private d:Lai/advance/sdk/global/iqa/lib/enums/CardType;

.field private e:Lai/advance/sdk/global/iqa/lib/enums/Mode;

.field private f:Z

.field private g:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lai/advance/sdk/global/iqa/lib/IQAExtras$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lai/advance/sdk/global/iqa/lib/IQAExtras;-><init>()V

    return-void
.end method

.method public static synthetic a(Lai/advance/sdk/global/iqa/lib/IQAExtras;I)I
    .locals 0

    .line 6
    iput p1, p0, Lai/advance/sdk/global/iqa/lib/IQAExtras;->b:I

    return p1
.end method

.method public static synthetic a(Lai/advance/sdk/global/iqa/lib/IQAExtras;Lai/advance/sdk/global/iqa/lib/enums/CardSide;)Lai/advance/sdk/global/iqa/lib/enums/CardSide;
    .locals 0

    .line 3
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/IQAExtras;->a:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    return-object p1
.end method

.method public static synthetic a(Lai/advance/sdk/global/iqa/lib/IQAExtras;Lai/advance/sdk/global/iqa/lib/enums/CardType;)Lai/advance/sdk/global/iqa/lib/enums/CardType;
    .locals 0

    .line 2
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/IQAExtras;->d:Lai/advance/sdk/global/iqa/lib/enums/CardType;

    return-object p1
.end method

.method public static synthetic a(Lai/advance/sdk/global/iqa/lib/IQAExtras;Lai/advance/sdk/global/iqa/lib/enums/Mode;)Lai/advance/sdk/global/iqa/lib/enums/Mode;
    .locals 0

    .line 4
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/IQAExtras;->e:Lai/advance/sdk/global/iqa/lib/enums/Mode;

    return-object p1
.end method

.method public static synthetic a(Lai/advance/sdk/global/iqa/lib/IQAExtras;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/IQAExtras;->c:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic a(Lai/advance/sdk/global/iqa/lib/IQAExtras;Z)Z
    .locals 0

    .line 5
    iput-boolean p1, p0, Lai/advance/sdk/global/iqa/lib/IQAExtras;->g:Z

    return p1
.end method

.method public static synthetic b(Lai/advance/sdk/global/iqa/lib/IQAExtras;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lai/advance/sdk/global/iqa/lib/IQAExtras;->f:Z

    .line 3
    return p1
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
.method public getCardSide()Lai/advance/sdk/global/iqa/lib/enums/CardSide;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAExtras;->a:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

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

.method public getCardType()Lai/advance/sdk/global/iqa/lib/enums/CardType;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAExtras;->d:Lai/advance/sdk/global/iqa/lib/enums/CardType;

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

.method public getMaxRetryTimes()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/IQAExtras;->b:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    :cond_0
    return v0
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

.method public getMode()Lai/advance/sdk/global/iqa/lib/enums/Mode;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAExtras;->e:Lai/advance/sdk/global/iqa/lib/enums/Mode;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lai/advance/sdk/global/iqa/lib/enums/Mode;->DEFAULT:Lai/advance/sdk/global/iqa/lib/enums/Mode;

    .line 7
    :cond_0
    return-object v0
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

.method public getRegion()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAExtras;->c:Ljava/lang/String;

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

.method public isReturnEmpty()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lai/advance/sdk/global/iqa/lib/IQAExtras;->g:Z

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
    .line 19
    .line 20
.end method

.method public isSoundPlayEnable()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lai/advance/sdk/global/iqa/lib/IQAExtras;->f:Z

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
    .line 19
    .line 20
.end method
