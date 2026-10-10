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
public final class Layout extends Message<Layout, Builder> {
    public static final ProtoAdapter<Layout> ADAPTER = new ProtoAdapter_Layout();
    public static final Float DEFAULT_HEIGHT;
    public static final Float DEFAULT_WIDTH;
    public static final Float DEFAULT_X;
    public static final Float DEFAULT_Y;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
    public final Float height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
    public final Float width;

    /* JADX INFO: renamed from: x */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
    public final Float f55531x;

    /* JADX INFO: renamed from: y */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
    public final Float f55532y;

    public static final class Builder extends Message.Builder<Layout, Builder> {
        public Float height;
        public Float width;

        /* JADX INFO: renamed from: x */
        public Float f55533x;

        /* JADX INFO: renamed from: y */
        public Float f55534y;

        @Override // com.squareup.wire.Message.Builder
        public Layout build() {
            return new Layout(this.f55533x, this.f55534y, this.width, this.height, super.buildUnknownFields());
        }

        public Builder height(Float f11) {
            this.height = f11;
            return this;
        }

        public Builder width(Float f11) {
            this.width = f11;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public Builder m67802x(Float f11) {
            this.f55533x = f11;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public Builder m67803y(Float f11) {
            this.f55534y = f11;
            return this;
        }
    }

    public static final class ProtoAdapter_Layout extends ProtoAdapter<Layout> {
        public ProtoAdapter_Layout() {
            super(FieldEncoding.LENGTH_DELIMITED, Layout.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Layout decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.m67802x(ProtoAdapter.FLOAT.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.m67803y(ProtoAdapter.FLOAT.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.width(ProtoAdapter.FLOAT.decode(protoReader));
                } else if (iNextTag != 4) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.height(ProtoAdapter.FLOAT.decode(protoReader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Layout layout) throws IOException {
            Float f11 = layout.f55531x;
            if (f11 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, f11);
            }
            Float f12 = layout.f55532y;
            if (f12 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, f12);
            }
            Float f13 = layout.width;
            if (f13 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, f13);
            }
            Float f14 = layout.height;
            if (f14 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, f14);
            }
            protoWriter.writeBytes(layout.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Layout layout) {
            Float f11 = layout.f55531x;
            int iEncodedSizeWithTag = f11 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(1, f11) : 0;
            Float f12 = layout.f55532y;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (f12 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(2, f12) : 0);
            Float f13 = layout.width;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (f13 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, f13) : 0);
            Float f14 = layout.height;
            return iEncodedSizeWithTag3 + (f14 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(4, f14) : 0) + layout.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Layout redact(Layout layout) throws EOFException {
            Builder builderNewBuilder = layout.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public Layout(Float f11, Float f12, Float f13, Float f14) {
        this(f11, f12, f13, f14, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Layout)) {
            return false;
        }
        Layout layout = (Layout) obj;
        return unknownFields().equals(layout.unknownFields()) && Internal.equals(this.f55531x, layout.f55531x) && Internal.equals(this.f55532y, layout.f55532y) && Internal.equals(this.width, layout.width) && Internal.equals(this.height, layout.height);
    }

    static {
        Float fValueOf = Float.valueOf(0.0f);
        DEFAULT_X = fValueOf;
        DEFAULT_Y = fValueOf;
        DEFAULT_WIDTH = fValueOf;
        DEFAULT_HEIGHT = fValueOf;
    }

    public Layout(Float f11, Float f12, Float f13, Float f14, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f55531x = f11;
        this.f55532y = f12;
        this.width = f13;
        this.height = f14;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Float f11 = this.f55531x;
        int iHashCode2 = (iHashCode + (f11 != null ? f11.hashCode() : 0)) * 37;
        Float f12 = this.f55532y;
        int iHashCode3 = (iHashCode2 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Float f13 = this.width;
        int iHashCode4 = (iHashCode3 + (f13 != null ? f13.hashCode() : 0)) * 37;
        Float f14 = this.height;
        int iHashCode5 = iHashCode4 + (f14 != null ? f14.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.f55533x = this.f55531x;
        builder.f55534y = this.f55532y;
        builder.width = this.width;
        builder.height = this.height;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f55531x != null) {
            sb2.append(", x=");
            sb2.append(this.f55531x);
        }
        if (this.f55532y != null) {
            sb2.append(", y=");
            sb2.append(this.f55532y);
        }
        if (this.width != null) {
            sb2.append(", width=");
            sb2.append(this.width);
        }
        if (this.height != null) {
            sb2.append(", height=");
            sb2.append(this.height);
        }
        StringBuilder sbReplace = sb2.replace(0, 2, "Layout{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
