package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GetCustomCredentialOption.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001BM\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010BC\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0011BM\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Landroidx/credentials/GetCustomCredentialOption;", "Landroidx/credentials/CredentialOption;", "requestData", "Landroid/os/Bundle;", "type", "", "candidateQueryData", "isSystemProviderRequired", "", "isAutoSelectAllowed", "allowedProviders", "", "Landroid/content/ComponentName;", "typePriorityHint", "", "<init>", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;)V", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGetCustomCredentialOption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCustomCredentialOption.kt\nandroidx/credentials/GetCustomCredentialOption\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1#2:204\n*E\n"})
public class GetCustomCredentialOption extends CredentialOption {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetCustomCredentialOption(@NotNull String type, @NotNull Bundle requestData, @NotNull Bundle candidateQueryData, boolean z11) {
        this(type, requestData, candidateQueryData, z11, false, null, 48, null);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetCustomCredentialOption(@NotNull String type, @NotNull Bundle requestData, @NotNull Bundle candidateQueryData, boolean z11, boolean z12) {
        this(type, requestData, candidateQueryData, z11, z12, null, 32, null);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(@NotNull Bundle requestData, @NotNull String type, @NotNull Bundle candidateQueryData, boolean z11, boolean z12, @NotNull Set<ComponentName> allowedProviders, int i11) {
        super(type, requestData, candidateQueryData, z11, z12, allowedProviders, i11);
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
        if (i11 == 100) {
            throw new IllegalArgumentException("Custom types should not have passkey level priority.");
        }
    }

    public /* synthetic */ GetCustomCredentialOption(Bundle bundle, String str, Bundle bundle2, boolean z11, boolean z12, Set set, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle, str, bundle2, z11, (i12 & 16) != 0 ? false : z12, (Set<ComponentName>) ((i12 & 32) != 0 ? SetsKt.emptySet() : set), (i12 & 64) != 0 ? 2000 : i11);
    }

    public /* synthetic */ GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z11, boolean z12, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle, bundle2, z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? SetsKt.emptySet() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetCustomCredentialOption(@NotNull String type, @NotNull Bundle requestData, @NotNull Bundle candidateQueryData, boolean z11, boolean z12, @NotNull Set<ComponentName> allowedProviders) {
        this(requestData, type, candidateQueryData, z11, z12, allowedProviders, 0, 64, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
    }

    public /* synthetic */ GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z11, boolean z12, Set set, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle, bundle2, z11, (i12 & 16) != 0 ? false : z12, (Set<ComponentName>) ((i12 & 32) != 0 ? SetsKt.emptySet() : set), (i12 & 64) != 0 ? 2000 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(@NotNull String type, @NotNull Bundle requestData, @NotNull Bundle candidateQueryData, boolean z11, boolean z12, @NotNull Set<ComponentName> allowedProviders, int i11) {
        this(requestData, type, candidateQueryData, z11, z12, allowedProviders, i11);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
    }
}
