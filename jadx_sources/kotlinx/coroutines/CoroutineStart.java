package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.ContinuationKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function2;
import pg0.C43465a;
import pg0.C43466b;

/* JADX INFO: compiled from: CoroutineStart.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u00102\u0006\u0010\u0011\u001a\u0002H\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0087\u0002¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00158FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u0019"}, m90084d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "invoke", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "receiver", "completion", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "isLazy", "", "isLazy$annotations", "()V", "()Z", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f91427c = EnumEntriesKt.enumEntries(m90348a());

    /* JADX INFO: renamed from: kotlinx.coroutines.CoroutineStart$a */
    /* JADX INFO: compiled from: CoroutineStart.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public /* synthetic */ class C41534a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static EnumEntries<CoroutineStart> getEntries() {
        return f91427c;
    }

    public final <R, T> void invoke(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> block, R receiver, @NotNull Continuation<? super T> completion) {
        int i11 = C41534a.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            C43465a.m95679c(block, receiver, completion);
            return;
        }
        if (i11 == 2) {
            ContinuationKt.startCoroutine(block, receiver, completion);
        } else if (i11 == 3) {
            C43466b.m95682c(block, receiver, completion);
        } else if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }
}
