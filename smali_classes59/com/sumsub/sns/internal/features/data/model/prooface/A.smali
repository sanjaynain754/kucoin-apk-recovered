.class public final Lcom/sumsub/sns/internal/features/data/model/prooface/A;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sns/internal/features/data/model/prooface/z;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/sumsub/sns/internal/features/data/model/prooface/P;

.field public final c:Lcom/sumsub/sns/internal/features/data/model/prooface/u;

.field public final d:Lcom/sumsub/sns/internal/features/data/model/prooface/r;

.field public final e:Lcom/sumsub/sns/internal/features/data/model/prooface/M;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/prooface/z;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/prooface/z;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->Companion:Lcom/sumsub/sns/internal/features/data/model/prooface/z;

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

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/sumsub/sns/internal/features/data/model/prooface/P;Lcom/sumsub/sns/internal/features/data/model/prooface/u;Lcom/sumsub/sns/internal/features/data/model/prooface/r;Lcom/sumsub/sns/internal/features/data/model/prooface/M;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->a:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->b:Lcom/sumsub/sns/internal/features/data/model/prooface/P;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->b:Lcom/sumsub/sns/internal/features/data/model/prooface/P;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->c:Lcom/sumsub/sns/internal/features/data/model/prooface/u;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->c:Lcom/sumsub/sns/internal/features/data/model/prooface/u;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->d:Lcom/sumsub/sns/internal/features/data/model/prooface/r;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->d:Lcom/sumsub/sns/internal/features/data/model/prooface/r;

    :goto_3
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->e:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    return-void

    :cond_4
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->e:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/prooface/P;Lcom/sumsub/sns/internal/features/data/model/prooface/u;I)V
    .locals 2

    and-int/lit8 v0, p4, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p2, v1

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v1

    .line 2
    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->b:Lcom/sumsub/sns/internal/features/data/model/prooface/P;

    .line 5
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->c:Lcom/sumsub/sns/internal/features/data/model/prooface/u;

    .line 6
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->d:Lcom/sumsub/sns/internal/features/data/model/prooface/r;

    .line 7
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->e:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    return-void
.end method
