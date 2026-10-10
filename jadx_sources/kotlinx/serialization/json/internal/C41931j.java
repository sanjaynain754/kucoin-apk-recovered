package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.j */
/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "MAX_CHARS_IN_POOL", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41931j {

    /* JADX INFO: renamed from: a */
    public static final int f92118a;

    static {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
            objM103844constructorimpl = Result.m103844constructorimpl(StringsKt.toIntOrNull(property));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        Integer num = (Integer) objM103844constructorimpl;
        f92118a = num != null ? num.intValue() : 2097152;
    }
}
