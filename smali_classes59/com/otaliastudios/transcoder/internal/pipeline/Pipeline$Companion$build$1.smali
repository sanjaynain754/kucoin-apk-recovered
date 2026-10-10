.class final Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$Companion$build$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Pipeline.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$Companion;->build$lib_release$default(Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$Companion;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a<",
        "Lkotlin/Unit;",
        "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;",
        "",
        "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
        "<anonymous>",
        "()Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$Companion$build$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$Companion$build$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$Companion$build$1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$Companion$build$1;->INSTANCE:Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$Companion$build$1;

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

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

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
.end method


# virtual methods
.method public final invoke()Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a<",
            "Lkotlin/Unit;",
            "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$Companion$build$1;->invoke()Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;

    move-result-object v0

    return-object v0
.end method
