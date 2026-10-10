package p573qu;

import android.content.Context;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45660a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: qu.a */
/* JADX INFO: compiled from: IPermissionComplianceManifestFlavor.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45660a
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J-\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\fJ-\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\fJ-\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/permissions/flavor/IPermissionComplianceManifestFlavor;", "", "getSystemKeys", "", "", "getDisplayName", "context", "Landroid/content/Context;", "permissions", "", "separator", "", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "getCollectData", "getSupportFeature", "LPermissions_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43874a {
    @NotNull
    /* JADX INFO: renamed from: a */
    String m96645a(@NotNull Context context, @Nullable String[] strArr, @NotNull CharSequence charSequence);

    @NotNull
    /* JADX INFO: renamed from: b */
    String m96646b(@NotNull Context context, @Nullable String[] strArr, @NotNull CharSequence charSequence);

    @NotNull
    /* JADX INFO: renamed from: c */
    String m96647c(@NotNull Context context, @Nullable String[] strArr, @NotNull CharSequence charSequence);

    @NotNull
    /* JADX INFO: renamed from: d */
    List<String> m96648d();
}
