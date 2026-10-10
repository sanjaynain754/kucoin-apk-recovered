package com.tencent.bugly.common.replay;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.jumio.core.extraction.ProcessingTimesRecorderKt;
import com.tencent.bugly.common.replay.video.MuxerConfig;
import com.tencent.bugly.common.replay.video.SimpleVideoEncoder;
import com.tencent.bugly.common.utils.FileUtil;
import com.tencent.bugly.proguard.C33591ch;
import com.tencent.bugly.proguard.C33948u0;
import com.tencent.bugly.proguard.InterfaceC33708i8;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jdk7.AutoCloseableKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.p407io.FilesKt;
import p852kotlin.p407io.TextStreamsKt;
import p852kotlin.ranges.LongProgression;
import p852kotlin.ranges.RangesKt;
import p852kotlin.sequences.Sequence;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\bL\u0010MJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J+\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eJJ\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u0006J\u0019\u0010\"\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\fH\u0000¢\u0006\u0004\b \u0010!J\b\u0010#\u001a\u00020\bH\u0016J!\u0010(\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001d\u0010<\u001a\u0004\u0018\u00010\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\u00168\u0000X\u0080D¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001d\u0010K\u001a\u0004\u0018\u00010\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bI\u00109\u001a\u0004\bJ\u0010;¨\u0006N"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/ReplayCache;", "Ljava/io/Closeable;", "Lcom/tencent/bugly/common/replay/ReplayFrame;", TypedValues.AttributesType.S_FRAME, "", "encode", "Ljava/io/File;", "file", "", "deleteFile", "Landroid/graphics/Bitmap;", "bitmap", "", "frameTimestamp", "", "screen", "addFrame$bugly_pro_release", "(Landroid/graphics/Bitmap;JLjava/lang/String;)V", "addFrame", "screenshot", TypedValues.TransitionType.S_DURATION, "from", "", "segmentId", "height", "width", "frameRate", "bitRate", "videoFile", "Lcom/tencent/bugly/common/replay/GeneratedVideo;", "createVideoOf", "until", "rotate$bugly_pro_release", "(J)Ljava/lang/String;", "rotate", "close", "key", "value", "persistSegmentValues$bugly_pro_release", "(Ljava/lang/String;Ljava/lang/String;)V", "persistSegmentValues", "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;", "options", "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/tencent/bugly/proguard/u0;", "encoderLock", "Lcom/tencent/bugly/proguard/u0;", "lock", "Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;", "encoder", "Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;", "replayCacheDir$delegate", "Lkotlin/Lazy;", "getReplayCacheDir$bugly_pro_release", "()Ljava/io/File;", "replayCacheDir", "", ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL, "Ljava/util/List;", "getFrames$bugly_pro_release", "()Ljava/util/List;", "maxFrameCount", "I", "getMaxFrameCount$bugly_pro_release", "()I", "Ljava/util/LinkedHashMap;", "ongoingSegment", "Ljava/util/LinkedHashMap;", "ongoingSegmentFile$delegate", "getOngoingSegmentFile$bugly_pro_release", "ongoingSegmentFile", "<init>", "(Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class ReplayCache implements Closeable {

    @NotNull
    private final String TAG;

    @Nullable
    private SimpleVideoEncoder encoder;

    @NotNull
    private final C33948u0 encoderLock;

    @NotNull
    private final List<ReplayFrame> frames;

    @NotNull
    private final AtomicBoolean isClosed;

    @NotNull
    private final C33948u0 lock;
    private final int maxFrameCount;

    @NotNull
    private final LinkedHashMap<String, String> ongoingSegment;

    /* JADX INFO: renamed from: ongoingSegmentFile$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ongoingSegmentFile;

    @NotNull
    private final BuglyReplayOptions options;

    /* JADX INFO: renamed from: replayCacheDir$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy replayCacheDir;

    private final boolean encode(ReplayFrame frame) {
        if (frame == null) {
            return false;
        }
        try {
            Bitmap bitmap = BitmapFactory.decodeFile(frame.getScreenshot().getAbsolutePath());
            InterfaceC33708i8 interfaceC33708i8M75112a = this.encoderLock.m75112a();
            try {
                SimpleVideoEncoder simpleVideoEncoder = this.encoder;
                if (simpleVideoEncoder != null) {
                    Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
                    simpleVideoEncoder.encode(bitmap);
                    Unit unit = Unit.INSTANCE;
                }
                AutoCloseableKt.closeFinally(interfaceC33708i8M75112a, null);
                bitmap.recycle();
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AutoCloseableKt.closeFinally(interfaceC33708i8M75112a, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Logger.INSTANCE.exception(this.TAG, "Unable to decode bitmap and encode it into a video, skipping frame", th4);
            return false;
        }
    }

    public static /* synthetic */ void addFrame$bugly_pro_release$default(ReplayCache replayCache, Bitmap bitmap, long j11, String str, int i11, Object obj) throws IOException {
        if ((i11 & 4) != 0) {
            str = null;
        }
        replayCache.addFrame$bugly_pro_release(bitmap, j11, str);
    }

    public static /* synthetic */ void addFrame$default(ReplayCache replayCache, File file, long j11, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        replayCache.addFrame(file, j11, str);
    }

    public static /* synthetic */ GeneratedVideo createVideoOf$default(ReplayCache replayCache, long j11, long j12, int i11, int i12, int i13, int i14, int i15, File file, int i16, Object obj) {
        int i17;
        File file2;
        if ((i16 & 128) != 0) {
            File replayCacheDir$bugly_pro_release = replayCache.getReplayCacheDir$bugly_pro_release();
            StringBuilder sb2 = new StringBuilder();
            i17 = i11;
            sb2.append(i17);
            sb2.append(".mp4");
            file2 = new File(replayCacheDir$bugly_pro_release, sb2.toString());
        } else {
            i17 = i11;
            file2 = file;
        }
        return replayCache.createVideoOf(j11, j12, i17, i12, i13, i14, i15, file2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFile(File file) {
        try {
            if (file.delete()) {
                return;
            }
            Logger logger = Logger.INSTANCE;
            String str = this.TAG;
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
            logger.mo77131e(str, "Failed to delete replay frame: %s", absolutePath);
        } catch (Throwable unused) {
            Logger logger2 = Logger.INSTANCE;
            String str2 = this.TAG;
            String absolutePath2 = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath2, "file.absolutePath");
            logger2.mo77131e(str2, "Failed to delete replay frame: %s", absolutePath2);
        }
    }

    public final void addFrame$bugly_pro_release(@NotNull Bitmap bitmap, long frameTimestamp, @Nullable String screen) throws IOException {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (getReplayCacheDir$bugly_pro_release() == null || bitmap.isRecycled()) {
            return;
        }
        File replayCacheDir$bugly_pro_release = getReplayCacheDir$bugly_pro_release();
        if (replayCacheDir$bugly_pro_release != null) {
            replayCacheDir$bugly_pro_release.mkdirs();
        }
        File file = new File(getReplayCacheDir$bugly_pro_release(), frameTimestamp + ".jpg");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, this.options.getQuality().screenshotQuality, fileOutputStream);
            fileOutputStream.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            addFrame(file, frameTimestamp, screen);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC33708i8 interfaceC33708i8M75112a = this.encoderLock.m75112a();
        try {
            SimpleVideoEncoder simpleVideoEncoder = this.encoder;
            if (simpleVideoEncoder != null) {
                simpleVideoEncoder.release();
            }
            this.encoder = null;
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(interfaceC33708i8M75112a, null);
            this.isClosed.set(true);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AutoCloseableKt.closeFinally(interfaceC33708i8M75112a, th2);
                throw th3;
            }
        }
    }

    @Nullable
    public final GeneratedVideo createVideoOf(long duration, long from, int segmentId, int height, int width, int frameRate, int bitRate, @NotNull File videoFile) {
        InterfaceC33708i8 interfaceC33708i8;
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        if (videoFile.exists() && videoFile.length() > 0) {
            videoFile.delete();
        }
        if (this.frames.isEmpty()) {
            Logger.INSTANCE.mo77130d(this.TAG, "No captured frames, skipping generating a video segment");
            return null;
        }
        InterfaceC33708i8 interfaceC33708i8M75112a = this.encoderLock.m75112a();
        try {
            try {
                interfaceC33708i8 = interfaceC33708i8M75112a;
                try {
                    SimpleVideoEncoder simpleVideoEncoder = new SimpleVideoEncoder(new MuxerConfig(videoFile, width, height, frameRate, bitRate, null, 32, null), null, 2, null);
                    simpleVideoEncoder.start();
                    AutoCloseableKt.closeFinally(interfaceC33708i8, null);
                    this.encoder = simpleVideoEncoder;
                    long j11 = frameRate > 0 ? ((long) 1000) / ((long) frameRate) : 1000L;
                    ReplayFrame replayFrame = (ReplayFrame) CollectionsKt.first((List) this.frames);
                    long j12 = from + duration;
                    LongProgression longProgressionStep = RangesKt.step(RangesKt.until(from, j12), j11);
                    long first = longProgressionStep.getFirst();
                    long last = longProgressionStep.getLast();
                    long step = longProgressionStep.getStep();
                    int i11 = 0;
                    if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                        while (true) {
                            for (ReplayFrame replayFrame2 : this.frames) {
                                long j13 = first + j11;
                                long timestamp = replayFrame2.getTimestamp();
                                if (first <= timestamp && timestamp <= j13) {
                                    replayFrame = replayFrame2;
                                    break;
                                }
                                if (replayFrame2.getTimestamp() > j13) {
                                    break;
                                }
                            }
                            if (encode(replayFrame)) {
                                i11++;
                            } else if (replayFrame != null) {
                                deleteFile(replayFrame.getScreenshot());
                                this.frames.remove(replayFrame);
                                replayFrame = null;
                            }
                            if (first == last) {
                                break;
                            }
                            first += step;
                        }
                    }
                    if (i11 == 0) {
                        Logger.INSTANCE.mo77130d(this.TAG, "Generated a video with no frames, not capturing a replay segment");
                        deleteFile(videoFile);
                        return null;
                    }
                    InterfaceC33708i8 interfaceC33708i8M75112a2 = this.encoderLock.m75112a();
                    try {
                        SimpleVideoEncoder simpleVideoEncoder2 = this.encoder;
                        if (simpleVideoEncoder2 != null) {
                            simpleVideoEncoder2.release();
                        }
                        SimpleVideoEncoder simpleVideoEncoder3 = this.encoder;
                        long duration2 = simpleVideoEncoder3 != null ? simpleVideoEncoder3.getDuration() : 0L;
                        this.encoder = null;
                        Unit unit = Unit.INSTANCE;
                        AutoCloseableKt.closeFinally(interfaceC33708i8M75112a2, null);
                        rotate$bugly_pro_release(j12);
                        return new GeneratedVideo(videoFile, i11, duration2);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            AutoCloseableKt.closeFinally(interfaceC33708i8M75112a2, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        AutoCloseableKt.closeFinally(interfaceC33708i8, th5);
                        throw th6;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                interfaceC33708i8 = interfaceC33708i8M75112a;
            }
        } catch (Throwable th8) {
            th = th8;
            interfaceC33708i8 = interfaceC33708i8M75112a;
        }
    }

    @NotNull
    public final List<ReplayFrame> getFrames$bugly_pro_release() {
        return this.frames;
    }

    /* JADX INFO: renamed from: getMaxFrameCount$bugly_pro_release, reason: from getter */
    public final int getMaxFrameCount() {
        return this.maxFrameCount;
    }

    @Nullable
    public final File getOngoingSegmentFile$bugly_pro_release() {
        return (File) this.ongoingSegmentFile.getValue();
    }

    @Nullable
    public final File getReplayCacheDir$bugly_pro_release() {
        return (File) this.replayCacheDir.getValue();
    }

    public final void persistSegmentValues$bugly_pro_release(@NotNull String key, @Nullable String value) {
        File ongoingSegmentFile$bugly_pro_release;
        File ongoingSegmentFile$bugly_pro_release2;
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC33708i8 interfaceC33708i8M75112a = this.lock.m75112a();
        try {
            if (this.isClosed.get()) {
                AutoCloseableKt.closeFinally(interfaceC33708i8M75112a, null);
                return;
            }
            File ongoingSegmentFile$bugly_pro_release3 = getOngoingSegmentFile$bugly_pro_release();
            if ((ongoingSegmentFile$bugly_pro_release3 == null || !ongoingSegmentFile$bugly_pro_release3.exists()) && (ongoingSegmentFile$bugly_pro_release = getOngoingSegmentFile$bugly_pro_release()) != null) {
                ongoingSegmentFile$bugly_pro_release.createNewFile();
            }
            if (this.ongoingSegment.isEmpty() && (ongoingSegmentFile$bugly_pro_release2 = getOngoingSegmentFile$bugly_pro_release()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(ongoingSegmentFile$bugly_pro_release2), Charsets.UTF_8), 8192);
                try {
                    Sequence<String> sequenceLineSequence = TextStreamsKt.lineSequence(bufferedReader);
                    LinkedHashMap<String, String> linkedHashMap = this.ongoingSegment;
                    Iterator<String> it = sequenceLineSequence.iterator();
                    while (it.hasNext()) {
                        List listSplit$default = StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 2, 2, (Object) null);
                        Pair pairM90091to = TuplesKt.m90091to((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                        linkedHashMap.put((String) pairM90091to.getFirst(), (String) pairM90091to.getSecond());
                    }
                    CloseableKt.closeFinally(bufferedReader, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(bufferedReader, th2);
                        throw th3;
                    }
                }
            }
            if (value == null) {
                this.ongoingSegment.remove(key);
            } else {
                this.ongoingSegment.put(key, value);
            }
            File ongoingSegmentFile$bugly_pro_release4 = getOngoingSegmentFile$bugly_pro_release();
            if (ongoingSegmentFile$bugly_pro_release4 != null) {
                Set<Map.Entry<String, String>> setEntrySet = this.ongoingSegment.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "ongoingSegment.entries");
                FilesKt.writeText$default(ongoingSegmentFile$bugly_pro_release4, CollectionsKt.joinToString$default(setEntrySet, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, new Function1<Map.Entry<String, String>, CharSequence>() { // from class: com.tencent.bugly.common.replay.ReplayCache$persistSegmentValues$1$2
                    @Override // p852kotlin.jvm.functions.Function1
                    @NotNull
                    public final CharSequence invoke(@NotNull Map.Entry<String, String> entry) {
                        Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
                        return entry.getKey() + '=' + entry.getValue();
                    }
                }, 30, null), null, 2, null);
                Unit unit = Unit.INSTANCE;
            }
            AutoCloseableKt.closeFinally(interfaceC33708i8M75112a, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                AutoCloseableKt.closeFinally(interfaceC33708i8M75112a, th4);
                throw th5;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final String rotate$bugly_pro_release(final long until) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        CollectionsKt.removeAll((List) this.frames, (Function1) new Function1<ReplayFrame, Boolean>() { // from class: com.tencent.bugly.common.replay.ReplayCache$rotate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.String] */
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull ReplayFrame it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getTimestamp() < until) {
                    this.deleteFile(it.getScreenshot());
                    return Boolean.TRUE;
                }
                Ref.ObjectRef<String> objectRef2 = objectRef;
                if (objectRef2.element == null) {
                    objectRef2.element = it.getScreen();
                }
                return Boolean.FALSE;
            }
        });
        return (String) objectRef.element;
    }

    public ReplayCache(@NotNull BuglyReplayOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        this.TAG = "ReplayCache";
        this.isClosed = new AtomicBoolean(false);
        this.encoderLock = new C33948u0();
        this.lock = new C33948u0();
        this.replayCacheDir = LazyKt.lazy(new Function0<File>() { // from class: com.tencent.bugly.common.replay.ReplayCache$replayCacheDir$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(FileUtil.INSTANCE.getRootPath());
                String str = File.separator;
                sb2.append(str);
                sb2.append("bugly_replay");
                sb2.append(str);
                sb2.append(C33591ch.m72746d());
                return new File(sb2.toString());
            }
        });
        this.frames = new ArrayList();
        this.maxFrameCount = 30;
        this.ongoingSegment = new LinkedHashMap<>();
        this.ongoingSegmentFile = LazyKt.lazy(new Function0<File>() { // from class: com.tencent.bugly.common.replay.ReplayCache$ongoingSegmentFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final File invoke() throws IOException {
                if (this.this$0.getReplayCacheDir$bugly_pro_release() == null) {
                    return null;
                }
                File file = new File(this.this$0.getReplayCacheDir$bugly_pro_release(), ".ongoing_segment");
                if (!file.exists()) {
                    file.createNewFile();
                }
                return file;
            }
        });
    }

    public final void addFrame(@NotNull File screenshot, long frameTimestamp, @Nullable String screen) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        this.frames.add(new ReplayFrame(screenshot, frameTimestamp, screen));
        if (this.frames.size() > this.maxFrameCount) {
            this.frames.get(0).getScreenshot().delete();
            this.frames.remove(0);
        }
    }
}
