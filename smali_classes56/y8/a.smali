.class public final Ly8/a;
.super Ljava/lang/Object;
.source "Functions.java"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/a$a;
    }
.end annotation


# static fields
.field public static final a:Ly8/a$a;

.field public static final b:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lio/reactivex/functions/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/Predicate<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ly8/a$a;

    .line 3
    .line 4
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ly8/a$a;-><init>(Ljava/lang/Boolean;)V

    .line 8
    .line 9
    sput-object v0, Ly8/a;->a:Ly8/a$a;

    .line 10
    .line 11
    sput-object v0, Ly8/a;->b:Ljava/util/concurrent/Callable;

    .line 12
    .line 13
    sput-object v0, Ly8/a;->c:Lio/reactivex/functions/Predicate;

    .line 14
    return-void
    .line 15
    .line 16
.end method
