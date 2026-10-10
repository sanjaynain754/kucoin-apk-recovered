package tg0;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: tg0.c0 */
/* JADX INFO: compiled from: SerialFormat.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Ltg0/c0;", "Ltg0/n;", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/p;", "serializer", "value", "", "b", "(Ltg0/p;Ljava/lang/Object;)Ljava/lang/String;", "Ltg0/c;", "deserializer", TypedValues.Custom.S_STRING, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ltg0/c;Ljava/lang/String;)Ljava/lang/Object;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC44950c0 extends InterfaceC44961n {
    /* JADX INFO: renamed from: a */
    <T> T mo99408a(@NotNull InterfaceC44949c<? extends T> deserializer, @NotNull String string);

    @NotNull
    /* JADX INFO: renamed from: b */
    <T> String mo99409b(@NotNull InterfaceC44963p<? super T> serializer, T value);
}
