.class public final Luf0/j$b;
.super Ljava/lang/Object;
.source "CurrentSpanUtils.java"

# interfaces
.implements Lrf0/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luf0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final b:Luf0/h;

.field public final c:Lio/opencensus/trace/Span;

.field public final d:Z


# direct methods
.method public constructor <init>(Lio/opencensus/trace/Span;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Luf0/j$b;->c:Lio/opencensus/trace/Span;

    .line 4
    iput-boolean p2, p0, Luf0/j$b;->d:Z

    .line 5
    invoke-static {}, Lyf0/b;->a()Luf0/h;

    move-result-object p2

    invoke-static {p2, p1}, Lyf0/b;->d(Luf0/h;Lio/opencensus/trace/Span;)Luf0/h;

    move-result-object p1

    invoke-interface {p1}, Luf0/h;->b()Luf0/h;

    move-result-object p1

    iput-object p1, p0, Luf0/j$b;->b:Luf0/h;

    return-void
.end method

.method public synthetic constructor <init>(Lio/opencensus/trace/Span;ZLuf0/j$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Luf0/j$b;-><init>(Lio/opencensus/trace/Span;Z)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lyf0/b;->a()Luf0/h;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Luf0/j$b;->b:Luf0/h;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Luf0/h;->a(Luf0/h;)V

    .line 10
    .line 11
    iget-boolean v0, p0, Luf0/j$b;->d:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Luf0/j$b;->c:Lio/opencensus/trace/Span;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lio/opencensus/trace/Span;->f()V

    .line 19
    :cond_0
    return-void
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
.end method
