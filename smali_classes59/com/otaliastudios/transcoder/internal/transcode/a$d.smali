.class public Lcom/otaliastudios/transcoder/internal/transcode/a$d;
.super Ljava/lang/Object;
.source "TranscodeDispatcher.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/otaliastudios/transcoder/internal/transcode/a;->d(D)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:D

.field public final synthetic c:Lcom/otaliastudios/transcoder/internal/transcode/a;


# direct methods
.method public constructor <init>(Lcom/otaliastudios/transcoder/internal/transcode/a;D)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/transcode/a$d;->c:Lcom/otaliastudios/transcoder/internal/transcode/a;

    .line 3
    .line 4
    iput-wide p2, p0, Lcom/otaliastudios/transcoder/internal/transcode/a$d;->b:D

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
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/a$d;->c:Lcom/otaliastudios/transcoder/internal/transcode/a;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/otaliastudios/transcoder/internal/transcode/a;->a(Lcom/otaliastudios/transcoder/internal/transcode/a;)Lq90/d;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/otaliastudios/transcoder/internal/transcode/a$d;->b:D

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1, v2}, Lq90/d;->c(D)V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
