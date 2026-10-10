.class public final Lcom/sumsub/sentry/q0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sentry/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Long;

.field public final e:Lcom/sumsub/sentry/N0;

.field public final f:Lcom/sumsub/sentry/J;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/p0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sentry/p0;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sentry/q0;->Companion:Lcom/sumsub/sentry/p0;

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

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/sumsub/sentry/N0;Lcom/sumsub/sentry/J;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/sumsub/sentry/q0;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/sumsub/sentry/q0;->a:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v1, p0, Lcom/sumsub/sentry/q0;->b:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/sumsub/sentry/q0;->b:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/sumsub/sentry/q0;->c:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/sumsub/sentry/q0;->c:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v1, p0, Lcom/sumsub/sentry/q0;->d:Ljava/lang/Long;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/sumsub/sentry/q0;->d:Ljava/lang/Long;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v1, p0, Lcom/sumsub/sentry/q0;->e:Lcom/sumsub/sentry/N0;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/sumsub/sentry/q0;->e:Lcom/sumsub/sentry/N0;

    :goto_4
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_5

    iput-object v1, p0, Lcom/sumsub/sentry/q0;->f:Lcom/sumsub/sentry/J;

    return-void

    :cond_5
    iput-object p7, p0, Lcom/sumsub/sentry/q0;->f:Lcom/sumsub/sentry/J;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/sumsub/sentry/N0;Lcom/sumsub/sentry/J;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sumsub/sentry/q0;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/sumsub/sentry/q0;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/sumsub/sentry/q0;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/sumsub/sentry/q0;->d:Ljava/lang/Long;

    .line 7
    iput-object p5, p0, Lcom/sumsub/sentry/q0;->e:Lcom/sumsub/sentry/N0;

    .line 8
    iput-object p6, p0, Lcom/sumsub/sentry/q0;->f:Lcom/sumsub/sentry/J;

    return-void
.end method
