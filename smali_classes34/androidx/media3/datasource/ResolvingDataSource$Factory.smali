.class public final Landroidx/media3/datasource/ResolvingDataSource$Factory;
.super Ljava/lang/Object;
.source "ResolvingDataSource.java"

# interfaces
.implements Landroidx/media3/datasource/DataSource$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/datasource/ResolvingDataSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# instance fields
.field private final resolver:Landroidx/media3/datasource/ResolvingDataSource$Resolver;

.field private final upstreamFactory:Landroidx/media3/datasource/DataSource$Factory;


# direct methods
.method public constructor <init>(Landroidx/media3/datasource/DataSource$Factory;Landroidx/media3/datasource/ResolvingDataSource$Resolver;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/datasource/ResolvingDataSource$Factory;->upstreamFactory:Landroidx/media3/datasource/DataSource$Factory;

    .line 6
    .line 7
    iput-object p2, p0, Landroidx/media3/datasource/ResolvingDataSource$Factory;->resolver:Landroidx/media3/datasource/ResolvingDataSource$Resolver;

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method


# virtual methods
.method public bridge synthetic createDataSource()Landroidx/media3/datasource/DataSource;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/datasource/ResolvingDataSource$Factory;->createDataSource()Landroidx/media3/datasource/ResolvingDataSource;

    move-result-object v0

    return-object v0
.end method

.method public createDataSource()Landroidx/media3/datasource/ResolvingDataSource;
    .locals 3

    .line 2
    new-instance v0, Landroidx/media3/datasource/ResolvingDataSource;

    iget-object v1, p0, Landroidx/media3/datasource/ResolvingDataSource$Factory;->upstreamFactory:Landroidx/media3/datasource/DataSource$Factory;

    invoke-interface {v1}, Landroidx/media3/datasource/DataSource$Factory;->createDataSource()Landroidx/media3/datasource/DataSource;

    move-result-object v1

    iget-object v2, p0, Landroidx/media3/datasource/ResolvingDataSource$Factory;->resolver:Landroidx/media3/datasource/ResolvingDataSource$Resolver;

    invoke-direct {v0, v1, v2}, Landroidx/media3/datasource/ResolvingDataSource;-><init>(Landroidx/media3/datasource/DataSource;Landroidx/media3/datasource/ResolvingDataSource$Resolver;)V

    return-object v0
.end method
