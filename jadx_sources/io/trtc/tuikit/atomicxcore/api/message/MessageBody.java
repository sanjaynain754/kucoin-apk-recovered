package io.trtc.tuikit.atomicxcore.api.message;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2711C;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bq\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bó\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0002\u0010)J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010y\u001a\u00020\tHÆ\u0003J\t\u0010z\u001a\u00020\tHÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010|\u001a\u00020\tHÆ\u0003J\t\u0010}\u001a\u00020\tHÆ\u0003J\t\u0010~\u001a\u00020\tHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\tHÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\tHÆ\u0003J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010@J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\tHÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u008b\u0001\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#HÆ\u0003J\u0018\u0010\u008c\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\tHÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jþ\u0002\u0010\u0095\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(HÆ\u0001¢\u0006\u0003\u0010\u0096\u0001J\n\u0010\u0097\u0001\u001a\u00020\tHÖ\u0001J\u0016\u0010\u0098\u0001\u001a\u00020\u001a2\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u009a\u0001HÖ\u0003J\n\u0010\u009b\u0001\u001a\u00020\tHÖ\u0001J\n\u0010\u009c\u0001\u001a\u00020\u0003HÖ\u0001J\u001e\u0010\u009d\u0001\u001a\u00030\u009e\u00012\b\u0010\u009f\u0001\u001a\u00030 \u00012\u0007\u0010¡\u0001\u001a\u00020\tHÖ\u0001R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010 \u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010+\"\u0004\b;\u0010-R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010+\"\u0004\b=\u0010-R\u001a\u0010\u001f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00105\"\u0004\b?\u00107R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\b\u0019\u0010@\"\u0004\bA\u0010BR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010+\"\u0004\bE\u0010-R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00105\"\u0004\bK\u00107R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010+\"\u0004\bM\u0010-R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u00105\"\u0004\bO\u00107R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00105\"\u0004\bQ\u00107R\u001a\u0010\u0018\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u00105\"\u0004\bS\u00107R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010+\"\u0004\bU\u0010-R\u001a\u0010\u0017\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u00105\"\u0004\bW\u00107R\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010+\"\u0004\b]\u0010-R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010+\"\u0004\b_\u0010-R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010+\"\u0004\ba\u0010-R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u00105\"\u0004\bg\u00107R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010+\"\u0004\bi\u0010-R\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u00105\"\u0004\bk\u00107R\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u00105\"\u0004\bm\u00107R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010+\"\u0004\bo\u0010-R\u001a\u0010\u0015\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u00105\"\u0004\bq\u00107R\u001a\u0010\u0013\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u00105\"\u0004\bs\u00107R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010+\"\u0004\bu\u0010-¨\u0006¢\u0001"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;", "Landroid/os/Parcelable;", "text", "", "translateLanguage", "translatedText", "", "originalImagePath", "originalImageWidth", "", "originalImageHeight", "originalImageSize", "thumbImagePath", "largeImagePath", "videoPath", "videoType", "videoSize", "videoDuration", "videoSnapshotPath", "videoSnapshotWidth", "videoSnapshotHeight", "videoSnapshotSize", "soundPath", "soundSize", "soundDuration", "isSoundPlayed", "", "asrLanguage", "asrText", "filePath", "fileName", "fileSize", "faceIndex", "faceName", "systemMessage", "", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "customMessage", "Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;", "mergedMessage", "Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;)V", "getAsrLanguage", "()Ljava/lang/String;", "setAsrLanguage", "(Ljava/lang/String;)V", "getAsrText", "setAsrText", "getCustomMessage", "()Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;", "setCustomMessage", "(Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;)V", "getFaceIndex", "()I", "setFaceIndex", "(I)V", "getFaceName", "setFaceName", "getFileName", "setFileName", "getFilePath", "setFilePath", "getFileSize", "setFileSize", "()Ljava/lang/Boolean;", "setSoundPlayed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLargeImagePath", "setLargeImagePath", "getMergedMessage", "()Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;", "setMergedMessage", "(Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;)V", "getOriginalImageHeight", "setOriginalImageHeight", "getOriginalImagePath", "setOriginalImagePath", "getOriginalImageSize", "setOriginalImageSize", "getOriginalImageWidth", "setOriginalImageWidth", "getSoundDuration", "setSoundDuration", "getSoundPath", "setSoundPath", "getSoundSize", "setSoundSize", "getSystemMessage", "()Ljava/util/List;", "setSystemMessage", "(Ljava/util/List;)V", "getText", "setText", "getThumbImagePath", "setThumbImagePath", "getTranslateLanguage", "setTranslateLanguage", "getTranslatedText", "()Ljava/util/Map;", "setTranslatedText", "(Ljava/util/Map;)V", "getVideoDuration", "setVideoDuration", "getVideoPath", "setVideoPath", "getVideoSize", "setVideoSize", "getVideoSnapshotHeight", "setVideoSnapshotHeight", "getVideoSnapshotPath", "setVideoSnapshotPath", "getVideoSnapshotSize", "setVideoSnapshotSize", "getVideoSnapshotWidth", "setVideoSnapshotWidth", "getVideoType", "setVideoType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;)Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class MessageBody implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MessageBody> CREATOR = new Creator();

    @Nullable
    private String asrLanguage;

    @Nullable
    private String asrText;

    @Nullable
    private CustomMessageInfo customMessage;
    private int faceIndex;

    @Nullable
    private String faceName;

    @Nullable
    private String fileName;

    @Nullable
    private String filePath;
    private int fileSize;

    @Nullable
    private Boolean isSoundPlayed;

    @Nullable
    private String largeImagePath;

    @Nullable
    private MergedMessageInfo mergedMessage;
    private int originalImageHeight;

    @Nullable
    private String originalImagePath;
    private int originalImageSize;
    private int originalImageWidth;
    private int soundDuration;

    @Nullable
    private String soundPath;
    private int soundSize;

    @Nullable
    private List<? extends SystemMessageInfo> systemMessage;

    @Nullable
    private String text;

    @Nullable
    private String thumbImagePath;

    @Nullable
    private String translateLanguage;

    @Nullable
    private Map<String, String> translatedText;
    private int videoDuration;

    @Nullable
    private String videoPath;
    private int videoSize;
    private int videoSnapshotHeight;

    @Nullable
    private String videoSnapshotPath;
    private int videoSnapshotSize;
    private int videoSnapshotWidth;

    @Nullable
    private String videoType;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageBody> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageBody createFromParcel(@NotNull Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            String string3 = parcel.readString();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i16 = parcel.readInt();
            int i17 = parcel.readInt();
            String string8 = parcel.readString();
            int i18 = parcel.readInt();
            int i19 = parcel.readInt();
            int i21 = parcel.readInt();
            String string9 = parcel.readString();
            int i22 = parcel.readInt();
            int i23 = parcel.readInt();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            int i24 = parcel.readInt();
            int i25 = parcel.readInt();
            String string14 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i26 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i26);
                for (int i27 = 0; i27 != i26; i27++) {
                    arrayList2.add(parcel.readParcelable(MessageBody.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new MessageBody(string, string2, linkedHashMap, string3, i13, i14, i15, string4, string5, string6, string7, i16, i17, string8, i18, i19, i21, string9, i22, i23, boolValueOf, string10, string11, string12, string13, i24, i25, string14, arrayList, parcel.readInt() == 0 ? null : CustomMessageInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MergedMessageInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageBody[] newArray(int i11) {
            return new MessageBody[i11];
        }
    }

    public MessageBody() {
        this(null, null, null, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, null, null, null, null, 0, 0, null, null, null, null, Integer.MAX_VALUE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageBody copy$default(MessageBody messageBody, String str, String str2, Map map, String str3, int i11, int i12, int i13, String str4, String str5, String str6, String str7, int i14, int i15, String str8, int i16, int i17, int i18, String str9, int i19, int i21, Boolean bool, String str10, String str11, String str12, String str13, int i22, int i23, String str14, List list, CustomMessageInfo customMessageInfo, MergedMessageInfo mergedMessageInfo, int i24, Object obj) {
        MergedMessageInfo mergedMessageInfo2;
        CustomMessageInfo customMessageInfo2;
        String str15 = (i24 & 1) != 0 ? messageBody.text : str;
        String str16 = (i24 & 2) != 0 ? messageBody.translateLanguage : str2;
        Map map2 = (i24 & 4) != 0 ? messageBody.translatedText : map;
        String str17 = (i24 & 8) != 0 ? messageBody.originalImagePath : str3;
        int i25 = (i24 & 16) != 0 ? messageBody.originalImageWidth : i11;
        int i26 = (i24 & 32) != 0 ? messageBody.originalImageHeight : i12;
        int i27 = (i24 & 64) != 0 ? messageBody.originalImageSize : i13;
        String str18 = (i24 & 128) != 0 ? messageBody.thumbImagePath : str4;
        String str19 = (i24 & 256) != 0 ? messageBody.largeImagePath : str5;
        String str20 = (i24 & 512) != 0 ? messageBody.videoPath : str6;
        String str21 = (i24 & 1024) != 0 ? messageBody.videoType : str7;
        int i28 = (i24 & 2048) != 0 ? messageBody.videoSize : i14;
        int i29 = (i24 & 4096) != 0 ? messageBody.videoDuration : i15;
        String str22 = (i24 & 8192) != 0 ? messageBody.videoSnapshotPath : str8;
        String str23 = str15;
        int i31 = (i24 & 16384) != 0 ? messageBody.videoSnapshotWidth : i16;
        int i32 = (i24 & 32768) != 0 ? messageBody.videoSnapshotHeight : i17;
        int i33 = (i24 & 65536) != 0 ? messageBody.videoSnapshotSize : i18;
        String str24 = (i24 & 131072) != 0 ? messageBody.soundPath : str9;
        int i34 = (i24 & 262144) != 0 ? messageBody.soundSize : i19;
        int i35 = (i24 & 524288) != 0 ? messageBody.soundDuration : i21;
        Boolean bool2 = (i24 & 1048576) != 0 ? messageBody.isSoundPlayed : bool;
        String str25 = (i24 & 2097152) != 0 ? messageBody.asrLanguage : str10;
        String str26 = (i24 & 4194304) != 0 ? messageBody.asrText : str11;
        String str27 = (i24 & 8388608) != 0 ? messageBody.filePath : str12;
        String str28 = (i24 & 16777216) != 0 ? messageBody.fileName : str13;
        int i36 = (i24 & 33554432) != 0 ? messageBody.fileSize : i22;
        int i37 = (i24 & 67108864) != 0 ? messageBody.faceIndex : i23;
        String str29 = (i24 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? messageBody.faceName : str14;
        List list2 = (i24 & 268435456) != 0 ? messageBody.systemMessage : list;
        CustomMessageInfo customMessageInfo3 = (i24 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? messageBody.customMessage : customMessageInfo;
        if ((i24 & 1073741824) != 0) {
            customMessageInfo2 = customMessageInfo3;
            mergedMessageInfo2 = messageBody.mergedMessage;
        } else {
            mergedMessageInfo2 = mergedMessageInfo;
            customMessageInfo2 = customMessageInfo3;
        }
        return messageBody.copy(str23, str16, map2, str17, i25, i26, i27, str18, str19, str20, str21, i28, i29, str22, i31, i32, i33, str24, i34, i35, bool2, str25, str26, str27, str28, i36, i37, str29, list2, customMessageInfo2, mergedMessageInfo2);
    }

    @NotNull
    public final MessageBody copy(@Nullable String text, @Nullable String translateLanguage, @Nullable Map<String, String> translatedText, @Nullable String originalImagePath, int originalImageWidth, int originalImageHeight, int originalImageSize, @Nullable String thumbImagePath, @Nullable String largeImagePath, @Nullable String videoPath, @Nullable String videoType, int videoSize, int videoDuration, @Nullable String videoSnapshotPath, int videoSnapshotWidth, int videoSnapshotHeight, int videoSnapshotSize, @Nullable String soundPath, int soundSize, int soundDuration, @Nullable Boolean isSoundPlayed, @Nullable String asrLanguage, @Nullable String asrText, @Nullable String filePath, @Nullable String fileName, int fileSize, int faceIndex, @Nullable String faceName, @Nullable List<? extends SystemMessageInfo> systemMessage, @Nullable CustomMessageInfo customMessage, @Nullable MergedMessageInfo mergedMessage) {
        return new MessageBody(text, translateLanguage, translatedText, originalImagePath, originalImageWidth, originalImageHeight, originalImageSize, thumbImagePath, largeImagePath, videoPath, videoType, videoSize, videoDuration, videoSnapshotPath, videoSnapshotWidth, videoSnapshotHeight, videoSnapshotSize, soundPath, soundSize, soundDuration, isSoundPlayed, asrLanguage, asrText, filePath, fileName, fileSize, faceIndex, faceName, systemMessage, customMessage, mergedMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageBody)) {
            return false;
        }
        MessageBody messageBody = (MessageBody) other;
        return Intrinsics.areEqual(this.text, messageBody.text) && Intrinsics.areEqual(this.translateLanguage, messageBody.translateLanguage) && Intrinsics.areEqual(this.translatedText, messageBody.translatedText) && Intrinsics.areEqual(this.originalImagePath, messageBody.originalImagePath) && this.originalImageWidth == messageBody.originalImageWidth && this.originalImageHeight == messageBody.originalImageHeight && this.originalImageSize == messageBody.originalImageSize && Intrinsics.areEqual(this.thumbImagePath, messageBody.thumbImagePath) && Intrinsics.areEqual(this.largeImagePath, messageBody.largeImagePath) && Intrinsics.areEqual(this.videoPath, messageBody.videoPath) && Intrinsics.areEqual(this.videoType, messageBody.videoType) && this.videoSize == messageBody.videoSize && this.videoDuration == messageBody.videoDuration && Intrinsics.areEqual(this.videoSnapshotPath, messageBody.videoSnapshotPath) && this.videoSnapshotWidth == messageBody.videoSnapshotWidth && this.videoSnapshotHeight == messageBody.videoSnapshotHeight && this.videoSnapshotSize == messageBody.videoSnapshotSize && Intrinsics.areEqual(this.soundPath, messageBody.soundPath) && this.soundSize == messageBody.soundSize && this.soundDuration == messageBody.soundDuration && Intrinsics.areEqual(this.isSoundPlayed, messageBody.isSoundPlayed) && Intrinsics.areEqual(this.asrLanguage, messageBody.asrLanguage) && Intrinsics.areEqual(this.asrText, messageBody.asrText) && Intrinsics.areEqual(this.filePath, messageBody.filePath) && Intrinsics.areEqual(this.fileName, messageBody.fileName) && this.fileSize == messageBody.fileSize && this.faceIndex == messageBody.faceIndex && Intrinsics.areEqual(this.faceName, messageBody.faceName) && Intrinsics.areEqual(this.systemMessage, messageBody.systemMessage) && Intrinsics.areEqual(this.customMessage, messageBody.customMessage) && Intrinsics.areEqual(this.mergedMessage, messageBody.mergedMessage);
    }

    public MessageBody(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map, @Nullable String str3, int i11, int i12, int i13, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, int i14, int i15, @Nullable String str8, int i16, int i17, int i18, @Nullable String str9, int i19, int i21, @Nullable Boolean bool, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, int i22, int i23, @Nullable String str14, @Nullable List<? extends SystemMessageInfo> list, @Nullable CustomMessageInfo customMessageInfo, @Nullable MergedMessageInfo mergedMessageInfo) {
        this.text = str;
        this.translateLanguage = str2;
        this.translatedText = map;
        this.originalImagePath = str3;
        this.originalImageWidth = i11;
        this.originalImageHeight = i12;
        this.originalImageSize = i13;
        this.thumbImagePath = str4;
        this.largeImagePath = str5;
        this.videoPath = str6;
        this.videoType = str7;
        this.videoSize = i14;
        this.videoDuration = i15;
        this.videoSnapshotPath = str8;
        this.videoSnapshotWidth = i16;
        this.videoSnapshotHeight = i17;
        this.videoSnapshotSize = i18;
        this.soundPath = str9;
        this.soundSize = i19;
        this.soundDuration = i21;
        this.isSoundPlayed = bool;
        this.asrLanguage = str10;
        this.asrText = str11;
        this.filePath = str12;
        this.fileName = str13;
        this.fileSize = i22;
        this.faceIndex = i23;
        this.faceName = str14;
        this.systemMessage = list;
        this.customMessage = customMessageInfo;
        this.mergedMessage = mergedMessageInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getVideoPath() {
        return this.videoPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getVideoType() {
        return this.videoType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getVideoSize() {
        return this.videoSize;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getVideoDuration() {
        return this.videoDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getVideoSnapshotPath() {
        return this.videoSnapshotPath;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getVideoSnapshotWidth() {
        return this.videoSnapshotWidth;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getVideoSnapshotHeight() {
        return this.videoSnapshotHeight;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getVideoSnapshotSize() {
        return this.videoSnapshotSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getSoundPath() {
        return this.soundPath;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getSoundSize() {
        return this.soundSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTranslateLanguage() {
        return this.translateLanguage;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getSoundDuration() {
        return this.soundDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getIsSoundPlayed() {
        return this.isSoundPlayed;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getAsrLanguage() {
        return this.asrLanguage;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getAsrText() {
        return this.asrText;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getFileSize() {
        return this.fileSize;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final int getFaceIndex() {
        return this.faceIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getFaceName() {
        return this.faceName;
    }

    @Nullable
    public final List<SystemMessageInfo> component29() {
        return this.systemMessage;
    }

    @Nullable
    public final Map<String, String> component3() {
        return this.translatedText;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final CustomMessageInfo getCustomMessage() {
        return this.customMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final MergedMessageInfo getMergedMessage() {
        return this.mergedMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOriginalImagePath() {
        return this.originalImagePath;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getOriginalImageWidth() {
        return this.originalImageWidth;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOriginalImageHeight() {
        return this.originalImageHeight;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getOriginalImageSize() {
        return this.originalImageSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getThumbImagePath() {
        return this.thumbImagePath;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLargeImagePath() {
        return this.largeImagePath;
    }

    @Nullable
    public final String getAsrLanguage() {
        return this.asrLanguage;
    }

    @Nullable
    public final String getAsrText() {
        return this.asrText;
    }

    @Nullable
    public final CustomMessageInfo getCustomMessage() {
        return this.customMessage;
    }

    public final int getFaceIndex() {
        return this.faceIndex;
    }

    @Nullable
    public final String getFaceName() {
        return this.faceName;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    @Nullable
    public final String getLargeImagePath() {
        return this.largeImagePath;
    }

    @Nullable
    public final MergedMessageInfo getMergedMessage() {
        return this.mergedMessage;
    }

    public final int getOriginalImageHeight() {
        return this.originalImageHeight;
    }

    @Nullable
    public final String getOriginalImagePath() {
        return this.originalImagePath;
    }

    public final int getOriginalImageSize() {
        return this.originalImageSize;
    }

    public final int getOriginalImageWidth() {
        return this.originalImageWidth;
    }

    public final int getSoundDuration() {
        return this.soundDuration;
    }

    @Nullable
    public final String getSoundPath() {
        return this.soundPath;
    }

    public final int getSoundSize() {
        return this.soundSize;
    }

    @Nullable
    public final List<SystemMessageInfo> getSystemMessage() {
        return this.systemMessage;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getThumbImagePath() {
        return this.thumbImagePath;
    }

    @Nullable
    public final String getTranslateLanguage() {
        return this.translateLanguage;
    }

    @Nullable
    public final Map<String, String> getTranslatedText() {
        return this.translatedText;
    }

    public final int getVideoDuration() {
        return this.videoDuration;
    }

    @Nullable
    public final String getVideoPath() {
        return this.videoPath;
    }

    public final int getVideoSize() {
        return this.videoSize;
    }

    public final int getVideoSnapshotHeight() {
        return this.videoSnapshotHeight;
    }

    @Nullable
    public final String getVideoSnapshotPath() {
        return this.videoSnapshotPath;
    }

    public final int getVideoSnapshotSize() {
        return this.videoSnapshotSize;
    }

    public final int getVideoSnapshotWidth() {
        return this.videoSnapshotWidth;
    }

    @Nullable
    public final String getVideoType() {
        return this.videoType;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.translateLanguage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.translatedText;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.originalImagePath;
        int iM88225a = AbstractC39396a.m88225a(this.originalImageSize, AbstractC39396a.m88225a(this.originalImageHeight, AbstractC39396a.m88225a(this.originalImageWidth, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31);
        String str4 = this.thumbImagePath;
        int iHashCode4 = (iM88225a + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.largeImagePath;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.videoPath;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.videoType;
        int iM88225a2 = AbstractC39396a.m88225a(this.videoDuration, AbstractC39396a.m88225a(this.videoSize, (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31), 31);
        String str8 = this.videoSnapshotPath;
        int iM88225a3 = AbstractC39396a.m88225a(this.videoSnapshotSize, AbstractC39396a.m88225a(this.videoSnapshotHeight, AbstractC39396a.m88225a(this.videoSnapshotWidth, (iM88225a2 + (str8 == null ? 0 : str8.hashCode())) * 31, 31), 31), 31);
        String str9 = this.soundPath;
        int iM88225a4 = AbstractC39396a.m88225a(this.soundDuration, AbstractC39396a.m88225a(this.soundSize, (iM88225a3 + (str9 == null ? 0 : str9.hashCode())) * 31, 31), 31);
        Boolean bool = this.isSoundPlayed;
        int iHashCode7 = (iM88225a4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.asrLanguage;
        int iHashCode8 = (iHashCode7 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.asrText;
        int iHashCode9 = (iHashCode8 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.filePath;
        int iHashCode10 = (iHashCode9 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.fileName;
        int iM88225a5 = AbstractC39396a.m88225a(this.faceIndex, AbstractC39396a.m88225a(this.fileSize, (iHashCode10 + (str13 == null ? 0 : str13.hashCode())) * 31, 31), 31);
        String str14 = this.faceName;
        int iHashCode11 = (iM88225a5 + (str14 == null ? 0 : str14.hashCode())) * 31;
        List<? extends SystemMessageInfo> list = this.systemMessage;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        CustomMessageInfo customMessageInfo = this.customMessage;
        int iHashCode13 = (iHashCode12 + (customMessageInfo == null ? 0 : customMessageInfo.hashCode())) * 31;
        MergedMessageInfo mergedMessageInfo = this.mergedMessage;
        return iHashCode13 + (mergedMessageInfo != null ? mergedMessageInfo.hashCode() : 0);
    }

    @Nullable
    public final Boolean isSoundPlayed() {
        return this.isSoundPlayed;
    }

    public final void setAsrLanguage(@Nullable String str) {
        this.asrLanguage = str;
    }

    public final void setAsrText(@Nullable String str) {
        this.asrText = str;
    }

    public final void setCustomMessage(@Nullable CustomMessageInfo customMessageInfo) {
        this.customMessage = customMessageInfo;
    }

    public final void setFaceIndex(int i11) {
        this.faceIndex = i11;
    }

    public final void setFaceName(@Nullable String str) {
        this.faceName = str;
    }

    public final void setFileName(@Nullable String str) {
        this.fileName = str;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setFileSize(int i11) {
        this.fileSize = i11;
    }

    public final void setLargeImagePath(@Nullable String str) {
        this.largeImagePath = str;
    }

    public final void setMergedMessage(@Nullable MergedMessageInfo mergedMessageInfo) {
        this.mergedMessage = mergedMessageInfo;
    }

    public final void setOriginalImageHeight(int i11) {
        this.originalImageHeight = i11;
    }

    public final void setOriginalImagePath(@Nullable String str) {
        this.originalImagePath = str;
    }

    public final void setOriginalImageSize(int i11) {
        this.originalImageSize = i11;
    }

    public final void setOriginalImageWidth(int i11) {
        this.originalImageWidth = i11;
    }

    public final void setSoundDuration(int i11) {
        this.soundDuration = i11;
    }

    public final void setSoundPath(@Nullable String str) {
        this.soundPath = str;
    }

    public final void setSoundPlayed(@Nullable Boolean bool) {
        this.isSoundPlayed = bool;
    }

    public final void setSoundSize(int i11) {
        this.soundSize = i11;
    }

    public final void setSystemMessage(@Nullable List<? extends SystemMessageInfo> list) {
        this.systemMessage = list;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setThumbImagePath(@Nullable String str) {
        this.thumbImagePath = str;
    }

    public final void setTranslateLanguage(@Nullable String str) {
        this.translateLanguage = str;
    }

    public final void setTranslatedText(@Nullable Map<String, String> map) {
        this.translatedText = map;
    }

    public final void setVideoDuration(int i11) {
        this.videoDuration = i11;
    }

    public final void setVideoPath(@Nullable String str) {
        this.videoPath = str;
    }

    public final void setVideoSize(int i11) {
        this.videoSize = i11;
    }

    public final void setVideoSnapshotHeight(int i11) {
        this.videoSnapshotHeight = i11;
    }

    public final void setVideoSnapshotPath(@Nullable String str) {
        this.videoSnapshotPath = str;
    }

    public final void setVideoSnapshotSize(int i11) {
        this.videoSnapshotSize = i11;
    }

    public final void setVideoSnapshotWidth(int i11) {
        this.videoSnapshotWidth = i11;
    }

    public final void setVideoType(@Nullable String str) {
        this.videoType = str;
    }

    @NotNull
    public String toString() {
        return "MessageBody(text=" + this.text + ", translateLanguage=" + this.translateLanguage + ", translatedText=" + this.translatedText + ", originalImagePath=" + this.originalImagePath + ", originalImageWidth=" + this.originalImageWidth + ", originalImageHeight=" + this.originalImageHeight + ", originalImageSize=" + this.originalImageSize + ", thumbImagePath=" + this.thumbImagePath + ", largeImagePath=" + this.largeImagePath + ", videoPath=" + this.videoPath + ", videoType=" + this.videoType + ", videoSize=" + this.videoSize + ", videoDuration=" + this.videoDuration + ", videoSnapshotPath=" + this.videoSnapshotPath + ", videoSnapshotWidth=" + this.videoSnapshotWidth + ", videoSnapshotHeight=" + this.videoSnapshotHeight + ", videoSnapshotSize=" + this.videoSnapshotSize + ", soundPath=" + this.soundPath + ", soundSize=" + this.soundSize + ", soundDuration=" + this.soundDuration + ", isSoundPlayed=" + this.isSoundPlayed + ", asrLanguage=" + this.asrLanguage + ", asrText=" + this.asrText + ", filePath=" + this.filePath + ", fileName=" + this.fileName + ", fileSize=" + this.fileSize + ", faceIndex=" + this.faceIndex + ", faceName=" + this.faceName + ", systemMessage=" + this.systemMessage + ", customMessage=" + this.customMessage + ", mergedMessage=" + this.mergedMessage + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.text);
        parcel.writeString(this.translateLanguage);
        Map<String, String> map = this.translatedText;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.originalImagePath);
        parcel.writeInt(this.originalImageWidth);
        parcel.writeInt(this.originalImageHeight);
        parcel.writeInt(this.originalImageSize);
        parcel.writeString(this.thumbImagePath);
        parcel.writeString(this.largeImagePath);
        parcel.writeString(this.videoPath);
        parcel.writeString(this.videoType);
        parcel.writeInt(this.videoSize);
        parcel.writeInt(this.videoDuration);
        parcel.writeString(this.videoSnapshotPath);
        parcel.writeInt(this.videoSnapshotWidth);
        parcel.writeInt(this.videoSnapshotHeight);
        parcel.writeInt(this.videoSnapshotSize);
        parcel.writeString(this.soundPath);
        parcel.writeInt(this.soundSize);
        parcel.writeInt(this.soundDuration);
        Boolean bool = this.isSoundPlayed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.asrLanguage);
        parcel.writeString(this.asrText);
        parcel.writeString(this.filePath);
        parcel.writeString(this.fileName);
        parcel.writeInt(this.fileSize);
        parcel.writeInt(this.faceIndex);
        parcel.writeString(this.faceName);
        List<? extends SystemMessageInfo> list = this.systemMessage;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<? extends SystemMessageInfo> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
        }
        CustomMessageInfo customMessageInfo = this.customMessage;
        if (customMessageInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customMessageInfo.writeToParcel(parcel, flags);
        }
        MergedMessageInfo mergedMessageInfo = this.mergedMessage;
        if (mergedMessageInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mergedMessageInfo.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ MessageBody(String str, String str2, Map map, String str3, int i11, int i12, int i13, String str4, String str5, String str6, String str7, int i14, int i15, String str8, int i16, int i17, int i18, String str9, int i19, int i21, Boolean bool, String str10, String str11, String str12, String str13, int i22, int i23, String str14, List list, CustomMessageInfo customMessageInfo, MergedMessageInfo mergedMessageInfo, int i24, DefaultConstructorMarker defaultConstructorMarker) {
        this((i24 & 1) != 0 ? null : str, (i24 & 2) != 0 ? null : str2, (i24 & 4) != 0 ? null : map, (i24 & 8) != 0 ? null : str3, (i24 & 16) != 0 ? 0 : i11, (i24 & 32) != 0 ? 0 : i12, (i24 & 64) != 0 ? 0 : i13, (i24 & 128) != 0 ? null : str4, (i24 & 256) != 0 ? null : str5, (i24 & 512) != 0 ? null : str6, (i24 & 1024) != 0 ? null : str7, (i24 & 2048) != 0 ? 0 : i14, (i24 & 4096) != 0 ? 0 : i15, (i24 & 8192) != 0 ? null : str8, (i24 & 16384) != 0 ? 0 : i16, (i24 & 32768) != 0 ? 0 : i17, (i24 & 65536) != 0 ? 0 : i18, (i24 & 131072) != 0 ? null : str9, (i24 & 262144) != 0 ? 0 : i19, (i24 & 524288) != 0 ? 0 : i21, (i24 & 1048576) != 0 ? null : bool, (i24 & 2097152) != 0 ? null : str10, (i24 & 4194304) != 0 ? null : str11, (i24 & 8388608) != 0 ? null : str12, (i24 & 16777216) != 0 ? null : str13, (i24 & 33554432) != 0 ? 0 : i22, (i24 & 67108864) != 0 ? 0 : i23, (i24 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str14, (i24 & 268435456) != 0 ? null : list, (i24 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : customMessageInfo, (i24 & 1073741824) != 0 ? null : mergedMessageInfo);
    }
}
