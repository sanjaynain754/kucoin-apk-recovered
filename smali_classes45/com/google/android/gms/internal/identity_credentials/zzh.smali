.class public final Lcom/google/android/gms/internal/identity_credentials/zzh;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08"


# direct methods
.method public static zza(Landroid/content/Context;)Lcom/google/android/gms/common/api/ApiMetadata;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/identity_credentials/zzf;->zza()Lcom/google/android/gms/internal/identity_credentials/zzg;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/google/android/gms/common/api/ComplianceOptions;->newBuilder(Landroid/content/Context;)Lcom/google/android/gms/common/api/ComplianceOptions$Builder;

    .line 7
    move-result-object p0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/ComplianceOptions$Builder;->build()Lcom/google/android/gms/common/api/ComplianceOptions;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lcom/google/android/gms/common/api/ApiMetadata;->fromComplianceOptions(Lcom/google/android/gms/common/api/ComplianceOptions;)Lcom/google/android/gms/common/api/ApiMetadata;

    .line 15
    move-result-object p0

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
