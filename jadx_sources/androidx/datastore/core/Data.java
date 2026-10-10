package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: State.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m90084d2 = {"Landroidx/datastore/core/Data;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/State;", "value", "hashCode", "", "version", "(Ljava/lang/Object;II)V", "getHashCode", "()I", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "checkHashCode", "", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class Data<T> extends State<T> {
    private final int hashCode;
    private final T value;

    public Data(T t11, int i11, int i12) {
        super(i12, null);
        this.value = t11;
        this.hashCode = i11;
    }

    public final void checkHashCode() {
        T t11 = this.value;
        if ((t11 != null ? t11.hashCode() : 0) != this.hashCode) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final int getHashCode() {
        return this.hashCode;
    }

    public final T getValue() {
        return this.value;
    }
}
