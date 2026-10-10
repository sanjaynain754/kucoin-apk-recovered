package com.opensource.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.EOFException;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes59.dex */
public final class ShapeEntity extends Message<ShapeEntity, Builder> {
    public static final ProtoAdapter<ShapeEntity> ADAPTER = new ProtoAdapter_ShapeEntity();
    public static final ShapeType DEFAULT_TYPE = ShapeType.SHAPE;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$EllipseArgs#ADAPTER", tag = 4)
    public final EllipseArgs ellipse;

    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$RectArgs#ADAPTER", tag = 3)
    public final RectArgs rect;

    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeArgs#ADAPTER", tag = 2)
    public final ShapeArgs shape;

    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeStyle#ADAPTER", tag = 10)
    public final ShapeStyle styles;

    @WireField(adapter = "com.opensource.svgaplayer.proto.Transform#ADAPTER", tag = 11)
    public final Transform transform;

    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeType#ADAPTER", tag = 1)
    public final ShapeType type;

    public static final class Builder extends Message.Builder<ShapeEntity, Builder> {
        public EllipseArgs ellipse;
        public RectArgs rect;
        public ShapeArgs shape;
        public ShapeStyle styles;
        public Transform transform;
        public ShapeType type;

        @Override // com.squareup.wire.Message.Builder
        public ShapeEntity build() {
            return new ShapeEntity(this.type, this.styles, this.transform, this.shape, this.rect, this.ellipse, super.buildUnknownFields());
        }

        public Builder ellipse(EllipseArgs ellipseArgs) {
            this.ellipse = ellipseArgs;
            this.shape = null;
            this.rect = null;
            return this;
        }

        public Builder rect(RectArgs rectArgs) {
            this.rect = rectArgs;
            this.shape = null;
            this.ellipse = null;
            return this;
        }

        public Builder shape(ShapeArgs shapeArgs) {
            this.shape = shapeArgs;
            this.rect = null;
            this.ellipse = null;
            return this;
        }

        public Builder styles(ShapeStyle shapeStyle) {
            this.styles = shapeStyle;
            return this;
        }

        public Builder transform(Transform transform) {
            this.transform = transform;
            return this;
        }

        public Builder type(ShapeType shapeType) {
            this.type = shapeType;
            return this;
        }
    }

    public static final class EllipseArgs extends Message<EllipseArgs, Builder> {
        public static final ProtoAdapter<EllipseArgs> ADAPTER = new ProtoAdapter_EllipseArgs();
        public static final Float DEFAULT_RADIUSX;
        public static final Float DEFAULT_RADIUSY;
        public static final Float DEFAULT_X;
        public static final Float DEFAULT_Y;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
        public final Float radiusX;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
        public final Float radiusY;

        /* JADX INFO: renamed from: x */
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
        public final Float f55535x;

        /* JADX INFO: renamed from: y */
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
        public final Float f55536y;

        public static final class Builder extends Message.Builder<EllipseArgs, Builder> {
            public Float radiusX;
            public Float radiusY;

            /* JADX INFO: renamed from: x */
            public Float f55537x;

            /* JADX INFO: renamed from: y */
            public Float f55538y;

            @Override // com.squareup.wire.Message.Builder
            public EllipseArgs build() {
                return new EllipseArgs(this.f55537x, this.f55538y, this.radiusX, this.radiusY, super.buildUnknownFields());
            }

            public Builder radiusX(Float f11) {
                this.radiusX = f11;
                return this;
            }

            public Builder radiusY(Float f11) {
                this.radiusY = f11;
                return this;
            }

            /* JADX INFO: renamed from: x */
            public Builder m67804x(Float f11) {
                this.f55537x = f11;
                return this;
            }

            /* JADX INFO: renamed from: y */
            public Builder m67805y(Float f11) {
                this.f55538y = f11;
                return this;
            }
        }

        public static final class ProtoAdapter_EllipseArgs extends ProtoAdapter<EllipseArgs> {
            public ProtoAdapter_EllipseArgs() {
                super(FieldEncoding.LENGTH_DELIMITED, EllipseArgs.class);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EllipseArgs decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessage(jBeginMessage);
                        return builder.build();
                    }
                    if (iNextTag == 1) {
                        builder.m67804x(ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag == 2) {
                        builder.m67805y(ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag == 3) {
                        builder.radiusX(ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag != 4) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        builder.radiusY(ProtoAdapter.FLOAT.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, EllipseArgs ellipseArgs) throws IOException {
                Float f11 = ellipseArgs.f55535x;
                if (f11 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, f11);
                }
                Float f12 = ellipseArgs.f55536y;
                if (f12 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, f12);
                }
                Float f13 = ellipseArgs.radiusX;
                if (f13 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, f13);
                }
                Float f14 = ellipseArgs.radiusY;
                if (f14 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, f14);
                }
                protoWriter.writeBytes(ellipseArgs.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EllipseArgs ellipseArgs) {
                Float f11 = ellipseArgs.f55535x;
                int iEncodedSizeWithTag = f11 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(1, f11) : 0;
                Float f12 = ellipseArgs.f55536y;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (f12 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(2, f12) : 0);
                Float f13 = ellipseArgs.radiusX;
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (f13 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, f13) : 0);
                Float f14 = ellipseArgs.radiusY;
                return iEncodedSizeWithTag3 + (f14 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(4, f14) : 0) + ellipseArgs.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EllipseArgs redact(EllipseArgs ellipseArgs) throws EOFException {
                Builder builderNewBuilder = ellipseArgs.newBuilder();
                builderNewBuilder.clearUnknownFields();
                return builderNewBuilder.build();
            }
        }

        public EllipseArgs(Float f11, Float f12, Float f13, Float f14) {
            this(f11, f12, f13, f14, ByteString.EMPTY);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EllipseArgs)) {
                return false;
            }
            EllipseArgs ellipseArgs = (EllipseArgs) obj;
            return unknownFields().equals(ellipseArgs.unknownFields()) && Internal.equals(this.f55535x, ellipseArgs.f55535x) && Internal.equals(this.f55536y, ellipseArgs.f55536y) && Internal.equals(this.radiusX, ellipseArgs.radiusX) && Internal.equals(this.radiusY, ellipseArgs.radiusY);
        }

        static {
            Float fValueOf = Float.valueOf(0.0f);
            DEFAULT_X = fValueOf;
            DEFAULT_Y = fValueOf;
            DEFAULT_RADIUSX = fValueOf;
            DEFAULT_RADIUSY = fValueOf;
        }

        public EllipseArgs(Float f11, Float f12, Float f13, Float f14, ByteString byteString) {
            super(ADAPTER, byteString);
            this.f55535x = f11;
            this.f55536y = f12;
            this.radiusX = f13;
            this.radiusY = f14;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Float f11 = this.f55535x;
            int iHashCode2 = (iHashCode + (f11 != null ? f11.hashCode() : 0)) * 37;
            Float f12 = this.f55536y;
            int iHashCode3 = (iHashCode2 + (f12 != null ? f12.hashCode() : 0)) * 37;
            Float f13 = this.radiusX;
            int iHashCode4 = (iHashCode3 + (f13 != null ? f13.hashCode() : 0)) * 37;
            Float f14 = this.radiusY;
            int iHashCode5 = iHashCode4 + (f14 != null ? f14.hashCode() : 0);
            this.hashCode = iHashCode5;
            return iHashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.f55537x = this.f55535x;
            builder.f55538y = this.f55536y;
            builder.radiusX = this.radiusX;
            builder.radiusY = this.radiusY;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f55535x != null) {
                sb2.append(", x=");
                sb2.append(this.f55535x);
            }
            if (this.f55536y != null) {
                sb2.append(", y=");
                sb2.append(this.f55536y);
            }
            if (this.radiusX != null) {
                sb2.append(", radiusX=");
                sb2.append(this.radiusX);
            }
            if (this.radiusY != null) {
                sb2.append(", radiusY=");
                sb2.append(this.radiusY);
            }
            StringBuilder sbReplace = sb2.replace(0, 2, "EllipseArgs{");
            sbReplace.append('}');
            return sbReplace.toString();
        }
    }

    public static final class ProtoAdapter_ShapeEntity extends ProtoAdapter<ShapeEntity> {
        public ProtoAdapter_ShapeEntity() {
            super(FieldEncoding.LENGTH_DELIMITED, ShapeEntity.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public ShapeEntity decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    try {
                        builder.type(ShapeType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        builder.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iNextTag == 2) {
                    builder.shape(ShapeArgs.ADAPTER.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.rect(RectArgs.ADAPTER.decode(protoReader));
                } else if (iNextTag == 4) {
                    builder.ellipse(EllipseArgs.ADAPTER.decode(protoReader));
                } else if (iNextTag == 10) {
                    builder.styles(ShapeStyle.ADAPTER.decode(protoReader));
                } else if (iNextTag != 11) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.transform(Transform.ADAPTER.decode(protoReader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, ShapeEntity shapeEntity) throws IOException {
            ShapeType shapeType = shapeEntity.type;
            if (shapeType != null) {
                ShapeType.ADAPTER.encodeWithTag(protoWriter, 1, shapeType);
            }
            ShapeStyle shapeStyle = shapeEntity.styles;
            if (shapeStyle != null) {
                ShapeStyle.ADAPTER.encodeWithTag(protoWriter, 10, shapeStyle);
            }
            Transform transform = shapeEntity.transform;
            if (transform != null) {
                Transform.ADAPTER.encodeWithTag(protoWriter, 11, transform);
            }
            ShapeArgs shapeArgs = shapeEntity.shape;
            if (shapeArgs != null) {
                ShapeArgs.ADAPTER.encodeWithTag(protoWriter, 2, shapeArgs);
            }
            RectArgs rectArgs = shapeEntity.rect;
            if (rectArgs != null) {
                RectArgs.ADAPTER.encodeWithTag(protoWriter, 3, rectArgs);
            }
            EllipseArgs ellipseArgs = shapeEntity.ellipse;
            if (ellipseArgs != null) {
                EllipseArgs.ADAPTER.encodeWithTag(protoWriter, 4, ellipseArgs);
            }
            protoWriter.writeBytes(shapeEntity.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(ShapeEntity shapeEntity) {
            ShapeType shapeType = shapeEntity.type;
            int iEncodedSizeWithTag = shapeType != null ? ShapeType.ADAPTER.encodedSizeWithTag(1, shapeType) : 0;
            ShapeStyle shapeStyle = shapeEntity.styles;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (shapeStyle != null ? ShapeStyle.ADAPTER.encodedSizeWithTag(10, shapeStyle) : 0);
            Transform transform = shapeEntity.transform;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (transform != null ? Transform.ADAPTER.encodedSizeWithTag(11, transform) : 0);
            ShapeArgs shapeArgs = shapeEntity.shape;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (shapeArgs != null ? ShapeArgs.ADAPTER.encodedSizeWithTag(2, shapeArgs) : 0);
            RectArgs rectArgs = shapeEntity.rect;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + (rectArgs != null ? RectArgs.ADAPTER.encodedSizeWithTag(3, rectArgs) : 0);
            EllipseArgs ellipseArgs = shapeEntity.ellipse;
            return iEncodedSizeWithTag5 + (ellipseArgs != null ? EllipseArgs.ADAPTER.encodedSizeWithTag(4, ellipseArgs) : 0) + shapeEntity.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public ShapeEntity redact(ShapeEntity shapeEntity) throws EOFException {
            Builder builderNewBuilder = shapeEntity.newBuilder();
            ShapeStyle shapeStyle = builderNewBuilder.styles;
            if (shapeStyle != null) {
                builderNewBuilder.styles = ShapeStyle.ADAPTER.redact(shapeStyle);
            }
            Transform transform = builderNewBuilder.transform;
            if (transform != null) {
                builderNewBuilder.transform = Transform.ADAPTER.redact(transform);
            }
            ShapeArgs shapeArgs = builderNewBuilder.shape;
            if (shapeArgs != null) {
                builderNewBuilder.shape = ShapeArgs.ADAPTER.redact(shapeArgs);
            }
            RectArgs rectArgs = builderNewBuilder.rect;
            if (rectArgs != null) {
                builderNewBuilder.rect = RectArgs.ADAPTER.redact(rectArgs);
            }
            EllipseArgs ellipseArgs = builderNewBuilder.ellipse;
            if (ellipseArgs != null) {
                builderNewBuilder.ellipse = EllipseArgs.ADAPTER.redact(ellipseArgs);
            }
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public static final class RectArgs extends Message<RectArgs, Builder> {
        public static final ProtoAdapter<RectArgs> ADAPTER = new ProtoAdapter_RectArgs();
        public static final Float DEFAULT_CORNERRADIUS;
        public static final Float DEFAULT_HEIGHT;
        public static final Float DEFAULT_WIDTH;
        public static final Float DEFAULT_X;
        public static final Float DEFAULT_Y;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 5)
        public final Float cornerRadius;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
        public final Float height;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
        public final Float width;

        /* JADX INFO: renamed from: x */
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
        public final Float f55539x;

        /* JADX INFO: renamed from: y */
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
        public final Float f55540y;

        public static final class Builder extends Message.Builder<RectArgs, Builder> {
            public Float cornerRadius;
            public Float height;
            public Float width;

            /* JADX INFO: renamed from: x */
            public Float f55541x;

            /* JADX INFO: renamed from: y */
            public Float f55542y;

            @Override // com.squareup.wire.Message.Builder
            public RectArgs build() {
                return new RectArgs(this.f55541x, this.f55542y, this.width, this.height, this.cornerRadius, super.buildUnknownFields());
            }

            public Builder cornerRadius(Float f11) {
                this.cornerRadius = f11;
                return this;
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
            public Builder m67806x(Float f11) {
                this.f55541x = f11;
                return this;
            }

            /* JADX INFO: renamed from: y */
            public Builder m67807y(Float f11) {
                this.f55542y = f11;
                return this;
            }
        }

        public static final class ProtoAdapter_RectArgs extends ProtoAdapter<RectArgs> {
            public ProtoAdapter_RectArgs() {
                super(FieldEncoding.LENGTH_DELIMITED, RectArgs.class);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RectArgs decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessage(jBeginMessage);
                        return builder.build();
                    }
                    if (iNextTag == 1) {
                        builder.m67806x(ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag == 2) {
                        builder.m67807y(ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag == 3) {
                        builder.width(ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag == 4) {
                        builder.height(ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag != 5) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        builder.cornerRadius(ProtoAdapter.FLOAT.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, RectArgs rectArgs) throws IOException {
                Float f11 = rectArgs.f55539x;
                if (f11 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, f11);
                }
                Float f12 = rectArgs.f55540y;
                if (f12 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, f12);
                }
                Float f13 = rectArgs.width;
                if (f13 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, f13);
                }
                Float f14 = rectArgs.height;
                if (f14 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, f14);
                }
                Float f15 = rectArgs.cornerRadius;
                if (f15 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 5, f15);
                }
                protoWriter.writeBytes(rectArgs.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RectArgs rectArgs) {
                Float f11 = rectArgs.f55539x;
                int iEncodedSizeWithTag = f11 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(1, f11) : 0;
                Float f12 = rectArgs.f55540y;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (f12 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(2, f12) : 0);
                Float f13 = rectArgs.width;
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (f13 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, f13) : 0);
                Float f14 = rectArgs.height;
                int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (f14 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(4, f14) : 0);
                Float f15 = rectArgs.cornerRadius;
                return iEncodedSizeWithTag4 + (f15 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(5, f15) : 0) + rectArgs.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RectArgs redact(RectArgs rectArgs) throws EOFException {
                Builder builderNewBuilder = rectArgs.newBuilder();
                builderNewBuilder.clearUnknownFields();
                return builderNewBuilder.build();
            }
        }

        public RectArgs(Float f11, Float f12, Float f13, Float f14, Float f15) {
            this(f11, f12, f13, f14, f15, ByteString.EMPTY);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RectArgs)) {
                return false;
            }
            RectArgs rectArgs = (RectArgs) obj;
            return unknownFields().equals(rectArgs.unknownFields()) && Internal.equals(this.f55539x, rectArgs.f55539x) && Internal.equals(this.f55540y, rectArgs.f55540y) && Internal.equals(this.width, rectArgs.width) && Internal.equals(this.height, rectArgs.height) && Internal.equals(this.cornerRadius, rectArgs.cornerRadius);
        }

        static {
            Float fValueOf = Float.valueOf(0.0f);
            DEFAULT_X = fValueOf;
            DEFAULT_Y = fValueOf;
            DEFAULT_WIDTH = fValueOf;
            DEFAULT_HEIGHT = fValueOf;
            DEFAULT_CORNERRADIUS = fValueOf;
        }

        public RectArgs(Float f11, Float f12, Float f13, Float f14, Float f15, ByteString byteString) {
            super(ADAPTER, byteString);
            this.f55539x = f11;
            this.f55540y = f12;
            this.width = f13;
            this.height = f14;
            this.cornerRadius = f15;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Float f11 = this.f55539x;
            int iHashCode2 = (iHashCode + (f11 != null ? f11.hashCode() : 0)) * 37;
            Float f12 = this.f55540y;
            int iHashCode3 = (iHashCode2 + (f12 != null ? f12.hashCode() : 0)) * 37;
            Float f13 = this.width;
            int iHashCode4 = (iHashCode3 + (f13 != null ? f13.hashCode() : 0)) * 37;
            Float f14 = this.height;
            int iHashCode5 = (iHashCode4 + (f14 != null ? f14.hashCode() : 0)) * 37;
            Float f15 = this.cornerRadius;
            int iHashCode6 = iHashCode5 + (f15 != null ? f15.hashCode() : 0);
            this.hashCode = iHashCode6;
            return iHashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.f55541x = this.f55539x;
            builder.f55542y = this.f55540y;
            builder.width = this.width;
            builder.height = this.height;
            builder.cornerRadius = this.cornerRadius;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f55539x != null) {
                sb2.append(", x=");
                sb2.append(this.f55539x);
            }
            if (this.f55540y != null) {
                sb2.append(", y=");
                sb2.append(this.f55540y);
            }
            if (this.width != null) {
                sb2.append(", width=");
                sb2.append(this.width);
            }
            if (this.height != null) {
                sb2.append(", height=");
                sb2.append(this.height);
            }
            if (this.cornerRadius != null) {
                sb2.append(", cornerRadius=");
                sb2.append(this.cornerRadius);
            }
            StringBuilder sbReplace = sb2.replace(0, 2, "RectArgs{");
            sbReplace.append('}');
            return sbReplace.toString();
        }
    }

    public static final class ShapeArgs extends Message<ShapeArgs, Builder> {
        public static final ProtoAdapter<ShapeArgs> ADAPTER = new ProtoAdapter_ShapeArgs();
        public static final String DEFAULT_D = "";
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: d */
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
        public final String f55543d;

        public static final class Builder extends Message.Builder<ShapeArgs, Builder> {

            /* JADX INFO: renamed from: d */
            public String f55544d;

            @Override // com.squareup.wire.Message.Builder
            public ShapeArgs build() {
                return new ShapeArgs(this.f55544d, super.buildUnknownFields());
            }

            /* JADX INFO: renamed from: d */
            public Builder m67808d(String str) {
                this.f55544d = str;
                return this;
            }
        }

        public static final class ProtoAdapter_ShapeArgs extends ProtoAdapter<ShapeArgs> {
            public ProtoAdapter_ShapeArgs() {
                super(FieldEncoding.LENGTH_DELIMITED, ShapeArgs.class);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ShapeArgs decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessage(jBeginMessage);
                        return builder.build();
                    }
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        builder.m67808d(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, ShapeArgs shapeArgs) throws IOException {
                String str = shapeArgs.f55543d;
                if (str != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
                }
                protoWriter.writeBytes(shapeArgs.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ShapeArgs shapeArgs) {
                String str = shapeArgs.f55543d;
                return (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, str) : 0) + shapeArgs.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ShapeArgs redact(ShapeArgs shapeArgs) throws EOFException {
                Builder builderNewBuilder = shapeArgs.newBuilder();
                builderNewBuilder.clearUnknownFields();
                return builderNewBuilder.build();
            }
        }

        public ShapeArgs(String str) {
            this(str, ByteString.EMPTY);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShapeArgs)) {
                return false;
            }
            ShapeArgs shapeArgs = (ShapeArgs) obj;
            return unknownFields().equals(shapeArgs.unknownFields()) && Internal.equals(this.f55543d, shapeArgs.f55543d);
        }

        public ShapeArgs(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.f55543d = str;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            String str = this.f55543d;
            int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.f55544d = this.f55543d;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f55543d != null) {
                sb2.append(", d=");
                sb2.append(this.f55543d);
            }
            StringBuilder sbReplace = sb2.replace(0, 2, "ShapeArgs{");
            sbReplace.append('}');
            return sbReplace.toString();
        }
    }

    public static final class ShapeStyle extends Message<ShapeStyle, Builder> {
        public static final ProtoAdapter<ShapeStyle> ADAPTER = new ProtoAdapter_ShapeStyle();
        public static final LineCap DEFAULT_LINECAP;
        public static final Float DEFAULT_LINEDASHI;
        public static final Float DEFAULT_LINEDASHII;
        public static final Float DEFAULT_LINEDASHIII;
        public static final LineJoin DEFAULT_LINEJOIN;
        public static final Float DEFAULT_MITERLIMIT;
        public static final Float DEFAULT_STROKEWIDTH;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeStyle$RGBAColor#ADAPTER", tag = 1)
        public final RGBAColor fill;

        @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeStyle$LineCap#ADAPTER", tag = 4)
        public final LineCap lineCap;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 7)
        public final Float lineDashI;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 8)
        public final Float lineDashII;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 9)
        public final Float lineDashIII;

        @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeStyle$LineJoin#ADAPTER", tag = 5)
        public final LineJoin lineJoin;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 6)
        public final Float miterLimit;

        @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeStyle$RGBAColor#ADAPTER", tag = 2)
        public final RGBAColor stroke;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
        public final Float strokeWidth;

        public static final class Builder extends Message.Builder<ShapeStyle, Builder> {
            public RGBAColor fill;
            public LineCap lineCap;
            public Float lineDashI;
            public Float lineDashII;
            public Float lineDashIII;
            public LineJoin lineJoin;
            public Float miterLimit;
            public RGBAColor stroke;
            public Float strokeWidth;

            @Override // com.squareup.wire.Message.Builder
            public ShapeStyle build() {
                return new ShapeStyle(this.fill, this.stroke, this.strokeWidth, this.lineCap, this.lineJoin, this.miterLimit, this.lineDashI, this.lineDashII, this.lineDashIII, super.buildUnknownFields());
            }

            public Builder fill(RGBAColor rGBAColor) {
                this.fill = rGBAColor;
                return this;
            }

            public Builder lineCap(LineCap lineCap) {
                this.lineCap = lineCap;
                return this;
            }

            public Builder lineDashI(Float f11) {
                this.lineDashI = f11;
                return this;
            }

            public Builder lineDashII(Float f11) {
                this.lineDashII = f11;
                return this;
            }

            public Builder lineDashIII(Float f11) {
                this.lineDashIII = f11;
                return this;
            }

            public Builder lineJoin(LineJoin lineJoin) {
                this.lineJoin = lineJoin;
                return this;
            }

            public Builder miterLimit(Float f11) {
                this.miterLimit = f11;
                return this;
            }

            public Builder stroke(RGBAColor rGBAColor) {
                this.stroke = rGBAColor;
                return this;
            }

            public Builder strokeWidth(Float f11) {
                this.strokeWidth = f11;
                return this;
            }
        }

        public enum LineCap implements WireEnum {
            LineCap_BUTT(0),
            LineCap_ROUND(1),
            LineCap_SQUARE(2);

            public static final ProtoAdapter<LineCap> ADAPTER = ProtoAdapter.newEnumAdapter(LineCap.class);
            private final int value;

            public static LineCap fromValue(int i11) {
                if (i11 == 0) {
                    return LineCap_BUTT;
                }
                if (i11 == 1) {
                    return LineCap_ROUND;
                }
                if (i11 != 2) {
                    return null;
                }
                return LineCap_SQUARE;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            LineCap(int i11) {
                this.value = i11;
            }
        }

        public enum LineJoin implements WireEnum {
            LineJoin_MITER(0),
            LineJoin_ROUND(1),
            LineJoin_BEVEL(2);

            public static final ProtoAdapter<LineJoin> ADAPTER = ProtoAdapter.newEnumAdapter(LineJoin.class);
            private final int value;

            public static LineJoin fromValue(int i11) {
                if (i11 == 0) {
                    return LineJoin_MITER;
                }
                if (i11 == 1) {
                    return LineJoin_ROUND;
                }
                if (i11 != 2) {
                    return null;
                }
                return LineJoin_BEVEL;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            LineJoin(int i11) {
                this.value = i11;
            }
        }

        public static final class ProtoAdapter_ShapeStyle extends ProtoAdapter<ShapeStyle> {
            public ProtoAdapter_ShapeStyle() {
                super(FieldEncoding.LENGTH_DELIMITED, ShapeStyle.class);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ShapeStyle decode(ProtoReader protoReader) throws IOException {
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
                            builder.fill(RGBAColor.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.stroke(RGBAColor.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.strokeWidth(ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 4:
                            try {
                                builder.lineCap(LineCap.ADAPTER.decode(protoReader));
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                builder.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                            }
                            break;
                        case 5:
                            try {
                                builder.lineJoin(LineJoin.ADAPTER.decode(protoReader));
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                builder.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e12.value));
                            }
                            break;
                        case 6:
                            builder.miterLimit(ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 7:
                            builder.lineDashI(ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 8:
                            builder.lineDashII(ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 9:
                            builder.lineDashIII(ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, ShapeStyle shapeStyle) throws IOException {
                RGBAColor rGBAColor = shapeStyle.fill;
                if (rGBAColor != null) {
                    RGBAColor.ADAPTER.encodeWithTag(protoWriter, 1, rGBAColor);
                }
                RGBAColor rGBAColor2 = shapeStyle.stroke;
                if (rGBAColor2 != null) {
                    RGBAColor.ADAPTER.encodeWithTag(protoWriter, 2, rGBAColor2);
                }
                Float f11 = shapeStyle.strokeWidth;
                if (f11 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, f11);
                }
                LineCap lineCap = shapeStyle.lineCap;
                if (lineCap != null) {
                    LineCap.ADAPTER.encodeWithTag(protoWriter, 4, lineCap);
                }
                LineJoin lineJoin = shapeStyle.lineJoin;
                if (lineJoin != null) {
                    LineJoin.ADAPTER.encodeWithTag(protoWriter, 5, lineJoin);
                }
                Float f12 = shapeStyle.miterLimit;
                if (f12 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 6, f12);
                }
                Float f13 = shapeStyle.lineDashI;
                if (f13 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 7, f13);
                }
                Float f14 = shapeStyle.lineDashII;
                if (f14 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 8, f14);
                }
                Float f15 = shapeStyle.lineDashIII;
                if (f15 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 9, f15);
                }
                protoWriter.writeBytes(shapeStyle.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ShapeStyle shapeStyle) {
                RGBAColor rGBAColor = shapeStyle.fill;
                int iEncodedSizeWithTag = rGBAColor != null ? RGBAColor.ADAPTER.encodedSizeWithTag(1, rGBAColor) : 0;
                RGBAColor rGBAColor2 = shapeStyle.stroke;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (rGBAColor2 != null ? RGBAColor.ADAPTER.encodedSizeWithTag(2, rGBAColor2) : 0);
                Float f11 = shapeStyle.strokeWidth;
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (f11 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, f11) : 0);
                LineCap lineCap = shapeStyle.lineCap;
                int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (lineCap != null ? LineCap.ADAPTER.encodedSizeWithTag(4, lineCap) : 0);
                LineJoin lineJoin = shapeStyle.lineJoin;
                int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + (lineJoin != null ? LineJoin.ADAPTER.encodedSizeWithTag(5, lineJoin) : 0);
                Float f12 = shapeStyle.miterLimit;
                int iEncodedSizeWithTag6 = iEncodedSizeWithTag5 + (f12 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(6, f12) : 0);
                Float f13 = shapeStyle.lineDashI;
                int iEncodedSizeWithTag7 = iEncodedSizeWithTag6 + (f13 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(7, f13) : 0);
                Float f14 = shapeStyle.lineDashII;
                int iEncodedSizeWithTag8 = iEncodedSizeWithTag7 + (f14 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(8, f14) : 0);
                Float f15 = shapeStyle.lineDashIII;
                return iEncodedSizeWithTag8 + (f15 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(9, f15) : 0) + shapeStyle.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ShapeStyle redact(ShapeStyle shapeStyle) throws EOFException {
                Builder builderNewBuilder = shapeStyle.newBuilder();
                RGBAColor rGBAColor = builderNewBuilder.fill;
                if (rGBAColor != null) {
                    builderNewBuilder.fill = RGBAColor.ADAPTER.redact(rGBAColor);
                }
                RGBAColor rGBAColor2 = builderNewBuilder.stroke;
                if (rGBAColor2 != null) {
                    builderNewBuilder.stroke = RGBAColor.ADAPTER.redact(rGBAColor2);
                }
                builderNewBuilder.clearUnknownFields();
                return builderNewBuilder.build();
            }
        }

        public static final class RGBAColor extends Message<RGBAColor, Builder> {
            public static final ProtoAdapter<RGBAColor> ADAPTER = new ProtoAdapter_RGBAColor();
            public static final Float DEFAULT_A;
            public static final Float DEFAULT_B;
            public static final Float DEFAULT_G;
            public static final Float DEFAULT_R;
            private static final long serialVersionUID = 0;

            /* JADX INFO: renamed from: a */
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
            public final Float f55545a;

            /* JADX INFO: renamed from: b */
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
            public final Float f55546b;

            /* JADX INFO: renamed from: g */
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
            public final Float f55547g;

            /* JADX INFO: renamed from: r */
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
            public final Float f55548r;

            public static final class Builder extends Message.Builder<RGBAColor, Builder> {

                /* JADX INFO: renamed from: a */
                public Float f55549a;

                /* JADX INFO: renamed from: b */
                public Float f55550b;

                /* JADX INFO: renamed from: g */
                public Float f55551g;

                /* JADX INFO: renamed from: r */
                public Float f55552r;

                /* JADX INFO: renamed from: a */
                public Builder m67809a(Float f11) {
                    this.f55549a = f11;
                    return this;
                }

                /* JADX INFO: renamed from: b */
                public Builder m67810b(Float f11) {
                    this.f55550b = f11;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public RGBAColor build() {
                    return new RGBAColor(this.f55552r, this.f55551g, this.f55550b, this.f55549a, super.buildUnknownFields());
                }

                /* JADX INFO: renamed from: g */
                public Builder m67811g(Float f11) {
                    this.f55551g = f11;
                    return this;
                }

                /* JADX INFO: renamed from: r */
                public Builder m67812r(Float f11) {
                    this.f55552r = f11;
                    return this;
                }
            }

            public static final class ProtoAdapter_RGBAColor extends ProtoAdapter<RGBAColor> {
                public ProtoAdapter_RGBAColor() {
                    super(FieldEncoding.LENGTH_DELIMITED, RGBAColor.class);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public RGBAColor decode(ProtoReader protoReader) throws IOException {
                    Builder builder = new Builder();
                    long jBeginMessage = protoReader.beginMessage();
                    while (true) {
                        int iNextTag = protoReader.nextTag();
                        if (iNextTag == -1) {
                            protoReader.endMessage(jBeginMessage);
                            return builder.build();
                        }
                        if (iNextTag == 1) {
                            builder.m67812r(ProtoAdapter.FLOAT.decode(protoReader));
                        } else if (iNextTag == 2) {
                            builder.m67811g(ProtoAdapter.FLOAT.decode(protoReader));
                        } else if (iNextTag == 3) {
                            builder.m67810b(ProtoAdapter.FLOAT.decode(protoReader));
                        } else if (iNextTag != 4) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            builder.m67809a(ProtoAdapter.FLOAT.decode(protoReader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter protoWriter, RGBAColor rGBAColor) throws IOException {
                    Float f11 = rGBAColor.f55548r;
                    if (f11 != null) {
                        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, f11);
                    }
                    Float f12 = rGBAColor.f55547g;
                    if (f12 != null) {
                        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, f12);
                    }
                    Float f13 = rGBAColor.f55546b;
                    if (f13 != null) {
                        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, f13);
                    }
                    Float f14 = rGBAColor.f55545a;
                    if (f14 != null) {
                        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, f14);
                    }
                    protoWriter.writeBytes(rGBAColor.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RGBAColor rGBAColor) {
                    Float f11 = rGBAColor.f55548r;
                    int iEncodedSizeWithTag = f11 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(1, f11) : 0;
                    Float f12 = rGBAColor.f55547g;
                    int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (f12 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(2, f12) : 0);
                    Float f13 = rGBAColor.f55546b;
                    int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (f13 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, f13) : 0);
                    Float f14 = rGBAColor.f55545a;
                    return iEncodedSizeWithTag3 + (f14 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(4, f14) : 0) + rGBAColor.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RGBAColor redact(RGBAColor rGBAColor) throws EOFException {
                    Builder builderNewBuilder = rGBAColor.newBuilder();
                    builderNewBuilder.clearUnknownFields();
                    return builderNewBuilder.build();
                }
            }

            public RGBAColor(Float f11, Float f12, Float f13, Float f14) {
                this(f11, f12, f13, f14, ByteString.EMPTY);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RGBAColor)) {
                    return false;
                }
                RGBAColor rGBAColor = (RGBAColor) obj;
                return unknownFields().equals(rGBAColor.unknownFields()) && Internal.equals(this.f55548r, rGBAColor.f55548r) && Internal.equals(this.f55547g, rGBAColor.f55547g) && Internal.equals(this.f55546b, rGBAColor.f55546b) && Internal.equals(this.f55545a, rGBAColor.f55545a);
            }

            static {
                Float fValueOf = Float.valueOf(0.0f);
                DEFAULT_R = fValueOf;
                DEFAULT_G = fValueOf;
                DEFAULT_B = fValueOf;
                DEFAULT_A = fValueOf;
            }

            public RGBAColor(Float f11, Float f12, Float f13, Float f14, ByteString byteString) {
                super(ADAPTER, byteString);
                this.f55548r = f11;
                this.f55547g = f12;
                this.f55546b = f13;
                this.f55545a = f14;
            }

            public int hashCode() {
                int i11 = this.hashCode;
                if (i11 != 0) {
                    return i11;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                Float f11 = this.f55548r;
                int iHashCode2 = (iHashCode + (f11 != null ? f11.hashCode() : 0)) * 37;
                Float f12 = this.f55547g;
                int iHashCode3 = (iHashCode2 + (f12 != null ? f12.hashCode() : 0)) * 37;
                Float f13 = this.f55546b;
                int iHashCode4 = (iHashCode3 + (f13 != null ? f13.hashCode() : 0)) * 37;
                Float f14 = this.f55545a;
                int iHashCode5 = iHashCode4 + (f14 != null ? f14.hashCode() : 0);
                this.hashCode = iHashCode5;
                return iHashCode5;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.f55552r = this.f55548r;
                builder.f55551g = this.f55547g;
                builder.f55550b = this.f55546b;
                builder.f55549a = this.f55545a;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                StringBuilder sb2 = new StringBuilder();
                if (this.f55548r != null) {
                    sb2.append(", r=");
                    sb2.append(this.f55548r);
                }
                if (this.f55547g != null) {
                    sb2.append(", g=");
                    sb2.append(this.f55547g);
                }
                if (this.f55546b != null) {
                    sb2.append(", b=");
                    sb2.append(this.f55546b);
                }
                if (this.f55545a != null) {
                    sb2.append(", a=");
                    sb2.append(this.f55545a);
                }
                StringBuilder sbReplace = sb2.replace(0, 2, "RGBAColor{");
                sbReplace.append('}');
                return sbReplace.toString();
            }
        }

        public ShapeStyle(RGBAColor rGBAColor, RGBAColor rGBAColor2, Float f11, LineCap lineCap, LineJoin lineJoin, Float f12, Float f13, Float f14, Float f15) {
            this(rGBAColor, rGBAColor2, f11, lineCap, lineJoin, f12, f13, f14, f15, ByteString.EMPTY);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShapeStyle)) {
                return false;
            }
            ShapeStyle shapeStyle = (ShapeStyle) obj;
            return unknownFields().equals(shapeStyle.unknownFields()) && Internal.equals(this.fill, shapeStyle.fill) && Internal.equals(this.stroke, shapeStyle.stroke) && Internal.equals(this.strokeWidth, shapeStyle.strokeWidth) && Internal.equals(this.lineCap, shapeStyle.lineCap) && Internal.equals(this.lineJoin, shapeStyle.lineJoin) && Internal.equals(this.miterLimit, shapeStyle.miterLimit) && Internal.equals(this.lineDashI, shapeStyle.lineDashI) && Internal.equals(this.lineDashII, shapeStyle.lineDashII) && Internal.equals(this.lineDashIII, shapeStyle.lineDashIII);
        }

        static {
            Float fValueOf = Float.valueOf(0.0f);
            DEFAULT_STROKEWIDTH = fValueOf;
            DEFAULT_LINECAP = LineCap.LineCap_BUTT;
            DEFAULT_LINEJOIN = LineJoin.LineJoin_MITER;
            DEFAULT_MITERLIMIT = fValueOf;
            DEFAULT_LINEDASHI = fValueOf;
            DEFAULT_LINEDASHII = fValueOf;
            DEFAULT_LINEDASHIII = fValueOf;
        }

        public ShapeStyle(RGBAColor rGBAColor, RGBAColor rGBAColor2, Float f11, LineCap lineCap, LineJoin lineJoin, Float f12, Float f13, Float f14, Float f15, ByteString byteString) {
            super(ADAPTER, byteString);
            this.fill = rGBAColor;
            this.stroke = rGBAColor2;
            this.strokeWidth = f11;
            this.lineCap = lineCap;
            this.lineJoin = lineJoin;
            this.miterLimit = f12;
            this.lineDashI = f13;
            this.lineDashII = f14;
            this.lineDashIII = f15;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            RGBAColor rGBAColor = this.fill;
            int iHashCode2 = (iHashCode + (rGBAColor != null ? rGBAColor.hashCode() : 0)) * 37;
            RGBAColor rGBAColor2 = this.stroke;
            int iHashCode3 = (iHashCode2 + (rGBAColor2 != null ? rGBAColor2.hashCode() : 0)) * 37;
            Float f11 = this.strokeWidth;
            int iHashCode4 = (iHashCode3 + (f11 != null ? f11.hashCode() : 0)) * 37;
            LineCap lineCap = this.lineCap;
            int iHashCode5 = (iHashCode4 + (lineCap != null ? lineCap.hashCode() : 0)) * 37;
            LineJoin lineJoin = this.lineJoin;
            int iHashCode6 = (iHashCode5 + (lineJoin != null ? lineJoin.hashCode() : 0)) * 37;
            Float f12 = this.miterLimit;
            int iHashCode7 = (iHashCode6 + (f12 != null ? f12.hashCode() : 0)) * 37;
            Float f13 = this.lineDashI;
            int iHashCode8 = (iHashCode7 + (f13 != null ? f13.hashCode() : 0)) * 37;
            Float f14 = this.lineDashII;
            int iHashCode9 = (iHashCode8 + (f14 != null ? f14.hashCode() : 0)) * 37;
            Float f15 = this.lineDashIII;
            int iHashCode10 = iHashCode9 + (f15 != null ? f15.hashCode() : 0);
            this.hashCode = iHashCode10;
            return iHashCode10;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.fill = this.fill;
            builder.stroke = this.stroke;
            builder.strokeWidth = this.strokeWidth;
            builder.lineCap = this.lineCap;
            builder.lineJoin = this.lineJoin;
            builder.miterLimit = this.miterLimit;
            builder.lineDashI = this.lineDashI;
            builder.lineDashII = this.lineDashII;
            builder.lineDashIII = this.lineDashIII;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.fill != null) {
                sb2.append(", fill=");
                sb2.append(this.fill);
            }
            if (this.stroke != null) {
                sb2.append(", stroke=");
                sb2.append(this.stroke);
            }
            if (this.strokeWidth != null) {
                sb2.append(", strokeWidth=");
                sb2.append(this.strokeWidth);
            }
            if (this.lineCap != null) {
                sb2.append(", lineCap=");
                sb2.append(this.lineCap);
            }
            if (this.lineJoin != null) {
                sb2.append(", lineJoin=");
                sb2.append(this.lineJoin);
            }
            if (this.miterLimit != null) {
                sb2.append(", miterLimit=");
                sb2.append(this.miterLimit);
            }
            if (this.lineDashI != null) {
                sb2.append(", lineDashI=");
                sb2.append(this.lineDashI);
            }
            if (this.lineDashII != null) {
                sb2.append(", lineDashII=");
                sb2.append(this.lineDashII);
            }
            if (this.lineDashIII != null) {
                sb2.append(", lineDashIII=");
                sb2.append(this.lineDashIII);
            }
            StringBuilder sbReplace = sb2.replace(0, 2, "ShapeStyle{");
            sbReplace.append('}');
            return sbReplace.toString();
        }
    }

    public enum ShapeType implements WireEnum {
        SHAPE(0),
        RECT(1),
        ELLIPSE(2),
        KEEP(3);

        public static final ProtoAdapter<ShapeType> ADAPTER = ProtoAdapter.newEnumAdapter(ShapeType.class);
        private final int value;

        public static ShapeType fromValue(int i11) {
            if (i11 == 0) {
                return SHAPE;
            }
            if (i11 == 1) {
                return RECT;
            }
            if (i11 == 2) {
                return ELLIPSE;
            }
            if (i11 != 3) {
                return null;
            }
            return KEEP;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        ShapeType(int i11) {
            this.value = i11;
        }
    }

    public ShapeEntity(ShapeType shapeType, ShapeStyle shapeStyle, Transform transform, ShapeArgs shapeArgs, RectArgs rectArgs, EllipseArgs ellipseArgs) {
        this(shapeType, shapeStyle, transform, shapeArgs, rectArgs, ellipseArgs, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShapeEntity)) {
            return false;
        }
        ShapeEntity shapeEntity = (ShapeEntity) obj;
        return unknownFields().equals(shapeEntity.unknownFields()) && Internal.equals(this.type, shapeEntity.type) && Internal.equals(this.styles, shapeEntity.styles) && Internal.equals(this.transform, shapeEntity.transform) && Internal.equals(this.shape, shapeEntity.shape) && Internal.equals(this.rect, shapeEntity.rect) && Internal.equals(this.ellipse, shapeEntity.ellipse);
    }

    public ShapeEntity(ShapeType shapeType, ShapeStyle shapeStyle, Transform transform, ShapeArgs shapeArgs, RectArgs rectArgs, EllipseArgs ellipseArgs, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(shapeArgs, rectArgs, ellipseArgs) > 1) {
            throw new IllegalArgumentException("at most one of shape, rect, ellipse may be non-null");
        }
        this.type = shapeType;
        this.styles = shapeStyle;
        this.transform = transform;
        this.shape = shapeArgs;
        this.rect = rectArgs;
        this.ellipse = ellipseArgs;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ShapeType shapeType = this.type;
        int iHashCode2 = (iHashCode + (shapeType != null ? shapeType.hashCode() : 0)) * 37;
        ShapeStyle shapeStyle = this.styles;
        int iHashCode3 = (iHashCode2 + (shapeStyle != null ? shapeStyle.hashCode() : 0)) * 37;
        Transform transform = this.transform;
        int iHashCode4 = (iHashCode3 + (transform != null ? transform.hashCode() : 0)) * 37;
        ShapeArgs shapeArgs = this.shape;
        int iHashCode5 = (iHashCode4 + (shapeArgs != null ? shapeArgs.hashCode() : 0)) * 37;
        RectArgs rectArgs = this.rect;
        int iHashCode6 = (iHashCode5 + (rectArgs != null ? rectArgs.hashCode() : 0)) * 37;
        EllipseArgs ellipseArgs = this.ellipse;
        int iHashCode7 = iHashCode6 + (ellipseArgs != null ? ellipseArgs.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.styles = this.styles;
        builder.transform = this.transform;
        builder.shape = this.shape;
        builder.rect = this.rect;
        builder.ellipse = this.ellipse;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.type != null) {
            sb2.append(", type=");
            sb2.append(this.type);
        }
        if (this.styles != null) {
            sb2.append(", styles=");
            sb2.append(this.styles);
        }
        if (this.transform != null) {
            sb2.append(", transform=");
            sb2.append(this.transform);
        }
        if (this.shape != null) {
            sb2.append(", shape=");
            sb2.append(this.shape);
        }
        if (this.rect != null) {
            sb2.append(", rect=");
            sb2.append(this.rect);
        }
        if (this.ellipse != null) {
            sb2.append(", ellipse=");
            sb2.append(this.ellipse);
        }
        StringBuilder sbReplace = sb2.replace(0, 2, "ShapeEntity{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
