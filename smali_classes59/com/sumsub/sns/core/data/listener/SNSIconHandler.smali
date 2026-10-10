.class public interface abstract Lcom/sumsub/sns/core/data/listener/SNSIconHandler;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;,
        Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;,
        Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;,
        Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSPaymentMethodIcons;,
        Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSRestrictionsIcons;,
        Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008g\u0018\u00002\u00020\u0001:\u0006\u0008\t\n\u000b\u000c\rJ\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;",
        "",
        "onResolveIcon",
        "Landroid/graphics/drawable/Drawable;",
        "context",
        "Landroid/content/Context;",
        "key",
        "",
        "SNSResultIcons",
        "SNSEidIcons",
        "SNSCommonIcons",
        "SNSRestrictionsIcons",
        "SNSPaymentMethodIcons",
        "SNSIdentityTypeIcons",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
