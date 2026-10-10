.class public interface abstract Lcom/jumio/core/processor/ProcessorImage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/processor/ProcessorImage$BaseImage;,
        Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;,
        Lcom/jumio/core/processor/ProcessorImage$Companion;,
        Lcom/jumio/core/processor/ProcessorImage$FlashImage;,
        Lcom/jumio/core/processor/ProcessorImage$TiltedImage;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u0000 \u00122\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u0082\u0001\u0004\u0013\u0014\u0015\u0016\u00a8\u0006\u0017\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/jumio/core/processor/ProcessorImage;",
        "Ljava/io/Serializable;",
        "classifier",
        "",
        "getClassifier",
        "()Ljava/lang/String;",
        "holdStillTime",
        "",
        "getHoldStillTime",
        "()J",
        "usabilityExpected",
        "",
        "getUsabilityExpected",
        "()Z",
        "BaseImage",
        "FlashImage",
        "TiltedImage",
        "ChallengeImage",
        "Companion",
        "Lcom/jumio/core/processor/ProcessorImage$BaseImage;",
        "Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;",
        "Lcom/jumio/core/processor/ProcessorImage$FlashImage;",
        "Lcom/jumio/core/processor/ProcessorImage$TiltedImage;",
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


# static fields
.field public static final Companion:Lcom/jumio/core/processor/ProcessorImage$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final DEFAULT_HOLD_STILL_TIME:J = 0x5dcL


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/core/processor/ProcessorImage$Companion;->a:Lcom/jumio/core/processor/ProcessorImage$Companion;

    .line 3
    .line 4
    sput-object v0, Lcom/jumio/core/processor/ProcessorImage;->Companion:Lcom/jumio/core/processor/ProcessorImage$Companion;

    .line 5
    return-void
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
.end method


# virtual methods
.method public abstract getClassifier()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getHoldStillTime()J
.end method

.method public abstract getUsabilityExpected()Z
.end method
