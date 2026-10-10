.class public final Lcom/revolut/revolutpay/api/params/PromoBannerUiParams$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revolut/revolutpay/api/params/PromoBannerUiParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/revolut/revolutpay/api/params/PromoBannerUiParams$Companion;",
        "",
        "()V",
        "default",
        "Lcom/revolut/revolutpay/api/params/PromoBannerUiParams;",
        "revolut_pay_sdk_2_0_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/revolut/revolutpay/api/params/PromoBannerUiParams$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final default()Lcom/revolut/revolutpay/api/params/PromoBannerUiParams;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/revolut/revolutpay/api/params/PromoBannerUiParams;

    .line 3
    .line 4
    const-string v1, "#0666EB"

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 8
    move-result v3

    .line 9
    .line 10
    sget-object v4, Lya0/a;->d:Lya0/a;

    .line 11
    .line 12
    sget-object v5, Lya0/b;->d:Lya0/b;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    const/high16 v2, 0x41400000    # 12.0f

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v5}, Lcom/revolut/revolutpay/api/params/PromoBannerUiParams;-><init>(FFILya0/c;Lya0/c;)V

    .line 19
    return-object v0
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
.end method
