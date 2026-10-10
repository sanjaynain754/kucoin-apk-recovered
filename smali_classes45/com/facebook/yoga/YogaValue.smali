.class public Lcom/facebook/yoga/YogaValue;
.super Ljava/lang/Object;
.source "YogaValue.java"


# static fields
.field public static final c:Lcom/facebook/yoga/YogaValue;

.field public static final d:Lcom/facebook/yoga/YogaValue;

.field public static final e:Lcom/facebook/yoga/YogaValue;


# instance fields
.field public final a:F

.field public final b:Lcom/facebook/yoga/YogaUnit;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/yoga/YogaValue;

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/yoga/YogaUnit;->UNDEFINED:Lcom/facebook/yoga/YogaUnit;

    .line 5
    .line 6
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v2, v1}, Lcom/facebook/yoga/YogaValue;-><init>(FLcom/facebook/yoga/YogaUnit;)V

    .line 10
    .line 11
    sput-object v0, Lcom/facebook/yoga/YogaValue;->c:Lcom/facebook/yoga/YogaValue;

    .line 12
    .line 13
    new-instance v0, Lcom/facebook/yoga/YogaValue;

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    sget-object v3, Lcom/facebook/yoga/YogaUnit;->POINT:Lcom/facebook/yoga/YogaUnit;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1, v3}, Lcom/facebook/yoga/YogaValue;-><init>(FLcom/facebook/yoga/YogaUnit;)V

    .line 20
    .line 21
    sput-object v0, Lcom/facebook/yoga/YogaValue;->d:Lcom/facebook/yoga/YogaValue;

    .line 22
    .line 23
    new-instance v0, Lcom/facebook/yoga/YogaValue;

    .line 24
    .line 25
    sget-object v1, Lcom/facebook/yoga/YogaUnit;->AUTO:Lcom/facebook/yoga/YogaUnit;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v2, v1}, Lcom/facebook/yoga/YogaValue;-><init>(FLcom/facebook/yoga/YogaUnit;)V

    .line 29
    .line 30
    sput-object v0, Lcom/facebook/yoga/YogaValue;->e:Lcom/facebook/yoga/YogaValue;

    .line 31
    return-void
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
.end method

.method public constructor <init>(FI)V
    .locals 0

    .line 4
    invoke-static {p2}, Lcom/facebook/yoga/YogaUnit;->fromInt(I)Lcom/facebook/yoga/YogaUnit;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/facebook/yoga/YogaValue;-><init>(FLcom/facebook/yoga/YogaUnit;)V

    return-void
.end method

.method public constructor <init>(FLcom/facebook/yoga/YogaUnit;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/facebook/yoga/YogaValue;->a:F

    .line 3
    iput-object p2, p0, Lcom/facebook/yoga/YogaValue;->b:Lcom/facebook/yoga/YogaUnit;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/yoga/YogaValue;
    .locals 3

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    .line 6
    .line 7
    :cond_0
    const-string/jumbo v0, "undefined"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    sget-object p0, Lcom/facebook/yoga/YogaValue;->c:Lcom/facebook/yoga/YogaValue;

    .line 16
    return-object p0

    .line 17
    .line 18
    :cond_1
    const-string v0, "auto"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    sget-object p0, Lcom/facebook/yoga/YogaValue;->e:Lcom/facebook/yoga/YogaValue;

    .line 27
    return-object p0

    .line 28
    .line 29
    :cond_2
    const-string v0, "%"

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 33
    move-result v0

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    new-instance v0, Lcom/facebook/yoga/YogaValue;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 41
    move-result v1

    .line 42
    .line 43
    add-int/lit8 v1, v1, -0x1

    .line 44
    const/4 v2, 0x0

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    move-result-object p0

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 52
    move-result p0

    .line 53
    .line 54
    sget-object v1, Lcom/facebook/yoga/YogaUnit;->PERCENT:Lcom/facebook/yoga/YogaUnit;

    .line 55
    .line 56
    .line 57
    invoke-direct {v0, p0, v1}, Lcom/facebook/yoga/YogaValue;-><init>(FLcom/facebook/yoga/YogaUnit;)V

    .line 58
    return-object v0

    .line 59
    .line 60
    :cond_3
    new-instance v0, Lcom/facebook/yoga/YogaValue;

    .line 61
    .line 62
    .line 63
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 64
    move-result p0

    .line 65
    .line 66
    sget-object v1, Lcom/facebook/yoga/YogaUnit;->POINT:Lcom/facebook/yoga/YogaUnit;

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, p0, v1}, Lcom/facebook/yoga/YogaValue;-><init>(FLcom/facebook/yoga/YogaUnit;)V

    .line 70
    return-object v0
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    .line 2
    instance-of v0, p1, Lcom/facebook/yoga/YogaValue;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    check-cast p1, Lcom/facebook/yoga/YogaValue;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/yoga/YogaValue;->b:Lcom/facebook/yoga/YogaUnit;

    .line 10
    .line 11
    iget-object v2, p1, Lcom/facebook/yoga/YogaValue;->b:Lcom/facebook/yoga/YogaUnit;

    .line 12
    .line 13
    if-ne v0, v2, :cond_2

    .line 14
    .line 15
    sget-object v2, Lcom/facebook/yoga/YogaUnit;->UNDEFINED:Lcom/facebook/yoga/YogaUnit;

    .line 16
    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    sget-object v2, Lcom/facebook/yoga/YogaUnit;->AUTO:Lcom/facebook/yoga/YogaUnit;

    .line 20
    .line 21
    if-eq v0, v2, :cond_1

    .line 22
    .line 23
    iget v0, p0, Lcom/facebook/yoga/YogaValue;->a:F

    .line 24
    .line 25
    iget p1, p1, Lcom/facebook/yoga/YogaValue;->a:F

    .line 26
    .line 27
    .line 28
    invoke-static {v0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 29
    move-result p1

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return v1

    .line 34
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 35
    return p1

    .line 36
    :cond_2
    return v1
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

.method public hashCode()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/yoga/YogaValue;->a:F

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/facebook/yoga/YogaValue;->b:Lcom/facebook/yoga/YogaUnit;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/facebook/yoga/YogaUnit;->intValue()I

    .line 12
    move-result v1

    .line 13
    add-int/2addr v0, v1

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/yoga/YogaValue$a;->a:[I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/facebook/yoga/YogaValue;->b:Lcom/facebook/yoga/YogaUnit;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    move-result v1

    .line 9
    .line 10
    aget v0, v0, v1

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    if-eq v0, v1, :cond_3

    .line 14
    const/4 v1, 0x2

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    const/4 v1, 0x3

    .line 18
    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    const/4 v1, 0x4

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    const-string v0, "auto"

    .line 25
    return-object v0

    .line 26
    .line 27
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 31
    throw v0

    .line 32
    .line 33
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    iget v1, p0, Lcom/facebook/yoga/YogaValue;->a:F

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v1, "%"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    .line 53
    :cond_2
    iget v0, p0, Lcom/facebook/yoga/YogaValue;->a:F

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 57
    move-result-object v0

    .line 58
    return-object v0

    .line 59
    .line 60
    .line 61
    :cond_3
    const-string/jumbo v0, "undefined"

    .line 62
    return-object v0
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
