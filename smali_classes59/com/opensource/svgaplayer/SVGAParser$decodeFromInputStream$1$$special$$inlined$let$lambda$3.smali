.class final Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$$special$$inlined$let$lambda$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SVGAParser.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "com/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$1$3$1",
        "com/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$$special$$inlined$let$lambda$1"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xf
    }
.end annotation


# instance fields
.field final synthetic $videoItem:Lcom/opensource/svgaplayer/SVGAVideoEntity;

.field final synthetic this$0:Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1;


# direct methods
.method public constructor <init>(Lcom/opensource/svgaplayer/SVGAVideoEntity;Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$$special$$inlined$let$lambda$3;->$videoItem:Lcom/opensource/svgaplayer/SVGAVideoEntity;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$$special$$inlined$let$lambda$3;->this$0:Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1;

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    return-void
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


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$$special$$inlined$let$lambda$3;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    sget-object v0, Lk90/c;->a:Lk90/c;

    const-string v1, "SVGAParser"

    const-string v2, "SVGAVideoEntity prepare success"

    invoke-virtual {v0, v1, v2}, Lk90/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$$special$$inlined$let$lambda$3;->this$0:Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1;

    iget-object v1, v0, Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1;->b:Lcom/opensource/svgaplayer/SVGAParser;

    iget-object v2, p0, Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$$special$$inlined$let$lambda$3;->$videoItem:Lcom/opensource/svgaplayer/SVGAVideoEntity;

    iget-object v3, v0, Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1;->e:Lcom/opensource/svgaplayer/SVGAParser$b;

    iget-object v0, v0, Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1;->f:Ljava/lang/String;

    invoke-static {v1, v2, v3, v0}, Lcom/opensource/svgaplayer/SVGAParser;->i(Lcom/opensource/svgaplayer/SVGAParser;Lcom/opensource/svgaplayer/SVGAVideoEntity;Lcom/opensource/svgaplayer/SVGAParser$b;Ljava/lang/String;)V

    return-void
.end method
