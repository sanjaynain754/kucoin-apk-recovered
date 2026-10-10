.class public final Lqa0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lqa0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lqa0/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lqa0/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lqa0/a;->a:Lqa0/a;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public final a(I)Lcom/revolut/revolutpay/api/params/BoxText;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    sget-object p1, Lcom/revolut/revolutpay/api/params/BoxText;->GET_CASHBACK_VALUE:Lcom/revolut/revolutpay/api/params/BoxText;

    .line 9
    return-object p1

    .line 10
    .line 11
    :cond_1
    :goto_0
    sget-object p1, Lcom/revolut/revolutpay/api/params/BoxText;->NONE:Lcom/revolut/revolutpay/api/params/BoxText;

    .line 12
    return-object p1
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

.method public final b(I)Lcom/revolut/revolutpay/api/params/BoxTextCurrency;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_2

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    const/4 v0, 0x2

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    sget-object p1, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->USD:Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 12
    return-object p1

    .line 13
    .line 14
    :cond_1
    sget-object p1, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->EUR:Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 15
    return-object p1

    .line 16
    .line 17
    :cond_2
    :goto_0
    sget-object p1, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->GBP:Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final c(I)Lcom/revolut/revolutpay/api/params/BoxTextValue;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    sget-object p1, Lcom/revolut/revolutpay/api/params/BoxTextValue;->MEDIUM:Lcom/revolut/revolutpay/api/params/BoxTextValue;

    .line 9
    return-object p1

    .line 10
    .line 11
    :cond_1
    :goto_0
    sget-object p1, Lcom/revolut/revolutpay/api/params/BoxTextValue;->HIGH:Lcom/revolut/revolutpay/api/params/BoxTextValue;

    .line 12
    return-object p1
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

.method public final d(I)Lcom/revolut/revolutpay/api/params/Radius;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eq p1, v0, :cond_2

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    const/4 v0, 0x3

    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    sget-object p1, Lcom/revolut/revolutpay/api/params/Radius;->NONE:Lcom/revolut/revolutpay/api/params/Radius;

    .line 12
    return-object p1

    .line 13
    .line 14
    :cond_0
    sget-object p1, Lcom/revolut/revolutpay/api/params/Radius;->LARGE:Lcom/revolut/revolutpay/api/params/Radius;

    .line 15
    return-object p1

    .line 16
    .line 17
    :cond_1
    sget-object p1, Lcom/revolut/revolutpay/api/params/Radius;->MEDIUM:Lcom/revolut/revolutpay/api/params/Radius;

    .line 18
    return-object p1

    .line 19
    .line 20
    :cond_2
    sget-object p1, Lcom/revolut/revolutpay/api/params/Radius;->SMALL:Lcom/revolut/revolutpay/api/params/Radius;

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final e(I)Lcom/revolut/revolutpay/api/params/Size;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eq p1, v0, :cond_2

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    const/4 v0, 0x3

    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    sget-object p1, Lcom/revolut/revolutpay/api/params/Size;->LARGE:Lcom/revolut/revolutpay/api/params/Size;

    .line 12
    return-object p1

    .line 13
    .line 14
    :cond_0
    sget-object p1, Lcom/revolut/revolutpay/api/params/Size;->EXTRA_SMALL:Lcom/revolut/revolutpay/api/params/Size;

    .line 15
    return-object p1

    .line 16
    .line 17
    :cond_1
    sget-object p1, Lcom/revolut/revolutpay/api/params/Size;->SMALL:Lcom/revolut/revolutpay/api/params/Size;

    .line 18
    return-object p1

    .line 19
    .line 20
    :cond_2
    sget-object p1, Lcom/revolut/revolutpay/api/params/Size;->MEDIUM:Lcom/revolut/revolutpay/api/params/Size;

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final f(I)Lcom/revolut/revolutpay/api/params/Variant;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_2

    .line 3
    const/4 v0, 0x2

    .line 4
    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    const/4 v0, 0x3

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    sget-object p1, Lcom/revolut/revolutpay/api/params/Variant;->DARK:Lcom/revolut/revolutpay/api/params/Variant;

    .line 11
    return-object p1

    .line 12
    .line 13
    :cond_0
    sget-object p1, Lcom/revolut/revolutpay/api/params/Variant;->DARK_OUTLINED:Lcom/revolut/revolutpay/api/params/Variant;

    .line 14
    return-object p1

    .line 15
    .line 16
    :cond_1
    sget-object p1, Lcom/revolut/revolutpay/api/params/Variant;->LIGHT_OUTLINED:Lcom/revolut/revolutpay/api/params/Variant;

    .line 17
    return-object p1

    .line 18
    .line 19
    :cond_2
    sget-object p1, Lcom/revolut/revolutpay/api/params/Variant;->LIGHT:Lcom/revolut/revolutpay/api/params/Variant;

    .line 20
    return-object p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final g(I)Lcom/revolut/revolutpay/api/params/Variant;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eq p1, v0, :cond_2

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    const/4 v0, 0x3

    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    sget-object p1, Lcom/revolut/revolutpay/api/params/Variant;->LIGHT:Lcom/revolut/revolutpay/api/params/Variant;

    .line 12
    return-object p1

    .line 13
    .line 14
    :cond_0
    sget-object p1, Lcom/revolut/revolutpay/api/params/Variant;->DARK_OUTLINED:Lcom/revolut/revolutpay/api/params/Variant;

    .line 15
    return-object p1

    .line 16
    .line 17
    :cond_1
    sget-object p1, Lcom/revolut/revolutpay/api/params/Variant;->LIGHT_OUTLINED:Lcom/revolut/revolutpay/api/params/Variant;

    .line 18
    return-object p1

    .line 19
    .line 20
    :cond_2
    sget-object p1, Lcom/revolut/revolutpay/api/params/Variant;->DARK:Lcom/revolut/revolutpay/api/params/Variant;

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
.end method
