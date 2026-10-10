.class public abstract Lcom/sumsub/sns/internal/core/presentation/intro/e;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/core/presentation/intro/g;Lcom/sumsub/sns/internal/core/presentation/intro/Label;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->a:Ljava/lang/String;

    .line 2
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->b:Ljava/lang/String;

    .line 3
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->c:Ljava/lang/String;

    const-string v3, ""

    if-nez v2, :cond_0

    move-object v2, v3

    .line 4
    :cond_0
    invoke-static {v0, v1, p2, v2}, Lcom/sumsub/sns/internal/core/presentation/intro/e;->a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/intro/Label;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 5
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->a:Ljava/lang/String;

    .line 6
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->b:Ljava/lang/String;

    .line 7
    invoke-static {v1, v2, p2, v3}, Lcom/sumsub/sns/internal/core/presentation/intro/e;->a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/intro/Label;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 8
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->b:Ljava/lang/String;

    .line 9
    const-string v2, "defaults"

    invoke-static {v2, p1, p2, v3}, Lcom/sumsub/sns/internal/core/presentation/intro/e;->a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/intro/Label;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 10
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/intro/Label;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 11
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    const-string v0, "instructions"

    filled-new-array {p0, p1, v0, p2}, [Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x4

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo p1, "sns_step_%s_%s_%s_%s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 12
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    if-eqz p3, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "::"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    const-string p1, ""

    .line 13
    :cond_2
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
