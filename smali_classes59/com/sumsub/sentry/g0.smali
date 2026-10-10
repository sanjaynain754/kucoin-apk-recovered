.class public abstract Lcom/sumsub/sentry/g0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static a(Lcom/sumsub/sentry/n0;)Lcom/sumsub/sentry/h0;
    .locals 3

    .line 1
    .line 2
    sget-boolean v0, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/J;->a(Z)Lxg0/a;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ltg0/n;->getSerializersModule()Lyg0/a;

    .line 10
    .line 11
    sget-object v1, Lcom/sumsub/sentry/n0;->Companion:Lcom/sumsub/sentry/m0;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/sumsub/sentry/m0;->serializer()Ltg0/d;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    check-cast v1, Ltg0/p;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1, p0}, Ltg0/c0;->b(Ltg0/p;Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    move-result-object p0

    .line 22
    .line 23
    sget-object v0, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 27
    move-result-object p0

    .line 28
    .line 29
    sget-object v0, Lcom/sumsub/sentry/SentryItemType;->Event:Lcom/sumsub/sentry/SentryItemType;

    .line 30
    array-length v1, p0

    .line 31
    .line 32
    new-instance v2, Lcom/sumsub/sentry/k0;

    .line 33
    .line 34
    .line 35
    invoke-direct {v2, v0, v1}, Lcom/sumsub/sentry/k0;-><init>(Lcom/sumsub/sentry/SentryItemType;I)V

    .line 36
    .line 37
    new-instance v0, Lcom/sumsub/sentry/h0;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v2, p0}, Lcom/sumsub/sentry/h0;-><init>(Lcom/sumsub/sentry/k0;[B)V

    .line 41
    return-object v0
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
    .line 79
    .line 80
    .line 81
.end method
