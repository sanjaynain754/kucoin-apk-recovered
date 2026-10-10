.class public abstract Lcom/sumsub/sns/core/data/model/SNSException;
.super Ljava/lang/Exception;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/core/data/model/SNSException$Api;,
        Lcom/sumsub/sns/core/data/model/SNSException$Internal;,
        Lcom/sumsub/sns/core/data/model/SNSException$Network;,
        Lcom/sumsub/sns/core/data/model/SNSException$Unknown;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0007\u0008\t\nB\u0015\u0008\u0004\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0004\u000b\u000c\r\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/sumsub/sns/core/data/model/SNSException;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "wrap",
        "",
        "<init>",
        "(Ljava/lang/Throwable;)V",
        "Api",
        "Network",
        "Unknown",
        "Internal",
        "Lcom/sumsub/sns/core/data/model/SNSException$Api;",
        "Lcom/sumsub/sns/core/data/model/SNSException$Internal;",
        "Lcom/sumsub/sns/core/data/model/SNSException$Network;",
        "Lcom/sumsub/sns/core/data/model/SNSException$Unknown;",
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


# direct methods
.method private constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    move-object p1, p3

    .line 3
    :cond_0
    invoke-direct {p0, p1, p3}, Lcom/sumsub/sns/core/data/model/SNSException;-><init>(Ljava/lang/Throwable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Throwable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/data/model/SNSException;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method
