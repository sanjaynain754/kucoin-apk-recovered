package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
class VersionedParcelParcel extends VersionedParcel {
    private static final boolean DEBUG = false;
    private static final String TAG = "VersionedParcelParcel";
    private int mCurrentField;
    private final int mEnd;
    private int mFieldId;
    private int mNextRead;
    private final int mOffset;
    private final Parcel mParcel;
    private final SparseIntArray mPositionLookup;
    private final String mPrefix;

    public VersionedParcelParcel(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr) {
        if (bArr == null) {
            this.mParcel.writeInt(-1);
        } else {
            this.mParcel.writeInt(bArr.length);
            this.mParcel.writeByteArray(bArr);
        }
    }

    private VersionedParcelParcel(Parcel parcel, int i11, int i12, String str, ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.mPositionLookup = new SparseIntArray();
        this.mCurrentField = -1;
        this.mFieldId = -1;
        this.mParcel = parcel;
        this.mOffset = i11;
        this.mEnd = i12;
        this.mNextRead = i11;
        this.mPrefix = str;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void closeField() {
        int i11 = this.mCurrentField;
        if (i11 >= 0) {
            int i12 = this.mPositionLookup.get(i11);
            int iDataPosition = this.mParcel.dataPosition();
            this.mParcel.setDataPosition(i12);
            this.mParcel.writeInt(iDataPosition - i12);
            this.mParcel.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel createSubParcel() {
        Parcel parcel = this.mParcel;
        int iDataPosition = parcel.dataPosition();
        int i11 = this.mNextRead;
        if (i11 == this.mOffset) {
            i11 = this.mEnd;
        }
        return new VersionedParcelParcel(parcel, iDataPosition, i11, this.mPrefix + "  ", this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readBoolean() {
        return this.mParcel.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle readBundle() {
        return this.mParcel.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] readByteArray() {
        int i11 = this.mParcel.readInt();
        if (i11 < 0) {
            return null;
        }
        byte[] bArr = new byte[i11];
        this.mParcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public CharSequence readCharSequence() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.mParcel);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double readDouble() {
        return this.mParcel.readDouble();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readField(int i11) {
        while (this.mNextRead < this.mEnd) {
            int i12 = this.mFieldId;
            if (i12 == i11) {
                return true;
            }
            if (String.valueOf(i12).compareTo(String.valueOf(i11)) > 0) {
                return false;
            }
            this.mParcel.setDataPosition(this.mNextRead);
            int i13 = this.mParcel.readInt();
            this.mFieldId = this.mParcel.readInt();
            this.mNextRead += i13;
        }
        return this.mFieldId == i11;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float readFloat() {
        return this.mParcel.readFloat();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int readInt() {
        return this.mParcel.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long readLong() {
        return this.mParcel.readLong();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T readParcelable() {
        return (T) this.mParcel.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String readString() {
        return this.mParcel.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder readStrongBinder() {
        return this.mParcel.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBoolean(boolean z11) {
        this.mParcel.writeInt(z11 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBundle(Bundle bundle) {
        this.mParcel.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeCharSequence(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.mParcel, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeDouble(double d11) {
        this.mParcel.writeDouble(d11);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeFloat(float f11) {
        this.mParcel.writeFloat(f11);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeInt(int i11) {
        this.mParcel.writeInt(i11);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeLong(long j11) {
        this.mParcel.writeLong(j11);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeParcelable(Parcelable parcelable) {
        this.mParcel.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeString(String str) {
        this.mParcel.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongBinder(IBinder iBinder) {
        this.mParcel.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongInterface(IInterface iInterface) {
        this.mParcel.writeStrongInterface(iInterface);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setOutputField(int i11) {
        closeField();
        this.mCurrentField = i11;
        this.mPositionLookup.put(i11, this.mParcel.dataPosition());
        writeInt(0);
        writeInt(i11);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr, int i11, int i12) {
        if (bArr != null) {
            this.mParcel.writeInt(bArr.length);
            this.mParcel.writeByteArray(bArr, i11, i12);
        } else {
            this.mParcel.writeInt(-1);
        }
    }
}
