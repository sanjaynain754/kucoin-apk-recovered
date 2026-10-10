package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.sequences.Sequence;

/* JADX INFO: renamed from: shark.i */
/* JADX INFO: compiled from: HeapGraph.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010!¨\u0006&"}, m90084d2 = {"Lshark/i;", "", "", "objectId", "Lshark/HeapObject;", CmcdData.Factory.STREAM_TYPE_LIVE, "(J)Lshark/HeapObject;", "j", "", "className", "Lshark/HeapObject$HeapClass;", "b", "(Ljava/lang/String;)Lshark/HeapObject$HeapClass;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(J)Z", "", "i", "()I", "identifierByteSize", "Lshark/e;", "getContext", "()Lshark/e;", "context", "g", "instanceCount", "", "Lshark/d;", "m", "()Ljava/util/List;", "gcRoots", "Lkotlin/sequences/Sequence;", "k", "()Lkotlin/sequences/Sequence;", "objects", "Lshark/HeapObject$HeapInstance;", CmcdData.Factory.STREAMING_FORMAT_HLS, "instances", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public interface InterfaceC44456i {
    /* JADX INFO: renamed from: a */
    boolean mo98071a(long objectId);

    @Nullable
    /* JADX INFO: renamed from: b */
    HeapObject.HeapClass mo98072b(@NotNull String className);

    /* JADX INFO: renamed from: g */
    int mo98073g();

    @NotNull
    C44452e getContext();

    @NotNull
    /* JADX INFO: renamed from: h */
    Sequence<HeapObject.HeapInstance> mo98074h();

    /* JADX INFO: renamed from: i */
    int mo98075i();

    @Nullable
    /* JADX INFO: renamed from: j */
    HeapObject mo98076j(long objectId);

    @NotNull
    /* JADX INFO: renamed from: k */
    Sequence<HeapObject> mo98077k();

    @NotNull
    /* JADX INFO: renamed from: l */
    HeapObject mo98078l(long objectId) throws IllegalArgumentException;

    @NotNull
    /* JADX INFO: renamed from: m */
    List<AbstractC44451d> mo98079m();
}
