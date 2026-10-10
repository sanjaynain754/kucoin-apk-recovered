package androidx.media3.exoplayer.hls;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$OutputConsumer;
import android.media.MediaParser$SeekableInputReader;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.media3.common.FileTypes;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30;
import androidx.media3.exoplayer.source.mediaparser.MediaParserUtil;
import androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(30)
@UnstableApi
public final class MediaParserHlsMediaChunkExtractor implements HlsMediaChunkExtractor {
    public static final HlsExtractorFactory FACTORY = new HlsExtractorFactory() { // from class: androidx.media3.exoplayer.hls.m
        @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
        public final HlsMediaChunkExtractor createExtractor(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput, PlayerId playerId) {
            return MediaParserHlsMediaChunkExtractor.m3312a(uri, format, list, timestampAdjuster, map, extractorInput, playerId);
        }
    };
    private final Format format;
    private final InputReaderAdapterV30 inputReaderAdapter = new InputReaderAdapterV30();
    private final MediaParser mediaParser;
    private final ImmutableList<MediaFormat> muxedCaptionMediaFormats;
    private final OutputConsumerAdapterV30 outputConsumerAdapter;
    private final boolean overrideInBandCaptionDeclarations;
    private int pendingSkipBytes;
    private final PlayerId playerId;

    public static final class PeekingInputReader implements MediaParser$SeekableInputReader {
        private final ExtractorInput extractorInput;
        private int totalPeekedBytes;

        private PeekingInputReader(ExtractorInput extractorInput) {
            this.extractorInput = extractorInput;
        }

        public long getLength() {
            return this.extractorInput.getLength();
        }

        public long getPosition() {
            return this.extractorInput.getPeekPosition();
        }

        public int read(byte[] bArr, int i11, int i12) throws IOException {
            int iPeek = this.extractorInput.peek(bArr, i11, i12);
            this.totalPeekedBytes += iPeek;
            return iPeek;
        }

        public void seekToPosition(long j11) {
            throw new UnsupportedOperationException();
        }
    }

    @SuppressLint({"WrongConstant"})
    private static MediaParser createMediaParserInstance(MediaParser$OutputConsumer mediaParser$OutputConsumer, Format format, boolean z11, ImmutableList<MediaFormat> immutableList, PlayerId playerId, String... strArr) {
        MediaParser mediaParserCreateByName = strArr.length == 1 ? MediaParser.createByName(strArr[0], mediaParser$OutputConsumer) : MediaParser.create(mediaParser$OutputConsumer, strArr);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_EXPOSE_CAPTION_FORMATS, immutableList);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_OVERRIDE_IN_BAND_CAPTION_DECLARATIONS, Boolean.valueOf(z11));
        Boolean bool = Boolean.TRUE;
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, bool);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, bool);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_IGNORE_TIMESTAMP_OFFSET, bool);
        mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreSpliceInfoStream", bool);
        mediaParserCreateByName.setParameter("android.media.mediaparser.ts.mode", "hls");
        String str = format.codecs;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(MimeTypes.getAudioMediaMimeType(str))) {
                mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreAacStream", bool);
            }
            if (!"video/avc".equals(MimeTypes.getVideoMediaMimeType(str))) {
                mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreAvcStream", bool);
            }
        }
        if (Util.SDK_INT >= 31) {
            MediaParserUtil.setLogSessionIdOnMediaParser(mediaParserCreateByName, playerId);
        }
        return mediaParserCreateByName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ HlsMediaChunkExtractor m3312a(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput, PlayerId playerId) throws IOException {
        if (FileTypes.inferFileTypeFromMimeType(format.sampleMimeType) == 13) {
            return new BundledHlsMediaChunkExtractor(new WebvttExtractor(format.language, timestampAdjuster, SubtitleParser.Factory.UNSUPPORTED, false), format, timestampAdjuster);
        }
        boolean z11 = list != null;
        ImmutableList.Builder builder = ImmutableList.builder();
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                builder.add(MediaParserUtil.toCaptionsMediaFormat((Format) list.get(i11)));
            }
        } else {
            builder.add(MediaParserUtil.toCaptionsMediaFormat(new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA608).build()));
        }
        ImmutableList immutableListBuild = builder.build();
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30();
        if (list == null) {
            list = ImmutableList.m13439of();
        }
        outputConsumerAdapterV30.setMuxedCaptionFormats(list);
        outputConsumerAdapterV30.setTimestampAdjuster(timestampAdjuster);
        MediaParser mediaParserCreateMediaParserInstance = createMediaParserInstance(outputConsumerAdapterV30, format, z11, immutableListBuild, playerId, "android.media.mediaparser.FragmentedMp4Parser", "android.media.mediaparser.Ac3Parser", "android.media.mediaparser.Ac4Parser", "android.media.mediaparser.AdtsParser", "android.media.mediaparser.Mp3Parser", "android.media.mediaparser.TsParser");
        PeekingInputReader peekingInputReader = new PeekingInputReader(extractorInput);
        mediaParserCreateMediaParserInstance.advance(peekingInputReader);
        outputConsumerAdapterV30.setSelectedParserName(mediaParserCreateMediaParserInstance.getParserName());
        return new MediaParserHlsMediaChunkExtractor(mediaParserCreateMediaParserInstance, outputConsumerAdapterV30, format, z11, immutableListBuild, peekingInputReader.totalPeekedBytes, playerId);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public void init(ExtractorOutput extractorOutput) {
        this.outputConsumerAdapter.setExtractorOutput(extractorOutput);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean isPackedAudioExtractor() {
        String parserName = this.mediaParser.getParserName();
        return "android.media.mediaparser.Ac3Parser".equals(parserName) || "android.media.mediaparser.Ac4Parser".equals(parserName) || "android.media.mediaparser.AdtsParser".equals(parserName) || "android.media.mediaparser.Mp3Parser".equals(parserName);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean isReusable() {
        String parserName = this.mediaParser.getParserName();
        return "android.media.mediaparser.FragmentedMp4Parser".equals(parserName) || "android.media.mediaparser.TsParser".equals(parserName);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public void onTruncatedSegmentParsed() {
        this.mediaParser.seek(MediaParser.SeekPoint.START);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean read(ExtractorInput extractorInput) throws IOException {
        extractorInput.skipFully(this.pendingSkipBytes);
        this.pendingSkipBytes = 0;
        this.inputReaderAdapter.setDataReader(extractorInput, extractorInput.getLength());
        return this.mediaParser.advance(this.inputReaderAdapter);
    }

    public MediaParserHlsMediaChunkExtractor(MediaParser mediaParser, OutputConsumerAdapterV30 outputConsumerAdapterV30, Format format, boolean z11, ImmutableList<MediaFormat> immutableList, int i11, PlayerId playerId) {
        this.mediaParser = mediaParser;
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.overrideInBandCaptionDeclarations = z11;
        this.muxedCaptionMediaFormats = immutableList;
        this.format = format;
        this.playerId = playerId;
        this.pendingSkipBytes = i11;
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public HlsMediaChunkExtractor recreate() {
        Assertions.checkState(!isReusable());
        return new MediaParserHlsMediaChunkExtractor(createMediaParserInstance(this.outputConsumerAdapter, this.format, this.overrideInBandCaptionDeclarations, this.muxedCaptionMediaFormats, this.playerId, this.mediaParser.getParserName()), this.outputConsumerAdapter, this.format, this.overrideInBandCaptionDeclarations, this.muxedCaptionMediaFormats, 0, this.playerId);
    }
}
