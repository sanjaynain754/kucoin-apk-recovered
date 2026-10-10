package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes34.dex */
interface ReadBuf {
    byte[] data();

    byte get(int i11);

    boolean getBoolean(int i11);

    double getDouble(int i11);

    float getFloat(int i11);

    int getInt(int i11);

    long getLong(int i11);

    short getShort(int i11);

    String getString(int i11, int i12);

    int limit();
}
