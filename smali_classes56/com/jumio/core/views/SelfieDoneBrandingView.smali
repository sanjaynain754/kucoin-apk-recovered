.class public final Lcom/jumio/core/views/SelfieDoneBrandingView;
.super Lcom/jumio/core/views/BaseBrandingView;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/jumio/core/views/SelfieDoneBrandingView;",
        "Lcom/jumio/core/views/BaseBrandingView;",
        "context",
        "Landroid/content/Context;",
        "tintColorId",
        "",
        "<init>",
        "(Landroid/content/Context;I)V",
        "jumio-core_release"
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
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget v0, Lcom/jumio/core/R$drawable;->jumio_ic_selfie_done:I

    const-string v1, "jumio_selfie_done_branding_view"

    invoke-direct {p0, p1, v1, v0, p2}, Lcom/jumio/core/views/BaseBrandingView;-><init>(Landroid/content/Context;Ljava/lang/String;II)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    sget p2, Lcom/jumio/core/R$color;->jumio_black:I

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/jumio/core/views/SelfieDoneBrandingView;-><init>(Landroid/content/Context;I)V

    return-void
.end method
