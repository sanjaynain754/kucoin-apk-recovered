.class public Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$b;,
        Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$a;
    }
.end annotation


# static fields
.field private static volatile af:Z = true

.field private static volatile ag:Z

.field public static volatile j:Z

.field public static volatile k:Z


# instance fields
.field private A:I

.field private B:I

.field private C:J

.field private D:J

.field private E:I

.field private F:Z

.field private G:Landroid/content/Context;

.field private H:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private I:Lcom/tencent/liteav/txcvodplayer/renderer/a;

.field private J:I

.field private K:I

.field private L:Ljava/lang/String;

.field private M:F

.field private N:J

.field private O:J

.field private volatile P:Z

.field private Q:I

.field private R:I

.field private S:F

.field private T:Z

.field private U:I

.field private V:I

.field private W:I

.field public a:I

.field private aa:I

.field private ab:Z

.field private ac:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$b;

.field private ad:Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;

.field private ae:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$i;

.field private ah:Ljava/lang/String;

.field private ai:I

.field private aj:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;",
            ">;"
        }
    .end annotation
.end field

.field private ak:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$d;

.field private al:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$f;

.field private am:I

.field private an:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$e;

.field private ao:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$h;

.field private ap:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$i;

.field private aq:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$b;

.field private ar:I

.field private as:Lcom/tencent/liteav/txcplayer/d;

.field private at:Z

.field public b:I

.field public c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

.field public d:Lcom/tencent/liteav/txcplayer/e;

.field protected e:Z

.field protected final f:I

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$b;",
            ">;"
        }
    .end annotation
.end field

.field public l:Z

.field public m:Ljava/lang/String;

.field public n:I

.field public o:I

.field public p:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field q:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$j;

.field r:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$g;

.field s:Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService$IRenderServiceEventListener;

.field t:Lcom/tencent/liteav/txcvodplayer/renderer/a$a;

.field public u:Landroid/os/Handler;

.field private v:Lcom/tencent/liteav/txcvodplayer/renderer/a$b;

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
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
    .line 17
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    .line 3
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:I

    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v:Lcom/tencent/liteav/txcvodplayer/renderer/a$b;

    .line 5
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 6
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->F:Z

    const/high16 v2, 0x3f800000    # 1.0f

    .line 7
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->M:F

    const/4 v2, 0x1

    .line 8
    iput-boolean v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e:Z

    const/4 v2, 0x2

    .line 9
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f:I

    .line 10
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->P:Z

    const/4 v2, -0x1

    .line 11
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    const/16 v3, 0x64

    .line 12
    iput v3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->R:I

    const/high16 v3, -0x3d380000    # -100.0f

    .line 13
    iput v3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->S:F

    .line 14
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->T:Z

    const/16 v3, -0x3e8

    .line 15
    iput v3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->U:I

    .line 16
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->V:I

    .line 17
    iput v3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->W:I

    .line 18
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aa:I

    .line 19
    new-instance v3, Ljava/lang/Object;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g:Ljava/lang/Object;

    .line 20
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/Object;

    .line 21
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l:Z

    .line 22
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n:I

    .line 23
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o:I

    .line 24
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->p:Ljava/util/Map;

    .line 25
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ai:I

    .line 26
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->q:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$j;

    .line 27
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->r:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$g;

    .line 28
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ak:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$d;

    .line 29
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->al:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$f;

    .line 30
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$11;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$11;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->an:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$e;

    .line 31
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ao:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$h;

    .line 32
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ap:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$i;

    .line 33
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$2;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$2;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aq:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$b;

    .line 34
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$3;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$3;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s:Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService$IRenderServiceEventListener;

    .line 35
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$4;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$4;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->t:Lcom/tencent/liteav/txcvodplayer/renderer/a$a;

    .line 36
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ar:I

    .line 37
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->at:Z

    .line 38
    invoke-direct {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 39
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 40
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    .line 41
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:I

    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v:Lcom/tencent/liteav/txcvodplayer/renderer/a$b;

    .line 43
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 44
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->F:Z

    const/high16 v1, 0x3f800000    # 1.0f

    .line 45
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->M:F

    const/4 v1, 0x1

    .line 46
    iput-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e:Z

    const/4 v1, 0x2

    .line 47
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f:I

    .line 48
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->P:Z

    const/4 v1, -0x1

    .line 49
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    const/16 v2, 0x64

    .line 50
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->R:I

    const/high16 v2, -0x3d380000    # -100.0f

    .line 51
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->S:F

    .line 52
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->T:Z

    const/16 v2, -0x3e8

    .line 53
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->U:I

    .line 54
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->V:I

    .line 55
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->W:I

    .line 56
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aa:I

    .line 57
    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g:Ljava/lang/Object;

    .line 58
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/Object;

    .line 59
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l:Z

    .line 60
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n:I

    .line 61
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o:I

    .line 62
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->p:Ljava/util/Map;

    .line 63
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ai:I

    .line 64
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->q:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$j;

    .line 65
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->r:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$g;

    .line 66
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ak:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$d;

    .line 67
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->al:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$f;

    .line 68
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$11;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$11;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->an:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$e;

    .line 69
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ao:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$h;

    .line 70
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ap:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$i;

    .line 71
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$2;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$2;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aq:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$b;

    .line 72
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$3;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$3;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s:Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService$IRenderServiceEventListener;

    .line 73
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$4;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$4;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->t:Lcom/tencent/liteav/txcvodplayer/renderer/a$a;

    .line 74
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ar:I

    .line 75
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->at:Z

    .line 76
    invoke-direct {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 77
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x0

    .line 78
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    .line 79
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:I

    const/4 p3, 0x0

    .line 80
    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v:Lcom/tencent/liteav/txcvodplayer/renderer/a$b;

    .line 81
    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 82
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->F:Z

    const/high16 v0, 0x3f800000    # 1.0f

    .line 83
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->M:F

    const/4 v0, 0x1

    .line 84
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e:Z

    const/4 v0, 0x2

    .line 85
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f:I

    .line 86
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->P:Z

    const/4 v0, -0x1

    .line 87
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    const/16 v1, 0x64

    .line 88
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->R:I

    const/high16 v1, -0x3d380000    # -100.0f

    .line 89
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->S:F

    .line 90
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->T:Z

    const/16 v1, -0x3e8

    .line 91
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->U:I

    .line 92
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->V:I

    .line 93
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->W:I

    .line 94
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aa:I

    .line 95
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g:Ljava/lang/Object;

    .line 96
    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/Object;

    .line 97
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l:Z

    .line 98
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n:I

    .line 99
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o:I

    .line 100
    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->p:Ljava/util/Map;

    .line 101
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ai:I

    .line 102
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->q:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$j;

    .line 103
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->r:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$g;

    .line 104
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ak:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$d;

    .line 105
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->al:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$f;

    .line 106
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$11;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$11;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->an:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$e;

    .line 107
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ao:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$h;

    .line 108
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ap:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$i;

    .line 109
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$2;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$2;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aq:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$b;

    .line 110
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$3;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$3;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s:Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService$IRenderServiceEventListener;

    .line 111
    new-instance p3, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$4;

    invoke-direct {p3, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$4;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->t:Lcom/tencent/liteav/txcvodplayer/renderer/a$a;

    .line 112
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ar:I

    .line 113
    iput-boolean p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->at:Z

    .line 114
    invoke-direct {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic A(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->O:J

    .line 3
    return-wide v0
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic B(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->am:I

    .line 4
    return v0
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic C(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->am:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x1

    .line 5
    .line 6
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->am:I

    .line 7
    return v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic D(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ai:I

    .line 3
    return p0
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic E(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->P:Z

    .line 4
    return v0
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic F(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$i;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ae:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$i;

    .line 3
    return-object p0
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic G(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$b;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ac:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$b;

    .line 3
    return-object p0
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic H(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcplayer/d;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->as:Lcom/tencent/liteav/txcplayer/d;

    .line 3
    return-object p0
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic I(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e(Z)V

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->w:I

    return p1
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;J)J
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->N:J

    return-wide p1
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Lcom/tencent/liteav/txcvodplayer/renderer/a$b;)Lcom/tencent/liteav/txcvodplayer/renderer/a$b;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v:Lcom/tencent/liteav/txcvodplayer/renderer/a$b;

    return-object p1
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/renderer/a;
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:Lcom/tencent/liteav/txcvodplayer/renderer/a;

    return-object p0
.end method

.method private a(IILjava/lang/String;)V
    .locals 6

    .line 75
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(IILjava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;)V

    return-void
.end method

.method private a(IILjava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;)V
    .locals 5

    const/16 v0, 0x83a

    const/16 v1, -0x900

    if-eq p1, v1, :cond_0

    if-ne p1, v0, :cond_1

    .line 60
    :cond_0
    iget-boolean v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->at:Z

    if-eqz v2, :cond_1

    return-void

    .line 61
    :cond_1
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    const/16 v3, 0x65

    .line 62
    iput v3, v2, Landroid/os/Message;->what:I

    .line 63
    iput-object p5, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 64
    new-instance p5, Landroid/os/Bundle;

    invoke-direct {p5}, Landroid/os/Bundle;-><init>()V

    .line 65
    iput p1, v2, Landroid/os/Message;->arg1:I

    .line 66
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ")-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 67
    const-string v3, "description"

    invoke-virtual {p5, v3, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    const-string v3, "EVT_ERROR_CODE"

    invoke-virtual {p5, v3, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    if-eqz p4, :cond_2

    .line 69
    const-string p2, "extra"

    invoke-virtual {p5, p2, p4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 70
    :cond_2
    invoke-virtual {v2, p5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 71
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:Landroid/os/Handler;

    if-eqz p2, :cond_3

    .line 72
    invoke-virtual {p2, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 73
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string/jumbo p3, "sendSimpleEvent "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    :cond_3
    if-eq p1, v1, :cond_5

    if-ne p1, v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 p1, 0x1

    .line 74
    :goto_1
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->at:Z

    return-void
.end method

.method private a(ILandroid/os/Bundle;)V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->as:Lcom/tencent/liteav/txcplayer/d;

    if-eqz v0, :cond_0

    .line 77
    invoke-interface {v0, p1, p2}, Lcom/tencent/liteav/txcplayer/d;->a(ILandroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Landroid/content/Context;

    .line 12
    new-instance p1, Lcom/tencent/liteav/txcplayer/e;

    invoke-direct {p1}, Lcom/tencent/liteav/txcplayer/e;-><init>()V

    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 13
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aj:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    const-string/jumbo p1, "new TXCVodVideoView"

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRender(I)V

    .line 16
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->w:I

    .line 17
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:I

    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 21
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    .line 22
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:I

    .line 23
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 24
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$a;

    invoke-direct {v0, p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$a;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:Landroid/os/Handler;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:Landroid/os/Handler;

    return-void
.end method

.method private static a(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 78
    invoke-static {}, Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService;->getInstance()Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService;->stopRenderProcess(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;)V

    :cond_0
    return-void
.end method

.method private a(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;Lcom/tencent/liteav/txcvodplayer/renderer/a$b;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    const/4 p2, 0x0

    .line 26
    invoke-interface {p1, p2}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    return-void

    .line 27
    :cond_1
    const-string v0, "bindSurfaceHolder"

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 28
    invoke-interface {p2}, Lcom/tencent/liteav/txcvodplayer/renderer/a$b;->c()Landroid/view/Surface;

    move-result-object v0

    if-nez v0, :cond_2

    .line 29
    invoke-interface {p2}, Lcom/tencent/liteav/txcvodplayer/renderer/a$b;->b()Landroid/view/Surface;

    move-result-object v0

    .line 30
    :cond_2
    invoke-static {}, Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService;->getInstance()Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService;

    move-result-object v1

    iget v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o:I

    iget-object v3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->p:Ljava/util/Map;

    invoke-virtual {v1, p1, v0, v2, v3}, Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService;->connectPlayer(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;Landroid/view/Surface;ILjava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 31
    invoke-interface {p2, p1}, Lcom/tencent/liteav/txcvodplayer/renderer/a$b;->a(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;)V

    return-void

    .line 32
    :cond_3
    invoke-interface {p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getVideoWidth()I

    move-result p2

    if-lez p2, :cond_4

    .line 33
    invoke-static {}, Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService;->getInstance()Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService;->setSurfaceBufferSize(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;)Z

    .line 34
    :cond_4
    invoke-static {}, Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService;->getInstance()Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService;

    move-result-object p2

    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s:Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService$IRenderServiceEventListener;

    invoke-virtual {p2, p1, v0}, Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService;->setRenderServiceEventListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService$IRenderServiceEventListener;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;II)V
    .locals 2

    if-nez p2, :cond_2

    .line 101
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getTrackInfo()[Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 102
    array-length v0, p2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-ltz p1, :cond_2

    .line 103
    array-length v0, p2

    if-ge p1, v0, :cond_2

    .line 104
    aget-object p1, p2, p1

    .line 105
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->getTrackType()I

    move-result p2

    const/4 v0, 0x2

    const-string v1, " ,vod="

    if-ne p2, v0, :cond_1

    .line 106
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ah:Ljava/lang/String;

    const/4 p1, -0x1

    .line 107
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ai:I

    .line 108
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "[recordSelectTrackCompleteInfo] audio track name: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ah:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    return-void

    .line 109
    :cond_1
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->getTrackType()I

    move-result p2

    const/4 v0, 0x3

    if-ne p2, v0, :cond_2

    .line 110
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aj:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 111
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aj:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "[recordSelectTrackCompleteInfo] subtitle track name: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;IILjava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(IILjava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILandroid/os/Bundle;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(ILandroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 100
    invoke-direct {p0, p1, v0, p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(IILjava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;)V
    .locals 6

    const/4 v2, 0x0

    move-object v0, p0

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(IILjava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;Lcom/tencent/liteav/txcvodplayer/renderer/a$b;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;Lcom/tencent/liteav/txcvodplayer/renderer/a$b;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Ljava/lang/String;)V
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Z)Z
    .locals 0

    .line 10
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->F:Z

    return p1
.end method

.method public static synthetic b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:I

    return p0
.end method

.method public static synthetic b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:I

    return p1
.end method

.method public static synthetic b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;J)J
    .locals 0

    .line 3
    iput-wide p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->O:J

    return-wide p1
.end method

.method public static synthetic b(I)Ljava/lang/String;
    .locals 1

    const/16 v0, -0x17d5

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    .line 42
    const-string p0, "ERR_UNKNOW"

    return-object p0

    .line 43
    :pswitch_0
    const-string p0, "ERR_GENERAL"

    return-object p0

    .line 44
    :pswitch_1
    const-string p0, "DEMUXER_FAIL"

    return-object p0

    .line 45
    :pswitch_2
    const-string p0, "SYSTEM_PLAY_FAIL"

    return-object p0

    .line 46
    :pswitch_3
    const-string p0, "DEMUXER_TIMEOUT"

    return-object p0

    .line 47
    :pswitch_4
    const-string p0, "DECODE_VIDEO_FAIL"

    return-object p0

    .line 48
    :pswitch_5
    const-string p0, "DECODE_AUDIO_FAIL"

    return-object p0

    .line 49
    :pswitch_6
    const-string p0, "DECODE_SUBTITLE_FAIL"

    return-object p0

    .line 50
    :pswitch_7
    const-string p0, "RENDER_FAIL"

    return-object p0

    .line 51
    :pswitch_8
    const-string p0, "PROCESS_VIDEO_FAIL"

    return-object p0

    .line 52
    :pswitch_9
    const-string p0, "DOWNLOAD_FAIL"

    return-object p0

    .line 53
    :cond_0
    const-string p0, "PLAY_ERR_DRM"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch -0x177b
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->L:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;II)V
    .locals 3

    .line 36
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 37
    const-string v1, "EVT_KEY_SELECT_TRACK_INDEX"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 38
    const-string v1, "EVT_KEY_SELECT_TRACK_ERROR_CODE"

    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 39
    const-string v1, "description"

    const-string v2, "Select Track Complete"

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "VOD_PLAY_EVT_SELECT_TRACK_COMPLETE, trackIndex="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " ,errorCode="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " ,vod="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    const/16 p1, 0x7e4

    .line 41
    invoke-direct {p0, p1, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(ILandroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:I

    return p0
.end method

.method public static synthetic c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->J:I

    return p1
.end method

.method public static synthetic c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->w:I

    return p0
.end method

.method public static synthetic d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->K:I

    return p1
.end method

.method public static synthetic d()Z
    .locals 1

    const/4 v0, 0x1

    .line 3
    sput-boolean v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:Z

    return v0
.end method

.method public static synthetic e(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:I

    return p1
.end method

.method public static synthetic e(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    return-object p0
.end method

.method private e(Z)V
    .locals 4

    .line 4
    const-string/jumbo v0, "replay, isFromErrorState = "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    if-eqz p1, :cond_0

    .line 5
    iget-wide v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->C:J

    cmp-long p1, v2, v0

    if-lez p1, :cond_0

    .line 6
    iput-wide v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:J

    .line 7
    iget-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->P:Z

    if-eqz p1, :cond_2

    iget p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    if-ltz p1, :cond_2

    int-to-long v0, p1

    .line 8
    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:J

    goto :goto_0

    .line 9
    :cond_0
    iget-wide v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:J

    cmp-long p1, v2, v0

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    if-eqz p1, :cond_1

    .line 10
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->E:I

    if-lez v0, :cond_2

    .line 11
    invoke-interface {p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getCurrentPosition()J

    move-result-wide v0

    long-to-int p1, v0

    int-to-long v0, p1

    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:J

    .line 12
    iget p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    int-to-long v2, p1

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    int-to-long v0, p1

    .line 13
    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:J

    goto :goto_0

    .line 14
    :cond_1
    iget-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->P:Z

    if-eqz p1, :cond_2

    iget p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    if-ltz p1, :cond_2

    int-to-long v0, p1

    .line 15
    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:J

    .line 16
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g()Z

    move-result p1

    if-nez p1, :cond_3

    const/4 p1, 0x0

    .line 17
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Z)V

    :cond_3
    return-void
.end method

.method public static synthetic e()Z
    .locals 1

    .line 3
    sget-boolean v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:Z

    return v0
.end method

.method public static synthetic f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->J:I

    return p0
.end method

.method public static synthetic f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    return p1
.end method

.method public static synthetic f()Z
    .locals 1

    const/4 v0, 0x0

    .line 3
    sput-boolean v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->af:Z

    return v0
.end method

.method public static synthetic g(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->K:I

    return p0
.end method

.method public static synthetic g(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->B:I

    return p1
.end method

.method private g()Z
    .locals 10

    .line 3
    const-string/jumbo v0, "openVideo"

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 5
    iget-object v0, v0, Lcom/tencent/liteav/txcplayer/e;->q:Ljava/lang/String;

    .line 6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 7
    :cond_0
    invoke-virtual {p0, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Z)V

    .line 8
    iget-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e:Z

    const/4 v2, 0x3

    if-eqz v0, :cond_1

    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Landroid/content/Context;

    const-string v3, "audio"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    const/4 v3, 0x0

    const/4 v4, 0x2

    .line 10
    invoke-virtual {v0, v3, v2, v4}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    :cond_1
    const/4 v0, -0x1

    const/4 v3, 0x1

    .line 11
    :try_start_0
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Landroid/content/Context;

    invoke-static {v4}, Lcom/tencent/liteav/txcplayer/f;->a(Landroid/content/Context;)Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    move-result-object v4

    iput-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 12
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[ThumbMediaPlayer:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "] , createMediaPlayer"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 13
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h:Ljava/lang/Object;

    if-eqz v4, :cond_2

    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    if-eqz v5, :cond_2

    .line 14
    invoke-interface {v5, v4}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->attachTRTC(Ljava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception v2

    goto/16 :goto_6

    .line 15
    :cond_2
    :goto_0
    iget v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o:I

    if-gez v4, :cond_4

    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 16
    iget-boolean v4, v4, Lcom/tencent/liteav/txcplayer/e;->C:Z

    if-eqz v4, :cond_3

    goto :goto_1

    .line 17
    :cond_3
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v4, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setEnableRenderProcess(Z)V

    goto :goto_2

    .line 18
    :cond_4
    :goto_1
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v4, v3}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setEnableRenderProcess(Z)V

    .line 19
    :goto_2
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 20
    iget-object v5, v4, Lcom/tencent/liteav/txcplayer/e;->q:Ljava/lang/String;

    .line 21
    iget-wide v6, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:J

    .line 22
    iput-wide v6, v4, Lcom/tencent/liteav/txcplayer/e;->o:J

    .line 23
    iget v6, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->W:I

    if-ltz v6, :cond_5

    .line 24
    iput v6, v4, Lcom/tencent/liteav/txcplayer/e;->s:I

    .line 25
    :cond_5
    iget v6, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->V:I

    if-ltz v6, :cond_6

    .line 26
    iput v6, v4, Lcom/tencent/liteav/txcplayer/e;->r:I

    .line 27
    :cond_6
    iget-wide v6, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->N:J

    const-wide/16 v8, 0x0

    cmp-long v8, v6, v8

    if-lez v8, :cond_7

    .line 28
    iput-wide v6, v4, Lcom/tencent/liteav/txcplayer/e;->t:J

    .line 29
    :cond_7
    iget v6, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->U:I

    if-ne v6, v0, :cond_8

    .line 30
    iput-boolean v3, v4, Lcom/tencent/liteav/txcplayer/e;->z:Z

    .line 31
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v4}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->enableAdaptiveBitrate()V

    goto :goto_3

    .line 32
    :cond_8
    iput-boolean v1, v4, Lcom/tencent/liteav/txcplayer/e;->z:Z

    .line 33
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v4, v6}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setBitrateIndex(I)V

    .line 34
    :goto_3
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ah:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_9

    .line 35
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    iget-object v6, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ah:Ljava/lang/String;

    .line 36
    iput-object v6, v4, Lcom/tencent/liteav/txcplayer/e;->E:Ljava/lang/String;

    .line 37
    :cond_9
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    iget-object v6, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->H:Ljava/util/Map;

    invoke-interface {v4, v6}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setPrivateConfig(Ljava/util/Map;)V

    .line 38
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    iget-object v6, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    invoke-interface {v4, v6}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setConfig(Lcom/tencent/liteav/txcplayer/e;)V

    .line 39
    iget v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aa:I

    if-lez v4, :cond_a

    .line 40
    iget-object v6, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v6, v4}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setAutoMaxBitrate(I)V

    .line 41
    :cond_a
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 42
    iget-object v4, v4, Lcom/tencent/liteav/txcplayer/e;->h:Ljava/util/Map;

    if-eqz v4, :cond_b

    .line 43
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    iget-object v6, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Landroid/content/Context;

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    iget-object v7, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 44
    iget-object v7, v7, Lcom/tencent/liteav/txcplayer/e;->h:Ljava/util/Map;

    .line 45
    invoke-interface {v4, v6, v5, v7}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V

    goto :goto_4

    .line 46
    :cond_b
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v4, v5}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setDataSource(Ljava/lang/String;)V

    .line 47
    :goto_4
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i:Ljava/util/List;

    if-eqz v4, :cond_c

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_c

    .line 48
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$b;

    .line 49
    iget-object v6, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    iget-object v7, v5, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$b;->a:Ljava/lang/String;

    iget-object v8, v5, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$b;->b:Ljava/lang/String;

    iget-object v5, v5, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$b;->c:Ljava/lang/String;

    invoke-interface {v6, v7, v8, v5}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->addSubtitleSource(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 50
    :cond_c
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ad:Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;

    if-eqz v4, :cond_d

    .line 51
    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v5, v4}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setSubtitleStyle(Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;)V

    .line 52
    :cond_d
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->r:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$g;

    invoke-interface {v4, v5}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnPreparedListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$g;)V

    .line 53
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->q:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$j;

    invoke-interface {v4, v5}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnVideoSizeChangedListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$j;)V

    .line 54
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ak:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$d;

    invoke-interface {v4, v5}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnCompletionListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$d;)V

    .line 55
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->an:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$e;

    invoke-interface {v4, v5}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnErrorListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$e;)V

    .line 56
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->al:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$f;

    invoke-interface {v4, v5}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnInfoListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$f;)V

    .line 57
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ao:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$h;

    invoke-interface {v4, v5}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnSeekCompleteListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$h;)V

    .line 58
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ap:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$i;

    invoke-interface {v4, v5}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnSubtitleDataListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$i;)V

    .line 59
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    new-instance v5, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;

    invoke-direct {v5, p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    invoke-interface {v4, v5}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnGetTXCVodVideoViewTargetState(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$a;)V

    .line 60
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aq:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$b;

    invoke-interface {v4, v5}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnSubtitleFrameDataListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$b;)V

    .line 61
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v:Lcom/tencent/liteav/txcvodplayer/renderer/a$b;

    invoke-direct {p0, v4, v5}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;Lcom/tencent/liteav/txcvodplayer/renderer/a$b;)V

    .line 62
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v4, v2}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setAudioStreamType(I)V

    .line 63
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v2, v3}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setScreenOnWhilePlaying(Z)V

    .line 64
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v2}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->prepareAsync()V

    .line 65
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    iget v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->R:I

    invoke-interface {v2, v4}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setAudioVolume(I)V

    .line 66
    iget v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->S:F

    const/high16 v4, -0x3d380000    # -100.0f

    cmpl-float v4, v2, v4

    if-eqz v4, :cond_e

    .line 67
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v4, v2}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setAudioNormalization(F)V

    .line 68
    :cond_e
    iget-boolean v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->T:Z

    invoke-virtual {p0, v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setMute(Z)V

    .line 69
    iput v3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    .line 70
    :goto_6
    invoke-static {v2}, Lcom/tencent/liteav/base/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Ljava/lang/String;)V

    .line 71
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    .line 72
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:I

    .line 73
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->an:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$e;

    const/16 v2, -0x1771

    invoke-interface {v0, v2, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$e;->a(II)Z

    goto :goto_7

    .line 74
    :catch_1
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    .line 75
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:I

    .line 76
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->an:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$e;

    const/16 v1, -0x8ff

    invoke-interface {v0, v1, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$e;->a(II)Z

    :goto_7
    return v3
.end method

.method public static synthetic h(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->A:I

    return p1
.end method

.method private h()V
    .locals 3

    const/16 v0, 0x7ef

    const/4 v1, 0x0

    .line 3
    const-string v2, "Vod HEVC downgrade playback"

    invoke-direct {p0, v0, v1, v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(IILjava/lang/String;)V

    return-void
.end method

.method public static synthetic h(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Z
    .locals 0

    .line 2
    iget-boolean p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->F:Z

    return p0
.end method

.method public static synthetic i(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->y:I

    return p1
.end method

.method public static synthetic i(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/os/Handler;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:Landroid/os/Handler;

    return-object p0
.end method

.method private i()V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnPreparedListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$g;)V

    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnVideoSizeChangedListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$j;)V

    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnCompletionListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$d;)V

    .line 7
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnErrorListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$e;)V

    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnInfoListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$f;)V

    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnBufferingUpdateListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$c;)V

    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnSeekCompleteListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$h;)V

    .line 11
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnSubtitleDataListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$i;)V

    .line 12
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnGetTXCVodVideoViewTargetState(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$a;)V

    .line 13
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setOnSubtitleFrameDataListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$b;)V

    :cond_0
    return-void
.end method

.method public static synthetic j(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->z:I

    return p1
.end method

.method public static synthetic j(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V
    .locals 6

    .line 2
    sget-boolean v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:Z

    if-eqz v0, :cond_3

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aj:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 4
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getTrackInfo()[Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 5
    array-length v1, v0

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    .line 6
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_3

    .line 7
    aget-object v2, v0, v1

    .line 8
    iget-object v3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aj:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    .line 9
    iget-object v5, v2, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->name:Ljava/lang/String;

    iget-object v4, v4, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->name:Ljava/lang/String;

    invoke-static {v5, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-boolean v4, v2, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isSelected:Z

    if-nez v4, :cond_1

    .line 10
    invoke-virtual {p0, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(I)V

    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    const-string/jumbo v5, "select external subtitle track on prepared when replay, index: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " ,name:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v2, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->name:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " ,vod="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 13
    invoke-virtual {p0, v4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public static synthetic k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    .line 3
    return p0
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic l(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcplayer/e;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 3
    return-object p0
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic m(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)J
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:J

    .line 5
    return-wide v0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic n(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l:Z

    .line 3
    return p0
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic o(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic p(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)F
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->M:F

    .line 3
    return p0
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic q(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ab:Z

    .line 4
    return v0
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic r(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g:Ljava/lang/Object;

    .line 3
    return-object p0
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic s(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->B:I

    .line 3
    return p0
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic t(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->A:I

    .line 3
    return p0
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic u(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->L:Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic v(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/util/Map;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->H:Ljava/util/Map;

    .line 3
    return-object p0
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic w(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g()Z

    .line 4
    move-result p0

    .line 5
    return p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic x(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "onHevcVideoDecoderError"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 7
    const/4 v0, 0x1

    .line 8
    .line 9
    sput-boolean v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ag:Z

    .line 10
    .line 11
    sget-boolean v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/liteav/sdk/common/HouseBuilder$a;->h:Lcom/tencent/liteav/sdk/common/HouseBuilder$a;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/tencent/liteav/txcplayer/common/c;->a(Lcom/tencent/liteav/sdk/common/HouseBuilder$a;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    sput-boolean v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:Z

    .line 22
    .line 23
    const-string v0, "has advanced license!"

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 27
    .line 28
    :cond_0
    sget-boolean v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:Z

    .line 29
    const/4 v1, 0x0

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    move-result v0

    .line 38
    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/tencent/liteav/txcplayer/e;->q:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    move-result v0

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 54
    .line 55
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Ljava/lang/String;

    .line 56
    .line 57
    iput-object v2, v0, Lcom/tencent/liteav/txcplayer/e;->q:Ljava/lang/String;

    .line 58
    .line 59
    iget v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n:I

    .line 60
    .line 61
    iput v2, v0, Lcom/tencent/liteav/txcplayer/e;->D:I

    .line 62
    .line 63
    iget-wide v2, v0, Lcom/tencent/liteav/txcplayer/e;->o:J

    .line 64
    .line 65
    const-wide/16 v4, 0x0

    .line 66
    .line 67
    cmp-long v0, v2, v4

    .line 68
    .line 69
    if-lez v0, :cond_1

    .line 70
    .line 71
    iput-wide v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:J

    .line 72
    .line 73
    .line 74
    :cond_1
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h()V

    .line 75
    .line 76
    .line 77
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g()Z

    .line 78
    move-result v0

    .line 79
    .line 80
    if-nez v0, :cond_2

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Z)V

    .line 84
    :cond_2
    return-void

    .line 85
    .line 86
    :cond_3
    const-string v0, "Vod H265 decoding failed"

    .line 87
    .line 88
    const/16 v2, -0x900

    .line 89
    .line 90
    .line 91
    invoke-direct {p0, v2, v1, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(IILjava/lang/String;)V

    .line 92
    return-void
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public static synthetic y(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "onError onVideoDecoderError"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 7
    .line 8
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    .line 9
    const/4 v1, 0x4

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    sget-boolean v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/tencent/liteav/txcplayer/e;->q:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 39
    .line 40
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Ljava/lang/String;

    .line 41
    .line 42
    iput-object v1, v0, Lcom/tencent/liteav/txcplayer/e;->q:Ljava/lang/String;

    .line 43
    .line 44
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n:I

    .line 45
    .line 46
    iput v1, v0, Lcom/tencent/liteav/txcplayer/e;->D:I

    .line 47
    .line 48
    iget-wide v0, v0, Lcom/tencent/liteav/txcplayer/e;->o:J

    .line 49
    .line 50
    const-wide/16 v3, 0x0

    .line 51
    .line 52
    cmp-long v3, v0, v3

    .line 53
    .line 54
    if-lez v3, :cond_0

    .line 55
    .line 56
    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:J

    .line 57
    .line 58
    .line 59
    :cond_0
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h()V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g()Z

    .line 63
    move-result v0

    .line 64
    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Z)V

    .line 69
    return-void

    .line 70
    .line 71
    :cond_1
    iget-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ab:Z

    .line 72
    .line 73
    if-nez v0, :cond_3

    .line 74
    .line 75
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 76
    .line 77
    iget-boolean v0, v0, Lcom/tencent/liteav/txcplayer/e;->d:Z

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:I

    .line 82
    .line 83
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->w:I

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 87
    move-result v0

    .line 88
    .line 89
    const/16 v1, 0x438

    .line 90
    .line 91
    if-ge v0, v1, :cond_2

    .line 92
    .line 93
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 94
    .line 95
    iget-boolean v1, v0, Lcom/tencent/liteav/txcplayer/e;->d:Z

    .line 96
    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    iput-boolean v2, v0, Lcom/tencent/liteav/txcplayer/e;->d:Z

    .line 100
    .line 101
    .line 102
    invoke-direct {p0, v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e(Z)V

    .line 103
    :cond_2
    return-void

    .line 104
    .line 105
    :cond_3
    const-string v0, "VOD decoding failed"

    .line 106
    .line 107
    const/16 v1, -0x1776

    .line 108
    .line 109
    .line 110
    invoke-direct {p0, v1, v2, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(IILjava/lang/String;)V

    .line 111
    return-void
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public static synthetic z(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "onHLSKeyError"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 7
    .line 8
    const/16 v0, -0x901

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    const-string v2, "HLS decypt key get failed"

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0, v1, v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(IILjava/lang/String;)V

    .line 15
    .line 16
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->stop()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v0

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string/jumbo v2, "onHLSKeyError stop Exception: "

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Ljava/lang/String;)V

    .line 46
    .line 47
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->release()V

    .line 51
    const/4 v0, 0x0

    .line 52
    .line 53
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 54
    :cond_0
    const/4 v0, -0x1

    .line 55
    .line 56
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    .line 57
    .line 58
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:I

    .line 59
    return-void
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 40
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/16 v1, 0x66

    .line 41
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 42
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 43
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:Landroid/os/Handler;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    if-eqz v0, :cond_1

    .line 45
    :try_start_0
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->stop()V

    .line 46
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    const/4 v1, 0x0

    .line 47
    iput-object v1, v0, Lcom/tencent/liteav/txcplayer/e;->q:Ljava/lang/String;

    const/4 v0, 0x1

    .line 48
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 49
    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "stop exception: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Ljava/lang/String;)V

    .line 50
    :cond_1
    :goto_0
    const-string/jumbo v0, "stop"

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final a(I)V
    .locals 3

    .line 79
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getTrackInfo()[Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    .line 80
    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 81
    aget-object v0, v0, p1

    iget v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->trackType:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    iget-boolean v0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isInternal:Z

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    if-eqz v0, :cond_1

    .line 83
    invoke-interface {v0, p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->selectTrack(I)V

    const/4 v0, 0x1

    .line 84
    invoke-virtual {p0, v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(ZI)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final a(IZ)V
    .locals 3

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "seek to "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isAccurateSeek="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getDuration()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-gez p1, :cond_0

    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 54
    :try_start_0
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    .line 55
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    int-to-long v1, p1

    invoke-interface {v0, v1, v2, p2}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->seekTo(JZ)V

    const/4 p1, 0x1

    .line 56
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->P:Z

    .line 57
    iget p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    const/4 p2, 0x5

    if-ne p1, p2, :cond_1

    const/4 p1, 0x3

    .line 58
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 59
    new-instance p2, Ljava/lang/StringBuilder;

    const-string/jumbo v0, "seekTo Exception : "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "], "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "TXCVodVideoView"

    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Z)V
    .locals 2

    .line 35
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    if-eqz v0, :cond_0

    .line 36
    const-string/jumbo v0, "releaseWithoutStop needClearLastImg:"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 37
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    .line 38
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->releaseTextureHost()V

    if-eqz p1, :cond_0

    .line 39
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {p1, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    :cond_0
    return-void
.end method

.method public final a(ZI)V
    .locals 3

    .line 85
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getTrackInfo()[Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 86
    array-length v1, v0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    if-ltz p2, :cond_3

    .line 87
    array-length v1, v0

    if-ge p2, v1, :cond_3

    .line 88
    aget-object v0, v0, p2

    .line 89
    const-string v1, " ,vod="

    const/4 v2, 0x2

    if-eqz p1, :cond_1

    .line 90
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->getTrackType()I

    move-result p1

    if-ne p1, v2, :cond_3

    .line 91
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ai:I

    .line 92
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "[recordStartSelectTrackInfo] selectingAudioTrack: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ai:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    return-void

    .line 93
    :cond_1
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->getTrackType()I

    move-result p1

    if-ne p1, v2, :cond_2

    iget p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ai:I

    if-ne p1, p2, :cond_2

    const/4 p1, -0x1

    .line 94
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ai:I

    return-void

    .line 95
    :cond_2
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->getTrackType()I

    move-result p1

    const/4 p2, 0x3

    if-ne p1, p2, :cond_3

    .line 96
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aj:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 97
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aj:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 98
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "[recordStartSelectTrackInfo], deselect subtitle track:"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "], "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "TXCVodVideoView"

    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Z)V
    .locals 5

    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    if-eqz v0, :cond_3

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "release player "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;)V

    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->release()V

    .line 9
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i()V

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    const/4 v1, 0x0

    .line 11
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    .line 12
    iput-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->P:Z

    const/4 v2, -0x1

    .line 13
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    if-eqz p1, :cond_1

    .line 14
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:I

    .line 15
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->w:I

    .line 16
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:I

    const/high16 p1, 0x3f800000    # 1.0f

    .line 17
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->M:F

    .line 18
    iput-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ab:Z

    const/16 p1, -0x3e8

    .line 19
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->U:I

    .line 20
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->V:I

    .line 21
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->W:I

    .line 22
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 23
    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_0
    const-wide/16 v3, 0x0

    .line 24
    iput-wide v3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->C:J

    .line 25
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ai:I

    .line 26
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ah:Ljava/lang/String;

    .line 27
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aj:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 28
    :cond_1
    iget-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e:Z

    if-eqz p1, :cond_2

    .line 29
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result p1

    const/16 v3, 0x8

    if-lt p1, v3, :cond_2

    .line 30
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Landroid/content/Context;

    const-string v3, "audio"

    invoke-virtual {p1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    .line 31
    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 32
    :cond_2
    iput-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->P:Z

    .line 33
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    :cond_3
    return-void
.end method

.method public final b()Z
    .locals 2

    .line 34
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()V
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    if-eqz v0, :cond_0

    .line 16
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->publishAudioToNetwork()V

    :cond_0
    return-void
.end method

.method public final c(Z)V
    .locals 8

    .line 4
    const-string/jumbo v0, "start isLoop:"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b()Z

    move-result v0

    const/4 v1, 0x3

    if-eqz v0, :cond_3

    .line 6
    :try_start_0
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    if-eq v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->P:Z

    if-nez v0, :cond_1

    .line 7
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    if-nez p1, :cond_0

    .line 8
    const-string v5, "Playback started"

    iget-object v7, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v3, 0x7d4

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    :try_start_1
    invoke-direct/range {v2 .. v7}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(IILjava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;)V

    goto :goto_1

    :catch_0
    move-exception v0

    :goto_0
    move-object p1, v0

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v2, p0

    goto :goto_0

    :cond_0
    move-object v2, p0

    .line 9
    :goto_1
    iget-object p1, v2, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:Landroid/os/Handler;

    if-eqz p1, :cond_2

    const/16 v0, 0x64

    .line 10
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 11
    iget-object p1, v2, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u:Landroid/os/Handler;

    const/16 v0, 0x67

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_2

    :cond_1
    move-object v2, p0

    .line 12
    :cond_2
    :goto_2
    iget-object p1, v2, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    invoke-interface {p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->start()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    .line 13
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "start exception: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Ljava/lang/String;)V

    goto :goto_4

    :cond_3
    move-object v2, p0

    .line 14
    :goto_4
    iput v1, v2, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b:I

    return-void
.end method

.method public final d(Z)Z
    .locals 1

    .line 4
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    if-nez v0, :cond_0

    .line 5
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e:Z

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public getBitrateIndex()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->U:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    return v0

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getBitrateIndex()I

    .line 14
    move-result v0

    .line 15
    .line 16
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->U:I

    .line 17
    .line 18
    :cond_1
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->U:I

    .line 19
    return v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public getBufferDuration()J
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 3
    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getPlayableDurationMs()J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getCurrentPosition()J

    .line 12
    move-result-wide v2

    .line 13
    .line 14
    iget v4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    .line 15
    const/4 v5, 0x3

    .line 16
    .line 17
    if-ne v4, v5, :cond_0

    .line 18
    .line 19
    iput-wide v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->C:J

    .line 20
    .line 21
    :cond_0
    cmp-long v4, v0, v2

    .line 22
    .line 23
    if-gez v4, :cond_1

    .line 24
    move-wide v0, v2

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getDuration()I

    .line 28
    move-result v2

    .line 29
    int-to-long v2, v2

    .line 30
    sub-long/2addr v2, v0

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 34
    move-result-wide v2

    .line 35
    .line 36
    const-wide/16 v4, 0x3e8

    .line 37
    .line 38
    cmp-long v2, v2, v4

    .line 39
    .line 40
    if-gez v2, :cond_2

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getDuration()I

    .line 44
    move-result v0

    .line 45
    int-to-long v0, v0

    .line 46
    :cond_2
    return-wide v0

    .line 47
    .line 48
    :cond_3
    const-wide/16 v0, 0x0

    .line 49
    return-wide v0
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public getCurrentPosition()J
    .locals 5

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->P:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    .line 7
    .line 8
    if-ltz v0, :cond_0

    .line 9
    int-to-long v0, v0

    .line 10
    return-wide v0

    .line 11
    .line 12
    :cond_0
    iget-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmp-long v4, v0, v2

    .line 17
    .line 18
    if-lez v4, :cond_1

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getCurrentPosition()J

    .line 27
    move-result-wide v0

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move-wide v0, v2

    .line 30
    .line 31
    :goto_0
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 32
    .line 33
    iget-boolean v2, v2, Lcom/tencent/liteav/txcplayer/e;->i:Z

    .line 34
    .line 35
    if-nez v2, :cond_3

    .line 36
    .line 37
    iget v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    .line 38
    int-to-long v3, v2

    .line 39
    .line 40
    cmp-long v3, v0, v3

    .line 41
    .line 42
    if-gez v3, :cond_3

    .line 43
    int-to-long v0, v2

    .line 44
    :cond_3
    return-wide v0
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public getDuration()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getDuration()J

    .line 8
    move-result-wide v0

    .line 9
    long-to-int v0, v0

    .line 10
    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->E:I

    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->E:I

    .line 16
    return v0
    .line 17
.end method

.method public getMediaInfo()Lcom/tencent/liteav/txcplayer/model/b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    return-object v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-interface {v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getMediaInfo()Lcom/tencent/liteav/txcplayer/model/b;

    .line 10
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-object v0

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 16
    return-object v0
    .line 17
.end method

.method public getMetaRotationDegree()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->B:I

    .line 3
    return v0
    .line 4
    .line 5
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
    .line 17
.end method

.method public getPlayerType()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
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
    .line 17
.end method

.method public getServerIp()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->L:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
    .line 5
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
    .line 17
.end method

.method public getSupportedBitrates()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/liteav/txcplayer/model/a;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getSupportedBitrates()Ljava/util/ArrayList;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    return-object v0

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    return-object v0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public getTrackInfo()[Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getTrackInfo()[Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getVideoHeight()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:I

    .line 3
    return v0
    .line 4
    .line 5
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
    .line 17
.end method

.method public getVideoWidth()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->w:I

    .line 3
    return v0
    .line 4
    .line 5
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
    .line 17
.end method

.method public setAudioNormalization(F)V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/liteav/sdk/common/HouseBuilder$a;->h:Lcom/tencent/liteav/sdk/common/HouseBuilder$a;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/liteav/txcplayer/common/c;->a(Lcom/tencent/liteav/sdk/common/HouseBuilder$a;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_1

    .line 10
    .line 11
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->S:F

    .line 12
    .line 13
    cmpl-float v1, v0, p1

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    goto :goto_1

    .line 17
    .line 18
    :cond_1
    const/high16 v1, 0x3f800000    # 1.0f

    .line 19
    .line 20
    cmpl-float v0, v0, v1

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    const/4 v0, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_2
    move v0, v1

    .line 27
    .line 28
    :goto_0
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->S:F

    .line 29
    .line 30
    .line 31
    const-string/jumbo v2, "setAudioNormalization: "

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 43
    .line 44
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 45
    .line 46
    if-eqz v2, :cond_4

    .line 47
    .line 48
    .line 49
    invoke-interface {v2, p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setAudioNormalization(F)V

    .line 50
    .line 51
    if-nez v0, :cond_4

    .line 52
    .line 53
    iget-wide v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:J

    .line 54
    .line 55
    const-wide/16 v4, 0x0

    .line 56
    .line 57
    cmp-long p1, v2, v4

    .line 58
    .line 59
    if-nez p1, :cond_4

    .line 60
    .line 61
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 62
    .line 63
    .line 64
    invoke-interface {p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getCurrentPosition()J

    .line 65
    move-result-wide v2

    .line 66
    .line 67
    cmp-long p1, v2, v4

    .line 68
    .line 69
    if-lez p1, :cond_4

    .line 70
    .line 71
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 72
    .line 73
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    iget-boolean v1, v0, Lcom/tencent/liteav/txcplayer/e;->i:Z

    .line 78
    .line 79
    .line 80
    :cond_3
    invoke-interface {p1, v2, v3, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->seekTo(JZ)V

    .line 81
    :cond_4
    :goto_1
    return-void
.end method

.method public setAudioPlayoutVolume(I)V
    .locals 1

    .line 1
    .line 2
    if-lez p1, :cond_0

    .line 3
    .line 4
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->R:I

    .line 5
    .line 6
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setAudioVolume(I)V

    .line 12
    :cond_1
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setAutoMaxBitrate(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->aa:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    if-lez p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setAutoMaxBitrate(I)V

    .line 12
    :cond_0
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setAutoPlay(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 3
    .line 4
    iput-boolean p1, v0, Lcom/tencent/liteav/txcplayer/e;->p:Z

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setBitrateIndex(I)V
    .locals 4

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "setBitrateIndex: "

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getBitrateIndex()I

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eq v0, p1, :cond_5

    .line 21
    .line 22
    const/16 v0, -0x3e8

    .line 23
    .line 24
    if-ne p1, v0, :cond_0

    .line 25
    goto :goto_2

    .line 26
    .line 27
    :cond_0
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->U:I

    .line 28
    .line 29
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:I

    .line 30
    const/4 v1, 0x5

    .line 31
    .line 32
    if-ne v0, v1, :cond_1

    .line 33
    goto :goto_2

    .line 34
    .line 35
    .line 36
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getSupportedBitrates()Ljava/util/ArrayList;

    .line 37
    move-result-object v0

    .line 38
    const/4 v1, -0x1

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 44
    move-result v2

    .line 45
    .line 46
    if-lez v2, :cond_3

    .line 47
    .line 48
    if-eq p1, v1, :cond_3

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    move-result v2

    .line 57
    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    check-cast v2, Lcom/tencent/liteav/txcplayer/model/a;

    .line 65
    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    iget v3, v2, Lcom/tencent/liteav/txcplayer/model/a;->a:I

    .line 69
    .line 70
    if-ne v3, p1, :cond_2

    .line 71
    .line 72
    iget v0, v2, Lcom/tencent/liteav/txcplayer/model/a;->d:I

    .line 73
    .line 74
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->V:I

    .line 75
    .line 76
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->W:I

    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception p1

    .line 79
    goto :goto_1

    .line 80
    .line 81
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 82
    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 86
    .line 87
    iget-boolean v2, v2, Lcom/tencent/liteav/txcplayer/e;->j:Z

    .line 88
    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    if-eq p1, v1, :cond_4

    .line 92
    .line 93
    .line 94
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getBitrateIndex()I

    .line 95
    move-result v0

    .line 96
    .line 97
    if-eq v0, v1, :cond_4

    .line 98
    .line 99
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 100
    .line 101
    .line 102
    invoke-interface {v0, p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setBitrateIndex(I)V

    .line 103
    return-void

    .line 104
    :cond_4
    const/4 p1, 0x0

    .line 105
    .line 106
    .line 107
    invoke-direct {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    return-void

    .line 109
    .line 110
    .line 111
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 112
    :cond_5
    :goto_2
    return-void
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public setConfig(Lcom/tencent/liteav/txcplayer/e;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/tencent/liteav/txcplayer/e;->q:Ljava/lang/String;

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    :goto_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    move-result p1

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 21
    .line 22
    iput-object v0, p1, Lcom/tencent/liteav/txcplayer/e;->q:Ljava/lang/String;

    .line 23
    :cond_1
    return-void
    .line 24
    .line 25
.end method

.method public setListener(Lcom/tencent/liteav/txcplayer/d;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->as:Lcom/tencent/liteav/txcplayer/d;

    .line 3
    return-void
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setMute(Z)V
    .locals 1

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->T:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    if-eqz p1, :cond_1

    .line 10
    const/4 p1, 0x0

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setAudioVolume(I)V

    .line 14
    return-void

    .line 15
    .line 16
    :cond_1
    iget p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->R:I

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setAudioVolume(I)V

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setPrivateConfig(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->H:Ljava/util/Map;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setPrivateConfig(Ljava/util/Map;)V

    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setRate(F)V
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "setRate: "

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setRate(F)V

    .line 22
    .line 23
    :cond_0
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->M:F

    .line 24
    return-void
    .line 25
.end method

.method public setRender(I)V
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_3

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_2

    .line 6
    const/4 v0, 0x2

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    const-string v1, "invalid render %d\n"

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 30
    return-void

    .line 31
    .line 32
    :cond_0
    new-instance p1, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;

    .line 33
    .line 34
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, v0}, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;-><init>(Landroid/content/Context;)V

    .line 38
    .line 39
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;->getSurfaceHolder()Lcom/tencent/liteav/txcvodplayer/renderer/a$b;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcvodplayer/renderer/a$b;->a(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;)V

    .line 51
    .line 52
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 53
    .line 54
    .line 55
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getVideoWidth()I

    .line 56
    move-result v0

    .line 57
    .line 58
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 59
    .line 60
    .line 61
    invoke-interface {v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getVideoHeight()I

    .line 62
    move-result v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;->a(II)V

    .line 66
    .line 67
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 68
    .line 69
    .line 70
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getVideoSarNum()I

    .line 71
    move-result v0

    .line 72
    .line 73
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 74
    .line 75
    .line 76
    invoke-interface {v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getVideoSarDen()I

    .line 77
    move-result v1

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;->b(II)V

    .line 81
    .line 82
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ar:I

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;->setAspectRatio(I)V

    .line 86
    .line 87
    .line 88
    :cond_1
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRenderView(Lcom/tencent/liteav/txcvodplayer/renderer/a;)V

    .line 89
    return-void

    .line 90
    .line 91
    :cond_2
    new-instance p1, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView;

    .line 92
    .line 93
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->G:Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    invoke-direct {p1, v0}, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView;-><init>(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRenderView(Lcom/tencent/liteav/txcvodplayer/renderer/a;)V

    .line 100
    return-void

    .line 101
    :cond_3
    const/4 p1, 0x0

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRenderView(Lcom/tencent/liteav/txcvodplayer/renderer/a;)V

    .line 105
    return-void
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public setRenderMode(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ar:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->setAspectRatio(I)V

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->A:I

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->setVideoRotation(I)V

    .line 19
    :cond_1
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setRenderSurface(Landroid/view/Surface;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$1;-><init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Landroid/view/Surface;)V

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v:Lcom/tencent/liteav/txcvodplayer/renderer/a$b;

    .line 8
    .line 9
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;Lcom/tencent/liteav/txcvodplayer/renderer/a$b;)V

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setRenderView(Lcom/tencent/liteav/txcvodplayer/renderer/a;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "setRenderView: "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->getView()Landroid/view/View;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 35
    .line 36
    iget-object v3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->t:Lcom/tencent/liteav/txcvodplayer/renderer/a$a;

    .line 37
    .line 38
    .line 39
    invoke-interface {v2, v3}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->b(Lcom/tencent/liteav/txcvodplayer/renderer/a$a;)V

    .line 40
    .line 41
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    if-ne v2, p0, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 51
    .line 52
    :cond_1
    if-nez p1, :cond_3

    .line 53
    .line 54
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v:Lcom/tencent/liteav/txcvodplayer/renderer/a$b;

    .line 55
    .line 56
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 57
    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    .line 61
    invoke-interface {p1, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setSurface(Landroid/view/Surface;)V

    .line 62
    :cond_2
    const/4 p1, 0x1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Z)V

    .line 66
    return-void

    .line 67
    .line 68
    :cond_3
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 69
    .line 70
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ar:I

    .line 71
    .line 72
    .line 73
    invoke-interface {p1, v0}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->setAspectRatio(I)V

    .line 74
    .line 75
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->w:I

    .line 76
    .line 77
    if-lez v0, :cond_4

    .line 78
    .line 79
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x:I

    .line 80
    .line 81
    if-lez v1, :cond_4

    .line 82
    .line 83
    .line 84
    invoke-interface {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->a(II)V

    .line 85
    .line 86
    :cond_4
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->J:I

    .line 87
    .line 88
    if-lez v0, :cond_5

    .line 89
    .line 90
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->K:I

    .line 91
    .line 92
    if-lez v1, :cond_5

    .line 93
    .line 94
    .line 95
    invoke-interface {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->b(II)V

    .line 96
    .line 97
    :cond_5
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 98
    .line 99
    .line 100
    invoke-interface {p1}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->getView()Landroid/view/View;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 104
    .line 105
    const/16 v1, 0x11

    .line 106
    const/4 v2, -0x2

    .line 107
    .line 108
    .line 109
    invoke-direct {v0, v2, v2, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    if-nez v0, :cond_6

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 122
    .line 123
    :cond_6
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 124
    .line 125
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->t:Lcom/tencent/liteav/txcvodplayer/renderer/a$a;

    .line 126
    .line 127
    .line 128
    invoke-interface {p1, v0}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->a(Lcom/tencent/liteav/txcvodplayer/renderer/a$a;)V

    .line 129
    .line 130
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 131
    .line 132
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->A:I

    .line 133
    .line 134
    .line 135
    invoke-interface {p1, v0}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->setVideoRotation(I)V

    .line 136
    return-void
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public setStartTime(F)V
    .locals 2

    .line 1
    .line 2
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 3
    mul-float/2addr p1, v0

    .line 4
    float-to-long v0, p1

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->D:J

    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setSubtitleStyle(Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ad:Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setSubtitleStyle(Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;)V

    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setTXCOnSubtitleDataListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$i;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ae:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$i;

    .line 3
    return-void
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setTXCOnSubtitleFrameDataListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ac:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$b;

    .line 3
    return-void
    .line 4
    .line 5
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setTextureRenderView(Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "setTextureRenderView: "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;->getSurfaceHolder()Lcom/tencent/liteav/txcvodplayer/renderer/a$b;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcvodplayer/renderer/a$b;->a(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;)V

    .line 28
    .line 29
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getVideoWidth()I

    .line 33
    move-result v0

    .line 34
    .line 35
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 36
    .line 37
    .line 38
    invoke-interface {v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getVideoHeight()I

    .line 39
    move-result v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;->a(II)V

    .line 43
    .line 44
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getVideoSarNum()I

    .line 48
    move-result v0

    .line 49
    .line 50
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c:Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 51
    .line 52
    .line 53
    invoke-interface {v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getVideoSarDen()I

    .line 54
    move-result v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;->b(II)V

    .line 58
    .line 59
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ar:I

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;->setAspectRatio(I)V

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRenderView(Lcom/tencent/liteav/txcvodplayer/renderer/a;)V

    .line 66
    return-void
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public setVideoPath(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setVideoURI(Landroid/net/Uri;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setVideoRotationDegree(I)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    const/16 v0, 0x5a

    .line 5
    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/16 v0, 0xb4

    .line 9
    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/16 v0, 0x10e

    .line 13
    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    const/16 v0, 0x168

    .line 17
    .line 18
    if-eq p1, v0, :cond_0

    .line 19
    .line 20
    .line 21
    const-string/jumbo v0, "not support degree "

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Ljava/lang/String;)V

    .line 33
    return-void

    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    .line 36
    :cond_1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->A:I

    .line 37
    .line 38
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    .line 43
    invoke-interface {v0, p1}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->setVideoRotation(I)V

    .line 44
    .line 45
    :cond_2
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->I:Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 46
    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ar:I

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, v0}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->setAspectRatio(I)V

    .line 53
    :cond_3
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public setVideoURI(Landroid/net/Uri;)V
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iput-object v1, v0, Lcom/tencent/liteav/txcplayer/e;->q:Ljava/lang/String;

    .line 11
    .line 12
    sget-boolean v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    sget-boolean v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->af:Z

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    sget-boolean v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->ag:Z

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d:Lcom/tencent/liteav/txcplayer/e;

    .line 37
    .line 38
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n:I

    .line 39
    .line 40
    iput v1, v0, Lcom/tencent/liteav/txcplayer/e;->D:I

    .line 41
    .line 42
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m:Ljava/lang/String;

    .line 43
    .line 44
    iput-object v1, v0, Lcom/tencent/liteav/txcplayer/e;->q:Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h()V

    .line 48
    :cond_0
    const/4 v0, 0x0

    .line 49
    .line 50
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->E:I

    .line 51
    const/4 v1, -0x1

    .line 52
    .line 53
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->Q:I

    .line 54
    .line 55
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->am:I

    .line 56
    const/4 v0, 0x0

    .line 57
    .line 58
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->L:Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    const-string/jumbo v0, "setVideoURI: "

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g()Z

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 82
    return-void
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method
