package androidx.media3.extractor.p021ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.Factory {
    private static final int DESCRIPTOR_TAG_CAPTION_SERVICE = 134;
    public static final int FLAG_ALLOW_NON_IDR_KEYFRAMES = 1;
    public static final int FLAG_DETECT_ACCESS_UNITS = 8;
    public static final int FLAG_ENABLE_HDMV_DTS_AUDIO_STREAMS = 64;
    public static final int FLAG_IGNORE_AAC_STREAM = 2;
    public static final int FLAG_IGNORE_H264_STREAM = 4;
    public static final int FLAG_IGNORE_SPLICE_INFO_STREAM = 16;
    public static final int FLAG_OVERRIDE_CAPTION_DESCRIPTORS = 32;
    private final List<Format> closedCaptionFormats;
    private final int flags;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory() {
        this(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0057  */
    @Override // androidx.media3.extractor.ts.TsPayloadReader.Factory
    @Nullable
    public TsPayloadReader createPayloadReader(int i11, TsPayloadReader.EsInfo esInfo) {
        if (i11 != 2) {
            if (i11 == 3 || i11 == 4) {
                return new PesReader(new MpegAudioReader(esInfo.language, esInfo.getRoleFlags()));
            }
            if (i11 == 21) {
                return new PesReader(new Id3Reader());
            }
            if (i11 == 27) {
                if (isSet(4)) {
                    return null;
                }
                return new PesReader(new H264Reader(buildSeiReader(esInfo), isSet(1), isSet(8)));
            }
            if (i11 == 36) {
                return new PesReader(new H265Reader(buildSeiReader(esInfo)));
            }
            if (i11 == 45) {
                return new PesReader(new MpeghReader());
            }
            if (i11 == 89) {
                return new PesReader(new DvbSubtitleReader(esInfo.dvbSubtitleInfos));
            }
            if (i11 == 172) {
                return new PesReader(new Ac4Reader(esInfo.language, esInfo.getRoleFlags()));
            }
            if (i11 == 257) {
                return new SectionReader(new PassthroughSectionPayloadReader(MimeTypes.APPLICATION_AIT));
            }
            if (i11 != 138) {
                if (i11 == 139) {
                    return new PesReader(new DtsReader(esInfo.language, esInfo.getRoleFlags(), 5408));
                }
                switch (i11) {
                    case 15:
                        if (isSet(2)) {
                            return null;
                        }
                        return new PesReader(new AdtsReader(false, esInfo.language, esInfo.getRoleFlags()));
                    case 16:
                        return new PesReader(new H263Reader(buildUserDataReader(esInfo)));
                    case 17:
                        if (isSet(2)) {
                            return null;
                        }
                        return new PesReader(new LatmReader(esInfo.language, esInfo.getRoleFlags()));
                    default:
                        switch (i11) {
                            case 128:
                                break;
                            case 129:
                                return new PesReader(new Ac3Reader(esInfo.language, esInfo.getRoleFlags()));
                            case 130:
                                if (!isSet(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i11) {
                                    case 134:
                                        if (isSet(16)) {
                                            return null;
                                        }
                                        return new SectionReader(new PassthroughSectionPayloadReader(MimeTypes.APPLICATION_SCTE35));
                                    case 135:
                                        return new PesReader(new Ac3Reader(esInfo.language, esInfo.getRoleFlags()));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new PesReader(new DtsReader(esInfo.language, esInfo.getRoleFlags(), 4096));
        }
        return new PesReader(new H262Reader(buildUserDataReader(esInfo)));
    }

    public DefaultTsPayloadReaderFactory(int i11) {
        this(i11, ImmutableList.m13439of());
    }

    private SeiReader buildSeiReader(TsPayloadReader.EsInfo esInfo) {
        return new SeiReader(getClosedCaptionFormats(esInfo));
    }

    private UserDataReader buildUserDataReader(TsPayloadReader.EsInfo esInfo) {
        return new UserDataReader(getClosedCaptionFormats(esInfo));
    }

    private List<Format> getClosedCaptionFormats(TsPayloadReader.EsInfo esInfo) {
        String str;
        int i11;
        if (isSet(32)) {
            return this.closedCaptionFormats;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(esInfo.descriptorBytes);
        List<Format> arrayList = this.closedCaptionFormats;
        while (parsableByteArray.bytesLeft() > 0) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
            if (unsignedByte == 134) {
                arrayList = new ArrayList<>();
                int unsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
                for (int i12 = 0; i12 < unsignedByte2; i12++) {
                    String string = parsableByteArray.readString(3);
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    boolean z11 = (unsignedByte3 & 128) != 0;
                    if (z11) {
                        i11 = unsignedByte3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i11 = 1;
                    }
                    byte unsignedByte4 = (byte) parsableByteArray.readUnsignedByte();
                    parsableByteArray.skipBytes(1);
                    arrayList.add(new Format.Builder().setSampleMimeType(str).setLanguage(string).setAccessibilityChannel(i11).setInitializationData(z11 ? CodecSpecificDataUtil.buildCea708InitializationData((unsignedByte4 & 64) != 0) : null).build());
                }
            }
            parsableByteArray.setPosition(position);
        }
        return arrayList;
    }

    private boolean isSet(int i11) {
        return (i11 & this.flags) != 0;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader.Factory
    public SparseArray<TsPayloadReader> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    public DefaultTsPayloadReaderFactory(int i11, List<Format> list) {
        this.flags = i11;
        this.closedCaptionFormats = list;
    }
}
