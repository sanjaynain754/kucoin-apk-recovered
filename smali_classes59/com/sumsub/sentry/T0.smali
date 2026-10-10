.class public final Lcom/sumsub/sentry/T0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sentry/S0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:Ljava/lang/Integer;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/Boolean;

.field public f:Ljava/lang/Boolean;

.field public final g:Ljava/lang/Boolean;

.field public final h:Lcom/sumsub/sentry/N0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/S0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sentry/S0;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sentry/T0;->Companion:Lcom/sumsub/sentry/S0;

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

.method public synthetic constructor <init>(ILjava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sumsub/sentry/N0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/sumsub/sentry/T0;->a:Ljava/lang/Long;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/sumsub/sentry/T0;->a:Ljava/lang/Long;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v1, p0, Lcom/sumsub/sentry/T0;->b:Ljava/lang/Integer;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/sumsub/sentry/T0;->b:Ljava/lang/Integer;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/sumsub/sentry/T0;->c:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/sumsub/sentry/T0;->c:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v1, p0, Lcom/sumsub/sentry/T0;->d:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/sumsub/sentry/T0;->d:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v1, p0, Lcom/sumsub/sentry/T0;->e:Ljava/lang/Boolean;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/sumsub/sentry/T0;->e:Ljava/lang/Boolean;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v1, p0, Lcom/sumsub/sentry/T0;->f:Ljava/lang/Boolean;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/sumsub/sentry/T0;->f:Ljava/lang/Boolean;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v1, p0, Lcom/sumsub/sentry/T0;->g:Ljava/lang/Boolean;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/sumsub/sentry/T0;->g:Ljava/lang/Boolean;

    :goto_6
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_7

    iput-object v1, p0, Lcom/sumsub/sentry/T0;->h:Lcom/sumsub/sentry/N0;

    return-void

    :cond_7
    iput-object p9, p0, Lcom/sumsub/sentry/T0;->h:Lcom/sumsub/sentry/N0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sumsub/sentry/N0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sumsub/sentry/T0;->a:Ljava/lang/Long;

    .line 4
    iput-object p2, p0, Lcom/sumsub/sentry/T0;->b:Ljava/lang/Integer;

    .line 5
    iput-object p3, p0, Lcom/sumsub/sentry/T0;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/sumsub/sentry/T0;->d:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/sumsub/sentry/T0;->e:Ljava/lang/Boolean;

    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lcom/sumsub/sentry/T0;->f:Ljava/lang/Boolean;

    .line 9
    iput-object p6, p0, Lcom/sumsub/sentry/T0;->g:Ljava/lang/Boolean;

    .line 10
    iput-object p7, p0, Lcom/sumsub/sentry/T0;->h:Lcom/sumsub/sentry/N0;

    return-void
.end method
