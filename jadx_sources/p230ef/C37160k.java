package p230ef;

import android.content.ComponentName;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ef.k */
/* JADX INFO: compiled from: GetPasswordOption.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B1\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lef/k;", "Lef/h;", "", "", "allowedUserIds", "", "isAutoSelectAllowed", "Landroid/content/ComponentName;", "allowedProviders", "<init>", "(Ljava/util/Set;ZLjava/util/Set;)V", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "c", "Z", "()Z", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37160k extends AbstractC37157h {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Set<String> allowedUserIds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean isAutoSelectAllowed;

    public C37160k() {
        this(null, false, null, 7, null);
    }

    public /* synthetic */ C37160k(Set set, boolean z11, Set set2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? SetsKt.emptySet() : set, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? SetsKt.emptySet() : set2);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Set<String> m83132b() {
        return this.allowedUserIds;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37160k(@NotNull Set<String> allowedUserIds, boolean z11, @NotNull Set<ComponentName> allowedProviders) {
        super(allowedProviders);
        Intrinsics.checkNotNullParameter(allowedUserIds, "allowedUserIds");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        this.allowedUserIds = allowedUserIds;
        this.isAutoSelectAllowed = z11;
    }
}
