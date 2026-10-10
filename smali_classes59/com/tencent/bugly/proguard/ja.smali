.class public Lcom/tencent/bugly/proguard/ja;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static b:[Lcom/tencent/bugly/proguard/yi;


# instance fields
.field public a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    const/16 v0, 0x100

    .line 3
    .line 4
    new-array v0, v0, [Lcom/tencent/bugly/proguard/yi;

    .line 5
    .line 6
    sput-object v0, Lcom/tencent/bugly/proguard/ja;->b:[Lcom/tencent/bugly/proguard/yi;

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    :goto_0
    sget-object v1, Lcom/tencent/bugly/proguard/ja;->b:[Lcom/tencent/bugly/proguard/yi;

    .line 10
    array-length v2, v1

    .line 11
    .line 12
    if-ge v0, v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lcom/tencent/bugly/proguard/yi;

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/tencent/bugly/proguard/yi;-><init>(I)V

    .line 18
    .line 19
    aput-object v2, v1, v0

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
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
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lcom/tencent/bugly/proguard/ja;->a:I

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
.end method

.method public static a(BI)Lcom/tencent/bugly/proguard/ja;
    .locals 1

    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/f2;

    invoke-direct {v0, p0, p1}, Lcom/tencent/bugly/proguard/f2;-><init>(BI)V

    return-object v0
.end method

.method public static a(DI)Lcom/tencent/bugly/proguard/ja;
    .locals 1

    .line 7
    new-instance v0, Lcom/tencent/bugly/proguard/r4;

    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/bugly/proguard/r4;-><init>(DI)V

    return-object v0
.end method

.method public static a(FI)Lcom/tencent/bugly/proguard/ja;
    .locals 1

    .line 6
    new-instance v0, Lcom/tencent/bugly/proguard/c7;

    invoke-direct {v0, p0, p1}, Lcom/tencent/bugly/proguard/c7;-><init>(FI)V

    return-object v0
.end method

.method public static a(I)Lcom/tencent/bugly/proguard/ja;
    .locals 2

    if-ltz p0, :cond_0

    const/16 v0, 0xff

    if-ge p0, v0, :cond_0

    .line 12
    sget-object v0, Lcom/tencent/bugly/proguard/ja;->b:[Lcom/tencent/bugly/proguard/yi;

    aget-object p0, v0, p0

    return-object p0

    .line 13
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/ha;

    .line 14
    const-string v1, "invalid tag: "

    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/vi;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    .line 15
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/ha;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(II)Lcom/tencent/bugly/proguard/ja;
    .locals 1

    .line 4
    new-instance v0, Lcom/tencent/bugly/proguard/ea;

    invoke-direct {v0, p0, p1}, Lcom/tencent/bugly/proguard/ea;-><init>(II)V

    return-object v0
.end method

.method public static a(JI)Lcom/tencent/bugly/proguard/ja;
    .locals 1

    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/gb;

    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/bugly/proguard/gb;-><init>(JI)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;I)Lcom/tencent/bugly/proguard/ja;
    .locals 1

    .line 8
    new-instance v0, Lcom/tencent/bugly/proguard/qg;

    invoke-direct {v0, p0, p1}, Lcom/tencent/bugly/proguard/qg;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method public static a(SI)Lcom/tencent/bugly/proguard/ja;
    .locals 1

    .line 3
    new-instance v0, Lcom/tencent/bugly/proguard/jg;

    invoke-direct {v0, p0, p1}, Lcom/tencent/bugly/proguard/jg;-><init>(SI)V

    return-object v0
.end method

.method public static a([BI)Lcom/tencent/bugly/proguard/ja;
    .locals 1

    .line 9
    new-instance v0, Lcom/tencent/bugly/proguard/e2;

    invoke-direct {v0, p0, p1}, Lcom/tencent/bugly/proguard/e2;-><init>([BI)V

    return-object v0
.end method

.method public static a([Lcom/tencent/bugly/proguard/ja;I)Lcom/tencent/bugly/proguard/ja;
    .locals 1

    .line 10
    new-instance v0, Lcom/tencent/bugly/proguard/ya;

    invoke-direct {v0, p0, p1}, Lcom/tencent/bugly/proguard/ya;-><init>([Lcom/tencent/bugly/proguard/ja;I)V

    return-object v0
.end method

.method public static a([Lcom/tencent/bugly/proguard/ja;[Lcom/tencent/bugly/proguard/ja;I)Lcom/tencent/bugly/proguard/ja;
    .locals 1

    .line 11
    new-instance v0, Lcom/tencent/bugly/proguard/ob;

    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/bugly/proguard/ob;-><init>([Lcom/tencent/bugly/proguard/ja;[Lcom/tencent/bugly/proguard/ja;I)V

    return-object v0
.end method

.method public static b([Lcom/tencent/bugly/proguard/ja;I)Lcom/tencent/bugly/proguard/ja;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/rg;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/bugly/proguard/rg;-><init>([Lcom/tencent/bugly/proguard/ja;I)V

    .line 6
    return-object v0
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
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/bugly/proguard/ja;->a:I

    return v0
.end method
