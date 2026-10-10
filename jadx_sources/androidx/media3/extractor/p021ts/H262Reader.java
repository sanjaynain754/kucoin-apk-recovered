package androidx.media3.extractor.p021ts;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.Arrays;
import java.util.Collections;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class H262Reader implements ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private static final int START_USER_DATA = 178;
    private final CsdBuffer csdBuffer;
    private String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
    private long totalBytesWritten;

    @Nullable
    private final NalUnitTargetBuffer userData;

    @Nullable
    private final ParsableByteArray userDataParsable;

    @Nullable
    private final UserDataReader userDataReader;

    public static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }

        public void onData(byte[] bArr, int i11, int i12) {
            if (this.isFilling) {
                int i13 = i12 - i11;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i14 = this.length;
                if (length < i14 + i13) {
                    this.data = Arrays.copyOf(bArr2, (i14 + i13) * 2);
                }
                System.arraycopy(bArr, i11, this.data, this.length, i13);
                this.length += i13;
            }
        }

        public boolean onStartCode(int i11, int i12) {
            if (this.isFilling) {
                int i13 = this.length - i12;
                this.length = i13;
                if (this.sequenceExtensionPosition != 0 || i11 != 181) {
                    this.isFilling = false;
                    return true;
                }
                this.sequenceExtensionPosition = i13;
            } else if (i11 == H262Reader.START_SEQUENCE_HEADER) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public CsdBuffer(int i11) {
            this.data = new byte[i11];
        }
    }

    public H262Reader() {
        this(null);
    }

    public H262Reader(@Nullable UserDataReader userDataReader) {
        this.userDataReader = userDataReader;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new CsdBuffer(128);
        if (userDataReader != null) {
            this.userData = new NalUnitTargetBuffer(START_USER_DATA, 128);
            this.userDataParsable = new ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
        this.pesTimeUs = C2711C.TIME_UNSET;
        this.sampleTimeUs = C2711C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    /* JADX WARN: Code duplicated, block: B:16:0x0079  */
    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:20:0x0099  */
    private static Pair<Format, Long> parseCsdBuffer(CsdBuffer csdBuffer, String str) {
        float f11;
        int i11;
        float f12;
        int i12;
        long j11;
        double[] dArr;
        double d11;
        int i13;
        int i14;
        byte[] bArrCopyOf = Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        int i15 = bArrCopyOf[4] & 255;
        byte b11 = bArrCopyOf[5];
        int i16 = (i15 << 4) | ((b11 & 255) >> 4);
        int i17 = ((b11 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i18 = (bArrCopyOf[7] & 240) >> 4;
        if (i18 == 2) {
            f11 = i17 * 4;
            i11 = i16 * 3;
        } else {
            if (i18 != 3) {
                if (i18 != 4) {
                    f12 = 1.0f;
                } else {
                    f11 = i17 * 121;
                    i11 = i16 * 100;
                }
                Format formatBuild = new Format.Builder().setId(str).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i16).setHeight(i17).setPixelWidthHeightRatio(f12).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
                i12 = (bArrCopyOf[7] & 15) - 1;
                if (i12 >= 0) {
                    dArr = FRAME_RATE_VALUES;
                    if (i12 < dArr.length) {
                        d11 = dArr[i12];
                        byte b12 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                        i13 = (b12 & BuiltinOptions.NonMaxSuppressionV5Options) >> 5;
                        i14 = b12 & 31;
                        if (i13 != i14) {
                            d11 *= (((double) i13) + 1.0d) / ((double) (i14 + 1));
                        }
                        j11 = (long) (1000000.0d / d11);
                    } else {
                        j11 = 0;
                    }
                } else {
                    j11 = 0;
                }
                return Pair.create(formatBuild, Long.valueOf(j11));
            }
            f11 = i17 * 16;
            i11 = i16 * 9;
        }
        f12 = f11 / i11;
        Format formatBuild2 = new Format.Builder().setId(str).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i16).setHeight(i17).setPixelWidthHeightRatio(f12).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
        i12 = (bArrCopyOf[7] & 15) - 1;
        if (i12 >= 0) {
            dArr = FRAME_RATE_VALUES;
            if (i12 < dArr.length) {
                d11 = dArr[i12];
                byte b13 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                i13 = (b13 & BuiltinOptions.NonMaxSuppressionV5Options) >> 5;
                i14 = b13 & 31;
                if (i13 != i14) {
                    d11 *= (((double) i13) + 1.0d) / ((double) (i14 + 1));
                }
                j11 = (long) (1000000.0d / d11);
            } else {
                j11 = 0;
            }
        } else {
            j11 = 0;
        }
        return Pair.create(formatBuild2, Long.valueOf(j11));
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        boolean z11;
        int i11;
        Assertions.checkStateNotNull(this.output);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += (long) parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i12 = iFindNalUnit + 3;
            int i13 = parsableByteArray.getData()[i12] & 255;
            int i14 = iFindNalUnit - position;
            if (!this.hasOutputFormat) {
                if (i14 > 0) {
                    this.csdBuffer.onData(data, position, iFindNalUnit);
                }
                if (this.csdBuffer.onStartCode(i13, i14 < 0 ? -i14 : 0)) {
                    Pair<Format, Long> csdBuffer = parseCsdBuffer(this.csdBuffer, (String) Assertions.checkNotNull(this.formatId));
                    this.output.format((Format) csdBuffer.first);
                    this.frameDurationUs = ((Long) csdBuffer.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (nalUnitTargetBuffer != null) {
                if (i14 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(data, position, iFindNalUnit);
                    i11 = 0;
                } else {
                    i11 = -i14;
                }
                if (this.userData.endNalUnit(i11)) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.userData;
                    ((ParsableByteArray) Util.castNonNull(this.userDataParsable)).reset(this.userData.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
                    ((UserDataReader) Util.castNonNull(this.userDataReader)).consume(this.sampleTimeUs, this.userDataParsable);
                }
                if (i13 == START_USER_DATA && parsableByteArray.getData()[iFindNalUnit + 2] == 1) {
                    this.userData.startNalUnit(i13);
                }
            }
            if (i13 == 0 || i13 == START_SEQUENCE_HEADER) {
                int i15 = iLimit - iFindNalUnit;
                if (this.sampleHasPicture && this.hasOutputFormat) {
                    long j11 = this.sampleTimeUs;
                    if (j11 != C2711C.TIME_UNSET) {
                        this.output.sampleMetadata(j11, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i15, i15, null);
                    }
                }
                if (!this.startedFirstSample || this.sampleHasPicture) {
                    this.samplePosition = this.totalBytesWritten - ((long) i15);
                    long j12 = this.pesTimeUs;
                    if (j12 == C2711C.TIME_UNSET) {
                        long j13 = this.sampleTimeUs;
                        j12 = j13 != C2711C.TIME_UNSET ? j13 + this.frameDurationUs : -9223372036854775807L;
                    }
                    this.sampleTimeUs = j12;
                    this.sampleIsKeyframe = false;
                    this.pesTimeUs = C2711C.TIME_UNSET;
                    z11 = true;
                    this.startedFirstSample = true;
                } else {
                    z11 = true;
                }
                this.sampleHasPicture = i13 == 0 ? z11 : false;
            } else {
                if (i13 == 184) {
                    this.sampleIsKeyframe = true;
                }
                iLimit = iLimit;
            }
            iLimit = iLimit;
            position = i12;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, iLimit);
        }
        NalUnitTargetBuffer nalUnitTargetBuffer3 = this.userData;
        if (nalUnitTargetBuffer3 != null) {
            nalUnitTargetBuffer3.appendToNalUnit(data, position, iLimit);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void packetFinished(boolean z11) {
        Assertions.checkStateNotNull(this.output);
        if (z11) {
            boolean z12 = this.sampleIsKeyframe;
            this.output.sampleMetadata(this.sampleTimeUs, z12 ? 1 : 0, (int) (this.totalBytesWritten - this.samplePosition), 0, null);
        }
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void packetStarted(long j11, int i11) {
        this.pesTimeUs = j11;
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
        this.pesTimeUs = C2711C.TIME_UNSET;
        this.sampleTimeUs = C2711C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }
}
