package com.opensource.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.EOFException;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes59.dex */
public final class Transform extends Message<Transform, Builder> {
    public static final ProtoAdapter<Transform> ADAPTER = new ProtoAdapter_Transform();
    public static final Float DEFAULT_A;
    public static final Float DEFAULT_B;
    public static final Float DEFAULT_C;
    public static final Float DEFAULT_D;
    public static final Float DEFAULT_TX;
    public static final Float DEFAULT_TY;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
    public final Float f55553a;

    /* JADX INFO: renamed from: b */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
    public final Float f55554b;

    /* JADX INFO: renamed from: c */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
    public final Float f55555c;

    /* JADX INFO: renamed from: d */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
    public final Float f55556d;

    /* JADX INFO: renamed from: tx */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 5)
    public final Float f55557tx;

    /* JADX INFO: renamed from: ty */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 6)
    public final Float f55558ty;

    public static final class Builder extends Message.Builder<Transform, Builder> {

        /* JADX INFO: renamed from: a */
        public Float f55559a;

        /* JADX INFO: renamed from: b */
        public Float f55560b;

        /* JADX INFO: renamed from: c */
        public Float f55561c;

        /* JADX INFO: renamed from: d */
        public Float f55562d;

        /* JADX INFO: renamed from: tx */
        public Float f55563tx;

        /* JADX INFO: renamed from: ty */
        public Float f55564ty;

        /* JADX INFO: renamed from: a */
        public Builder m67813a(Float f11) {
            this.f55559a = f11;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public Builder m67814b(Float f11) {
            this.f55560b = f11;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Transform build() {
            return new Transform(this.f55559a, this.f55560b, this.f55561c, this.f55562d, this.f55563tx, this.f55564ty, super.buildUnknownFields());
        }

        /* JADX INFO: renamed from: c */
        public Builder m67815c(Float f11) {
            this.f55561c = f11;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public Builder m67816d(Float f11) {
            this.f55562d = f11;
            return this;
        }

        /* JADX INFO: renamed from: tx */
        public Builder m67817tx(Float f11) {
            this.f55563tx = f11;
            return this;
        }

        /* JADX INFO: renamed from: ty */
        public Builder m67818ty(Float f11) {
            this.f55564ty = f11;
            return this;
        }
    }

    public static final class ProtoAdapter_Transform extends ProtoAdapter<Transform> {
        public ProtoAdapter_Transform() {
            super(FieldEncoding.LENGTH_DELIMITED, Transform.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Transform decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                switch (iNextTag) {
                    case 1:
                        builder.m67813a(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    case 2:
                        builder.m67814b(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    case 3:
                        builder.m67815c(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    case 4:
                        builder.m67816d(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    case 5:
                        builder.m67817tx(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    case 6:
                        builder.m67818ty(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    default:
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Transform transform) throws IOException {
            Float f11 = transform.f55553a;
            if (f11 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, f11);
            }
            Float f12 = transform.f55554b;
            if (f12 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, f12);
            }
            Float f13 = transform.f55555c;
            if (f13 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, f13);
            }
            Float f14 = transform.f55556d;
            if (f14 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, f14);
            }
            Float f15 = transform.f55557tx;
            if (f15 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 5, f15);
            }
            Float f16 = transform.f55558ty;
            if (f16 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 6, f16);
            }
            protoWriter.writeBytes(transform.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Transform transform) {
            Float f11 = transform.f55553a;
            int iEncodedSizeWithTag = f11 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(1, f11) : 0;
            Float f12 = transform.f55554b;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (f12 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(2, f12) : 0);
            Float f13 = transform.f55555c;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (f13 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, f13) : 0);
            Float f14 = transform.f55556d;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (f14 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(4, f14) : 0);
            Float f15 = transform.f55557tx;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + (f15 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(5, f15) : 0);
            Float f16 = transform.f55558ty;
            return iEncodedSizeWithTag5 + (f16 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(6, f16) : 0) + transform.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Transform redact(Transform transform) throws EOFException {
            Builder builderNewBuilder = transform.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public Transform(Float f11, Float f12, Float f13, Float f14, Float f15, Float f16) {
        this(f11, f12, f13, f14, f15, f16, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Transform)) {
            return false;
        }
        Transform transform = (Transform) obj;
        return unknownFields().equals(transform.unknownFields()) && Internal.equals(this.f55553a, transform.f55553a) && Internal.equals(this.f55554b, transform.f55554b) && Internal.equals(this.f55555c, transform.f55555c) && Internal.equals(this.f55556d, transform.f55556d) && Internal.equals(this.f55557tx, transform.f55557tx) && Internal.equals(this.f55558ty, transform.f55558ty);
    }

    static {
        Float fValueOf = Float.valueOf(0.0f);
        DEFAULT_A = fValueOf;
        DEFAULT_B = fValueOf;
        DEFAULT_C = fValueOf;
        DEFAULT_D = fValueOf;
        DEFAULT_TX = fValueOf;
        DEFAULT_TY = fValueOf;
    }

    public Transform(Float f11, Float f12, Float f13, Float f14, Float f15, Float f16, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f55553a = f11;
        this.f55554b = f12;
        this.f55555c = f13;
        this.f55556d = f14;
        this.f55557tx = f15;
        this.f55558ty = f16;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Float f11 = this.f55553a;
        int iHashCode2 = (iHashCode + (f11 != null ? f11.hashCode() : 0)) * 37;
        Float f12 = this.f55554b;
        int iHashCode3 = (iHashCode2 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Float f13 = this.f55555c;
        int iHashCode4 = (iHashCode3 + (f13 != null ? f13.hashCode() : 0)) * 37;
        Float f14 = this.f55556d;
        int iHashCode5 = (iHashCode4 + (f14 != null ? f14.hashCode() : 0)) * 37;
        Float f15 = this.f55557tx;
        int iHashCode6 = (iHashCode5 + (f15 != null ? f15.hashCode() : 0)) * 37;
        Float f16 = this.f55558ty;
        int iHashCode7 = iHashCode6 + (f16 != null ? f16.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.f55559a = this.f55553a;
        builder.f55560b = this.f55554b;
        builder.f55561c = this.f55555c;
        builder.f55562d = this.f55556d;
        builder.f55563tx = this.f55557tx;
        builder.f55564ty = this.f55558ty;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f55553a != null) {
            sb2.append(", a=");
            sb2.append(this.f55553a);
        }
        if (this.f55554b != null) {
            sb2.append(", b=");
            sb2.append(this.f55554b);
        }
        if (this.f55555c != null) {
            sb2.append(", c=");
            sb2.append(this.f55555c);
        }
        if (this.f55556d != null) {
            sb2.append(", d=");
            sb2.append(this.f55556d);
        }
        if (this.f55557tx != null) {
            sb2.append(", tx=");
            sb2.append(this.f55557tx);
        }
        if (this.f55558ty != null) {
            sb2.append(", ty=");
            sb2.append(this.f55558ty);
        }
        StringBuilder sbReplace = sb2.replace(0, 2, "Transform{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
