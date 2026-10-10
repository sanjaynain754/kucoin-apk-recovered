.class public final Lt80/g$b$a;
.super Ljava/lang/Object;
.source "KWebViewWarmupManager.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt80/g$b;->onLowMemory()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKWebViewWarmupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebViewWarmupManager.kt\ncom/kubi/widget/web/manager/KWebViewWarmupManager$runOnMain$1\n+ 2 KWebViewWarmupManager.kt\ncom/kubi/widget/web/manager/KWebViewWarmupManager$componentCallbacks$1\n*L\n1#1,237:1\n56#2:238\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lt80/g;->a:Lt80/g;

    .line 3
    .line 4
    const-string v1, "low_memory"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lt80/g;->f(Lt80/g;Ljava/lang/String;)V

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
