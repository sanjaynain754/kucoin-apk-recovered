.class public abstract Lcom/google/android/gms/identitycredentials/provider/ICredentialProviderService$Stub;
.super Lcom/google/android/gms/internal/identity_credentials/zzb;
.source "com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08"

# interfaces
.implements Lcom/google/android/gms/identitycredentials/provider/ICredentialProviderService;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/identitycredentials/provider/ICredentialProviderService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/identitycredentials/provider/ICredentialProviderService$Stub$Proxy;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "com.google.android.gms.identitycredentials.provider.ICredentialProviderService"

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/identity_credentials/zzb;-><init>(Ljava/lang/String;)V

    .line 6
    return-void
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
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/identitycredentials/provider/ICredentialProviderService;
    .locals 2
    .param p0    # Landroid/os/IBinder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    .line 6
    :cond_0
    const-string v0, "com.google.android.gms.identitycredentials.provider.ICredentialProviderService"

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    instance-of v1, v0, Lcom/google/android/gms/identitycredentials/provider/ICredentialProviderService;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast v0, Lcom/google/android/gms/identitycredentials/provider/ICredentialProviderService;

    .line 17
    return-object v0

    .line 18
    .line 19
    :cond_1
    new-instance v0, Lcom/google/android/gms/identitycredentials/provider/ICredentialProviderService$Stub$Proxy;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p0}, Lcom/google/android/gms/identitycredentials/provider/ICredentialProviderService$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    .line 23
    return-object v0
.end method


# virtual methods
.method public dispatchTransaction(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 1
    .param p2    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    const/4 p3, 0x1

    .line 2
    .line 3
    if-eq p1, p3, :cond_4

    .line 4
    const/4 p4, 0x2

    .line 5
    .line 6
    if-eq p1, p4, :cond_3

    .line 7
    const/4 p4, 0x3

    .line 8
    .line 9
    if-eq p1, p4, :cond_2

    .line 10
    const/4 p4, 0x4

    .line 11
    .line 12
    if-eq p1, p4, :cond_1

    .line 13
    const/4 p4, 0x5

    .line 14
    .line 15
    if-eq p1, p4, :cond_0

    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    .line 19
    :cond_0
    sget-object p1, Lcom/google/android/gms/identitycredentials/GetCredentialTransferCapabilitiesRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 20
    .line 21
    .line 22
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/identity_credentials/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    check-cast p1, Lcom/google/android/gms/identitycredentials/GetCredentialTransferCapabilitiesRequest;

    .line 26
    .line 27
    sget-object p4, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 28
    .line 29
    .line 30
    invoke-static {p2, p4}, Lcom/google/android/gms/internal/identity_credentials/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 31
    move-result-object p4

    .line 32
    .line 33
    check-cast p4, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lcom/google/android/gms/identitycredentials/provider/ICredentialTransferCapabilitiesCallbacks$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/identitycredentials/provider/ICredentialTransferCapabilitiesCallbacks;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/identity_credentials/zzb;->enforceNoDataAvail(Landroid/os/Parcel;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p0, p1, p4, v0}, Lcom/google/android/gms/identitycredentials/provider/ICredentialProviderService;->onGetCredentialTransferCapabilities(Lcom/google/android/gms/identitycredentials/GetCredentialTransferCapabilitiesRequest;Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;Lcom/google/android/gms/identitycredentials/provider/ICredentialTransferCapabilitiesCallbacks;)V

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :cond_1
    sget-object p1, Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 52
    .line 53
    .line 54
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/identity_credentials/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    check-cast p1, Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupRequest;

    .line 58
    .line 59
    sget-object p4, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 60
    .line 61
    .line 62
    invoke-static {p2, p4}, Lcom/google/android/gms/internal/identity_credentials/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 63
    move-result-object p4

    .line 64
    .line 65
    check-cast p4, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lcom/google/android/gms/identitycredentials/provider/IExportCredentialsCallbacks$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/identitycredentials/provider/IExportCredentialsCallbacks;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/identity_credentials/zzb;->enforceNoDataAvail(Landroid/os/Parcel;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p0, p1, p4, v0}, Lcom/google/android/gms/identitycredentials/provider/ICredentialProviderService;->onExportCredentials(Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupRequest;Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;Lcom/google/android/gms/identitycredentials/provider/IExportCredentialsCallbacks;)V

    .line 80
    goto :goto_0

    .line 81
    .line 82
    :cond_2
    sget-object p1, Lcom/google/android/gms/identitycredentials/ImportCredentialsForDeviceSetupRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 83
    .line 84
    .line 85
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/identity_credentials/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    check-cast p1, Lcom/google/android/gms/identitycredentials/ImportCredentialsForDeviceSetupRequest;

    .line 89
    .line 90
    sget-object p4, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 91
    .line 92
    .line 93
    invoke-static {p2, p4}, Lcom/google/android/gms/internal/identity_credentials/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 94
    move-result-object p4

    .line 95
    .line 96
    check-cast p4, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    .line 103
    invoke-static {v0}, Lcom/google/android/gms/identitycredentials/provider/IImportCredentialsCallbacks$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/identitycredentials/provider/IImportCredentialsCallbacks;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/identity_credentials/zzb;->enforceNoDataAvail(Landroid/os/Parcel;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p0, p1, p4, v0}, Lcom/google/android/gms/identitycredentials/provider/ICredentialProviderService;->onImportCredentials(Lcom/google/android/gms/identitycredentials/ImportCredentialsForDeviceSetupRequest;Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;Lcom/google/android/gms/identitycredentials/provider/IImportCredentialsCallbacks;)V

    .line 111
    goto :goto_0

    .line 112
    .line 113
    :cond_3
    sget-object p1, Lcom/google/android/gms/identitycredentials/SignalCredentialStateRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 114
    .line 115
    .line 116
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/identity_credentials/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    check-cast p1, Lcom/google/android/gms/identitycredentials/SignalCredentialStateRequest;

    .line 120
    .line 121
    sget-object p4, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 122
    .line 123
    .line 124
    invoke-static {p2, p4}, Lcom/google/android/gms/internal/identity_credentials/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 125
    move-result-object p4

    .line 126
    .line 127
    check-cast p4, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 131
    move-result-object v0

    .line 132
    .line 133
    .line 134
    invoke-static {v0}, Lcom/google/android/gms/identitycredentials/provider/ISignalCredentialStateCallbacks$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/identitycredentials/provider/ISignalCredentialStateCallbacks;

    .line 135
    move-result-object v0

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/identity_credentials/zzb;->enforceNoDataAvail(Landroid/os/Parcel;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {p0, p1, p4, v0}, Lcom/google/android/gms/identitycredentials/provider/ICredentialProviderService;->onSignalCredentialStateRequest(Lcom/google/android/gms/identitycredentials/SignalCredentialStateRequest;Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;Lcom/google/android/gms/identitycredentials/provider/ISignalCredentialStateCallbacks;)V

    .line 142
    goto :goto_0

    .line 143
    .line 144
    :cond_4
    sget-object p1, Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 145
    .line 146
    .line 147
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/identity_credentials/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 148
    move-result-object p1

    .line 149
    .line 150
    check-cast p1, Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;

    .line 151
    .line 152
    sget-object p4, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 153
    .line 154
    .line 155
    invoke-static {p2, p4}, Lcom/google/android/gms/internal/identity_credentials/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 156
    move-result-object p4

    .line 157
    .line 158
    check-cast p4, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 162
    move-result-object v0

    .line 163
    .line 164
    .line 165
    invoke-static {v0}, Lcom/google/android/gms/identitycredentials/provider/ICreateCredentialCallbacks$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/identitycredentials/provider/ICreateCredentialCallbacks;

    .line 166
    move-result-object v0

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/identity_credentials/zzb;->enforceNoDataAvail(Landroid/os/Parcel;)V

    .line 170
    .line 171
    .line 172
    invoke-interface {p0, p1, p4, v0}, Lcom/google/android/gms/identitycredentials/provider/ICredentialProviderService;->onCreateCredentialRequest(Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;Lcom/google/android/gms/identitycredentials/provider/ICreateCredentialCallbacks;)V

    .line 173
    :goto_0
    return p3
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
