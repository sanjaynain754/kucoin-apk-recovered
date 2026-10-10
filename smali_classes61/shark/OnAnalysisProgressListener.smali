.class public interface abstract Lshark/OnAnalysisProgressListener;
.super Ljava/lang/Object;
.source "OnAnalysisProgressListener.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lshark/OnAnalysisProgressListener$Step;,
        Lshark/OnAnalysisProgressListener$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u00e6\u0080\u0001\u0018\u00002\u00020\u0001:\u0002\u0007\u0008J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lshark/OnAnalysisProgressListener;",
        "",
        "Lshark/OnAnalysisProgressListener$Step;",
        "step",
        "",
        "onAnalysisProgress",
        "(Lshark/OnAnalysisProgressListener$Step;)V",
        "Companion",
        "Step",
        "shark"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# virtual methods
.method public abstract onAnalysisProgress(Lshark/OnAnalysisProgressListener$Step;)V
    .param p1    # Lshark/OnAnalysisProgressListener$Step;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
