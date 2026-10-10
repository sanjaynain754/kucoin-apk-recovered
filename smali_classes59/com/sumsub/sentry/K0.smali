.class public final Lcom/sumsub/sentry/K0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sentry/J0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Integer;

.field public final e:Ljava/lang/Integer;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/Boolean;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/Boolean;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/J0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sentry/J0;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sentry/K0;->Companion:Lcom/sumsub/sentry/J0;

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

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/sumsub/sentry/K0;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/sumsub/sentry/K0;->a:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v1, p0, Lcom/sumsub/sentry/K0;->b:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/sumsub/sentry/K0;->b:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/sumsub/sentry/K0;->c:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/sumsub/sentry/K0;->c:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v1, p0, Lcom/sumsub/sentry/K0;->d:Ljava/lang/Integer;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/sumsub/sentry/K0;->d:Ljava/lang/Integer;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v1, p0, Lcom/sumsub/sentry/K0;->e:Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/sumsub/sentry/K0;->e:Ljava/lang/Integer;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v1, p0, Lcom/sumsub/sentry/K0;->f:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/sumsub/sentry/K0;->f:Ljava/lang/String;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v1, p0, Lcom/sumsub/sentry/K0;->g:Ljava/lang/String;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/sumsub/sentry/K0;->g:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v1, p0, Lcom/sumsub/sentry/K0;->h:Ljava/lang/Boolean;

    goto :goto_7

    :cond_7
    iput-object p9, p0, Lcom/sumsub/sentry/K0;->h:Ljava/lang/Boolean;

    :goto_7
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object v1, p0, Lcom/sumsub/sentry/K0;->i:Ljava/lang/String;

    goto :goto_8

    :cond_8
    iput-object p10, p0, Lcom/sumsub/sentry/K0;->i:Ljava/lang/String;

    :goto_8
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object v1, p0, Lcom/sumsub/sentry/K0;->j:Ljava/lang/Boolean;

    goto :goto_9

    :cond_9
    iput-object p11, p0, Lcom/sumsub/sentry/K0;->j:Ljava/lang/Boolean;

    :goto_9
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_a

    iput-object v1, p0, Lcom/sumsub/sentry/K0;->k:Ljava/lang/String;

    goto :goto_a

    :cond_a
    iput-object p12, p0, Lcom/sumsub/sentry/K0;->k:Ljava/lang/String;

    :goto_a
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_b

    iput-object v1, p0, Lcom/sumsub/sentry/K0;->l:Ljava/lang/String;

    goto :goto_b

    :cond_b
    iput-object p13, p0, Lcom/sumsub/sentry/K0;->l:Ljava/lang/String;

    :goto_b
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_c

    iput-object v1, p0, Lcom/sumsub/sentry/K0;->m:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/sumsub/sentry/K0;->m:Ljava/lang/String;

    :goto_c
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_d

    iput-object v1, p0, Lcom/sumsub/sentry/K0;->n:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/sumsub/sentry/K0;->n:Ljava/lang/String;

    :goto_d
    and-int/lit16 p1, p1, 0x4000

    if-nez p1, :cond_e

    iput-object v1, p0, Lcom/sumsub/sentry/K0;->o:Ljava/lang/String;

    return-void

    :cond_e
    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/sumsub/sentry/K0;->o:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sumsub/sentry/K0;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/sumsub/sentry/K0;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/sumsub/sentry/K0;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/sumsub/sentry/K0;->d:Ljava/lang/Integer;

    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lcom/sumsub/sentry/K0;->e:Ljava/lang/Integer;

    .line 8
    iput-object p1, p0, Lcom/sumsub/sentry/K0;->f:Ljava/lang/String;

    .line 9
    iput-object p1, p0, Lcom/sumsub/sentry/K0;->g:Ljava/lang/String;

    .line 10
    iput-object p5, p0, Lcom/sumsub/sentry/K0;->h:Ljava/lang/Boolean;

    .line 11
    iput-object p1, p0, Lcom/sumsub/sentry/K0;->i:Ljava/lang/String;

    .line 12
    iput-object p6, p0, Lcom/sumsub/sentry/K0;->j:Ljava/lang/Boolean;

    .line 13
    iput-object p1, p0, Lcom/sumsub/sentry/K0;->k:Ljava/lang/String;

    .line 14
    iput-object p1, p0, Lcom/sumsub/sentry/K0;->l:Ljava/lang/String;

    .line 15
    iput-object p1, p0, Lcom/sumsub/sentry/K0;->m:Ljava/lang/String;

    .line 16
    iput-object p1, p0, Lcom/sumsub/sentry/K0;->n:Ljava/lang/String;

    .line 17
    iput-object p1, p0, Lcom/sumsub/sentry/K0;->o:Ljava/lang/String;

    return-void
.end method
