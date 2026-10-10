package og0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p001a.C0002a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: og0.z */
/* JADX INFO: compiled from: StackTraceRecovery.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001c\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b*\f\b\u0000\u0010\u0010\"\u00020\u000f2\u00020\u000f*\f\b\u0000\u0010\u0011\"\u00020\u00052\u00020\u0005¨\u0006\u0012"}, m90084d2 = {"", ExifInterface.LONGITUDE_EAST, "exception", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/StackTraceElement;", "Ljava/lang/StackTraceElement;", "ARTIFICIAL_FRAME", "", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "baseContinuationImplClassName", "c", "stackTraceRecoveryClassName", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1790#2,6:211\n12567#2,2:221\n1682#2,6:223\n12567#2,2:229\n1682#2,6:232\n37#3:217\n36#3,3:218\n1#4:231\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n39#1:211,6\n127#1:221,2\n137#1:223,6\n169#1:229,2\n190#1:232,6\n102#1:217\n102#1:218,3\n*E\n"})
public final class C43083z {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final StackTraceElement f95281a = new C0002a().m6a();

    /* JADX INFO: renamed from: b */
    public static final String f95282b;

    /* JADX INFO: renamed from: c */
    public static final String f95283c;

    static {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            objM103844constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f95282b = (String) objM103844constructorimpl;
        try {
            objM103844constructorimpl2 = Result.m103844constructorimpl(C43083z.class.getCanonicalName());
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl2) != null) {
            objM103844constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f95283c = (String) objM103844constructorimpl2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <E extends Throwable> E m94649a(@NotNull E e11) {
        return e11;
    }
}
