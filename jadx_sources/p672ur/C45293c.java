package p672ur;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.network.socket.utils.C19393i;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ur.c */
/* JADX INFO: compiled from: IRequestTrack.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lur/c;", "Lur/g$a;", "", "linkType", "<init>", "(Ljava/lang/String;)V", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "Lur/i;", "b", "(Lcom/kubi/network/api/model/NetworkRequest;)Lur/i;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "Lcom/kubi/network/socket/utils/i;", "Lcom/kubi/network/socket/utils/i;", "evaluator", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C45293c implements InterfaceC45297g.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String linkType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C19393i evaluator;

    public C45293c(@NotNull String linkType) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        this.linkType = linkType;
        this.evaluator = new C19393i(50L);
    }

    @Override // p672ur.InterfaceC45297g.a
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C45299i mo100131a(@NotNull NetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new C45299i(this.linkType, request, this.evaluator);
    }

    public /* synthetic */ C45293c(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "push" : str);
    }
}
