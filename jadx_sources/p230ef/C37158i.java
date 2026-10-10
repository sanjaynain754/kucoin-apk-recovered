package p230ef;

import android.content.ComponentName;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ef.i */
/* JADX INFO: compiled from: GetCredentialRequest.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001b"}, m90084d2 = {"Lef/i;", "", "", "Lef/h;", "credentialOptions", "", "origin", "", "preferIdentityDocUi", "Landroid/content/ComponentName;", "preferUiBrandingComponentName", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLandroid/content/ComponentName;Z)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Z", "()Z", "d", "Landroid/content/ComponentName;", "e", "()Landroid/content/ComponentName;", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37158i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<AbstractC37157h> credentialOptions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String origin;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean preferIdentityDocUi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final ComponentName preferUiBrandingComponentName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean preferImmediatelyAvailableCredentials;

    /* JADX WARN: Multi-variable type inference failed */
    public C37158i(@NotNull List<? extends AbstractC37157h> credentialOptions, @Nullable String str, boolean z11, @Nullable ComponentName componentName, boolean z12) {
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
        this.credentialOptions = credentialOptions;
        this.origin = str;
        this.preferIdentityDocUi = z11;
        this.preferUiBrandingComponentName = componentName;
        this.preferImmediatelyAvailableCredentials = z12;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<AbstractC37157h> m83126a() {
        return this.credentialOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getPreferIdentityDocUi() {
        return this.preferIdentityDocUi;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ComponentName getPreferUiBrandingComponentName() {
        return this.preferUiBrandingComponentName;
    }

    public /* synthetic */ C37158i(List list, String str, boolean z11, ComponentName componentName, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : componentName, (i11 & 16) != 0 ? false : z12);
    }
}
