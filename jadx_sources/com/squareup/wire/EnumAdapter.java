package com.squareup.wire;

import com.squareup.wire.WireEnum;
import java.io.IOException;

/* JADX INFO: loaded from: classes59.dex */
public abstract class EnumAdapter<E extends WireEnum> extends ProtoAdapter<E> {
    public abstract E fromValue(int i11);

    public EnumAdapter(Class<E> cls) {
        super(FieldEncoding.VARINT, cls);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final E decode(ProtoReader protoReader) throws IOException {
        int varint32 = protoReader.readVarint32();
        E e11 = (E) fromValue(varint32);
        if (e11 != null) {
            return e11;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(varint32, this.javaType);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, E e11) throws IOException {
        protoWriter.writeVarint32(e11.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(E e11) {
        return ProtoWriter.varint32Size(e11.getValue());
    }
}
