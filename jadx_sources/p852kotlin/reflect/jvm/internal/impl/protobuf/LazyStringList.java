package p852kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes61.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(ByteString byteString);

    ByteString getByteString(int i11);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();
}
