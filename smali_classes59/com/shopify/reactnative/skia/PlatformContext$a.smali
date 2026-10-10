.class public Lcom/shopify/reactnative/skia/PlatformContext$a;
.super Ljava/lang/Object;
.source "PlatformContext.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopify/reactnative/skia/PlatformContext;->raise(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/shopify/reactnative/skia/PlatformContext;


# direct methods
.method public constructor <init>(Lcom/shopify/reactnative/skia/PlatformContext;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/shopify/reactnative/skia/PlatformContext$a;->c:Lcom/shopify/reactnative/skia/PlatformContext;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/shopify/reactnative/skia/PlatformContext$a;->b:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public run()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/shopify/reactnative/skia/PlatformContext$a;->c:Lcom/shopify/reactnative/skia/PlatformContext;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/shopify/reactnative/skia/PlatformContext;->a(Lcom/shopify/reactnative/skia/PlatformContext;)Lcom/facebook/react/bridge/ReactContext;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Ljava/lang/Exception;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/shopify/reactnative/skia/PlatformContext$a;->b:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->handleException(Ljava/lang/Exception;)V

    .line 17
    return-void
.end method
