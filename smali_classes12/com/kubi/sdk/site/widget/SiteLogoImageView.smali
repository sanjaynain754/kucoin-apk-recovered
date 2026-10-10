.class public final Lcom/kubi/sdk/site/widget/SiteLogoImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SiteLogoImageView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/kubi/sdk/site/widget/SiteLogoImageView;",
        "Landroidx/appcompat/widget/AppCompatImageView;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "load",
        "",
        "logoConfigKey",
        "Lcom/kubi/sdk/site/SiteExtConfigKey;",
        "int2SiteExtConfigKey",
        "siteIndex",
        "",
        "LSiteConfig_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "attrs"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    sget-object v0, Lcom/kubi/sdk/site/config/R$styleable;->SiteLogoImageView:[I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    const-string p2, "obtainStyledAttributes(...)"

    .line 22
    .line 23
    .line 24
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    sget p2, Lcom/kubi/sdk/site/config/R$styleable;->SiteLogoImageView_siteLogo:I

    .line 27
    const/4 v0, 0x0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 31
    move-result p2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p2}, Lcom/kubi/sdk/site/widget/SiteLogoImageView;->a(I)Lcom/kubi/sdk/site/SiteExtConfigKey;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/site/widget/SiteLogoImageView;->b(Lcom/kubi/sdk/site/SiteExtConfigKey;)V

    .line 42
    return-void
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


# virtual methods
.method public final a(I)Lcom/kubi/sdk/site/SiteExtConfigKey;
    .locals 0

    .line 1
    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    sget-object p1, Lcom/kubi/sdk/site/SiteExtConfigKey;->LogoGeneralGreenPng:Lcom/kubi/sdk/site/SiteExtConfigKey;

    .line 6
    return-object p1

    .line 7
    .line 8
    :pswitch_0
    sget-object p1, Lcom/kubi/sdk/site/SiteExtConfigKey;->LogoOrganBlackPng:Lcom/kubi/sdk/site/SiteExtConfigKey;

    .line 9
    return-object p1

    .line 10
    .line 11
    :pswitch_1
    sget-object p1, Lcom/kubi/sdk/site/SiteExtConfigKey;->LogoOrganWhitePng:Lcom/kubi/sdk/site/SiteExtConfigKey;

    .line 12
    return-object p1

    .line 13
    .line 14
    :pswitch_2
    sget-object p1, Lcom/kubi/sdk/site/SiteExtConfigKey;->LogoCollegePng:Lcom/kubi/sdk/site/SiteExtConfigKey;

    .line 15
    return-object p1

    .line 16
    .line 17
    :pswitch_3
    sget-object p1, Lcom/kubi/sdk/site/SiteExtConfigKey;->LogoFuturePng:Lcom/kubi/sdk/site/SiteExtConfigKey;

    .line 18
    return-object p1

    .line 19
    .line 20
    :pswitch_4
    sget-object p1, Lcom/kubi/sdk/site/SiteExtConfigKey;->LogoBigGrayPng:Lcom/kubi/sdk/site/SiteExtConfigKey;

    .line 21
    return-object p1

    .line 22
    .line 23
    :pswitch_5
    sget-object p1, Lcom/kubi/sdk/site/SiteExtConfigKey;->LogoBigGreenPng:Lcom/kubi/sdk/site/SiteExtConfigKey;

    .line 24
    return-object p1

    .line 25
    .line 26
    :pswitch_6
    sget-object p1, Lcom/kubi/sdk/site/SiteExtConfigKey;->LogoSmallPng:Lcom/kubi/sdk/site/SiteExtConfigKey;

    .line 27
    return-object p1

    .line 28
    .line 29
    :pswitch_7
    sget-object p1, Lcom/kubi/sdk/site/SiteExtConfigKey;->LogoGeneralBlackPng:Lcom/kubi/sdk/site/SiteExtConfigKey;

    .line 30
    return-object p1

    .line 31
    .line 32
    :pswitch_8
    sget-object p1, Lcom/kubi/sdk/site/SiteExtConfigKey;->LogoGeneralGrayPng:Lcom/kubi/sdk/site/SiteExtConfigKey;

    .line 33
    return-object p1

    .line 34
    .line 35
    :pswitch_9
    sget-object p1, Lcom/kubi/sdk/site/SiteExtConfigKey;->LogoGeneralWhitePng:Lcom/kubi/sdk/site/SiteExtConfigKey;

    .line 36
    return-object p1

    .line 37
    .line 38
    :pswitch_a
    sget-object p1, Lcom/kubi/sdk/site/SiteExtConfigKey;->LogoGeneralGreenPng:Lcom/kubi/sdk/site/SiteExtConfigKey;

    .line 39
    return-object p1

    .line 40
    nop

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lcom/kubi/sdk/site/SiteExtConfigKey;)V
    .locals 2
    .param p1    # Lcom/kubi/sdk/site/SiteExtConfigKey;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "logoConfigKey"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/sdk/site/SiteExtConfigKey;->getPlaceholder()I

    .line 9
    move-result v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/kubi/sdk/site/b;->d(Lcom/kubi/sdk/site/SiteExtConfigKey;)Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Lcom/bumptech/glide/c;->u(Landroid/view/View;)Lcom/bumptech/glide/h;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lcom/bumptech/glide/h;->v(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/kubi/sdk/site/SiteExtConfigKey;->getPlaceholder()I

    .line 34
    move-result p1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ll2/a;->b0(I)Ll2/a;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    check-cast p1, Lcom/bumptech/glide/g;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/g;->E0(Landroid/widget/ImageView;)Lm2/k;

    .line 44
    :cond_0
    return-void
    .line 45
.end method
