.class public final Lua0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lua0/a$a;
    }
.end annotation


# static fields
.field public static final b:Lua0/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lxa0/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lua0/a$a;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lua0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lua0/a;->b:Lua0/a$a;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>(Lxa0/b;)V
    .locals 1
    .param p1    # Lxa0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "image"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lua0/a;->a:Lxa0/b;

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
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;)Lva0/a;
    .locals 4

    .line 1
    .line 2
    sget v0, Lcom/revolut/revolutpay/R$color;->internalRevolutPayUiKit_foreground:I

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lwa0/a;->d(Landroid/content/Context;I)I

    .line 6
    move-result v0

    .line 7
    .line 8
    new-instance v1, Lva0/a;

    .line 9
    .line 10
    const/high16 v2, 0x41800000    # 16.0f

    .line 11
    .line 12
    const/16 v3, 0x28

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p2, v0, v2, v3}, Lva0/a;-><init>(Ljava/lang/CharSequence;IFI)V

    .line 16
    .line 17
    sget p2, Lcom/revolut/revolutpay/R$color;->internalRevolutPayUiKit_greyTone20:I

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Lwa0/a;->d(Landroid/content/Context;I)I

    .line 21
    move-result p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lva0/a;->a(I)V

    .line 25
    return-object v1
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

.method public final b(Landroid/widget/ImageView;)V
    .locals 3
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "imageView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lua0/a;->a:Lxa0/b;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lxa0/b;->a()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    const-string v1, "https://assets.revolut.com/assets/flags/%s.webp"

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    const-string v1, "format(this, *args)"

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    const-string v2, "imageView.context"

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    iget-object v2, p0, Lua0/a;->a:Lxa0/b;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Lxa0/b;->a()Ljava/lang/String;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v1, v2}, Lua0/a;->a(Landroid/content/Context;Ljava/lang/String;)Lva0/a;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Lcom/bumptech/glide/c;->u(Landroid/view/View;)Lcom/bumptech/glide/h;

    .line 54
    move-result-object v2

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v0}, Lcom/bumptech/glide/h;->v(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ll2/a;->c0(Landroid/graphics/drawable/Drawable;)Ll2/a;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    check-cast v0, Lcom/bumptech/glide/g;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ll2/a;->n(Landroid/graphics/drawable/Drawable;)Ll2/a;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    check-cast v0, Lcom/bumptech/glide/g;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/g;->E0(Landroid/widget/ImageView;)Lm2/k;

    .line 74
    return-void
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
