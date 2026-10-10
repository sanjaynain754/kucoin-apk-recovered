.class public Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$c;
.super Ljava/lang/Object;
.source "BGABanner.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$c;->b:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$c;-><init>(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$c;->b:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->startAutoPlay()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->access$1100(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;)V

    .line 17
    :cond_0
    return-void
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
.end method
