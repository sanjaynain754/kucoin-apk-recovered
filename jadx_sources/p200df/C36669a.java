package p200df;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.credential.core.InterfaceC12468a;
import com.kubi.credential.jetpack.JetpackManagerImpl;
import com.kubi.credential.track.C12475b;
import com.kubi.credential.track.C12477d;
import com.kubi.credential.track.C12479f;
import com.kubi.credential.track.InterfaceC12480g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p230ef.AbstractC37151b;
import p230ef.C37159j;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: df.a */
/* JADX INFO: compiled from: KCredentialManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0011\u0010\u001eR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001e¨\u0006\""}, m90084d2 = {"Ldf/a;", "", "Landroid/content/Context;", "context", "", "assetLinks", "Lcom/kubi/credential/core/a;", "credentialManager", "Lcom/kubi/credential/track/g$b;", "Lef/b;", "createTrackFactory", "Lef/j;", "getTrackFactory", "", "clearTrackFactory", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/credential/core/a;Lcom/kubi/credential/track/g$b;Lcom/kubi/credential/track/g$b;Lcom/kubi/credential/track/g$b;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getAssetLinks", "()Ljava/lang/String;", "c", "Lcom/kubi/credential/core/a;", "()Lcom/kubi/credential/core/a;", "d", "Lcom/kubi/credential/track/g$b;", "()Lcom/kubi/credential/track/g$b;", "e", "f", "getClearTrackFactory", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C36669a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String assetLinks;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12468a credentialManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12480g.b<AbstractC37151b> createTrackFactory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12480g.b<C37159j> getTrackFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12480g.b<Unit> clearTrackFactory;

    public C36669a(@NotNull Context context, @Nullable String str, @NotNull InterfaceC12468a credentialManager, @NotNull InterfaceC12480g.b<AbstractC37151b> createTrackFactory, @NotNull InterfaceC12480g.b<C37159j> getTrackFactory, @NotNull InterfaceC12480g.b<Unit> clearTrackFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(credentialManager, "credentialManager");
        Intrinsics.checkNotNullParameter(createTrackFactory, "createTrackFactory");
        Intrinsics.checkNotNullParameter(getTrackFactory, "getTrackFactory");
        Intrinsics.checkNotNullParameter(clearTrackFactory, "clearTrackFactory");
        this.context = context;
        this.assetLinks = str;
        this.credentialManager = credentialManager;
        this.createTrackFactory = createTrackFactory;
        this.getTrackFactory = getTrackFactory;
        this.clearTrackFactory = clearTrackFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC12480g.b<AbstractC37151b> m82052a() {
        return this.createTrackFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC12468a getCredentialManager() {
        return this.credentialManager;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC12480g.b<C37159j> m82054c() {
        return this.getTrackFactory;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C36669a(Context context, String str, InterfaceC12468a interfaceC12468a, InterfaceC12480g.b bVar, InterfaceC12480g.b bVar2, InterfaceC12480g.b bVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        String str2 = (i11 & 2) != 0 ? null : str;
        this(context, str2, (i11 & 4) != 0 ? new JetpackManagerImpl(context, str2) : interfaceC12468a, (i11 & 8) != 0 ? new C12477d() : bVar, (i11 & 16) != 0 ? new C12479f() : bVar2, (i11 & 32) != 0 ? new C12475b() : bVar3);
    }
}
