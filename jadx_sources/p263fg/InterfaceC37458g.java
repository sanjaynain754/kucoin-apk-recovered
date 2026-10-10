package p263fg;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkMessage;
import com.kubi.network.api.model.NetworkResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p263fg.C37464m;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: fg.g */
/* JADX INFO: compiled from: ISocketCodec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0003H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lfg/g;", "Lfg/m;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/kubi/network/api/model/NetworkMessage;", "obj", "b", "(Lcom/kubi/network/api/model/NetworkMessage;)Ljava/lang/Object;", "Lcom/kubi/network/api/model/NetworkResponse;", "c", "(Lcom/kubi/network/api/model/NetworkResponse;)Ljava/lang/Object;", "data", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Lfg/m;", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC37458g<T extends C37464m<?>> {
    @NotNull
    /* JADX INFO: renamed from: a */
    T mo84252a(@NotNull Object data);

    @Nullable
    /* JADX INFO: renamed from: b */
    Object mo84253b(@NotNull NetworkMessage<?> obj);

    @Nullable
    /* JADX INFO: renamed from: c */
    Object mo84254c(@NotNull NetworkResponse<?> obj);
}
