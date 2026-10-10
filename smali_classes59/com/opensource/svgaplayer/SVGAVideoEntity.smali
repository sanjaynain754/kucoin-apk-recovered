.class public final Lcom/opensource/svgaplayer/SVGAVideoEntity;
.super Ljava/lang/Object;
.source "SVGAVideoEntity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0012\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0018\u00002\u00020\u0001B)\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nB)\u0008\u0016\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0011J\u001f\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J!\u0010%\u001a\u0004\u0018\u00010\u001d2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010\'\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\'\u0010\u0011J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008(\u0010\"J%\u0010+\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u000f0)H\u0002\u00a2\u0006\u0004\u0008+\u0010,J+\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020-2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040/H\u0002\u00a2\u0006\u0004\u00082\u00103J\u001f\u00106\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020#H\u0002\u00a2\u0006\u0004\u00086\u00107J#\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040/2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u00088\u00109J#\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020#0/2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008:\u00109J%\u0010;\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u000f0)H\u0002\u00a2\u0006\u0004\u0008;\u0010,J\u0019\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008=\u0010>J\'\u0010B\u001a\u00020\u000f2\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u000f0)2\u0008\u0010A\u001a\u0004\u0018\u00010@H\u0000\u00a2\u0006\u0004\u0008B\u0010CJ\r\u0010D\u001a\u00020\u000f\u00a2\u0006\u0004\u0008D\u0010ER\u0014\u0010H\u001a\u00020\u00178\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\"\u0010O\u001a\u00020I8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008D\u0010J\u001a\u0004\u0008K\u0010L\"\u0004\u0008M\u0010NR$\u0010T\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010P\u001a\u0004\u0008Q\u0010R\"\u0004\u0008S\u0010\"R$\u0010Z\u001a\u00020U2\u0006\u0010V\u001a\u00020U8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008%\u0010W\u001a\u0004\u0008X\u0010YR$\u0010^\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u00068\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u00082\u0010[\u001a\u0004\u0008\\\u0010]R$\u0010`\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u00068\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u00086\u0010[\u001a\u0004\u0008_\u0010]R(\u0010h\u001a\u0008\u0012\u0004\u0012\u00020b0a8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00088\u0010c\u001a\u0004\u0008d\u0010e\"\u0004\u0008f\u0010gR(\u0010k\u001a\u0008\u0012\u0004\u0012\u0002010a8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008:\u0010c\u001a\u0004\u0008i\u0010e\"\u0004\u0008j\u0010gR$\u0010q\u001a\u0004\u0018\u00010<8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010l\u001a\u0004\u0008m\u0010n\"\u0004\u0008o\u0010pR\u0018\u0010t\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008=\u0010sR.\u0010z\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001d0/8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008K\u0010u\u001a\u0004\u0008v\u0010w\"\u0004\u0008x\u0010yR\u0016\u0010|\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008i\u0010{R\u0016\u0010}\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\\\u0010[R\u0016\u0010~\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008_\u0010[R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008v\u0010\u007fR\u001e\u0010\u0082\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000f0)8\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\u0008m\u0010\u0081\u0001\u00a8\u0006\u0083\u0001"
    }
    d2 = {
        "Lcom/opensource/svgaplayer/SVGAVideoEntity;",
        "",
        "Lorg/json/JSONObject;",
        "json",
        "Ljava/io/File;",
        "cacheDir",
        "",
        "frameWidth",
        "frameHeight",
        "<init>",
        "(Lorg/json/JSONObject;Ljava/io/File;II)V",
        "Lcom/opensource/svgaplayer/proto/MovieEntity;",
        "entity",
        "(Lcom/opensource/svgaplayer/proto/MovieEntity;Ljava/io/File;II)V",
        "movieObject",
        "",
        "z",
        "(Lorg/json/JSONObject;)V",
        "Lcom/opensource/svgaplayer/proto/MovieParams;",
        "movieParams",
        "A",
        "(Lcom/opensource/svgaplayer/proto/MovieParams;)V",
        "t",
        "",
        "imgName",
        "imgKey",
        "i",
        "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
        "filePath",
        "Landroid/graphics/Bitmap;",
        "c",
        "(Ljava/lang/String;)Landroid/graphics/Bitmap;",
        "obj",
        "s",
        "(Lcom/opensource/svgaplayer/proto/MovieEntity;)V",
        "",
        "byteArray",
        "d",
        "([BLjava/lang/String;)Landroid/graphics/Bitmap;",
        "w",
        "v",
        "Lkotlin/Function0;",
        "completionBlock",
        "y",
        "(Lcom/opensource/svgaplayer/proto/MovieEntity;Lkotlin/jvm/functions/Function0;)V",
        "Lcom/opensource/svgaplayer/proto/AudioEntity;",
        "audio",
        "Ljava/util/HashMap;",
        "audiosFileMap",
        "Li90/a;",
        "e",
        "(Lcom/opensource/svgaplayer/proto/AudioEntity;Ljava/util/HashMap;)Li90/a;",
        "audioCache",
        "value",
        "f",
        "(Ljava/io/File;[B)Ljava/io/File;",
        "g",
        "(Lcom/opensource/svgaplayer/proto/MovieEntity;)Ljava/util/HashMap;",
        "h",
        "B",
        "Landroid/media/SoundPool;",
        "j",
        "(Lcom/opensource/svgaplayer/proto/MovieEntity;)Landroid/media/SoundPool;",
        "callback",
        "Lcom/opensource/svgaplayer/SVGAParser$c;",
        "playCallback",
        "u",
        "(Lkotlin/jvm/functions/Function0;Lcom/opensource/svgaplayer/SVGAParser$c;)V",
        "b",
        "()V",
        "a",
        "Ljava/lang/String;",
        "TAG",
        "",
        "Z",
        "k",
        "()Z",
        "x",
        "(Z)V",
        "antiAlias",
        "Lcom/opensource/svgaplayer/proto/MovieEntity;",
        "getMovieItem",
        "()Lcom/opensource/svgaplayer/proto/MovieEntity;",
        "setMovieItem",
        "movieItem",
        "Lj90/d;",
        "<set-?>",
        "Lj90/d;",
        "r",
        "()Lj90/d;",
        "videoSize",
        "I",
        "m",
        "()I",
        "FPS",
        "n",
        "frames",
        "",
        "Li90/f;",
        "Ljava/util/List;",
        "q",
        "()Ljava/util/List;",
        "setSpriteList$com_opensource_svgaplayer",
        "(Ljava/util/List;)V",
        "spriteList",
        "l",
        "setAudioList$com_opensource_svgaplayer",
        "audioList",
        "Landroid/media/SoundPool;",
        "p",
        "()Landroid/media/SoundPool;",
        "setSoundPool$com_opensource_svgaplayer",
        "(Landroid/media/SoundPool;)V",
        "soundPool",
        "Lcom/opensource/svgaplayer/h$a;",
        "Lcom/opensource/svgaplayer/h$a;",
        "soundCallback",
        "Ljava/util/HashMap;",
        "o",
        "()Ljava/util/HashMap;",
        "setImageMap$com_opensource_svgaplayer",
        "(Ljava/util/HashMap;)V",
        "imageMap",
        "Ljava/io/File;",
        "mCacheDir",
        "mFrameHeight",
        "mFrameWidth",
        "Lcom/opensource/svgaplayer/SVGAParser$c;",
        "mPlayCallback",
        "Lkotlin/jvm/functions/Function0;",
        "mCallback",
        "com.opensource.svgaplayer"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Z

.field public c:Lcom/opensource/svgaplayer/proto/MovieEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public d:Lj90/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:I

.field public f:I

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li90/f;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li90/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public i:Landroid/media/SoundPool;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public j:Lcom/opensource/svgaplayer/h$a;

.field public k:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public l:Ljava/io/File;

.field public m:I

.field public n:I

.field public o:Lcom/opensource/svgaplayer/SVGAParser$c;

.field public p:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/opensource/svgaplayer/proto/MovieEntity;Ljava/io/File;II)V
    .locals 10
    .param p1    # Lcom/opensource/svgaplayer/proto/MovieEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const-string v0, "SVGAVideoEntity"

    iput-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->a:Ljava/lang/String;

    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->b:Z

    .line 21
    new-instance v1, Lj90/d;

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    invoke-direct/range {v1 .. v9}, Lj90/d;-><init>(DDDD)V

    iput-object v1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->d:Lj90/d;

    const/16 v0, 0xf

    .line 22
    iput v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->e:I

    .line 23
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->g:Ljava/util/List;

    .line 24
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->h:Ljava/util/List;

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->k:Ljava/util/HashMap;

    .line 26
    iput p3, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->n:I

    .line 27
    iput p4, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->m:I

    .line 28
    iput-object p2, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->l:Ljava/io/File;

    .line 29
    iput-object p1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->c:Lcom/opensource/svgaplayer/proto/MovieEntity;

    .line 30
    iget-object p2, p1, Lcom/opensource/svgaplayer/proto/MovieEntity;->params:Lcom/opensource/svgaplayer/proto/MovieParams;

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->A(Lcom/opensource/svgaplayer/proto/MovieParams;)V

    .line 31
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->s(Lcom/opensource/svgaplayer/proto/MovieEntity;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p2, v0

    .line 32
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    move-object p2, v0

    .line 33
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 34
    :goto_0
    invoke-virtual {p0, p1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->v(Lcom/opensource/svgaplayer/proto/MovieEntity;)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;Ljava/io/File;II)V
    .locals 10
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, "SVGAVideoEntity"

    iput-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->a:Ljava/lang/String;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->b:Z

    .line 4
    new-instance v1, Lj90/d;

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    invoke-direct/range {v1 .. v9}, Lj90/d;-><init>(DDDD)V

    iput-object v1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->d:Lj90/d;

    const/16 v0, 0xf

    .line 5
    iput v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->e:I

    .line 6
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->g:Ljava/util/List;

    .line 7
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->h:Ljava/util/List;

    .line 8
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->k:Ljava/util/HashMap;

    .line 9
    iput p3, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->n:I

    .line 10
    iput p4, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->m:I

    .line 11
    iput-object p2, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->l:Ljava/io/File;

    .line 12
    const-string/jumbo p2, "movie"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 13
    invoke-virtual {p0, p2}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->z(Lorg/json/JSONObject;)V

    .line 14
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->t(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p2, v0

    .line 15
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    move-object p2, v0

    .line 16
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 17
    :goto_0
    invoke-virtual {p0, p1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->w(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public static final synthetic a(Lcom/opensource/svgaplayer/SVGAVideoEntity;)Lkotlin/jvm/functions/Function0;
    .locals 1

    .line 1
    .line 2
    iget-object p0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->p:Lkotlin/jvm/functions/Function0;

    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    const-string v0, "mCallback"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    :cond_0
    return-object p0
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


# virtual methods
.method public final A(Lcom/opensource/svgaplayer/proto/MovieParams;)V
    .locals 11

    .line 1
    .line 2
    iget-object v0, p1, Lcom/opensource/svgaplayer/proto/MovieParams;->viewBoxWidth:Ljava/lang/Float;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    float-to-double v7, v0

    .line 13
    .line 14
    iget-object v0, p1, Lcom/opensource/svgaplayer/proto/MovieParams;->viewBoxHeight:Ljava/lang/Float;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 20
    move-result v1

    .line 21
    :cond_1
    float-to-double v9, v1

    .line 22
    .line 23
    new-instance v2, Lj90/d;

    .line 24
    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    const-wide/16 v5, 0x0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v2 .. v10}, Lj90/d;-><init>(DDDD)V

    .line 31
    .line 32
    iput-object v2, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->d:Lj90/d;

    .line 33
    .line 34
    iget-object v0, p1, Lcom/opensource/svgaplayer/proto/MovieParams;->fps:Ljava/lang/Integer;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 40
    move-result v0

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :cond_2
    const/16 v0, 0x14

    .line 44
    .line 45
    :goto_1
    iput v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->e:I

    .line 46
    .line 47
    iget-object p1, p1, Lcom/opensource/svgaplayer/proto/MovieParams;->frames:Ljava/lang/Integer;

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 53
    move-result p1

    .line 54
    goto :goto_2

    .line 55
    :cond_3
    const/4 p1, 0x0

    .line 56
    .line 57
    :goto_2
    iput p1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->f:I

    .line 58
    return-void
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

.method public final B(Lcom/opensource/svgaplayer/proto/MovieEntity;Lkotlin/jvm/functions/Function0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/opensource/svgaplayer/proto/MovieEntity;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    iput v1, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 9
    .line 10
    sget-object v1, Lcom/opensource/svgaplayer/h;->e:Lcom/opensource/svgaplayer/h;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/opensource/svgaplayer/h;->b()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    new-instance v1, Lcom/opensource/svgaplayer/SVGAVideoEntity$a;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, p0, v0, p1, p2}, Lcom/opensource/svgaplayer/SVGAVideoEntity$a;-><init>(Lcom/opensource/svgaplayer/SVGAVideoEntity;Lkotlin/jvm/internal/Ref$IntRef;Lcom/opensource/svgaplayer/proto/MovieEntity;Lkotlin/jvm/functions/Function0;)V

    .line 22
    .line 23
    iput-object v1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->j:Lcom/opensource/svgaplayer/h$a;

    .line 24
    return-void

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0, p1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->j(Lcom/opensource/svgaplayer/proto/MovieEntity;)Landroid/media/SoundPool;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    iput-object v1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->i:Landroid/media/SoundPool;

    .line 31
    .line 32
    sget-object v1, Lk90/c;->a:Lk90/c;

    .line 33
    .line 34
    const-string v2, "SVGAParser"

    .line 35
    .line 36
    .line 37
    const-string/jumbo v3, "pool_start"

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2, v3}, Lk90/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    iget-object v1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->i:Landroid/media/SoundPool;

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    new-instance v2, Lcom/opensource/svgaplayer/SVGAVideoEntity$b;

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, v0, p1, p2}, Lcom/opensource/svgaplayer/SVGAVideoEntity$b;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lcom/opensource/svgaplayer/proto/MovieEntity;Lkotlin/jvm/functions/Function0;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroid/media/SoundPool;->setOnLoadCompleteListener(Landroid/media/SoundPool$OnLoadCompleteListener;)V

    .line 53
    :cond_1
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
    .line 82
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
.end method

.method public final b()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/opensource/svgaplayer/h;->e:Lcom/opensource/svgaplayer/h;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/opensource/svgaplayer/h;->b()Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->h:Ljava/util/List;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    check-cast v2, Li90/a;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Li90/a;->c()Ljava/lang/Integer;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 37
    move-result v2

    .line 38
    .line 39
    sget-object v3, Lcom/opensource/svgaplayer/h;->e:Lcom/opensource/svgaplayer/h;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v2}, Lcom/opensource/svgaplayer/h;->f(I)V

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_1
    iput-object v1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->j:Lcom/opensource/svgaplayer/h$a;

    .line 46
    .line 47
    :cond_2
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->i:Landroid/media/SoundPool;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/media/SoundPool;->release()V

    .line 53
    .line 54
    :cond_3
    iput-object v1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->i:Landroid/media/SoundPool;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    iput-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->h:Ljava/util/List;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    iput-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->g:Ljava/util/List;

    .line 67
    .line 68
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->k:Ljava/util/HashMap;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 72
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
.end method

.method public final c(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lg90/d;->a:Lg90/d;

    .line 3
    .line 4
    iget v1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->n:I

    .line 5
    .line 6
    iget v2, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->m:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, v1, v2}, Lg90/c;->a(Ljava/lang/Object;II)Landroid/graphics/Bitmap;

    .line 10
    move-result-object p1

    .line 11
    return-object p1
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

.method public final d([BLjava/lang/String;)Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lg90/b;->a:Lg90/b;

    .line 3
    .line 4
    iget v1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->n:I

    .line 5
    .line 6
    iget v2, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->m:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, v1, v2}, Lg90/c;->a(Ljava/lang/Object;II)Landroid/graphics/Bitmap;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    return-object p1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0, p2}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 17
    move-result-object p1

    .line 18
    return-object p1
    .line 19
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
.end method

.method public final e(Lcom/opensource/svgaplayer/proto/AudioEntity;Ljava/util/HashMap;)Li90/a;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/opensource/svgaplayer/proto/AudioEntity;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            ">;)",
            "Li90/a;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v0, p1

    .line 5
    .line 6
    new-instance v2, Li90/a;

    .line 7
    .line 8
    .line 9
    invoke-direct {v2, v0}, Li90/a;-><init>(Lcom/opensource/svgaplayer/proto/AudioEntity;)V

    .line 10
    .line 11
    iget-object v3, v0, Lcom/opensource/svgaplayer/proto/AudioEntity;->startTime:Ljava/lang/Integer;

    .line 12
    const/4 v4, 0x0

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 18
    move-result v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v3, v4

    .line 21
    :goto_0
    int-to-double v5, v3

    .line 22
    .line 23
    iget-object v3, v0, Lcom/opensource/svgaplayer/proto/AudioEntity;->totalTime:Ljava/lang/Integer;

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 29
    move-result v4

    .line 30
    :cond_1
    int-to-double v3, v4

    .line 31
    double-to-int v7, v3

    .line 32
    .line 33
    if-nez v7, :cond_2

    .line 34
    .line 35
    goto/16 :goto_5

    .line 36
    .line 37
    :cond_2
    iget-object v7, v1, Lcom/opensource/svgaplayer/SVGAVideoEntity;->o:Lcom/opensource/svgaplayer/SVGAParser$c;

    .line 38
    .line 39
    if-eqz v7, :cond_5

    .line 40
    .line 41
    new-instance v0, Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 48
    move-result-object v3

    .line 49
    .line 50
    .line 51
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    move-result v4

    .line 57
    .line 58
    if-eqz v4, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    move-result-object v4

    .line 63
    .line 64
    check-cast v4, Ljava/util/Map$Entry;

    .line 65
    .line 66
    .line 67
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 68
    move-result-object v4

    .line 69
    .line 70
    .line 71
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    goto :goto_1

    .line 73
    .line 74
    .line 75
    :cond_3
    invoke-interface {v7, v0}, Lcom/opensource/svgaplayer/SVGAParser$c;->a(Ljava/util/List;)V

    .line 76
    .line 77
    iget-object v0, v1, Lcom/opensource/svgaplayer/SVGAVideoEntity;->p:Lkotlin/jvm/functions/Function0;

    .line 78
    .line 79
    if-nez v0, :cond_4

    .line 80
    .line 81
    const-string v3, "mCallback"

    .line 82
    .line 83
    .line 84
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 88
    return-object v2

    .line 89
    .line 90
    :cond_5
    iget-object v0, v0, Lcom/opensource/svgaplayer/proto/AudioEntity;->audioKey:Ljava/lang/String;

    .line 91
    .line 92
    move-object/from16 v7, p2

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    check-cast v0, Ljava/io/File;

    .line 99
    .line 100
    if-eqz v0, :cond_8

    .line 101
    .line 102
    new-instance v7, Ljava/io/FileInputStream;

    .line 103
    .line 104
    .line 105
    invoke-direct {v7, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 106
    .line 107
    .line 108
    :try_start_0
    invoke-virtual {v7}, Ljava/io/FileInputStream;->available()I

    .line 109
    move-result v0

    .line 110
    int-to-double v8, v0

    .line 111
    div-double/2addr v5, v3

    .line 112
    mul-double/2addr v5, v8

    .line 113
    double-to-long v13, v5

    .line 114
    .line 115
    sget-object v10, Lcom/opensource/svgaplayer/h;->e:Lcom/opensource/svgaplayer/h;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v10}, Lcom/opensource/svgaplayer/h;->b()Z

    .line 119
    move-result v0

    .line 120
    const/4 v3, 0x0

    .line 121
    .line 122
    if-eqz v0, :cond_6

    .line 123
    .line 124
    iget-object v11, v1, Lcom/opensource/svgaplayer/SVGAVideoEntity;->j:Lcom/opensource/svgaplayer/h$a;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    .line 128
    move-result-object v12

    .line 129
    double-to-long v4, v8

    .line 130
    .line 131
    const/16 v17, 0x1

    .line 132
    move-wide v15, v4

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v10 .. v17}, Lcom/opensource/svgaplayer/h;->c(Lcom/opensource/svgaplayer/h$a;Ljava/io/FileDescriptor;JJI)I

    .line 136
    move-result v0

    .line 137
    .line 138
    .line 139
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v0}, Li90/a;->f(Ljava/lang/Integer;)V

    .line 144
    goto :goto_3

    .line 145
    :catchall_0
    move-exception v0

    .line 146
    move-object v2, v0

    .line 147
    goto :goto_4

    .line 148
    .line 149
    :cond_6
    iget-object v10, v1, Lcom/opensource/svgaplayer/SVGAVideoEntity;->i:Landroid/media/SoundPool;

    .line 150
    .line 151
    if-eqz v10, :cond_7

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    .line 155
    move-result-object v11

    .line 156
    double-to-long v4, v8

    .line 157
    .line 158
    const/16 v16, 0x1

    .line 159
    move-wide v12, v13

    .line 160
    move-wide v14, v4

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v10 .. v16}, Landroid/media/SoundPool;->load(Ljava/io/FileDescriptor;JJI)I

    .line 164
    move-result v0

    .line 165
    .line 166
    .line 167
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    move-result-object v0

    .line 169
    goto :goto_2

    .line 170
    :cond_7
    move-object v0, v3

    .line 171
    .line 172
    .line 173
    :goto_2
    invoke-virtual {v2, v0}, Li90/a;->f(Ljava/lang/Integer;)V

    .line 174
    .line 175
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    .line 177
    .line 178
    invoke-static {v7, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 179
    return-object v2

    .line 180
    :goto_4
    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 181
    :catchall_1
    move-exception v0

    .line 182
    .line 183
    .line 184
    invoke-static {v7, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 185
    throw v0

    .line 186
    :cond_8
    :goto_5
    return-object v2
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
.end method

.method public final f(Ljava/io/File;[B)Ljava/io/File;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z

    .line 4
    .line 5
    new-instance v0, Ljava/io/FileOutputStream;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/io/FileOutputStream;->write([B)V

    .line 12
    return-object p1
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
.end method

.method public final g(Lcom/opensource/svgaplayer/proto/MovieEntity;)Ljava/util/HashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/opensource/svgaplayer/proto/MovieEntity;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->h(Lcom/opensource/svgaplayer/proto/MovieEntity;)Ljava/util/HashMap;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    new-instance v0, Ljava/util/HashMap;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 13
    move-result v1

    .line 14
    .line 15
    if-lez v1, :cond_2

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    check-cast v1, Ljava/util/Map$Entry;

    .line 36
    .line 37
    sget-object v2, Lcom/opensource/svgaplayer/SVGACache;->c:Lcom/opensource/svgaplayer/SVGACache;

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    check-cast v3, Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v3}, Lcom/opensource/svgaplayer/SVGACache;->a(Ljava/lang/String;)Ljava/io/File;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 55
    move-result v4

    .line 56
    .line 57
    if-eqz v4, :cond_0

    .line 58
    move-object v4, v2

    .line 59
    goto :goto_1

    .line 60
    :cond_0
    const/4 v4, 0x0

    .line 61
    .line 62
    :goto_1
    if-eqz v4, :cond_1

    .line 63
    goto :goto_2

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    check-cast v1, [B

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v2, v1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->f(Ljava/io/File;[B)Ljava/io/File;

    .line 73
    move-result-object v4

    .line 74
    .line 75
    .line 76
    :goto_2
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    return-object v0
    .line 79
    .line 80
    .line 81
.end method

.method public final h(Lcom/opensource/svgaplayer/proto/MovieEntity;)Ljava/util/HashMap;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/opensource/svgaplayer/proto/MovieEntity;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    iget-object p1, p1, Lcom/opensource/svgaplayer/proto/MovieEntity;->images:Ljava/util/Map;

    .line 8
    .line 9
    if-eqz p1, :cond_3

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    if-eqz p1, :cond_3

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    move-result v1

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    check-cast v1, Ljava/util/Map$Entry;

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    check-cast v1, Lokio/ByteString;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lokio/ByteString;->toByteArray()[B

    .line 47
    move-result-object v1

    .line 48
    .line 49
    const-string v3, "byteArray"

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    array-length v3, v1

    .line 54
    const/4 v4, 0x4

    .line 55
    .line 56
    if-ge v3, v4, :cond_1

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :cond_1
    new-instance v3, Lkotlin/ranges/IntRange;

    .line 60
    const/4 v4, 0x3

    .line 61
    const/4 v5, 0x0

    .line 62
    .line 63
    .line 64
    invoke-direct {v3, v5, v4}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v3}, Lkotlin/collections/ArraysKt;->slice([BLkotlin/ranges/IntRange;)Ljava/util/List;

    .line 68
    move-result-object v3

    .line 69
    .line 70
    .line 71
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    move-result-object v4

    .line 73
    .line 74
    check-cast v4, Ljava/lang/Number;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    .line 78
    move-result v4

    .line 79
    .line 80
    const/16 v6, 0x49

    .line 81
    .line 82
    const-string v7, "imageKey"

    .line 83
    const/4 v8, 0x2

    .line 84
    const/4 v9, 0x1

    .line 85
    .line 86
    if-ne v4, v6, :cond_2

    .line 87
    .line 88
    .line 89
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    move-result-object v4

    .line 91
    .line 92
    check-cast v4, Ljava/lang/Number;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    .line 96
    move-result v4

    .line 97
    .line 98
    const/16 v6, 0x44

    .line 99
    .line 100
    if-ne v4, v6, :cond_2

    .line 101
    .line 102
    .line 103
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    move-result-object v4

    .line 105
    .line 106
    check-cast v4, Ljava/lang/Number;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    .line 110
    move-result v4

    .line 111
    .line 112
    const/16 v6, 0x33

    .line 113
    .line 114
    if-ne v4, v6, :cond_2

    .line 115
    .line 116
    .line 117
    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    goto :goto_0

    .line 122
    .line 123
    .line 124
    :cond_2
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    move-result-object v4

    .line 126
    .line 127
    check-cast v4, Ljava/lang/Number;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    .line 131
    move-result v4

    .line 132
    const/4 v5, -0x1

    .line 133
    .line 134
    if-ne v4, v5, :cond_0

    .line 135
    .line 136
    .line 137
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    move-result-object v4

    .line 139
    .line 140
    check-cast v4, Ljava/lang/Number;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    .line 144
    move-result v4

    .line 145
    const/4 v5, -0x5

    .line 146
    .line 147
    if-ne v4, v5, :cond_0

    .line 148
    .line 149
    .line 150
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 151
    move-result-object v3

    .line 152
    .line 153
    check-cast v3, Ljava/lang/Number;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/Number;->byteValue()B

    .line 157
    move-result v3

    .line 158
    .line 159
    const/16 v4, -0x6c

    .line 160
    .line 161
    if-ne v3, v4, :cond_0

    .line 162
    .line 163
    .line 164
    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    :cond_3
    return-object v0
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

.method public final i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->l:Ljava/io/File;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "/"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v2, ".png"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    new-instance v3, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    iget-object v4, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->l:Ljava/io/File;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 54
    move-result-object v4

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    move-result-object p2

    .line 71
    .line 72
    new-instance v1, Ljava/io/File;

    .line 73
    .line 74
    .line 75
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 79
    move-result v1

    .line 80
    .line 81
    if-eqz v1, :cond_0

    .line 82
    return-object p1

    .line 83
    .line 84
    :cond_0
    new-instance p1, Ljava/io/File;

    .line 85
    .line 86
    .line 87
    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 91
    move-result p1

    .line 92
    .line 93
    if-eqz p1, :cond_1

    .line 94
    return-object v0

    .line 95
    .line 96
    :cond_1
    new-instance p1, Ljava/io/File;

    .line 97
    .line 98
    .line 99
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 103
    move-result p1

    .line 104
    .line 105
    if-eqz p1, :cond_2

    .line 106
    return-object p2

    .line 107
    .line 108
    :cond_2
    const-string p1, ""

    .line 109
    return-object p1
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
.end method

.method public final j(Lcom/opensource/svgaplayer/proto/MovieEntity;)Landroid/media/SoundPool;
    .locals 2

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 6
    const/4 v1, 0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    new-instance v1, Landroid/media/SoundPool$Builder;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Landroid/media/SoundPool$Builder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroid/media/SoundPool$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/SoundPool$Builder;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iget-object p1, p1, Lcom/opensource/svgaplayer/proto/MovieEntity;->audios:Ljava/util/List;

    .line 26
    .line 27
    const-string v1, "entity.audios"

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 34
    move-result p1

    .line 35
    .line 36
    const/16 v1, 0xc

    .line 37
    .line 38
    .line 39
    invoke-static {v1, p1}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    .line 40
    move-result p1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Landroid/media/SoundPool$Builder;->setMaxStreams(I)Landroid/media/SoundPool$Builder;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/media/SoundPool$Builder;->build()Landroid/media/SoundPool;

    .line 48
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    return-object p1

    .line 50
    :catch_0
    move-exception p1

    .line 51
    .line 52
    sget-object v0, Lk90/c;->a:Lk90/c;

    .line 53
    .line 54
    iget-object v1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->a:Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1, p1}, Lk90/c;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    const/4 p1, 0x0

    .line 59
    return-object p1
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

.method public final k()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->b:Z

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

.method public final l()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li90/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->h:Ljava/util/List;

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

.method public final m()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->e:I

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

.method public final n()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->f:I

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

.method public final o()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->k:Ljava/util/HashMap;

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

.method public final p()Landroid/media/SoundPool;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->i:Landroid/media/SoundPool;

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

.method public final q()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li90/f;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->g:Ljava/util/List;

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

.method public final r()Lj90/d;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->d:Lj90/d;

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

.method public final s(Lcom/opensource/svgaplayer/proto/MovieEntity;)V
    .locals 5

    .line 1
    .line 2
    iget-object p1, p1, Lcom/opensource/svgaplayer/proto/MovieEntity;->images:Ljava/util/Map;

    .line 3
    .line 4
    if-eqz p1, :cond_3

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    if-eqz p1, :cond_3

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    check-cast v0, Ljava/util/Map$Entry;

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    check-cast v1, Lokio/ByteString;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lokio/ByteString;->toByteArray()[B

    .line 36
    move-result-object v1

    .line 37
    .line 38
    const-string v2, "byteArray"

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    array-length v2, v1

    .line 43
    const/4 v3, 0x4

    .line 44
    .line 45
    if-ge v2, v3, :cond_1

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_1
    new-instance v2, Lkotlin/ranges/IntRange;

    .line 49
    const/4 v3, 0x3

    .line 50
    const/4 v4, 0x0

    .line 51
    .line 52
    .line 53
    invoke-direct {v2, v4, v3}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1, v2}, Lkotlin/collections/ArraysKt;->slice([BLkotlin/ranges/IntRange;)Ljava/util/List;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    .line 60
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    check-cast v3, Ljava/lang/Number;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/Number;->byteValue()B

    .line 67
    move-result v3

    .line 68
    .line 69
    const/16 v4, 0x49

    .line 70
    .line 71
    if-ne v3, v4, :cond_2

    .line 72
    const/4 v3, 0x1

    .line 73
    .line 74
    .line 75
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    move-result-object v3

    .line 77
    .line 78
    check-cast v3, Ljava/lang/Number;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Number;->byteValue()B

    .line 82
    move-result v3

    .line 83
    .line 84
    const/16 v4, 0x44

    .line 85
    .line 86
    if-ne v3, v4, :cond_2

    .line 87
    const/4 v3, 0x2

    .line 88
    .line 89
    .line 90
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    move-result-object v2

    .line 92
    .line 93
    check-cast v2, Ljava/lang/Number;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Number;->byteValue()B

    .line 97
    move-result v2

    .line 98
    .line 99
    const/16 v3, 0x33

    .line 100
    .line 101
    if-ne v2, v3, :cond_2

    .line 102
    goto :goto_0

    .line 103
    .line 104
    .line 105
    :cond_2
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 106
    move-result-object v2

    .line 107
    .line 108
    check-cast v2, Lokio/ByteString;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Lokio/ByteString;->utf8()Ljava/lang/String;

    .line 112
    move-result-object v2

    .line 113
    .line 114
    const-string v3, "entry.value.utf8()"

    .line 115
    .line 116
    .line 117
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 121
    move-result-object v3

    .line 122
    .line 123
    const-string v4, "entry.key"

    .line 124
    .line 125
    .line 126
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    check-cast v3, Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v2, v3}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    move-result-object v2

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, v1, v2}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->d([BLjava/lang/String;)Landroid/graphics/Bitmap;

    .line 136
    move-result-object v1

    .line 137
    .line 138
    if-eqz v1, :cond_0

    .line 139
    .line 140
    iget-object v2, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->k:Ljava/util/HashMap;

    .line 141
    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    :cond_3
    return-void
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

.method public final t(Lorg/json/JSONObject;)V
    .locals 8

    .line 1
    .line 2
    const-string v0, "images"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v1, "imgJson.keys()"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v1

    .line 28
    move-object v2, v1

    .line 29
    .line 30
    check-cast v2, Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    const-string v3, "imgKey"

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1, v2}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 51
    move-result v3

    .line 52
    .line 53
    if-nez v3, :cond_1

    .line 54
    return-void

    .line 55
    :cond_1
    const/4 v6, 0x4

    .line 56
    const/4 v7, 0x0

    .line 57
    .line 58
    const-string v3, ".matte"

    .line 59
    .line 60
    const-string v4, ""

    .line 61
    const/4 v5, 0x0

    .line 62
    .line 63
    .line 64
    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    iget-object v3, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->k:Ljava/util/HashMap;

    .line 74
    .line 75
    .line 76
    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    return-void
    .line 79
    .line 80
    .line 81
.end method

.method public final u(Lkotlin/jvm/functions/Function0;Lcom/opensource/svgaplayer/SVGAParser$c;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/opensource/svgaplayer/SVGAParser$c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/opensource/svgaplayer/SVGAParser$c;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->p:Lkotlin/jvm/functions/Function0;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->o:Lcom/opensource/svgaplayer/SVGAParser$c;

    .line 5
    .line 6
    iget-object p2, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->c:Lcom/opensource/svgaplayer/proto/MovieEntity;

    .line 7
    .line 8
    if-nez p2, :cond_1

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const-string p2, "mCallback"

    .line 13
    .line 14
    .line 15
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 19
    return-void

    .line 20
    .line 21
    :cond_1
    if-nez p2, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 25
    .line 26
    :cond_2
    new-instance p1, Lcom/opensource/svgaplayer/SVGAVideoEntity$prepare$1;

    .line 27
    .line 28
    .line 29
    invoke-direct {p1, p0}, Lcom/opensource/svgaplayer/SVGAVideoEntity$prepare$1;-><init>(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p2, p1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->y(Lcom/opensource/svgaplayer/proto/MovieEntity;Lkotlin/jvm/functions/Function0;)V

    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final v(Lcom/opensource/svgaplayer/proto/MovieEntity;)V
    .locals 4

    .line 1
    .line 2
    iget-object p1, p1, Lcom/opensource/svgaplayer/proto/MovieEntity;->sprites:Ljava/util/List;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    move-result v1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    check-cast v1, Lcom/opensource/svgaplayer/proto/SpriteEntity;

    .line 32
    .line 33
    new-instance v2, Li90/f;

    .line 34
    .line 35
    const-string v3, "it"

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v2, v1}, Li90/f;-><init>(Lcom/opensource/svgaplayer/proto/SpriteEntity;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 45
    goto :goto_0

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    :cond_1
    iput-object v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->g:Ljava/util/List;

    .line 52
    return-void
    .line 53
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

.method public final w(Lorg/json/JSONObject;)V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "sprites"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    :goto_0
    if-ge v2, v1, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    new-instance v4, Li90/f;

    .line 30
    .line 31
    .line 32
    invoke-direct {v4, v3}, Li90/f;-><init>(Lorg/json/JSONObject;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 38
    goto :goto_0

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    iput-object p1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->g:Ljava/util/List;

    .line 45
    return-void
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

.method public final x(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->b:Z

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

.method public final y(Lcom/opensource/svgaplayer/proto/MovieEntity;Lkotlin/jvm/functions/Function0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/opensource/svgaplayer/proto/MovieEntity;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p1, Lcom/opensource/svgaplayer/proto/MovieEntity;->audios:Ljava/util/List;

    .line 3
    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->B(Lcom/opensource/svgaplayer/proto/MovieEntity;Lkotlin/jvm/functions/Function0;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->g(Lcom/opensource/svgaplayer/proto/MovieEntity;)Ljava/util/HashMap;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 22
    move-result v1

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 28
    return-void

    .line 29
    .line 30
    :cond_1
    iget-object p1, p1, Lcom/opensource/svgaplayer/proto/MovieEntity;->audios:Ljava/util/List;

    .line 31
    .line 32
    new-instance p2, Ljava/util/ArrayList;

    .line 33
    .line 34
    const/16 v1, 0xa

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 38
    move-result v1

    .line 39
    .line 40
    .line 41
    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    move-result v1

    .line 50
    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    check-cast v1, Lcom/opensource/svgaplayer/proto/AudioEntity;

    .line 58
    .line 59
    const-string v2, "audio"

    .line 60
    .line 61
    .line 62
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v1, v0}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->e(Lcom/opensource/svgaplayer/proto/AudioEntity;Ljava/util/HashMap;)Li90/a;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    .line 69
    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    goto :goto_0

    .line 71
    .line 72
    :cond_2
    iput-object p2, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->h:Ljava/util/List;

    .line 73
    return-void

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_1
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 77
    return-void
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
.end method

.method public final z(Lorg/json/JSONObject;)V
    .locals 13

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "viewBox"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    const-string/jumbo v1, "width"

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 18
    move-result-wide v9

    .line 19
    .line 20
    const-string v1, "height"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 24
    move-result-wide v11

    .line 25
    .line 26
    new-instance v4, Lj90/d;

    .line 27
    .line 28
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    .line 33
    invoke-direct/range {v4 .. v12}, Lj90/d;-><init>(DDDD)V

    .line 34
    .line 35
    iput-object v4, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->d:Lj90/d;

    .line 36
    .line 37
    :cond_0
    const-string v0, "fps"

    .line 38
    .line 39
    const/16 v1, 0x14

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 43
    move-result v0

    .line 44
    .line 45
    iput v0, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->e:I

    .line 46
    .line 47
    const-string v0, "frames"

    .line 48
    const/4 v1, 0x0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 52
    move-result p1

    .line 53
    .line 54
    iput p1, p0, Lcom/opensource/svgaplayer/SVGAVideoEntity;->f:I

    .line 55
    return-void
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
