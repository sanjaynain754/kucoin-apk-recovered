package shark.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import shark.AbstractC44490l;

/* JADX INFO: renamed from: shark.internal.e */
/* JADX INFO: compiled from: FieldIdReader.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u001a"}, m90084d2 = {"Lshark/internal/e;", "", "Lshark/l$b$c$b;", "record", "", "identifierByteSize", "<init>", "(Lshark/l$b$c$b;I)V", "", "b", "()J", "count", "", "f", "(I)V", "index", "", "array", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I[B)J", "e", "c", "d", "I", ViewProps.POSITION, "Lshark/l$b$c$b;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class C44472e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final AbstractC44490l.b.c.C47022b record;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int identifierByteSize;

    /* JADX INFO: renamed from: a */
    public final long m98334a(int index, byte[] array) {
        return array[index];
    }

    /* JADX INFO: renamed from: b */
    public final long m98335b() {
        long jM98334a;
        int i11 = this.identifierByteSize;
        if (i11 == 1) {
            jM98334a = m98334a(this.position, this.record.getFieldValues());
        } else if (i11 == 2) {
            jM98334a = m98338e(this.position, this.record.getFieldValues());
        } else if (i11 == 4) {
            jM98334a = m98336c(this.position, this.record.getFieldValues());
        } else {
            if (i11 != 8) {
                throw new IllegalStateException("ID Length must be 1, 2, 4, or 8");
            }
            jM98334a = m98337d(this.position, this.record.getFieldValues());
        }
        this.position += this.identifierByteSize;
        return jM98334a;
    }

    /* JADX INFO: renamed from: c */
    public final long m98336c(int index, byte[] array) {
        return (array[index + 3] & 255) | ((array[index + 1] & 255) << 16) | ((array[index] & 255) << 24) | ((array[index + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: d */
    public final long m98337d(int index, byte[] array) {
        long j11 = ((((long) array[index]) & 255) << 56) | ((((long) array[index + 1]) & 255) << 48) | ((((long) array[index + 2]) & 255) << 40) | ((((long) array[index + 3]) & 255) << 32) | ((((long) array[index + 4]) & 255) << 24) | ((((long) array[index + 5]) & 255) << 16);
        return (((long) array[index + 7]) & 255) | j11 | ((((long) array[index + 6]) & 255) << 8);
    }

    /* JADX INFO: renamed from: e */
    public final long m98338e(int index, byte[] array) {
        return ((array[index] & 255) << 8) | (array[index + 1] & 255);
    }

    /* JADX INFO: renamed from: f */
    public final void m98339f(int count) {
        this.position += count;
    }

    public C44472e(@NotNull AbstractC44490l.b.c.C47022b c47022b, int i11) {
        this.record = c47022b;
        this.identifierByteSize = i11;
    }
}
