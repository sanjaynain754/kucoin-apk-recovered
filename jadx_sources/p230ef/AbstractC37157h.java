package p230ef;

import android.content.ComponentName;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ef.h */
/* JADX INFO: compiled from: CredentialOption.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, m90084d2 = {"Lef/h;", "", "", "Landroid/content/ComponentName;", "allowedProviders", "<init>", "(Ljava/util/Set;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/Set;", "()Ljava/util/Set;", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class AbstractC37157h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Set<ComponentName> allowedProviders;

    public AbstractC37157h(@NotNull Set<ComponentName> allowedProviders) {
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        this.allowedProviders = allowedProviders;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Set<ComponentName> m83125a() {
        return this.allowedProviders;
    }
}
