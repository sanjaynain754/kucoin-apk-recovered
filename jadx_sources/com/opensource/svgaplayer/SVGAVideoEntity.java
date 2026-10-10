package com.opensource.svgaplayer;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.SoundPool;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.jumio.core.extraction.ProcessingTimesRecorderKt;
import com.opensource.svgaplayer.proto.AudioEntity;
import com.opensource.svgaplayer.proto.MovieEntity;
import com.opensource.svgaplayer.proto.MovieParams;
import com.opensource.svgaplayer.proto.SpriteEntity;
import com.tencent.bugly.library.MonitorCallback;
import com.tencent.qcloud.tuicore.TUIConstants;
import g90.C37846b;
import g90.C37848d;
import i90.C38488a;
import i90.C38493f;
import j90.C40355d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k90.C40965c;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SVGAVideoEntity.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u001f\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u0004\u0018\u00010\u001d2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010\u0011J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010\"J%\u0010+\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0)H\u0002¢\u0006\u0004\b+\u0010,J+\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020-2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040/H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020#H\u0002¢\u0006\u0004\b6\u00107J#\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040/2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b8\u00109J#\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020#0/2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b:\u00109J%\u0010;\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0)H\u0002¢\u0006\u0004\b;\u0010,J\u0019\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b=\u0010>J'\u0010B\u001a\u00020\u000f2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000f0)2\b\u0010A\u001a\u0004\u0018\u00010@H\u0000¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u000f¢\u0006\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010O\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010T\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010\"R$\u0010Z\u001a\u00020U2\u0006\u0010V\u001a\u00020U8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010W\u001a\u0004\bX\u0010YR$\u0010^\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010[\u001a\u0004\b\\\u0010]R$\u0010`\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u0010[\u001a\u0004\b_\u0010]R(\u0010h\u001a\b\u0012\u0004\u0012\u00020b0a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR(\u0010k\u001a\b\u0012\u0004\u0012\u0002010a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010c\u001a\u0004\bi\u0010e\"\u0004\bj\u0010gR$\u0010q\u001a\u0004\u0018\u00010<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0018\u0010t\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010sR.\u0010z\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001d0/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0016\u0010|\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010{R\u0016\u0010}\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R\u0016\u0010~\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010[R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010\u007fR\u001e\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0)8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bm\u0010\u0081\u0001¨\u0006\u0083\u0001"}, m90084d2 = {"Lcom/opensource/svgaplayer/SVGAVideoEntity;", "", "Lorg/json/JSONObject;", JPushConstants.Analysis.KEY_JSON, "Ljava/io/File;", "cacheDir", "", TUIConstants.TUIBeauty.PARAM_NAME_FRAME_WIDTH, TUIConstants.TUIBeauty.PARAM_NAME_FRAME_HEIGHT, "<init>", "(Lorg/json/JSONObject;Ljava/io/File;II)V", "Lcom/opensource/svgaplayer/proto/MovieEntity;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "(Lcom/opensource/svgaplayer/proto/MovieEntity;Ljava/io/File;II)V", "movieObject", "", "z", "(Lorg/json/JSONObject;)V", "Lcom/opensource/svgaplayer/proto/MovieParams;", "movieParams", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Lcom/opensource/svgaplayer/proto/MovieParams;)V", "t", "", "imgName", "imgKey", "i", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "filePath", "Landroid/graphics/Bitmap;", "c", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "obj", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lcom/opensource/svgaplayer/proto/MovieEntity;)V", "", "byteArray", "d", "([BLjava/lang/String;)Landroid/graphics/Bitmap;", "w", "v", "Lkotlin/Function0;", "completionBlock", "y", "(Lcom/opensource/svgaplayer/proto/MovieEntity;Lkotlin/jvm/functions/Function0;)V", "Lcom/opensource/svgaplayer/proto/AudioEntity;", "audio", "Ljava/util/HashMap;", "audiosFileMap", "Li90/a;", "e", "(Lcom/opensource/svgaplayer/proto/AudioEntity;Ljava/util/HashMap;)Li90/a;", "audioCache", "value", "f", "(Ljava/io/File;[B)Ljava/io/File;", "g", "(Lcom/opensource/svgaplayer/proto/MovieEntity;)Ljava/util/HashMap;", CmcdData.Factory.STREAMING_FORMAT_HLS, "B", "Landroid/media/SoundPool;", "j", "(Lcom/opensource/svgaplayer/proto/MovieEntity;)Landroid/media/SoundPool;", TUIConstants.TUIChat.CALL_BACK, "Lcom/opensource/svgaplayer/SVGAParser$c;", "playCallback", "u", "(Lkotlin/jvm/functions/Function0;Lcom/opensource/svgaplayer/SVGAParser$c;)V", "b", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "TAG", "", "Z", "k", "()Z", "x", "(Z)V", "antiAlias", "Lcom/opensource/svgaplayer/proto/MovieEntity;", "getMovieItem", "()Lcom/opensource/svgaplayer/proto/MovieEntity;", "setMovieItem", "movieItem", "Lj90/d;", "<set-?>", "Lj90/d;", "r", "()Lj90/d;", "videoSize", "I", "m", "()I", "FPS", "n", ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL, "", "Li90/f;", "Ljava/util/List;", "q", "()Ljava/util/List;", "setSpriteList$com_opensource_svgaplayer", "(Ljava/util/List;)V", "spriteList", CmcdData.Factory.STREAM_TYPE_LIVE, "setAudioList$com_opensource_svgaplayer", "audioList", "Landroid/media/SoundPool;", "p", "()Landroid/media/SoundPool;", "setSoundPool$com_opensource_svgaplayer", "(Landroid/media/SoundPool;)V", "soundPool", "Lcom/opensource/svgaplayer/h$a;", "Lcom/opensource/svgaplayer/h$a;", "soundCallback", "Ljava/util/HashMap;", "o", "()Ljava/util/HashMap;", "setImageMap$com_opensource_svgaplayer", "(Ljava/util/HashMap;)V", "imageMap", "Ljava/io/File;", "mCacheDir", "mFrameHeight", "mFrameWidth", "Lcom/opensource/svgaplayer/SVGAParser$c;", "mPlayCallback", "Lkotlin/jvm/functions/Function0;", "mCallback", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class SVGAVideoEntity {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public MovieEntity movieItem;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int frames;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public SoundPool soundPool;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public C27326h.a soundCallback;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public File mCacheDir;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int mFrameHeight;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int mFrameWidth;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public SVGAParser.InterfaceC27308c mPlayCallback;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public Function0<Unit> mCallback;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String TAG = "SVGAVideoEntity";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean antiAlias = true;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public C40355d videoSize = new C40355d(0.0d, 0.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int FPS = 15;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public List<C38493f> spriteList = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public List<C38488a> audioList = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public HashMap<String, Bitmap> imageMap = new HashMap<>();

    /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAVideoEntity$a */
    /* JADX INFO: compiled from: SVGAVideoEntity.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m90084d2 = {"com/opensource/svgaplayer/SVGAVideoEntity$a", "Lcom/opensource/svgaplayer/h$a;", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
    public static final class C27316a implements C27326h.a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.IntRef f55488b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MovieEntity f55489c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Function0 f55490d;

        public C27316a(Ref.IntRef intRef, MovieEntity movieEntity, Function0 function0) {
            this.f55488b = intRef;
            this.f55489c = movieEntity;
            this.f55490d = function0;
        }
    }

    /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAVideoEntity$b */
    /* JADX INFO: compiled from: SVGAVideoEntity.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, m90084d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/media/SoundPool;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "onLoadComplete"}, m90085k = 3, m90086mv = {1, 1, 15})
    public static final class C27317b implements SoundPool.OnLoadCompleteListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.IntRef f55491a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MovieEntity f55492b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function0 f55493c;

        public C27317b(Ref.IntRef intRef, MovieEntity movieEntity, Function0 function0) {
            this.f55491a = intRef;
            this.f55492b = movieEntity;
            this.f55493c = function0;
        }

        @Override // android.media.SoundPool.OnLoadCompleteListener
        public final void onLoadComplete(SoundPool soundPool, int i11, int i12) {
            C40965c.f91057a.m89717e("SVGAParser", "pool_complete");
            Ref.IntRef intRef = this.f55491a;
            int i13 = intRef.element + 1;
            intRef.element = i13;
            List<AudioEntity> list = this.f55492b.audios;
            Intrinsics.checkExpressionValueIsNotNull(list, "entity.audios");
            if (i13 >= list.size()) {
                this.f55493c.invoke();
            }
        }
    }

    public SVGAVideoEntity(@NotNull JSONObject jSONObject, @NotNull File file, int i11, int i12) {
        this.mFrameWidth = i11;
        this.mFrameHeight = i12;
        this.mCacheDir = file;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("movie");
        if (jSONObjectOptJSONObject != null) {
            m67737z(jSONObjectOptJSONObject);
            try {
                m67731t(jSONObject);
            } catch (Exception e11) {
                e11.printStackTrace();
            } catch (OutOfMemoryError e12) {
                e12.printStackTrace();
            }
            m67734w(jSONObject);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Function0 m67710a(SVGAVideoEntity sVGAVideoEntity) {
        Function0<Unit> function0 = sVGAVideoEntity.mCallback;
        if (function0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCallback");
        }
        return function0;
    }

    /* JADX INFO: renamed from: A */
    public final void m67711A(MovieParams movieParams) {
        Float f11 = movieParams.viewBoxWidth;
        double dFloatValue = f11 != null ? f11.floatValue() : 0.0f;
        Float f12 = movieParams.viewBoxHeight;
        this.videoSize = new C40355d(0.0d, 0.0d, dFloatValue, f12 != null ? f12.floatValue() : 0.0f);
        Integer num = movieParams.fps;
        this.FPS = num != null ? num.intValue() : 20;
        Integer num2 = movieParams.frames;
        this.frames = num2 != null ? num2.intValue() : 0;
    }

    /* JADX INFO: renamed from: B */
    public final void m67712B(MovieEntity entity, Function0<Unit> completionBlock) {
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        if (C27326h.f55530e.m67797b()) {
            this.soundCallback = new C27316a(intRef, entity, completionBlock);
            return;
        }
        this.soundPool = m67721j(entity);
        C40965c.f91057a.m89717e("SVGAParser", "pool_start");
        SoundPool soundPool = this.soundPool;
        if (soundPool != null) {
            soundPool.setOnLoadCompleteListener(new C27317b(intRef, entity, completionBlock));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m67713b() {
        if (C27326h.f55530e.m67797b()) {
            Iterator<T> it = this.audioList.iterator();
            while (it.hasNext()) {
                Integer soundID = ((C38488a) it.next()).getSoundID();
                if (soundID != null) {
                    C27326h.f55530e.m67801f(soundID.intValue());
                }
            }
            this.soundCallback = null;
        }
        SoundPool soundPool = this.soundPool;
        if (soundPool != null) {
            soundPool.release();
        }
        this.soundPool = null;
        this.audioList = CollectionsKt.emptyList();
        this.spriteList = CollectionsKt.emptyList();
        this.imageMap.clear();
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m67714c(String filePath) {
        return C37848d.f85226a.m85407a(filePath, this.mFrameWidth, this.mFrameHeight);
    }

    /* JADX INFO: renamed from: d */
    public final Bitmap m67715d(byte[] byteArray, String filePath) {
        Bitmap bitmapM85407a = C37846b.f85225a.m85407a(byteArray, this.mFrameWidth, this.mFrameHeight);
        return bitmapM85407a != null ? bitmapM85407a : m67714c(filePath);
    }

    /* JADX INFO: renamed from: e */
    public final C38488a m67716e(AudioEntity audio, HashMap<String, File> audiosFileMap) {
        C38488a c38488a = new C38488a(audio);
        Integer num = audio.startTime;
        double dIntValue = num != null ? num.intValue() : 0;
        Integer num2 = audio.totalTime;
        double dIntValue2 = num2 != null ? num2.intValue() : 0;
        if (((int) dIntValue2) != 0) {
            SVGAParser.InterfaceC27308c interfaceC27308c = this.mPlayCallback;
            if (interfaceC27308c != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<Map.Entry<String, File>> it = audiosFileMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue());
                }
                interfaceC27308c.m67709a(arrayList);
                Function0<Unit> function0 = this.mCallback;
                if (function0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCallback");
                }
                function0.invoke();
                return c38488a;
            }
            File file = audiosFileMap.get(audio.audioKey);
            if (file != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    double dAvailable = fileInputStream.available();
                    long j11 = (long) ((dIntValue / dIntValue2) * dAvailable);
                    C27326h c27326h = C27326h.f55530e;
                    if (c27326h.m67797b()) {
                        c38488a.m87086f(Integer.valueOf(c27326h.m67798c(this.soundCallback, fileInputStream.getFD(), j11, (long) dAvailable, 1)));
                    } else {
                        SoundPool soundPool = this.soundPool;
                        c38488a.m87086f(soundPool != null ? Integer.valueOf(soundPool.load(fileInputStream.getFD(), j11, (long) dAvailable, 1)) : null);
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    return c38488a;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(fileInputStream, th2);
                        throw th3;
                    }
                }
            }
        }
        return c38488a;
    }

    /* JADX INFO: renamed from: h */
    public final HashMap<String, byte[]> m67719h(MovieEntity entity) {
        Set<Map.Entry<String, ByteString>> setEntrySet;
        HashMap<String, byte[]> map = new HashMap<>();
        Map<String, ByteString> map2 = entity.images;
        if (map2 != null && (setEntrySet = map2.entrySet()) != null) {
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String imageKey = (String) entry.getKey();
                byte[] byteArray = ((ByteString) entry.getValue()).toByteArray();
                Intrinsics.checkExpressionValueIsNotNull(byteArray, "byteArray");
                if (byteArray.length >= 4) {
                    List<Byte> listSlice = ArraysKt.slice(byteArray, new IntRange(0, 3));
                    if (listSlice.get(0).byteValue() == 73 && listSlice.get(1).byteValue() == 68 && listSlice.get(2).byteValue() == 51) {
                        Intrinsics.checkExpressionValueIsNotNull(imageKey, "imageKey");
                        map.put(imageKey, byteArray);
                    } else if (listSlice.get(0).byteValue() == -1 && listSlice.get(1).byteValue() == -5 && listSlice.get(2).byteValue() == -108) {
                        Intrinsics.checkExpressionValueIsNotNull(imageKey, "imageKey");
                        map.put(imageKey, byteArray);
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    public final String m67720i(String imgName, String imgKey) {
        String str = this.mCacheDir.getAbsolutePath() + "/" + imgName;
        String str2 = str + ".png";
        String str3 = this.mCacheDir.getAbsolutePath() + "/" + imgKey + ".png";
        if (new File(str).exists()) {
            return str;
        }
        if (new File(str2).exists()) {
            return str2;
        }
        return new File(str3).exists() ? str3 : "";
    }

    /* JADX INFO: renamed from: j */
    public final SoundPool m67721j(MovieEntity entity) {
        try {
            SoundPool.Builder audioAttributes = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).build());
            List<AudioEntity> list = entity.audios;
            Intrinsics.checkExpressionValueIsNotNull(list, "entity.audios");
            return audioAttributes.setMaxStreams(RangesKt.coerceAtMost(12, list.size())).build();
        } catch (Exception e11) {
            C40965c.f91057a.m89716d(this.TAG, e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getAntiAlias() {
        return this.antiAlias;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final List<C38488a> m67723l() {
        return this.audioList;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getFPS() {
        return this.FPS;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getFrames() {
        return this.frames;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final HashMap<String, Bitmap> m67726o() {
        return this.imageMap;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final SoundPool getSoundPool() {
        return this.soundPool;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final List<C38493f> m67728q() {
        return this.spriteList;
    }

    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public final C40355d getVideoSize() {
        return this.videoSize;
    }

    /* JADX INFO: renamed from: s */
    public final void m67730s(MovieEntity obj) {
        Set<Map.Entry<String, ByteString>> setEntrySet;
        Map<String, ByteString> map = obj.images;
        if (map == null || (setEntrySet = map.entrySet()) == null) {
            return;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            byte[] byteArray = ((ByteString) entry.getValue()).toByteArray();
            Intrinsics.checkExpressionValueIsNotNull(byteArray, "byteArray");
            if (byteArray.length >= 4) {
                List<Byte> listSlice = ArraysKt.slice(byteArray, new IntRange(0, 3));
                if (listSlice.get(0).byteValue() != 73 || listSlice.get(1).byteValue() != 68 || listSlice.get(2).byteValue() != 51) {
                    String strUtf8 = ((ByteString) entry.getValue()).utf8();
                    Intrinsics.checkExpressionValueIsNotNull(strUtf8, "entry.value.utf8()");
                    Object key = entry.getKey();
                    Intrinsics.checkExpressionValueIsNotNull(key, "entry.key");
                    Bitmap bitmapM67715d = m67715d(byteArray, m67720i(strUtf8, (String) key));
                    if (bitmapM67715d != null) {
                        HashMap<String, Bitmap> map2 = this.imageMap;
                        Object key2 = entry.getKey();
                        Intrinsics.checkExpressionValueIsNotNull(key2, "entry.key");
                        map2.put((String) key2, bitmapM67715d);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m67731t(JSONObject json) {
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("images");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            Intrinsics.checkExpressionValueIsNotNull(itKeys, "imgJson.keys()");
            while (itKeys.hasNext()) {
                String imgKey = itKeys.next();
                String string = jSONObjectOptJSONObject.get(imgKey).toString();
                Intrinsics.checkExpressionValueIsNotNull(imgKey, "imgKey");
                String strM67720i = m67720i(string, imgKey);
                if (strM67720i.length() == 0) {
                    return;
                }
                String strReplace$default = StringsKt.replace$default(imgKey, ".matte", "", false, 4, (Object) null);
                Bitmap bitmapM67714c = m67714c(strM67720i);
                if (bitmapM67714c != null) {
                    this.imageMap.put(strReplace$default, bitmapM67714c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m67732u(@NotNull Function0<Unit> callback, @Nullable SVGAParser.InterfaceC27308c playCallback) throws IOException {
        this.mCallback = callback;
        this.mPlayCallback = playCallback;
        MovieEntity movieEntity = this.movieItem;
        if (movieEntity == null) {
            if (callback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCallback");
            }
            callback.invoke();
        } else {
            if (movieEntity == null) {
                Intrinsics.throwNpe();
            }
            m67736y(movieEntity, new Function0<Unit>() { // from class: com.opensource.svgaplayer.SVGAVideoEntity$prepare$1
                @Override // p852kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    SVGAVideoEntity.m67710a(this.this$0).invoke();
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m67733v(MovieEntity entity) {
        List<C38493f> listEmptyList;
        List<SpriteEntity> list = entity.sprites;
        if (list != null) {
            listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (SpriteEntity it : list) {
                Intrinsics.checkExpressionValueIsNotNull(it, "it");
                listEmptyList.add(new C38493f(it));
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.spriteList = listEmptyList;
    }

    /* JADX INFO: renamed from: w */
    public final void m67734w(JSONObject json) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("sprites");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new C38493f(jSONObjectOptJSONObject));
                }
            }
        }
        this.spriteList = CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: renamed from: x */
    public final void m67735x(boolean z11) {
        this.antiAlias = z11;
    }

    /* JADX INFO: renamed from: y */
    public final void m67736y(MovieEntity entity, Function0<Unit> completionBlock) throws IOException {
        List<AudioEntity> list = entity.audios;
        if (list == null || list.isEmpty()) {
            completionBlock.invoke();
            return;
        }
        m67712B(entity, completionBlock);
        HashMap<String, File> mapM67718g = m67718g(entity);
        if (mapM67718g.size() == 0) {
            completionBlock.invoke();
            return;
        }
        List<AudioEntity> list2 = entity.audios;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (AudioEntity audio : list2) {
            Intrinsics.checkExpressionValueIsNotNull(audio, "audio");
            arrayList.add(m67716e(audio, mapM67718g));
        }
        this.audioList = arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final File m67717f(File audioCache, byte[] value) throws IOException {
        audioCache.createNewFile();
        new FileOutputStream(audioCache).write(value);
        return audioCache;
    }

    /* JADX INFO: renamed from: g */
    public final HashMap<String, File> m67718g(MovieEntity entity) throws IOException {
        File fileM67717f;
        HashMap<String, byte[]> mapM67719h = m67719h(entity);
        HashMap<String, File> map = new HashMap<>();
        if (mapM67719h.size() > 0) {
            for (Map.Entry<String, byte[]> entry : mapM67719h.entrySet()) {
                File fileM67642a = SVGACache.f55407c.m67642a(entry.getKey());
                String key = entry.getKey();
                if (fileM67642a.exists()) {
                    fileM67717f = fileM67642a;
                } else {
                    fileM67717f = null;
                }
                if (fileM67717f == null) {
                    fileM67717f = m67717f(fileM67642a, entry.getValue());
                }
                map.put(key, fileM67717f);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: z */
    public final void m67737z(JSONObject movieObject) {
        JSONObject jSONObjectOptJSONObject = movieObject.optJSONObject("viewBox");
        if (jSONObjectOptJSONObject != null) {
            this.videoSize = new C40355d(0.0d, 0.0d, jSONObjectOptJSONObject.optDouble("width", 0.0d), jSONObjectOptJSONObject.optDouble("height", 0.0d));
        }
        this.FPS = movieObject.optInt(MonitorCallback.EVENT_FPS, 20);
        this.frames = movieObject.optInt(ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL, 0);
    }

    public SVGAVideoEntity(@NotNull MovieEntity movieEntity, @NotNull File file, int i11, int i12) {
        this.mFrameWidth = i11;
        this.mFrameHeight = i12;
        this.mCacheDir = file;
        this.movieItem = movieEntity;
        MovieParams movieParams = movieEntity.params;
        if (movieParams != null) {
            m67711A(movieParams);
        }
        try {
            m67730s(movieEntity);
        } catch (Exception e11) {
            e11.printStackTrace();
        } catch (OutOfMemoryError e12) {
            e12.printStackTrace();
        }
        m67733v(movieEntity);
    }
}
