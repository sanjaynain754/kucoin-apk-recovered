.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/session/n;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/common/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/core/common/a;

    .line 6
    .line 7
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/core/common/a;-><init>(Landroid/graphics/Bitmap$Config;)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/n;->a:Lcom/sumsub/sns/internal/core/common/a;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/prooface/session/n;II)Landroid/graphics/Bitmap;
    .locals 0

    .line 9
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/n;->a:Lcom/sumsub/sns/internal/core/common/a;

    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/core/common/a;->a(II)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroidx/camera/core/ImageProxy;F)Lcom/sumsub/sns/internal/features/data/model/prooface/f;
    .locals 3

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/i1;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/i1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/n;)V

    invoke-static {p1, v0}, Lcom/sumsub/sns/internal/core/common/H;->a(Landroidx/camera/core/ImageProxy;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    check-cast p1, Landroid/graphics/Bitmap;

    .line 3
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/b;->a(Landroid/graphics/Bitmap;)Lkotlin/Pair;

    move-result-object p1

    .line 4
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const v2, 0xffffff

    and-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "#%06X"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 5
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    .line 6
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    .line 7
    invoke-direct {v1, p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/model/prooface/f;-><init>(FFLjava/lang/String;)V

    return-object v1

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Failed to convert imageProxy to bitmap"

    invoke-direct {p1, p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method
