.class public final Lg2/i;
.super Ljava/lang/Object;
.source "GifOptions.java"


# static fields
.field public static final a:Lt1/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt1/d<",
            "Lcom/bumptech/glide/load/DecodeFormat;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lt1/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt1/d<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat"

    .line 3
    .line 4
    sget-object v1, Lcom/bumptech/glide/load/DecodeFormat;->DEFAULT:Lcom/bumptech/glide/load/DecodeFormat;

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lt1/d;->f(Ljava/lang/String;Ljava/lang/Object;)Lt1/d;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sput-object v0, Lg2/i;->a:Lt1/d;

    .line 11
    .line 12
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    const-string v1, "com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation"

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v0}, Lt1/d;->f(Ljava/lang/String;Ljava/lang/Object;)Lt1/d;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sput-object v0, Lg2/i;->b:Lt1/d;

    .line 21
    return-void
    .line 22
.end method
