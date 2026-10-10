.class public Landroidx/camera/core/impl/QuirkSettings;
.super Ljava/lang/Object;
.source "QuirkSettings.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/QuirkSettings$Builder;
    }
.end annotation


# instance fields
.field private final mEnabledWhenDeviceHasQuirk:Z

.field private final mForceDisabledQuirks:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/camera/core/impl/Quirk;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mForceEnabledQuirks:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/camera/core/impl/Quirk;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(ZLjava/util/Set;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/camera/core/impl/Quirk;",
            ">;>;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/camera/core/impl/Quirk;",
            ">;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Landroidx/camera/core/impl/QuirkSettings;->mEnabledWhenDeviceHasQuirk:Z

    if-nez p2, :cond_0

    .line 4
    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    :goto_0
    iput-object p1, p0, Landroidx/camera/core/impl/QuirkSettings;->mForceEnabledQuirks:Ljava/util/Set;

    if-nez p3, :cond_1

    .line 5
    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1, p3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    :goto_1
    iput-object p1, p0, Landroidx/camera/core/impl/QuirkSettings;->mForceDisabledQuirks:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/util/Set;Ljava/util/Set;Landroidx/camera/core/impl/QuirkSettings$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/core/impl/QuirkSettings;-><init>(ZLjava/util/Set;Ljava/util/Set;)V

    return-void
.end method

.method public static withAllQuirksDisabled()Landroidx/camera/core/impl/QuirkSettings;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/core/impl/QuirkSettings$Builder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/camera/core/impl/QuirkSettings$Builder;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/QuirkSettings$Builder;->setEnabledWhenDeviceHasQuirk(Z)Landroidx/camera/core/impl/QuirkSettings$Builder;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/camera/core/impl/QuirkSettings$Builder;->build()Landroidx/camera/core/impl/QuirkSettings;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public static withDefaultBehavior()Landroidx/camera/core/impl/QuirkSettings;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/core/impl/QuirkSettings$Builder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/camera/core/impl/QuirkSettings$Builder;-><init>()V

    .line 6
    const/4 v1, 0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/QuirkSettings$Builder;->setEnabledWhenDeviceHasQuirk(Z)Landroidx/camera/core/impl/QuirkSettings$Builder;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/camera/core/impl/QuirkSettings$Builder;->build()Landroidx/camera/core/impl/QuirkSettings;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public static withQuirksForceDisabled(Ljava/util/Set;)Landroidx/camera/core/impl/QuirkSettings;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/camera/core/impl/Quirk;",
            ">;>;)",
            "Landroidx/camera/core/impl/QuirkSettings;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/core/impl/QuirkSettings$Builder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/camera/core/impl/QuirkSettings$Builder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroidx/camera/core/impl/QuirkSettings$Builder;->forceDisableQuirks(Ljava/util/Set;)Landroidx/camera/core/impl/QuirkSettings$Builder;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/camera/core/impl/QuirkSettings$Builder;->build()Landroidx/camera/core/impl/QuirkSettings;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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
.end method

.method public static withQuirksForceEnabled(Ljava/util/Set;)Landroidx/camera/core/impl/QuirkSettings;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/camera/core/impl/Quirk;",
            ">;>;)",
            "Landroidx/camera/core/impl/QuirkSettings;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/core/impl/QuirkSettings$Builder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/camera/core/impl/QuirkSettings$Builder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroidx/camera/core/impl/QuirkSettings$Builder;->forceEnableQuirks(Ljava/util/Set;)Landroidx/camera/core/impl/QuirkSettings$Builder;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/camera/core/impl/QuirkSettings$Builder;->build()Landroidx/camera/core/impl/QuirkSettings;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    .line 2
    instance-of v0, p1, Landroidx/camera/core/impl/QuirkSettings;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    .line 9
    if-ne p0, p1, :cond_1

    .line 10
    return v0

    .line 11
    .line 12
    :cond_1
    check-cast p1, Landroidx/camera/core/impl/QuirkSettings;

    .line 13
    .line 14
    iget-boolean v2, p0, Landroidx/camera/core/impl/QuirkSettings;->mEnabledWhenDeviceHasQuirk:Z

    .line 15
    .line 16
    iget-boolean v3, p1, Landroidx/camera/core/impl/QuirkSettings;->mEnabledWhenDeviceHasQuirk:Z

    .line 17
    .line 18
    if-ne v2, v3, :cond_2

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/camera/core/impl/QuirkSettings;->mForceEnabledQuirks:Ljava/util/Set;

    .line 21
    .line 22
    iget-object v3, p1, Landroidx/camera/core/impl/QuirkSettings;->mForceEnabledQuirks:Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    move-result v2

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/camera/core/impl/QuirkSettings;->mForceDisabledQuirks:Ljava/util/Set;

    .line 31
    .line 32
    iget-object p1, p1, Landroidx/camera/core/impl/QuirkSettings;->mForceDisabledQuirks:Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    move-result p1

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    return v0

    .line 40
    :cond_2
    return v1
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public getForceDisabledQuirks()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/camera/core/impl/Quirk;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/QuirkSettings;->mForceDisabledQuirks:Ljava/util/Set;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
    .line 18
    .line 19
    .line 20
.end method

.method public getForceEnabledQuirks()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/camera/core/impl/Quirk;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/QuirkSettings;->mForceEnabledQuirks:Ljava/util/Set;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
    .line 18
    .line 19
    .line 20
.end method

.method public hashCode()I
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/camera/core/impl/QuirkSettings;->mEnabledWhenDeviceHasQuirk:Z

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/camera/core/impl/QuirkSettings;->mForceEnabledQuirks:Ljava/util/Set;

    .line 9
    .line 10
    iget-object v2, p0, Landroidx/camera/core/impl/QuirkSettings;->mForceDisabledQuirks:Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 18
    move-result v0

    .line 19
    return v0
    .line 20
.end method

.method public isEnabledWhenDeviceHasQuirk()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/camera/core/impl/QuirkSettings;->mEnabledWhenDeviceHasQuirk:Z

    .line 3
    return v0
    .line 4
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
    .line 18
    .line 19
    .line 20
.end method

.method public shouldEnableQuirk(Ljava/lang/Class;Z)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/camera/core/impl/Quirk;",
            ">;Z)Z"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/QuirkSettings;->mForceEnabledQuirks:Ljava/util/Set;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    return v1

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/QuirkSettings;->mForceDisabledQuirks:Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    move-result p1

    .line 17
    const/4 v0, 0x0

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    return v0

    .line 21
    .line 22
    :cond_1
    iget-boolean p1, p0, Landroidx/camera/core/impl/QuirkSettings;->mEnabledWhenDeviceHasQuirk:Z

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    if-eqz p2, :cond_2

    .line 27
    return v1

    .line 28
    :cond_2
    return v0
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
    .line 43
    .line 44
    .line 45
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "QuirkSettings{enabledWhenDeviceHasQuirk="

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-boolean v1, p0, Landroidx/camera/core/impl/QuirkSettings;->mEnabledWhenDeviceHasQuirk:Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, ", forceEnabledQuirks="

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/camera/core/impl/QuirkSettings;->mForceEnabledQuirks:Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, ", forceDisabledQuirks="

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    iget-object v1, p0, Landroidx/camera/core/impl/QuirkSettings;->mForceDisabledQuirks:Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const/16 v1, 0x7d

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    move-result-object v0

    .line 45
    return-object v0
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
.end method
